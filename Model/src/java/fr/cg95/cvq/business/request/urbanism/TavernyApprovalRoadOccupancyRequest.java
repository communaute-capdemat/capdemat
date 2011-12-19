
package fr.cg95.cvq.business.request.urbanism;

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
import fr.cg95.cvq.xml.request.urbanism.*;
import fr.cg95.cvq.service.request.condition.IConditionChecker;

/**
 * Generated class file, do not edit !
 */
public class TavernyApprovalRoadOccupancyRequest extends Request implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions = TavernyApprovalRoadOccupancyRequestData.conditions;

    @AssertValid(message = "")
    private TavernyApprovalRoadOccupancyRequestData tavernyApprovalRoadOccupancyRequestData;

    public TavernyApprovalRoadOccupancyRequest(RequestData requestData, TavernyApprovalRoadOccupancyRequestData tavernyApprovalRoadOccupancyRequestData) {
        super(requestData);
        this.tavernyApprovalRoadOccupancyRequestData = tavernyApprovalRoadOccupancyRequestData;
    }

    public TavernyApprovalRoadOccupancyRequest() {
        super();
        this.tavernyApprovalRoadOccupancyRequestData = new TavernyApprovalRoadOccupancyRequestData();
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("general", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("technique", stepState);
        
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
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("administration", stepState);
        
    }

    /**
     * Reserved for RequestDAO !
     */
    @Override
    public TavernyApprovalRoadOccupancyRequestData getSpecificData() {
        return tavernyApprovalRoadOccupancyRequestData;
    }

    /**
     * Reserved for RequestDAO !
     */
    public void setSpecificData(TavernyApprovalRoadOccupancyRequestData tavernyApprovalRoadOccupancyRequestData) {
        this.tavernyApprovalRoadOccupancyRequestData = tavernyApprovalRoadOccupancyRequestData;
    }

    @Override
    public final String modelToXmlString() {
        TavernyApprovalRoadOccupancyRequestDocument object = this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    @Override
    public final TavernyApprovalRoadOccupancyRequestDocument modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        Date date = null;
        TavernyApprovalRoadOccupancyRequestDocument tavernyApprovalRoadOccupancyRequestDoc = TavernyApprovalRoadOccupancyRequestDocument.Factory.newInstance();
        TavernyApprovalRoadOccupancyRequestDocument.TavernyApprovalRoadOccupancyRequest tavernyApprovalRoadOccupancyRequest = tavernyApprovalRoadOccupancyRequestDoc.addNewTavernyApprovalRoadOccupancyRequest();
        super.fillCommonXmlInfo(tavernyApprovalRoadOccupancyRequest);
        int i = 0;
          TarorEntrepriseChargeeTravauxType tarorEntrepriseChargeeTravauxTypeEntrepriseChargeeTravaux = tavernyApprovalRoadOccupancyRequest.addNewEntrepriseChargeeTravaux();
        if (getAdresseEntreprise() != null)
            tarorEntrepriseChargeeTravauxTypeEntrepriseChargeeTravaux.setAdresseEntreprise(Address.modelToXml(getAdresseEntreprise()));
        TarorLieuConcerneType tarorLieuConcerneTypeLieuConcerne = tavernyApprovalRoadOccupancyRequest.addNewLieuConcerne();
        if (getAdresseLieuConcerne() != null)
            tarorLieuConcerneTypeLieuConcerne.setAdresseLieuConcerne(Address.modelToXml(getAdresseLieuConcerne()));
      
        tavernyApprovalRoadOccupancyRequest.setAvisServiceTechnique(getAvisServiceTechnique());
        TarorMesuresDemandeesType tarorMesuresDemandeesTypeMesuresDemandees = tavernyApprovalRoadOccupancyRequest.addNewMesuresDemandees();
        i = 0;
        if (getChoixMesuresDemandees() != null) {
            fr.cg95.cvq.xml.common.LocalReferentialDataType[] choixMesuresDemandeesTypeTab = new fr.cg95.cvq.xml.common.LocalReferentialDataType[getChoixMesuresDemandees().size()];
            for (LocalReferentialData object : getChoixMesuresDemandees()) {
              choixMesuresDemandeesTypeTab[i++] = LocalReferentialData.modelToXml(object);
            }
            tarorMesuresDemandeesTypeMesuresDemandees.setChoixMesuresDemandeesArray(choixMesuresDemandeesTypeTab);
        }
        TarorObjetDemandeType tarorObjetDemandeTypeObjetDemande = tavernyApprovalRoadOccupancyRequest.addNewObjetDemande();
        i = 0;
        if (getChoixObjetDemande() != null) {
            fr.cg95.cvq.xml.common.LocalReferentialDataType[] choixObjetDemandeTypeTab = new fr.cg95.cvq.xml.common.LocalReferentialDataType[getChoixObjetDemande().size()];
            for (LocalReferentialData object : getChoixObjetDemande()) {
              choixObjetDemandeTypeTab[i++] = LocalReferentialData.modelToXml(object);
            }
            tarorObjetDemandeTypeObjetDemande.setChoixObjetDemandeArray(choixObjetDemandeTypeTab);
        }
        TarorTypeTravauxType tarorTypeTravauxTypeTypeTravaux = tavernyApprovalRoadOccupancyRequest.addNewTypeTravaux();
        i = 0;
        if (getChoixTypeTravaux() != null) {
            fr.cg95.cvq.xml.common.LocalReferentialDataType[] choixTypeTravauxTypeTab = new fr.cg95.cvq.xml.common.LocalReferentialDataType[getChoixTypeTravaux().size()];
            for (LocalReferentialData object : getChoixTypeTravaux()) {
              choixTypeTravauxTypeTab[i++] = LocalReferentialData.modelToXml(object);
            }
            tarorTypeTravauxTypeTypeTravaux.setChoixTypeTravauxArray(choixTypeTravauxTypeTab);
        }
        TarorZonesConcerneesType tarorZonesConcerneesTypeZonesConcernees = tavernyApprovalRoadOccupancyRequest.addNewZonesConcernees();
        i = 0;
        if (getChoixZonesConcernees() != null) {
            fr.cg95.cvq.xml.common.LocalReferentialDataType[] choixZonesConcerneesTypeTab = new fr.cg95.cvq.xml.common.LocalReferentialDataType[getChoixZonesConcernees().size()];
            for (LocalReferentialData object : getChoixZonesConcernees()) {
              choixZonesConcerneesTypeTab[i++] = LocalReferentialData.modelToXml(object);
            }
            tarorZonesConcerneesTypeZonesConcernees.setChoixZonesConcerneesArray(choixZonesConcerneesTypeTab);
        }
        TarorPeriodeType tarorPeriodeTypePeriode = tavernyApprovalRoadOccupancyRequest.addNewPeriode();
        date = getDebutPeriode();
        if (date != null) {
            calendar.setTime(date);
            tarorPeriodeTypePeriode.setDebutPeriode(calendar);
        }
      
        tarorLieuConcerneTypeLieuConcerne.setDescriptifLieuConcerne(getDescriptifLieuConcerne());
      
        tavernyApprovalRoadOccupancyRequest.setDroitsVoirie(getDroitsVoirie());
      
        date = getFinPeriode();
        if (date != null) {
            calendar.setTime(date);
            tarorPeriodeTypePeriode.setFinPeriode(calendar);
        }
        TarorSurfaceOccupeeType tarorSurfaceOccupeeTypeSurfaceOccupee = tavernyApprovalRoadOccupancyRequest.addNewSurfaceOccupee();
        tarorSurfaceOccupeeTypeSurfaceOccupee.setHauteurSurfaceOccupee(getHauteurSurfaceOccupee());
      
        tarorSurfaceOccupeeTypeSurfaceOccupee.setLargeurSurfaceOccupee(getLargeurSurfaceOccupee());
      
        tarorSurfaceOccupeeTypeSurfaceOccupee.setLongueurSurfaceOccupee(getLongueurSurfaceOccupee());
      
        tarorEntrepriseChargeeTravauxTypeEntrepriseChargeeTravaux.setNomEntreprise(getNomEntreprise());
      
        tarorMesuresDemandeesTypeMesuresDemandees.setPrecisionsMesuresDemandees(getPrecisionsMesuresDemandees());
      
        tarorObjetDemandeTypeObjetDemande.setPrecisionsObjetDemande(getPrecisionsObjetDemande());
      
        tarorTypeTravauxTypeTypeTravaux.setPrecisionsTypeTravaux(getPrecisionsTypeTravaux());
      
        tarorZonesConcerneesTypeZonesConcernees.setPrecisionsZonesConcernees(getPrecisionsZonesConcernees());
      
        tarorLieuConcerneTypeLieuConcerne.setProprietaireLieuConcerne(getProprietaireLieuConcerne());
      
        if (getReglement() != null)
            tavernyApprovalRoadOccupancyRequest.setReglement(getReglement().booleanValue());
      
        tarorSurfaceOccupeeTypeSurfaceOccupee.setSurfaceTotale(getSurfaceTotale());
      
        tarorEntrepriseChargeeTravauxTypeEntrepriseChargeeTravaux.setTelecopieEntreprise(getTelecopieEntreprise());
      
        tarorEntrepriseChargeeTravauxTypeEntrepriseChargeeTravaux.setTelephoneEntreprise(getTelephoneEntreprise());
      
        return tavernyApprovalRoadOccupancyRequestDoc;
    }

    @Override
    public final TavernyApprovalRoadOccupancyRequestDocument.TavernyApprovalRoadOccupancyRequest modelToXmlRequest() {
        return modelToXml().getTavernyApprovalRoadOccupancyRequest();
    }

    public static TavernyApprovalRoadOccupancyRequest xmlToModel(TavernyApprovalRoadOccupancyRequestDocument tavernyApprovalRoadOccupancyRequestDoc) {
        TavernyApprovalRoadOccupancyRequestDocument.TavernyApprovalRoadOccupancyRequest tavernyApprovalRoadOccupancyRequestXml = tavernyApprovalRoadOccupancyRequestDoc.getTavernyApprovalRoadOccupancyRequest();
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        TavernyApprovalRoadOccupancyRequest tavernyApprovalRoadOccupancyRequest = new TavernyApprovalRoadOccupancyRequest();
        tavernyApprovalRoadOccupancyRequest.fillCommonModelInfo(tavernyApprovalRoadOccupancyRequest, tavernyApprovalRoadOccupancyRequestXml);
        
        if (tavernyApprovalRoadOccupancyRequestXml.getEntrepriseChargeeTravaux().getAdresseEntreprise() != null)
            tavernyApprovalRoadOccupancyRequest.setAdresseEntreprise(Address.xmlToModel(tavernyApprovalRoadOccupancyRequestXml.getEntrepriseChargeeTravaux().getAdresseEntreprise()));
      
        if (tavernyApprovalRoadOccupancyRequestXml.getLieuConcerne().getAdresseLieuConcerne() != null)
            tavernyApprovalRoadOccupancyRequest.setAdresseLieuConcerne(Address.xmlToModel(tavernyApprovalRoadOccupancyRequestXml.getLieuConcerne().getAdresseLieuConcerne()));
      
        tavernyApprovalRoadOccupancyRequest.setAvisServiceTechnique(tavernyApprovalRoadOccupancyRequestXml.getAvisServiceTechnique());
      
        List<fr.cg95.cvq.business.request.LocalReferentialData> choixMesuresDemandeesList = new ArrayList<fr.cg95.cvq.business.request.LocalReferentialData>(tavernyApprovalRoadOccupancyRequestXml.getMesuresDemandees().sizeOfChoixMesuresDemandeesArray());
        for (LocalReferentialDataType object : tavernyApprovalRoadOccupancyRequestXml.getMesuresDemandees().getChoixMesuresDemandeesArray()) {
            choixMesuresDemandeesList.add(fr.cg95.cvq.business.request.LocalReferentialData.xmlToModel(object));
        }
        tavernyApprovalRoadOccupancyRequest.setChoixMesuresDemandees(choixMesuresDemandeesList);
      
        List<fr.cg95.cvq.business.request.LocalReferentialData> choixObjetDemandeList = new ArrayList<fr.cg95.cvq.business.request.LocalReferentialData>(tavernyApprovalRoadOccupancyRequestXml.getObjetDemande().sizeOfChoixObjetDemandeArray());
        for (LocalReferentialDataType object : tavernyApprovalRoadOccupancyRequestXml.getObjetDemande().getChoixObjetDemandeArray()) {
            choixObjetDemandeList.add(fr.cg95.cvq.business.request.LocalReferentialData.xmlToModel(object));
        }
        tavernyApprovalRoadOccupancyRequest.setChoixObjetDemande(choixObjetDemandeList);
      
        List<fr.cg95.cvq.business.request.LocalReferentialData> choixTypeTravauxList = new ArrayList<fr.cg95.cvq.business.request.LocalReferentialData>(tavernyApprovalRoadOccupancyRequestXml.getTypeTravaux().sizeOfChoixTypeTravauxArray());
        for (LocalReferentialDataType object : tavernyApprovalRoadOccupancyRequestXml.getTypeTravaux().getChoixTypeTravauxArray()) {
            choixTypeTravauxList.add(fr.cg95.cvq.business.request.LocalReferentialData.xmlToModel(object));
        }
        tavernyApprovalRoadOccupancyRequest.setChoixTypeTravaux(choixTypeTravauxList);
      
        List<fr.cg95.cvq.business.request.LocalReferentialData> choixZonesConcerneesList = new ArrayList<fr.cg95.cvq.business.request.LocalReferentialData>(tavernyApprovalRoadOccupancyRequestXml.getZonesConcernees().sizeOfChoixZonesConcerneesArray());
        for (LocalReferentialDataType object : tavernyApprovalRoadOccupancyRequestXml.getZonesConcernees().getChoixZonesConcerneesArray()) {
            choixZonesConcerneesList.add(fr.cg95.cvq.business.request.LocalReferentialData.xmlToModel(object));
        }
        tavernyApprovalRoadOccupancyRequest.setChoixZonesConcernees(choixZonesConcerneesList);
      
        calendar = tavernyApprovalRoadOccupancyRequestXml.getPeriode().getDebutPeriode();
        if (calendar != null) {
            tavernyApprovalRoadOccupancyRequest.setDebutPeriode(calendar.getTime());
        }
      
        tavernyApprovalRoadOccupancyRequest.setDescriptifLieuConcerne(tavernyApprovalRoadOccupancyRequestXml.getLieuConcerne().getDescriptifLieuConcerne());
      
        tavernyApprovalRoadOccupancyRequest.setDroitsVoirie(tavernyApprovalRoadOccupancyRequestXml.getDroitsVoirie());
      
        calendar = tavernyApprovalRoadOccupancyRequestXml.getPeriode().getFinPeriode();
        if (calendar != null) {
            tavernyApprovalRoadOccupancyRequest.setFinPeriode(calendar.getTime());
        }
      
        tavernyApprovalRoadOccupancyRequest.setHauteurSurfaceOccupee(tavernyApprovalRoadOccupancyRequestXml.getSurfaceOccupee().getHauteurSurfaceOccupee());
      
        tavernyApprovalRoadOccupancyRequest.setLargeurSurfaceOccupee(tavernyApprovalRoadOccupancyRequestXml.getSurfaceOccupee().getLargeurSurfaceOccupee());
      
        tavernyApprovalRoadOccupancyRequest.setLongueurSurfaceOccupee(tavernyApprovalRoadOccupancyRequestXml.getSurfaceOccupee().getLongueurSurfaceOccupee());
      
        tavernyApprovalRoadOccupancyRequest.setNomEntreprise(tavernyApprovalRoadOccupancyRequestXml.getEntrepriseChargeeTravaux().getNomEntreprise());
      
        tavernyApprovalRoadOccupancyRequest.setPrecisionsMesuresDemandees(tavernyApprovalRoadOccupancyRequestXml.getMesuresDemandees().getPrecisionsMesuresDemandees());
      
        tavernyApprovalRoadOccupancyRequest.setPrecisionsObjetDemande(tavernyApprovalRoadOccupancyRequestXml.getObjetDemande().getPrecisionsObjetDemande());
      
        tavernyApprovalRoadOccupancyRequest.setPrecisionsTypeTravaux(tavernyApprovalRoadOccupancyRequestXml.getTypeTravaux().getPrecisionsTypeTravaux());
      
        tavernyApprovalRoadOccupancyRequest.setPrecisionsZonesConcernees(tavernyApprovalRoadOccupancyRequestXml.getZonesConcernees().getPrecisionsZonesConcernees());
      
        tavernyApprovalRoadOccupancyRequest.setProprietaireLieuConcerne(tavernyApprovalRoadOccupancyRequestXml.getLieuConcerne().getProprietaireLieuConcerne());
      
        tavernyApprovalRoadOccupancyRequest.setReglement(Boolean.valueOf(tavernyApprovalRoadOccupancyRequestXml.getReglement()));
      
        tavernyApprovalRoadOccupancyRequest.setSurfaceTotale(tavernyApprovalRoadOccupancyRequestXml.getSurfaceOccupee().getSurfaceTotale());
      
        tavernyApprovalRoadOccupancyRequest.setTelecopieEntreprise(tavernyApprovalRoadOccupancyRequestXml.getEntrepriseChargeeTravaux().getTelecopieEntreprise());
      
        tavernyApprovalRoadOccupancyRequest.setTelephoneEntreprise(tavernyApprovalRoadOccupancyRequestXml.getEntrepriseChargeeTravaux().getTelephoneEntreprise());
      
        return tavernyApprovalRoadOccupancyRequest;
    }

    @Override
    public TavernyApprovalRoadOccupancyRequest clone() {
        TavernyApprovalRoadOccupancyRequest clone = new TavernyApprovalRoadOccupancyRequest(getRequestData().clone(), tavernyApprovalRoadOccupancyRequestData.clone());
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("general", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("technique", stepState);
        
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
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", false);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("administration", stepState);
        
        return clone;
    }

  
    public final void setAdresseEntreprise(final fr.cg95.cvq.business.users.Address adresseEntreprise) {
        tavernyApprovalRoadOccupancyRequestData.setAdresseEntreprise(adresseEntreprise);
    }

    
    public final fr.cg95.cvq.business.users.Address getAdresseEntreprise() {
        return tavernyApprovalRoadOccupancyRequestData.getAdresseEntreprise();
    }
  
    public final void setAdresseLieuConcerne(final fr.cg95.cvq.business.users.Address adresseLieuConcerne) {
        tavernyApprovalRoadOccupancyRequestData.setAdresseLieuConcerne(adresseLieuConcerne);
    }

    
    public final fr.cg95.cvq.business.users.Address getAdresseLieuConcerne() {
        return tavernyApprovalRoadOccupancyRequestData.getAdresseLieuConcerne();
    }
  
    public final void setAvisServiceTechnique(final String avisServiceTechnique) {
        tavernyApprovalRoadOccupancyRequestData.setAvisServiceTechnique(avisServiceTechnique);
    }

    
    public final String getAvisServiceTechnique() {
        return tavernyApprovalRoadOccupancyRequestData.getAvisServiceTechnique();
    }
  
    public final void setChoixMesuresDemandees(final List<fr.cg95.cvq.business.request.LocalReferentialData> choixMesuresDemandees) {
        tavernyApprovalRoadOccupancyRequestData.setChoixMesuresDemandees(choixMesuresDemandees);
    }

    
    public final List<fr.cg95.cvq.business.request.LocalReferentialData> getChoixMesuresDemandees() {
        return tavernyApprovalRoadOccupancyRequestData.getChoixMesuresDemandees();
    }
  
    public final void setChoixObjetDemande(final List<fr.cg95.cvq.business.request.LocalReferentialData> choixObjetDemande) {
        tavernyApprovalRoadOccupancyRequestData.setChoixObjetDemande(choixObjetDemande);
    }

    
    public final List<fr.cg95.cvq.business.request.LocalReferentialData> getChoixObjetDemande() {
        return tavernyApprovalRoadOccupancyRequestData.getChoixObjetDemande();
    }
  
    public final void setChoixTypeTravaux(final List<fr.cg95.cvq.business.request.LocalReferentialData> choixTypeTravaux) {
        tavernyApprovalRoadOccupancyRequestData.setChoixTypeTravaux(choixTypeTravaux);
    }

    
    public final List<fr.cg95.cvq.business.request.LocalReferentialData> getChoixTypeTravaux() {
        return tavernyApprovalRoadOccupancyRequestData.getChoixTypeTravaux();
    }
  
    public final void setChoixZonesConcernees(final List<fr.cg95.cvq.business.request.LocalReferentialData> choixZonesConcernees) {
        tavernyApprovalRoadOccupancyRequestData.setChoixZonesConcernees(choixZonesConcernees);
    }

    
    public final List<fr.cg95.cvq.business.request.LocalReferentialData> getChoixZonesConcernees() {
        return tavernyApprovalRoadOccupancyRequestData.getChoixZonesConcernees();
    }
  
    public final void setDebutPeriode(final java.util.Date debutPeriode) {
        tavernyApprovalRoadOccupancyRequestData.setDebutPeriode(debutPeriode);
    }

    
    public final java.util.Date getDebutPeriode() {
        return tavernyApprovalRoadOccupancyRequestData.getDebutPeriode();
    }
  
    public final void setDescriptifLieuConcerne(final String descriptifLieuConcerne) {
        tavernyApprovalRoadOccupancyRequestData.setDescriptifLieuConcerne(descriptifLieuConcerne);
    }

    
    public final String getDescriptifLieuConcerne() {
        return tavernyApprovalRoadOccupancyRequestData.getDescriptifLieuConcerne();
    }
  
    public final void setDroitsVoirie(final String droitsVoirie) {
        tavernyApprovalRoadOccupancyRequestData.setDroitsVoirie(droitsVoirie);
    }

    
    public final String getDroitsVoirie() {
        return tavernyApprovalRoadOccupancyRequestData.getDroitsVoirie();
    }
  
    public final void setFinPeriode(final java.util.Date finPeriode) {
        tavernyApprovalRoadOccupancyRequestData.setFinPeriode(finPeriode);
    }

    
    public final java.util.Date getFinPeriode() {
        return tavernyApprovalRoadOccupancyRequestData.getFinPeriode();
    }
  
    public final void setHauteurSurfaceOccupee(final String hauteurSurfaceOccupee) {
        tavernyApprovalRoadOccupancyRequestData.setHauteurSurfaceOccupee(hauteurSurfaceOccupee);
    }

    
    public final String getHauteurSurfaceOccupee() {
        return tavernyApprovalRoadOccupancyRequestData.getHauteurSurfaceOccupee();
    }
  
    public final void setLargeurSurfaceOccupee(final String largeurSurfaceOccupee) {
        tavernyApprovalRoadOccupancyRequestData.setLargeurSurfaceOccupee(largeurSurfaceOccupee);
    }

    
    public final String getLargeurSurfaceOccupee() {
        return tavernyApprovalRoadOccupancyRequestData.getLargeurSurfaceOccupee();
    }
  
    public final void setLongueurSurfaceOccupee(final String longueurSurfaceOccupee) {
        tavernyApprovalRoadOccupancyRequestData.setLongueurSurfaceOccupee(longueurSurfaceOccupee);
    }

    
    public final String getLongueurSurfaceOccupee() {
        return tavernyApprovalRoadOccupancyRequestData.getLongueurSurfaceOccupee();
    }
  
    public final void setNomEntreprise(final String nomEntreprise) {
        tavernyApprovalRoadOccupancyRequestData.setNomEntreprise(nomEntreprise);
    }

    
    public final String getNomEntreprise() {
        return tavernyApprovalRoadOccupancyRequestData.getNomEntreprise();
    }
  
    public final void setPrecisionsMesuresDemandees(final String precisionsMesuresDemandees) {
        tavernyApprovalRoadOccupancyRequestData.setPrecisionsMesuresDemandees(precisionsMesuresDemandees);
    }

    
    public final String getPrecisionsMesuresDemandees() {
        return tavernyApprovalRoadOccupancyRequestData.getPrecisionsMesuresDemandees();
    }
  
    public final void setPrecisionsObjetDemande(final String precisionsObjetDemande) {
        tavernyApprovalRoadOccupancyRequestData.setPrecisionsObjetDemande(precisionsObjetDemande);
    }

    
    public final String getPrecisionsObjetDemande() {
        return tavernyApprovalRoadOccupancyRequestData.getPrecisionsObjetDemande();
    }
  
    public final void setPrecisionsTypeTravaux(final String precisionsTypeTravaux) {
        tavernyApprovalRoadOccupancyRequestData.setPrecisionsTypeTravaux(precisionsTypeTravaux);
    }

    
    public final String getPrecisionsTypeTravaux() {
        return tavernyApprovalRoadOccupancyRequestData.getPrecisionsTypeTravaux();
    }
  
    public final void setPrecisionsZonesConcernees(final String precisionsZonesConcernees) {
        tavernyApprovalRoadOccupancyRequestData.setPrecisionsZonesConcernees(precisionsZonesConcernees);
    }

    
    public final String getPrecisionsZonesConcernees() {
        return tavernyApprovalRoadOccupancyRequestData.getPrecisionsZonesConcernees();
    }
  
    public final void setProprietaireLieuConcerne(final String proprietaireLieuConcerne) {
        tavernyApprovalRoadOccupancyRequestData.setProprietaireLieuConcerne(proprietaireLieuConcerne);
    }

    
    public final String getProprietaireLieuConcerne() {
        return tavernyApprovalRoadOccupancyRequestData.getProprietaireLieuConcerne();
    }
  
    public final void setReglement(final Boolean reglement) {
        tavernyApprovalRoadOccupancyRequestData.setReglement(reglement);
    }

    @IsRulesAcceptance
    public final Boolean getReglement() {
        return tavernyApprovalRoadOccupancyRequestData.getReglement();
    }
  
    public final void setSurfaceTotale(final String surfaceTotale) {
        tavernyApprovalRoadOccupancyRequestData.setSurfaceTotale(surfaceTotale);
    }

    
    public final String getSurfaceTotale() {
        return tavernyApprovalRoadOccupancyRequestData.getSurfaceTotale();
    }
  
    public final void setTelecopieEntreprise(final String telecopieEntreprise) {
        tavernyApprovalRoadOccupancyRequestData.setTelecopieEntreprise(telecopieEntreprise);
    }

    
    public final String getTelecopieEntreprise() {
        return tavernyApprovalRoadOccupancyRequestData.getTelecopieEntreprise();
    }
  
    public final void setTelephoneEntreprise(final String telephoneEntreprise) {
        tavernyApprovalRoadOccupancyRequestData.setTelephoneEntreprise(telephoneEntreprise);
    }

    
    public final String getTelephoneEntreprise() {
        return tavernyApprovalRoadOccupancyRequestData.getTelephoneEntreprise();
    }
  
}
