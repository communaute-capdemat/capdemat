
package fr.cg95.cvq.business.request.election;

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
import fr.cg95.cvq.xml.request.election.*;
import fr.cg95.cvq.service.request.condition.IConditionChecker;

/**
 * Generated class file, do not edit !
 */
public class StandardElectoralRollRegistrationRequest extends Request implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions = StandardElectoralRollRegistrationRequestData.conditions;

    @AssertValid(message = "")
    private StandardElectoralRollRegistrationRequestData standardElectoralRollRegistrationRequestData;

    public StandardElectoralRollRegistrationRequest(RequestData requestData, StandardElectoralRollRegistrationRequestData standardElectoralRollRegistrationRequestData) {
        super(requestData);
        this.standardElectoralRollRegistrationRequestData = standardElectoralRollRegistrationRequestData;
    }

    public StandardElectoralRollRegistrationRequest() {
        super();
        this.standardElectoralRollRegistrationRequestData = new StandardElectoralRollRegistrationRequestData();
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("inscription", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("situation", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("radiation", stepState);
        
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
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("administration", stepState);
        
    }

    /**
     * Reserved for RequestDAO !
     */
    @Override
    public StandardElectoralRollRegistrationRequestData getSpecificData() {
        return standardElectoralRollRegistrationRequestData;
    }

    /**
     * Reserved for RequestDAO !
     */
    public void setSpecificData(StandardElectoralRollRegistrationRequestData standardElectoralRollRegistrationRequestData) {
        this.standardElectoralRollRegistrationRequestData = standardElectoralRollRegistrationRequestData;
    }

    @Override
    public final String modelToXmlString() {
        StandardElectoralRollRegistrationRequestDocument object = this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    @Override
    public final StandardElectoralRollRegistrationRequestDocument modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        Date date = null;
        StandardElectoralRollRegistrationRequestDocument standardElectoralRollRegistrationRequestDoc = StandardElectoralRollRegistrationRequestDocument.Factory.newInstance();
        StandardElectoralRollRegistrationRequestDocument.StandardElectoralRollRegistrationRequest standardElectoralRollRegistrationRequest = standardElectoralRollRegistrationRequestDoc.addNewStandardElectoralRollRegistrationRequest();
        super.fillCommonXmlInfo(standardElectoralRollRegistrationRequest);
        int i = 0;
        
        standardElectoralRollRegistrationRequest.setAmbassadeOuPosteConsulaire(getAmbassadeOuPosteConsulaire());
      
        date = getDateNaissance();
        if (date != null) {
            calendar.setTime(date);
            standardElectoralRollRegistrationRequest.setDateNaissance(calendar);
        }
      
        standardElectoralRollRegistrationRequest.setDeuxiemePrenom(getDeuxiemePrenom());
      
        if (getFieldsetEstUnionEuropeenne() != null)
            standardElectoralRollRegistrationRequest.setFieldsetEstUnionEuropeenne(getFieldsetEstUnionEuropeenne().modelToXml());
      
        if (getLieuNaissance() != null)
            standardElectoralRollRegistrationRequest.setLieuNaissance(getLieuNaissance().modelToXml());
      
        if (getNationalite() != null)
            standardElectoralRollRegistrationRequest.setNationalite(fr.cg95.cvq.xml.request.election.SerrrNationaliteType.Enum.forString(getNationalite().getLegacyLabel()));
      
        standardElectoralRollRegistrationRequest.setNomMarital(getNomMarital());
      
        standardElectoralRollRegistrationRequest.setNomNaissance(getNomNaissance());
      
        if (getPaysRadiation() != null)
            standardElectoralRollRegistrationRequest.setPaysRadiation(fr.cg95.cvq.xml.common.CountryType.Enum.forString(getPaysRadiation().getLegacyLabel()));
      
        if (getPrecedentLieuInscription() != null)
            standardElectoralRollRegistrationRequest.setPrecedentLieuInscription(getPrecedentLieuInscription().modelToXml());
      
        standardElectoralRollRegistrationRequest.setPrenom(getPrenom());
      
        if (getSexe() != null)
            standardElectoralRollRegistrationRequest.setSexe(fr.cg95.cvq.xml.request.election.SerrrSexeType.Enum.forString(getSexe().getLegacyLabel()));
      
        if (getSituation() != null)
            standardElectoralRollRegistrationRequest.setSituation(fr.cg95.cvq.xml.request.election.SerrrSituationType.Enum.forString(getSituation().getLegacyLabel()));
      
        standardElectoralRollRegistrationRequest.setTroisiemePrenom(getTroisiemePrenom());
      
        if (getTypeInscription() != null)
            standardElectoralRollRegistrationRequest.setTypeInscription(fr.cg95.cvq.xml.request.election.SerrrTypeInscriptionType.Enum.forString(getTypeInscription().getLegacyLabel()));
      
        return standardElectoralRollRegistrationRequestDoc;
    }

    @Override
    public final StandardElectoralRollRegistrationRequestDocument.StandardElectoralRollRegistrationRequest modelToXmlRequest() {
        return modelToXml().getStandardElectoralRollRegistrationRequest();
    }

    public static StandardElectoralRollRegistrationRequest xmlToModel(StandardElectoralRollRegistrationRequestDocument standardElectoralRollRegistrationRequestDoc) {
        StandardElectoralRollRegistrationRequestDocument.StandardElectoralRollRegistrationRequest standardElectoralRollRegistrationRequestXml = standardElectoralRollRegistrationRequestDoc.getStandardElectoralRollRegistrationRequest();
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        StandardElectoralRollRegistrationRequest standardElectoralRollRegistrationRequest = new StandardElectoralRollRegistrationRequest();
        standardElectoralRollRegistrationRequest.fillCommonModelInfo(standardElectoralRollRegistrationRequest, standardElectoralRollRegistrationRequestXml);
        
        standardElectoralRollRegistrationRequest.setAmbassadeOuPosteConsulaire(standardElectoralRollRegistrationRequestXml.getAmbassadeOuPosteConsulaire());
      
        calendar = standardElectoralRollRegistrationRequestXml.getDateNaissance();
        if (calendar != null) {
            standardElectoralRollRegistrationRequest.setDateNaissance(calendar.getTime());
        }
      
        standardElectoralRollRegistrationRequest.setDeuxiemePrenom(standardElectoralRollRegistrationRequestXml.getDeuxiemePrenom());
      
        if (standardElectoralRollRegistrationRequestXml.getFieldsetEstUnionEuropeenne() != null)
            standardElectoralRollRegistrationRequest.setFieldsetEstUnionEuropeenne(SerrrFieldsetEstUnionEuropeenne.xmlToModel(standardElectoralRollRegistrationRequestXml.getFieldsetEstUnionEuropeenne()));
      
        if (standardElectoralRollRegistrationRequestXml.getLieuNaissance() != null)
            standardElectoralRollRegistrationRequest.setLieuNaissance(SerrrLieuNaissance.xmlToModel(standardElectoralRollRegistrationRequestXml.getLieuNaissance()));
      
        if (standardElectoralRollRegistrationRequestXml.getNationalite() != null)
            standardElectoralRollRegistrationRequest.setNationalite(fr.cg95.cvq.business.request.election.SerrrNationaliteType.forString(standardElectoralRollRegistrationRequestXml.getNationalite().toString()));
        else
            standardElectoralRollRegistrationRequest.setNationalite(fr.cg95.cvq.business.request.election.SerrrNationaliteType.getDefaultSerrrNationaliteType());
      
        standardElectoralRollRegistrationRequest.setNomMarital(standardElectoralRollRegistrationRequestXml.getNomMarital());
      
        standardElectoralRollRegistrationRequest.setNomNaissance(standardElectoralRollRegistrationRequestXml.getNomNaissance());
      
        if (standardElectoralRollRegistrationRequestXml.getPaysRadiation() != null)
            standardElectoralRollRegistrationRequest.setPaysRadiation(fr.cg95.cvq.business.users.CountryType.forString(standardElectoralRollRegistrationRequestXml.getPaysRadiation().toString()));
        else
            standardElectoralRollRegistrationRequest.setPaysRadiation(fr.cg95.cvq.business.users.CountryType.getDefaultCountryType());
      
        if (standardElectoralRollRegistrationRequestXml.getPrecedentLieuInscription() != null)
            standardElectoralRollRegistrationRequest.setPrecedentLieuInscription(SerrrPrecedentLieuInscription.xmlToModel(standardElectoralRollRegistrationRequestXml.getPrecedentLieuInscription()));
      
        standardElectoralRollRegistrationRequest.setPrenom(standardElectoralRollRegistrationRequestXml.getPrenom());
      
        if (standardElectoralRollRegistrationRequestXml.getSexe() != null)
            standardElectoralRollRegistrationRequest.setSexe(fr.cg95.cvq.business.request.election.SerrrSexeType.forString(standardElectoralRollRegistrationRequestXml.getSexe().toString()));
        else
            standardElectoralRollRegistrationRequest.setSexe(fr.cg95.cvq.business.request.election.SerrrSexeType.getDefaultSerrrSexeType());
      
        if (standardElectoralRollRegistrationRequestXml.getSituation() != null)
            standardElectoralRollRegistrationRequest.setSituation(fr.cg95.cvq.business.request.election.SerrrSituationType.forString(standardElectoralRollRegistrationRequestXml.getSituation().toString()));
        else
            standardElectoralRollRegistrationRequest.setSituation(fr.cg95.cvq.business.request.election.SerrrSituationType.getDefaultSerrrSituationType());
      
        standardElectoralRollRegistrationRequest.setTroisiemePrenom(standardElectoralRollRegistrationRequestXml.getTroisiemePrenom());
      
        if (standardElectoralRollRegistrationRequestXml.getTypeInscription() != null)
            standardElectoralRollRegistrationRequest.setTypeInscription(fr.cg95.cvq.business.request.election.SerrrTypeInscriptionType.forString(standardElectoralRollRegistrationRequestXml.getTypeInscription().toString()));
        else
            standardElectoralRollRegistrationRequest.setTypeInscription(fr.cg95.cvq.business.request.election.SerrrTypeInscriptionType.getDefaultSerrrTypeInscriptionType());
      
        return standardElectoralRollRegistrationRequest;
    }

    @Override
    public StandardElectoralRollRegistrationRequest clone() {
        StandardElectoralRollRegistrationRequest clone = new StandardElectoralRollRegistrationRequest(getRequestData().clone(), standardElectoralRollRegistrationRequestData.clone());
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("inscription", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("situation", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("radiation", stepState);
        
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
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("administration", stepState);
        
        return clone;
    }

  
    public final void setAmbassadeOuPosteConsulaire(final String ambassadeOuPosteConsulaire) {
        standardElectoralRollRegistrationRequestData.setAmbassadeOuPosteConsulaire(ambassadeOuPosteConsulaire);
    }

    
    public final String getAmbassadeOuPosteConsulaire() {
        return standardElectoralRollRegistrationRequestData.getAmbassadeOuPosteConsulaire();
    }
  
    public final void setDateNaissance(final java.util.Date dateNaissance) {
        standardElectoralRollRegistrationRequestData.setDateNaissance(dateNaissance);
    }

    
    public final java.util.Date getDateNaissance() {
        return standardElectoralRollRegistrationRequestData.getDateNaissance();
    }
  
    public final void setDeuxiemePrenom(final String deuxiemePrenom) {
        standardElectoralRollRegistrationRequestData.setDeuxiemePrenom(deuxiemePrenom);
    }

    
    public final String getDeuxiemePrenom() {
        return standardElectoralRollRegistrationRequestData.getDeuxiemePrenom();
    }
  
    public final void setFieldsetEstUnionEuropeenne(final fr.cg95.cvq.business.request.election.SerrrFieldsetEstUnionEuropeenne fieldsetEstUnionEuropeenne) {
        standardElectoralRollRegistrationRequestData.setFieldsetEstUnionEuropeenne(fieldsetEstUnionEuropeenne);
    }

    
    public final fr.cg95.cvq.business.request.election.SerrrFieldsetEstUnionEuropeenne getFieldsetEstUnionEuropeenne() {
        return standardElectoralRollRegistrationRequestData.getFieldsetEstUnionEuropeenne();
    }
  
    public final void setLieuNaissance(final fr.cg95.cvq.business.request.election.SerrrLieuNaissance lieuNaissance) {
        standardElectoralRollRegistrationRequestData.setLieuNaissance(lieuNaissance);
    }

    
    public final fr.cg95.cvq.business.request.election.SerrrLieuNaissance getLieuNaissance() {
        return standardElectoralRollRegistrationRequestData.getLieuNaissance();
    }
  
    public final void setNationalite(final fr.cg95.cvq.business.request.election.SerrrNationaliteType nationalite) {
        standardElectoralRollRegistrationRequestData.setNationalite(nationalite);
    }

    
    public final fr.cg95.cvq.business.request.election.SerrrNationaliteType getNationalite() {
        return standardElectoralRollRegistrationRequestData.getNationalite();
    }
  
    public final void setNomMarital(final String nomMarital) {
        standardElectoralRollRegistrationRequestData.setNomMarital(nomMarital);
    }

    
    public final String getNomMarital() {
        return standardElectoralRollRegistrationRequestData.getNomMarital();
    }
  
    public final void setNomNaissance(final String nomNaissance) {
        standardElectoralRollRegistrationRequestData.setNomNaissance(nomNaissance);
    }

    
    public final String getNomNaissance() {
        return standardElectoralRollRegistrationRequestData.getNomNaissance();
    }
  
    public final void setPaysRadiation(final fr.cg95.cvq.business.users.CountryType paysRadiation) {
        standardElectoralRollRegistrationRequestData.setPaysRadiation(paysRadiation);
    }

    
    public final fr.cg95.cvq.business.users.CountryType getPaysRadiation() {
        return standardElectoralRollRegistrationRequestData.getPaysRadiation();
    }
  
    public final void setPrecedentLieuInscription(final fr.cg95.cvq.business.request.election.SerrrPrecedentLieuInscription precedentLieuInscription) {
        standardElectoralRollRegistrationRequestData.setPrecedentLieuInscription(precedentLieuInscription);
    }

    
    public final fr.cg95.cvq.business.request.election.SerrrPrecedentLieuInscription getPrecedentLieuInscription() {
        return standardElectoralRollRegistrationRequestData.getPrecedentLieuInscription();
    }
  
    public final void setPrenom(final String prenom) {
        standardElectoralRollRegistrationRequestData.setPrenom(prenom);
    }

    
    public final String getPrenom() {
        return standardElectoralRollRegistrationRequestData.getPrenom();
    }
  
    public final void setSexe(final fr.cg95.cvq.business.request.election.SerrrSexeType sexe) {
        standardElectoralRollRegistrationRequestData.setSexe(sexe);
    }

    
    public final fr.cg95.cvq.business.request.election.SerrrSexeType getSexe() {
        return standardElectoralRollRegistrationRequestData.getSexe();
    }
  
    public final void setSituation(final fr.cg95.cvq.business.request.election.SerrrSituationType situation) {
        standardElectoralRollRegistrationRequestData.setSituation(situation);
    }

    
    public final fr.cg95.cvq.business.request.election.SerrrSituationType getSituation() {
        return standardElectoralRollRegistrationRequestData.getSituation();
    }
  
    public final void setTroisiemePrenom(final String troisiemePrenom) {
        standardElectoralRollRegistrationRequestData.setTroisiemePrenom(troisiemePrenom);
    }

    
    public final String getTroisiemePrenom() {
        return standardElectoralRollRegistrationRequestData.getTroisiemePrenom();
    }
  
    public final void setTypeInscription(final fr.cg95.cvq.business.request.election.SerrrTypeInscriptionType typeInscription) {
        standardElectoralRollRegistrationRequestData.setTypeInscription(typeInscription);
    }

    
    public final fr.cg95.cvq.business.request.election.SerrrTypeInscriptionType getTypeInscription() {
        return standardElectoralRollRegistrationRequestData.getTypeInscription();
    }
  
}
