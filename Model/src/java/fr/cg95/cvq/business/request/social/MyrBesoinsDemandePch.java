
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
import javax.persistence.*;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Type;

/**
 * Generated class file, do not edit !
 */
@Entity
@Table(name="myr_besoins_demande_pch")
public class MyrBesoinsDemandePch implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        MdphYouthRequest.conditions;

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

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    public final Long getId() {
        return this.id;
    }

  
    
      @NotNull(
        
        
        profiles = {"demandePrestationCompensation"},
        message = "aideAnimaliere"
      )
    
    private Boolean aideAnimaliere;

    public void setAideAnimaliere(final Boolean aideAnimaliere) {
        this.aideAnimaliere = aideAnimaliere;
    }

    
    @Column(name="aide_animaliere"  )
      
    public Boolean getAideAnimaliere() {
        return this.aideAnimaliere;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandePrestationCompensation"},
        message = "chargesSpecifiques"
      )
    
    private Boolean chargesSpecifiques;

    public void setChargesSpecifiques(final Boolean chargesSpecifiques) {
        this.chargesSpecifiques = chargesSpecifiques;
    }

    
    @Column(name="charges_specifiques"  )
      
    public Boolean getChargesSpecifiques() {
        return this.chargesSpecifiques;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandePrestationCompensation"},
        message = "aideHumaine"
      )
    
    private Boolean aideHumaine;

    public void setAideHumaine(final Boolean aideHumaine) {
        this.aideHumaine = aideHumaine;
    }

    
    @Column(name="aide_humaine"  )
      
    public Boolean getAideHumaine() {
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

    public void setPrecisionAmenagementVehicule(final String precisionAmenagementVehicule) {
        this.precisionAmenagementVehicule = precisionAmenagementVehicule;
    }

    
    @Column(name="precision_amenagement_vehicule"  )
      
    public String getPrecisionAmenagementVehicule() {
        return this.precisionAmenagementVehicule;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandePrestationCompensation"},
        message = "amenagementVehicule"
      )
    
    private Boolean amenagementVehicule;

    public void setAmenagementVehicule(final Boolean amenagementVehicule) {
        this.amenagementVehicule = amenagementVehicule;
    }

    
    @Column(name="amenagement_vehicule"  )
      
    public Boolean getAmenagementVehicule() {
        return this.amenagementVehicule;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandePrestationCompensation"},
        message = "amenagementLogementDemenagement"
      )
    
    private Boolean amenagementLogementDemenagement;

    public void setAmenagementLogementDemenagement(final Boolean amenagementLogementDemenagement) {
        this.amenagementLogementDemenagement = amenagementLogementDemenagement;
    }

    
    @Column(name="amenagement_logement_demenagement"  )
      
    public Boolean getAmenagementLogementDemenagement() {
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

    public void setPrecisionChargesSpecifiques(final String precisionChargesSpecifiques) {
        this.precisionChargesSpecifiques = precisionChargesSpecifiques;
    }

    
    @Column(name="precision_charges_specifiques"  )
      
    public String getPrecisionChargesSpecifiques() {
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

    public void setPrecisionAideHumaine(final String precisionAideHumaine) {
        this.precisionAideHumaine = precisionAideHumaine;
    }

    
    @Column(name="precision_aide_humaine"  )
      
    public String getPrecisionAideHumaine() {
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

    public void setPrecisionAideTechnique(final String precisionAideTechnique) {
        this.precisionAideTechnique = precisionAideTechnique;
    }

    
    @Column(name="precision_aide_technique"  )
      
    public String getPrecisionAideTechnique() {
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

    public void setPrecisionAideAnimaliere(final String precisionAideAnimaliere) {
        this.precisionAideAnimaliere = precisionAideAnimaliere;
    }

    
    @Column(name="precision_aide_animaliere"  )
      
    public String getPrecisionAideAnimaliere() {
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

    public void setPrecisionAmenagementLogementDemenagement(final String precisionAmenagementLogementDemenagement) {
        this.precisionAmenagementLogementDemenagement = precisionAmenagementLogementDemenagement;
    }

    
    @Column(name="precision_amenagement_logement_demenagement"  )
      
    public String getPrecisionAmenagementLogementDemenagement() {
        return this.precisionAmenagementLogementDemenagement;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandePrestationCompensation"},
        message = "aideTechnique"
      )
    
    private Boolean aideTechnique;

    public void setAideTechnique(final Boolean aideTechnique) {
        this.aideTechnique = aideTechnique;
    }

    
    @Column(name="aide_technique"  )
      
    public Boolean getAideTechnique() {
        return this.aideTechnique;
    }
  
}
