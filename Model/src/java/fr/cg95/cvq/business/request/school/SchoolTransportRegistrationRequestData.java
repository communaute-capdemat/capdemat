

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
@Table(name="school_transport_registration_request")
public class SchoolTransportRegistrationRequestData implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>(RequestData.conditions);

    private Long id;

    public SchoolTransportRegistrationRequestData() {
      
        acceptationReglementInterieur = Boolean.valueOf(false);
      
        estMaternelleElementaireAutorisations = Boolean.valueOf(false);
      
    }

    @Override
    public SchoolTransportRegistrationRequestData clone() {
        SchoolTransportRegistrationRequestData result = new SchoolTransportRegistrationRequestData();
        
          
            
        result.setAcceptationReglementInterieur(acceptationReglementInterieur);
      
          
        
          
            
        if (arret != null)
            result.setArret(arret.clone());
      
          
        
          
            
        if (autorisation != null)
            result.setAutorisation(autorisation);
        else
            result.setAutorisation(fr.cg95.cvq.business.request.school.AutorisationType.getDefaultAutorisationType());
      
          
        
          
            
        result.setEstMaternelleElementaireAutorisations(estMaternelleElementaireAutorisations);
      
          
        
          
            
        if (frereOuSoeurAutorise != null)
            result.setFrereOuSoeurAutorise(frereOuSoeurAutorise.clone());
      
          
        
          
            
        if (ligne != null)
            result.setLigne(ligne.clone());
      
          
        
          
            
        List<fr.cg95.cvq.business.request.school.TiersInformations> tiersAutorisesList = new ArrayList<fr.cg95.cvq.business.request.school.TiersInformations>();
        for (TiersInformations object : tiersAutorises) {
            tiersAutorisesList.add(object.clone());
        }
        result.setTiersAutorises(tiersAutorisesList);
      
          
        
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
        message = "arret"
      )
    
      @AssertValid(
        
        
        profiles = {"enfant"},
        message = "arret"
      )
    
    private fr.cg95.cvq.business.request.school.Arret arret;

    public void setArret(final fr.cg95.cvq.business.request.school.Arret arret) {
        this.arret = arret;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="arret_id")
      
    public fr.cg95.cvq.business.request.school.Arret getArret() {
        return this.arret;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['estMaternelleElementaireAutorisations'].test(_this.estMaternelleElementaireAutorisations.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"autorisations"},
        message = "autorisation"
      )
    
    private fr.cg95.cvq.business.request.school.AutorisationType autorisation;

    public void setAutorisation(final fr.cg95.cvq.business.request.school.AutorisationType autorisation) {
        this.autorisation = autorisation;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="autorisation"  )
      
    public fr.cg95.cvq.business.request.school.AutorisationType getAutorisation() {
        return this.autorisation;
    }
  
    
      @NotNull(
        
        
        profiles = {"autorisations"},
        message = "estMaternelleElementaireAutorisations"
      )
    
    private Boolean estMaternelleElementaireAutorisations;

    public void setEstMaternelleElementaireAutorisations(final Boolean estMaternelleElementaireAutorisations) {
        this.estMaternelleElementaireAutorisations = estMaternelleElementaireAutorisations;
    }

 
    @Column(name="est_maternelle_elementaire_autorisations"  )
      
    public Boolean getEstMaternelleElementaireAutorisations() {
        return this.estMaternelleElementaireAutorisations;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['autorisation'].test('autoriseFrereOuSoeur='+_this.autorisation.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"autorisations"},
        message = "frereOuSoeurAutorise"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['autorisation'].test('autoriseFrereOuSoeur='+_this.autorisation.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"autorisations"},
        message = "frereOuSoeurAutorise"
      )
    
    private fr.cg95.cvq.business.request.school.FrereOuSoeurInformations frereOuSoeurAutorise;

    public void setFrereOuSoeurAutorise(final fr.cg95.cvq.business.request.school.FrereOuSoeurInformations frereOuSoeurAutorise) {
        this.frereOuSoeurAutorise = frereOuSoeurAutorise;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="frere_ou_soeur_autorise_id")
      
    public fr.cg95.cvq.business.request.school.FrereOuSoeurInformations getFrereOuSoeurAutorise() {
        return this.frereOuSoeurAutorise;
    }
  
    
      @NotNull(
        
        
        profiles = {"enfant"},
        message = "ligne"
      )
    
      @AssertValid(
        
        
        profiles = {"enfant"},
        message = "ligne"
      )
    
    private fr.cg95.cvq.business.request.school.Ligne ligne;

    public void setLigne(final fr.cg95.cvq.business.request.school.Ligne ligne) {
        this.ligne = ligne;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="ligne_id")
      
    public fr.cg95.cvq.business.request.school.Ligne getLigne() {
        return this.ligne;
    }
  
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['autorisation'].test('autoriseTiers='+_this.autorisation.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"autorisations"},
        message = "tiersAutorises"
      )
    
      @MinSize(
        
          value = 1,
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['autorisation'].test('autoriseTiers='+_this.autorisation.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"autorisations"},
        message = "tiersAutorises"
      )
    
    private List<fr.cg95.cvq.business.request.school.TiersInformations> tiersAutorises;

    public void setTiersAutorises(final List<fr.cg95.cvq.business.request.school.TiersInformations> tiersAutorises) {
        this.tiersAutorises = tiersAutorises;
    }

 
    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @OrderColumn(name="tiers_autorises_index")
    @JoinColumn(name="school_transport_registration_request_id")
      
    public List<fr.cg95.cvq.business.request.school.TiersInformations> getTiersAutorises() {
        return this.tiersAutorises;
    }
  
}
