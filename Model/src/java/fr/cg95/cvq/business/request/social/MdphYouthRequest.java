
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
public class MdphYouthRequest extends Request implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions = MdphYouthRequestData.conditions;

    @AssertValid(message = "")
    private MdphYouthRequestData mdphYouthRequestData;

    public MdphYouthRequest(RequestData requestData, MdphYouthRequestData mdphYouthRequestData) {
        super(requestData);
        this.mdphYouthRequestData = mdphYouthRequestData;
    }

    public MdphYouthRequest() {
        super();
        this.mdphYouthRequestData = new MdphYouthRequestData();
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("subject", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("autoriteParentale", stepState);
        
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
          getStepStates().put("allocationEducationEnfantHandicape", stepState);
        
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
    public MdphYouthRequestData getSpecificData() {
        return mdphYouthRequestData;
    }

    /**
     * Reserved for RequestDAO !
     */
    public void setSpecificData(MdphYouthRequestData mdphYouthRequestData) {
        this.mdphYouthRequestData = mdphYouthRequestData;
    }

    @Override
    public final String modelToXmlString() {
        MdphYouthRequestDocument object = this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    @Override
    public final MdphYouthRequestDocument modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        Date date = null;
        MdphYouthRequestDocument mdphYouthRequestDoc = MdphYouthRequestDocument.Factory.newInstance();
        MdphYouthRequestDocument.MdphYouthRequest mdphYouthRequest = mdphYouthRequestDoc.addNewMdphYouthRequest();
        super.fillCommonXmlInfo(mdphYouthRequest);
        int i = 0;
        
        if (getAllocationPersonnaliseeAutonomie() != null)
            mdphYouthRequest.setAllocationPersonnaliseeAutonomie(getAllocationPersonnaliseeAutonomie().booleanValue());
      
        if (getAutoriteParentaleLesDeuxMere() != null)
            mdphYouthRequest.setAutoriteParentaleLesDeuxMere(getAutoriteParentaleLesDeuxMere().modelToXml());
      
        if (getAutoriteParentaleLesDeuxPere() != null)
            mdphYouthRequest.setAutoriteParentaleLesDeuxPere(getAutoriteParentaleLesDeuxPere().modelToXml());
      
        if (getAutoriteParentaleMere() != null)
            mdphYouthRequest.setAutoriteParentaleMere(getAutoriteParentaleMere().modelToXml());
      
        if (getAutoriteParentalePere() != null)
            mdphYouthRequest.setAutoriteParentalePere(getAutoriteParentalePere().modelToXml());
      
        if (getBesoinsDemandePCH() != null)
            mdphYouthRequest.setBesoinsDemandePCH(getBesoinsDemandePCH().modelToXml());
      
        if (getCarteAccompagnement() != null)
            mdphYouthRequest.setCarteAccompagnement(getCarteAccompagnement().booleanValue());
      
        if (getCarteInvalidite() != null)
            mdphYouthRequest.setCarteInvalidite(getCarteInvalidite().booleanValue());
      
        if (getCarteStationnement() != null)
            mdphYouthRequest.setCarteStationnement(getCarteStationnement().booleanValue());
      
        if (getChoixPrestationCompensation() != null)
            mdphYouthRequest.setChoixPrestationCompensation(fr.cg95.cvq.xml.request.social.MyrChoixPrestationCompensationType.Enum.forString(getChoixPrestationCompensation().getLegacyLabel()));
      
        if (getChoixProjetDeVie() != null)
            mdphYouthRequest.setChoixProjetDeVie(fr.cg95.cvq.xml.request.social.MyrChoixProjetDeVieType.Enum.forString(getChoixProjetDeVie().getLegacyLabel()));
      
        mdphYouthRequest.setConseilleProjetDeVie(getConseilleProjetDeVie());
      
        date = getDateArriveeFrance();
        if (date != null) {
            calendar.setTime(date);
            mdphYouthRequest.setDateArriveeFrance(calendar);
        }
      
        date = getDateNaissanceSujet();
        if (date != null) {
            calendar.setTime(date);
            mdphYouthRequest.setDateNaissanceSujet(calendar);
        }
      
        date = getDateSituationFamiliale();
        if (date != null) {
            calendar.setTime(date);
            mdphYouthRequest.setDateSituationFamiliale(calendar);
        }
      
        mdphYouthRequest.setDemandeLibreScolaire(getDemandeLibreScolaire());
      
        if (getDeteneurAutoriteParentale() != null)
            mdphYouthRequest.setDeteneurAutoriteParentale(fr.cg95.cvq.xml.request.social.DeteneurAutoriteParentaleType.Enum.forString(getDeteneurAutoriteParentale().getLegacyLabel()));
      
        if (getDomiciliationEtablissement() != null)
            mdphYouthRequest.setDomiciliationEtablissement(getDomiciliationEtablissement().modelToXml());
      
        if (getDomiciliationOrganismePayeur() != null)
            mdphYouthRequest.setDomiciliationOrganismePayeur(getDomiciliationOrganismePayeur().modelToXml());
      
        date = getEnInternatDepuisLe();
        if (date != null) {
            calendar.setTime(date);
            mdphYouthRequest.setEnInternatDepuisLe(calendar);
        }
      
        if (getEnfantEnInternat() != null)
            mdphYouthRequest.setEnfantEnInternat(getEnfantEnInternat().booleanValue());
      
        mdphYouthRequest.setExpressionProjetDeVie(getExpressionProjetDeVie());
      
        mdphYouthRequest.setFaxSujet(getFaxSujet());
      
        if (getFraisSejourPrisEnCharge() != null)
            mdphYouthRequest.setFraisSejourPrisEnCharge(getFraisSejourPrisEnCharge().booleanValue());
      
        i = 0;
        if (getFraisSuppLiesHandicap() != null) {
            fr.cg95.cvq.xml.request.social.MyrFraisSuppLiesHandicapType[] fraisSuppLiesHandicapTypeTab = new fr.cg95.cvq.xml.request.social.MyrFraisSuppLiesHandicapType[getFraisSuppLiesHandicap().size()];
            for (MyrFraisSuppLiesHandicap object : getFraisSuppLiesHandicap()) {
              fraisSuppLiesHandicapTypeTab[i++] = object.modelToXml();
            }
            mdphYouthRequest.setFraisSuppLiesHandicapArray(fraisSuppLiesHandicapTypeTab);
        }
      
        if (getIdentiteConjoint() != null)
            mdphYouthRequest.setIdentiteConjoint(getIdentiteConjoint().modelToXml());
      
        if (getInformationAutreDeteneurAutoriteParentale() != null)
            mdphYouthRequest.setInformationAutreDeteneurAutoriteParentale(getInformationAutreDeteneurAutoriteParentale().modelToXml());
      
        if (getLieuNaissanceSujet() != null)
            mdphYouthRequest.setLieuNaissanceSujet(getLieuNaissanceSujet().modelToXml());
      
        if (getNationalite() != null)
            mdphYouthRequest.setNationalite(fr.cg95.cvq.xml.request.social.MyrNationaliteAvecSuisseType.Enum.forString(getNationalite().getLegacyLabel()));
      
        mdphYouthRequest.setNomAllocataire(getNomAllocataire());
      
        mdphYouthRequest.setNomEtablissement(getNomEtablissement());
      
        mdphYouthRequest.setNomOrganismePayeur(getNomOrganismePayeur());
      
        mdphYouthRequest.setNomOrganismeSecuriteSociale(getNomOrganismeSecuriteSociale());
      
        mdphYouthRequest.setNombreEnfantsACharge(getNombreEnfantsACharge());
      
        mdphYouthRequest.setNumeroAllocataire(getNumeroAllocataire());
      
        mdphYouthRequest.setNumeroSecuriteSocialeSujet(getNumeroSecuriteSocialeSujet());
      
        if (getOrganismePayeur() != null)
            mdphYouthRequest.setOrganismePayeur(fr.cg95.cvq.xml.request.social.MyrOrganismePayeurType.Enum.forString(getOrganismePayeur().getLegacyLabel()));
      
        if (getPrecedentDossierMdph() != null)
            mdphYouthRequest.setPrecedentDossierMdph(getPrecedentDossierMdph().modelToXml());
      
        mdphYouthRequest.setPrecisionAutre(getPrecisionAutre());
      
        mdphYouthRequest.setPrecisionLogementAutre(getPrecisionLogementAutre());
      
        if (getPrecisionPreferencesEtablissementOuService() != null)
            mdphYouthRequest.setPrecisionPreferencesEtablissementOuService(getPrecisionPreferencesEtablissementOuService().modelToXml());
      
        mdphYouthRequest.setPrecisionSiDomicileAupresOrganisme(getPrecisionSiDomicileAupresOrganisme());
      
        if (getPreferencesEtablissementOuService() != null)
            mdphYouthRequest.setPreferencesEtablissementOuService(getPreferencesEtablissementOuService().booleanValue());
      
        mdphYouthRequest.setPrenomAllocataire(getPrenomAllocataire());
      
        if (getPresencePersonneAupresEnfant() != null)
            mdphYouthRequest.setPresencePersonneAupresEnfant(getPresencePersonneAupresEnfant().modelToXml());
      
        if (getSituationMaritale() != null)
            mdphYouthRequest.setSituationMaritale(fr.cg95.cvq.xml.request.social.MyrSituationFamilialeType.Enum.forString(getSituationMaritale().getLegacyLabel()));
      
        if (getSituationParticuliere() != null)
            mdphYouthRequest.setSituationParticuliere(fr.cg95.cvq.xml.request.social.MyrSituationAutreType.Enum.forString(getSituationParticuliere().getLegacyLabel()));
      
        if (getSituationProfessionnelleConjoint() != null)
            mdphYouthRequest.setSituationProfessionnelleConjoint(fr.cg95.cvq.xml.request.social.MyrChoixSituationProfessionnelleType.Enum.forString(getSituationProfessionnelleConjoint().getLegacyLabel()));
      
        if (getSituationProfessionnelleConjointAutre() != null)
            mdphYouthRequest.setSituationProfessionnelleConjointAutre(getSituationProfessionnelleConjointAutre().modelToXml());
      
        if (getSituationProfessionnelleConjointBeneficiairePension() != null)
            mdphYouthRequest.setSituationProfessionnelleConjointBeneficiairePension(getSituationProfessionnelleConjointBeneficiairePension().modelToXml());
      
        if (getSituationProfessionnelleConjointDemandeurEmploi() != null)
            mdphYouthRequest.setSituationProfessionnelleConjointDemandeurEmploi(getSituationProfessionnelleConjointDemandeurEmploi().modelToXml());
      
        if (getSituationProfessionnelleConjointNonSalarie() != null)
            mdphYouthRequest.setSituationProfessionnelleConjointNonSalarie(getSituationProfessionnelleConjointNonSalarie().modelToXml());
      
        if (getSituationProfessionnelleConjointRetraite() != null)
            mdphYouthRequest.setSituationProfessionnelleConjointRetraite(getSituationProfessionnelleConjointRetraite().modelToXml());
      
        if (getSituationProfessionnelleConjointSalarie() != null)
            mdphYouthRequest.setSituationProfessionnelleConjointSalarie(getSituationProfessionnelleConjointSalarie().modelToXml());
      
        if (getSituationProfessionnelleConjointStagiaire() != null)
            mdphYouthRequest.setSituationProfessionnelleConjointStagiaire(getSituationProfessionnelleConjointStagiaire().modelToXml());
      
        if (getSituationProfessionnelleVous() != null)
            mdphYouthRequest.setSituationProfessionnelleVous(fr.cg95.cvq.xml.request.social.MyrChoixSituationProfessionnelleType.Enum.forString(getSituationProfessionnelleVous().getLegacyLabel()));
      
        if (getSituationProfessionnelleVousAutre() != null)
            mdphYouthRequest.setSituationProfessionnelleVousAutre(getSituationProfessionnelleVousAutre().modelToXml());
      
        if (getSituationProfessionnelleVousBeneficiairePension() != null)
            mdphYouthRequest.setSituationProfessionnelleVousBeneficiairePension(getSituationProfessionnelleVousBeneficiairePension().modelToXml());
      
        if (getSituationProfessionnelleVousDemandeurEmploi() != null)
            mdphYouthRequest.setSituationProfessionnelleVousDemandeurEmploi(getSituationProfessionnelleVousDemandeurEmploi().modelToXml());
      
        if (getSituationProfessionnelleVousNonSalarie() != null)
            mdphYouthRequest.setSituationProfessionnelleVousNonSalarie(getSituationProfessionnelleVousNonSalarie().modelToXml());
      
        if (getSituationProfessionnelleVousRetraite() != null)
            mdphYouthRequest.setSituationProfessionnelleVousRetraite(getSituationProfessionnelleVousRetraite().modelToXml());
      
        if (getSituationProfessionnelleVousSalarie() != null)
            mdphYouthRequest.setSituationProfessionnelleVousSalarie(getSituationProfessionnelleVousSalarie().modelToXml());
      
        if (getSituationProfessionnelleVousStagiaire() != null)
            mdphYouthRequest.setSituationProfessionnelleVousStagiaire(getSituationProfessionnelleVousStagiaire().modelToXml());
      
        mdphYouthRequest.setTypeAccueil(getTypeAccueil());
      
        if (getTypeLogement() != null)
            mdphYouthRequest.setTypeLogement(fr.cg95.cvq.xml.request.social.MyrLogementType.Enum.forString(getTypeLogement().getLegacyLabel()));
      
        mdphYouthRequest.setTypeScolarisation(getTypeScolarisation());
      
        return mdphYouthRequestDoc;
    }

    @Override
    public final MdphYouthRequestDocument.MdphYouthRequest modelToXmlRequest() {
        return modelToXml().getMdphYouthRequest();
    }

    public static MdphYouthRequest xmlToModel(MdphYouthRequestDocument mdphYouthRequestDoc) {
        MdphYouthRequestDocument.MdphYouthRequest mdphYouthRequestXml = mdphYouthRequestDoc.getMdphYouthRequest();
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MdphYouthRequest mdphYouthRequest = new MdphYouthRequest();
        mdphYouthRequest.fillCommonModelInfo(mdphYouthRequest, mdphYouthRequestXml);
        
        mdphYouthRequest.setAllocationPersonnaliseeAutonomie(Boolean.valueOf(mdphYouthRequestXml.getAllocationPersonnaliseeAutonomie()));
      
        if (mdphYouthRequestXml.getAutoriteParentaleLesDeuxMere() != null)
            mdphYouthRequest.setAutoriteParentaleLesDeuxMere(MyrAutoriteParentale.xmlToModel(mdphYouthRequestXml.getAutoriteParentaleLesDeuxMere()));
      
        if (mdphYouthRequestXml.getAutoriteParentaleLesDeuxPere() != null)
            mdphYouthRequest.setAutoriteParentaleLesDeuxPere(MyrAutoriteParentale.xmlToModel(mdphYouthRequestXml.getAutoriteParentaleLesDeuxPere()));
      
        if (mdphYouthRequestXml.getAutoriteParentaleMere() != null)
            mdphYouthRequest.setAutoriteParentaleMere(MyrAutoriteParentale.xmlToModel(mdphYouthRequestXml.getAutoriteParentaleMere()));
      
        if (mdphYouthRequestXml.getAutoriteParentalePere() != null)
            mdphYouthRequest.setAutoriteParentalePere(MyrAutoriteParentale.xmlToModel(mdphYouthRequestXml.getAutoriteParentalePere()));
      
        if (mdphYouthRequestXml.getBesoinsDemandePCH() != null)
            mdphYouthRequest.setBesoinsDemandePCH(MyrBesoinsDemandePch.xmlToModel(mdphYouthRequestXml.getBesoinsDemandePCH()));
      
        mdphYouthRequest.setCarteAccompagnement(Boolean.valueOf(mdphYouthRequestXml.getCarteAccompagnement()));
      
        mdphYouthRequest.setCarteInvalidite(Boolean.valueOf(mdphYouthRequestXml.getCarteInvalidite()));
      
        mdphYouthRequest.setCarteStationnement(Boolean.valueOf(mdphYouthRequestXml.getCarteStationnement()));
      
        if (mdphYouthRequestXml.getChoixPrestationCompensation() != null)
            mdphYouthRequest.setChoixPrestationCompensation(fr.cg95.cvq.business.request.social.MyrChoixPrestationCompensationType.forString(mdphYouthRequestXml.getChoixPrestationCompensation().toString()));
        else
            mdphYouthRequest.setChoixPrestationCompensation(fr.cg95.cvq.business.request.social.MyrChoixPrestationCompensationType.getDefaultMyrChoixPrestationCompensationType());
      
        if (mdphYouthRequestXml.getChoixProjetDeVie() != null)
            mdphYouthRequest.setChoixProjetDeVie(fr.cg95.cvq.business.request.social.MyrChoixProjetDeVieType.forString(mdphYouthRequestXml.getChoixProjetDeVie().toString()));
        else
            mdphYouthRequest.setChoixProjetDeVie(fr.cg95.cvq.business.request.social.MyrChoixProjetDeVieType.getDefaultMyrChoixProjetDeVieType());
      
        mdphYouthRequest.setConseilleProjetDeVie(mdphYouthRequestXml.getConseilleProjetDeVie());
      
        calendar = mdphYouthRequestXml.getDateArriveeFrance();
        if (calendar != null) {
            mdphYouthRequest.setDateArriveeFrance(calendar.getTime());
        }
      
        calendar = mdphYouthRequestXml.getDateNaissanceSujet();
        if (calendar != null) {
            mdphYouthRequest.setDateNaissanceSujet(calendar.getTime());
        }
      
        calendar = mdphYouthRequestXml.getDateSituationFamiliale();
        if (calendar != null) {
            mdphYouthRequest.setDateSituationFamiliale(calendar.getTime());
        }
      
        mdphYouthRequest.setDemandeLibreScolaire(mdphYouthRequestXml.getDemandeLibreScolaire());
      
        if (mdphYouthRequestXml.getDeteneurAutoriteParentale() != null)
            mdphYouthRequest.setDeteneurAutoriteParentale(fr.cg95.cvq.business.request.social.DeteneurAutoriteParentaleType.forString(mdphYouthRequestXml.getDeteneurAutoriteParentale().toString()));
        else
            mdphYouthRequest.setDeteneurAutoriteParentale(fr.cg95.cvq.business.request.social.DeteneurAutoriteParentaleType.getDefaultDeteneurAutoriteParentaleType());
      
        if (mdphYouthRequestXml.getDomiciliationEtablissement() != null)
            mdphYouthRequest.setDomiciliationEtablissement(Address.xmlToModel(mdphYouthRequestXml.getDomiciliationEtablissement()));
      
        if (mdphYouthRequestXml.getDomiciliationOrganismePayeur() != null)
            mdphYouthRequest.setDomiciliationOrganismePayeur(Address.xmlToModel(mdphYouthRequestXml.getDomiciliationOrganismePayeur()));
      
        calendar = mdphYouthRequestXml.getEnInternatDepuisLe();
        if (calendar != null) {
            mdphYouthRequest.setEnInternatDepuisLe(calendar.getTime());
        }
      
        mdphYouthRequest.setEnfantEnInternat(Boolean.valueOf(mdphYouthRequestXml.getEnfantEnInternat()));
      
        mdphYouthRequest.setExpressionProjetDeVie(mdphYouthRequestXml.getExpressionProjetDeVie());
      
        mdphYouthRequest.setFaxSujet(mdphYouthRequestXml.getFaxSujet());
      
        mdphYouthRequest.setFraisSejourPrisEnCharge(Boolean.valueOf(mdphYouthRequestXml.getFraisSejourPrisEnCharge()));
      
        List<fr.cg95.cvq.business.request.social.MyrFraisSuppLiesHandicap> fraisSuppLiesHandicapList = new ArrayList<fr.cg95.cvq.business.request.social.MyrFraisSuppLiesHandicap>(mdphYouthRequestXml.sizeOfFraisSuppLiesHandicapArray());
        for (MyrFraisSuppLiesHandicapType object : mdphYouthRequestXml.getFraisSuppLiesHandicapArray()) {
            fraisSuppLiesHandicapList.add(fr.cg95.cvq.business.request.social.MyrFraisSuppLiesHandicap.xmlToModel(object));
        }
        mdphYouthRequest.setFraisSuppLiesHandicap(fraisSuppLiesHandicapList);
      
        if (mdphYouthRequestXml.getIdentiteConjoint() != null)
            mdphYouthRequest.setIdentiteConjoint(MyrConjointIdentite.xmlToModel(mdphYouthRequestXml.getIdentiteConjoint()));
      
        if (mdphYouthRequestXml.getInformationAutreDeteneurAutoriteParentale() != null)
            mdphYouthRequest.setInformationAutreDeteneurAutoriteParentale(MyrAutoriteParentaleAutre.xmlToModel(mdphYouthRequestXml.getInformationAutreDeteneurAutoriteParentale()));
      
        if (mdphYouthRequestXml.getLieuNaissanceSujet() != null)
            mdphYouthRequest.setLieuNaissanceSujet(MyrBirthPlace.xmlToModel(mdphYouthRequestXml.getLieuNaissanceSujet()));
      
        if (mdphYouthRequestXml.getNationalite() != null)
            mdphYouthRequest.setNationalite(fr.cg95.cvq.business.request.social.MyrNationaliteAvecSuisseType.forString(mdphYouthRequestXml.getNationalite().toString()));
        else
            mdphYouthRequest.setNationalite(fr.cg95.cvq.business.request.social.MyrNationaliteAvecSuisseType.getDefaultMyrNationaliteAvecSuisseType());
      
        mdphYouthRequest.setNomAllocataire(mdphYouthRequestXml.getNomAllocataire());
      
        mdphYouthRequest.setNomEtablissement(mdphYouthRequestXml.getNomEtablissement());
      
        mdphYouthRequest.setNomOrganismePayeur(mdphYouthRequestXml.getNomOrganismePayeur());
      
        mdphYouthRequest.setNomOrganismeSecuriteSociale(mdphYouthRequestXml.getNomOrganismeSecuriteSociale());
      
        mdphYouthRequest.setNombreEnfantsACharge(mdphYouthRequestXml.getNombreEnfantsACharge());
      
        mdphYouthRequest.setNumeroAllocataire(mdphYouthRequestXml.getNumeroAllocataire());
      
        mdphYouthRequest.setNumeroSecuriteSocialeSujet(mdphYouthRequestXml.getNumeroSecuriteSocialeSujet());
      
        if (mdphYouthRequestXml.getOrganismePayeur() != null)
            mdphYouthRequest.setOrganismePayeur(fr.cg95.cvq.business.request.social.MyrOrganismePayeurType.forString(mdphYouthRequestXml.getOrganismePayeur().toString()));
        else
            mdphYouthRequest.setOrganismePayeur(fr.cg95.cvq.business.request.social.MyrOrganismePayeurType.getDefaultMyrOrganismePayeurType());
      
        if (mdphYouthRequestXml.getPrecedentDossierMdph() != null)
            mdphYouthRequest.setPrecedentDossierMdph(MyrPrecedentDossierMdph.xmlToModel(mdphYouthRequestXml.getPrecedentDossierMdph()));
      
        mdphYouthRequest.setPrecisionAutre(mdphYouthRequestXml.getPrecisionAutre());
      
        mdphYouthRequest.setPrecisionLogementAutre(mdphYouthRequestXml.getPrecisionLogementAutre());
      
        if (mdphYouthRequestXml.getPrecisionPreferencesEtablissementOuService() != null)
            mdphYouthRequest.setPrecisionPreferencesEtablissementOuService(MyrPreferenceEtablissementOuServiceScolaire.xmlToModel(mdphYouthRequestXml.getPrecisionPreferencesEtablissementOuService()));
      
        mdphYouthRequest.setPrecisionSiDomicileAupresOrganisme(mdphYouthRequestXml.getPrecisionSiDomicileAupresOrganisme());
      
        mdphYouthRequest.setPreferencesEtablissementOuService(Boolean.valueOf(mdphYouthRequestXml.getPreferencesEtablissementOuService()));
      
        mdphYouthRequest.setPrenomAllocataire(mdphYouthRequestXml.getPrenomAllocataire());
      
        if (mdphYouthRequestXml.getPresencePersonneAupresEnfant() != null)
            mdphYouthRequest.setPresencePersonneAupresEnfant(MyrPresencePersonneAupresEnfant.xmlToModel(mdphYouthRequestXml.getPresencePersonneAupresEnfant()));
      
        if (mdphYouthRequestXml.getSituationMaritale() != null)
            mdphYouthRequest.setSituationMaritale(fr.cg95.cvq.business.request.social.MyrSituationFamilialeType.forString(mdphYouthRequestXml.getSituationMaritale().toString()));
        else
            mdphYouthRequest.setSituationMaritale(fr.cg95.cvq.business.request.social.MyrSituationFamilialeType.getDefaultMyrSituationFamilialeType());
      
        if (mdphYouthRequestXml.getSituationParticuliere() != null)
            mdphYouthRequest.setSituationParticuliere(fr.cg95.cvq.business.request.social.MyrSituationAutreType.forString(mdphYouthRequestXml.getSituationParticuliere().toString()));
        else
            mdphYouthRequest.setSituationParticuliere(fr.cg95.cvq.business.request.social.MyrSituationAutreType.getDefaultMyrSituationAutreType());
      
        if (mdphYouthRequestXml.getSituationProfessionnelleConjoint() != null)
            mdphYouthRequest.setSituationProfessionnelleConjoint(fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType.forString(mdphYouthRequestXml.getSituationProfessionnelleConjoint().toString()));
        else
            mdphYouthRequest.setSituationProfessionnelleConjoint(fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType.getDefaultMyrChoixSituationProfessionnelleType());
      
        if (mdphYouthRequestXml.getSituationProfessionnelleConjointAutre() != null)
            mdphYouthRequest.setSituationProfessionnelleConjointAutre(MyrSituationProfessionnelleAutre.xmlToModel(mdphYouthRequestXml.getSituationProfessionnelleConjointAutre()));
      
        if (mdphYouthRequestXml.getSituationProfessionnelleConjointBeneficiairePension() != null)
            mdphYouthRequest.setSituationProfessionnelleConjointBeneficiairePension(MyrSituationProfessionnelleBeneficiairePension.xmlToModel(mdphYouthRequestXml.getSituationProfessionnelleConjointBeneficiairePension()));
      
        if (mdphYouthRequestXml.getSituationProfessionnelleConjointDemandeurEmploi() != null)
            mdphYouthRequest.setSituationProfessionnelleConjointDemandeurEmploi(MyrSituationProfessionnelleDemandeurEmploi.xmlToModel(mdphYouthRequestXml.getSituationProfessionnelleConjointDemandeurEmploi()));
      
        if (mdphYouthRequestXml.getSituationProfessionnelleConjointNonSalarie() != null)
            mdphYouthRequest.setSituationProfessionnelleConjointNonSalarie(MyrSituationProfessionnelleNonSalarie.xmlToModel(mdphYouthRequestXml.getSituationProfessionnelleConjointNonSalarie()));
      
        if (mdphYouthRequestXml.getSituationProfessionnelleConjointRetraite() != null)
            mdphYouthRequest.setSituationProfessionnelleConjointRetraite(MyrSituationProfessionnelleRetraite.xmlToModel(mdphYouthRequestXml.getSituationProfessionnelleConjointRetraite()));
      
        if (mdphYouthRequestXml.getSituationProfessionnelleConjointSalarie() != null)
            mdphYouthRequest.setSituationProfessionnelleConjointSalarie(MyrSituationProfessionnelleSalarie.xmlToModel(mdphYouthRequestXml.getSituationProfessionnelleConjointSalarie()));
      
        if (mdphYouthRequestXml.getSituationProfessionnelleConjointStagiaire() != null)
            mdphYouthRequest.setSituationProfessionnelleConjointStagiaire(MyrSituationProfessionnelleStagiaire.xmlToModel(mdphYouthRequestXml.getSituationProfessionnelleConjointStagiaire()));
      
        if (mdphYouthRequestXml.getSituationProfessionnelleVous() != null)
            mdphYouthRequest.setSituationProfessionnelleVous(fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType.forString(mdphYouthRequestXml.getSituationProfessionnelleVous().toString()));
        else
            mdphYouthRequest.setSituationProfessionnelleVous(fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType.getDefaultMyrChoixSituationProfessionnelleType());
      
        if (mdphYouthRequestXml.getSituationProfessionnelleVousAutre() != null)
            mdphYouthRequest.setSituationProfessionnelleVousAutre(MyrSituationProfessionnelleAutre.xmlToModel(mdphYouthRequestXml.getSituationProfessionnelleVousAutre()));
      
        if (mdphYouthRequestXml.getSituationProfessionnelleVousBeneficiairePension() != null)
            mdphYouthRequest.setSituationProfessionnelleVousBeneficiairePension(MyrSituationProfessionnelleBeneficiairePension.xmlToModel(mdphYouthRequestXml.getSituationProfessionnelleVousBeneficiairePension()));
      
        if (mdphYouthRequestXml.getSituationProfessionnelleVousDemandeurEmploi() != null)
            mdphYouthRequest.setSituationProfessionnelleVousDemandeurEmploi(MyrSituationProfessionnelleDemandeurEmploi.xmlToModel(mdphYouthRequestXml.getSituationProfessionnelleVousDemandeurEmploi()));
      
        if (mdphYouthRequestXml.getSituationProfessionnelleVousNonSalarie() != null)
            mdphYouthRequest.setSituationProfessionnelleVousNonSalarie(MyrSituationProfessionnelleNonSalarie.xmlToModel(mdphYouthRequestXml.getSituationProfessionnelleVousNonSalarie()));
      
        if (mdphYouthRequestXml.getSituationProfessionnelleVousRetraite() != null)
            mdphYouthRequest.setSituationProfessionnelleVousRetraite(MyrSituationProfessionnelleRetraite.xmlToModel(mdphYouthRequestXml.getSituationProfessionnelleVousRetraite()));
      
        if (mdphYouthRequestXml.getSituationProfessionnelleVousSalarie() != null)
            mdphYouthRequest.setSituationProfessionnelleVousSalarie(MyrSituationProfessionnelleSalarie.xmlToModel(mdphYouthRequestXml.getSituationProfessionnelleVousSalarie()));
      
        if (mdphYouthRequestXml.getSituationProfessionnelleVousStagiaire() != null)
            mdphYouthRequest.setSituationProfessionnelleVousStagiaire(MyrSituationProfessionnelleStagiaire.xmlToModel(mdphYouthRequestXml.getSituationProfessionnelleVousStagiaire()));
      
        mdphYouthRequest.setTypeAccueil(mdphYouthRequestXml.getTypeAccueil());
      
        if (mdphYouthRequestXml.getTypeLogement() != null)
            mdphYouthRequest.setTypeLogement(fr.cg95.cvq.business.request.social.MyrLogementType.forString(mdphYouthRequestXml.getTypeLogement().toString()));
        else
            mdphYouthRequest.setTypeLogement(fr.cg95.cvq.business.request.social.MyrLogementType.getDefaultMyrLogementType());
      
        mdphYouthRequest.setTypeScolarisation(mdphYouthRequestXml.getTypeScolarisation());
      
        return mdphYouthRequest;
    }

    @Override
    public MdphYouthRequest clone() {
        MdphYouthRequest clone = new MdphYouthRequest(getRequestData().clone(), mdphYouthRequestData.clone());
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("subject", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("autoriteParentale", stepState);
        
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
          clone.getStepStates().put("allocationEducationEnfantHandicape", stepState);
        
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
          clone.getStepStates().put("document", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("validation", stepState);
        
        return clone;
    }

  
    public final void setAllocationPersonnaliseeAutonomie(final Boolean allocationPersonnaliseeAutonomie) {
        mdphYouthRequestData.setAllocationPersonnaliseeAutonomie(allocationPersonnaliseeAutonomie);
    }

    
    public final Boolean getAllocationPersonnaliseeAutonomie() {
        return mdphYouthRequestData.getAllocationPersonnaliseeAutonomie();
    }
  
    public final void setAutoriteParentaleLesDeuxMere(final fr.cg95.cvq.business.request.social.MyrAutoriteParentale autoriteParentaleLesDeuxMere) {
        mdphYouthRequestData.setAutoriteParentaleLesDeuxMere(autoriteParentaleLesDeuxMere);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrAutoriteParentale getAutoriteParentaleLesDeuxMere() {
        return mdphYouthRequestData.getAutoriteParentaleLesDeuxMere();
    }
  
    public final void setAutoriteParentaleLesDeuxPere(final fr.cg95.cvq.business.request.social.MyrAutoriteParentale autoriteParentaleLesDeuxPere) {
        mdphYouthRequestData.setAutoriteParentaleLesDeuxPere(autoriteParentaleLesDeuxPere);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrAutoriteParentale getAutoriteParentaleLesDeuxPere() {
        return mdphYouthRequestData.getAutoriteParentaleLesDeuxPere();
    }
  
    public final void setAutoriteParentaleMere(final fr.cg95.cvq.business.request.social.MyrAutoriteParentale autoriteParentaleMere) {
        mdphYouthRequestData.setAutoriteParentaleMere(autoriteParentaleMere);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrAutoriteParentale getAutoriteParentaleMere() {
        return mdphYouthRequestData.getAutoriteParentaleMere();
    }
  
    public final void setAutoriteParentalePere(final fr.cg95.cvq.business.request.social.MyrAutoriteParentale autoriteParentalePere) {
        mdphYouthRequestData.setAutoriteParentalePere(autoriteParentalePere);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrAutoriteParentale getAutoriteParentalePere() {
        return mdphYouthRequestData.getAutoriteParentalePere();
    }
  
    public final void setBesoinsDemandePCH(final fr.cg95.cvq.business.request.social.MyrBesoinsDemandePch besoinsDemandePCH) {
        mdphYouthRequestData.setBesoinsDemandePCH(besoinsDemandePCH);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrBesoinsDemandePch getBesoinsDemandePCH() {
        return mdphYouthRequestData.getBesoinsDemandePCH();
    }
  
    public final void setCarteAccompagnement(final Boolean carteAccompagnement) {
        mdphYouthRequestData.setCarteAccompagnement(carteAccompagnement);
    }

    
    public final Boolean getCarteAccompagnement() {
        return mdphYouthRequestData.getCarteAccompagnement();
    }
  
    public final void setCarteInvalidite(final Boolean carteInvalidite) {
        mdphYouthRequestData.setCarteInvalidite(carteInvalidite);
    }

    
    public final Boolean getCarteInvalidite() {
        return mdphYouthRequestData.getCarteInvalidite();
    }
  
    public final void setCarteStationnement(final Boolean carteStationnement) {
        mdphYouthRequestData.setCarteStationnement(carteStationnement);
    }

    
    public final Boolean getCarteStationnement() {
        return mdphYouthRequestData.getCarteStationnement();
    }
  
    public final void setChoixPrestationCompensation(final fr.cg95.cvq.business.request.social.MyrChoixPrestationCompensationType choixPrestationCompensation) {
        mdphYouthRequestData.setChoixPrestationCompensation(choixPrestationCompensation);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrChoixPrestationCompensationType getChoixPrestationCompensation() {
        return mdphYouthRequestData.getChoixPrestationCompensation();
    }
  
    public final void setChoixProjetDeVie(final fr.cg95.cvq.business.request.social.MyrChoixProjetDeVieType choixProjetDeVie) {
        mdphYouthRequestData.setChoixProjetDeVie(choixProjetDeVie);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrChoixProjetDeVieType getChoixProjetDeVie() {
        return mdphYouthRequestData.getChoixProjetDeVie();
    }
  
    public final void setConseilleProjetDeVie(final String conseilleProjetDeVie) {
        mdphYouthRequestData.setConseilleProjetDeVie(conseilleProjetDeVie);
    }

    
    public final String getConseilleProjetDeVie() {
        return mdphYouthRequestData.getConseilleProjetDeVie();
    }
  
    public final void setDateArriveeFrance(final java.util.Date dateArriveeFrance) {
        mdphYouthRequestData.setDateArriveeFrance(dateArriveeFrance);
    }

    
    public final java.util.Date getDateArriveeFrance() {
        return mdphYouthRequestData.getDateArriveeFrance();
    }
  
    public final void setDateNaissanceSujet(final java.util.Date dateNaissanceSujet) {
        mdphYouthRequestData.setDateNaissanceSujet(dateNaissanceSujet);
    }

    
    public final java.util.Date getDateNaissanceSujet() {
        return mdphYouthRequestData.getDateNaissanceSujet();
    }
  
    public final void setDateSituationFamiliale(final java.util.Date dateSituationFamiliale) {
        mdphYouthRequestData.setDateSituationFamiliale(dateSituationFamiliale);
    }

    
    public final java.util.Date getDateSituationFamiliale() {
        return mdphYouthRequestData.getDateSituationFamiliale();
    }
  
    public final void setDemandeLibreScolaire(final String demandeLibreScolaire) {
        mdphYouthRequestData.setDemandeLibreScolaire(demandeLibreScolaire);
    }

    
    public final String getDemandeLibreScolaire() {
        return mdphYouthRequestData.getDemandeLibreScolaire();
    }
  
    public final void setDeteneurAutoriteParentale(final fr.cg95.cvq.business.request.social.DeteneurAutoriteParentaleType deteneurAutoriteParentale) {
        mdphYouthRequestData.setDeteneurAutoriteParentale(deteneurAutoriteParentale);
    }

    
    public final fr.cg95.cvq.business.request.social.DeteneurAutoriteParentaleType getDeteneurAutoriteParentale() {
        return mdphYouthRequestData.getDeteneurAutoriteParentale();
    }
  
    public final void setDomiciliationEtablissement(final fr.cg95.cvq.business.users.Address domiciliationEtablissement) {
        mdphYouthRequestData.setDomiciliationEtablissement(domiciliationEtablissement);
    }

    
    public final fr.cg95.cvq.business.users.Address getDomiciliationEtablissement() {
        return mdphYouthRequestData.getDomiciliationEtablissement();
    }
  
    public final void setDomiciliationOrganismePayeur(final fr.cg95.cvq.business.users.Address domiciliationOrganismePayeur) {
        mdphYouthRequestData.setDomiciliationOrganismePayeur(domiciliationOrganismePayeur);
    }

    
    public final fr.cg95.cvq.business.users.Address getDomiciliationOrganismePayeur() {
        return mdphYouthRequestData.getDomiciliationOrganismePayeur();
    }
  
    public final void setEnInternatDepuisLe(final java.util.Date enInternatDepuisLe) {
        mdphYouthRequestData.setEnInternatDepuisLe(enInternatDepuisLe);
    }

    
    public final java.util.Date getEnInternatDepuisLe() {
        return mdphYouthRequestData.getEnInternatDepuisLe();
    }
  
    public final void setEnfantEnInternat(final Boolean enfantEnInternat) {
        mdphYouthRequestData.setEnfantEnInternat(enfantEnInternat);
    }

    
    public final Boolean getEnfantEnInternat() {
        return mdphYouthRequestData.getEnfantEnInternat();
    }
  
    public final void setExpressionProjetDeVie(final String expressionProjetDeVie) {
        mdphYouthRequestData.setExpressionProjetDeVie(expressionProjetDeVie);
    }

    
    public final String getExpressionProjetDeVie() {
        return mdphYouthRequestData.getExpressionProjetDeVie();
    }
  
    public final void setFaxSujet(final String faxSujet) {
        mdphYouthRequestData.setFaxSujet(faxSujet);
    }

    
    public final String getFaxSujet() {
        return mdphYouthRequestData.getFaxSujet();
    }
  
    public final void setFraisSejourPrisEnCharge(final Boolean fraisSejourPrisEnCharge) {
        mdphYouthRequestData.setFraisSejourPrisEnCharge(fraisSejourPrisEnCharge);
    }

    
    public final Boolean getFraisSejourPrisEnCharge() {
        return mdphYouthRequestData.getFraisSejourPrisEnCharge();
    }
  
    public final void setFraisSuppLiesHandicap(final List<fr.cg95.cvq.business.request.social.MyrFraisSuppLiesHandicap> fraisSuppLiesHandicap) {
        mdphYouthRequestData.setFraisSuppLiesHandicap(fraisSuppLiesHandicap);
    }

    
    public final List<fr.cg95.cvq.business.request.social.MyrFraisSuppLiesHandicap> getFraisSuppLiesHandicap() {
        return mdphYouthRequestData.getFraisSuppLiesHandicap();
    }
  
    public final void setIdentiteConjoint(final fr.cg95.cvq.business.request.social.MyrConjointIdentite identiteConjoint) {
        mdphYouthRequestData.setIdentiteConjoint(identiteConjoint);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrConjointIdentite getIdentiteConjoint() {
        return mdphYouthRequestData.getIdentiteConjoint();
    }
  
    public final void setInformationAutreDeteneurAutoriteParentale(final fr.cg95.cvq.business.request.social.MyrAutoriteParentaleAutre informationAutreDeteneurAutoriteParentale) {
        mdphYouthRequestData.setInformationAutreDeteneurAutoriteParentale(informationAutreDeteneurAutoriteParentale);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrAutoriteParentaleAutre getInformationAutreDeteneurAutoriteParentale() {
        return mdphYouthRequestData.getInformationAutreDeteneurAutoriteParentale();
    }
  
    public final void setLieuNaissanceSujet(final fr.cg95.cvq.business.request.social.MyrBirthPlace lieuNaissanceSujet) {
        mdphYouthRequestData.setLieuNaissanceSujet(lieuNaissanceSujet);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrBirthPlace getLieuNaissanceSujet() {
        return mdphYouthRequestData.getLieuNaissanceSujet();
    }
  
    public final void setNationalite(final fr.cg95.cvq.business.request.social.MyrNationaliteAvecSuisseType nationalite) {
        mdphYouthRequestData.setNationalite(nationalite);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrNationaliteAvecSuisseType getNationalite() {
        return mdphYouthRequestData.getNationalite();
    }
  
    public final void setNomAllocataire(final String nomAllocataire) {
        mdphYouthRequestData.setNomAllocataire(nomAllocataire);
    }

    
    public final String getNomAllocataire() {
        return mdphYouthRequestData.getNomAllocataire();
    }
  
    public final void setNomEtablissement(final String nomEtablissement) {
        mdphYouthRequestData.setNomEtablissement(nomEtablissement);
    }

    
    public final String getNomEtablissement() {
        return mdphYouthRequestData.getNomEtablissement();
    }
  
    public final void setNomOrganismePayeur(final String nomOrganismePayeur) {
        mdphYouthRequestData.setNomOrganismePayeur(nomOrganismePayeur);
    }

    
    public final String getNomOrganismePayeur() {
        return mdphYouthRequestData.getNomOrganismePayeur();
    }
  
    public final void setNomOrganismeSecuriteSociale(final String nomOrganismeSecuriteSociale) {
        mdphYouthRequestData.setNomOrganismeSecuriteSociale(nomOrganismeSecuriteSociale);
    }

    
    public final String getNomOrganismeSecuriteSociale() {
        return mdphYouthRequestData.getNomOrganismeSecuriteSociale();
    }
  
    public final void setNombreEnfantsACharge(final String nombreEnfantsACharge) {
        mdphYouthRequestData.setNombreEnfantsACharge(nombreEnfantsACharge);
    }

    
    public final String getNombreEnfantsACharge() {
        return mdphYouthRequestData.getNombreEnfantsACharge();
    }
  
    public final void setNumeroAllocataire(final String numeroAllocataire) {
        mdphYouthRequestData.setNumeroAllocataire(numeroAllocataire);
    }

    
    public final String getNumeroAllocataire() {
        return mdphYouthRequestData.getNumeroAllocataire();
    }
  
    public final void setNumeroSecuriteSocialeSujet(final String numeroSecuriteSocialeSujet) {
        mdphYouthRequestData.setNumeroSecuriteSocialeSujet(numeroSecuriteSocialeSujet);
    }

    
    public final String getNumeroSecuriteSocialeSujet() {
        return mdphYouthRequestData.getNumeroSecuriteSocialeSujet();
    }
  
    public final void setOrganismePayeur(final fr.cg95.cvq.business.request.social.MyrOrganismePayeurType organismePayeur) {
        mdphYouthRequestData.setOrganismePayeur(organismePayeur);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrOrganismePayeurType getOrganismePayeur() {
        return mdphYouthRequestData.getOrganismePayeur();
    }
  
    public final void setPrecedentDossierMdph(final fr.cg95.cvq.business.request.social.MyrPrecedentDossierMdph precedentDossierMdph) {
        mdphYouthRequestData.setPrecedentDossierMdph(precedentDossierMdph);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrPrecedentDossierMdph getPrecedentDossierMdph() {
        return mdphYouthRequestData.getPrecedentDossierMdph();
    }
  
    public final void setPrecisionAutre(final String precisionAutre) {
        mdphYouthRequestData.setPrecisionAutre(precisionAutre);
    }

    
    public final String getPrecisionAutre() {
        return mdphYouthRequestData.getPrecisionAutre();
    }
  
    public final void setPrecisionLogementAutre(final String precisionLogementAutre) {
        mdphYouthRequestData.setPrecisionLogementAutre(precisionLogementAutre);
    }

    
    public final String getPrecisionLogementAutre() {
        return mdphYouthRequestData.getPrecisionLogementAutre();
    }
  
    public final void setPrecisionPreferencesEtablissementOuService(final fr.cg95.cvq.business.request.social.MyrPreferenceEtablissementOuServiceScolaire precisionPreferencesEtablissementOuService) {
        mdphYouthRequestData.setPrecisionPreferencesEtablissementOuService(precisionPreferencesEtablissementOuService);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrPreferenceEtablissementOuServiceScolaire getPrecisionPreferencesEtablissementOuService() {
        return mdphYouthRequestData.getPrecisionPreferencesEtablissementOuService();
    }
  
    public final void setPrecisionSiDomicileAupresOrganisme(final String precisionSiDomicileAupresOrganisme) {
        mdphYouthRequestData.setPrecisionSiDomicileAupresOrganisme(precisionSiDomicileAupresOrganisme);
    }

    
    public final String getPrecisionSiDomicileAupresOrganisme() {
        return mdphYouthRequestData.getPrecisionSiDomicileAupresOrganisme();
    }
  
    public final void setPreferencesEtablissementOuService(final Boolean preferencesEtablissementOuService) {
        mdphYouthRequestData.setPreferencesEtablissementOuService(preferencesEtablissementOuService);
    }

    
    public final Boolean getPreferencesEtablissementOuService() {
        return mdphYouthRequestData.getPreferencesEtablissementOuService();
    }
  
    public final void setPrenomAllocataire(final String prenomAllocataire) {
        mdphYouthRequestData.setPrenomAllocataire(prenomAllocataire);
    }

    
    public final String getPrenomAllocataire() {
        return mdphYouthRequestData.getPrenomAllocataire();
    }
  
    public final void setPresencePersonneAupresEnfant(final fr.cg95.cvq.business.request.social.MyrPresencePersonneAupresEnfant presencePersonneAupresEnfant) {
        mdphYouthRequestData.setPresencePersonneAupresEnfant(presencePersonneAupresEnfant);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrPresencePersonneAupresEnfant getPresencePersonneAupresEnfant() {
        return mdphYouthRequestData.getPresencePersonneAupresEnfant();
    }
  
    public final void setSituationMaritale(final fr.cg95.cvq.business.request.social.MyrSituationFamilialeType situationMaritale) {
        mdphYouthRequestData.setSituationMaritale(situationMaritale);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrSituationFamilialeType getSituationMaritale() {
        return mdphYouthRequestData.getSituationMaritale();
    }
  
    public final void setSituationParticuliere(final fr.cg95.cvq.business.request.social.MyrSituationAutreType situationParticuliere) {
        mdphYouthRequestData.setSituationParticuliere(situationParticuliere);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrSituationAutreType getSituationParticuliere() {
        return mdphYouthRequestData.getSituationParticuliere();
    }
  
    public final void setSituationProfessionnelleConjoint(final fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType situationProfessionnelleConjoint) {
        mdphYouthRequestData.setSituationProfessionnelleConjoint(situationProfessionnelleConjoint);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType getSituationProfessionnelleConjoint() {
        return mdphYouthRequestData.getSituationProfessionnelleConjoint();
    }
  
    public final void setSituationProfessionnelleConjointAutre(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleAutre situationProfessionnelleConjointAutre) {
        mdphYouthRequestData.setSituationProfessionnelleConjointAutre(situationProfessionnelleConjointAutre);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleAutre getSituationProfessionnelleConjointAutre() {
        return mdphYouthRequestData.getSituationProfessionnelleConjointAutre();
    }
  
    public final void setSituationProfessionnelleConjointBeneficiairePension(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleBeneficiairePension situationProfessionnelleConjointBeneficiairePension) {
        mdphYouthRequestData.setSituationProfessionnelleConjointBeneficiairePension(situationProfessionnelleConjointBeneficiairePension);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleBeneficiairePension getSituationProfessionnelleConjointBeneficiairePension() {
        return mdphYouthRequestData.getSituationProfessionnelleConjointBeneficiairePension();
    }
  
    public final void setSituationProfessionnelleConjointDemandeurEmploi(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleDemandeurEmploi situationProfessionnelleConjointDemandeurEmploi) {
        mdphYouthRequestData.setSituationProfessionnelleConjointDemandeurEmploi(situationProfessionnelleConjointDemandeurEmploi);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleDemandeurEmploi getSituationProfessionnelleConjointDemandeurEmploi() {
        return mdphYouthRequestData.getSituationProfessionnelleConjointDemandeurEmploi();
    }
  
    public final void setSituationProfessionnelleConjointNonSalarie(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleNonSalarie situationProfessionnelleConjointNonSalarie) {
        mdphYouthRequestData.setSituationProfessionnelleConjointNonSalarie(situationProfessionnelleConjointNonSalarie);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleNonSalarie getSituationProfessionnelleConjointNonSalarie() {
        return mdphYouthRequestData.getSituationProfessionnelleConjointNonSalarie();
    }
  
    public final void setSituationProfessionnelleConjointRetraite(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleRetraite situationProfessionnelleConjointRetraite) {
        mdphYouthRequestData.setSituationProfessionnelleConjointRetraite(situationProfessionnelleConjointRetraite);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleRetraite getSituationProfessionnelleConjointRetraite() {
        return mdphYouthRequestData.getSituationProfessionnelleConjointRetraite();
    }
  
    public final void setSituationProfessionnelleConjointSalarie(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleSalarie situationProfessionnelleConjointSalarie) {
        mdphYouthRequestData.setSituationProfessionnelleConjointSalarie(situationProfessionnelleConjointSalarie);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleSalarie getSituationProfessionnelleConjointSalarie() {
        return mdphYouthRequestData.getSituationProfessionnelleConjointSalarie();
    }
  
    public final void setSituationProfessionnelleConjointStagiaire(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleStagiaire situationProfessionnelleConjointStagiaire) {
        mdphYouthRequestData.setSituationProfessionnelleConjointStagiaire(situationProfessionnelleConjointStagiaire);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleStagiaire getSituationProfessionnelleConjointStagiaire() {
        return mdphYouthRequestData.getSituationProfessionnelleConjointStagiaire();
    }
  
    public final void setSituationProfessionnelleVous(final fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType situationProfessionnelleVous) {
        mdphYouthRequestData.setSituationProfessionnelleVous(situationProfessionnelleVous);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType getSituationProfessionnelleVous() {
        return mdphYouthRequestData.getSituationProfessionnelleVous();
    }
  
    public final void setSituationProfessionnelleVousAutre(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleAutre situationProfessionnelleVousAutre) {
        mdphYouthRequestData.setSituationProfessionnelleVousAutre(situationProfessionnelleVousAutre);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleAutre getSituationProfessionnelleVousAutre() {
        return mdphYouthRequestData.getSituationProfessionnelleVousAutre();
    }
  
    public final void setSituationProfessionnelleVousBeneficiairePension(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleBeneficiairePension situationProfessionnelleVousBeneficiairePension) {
        mdphYouthRequestData.setSituationProfessionnelleVousBeneficiairePension(situationProfessionnelleVousBeneficiairePension);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleBeneficiairePension getSituationProfessionnelleVousBeneficiairePension() {
        return mdphYouthRequestData.getSituationProfessionnelleVousBeneficiairePension();
    }
  
    public final void setSituationProfessionnelleVousDemandeurEmploi(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleDemandeurEmploi situationProfessionnelleVousDemandeurEmploi) {
        mdphYouthRequestData.setSituationProfessionnelleVousDemandeurEmploi(situationProfessionnelleVousDemandeurEmploi);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleDemandeurEmploi getSituationProfessionnelleVousDemandeurEmploi() {
        return mdphYouthRequestData.getSituationProfessionnelleVousDemandeurEmploi();
    }
  
    public final void setSituationProfessionnelleVousNonSalarie(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleNonSalarie situationProfessionnelleVousNonSalarie) {
        mdphYouthRequestData.setSituationProfessionnelleVousNonSalarie(situationProfessionnelleVousNonSalarie);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleNonSalarie getSituationProfessionnelleVousNonSalarie() {
        return mdphYouthRequestData.getSituationProfessionnelleVousNonSalarie();
    }
  
    public final void setSituationProfessionnelleVousRetraite(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleRetraite situationProfessionnelleVousRetraite) {
        mdphYouthRequestData.setSituationProfessionnelleVousRetraite(situationProfessionnelleVousRetraite);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleRetraite getSituationProfessionnelleVousRetraite() {
        return mdphYouthRequestData.getSituationProfessionnelleVousRetraite();
    }
  
    public final void setSituationProfessionnelleVousSalarie(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleSalarie situationProfessionnelleVousSalarie) {
        mdphYouthRequestData.setSituationProfessionnelleVousSalarie(situationProfessionnelleVousSalarie);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleSalarie getSituationProfessionnelleVousSalarie() {
        return mdphYouthRequestData.getSituationProfessionnelleVousSalarie();
    }
  
    public final void setSituationProfessionnelleVousStagiaire(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleStagiaire situationProfessionnelleVousStagiaire) {
        mdphYouthRequestData.setSituationProfessionnelleVousStagiaire(situationProfessionnelleVousStagiaire);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleStagiaire getSituationProfessionnelleVousStagiaire() {
        return mdphYouthRequestData.getSituationProfessionnelleVousStagiaire();
    }
  
    public final void setTypeAccueil(final String typeAccueil) {
        mdphYouthRequestData.setTypeAccueil(typeAccueil);
    }

    
    public final String getTypeAccueil() {
        return mdphYouthRequestData.getTypeAccueil();
    }
  
    public final void setTypeLogement(final fr.cg95.cvq.business.request.social.MyrLogementType typeLogement) {
        mdphYouthRequestData.setTypeLogement(typeLogement);
    }

    
    public final fr.cg95.cvq.business.request.social.MyrLogementType getTypeLogement() {
        return mdphYouthRequestData.getTypeLogement();
    }
  
    public final void setTypeScolarisation(final String typeScolarisation) {
        mdphYouthRequestData.setTypeScolarisation(typeScolarisation);
    }

    
    public final String getTypeScolarisation() {
        return mdphYouthRequestData.getTypeScolarisation();
    }
  
}
