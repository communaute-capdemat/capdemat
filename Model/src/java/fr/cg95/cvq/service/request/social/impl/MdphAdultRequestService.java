package fr.cg95.cvq.service.request.social.impl;

import java.util.Arrays;

import fr.cg95.cvq.business.request.Request;
import fr.cg95.cvq.business.request.social.ChoixProjetDeVieType;
import fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType;
import fr.cg95.cvq.business.request.social.LogementType;
import fr.cg95.cvq.business.request.social.MarBesoinsDemandePch;
import fr.cg95.cvq.business.request.social.MarSituationProfessionnelleAutre;
import fr.cg95.cvq.business.request.social.MdphAdultRequest;
import fr.cg95.cvq.business.request.social.PrecedentsRevenusRecusType;
import fr.cg95.cvq.business.request.social.RepresentantLegalType;
import fr.cg95.cvq.business.request.social.SituationActuelleType;
import fr.cg95.cvq.business.request.social.SituationAutreType;
import fr.cg95.cvq.business.request.social.SituationFamilialeType;
import fr.cg95.cvq.exception.CvqException;
import fr.cg95.cvq.service.request.condition.EqualityChecker;
import fr.cg95.cvq.service.request.condition.EqualityListChecker;
import fr.cg95.cvq.service.request.impl.RequestService;

public final class MdphAdultRequestService extends RequestService {

    @Override
    public void init() {

        super.init();
        
        MdphAdultRequest.conditions.put("representantLegal",new EqualityListChecker(Arrays.asList(
                        RepresentantLegalType.TUTELLE.name(), RepresentantLegalType.CURATELLE_SIMPLE.name(),
                        RepresentantLegalType.CURATELLE_RENFORCEE.name(), RepresentantLegalType.AUTRE.name())));
        MdphAdultRequest.conditions.put("situationMaritale", new EqualityListChecker(Arrays.asList(
                SituationFamilialeType.MARIE.name(), SituationFamilialeType.CONCUBINAGE.name())));
        MdphAdultRequest.conditions.put("situationParticuliere", new EqualityChecker(SituationAutreType.AUTRE.name()));
        MdphAdultRequest.conditions.put("situationParticuliere", new EqualityListChecker(Arrays.asList(
                "estAutreCas="+SituationAutreType.AUTRE.name(), "estUnCas="+SituationAutreType.ETABLISSEMENT_MEDICO_SOCIAL.name(),
                "estUnCas="+SituationAutreType.AUTRE.name(), "estUnCas="+SituationAutreType.HOSPITALISE.name())));
        MdphAdultRequest.conditions.put("situationProfessionnelleVous", new EqualityListChecker(Arrays.asList(
            "estSalarieVous="+ChoixSituationProfessionnelleType.SALARIE.name(),
            "estStagiaireVous="+ChoixSituationProfessionnelleType.STAGIAIRE.name(),
            "estNonSalarieVous="+ChoixSituationProfessionnelleType.NONSALARIE.name(),
            "estDemandeurEmploiVous="+ChoixSituationProfessionnelleType.DEMANDEUR.name(),
            "estRetraiteVous="+ChoixSituationProfessionnelleType.RETRAITE.name(),
            "estBeneficiairePensionVous="+ChoixSituationProfessionnelleType.PENSION.name(),
            "estAutreVous="+ChoixSituationProfessionnelleType.AUTRE.name())));

        MdphAdultRequest.conditions.put("situationProfessionnelleConjoint", new EqualityListChecker(Arrays.asList(
                "estSalarieConjoint="+ChoixSituationProfessionnelleType.SALARIE.name(),
                "estStagiaireConjoint="+ChoixSituationProfessionnelleType.STAGIAIRE.name(),
                "estNonSalarieConjoint="+ChoixSituationProfessionnelleType.NONSALARIE.name(),
                "estDemandeurEmploiConjoint="+ChoixSituationProfessionnelleType.DEMANDEUR.name(),
                "estRetraiteConjoint="+ChoixSituationProfessionnelleType.RETRAITE.name(),
                "estBeneficiairePensionConjoint="+ChoixSituationProfessionnelleType.PENSION.name(),
                "estAutreConjoint="+ChoixSituationProfessionnelleType.AUTRE.name())));
        MdphAdultRequest.conditions.put("typeLogement", new EqualityChecker(LogementType.AUTRE.name()));
        MdphAdultRequest.conditions.put("choixProjetDeVie", new EqualityChecker(ChoixProjetDeVieType.OUI.name()));
        MdphAdultRequest.conditions.put("preferencesEtablissementOuService", new EqualityChecker("true"));
        MdphAdultRequest.conditions.put("orientationReclassement", new EqualityChecker("true"));
        MdphAdultRequest.conditions.put("preferenceEtablissementOuService", new EqualityChecker("true"));
        MdphAdultRequest.conditions.put("precedentsRevenusRecus", new EqualityListChecker(Arrays.asList(
                PrecedentsRevenusRecusType.ACTIVITE.name(),
                PrecedentsRevenusRecusType.ESAT.name(),
                PrecedentsRevenusRecusType.INDEMNITES.name())));

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
