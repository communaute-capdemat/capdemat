package fr.capwebct.capdemat.plugins.externalservices.mailgeneric.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlObject;
import org.codehaus.groovy.control.CompilationFailedException;

import fr.capwebct.capdemat.plugins.externalservices.mailgeneric.utils.ExtractInformation;
import fr.cg95.cvq.business.authority.LocalAuthorityResource.Type;
import fr.cg95.cvq.business.payment.ExternalAccountItem;
import fr.cg95.cvq.business.payment.ExternalDepositAccountItem;
import fr.cg95.cvq.business.payment.ExternalInvoiceItem;
import fr.cg95.cvq.business.payment.PurchaseItem;
import fr.cg95.cvq.business.request.Request;
import fr.cg95.cvq.business.request.external.RequestExternalAction;
import fr.cg95.cvq.business.users.Individual;
import fr.cg95.cvq.exception.CvqConfigurationException;
import fr.cg95.cvq.exception.CvqException;
import fr.cg95.cvq.external.ExternalServiceBean;
import fr.cg95.cvq.external.impl.ExternalProviderServiceAdapter;
import fr.cg95.cvq.service.authority.ILocalAuthorityRegistry;
import fr.cg95.cvq.service.request.IRequestPdfService;
import fr.cg95.cvq.service.request.IRequestSearchService;
import fr.cg95.cvq.service.request.external.IRequestExternalActionService;
import fr.cg95.cvq.service.users.IUserSearchService;
import fr.cg95.cvq.util.mail.IMailService;
import fr.cg95.cvq.util.translation.ITranslationService;
import groovy.text.SimpleTemplateEngine;
import groovy.text.Template;

import fr.cg95.cvq.util.Pair;

public class MailGenericService extends ExternalProviderServiceAdapter {

    private static Logger logger = Logger.getLogger(MailGenericService.class);

    private static String MAILDIR = "mailGeneric";

    private String label;

    private IMailService mailService;

    private IRequestSearchService requestSearchService;

    private IRequestPdfService requestPdfService;

    private ILocalAuthorityRegistry localAuthorityRegistry;

    private IUserSearchService userSearchService;

    private IRequestExternalActionService requestExternalActionService;

    private ITranslationService translationService;

    @Override
    public void sendRequest(Request request) throws CvqException {

        Long requestId = request.getId();
        RequestExternalAction rea = new RequestExternalAction(new Date(), requestId, "capdemat",
                null, getLabel(), RequestExternalAction.Status.SENT);

        String requestTypeLabel = request.getRequestType().getLabel();
        String requestTypeLabelAsDir = StringUtils.uncapitalize(requestTypeLabel.replace(" ", ""))
                + "Request";

        String mailBody = null;
        String mailSubject = null;
        String emailTo = null;
        String emailFrom = null;
        Individual subject = null;
        Individual requester = userSearchService.getById(request.getRequesterId());

        if (request.getSubjectId() != null) {
            subject = userSearchService.getById(request.getSubjectId());
        }
        try {

            mailBody = makeEmailBody(request, requestTypeLabelAsDir, subject, requester);
            mailSubject = makeEmailSubject(request, requestTypeLabelAsDir, subject, requester);
            emailTo = getEmailTo(request, requestTypeLabelAsDir, subject, requester);
            emailFrom = getEmailFrom(request, requestTypeLabelAsDir, subject, requester);

        } catch (CvqException e) {
            rea.setStatus(RequestExternalAction.Status.ERROR);
            rea.setMessage(e.getMessage());
            requestExternalActionService.addTrace(rea);
            return;
        }

        if (mailBody == null) {
            logger.error("makeEmailBody() return a null body ");
            rea.setStatus(RequestExternalAction.Status.ERROR);
            rea.setMessage(" Impossible de générer le modèle pour le corp du courriel ");
            requestExternalActionService.addTrace(rea);
            return;
        }

        if (mailSubject == null) {
            logger.error("makeEmailSubject() return a null subject ");
            rea.setStatus(RequestExternalAction.Status.ERROR);
            rea.setMessage(" Impossible de générer le modèle pour le sujet du courriel ");
            requestExternalActionService.addTrace(rea);
            return;
        }

        if (emailTo == null || emailTo.trim().equals("null")) {
            logger.error("getEmailTo() return a null emailTo ");
            rea.setStatus(RequestExternalAction.Status.ERROR);
            rea.setMessage(" Impossible de générer le modèle pour l'email du destinataire du courriel ");
            requestExternalActionService.addTrace(rea);
            return;
        }
        else{
            if(emailTo.trim().startsWith("Error:")){
                logger.error("No emailTo - Don't send mail");
                rea.setStatus(RequestExternalAction.Status.RETURNED);
                rea.setMessage(emailTo.trim().replaceFirst("Error:", ""));
                requestExternalActionService.addTrace(rea);
                return;
            }
        }

        if (emailFrom == null || emailFrom.trim().equals("null")) {
            logger.warn("getEmailFrom() return a null emailFrom. Set with request category email");
            emailFrom = request.getRequestType().getCategory().getPrimaryEmail();
        }

        byte[] attachment = null;
        try {
            attachment = getRequestAsPdf(requestId);
        } catch (CvqException e) {
            logger.error("getRequestAsPdf() got error " + e.getMessage());
            rea.setStatus(RequestExternalAction.Status.ERROR);
            rea.setMessage(rea.getMessage() + " Erreur lors de la génération du pdf.");
        }

        requestExternalActionService.addTrace(rea);

        if (RequestExternalAction.Status.ERROR.equals(rea.getStatus())) {
            logger.error("sendRequest() error while sending request to " + getLabel());
        } else {
            try {
                String lastName =  request.getSubjectLastName()!=null?
                        request.getSubjectLastName():request.getRequesterLastName();
                mailService.send(emailFrom, emailTo, null, mailSubject, mailBody, attachment,
                        "Demande_"+ requestId + "_" + lastName + ".pdf");
            } catch (CvqException e) {
                logger.error("mailService() got error " + e.getMessage());
                rea.setStatus(RequestExternalAction.Status.ERROR);
                rea.setMessage(" Envoi du courriel non effectué ");
                requestExternalActionService.addTrace(rea);
                logger.error("sendRequest() error while sending request to " + getLabel());
            }
        }

        return;

    }

    private String getEmailTo(Request request, String requestTypeLabelAsDir, Individual subject, Individual requester)
            throws CvqException {

        String filename = MAILDIR + "/" + requestTypeLabelAsDir + "/EmailTo";

        Map<String, Object> bindingMap = new HashMap<String, Object>();
        bindingMap.put("request", request);
        bindingMap.put("subject", subject);
        bindingMap.put("i18n", translationService);
        bindingMap.put("requester", requester);
        bindingMap.put("ExtractInformation", ExtractInformation.class);
        bindingMap.put("localAuthorityRegistry", localAuthorityRegistry);

        try {
        return makeTemplate(filename, bindingMap);
        } catch (CompilationFailedException cfe) {
            logger.error("getEmailTo() got error " + cfe.getMessage());
            throw new CvqException("Impossible de générer le modèle pour l'email du destinataire du courriel");
        } catch (UnsupportedEncodingException uee) {
            logger.error("getEmailTo() got error " + uee.getMessage());
            throw new CvqException("Impossible de générer le modèle pour l'email du destinataire du courriel");
        } catch (FileNotFoundException fnfe) {
            logger.error("getEmailTo() got error " + fnfe.getMessage());
            throw new CvqException("Impossible de trouver le modèle pour l'email du destinataire du courriel");
        } catch (IOException ioe) {
            logger.error("getEmailTo() got error " + ioe.getMessage());
            throw new CvqException("Impossible de générer le modèle pour l'email du destinataire du courriel");
        } catch (Exception e) {
            logger.error("getEmailTo() got error " + e.getMessage());
            throw new CvqException("Impossible de générer le modèle pour l'email du destinataire du courriel");
        }
    }

    private String getEmailFrom(Request request, String requestTypeLabelAsDir, Individual subject, Individual requester)
            throws CvqException {

        String filename = MAILDIR + "/" + requestTypeLabelAsDir + "/EmailFrom";

        Map<String, Object> bindingMap = new HashMap<String, Object>();
        bindingMap.put("request", request);
        bindingMap.put("subject", subject);
        bindingMap.put("requester", requester);
        bindingMap.put("i18n", translationService);
        bindingMap.put("ExtractInformation", ExtractInformation.class);
        bindingMap.put("localAuthorityRegistry", localAuthorityRegistry);

        try {
        return makeTemplate(filename, bindingMap);
        } catch (CompilationFailedException cfe) {
            logger.error("getEmailFrom() got error " + cfe.getMessage());
            throw new CvqException("Impossible de générer le modèle pour l'email de l'émetteur du courriel");
        } catch (UnsupportedEncodingException uee) {
            logger.error("getEmailFrom() got error " + uee.getMessage());
            throw new CvqException("Impossible de générer le modèle pour l'email de l'émetteur du courriel");
        } catch (FileNotFoundException fnfe) {
            logger.error("getEmailFrom() got error " + fnfe.getMessage());
            throw new CvqException("Impossible de trouver le modèle pour l'email de l'émetteur du courriel");
        } catch (IOException ioe) {
            logger.error("getEmailFrom() got error " + ioe.getMessage());
            throw new CvqException("Impossible de générer le modèle pour l'email de l'émetteur du courriel");
        } catch (Exception e) {
            logger.error("getEmailFrom() got error " + e.getMessage());
            throw new CvqException("Impossible de générer le modèle pour l'email de l'émetteur du courriel");
        }
    }

    private String makeEmailBody(Request request, String requestTypeLabelAsDir, Individual subject, Individual requester)
            throws CvqException {

        String filename = MAILDIR + "/" + requestTypeLabelAsDir + "/EmailBody";

        Map<String, Object> bindingMap = new HashMap<String, Object>();
        bindingMap.put("request", request);
        bindingMap.put("subject", subject);
        bindingMap.put("requester", requester);
        bindingMap.put("i18n", translationService);
        bindingMap.put("ExtractInformation", ExtractInformation.class);
        bindingMap.put("localAuthorityRegistry", localAuthorityRegistry);

        try {
        return makeTemplate(filename, bindingMap);
        } catch (CompilationFailedException cfe) {
            logger.error("makeEmailBody() got error " + cfe.getMessage());
            throw new CvqException("Impossible de générer le modèle pour le corp du courriel");
        } catch (UnsupportedEncodingException uee) {
            logger.error("makeEmailBody() got error " + uee.getMessage());
            throw new CvqException("Impossible de générer le modèle pour le corp du courriel");
        } catch (FileNotFoundException fnfe) {
            logger.error("makeEmailBody() got error " + fnfe.getMessage());
            throw new CvqException("Impossible de trouver le modèle pour le corp du courriel");
        } catch (IOException ioe) {
            logger.error("makeEmailBody() got error " + ioe.getMessage());
            throw new CvqException("Impossible de générer le modèle pour le corp du courriel");
        } catch (Exception e) {
            logger.error("makeEmailBody() got error " + e.getMessage());
            throw new CvqException("Impossible de générer le modèle pour le corp du courriel");
        }
    }

    private String makeEmailSubject(Request request, String requestTypeLabelAsDir,
            Individual subject, Individual requester) throws CvqException {

        String filename = MAILDIR + "/" + requestTypeLabelAsDir + "/EmailSubject";

        Map<String, Object> bindingMap = new HashMap<String, Object>();
        bindingMap.put("request", request);
        bindingMap.put("subject", subject);
        bindingMap.put("requester", requester);
        bindingMap.put("i18n", translationService);
        bindingMap.put("ExtractInformation", ExtractInformation.class);
        bindingMap.put("localAuthorityRegistry", localAuthorityRegistry);

        try {
        return makeTemplate(filename, bindingMap);
        } catch (CompilationFailedException cfe) {
            logger.error("makeEmailSubject() got error " + cfe.getMessage());
            throw new CvqException("Impossible de générer le modèle pour le sujet du courriel");
        } catch (UnsupportedEncodingException uee) {
            logger.error("makeEmailSubject() got error " + uee.getMessage());
            throw new CvqException("Impossible de générer le modèle pour le sujet du courriel");
        } catch (FileNotFoundException fnfe) {
            logger.error("makeEmailSubject() got error " + fnfe.getMessage());
            throw new CvqException("Impossible de trouver le modèle pour le sujet du courriel");
        } catch (IOException ioe) {
            logger.error("makeEmailSubject() got error " + ioe.getMessage());
            throw new CvqException("Impossible de générer le modèle pour le sujet du courriel");
        } catch (Exception e) {
            logger.error("makeEmailSubject() got error " + e.getMessage());
            throw new CvqException("Impossible de générer le modèle pour le sujet du courriel");
        }
    }

    private String makeTemplate(String filename, Map<String, Object> bindingMap)
            throws CompilationFailedException, UnsupportedEncodingException, FileNotFoundException,
            IOException, Exception {

        StringWriter sw = new StringWriter();
        SimpleTemplateEngine templateEngine = new SimpleTemplateEngine();
        Template template;

        File fileTemplate = localAuthorityRegistry.getLocalAuthorityResourceFile(Type.TXT,
                filename, false);

        if (!fileTemplate.exists()) {
            throw new FileNotFoundException(filename + " doesn't exist.");
        }

        template = templateEngine.createTemplate(new InputStreamReader(new FileInputStream(
                fileTemplate), "UTF-8"));

        template.make(bindingMap).writeTo(sw);

        return sw.toString();
    }

    private byte[] getRequestAsPdf(Long requestId) throws CvqException {
        Request r = requestSearchService.getById(requestId, true);
        byte[] attachment = requestPdfService.generateCertificate(r);
        return attachment;
    }

    @Override
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setMailService(IMailService mailService) {
        this.mailService = mailService;
    }

    public void setRequestSearchService(IRequestSearchService requestSearchService) {
        this.requestSearchService = requestSearchService;
    }

    public void setRequestPdfService(IRequestPdfService requestPdfService) {
        this.requestPdfService = requestPdfService;
    }

    public void setLocalAuthorityRegistry(ILocalAuthorityRegistry localAuthorityRegistry) {
        this.localAuthorityRegistry = localAuthorityRegistry;
    }

    public void setUserSearchService(IUserSearchService userSearchService) {
        this.userSearchService = userSearchService;
    }

    public void setRequestExternalActionService(
            IRequestExternalActionService requestExternalActionService) {
        this.requestExternalActionService = requestExternalActionService;
    }

    public void setTranslationService(ITranslationService translationService) {
        this.translationService = translationService;
    }

    @Override
    public boolean supportsConsumptions() {
        return false;
    }

    @Override
    public boolean handlesTraces() {
        return true;
    }

    @Override
    public List<String> checkExternalReferential(XmlObject requestXml) {
        return new ArrayList<String>(0);
    }

    @Override
    public Map<String, Object> loadExternalInformations(XmlObject requestXml) throws CvqException {
        return Collections.emptyMap();
    }

    @Override
    public String sendHomeFolderModification(XmlObject requestXml) throws CvqException {
        return "";
    }

    @Override
    public Map<Date, String> getConsumptions(Long key, Date dateFrom, Date dateTo)
            throws CvqException {
        return null;
    }

    @Override
    public Map<String, List<ExternalAccountItem>> getAccountsByHomeFolder(Long homeFolderId,
            String externalHomeFolderId, String externalId) throws CvqException {
        return null;
    }

    @Override
    public void loadDepositAccountDetails(ExternalDepositAccountItem edai) throws CvqException {
    }

    @Override
    public void loadInvoiceDetails(ExternalInvoiceItem eii) throws CvqException {
    }

    @Override
    public void creditHomeFolderAccounts(Collection<PurchaseItem> purchaseItems,
            String cvqReference, String bankReference, Long homeFolderId,
            String externalHomeFolderId, String externalId, Date validationDate)
            throws CvqException {
    }

    @Override
    public void checkConfiguration(ExternalServiceBean externalServiceBean,
            String localAuthorityName) throws CvqConfigurationException {
    }

    @Override
    public String helloWorld() throws CvqException {
        return null;
    }

    @Override
    public String sendRequest(XmlObject requestXml) throws CvqException {
        return null;
    }

    @Override
    public Map<Pair<String, String>, LinkedHashMap<Pair<String, String>, Object>> loadAccountExternalInformations(Long homefolderId) throws CvqException {
      return null;
    }
}
