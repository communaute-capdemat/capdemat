
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
public class SportsAssociationsGrantRequest extends Request implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions = SportsAssociationsGrantRequestData.conditions;

    @AssertValid(message = "")
    private SportsAssociationsGrantRequestData sportsAssociationsGrantRequestData;

    public SportsAssociationsGrantRequest(RequestData requestData, SportsAssociationsGrantRequestData sportsAssociationsGrantRequestData) {
        super(requestData);
        this.sportsAssociationsGrantRequestData = sportsAssociationsGrantRequestData;
    }

    public SportsAssociationsGrantRequest() {
        super();
        this.sportsAssociationsGrantRequestData = new SportsAssociationsGrantRequestData();
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("association", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("president", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("bureau", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("activites", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          getStepStates().put("subvention", stepState);
        
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
    public SportsAssociationsGrantRequestData getSpecificData() {
        return sportsAssociationsGrantRequestData;
    }

    /**
     * Reserved for RequestDAO !
     */
    public void setSpecificData(SportsAssociationsGrantRequestData sportsAssociationsGrantRequestData) {
        this.sportsAssociationsGrantRequestData = sportsAssociationsGrantRequestData;
    }

    @Override
    public final String modelToXmlString() {
        SportsAssociationsGrantRequestDocument object = this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    @Override
    public final SportsAssociationsGrantRequestDocument modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        Date date = null;
        SportsAssociationsGrantRequestDocument sportsAssociationsGrantRequestDoc = SportsAssociationsGrantRequestDocument.Factory.newInstance();
        SportsAssociationsGrantRequestDocument.SportsAssociationsGrantRequest sportsAssociationsGrantRequest = sportsAssociationsGrantRequestDoc.addNewSportsAssociationsGrantRequest();
        super.fillCommonXmlInfo(sportsAssociationsGrantRequest);
        int i = 0;
        
        i = 0;
        if (getAutreMembreBureau() != null) {
            fr.cg95.cvq.xml.request.social.SagrMembreBureauType[] autreMembreBureauTypeTab = new fr.cg95.cvq.xml.request.social.SagrMembreBureauType[getAutreMembreBureau().size()];
            for (SagrMembreBureau object : getAutreMembreBureau()) {
              autreMembreBureauTypeTab[i++] = object.modelToXml();
            }
            sportsAssociationsGrantRequest.setAutreMembreBureauArray(autreMembreBureauTypeTab);
        }
      
        if (getCompteBancaire() != null)
            sportsAssociationsGrantRequest.setCompteBancaire(getCompteBancaire().modelToXml());
      
        if (getContactsAssociation() != null)
            sportsAssociationsGrantRequest.setContactsAssociation(getContactsAssociation().modelToXml());
      
        sportsAssociationsGrantRequest.setIdentifiantEDemandeAssociation(getIdentifiantEDemandeAssociation());
      
        if (getMontantSubvention() != null)
            sportsAssociationsGrantRequest.setMontantSubvention(getMontantSubvention());
      
        sportsAssociationsGrantRequest.setNomAssociation(getNomAssociation());
      
        sportsAssociationsGrantRequest.setNumeroEnregistrementAssociation(getNumeroEnregistrementAssociation());
      
        if (getNumerosAssociation() != null)
            sportsAssociationsGrantRequest.setNumerosAssociation(getNumerosAssociation().modelToXml());
      
        if (getPrecisionPresident() != null)
            sportsAssociationsGrantRequest.setPrecisionPresident(getPrecisionPresident().modelToXml());
      
        if (getRoleDemandeur() != null)
            sportsAssociationsGrantRequest.setRoleDemandeur(fr.cg95.cvq.xml.request.social.SagrRoleAssociationType.Enum.forString(getRoleDemandeur().getLegacyLabel()));
      
        i = 0;
        if (getSagrActiviteAssociation() != null) {
            fr.cg95.cvq.xml.request.social.SagrActiviteAssociationType[] sagrActiviteAssociationTypeTab = new fr.cg95.cvq.xml.request.social.SagrActiviteAssociationType[getSagrActiviteAssociation().size()];
            for (SagrActiviteAssociation object : getSagrActiviteAssociation()) {
              sagrActiviteAssociationTypeTab[i++] = object.modelToXml();
            }
            sportsAssociationsGrantRequest.setSagrActiviteAssociationArray(sagrActiviteAssociationTypeTab);
        }
      
        if (getSiegeSocialAssociation() != null)
            sportsAssociationsGrantRequest.setSiegeSocialAssociation(getSiegeSocialAssociation().modelToXml());
      
        if (getSubventionPubliqueFonctionnement() != null)
            sportsAssociationsGrantRequest.setSubventionPubliqueFonctionnement(getSubventionPubliqueFonctionnement().modelToXml());
      
        if (getSubventionSolliciteConseilGeneral() != null)
            sportsAssociationsGrantRequest.setSubventionSolliciteConseilGeneral(getSubventionSolliciteConseilGeneral());
      
        return sportsAssociationsGrantRequestDoc;
    }

    @Override
    public final SportsAssociationsGrantRequestDocument.SportsAssociationsGrantRequest modelToXmlRequest() {
        return modelToXml().getSportsAssociationsGrantRequest();
    }

    public static SportsAssociationsGrantRequest xmlToModel(SportsAssociationsGrantRequestDocument sportsAssociationsGrantRequestDoc) {
        SportsAssociationsGrantRequestDocument.SportsAssociationsGrantRequest sportsAssociationsGrantRequestXml = sportsAssociationsGrantRequestDoc.getSportsAssociationsGrantRequest();
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        SportsAssociationsGrantRequest sportsAssociationsGrantRequest = new SportsAssociationsGrantRequest();
        sportsAssociationsGrantRequest.fillCommonModelInfo(sportsAssociationsGrantRequest, sportsAssociationsGrantRequestXml);
        
        List<fr.cg95.cvq.business.request.social.SagrMembreBureau> autreMembreBureauList = new ArrayList<fr.cg95.cvq.business.request.social.SagrMembreBureau>(sportsAssociationsGrantRequestXml.sizeOfAutreMembreBureauArray());
        for (SagrMembreBureauType object : sportsAssociationsGrantRequestXml.getAutreMembreBureauArray()) {
            autreMembreBureauList.add(fr.cg95.cvq.business.request.social.SagrMembreBureau.xmlToModel(object));
        }
        sportsAssociationsGrantRequest.setAutreMembreBureau(autreMembreBureauList);
      
        if (sportsAssociationsGrantRequestXml.getCompteBancaire() != null)
            sportsAssociationsGrantRequest.setCompteBancaire(BankAccount.xmlToModel(sportsAssociationsGrantRequestXml.getCompteBancaire()));
      
        if (sportsAssociationsGrantRequestXml.getContactsAssociation() != null)
            sportsAssociationsGrantRequest.setContactsAssociation(SagrContactsAssociation.xmlToModel(sportsAssociationsGrantRequestXml.getContactsAssociation()));
      
        sportsAssociationsGrantRequest.setIdentifiantEDemandeAssociation(sportsAssociationsGrantRequestXml.getIdentifiantEDemandeAssociation());
      
        if (sportsAssociationsGrantRequestXml.getMontantSubvention() != null)
            sportsAssociationsGrantRequest.setMontantSubvention(sportsAssociationsGrantRequestXml.getMontantSubvention());
      
        sportsAssociationsGrantRequest.setNomAssociation(sportsAssociationsGrantRequestXml.getNomAssociation());
      
        sportsAssociationsGrantRequest.setNumeroEnregistrementAssociation(sportsAssociationsGrantRequestXml.getNumeroEnregistrementAssociation());
      
        if (sportsAssociationsGrantRequestXml.getNumerosAssociation() != null)
            sportsAssociationsGrantRequest.setNumerosAssociation(SagrNumerosAssociation.xmlToModel(sportsAssociationsGrantRequestXml.getNumerosAssociation()));
      
        if (sportsAssociationsGrantRequestXml.getPrecisionPresident() != null)
            sportsAssociationsGrantRequest.setPrecisionPresident(SagrPrecisionPresident.xmlToModel(sportsAssociationsGrantRequestXml.getPrecisionPresident()));
      
        if (sportsAssociationsGrantRequestXml.getRoleDemandeur() != null)
            sportsAssociationsGrantRequest.setRoleDemandeur(fr.cg95.cvq.business.request.social.SagrRoleAssociationType.forString(sportsAssociationsGrantRequestXml.getRoleDemandeur().toString()));
        else
            sportsAssociationsGrantRequest.setRoleDemandeur(fr.cg95.cvq.business.request.social.SagrRoleAssociationType.getDefaultSagrRoleAssociationType());
      
        List<fr.cg95.cvq.business.request.social.SagrActiviteAssociation> sagrActiviteAssociationList = new ArrayList<fr.cg95.cvq.business.request.social.SagrActiviteAssociation>(sportsAssociationsGrantRequestXml.sizeOfSagrActiviteAssociationArray());
        for (SagrActiviteAssociationType object : sportsAssociationsGrantRequestXml.getSagrActiviteAssociationArray()) {
            sagrActiviteAssociationList.add(fr.cg95.cvq.business.request.social.SagrActiviteAssociation.xmlToModel(object));
        }
        sportsAssociationsGrantRequest.setSagrActiviteAssociation(sagrActiviteAssociationList);
      
        if (sportsAssociationsGrantRequestXml.getSiegeSocialAssociation() != null)
            sportsAssociationsGrantRequest.setSiegeSocialAssociation(Address.xmlToModel(sportsAssociationsGrantRequestXml.getSiegeSocialAssociation()));
      
        if (sportsAssociationsGrantRequestXml.getSubventionPubliqueFonctionnement() != null)
            sportsAssociationsGrantRequest.setSubventionPubliqueFonctionnement(SagrSubventionPubliqueFonctionnement.xmlToModel(sportsAssociationsGrantRequestXml.getSubventionPubliqueFonctionnement()));
      
        if (sportsAssociationsGrantRequestXml.getSubventionSolliciteConseilGeneral() != null)
            sportsAssociationsGrantRequest.setSubventionSolliciteConseilGeneral(sportsAssociationsGrantRequestXml.getSubventionSolliciteConseilGeneral());
      
        return sportsAssociationsGrantRequest;
    }

    @Override
    public SportsAssociationsGrantRequest clone() {
        SportsAssociationsGrantRequest clone = new SportsAssociationsGrantRequest(getRequestData().clone(), sportsAssociationsGrantRequestData.clone());
        Map<String, Object> stepState;
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "uncomplete");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("association", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("president", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("bureau", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("activites", stepState);
        
          stepState = new HashMap<String, Object>(4);
          stepState.put("state", "unavailable");
          stepState.put("required", true);
          stepState.put("errorMsg", null);
          stepState.put("invalidFields", new ArrayList<String>());
          clone.getStepStates().put("subvention", stepState);
        
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

  
    public final void setAutreMembreBureau(final List<fr.cg95.cvq.business.request.social.SagrMembreBureau> autreMembreBureau) {
        sportsAssociationsGrantRequestData.setAutreMembreBureau(autreMembreBureau);
    }

    
    public final List<fr.cg95.cvq.business.request.social.SagrMembreBureau> getAutreMembreBureau() {
        return sportsAssociationsGrantRequestData.getAutreMembreBureau();
    }
  
    public final void setCompteBancaire(final fr.cg95.cvq.business.users.BankAccount compteBancaire) {
        sportsAssociationsGrantRequestData.setCompteBancaire(compteBancaire);
    }

    
    public final fr.cg95.cvq.business.users.BankAccount getCompteBancaire() {
        return sportsAssociationsGrantRequestData.getCompteBancaire();
    }
  
    public final void setContactsAssociation(final fr.cg95.cvq.business.request.social.SagrContactsAssociation contactsAssociation) {
        sportsAssociationsGrantRequestData.setContactsAssociation(contactsAssociation);
    }

    
    public final fr.cg95.cvq.business.request.social.SagrContactsAssociation getContactsAssociation() {
        return sportsAssociationsGrantRequestData.getContactsAssociation();
    }
  
    public final void setIdentifiantEDemandeAssociation(final String identifiantEDemandeAssociation) {
        sportsAssociationsGrantRequestData.setIdentifiantEDemandeAssociation(identifiantEDemandeAssociation);
    }

    
    public final String getIdentifiantEDemandeAssociation() {
        return sportsAssociationsGrantRequestData.getIdentifiantEDemandeAssociation();
    }
  
    public final void setMontantSubvention(final java.math.BigDecimal montantSubvention) {
        sportsAssociationsGrantRequestData.setMontantSubvention(montantSubvention);
    }

    
    public final java.math.BigDecimal getMontantSubvention() {
        return sportsAssociationsGrantRequestData.getMontantSubvention();
    }
  
    public final void setNomAssociation(final String nomAssociation) {
        sportsAssociationsGrantRequestData.setNomAssociation(nomAssociation);
    }

    
    public final String getNomAssociation() {
        return sportsAssociationsGrantRequestData.getNomAssociation();
    }
  
    public final void setNumeroEnregistrementAssociation(final String numeroEnregistrementAssociation) {
        sportsAssociationsGrantRequestData.setNumeroEnregistrementAssociation(numeroEnregistrementAssociation);
    }

    
    public final String getNumeroEnregistrementAssociation() {
        return sportsAssociationsGrantRequestData.getNumeroEnregistrementAssociation();
    }
  
    public final void setNumerosAssociation(final fr.cg95.cvq.business.request.social.SagrNumerosAssociation numerosAssociation) {
        sportsAssociationsGrantRequestData.setNumerosAssociation(numerosAssociation);
    }

    
    public final fr.cg95.cvq.business.request.social.SagrNumerosAssociation getNumerosAssociation() {
        return sportsAssociationsGrantRequestData.getNumerosAssociation();
    }
  
    public final void setPrecisionPresident(final fr.cg95.cvq.business.request.social.SagrPrecisionPresident precisionPresident) {
        sportsAssociationsGrantRequestData.setPrecisionPresident(precisionPresident);
    }

    
    public final fr.cg95.cvq.business.request.social.SagrPrecisionPresident getPrecisionPresident() {
        return sportsAssociationsGrantRequestData.getPrecisionPresident();
    }
  
    public final void setRoleDemandeur(final fr.cg95.cvq.business.request.social.SagrRoleAssociationType roleDemandeur) {
        sportsAssociationsGrantRequestData.setRoleDemandeur(roleDemandeur);
    }

    
    public final fr.cg95.cvq.business.request.social.SagrRoleAssociationType getRoleDemandeur() {
        return sportsAssociationsGrantRequestData.getRoleDemandeur();
    }
  
    public final void setSagrActiviteAssociation(final List<fr.cg95.cvq.business.request.social.SagrActiviteAssociation> sagrActiviteAssociation) {
        sportsAssociationsGrantRequestData.setSagrActiviteAssociation(sagrActiviteAssociation);
    }

    
    public final List<fr.cg95.cvq.business.request.social.SagrActiviteAssociation> getSagrActiviteAssociation() {
        return sportsAssociationsGrantRequestData.getSagrActiviteAssociation();
    }
  
    public final void setSiegeSocialAssociation(final fr.cg95.cvq.business.users.Address siegeSocialAssociation) {
        sportsAssociationsGrantRequestData.setSiegeSocialAssociation(siegeSocialAssociation);
    }

    
    public final fr.cg95.cvq.business.users.Address getSiegeSocialAssociation() {
        return sportsAssociationsGrantRequestData.getSiegeSocialAssociation();
    }
  
    public final void setSubventionPubliqueFonctionnement(final fr.cg95.cvq.business.request.social.SagrSubventionPubliqueFonctionnement subventionPubliqueFonctionnement) {
        sportsAssociationsGrantRequestData.setSubventionPubliqueFonctionnement(subventionPubliqueFonctionnement);
    }

    
    public final fr.cg95.cvq.business.request.social.SagrSubventionPubliqueFonctionnement getSubventionPubliqueFonctionnement() {
        return sportsAssociationsGrantRequestData.getSubventionPubliqueFonctionnement();
    }
  
    public final void setSubventionSolliciteConseilGeneral(final java.math.BigDecimal subventionSolliciteConseilGeneral) {
        sportsAssociationsGrantRequestData.setSubventionSolliciteConseilGeneral(subventionSolliciteConseilGeneral);
    }

    
    public final java.math.BigDecimal getSubventionSolliciteConseilGeneral() {
        return sportsAssociationsGrantRequestData.getSubventionSolliciteConseilGeneral();
    }
  
}
