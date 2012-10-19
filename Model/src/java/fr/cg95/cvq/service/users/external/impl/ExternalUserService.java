package fr.cg95.cvq.service.users.external.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.cg95.cvq.business.users.Individual;
import fr.cg95.cvq.dao.users.IIndividualDAO;
import fr.cg95.cvq.service.users.external.IExternalHomeFolderService;
import fr.cg95.cvq.service.users.external.IExternalUserService;

public class ExternalUserService implements IExternalUserService {

    private IExternalHomeFolderService externalHomeFolderService;
    private IIndividualDAO individualDAO;

    private static final String PG_DATE_FORMAT = "DD/MM/YYYY";

    @Override
    public Individual getIndividualByCapdematId(final String externalServiceLabel, final String capdematId) {
        Individual user = individualDAO.findByCapdematId(capdematId, externalServiceLabel);
        if (user != null) {
            user.setExternalCapDematId(capdematId);
        }
        return user;
    }

    @Override
    public void generateAllCapdematId(final String externalServiceLabel) {
        List<Individual> indivs = individualDAO.listIndividualWithoutMapping(externalServiceLabel);
        for (Individual indiv: indivs) {
            externalHomeFolderService.addIndividualFolderMapping(externalServiceLabel, indiv);
        }
    }

    @Override
    public List<Individual> listEditedUsers(final String startDate, final String externalServiceLabel) {
        String condition =  "lastModificationDate > to_date(:date, '"+PG_DATE_FORMAT+"') " +
                            "AND state != 'ARCHIVED' " +
                            "AND creationDate < to_date(:date, '"+PG_DATE_FORMAT+"')";

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("date", startDate);
        return individualDAO.listByIdsWithMapping(condition, params, externalServiceLabel);
    }

    @Override
    public List<Individual> listCreatedUsers(final String startDate, final String externalServiceLabel) {
        String condition = "creationDate >= to_date(:date, '"+PG_DATE_FORMAT+"')";

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("date", startDate);
        return individualDAO.listByIdsWithMapping(condition, params, externalServiceLabel);
    }

    @Override
    public List<Individual> listDeletedUsers(final String startDate, final String externalServiceLabel) {
        String condition =  "lastModificationDate > to_date(:date, '"+PG_DATE_FORMAT+"') " +
                            "AND state = 'ARCHIVED' " +
                            "AND creationDate < to_date(:date, '"+PG_DATE_FORMAT+"')";

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("date", startDate);
        return individualDAO.listByIdsWithMapping(condition, params, externalServiceLabel);
    }

    @Override
    public List<Individual> listAllUsers(final String externalServiceLabel) {
        return individualDAO.listByIdsWithMapping("1=1", null, externalServiceLabel);
    }

    public void setExternalHomeFolderService(IExternalHomeFolderService externalHomeFolderService) {
        this.externalHomeFolderService = externalHomeFolderService;
    }

    public void setIndividualDAO(IIndividualDAO individualDAO) {
        this.individualDAO = individualDAO;
    }

}