

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
        
          
            
        if (produit != null)
            result.setProduit(produit.clone());
      
          
        
          
            
        result.setReglement(reglement);
      
          
        
          
            
        if (segment != null)
            result.setSegment(segment.clone());
      
          
        
          
            
        if (site != null)
            result.setSite(site.clone());
      
          
        
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
        message = "produit"
      )
    
      @AssertValid(
        
        
        profiles = {"preinscription"},
        message = "produit"
      )
    
    private fr.cg95.cvq.business.request.leisure.ArrProduit produit;

    public void setProduit(final fr.cg95.cvq.business.request.leisure.ArrProduit produit) {
        this.produit = produit;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="produit_id")
      
    public fr.cg95.cvq.business.request.leisure.ArrProduit getProduit() {
        return this.produit;
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
        
        
          when = "groovy:def active = true;" +
          
              
            
            
            "return active",
        
        profiles = {"preinscription"},
        message = "segment"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
              
            
            
            "return active",
        
        profiles = {"preinscription"},
        message = "segment"
      )
    
    private fr.cg95.cvq.business.request.leisure.Segment segment;

    public void setSegment(final fr.cg95.cvq.business.request.leisure.Segment segment) {
        this.segment = segment;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="segment_id")
      
    public fr.cg95.cvq.business.request.leisure.Segment getSegment() {
        return this.segment;
    }
  
    
      @NotNull(
        
        
        profiles = {"preinscription"},
        message = "site"
      )
    
      @AssertValid(
        
        
        profiles = {"preinscription"},
        message = "site"
      )
    
    private fr.cg95.cvq.business.request.leisure.ArrSite site;

    public void setSite(final fr.cg95.cvq.business.request.leisure.ArrSite site) {
        this.site = site;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="site_id")
      
    public fr.cg95.cvq.business.request.leisure.ArrSite getSite() {
        return this.site;
    }
  
}
