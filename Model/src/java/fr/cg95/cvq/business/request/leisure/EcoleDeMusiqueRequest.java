
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
public class EcoleDeMusiqueRequest extends Request implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions = EcoleDeMusiqueRequestData.conditions;

    @AssertValid(message = "")
    private EcoleDeMusiqueRequestData ecoleDeMusiqueRequestData;

    public EcoleDeMusiqueRequest(RequestData requestData, EcoleDeMusiqueRequestData ecoleDeMusiqueRequestData) {
        super(requestData);
        this.ecoleDeMusiqueRequestData = ecoleDeMusiqueRequestData;
    }

    public EcoleDeMusiqueRequest() {
        super();
        this.ecoleDeMusiqueRequestData = new EcoleDeMusiqueRequestData();
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("enfant", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("reglements", stepState);
        
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
    public EcoleDeMusiqueRequestData getSpecificData() {
        return ecoleDeMusiqueRequestData;
    }

    /**
     * Reserved for RequestDAO !
     */
    public void setSpecificData(EcoleDeMusiqueRequestData ecoleDeMusiqueRequestData) {
        this.ecoleDeMusiqueRequestData = ecoleDeMusiqueRequestData;
    }

    @Override
    public final String modelToXmlString() {
        EcoleDeMusiqueRequestDocument object = this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    @Override
    public final EcoleDeMusiqueRequestDocument modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        Date date = null;
        EcoleDeMusiqueRequestDocument ecoleDeMusiqueRequestDoc = EcoleDeMusiqueRequestDocument.Factory.newInstance();
        EcoleDeMusiqueRequestDocument.EcoleDeMusiqueRequest ecoleDeMusiqueRequest = ecoleDeMusiqueRequestDoc.addNewEcoleDeMusiqueRequest();
        super.fillCommonXmlInfo(ecoleDeMusiqueRequest);
        int i = 0;
        
        if (getEdmrCertifieExactitude() != null)
            ecoleDeMusiqueRequest.setEdmrCertifieExactitude(getEdmrCertifieExactitude().booleanValue());
      
        if (getProduit() != null)
            ecoleDeMusiqueRequest.setProduit(getProduit().modelToXml());
      
        if (getSite() != null)
            ecoleDeMusiqueRequest.setSite(getSite().modelToXml());
      
        return ecoleDeMusiqueRequestDoc;
    }

    @Override
    public final EcoleDeMusiqueRequestDocument.EcoleDeMusiqueRequest modelToXmlRequest() {
        return modelToXml().getEcoleDeMusiqueRequest();
    }

    public static EcoleDeMusiqueRequest xmlToModel(EcoleDeMusiqueRequestDocument ecoleDeMusiqueRequestDoc) {
        EcoleDeMusiqueRequestDocument.EcoleDeMusiqueRequest ecoleDeMusiqueRequestXml = ecoleDeMusiqueRequestDoc.getEcoleDeMusiqueRequest();
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        EcoleDeMusiqueRequest ecoleDeMusiqueRequest = new EcoleDeMusiqueRequest();
        ecoleDeMusiqueRequest.fillCommonModelInfo(ecoleDeMusiqueRequest, ecoleDeMusiqueRequestXml);
        
        ecoleDeMusiqueRequest.setEdmrCertifieExactitude(Boolean.valueOf(ecoleDeMusiqueRequestXml.getEdmrCertifieExactitude()));
      
        if (ecoleDeMusiqueRequestXml.getProduit() != null)
            ecoleDeMusiqueRequest.setProduit(Produit.xmlToModel(ecoleDeMusiqueRequestXml.getProduit()));
      
        if (ecoleDeMusiqueRequestXml.getSite() != null)
            ecoleDeMusiqueRequest.setSite(Site.xmlToModel(ecoleDeMusiqueRequestXml.getSite()));
      
        return ecoleDeMusiqueRequest;
    }

    @Override
    public EcoleDeMusiqueRequest clone() {
        EcoleDeMusiqueRequest clone = new EcoleDeMusiqueRequest(getRequestData().clone(), ecoleDeMusiqueRequestData.clone());
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("enfant", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("reglements", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("validation", stepState);
        
        return clone;
    }

  
    public final void setEdmrCertifieExactitude(final Boolean edmrCertifieExactitude) {
        ecoleDeMusiqueRequestData.setEdmrCertifieExactitude(edmrCertifieExactitude);
    }

    @IsRulesAcceptance
    public final Boolean getEdmrCertifieExactitude() {
        return ecoleDeMusiqueRequestData.getEdmrCertifieExactitude();
    }
  
    public final void setProduit(final fr.cg95.cvq.business.request.leisure.Produit produit) {
        ecoleDeMusiqueRequestData.setProduit(produit);
    }

    
    public final fr.cg95.cvq.business.request.leisure.Produit getProduit() {
        return ecoleDeMusiqueRequestData.getProduit();
    }
  
    public final void setSite(final fr.cg95.cvq.business.request.leisure.Site site) {
        ecoleDeMusiqueRequestData.setSite(site);
    }

    
    public final fr.cg95.cvq.business.request.leisure.Site getSite() {
        return ecoleDeMusiqueRequestData.getSite();
    }
  
}
