
package fr.cg95.cvq.business.request.school;

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
import fr.cg95.cvq.xml.request.school.*;
import fr.cg95.cvq.service.request.condition.IConditionChecker;

/**
 * Generated class file, do not edit !
 */
public class DayCareCenterRegistrationRequest extends Request implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions = DayCareCenterRegistrationRequestData.conditions;

    @AssertValid(message = "")
    private DayCareCenterRegistrationRequestData dayCareCenterRegistrationRequestData;

    public DayCareCenterRegistrationRequest(RequestData requestData, DayCareCenterRegistrationRequestData dayCareCenterRegistrationRequestData) {
        super(requestData);
        this.dayCareCenterRegistrationRequestData = dayCareCenterRegistrationRequestData;
    }

    public DayCareCenterRegistrationRequest() {
        super();
        this.dayCareCenterRegistrationRequestData = new DayCareCenterRegistrationRequestData();
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
          getStepStates().put("accueil", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("rendezVous", stepState);
        
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
    public DayCareCenterRegistrationRequestData getSpecificData() {
        return dayCareCenterRegistrationRequestData;
    }

    /**
     * Reserved for RequestDAO !
     */
    public void setSpecificData(DayCareCenterRegistrationRequestData dayCareCenterRegistrationRequestData) {
        this.dayCareCenterRegistrationRequestData = dayCareCenterRegistrationRequestData;
    }

    @Override
    public final String modelToXmlString() {
        DayCareCenterRegistrationRequestDocument object = this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    @Override
    public final DayCareCenterRegistrationRequestDocument modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        Date date = null;
        DayCareCenterRegistrationRequestDocument dayCareCenterRegistrationRequestDoc = DayCareCenterRegistrationRequestDocument.Factory.newInstance();
        DayCareCenterRegistrationRequestDocument.DayCareCenterRegistrationRequest dayCareCenterRegistrationRequest = dayCareCenterRegistrationRequestDoc.addNewDayCareCenterRegistrationRequest();
        super.fillCommonXmlInfo(dayCareCenterRegistrationRequest);
        int i = 0;
        
        dayCareCenterRegistrationRequest.setAccueilAnterieur(getAccueilAnterieur());
      
        if (getChoixHorairesAccueil() != null)
            dayCareCenterRegistrationRequest.setChoixHorairesAccueil(fr.cg95.cvq.xml.request.school.ChoixHorairesAccueilType.Enum.forString(getChoixHorairesAccueil().toString()));
        DccrrDatesPlacementType dccrrDatesPlacementTypeDatePlacementAccueilRegulier = dayCareCenterRegistrationRequest.addNewDatePlacementAccueilRegulier();
        if (getChoixTypeDatePlacementAccueilRegulier() != null)
            dccrrDatesPlacementTypeDatePlacementAccueilRegulier.setChoixTypeDatePlacementAccueilRegulier(fr.cg95.cvq.xml.request.school.ChoixDatePlacement.Enum.forString(getChoixTypeDatePlacementAccueilRegulier().toString()));
            dayCareCenterRegistrationRequest.setChoixHorairesAccueil(fr.cg95.cvq.xml.request.school.ChoixHorairesAccueilType.Enum.forString(getChoixHorairesAccueil().getLegacyLabel()));
        DccrrDatesPlacementType dccrrDatesPlacementTypeDatePlacementAccueilRegulier = dayCareCenterRegistrationRequest.addNewDatePlacementAccueilRegulier();
        if (getChoixTypeDatePlacementAccueilRegulier() != null)
            dccrrDatesPlacementTypeDatePlacementAccueilRegulier.setChoixTypeDatePlacementAccueilRegulier(fr.cg95.cvq.xml.request.school.ChoixDatePlacement.Enum.forString(getChoixTypeDatePlacementAccueilRegulier().getLegacyLabel()));
            dayCareCenterRegistrationRequest.setChoixHorairesAccueil(fr.cg95.cvq.xml.request.school.ChoixHorairesAccueilType.Enum.forString(getChoixHorairesAccueil().toString()));
      
        if (getChoixTypeRendezVous() != null)
            dayCareCenterRegistrationRequest.setChoixTypeRendezVous(fr.cg95.cvq.xml.request.school.RendezVousType.Enum.forString(getChoixTypeRendezVous().getLegacyLabel()));
      
        dayCareCenterRegistrationRequest.setCommentaireCitoyen(getCommentaireCitoyen());
      
        if (getDatePlacementAccueilRegulier() != null)
            dayCareCenterRegistrationRequest.setDatePlacementAccueilRegulier(getDatePlacementAccueilRegulier().modelToXml());
      
        date = getDixHuitMoisEnfant();
        if (date != null) {
            calendar.setTime(date);
            dayCareCenterRegistrationRequest.setDixHuitMoisEnfant(calendar);
        }
      
        if (getInformationMere() != null)
            dayCareCenterRegistrationRequest.setInformationMere(getInformationMere().modelToXml());
      
        if (getInformationPere() != null)
            dayCareCenterRegistrationRequest.setInformationPere(getInformationPere().modelToXml());
      
        if (getJeudi() != null)
            dayCareCenterRegistrationRequest.setJeudi(getJeudi().modelToXml());
      
        if (getLundi() != null)
            dayCareCenterRegistrationRequest.setLundi(getLundi().modelToXml());
      
        if (getMardi() != null)
            dayCareCenterRegistrationRequest.setMardi(getMardi().modelToXml());
      
        if (getMercredi() != null)
            dayCareCenterRegistrationRequest.setMercredi(getMercredi().modelToXml());
      
        if (getModeAccueil() != null)
            dayCareCenterRegistrationRequest.setModeAccueil(getModeAccueil().booleanValue());
      
        if (getModeAccueilChoixDeux() != null)
            dayCareCenterRegistrationRequest.setModeAccueilChoixDeux(fr.cg95.cvq.xml.request.school.ModeAccueilType.Enum.forString(getModeAccueilChoixDeux().getLegacyLabel()));
      
        if (getModeAccueilChoixUn() != null)
            dayCareCenterRegistrationRequest.setModeAccueilChoixUn(fr.cg95.cvq.xml.request.school.ModeAccueilType.Enum.forString(getModeAccueilChoixUn().getLegacyLabel()));
      
        if (getPlageHoraireAccueilReguliere() != null)
            dayCareCenterRegistrationRequest.setPlageHoraireAccueilReguliere(getPlageHoraireAccueilReguliere().modelToXml());
      
        if (getPlageHoraireContact() != null)
            dayCareCenterRegistrationRequest.setPlageHoraireContact(fr.cg95.cvq.xml.request.school.PlageHoraireContactType.Enum.forString(getPlageHoraireContact().getLegacyLabel()));
      
        dayCareCenterRegistrationRequest.setTelephoneContact(getTelephoneContact());
      
        dccrrPereTypeInformationPere.setPrecisionAutreSituationActuellePere(getPrecisionAutreSituationActuellePere());
      
        dccrrMereTypeInformationMere.setProfessionMere(getProfessionMere());
      
        dccrrPereTypeInformationPere.setProfessionPere(getProfessionPere());
      
        if (getSituationActuelleMere() != null)
            dccrrMereTypeInformationMere.setSituationActuelleMere(fr.cg95.cvq.xml.request.school.ChoixSituationActuelle.Enum.forString(getSituationActuelleMere().toString()));
      
        if (getSituationActuellePere() != null)
            dccrrPereTypeInformationPere.setSituationActuellePere(fr.cg95.cvq.xml.request.school.ChoixSituationActuelle.Enum.forString(getSituationActuellePere().toString()));
      
        dayCareCenterRegistrationRequest.setTelephoneContact(getTelephoneContact());
        dccrrPereTypeInformationPere.setPrecisionAutreSituationActuellePere(getPrecisionAutreSituationActuellePere());
      
        dccrrMereTypeInformationMere.setProfessionMere(getProfessionMere());
      
        dccrrPereTypeInformationPere.setProfessionPere(getProfessionPere());
      
        if (getSituationActuelleMere() != null)
            dccrrMereTypeInformationMere.setSituationActuelleMere(fr.cg95.cvq.xml.request.school.ChoixSituationActuelle.Enum.forString(getSituationActuelleMere().getLegacyLabel()));
      
        if (getSituationActuellePere() != null)
            dccrrPereTypeInformationPere.setSituationActuellePere(fr.cg95.cvq.xml.request.school.ChoixSituationActuelle.Enum.forString(getSituationActuellePere().getLegacyLabel()));
      
        dayCareCenterRegistrationRequest.setTelephoneContact(getTelephoneContact());
        if (getVendredi() != null)
            dayCareCenterRegistrationRequest.setVendredi(getVendredi().modelToXml());
      
        return dayCareCenterRegistrationRequestDoc;
    }

    @Override
    public final DayCareCenterRegistrationRequestDocument.DayCareCenterRegistrationRequest modelToXmlRequest() {
        return modelToXml().getDayCareCenterRegistrationRequest();
    }

    public static DayCareCenterRegistrationRequest xmlToModel(DayCareCenterRegistrationRequestDocument dayCareCenterRegistrationRequestDoc) {
        DayCareCenterRegistrationRequestDocument.DayCareCenterRegistrationRequest dayCareCenterRegistrationRequestXml = dayCareCenterRegistrationRequestDoc.getDayCareCenterRegistrationRequest();
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        DayCareCenterRegistrationRequest dayCareCenterRegistrationRequest = new DayCareCenterRegistrationRequest();
        dayCareCenterRegistrationRequest.fillCommonModelInfo(dayCareCenterRegistrationRequest, dayCareCenterRegistrationRequestXml);
        
        dayCareCenterRegistrationRequest.setAccueilAnterieur(dayCareCenterRegistrationRequestXml.getAccueilAnterieur());
      
        if (dayCareCenterRegistrationRequestXml.getChoixHorairesAccueil() != null)
            dayCareCenterRegistrationRequest.setChoixHorairesAccueil(fr.cg95.cvq.business.request.school.ChoixHorairesAccueilType.forString(dayCareCenterRegistrationRequestXml.getChoixHorairesAccueil().toString()));
        else
            dayCareCenterRegistrationRequest.setChoixHorairesAccueil(fr.cg95.cvq.business.request.school.ChoixHorairesAccueilType.getDefaultChoixHorairesAccueilType());
      
        if (dayCareCenterRegistrationRequestXml.getChoixTypeRendezVous() != null)
            dayCareCenterRegistrationRequest.setChoixTypeRendezVous(fr.cg95.cvq.business.request.school.RendezVousType.forString(dayCareCenterRegistrationRequestXml.getChoixTypeRendezVous().toString()));
        else
            dayCareCenterRegistrationRequest.setChoixTypeRendezVous(fr.cg95.cvq.business.request.school.RendezVousType.getDefaultRendezVousType());
      
        dayCareCenterRegistrationRequest.setCommentaireCitoyen(dayCareCenterRegistrationRequestXml.getCommentaireCitoyen());
      
        if (dayCareCenterRegistrationRequestXml.getDatePlacementAccueilRegulier() != null)
            dayCareCenterRegistrationRequest.setDatePlacementAccueilRegulier(DccrrDatesPlacement.xmlToModel(dayCareCenterRegistrationRequestXml.getDatePlacementAccueilRegulier()));
      
        calendar = dayCareCenterRegistrationRequestXml.getDatePlacementAccueilRegulier().getDatePlacementDebut();
        if (calendar != null) {
            dayCareCenterRegistrationRequest.setDatePlacementDebut(calendar.getTime());
        }
      
        calendar = dayCareCenterRegistrationRequestXml.getDatePlacementAccueilRegulier().getDatePlacementFin();
        if (calendar != null) {
            dayCareCenterRegistrationRequest.setDatePlacementFin(calendar.getTime());
        }
      
        calendar = dayCareCenterRegistrationRequestXml.getDatePlacementAccueilRegulier().getDatePlacementDebut();
        if (calendar != null) {
            dayCareCenterRegistrationRequest.setDatePlacementDebut(calendar.getTime());
        }
      
        calendar = dayCareCenterRegistrationRequestXml.getDixHuitMoisEnfant();
        if (calendar != null) {
            dayCareCenterRegistrationRequest.setDixHuitMoisEnfant(calendar.getTime());
        }
      
        if (dayCareCenterRegistrationRequestXml.getInformationMere() != null)
            dayCareCenterRegistrationRequest.setInformationMere(DccrrMere.xmlToModel(dayCareCenterRegistrationRequestXml.getInformationMere()));
      
        if (dayCareCenterRegistrationRequestXml.getInformationPere() != null)
            dayCareCenterRegistrationRequest.setInformationPere(DccrrPere.xmlToModel(dayCareCenterRegistrationRequestXml.getInformationPere()));
      
        if (dayCareCenterRegistrationRequestXml.getJeudi() != null)
            dayCareCenterRegistrationRequest.setJeudi(DccrrPlageHoraireJeudi.xmlToModel(dayCareCenterRegistrationRequestXml.getJeudi()));
      
        if (dayCareCenterRegistrationRequestXml.getLundi() != null)
            dayCareCenterRegistrationRequest.setLundi(DccrrPlageHoraireLundi.xmlToModel(dayCareCenterRegistrationRequestXml.getLundi()));
      
        if (dayCareCenterRegistrationRequestXml.getMardi() != null)
            dayCareCenterRegistrationRequest.setMardi(DccrrPlageHoraireMardi.xmlToModel(dayCareCenterRegistrationRequestXml.getMardi()));
      
        if (dayCareCenterRegistrationRequestXml.getMercredi() != null)
            dayCareCenterRegistrationRequest.setMercredi(DccrrPlageHoraireMercredi.xmlToModel(dayCareCenterRegistrationRequestXml.getMercredi()));
      
        dayCareCenterRegistrationRequest.setModeAccueil(Boolean.valueOf(dayCareCenterRegistrationRequestXml.getModeAccueil()));
      
        if (dayCareCenterRegistrationRequestXml.getModeAccueilChoixDeux() != null)
            dayCareCenterRegistrationRequest.setModeAccueilChoixDeux(fr.cg95.cvq.business.request.school.ModeAccueilType.forString(dayCareCenterRegistrationRequestXml.getModeAccueilChoixDeux().toString()));
        else
            dayCareCenterRegistrationRequest.setModeAccueilChoixDeux(fr.cg95.cvq.business.request.school.ModeAccueilType.getDefaultModeAccueilType());
      
        if (dayCareCenterRegistrationRequestXml.getModeAccueilChoixUn() != null)
            dayCareCenterRegistrationRequest.setModeAccueilChoixUn(fr.cg95.cvq.business.request.school.ModeAccueilType.forString(dayCareCenterRegistrationRequestXml.getModeAccueilChoixUn().toString()));
        else
            dayCareCenterRegistrationRequest.setModeAccueilChoixUn(fr.cg95.cvq.business.request.school.ModeAccueilType.getDefaultModeAccueilType());
      
        if (dayCareCenterRegistrationRequestXml.getPlageHoraireAccueilReguliere() != null)
            dayCareCenterRegistrationRequest.setPlageHoraireAccueilReguliere(DccrrPlageHoraire.xmlToModel(dayCareCenterRegistrationRequestXml.getPlageHoraireAccueilReguliere()));
      
        if (dayCareCenterRegistrationRequestXml.getPlageHoraireContact() != null)
            dayCareCenterRegistrationRequest.setPlageHoraireContact(fr.cg95.cvq.business.request.school.PlageHoraireContactType.forString(dayCareCenterRegistrationRequestXml.getPlageHoraireContact().toString()));
        else
            dayCareCenterRegistrationRequest.setPlageHoraireContact(fr.cg95.cvq.business.request.school.PlageHoraireContactType.getDefaultPlageHoraireContactType());
      
        dayCareCenterRegistrationRequest.setTelephoneContact(dayCareCenterRegistrationRequestXml.getTelephoneContact());
      
        if (dayCareCenterRegistrationRequestXml.getVendredi() != null)
            dayCareCenterRegistrationRequest.setVendredi(DccrrPlageHoraireVendredi.xmlToModel(dayCareCenterRegistrationRequestXml.getVendredi()));
      
        return dayCareCenterRegistrationRequest;
    }

    @Override
    public DayCareCenterRegistrationRequest clone() {
        DayCareCenterRegistrationRequest clone = new DayCareCenterRegistrationRequest(getRequestData().clone(), dayCareCenterRegistrationRequestData.clone());
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
          clone.getStepStates().put("accueil", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("rendezVous", stepState);
        
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

  
    public final void setAccueilAnterieur(final String accueilAnterieur) {
        dayCareCenterRegistrationRequestData.setAccueilAnterieur(accueilAnterieur);
    }

    
    public final String getAccueilAnterieur() {
        return dayCareCenterRegistrationRequestData.getAccueilAnterieur();
    }
  
    public final void setChoixHorairesAccueil(final fr.cg95.cvq.business.request.school.ChoixHorairesAccueilType choixHorairesAccueil) {
        dayCareCenterRegistrationRequestData.setChoixHorairesAccueil(choixHorairesAccueil);
    }

    
    public final fr.cg95.cvq.business.request.school.ChoixHorairesAccueilType getChoixHorairesAccueil() {
        return dayCareCenterRegistrationRequestData.getChoixHorairesAccueil();
    }
  
    public final void setChoixTypeRendezVous(final fr.cg95.cvq.business.request.school.RendezVousType choixTypeRendezVous) {
        dayCareCenterRegistrationRequestData.setChoixTypeRendezVous(choixTypeRendezVous);
    }

    
    public final fr.cg95.cvq.business.request.school.RendezVousType getChoixTypeRendezVous() {
        return dayCareCenterRegistrationRequestData.getChoixTypeRendezVous();
    }
  
    public final void setCommentaireCitoyen(final String commentaireCitoyen) {
        dayCareCenterRegistrationRequestData.setCommentaireCitoyen(commentaireCitoyen);
    }

    
    public final String getCommentaireCitoyen() {
        return dayCareCenterRegistrationRequestData.getCommentaireCitoyen();
    }
  
    public final void setDatePlacementAccueilRegulier(final fr.cg95.cvq.business.request.school.DccrrDatesPlacement datePlacementAccueilRegulier) {
        dayCareCenterRegistrationRequestData.setDatePlacementAccueilRegulier(datePlacementAccueilRegulier);
    }

    
    public final fr.cg95.cvq.business.request.school.DccrrDatesPlacement getDatePlacementAccueilRegulier() {
        return dayCareCenterRegistrationRequestData.getDatePlacementAccueilRegulier();
    }
  
    public final void setDixHuitMoisEnfant(final java.util.Date dixHuitMoisEnfant) {
        dayCareCenterRegistrationRequestData.setDixHuitMoisEnfant(dixHuitMoisEnfant);
    }

    
    public final java.util.Date getDixHuitMoisEnfant() {
        return dayCareCenterRegistrationRequestData.getDixHuitMoisEnfant();
    }
  
    public final void setInformationMere(final fr.cg95.cvq.business.request.school.DccrrMere informationMere) {
        dayCareCenterRegistrationRequestData.setInformationMere(informationMere);
    }

    
    public final fr.cg95.cvq.business.request.school.DccrrMere getInformationMere() {
        return dayCareCenterRegistrationRequestData.getInformationMere();
    }
  
    public final void setInformationPere(final fr.cg95.cvq.business.request.school.DccrrPere informationPere) {
        dayCareCenterRegistrationRequestData.setInformationPere(informationPere);
    }

    
    public final fr.cg95.cvq.business.request.school.DccrrPere getInformationPere() {
        return dayCareCenterRegistrationRequestData.getInformationPere();
    }
  
    public final void setJeudi(final fr.cg95.cvq.business.request.school.DccrrPlageHoraireJeudi jeudi) {
        dayCareCenterRegistrationRequestData.setJeudi(jeudi);
    }

    
    public final fr.cg95.cvq.business.request.school.DccrrPlageHoraireJeudi getJeudi() {
        return dayCareCenterRegistrationRequestData.getJeudi();
    }
  
    public final void setLundi(final fr.cg95.cvq.business.request.school.DccrrPlageHoraireLundi lundi) {
        dayCareCenterRegistrationRequestData.setLundi(lundi);
    }

    
    public final fr.cg95.cvq.business.request.school.DccrrPlageHoraireLundi getLundi() {
        return dayCareCenterRegistrationRequestData.getLundi();
    }
  
    public final void setMardi(final fr.cg95.cvq.business.request.school.DccrrPlageHoraireMardi mardi) {
        dayCareCenterRegistrationRequestData.setMardi(mardi);
    }

    
    public final fr.cg95.cvq.business.request.school.DccrrPlageHoraireMardi getMardi() {
        return dayCareCenterRegistrationRequestData.getMardi();
    }
  
    public final void setMercredi(final fr.cg95.cvq.business.request.school.DccrrPlageHoraireMercredi mercredi) {
        dayCareCenterRegistrationRequestData.setMercredi(mercredi);
    }

    
    public final fr.cg95.cvq.business.request.school.DccrrPlageHoraireMercredi getMercredi() {
        return dayCareCenterRegistrationRequestData.getMercredi();
    }
  
    public final void setModeAccueil(final Boolean modeAccueil) {
        dayCareCenterRegistrationRequestData.setModeAccueil(modeAccueil);
    }

    
    public final Boolean getModeAccueil() {
        return dayCareCenterRegistrationRequestData.getModeAccueil();
    }
  
    public final void setModeAccueilChoixDeux(final fr.cg95.cvq.business.request.school.ModeAccueilType modeAccueilChoixDeux) {
        dayCareCenterRegistrationRequestData.setModeAccueilChoixDeux(modeAccueilChoixDeux);
    }

    
    public final fr.cg95.cvq.business.request.school.ModeAccueilType getModeAccueilChoixDeux() {
        return dayCareCenterRegistrationRequestData.getModeAccueilChoixDeux();
    }
  
    public final void setModeAccueilChoixUn(final fr.cg95.cvq.business.request.school.ModeAccueilType modeAccueilChoixUn) {
        dayCareCenterRegistrationRequestData.setModeAccueilChoixUn(modeAccueilChoixUn);
    }

    
    public final fr.cg95.cvq.business.request.school.ModeAccueilType getModeAccueilChoixUn() {
        return dayCareCenterRegistrationRequestData.getModeAccueilChoixUn();
    }
  
    public final void setPlageHoraireAccueilReguliere(final fr.cg95.cvq.business.request.school.DccrrPlageHoraire plageHoraireAccueilReguliere) {
        dayCareCenterRegistrationRequestData.setPlageHoraireAccueilReguliere(plageHoraireAccueilReguliere);
    }

    
    public final fr.cg95.cvq.business.request.school.DccrrPlageHoraire getPlageHoraireAccueilReguliere() {
        return dayCareCenterRegistrationRequestData.getPlageHoraireAccueilReguliere();
    }
  
    public final void setPlageHoraireContact(final fr.cg95.cvq.business.request.school.PlageHoraireContactType plageHoraireContact) {
        dayCareCenterRegistrationRequestData.setPlageHoraireContact(plageHoraireContact);
    }

    
    public final fr.cg95.cvq.business.request.school.PlageHoraireContactType getPlageHoraireContact() {
        return dayCareCenterRegistrationRequestData.getPlageHoraireContact();
    }
  
    public final void setTelephoneContact(final String telephoneContact) {
        dayCareCenterRegistrationRequestData.setTelephoneContact(telephoneContact);
    }

    
    public final String getTelephoneContact() {
        return dayCareCenterRegistrationRequestData.getTelephoneContact();
    }
  
    public final void setVendredi(final fr.cg95.cvq.business.request.school.DccrrPlageHoraireVendredi vendredi) {
        dayCareCenterRegistrationRequestData.setVendredi(vendredi);
    }

    
    public final fr.cg95.cvq.business.request.school.DccrrPlageHoraireVendredi getVendredi() {
        return dayCareCenterRegistrationRequestData.getVendredi();
    }
  
}
