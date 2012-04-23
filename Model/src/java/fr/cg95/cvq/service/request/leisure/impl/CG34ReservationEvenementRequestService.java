package fr.cg95.cvq.service.request.leisure.impl;

import fr.cg95.cvq.business.request.Request;
import fr.cg95.cvq.business.request.leisure.CG34ReservationEvenementRequest;
import fr.cg95.cvq.exception.CvqException;
import fr.cg95.cvq.service.request.impl.RequestService;

public class CG34ReservationEvenementRequestService extends RequestService {

    @Override
    public boolean accept(Request request) {
        return request instanceof CG34ReservationEvenementRequest;
    }

    @Override
    public Request getSkeletonRequest() {
        return new CG34ReservationEvenementRequest();
    }
}
