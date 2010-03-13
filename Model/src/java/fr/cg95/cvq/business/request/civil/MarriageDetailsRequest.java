
package fr.cg95.cvq.business.request.civil;

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
import fr.cg95.cvq.xml.request.civil.*;
import fr.cg95.cvq.service.request.condition.IConditionChecker;

/**
 * Generated class file, do not edit !
 */
public class MarriageDetailsRequest extends Request implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions = MarriageDetailsRequestData.conditions;

    @AssertValid(message = "")
    private MarriageDetailsRequestData marriageDetailsRequestData;

    public MarriageDetailsRequest(RequestData requestData, MarriageDetailsRequestData marriageDetailsRequestData) {
        super(requestData);
        this.marriageDetailsRequestData = marriageDetailsRequestData;
    }

    public MarriageDetailsRequest() {
        super();
        this.marriageDetailsRequestData = new MarriageDetailsRequestData();
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("nature", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("type", stepState);
        
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
    public MarriageDetailsRequestData getSpecificData() {
        return marriageDetailsRequestData;
    }

    /**
     * Reserved for RequestDAO !
     */
    public void setSpecificData(MarriageDetailsRequestData marriageDetailsRequestData) {
        this.marriageDetailsRequestData = marriageDetailsRequestData;
    }

    @Override
    public final String modelToXmlString() {
        MarriageDetailsRequestDocument object = this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    @Override
    public final MarriageDetailsRequestDocument modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        Date date = null;
        MarriageDetailsRequestDocument marriageDetailsRequestDoc = MarriageDetailsRequestDocument.Factory.newInstance();
        MarriageDetailsRequestDocument.MarriageDetailsRequest marriageDetailsRequest = marriageDetailsRequestDoc.addNewMarriageDetailsRequest();
        super.fillCommonXmlInfo(marriageDetailsRequest);
        int i = 0;
        
        marriageDetailsRequest.setComment(getComment());
      
        if (getCopies() != null)
            marriageDetailsRequest.setCopies(new BigInteger(getCopies().toString()));
      
        if (getFatherInformation() != null)
            marriageDetailsRequest.setFatherInformation(getFatherInformation().modelToXml());
      
        if (getFormat() != null)
            marriageDetailsRequest.setFormat(fr.cg95.cvq.xml.request.civil.MarriageCertificateFormatType.Enum.forString(getFormat().toString()));
        MarriageInformationType marriageInformationTypeMarriage = marriageDetailsRequest.addNewMarriage();
        marriageInformationTypeMarriage.setMarriageCity(getMarriageCity());
            marriageDetailsRequest.setFormat(fr.cg95.cvq.xml.request.civil.MarriageCertificateFormatType.Enum.forString(getFormat().getLegacyLabel()));
        MarriageInformationType marriageInformationTypeMarriage = marriageDetailsRequest.addNewMarriage();
        marriageInformationTypeMarriage.setMarriageCity(getMarriageCity());
            marriageDetailsRequest.setFormat(fr.cg95.cvq.xml.request.civil.MarriageCertificateFormatType.Enum.forString(getFormat().toString()));
      
        if (getMarriage() != null)
            marriageDetailsRequest.setMarriage(getMarriage().modelToXml());
      
        if (getMarriageHusband() != null)
            marriageDetailsRequest.setMarriageHusband(getMarriageHusband().modelToXml());
      
        if (getMarriageWife() != null)
            marriageDetailsRequest.setMarriageWife(getMarriageWife().modelToXml());
      
        if (getMotherInformation() != null)
            marriageDetailsRequest.setMotherInformation(getMotherInformation().modelToXml());
      
        if (getMotive() != null)
            marriageDetailsRequest.setMotive(fr.cg95.cvq.xml.request.civil.MarriageCertificateMotiveType.Enum.forString(getMotive().getLegacyLabel()));
      
        if (getRelationship() != null)
            marriageDetailsRequest.setRelationship(fr.cg95.cvq.xml.request.civil.MarriageRelationshipType.Enum.forString(getRelationship().getLegacyLabel()));
      
        if (getRequesterQuality() != null)
            marriageDetailsRequest.setRequesterQuality(fr.cg95.cvq.xml.request.civil.MarriageRequesterQualityType.Enum.forString(getRequesterQuality().getLegacyLabel()));
      
        marriageDetailsRequest.setRequesterQualityPrecision(getRequesterQualityPrecision());
      
        return marriageDetailsRequestDoc;
    }

    @Override
    public final MarriageDetailsRequestDocument.MarriageDetailsRequest modelToXmlRequest() {
        return modelToXml().getMarriageDetailsRequest();
    }

    public static MarriageDetailsRequest xmlToModel(MarriageDetailsRequestDocument marriageDetailsRequestDoc) {
        MarriageDetailsRequestDocument.MarriageDetailsRequest marriageDetailsRequestXml = marriageDetailsRequestDoc.getMarriageDetailsRequest();
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MarriageDetailsRequest marriageDetailsRequest = new MarriageDetailsRequest();
        marriageDetailsRequest.fillCommonModelInfo(marriageDetailsRequest, marriageDetailsRequestXml);
        
        marriageDetailsRequest.setComment(marriageDetailsRequestXml.getComment());
      
        marriageDetailsRequest.setCopies(marriageDetailsRequestXml.getCopies());
      
        if (marriageDetailsRequestXml.getFatherInformation() != null)
            marriageDetailsRequest.setFatherInformation(MarriageFatherInformation.xmlToModel(marriageDetailsRequestXml.getFatherInformation()));
      
        if (marriageDetailsRequestXml.getFormat() != null)
            marriageDetailsRequest.setFormat(fr.cg95.cvq.business.request.civil.MarriageCertificateFormatType.forString(marriageDetailsRequestXml.getFormat().toString()));
        else
            marriageDetailsRequest.setFormat(fr.cg95.cvq.business.request.civil.MarriageCertificateFormatType.getDefaultMarriageCertificateFormatType());
      
        if (marriageDetailsRequestXml.getMarriage() != null)
            marriageDetailsRequest.setMarriage(MarriageInformation.xmlToModel(marriageDetailsRequestXml.getMarriage()));
      
        if (marriageDetailsRequestXml.getMarriageHusband() != null)
            marriageDetailsRequest.setMarriageHusband(MarriageHusbandInformation.xmlToModel(marriageDetailsRequestXml.getMarriageHusband()));
      
        if (marriageDetailsRequestXml.getMarriageWife() != null)
            marriageDetailsRequest.setMarriageWife(MarriageWifeInformation.xmlToModel(marriageDetailsRequestXml.getMarriageWife()));
      
        if (marriageDetailsRequestXml.getMotherInformation() != null)
            marriageDetailsRequest.setMotherInformation(MarriageMotherInformation.xmlToModel(marriageDetailsRequestXml.getMotherInformation()));
      
        if (marriageDetailsRequestXml.getMotive() != null)
            marriageDetailsRequest.setMotive(fr.cg95.cvq.business.request.civil.MarriageCertificateMotiveType.forString(marriageDetailsRequestXml.getMotive().toString()));
        else
            marriageDetailsRequest.setMotive(fr.cg95.cvq.business.request.civil.MarriageCertificateMotiveType.getDefaultMarriageCertificateMotiveType());
      
        if (marriageDetailsRequestXml.getRelationship() != null)
            marriageDetailsRequest.setRelationship(fr.cg95.cvq.business.request.civil.MarriageRelationshipType.forString(marriageDetailsRequestXml.getRelationship().toString()));
        else
            marriageDetailsRequest.setRelationship(fr.cg95.cvq.business.request.civil.MarriageRelationshipType.getDefaultMarriageRelationshipType());
      
        if (marriageDetailsRequestXml.getRequesterQuality() != null)
            marriageDetailsRequest.setRequesterQuality(fr.cg95.cvq.business.request.civil.MarriageRequesterQualityType.forString(marriageDetailsRequestXml.getRequesterQuality().toString()));
        else
            marriageDetailsRequest.setRequesterQuality(fr.cg95.cvq.business.request.civil.MarriageRequesterQualityType.getDefaultMarriageRequesterQualityType());
      
        marriageDetailsRequest.setRequesterQualityPrecision(marriageDetailsRequestXml.getRequesterQualityPrecision());
      
        return marriageDetailsRequest;
    }

    @Override
    public MarriageDetailsRequest clone() {
        MarriageDetailsRequest clone = new MarriageDetailsRequest(getRequestData().clone(), marriageDetailsRequestData.clone());
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("nature", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("type", stepState);
        
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

  
    public final void setComment(final String comment) {
        marriageDetailsRequestData.setComment(comment);
    }

    
    public final String getComment() {
        return marriageDetailsRequestData.getComment();
    }
  
    public final void setCopies(final java.math.BigInteger copies) {
        marriageDetailsRequestData.setCopies(copies);
    }

    
    public final java.math.BigInteger getCopies() {
        return marriageDetailsRequestData.getCopies();
    }
  
    public final void setFatherInformation(final fr.cg95.cvq.business.request.civil.MarriageFatherInformation fatherInformation) {
        marriageDetailsRequestData.setFatherInformation(fatherInformation);
    }

    
    public final fr.cg95.cvq.business.request.civil.MarriageFatherInformation getFatherInformation() {
        return marriageDetailsRequestData.getFatherInformation();
    }
  
    public final void setFormat(final fr.cg95.cvq.business.request.civil.MarriageCertificateFormatType format) {
        marriageDetailsRequestData.setFormat(format);
    }

    
    public final fr.cg95.cvq.business.request.civil.MarriageCertificateFormatType getFormat() {
        return marriageDetailsRequestData.getFormat();
    }
  
    public final void setMarriage(final fr.cg95.cvq.business.request.civil.MarriageInformation marriage) {
        marriageDetailsRequestData.setMarriage(marriage);
    }

    
    public final fr.cg95.cvq.business.request.civil.MarriageInformation getMarriage() {
        return marriageDetailsRequestData.getMarriage();
    }
  
    public final void setMarriageHusband(final fr.cg95.cvq.business.request.civil.MarriageHusbandInformation marriageHusband) {
        marriageDetailsRequestData.setMarriageHusband(marriageHusband);
    }

    
    public final fr.cg95.cvq.business.request.civil.MarriageHusbandInformation getMarriageHusband() {
        return marriageDetailsRequestData.getMarriageHusband();
    }
  
    public final void setMarriageWife(final fr.cg95.cvq.business.request.civil.MarriageWifeInformation marriageWife) {
        marriageDetailsRequestData.setMarriageWife(marriageWife);
    }

    
    public final fr.cg95.cvq.business.request.civil.MarriageWifeInformation getMarriageWife() {
        return marriageDetailsRequestData.getMarriageWife();
    }
  
    public final void setMotherInformation(final fr.cg95.cvq.business.request.civil.MarriageMotherInformation motherInformation) {
        marriageDetailsRequestData.setMotherInformation(motherInformation);
    }

    
    public final fr.cg95.cvq.business.request.civil.MarriageMotherInformation getMotherInformation() {
        return marriageDetailsRequestData.getMotherInformation();
    }
  
    public final void setMotive(final fr.cg95.cvq.business.request.civil.MarriageCertificateMotiveType motive) {
        marriageDetailsRequestData.setMotive(motive);
    }

    
    public final fr.cg95.cvq.business.request.civil.MarriageCertificateMotiveType getMotive() {
        return marriageDetailsRequestData.getMotive();
    }
  
    public final void setRelationship(final fr.cg95.cvq.business.request.civil.MarriageRelationshipType relationship) {
        marriageDetailsRequestData.setRelationship(relationship);
    }

    
    public final fr.cg95.cvq.business.request.civil.MarriageRelationshipType getRelationship() {
        return marriageDetailsRequestData.getRelationship();
    }
  
    public final void setRequesterQuality(final fr.cg95.cvq.business.request.civil.MarriageRequesterQualityType requesterQuality) {
        marriageDetailsRequestData.setRequesterQuality(requesterQuality);
    }

    
    public final fr.cg95.cvq.business.request.civil.MarriageRequesterQualityType getRequesterQuality() {
        return marriageDetailsRequestData.getRequesterQuality();
    }
  
    public final void setRequesterQualityPrecision(final String requesterQualityPrecision) {
        marriageDetailsRequestData.setRequesterQualityPrecision(requesterQualityPrecision);
    }

    
    public final String getRequesterQualityPrecision() {
        return marriageDetailsRequestData.getRequesterQualityPrecision();
    }
  
}
