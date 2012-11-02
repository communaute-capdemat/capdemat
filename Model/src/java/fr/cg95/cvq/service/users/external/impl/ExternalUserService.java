package fr.cg95.cvq.service.users.external.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.cg95.cvq.business.users.Individual;
import fr.cg95.cvq.dao.users.IIndividualDAO;
import fr.cg95.cvq.dao.users.hibernate.IndividualDAO.IndividualListFilters;
import fr.cg95.cvq.service.users.external.IExternalHomeFolderService;
import fr.cg95.cvq.service.users.external.IExternalUserService;

public class ExternalUserService implements IExternalUserService {

    private IExternalHomeFolderService externalHomeFolderService;
    private IIndividualDAO individualDAO;

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
        return individualDAO.listWithMapping(IndividualListFilters.EDITED, externalServiceLabel, startDate);
    }

    @Override
    public List<Individual> listCreatedUsers(final String startDate, final String externalServiceLabel) {
        return individualDAO.listWithMapping(IndividualListFilters.CREATED, externalServiceLabel, startDate);
    }

    @Override
    public List<Individual> listDeletedUsers(final String startDate, final String externalServiceLabel) {
        return individualDAO.listWithMapping(IndividualListFilters.DELETED, externalServiceLabel, startDate);
    }

    @Override
    public List<Individual> listAllUsers(final String externalServiceLabel) {
        return individualDAO.listWithMapping(IndividualListFilters.ALL, externalServiceLabel, null);
    }

    public void setExternalHomeFolderService(IExternalHomeFolderService externalHomeFolderService) {
        this.externalHomeFolderService = externalHomeFolderService;
    }

    public void setIndividualDAO(IIndividualDAO individualDAO) {
        this.individualDAO = individualDAO;
    }

}