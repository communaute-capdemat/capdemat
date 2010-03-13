
package fr.cg95.cvq.business.request.military;

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
import fr.cg95.cvq.xml.request.military.*;
import fr.cg95.cvq.service.request.condition.IConditionChecker;

/**
 * Generated class file, do not edit !
 */
public class MilitaryCensusRequest extends Request implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions = MilitaryCensusRequestData.conditions;

    @AssertValid(message = "")
    private MilitaryCensusRequestData militaryCensusRequestData;

    public MilitaryCensusRequest(RequestData requestData, MilitaryCensusRequestData militaryCensusRequestData) {
        super(requestData);
        this.militaryCensusRequestData = militaryCensusRequestData;
    }

    public MilitaryCensusRequest() {
        super();
        this.militaryCensusRequestData = new MilitaryCensusRequestData();
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("census", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("parentage", stepState);
        
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
          getStepStates().put("exemption", stepState);
        
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
    public MilitaryCensusRequestData getSpecificData() {
        return militaryCensusRequestData;
    }

    /**
     * Reserved for RequestDAO !
     */
    public void setSpecificData(MilitaryCensusRequestData militaryCensusRequestData) {
        this.militaryCensusRequestData = militaryCensusRequestData;
    }

    @Override
    public final String modelToXmlString() {
        MilitaryCensusRequestDocument object = this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    @Override
    public final MilitaryCensusRequestDocument modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        Date date = null;
        MilitaryCensusRequestDocument militaryCensusRequestDoc = MilitaryCensusRequestDocument.Factory.newInstance();
        MilitaryCensusRequestDocument.MilitaryCensusRequest militaryCensusRequest = militaryCensusRequestDoc.addNewMilitaryCensusRequest();
        super.fillCommonXmlInfo(militaryCensusRequest);
        int i = 0;
        
        if (getAffectionOrDisease() != null)
            militaryCensusRequest.setAffectionOrDisease(getAffectionOrDisease().booleanValue());
      
        if (getChildBirthCountry() != null)
            militaryCensusRequest.setChildBirthCountry(fr.cg95.cvq.xml.common.CountryType.Enum.forString(getChildBirthCountry().getLegacyLabel()));
      
        militaryCensusRequest.setChildConvention(getChildConvention());
      
        if (getChildCountry() != null)
            militaryCensusRequest.setChildCountry(fr.cg95.cvq.xml.common.FullNationalityType.Enum.forString(getChildCountry().toString()));
        ProfessionalSituationInformationType professionalSituationInformationTypeProfessionalSituationInformation = militaryCensusRequest.addNewProfessionalSituationInformation();
        if (getChildDiploma() != null)
            professionalSituationInformationTypeProfessionalSituationInformation.setChildDiploma(fr.cg95.cvq.xml.request.military.ChildDiplomaType.Enum.forString(getChildDiploma().toString()));
            militaryCensusRequest.setChildCountry(fr.cg95.cvq.xml.common.FullNationalityType.Enum.forString(getChildCountry().getLegacyLabel()));
        ProfessionalSituationInformationType professionalSituationInformationTypeProfessionalSituationInformation = militaryCensusRequest.addNewProfessionalSituationInformation();
        if (getChildDiploma() != null)
            professionalSituationInformationTypeProfessionalSituationInformation.setChildDiploma(fr.cg95.cvq.xml.request.military.ChildDiplomaType.Enum.forString(getChildDiploma().getLegacyLabel()));
            militaryCensusRequest.setChildCountry(fr.cg95.cvq.xml.common.FullNationalityType.Enum.forString(getChildCountry().toString()));
      
        militaryCensusRequest.setChildMail(getChildMail());
      
        if (getChildOtherCountry() != null)
            militaryCensusRequest.setChildOtherCountry(fr.cg95.cvq.xml.common.FullNationalityType.Enum.forString(getChildOtherCountry().getLegacyLabel()));
      
        militaryCensusRequest.setChildPhone(getChildPhone());
      
        if (getChildResidenceCountry() != null)
            militaryCensusRequest.setChildResidenceCountry(fr.cg95.cvq.xml.common.CountryType.Enum.forString(getChildResidenceCountry().getLegacyLabel()));
      
        if (getChildSituation() != null)
            professionalSituationInformationTypeProfessionalSituationInformation.setChildSituation(fr.cg95.cvq.xml.request.military.ChildSituationType.Enum.forString(getChildSituation().toString()));
      
        professionalSituationInformationTypeProfessionalSituationInformation.setChildSpeciality(getChildSpeciality());
      
        if (getChildStatus() != null)
            familySituationInformationTypeFamilySituationInformation.setChildStatus(fr.cg95.cvq.xml.common.FamilyStatusType.Enum.forString(getChildStatus().toString()));
      
        if (getChildSituation() != null)
            professionalSituationInformationTypeProfessionalSituationInformation.setChildSituation(fr.cg95.cvq.xml.request.military.ChildSituationType.Enum.forString(getChildSituation().getLegacyLabel()));
      
        professionalSituationInformationTypeProfessionalSituationInformation.setChildSpeciality(getChildSpeciality());
      
        if (getChildStatus() != null)
            familySituationInformationTypeFamilySituationInformation.setChildStatus(fr.cg95.cvq.xml.common.FamilyStatusType.Enum.forString(getChildStatus().getLegacyLabel()));
      
        if (getChildTitle() != null)
            militaryCensusRequest.setChildTitle(fr.cg95.cvq.xml.common.TitleType.Enum.forString(getChildTitle().getLegacyLabel()));
      
        if (getFamilySituationInformation() != null)
            militaryCensusRequest.setFamilySituationInformation(getFamilySituationInformation().modelToXml());
      
        if (getFatherBirthCountry() != null)
            militaryFatherInformationTypeFatherInformation.setFatherBirthCountry(fr.cg95.cvq.xml.common.CountryType.Enum.forString(getFatherBirthCountry().toString()));
      
        date = getFatherBirthDate();
        if (date != null) {
            calendar.setTime(date);
            militaryFatherInformationTypeFatherInformation.setFatherBirthDate(calendar);
        }
      
        if (getFatherBirthDepartment() != null)
            militaryFatherInformationTypeFatherInformation.setFatherBirthDepartment(fr.cg95.cvq.xml.common.InseeDepartementCodeType.Enum.forString(getFatherBirthDepartment().toString()));
      
        militaryFatherInformationTypeFatherInformation.setFatherFirstName(getFatherFirstName());
        if (getFatherBirthCountry() != null)
            militaryFatherInformationTypeFatherInformation.setFatherBirthCountry(fr.cg95.cvq.xml.common.CountryType.Enum.forString(getFatherBirthCountry().getLegacyLabel()));
      
        date = getFatherBirthDate();
        if (date != null) {
            calendar.setTime(date);
            militaryFatherInformationTypeFatherInformation.setFatherBirthDate(calendar);
        }
      
        if (getFatherBirthDepartment() != null)
            militaryFatherInformationTypeFatherInformation.setFatherBirthDepartment(fr.cg95.cvq.xml.common.InseeDepartementCodeType.Enum.forString(getFatherBirthDepartment().getLegacyLabel()));
      
        militaryFatherInformationTypeFatherInformation.setFatherFirstName(getFatherFirstName());
        if (getFatherInformation() != null)
            militaryCensusRequest.setFatherInformation(getFatherInformation().modelToXml());
      
        militaryFatherInformationTypeFatherInformation.setFatherLastName(getFatherLastName());
      
        if (getFatherNationality() != null)
            militaryFatherInformationTypeFatherInformation.setFatherNationality(fr.cg95.cvq.xml.common.FullNationalityType.Enum.forString(getFatherNationality().toString()));
      
        militaryFatherInformationTypeFatherInformation.setFatherLastName(getFatherLastName());
      
        if (getFatherNationality() != null)
            militaryFatherInformationTypeFatherInformation.setFatherNationality(fr.cg95.cvq.xml.common.FullNationalityType.Enum.forString(getFatherNationality().getLegacyLabel()));
      
        if (getHighlyInfirm() != null)
            militaryCensusRequest.setHighlyInfirm(getHighlyInfirm().booleanValue());
      
        if (getJapdExemption() != null)
            militaryCensusRequest.setJapdExemption(getJapdExemption().booleanValue());
      
        militaryCensusRequest.setMaidenName(getMaidenName());
      
        if (getMotherBirthCountry() != null)
            militaryMotherInformationTypeMotherInformation.setMotherBirthCountry(fr.cg95.cvq.xml.common.CountryType.Enum.forString(getMotherBirthCountry().toString()));
        if (getMotherBirthCountry() != null)
            militaryMotherInformationTypeMotherInformation.setMotherBirthCountry(fr.cg95.cvq.xml.common.CountryType.Enum.forString(getMotherBirthCountry().getLegacyLabel()));
        if (getMotherInformation() != null)
            militaryCensusRequest.setMotherInformation(getMotherInformation().modelToXml());
      
        date = getMotherBirthDate();
        if (date != null) {
            calendar.setTime(date);
            militaryMotherInformationTypeMotherInformation.setMotherBirthDate(calendar);
        }
      
        if (getMotherBirthDepartment() != null)
            militaryMotherInformationTypeMotherInformation.setMotherBirthDepartment(fr.cg95.cvq.xml.common.InseeDepartementCodeType.Enum.forString(getMotherBirthDepartment().toString()));
      
        militaryMotherInformationTypeMotherInformation.setMotherFirstName(getMotherFirstName());
      
        militaryMotherInformationTypeMotherInformation.setMotherLastName(getMotherLastName());
      
        if (getMotherNationality() != null)
            militaryMotherInformationTypeMotherInformation.setMotherNationality(fr.cg95.cvq.xml.common.FullNationalityType.Enum.forString(getMotherNationality().toString()));
      
        familySituationInformationTypeFamilySituationInformation.setOtherSituation(getOtherSituation());
      
        if (getPrefectPupil() != null)
            familySituationInformationTypeFamilySituationInformation.setPrefectPupil(getPrefectPupil().booleanValue());
      
        if (getPrefectPupilDepartment() != null)
            familySituationInformationTypeFamilySituationInformation.setPrefectPupilDepartment(fr.cg95.cvq.xml.common.InseeDepartementCodeType.Enum.forString(getPrefectPupilDepartment().toString()));
        date = getMotherBirthDate();
        if (date != null) {
            calendar.setTime(date);
            militaryMotherInformationTypeMotherInformation.setMotherBirthDate(calendar);
        }
      
        if (getMotherBirthDepartment() != null)
            militaryMotherInformationTypeMotherInformation.setMotherBirthDepartment(fr.cg95.cvq.xml.common.InseeDepartementCodeType.Enum.forString(getMotherBirthDepartment().getLegacyLabel()));
      
        militaryMotherInformationTypeMotherInformation.setMotherFirstName(getMotherFirstName());
      
        militaryMotherInformationTypeMotherInformation.setMotherLastName(getMotherLastName());
      
        if (getMotherNationality() != null)
            militaryMotherInformationTypeMotherInformation.setMotherNationality(fr.cg95.cvq.xml.common.FullNationalityType.Enum.forString(getMotherNationality().getLegacyLabel()));
      
        familySituationInformationTypeFamilySituationInformation.setOtherSituation(getOtherSituation());
      
        if (getPrefectPupil() != null)
            familySituationInformationTypeFamilySituationInformation.setPrefectPupil(getPrefectPupil().booleanValue());
      
        if (getPrefectPupilDepartment() != null)
            familySituationInformationTypeFamilySituationInformation.setPrefectPupilDepartment(fr.cg95.cvq.xml.common.InseeDepartementCodeType.Enum.forString(getPrefectPupilDepartment().getLegacyLabel()));
        if (getProfessionalSituationInformation() != null)
            militaryCensusRequest.setProfessionalSituationInformation(getProfessionalSituationInformation().modelToXml());
      
        return militaryCensusRequestDoc;
    }

    @Override
    public final MilitaryCensusRequestDocument.MilitaryCensusRequest modelToXmlRequest() {
        return modelToXml().getMilitaryCensusRequest();
    }

    public static MilitaryCensusRequest xmlToModel(MilitaryCensusRequestDocument militaryCensusRequestDoc) {
        MilitaryCensusRequestDocument.MilitaryCensusRequest militaryCensusRequestXml = militaryCensusRequestDoc.getMilitaryCensusRequest();
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MilitaryCensusRequest militaryCensusRequest = new MilitaryCensusRequest();
        militaryCensusRequest.fillCommonModelInfo(militaryCensusRequest, militaryCensusRequestXml);
        
        militaryCensusRequest.setAffectionOrDisease(Boolean.valueOf(militaryCensusRequestXml.getAffectionOrDisease()));
      
        if (militaryCensusRequestXml.getChildBirthCountry() != null)
            militaryCensusRequest.setChildBirthCountry(fr.cg95.cvq.business.users.CountryType.forString(militaryCensusRequestXml.getChildBirthCountry().toString()));
        else
            militaryCensusRequest.setChildBirthCountry(fr.cg95.cvq.business.users.CountryType.getDefaultCountryType());
      
        militaryCensusRequest.setChildConvention(militaryCensusRequestXml.getChildConvention());
      
        if (militaryCensusRequestXml.getChildCountry() != null)
            militaryCensusRequest.setChildCountry(fr.cg95.cvq.business.users.FullNationalityType.forString(militaryCensusRequestXml.getChildCountry().toString()));
        else
            militaryCensusRequest.setChildCountry(fr.cg95.cvq.business.users.FullNationalityType.getDefaultFullNationalityType());
      
        militaryCensusRequest.setChildMail(militaryCensusRequestXml.getChildMail());
      
        if (militaryCensusRequestXml.getChildOtherCountry() != null)
            militaryCensusRequest.setChildOtherCountry(fr.cg95.cvq.business.users.FullNationalityType.forString(militaryCensusRequestXml.getChildOtherCountry().toString()));
        else
            militaryCensusRequest.setChildOtherCountry(fr.cg95.cvq.business.users.FullNationalityType.getDefaultFullNationalityType());
      
        militaryCensusRequest.setChildPhone(militaryCensusRequestXml.getChildPhone());
      
        if (militaryCensusRequestXml.getChildResidenceCountry() != null)
            militaryCensusRequest.setChildResidenceCountry(fr.cg95.cvq.business.users.CountryType.forString(militaryCensusRequestXml.getChildResidenceCountry().toString()));
        else
            militaryCensusRequest.setChildResidenceCountry(fr.cg95.cvq.business.users.CountryType.getDefaultCountryType());
      
        if (militaryCensusRequestXml.getChildTitle() != null)
            militaryCensusRequest.setChildTitle(fr.cg95.cvq.business.users.TitleType.forString(militaryCensusRequestXml.getChildTitle().toString()));
        else
            militaryCensusRequest.setChildTitle(fr.cg95.cvq.business.users.TitleType.getDefaultTitleType());
      
        if (militaryCensusRequestXml.getFamilySituationInformation() != null)
            militaryCensusRequest.setFamilySituationInformation(FamilySituationInformation.xmlToModel(militaryCensusRequestXml.getFamilySituationInformation()));
      
        if (militaryCensusRequestXml.getFatherInformation() != null)
            militaryCensusRequest.setFatherInformation(MilitaryFatherInformation.xmlToModel(militaryCensusRequestXml.getFatherInformation()));
      
        militaryCensusRequest.setHighlyInfirm(Boolean.valueOf(militaryCensusRequestXml.getHighlyInfirm()));
      
        militaryCensusRequest.setJapdExemption(Boolean.valueOf(militaryCensusRequestXml.getJapdExemption()));
      
        militaryCensusRequest.setMaidenName(militaryCensusRequestXml.getMaidenName());
      
        if (militaryCensusRequestXml.getMotherInformation() != null)
            militaryCensusRequest.setMotherInformation(MilitaryMotherInformation.xmlToModel(militaryCensusRequestXml.getMotherInformation()));
      
        if (militaryCensusRequestXml.getProfessionalSituationInformation() != null)
            militaryCensusRequest.setProfessionalSituationInformation(ProfessionalSituationInformation.xmlToModel(militaryCensusRequestXml.getProfessionalSituationInformation()));
      
        return militaryCensusRequest;
    }

    @Override
    public MilitaryCensusRequest clone() {
        MilitaryCensusRequest clone = new MilitaryCensusRequest(getRequestData().clone(), militaryCensusRequestData.clone());
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("census", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("parentage", stepState);
        
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
          clone.getStepStates().put("exemption", stepState);
        
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

  
    public final void setAffectionOrDisease(final Boolean affectionOrDisease) {
        militaryCensusRequestData.setAffectionOrDisease(affectionOrDisease);
    }

    
    public final Boolean getAffectionOrDisease() {
        return militaryCensusRequestData.getAffectionOrDisease();
    }
  
    public final void setChildBirthCountry(final fr.cg95.cvq.business.users.CountryType childBirthCountry) {
        militaryCensusRequestData.setChildBirthCountry(childBirthCountry);
    }

    
    public final fr.cg95.cvq.business.users.CountryType getChildBirthCountry() {
        return militaryCensusRequestData.getChildBirthCountry();
    }
  
    public final void setChildConvention(final String childConvention) {
        militaryCensusRequestData.setChildConvention(childConvention);
    }

    
    public final String getChildConvention() {
        return militaryCensusRequestData.getChildConvention();
    }
  
    public final void setChildCountry(final fr.cg95.cvq.business.users.FullNationalityType childCountry) {
        militaryCensusRequestData.setChildCountry(childCountry);
    }

    
    public final fr.cg95.cvq.business.users.FullNationalityType getChildCountry() {
        return militaryCensusRequestData.getChildCountry();
    }
  
    public final void setChildMail(final String childMail) {
        militaryCensusRequestData.setChildMail(childMail);
    }

    
    public final String getChildMail() {
        return militaryCensusRequestData.getChildMail();
    }
  
    public final void setChildOtherCountry(final fr.cg95.cvq.business.users.FullNationalityType childOtherCountry) {
        militaryCensusRequestData.setChildOtherCountry(childOtherCountry);
    }

    
    public final fr.cg95.cvq.business.users.FullNationalityType getChildOtherCountry() {
        return militaryCensusRequestData.getChildOtherCountry();
    }
  
    public final void setChildPhone(final String childPhone) {
        militaryCensusRequestData.setChildPhone(childPhone);
    }

    
    public final String getChildPhone() {
        return militaryCensusRequestData.getChildPhone();
    }
  
    public final void setChildResidenceCountry(final fr.cg95.cvq.business.users.CountryType childResidenceCountry) {
        militaryCensusRequestData.setChildResidenceCountry(childResidenceCountry);
    }

    
    public final fr.cg95.cvq.business.users.CountryType getChildResidenceCountry() {
        return militaryCensusRequestData.getChildResidenceCountry();
    }
  
    public final void setChildTitle(final fr.cg95.cvq.business.users.TitleType childTitle) {
        militaryCensusRequestData.setChildTitle(childTitle);
    }

    
    public final fr.cg95.cvq.business.users.TitleType getChildTitle() {
        return militaryCensusRequestData.getChildTitle();
    }
  
    public final void setFamilySituationInformation(final fr.cg95.cvq.business.request.military.FamilySituationInformation familySituationInformation) {
        militaryCensusRequestData.setFamilySituationInformation(familySituationInformation);
    }

    
    public final fr.cg95.cvq.business.request.military.FamilySituationInformation getFamilySituationInformation() {
        return militaryCensusRequestData.getFamilySituationInformation();
    }
  
    public final void setFatherInformation(final fr.cg95.cvq.business.request.military.MilitaryFatherInformation fatherInformation) {
        militaryCensusRequestData.setFatherInformation(fatherInformation);
    }

    
    public final fr.cg95.cvq.business.request.military.MilitaryFatherInformation getFatherInformation() {
        return militaryCensusRequestData.getFatherInformation();
    }
  
    public final void setHighlyInfirm(final Boolean highlyInfirm) {
        militaryCensusRequestData.setHighlyInfirm(highlyInfirm);
    }

    
    public final Boolean getHighlyInfirm() {
        return militaryCensusRequestData.getHighlyInfirm();
    }
  
    public final void setJapdExemption(final Boolean japdExemption) {
        militaryCensusRequestData.setJapdExemption(japdExemption);
    }

    
    public final Boolean getJapdExemption() {
        return militaryCensusRequestData.getJapdExemption();
    }
  
    public final void setMaidenName(final String maidenName) {
        militaryCensusRequestData.setMaidenName(maidenName);
    }

    
    public final String getMaidenName() {
        return militaryCensusRequestData.getMaidenName();
    }
  
    public final void setMotherInformation(final fr.cg95.cvq.business.request.military.MilitaryMotherInformation motherInformation) {
        militaryCensusRequestData.setMotherInformation(motherInformation);
    }

    
    public final fr.cg95.cvq.business.request.military.MilitaryMotherInformation getMotherInformation() {
        return militaryCensusRequestData.getMotherInformation();
    }
  
    public final void setProfessionalSituationInformation(final fr.cg95.cvq.business.request.military.ProfessionalSituationInformation professionalSituationInformation) {
        militaryCensusRequestData.setProfessionalSituationInformation(professionalSituationInformation);
    }

    
    public final fr.cg95.cvq.business.request.military.ProfessionalSituationInformation getProfessionalSituationInformation() {
        return militaryCensusRequestData.getProfessionalSituationInformation();
    }
  
}
