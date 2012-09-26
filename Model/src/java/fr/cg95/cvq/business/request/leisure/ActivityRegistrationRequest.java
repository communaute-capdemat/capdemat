
package fr.cg95.cvq.business.request.leisure;

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
import fr.cg95.cvq.xml.request.leisure.*;
import fr.cg95.cvq.service.request.condition.IConditionChecker;

/**
 * Generated class file, do not edit !
 */
public class ActivityRegistrationRequest extends Request implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions = ActivityRegistrationRequestData.conditions;

    @AssertValid(message = "")
    private ActivityRegistrationRequestData activityRegistrationRequestData;

    public ActivityRegistrationRequest(RequestData requestData, ActivityRegistrationRequestData activityRegistrationRequestData) {
        super(requestData);
        this.activityRegistrationRequestData = activityRegistrationRequestData;
    }

    public ActivityRegistrationRequest() {
        super();
        this.activityRegistrationRequestData = new ActivityRegistrationRequestData();
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("preinscription", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("reglement", stepState);
        
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
    public ActivityRegistrationRequestData getSpecificData() {
        return activityRegistrationRequestData;
    }

    /**
     * Reserved for RequestDAO !
     */
    public void setSpecificData(ActivityRegistrationRequestData activityRegistrationRequestData) {
        this.activityRegistrationRequestData = activityRegistrationRequestData;
    }

    @Override
    public final String modelToXmlString() {
        ActivityRegistrationRequestDocument object = this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    @Override
    public final ActivityRegistrationRequestDocument modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        Date date = null;
        ActivityRegistrationRequestDocument activityRegistrationRequestDoc = ActivityRegistrationRequestDocument.Factory.newInstance();
        ActivityRegistrationRequestDocument.ActivityRegistrationRequest activityRegistrationRequest = activityRegistrationRequestDoc.addNewActivityRegistrationRequest();
        super.fillCommonXmlInfo(activityRegistrationRequest);
        int i = 0;
          ArrProduitType arrProduitTypeProduit = activityRegistrationRequest.addNewProduit();
        arrProduitTypeProduit.setIdProduit(getIdProduit());
        SegmentType segmentTypeSegment = activityRegistrationRequest.addNewSegment();
        segmentTypeSegment.setIdSegment(getIdSegment());
        ArrSiteType arrSiteTypeSite = activityRegistrationRequest.addNewSite();
        arrSiteTypeSite.setIdSite(getIdSite());
      
        arrProduitTypeProduit.setLabelProduit(getLabelProduit());
      
        segmentTypeSegment.setLabelSegment(getLabelSegment());
      
        arrSiteTypeSite.setLabelSite(getLabelSite());
      
        if (getReglement() != null)
            activityRegistrationRequest.setReglement(getReglement().booleanValue());
      
        arrProduitTypeProduit.setTypeProduit(getTypeProduit());
      
        return activityRegistrationRequestDoc;
    }

    @Override
    public final ActivityRegistrationRequestDocument.ActivityRegistrationRequest modelToXmlRequest() {
        return modelToXml().getActivityRegistrationRequest();
    }

    public static ActivityRegistrationRequest xmlToModel(ActivityRegistrationRequestDocument activityRegistrationRequestDoc) {
        ActivityRegistrationRequestDocument.ActivityRegistrationRequest activityRegistrationRequestXml = activityRegistrationRequestDoc.getActivityRegistrationRequest();
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        ActivityRegistrationRequest activityRegistrationRequest = new ActivityRegistrationRequest();
        activityRegistrationRequest.fillCommonModelInfo(activityRegistrationRequest, activityRegistrationRequestXml);
        
        activityRegistrationRequest.setIdProduit(activityRegistrationRequestXml.getProduit().getIdProduit());
      
        activityRegistrationRequest.setIdSegment(activityRegistrationRequestXml.getSegment().getIdSegment());
      
        activityRegistrationRequest.setIdSite(activityRegistrationRequestXml.getSite().getIdSite());
      
        activityRegistrationRequest.setLabelProduit(activityRegistrationRequestXml.getProduit().getLabelProduit());
      
        activityRegistrationRequest.setLabelSegment(activityRegistrationRequestXml.getSegment().getLabelSegment());
      
        activityRegistrationRequest.setLabelSite(activityRegistrationRequestXml.getSite().getLabelSite());
      
        activityRegistrationRequest.setReglement(Boolean.valueOf(activityRegistrationRequestXml.getReglement()));
      
        activityRegistrationRequest.setTypeProduit(activityRegistrationRequestXml.getProduit().getTypeProduit());
      
        return activityRegistrationRequest;
    }

    @Override
    public ActivityRegistrationRequest clone() {
        ActivityRegistrationRequest clone = new ActivityRegistrationRequest(getRequestData().clone(), activityRegistrationRequestData.clone());
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("preinscription", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("reglement", stepState);
        
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

  
    public final void setIdProduit(final String idProduit) {
        activityRegistrationRequestData.setIdProduit(idProduit);
    }

    
    public final String getIdProduit() {
        return activityRegistrationRequestData.getIdProduit();
    }
  
    public final void setIdSegment(final String idSegment) {
        activityRegistrationRequestData.setIdSegment(idSegment);
    }

    
    public final String getIdSegment() {
        return activityRegistrationRequestData.getIdSegment();
    }
  
    public final void setIdSite(final String idSite) {
        activityRegistrationRequestData.setIdSite(idSite);
    }

    
    public final String getIdSite() {
        return activityRegistrationRequestData.getIdSite();
    }
  
    public final void setLabelProduit(final String labelProduit) {
        activityRegistrationRequestData.setLabelProduit(labelProduit);
    }

    
    public final String getLabelProduit() {
        return activityRegistrationRequestData.getLabelProduit();
    }
  
    public final void setLabelSegment(final String labelSegment) {
        activityRegistrationRequestData.setLabelSegment(labelSegment);
    }

    
    public final String getLabelSegment() {
        return activityRegistrationRequestData.getLabelSegment();
    }
  
    public final void setLabelSite(final String labelSite) {
        activityRegistrationRequestData.setLabelSite(labelSite);
    }

    
    public final String getLabelSite() {
        return activityRegistrationRequestData.getLabelSite();
    }
  
    public final void setReglement(final Boolean reglement) {
        activityRegistrationRequestData.setReglement(reglement);
    }

    @IsRulesAcceptance
    public final Boolean getReglement() {
        return activityRegistrationRequestData.getReglement();
    }
  
    public final void setTypeProduit(final String typeProduit) {
        activityRegistrationRequestData.setTypeProduit(typeProduit);
    }

    
    public final String getTypeProduit() {
        return activityRegistrationRequestData.getTypeProduit();
    }
  
}
