package fr.cg95.cvq.service.request.leisure.external;

import java.util.Map;
import java.util.List;

import fr.cg95.cvq.business.request.Request;
import fr.cg95.cvq.business.users.Individual;

public interface IActivityRegistrationProviderService {

    Map<String, Map<String, String>> getSiteProduit (Long requestId, Long userId) ;

    String getRedirectUrl (Request request);

    /**
     * Return the list of sites available for the individual.
     * @param individual
     * @return a map of id / label pairs
     */
    Map<String, String> getSites(Individual individual);

    /**
     * Return the list of products offered to the individual, on one site.
     * @param individual
     * @param siteId
     * @return a list of products, where each product is modeled as a map of property / value.
     */
    List<Map<String, String>> getProducts(Individual individual, String siteId);

    /**
     * Return the list of segments available for a subscription product.
     * @param individual
     * @param siteId
     * @param productId
     * @return a list of segments, where each segment is modeled as a map of property / value.
     */
    List<Map<String, String>> getSegments(Individual individual, String siteId, String productId);

    Boolean canGetRedirectUrl(Request request);

}
