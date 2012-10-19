package fr.cg95.cvq.service.users.external;

import java.util.List;

import fr.cg95.cvq.business.users.Individual;

public interface IExternalUserService {

    /**
     * Return an Individual from its CapdematId for a specific external service
     * @param externalServiceLabel
     * @param capdematId
     * @return
     */
    Individual getIndividualByCapdematId(final String externalServiceLabel, final String capdematId);

    /**
     * Generate a capdematId for all users which havn't an external ID with this external Service
     * @param externalServiceLabel
     */
    void generateAllCapdematId(final String externalServiceLabel);

    /**
     * List all created users since StartDate with their CapdematId
     * @param startDate
     * @param externalServiceLabel
     * @return
     */
    List<Individual> listCreatedUsers(final String startDate, final String externalServiceLabel);

    /**
     * List all edited users since StartDate with their CapdematId
     * @param startDate
     * @param externalServiceLabel
     * @return
     */
    List<Individual> listEditedUsers(final String startDate, final String externalServiceLabel);

    /**
     * List all deleted users (state = 'Archived') since Startdate with their CapdematId
     * @param startDate
     * @param externalServiceLabel
     * @return
     */
    List<Individual> listDeletedUsers(final String startDate, final String externalServiceLabel);

    /**
     * List all users with their CapdematId
     * @param externalServiceLabel
     * @return
     */
    List<Individual> listAllUsers(final String externalServiceLabel);

}