package fr.cg95.cvq.service.request.social.impl;

import java.util.Arrays;

import fr.cg95.cvq.business.request.Request;
import fr.cg95.cvq.business.request.social.MarBesoinsDemandePch;
import fr.cg95.cvq.business.request.social.MdphAdultRequest;
import fr.cg95.cvq.exception.CvqException;
import fr.cg95.cvq.service.request.condition.EqualityChecker;
import fr.cg95.cvq.service.request.condition.EqualityListChecker;
import fr.cg95.cvq.service.request.impl.RequestService;

public final class MdphAdultRequestService extends RequestService {

    @Override
    public void init() {

        super.init();
        
        MdphAdultRequest.conditions.put("representantLegal", new EqualityListChecker(Arrays.asList("Tutelle", "CuratelleSimple", "CuratelleRenforcee", "Autre")));
        MdphAdultRequest.conditions.put("situationMaritale", new EqualityListChecker(Arrays.asList("Marie", "Concubinage")));
        MdphAdultRequest.conditions.put("situationParticuliere", new EqualityChecker("Autre"));
        MdphAdultRequest.conditions.put("situationParticuliere", 
                new EqualityListChecker(Arrays.asList("estAutreCas-Autre", "estUnCas-EtablissementMedicoSocial", "estUnCas-Autre", "estUnCas-Hospitalise")));
        MdphAdultRequest.conditions.put("situationProfessionnelleVous", 
                new EqualityListChecker(Arrays.asList("estSalarieVous-Salarie", "estStagiaireVous-Stagiaire", "estNonSalarieVous-Nonsalarie", "estDemandeurEmploiVous-Demandeur", "estRetraiteVous-Retraite", "estBeneficiairePensionVous-Pension", "estAutreVous-Autre")));
        MdphAdultRequest.conditions.put("situationProfessionnelleConjoint", 
                new EqualityListChecker(Arrays.asList("estSalarieConjoint-Salarie", "estStagiaireConjoint-Stagiaire", "estNonSalarieConjoint-Nonsalarie", "estDemandeurEmploiConjoint-Demandeur", "estRetraiteConjoint-Retraite", "estBeneficiairePensionConjoint-Pension", "estAutreConjoint-Autre")));
        MdphAdultRequest.conditions.put("typeLogement", new EqualityChecker("Autre"));
        MdphAdultRequest.conditions.put("choixProjetDeVie", new EqualityChecker("Oui"));
        MdphAdultRequest.conditions.put("preferencesEtablissementOuService", new EqualityChecker("true"));
        MdphAdultRequest.conditions.put("orientationReclassement", new EqualityChecker("true"));
        MdphAdultRequest.conditions.put("preferenceEtablissementOuService", new EqualityChecker("true"));
        MdphAdultRequest.conditions.put("precedentsRevenusRecus", new EqualityListChecker(Arrays.asList("Activite", "Esat", "Indemnites")));

        // kept them for client side JS validation script
        MdphAdultRequest.conditions.put("besoinsDemandePCH.aideHumaine", new EqualityChecker("true"));
        MdphAdultRequest.conditions.put("besoinsDemandePCH.aideTechnique", new EqualityChecker("true"));
        MdphAdultRequest.conditions.put("besoinsDemandePCH.amenagementLogementDemenagement", new EqualityChecker("true"));
        MdphAdultRequest.conditions.put("besoinsDemandePCH.amenagementVehicule", new EqualityChecker("true"));
        MdphAdultRequest.conditions.put("besoinsDemandePCH.chargesSpecifiques", new EqualityChecker("true"));
        MdphAdultRequest.conditions.put("besoinsDemandePCH.aideAnimaliere", new EqualityChecker("true"));

        // added for server side vaidation
        MarBesoinsDemandePch.conditions.put("marBesoinsDemandePch.aideHumaine", new EqualityChecker("true"));
        MarBesoinsDemandePch.conditions.put("marBesoinsDemandePch.aideTechnique", new EqualityChecker("true"));
        MarBesoinsDemandePch.conditions.put("marBesoinsDemandePch.amenagementLogementDemenagement", new EqualityChecker("true"));
        MarBesoinsDemandePch.conditions.put("marBesoinsDemandePch.amenagementVehicule", new EqualityChecker("true"));
        MarBesoinsDemandePch.conditions.put("marBesoinsDemandePch.chargesSpecifiques", new EqualityChecker("true"));
        MarBesoinsDemandePch.conditions.put("marBesoinsDemandePch.aideAnimaliere", new EqualityChecker("true"));
    }
    
    @Override
    public boolean accept(Request request) {
        return request instanceof MdphAdultRequest;
    }

    @Override
    public Request getSkeletonRequest() {
        return new MdphAdultRequest();
    }
    
    

}
