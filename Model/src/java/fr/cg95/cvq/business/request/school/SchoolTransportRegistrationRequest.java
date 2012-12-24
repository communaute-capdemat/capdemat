
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
public class SchoolTransportRegistrationRequest extends Request implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions = SchoolTransportRegistrationRequestData.conditions;

    @AssertValid(message = "")
    private SchoolTransportRegistrationRequestData schoolTransportRegistrationRequestData;

    public SchoolTransportRegistrationRequest(RequestData requestData, SchoolTransportRegistrationRequestData schoolTransportRegistrationRequestData) {
        super(requestData);
        this.schoolTransportRegistrationRequestData = schoolTransportRegistrationRequestData;
    }

    public SchoolTransportRegistrationRequest() {
        super();
        this.schoolTransportRegistrationRequestData = new SchoolTransportRegistrationRequestData();
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
          getStepStates().put("autorisations", stepState);
        
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
    public SchoolTransportRegistrationRequestData getSpecificData() {
        return schoolTransportRegistrationRequestData;
    }

    /**
     * Reserved for RequestDAO !
     */
    public void setSpecificData(SchoolTransportRegistrationRequestData schoolTransportRegistrationRequestData) {
        this.schoolTransportRegistrationRequestData = schoolTransportRegistrationRequestData;
    }

    @Override
    public final String modelToXmlString() {
        SchoolTransportRegistrationRequestDocument object = this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    @Override
    public final SchoolTransportRegistrationRequestDocument modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        Date date = null;
        SchoolTransportRegistrationRequestDocument schoolTransportRegistrationRequestDoc = SchoolTransportRegistrationRequestDocument.Factory.newInstance();
        SchoolTransportRegistrationRequestDocument.SchoolTransportRegistrationRequest schoolTransportRegistrationRequest = schoolTransportRegistrationRequestDoc.addNewSchoolTransportRegistrationRequest();
        super.fillCommonXmlInfo(schoolTransportRegistrationRequest);
        int i = 0;
        
        if (getAcceptationReglementInterieur() != null)
            schoolTransportRegistrationRequest.setAcceptationReglementInterieur(getAcceptationReglementInterieur().booleanValue());
      
        if (getArret() != null)
            schoolTransportRegistrationRequest.setArret(getArret().modelToXml());
      
        if (getAutorisation() != null)
            schoolTransportRegistrationRequest.setAutorisation(fr.cg95.cvq.xml.request.school.AutorisationType.Enum.forString(getAutorisation().getLegacyLabel()));
      
        if (getEstMaternelleElementaireAutorisations() != null)
            schoolTransportRegistrationRequest.setEstMaternelleElementaireAutorisations(getEstMaternelleElementaireAutorisations().booleanValue());
      
        if (getFrereOuSoeurAutorise() != null)
            schoolTransportRegistrationRequest.setFrereOuSoeurAutorise(getFrereOuSoeurAutorise().modelToXml());
      
        if (getLigne() != null)
            schoolTransportRegistrationRequest.setLigne(getLigne().modelToXml());
      
        i = 0;
        if (getTiersAutorises() != null) {
            fr.cg95.cvq.xml.request.school.TiersInformationsType[] tiersAutorisesTypeTab = new fr.cg95.cvq.xml.request.school.TiersInformationsType[getTiersAutorises().size()];
            for (TiersInformations object : getTiersAutorises()) {
              tiersAutorisesTypeTab[i++] = object.modelToXml();
            }
            schoolTransportRegistrationRequest.setTiersAutorisesArray(tiersAutorisesTypeTab);
        }
      
        return schoolTransportRegistrationRequestDoc;
    }

    @Override
    public final SchoolTransportRegistrationRequestDocument.SchoolTransportRegistrationRequest modelToXmlRequest() {
        return modelToXml().getSchoolTransportRegistrationRequest();
    }

    public static SchoolTransportRegistrationRequest xmlToModel(SchoolTransportRegistrationRequestDocument schoolTransportRegistrationRequestDoc) {
        SchoolTransportRegistrationRequestDocument.SchoolTransportRegistrationRequest schoolTransportRegistrationRequestXml = schoolTransportRegistrationRequestDoc.getSchoolTransportRegistrationRequest();
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        SchoolTransportRegistrationRequest schoolTransportRegistrationRequest = new SchoolTransportRegistrationRequest();
        schoolTransportRegistrationRequest.fillCommonModelInfo(schoolTransportRegistrationRequest, schoolTransportRegistrationRequestXml);
        
        schoolTransportRegistrationRequest.setAcceptationReglementInterieur(Boolean.valueOf(schoolTransportRegistrationRequestXml.getAcceptationReglementInterieur()));
      
        if (schoolTransportRegistrationRequestXml.getArret() != null)
            schoolTransportRegistrationRequest.setArret(Arret.xmlToModel(schoolTransportRegistrationRequestXml.getArret()));
      
        if (schoolTransportRegistrationRequestXml.getAutorisation() != null)
            schoolTransportRegistrationRequest.setAutorisation(fr.cg95.cvq.business.request.school.AutorisationType.forString(schoolTransportRegistrationRequestXml.getAutorisation().toString()));
        else
            schoolTransportRegistrationRequest.setAutorisation(fr.cg95.cvq.business.request.school.AutorisationType.getDefaultAutorisationType());
      
        schoolTransportRegistrationRequest.setEstMaternelleElementaireAutorisations(Boolean.valueOf(schoolTransportRegistrationRequestXml.getEstMaternelleElementaireAutorisations()));
      
        if (schoolTransportRegistrationRequestXml.getFrereOuSoeurAutorise() != null)
            schoolTransportRegistrationRequest.setFrereOuSoeurAutorise(FrereOuSoeurInformations.xmlToModel(schoolTransportRegistrationRequestXml.getFrereOuSoeurAutorise()));
      
        if (schoolTransportRegistrationRequestXml.getLigne() != null)
            schoolTransportRegistrationRequest.setLigne(Ligne.xmlToModel(schoolTransportRegistrationRequestXml.getLigne()));
      
        List<fr.cg95.cvq.business.request.school.TiersInformations> tiersAutorisesList = new ArrayList<fr.cg95.cvq.business.request.school.TiersInformations>(schoolTransportRegistrationRequestXml.sizeOfTiersAutorisesArray());
        for (TiersInformationsType object : schoolTransportRegistrationRequestXml.getTiersAutorisesArray()) {
            tiersAutorisesList.add(fr.cg95.cvq.business.request.school.TiersInformations.xmlToModel(object));
        }
        schoolTransportRegistrationRequest.setTiersAutorises(tiersAutorisesList);
      
        return schoolTransportRegistrationRequest;
    }

    @Override
    public SchoolTransportRegistrationRequest clone() {
        SchoolTransportRegistrationRequest clone = new SchoolTransportRegistrationRequest(getRequestData().clone(), schoolTransportRegistrationRequestData.clone());
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
          clone.getStepStates().put("autorisations", stepState);
        
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
        schoolTransportRegistrationRequestData.setAcceptationReglementInterieur(acceptationReglementInterieur);
    }

    @IsRulesAcceptance
    public final Boolean getAcceptationReglementInterieur() {
        return schoolTransportRegistrationRequestData.getAcceptationReglementInterieur();
    }
  
    public final void setArret(final fr.cg95.cvq.business.request.school.Arret arret) {
        schoolTransportRegistrationRequestData.setArret(arret);
    }

    
    public final fr.cg95.cvq.business.request.school.Arret getArret() {
        return schoolTransportRegistrationRequestData.getArret();
    }
  
    public final void setAutorisation(final fr.cg95.cvq.business.request.school.AutorisationType autorisation) {
        schoolTransportRegistrationRequestData.setAutorisation(autorisation);
    }

    
    public final fr.cg95.cvq.business.request.school.AutorisationType getAutorisation() {
        return schoolTransportRegistrationRequestData.getAutorisation();
    }
  
    public final void setEstMaternelleElementaireAutorisations(final Boolean estMaternelleElementaireAutorisations) {
        schoolTransportRegistrationRequestData.setEstMaternelleElementaireAutorisations(estMaternelleElementaireAutorisations);
    }

    
    public final Boolean getEstMaternelleElementaireAutorisations() {
        return schoolTransportRegistrationRequestData.getEstMaternelleElementaireAutorisations();
    }
  
    public final void setFrereOuSoeurAutorise(final fr.cg95.cvq.business.request.school.FrereOuSoeurInformations frereOuSoeurAutorise) {
        schoolTransportRegistrationRequestData.setFrereOuSoeurAutorise(frereOuSoeurAutorise);
    }

    
    public final fr.cg95.cvq.business.request.school.FrereOuSoeurInformations getFrereOuSoeurAutorise() {
        return schoolTransportRegistrationRequestData.getFrereOuSoeurAutorise();
    }
  
    public final void setLigne(final fr.cg95.cvq.business.request.school.Ligne ligne) {
        schoolTransportRegistrationRequestData.setLigne(ligne);
    }

    
    public final fr.cg95.cvq.business.request.school.Ligne getLigne() {
        return schoolTransportRegistrationRequestData.getLigne();
    }
  
    public final void setTiersAutorises(final List<fr.cg95.cvq.business.request.school.TiersInformations> tiersAutorises) {
        schoolTransportRegistrationRequestData.setTiersAutorises(tiersAutorises);
    }

    
    public final List<fr.cg95.cvq.business.request.school.TiersInformations> getTiersAutorises() {
        return schoolTransportRegistrationRequestData.getTiersAutorises();
    }
  
}
