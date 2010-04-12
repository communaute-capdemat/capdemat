package fr.cg95.cvq.service.request.ecitizen;

import java.util.List;

import fr.cg95.cvq.business.document.Document;
import fr.cg95.cvq.business.request.ecitizen.VoCardRequest;
import fr.cg95.cvq.business.users.Address;
import fr.cg95.cvq.business.users.Adult;
import fr.cg95.cvq.business.users.Child;
import fr.cg95.cvq.exception.CvqException;
import fr.cg95.cvq.service.request.IRequestService;

/**
 * Service in charge of the accounts creation requests.
 * 
 * @author bor@zenexity.fr
 */
public interface IVoCardRequestService extends IRequestService {

    /**
     * Create an account creation request.
     */
    void create(VoCardRequest vocd, List<Adult> adults, List<Child> children, 
            List<Adult> foreignRoleOwners, final Address adress, List<Document> documents)
        throws CvqException;    
}