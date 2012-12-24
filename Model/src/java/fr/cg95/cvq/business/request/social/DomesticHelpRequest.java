
package fr.cg95.cvq.business.request.social;

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
import fr.cg95.cvq.xml.request.social.*;
import fr.cg95.cvq.service.request.condition.IConditionChecker;

/**
 * Generated class file, do not edit !
 */
public class DomesticHelpRequest extends Request implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions = DomesticHelpRequestData.conditions;

    @AssertValid(message = "")
    private DomesticHelpRequestData domesticHelpRequestData;

    public DomesticHelpRequest(RequestData requestData, DomesticHelpRequestData domesticHelpRequestData) {
        super(requestData);
        this.domesticHelpRequestData = domesticHelpRequestData;
    }

    public DomesticHelpRequest() {
        super();
        this.domesticHelpRequestData = new DomesticHelpRequestData();
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("subject", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("familyReferent", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("spouse", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("dwelling", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("resources", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("taxes", stepState);
        
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
    public DomesticHelpRequestData getSpecificData() {
        return domesticHelpRequestData;
    }

    /**
     * Reserved for RequestDAO !
     */
    public void setSpecificData(DomesticHelpRequestData domesticHelpRequestData) {
        this.domesticHelpRequestData = domesticHelpRequestData;
    }

    @Override
    public final String modelToXmlString() {
        DomesticHelpRequestDocument object = this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    @Override
    public final DomesticHelpRequestDocument modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        Date date = null;
        DomesticHelpRequestDocument domesticHelpRequestDoc = DomesticHelpRequestDocument.Factory.newInstance();
        DomesticHelpRequestDocument.DomesticHelpRequest domesticHelpRequest = domesticHelpRequestDoc.addNewDomesticHelpRequest();
        super.fillCommonXmlInfo(domesticHelpRequest);
        int i = 0;
        
        if (getDhrCurrentDwelling() != null)
            domesticHelpRequest.setDhrCurrentDwelling(getDhrCurrentDwelling().modelToXml());
      
        if (getDhrFamilyReferent() != null)
            domesticHelpRequest.setDhrFamilyReferent(getDhrFamilyReferent().modelToXml());
      
        i = 0;
        if (getDhrNotRealAsset() != null) {
            fr.cg95.cvq.xml.request.social.DhrNotRealAssetType[] dhrNotRealAssetTypeTab = new fr.cg95.cvq.xml.request.social.DhrNotRealAssetType[getDhrNotRealAsset().size()];
            for (DhrNotRealAsset object : getDhrNotRealAsset()) {
              dhrNotRealAssetTypeTab[i++] = object.modelToXml();
            }
            domesticHelpRequest.setDhrNotRealAssetArray(dhrNotRealAssetTypeTab);
        }
      
        i = 0;
        if (getDhrPreviousDwelling() != null) {
            fr.cg95.cvq.xml.request.social.DhrPreviousDwellingType[] dhrPreviousDwellingTypeTab = new fr.cg95.cvq.xml.request.social.DhrPreviousDwellingType[getDhrPreviousDwelling().size()];
            for (DhrPreviousDwelling object : getDhrPreviousDwelling()) {
              dhrPreviousDwellingTypeTab[i++] = object.modelToXml();
            }
            domesticHelpRequest.setDhrPreviousDwellingArray(dhrPreviousDwellingTypeTab);
        }
      
        i = 0;
        if (getDhrRealAsset() != null) {
            fr.cg95.cvq.xml.request.social.DhrRealAssetType[] dhrRealAssetTypeTab = new fr.cg95.cvq.xml.request.social.DhrRealAssetType[getDhrRealAsset().size()];
            for (DhrRealAsset object : getDhrRealAsset()) {
              dhrRealAssetTypeTab[i++] = object.modelToXml();
            }
            domesticHelpRequest.setDhrRealAssetArray(dhrRealAssetTypeTab);
        }
      
        if (getDhrRequester() != null)
            domesticHelpRequest.setDhrRequester(getDhrRequester().modelToXml());
      
        if (getDhrRequesterGuardian() != null)
            domesticHelpRequest.setDhrRequesterGuardian(getDhrRequesterGuardian().modelToXml());
      
        if (getDhrRequesterIncomes() != null)
            domesticHelpRequest.setDhrRequesterIncomes(getDhrRequesterIncomes().modelToXml());
      
        if (getDhrRequesterPensionPlan() != null)
            domesticHelpRequest.setDhrRequesterPensionPlan(getDhrRequesterPensionPlan().modelToXml());
      
        if (getDhrSpouse() != null)
            domesticHelpRequest.setDhrSpouse(getDhrSpouse().modelToXml());
      
        if (getDhrSpouseIncomes() != null)
            domesticHelpRequest.setDhrSpouseIncomes(getDhrSpouseIncomes().modelToXml());
      
        if (getDhrSpouseStatus() != null)
            domesticHelpRequest.setDhrSpouseStatus(getDhrSpouseStatus().modelToXml());
      
        if (getDhrTaxesAmount() != null)
            domesticHelpRequest.setDhrTaxesAmount(getDhrTaxesAmount().modelToXml());
      
        return domesticHelpRequestDoc;
    }

    @Override
    public final DomesticHelpRequestDocument.DomesticHelpRequest modelToXmlRequest() {
        return modelToXml().getDomesticHelpRequest();
    }

    public static DomesticHelpRequest xmlToModel(DomesticHelpRequestDocument domesticHelpRequestDoc) {
        DomesticHelpRequestDocument.DomesticHelpRequest domesticHelpRequestXml = domesticHelpRequestDoc.getDomesticHelpRequest();
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        DomesticHelpRequest domesticHelpRequest = new DomesticHelpRequest();
        domesticHelpRequest.fillCommonModelInfo(domesticHelpRequest, domesticHelpRequestXml);
        
        if (domesticHelpRequestXml.getDhrCurrentDwelling() != null)
            domesticHelpRequest.setDhrCurrentDwelling(DhrCurrentDwelling.xmlToModel(domesticHelpRequestXml.getDhrCurrentDwelling()));
      
        if (domesticHelpRequestXml.getDhrFamilyReferent() != null)
            domesticHelpRequest.setDhrFamilyReferent(DhrFamilyReferent.xmlToModel(domesticHelpRequestXml.getDhrFamilyReferent()));
      
        List<fr.cg95.cvq.business.request.social.DhrNotRealAsset> dhrNotRealAssetList = new ArrayList<fr.cg95.cvq.business.request.social.DhrNotRealAsset>(domesticHelpRequestXml.sizeOfDhrNotRealAssetArray());
        for (DhrNotRealAssetType object : domesticHelpRequestXml.getDhrNotRealAssetArray()) {
            dhrNotRealAssetList.add(fr.cg95.cvq.business.request.social.DhrNotRealAsset.xmlToModel(object));
        }
        domesticHelpRequest.setDhrNotRealAsset(dhrNotRealAssetList);
      
        List<fr.cg95.cvq.business.request.social.DhrPreviousDwelling> dhrPreviousDwellingList = new ArrayList<fr.cg95.cvq.business.request.social.DhrPreviousDwelling>(domesticHelpRequestXml.sizeOfDhrPreviousDwellingArray());
        for (DhrPreviousDwellingType object : domesticHelpRequestXml.getDhrPreviousDwellingArray()) {
            dhrPreviousDwellingList.add(fr.cg95.cvq.business.request.social.DhrPreviousDwelling.xmlToModel(object));
        }
        domesticHelpRequest.setDhrPreviousDwelling(dhrPreviousDwellingList);
      
        List<fr.cg95.cvq.business.request.social.DhrRealAsset> dhrRealAssetList = new ArrayList<fr.cg95.cvq.business.request.social.DhrRealAsset>(domesticHelpRequestXml.sizeOfDhrRealAssetArray());
        for (DhrRealAssetType object : domesticHelpRequestXml.getDhrRealAssetArray()) {
            dhrRealAssetList.add(fr.cg95.cvq.business.request.social.DhrRealAsset.xmlToModel(object));
        }
        domesticHelpRequest.setDhrRealAsset(dhrRealAssetList);
      
        if (domesticHelpRequestXml.getDhrRequester() != null)
            domesticHelpRequest.setDhrRequester(DhrRequester.xmlToModel(domesticHelpRequestXml.getDhrRequester()));
      
        if (domesticHelpRequestXml.getDhrRequesterGuardian() != null)
            domesticHelpRequest.setDhrRequesterGuardian(DhrRequesterGuardian.xmlToModel(domesticHelpRequestXml.getDhrRequesterGuardian()));
      
        if (domesticHelpRequestXml.getDhrRequesterIncomes() != null)
            domesticHelpRequest.setDhrRequesterIncomes(DhrIncomes.xmlToModel(domesticHelpRequestXml.getDhrRequesterIncomes()));
      
        if (domesticHelpRequestXml.getDhrRequesterPensionPlan() != null)
            domesticHelpRequest.setDhrRequesterPensionPlan(DhrRequesterPensionPlan.xmlToModel(domesticHelpRequestXml.getDhrRequesterPensionPlan()));
      
        if (domesticHelpRequestXml.getDhrSpouse() != null)
            domesticHelpRequest.setDhrSpouse(DhrSpouse.xmlToModel(domesticHelpRequestXml.getDhrSpouse()));
      
        if (domesticHelpRequestXml.getDhrSpouseIncomes() != null)
            domesticHelpRequest.setDhrSpouseIncomes(DhrIncomes.xmlToModel(domesticHelpRequestXml.getDhrSpouseIncomes()));
      
        if (domesticHelpRequestXml.getDhrSpouseStatus() != null)
            domesticHelpRequest.setDhrSpouseStatus(DhrSpouseStatus.xmlToModel(domesticHelpRequestXml.getDhrSpouseStatus()));
      
        if (domesticHelpRequestXml.getDhrTaxesAmount() != null)
            domesticHelpRequest.setDhrTaxesAmount(DhrTaxesAmount.xmlToModel(domesticHelpRequestXml.getDhrTaxesAmount()));
      
        return domesticHelpRequest;
    }

    @Override
    public DomesticHelpRequest clone() {
        DomesticHelpRequest clone = new DomesticHelpRequest(getRequestData().clone(), domesticHelpRequestData.clone());
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("subject", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("familyReferent", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("spouse", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("dwelling", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("resources", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("taxes", stepState);
        
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

  
    public final void setDhrCurrentDwelling(final fr.cg95.cvq.business.request.social.DhrCurrentDwelling dhrCurrentDwelling) {
        domesticHelpRequestData.setDhrCurrentDwelling(dhrCurrentDwelling);
    }

    
    public final fr.cg95.cvq.business.request.social.DhrCurrentDwelling getDhrCurrentDwelling() {
        return domesticHelpRequestData.getDhrCurrentDwelling();
    }
  
    public final void setDhrFamilyReferent(final fr.cg95.cvq.business.request.social.DhrFamilyReferent dhrFamilyReferent) {
        domesticHelpRequestData.setDhrFamilyReferent(dhrFamilyReferent);
    }

    
    public final fr.cg95.cvq.business.request.social.DhrFamilyReferent getDhrFamilyReferent() {
        return domesticHelpRequestData.getDhrFamilyReferent();
    }
  
    public final void setDhrNotRealAsset(final List<fr.cg95.cvq.business.request.social.DhrNotRealAsset> dhrNotRealAsset) {
        domesticHelpRequestData.setDhrNotRealAsset(dhrNotRealAsset);
    }

    
    public final List<fr.cg95.cvq.business.request.social.DhrNotRealAsset> getDhrNotRealAsset() {
        return domesticHelpRequestData.getDhrNotRealAsset();
    }
  
    public final void setDhrPreviousDwelling(final List<fr.cg95.cvq.business.request.social.DhrPreviousDwelling> dhrPreviousDwelling) {
        domesticHelpRequestData.setDhrPreviousDwelling(dhrPreviousDwelling);
    }

    
    public final List<fr.cg95.cvq.business.request.social.DhrPreviousDwelling> getDhrPreviousDwelling() {
        return domesticHelpRequestData.getDhrPreviousDwelling();
    }
  
    public final void setDhrRealAsset(final List<fr.cg95.cvq.business.request.social.DhrRealAsset> dhrRealAsset) {
        domesticHelpRequestData.setDhrRealAsset(dhrRealAsset);
    }

    
    public final List<fr.cg95.cvq.business.request.social.DhrRealAsset> getDhrRealAsset() {
        return domesticHelpRequestData.getDhrRealAsset();
    }
  
    public final void setDhrRequester(final fr.cg95.cvq.business.request.social.DhrRequester dhrRequester) {
        domesticHelpRequestData.setDhrRequester(dhrRequester);
    }

    
    public final fr.cg95.cvq.business.request.social.DhrRequester getDhrRequester() {
        return domesticHelpRequestData.getDhrRequester();
    }
  
    public final void setDhrRequesterGuardian(final fr.cg95.cvq.business.request.social.DhrRequesterGuardian dhrRequesterGuardian) {
        domesticHelpRequestData.setDhrRequesterGuardian(dhrRequesterGuardian);
    }

    
    public final fr.cg95.cvq.business.request.social.DhrRequesterGuardian getDhrRequesterGuardian() {
        return domesticHelpRequestData.getDhrRequesterGuardian();
    }
  
    public final void setDhrRequesterIncomes(final fr.cg95.cvq.business.request.social.DhrIncomes dhrRequesterIncomes) {
        domesticHelpRequestData.setDhrRequesterIncomes(dhrRequesterIncomes);
    }

    
    public final fr.cg95.cvq.business.request.social.DhrIncomes getDhrRequesterIncomes() {
        return domesticHelpRequestData.getDhrRequesterIncomes();
    }
  
    public final void setDhrRequesterPensionPlan(final fr.cg95.cvq.business.request.social.DhrRequesterPensionPlan dhrRequesterPensionPlan) {
        domesticHelpRequestData.setDhrRequesterPensionPlan(dhrRequesterPensionPlan);
    }

    
    public final fr.cg95.cvq.business.request.social.DhrRequesterPensionPlan getDhrRequesterPensionPlan() {
        return domesticHelpRequestData.getDhrRequesterPensionPlan();
    }
  
    public final void setDhrSpouse(final fr.cg95.cvq.business.request.social.DhrSpouse dhrSpouse) {
        domesticHelpRequestData.setDhrSpouse(dhrSpouse);
    }

    
    public final fr.cg95.cvq.business.request.social.DhrSpouse getDhrSpouse() {
        return domesticHelpRequestData.getDhrSpouse();
    }
  
    public final void setDhrSpouseIncomes(final fr.cg95.cvq.business.request.social.DhrIncomes dhrSpouseIncomes) {
        domesticHelpRequestData.setDhrSpouseIncomes(dhrSpouseIncomes);
    }

    
    public final fr.cg95.cvq.business.request.social.DhrIncomes getDhrSpouseIncomes() {
        return domesticHelpRequestData.getDhrSpouseIncomes();
    }
  
    public final void setDhrSpouseStatus(final fr.cg95.cvq.business.request.social.DhrSpouseStatus dhrSpouseStatus) {
        domesticHelpRequestData.setDhrSpouseStatus(dhrSpouseStatus);
    }

    
    public final fr.cg95.cvq.business.request.social.DhrSpouseStatus getDhrSpouseStatus() {
        return domesticHelpRequestData.getDhrSpouseStatus();
    }
  
    public final void setDhrTaxesAmount(final fr.cg95.cvq.business.request.social.DhrTaxesAmount dhrTaxesAmount) {
        domesticHelpRequestData.setDhrTaxesAmount(dhrTaxesAmount);
    }

    
    public final fr.cg95.cvq.business.request.social.DhrTaxesAmount getDhrTaxesAmount() {
        return domesticHelpRequestData.getDhrTaxesAmount();
    }
  
}
