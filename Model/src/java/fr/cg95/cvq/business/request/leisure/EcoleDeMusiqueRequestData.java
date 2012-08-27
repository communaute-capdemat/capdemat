

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
@Table(name="ecole_de_musique_request")
public class EcoleDeMusiqueRequestData implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>(RequestData.conditions);

    private Long id;

    public EcoleDeMusiqueRequestData() {
      
        edmrCertifieExactitude = Boolean.valueOf(false);
      
    }

    @Override
    public EcoleDeMusiqueRequestData clone() {
        EcoleDeMusiqueRequestData result = new EcoleDeMusiqueRequestData();
        
          
            
        result.setEdmrCertifieExactitude(edmrCertifieExactitude);
      
          
        
          
            
        if (produit != null)
            result.setProduit(produit.clone());
      
          
        
          
            
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
        
        
        profiles = {"reglements"},
        message = "edmrCertifieExactitude"
      )
    
      @AssertTrue(
        
        
        profiles = {"reglements"},
        message = "edmrCertifieExactitude"
      )
    
    private Boolean edmrCertifieExactitude;

    public void setEdmrCertifieExactitude(final Boolean edmrCertifieExactitude) {
        this.edmrCertifieExactitude = edmrCertifieExactitude;
    }

 
    @Column(name="edmr_certifie_exactitude"  )
      
    public Boolean getEdmrCertifieExactitude() {
        return this.edmrCertifieExactitude;
    }
  
    
      @NotNull(
        
        
        profiles = {"enfant"},
        message = "produit"
      )
    
      @AssertValid(
        
        
        profiles = {"enfant"},
        message = "produit"
      )
    
    private fr.cg95.cvq.business.request.leisure.Produit produit;

    public void setProduit(final fr.cg95.cvq.business.request.leisure.Produit produit) {
        this.produit = produit;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="produit_id")
      
    public fr.cg95.cvq.business.request.leisure.Produit getProduit() {
        return this.produit;
    }
  
    
      @NotNull(
        
        
        profiles = {"enfant"},
        message = "site"
      )
    
      @AssertValid(
        
        
        profiles = {"enfant"},
        message = "site"
      )
    
    private fr.cg95.cvq.business.request.leisure.Site site;

    public void setSite(final fr.cg95.cvq.business.request.leisure.Site site) {
        this.site = site;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="site_id")
      
    public fr.cg95.cvq.business.request.leisure.Site getSite() {
        return this.site;
    }
  
}
