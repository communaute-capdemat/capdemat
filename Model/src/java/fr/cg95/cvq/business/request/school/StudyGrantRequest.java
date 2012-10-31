
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
public class StudyGrantRequest extends Request implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions = StudyGrantRequestData.conditions;

    @AssertValid(message = "")
    private StudyGrantRequestData studyGrantRequestData;

    public StudyGrantRequest(RequestData requestData, StudyGrantRequestData studyGrantRequestData) {
        super(requestData);
        this.studyGrantRequestData = studyGrantRequestData;
    }

    public StudyGrantRequest() {
        super();
        this.studyGrantRequestData = new StudyGrantRequestData();
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
          getStepStates().put("taxHousehold", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("otherHelps", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("currentStudies", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("bankReference", stepState);
        
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
    public StudyGrantRequestData getSpecificData() {
        return studyGrantRequestData;
    }

    /**
     * Reserved for RequestDAO !
     */
    public void setSpecificData(StudyGrantRequestData studyGrantRequestData) {
        this.studyGrantRequestData = studyGrantRequestData;
    }

    @Override
    public final String modelToXmlString() {
        StudyGrantRequestDocument object = this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    @Override
    public final StudyGrantRequestDocument modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        Date date = null;
        StudyGrantRequestDocument studyGrantRequestDoc = StudyGrantRequestDocument.Factory.newInstance();
        StudyGrantRequestDocument.StudyGrantRequest studyGrantRequest = studyGrantRequestDoc.addNewStudyGrantRequest();
        super.fillCommonXmlInfo(studyGrantRequest);
        int i = 0;
        
        date = getAccountHolderBirthDate();
        if (date != null) {
            calendar.setTime(date);
            studyGrantRequest.setAccountHolderBirthDate(calendar);
        }
      
        studyGrantRequest.setAccountHolderEdemandeId(getAccountHolderEdemandeId());
      
        studyGrantRequest.setAccountHolderFirstName(getAccountHolderFirstName());
      
        studyGrantRequest.setAccountHolderLastName(getAccountHolderLastName());
      
        if (getAccountHolderTitle() != null)
            studyGrantRequest.setAccountHolderTitle(fr.cg95.cvq.xml.common.TitleType.Enum.forString(getAccountHolderTitle().getLegacyLabel()));
      
        if (getAlevelsInformations() != null)
            studyGrantRequest.setAlevelsInformations(getAlevelsInformations().modelToXml());
      
        if (getBankAccount() != null)
            studyGrantRequest.setBankAccount(getBankAccount().modelToXml());
      
        if (getCurrentSchool() != null)
            studyGrantRequest.setCurrentSchool(getCurrentSchool().modelToXml());
      
        if (getCurrentStudiesInformations() != null)
            studyGrantRequest.setCurrentStudiesInformations(getCurrentStudiesInformations().modelToXml());
      
        if (getDistance() != null)
            studyGrantRequest.setDistance(fr.cg95.cvq.xml.request.school.DistanceType.Enum.forString(getDistance().getLegacyLabel()));
      
        studyGrantRequest.setEdemandeId(getEdemandeId());
      
        if (getHasCROUSHelp() != null)
            studyGrantRequest.setHasCROUSHelp(getHasCROUSHelp().booleanValue());
      
        if (getHasEuropeHelp() != null)
            studyGrantRequest.setHasEuropeHelp(getHasEuropeHelp().booleanValue());
      
        if (getHasOtherHelp() != null)
            studyGrantRequest.setHasOtherHelp(getHasOtherHelp().booleanValue());
      
        if (getHasRegionalCouncilHelp() != null)
            studyGrantRequest.setHasRegionalCouncilHelp(getHasRegionalCouncilHelp().booleanValue());
      
        if (getIsSubjectAccountHolder() != null)
            studyGrantRequest.setIsSubjectAccountHolder(getIsSubjectAccountHolder().booleanValue());
      
        if (getSubjectInformations() != null)
            studyGrantRequest.setSubjectInformations(getSubjectInformations().modelToXml());
      
        i = 0;
        if (getTaxHouseholdCity() != null) {
            fr.cg95.cvq.xml.common.LocalReferentialDataType[] taxHouseholdCityTypeTab = new fr.cg95.cvq.xml.common.LocalReferentialDataType[getTaxHouseholdCity().size()];
            for (LocalReferentialData object : getTaxHouseholdCity()) {
              taxHouseholdCityTypeTab[i++] = LocalReferentialData.modelToXml(object);
            }
            studyGrantRequest.setTaxHouseholdCityArray(taxHouseholdCityTypeTab);
        }
      
        studyGrantRequest.setTaxHouseholdCityPrecision(getTaxHouseholdCityPrecision());
      
        studyGrantRequest.setTaxHouseholdFirstName(getTaxHouseholdFirstName());
      
        if (getTaxHouseholdIncome() != null)
            studyGrantRequest.setTaxHouseholdIncome(getTaxHouseholdIncome().doubleValue());
      
        studyGrantRequest.setTaxHouseholdLastName(getTaxHouseholdLastName());
      
        return studyGrantRequestDoc;
    }

    @Override
    public final StudyGrantRequestDocument.StudyGrantRequest modelToXmlRequest() {
        return modelToXml().getStudyGrantRequest();
    }

    public static StudyGrantRequest xmlToModel(StudyGrantRequestDocument studyGrantRequestDoc) {
        StudyGrantRequestDocument.StudyGrantRequest studyGrantRequestXml = studyGrantRequestDoc.getStudyGrantRequest();
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        StudyGrantRequest studyGrantRequest = new StudyGrantRequest();
        studyGrantRequest.fillCommonModelInfo(studyGrantRequest, studyGrantRequestXml);
        
        calendar = studyGrantRequestXml.getAccountHolderBirthDate();
        if (calendar != null) {
            studyGrantRequest.setAccountHolderBirthDate(calendar.getTime());
        }
      
        studyGrantRequest.setAccountHolderEdemandeId(studyGrantRequestXml.getAccountHolderEdemandeId());
      
        studyGrantRequest.setAccountHolderFirstName(studyGrantRequestXml.getAccountHolderFirstName());
      
        studyGrantRequest.setAccountHolderLastName(studyGrantRequestXml.getAccountHolderLastName());
      
        if (studyGrantRequestXml.getAccountHolderTitle() != null)
            studyGrantRequest.setAccountHolderTitle(fr.cg95.cvq.business.users.TitleType.forString(studyGrantRequestXml.getAccountHolderTitle().toString()));
        else
            studyGrantRequest.setAccountHolderTitle(fr.cg95.cvq.business.users.TitleType.getDefaultTitleType());
      
        if (studyGrantRequestXml.getAlevelsInformations() != null)
            studyGrantRequest.setAlevelsInformations(ALevelsInformations.xmlToModel(studyGrantRequestXml.getAlevelsInformations()));
      
        if (studyGrantRequestXml.getBankAccount() != null)
            studyGrantRequest.setBankAccount(BankAccount.xmlToModel(studyGrantRequestXml.getBankAccount()));
      
        if (studyGrantRequestXml.getCurrentSchool() != null)
            studyGrantRequest.setCurrentSchool(SgrCurrentSchool.xmlToModel(studyGrantRequestXml.getCurrentSchool()));
      
        if (studyGrantRequestXml.getCurrentStudiesInformations() != null)
            studyGrantRequest.setCurrentStudiesInformations(CurrentStudiesInformations.xmlToModel(studyGrantRequestXml.getCurrentStudiesInformations()));
      
        if (studyGrantRequestXml.getDistance() != null)
            studyGrantRequest.setDistance(fr.cg95.cvq.business.request.school.DistanceType.forString(studyGrantRequestXml.getDistance().toString()));
        else
            studyGrantRequest.setDistance(fr.cg95.cvq.business.request.school.DistanceType.getDefaultDistanceType());
      
        studyGrantRequest.setEdemandeId(studyGrantRequestXml.getEdemandeId());
      
        studyGrantRequest.setHasCROUSHelp(Boolean.valueOf(studyGrantRequestXml.getHasCROUSHelp()));
      
        studyGrantRequest.setHasEuropeHelp(Boolean.valueOf(studyGrantRequestXml.getHasEuropeHelp()));
      
        studyGrantRequest.setHasOtherHelp(Boolean.valueOf(studyGrantRequestXml.getHasOtherHelp()));
      
        studyGrantRequest.setHasRegionalCouncilHelp(Boolean.valueOf(studyGrantRequestXml.getHasRegionalCouncilHelp()));
      
        studyGrantRequest.setIsSubjectAccountHolder(Boolean.valueOf(studyGrantRequestXml.getIsSubjectAccountHolder()));
      
        if (studyGrantRequestXml.getSubjectInformations() != null)
            studyGrantRequest.setSubjectInformations(SubjectInformations.xmlToModel(studyGrantRequestXml.getSubjectInformations()));
      
        List<fr.cg95.cvq.business.request.LocalReferentialData> taxHouseholdCityList = new ArrayList<fr.cg95.cvq.business.request.LocalReferentialData>(studyGrantRequestXml.sizeOfTaxHouseholdCityArray());
        for (LocalReferentialDataType object : studyGrantRequestXml.getTaxHouseholdCityArray()) {
            taxHouseholdCityList.add(fr.cg95.cvq.business.request.LocalReferentialData.xmlToModel(object));
        }
        studyGrantRequest.setTaxHouseholdCity(taxHouseholdCityList);
      
        studyGrantRequest.setTaxHouseholdCityPrecision(studyGrantRequestXml.getTaxHouseholdCityPrecision());
      
        studyGrantRequest.setTaxHouseholdFirstName(studyGrantRequestXml.getTaxHouseholdFirstName());
      
        studyGrantRequest.setTaxHouseholdIncome(new Double(studyGrantRequestXml.getTaxHouseholdIncome()));
      
        studyGrantRequest.setTaxHouseholdLastName(studyGrantRequestXml.getTaxHouseholdLastName());
      
        return studyGrantRequest;
    }

    @Override
    public StudyGrantRequest clone() {
        StudyGrantRequest clone = new StudyGrantRequest(getRequestData().clone(), studyGrantRequestData.clone());
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
          clone.getStepStates().put("taxHousehold", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("otherHelps", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("currentStudies", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("bankReference", stepState);
        
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

  
    public final void setAccountHolderBirthDate(final java.util.Date accountHolderBirthDate) {
        studyGrantRequestData.setAccountHolderBirthDate(accountHolderBirthDate);
    }

    
    public final java.util.Date getAccountHolderBirthDate() {
        return studyGrantRequestData.getAccountHolderBirthDate();
    }
  
    public final void setAccountHolderEdemandeId(final String accountHolderEdemandeId) {
        studyGrantRequestData.setAccountHolderEdemandeId(accountHolderEdemandeId);
    }

    
    public final String getAccountHolderEdemandeId() {
        return studyGrantRequestData.getAccountHolderEdemandeId();
    }
  
    public final void setAccountHolderFirstName(final String accountHolderFirstName) {
        studyGrantRequestData.setAccountHolderFirstName(accountHolderFirstName);
    }

    
    public final String getAccountHolderFirstName() {
        return studyGrantRequestData.getAccountHolderFirstName();
    }
  
    public final void setAccountHolderLastName(final String accountHolderLastName) {
        studyGrantRequestData.setAccountHolderLastName(accountHolderLastName);
    }

    
    public final String getAccountHolderLastName() {
        return studyGrantRequestData.getAccountHolderLastName();
    }
  
    public final void setAccountHolderTitle(final fr.cg95.cvq.business.users.TitleType accountHolderTitle) {
        studyGrantRequestData.setAccountHolderTitle(accountHolderTitle);
    }

    
    public final fr.cg95.cvq.business.users.TitleType getAccountHolderTitle() {
        return studyGrantRequestData.getAccountHolderTitle();
    }
  
    public final void setAlevelsInformations(final fr.cg95.cvq.business.request.school.ALevelsInformations alevelsInformations) {
        studyGrantRequestData.setAlevelsInformations(alevelsInformations);
    }

    
    public final fr.cg95.cvq.business.request.school.ALevelsInformations getAlevelsInformations() {
        return studyGrantRequestData.getAlevelsInformations();
    }
  
    public final void setBankAccount(final fr.cg95.cvq.business.users.BankAccount bankAccount) {
        studyGrantRequestData.setBankAccount(bankAccount);
    }

    
    public final fr.cg95.cvq.business.users.BankAccount getBankAccount() {
        return studyGrantRequestData.getBankAccount();
    }
  
    public final void setCurrentSchool(final fr.cg95.cvq.business.request.school.SgrCurrentSchool currentSchool) {
        studyGrantRequestData.setCurrentSchool(currentSchool);
    }

    
    public final fr.cg95.cvq.business.request.school.SgrCurrentSchool getCurrentSchool() {
        return studyGrantRequestData.getCurrentSchool();
    }
  
    public final void setCurrentStudiesInformations(final fr.cg95.cvq.business.request.school.CurrentStudiesInformations currentStudiesInformations) {
        studyGrantRequestData.setCurrentStudiesInformations(currentStudiesInformations);
    }

    
    public final fr.cg95.cvq.business.request.school.CurrentStudiesInformations getCurrentStudiesInformations() {
        return studyGrantRequestData.getCurrentStudiesInformations();
    }
  
    public final void setDistance(final fr.cg95.cvq.business.request.school.DistanceType distance) {
        studyGrantRequestData.setDistance(distance);
    }

    
    public final fr.cg95.cvq.business.request.school.DistanceType getDistance() {
        return studyGrantRequestData.getDistance();
    }
  
    public final void setEdemandeId(final String edemandeId) {
        studyGrantRequestData.setEdemandeId(edemandeId);
    }

    
    public final String getEdemandeId() {
        return studyGrantRequestData.getEdemandeId();
    }
  
    public final void setHasCROUSHelp(final Boolean hasCROUSHelp) {
        studyGrantRequestData.setHasCROUSHelp(hasCROUSHelp);
    }

    
    public final Boolean getHasCROUSHelp() {
        return studyGrantRequestData.getHasCROUSHelp();
    }
  
    public final void setHasEuropeHelp(final Boolean hasEuropeHelp) {
        studyGrantRequestData.setHasEuropeHelp(hasEuropeHelp);
    }

    
    public final Boolean getHasEuropeHelp() {
        return studyGrantRequestData.getHasEuropeHelp();
    }
  
    public final void setHasOtherHelp(final Boolean hasOtherHelp) {
        studyGrantRequestData.setHasOtherHelp(hasOtherHelp);
    }

    
    public final Boolean getHasOtherHelp() {
        return studyGrantRequestData.getHasOtherHelp();
    }
  
    public final void setHasRegionalCouncilHelp(final Boolean hasRegionalCouncilHelp) {
        studyGrantRequestData.setHasRegionalCouncilHelp(hasRegionalCouncilHelp);
    }

    
    public final Boolean getHasRegionalCouncilHelp() {
        return studyGrantRequestData.getHasRegionalCouncilHelp();
    }
  
    public final void setIsSubjectAccountHolder(final Boolean isSubjectAccountHolder) {
        studyGrantRequestData.setIsSubjectAccountHolder(isSubjectAccountHolder);
    }

    
    public final Boolean getIsSubjectAccountHolder() {
        return studyGrantRequestData.getIsSubjectAccountHolder();
    }
  
    public final void setSubjectInformations(final fr.cg95.cvq.business.request.school.SubjectInformations subjectInformations) {
        studyGrantRequestData.setSubjectInformations(subjectInformations);
    }

    
    public final fr.cg95.cvq.business.request.school.SubjectInformations getSubjectInformations() {
        return studyGrantRequestData.getSubjectInformations();
    }
  
    public final void setTaxHouseholdCity(final List<fr.cg95.cvq.business.request.LocalReferentialData> taxHouseholdCity) {
        studyGrantRequestData.setTaxHouseholdCity(taxHouseholdCity);
    }

    
    public final List<fr.cg95.cvq.business.request.LocalReferentialData> getTaxHouseholdCity() {
        return studyGrantRequestData.getTaxHouseholdCity();
    }
  
    public final void setTaxHouseholdCityPrecision(final String taxHouseholdCityPrecision) {
        studyGrantRequestData.setTaxHouseholdCityPrecision(taxHouseholdCityPrecision);
    }

    
    public final String getTaxHouseholdCityPrecision() {
        return studyGrantRequestData.getTaxHouseholdCityPrecision();
    }
  
    public final void setTaxHouseholdFirstName(final String taxHouseholdFirstName) {
        studyGrantRequestData.setTaxHouseholdFirstName(taxHouseholdFirstName);
    }

    
    public final String getTaxHouseholdFirstName() {
        return studyGrantRequestData.getTaxHouseholdFirstName();
    }
  
    public final void setTaxHouseholdIncome(final Double taxHouseholdIncome) {
        studyGrantRequestData.setTaxHouseholdIncome(taxHouseholdIncome);
    }

    
    public final Double getTaxHouseholdIncome() {
        return studyGrantRequestData.getTaxHouseholdIncome();
    }
  
    public final void setTaxHouseholdLastName(final String taxHouseholdLastName) {
        studyGrantRequestData.setTaxHouseholdLastName(taxHouseholdLastName);
    }

    
    public final String getTaxHouseholdLastName() {
        return studyGrantRequestData.getTaxHouseholdLastName();
    }
  
}
