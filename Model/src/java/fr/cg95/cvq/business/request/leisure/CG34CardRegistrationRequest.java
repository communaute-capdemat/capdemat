
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
public class CG34CardRegistrationRequest extends Request implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions = CG34CardRegistrationRequestData.conditions;

    @AssertValid(message = "")
    private CG34CardRegistrationRequestData cG34CardRegistrationRequestData;

    public CG34CardRegistrationRequest(RequestData requestData, CG34CardRegistrationRequestData cG34CardRegistrationRequestData) {
        super(requestData);
        this.cG34CardRegistrationRequestData = cG34CardRegistrationRequestData;
    }

    public CG34CardRegistrationRequest() {
        super();
        this.cG34CardRegistrationRequestData = new CG34CardRegistrationRequestData();
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
          getStepStates().put("validation", stepState);
        
    }

    /**
     * Reserved for RequestDAO !
     */
    @Override
    public CG34CardRegistrationRequestData getSpecificData() {
        return cG34CardRegistrationRequestData;
    }

    /**
     * Reserved for RequestDAO !
     */
    public void setSpecificData(CG34CardRegistrationRequestData cG34CardRegistrationRequestData) {
        this.cG34CardRegistrationRequestData = cG34CardRegistrationRequestData;
    }

    @Override
    public final String modelToXmlString() {
        CG34CardRegistrationRequestDocument object = this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    @Override
    public final CG34CardRegistrationRequestDocument modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        Date date = null;
        CG34CardRegistrationRequestDocument cG34CardRegistrationRequestDoc = CG34CardRegistrationRequestDocument.Factory.newInstance();
        CG34CardRegistrationRequestDocument.CG34CardRegistrationRequest cG34CardRegistrationRequest = cG34CardRegistrationRequestDoc.addNewCG34CardRegistrationRequest();
        super.fillCommonXmlInfo(cG34CardRegistrationRequest);
        int i = 0;
        
        if (getRulesAndRegulationsAcceptance() != null)
            cG34CardRegistrationRequest.setRulesAndRegulationsAcceptance(getRulesAndRegulationsAcceptance().booleanValue());
      
        return cG34CardRegistrationRequestDoc;
    }

    @Override
    public final CG34CardRegistrationRequestDocument.CG34CardRegistrationRequest modelToXmlRequest() {
        return modelToXml().getCG34CardRegistrationRequest();
    }

    public static CG34CardRegistrationRequest xmlToModel(CG34CardRegistrationRequestDocument cG34CardRegistrationRequestDoc) {
        CG34CardRegistrationRequestDocument.CG34CardRegistrationRequest cG34CardRegistrationRequestXml = cG34CardRegistrationRequestDoc.getCG34CardRegistrationRequest();
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        CG34CardRegistrationRequest cG34CardRegistrationRequest = new CG34CardRegistrationRequest();
        cG34CardRegistrationRequest.fillCommonModelInfo(cG34CardRegistrationRequest, cG34CardRegistrationRequestXml);
        
        cG34CardRegistrationRequest.setRulesAndRegulationsAcceptance(Boolean.valueOf(cG34CardRegistrationRequestXml.getRulesAndRegulationsAcceptance()));
      
        return cG34CardRegistrationRequest;
    }

    @Override
    public CG34CardRegistrationRequest clone() {
        CG34CardRegistrationRequest clone = new CG34CardRegistrationRequest(getRequestData().clone(), cG34CardRegistrationRequestData.clone());
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
          clone.getStepStates().put("validation", stepState);
        
        return clone;
    }

  
    public final void setRulesAndRegulationsAcceptance(final Boolean rulesAndRegulationsAcceptance) {
        cG34CardRegistrationRequestData.setRulesAndRegulationsAcceptance(rulesAndRegulationsAcceptance);
    }

    @IsRulesAcceptance
    public final Boolean getRulesAndRegulationsAcceptance() {
        return cG34CardRegistrationRequestData.getRulesAndRegulationsAcceptance();
    }
  
}
