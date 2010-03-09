
package fr.cg95.cvq.business.request.social;

import java.io.Serializable;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.LocalTime;

import net.sf.oval.constraint.AssertValid;
import org.apache.xmlbeans.XmlOptions;
import fr.cg95.cvq.business.authority.*;
import fr.cg95.cvq.business.request.*;
import fr.cg95.cvq.business.request.annotation.*;
import fr.cg95.cvq.business.users.*;
import fr.cg95.cvq.xml.common.*;
import fr.cg95.cvq.xml.request.social.*;
import fr.cg95.cvq.service.request.condition.IConditionChecker;

/**
 * Generated class file, do not edit !
 */
public class MdphAdultRequest extends Request implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions = MdphAdultRequestData.conditions;

    @AssertValid(message = "")
    private MdphAdultRequestData mdphAdultRequestData;

    public MdphAdultRequest(RequestData requestData, MdphAdultRequestData mdphAdultRequestData) {
        super(requestData);
        this.mdphAdultRequestData = mdphAdultRequestData;
    }

    public MdphAdultRequest() {
        super();
        this.mdphAdultRequestData = new MdphAdultRequestData();
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("subject", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("representantLegal", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("organismePrestationFamiliale", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("situationFamiliale", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("situationProfessionnelle", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("autreSituation", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("projetDeVie", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("demandeParcoursScolaireEtFormation", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("demandeCartes", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("demandePrestationCompensation", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("affilitationAidant", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("demandeAllocationEtComplementRessources", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("demandeProfessionnelle", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("demandeOrientationMedicoSociale", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("document", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("validation", stepState);
        
    }

    /**
     * Reserved for RequestDAO !
     */
    @Override
    public MdphAdultRequestData getSpecificData() {
        return mdphAdultRequestData;
    }

    /**
     * Reserved for RequestDAO !
     */
    public void setSpecificData(MdphAdultRequestData mdphAdultRequestData) {
        this.mdphAdultRequestData = mdphAdultRequestData;
    }

    @Override
    public final String modelToXmlString() {
        MdphAdultRequestDocument object = this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    @Override
    public final MdphAdultRequestDocument modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        Date date = null;
        MdphAdultRequestDocument mdphAdultRequestDoc = MdphAdultRequestDocument.Factory.newInstance();
        MdphAdultRequestDocument.MdphAdultRequest mdphAdultRequest = mdphAdultRequestDoc.addNewMdphAdultRequest();
        super.fillCommonXmlInfo(mdphAdultRequest);
        int i = 0;
        
        if (getAdresseResponsableLegal() != null)
            mdphAdultRequest.setAdresseResponsableLegal(getAdresseResponsableLegal().modelToXml());
      
        if (getAllocationPersonnaliseeAutonomie() != null)
            mdphAdultRequest.setAllocationPersonnaliseeAutonomie(getAllocationPersonnaliseeAutonomie().booleanValue());
      
        if (getAutre() != null)
            mdphAdultRequest.setAutre(getAutre().booleanValue());
      
        if (getBesoinsDemandePCH() != null)
            mdphAdultRequest.setBesoinsDemandePCH(getBesoinsDemandePCH().modelToXml());
      
        if (getCarteAccompagnement() != null)
            mdphAdultRequest.setCarteAccompagnement(getCarteAccompagnement().booleanValue());
      
        if (getCarteInvalidite() != null)
            mdphAdultRequest.setCarteInvalidite(getCarteInvalidite().booleanValue());
      
        if (getCarteStationnement() != null)
            mdphAdultRequest.setCarteStationnement(getCarteStationnement().booleanValue());
      
        if (getChoixOrientationReclassement() != null)
            mdphAdultRequest.setChoixOrientationReclassement(fr.cg95.cvq.xml.request.social.ChoixOrientationReclassementType.Enum.forString(getChoixOrientationReclassement().toString()));
      
        if (getChoixPrestationCompensation() != null)
            mdphAdultRequest.setChoixPrestationCompensation(fr.cg95.cvq.xml.request.social.ChoixPrestationCompensationType.Enum.forString(getChoixPrestationCompensation().toString()));
      
        if (getChoixProjetDeVie() != null)
            mdphAdultRequest.setChoixProjetDeVie(fr.cg95.cvq.xml.request.social.ChoixProjetDeVieType.Enum.forString(getChoixProjetDeVie().toString()));
      
        if (getChoixTypeDemandeAllocEtCompl() != null)
            mdphAdultRequest.setChoixTypeDemandeAllocEtCompl(getChoixTypeDemandeAllocEtCompl().modelToXml());
      
        mdphAdultRequest.setConseilleProjetDeVie(getConseilleProjetDeVie());
      
        date = getDateArriveeFrance();
        if (date != null) {
            calendar.setTime(date);
            mdphAdultRequest.setDateArriveeFrance(calendar);
        }
      
        date = getDateDebutRevenuRecu();
        if (date != null) {
            calendar.setTime(date);
            mdphAdultRequest.setDateDebutRevenuRecu(calendar);
        }
      
        date = getDateEntreeSouhaitee();
        if (date != null) {
            calendar.setTime(date);
            mdphAdultRequest.setDateEntreeSouhaitee(calendar);
        }
      
        date = getDateFinRevenuRecu();
        if (date != null) {
            calendar.setTime(date);
            mdphAdultRequest.setDateFinRevenuRecu(calendar);
        }
      
        date = getDateNaissanceAidant();
        if (date != null) {
            calendar.setTime(date);
            mdphAdultRequest.setDateNaissanceAidant(calendar);
        }
      
        date = getDateNaissanceSujet();
        if (date != null) {
            calendar.setTime(date);
            mdphAdultRequest.setDateNaissanceSujet(calendar);
        }
      
        date = getDateSituationFamiliale();
        if (date != null) {
            calendar.setTime(date);
            mdphAdultRequest.setDateSituationFamiliale(calendar);
        }
      
        mdphAdultRequest.setDemandeLibreScolaire(getDemandeLibreScolaire());
      
        if (getDomiciliationAidant() != null)
            mdphAdultRequest.setDomiciliationAidant(getDomiciliationAidant().modelToXml());
      
        if (getDomiciliationEtablissement() != null)
            mdphAdultRequest.setDomiciliationEtablissement(getDomiciliationEtablissement().modelToXml());
      
        if (getDomiciliationOrganismePayeur() != null)
            mdphAdultRequest.setDomiciliationOrganismePayeur(getDomiciliationOrganismePayeur().modelToXml());
      
        mdphAdultRequest.setEmailResponsableLegal(getEmailResponsableLegal());
      
        mdphAdultRequest.setExpressionProjetDeVie(getExpressionProjetDeVie());
      
        mdphAdultRequest.setFaxResponsableLegal(getFaxResponsableLegal());
      
        mdphAdultRequest.setFaxSujet(getFaxSujet());
      
        if (getIdentiteConjoint() != null)
            mdphAdultRequest.setIdentiteConjoint(getIdentiteConjoint().modelToXml());
      
        mdphAdultRequest.setLienParenteAidant(getLienParenteAidant());
      
        if (getLieuNaissanceSujet() != null)
            mdphAdultRequest.setLieuNaissanceSujet(getLieuNaissanceSujet().modelToXml());
      
        if (getNationalite() != null)
            mdphAdultRequest.setNationalite(fr.cg95.cvq.xml.request.social.NationaliteAvecSuisseType.Enum.forString(getNationalite().toString()));
      
        mdphAdultRequest.setNomAidant(getNomAidant());
      
        mdphAdultRequest.setNomAllocataire(getNomAllocataire());
      
        mdphAdultRequest.setNomEtablissement(getNomEtablissement());
      
        mdphAdultRequest.setNomOrganismePayeur(getNomOrganismePayeur());
      
        mdphAdultRequest.setNomOrganismeSecuriteSociale(getNomOrganismeSecuriteSociale());
      
        mdphAdultRequest.setNomResponsableLegal(getNomResponsableLegal());
      
        mdphAdultRequest.setNombreEnfantsACharge(getNombreEnfantsACharge());
      
        mdphAdultRequest.setNumeroAllocataire(getNumeroAllocataire());
      
        mdphAdultRequest.setNumeroSecuriteSocialeSujet(getNumeroSecuriteSocialeSujet());
      
        if (getOrganismePayeur() != null)
            mdphAdultRequest.setOrganismePayeur(fr.cg95.cvq.xml.request.social.OrganismePayeurType.Enum.forString(getOrganismePayeur().toString()));
      
        if (getOrientationReclassement() != null)
            mdphAdultRequest.setOrientationReclassement(getOrientationReclassement().booleanValue());
      
        if (getOrientationSouhaitee() != null)
            mdphAdultRequest.setOrientationSouhaitee(fr.cg95.cvq.xml.request.social.OrientationSouhaiteeType.Enum.forString(getOrientationSouhaitee().toString()));
      
        if (getPrecedentDossierMdph() != null)
            mdphAdultRequest.setPrecedentDossierMdph(getPrecedentDossierMdph().modelToXml());
      
        if (getPrecedentsRevenusRecus() != null)
            mdphAdultRequest.setPrecedentsRevenusRecus(fr.cg95.cvq.xml.request.social.PrecedentsRevenusRecusType.Enum.forString(getPrecedentsRevenusRecus().toString()));
      
        mdphAdultRequest.setPrecisionAutre(getPrecisionAutre());
      
        mdphAdultRequest.setPrecisionLogementAutre(getPrecisionLogementAutre());
      
        if (getPrecisionPreferenceEtablissementOuService() != null)
            mdphAdultRequest.setPrecisionPreferenceEtablissementOuService(getPrecisionPreferenceEtablissementOuService().modelToXml());
      
        if (getPrecisionPreferencesEtablissementOuService() != null)
            mdphAdultRequest.setPrecisionPreferencesEtablissementOuService(getPrecisionPreferencesEtablissementOuService().modelToXml());
      
        mdphAdultRequest.setPrecisionRevenuRecu(getPrecisionRevenuRecu());
      
        mdphAdultRequest.setPrecisionSiDomicileAupresOrganisme(getPrecisionSiDomicileAupresOrganisme());
      
        if (getPreferenceEtablissementOuService() != null)
            mdphAdultRequest.setPreferenceEtablissementOuService(getPreferenceEtablissementOuService().booleanValue());
      
        if (getPreferencesEtablissementOuService() != null)
            mdphAdultRequest.setPreferencesEtablissementOuService(getPreferencesEtablissementOuService().booleanValue());
      
        mdphAdultRequest.setPrenomAllocataire(getPrenomAllocataire());
      
        if (getPrimeReclassement() != null)
            mdphAdultRequest.setPrimeReclassement(getPrimeReclassement().booleanValue());
      
        if (getRepresentantLegal() != null)
            mdphAdultRequest.setRepresentantLegal(fr.cg95.cvq.xml.request.social.RepresentantLegalType.Enum.forString(getRepresentantLegal().toString()));
      
        if (getRqth() != null)
            mdphAdultRequest.setRqth(getRqth().booleanValue());
      
        if (getSituationActuelle() != null)
            mdphAdultRequest.setSituationActuelle(fr.cg95.cvq.xml.request.social.SituationActuelleType.Enum.forString(getSituationActuelle().toString()));
      
        mdphAdultRequest.setSituationActuellePrecision(getSituationActuellePrecision());
      
        if (getSituationMaritale() != null)
            mdphAdultRequest.setSituationMaritale(fr.cg95.cvq.xml.request.social.SituationFamilialeType.Enum.forString(getSituationMaritale().toString()));
      
        if (getSituationParticuliere() != null)
            mdphAdultRequest.setSituationParticuliere(fr.cg95.cvq.xml.request.social.SituationAutreType.Enum.forString(getSituationParticuliere().toString()));
      
        if (getSituationProfessionnelleConjoint() != null)
            mdphAdultRequest.setSituationProfessionnelleConjoint(fr.cg95.cvq.xml.request.social.ChoixSituationProfessionnelleType.Enum.forString(getSituationProfessionnelleConjoint().toString()));
      
        if (getSituationProfessionnelleConjointAutre() != null)
            mdphAdultRequest.setSituationProfessionnelleConjointAutre(getSituationProfessionnelleConjointAutre().modelToXml());
      
        if (getSituationProfessionnelleConjointBeneficiairePension() != null)
            mdphAdultRequest.setSituationProfessionnelleConjointBeneficiairePension(getSituationProfessionnelleConjointBeneficiairePension().modelToXml());
      
        if (getSituationProfessionnelleConjointDemandeurEmploi() != null)
            mdphAdultRequest.setSituationProfessionnelleConjointDemandeurEmploi(getSituationProfessionnelleConjointDemandeurEmploi().modelToXml());
      
        if (getSituationProfessionnelleConjointNonSalarie() != null)
            mdphAdultRequest.setSituationProfessionnelleConjointNonSalarie(getSituationProfessionnelleConjointNonSalarie().modelToXml());
      
        if (getSituationProfessionnelleConjointRetraite() != null)
            mdphAdultRequest.setSituationProfessionnelleConjointRetraite(getSituationProfessionnelleConjointRetraite().modelToXml());
      
        if (getSituationProfessionnelleConjointSalarie() != null)
            mdphAdultRequest.setSituationProfessionnelleConjointSalarie(getSituationProfessionnelleConjointSalarie().modelToXml());
      
        if (getSituationProfessionnelleConjointStagiaire() != null)
            mdphAdultRequest.setSituationProfessionnelleConjointStagiaire(getSituationProfessionnelleConjointStagiaire().modelToXml());
      
        if (getSituationProfessionnelleVous() != null)
            mdphAdultRequest.setSituationProfessionnelleVous(fr.cg95.cvq.xml.request.social.ChoixSituationProfessionnelleType.Enum.forString(getSituationProfessionnelleVous().toString()));
      
        if (getSituationProfessionnelleVousAutre() != null)
            mdphAdultRequest.setSituationProfessionnelleVousAutre(getSituationProfessionnelleVousAutre().modelToXml());
      
        if (getSituationProfessionnelleVousBeneficiairePension() != null)
            mdphAdultRequest.setSituationProfessionnelleVousBeneficiairePension(getSituationProfessionnelleVousBeneficiairePension().modelToXml());
      
        if (getSituationProfessionnelleVousDemandeurEmploi() != null)
            mdphAdultRequest.setSituationProfessionnelleVousDemandeurEmploi(getSituationProfessionnelleVousDemandeurEmploi().modelToXml());
      
        if (getSituationProfessionnelleVousNonSalarie() != null)
            mdphAdultRequest.setSituationProfessionnelleVousNonSalarie(getSituationProfessionnelleVousNonSalarie().modelToXml());
      
        if (getSituationProfessionnelleVousRetraite() != null)
            mdphAdultRequest.setSituationProfessionnelleVousRetraite(getSituationProfessionnelleVousRetraite().modelToXml());
      
        if (getSituationProfessionnelleVousSalarie() != null)
            mdphAdultRequest.setSituationProfessionnelleVousSalarie(getSituationProfessionnelleVousSalarie().modelToXml());
      
        if (getSituationProfessionnelleVousStagiaire() != null)
            mdphAdultRequest.setSituationProfessionnelleVousStagiaire(getSituationProfessionnelleVousStagiaire().modelToXml());
      
        mdphAdultRequest.setTelResponsableLegal(getTelResponsableLegal());
      
        if (getTypeLogement() != null)
            mdphAdultRequest.setTypeLogement(fr.cg95.cvq.xml.request.social.LogementType.Enum.forString(getTypeLogement().toString()));
      
        return mdphAdultRequestDoc;
    }

    @Override
    public final MdphAdultRequestDocument.MdphAdultRequest modelToXmlRequest() {
        return modelToXml().getMdphAdultRequest();
    }

    public static MdphAdultRequest xmlToModel(MdphAdultRequestDocument mdphAdultRequestDoc) {
        MdphAdultRequestDocument.MdphAdultRequest mdphAdultRequestXml = mdphAdultRequestDoc.getMdphAdultRequest();
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MdphAdultRequest mdphAdultRequest = new MdphAdultRequest();
        mdphAdultRequest.fillCommonModelInfo(mdphAdultRequest, mdphAdultRequestXml);
        
        if (mdphAdultRequestXml.getAdresseResponsableLegal() != null)
            mdphAdultRequest.setAdresseResponsableLegal(Address.xmlToModel(mdphAdultRequestXml.getAdresseResponsableLegal()));
      
        mdphAdultRequest.setAllocationPersonnaliseeAutonomie(Boolean.valueOf(mdphAdultRequestXml.getAllocationPersonnaliseeAutonomie()));
      
        mdphAdultRequest.setAutre(Boolean.valueOf(mdphAdultRequestXml.getAutre()));
      
        if (mdphAdultRequestXml.getBesoinsDemandePCH() != null)
            mdphAdultRequest.setBesoinsDemandePCH(MarBesoinsDemandePch.xmlToModel(mdphAdultRequestXml.getBesoinsDemandePCH()));
      
        mdphAdultRequest.setCarteAccompagnement(Boolean.valueOf(mdphAdultRequestXml.getCarteAccompagnement()));
      
        mdphAdultRequest.setCarteInvalidite(Boolean.valueOf(mdphAdultRequestXml.getCarteInvalidite()));
      
        mdphAdultRequest.setCarteStationnement(Boolean.valueOf(mdphAdultRequestXml.getCarteStationnement()));
      
        if (mdphAdultRequestXml.getChoixOrientationReclassement() != null)
            mdphAdultRequest.setChoixOrientationReclassement(fr.cg95.cvq.business.request.social.ChoixOrientationReclassementType.forString(mdphAdultRequestXml.getChoixOrientationReclassement().toString()));
        else
            mdphAdultRequest.setChoixOrientationReclassement(fr.cg95.cvq.business.request.social.ChoixOrientationReclassementType.getDefaultChoixOrientationReclassementType());
      
        if (mdphAdultRequestXml.getChoixPrestationCompensation() != null)
            mdphAdultRequest.setChoixPrestationCompensation(fr.cg95.cvq.business.request.social.ChoixPrestationCompensationType.forString(mdphAdultRequestXml.getChoixPrestationCompensation().toString()));
        else
            mdphAdultRequest.setChoixPrestationCompensation(fr.cg95.cvq.business.request.social.ChoixPrestationCompensationType.getDefaultChoixPrestationCompensationType());
      
        if (mdphAdultRequestXml.getChoixProjetDeVie() != null)
            mdphAdultRequest.setChoixProjetDeVie(fr.cg95.cvq.business.request.social.ChoixProjetDeVieType.forString(mdphAdultRequestXml.getChoixProjetDeVie().toString()));
        else
            mdphAdultRequest.setChoixProjetDeVie(fr.cg95.cvq.business.request.social.ChoixProjetDeVieType.getDefaultChoixProjetDeVieType());
      
        if (mdphAdultRequestXml.getChoixTypeDemandeAllocEtCompl() != null)
            mdphAdultRequest.setChoixTypeDemandeAllocEtCompl(MarChoixDemandeAllocEtCompl.xmlToModel(mdphAdultRequestXml.getChoixTypeDemandeAllocEtCompl()));
      
        mdphAdultRequest.setConseilleProjetDeVie(mdphAdultRequestXml.getConseilleProjetDeVie());
      
        calendar = mdphAdultRequestXml.getDateArriveeFrance();
        if (calendar != null) {
            mdphAdultRequest.setDateArriveeFrance(calendar.getTime());
        }
      
        calendar = mdphAdultRequestXml.getDateDebutRevenuRecu();
        if (calendar != null) {
            mdphAdultRequest.setDateDebutRevenuRecu(calendar.getTime());
        }
      
        calendar = mdphAdultRequestXml.getDateEntreeSouhaitee();
        if (calendar != null) {
            mdphAdultRequest.setDateEntreeSouhaitee(calendar.getTime());
        }
      
        calendar = mdphAdultRequestXml.getDateFinRevenuRecu();
        if (calendar != null) {
            mdphAdultRequest.setDateFinRevenuRecu(calendar.getTime());
        }
      
        calendar = mdphAdultRequestXml.getDateNaissanceAidant();
        if (calendar != null) {
            mdphAdultRequest.setDateNaissanceAidant(calendar.getTime());
        }
      
        calendar = mdphAdultRequestXml.getDateNaissanceSujet();
        if (calendar != null) {
            mdphAdultRequest.setDateNaissanceSujet(calendar.getTime());
        }
      
        calendar = mdphAdultRequestXml.getDateSituationFamiliale();
        if (calendar != null) {
            mdphAdultRequest.setDateSituationFamiliale(calendar.getTime());
        }
      
        mdphAdultRequest.setDemandeLibreScolaire(mdphAdultRequestXml.getDemandeLibreScolaire());
      
        if (mdphAdultRequestXml.getDomiciliationAidant() != null)
            mdphAdultRequest.setDomiciliationAidant(Address.xmlToModel(mdphAdultRequestXml.getDomiciliationAidant()));
      
        if (mdphAdultRequestXml.getDomiciliationEtablissement() != null)
            mdphAdultRequest.setDomiciliationEtablissement(Address.xmlToModel(mdphAdultRequestXml.getDomiciliationEtablissement()));
      
        if (mdphAdultRequestXml.getDomiciliationOrganismePayeur() != null)
            mdphAdultRequest.setDomiciliationOrganismePayeur(Address.xmlToModel(mdphAdultRequestXml.getDomiciliationOrganismePayeur()));
      
        mdphAdultRequest.setEmailResponsableLegal(mdphAdultRequestXml.getEmailResponsableLegal());
      
        mdphAdultRequest.setExpressionProjetDeVie(mdphAdultRequestXml.getExpressionProjetDeVie());
      
        mdphAdultRequest.setFaxResponsableLegal(mdphAdultRequestXml.getFaxResponsableLegal());
      
        mdphAdultRequest.setFaxSujet(mdphAdultRequestXml.getFaxSujet());
      
        if (mdphAdultRequestXml.getIdentiteConjoint() != null)
            mdphAdultRequest.setIdentiteConjoint(MarConjointIdentite.xmlToModel(mdphAdultRequestXml.getIdentiteConjoint()));
      
        mdphAdultRequest.setLienParenteAidant(mdphAdultRequestXml.getLienParenteAidant());
      
        if (mdphAdultRequestXml.getLieuNaissanceSujet() != null)
            mdphAdultRequest.setLieuNaissanceSujet(MarBirthPlace.xmlToModel(mdphAdultRequestXml.getLieuNaissanceSujet()));
      
        if (mdphAdultRequestXml.getNationalite() != null)
            mdphAdultRequest.setNationalite(fr.cg95.cvq.business.request.social.NationaliteAvecSuisseType.forString(mdphAdultRequestXml.getNationalite().toString()));
        else
            mdphAdultRequest.setNationalite(fr.cg95.cvq.business.request.social.NationaliteAvecSuisseType.getDefaultNationaliteAvecSuisseType());
      
        mdphAdultRequest.setNomAidant(mdphAdultRequestXml.getNomAidant());
      
        mdphAdultRequest.setNomAllocataire(mdphAdultRequestXml.getNomAllocataire());
      
        mdphAdultRequest.setNomEtablissement(mdphAdultRequestXml.getNomEtablissement());
      
        mdphAdultRequest.setNomOrganismePayeur(mdphAdultRequestXml.getNomOrganismePayeur());
      
        mdphAdultRequest.setNomOrganismeSecuriteSociale(mdphAdultRequestXml.getNomOrganismeSecuriteSociale());
      
        mdphAdultRequest.setNomResponsableLegal(mdphAdultRequestXml.getNomResponsableLegal());
      
        mdphAdultRequest.setNombreEnfantsACharge(mdphAdultRequestXml.getNombreEnfantsACharge());
      
        mdphAdultRequest.setNumeroAllocataire(mdphAdultRequestXml.getNumeroAllocataire());
      
        mdphAdultRequest.setNumeroSecuriteSocialeSujet(mdphAdultRequestXml.getNumeroSecuriteSocialeSujet());
      
        if (mdphAdultRequestXml.getOrganismePayeur() != null)
            mdphAdultRequest.setOrganismePayeur(fr.cg95.cvq.business.request.social.OrganismePayeurType.forString(mdphAdultRequestXml.getOrganismePayeur().toString()));
        else
            mdphAdultRequest.setOrganismePayeur(fr.cg95.cvq.business.request.social.OrganismePayeurType.getDefaultOrganismePayeurType());
      
        mdphAdultRequest.setOrientationReclassement(Boolean.valueOf(mdphAdultRequestXml.getOrientationReclassement()));
      
        if (mdphAdultRequestXml.getOrientationSouhaitee() != null)
            mdphAdultRequest.setOrientationSouhaitee(fr.cg95.cvq.business.request.social.OrientationSouhaiteeType.forString(mdphAdultRequestXml.getOrientationSouhaitee().toString()));
        else
            mdphAdultRequest.setOrientationSouhaitee(fr.cg95.cvq.business.request.social.OrientationSouhaiteeType.getDefaultOrientationSouhaiteeType());
      
        if (mdphAdultRequestXml.getPrecedentDossierMdph() != null)
            mdphAdultRequest.setPrecedentDossierMdph(MarPrecedentDossierMdph.xmlToModel(mdphAdultRequestXml.getPrecedentDossierMdph()));
      
        if (mdphAdultRequestXml.getPrecedentsRevenusRecus() != null)
            mdphAdultRequest.setPrecedentsRevenusRecus(fr.cg95.cvq.business.request.social.PrecedentsRevenusRecusType.forString(mdphAdultRequestXml.getPrecedentsRevenusRecus().toString()));
        else
            mdphAdultRequest.setPrecedentsRevenusRecus(fr.cg95.cvq.business.request.social.PrecedentsRevenusRecusType.getDefaultPrecedentsRevenusRecusType());
      
        mdphAdultRequest.setPrecisionAutre(mdphAdultRequestXml.getPrecisionAutre());
      
        mdphAdultRequest.setPrecisionLogementAutre(mdphAdultRequestXml.getPrecisionLogementAutre());
      
        if (mdphAdultRequestXml.getPrecisionPreferenceEtablissementOuService() != null)
            mdphAdultRequest.setPrecisionPreferenceEtablissementOuService(MarPrecisionPreferenceEtablissementOuService.xmlToModel(mdphAdultRequestXml.getPrecisionPreferenceEtablissementOuService()));
      
        if (mdphAdultRequestXml.getPrecisionPreferencesEtablissementOuService() != null)
            mdphAdultRequest.setPrecisionPreferencesEtablissementOuService(MarPreferenceEtablissementOuServiceScolaire.xmlToModel(mdphAdultRequestXml.getPrecisionPreferencesEtablissementOuService()));
      
        mdphAdultRequest.setPrecisionRevenuRecu(mdphAdultRequestXml.getPrecisionRevenuRecu());
      
        mdphAdultRequest.setPrecisionSiDomicileAupresOrganisme(mdphAdultRequestXml.getPrecisionSiDomicileAupresOrganisme());
      
        mdphAdultRequest.setPreferenceEtablissementOuService(Boolean.valueOf(mdphAdultRequestXml.getPreferenceEtablissementOuService()));
      
        mdphAdultRequest.setPreferencesEtablissementOuService(Boolean.valueOf(mdphAdultRequestXml.getPreferencesEtablissementOuService()));
      
        mdphAdultRequest.setPrenomAllocataire(mdphAdultRequestXml.getPrenomAllocataire());
      
        mdphAdultRequest.setPrimeReclassement(Boolean.valueOf(mdphAdultRequestXml.getPrimeReclassement()));
      
        if (mdphAdultRequestXml.getRepresentantLegal() != null)
            mdphAdultRequest.setRepresentantLegal(fr.cg95.cvq.business.request.social.RepresentantLegalType.forString(mdphAdultRequestXml.getRepresentantLegal().toString()));
        else
            mdphAdultRequest.setRepresentantLegal(fr.cg95.cvq.business.request.social.RepresentantLegalType.getDefaultRepresentantLegalType());
      
        mdphAdultRequest.setRqth(Boolean.valueOf(mdphAdultRequestXml.getRqth()));
      
        if (mdphAdultRequestXml.getSituationActuelle() != null)
            mdphAdultRequest.setSituationActuelle(fr.cg95.cvq.business.request.social.SituationActuelleType.forString(mdphAdultRequestXml.getSituationActuelle().toString()));
        else
            mdphAdultRequest.setSituationActuelle(fr.cg95.cvq.business.request.social.SituationActuelleType.getDefaultSituationActuelleType());
      
        mdphAdultRequest.setSituationActuellePrecision(mdphAdultRequestXml.getSituationActuellePrecision());
      
        if (mdphAdultRequestXml.getSituationMaritale() != null)
            mdphAdultRequest.setSituationMaritale(fr.cg95.cvq.business.request.social.SituationFamilialeType.forString(mdphAdultRequestXml.getSituationMaritale().toString()));
        else
            mdphAdultRequest.setSituationMaritale(fr.cg95.cvq.business.request.social.SituationFamilialeType.getDefaultSituationFamilialeType());
      
        if (mdphAdultRequestXml.getSituationParticuliere() != null)
            mdphAdultRequest.setSituationParticuliere(fr.cg95.cvq.business.request.social.SituationAutreType.forString(mdphAdultRequestXml.getSituationParticuliere().toString()));
        else
            mdphAdultRequest.setSituationParticuliere(fr.cg95.cvq.business.request.social.SituationAutreType.getDefaultSituationAutreType());
      
        if (mdphAdultRequestXml.getSituationProfessionnelleConjoint() != null)
            mdphAdultRequest.setSituationProfessionnelleConjoint(fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType.forString(mdphAdultRequestXml.getSituationProfessionnelleConjoint().toString()));
        else
            mdphAdultRequest.setSituationProfessionnelleConjoint(fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType.getDefaultChoixSituationProfessionnelleType());
      
        if (mdphAdultRequestXml.getSituationProfessionnelleConjointAutre() != null)
            mdphAdultRequest.setSituationProfessionnelleConjointAutre(MarSituationProfessionnelleAutre.xmlToModel(mdphAdultRequestXml.getSituationProfessionnelleConjointAutre()));
      
        if (mdphAdultRequestXml.getSituationProfessionnelleConjointBeneficiairePension() != null)
            mdphAdultRequest.setSituationProfessionnelleConjointBeneficiairePension(MarSituationProfessionnelleBeneficiairePension.xmlToModel(mdphAdultRequestXml.getSituationProfessionnelleConjointBeneficiairePension()));
      
        if (mdphAdultRequestXml.getSituationProfessionnelleConjointDemandeurEmploi() != null)
            mdphAdultRequest.setSituationProfessionnelleConjointDemandeurEmploi(MarSituationProfessionnelleDemandeurEmploi.xmlToModel(mdphAdultRequestXml.getSituationProfessionnelleConjointDemandeurEmploi()));
      
        if (mdphAdultRequestXml.getSituationProfessionnelleConjointNonSalarie() != null)
            mdphAdultRequest.setSituationProfessionnelleConjointNonSalarie(MarSituationProfessionnelleNonSalarie.xmlToModel(mdphAdultRequestXml.getSituationProfessionnelleConjointNonSalarie()));
      
        if (mdphAdultRequestXml.getSituationProfessionnelleConjointRetraite() != null)
            mdphAdultRequest.setSituationProfessionnelleConjointRetraite(MarSituationProfessionnelleRetraite.xmlToModel(mdphAdultRequestXml.getSituationProfessionnelleConjointRetraite()));
      
        if (mdphAdultRequestXml.getSituationProfessionnelleConjointSalarie() != null)
            mdphAdultRequest.setSituationProfessionnelleConjointSalarie(MarSituationProfessionnelleSalarie.xmlToModel(mdphAdultRequestXml.getSituationProfessionnelleConjointSalarie()));
      
        if (mdphAdultRequestXml.getSituationProfessionnelleConjointStagiaire() != null)
            mdphAdultRequest.setSituationProfessionnelleConjointStagiaire(MarSituationProfessionnelleStagiaire.xmlToModel(mdphAdultRequestXml.getSituationProfessionnelleConjointStagiaire()));
      
        if (mdphAdultRequestXml.getSituationProfessionnelleVous() != null)
            mdphAdultRequest.setSituationProfessionnelleVous(fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType.forString(mdphAdultRequestXml.getSituationProfessionnelleVous().toString()));
        else
            mdphAdultRequest.setSituationProfessionnelleVous(fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType.getDefaultChoixSituationProfessionnelleType());
      
        if (mdphAdultRequestXml.getSituationProfessionnelleVousAutre() != null)
            mdphAdultRequest.setSituationProfessionnelleVousAutre(MarSituationProfessionnelleAutre.xmlToModel(mdphAdultRequestXml.getSituationProfessionnelleVousAutre()));
      
        if (mdphAdultRequestXml.getSituationProfessionnelleVousBeneficiairePension() != null)
            mdphAdultRequest.setSituationProfessionnelleVousBeneficiairePension(MarSituationProfessionnelleBeneficiairePension.xmlToModel(mdphAdultRequestXml.getSituationProfessionnelleVousBeneficiairePension()));
      
        if (mdphAdultRequestXml.getSituationProfessionnelleVousDemandeurEmploi() != null)
            mdphAdultRequest.setSituationProfessionnelleVousDemandeurEmploi(MarSituationProfessionnelleDemandeurEmploi.xmlToModel(mdphAdultRequestXml.getSituationProfessionnelleVousDemandeurEmploi()));
      
        if (mdphAdultRequestXml.getSituationProfessionnelleVousNonSalarie() != null)
            mdphAdultRequest.setSituationProfessionnelleVousNonSalarie(MarSituationProfessionnelleNonSalarie.xmlToModel(mdphAdultRequestXml.getSituationProfessionnelleVousNonSalarie()));
      
        if (mdphAdultRequestXml.getSituationProfessionnelleVousRetraite() != null)
            mdphAdultRequest.setSituationProfessionnelleVousRetraite(MarSituationProfessionnelleRetraite.xmlToModel(mdphAdultRequestXml.getSituationProfessionnelleVousRetraite()));
      
        if (mdphAdultRequestXml.getSituationProfessionnelleVousSalarie() != null)
            mdphAdultRequest.setSituationProfessionnelleVousSalarie(MarSituationProfessionnelleSalarie.xmlToModel(mdphAdultRequestXml.getSituationProfessionnelleVousSalarie()));
      
        if (mdphAdultRequestXml.getSituationProfessionnelleVousStagiaire() != null)
            mdphAdultRequest.setSituationProfessionnelleVousStagiaire(MarSituationProfessionnelleStagiaire.xmlToModel(mdphAdultRequestXml.getSituationProfessionnelleVousStagiaire()));
      
        mdphAdultRequest.setTelResponsableLegal(mdphAdultRequestXml.getTelResponsableLegal());
      
        if (mdphAdultRequestXml.getTypeLogement() != null)
            mdphAdultRequest.setTypeLogement(fr.cg95.cvq.business.request.social.LogementType.forString(mdphAdultRequestXml.getTypeLogement().toString()));
        else
            mdphAdultRequest.setTypeLogement(fr.cg95.cvq.business.request.social.LogementType.getDefaultLogementType());
      
        return mdphAdultRequest;
    }

    @Override
    public MdphAdultRequest clone() {
        MdphAdultRequest clone = new MdphAdultRequest(getRequestData().clone(), mdphAdultRequestData.clone());
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("subject", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("representantLegal", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("organismePrestationFamiliale", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("situationFamiliale", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("situationProfessionnelle", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("autreSituation", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("projetDeVie", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("demandeParcoursScolaireEtFormation", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("demandeCartes", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("demandePrestationCompensation", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("affilitationAidant", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("demandeAllocationEtComplementRessources", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("demandeProfessionnelle", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("demandeOrientationMedicoSociale", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("document", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("validation", stepState);
        
        return clone;
    }

  
    public final void setAdresseResponsableLegal(final fr.cg95.cvq.business.users.Address adresseResponsableLegal) {
        mdphAdultRequestData.setAdresseResponsableLegal(adresseResponsableLegal);
    }

    
    public final fr.cg95.cvq.business.users.Address getAdresseResponsableLegal() {
        return mdphAdultRequestData.getAdresseResponsableLegal();
    }
  
    public final void setAllocationPersonnaliseeAutonomie(final Boolean allocationPersonnaliseeAutonomie) {
        mdphAdultRequestData.setAllocationPersonnaliseeAutonomie(allocationPersonnaliseeAutonomie);
    }

    
    public final Boolean getAllocationPersonnaliseeAutonomie() {
        return mdphAdultRequestData.getAllocationPersonnaliseeAutonomie();
    }
  
    public final void setAutre(final Boolean autre) {
        mdphAdultRequestData.setAutre(autre);
    }

    
    public final Boolean getAutre() {
        return mdphAdultRequestData.getAutre();
    }
  
    public final void setBesoinsDemandePCH(final fr.cg95.cvq.business.request.social.MarBesoinsDemandePch besoinsDemandePCH) {
        mdphAdultRequestData.setBesoinsDemandePCH(besoinsDemandePCH);
    }

    
    public final fr.cg95.cvq.business.request.social.MarBesoinsDemandePch getBesoinsDemandePCH() {
        return mdphAdultRequestData.getBesoinsDemandePCH();
    }
  
    public final void setCarteAccompagnement(final Boolean carteAccompagnement) {
        mdphAdultRequestData.setCarteAccompagnement(carteAccompagnement);
    }

    
    public final Boolean getCarteAccompagnement() {
        return mdphAdultRequestData.getCarteAccompagnement();
    }
  
    public final void setCarteInvalidite(final Boolean carteInvalidite) {
        mdphAdultRequestData.setCarteInvalidite(carteInvalidite);
    }

    
    public final Boolean getCarteInvalidite() {
        return mdphAdultRequestData.getCarteInvalidite();
    }
  
    public final void setCarteStationnement(final Boolean carteStationnement) {
        mdphAdultRequestData.setCarteStationnement(carteStationnement);
    }

    
    public final Boolean getCarteStationnement() {
        return mdphAdultRequestData.getCarteStationnement();
    }
  
    public final void setChoixOrientationReclassement(final fr.cg95.cvq.business.request.social.ChoixOrientationReclassementType choixOrientationReclassement) {
        mdphAdultRequestData.setChoixOrientationReclassement(choixOrientationReclassement);
    }

    
    public final fr.cg95.cvq.business.request.social.ChoixOrientationReclassementType getChoixOrientationReclassement() {
        return mdphAdultRequestData.getChoixOrientationReclassement();
    }
  
    public final void setChoixPrestationCompensation(final fr.cg95.cvq.business.request.social.ChoixPrestationCompensationType choixPrestationCompensation) {
        mdphAdultRequestData.setChoixPrestationCompensation(choixPrestationCompensation);
    }

    
    public final fr.cg95.cvq.business.request.social.ChoixPrestationCompensationType getChoixPrestationCompensation() {
        return mdphAdultRequestData.getChoixPrestationCompensation();
    }
  
    public final void setChoixProjetDeVie(final fr.cg95.cvq.business.request.social.ChoixProjetDeVieType choixProjetDeVie) {
        mdphAdultRequestData.setChoixProjetDeVie(choixProjetDeVie);
    }

    
    public final fr.cg95.cvq.business.request.social.ChoixProjetDeVieType getChoixProjetDeVie() {
        return mdphAdultRequestData.getChoixProjetDeVie();
    }
  
    public final void setChoixTypeDemandeAllocEtCompl(final fr.cg95.cvq.business.request.social.MarChoixDemandeAllocEtCompl choixTypeDemandeAllocEtCompl) {
        mdphAdultRequestData.setChoixTypeDemandeAllocEtCompl(choixTypeDemandeAllocEtCompl);
    }

    
    public final fr.cg95.cvq.business.request.social.MarChoixDemandeAllocEtCompl getChoixTypeDemandeAllocEtCompl() {
        return mdphAdultRequestData.getChoixTypeDemandeAllocEtCompl();
    }
  
    public final void setConseilleProjetDeVie(final String conseilleProjetDeVie) {
        mdphAdultRequestData.setConseilleProjetDeVie(conseilleProjetDeVie);
    }

    
    public final String getConseilleProjetDeVie() {
        return mdphAdultRequestData.getConseilleProjetDeVie();
    }
  
    public final void setDateArriveeFrance(final java.util.Date dateArriveeFrance) {
        mdphAdultRequestData.setDateArriveeFrance(dateArriveeFrance);
    }

    
    public final java.util.Date getDateArriveeFrance() {
        return mdphAdultRequestData.getDateArriveeFrance();
    }
  
    public final void setDateDebutRevenuRecu(final java.util.Date dateDebutRevenuRecu) {
        mdphAdultRequestData.setDateDebutRevenuRecu(dateDebutRevenuRecu);
    }

    
    public final java.util.Date getDateDebutRevenuRecu() {
        return mdphAdultRequestData.getDateDebutRevenuRecu();
    }
  
    public final void setDateEntreeSouhaitee(final java.util.Date dateEntreeSouhaitee) {
        mdphAdultRequestData.setDateEntreeSouhaitee(dateEntreeSouhaitee);
    }

    
    public final java.util.Date getDateEntreeSouhaitee() {
        return mdphAdultRequestData.getDateEntreeSouhaitee();
    }
  
    public final void setDateFinRevenuRecu(final java.util.Date dateFinRevenuRecu) {
        mdphAdultRequestData.setDateFinRevenuRecu(dateFinRevenuRecu);
    }

    
    public final java.util.Date getDateFinRevenuRecu() {
        return mdphAdultRequestData.getDateFinRevenuRecu();
    }
  
    public final void setDateNaissanceAidant(final java.util.Date dateNaissanceAidant) {
        mdphAdultRequestData.setDateNaissanceAidant(dateNaissanceAidant);
    }

    
    public final java.util.Date getDateNaissanceAidant() {
        return mdphAdultRequestData.getDateNaissanceAidant();
    }
  
    public final void setDateNaissanceSujet(final java.util.Date dateNaissanceSujet) {
        mdphAdultRequestData.setDateNaissanceSujet(dateNaissanceSujet);
    }

    
    public final java.util.Date getDateNaissanceSujet() {
        return mdphAdultRequestData.getDateNaissanceSujet();
    }
  
    public final void setDateSituationFamiliale(final java.util.Date dateSituationFamiliale) {
        mdphAdultRequestData.setDateSituationFamiliale(dateSituationFamiliale);
    }

    
    public final java.util.Date getDateSituationFamiliale() {
        return mdphAdultRequestData.getDateSituationFamiliale();
    }
  
    public final void setDemandeLibreScolaire(final String demandeLibreScolaire) {
        mdphAdultRequestData.setDemandeLibreScolaire(demandeLibreScolaire);
    }

    
    public final String getDemandeLibreScolaire() {
        return mdphAdultRequestData.getDemandeLibreScolaire();
    }
  
    public final void setDomiciliationAidant(final fr.cg95.cvq.business.users.Address domiciliationAidant) {
        mdphAdultRequestData.setDomiciliationAidant(domiciliationAidant);
    }

    
    public final fr.cg95.cvq.business.users.Address getDomiciliationAidant() {
        return mdphAdultRequestData.getDomiciliationAidant();
    }
  
    public final void setDomiciliationEtablissement(final fr.cg95.cvq.business.users.Address domiciliationEtablissement) {
        mdphAdultRequestData.setDomiciliationEtablissement(domiciliationEtablissement);
    }

    
    public final fr.cg95.cvq.business.users.Address getDomiciliationEtablissement() {
        return mdphAdultRequestData.getDomiciliationEtablissement();
    }
  
    public final void setDomiciliationOrganismePayeur(final fr.cg95.cvq.business.users.Address domiciliationOrganismePayeur) {
        mdphAdultRequestData.setDomiciliationOrganismePayeur(domiciliationOrganismePayeur);
    }

    
    public final fr.cg95.cvq.business.users.Address getDomiciliationOrganismePayeur() {
        return mdphAdultRequestData.getDomiciliationOrganismePayeur();
    }
  
    public final void setEmailResponsableLegal(final String emailResponsableLegal) {
        mdphAdultRequestData.setEmailResponsableLegal(emailResponsableLegal);
    }

    
    public final String getEmailResponsableLegal() {
        return mdphAdultRequestData.getEmailResponsableLegal();
    }
  
    public final void setExpressionProjetDeVie(final String expressionProjetDeVie) {
        mdphAdultRequestData.setExpressionProjetDeVie(expressionProjetDeVie);
    }

    
    public final String getExpressionProjetDeVie() {
        return mdphAdultRequestData.getExpressionProjetDeVie();
    }
  
    public final void setFaxResponsableLegal(final String faxResponsableLegal) {
        mdphAdultRequestData.setFaxResponsableLegal(faxResponsableLegal);
    }

    
    public final String getFaxResponsableLegal() {
        return mdphAdultRequestData.getFaxResponsableLegal();
    }
  
    public final void setFaxSujet(final String faxSujet) {
        mdphAdultRequestData.setFaxSujet(faxSujet);
    }

    
    public final String getFaxSujet() {
        return mdphAdultRequestData.getFaxSujet();
    }
  
    public final void setIdentiteConjoint(final fr.cg95.cvq.business.request.social.MarConjointIdentite identiteConjoint) {
        mdphAdultRequestData.setIdentiteConjoint(identiteConjoint);
    }

    
    public final fr.cg95.cvq.business.request.social.MarConjointIdentite getIdentiteConjoint() {
        return mdphAdultRequestData.getIdentiteConjoint();
    }
  
    public final void setLienParenteAidant(final String lienParenteAidant) {
        mdphAdultRequestData.setLienParenteAidant(lienParenteAidant);
    }

    
    public final String getLienParenteAidant() {
        return mdphAdultRequestData.getLienParenteAidant();
    }
  
    public final void setLieuNaissanceSujet(final fr.cg95.cvq.business.request.social.MarBirthPlace lieuNaissanceSujet) {
        mdphAdultRequestData.setLieuNaissanceSujet(lieuNaissanceSujet);
    }

    
    public final fr.cg95.cvq.business.request.social.MarBirthPlace getLieuNaissanceSujet() {
        return mdphAdultRequestData.getLieuNaissanceSujet();
    }
  
    public final void setNationalite(final fr.cg95.cvq.business.request.social.NationaliteAvecSuisseType nationalite) {
        mdphAdultRequestData.setNationalite(nationalite);
    }

    
    public final fr.cg95.cvq.business.request.social.NationaliteAvecSuisseType getNationalite() {
        return mdphAdultRequestData.getNationalite();
    }
  
    public final void setNomAidant(final String nomAidant) {
        mdphAdultRequestData.setNomAidant(nomAidant);
    }

    
    public final String getNomAidant() {
        return mdphAdultRequestData.getNomAidant();
    }
  
    public final void setNomAllocataire(final String nomAllocataire) {
        mdphAdultRequestData.setNomAllocataire(nomAllocataire);
    }

    
    public final String getNomAllocataire() {
        return mdphAdultRequestData.getNomAllocataire();
    }
  
    public final void setNomEtablissement(final String nomEtablissement) {
        mdphAdultRequestData.setNomEtablissement(nomEtablissement);
    }

    
    public final String getNomEtablissement() {
        return mdphAdultRequestData.getNomEtablissement();
    }
  
    public final void setNomOrganismePayeur(final String nomOrganismePayeur) {
        mdphAdultRequestData.setNomOrganismePayeur(nomOrganismePayeur);
    }

    
    public final String getNomOrganismePayeur() {
        return mdphAdultRequestData.getNomOrganismePayeur();
    }
  
    public final void setNomOrganismeSecuriteSociale(final String nomOrganismeSecuriteSociale) {
        mdphAdultRequestData.setNomOrganismeSecuriteSociale(nomOrganismeSecuriteSociale);
    }

    
    public final String getNomOrganismeSecuriteSociale() {
        return mdphAdultRequestData.getNomOrganismeSecuriteSociale();
    }
  
    public final void setNomResponsableLegal(final String nomResponsableLegal) {
        mdphAdultRequestData.setNomResponsableLegal(nomResponsableLegal);
    }

    
    public final String getNomResponsableLegal() {
        return mdphAdultRequestData.getNomResponsableLegal();
    }
  
    public final void setNombreEnfantsACharge(final String nombreEnfantsACharge) {
        mdphAdultRequestData.setNombreEnfantsACharge(nombreEnfantsACharge);
    }

    
    public final String getNombreEnfantsACharge() {
        return mdphAdultRequestData.getNombreEnfantsACharge();
    }
  
    public final void setNumeroAllocataire(final String numeroAllocataire) {
        mdphAdultRequestData.setNumeroAllocataire(numeroAllocataire);
    }

    
    public final String getNumeroAllocataire() {
        return mdphAdultRequestData.getNumeroAllocataire();
    }
  
    public final void setNumeroSecuriteSocialeSujet(final String numeroSecuriteSocialeSujet) {
        mdphAdultRequestData.setNumeroSecuriteSocialeSujet(numeroSecuriteSocialeSujet);
    }

    
    public final String getNumeroSecuriteSocialeSujet() {
        return mdphAdultRequestData.getNumeroSecuriteSocialeSujet();
    }
  
    public final void setOrganismePayeur(final fr.cg95.cvq.business.request.social.OrganismePayeurType organismePayeur) {
        mdphAdultRequestData.setOrganismePayeur(organismePayeur);
    }

    
    public final fr.cg95.cvq.business.request.social.OrganismePayeurType getOrganismePayeur() {
        return mdphAdultRequestData.getOrganismePayeur();
    }
  
    public final void setOrientationReclassement(final Boolean orientationReclassement) {
        mdphAdultRequestData.setOrientationReclassement(orientationReclassement);
    }

    
    public final Boolean getOrientationReclassement() {
        return mdphAdultRequestData.getOrientationReclassement();
    }
  
    public final void setOrientationSouhaitee(final fr.cg95.cvq.business.request.social.OrientationSouhaiteeType orientationSouhaitee) {
        mdphAdultRequestData.setOrientationSouhaitee(orientationSouhaitee);
    }

    
    public final fr.cg95.cvq.business.request.social.OrientationSouhaiteeType getOrientationSouhaitee() {
        return mdphAdultRequestData.getOrientationSouhaitee();
    }
  
    public final void setPrecedentDossierMdph(final fr.cg95.cvq.business.request.social.MarPrecedentDossierMdph precedentDossierMdph) {
        mdphAdultRequestData.setPrecedentDossierMdph(precedentDossierMdph);
    }

    
    public final fr.cg95.cvq.business.request.social.MarPrecedentDossierMdph getPrecedentDossierMdph() {
        return mdphAdultRequestData.getPrecedentDossierMdph();
    }
  
    public final void setPrecedentsRevenusRecus(final fr.cg95.cvq.business.request.social.PrecedentsRevenusRecusType precedentsRevenusRecus) {
        mdphAdultRequestData.setPrecedentsRevenusRecus(precedentsRevenusRecus);
    }

    
    public final fr.cg95.cvq.business.request.social.PrecedentsRevenusRecusType getPrecedentsRevenusRecus() {
        return mdphAdultRequestData.getPrecedentsRevenusRecus();
    }
  
    public final void setPrecisionAutre(final String precisionAutre) {
        mdphAdultRequestData.setPrecisionAutre(precisionAutre);
    }

    
    public final String getPrecisionAutre() {
        return mdphAdultRequestData.getPrecisionAutre();
    }
  
    public final void setPrecisionLogementAutre(final String precisionLogementAutre) {
        mdphAdultRequestData.setPrecisionLogementAutre(precisionLogementAutre);
    }

    
    public final String getPrecisionLogementAutre() {
        return mdphAdultRequestData.getPrecisionLogementAutre();
    }
  
    public final void setPrecisionPreferenceEtablissementOuService(final fr.cg95.cvq.business.request.social.MarPrecisionPreferenceEtablissementOuService precisionPreferenceEtablissementOuService) {
        mdphAdultRequestData.setPrecisionPreferenceEtablissementOuService(precisionPreferenceEtablissementOuService);
    }

    
    public final fr.cg95.cvq.business.request.social.MarPrecisionPreferenceEtablissementOuService getPrecisionPreferenceEtablissementOuService() {
        return mdphAdultRequestData.getPrecisionPreferenceEtablissementOuService();
    }
  
    public final void setPrecisionPreferencesEtablissementOuService(final fr.cg95.cvq.business.request.social.MarPreferenceEtablissementOuServiceScolaire precisionPreferencesEtablissementOuService) {
        mdphAdultRequestData.setPrecisionPreferencesEtablissementOuService(precisionPreferencesEtablissementOuService);
    }

    
    public final fr.cg95.cvq.business.request.social.MarPreferenceEtablissementOuServiceScolaire getPrecisionPreferencesEtablissementOuService() {
        return mdphAdultRequestData.getPrecisionPreferencesEtablissementOuService();
    }
  
    public final void setPrecisionRevenuRecu(final String precisionRevenuRecu) {
        mdphAdultRequestData.setPrecisionRevenuRecu(precisionRevenuRecu);
    }

    
    public final String getPrecisionRevenuRecu() {
        return mdphAdultRequestData.getPrecisionRevenuRecu();
    }
  
    public final void setPrecisionSiDomicileAupresOrganisme(final String precisionSiDomicileAupresOrganisme) {
        mdphAdultRequestData.setPrecisionSiDomicileAupresOrganisme(precisionSiDomicileAupresOrganisme);
    }

    
    public final String getPrecisionSiDomicileAupresOrganisme() {
        return mdphAdultRequestData.getPrecisionSiDomicileAupresOrganisme();
    }
  
    public final void setPreferenceEtablissementOuService(final Boolean preferenceEtablissementOuService) {
        mdphAdultRequestData.setPreferenceEtablissementOuService(preferenceEtablissementOuService);
    }

    
    public final Boolean getPreferenceEtablissementOuService() {
        return mdphAdultRequestData.getPreferenceEtablissementOuService();
    }
  
    public final void setPreferencesEtablissementOuService(final Boolean preferencesEtablissementOuService) {
        mdphAdultRequestData.setPreferencesEtablissementOuService(preferencesEtablissementOuService);
    }

    
    public final Boolean getPreferencesEtablissementOuService() {
        return mdphAdultRequestData.getPreferencesEtablissementOuService();
    }
  
    public final void setPrenomAllocataire(final String prenomAllocataire) {
        mdphAdultRequestData.setPrenomAllocataire(prenomAllocataire);
    }

    
    public final String getPrenomAllocataire() {
        return mdphAdultRequestData.getPrenomAllocataire();
    }
  
    public final void setPrimeReclassement(final Boolean primeReclassement) {
        mdphAdultRequestData.setPrimeReclassement(primeReclassement);
    }

    
    public final Boolean getPrimeReclassement() {
        return mdphAdultRequestData.getPrimeReclassement();
    }
  
    public final void setRepresentantLegal(final fr.cg95.cvq.business.request.social.RepresentantLegalType representantLegal) {
        mdphAdultRequestData.setRepresentantLegal(representantLegal);
    }

    
    public final fr.cg95.cvq.business.request.social.RepresentantLegalType getRepresentantLegal() {
        return mdphAdultRequestData.getRepresentantLegal();
    }
  
    public final void setRqth(final Boolean rqth) {
        mdphAdultRequestData.setRqth(rqth);
    }

    
    public final Boolean getRqth() {
        return mdphAdultRequestData.getRqth();
    }
  
    public final void setSituationActuelle(final fr.cg95.cvq.business.request.social.SituationActuelleType situationActuelle) {
        mdphAdultRequestData.setSituationActuelle(situationActuelle);
    }

    
    public final fr.cg95.cvq.business.request.social.SituationActuelleType getSituationActuelle() {
        return mdphAdultRequestData.getSituationActuelle();
    }
  
    public final void setSituationActuellePrecision(final String situationActuellePrecision) {
        mdphAdultRequestData.setSituationActuellePrecision(situationActuellePrecision);
    }

    
    public final String getSituationActuellePrecision() {
        return mdphAdultRequestData.getSituationActuellePrecision();
    }
  
    public final void setSituationMaritale(final fr.cg95.cvq.business.request.social.SituationFamilialeType situationMaritale) {
        mdphAdultRequestData.setSituationMaritale(situationMaritale);
    }

    
    public final fr.cg95.cvq.business.request.social.SituationFamilialeType getSituationMaritale() {
        return mdphAdultRequestData.getSituationMaritale();
    }
  
    public final void setSituationParticuliere(final fr.cg95.cvq.business.request.social.SituationAutreType situationParticuliere) {
        mdphAdultRequestData.setSituationParticuliere(situationParticuliere);
    }

    
    public final fr.cg95.cvq.business.request.social.SituationAutreType getSituationParticuliere() {
        return mdphAdultRequestData.getSituationParticuliere();
    }
  
    public final void setSituationProfessionnelleConjoint(final fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType situationProfessionnelleConjoint) {
        mdphAdultRequestData.setSituationProfessionnelleConjoint(situationProfessionnelleConjoint);
    }

    
    public final fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType getSituationProfessionnelleConjoint() {
        return mdphAdultRequestData.getSituationProfessionnelleConjoint();
    }
  
    public final void setSituationProfessionnelleConjointAutre(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleAutre situationProfessionnelleConjointAutre) {
        mdphAdultRequestData.setSituationProfessionnelleConjointAutre(situationProfessionnelleConjointAutre);
    }

    
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleAutre getSituationProfessionnelleConjointAutre() {
        return mdphAdultRequestData.getSituationProfessionnelleConjointAutre();
    }
  
    public final void setSituationProfessionnelleConjointBeneficiairePension(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleBeneficiairePension situationProfessionnelleConjointBeneficiairePension) {
        mdphAdultRequestData.setSituationProfessionnelleConjointBeneficiairePension(situationProfessionnelleConjointBeneficiairePension);
    }

    
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleBeneficiairePension getSituationProfessionnelleConjointBeneficiairePension() {
        return mdphAdultRequestData.getSituationProfessionnelleConjointBeneficiairePension();
    }
  
    public final void setSituationProfessionnelleConjointDemandeurEmploi(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleDemandeurEmploi situationProfessionnelleConjointDemandeurEmploi) {
        mdphAdultRequestData.setSituationProfessionnelleConjointDemandeurEmploi(situationProfessionnelleConjointDemandeurEmploi);
    }

    
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleDemandeurEmploi getSituationProfessionnelleConjointDemandeurEmploi() {
        return mdphAdultRequestData.getSituationProfessionnelleConjointDemandeurEmploi();
    }
  
    public final void setSituationProfessionnelleConjointNonSalarie(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleNonSalarie situationProfessionnelleConjointNonSalarie) {
        mdphAdultRequestData.setSituationProfessionnelleConjointNonSalarie(situationProfessionnelleConjointNonSalarie);
    }

    
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleNonSalarie getSituationProfessionnelleConjointNonSalarie() {
        return mdphAdultRequestData.getSituationProfessionnelleConjointNonSalarie();
    }
  
    public final void setSituationProfessionnelleConjointRetraite(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleRetraite situationProfessionnelleConjointRetraite) {
        mdphAdultRequestData.setSituationProfessionnelleConjointRetraite(situationProfessionnelleConjointRetraite);
    }

    
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleRetraite getSituationProfessionnelleConjointRetraite() {
        return mdphAdultRequestData.getSituationProfessionnelleConjointRetraite();
    }
  
    public final void setSituationProfessionnelleConjointSalarie(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleSalarie situationProfessionnelleConjointSalarie) {
        mdphAdultRequestData.setSituationProfessionnelleConjointSalarie(situationProfessionnelleConjointSalarie);
    }

    
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleSalarie getSituationProfessionnelleConjointSalarie() {
        return mdphAdultRequestData.getSituationProfessionnelleConjointSalarie();
    }
  
    public final void setSituationProfessionnelleConjointStagiaire(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleStagiaire situationProfessionnelleConjointStagiaire) {
        mdphAdultRequestData.setSituationProfessionnelleConjointStagiaire(situationProfessionnelleConjointStagiaire);
    }

    
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleStagiaire getSituationProfessionnelleConjointStagiaire() {
        return mdphAdultRequestData.getSituationProfessionnelleConjointStagiaire();
    }
  
    public final void setSituationProfessionnelleVous(final fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType situationProfessionnelleVous) {
        mdphAdultRequestData.setSituationProfessionnelleVous(situationProfessionnelleVous);
    }

    
    public final fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType getSituationProfessionnelleVous() {
        return mdphAdultRequestData.getSituationProfessionnelleVous();
    }
  
    public final void setSituationProfessionnelleVousAutre(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleAutre situationProfessionnelleVousAutre) {
        mdphAdultRequestData.setSituationProfessionnelleVousAutre(situationProfessionnelleVousAutre);
    }

    
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleAutre getSituationProfessionnelleVousAutre() {
        return mdphAdultRequestData.getSituationProfessionnelleVousAutre();
    }
  
    public final void setSituationProfessionnelleVousBeneficiairePension(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleBeneficiairePension situationProfessionnelleVousBeneficiairePension) {
        mdphAdultRequestData.setSituationProfessionnelleVousBeneficiairePension(situationProfessionnelleVousBeneficiairePension);
    }

    
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleBeneficiairePension getSituationProfessionnelleVousBeneficiairePension() {
        return mdphAdultRequestData.getSituationProfessionnelleVousBeneficiairePension();
    }
  
    public final void setSituationProfessionnelleVousDemandeurEmploi(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleDemandeurEmploi situationProfessionnelleVousDemandeurEmploi) {
        mdphAdultRequestData.setSituationProfessionnelleVousDemandeurEmploi(situationProfessionnelleVousDemandeurEmploi);
    }

    
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleDemandeurEmploi getSituationProfessionnelleVousDemandeurEmploi() {
        return mdphAdultRequestData.getSituationProfessionnelleVousDemandeurEmploi();
    }
  
    public final void setSituationProfessionnelleVousNonSalarie(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleNonSalarie situationProfessionnelleVousNonSalarie) {
        mdphAdultRequestData.setSituationProfessionnelleVousNonSalarie(situationProfessionnelleVousNonSalarie);
    }

    
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleNonSalarie getSituationProfessionnelleVousNonSalarie() {
        return mdphAdultRequestData.getSituationProfessionnelleVousNonSalarie();
    }
  
    public final void setSituationProfessionnelleVousRetraite(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleRetraite situationProfessionnelleVousRetraite) {
        mdphAdultRequestData.setSituationProfessionnelleVousRetraite(situationProfessionnelleVousRetraite);
    }

    
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleRetraite getSituationProfessionnelleVousRetraite() {
        return mdphAdultRequestData.getSituationProfessionnelleVousRetraite();
    }
  
    public final void setSituationProfessionnelleVousSalarie(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleSalarie situationProfessionnelleVousSalarie) {
        mdphAdultRequestData.setSituationProfessionnelleVousSalarie(situationProfessionnelleVousSalarie);
    }

    
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleSalarie getSituationProfessionnelleVousSalarie() {
        return mdphAdultRequestData.getSituationProfessionnelleVousSalarie();
    }
  
    public final void setSituationProfessionnelleVousStagiaire(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleStagiaire situationProfessionnelleVousStagiaire) {
        mdphAdultRequestData.setSituationProfessionnelleVousStagiaire(situationProfessionnelleVousStagiaire);
    }

    
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleStagiaire getSituationProfessionnelleVousStagiaire() {
        return mdphAdultRequestData.getSituationProfessionnelleVousStagiaire();
    }
  
    public final void setTelResponsableLegal(final String telResponsableLegal) {
        mdphAdultRequestData.setTelResponsableLegal(telResponsableLegal);
    }

    
    public final String getTelResponsableLegal() {
        return mdphAdultRequestData.getTelResponsableLegal();
    }
  
    public final void setTypeLogement(final fr.cg95.cvq.business.request.social.LogementType typeLogement) {
        mdphAdultRequestData.setTypeLogement(typeLogement);
    }

    
    public final fr.cg95.cvq.business.request.social.LogementType getTypeLogement() {
        return mdphAdultRequestData.getTypeLogement();
    }
  
}
