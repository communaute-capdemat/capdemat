package fr.cg95.cvq.service.request.leisure.impl;

import fr.cg95.cvq.business.request.Request;
import fr.cg95.cvq.business.request.leisure.ActivityRegistrationRequest;
import fr.cg95.cvq.service.request.condition.EqualityChecker;
import fr.cg95.cvq.service.request.impl.RequestService;

public class ActivityRegistrationRequestService extends RequestService {

    @Override
    public void init() {
        ActivityRegistrationRequest.conditions.put(
            "produit.typeProduit",
            new EqualityChecker("1")
        );
    }

    @Override
    public boolean accept(Request request) {
        return request instanceof ActivityRegistrationRequest;
    }

    @Override
    public Request getSkeletonRequest() {
        return new ActivityRegistrationRequest();
    }

}
