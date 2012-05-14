package fr.cg95.cvq.service.request.civil.impl;

import fr.cg95.cvq.business.request.Request;
import fr.cg95.cvq.business.request.civil.DemandeDeSuiviRequest;
import fr.cg95.cvq.service.request.impl.RequestService;

public final class DemandeDeSuiviRequestService extends RequestService{

    @Override
    public boolean accept(Request request) {
        // TODO Auto-generated method stub
        return request instanceof DemandeDeSuiviRequest;
    }

    @Override
    public Request getSkeletonRequest() {
        // TODO Auto-generated method stub
        return new DemandeDeSuiviRequest();
    }

}
