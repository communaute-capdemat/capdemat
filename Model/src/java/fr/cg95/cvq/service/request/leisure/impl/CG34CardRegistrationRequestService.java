package fr.cg95.cvq.service.request.leisure.impl;

import fr.cg95.cvq.business.request.Request;
import fr.cg95.cvq.business.request.leisure.CG34CardRegistrationRequest;
import fr.cg95.cvq.exception.CvqException;
import fr.cg95.cvq.service.request.impl.RequestService;

public class CG34CardRegistrationRequestService extends RequestService {

    @Override
    public boolean accept(Request request) {
        return request instanceof CG34CardRegistrationRequest;
    }

    @Override
    public Request getSkeletonRequest() {
        return new CG34CardRegistrationRequest();
    }
}
