package fr.capwebct.capdemat.plugins.externalservices.edemande.job;

import java.util.List;

import org.apache.log4j.Logger;

import fr.cg95.cvq.business.request.Request;
import fr.cg95.cvq.dao.jpa.JpaUtil;
import fr.cg95.cvq.external.IExternalProviderService;
import fr.cg95.cvq.service.authority.ILocalAuthorityRegistry;
import fr.cg95.cvq.service.request.external.IRequestExternalService;

/*
 * Job dedicated to Edemande integration.
 * 
 * Check all study grant requests and tries to send those which aren't acknowledged
 */
public class EdemandeCommunicationJob {

    private static Logger logger = Logger.getLogger(EdemandeCommunicationJob.class);
    
    private ILocalAuthorityRegistry localAuthorityRegistry;
    private IRequestExternalService requestExternalService;
    private IExternalProviderService edemandeService;

    public void launchJob() {
        localAuthorityRegistry.browseAndCallback(this, "sendRequests", null);
    }

    public void sendRequests() {
        List<Request> requests = requestExternalService.getSendableRequests(edemandeService.getLabel());
        for (Request request : requests) {
            try {
                //Each request is managed in its own transaction
                requestExternalService.sendRequest(request);
                JpaUtil.closeAndReOpen(false);
                
            } catch(Throwable t) {
                JpaUtil.closeAndReOpen(true);
                logger.error("sendRequests() Unable to send request " + request.getId() + " to " + this.edemandeService.getLabel());
            }
        }
    }

    public void setLocalAuthorityRegistry(ILocalAuthorityRegistry localAuthorityRegistry) {
        this.localAuthorityRegistry = localAuthorityRegistry;
    }

    public void setEdemandeService(IExternalProviderService edemandeService) {
        this.edemandeService = edemandeService;
    }

    public void setRequestExternalService(IRequestExternalService requestExternalService) {
        this.requestExternalService = requestExternalService;
    }
}
