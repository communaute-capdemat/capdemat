package fr.cg95.cvq.service.request.leisure.impl;

import java.util.HashMap;
import java.util.Map;

import fr.cg95.cvq.business.request.Request;
import fr.cg95.cvq.business.request.leisure.EcoleDeMusiqueRequest;
import fr.cg95.cvq.external.IExternalProviderService;
import fr.cg95.cvq.service.request.external.IRequestExternalService;
import fr.cg95.cvq.service.request.impl.RequestService;
import fr.cg95.cvq.service.request.leisure.IEcoleDeMusiqueRequestService;
import fr.cg95.cvq.service.request.leisure.external.IActivityRegistrationProviderService;

public class EcoleDeMusiqueRequestService extends RequestService implements IEcoleDeMusiqueRequestService{

    private IRequestExternalService requestExternalService;

    @Override
    public boolean accept(Request request) {
        // TODO Auto-generated method stub
        return request instanceof EcoleDeMusiqueRequest;
    }

    @Override
    public Request getSkeletonRequest() {
        // TODO Auto-generated method stub
        return new EcoleDeMusiqueRequest();
    }

    @Override
    public Map<String, Map<String, String>> getSiteProduit(Long requestId, Long userId) {
        IExternalProviderService service = requestExternalService.getExternalServiceByRequestType(getLabel());
        if (service instanceof IActivityRegistrationProviderService) {
            return ((IActivityRegistrationProviderService) service).getSiteProduit(requestId, userId);
        } else {
            Map <String, Map<String, String>> m = new HashMap<String,Map<String, String>>();
            return m;
        }
    }

    public void setRequestExternalService(IRequestExternalService requestExternalService) {
        this.requestExternalService = requestExternalService;
    }

    public IRequestExternalService getRequestExternalService() {
        return requestExternalService;
    }

}
