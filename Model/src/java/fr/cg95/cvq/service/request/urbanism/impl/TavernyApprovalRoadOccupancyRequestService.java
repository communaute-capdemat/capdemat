package fr.cg95.cvq.service.request.urbanism.impl;

import fr.cg95.cvq.business.request.Request;
import fr.cg95.cvq.business.request.urbanism.TavernyApprovalRoadOccupancyRequest;
import fr.cg95.cvq.service.request.impl.RequestService;

public class TavernyApprovalRoadOccupancyRequestService extends RequestService {

    @Override
    public boolean accept(Request request) {
        return request instanceof TavernyApprovalRoadOccupancyRequest;
    }

    @Override
    public Request getSkeletonRequest() {
        return new TavernyApprovalRoadOccupancyRequest();
    }

}
