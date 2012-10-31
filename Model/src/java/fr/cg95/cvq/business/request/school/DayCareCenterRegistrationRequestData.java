

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
@Table(name="day_care_center_registration_request")
public class DayCareCenterRegistrationRequestData implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>(RequestData.conditions);

    private Long id;

    public DayCareCenterRegistrationRequestData() {
      
        modeAccueil = Boolean.valueOf(true);
      
    }

    @Override
    public DayCareCenterRegistrationRequestData clone() {
        DayCareCenterRegistrationRequestData result = new DayCareCenterRegistrationRequestData();
        
          
            
        result.setAccueilAnterieur(accueilAnterieur);
      
          
        
          
            
        if (choixHorairesAccueil != null)
            result.setChoixHorairesAccueil(choixHorairesAccueil);
        else
            result.setChoixHorairesAccueil(fr.cg95.cvq.business.request.school.ChoixHorairesAccueilType.getDefaultChoixHorairesAccueilType());
      
          
        
          
            
        if (choixTypeRendezVous != null)
            result.setChoixTypeRendezVous(choixTypeRendezVous);
        else
            result.setChoixTypeRendezVous(fr.cg95.cvq.business.request.school.RendezVousType.getDefaultRendezVousType());
      
          
        
          
            
        result.setCommentaireCitoyen(commentaireCitoyen);
      
          
        
          
            
        if (datePlacementAccueilRegulier != null)
            result.setDatePlacementAccueilRegulier(datePlacementAccueilRegulier.clone());
      
          
        
          
            
        result.setDixHuitMoisEnfant(dixHuitMoisEnfant);
      
          
        
          
            
        if (informationMere != null)
            result.setInformationMere(informationMere.clone());
      
          
        
          
            
        if (informationPere != null)
            result.setInformationPere(informationPere.clone());
      
          
        
          
            
        if (jeudi != null)
            result.setJeudi(jeudi.clone());
      
          
        
          
            
        if (lundi != null)
            result.setLundi(lundi.clone());
      
          
        
          
            
        if (mardi != null)
            result.setMardi(mardi.clone());
      
          
        
          
            
        if (mercredi != null)
            result.setMercredi(mercredi.clone());
      
          
        
          
            
        result.setModeAccueil(modeAccueil);
      
          
        
          
            
        if (modeAccueilChoixDeux != null)
            result.setModeAccueilChoixDeux(modeAccueilChoixDeux);
        else
            result.setModeAccueilChoixDeux(fr.cg95.cvq.business.request.school.ModeAccueilType.getDefaultModeAccueilType());
      
          
        
          
            
        if (modeAccueilChoixUn != null)
            result.setModeAccueilChoixUn(modeAccueilChoixUn);
        else
            result.setModeAccueilChoixUn(fr.cg95.cvq.business.request.school.ModeAccueilType.getDefaultModeAccueilType());
      
          
        
          
            
        if (plageHoraireAccueilReguliere != null)
            result.setPlageHoraireAccueilReguliere(plageHoraireAccueilReguliere.clone());
      
          
        
          
            
        if (plageHoraireContact != null)
            result.setPlageHoraireContact(plageHoraireContact);
        else
            result.setPlageHoraireContact(fr.cg95.cvq.business.request.school.PlageHoraireContactType.getDefaultPlageHoraireContactType());
      
          
        
          
            
        result.setTelephoneContact(telephoneContact);
      
          
        
          
            
        if (vendredi != null)
            result.setVendredi(vendredi.clone());
      
          
        
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

  
    
    private String accueilAnterieur;

    public void setAccueilAnterieur(final String accueilAnterieur) {
        this.accueilAnterieur = accueilAnterieur;
    }

 
    @Column(name="accueil_anterieur"  )
      
    public String getAccueilAnterieur() {
        return this.accueilAnterieur;
    }
  
    
      @NotNull(
        
        
        profiles = {"accueil"},
        message = "choixHorairesAccueil"
      )
    
    private fr.cg95.cvq.business.request.school.ChoixHorairesAccueilType choixHorairesAccueil;

    public void setChoixHorairesAccueil(final fr.cg95.cvq.business.request.school.ChoixHorairesAccueilType choixHorairesAccueil) {
        this.choixHorairesAccueil = choixHorairesAccueil;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="choix_horaires_accueil"  )
      
    public fr.cg95.cvq.business.request.school.ChoixHorairesAccueilType getChoixHorairesAccueil() {
        return this.choixHorairesAccueil;
    }
  
    
      @NotNull(
        
        
        profiles = {"rendezVous"},
        message = "choixTypeRendezVous"
      )
    
    private fr.cg95.cvq.business.request.school.RendezVousType choixTypeRendezVous;

    public void setChoixTypeRendezVous(final fr.cg95.cvq.business.request.school.RendezVousType choixTypeRendezVous) {
        this.choixTypeRendezVous = choixTypeRendezVous;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="choix_type_rendez_vous"  )
      
    public fr.cg95.cvq.business.request.school.RendezVousType getChoixTypeRendezVous() {
        return this.choixTypeRendezVous;
    }
  
    
      @MaxLength(
        
          value = 600,
        
        
        profiles = {"rendezVous"},
        message = "commentaireCitoyen"
      )
    
    private String commentaireCitoyen;

    public void setCommentaireCitoyen(final String commentaireCitoyen) {
        this.commentaireCitoyen = commentaireCitoyen;
    }

 
    @Column(name="commentaire_citoyen" , length=600 )
      
    public String getCommentaireCitoyen() {
        return this.commentaireCitoyen;
    }
  
    
      @NotNull(
        
        
        profiles = {"accueil"},
        message = "datePlacementAccueilRegulier"
      )
    
      @AssertValid(
        
        
        profiles = {"accueil"},
        message = "datePlacementAccueilRegulier"
      )
    
    private fr.cg95.cvq.business.request.school.DccrrDatesPlacement datePlacementAccueilRegulier;

    public void setDatePlacementAccueilRegulier(final fr.cg95.cvq.business.request.school.DccrrDatesPlacement datePlacementAccueilRegulier) {
        this.datePlacementAccueilRegulier = datePlacementAccueilRegulier;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="date_placement_accueil_regulier_id")
      
    public fr.cg95.cvq.business.request.school.DccrrDatesPlacement getDatePlacementAccueilRegulier() {
        return this.datePlacementAccueilRegulier;
    }
  
    
    private java.util.Date dixHuitMoisEnfant;

    public void setDixHuitMoisEnfant(final java.util.Date dixHuitMoisEnfant) {
        this.dixHuitMoisEnfant = dixHuitMoisEnfant;
    }

 
    @Column(name="dix_huit_mois_enfant"  )
      
    public java.util.Date getDixHuitMoisEnfant() {
        return this.dixHuitMoisEnfant;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "informationMere"
      )
    
      @AssertValid(
        
        
        profiles = {"subject"},
        message = "informationMere"
      )
    
    private fr.cg95.cvq.business.request.school.DccrrMere informationMere;

    public void setInformationMere(final fr.cg95.cvq.business.request.school.DccrrMere informationMere) {
        this.informationMere = informationMere;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="information_mere_id")
      
    public fr.cg95.cvq.business.request.school.DccrrMere getInformationMere() {
        return this.informationMere;
    }
  
    
      @AssertValid(
        
        
        profiles = {"subject"},
        message = "informationPere"
      )
    
    private fr.cg95.cvq.business.request.school.DccrrPere informationPere;

    public void setInformationPere(final fr.cg95.cvq.business.request.school.DccrrPere informationPere) {
        this.informationPere = informationPere;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="information_pere_id")
      
    public fr.cg95.cvq.business.request.school.DccrrPere getInformationPere() {
        return this.informationPere;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixHorairesAccueil'].test('estHorairesAccueilIrregulier='+_this.choixHorairesAccueil.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"accueil"},
        message = "jeudi"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixHorairesAccueil'].test('estHorairesAccueilIrregulier='+_this.choixHorairesAccueil.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"accueil"},
        message = "jeudi"
      )
    
    private fr.cg95.cvq.business.request.school.DccrrPlageHoraireJeudi jeudi;

    public void setJeudi(final fr.cg95.cvq.business.request.school.DccrrPlageHoraireJeudi jeudi) {
        this.jeudi = jeudi;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="jeudi_id")
      
    public fr.cg95.cvq.business.request.school.DccrrPlageHoraireJeudi getJeudi() {
        return this.jeudi;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixHorairesAccueil'].test('estHorairesAccueilIrregulier='+_this.choixHorairesAccueil.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"accueil"},
        message = "lundi"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixHorairesAccueil'].test('estHorairesAccueilIrregulier='+_this.choixHorairesAccueil.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"accueil"},
        message = "lundi"
      )
    
    private fr.cg95.cvq.business.request.school.DccrrPlageHoraireLundi lundi;

    public void setLundi(final fr.cg95.cvq.business.request.school.DccrrPlageHoraireLundi lundi) {
        this.lundi = lundi;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="lundi_id")
      
    public fr.cg95.cvq.business.request.school.DccrrPlageHoraireLundi getLundi() {
        return this.lundi;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixHorairesAccueil'].test('estHorairesAccueilIrregulier='+_this.choixHorairesAccueil.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"accueil"},
        message = "mardi"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixHorairesAccueil'].test('estHorairesAccueilIrregulier='+_this.choixHorairesAccueil.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"accueil"},
        message = "mardi"
      )
    
    private fr.cg95.cvq.business.request.school.DccrrPlageHoraireMardi mardi;

    public void setMardi(final fr.cg95.cvq.business.request.school.DccrrPlageHoraireMardi mardi) {
        this.mardi = mardi;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="mardi_id")
      
    public fr.cg95.cvq.business.request.school.DccrrPlageHoraireMardi getMardi() {
        return this.mardi;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixHorairesAccueil'].test('estHorairesAccueilIrregulier='+_this.choixHorairesAccueil.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"accueil"},
        message = "mercredi"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixHorairesAccueil'].test('estHorairesAccueilIrregulier='+_this.choixHorairesAccueil.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"accueil"},
        message = "mercredi"
      )
    
    private fr.cg95.cvq.business.request.school.DccrrPlageHoraireMercredi mercredi;

    public void setMercredi(final fr.cg95.cvq.business.request.school.DccrrPlageHoraireMercredi mercredi) {
        this.mercredi = mercredi;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="mercredi_id")
      
    public fr.cg95.cvq.business.request.school.DccrrPlageHoraireMercredi getMercredi() {
        return this.mercredi;
    }
  
    
      @NotNull(
        
        
        profiles = {"accueil"},
        message = "modeAccueil"
      )
    
    private Boolean modeAccueil;

    public void setModeAccueil(final Boolean modeAccueil) {
        this.modeAccueil = modeAccueil;
    }

 
    @Column(name="mode_accueil"  )
      
    public Boolean getModeAccueil() {
        return this.modeAccueil;
    }
  
    
    private fr.cg95.cvq.business.request.school.ModeAccueilType modeAccueilChoixDeux;

    public void setModeAccueilChoixDeux(final fr.cg95.cvq.business.request.school.ModeAccueilType modeAccueilChoixDeux) {
        this.modeAccueilChoixDeux = modeAccueilChoixDeux;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="mode_accueil_choix_deux"  )
      
    public fr.cg95.cvq.business.request.school.ModeAccueilType getModeAccueilChoixDeux() {
        return this.modeAccueilChoixDeux;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['modeAccueil'].test(_this.modeAccueil.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"accueil"},
        message = "modeAccueilChoixUn"
      )
    
    private fr.cg95.cvq.business.request.school.ModeAccueilType modeAccueilChoixUn;

    public void setModeAccueilChoixUn(final fr.cg95.cvq.business.request.school.ModeAccueilType modeAccueilChoixUn) {
        this.modeAccueilChoixUn = modeAccueilChoixUn;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="mode_accueil_choix_un"  )
      
    public fr.cg95.cvq.business.request.school.ModeAccueilType getModeAccueilChoixUn() {
        return this.modeAccueilChoixUn;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixHorairesAccueil'].test('estHorairesAccueilRegulier='+_this.choixHorairesAccueil.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"accueil"},
        message = "plageHoraireAccueilReguliere"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixHorairesAccueil'].test('estHorairesAccueilRegulier='+_this.choixHorairesAccueil.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"accueil"},
        message = "plageHoraireAccueilReguliere"
      )
    
    private fr.cg95.cvq.business.request.school.DccrrPlageHoraire plageHoraireAccueilReguliere;

    public void setPlageHoraireAccueilReguliere(final fr.cg95.cvq.business.request.school.DccrrPlageHoraire plageHoraireAccueilReguliere) {
        this.plageHoraireAccueilReguliere = plageHoraireAccueilReguliere;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="plage_horaire_accueil_reguliere_id")
      
    public fr.cg95.cvq.business.request.school.DccrrPlageHoraire getPlageHoraireAccueilReguliere() {
        return this.plageHoraireAccueilReguliere;
    }
  
    
      @NotNull(
        
        
        profiles = {"rendezVous"},
        message = "plageHoraireContact"
      )
    
    private fr.cg95.cvq.business.request.school.PlageHoraireContactType plageHoraireContact;

    public void setPlageHoraireContact(final fr.cg95.cvq.business.request.school.PlageHoraireContactType plageHoraireContact) {
        this.plageHoraireContact = plageHoraireContact;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="plage_horaire_contact"  )
      
    public fr.cg95.cvq.business.request.school.PlageHoraireContactType getPlageHoraireContact() {
        return this.plageHoraireContact;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"rendezVous"},
        message = "telephoneContact"
      )
    
      @NotNull(
        
        
        profiles = {"rendezVous"},
        message = "telephoneContact"
      )
    
      @NotBlank(
        
        
        profiles = {"rendezVous"},
        message = "telephoneContact"
      )
    
    private String telephoneContact;

    public void setTelephoneContact(final String telephoneContact) {
        this.telephoneContact = telephoneContact;
    }

 
    @Column(name="telephone_contact" , length=10 )
      
    public String getTelephoneContact() {
        return this.telephoneContact;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixHorairesAccueil'].test('estHorairesAccueilIrregulier='+_this.choixHorairesAccueil.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"accueil"},
        message = "vendredi"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixHorairesAccueil'].test('estHorairesAccueilIrregulier='+_this.choixHorairesAccueil.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"accueil"},
        message = "vendredi"
      )
    
    private fr.cg95.cvq.business.request.school.DccrrPlageHoraireVendredi vendredi;

    public void setVendredi(final fr.cg95.cvq.business.request.school.DccrrPlageHoraireVendredi vendredi) {
        this.vendredi = vendredi;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="vendredi_id")
      
    public fr.cg95.cvq.business.request.school.DccrrPlageHoraireVendredi getVendredi() {
        return this.vendredi;
    }
  
}
