
package fr.cg95.cvq.business.request.social;

import java.io.Serializable;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import org.joda.time.LocalTime;

import net.sf.oval.constraint.*;
import org.apache.xmlbeans.XmlOptions;
import fr.cg95.cvq.business.authority.*;
import fr.cg95.cvq.business.request.*;
import fr.cg95.cvq.business.users.*;
import fr.cg95.cvq.xml.common.RequestType;
import fr.cg95.cvq.xml.common.*;
import fr.cg95.cvq.xml.request.social.*;
import fr.cg95.cvq.service.request.LocalReferential;
import fr.cg95.cvq.service.request.condition.IConditionChecker;

/**
 * Generated class file, do not edit !
 *
 * @hibernate.class
 *  table="myr_besoins_demande_pch"
 *  lazy="false"
 */
public class MyrBesoinsDemandePch implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public MyrBesoinsDemandePch() {
        super();
      
        aideAnimaliere = Boolean.valueOf(false);
      
        chargesSpecifiques = Boolean.valueOf(false);
      
        aideHumaine = Boolean.valueOf(false);
      
        amenagementVehicule = Boolean.valueOf(false);
      
        amenagementLogementDemenagement = Boolean.valueOf(false);
      
        aideTechnique = Boolean.valueOf(false);
      
    }

    public final String modelToXmlString() {
        MyrBesoinsDemandePchType object = (MyrBesoinsDemandePchType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MyrBesoinsDemandePchType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MyrBesoinsDemandePchType myrBesoinsDemandePch = MyrBesoinsDemandePchType.Factory.newInstance();
        int i = 0;
    
        if (this.aideAnimaliere != null)
            myrBesoinsDemandePch.setAideAnimaliere(this.aideAnimaliere.booleanValue());
      
        if (this.chargesSpecifiques != null)
            myrBesoinsDemandePch.setChargesSpecifiques(this.chargesSpecifiques.booleanValue());
      
        if (this.aideHumaine != null)
            myrBesoinsDemandePch.setAideHumaine(this.aideHumaine.booleanValue());
      
        myrBesoinsDemandePch.setPrecisionAmenagementVehicule(this.precisionAmenagementVehicule);
      
        if (this.amenagementVehicule != null)
            myrBesoinsDemandePch.setAmenagementVehicule(this.amenagementVehicule.booleanValue());
      
        if (this.amenagementLogementDemenagement != null)
            myrBesoinsDemandePch.setAmenagementLogementDemenagement(this.amenagementLogementDemenagement.booleanValue());
      
        myrBesoinsDemandePch.setPrecisionChargesSpecifiques(this.precisionChargesSpecifiques);
      
        myrBesoinsDemandePch.setPrecisionAideHumaine(this.precisionAideHumaine);
      
        myrBesoinsDemandePch.setPrecisionAideTechnique(this.precisionAideTechnique);
      
        myrBesoinsDemandePch.setPrecisionAideAnimaliere(this.precisionAideAnimaliere);
      
        myrBesoinsDemandePch.setPrecisionAmenagementLogementDemenagement(this.precisionAmenagementLogementDemenagement);
      
        if (this.aideTechnique != null)
            myrBesoinsDemandePch.setAideTechnique(this.aideTechnique.booleanValue());
      
        return myrBesoinsDemandePch;
    }

    public static MyrBesoinsDemandePch xmlToModel(MyrBesoinsDemandePchType myrBesoinsDemandePchDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MyrBesoinsDemandePch myrBesoinsDemandePch = new MyrBesoinsDemandePch();
    
        myrBesoinsDemandePch.setAideAnimaliere(Boolean.valueOf(myrBesoinsDemandePchDoc.getAideAnimaliere()));
      
        myrBesoinsDemandePch.setChargesSpecifiques(Boolean.valueOf(myrBesoinsDemandePchDoc.getChargesSpecifiques()));
      
        myrBesoinsDemandePch.setAideHumaine(Boolean.valueOf(myrBesoinsDemandePchDoc.getAideHumaine()));
      
        myrBesoinsDemandePch.setPrecisionAmenagementVehicule(myrBesoinsDemandePchDoc.getPrecisionAmenagementVehicule());
      
        myrBesoinsDemandePch.setAmenagementVehicule(Boolean.valueOf(myrBesoinsDemandePchDoc.getAmenagementVehicule()));
      
        myrBesoinsDemandePch.setAmenagementLogementDemenagement(Boolean.valueOf(myrBesoinsDemandePchDoc.getAmenagementLogementDemenagement()));
      
        myrBesoinsDemandePch.setPrecisionChargesSpecifiques(myrBesoinsDemandePchDoc.getPrecisionChargesSpecifiques());
      
        myrBesoinsDemandePch.setPrecisionAideHumaine(myrBesoinsDemandePchDoc.getPrecisionAideHumaine());
      
        myrBesoinsDemandePch.setPrecisionAideTechnique(myrBesoinsDemandePchDoc.getPrecisionAideTechnique());
      
        myrBesoinsDemandePch.setPrecisionAideAnimaliere(myrBesoinsDemandePchDoc.getPrecisionAideAnimaliere());
      
        myrBesoinsDemandePch.setPrecisionAmenagementLogementDemenagement(myrBesoinsDemandePchDoc.getPrecisionAmenagementLogementDemenagement());
      
        myrBesoinsDemandePch.setAideTechnique(Boolean.valueOf(myrBesoinsDemandePchDoc.getAideTechnique()));
      
        return myrBesoinsDemandePch;
    }

    @Override
    public MyrBesoinsDemandePch clone() {
        MyrBesoinsDemandePch result = new MyrBesoinsDemandePch();
        
          
            
        result.setAideAnimaliere(aideAnimaliere);
      
          
        
          
            
        result.setChargesSpecifiques(chargesSpecifiques);
      
          
        
          
            
        result.setAideHumaine(aideHumaine);
      
          
        
          
            
        result.setPrecisionAmenagementVehicule(precisionAmenagementVehicule);
      
          
        
          
            
        result.setAmenagementVehicule(amenagementVehicule);
      
          
        
          
            
        result.setAmenagementLogementDemenagement(amenagementLogementDemenagement);
      
          
        
          
            
        result.setPrecisionChargesSpecifiques(precisionChargesSpecifiques);
      
          
        
          
            
        result.setPrecisionAideHumaine(precisionAideHumaine);
      
          
        
          
            
        result.setPrecisionAideTechnique(precisionAideTechnique);
      
          
        
          
            
        result.setPrecisionAideAnimaliere(precisionAideAnimaliere);
      
          
        
          
            
        result.setPrecisionAmenagementLogementDemenagement(precisionAmenagementLogementDemenagement);
      
          
        
          
            
        result.setAideTechnique(aideTechnique);
      
          
        
        return result;
    }

    private Long id;

    public final void setId(final Long id) {
        this.id = id;
    }

    /**
     * @hibernate.id
     *  column="id"
     *  generator-class="sequence"
     */
    public final Long getId() {
        return this.id;
    }

  
    
    private Boolean aideAnimaliere;

    public final void setAideAnimaliere(final Boolean aideAnimaliere) {
        this.aideAnimaliere = aideAnimaliere;
    }

    /**
  
        * @hibernate.property
        *  column="aide_animaliere"
        
      
    */
    public final Boolean getAideAnimaliere() {
        return this.aideAnimaliere;
    }
  
    
    private Boolean chargesSpecifiques;

    public final void setChargesSpecifiques(final Boolean chargesSpecifiques) {
        this.chargesSpecifiques = chargesSpecifiques;
    }

    /**
  
        * @hibernate.property
        *  column="charges_specifiques"
        
      
    */
    public final Boolean getChargesSpecifiques() {
        return this.chargesSpecifiques;
    }
  
    
    private Boolean aideHumaine;

    public final void setAideHumaine(final Boolean aideHumaine) {
        this.aideHumaine = aideHumaine;
    }

    /**
  
        * @hibernate.property
        *  column="aide_humaine"
        
      
    */
    public final Boolean getAideHumaine() {
        return this.aideHumaine;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['myrBesoinsDemandePch.amenagementVehicule'].test(_this.amenagementVehicule.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"demandePrestationCompensation"},
        message = "precisionAmenagementVehicule"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['myrBesoinsDemandePch.amenagementVehicule'].test(_this.amenagementVehicule.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"demandePrestationCompensation"},
        message = "precisionAmenagementVehicule"
      )
    
    private String precisionAmenagementVehicule;

    public final void setPrecisionAmenagementVehicule(final String precisionAmenagementVehicule) {
        this.precisionAmenagementVehicule = precisionAmenagementVehicule;
    }

    /**
  
        * @hibernate.property
        *  column="precision_amenagement_vehicule"
        
      
    */
    public final String getPrecisionAmenagementVehicule() {
        return this.precisionAmenagementVehicule;
    }
  
    
    private Boolean amenagementVehicule;

    public final void setAmenagementVehicule(final Boolean amenagementVehicule) {
        this.amenagementVehicule = amenagementVehicule;
    }

    /**
  
        * @hibernate.property
        *  column="amenagement_vehicule"
        
      
    */
    public final Boolean getAmenagementVehicule() {
        return this.amenagementVehicule;
    }
  
    
    private Boolean amenagementLogementDemenagement;

    public final void setAmenagementLogementDemenagement(final Boolean amenagementLogementDemenagement) {
        this.amenagementLogementDemenagement = amenagementLogementDemenagement;
    }

    /**
  
        * @hibernate.property
        *  column="amenagement_logement_demenagement"
        
      
    */
    public final Boolean getAmenagementLogementDemenagement() {
        return this.amenagementLogementDemenagement;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['myrBesoinsDemandePch.chargesSpecifiques'].test(_this.chargesSpecifiques.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"demandePrestationCompensation"},
        message = "precisionChargesSpecifiques"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['myrBesoinsDemandePch.chargesSpecifiques'].test(_this.chargesSpecifiques.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"demandePrestationCompensation"},
        message = "precisionChargesSpecifiques"
      )
    
    private String precisionChargesSpecifiques;

    public final void setPrecisionChargesSpecifiques(final String precisionChargesSpecifiques) {
        this.precisionChargesSpecifiques = precisionChargesSpecifiques;
    }

    /**
  
        * @hibernate.property
        *  column="precision_charges_specifiques"
        
      
    */
    public final String getPrecisionChargesSpecifiques() {
        return this.precisionChargesSpecifiques;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['myrBesoinsDemandePch.aideHumaine'].test(_this.aideHumaine.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"demandePrestationCompensation"},
        message = "precisionAideHumaine"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['myrBesoinsDemandePch.aideHumaine'].test(_this.aideHumaine.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"demandePrestationCompensation"},
        message = "precisionAideHumaine"
      )
    
    private String precisionAideHumaine;

    public final void setPrecisionAideHumaine(final String precisionAideHumaine) {
        this.precisionAideHumaine = precisionAideHumaine;
    }

    /**
  
        * @hibernate.property
        *  column="precision_aide_humaine"
        
      
    */
    public final String getPrecisionAideHumaine() {
        return this.precisionAideHumaine;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['myrBesoinsDemandePch.aideTechnique'].test(_this.aideTechnique.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"demandePrestationCompensation"},
        message = "precisionAideTechnique"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['myrBesoinsDemandePch.aideTechnique'].test(_this.aideTechnique.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"demandePrestationCompensation"},
        message = "precisionAideTechnique"
      )
    
    private String precisionAideTechnique;

    public final void setPrecisionAideTechnique(final String precisionAideTechnique) {
        this.precisionAideTechnique = precisionAideTechnique;
    }

    /**
  
        * @hibernate.property
        *  column="precision_aide_technique"
        
      
    */
    public final String getPrecisionAideTechnique() {
        return this.precisionAideTechnique;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['myrBesoinsDemandePch.aideAnimaliere'].test(_this.aideAnimaliere.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"demandePrestationCompensation"},
        message = "precisionAideAnimaliere"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['myrBesoinsDemandePch.aideAnimaliere'].test(_this.aideAnimaliere.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"demandePrestationCompensation"},
        message = "precisionAideAnimaliere"
      )
    
    private String precisionAideAnimaliere;

    public final void setPrecisionAideAnimaliere(final String precisionAideAnimaliere) {
        this.precisionAideAnimaliere = precisionAideAnimaliere;
    }

    /**
  
        * @hibernate.property
        *  column="precision_aide_animaliere"
        
      
    */
    public final String getPrecisionAideAnimaliere() {
        return this.precisionAideAnimaliere;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['myrBesoinsDemandePch.amenagementLogementDemenagement'].test(_this.amenagementLogementDemenagement.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"demandePrestationCompensation"},
        message = "precisionAmenagementLogementDemenagement"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['myrBesoinsDemandePch.amenagementLogementDemenagement'].test(_this.amenagementLogementDemenagement.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"demandePrestationCompensation"},
        message = "precisionAmenagementLogementDemenagement"
      )
    
    private String precisionAmenagementLogementDemenagement;

    public final void setPrecisionAmenagementLogementDemenagement(final String precisionAmenagementLogementDemenagement) {
        this.precisionAmenagementLogementDemenagement = precisionAmenagementLogementDemenagement;
    }

    /**
  
        * @hibernate.property
        *  column="precision_amenagement_logement_demenagement"
        
      
    */
    public final String getPrecisionAmenagementLogementDemenagement() {
        return this.precisionAmenagementLogementDemenagement;
    }
  
    
    private Boolean aideTechnique;

    public final void setAideTechnique(final Boolean aideTechnique) {
        this.aideTechnique = aideTechnique;
    }

    /**
  
        * @hibernate.property
        *  column="aide_technique"
        
      
    */
    public final Boolean getAideTechnique() {
        return this.aideTechnique;
    }
  
}
