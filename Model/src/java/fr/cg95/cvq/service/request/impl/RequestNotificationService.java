package fr.cg95.cvq.service.request.impl;

import java.io.File;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationListener;

import fr.cg95.cvq.business.CapDematEvent;
import fr.cg95.cvq.business.authority.Agent;
import fr.cg95.cvq.business.authority.LocalAuthorityResource.Type;
import fr.cg95.cvq.business.request.Request;
import fr.cg95.cvq.business.request.RequestAdminAction;
import fr.cg95.cvq.business.request.RequestAdminAction.Data;
import fr.cg95.cvq.business.request.RequestAdminEvent;
import fr.cg95.cvq.business.request.RequestEvent;
import fr.cg95.cvq.business.request.RequestEvent.COMP_DATA;
import fr.cg95.cvq.business.request.RequestNote;
import fr.cg95.cvq.business.request.RequestNoteType;
import fr.cg95.cvq.business.users.Address;
import fr.cg95.cvq.business.users.Adult;
import fr.cg95.cvq.business.users.Individual;
import fr.cg95.cvq.dao.request.IRequestDAO;
import fr.cg95.cvq.exception.CvqException;
import fr.cg95.cvq.security.SecurityContext;
import fr.cg95.cvq.service.authority.IAgentService;
import fr.cg95.cvq.service.authority.ILocalAuthorityRegistry;
import fr.cg95.cvq.service.request.IRequestSearchService;
import fr.cg95.cvq.service.request.job.RequestArchivingJob;
import fr.cg95.cvq.service.request.job.RequestArchivingJob.Result;
import fr.cg95.cvq.service.users.IUserSearchService;
import fr.cg95.cvq.util.DateUtils;
import fr.cg95.cvq.util.UserUtils;
import fr.cg95.cvq.util.mail.IMailService;
import fr.cg95.cvq.util.translation.ITranslationService;
import groovy.text.SimpleTemplateEngine;
import groovy.text.Template;

/**
 *
 * @author bor@zenexity.fr
 */
public class RequestNotificationService implements ApplicationListener<CapDematEvent> {

    private static Logger logger = Logger.getLogger(RequestNotificationService.class);

    private IUserSearchService userSearchService;
    private IMailService mailService;
    private ILocalAuthorityRegistry localAuthorityRegistry;
    private IAgentService agentService;
    private ITranslationService translationService;
    private IRequestSearchService requestSearchService;

    private IRequestDAO requestDAO;

    private String getTitle(Individual individual) {
        String title = "";
        if (individual instanceof Adult) {
            title = translationService.translate("homeFolder.adult.title." + ((Adult)individual).getTitle().toString().toLowerCase());
        }
        return title;
    }

    /**
     * Return the content, with its variables evaluated.
     * @param content
     * @param html
     * @param requestId
     * @param moc means of contact
     * @param observations
     * @return the evaluated content
     */
    public String evaluate(String content,
                           boolean html,
                           Long requestId,
                           String moc,
                           String observations) {
        // Objects used to do the template model
        Request request = requestSearchService.getById(Long.valueOf(requestId), false);
        Individual requester = null;
        if (request.getRequesterId() != null) {
            requester = userSearchService.getById(request.getRequesterId());
        } else {
            requester = userSearchService.getHomeFolderResponsible(request.getHomeFolderId());
        }
        Address address = requester.getHomeFolder().getAddress();
        Individual subject = (request.getSubjectId() != null) ? userSearchService.getById(request.getSubjectId()) : null;
        Agent agent = agentService.getById(request.getLastInterveningUserId());
        String label = translationService.translateRequestTypeDescription(request.getRequestType().getLabel())
                                         .toLowerCase();
        if (html) {
            try {
                URLEncoder.encode(label, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                // OK, let it not encoded.
            }
        }

        // Template model
        Map<String, String> model = new HashMap<String, String>();
        model.put("DATE", DateUtils.format(new Date()));
        model.put("LAST_AGENT_NAME", UserUtils.getDisplayName(request.getLastInterveningUserId()));
        model.put("LAST_AGENT_EMAIL", (agent != null) ? agent.getEmail() : "");
        model.put("MOC", (moc != null && !moc.isEmpty()) ? translationService.translate("meansOfContact." + StringUtils.uncapitalize(moc)) : "");
        model.put("RQ_ID", request.getId().toString());
        model.put("RQ_CAT", request.getRequestType().getCategory().getName());
        model.put("RQ_CAT_EMAIL", request.getRequestType().getCategory().getPrimaryEmail());
        model.put("RQ_TP_LABEL", label);
        model.put("RQ_CDATE", DateUtils.formatDate(request.getCreationDate()));
        model.put("RQ_DVAL", request.getValidationDate() != null ? DateUtils.formatDate(request.getValidationDate()) : "");
        model.put("RQ_OBSERV", observations);
        model.put("HF_ID", requester.getHomeFolder().getId().toString());
        model.put("RR_FNAME",  requester.getFirstName());
        model.put("RR_LNAME", requester.getLastName());
        model.put("RR_TITLE", getTitle(requester));
        model.put("RR_LOGIN", (requester instanceof Adult) ? ((Adult)requester).getLogin() : "");
        model.put("RR_QUESTION", (requester instanceof Adult) ? ((Adult)requester).getQuestion() : "");
        model.put("RR_ANSWER", (requester instanceof Adult) ? ((Adult)requester).getAnswer() : "");
        model.put("SU_FNAME", (subject != null) ? subject.getFirstName() : "");
        model.put("SU_LNAME", (subject != null) ? subject.getLastName() : "");
        model.put("SU_TITLE", getTitle(subject));
        model.put("HF_ADDRESS_ADI", address.getAdditionalDeliveryInformation());
        model.put("HF_ADDRESS_AGI", address.getAdditionalGeographicalInformation());
        model.put("HF_ADDRESS_SNAME", address.getStreetName());
        model.put("HF_ADDRESS_SNUM", address.getStreetNumber());
        model.put("HF_ADDRESS_PNS", address.getPlaceNameOrService());
        model.put("HF_ADDRESS_ZIP", address.getPostalCode());
        model.put("HF_ADDRESS_TOWN", address.getCity());
        model.put("HF_ADDRESS_CN", address.getCountryName());

        for (String key : model.keySet()) {
            if (model.get(key) == null) {
                model.put(key, "");
            }
        }

        SimpleTemplateEngine engine = new SimpleTemplateEngine();
        String evaluated = content;
        try {
            Template template = engine.createTemplate(content.replace("#{", "${"));
            evaluated = template.make(model).writeTo(new StringWriter()).toString();
        }  catch (Exception e) {
            logger.error("evaluate(): failed to evaluate the template.", e);
        }
        return evaluated;
    }

    private String createStateChangedNotificationMailBody(Request request, String requestTypeLabelAsDir) {
        File email = localAuthorityRegistry.getLocalAuthorityResourceFile(
                Type.HTML,
                "templates/mails/notification/" + requestTypeLabelAsDir + "/" + request.getState().name(),
                false);
        if (!email.exists()) {
            email = localAuthorityRegistry.getLocalAuthorityResourceFile(
                Type.HTML,
                "templates/mails/notification/" + request.getState().name(),
                false);
        }
        if (!email.exists()) return null;

        String content = localAuthorityRegistry.getFileContent(email);

        return evaluate(content, true, request.getId(), "", "");
    }

    private void notifyStateChanged(Long requestId, final byte[] pdfData)
        throws CvqException {
        Request request = requestDAO.findById(requestId);
        String requestTypeLabel = request.getRequestType().getLabel();
        String requestTypeLabelAsDir = StringUtils.uncapitalize(request.getRequestType().getLabel().replace(" ", "")) + "Request";
        String mailBody = createStateChangedNotificationMailBody(request, requestTypeLabelAsDir);
        if (mailBody == null)
            return;

        String mailSubject = translationService.translate(
                "request.notification.subject." + request.getState().name(),
                new Object[] {
                    SecurityContext.getCurrentSite().getDisplayTitle(),
                    translationService.translateRequestTypeLabel(requestTypeLabel)
        });

        if (mailSubject.equals("request.notification.subject." + request.getState().name())) {
            mailSubject = "[" + SecurityContext.getCurrentSite().getDisplayTitle() + "]"
                + " " + translationService.translateRequestTypeLabel(requestTypeLabel)
                + " " + translationService.translate("request.state." + request.getState().toString().toLowerCase());
        }

        Adult requester = (Adult) userSearchService.getById(request.getRequesterId());
        if (pdfData != null) {
            mailService.send(
                    request.getRequestType().getCategory().getPrimaryEmail(),
                    requester.getEmail(),
                    null,
                    mailSubject,
                    mailBody,
                    pdfData, "Attestation_Demande.pdf",
                    true);
        } else {
            mailService.send(
                    request.getRequestType().getCategory().getPrimaryEmail(),
                    requester.getEmail(),
                    null,
                    mailSubject,
                    mailBody,
                    true);
        }
    }

    private void notifyAgentNote(Long requestId, RequestNote note)
        throws CvqException {
        if (note.getType().equals(RequestNoteType.PUBLIC)) {
            Request request = requestDAO.findById(requestId);
            Agent agent = agentService.getById(note.getUserId());
            Adult requester = userSearchService.getAdultById(request.getRequesterId());
            if (requester.getEmail() != null) {
                mailService.send(request.getRequestType().getCategory().getPrimaryEmail(),
                    requester.getEmail(), null,
                    translationService.translate("request.notification.agentNote.subject",
                        new Object[]{SecurityContext.getCurrentSite().getDisplayTitle()}),
                    translationService.translate("request.notification.agentNote.body",
                        new Object[] {
                            agent.getFirstName(), agent.getLastName(), request.getId(), note.getNote()
                        }));
            }
        }
    }

    private void notifyRequestArchiving(Result result)
        throws CvqException {
        if (result.numberOfSuccesses == 0 && result.failures.isEmpty()) {
            logger.info("notifyRequestArchiving() : nothing to notify");
            return;
        }
        if (SecurityContext.getCurrentSite().getAdminEmail() != null) {
            String body = new String();
            if (result.numberOfSuccesses != 0) {
                body += translationService.translate("requestArchive.notification.body",
                    new Object[]{result.numberOfSuccesses}) + "\n";
            }
            if (!result.failures.isEmpty()) {
                body += translationService.translate("requestArchive.notification.body.failures")
                    + "\n";
                for (Map.Entry<Request, Throwable> failure : result.failures.entrySet()) {
                    body += "\t" + failure.getKey().getId() + " : "
                        + failure.getValue().getLocalizedMessage() + "\n";
                }
            }
            body += "\n\n" + SecurityContext.getCurrentSite().getServerNames().first();
            mailService.send(null, SecurityContext.getCurrentSite().getAdminEmail(), null,
                translationService.translate("requestArchive.notification.subject",
                    new String[]{ SecurityContext.getCurrentSite().getDisplayTitle() }),
                body);
        } else {
            logger.warn("notifyRequestArchiving() : no admin email to notify");
        }
    }

    private void notifyArchivesPassword(String password)
        throws CvqException {
        if (SecurityContext.getCurrentSite().getAdminEmail() != null) {
            mailService.send(null, SecurityContext.getCurrentSite().getAdminEmail(), null,
                translationService.translate("requestArchive.passwordResetNotification.subject"),
                translationService.translate("requestArchive.passwordResetNotification.body",
                    new Object[]{password}));
        } else {
            logger.warn("notifyArchivesPassword() : no admin email to notify");
        }
    }

    public void setRequestDAO(IRequestDAO requestDAO) {
        this.requestDAO = requestDAO;
    }

    public void setUserSearchService(IUserSearchService userSearchService) {
        this.userSearchService = userSearchService;
    }

    public void setLocalAuthorityRegistry(ILocalAuthorityRegistry localAuthorityRegistry) {
        this.localAuthorityRegistry = localAuthorityRegistry;
    }

    public void setMailService(IMailService mailService) {
        this.mailService = mailService;
    }

    public void setAgentService(IAgentService agentService) {
        this.agentService = agentService;
    }

    public void setTranslationService(ITranslationService translationService) {
        this.translationService = translationService;
    }

    public void setRequestSearchService(IRequestSearchService requestSearchService) {
        this.requestSearchService = requestSearchService;
    }

    private void onApplicationEvent(RequestEvent requestEvent) {
        logger.debug("onApplicationEvent() got a request event of type " + requestEvent.getEvent());
        try {
            switch (requestEvent.getEvent()) {
                case STATE_CHANGED :
                    notifyStateChanged(requestEvent.getRequest().getId(),
                        (byte[])requestEvent.getComplementaryData(COMP_DATA.PDF_FILE));
                    break;
                case NOTE_ADDED :
                    notifyAgentNote(requestEvent.getRequest().getId(),
                        ((RequestNote)requestEvent.getComplementaryData(COMP_DATA.REQUEST_NOTE)));
                    break;
            }
        } catch (CvqException e) {
            // FIXME we have nothing to handle this
            logger.error("onApplicationEvent() got an error while notifying request creation");
            e.printStackTrace();
        }
    }

    private void onApplicationEvent(RequestAdminEvent event) {
        try {
            if (RequestAdminAction.Type.REQUESTS_ARCHIVED.equals(event.getAction().getType())
                || RequestAdminAction.Type.ARCHIVES_MIGRATED.equals(event.getAction().getType())) {
                notifyRequestArchiving((RequestArchivingJob.Result)
                    event.getAction().getComplementaryData().get(Data.ARCHIVING_RESULT));
            } else if (RequestAdminAction.Type.PASSWORD_RESET.equals(event.getAction().getType())) {
                notifyArchivesPassword(
                    (String)event.getAction().getComplementaryData().get(Data.PASSWORD));
            } else {
                logger.debug("no notification for RequestAdminEvent of type "
                    + event.getAction().getType());
            }
        } catch (CvqException e) {
            // FIXME we have nothing to handle this
            logger.error("onApplicationEvent(RequestAdminEvent) got an error");
            e.printStackTrace();
        }
    }

    @Override
    public void onApplicationEvent(CapDematEvent event) {
        if (event instanceof RequestEvent) {
            onApplicationEvent((RequestEvent)event);
        } else if (event instanceof RequestAdminEvent) {
            onApplicationEvent((RequestAdminEvent)event);
        } else {
            logger.debug("onApplicationEvent() : unhandled event type");
        }
    }

}
