package fr.cg95.cvq.dao.authority;

import java.util.List;
import java.util.Set;

import fr.cg95.cvq.business.authority.Agent;
import fr.cg95.cvq.dao.IGenericDAO;

/**
 * @author bor@zenexity.fr
 */
public interface IAgentDAO extends IGenericDAO {

    /**
     * Return whether there exists an agent with the given id. 
     */
    boolean exists(final Long id);
    
    /**
     * Look up an agent by login.
     */
    Agent findByLogin(final String login);

    /**
     * Look up an agent given a set of search criteria.
     */
    List search(final Set criteria);

    /**
     * Return the list of all known agents.
     */
    List listAll();
}
