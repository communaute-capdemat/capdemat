package fr.cg95.cvq.external.endpoint;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.springframework.oxm.Marshaller;

import fr.capwebct.capdemat.HttpCodeType;
import fr.capwebct.capdemat.UpdateStateRequestRequestDocument;
import fr.capwebct.capdemat.UpdateStateRequestResponseDocument;
import fr.capwebct.capdemat.UpdateStateRequestRequestDocument.UpdateStateRequestRequest;
import fr.capwebct.capdemat.UpdateStateRequestResponseDocument.UpdateStateRequestResponse;
import fr.cg95.cvq.business.request.Request;
import fr.cg95.cvq.business.request.RequestState;
import fr.cg95.cvq.dao.request.IRequestDAO;
import fr.cg95.cvq.exception.CvqInvalidTransitionException;
import fr.cg95.cvq.security.SecurityContext;
import fr.cg95.cvq.service.request.IRequestWorkflowService;
import fr.cg95.cvq.service.request.external.IRequestExternalService;

public class UpdateStateRequestServiceEndpoint extends SecuredServiceEndpoint {

    private static Logger logger = Logger.getLogger(UpdateStateRequestServiceEndpoint.class);

    private IRequestDAO requestDAO;
    private IRequestWorkflowService requestWorkflowService;
    private IRequestExternalService requestExternalService;

    public UpdateStateRequestServiceEndpoint(Marshaller marshaller) {
        super(marshaller);
    }

    @Override
    protected Object invokeInternal(Object request) throws Exception {

        UpdateStateRequestRequest updateStateRequest =
            ((UpdateStateRequestRequestDocument)request).getUpdateStateRequestRequest();

        UpdateStateRequestResponse response = 
            UpdateStateRequestResponseDocument.Factory.newInstance().addNewUpdateStateRequestResponse();

        Request modelRequest = requestDAO.findById(updateStateRequest.getId(), false);

        if (modelRequest.getRequestData() == null) {
            response.setCode(HttpCodeType.X_404);
            response.setMessage("request.error.notFound");
            logger.info("404 : request.error.notFound " + updateStateRequest.getId());
            return response;
        }
        if (!connectorCanAccess(modelRequest)) {
            response.setCode(HttpCodeType.X_403);
            response.setMessage("request.error.accessNotAuthorized");
            logger.info("403 : request.error.accessNotAuthorized " + updateStateRequest.getId());
            return response;
        }

        try {
            requestWorkflowService.updateRequestState(
                    updateStateRequest.getId(),
                    RequestState.valueOf(updateStateRequest.getState().toString().toUpperCase()), 
                    updateStateRequest.getNote());
            response.setCode(HttpCodeType.X_200);
            logger.info("200 : request.message.updateStateSuccess " + updateStateRequest.getId());
        } catch (IllegalArgumentException e) {
            response.setCode(HttpCodeType.X_500);
            response.setMessage("request.error.stateNotExist");
            logger.info("500 : request.error.stateNotExist" + updateStateRequest.getId());
            logger.debug(e.getMessage());
        } catch (CvqInvalidTransitionException e) {
            response.setCode(HttpCodeType.X_500);
            response.setMessage("request.error.transitionNotAuthorized");
            logger.info("500 : request.error.transitionNotAuthorized " + updateStateRequest.getId());
            logger.debug(e.getMessage());
        } catch (Exception e) {
            response.setCode(HttpCodeType.X_500);
            response.setMessage("request.error.serverError");
            logger.info("500 : request.error.serverError " + updateStateRequest.getId());
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

    public void setRequestWorkflowService(IRequestWorkflowService requestWorkflowService) {
        this.requestWorkflowService = requestWorkflowService;
    }

}
