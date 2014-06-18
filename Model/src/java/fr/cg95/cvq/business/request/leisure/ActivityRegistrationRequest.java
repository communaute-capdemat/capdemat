
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
        
        if (getProduit() != null)
            activityRegistrationRequest.setProduit(getProduit().modelToXml());
      
        if (getReglement() != null)
            activityRegistrationRequest.setReglement(getReglement().booleanValue());
      
        if (getSegment() != null)
            activityRegistrationRequest.setSegment(getSegment().modelToXml());
      
        if (getSite() != null)
            activityRegistrationRequest.setSite(getSite().modelToXml());
      
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
        
        if (activityRegistrationRequestXml.getProduit() != null)
            activityRegistrationRequest.setProduit(ArrProduit.xmlToModel(activityRegistrationRequestXml.getProduit()));
      
        activityRegistrationRequest.setReglement(Boolean.valueOf(activityRegistrationRequestXml.getReglement()));
      
        if (activityRegistrationRequestXml.getSegment() != null)
            activityRegistrationRequest.setSegment(Segment.xmlToModel(activityRegistrationRequestXml.getSegment()));
      
        if (activityRegistrationRequestXml.getSite() != null)
            activityRegistrationRequest.setSite(ArrSite.xmlToModel(activityRegistrationRequestXml.getSite()));
      
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

  
    public final void setProduit(final fr.cg95.cvq.business.request.leisure.ArrProduit produit) {
        activityRegistrationRequestData.setProduit(produit);
    }

    
    public final fr.cg95.cvq.business.request.leisure.ArrProduit getProduit() {
        return activityRegistrationRequestData.getProduit();
    }
  
    public final void setReglement(final Boolean reglement) {
        activityRegistrationRequestData.setReglement(reglement);
    }

    @IsRulesAcceptance
    public final Boolean getReglement() {
        return activityRegistrationRequestData.getReglement();
    }
  
    public final void setSegment(final fr.cg95.cvq.business.request.leisure.Segment segment) {
        activityRegistrationRequestData.setSegment(segment);
    }

    
    public final fr.cg95.cvq.business.request.leisure.Segment getSegment() {
        return activityRegistrationRequestData.getSegment();
    }
  
    public final void setSite(final fr.cg95.cvq.business.request.leisure.ArrSite site) {
        activityRegistrationRequestData.setSite(site);
    }

    
    public final fr.cg95.cvq.business.request.leisure.ArrSite getSite() {
        return activityRegistrationRequestData.getSite();
    }
  
}
