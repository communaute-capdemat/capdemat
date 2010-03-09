package fr.cg95.cvq.service.request.social.impl;

import java.util.Arrays;

import fr.cg95.cvq.business.request.Request;
import fr.cg95.cvq.business.request.social.DeteneurAutoriteParentaleType;
import fr.cg95.cvq.business.request.social.MdphYouthRequest;
import fr.cg95.cvq.business.request.social.MyrBesoinsDemandePch;
import fr.cg95.cvq.business.request.social.MyrChoixProjetDeVieType;
import fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType;
import fr.cg95.cvq.business.request.social.MyrLogementType;
import fr.cg95.cvq.business.request.social.MyrSituationAutreType;
import fr.cg95.cvq.business.request.social.MyrSituationFamilialeType;
import fr.cg95.cvq.business.request.social.SituationFamilialeType;
import fr.cg95.cvq.service.request.condition.EqualityChecker;
import fr.cg95.cvq.service.request.condition.EqualityListChecker;
import fr.cg95.cvq.service.request.impl.RequestService;

public final class MdphYouthRequestService extends RequestService {

    @Override
    public void init() {

        super.init();
        
        MdphYouthRequest.conditions.put("deteneurAutoriteParentale", new EqualityChecker(DeteneurAutoriteParentaleType.AUTRE.name()));
        MdphYouthRequest.conditions.put("preferencesEtablissementOuService", new EqualityChecker("true"));
        MdphYouthRequest.conditions.put("situationMaritale", new EqualityListChecker(Arrays.asList(
                MyrSituationFamilialeType.MARIE.name(), MyrSituationFamilialeType.CONCUBINAGE.name())));
        MdphYouthRequest.conditions.put("situationParticuliere", new EqualityChecker(MyrSituationAutreType.AUTRE.name()));
        MdphYouthRequest.conditions.put("situationParticuliere", new EqualityListChecker(Arrays.asList(
                "estAutreCas="+MyrSituationAutreType.AUTRE.name(),
                "estUnCas="+MyrSituationAutreType.ETABLISSEMENT_MEDICO_SOCIAL.name(),
                "estUnCas="+MyrSituationAutreType.AUTRE.name(),
                "estUnCas="+MyrSituationAutreType.HOSPITALISE.name())));
        MdphYouthRequest.conditions.put("situationProfessionnelleVous", new EqualityListChecker(Arrays.asList(
                "estSalarieVous="+MyrChoixSituationProfessionnelleType.SALARIE.name(),
                "estStagiaireVous="+MyrChoixSituationProfessionnelleType.STAGIAIRE.name(),
                "estNonSalarieVous="+MyrChoixSituationProfessionnelleType.NONSALARIE.name(),
                "estDemandeurEmploiVous="+MyrChoixSituationProfessionnelleType.DEMANDEUR.name(),
                "estRetraiteVous="+MyrChoixSituationProfessionnelleType.RETRAITE.name(),
                "estBeneficiairePensionVous="+MyrChoixSituationProfessionnelleType.PENSION.name(),
                "estAutreVous="+MyrChoixSituationProfessionnelleType.AUTRE.name())));
        MdphYouthRequest.conditions.put("situationProfessionnelleConjoint", new EqualityListChecker(Arrays.asList(
                "estSalarieConjoint="+MyrChoixSituationProfessionnelleType.SALARIE.name(),
                "estStagiaireConjoint="+MyrChoixSituationProfessionnelleType.STAGIAIRE.name(),
                "estNonSalarieConjoint="+MyrChoixSituationProfessionnelleType.NONSALARIE.name(),
                "estDemandeurEmploiConjoint="+MyrChoixSituationProfessionnelleType.DEMANDEUR.name(),
                "estRetraiteConjoint="+MyrChoixSituationProfessionnelleType.RETRAITE.name(),
                "estBeneficiairePensionConjoint="+MyrChoixSituationProfessionnelleType.PENSION.name(),
                "estAutreConjoint="+MyrChoixSituationProfessionnelleType.AUTRE.name())));
        MdphYouthRequest.conditions.put("typeLogement", new EqualityChecker(MyrLogementType.AUTRE.name()));
        MdphYouthRequest.conditions.put("choixProjetDeVie", new EqualityChecker(MyrChoixProjetDeVieType.OUI.name()));
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
