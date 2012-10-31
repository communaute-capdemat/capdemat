
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
@Table(name="mar_besoins_demande_pch")
public class MarBesoinsDemandePch implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        MdphAdultRequest.conditions;

    public MarBesoinsDemandePch() {
        super();
      
        aideAnimaliere = Boolean.valueOf(false);
      
        chargesSpecifiques = Boolean.valueOf(false);
      
        aideHumaine = Boolean.valueOf(false);
      
        amenagementVehicule = Boolean.valueOf(false);
      
        amenagementLogementDemenagement = Boolean.valueOf(false);
      
        aideTechnique = Boolean.valueOf(false);
      
    }

    public final String modelToXmlString() {
        MarBesoinsDemandePchType object = (MarBesoinsDemandePchType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MarBesoinsDemandePchType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MarBesoinsDemandePchType marBesoinsDemandePch = MarBesoinsDemandePchType.Factory.newInstance();
        int i = 0;
    
        if (this.aideAnimaliere != null)
            marBesoinsDemandePch.setAideAnimaliere(this.aideAnimaliere.booleanValue());
      
        if (this.chargesSpecifiques != null)
            marBesoinsDemandePch.setChargesSpecifiques(this.chargesSpecifiques.booleanValue());
      
        if (this.aideHumaine != null)
            marBesoinsDemandePch.setAideHumaine(this.aideHumaine.booleanValue());
      
        marBesoinsDemandePch.setPrecisionAmenagementVehicule(this.precisionAmenagementVehicule);
      
        if (this.amenagementVehicule != null)
            marBesoinsDemandePch.setAmenagementVehicule(this.amenagementVehicule.booleanValue());
      
        if (this.amenagementLogementDemenagement != null)
            marBesoinsDemandePch.setAmenagementLogementDemenagement(this.amenagementLogementDemenagement.booleanValue());
      
        marBesoinsDemandePch.setPrecisionChargesSpecifiques(this.precisionChargesSpecifiques);
      
        marBesoinsDemandePch.setPrecisionAideHumaine(this.precisionAideHumaine);
      
        marBesoinsDemandePch.setPrecisionAideTechnique(this.precisionAideTechnique);
      
        marBesoinsDemandePch.setPrecisionAideAnimaliere(this.precisionAideAnimaliere);
      
        marBesoinsDemandePch.setPrecisionAmenagementLogementDemenagement(this.precisionAmenagementLogementDemenagement);
      
        if (this.aideTechnique != null)
            marBesoinsDemandePch.setAideTechnique(this.aideTechnique.booleanValue());
      
        return marBesoinsDemandePch;
    }

    public static MarBesoinsDemandePch xmlToModel(MarBesoinsDemandePchType marBesoinsDemandePchDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MarBesoinsDemandePch marBesoinsDemandePch = new MarBesoinsDemandePch();
    
        marBesoinsDemandePch.setAideAnimaliere(Boolean.valueOf(marBesoinsDemandePchDoc.getAideAnimaliere()));
      
        marBesoinsDemandePch.setChargesSpecifiques(Boolean.valueOf(marBesoinsDemandePchDoc.getChargesSpecifiques()));
      
        marBesoinsDemandePch.setAideHumaine(Boolean.valueOf(marBesoinsDemandePchDoc.getAideHumaine()));
      
        marBesoinsDemandePch.setPrecisionAmenagementVehicule(marBesoinsDemandePchDoc.getPrecisionAmenagementVehicule());
      
        marBesoinsDemandePch.setAmenagementVehicule(Boolean.valueOf(marBesoinsDemandePchDoc.getAmenagementVehicule()));
      
        marBesoinsDemandePch.setAmenagementLogementDemenagement(Boolean.valueOf(marBesoinsDemandePchDoc.getAmenagementLogementDemenagement()));
      
        marBesoinsDemandePch.setPrecisionChargesSpecifiques(marBesoinsDemandePchDoc.getPrecisionChargesSpecifiques());
      
        marBesoinsDemandePch.setPrecisionAideHumaine(marBesoinsDemandePchDoc.getPrecisionAideHumaine());
      
        marBesoinsDemandePch.setPrecisionAideTechnique(marBesoinsDemandePchDoc.getPrecisionAideTechnique());
      
        marBesoinsDemandePch.setPrecisionAideAnimaliere(marBesoinsDemandePchDoc.getPrecisionAideAnimaliere());
      
        marBesoinsDemandePch.setPrecisionAmenagementLogementDemenagement(marBesoinsDemandePchDoc.getPrecisionAmenagementLogementDemenagement());
      
        marBesoinsDemandePch.setAideTechnique(Boolean.valueOf(marBesoinsDemandePchDoc.getAideTechnique()));
      
        return marBesoinsDemandePch;
    }

    @Override
    public MarBesoinsDemandePch clone() {
        MarBesoinsDemandePch result = new MarBesoinsDemandePch();
        
          
            
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

  
    
    private Boolean aideAnimaliere;

    public void setAideAnimaliere(final Boolean aideAnimaliere) {
        this.aideAnimaliere = aideAnimaliere;
    }

    
    @Column(name="aide_animaliere"  )
      
    public Boolean getAideAnimaliere() {
        return this.aideAnimaliere;
    }
  
    
    private Boolean chargesSpecifiques;

    public void setChargesSpecifiques(final Boolean chargesSpecifiques) {
        this.chargesSpecifiques = chargesSpecifiques;
    }

    
    @Column(name="charges_specifiques"  )
      
    public Boolean getChargesSpecifiques() {
        return this.chargesSpecifiques;
    }
  
    
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
          
              "active &= _this.conditions['marBesoinsDemandePch.amenagementVehicule'].test(_this.amenagementVehicule.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"demandePrestationCompensation"},
        message = "precisionAmenagementVehicule"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['marBesoinsDemandePch.amenagementVehicule'].test(_this.amenagementVehicule.toString());" +
                  
                
              
            
            
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
  
    
    private Boolean amenagementVehicule;

    public void setAmenagementVehicule(final Boolean amenagementVehicule) {
        this.amenagementVehicule = amenagementVehicule;
    }

    
    @Column(name="amenagement_vehicule"  )
      
    public Boolean getAmenagementVehicule() {
        return this.amenagementVehicule;
    }
  
    
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
          
              "active &= _this.conditions['marBesoinsDemandePch.chargesSpecifiques'].test(_this.chargesSpecifiques.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"demandePrestationCompensation"},
        message = "precisionChargesSpecifiques"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['marBesoinsDemandePch.chargesSpecifiques'].test(_this.chargesSpecifiques.toString());" +
                  
                
              
            
            
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
          
              "active &= _this.conditions['marBesoinsDemandePch.aideHumaine'].test(_this.aideHumaine.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"demandePrestationCompensation"},
        message = "precisionAideHumaine"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['marBesoinsDemandePch.aideHumaine'].test(_this.aideHumaine.toString());" +
                  
                
              
            
            
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
          
              "active &= _this.conditions['marBesoinsDemandePch.aideTechnique'].test(_this.aideTechnique.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"demandePrestationCompensation"},
        message = "precisionAideTechnique"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['marBesoinsDemandePch.aideTechnique'].test(_this.aideTechnique.toString());" +
                  
                
              
            
            
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
          
              "active &= _this.conditions['marBesoinsDemandePch.aideAnimaliere'].test(_this.aideAnimaliere.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"demandePrestationCompensation"},
        message = "precisionAideAnimaliere"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['marBesoinsDemandePch.aideAnimaliere'].test(_this.aideAnimaliere.toString());" +
                  
                
              
            
            
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
          
              "active &= _this.conditions['marBesoinsDemandePch.amenagementLogementDemenagement'].test(_this.amenagementLogementDemenagement.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"demandePrestationCompensation"},
        message = "precisionAmenagementLogementDemenagement"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['marBesoinsDemandePch.amenagementLogementDemenagement'].test(_this.amenagementLogementDemenagement.toString());" +
                  
                
              
            
            
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
  
    
    private Boolean aideTechnique;

    public void setAideTechnique(final Boolean aideTechnique) {
        this.aideTechnique = aideTechnique;
    }

    
    @Column(name="aide_technique"  )
      
    public Boolean getAideTechnique() {
        return this.aideTechnique;
    }
  
}
