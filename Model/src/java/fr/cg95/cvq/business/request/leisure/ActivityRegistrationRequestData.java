

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

import net.sf.oval.constraint.*;
import fr.cg95.cvq.business.authority.*;
import fr.cg95.cvq.business.request.*;
import fr.cg95.cvq.business.users.*;
import fr.cg95.cvq.service.request.LocalReferential;
import fr.cg95.cvq.service.request.condition.IConditionChecker;

import javax.persistence.*;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Type;

/**
 * Generated class file, do not edit !
 */
@Entity
@Table(name="activity_registration_request")
public class ActivityRegistrationRequestData implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>(RequestData.conditions);

    private Long id;

    public ActivityRegistrationRequestData() {
      
        reglement = Boolean.valueOf(false);
      
    }

    @Override
    public ActivityRegistrationRequestData clone() {
        ActivityRegistrationRequestData result = new ActivityRegistrationRequestData();
        
          
            
        result.setIdProduit(idProduit);
      
          
        
          
            
        result.setIdSegment(idSegment);
      
          
        
          
            
        result.setIdSite(idSite);
      
          
        
          
            
        result.setLabelProduit(labelProduit);
      
          
        
          
            
        result.setLabelSegment(labelSegment);
      
          
        
          
            
        result.setLabelSite(labelSite);
      
          
        
          
            
        result.setReglement(reglement);
      
          
        
          
            
        result.setTypeProduit(typeProduit);
      
          
        
        return result;
    }

    public final void setId(final Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    public final Long getId() {
        return this.id;
    }

  
    
      @NotNull(
        
        
        profiles = {"preinscription"},
        message = "idProduit"
      )
    
      @NotBlank(
        
        
        profiles = {"preinscription"},
        message = "idProduit"
      )
    
    private String idProduit;

    public void setIdProduit(final String idProduit) {
        this.idProduit = idProduit;
    }

 
    @Column(name="id_produit"  )
      
    public String getIdProduit() {
        return this.idProduit;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            
            "active &= _this.conditions['typeProduit'].test(_this.typeProduit.toString());" +
                
              
            
            "return active",
        
        profiles = {"preinscription"},
        message = "idSegment"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            
            "active &= _this.conditions['typeProduit'].test(_this.typeProduit.toString());" +
                
              
            
            "return active",
        
        profiles = {"preinscription"},
        message = "idSegment"
      )
    
    private String idSegment;

    public void setIdSegment(final String idSegment) {
        this.idSegment = idSegment;
    }

 
    @Column(name="id_segment"  )
      
    public String getIdSegment() {
        return this.idSegment;
    }
  
    
      @NotNull(
        
        
        profiles = {"preinscription"},
        message = "idSite"
      )
    
      @NotBlank(
        
        
        profiles = {"preinscription"},
        message = "idSite"
      )
    
    private String idSite;

    public void setIdSite(final String idSite) {
        this.idSite = idSite;
    }

 
    @Column(name="id_site"  )
      
    public String getIdSite() {
        return this.idSite;
    }
  
    
      @NotNull(
        
        
        profiles = {"preinscription"},
        message = "labelProduit"
      )
    
      @NotBlank(
        
        
        profiles = {"preinscription"},
        message = "labelProduit"
      )
    
    private String labelProduit;

    public void setLabelProduit(final String labelProduit) {
        this.labelProduit = labelProduit;
    }

 
    @Column(name="label_produit"  )
      
    public String getLabelProduit() {
        return this.labelProduit;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            
            "active &= _this.conditions['typeProduit'].test(_this.typeProduit.toString());" +
                
              
            
            "return active",
        
        profiles = {"preinscription"},
        message = "labelSegment"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            
            "active &= _this.conditions['typeProduit'].test(_this.typeProduit.toString());" +
                
              
            
            "return active",
        
        profiles = {"preinscription"},
        message = "labelSegment"
      )
    
    private String labelSegment;

    public void setLabelSegment(final String labelSegment) {
        this.labelSegment = labelSegment;
    }

 
    @Column(name="label_segment"  )
      
    public String getLabelSegment() {
        return this.labelSegment;
    }
  
    
      @NotNull(
        
        
        profiles = {"preinscription"},
        message = "labelSite"
      )
    
      @NotBlank(
        
        
        profiles = {"preinscription"},
        message = "labelSite"
      )
    
    private String labelSite;

    public void setLabelSite(final String labelSite) {
        this.labelSite = labelSite;
    }

 
    @Column(name="label_site"  )
      
    public String getLabelSite() {
        return this.labelSite;
    }
  
    
      @NotNull(
        
        
        profiles = {"reglement"},
        message = "reglement"
      )
    
      @AssertTrue(
        
        
        profiles = {"reglement"},
        message = "reglement"
      )
    
    private Boolean reglement;

    public void setReglement(final Boolean reglement) {
        this.reglement = reglement;
    }

 
    @Column(name="reglement"  )
      
    public Boolean getReglement() {
        return this.reglement;
    }
  
    
      @NotNull(
        
        
        profiles = {"preinscription"},
        message = "typeProduit"
      )
    
      @NotBlank(
        
        
        profiles = {"preinscription"},
        message = "typeProduit"
      )
    
    private String typeProduit;

    public void setTypeProduit(final String typeProduit) {
        this.typeProduit = typeProduit;
    }

 
    @Column(name="type_produit"  )
      
    public String getTypeProduit() {
        return this.typeProduit;
    }
  
}
