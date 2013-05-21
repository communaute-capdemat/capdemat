

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
@Table(name="leisure_center_registration_request")
public class LeisureCenterRegistrationRequestData implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>(RequestData.conditions);

    private Long id;

    public LeisureCenterRegistrationRequestData() {
      
        acceptationReglementInterieur = Boolean.valueOf(false);
      
        estDerogation = Boolean.valueOf(false);
      
        estTransport = Boolean.valueOf(false);
      
    }

    @Override
    public LeisureCenterRegistrationRequestData clone() {
        LeisureCenterRegistrationRequestData result = new LeisureCenterRegistrationRequestData();
        
          
            
        result.setAcceptationReglementInterieur(acceptationReglementInterieur);
      
          
        
          
            
        if (centresLoisirs != null)
            result.setCentresLoisirs(centresLoisirs.clone());
      
          
        
          
            
        result.setEstDerogation(estDerogation);
      
          
        
          
            
        result.setEstTransport(estTransport);
      
          
        
          
            
        List<fr.cg95.cvq.business.request.LocalReferentialData> motifsDerogationCentreLoisirsList = new ArrayList<fr.cg95.cvq.business.request.LocalReferentialData>();
        result.setMotifsDerogationCentreLoisirs(motifsDerogationCentreLoisirsList);
      
          
        
          
            
        if (transports != null)
            result.setTransports(transports.clone());
      
          
        
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

  
    
    private Boolean acceptationReglementInterieur;

    public void setAcceptationReglementInterieur(final Boolean acceptationReglementInterieur) {
        this.acceptationReglementInterieur = acceptationReglementInterieur;
    }

 
    @Column(name="acceptation_reglement_interieur"  )
      
    public Boolean getAcceptationReglementInterieur() {
        return this.acceptationReglementInterieur;
    }
  
    
      @NotNull(
        
        
        profiles = {"enfant"},
        message = "centresLoisirs"
      )
    
      @AssertValid(
        
        
        profiles = {"enfant"},
        message = "centresLoisirs"
      )
    
    private fr.cg95.cvq.business.request.school.CentreLoisirs centresLoisirs;

    public void setCentresLoisirs(final fr.cg95.cvq.business.request.school.CentreLoisirs centresLoisirs) {
        this.centresLoisirs = centresLoisirs;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="centres_loisirs_id")
      
    public fr.cg95.cvq.business.request.school.CentreLoisirs getCentresLoisirs() {
        return this.centresLoisirs;
    }
  
    
      @NotNull(
        
        
        profiles = {"enfant"},
        message = "estDerogation"
      )
    
    private Boolean estDerogation;

    public void setEstDerogation(final Boolean estDerogation) {
        this.estDerogation = estDerogation;
    }

 
    @Column(name="est_derogation"  )
      
    public Boolean getEstDerogation() {
        return this.estDerogation;
    }
  
    
      @NotNull(
        
        
        profiles = {"enfant"},
        message = "estTransport"
      )
    
    private Boolean estTransport;

    public void setEstTransport(final Boolean estTransport) {
        this.estTransport = estTransport;
    }

 
    @Column(name="est_transport"  )
      
    public Boolean getEstTransport() {
        return this.estTransport;
    }
  
    
      @LocalReferential(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['estDerogation'].test(_this.estDerogation.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"enfant"},
        message = "motifsDerogationCentreLoisirs"
      )
    
      @MinSize(
        
          value = 1,
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['estDerogation'].test(_this.estDerogation.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"enfant"},
        message = "motifsDerogationCentreLoisirs"
      )
    
    private List<fr.cg95.cvq.business.request.LocalReferentialData> motifsDerogationCentreLoisirs;

    public void setMotifsDerogationCentreLoisirs(final List<fr.cg95.cvq.business.request.LocalReferentialData> motifsDerogationCentreLoisirs) {
        this.motifsDerogationCentreLoisirs = motifsDerogationCentreLoisirs;
    }

 
    @ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinTable(name="leisure_center_registration_request_motifs_derogation_centre_loisirs",
            joinColumns=
                @JoinColumn(name="leisure_center_registration_request_id"),
            inverseJoinColumns=
                @JoinColumn(name="motifs_derogation_centre_loisirs_id"))
    @OrderColumn(name="motifs_derogation_centre_loisirs_index")
      
    public List<fr.cg95.cvq.business.request.LocalReferentialData> getMotifsDerogationCentreLoisirs() {
        return this.motifsDerogationCentreLoisirs;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['estTransport'].test(_this.estTransport.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"enfant"},
        message = "transports"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['estTransport'].test(_this.estTransport.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"enfant"},
        message = "transports"
      )
    
    private fr.cg95.cvq.business.request.school.Transports transports;

    public void setTransports(final fr.cg95.cvq.business.request.school.Transports transports) {
        this.transports = transports;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="transports_id")
      
    public fr.cg95.cvq.business.request.school.Transports getTransports() {
        return this.transports;
    }
  
}
