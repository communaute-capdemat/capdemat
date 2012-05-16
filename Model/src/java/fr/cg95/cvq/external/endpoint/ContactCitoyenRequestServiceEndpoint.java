package fr.cg95.cvq.external.endpoint;

import java.util.Collection;

import org.springframework.oxm.Marshaller;

import fr.capwebct.capdemat.ContactCitoyenRequestRequestDocument.ContactCitoyenRequestRequest;
import fr.capwebct.capdemat.ContactCitoyenRequestRequestDocument;
import fr.capwebct.capdemat.ContactCitoyenRequestResponseDocument.ContactCitoyenRequestResponse;
import fr.capwebct.capdemat.ContactCitoyenRequestResponseDocument;
import fr.capwebct.capdemat.HttpCodeTypeContactCitoyen;
import fr.cg95.cvq.business.request.Request;
import fr.cg95.cvq.business.request.RequestNoteType;
import fr.cg95.cvq.business.request.RequestState;
import fr.cg95.cvq.dao.request.IRequestDAO;
import fr.cg95.cvq.security.SecurityContext;
import fr.cg95.cvq.service.request.IRequestNoteService;
import fr.cg95.cvq.service.request.external.IRequestExternalService;

public class ContactCitoyenRequestServiceEndpoint extends SecuredServiceEndpoint{

    private IRequestDAO requestDAO;
    private IRequestExternalService requestExternalService;
    private IRequestNoteService requestNoteService;

    public ContactCitoyenRequestServiceEndpoint(Marshaller marshaller) {
        super(marshaller);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected Object invokeInternal(Object request) throws Exception {
        ContactCitoyenRequestRequest contactCitoyenRequest = 
                ((ContactCitoyenRequestRequestDocument)request).getContactCitoyenRequestRequest();
        
        ContactCitoyenRequestResponse response =
                ContactCitoyenRequestResponseDocument.Factory.newInstance().addNewContactCitoyenRequestResponse();

        Request modelRequest = requestDAO.findById(contactCitoyenRequest.getId(), false);
        if (modelRequest.getRequestData() == null) {
            response.setCode(HttpCodeTypeContactCitoyen.X_404);
            response.setMessage("request.error.notFound");
            logger.info("404 : request.error.notFound " + contactCitoyenRequest.getId());
            return response;
        }
        if (!connectorCanAccess(modelRequest)) {
            response.setCode(HttpCodeTypeContactCitoyen.X_403);
            response.setMessage("request.error.accessNotAuthorized");
            logger.info("403 : request.error.accessNotAuthorized " + contactCitoyenRequest.getId());
            return response;
        }
        if(modelRequest.getState().equals(RequestState.DRAFT)){
            response.setCode(HttpCodeTypeContactCitoyen.X_500);
            response.setMessage("request.error.draftSateNotAllowed");
            logger.info("500 : request.error.draftSateNotAllowed " + contactCitoyenRequest.getId());
            return response;
        }
        try {
            requestNoteService.addNote(modelRequest.getId(), RequestNoteType.PUBLIC, contactCitoyenRequest.getNote());
            response.setCode(HttpCodeTypeContactCitoyen.X_200);
            logger.info("200 : request.message.updateStateSuccess " + contactCitoyenRequest.getId());
        } catch (Exception e) {
            response.setCode(HttpCodeTypeContactCitoyen.X_500);
            response.setMessage("request.error.serverError");
            logger.info("500 : request.error.serverError " + contactCitoyenRequest.getId());
            logger.debug(e.getMessage());
        }
        return response;
    }

    private boolean connectorCanAccess(Request request) {
        Collection<String> authorizedRequestTypesLabels =
            requestExternalService.getRequestTypesForExternalService(SecurityContext.getCurrentExternalService());
        if (authorizedRequestTypesLabels.contains(request.getRequestType().getLabel()))
            return true;
        return false;
    }

    public void setRequestExternalService(IRequestExternalService requestExternalService) {
        this.requestExternalService = requestExternalService;
    }

    public void setRequestDAO(IRequestDAO requestDAO) {
        this.requestDAO = requestDAO;
    }

    public void setRequestNoteService(IRequestNoteService requestNoteService) {
        this.requestNoteService = requestNoteService;
    }
}
