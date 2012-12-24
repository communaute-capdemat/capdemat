
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
public class GlobalSchoolRegistrationRequest extends Request implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions = GlobalSchoolRegistrationRequestData.conditions;

    @AssertValid(message = "")
    private GlobalSchoolRegistrationRequestData globalSchoolRegistrationRequestData;

    public GlobalSchoolRegistrationRequest(RequestData requestData, GlobalSchoolRegistrationRequestData globalSchoolRegistrationRequestData) {
        super(requestData);
        this.globalSchoolRegistrationRequestData = globalSchoolRegistrationRequestData;
    }

    public GlobalSchoolRegistrationRequest() {
        super();
        this.globalSchoolRegistrationRequestData = new GlobalSchoolRegistrationRequestData();
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
          getStepStates().put("restauration", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("periscolaire", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("reglements", stepState);
        
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
    public GlobalSchoolRegistrationRequestData getSpecificData() {
        return globalSchoolRegistrationRequestData;
    }

    /**
     * Reserved for RequestDAO !
     */
    public void setSpecificData(GlobalSchoolRegistrationRequestData globalSchoolRegistrationRequestData) {
        this.globalSchoolRegistrationRequestData = globalSchoolRegistrationRequestData;
    }

    @Override
    public final String modelToXmlString() {
        GlobalSchoolRegistrationRequestDocument object = this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    @Override
    public final GlobalSchoolRegistrationRequestDocument modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        Date date = null;
        GlobalSchoolRegistrationRequestDocument globalSchoolRegistrationRequestDoc = GlobalSchoolRegistrationRequestDocument.Factory.newInstance();
        GlobalSchoolRegistrationRequestDocument.GlobalSchoolRegistrationRequest globalSchoolRegistrationRequest = globalSchoolRegistrationRequestDoc.addNewGlobalSchoolRegistrationRequest();
        super.fillCommonXmlInfo(globalSchoolRegistrationRequest);
        int i = 0;
        
        if (getAcceptationReglementInterieur() != null)
            globalSchoolRegistrationRequest.setAcceptationReglementInterieur(getAcceptationReglementInterieur().booleanValue());
      
        if (getEcoleDerogation() != null)
            globalSchoolRegistrationRequest.setEcoleDerogation(getEcoleDerogation().modelToXml());
      
        if (getEcoleSecteur() != null)
            globalSchoolRegistrationRequest.setEcoleSecteur(getEcoleSecteur().modelToXml());
      
        if (getEstDerogation() != null)
            globalSchoolRegistrationRequest.setEstDerogation(getEstDerogation().booleanValue());
      
        if (getEstPeriscolaire() != null)
            globalSchoolRegistrationRequest.setEstPeriscolaire(getEstPeriscolaire().booleanValue());
      
        if (getEstRestauration() != null)
            globalSchoolRegistrationRequest.setEstRestauration(getEstRestauration().booleanValue());
      
        globalSchoolRegistrationRequest.setInformationsComplementairesDerogation(getInformationsComplementairesDerogation());
      
        i = 0;
        if (getMotifsDerogationEcole() != null) {
            fr.cg95.cvq.xml.common.LocalReferentialDataType[] motifsDerogationEcoleTypeTab = new fr.cg95.cvq.xml.common.LocalReferentialDataType[getMotifsDerogationEcole().size()];
            for (LocalReferentialData object : getMotifsDerogationEcole()) {
              motifsDerogationEcoleTypeTab[i++] = LocalReferentialData.modelToXml(object);
            }
            globalSchoolRegistrationRequest.setMotifsDerogationEcoleArray(motifsDerogationEcoleTypeTab);
        }
      
        return globalSchoolRegistrationRequestDoc;
    }

    @Override
    public final GlobalSchoolRegistrationRequestDocument.GlobalSchoolRegistrationRequest modelToXmlRequest() {
        return modelToXml().getGlobalSchoolRegistrationRequest();
    }

    public static GlobalSchoolRegistrationRequest xmlToModel(GlobalSchoolRegistrationRequestDocument globalSchoolRegistrationRequestDoc) {
        GlobalSchoolRegistrationRequestDocument.GlobalSchoolRegistrationRequest globalSchoolRegistrationRequestXml = globalSchoolRegistrationRequestDoc.getGlobalSchoolRegistrationRequest();
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        GlobalSchoolRegistrationRequest globalSchoolRegistrationRequest = new GlobalSchoolRegistrationRequest();
        globalSchoolRegistrationRequest.fillCommonModelInfo(globalSchoolRegistrationRequest, globalSchoolRegistrationRequestXml);
        
        globalSchoolRegistrationRequest.setAcceptationReglementInterieur(Boolean.valueOf(globalSchoolRegistrationRequestXml.getAcceptationReglementInterieur()));
      
        if (globalSchoolRegistrationRequestXml.getEcoleDerogation() != null)
            globalSchoolRegistrationRequest.setEcoleDerogation(EcoleDerog.xmlToModel(globalSchoolRegistrationRequestXml.getEcoleDerogation()));
      
        if (globalSchoolRegistrationRequestXml.getEcoleSecteur() != null)
            globalSchoolRegistrationRequest.setEcoleSecteur(EcoleSecteur.xmlToModel(globalSchoolRegistrationRequestXml.getEcoleSecteur()));
      
        globalSchoolRegistrationRequest.setEstDerogation(Boolean.valueOf(globalSchoolRegistrationRequestXml.getEstDerogation()));
      
        globalSchoolRegistrationRequest.setEstPeriscolaire(Boolean.valueOf(globalSchoolRegistrationRequestXml.getEstPeriscolaire()));
      
        globalSchoolRegistrationRequest.setEstRestauration(Boolean.valueOf(globalSchoolRegistrationRequestXml.getEstRestauration()));
      
        globalSchoolRegistrationRequest.setInformationsComplementairesDerogation(globalSchoolRegistrationRequestXml.getInformationsComplementairesDerogation());
      
        List<fr.cg95.cvq.business.request.LocalReferentialData> motifsDerogationEcoleList = new ArrayList<fr.cg95.cvq.business.request.LocalReferentialData>(globalSchoolRegistrationRequestXml.sizeOfMotifsDerogationEcoleArray());
        for (LocalReferentialDataType object : globalSchoolRegistrationRequestXml.getMotifsDerogationEcoleArray()) {
            motifsDerogationEcoleList.add(fr.cg95.cvq.business.request.LocalReferentialData.xmlToModel(object));
        }
        globalSchoolRegistrationRequest.setMotifsDerogationEcole(motifsDerogationEcoleList);
      
        return globalSchoolRegistrationRequest;
    }

    @Override
    public GlobalSchoolRegistrationRequest clone() {
        GlobalSchoolRegistrationRequest clone = new GlobalSchoolRegistrationRequest(getRequestData().clone(), globalSchoolRegistrationRequestData.clone());
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
          clone.getStepStates().put("restauration", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("periscolaire", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("reglements", stepState);
        
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

  
    public final void setAcceptationReglementInterieur(final Boolean acceptationReglementInterieur) {
        globalSchoolRegistrationRequestData.setAcceptationReglementInterieur(acceptationReglementInterieur);
    }

    @IsRulesAcceptance
    public final Boolean getAcceptationReglementInterieur() {
        return globalSchoolRegistrationRequestData.getAcceptationReglementInterieur();
    }
  
    public final void setEcoleDerogation(final fr.cg95.cvq.business.request.school.EcoleDerog ecoleDerogation) {
        globalSchoolRegistrationRequestData.setEcoleDerogation(ecoleDerogation);
    }

    
    public final fr.cg95.cvq.business.request.school.EcoleDerog getEcoleDerogation() {
        return globalSchoolRegistrationRequestData.getEcoleDerogation();
    }
  
    public final void setEcoleSecteur(final fr.cg95.cvq.business.request.school.EcoleSecteur ecoleSecteur) {
        globalSchoolRegistrationRequestData.setEcoleSecteur(ecoleSecteur);
    }

    
    public final fr.cg95.cvq.business.request.school.EcoleSecteur getEcoleSecteur() {
        return globalSchoolRegistrationRequestData.getEcoleSecteur();
    }
  
    public final void setEstDerogation(final Boolean estDerogation) {
        globalSchoolRegistrationRequestData.setEstDerogation(estDerogation);
    }

    
    public final Boolean getEstDerogation() {
        return globalSchoolRegistrationRequestData.getEstDerogation();
    }
  
    public final void setEstPeriscolaire(final Boolean estPeriscolaire) {
        globalSchoolRegistrationRequestData.setEstPeriscolaire(estPeriscolaire);
    }

    
    public final Boolean getEstPeriscolaire() {
        return globalSchoolRegistrationRequestData.getEstPeriscolaire();
    }
  
    public final void setEstRestauration(final Boolean estRestauration) {
        globalSchoolRegistrationRequestData.setEstRestauration(estRestauration);
    }

    
    public final Boolean getEstRestauration() {
        return globalSchoolRegistrationRequestData.getEstRestauration();
    }
  
    public final void setInformationsComplementairesDerogation(final String informationsComplementairesDerogation) {
        globalSchoolRegistrationRequestData.setInformationsComplementairesDerogation(informationsComplementairesDerogation);
    }

    
    public final String getInformationsComplementairesDerogation() {
        return globalSchoolRegistrationRequestData.getInformationsComplementairesDerogation();
    }
  
    public final void setMotifsDerogationEcole(final List<fr.cg95.cvq.business.request.LocalReferentialData> motifsDerogationEcole) {
        globalSchoolRegistrationRequestData.setMotifsDerogationEcole(motifsDerogationEcole);
    }

    
    public final List<fr.cg95.cvq.business.request.LocalReferentialData> getMotifsDerogationEcole() {
        return globalSchoolRegistrationRequestData.getMotifsDerogationEcole();
    }
  
}
