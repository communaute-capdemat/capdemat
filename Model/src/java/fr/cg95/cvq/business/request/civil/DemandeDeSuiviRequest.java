
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
public class DemandeDeSuiviRequest extends Request implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions = DemandeDeSuiviRequestData.conditions;

    @AssertValid(message = "")
    private DemandeDeSuiviRequestData demandeDeSuiviRequestData;

    public DemandeDeSuiviRequest(RequestData requestData, DemandeDeSuiviRequestData demandeDeSuiviRequestData) {
        super(requestData);
        this.demandeDeSuiviRequestData = demandeDeSuiviRequestData;
    }

    public DemandeDeSuiviRequest() {
        super();
        this.demandeDeSuiviRequestData = new DemandeDeSuiviRequestData();
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("demande", stepState);
        
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
    public DemandeDeSuiviRequestData getSpecificData() {
        return demandeDeSuiviRequestData;
    }

    /**
     * Reserved for RequestDAO !
     */
    public void setSpecificData(DemandeDeSuiviRequestData demandeDeSuiviRequestData) {
        this.demandeDeSuiviRequestData = demandeDeSuiviRequestData;
    }

    @Override
    public final String modelToXmlString() {
        DemandeDeSuiviRequestDocument object = this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    @Override
    public final DemandeDeSuiviRequestDocument modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        Date date = null;
        DemandeDeSuiviRequestDocument demandeDeSuiviRequestDoc = DemandeDeSuiviRequestDocument.Factory.newInstance();
        DemandeDeSuiviRequestDocument.DemandeDeSuiviRequest demandeDeSuiviRequest = demandeDeSuiviRequestDoc.addNewDemandeDeSuiviRequest();
        super.fillCommonXmlInfo(demandeDeSuiviRequest);
        int i = 0;
        
        demandeDeSuiviRequest.setCommentaire(getCommentaire());
      
        demandeDeSuiviRequest.setNumeroDemande(getNumeroDemande());
      
        return demandeDeSuiviRequestDoc;
    }

    @Override
    public final DemandeDeSuiviRequestDocument.DemandeDeSuiviRequest modelToXmlRequest() {
        return modelToXml().getDemandeDeSuiviRequest();
    }

    public static DemandeDeSuiviRequest xmlToModel(DemandeDeSuiviRequestDocument demandeDeSuiviRequestDoc) {
        DemandeDeSuiviRequestDocument.DemandeDeSuiviRequest demandeDeSuiviRequestXml = demandeDeSuiviRequestDoc.getDemandeDeSuiviRequest();
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        DemandeDeSuiviRequest demandeDeSuiviRequest = new DemandeDeSuiviRequest();
        demandeDeSuiviRequest.fillCommonModelInfo(demandeDeSuiviRequest, demandeDeSuiviRequestXml);
        
        demandeDeSuiviRequest.setCommentaire(demandeDeSuiviRequestXml.getCommentaire());
      
        demandeDeSuiviRequest.setNumeroDemande(demandeDeSuiviRequestXml.getNumeroDemande());
      
        return demandeDeSuiviRequest;
    }

    @Override
    public DemandeDeSuiviRequest clone() {
        DemandeDeSuiviRequest clone = new DemandeDeSuiviRequest(getRequestData().clone(), demandeDeSuiviRequestData.clone());
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("demande", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("validation", stepState);
        
        return clone;
    }

  
    public final void setCommentaire(final String commentaire) {
        demandeDeSuiviRequestData.setCommentaire(commentaire);
    }

    
    public final String getCommentaire() {
        return demandeDeSuiviRequestData.getCommentaire();
    }
  
    public final void setNumeroDemande(final String numeroDemande) {
        demandeDeSuiviRequestData.setNumeroDemande(numeroDemande);
    }

    
    public final String getNumeroDemande() {
        return demandeDeSuiviRequestData.getNumeroDemande();
    }
  
}
