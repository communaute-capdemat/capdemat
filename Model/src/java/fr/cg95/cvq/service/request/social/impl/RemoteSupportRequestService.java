package fr.cg95.cvq.service.request.social.impl;

import fr.cg95.cvq.business.request.Request;
import fr.cg95.cvq.business.request.social.RemoteSupportRequest;
import fr.cg95.cvq.business.request.social.RsrContactKindType;
import fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType;
import fr.cg95.cvq.business.request.social.RsrRequestInformation;
import fr.cg95.cvq.service.request.condition.EqualityChecker;
import fr.cg95.cvq.service.request.impl.RequestService;

/**
 * Implementation of the remote support request service.
 * 
 * @author Rafik Djedjig (rdj@zenexity.fr)
 */
public class RemoteSupportRequestService extends RequestService {

    @Override
    public void init() {
        RemoteSupportRequest.conditions.put("requestInformationRequestKind",
            new EqualityChecker(RsrRequestInformationRequestKindType.COUPLE.name()));
        RemoteSupportRequest.conditions.put("requestInformationEmergency",
            new EqualityChecker("true"));
        RemoteSupportRequest.conditions.put("contactKind", new EqualityChecker(RsrContactKindType.OTHER.name()));
        
        // kept them for client side JS validation script
        RemoteSupportRequest.conditions.put("requestInformation.requestInformationEmergency",
                new EqualityChecker("true"));
        
        // added for server side vaidation
        RsrRequestInformation.conditions.put("rsrRequestInformation.requestInformationEmergency",
                new EqualityChecker("true"));
    }

    @Override
    public boolean accept(Request request) {
        return request instanceof RemoteSupportRequest;
    }

    @Override
    public Request getSkeletonRequest() {
        return new RemoteSupportRequest();
    }
}
