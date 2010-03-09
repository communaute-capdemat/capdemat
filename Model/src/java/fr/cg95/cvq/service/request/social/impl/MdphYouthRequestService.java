package fr.cg95.cvq.service.request.social.impl;

import java.util.Arrays;

import fr.cg95.cvq.business.request.Request;
import fr.cg95.cvq.business.request.social.MdphYouthRequest;
import fr.cg95.cvq.business.request.social.MyrBesoinsDemandePch;
import fr.cg95.cvq.service.request.condition.EqualityChecker;
import fr.cg95.cvq.service.request.condition.EqualityListChecker;
import fr.cg95.cvq.service.request.impl.RequestService;

public final class MdphYouthRequestService extends RequestService {

    @Override
    public void init() {

        super.init();
        
        MdphYouthRequest.conditions.put("deteneurAutoriteParentale", new EqualityChecker("Autre"));
        MdphYouthRequest.conditions.put("preferencesEtablissementOuService", new EqualityChecker("true"));
        MdphYouthRequest.conditions.put("situationMaritale", new EqualityListChecker(Arrays.asList("Marie", "Concubinage")));
        MdphYouthRequest.conditions.put("situationParticuliere", new EqualityChecker("Autre"));
        MdphYouthRequest.conditions.put("situationParticuliere", 
                new EqualityListChecker(Arrays.asList("estAutreCas-Autre", "estUnCas-EtablissementMedicoSocial", "estUnCas-Autre", "estUnCas-Hospitalise")));
        MdphYouthRequest.conditions.put("situationProfessionnelleVous", 
                new EqualityListChecker(Arrays.asList("estSalarieVous-Salarie", "estStagiaireVous-Stagiaire", "estNonSalarieVous-Nonsalarie", "estDemandeurEmploiVous-Demandeur", "estRetraiteVous-Retraite", "estBeneficiairePensionVous-Pension", "estAutreVous-Autre")));
        MdphYouthRequest.conditions.put("situationProfessionnelleConjoint", 
                new EqualityListChecker(Arrays.asList("estSalarieConjoint-Salarie", "estStagiaireConjoint-Stagiaire", "estNonSalarieConjoint-Nonsalarie", "estDemandeurEmploiConjoint-Demandeur", "estRetraiteConjoint-Retraite", "estBeneficiairePensionConjoint-Pension", "estAutreConjoint-Autre")));
        MdphYouthRequest.conditions.put("typeLogement", new EqualityChecker("Autre"));
        MdphYouthRequest.conditions.put("choixProjetDeVie", new EqualityChecker("Oui"));
        MdphYouthRequest.conditions.put("enfantEnInternat", new EqualityChecker("true"));
        
        // kept them for client side JS validation script
        MdphYouthRequest.conditions.put("besoinsDemandePCH.aideHumaine", new EqualityChecker("true"));
        MdphYouthRequest.conditions.put("besoinsDemandePCH.aideTechnique", new EqualityChecker("true"));
        MdphYouthRequest.conditions.put("besoinsDemandePCH.amenagementLogementDemenagement", new EqualityChecker("true"));
        MdphYouthRequest.conditions.put("besoinsDemandePCH.amenagementVehicule", new EqualityChecker("true"));
        MdphYouthRequest.conditions.put("besoinsDemandePCH.chargesSpecifiques", new EqualityChecker("true"));
        MdphYouthRequest.conditions.put("besoinsDemandePCH.aideAnimaliere", new EqualityChecker("true"));
        
        // added for server side vaidation
        MyrBesoinsDemandePch.conditions.put("myrBesoinsDemandePch.aideHumaine", new EqualityChecker("true"));
        MyrBesoinsDemandePch.conditions.put("myrBesoinsDemandePch.aideTechnique", new EqualityChecker("true"));
        MyrBesoinsDemandePch.conditions.put("myrBesoinsDemandePch.amenagementLogementDemenagement", new EqualityChecker("true"));
        MyrBesoinsDemandePch.conditions.put("myrBesoinsDemandePch.amenagementVehicule", new EqualityChecker("true"));
        MyrBesoinsDemandePch.conditions.put("myrBesoinsDemandePch.chargesSpecifiques", new EqualityChecker("true"));
        MyrBesoinsDemandePch.conditions.put("myrBesoinsDemandePch.aideAnimaliere", new EqualityChecker("true"));
    }
    
    @Override
    public boolean accept(Request request) {
        return request instanceof MdphYouthRequest;
    }

    @Override
    public Request getSkeletonRequest() {
        return new MdphYouthRequest();
    }
    
    

}
