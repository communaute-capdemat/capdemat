

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
      
          
        
          
            
        result.setDatePlacementDebut(datePlacementDebut);
      
          
        
          
            
        result.setDatePlacementFin(datePlacementFin);
      
          
        
          
            
        result.setDatePlacementDebut(datePlacementDebut);
      
          
        
          
            
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
        
        
        profiles = {"accueil"},
        message = "choixTypeDatePlacementAccueilRegulier"
      )
    
    private fr.cg95.cvq.business.request.school.ChoixDatePlacement choixTypeDatePlacementAccueilRegulier;

    public final void setChoixTypeDatePlacementAccueilRegulier(final fr.cg95.cvq.business.request.school.ChoixDatePlacement choixTypeDatePlacementAccueilRegulier) {
        this.choixTypeDatePlacementAccueilRegulier = choixTypeDatePlacementAccueilRegulier;
    }

    /**
 
        * @hibernate.property
        *  column="choix_type_date_placement_accueil_regulier"
        
      
    */
    public final fr.cg95.cvq.business.request.school.ChoixDatePlacement getChoixTypeDatePlacementAccueilRegulier() {
        return this.choixTypeDatePlacementAccueilRegulier;
    }
  
    
      @NotNull(
        
        
        profiles = {"accueil"},
        message = "choixTypeDatePlacementAccueilRegulier"
      )
    
    private fr.cg95.cvq.business.request.school.ChoixDatePlacement choixTypeDatePlacementAccueilRegulier;

    public void setChoixTypeDatePlacementAccueilRegulier(final fr.cg95.cvq.business.request.school.ChoixDatePlacement choixTypeDatePlacementAccueilRegulier) {
        this.choixTypeDatePlacementAccueilRegulier = choixTypeDatePlacementAccueilRegulier;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="choix_type_date_placement_accueil_regulier"  )
      
    public fr.cg95.cvq.business.request.school.ChoixDatePlacement getChoixTypeDatePlacementAccueilRegulier() {
        return this.choixTypeDatePlacementAccueilRegulier;
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
  
    
    public void setCommuneLieuTravailMere(final String communeLieuTravailMere) {
    @Column(name="commune_lieu_travail_mere"  )
    public String getCommuneLieuTravailMere() {
    public void setCommuneLieuTravailPere(final String communeLieuTravailPere) {
    @Column(name="commune_lieu_travail_pere"  )
    public String getCommuneLieuTravailPere() {
      @NotNull(
        
        
        profiles = {"accueil"},
        message = "datePlacementAccueilRegulier"
      )
    
      @AssertValid(
        
        
        profiles = {"accueil"},
        message = "datePlacementAccueilRegulier"
      )
    
    private fr.cg95.cvq.business.request.school.DccrrDatesPlacement datePlacementAccueilRegulier;

    public final void setDatePlacementDebut(final java.util.Date datePlacementDebut) {
        this.datePlacementDebut = datePlacementDebut;
    public void setDatePlacementDebut(final java.util.Date datePlacementDebut) {
        this.datePlacementDebut = datePlacementDebut;
    public final void setDatePlacementAccueilRegulier(final fr.cg95.cvq.business.request.school.DccrrDatesPlacement datePlacementAccueilRegulier) {
        this.datePlacementAccueilRegulier = datePlacementAccueilRegulier;
    }

 
        * @hibernate.property
        *  column="date_placement_debut"
        
    @Column(name="date_placement_debut"  )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="date_placement_accueil_regulier_id"
        *  class="fr.cg95.cvq.business.request.school.DccrrDatesPlacement"
      
    */
    public final java.util.Date getDatePlacementDebut() {
        return this.datePlacementDebut;
    }
  
    
    private java.util.Date datePlacementFin;

    public final void setDatePlacementFin(final java.util.Date datePlacementFin) {
        this.datePlacementFin = datePlacementFin;
    }

    /**
 
        * @hibernate.property
        *  column="date_placement_fin"
        
      
    */
    public final java.util.Date getDatePlacementFin() {
        return this.datePlacementFin;
    }
  
    
    public java.util.Date getDatePlacementDebut() {
        return this.datePlacementDebut;
    }
  
    
    */
    public final fr.cg95.cvq.business.request.school.DccrrDatesPlacement getDatePlacementAccueilRegulier() {
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
  
    
    private Boolean estHorairesReguliersMere;

    public final void setEstHorairesReguliersMere(final Boolean estHorairesReguliersMere) {
        this.estHorairesReguliersMere = estHorairesReguliersMere;
    }

    /**
 
        * @hibernate.property
        *  column="est_horaires_reguliers_mere"
        
      
    */
    public final Boolean getEstHorairesReguliersMere() {
        return this.estHorairesReguliersMere;
    }
  
    
    private Boolean estHorairesReguliersPere;

    public final void setEstHorairesReguliersPere(final Boolean estHorairesReguliersPere) {
        this.estHorairesReguliersPere = estHorairesReguliersPere;
    }

    /**
 
        * @hibernate.property
        *  column="est_horaires_reguliers_pere"
        
    private Boolean estHorairesReguliersMere;

    public void setEstHorairesReguliersMere(final Boolean estHorairesReguliersMere) {
        this.estHorairesReguliersMere = estHorairesReguliersMere;
    }

 
    @Column(name="est_horaires_reguliers_mere"  )
      
    public Boolean getEstHorairesReguliersMere() {
        return this.estHorairesReguliersMere;
    }
  
    
    private Boolean estHorairesReguliersPere;

    public void setEstHorairesReguliersPere(final Boolean estHorairesReguliersPere) {
        this.estHorairesReguliersPere = estHorairesReguliersPere;
    }

 
    @Column(name="est_horaires_reguliers_pere"  )
      @NotNull(
        
        
      
    */
    public final Boolean getEstHorairesReguliersPere() {
        return this.estHorairesReguliersPere;
    }
  
      
    public Boolean getEstHorairesReguliersPere() {
        return this.estHorairesReguliersPere;
    }
  
        profiles = {"subject"},
        message = "informationMere"
      )
    
    private org.joda.time.LocalTime horairePlacementApresMidiDebut;

    public final void setHorairePlacementApresMidiDebut(final org.joda.time.LocalTime horairePlacementApresMidiDebut) {
        this.horairePlacementApresMidiDebut = horairePlacementApresMidiDebut;
    }

    /**
 
        * @hibernate.property
        *  column="horaire_placement_apres_midi_debut"
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementApresMidiDebut() {
        return this.horairePlacementApresMidiDebut;
    }
  
    
    private org.joda.time.LocalTime horairePlacementApresMidiDebutJeudi;

    public final void setHorairePlacementApresMidiDebutJeudi(final org.joda.time.LocalTime horairePlacementApresMidiDebutJeudi) {
        this.horairePlacementApresMidiDebutJeudi = horairePlacementApresMidiDebutJeudi;
    }

    /**
 
        * @hibernate.property
        *  column="horaire_placement_apres_midi_debut_jeudi"
        
    private org.joda.time.LocalTime horairePlacementApresMidiDebut;

    public void setHorairePlacementApresMidiDebut(final org.joda.time.LocalTime horairePlacementApresMidiDebut) {
        this.horairePlacementApresMidiDebut = horairePlacementApresMidiDebut;
    }

 
    @Column(name="horaire_placement_apres_midi_debut"  )
      
    public org.joda.time.LocalTime getHorairePlacementApresMidiDebut() {
        return this.horairePlacementApresMidiDebut;
    }
  
    
    private org.joda.time.LocalTime horairePlacementApresMidiDebutJeudi;

    public void setHorairePlacementApresMidiDebutJeudi(final org.joda.time.LocalTime horairePlacementApresMidiDebutJeudi) {
        this.horairePlacementApresMidiDebutJeudi = horairePlacementApresMidiDebutJeudi;
    }

 
    @Column(name="horaire_placement_apres_midi_debut_jeudi"  )
      @AssertValid(
        
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementApresMidiDebutJeudi() {
        return this.horairePlacementApresMidiDebutJeudi;
    }
  
      
    public org.joda.time.LocalTime getHorairePlacementApresMidiDebutJeudi() {
        return this.horairePlacementApresMidiDebutJeudi;
    }
  
        profiles = {"subject"},
        message = "informationMere"
      )
    
    private fr.cg95.cvq.business.request.school.DccrrMere informationMere;

    public final void setHorairePlacementApresMidiDebutLundi(final org.joda.time.LocalTime horairePlacementApresMidiDebutLundi) {
        this.horairePlacementApresMidiDebutLundi = horairePlacementApresMidiDebutLundi;
    public void setHorairePlacementApresMidiDebutLundi(final org.joda.time.LocalTime horairePlacementApresMidiDebutLundi) {
        this.horairePlacementApresMidiDebutLundi = horairePlacementApresMidiDebutLundi;
    public final void setInformationMere(final fr.cg95.cvq.business.request.school.DccrrMere informationMere) {
        this.informationMere = informationMere;
    }

 
        * @hibernate.property
        *  column="horaire_placement_apres_midi_debut_lundi"
        
    @Column(name="horaire_placement_apres_midi_debut_lundi"  )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="information_mere_id"
        *  class="fr.cg95.cvq.business.request.school.DccrrMere"
      
    */
    public final org.joda.time.LocalTime getHorairePlacementApresMidiDebutLundi() {
        return this.horairePlacementApresMidiDebutLundi;
    public org.joda.time.LocalTime getHorairePlacementApresMidiDebutLundi() {
        return this.horairePlacementApresMidiDebutLundi;
    */
    public final fr.cg95.cvq.business.request.school.DccrrMere getInformationMere() {
        return this.informationMere;
    }
  
    
    private org.joda.time.LocalTime horairePlacementApresMidiDebutMardi;

    public final void setHorairePlacementApresMidiDebutMardi(final org.joda.time.LocalTime horairePlacementApresMidiDebutMardi) {
        this.horairePlacementApresMidiDebutMardi = horairePlacementApresMidiDebutMardi;
    }

    /**
 
        * @hibernate.property
        *  column="horaire_placement_apres_midi_debut_mardi"
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementApresMidiDebutMardi() {
        return this.horairePlacementApresMidiDebutMardi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementApresMidiDebutMercredi;

    public final void setHorairePlacementApresMidiDebutMercredi(final org.joda.time.LocalTime horairePlacementApresMidiDebutMercredi) {
        this.horairePlacementApresMidiDebutMercredi = horairePlacementApresMidiDebutMercredi;
    }

    /**
 
        * @hibernate.property
        *  column="horaire_placement_apres_midi_debut_mercredi"
        
    private org.joda.time.LocalTime horairePlacementApresMidiDebutMardi;

    public void setHorairePlacementApresMidiDebutMardi(final org.joda.time.LocalTime horairePlacementApresMidiDebutMardi) {
        this.horairePlacementApresMidiDebutMardi = horairePlacementApresMidiDebutMardi;
    }

 
    @Column(name="horaire_placement_apres_midi_debut_mardi"  )
      
    public org.joda.time.LocalTime getHorairePlacementApresMidiDebutMardi() {
        return this.horairePlacementApresMidiDebutMardi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementApresMidiDebutMercredi;

    public void setHorairePlacementApresMidiDebutMercredi(final org.joda.time.LocalTime horairePlacementApresMidiDebutMercredi) {
        this.horairePlacementApresMidiDebutMercredi = horairePlacementApresMidiDebutMercredi;
    }

 
    @Column(name="horaire_placement_apres_midi_debut_mercredi"  )
      @AssertValid(
        
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementApresMidiDebutMercredi() {
        return this.horairePlacementApresMidiDebutMercredi;
    }
  
      
    public org.joda.time.LocalTime getHorairePlacementApresMidiDebutMercredi() {
        return this.horairePlacementApresMidiDebutMercredi;
    }
  
        profiles = {"subject"},
        message = "informationPere"
      )
    
    private fr.cg95.cvq.business.request.school.DccrrPere informationPere;

    public final void setHorairePlacementApresMidiDebutVendredi(final org.joda.time.LocalTime horairePlacementApresMidiDebutVendredi) {
        this.horairePlacementApresMidiDebutVendredi = horairePlacementApresMidiDebutVendredi;
    public void setHorairePlacementApresMidiDebutVendredi(final org.joda.time.LocalTime horairePlacementApresMidiDebutVendredi) {
        this.horairePlacementApresMidiDebutVendredi = horairePlacementApresMidiDebutVendredi;
    public final void setInformationPere(final fr.cg95.cvq.business.request.school.DccrrPere informationPere) {
        this.informationPere = informationPere;
    }

 
        * @hibernate.property
        *  column="horaire_placement_apres_midi_debut_vendredi"
        
    @Column(name="horaire_placement_apres_midi_debut_vendredi"  )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="information_pere_id"
        *  class="fr.cg95.cvq.business.request.school.DccrrPere"
      
    */
    public final org.joda.time.LocalTime getHorairePlacementApresMidiDebutVendredi() {
        return this.horairePlacementApresMidiDebutVendredi;
    public org.joda.time.LocalTime getHorairePlacementApresMidiDebutVendredi() {
        return this.horairePlacementApresMidiDebutVendredi;
    */
    public final fr.cg95.cvq.business.request.school.DccrrPere getInformationPere() {
        return this.informationPere;
    }
  
    
    private org.joda.time.LocalTime horairePlacementApresMidiFin;

    public final void setHorairePlacementApresMidiFin(final org.joda.time.LocalTime horairePlacementApresMidiFin) {
        this.horairePlacementApresMidiFin = horairePlacementApresMidiFin;
    }

    /**
 
        * @hibernate.property
        *  column="horaire_placement_apres_midi_fin"
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementApresMidiFin() {
        return this.horairePlacementApresMidiFin;
    }
  
    
    private org.joda.time.LocalTime horairePlacementApresMidiFinJeudi;

    public final void setHorairePlacementApresMidiFinJeudi(final org.joda.time.LocalTime horairePlacementApresMidiFinJeudi) {
        this.horairePlacementApresMidiFinJeudi = horairePlacementApresMidiFinJeudi;
    }

    /**
 
        * @hibernate.property
        *  column="horaire_placement_apres_midi_fin_jeudi"
        
    private org.joda.time.LocalTime horairePlacementApresMidiFin;

    public void setHorairePlacementApresMidiFin(final org.joda.time.LocalTime horairePlacementApresMidiFin) {
        this.horairePlacementApresMidiFin = horairePlacementApresMidiFin;
    }

 
    @Column(name="horaire_placement_apres_midi_fin"  )
      
    public org.joda.time.LocalTime getHorairePlacementApresMidiFin() {
        return this.horairePlacementApresMidiFin;
    }
  
    
    private org.joda.time.LocalTime horairePlacementApresMidiFinJeudi;

    public void setHorairePlacementApresMidiFinJeudi(final org.joda.time.LocalTime horairePlacementApresMidiFinJeudi) {
        this.horairePlacementApresMidiFinJeudi = horairePlacementApresMidiFinJeudi;
    }

 
    @Column(name="horaire_placement_apres_midi_fin_jeudi"  )
      @NotNull(
        
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementApresMidiFinJeudi() {
        return this.horairePlacementApresMidiFinJeudi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementApresMidiFinLundi;

    public final void setHorairePlacementApresMidiFinLundi(final org.joda.time.LocalTime horairePlacementApresMidiFinLundi) {
        this.horairePlacementApresMidiFinLundi = horairePlacementApresMidiFinLundi;
    }

    /**
 
        * @hibernate.property
        *  column="horaire_placement_apres_midi_fin_lundi"
        
      
    public org.joda.time.LocalTime getHorairePlacementApresMidiFinJeudi() {
        return this.horairePlacementApresMidiFinJeudi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementApresMidiFinLundi;

    public void setHorairePlacementApresMidiFinLundi(final org.joda.time.LocalTime horairePlacementApresMidiFinLundi) {
        this.horairePlacementApresMidiFinLundi = horairePlacementApresMidiFinLundi;
    }

 
    @Column(name="horaire_placement_apres_midi_fin_lundi"  )
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixHorairesAccueil'].test(_this.choixHorairesAccueil.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"accueil"},
        message = "jeudi"
      )
    */
    public final org.joda.time.LocalTime getHorairePlacementApresMidiFinLundi() {
        return this.horairePlacementApresMidiFinLundi;
    }
  
    public org.joda.time.LocalTime getHorairePlacementApresMidiFinLundi() {
        return this.horairePlacementApresMidiFinLundi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementApresMidiFinMardi;

    public final void setHorairePlacementApresMidiFinMardi(final org.joda.time.LocalTime horairePlacementApresMidiFinMardi) {
        this.horairePlacementApresMidiFinMardi = horairePlacementApresMidiFinMardi;
    }

    /**
 
        * @hibernate.property
        *  column="horaire_placement_apres_midi_fin_mardi"
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementApresMidiFinMardi() {
        return this.horairePlacementApresMidiFinMardi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementApresMidiFinMercredi;

    public final void setHorairePlacementApresMidiFinMercredi(final org.joda.time.LocalTime horairePlacementApresMidiFinMercredi) {
        this.horairePlacementApresMidiFinMercredi = horairePlacementApresMidiFinMercredi;
    }

    /**
 
        * @hibernate.property
        *  column="horaire_placement_apres_midi_fin_mercredi"
        
    private org.joda.time.LocalTime horairePlacementApresMidiFinMardi;

    public void setHorairePlacementApresMidiFinMardi(final org.joda.time.LocalTime horairePlacementApresMidiFinMardi) {
        this.horairePlacementApresMidiFinMardi = horairePlacementApresMidiFinMardi;
    }

 
    @Column(name="horaire_placement_apres_midi_fin_mardi"  )
      
    public org.joda.time.LocalTime getHorairePlacementApresMidiFinMardi() {
        return this.horairePlacementApresMidiFinMardi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementApresMidiFinMercredi;

    public void setHorairePlacementApresMidiFinMercredi(final org.joda.time.LocalTime horairePlacementApresMidiFinMercredi) {
        this.horairePlacementApresMidiFinMercredi = horairePlacementApresMidiFinMercredi;
    }

 
    @Column(name="horaire_placement_apres_midi_fin_mercredi"  )
      @AssertValid(
        
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementApresMidiFinMercredi() {
        return this.horairePlacementApresMidiFinMercredi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementApresMidiFinVendredi;

    public final void setHorairePlacementApresMidiFinVendredi(final org.joda.time.LocalTime horairePlacementApresMidiFinVendredi) {
        this.horairePlacementApresMidiFinVendredi = horairePlacementApresMidiFinVendredi;
    }

    /**
 
        * @hibernate.property
        *  column="horaire_placement_apres_midi_fin_vendredi"
        
      
    public org.joda.time.LocalTime getHorairePlacementApresMidiFinMercredi() {
        return this.horairePlacementApresMidiFinMercredi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementApresMidiFinVendredi;

    public void setHorairePlacementApresMidiFinVendredi(final org.joda.time.LocalTime horairePlacementApresMidiFinVendredi) {
        this.horairePlacementApresMidiFinVendredi = horairePlacementApresMidiFinVendredi;
    }

 
    @Column(name="horaire_placement_apres_midi_fin_vendredi"  )
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixHorairesAccueil'].test(_this.choixHorairesAccueil.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"accueil"},
        message = "jeudi"
      )
    */
    public final org.joda.time.LocalTime getHorairePlacementApresMidiFinVendredi() {
        return this.horairePlacementApresMidiFinVendredi;
    }
  
    public org.joda.time.LocalTime getHorairePlacementApresMidiFinVendredi() {
        return this.horairePlacementApresMidiFinVendredi;
    }
  
    
    private fr.cg95.cvq.business.request.school.DccrrPlageHoraireJeudi jeudi;

    public final void setHorairePlacementMatinDebut(final org.joda.time.LocalTime horairePlacementMatinDebut) {
        this.horairePlacementMatinDebut = horairePlacementMatinDebut;
    public void setHorairePlacementMatinDebut(final org.joda.time.LocalTime horairePlacementMatinDebut) {
        this.horairePlacementMatinDebut = horairePlacementMatinDebut;
    public final void setJeudi(final fr.cg95.cvq.business.request.school.DccrrPlageHoraireJeudi jeudi) {
        this.jeudi = jeudi;
    }

 
        * @hibernate.property
        *  column="horaire_placement_matin_debut"
        
    @Column(name="horaire_placement_matin_debut"  )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="jeudi_id"
        *  class="fr.cg95.cvq.business.request.school.DccrrPlageHoraireJeudi"
      
    */
    public final org.joda.time.LocalTime getHorairePlacementMatinDebut() {
        return this.horairePlacementMatinDebut;
    public org.joda.time.LocalTime getHorairePlacementMatinDebut() {
        return this.horairePlacementMatinDebut;
    */
    public final fr.cg95.cvq.business.request.school.DccrrPlageHoraireJeudi getJeudi() {
        return this.jeudi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementMatinDebutJeudi;

    public final void setHorairePlacementMatinDebutJeudi(final org.joda.time.LocalTime horairePlacementMatinDebutJeudi) {
        this.horairePlacementMatinDebutJeudi = horairePlacementMatinDebutJeudi;
    }

    /**
 
        * @hibernate.property
        *  column="horaire_placement_matin_debut_jeudi"
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementMatinDebutJeudi() {
        return this.horairePlacementMatinDebutJeudi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementMatinDebutLundi;

    public final void setHorairePlacementMatinDebutLundi(final org.joda.time.LocalTime horairePlacementMatinDebutLundi) {
        this.horairePlacementMatinDebutLundi = horairePlacementMatinDebutLundi;
    }

    /**
 
        * @hibernate.property
        *  column="horaire_placement_matin_debut_lundi"
        
    private org.joda.time.LocalTime horairePlacementMatinDebutJeudi;

    public void setHorairePlacementMatinDebutJeudi(final org.joda.time.LocalTime horairePlacementMatinDebutJeudi) {
        this.horairePlacementMatinDebutJeudi = horairePlacementMatinDebutJeudi;
    }

 
    @Column(name="horaire_placement_matin_debut_jeudi"  )
      
    public org.joda.time.LocalTime getHorairePlacementMatinDebutJeudi() {
        return this.horairePlacementMatinDebutJeudi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementMatinDebutLundi;

    public void setHorairePlacementMatinDebutLundi(final org.joda.time.LocalTime horairePlacementMatinDebutLundi) {
        this.horairePlacementMatinDebutLundi = horairePlacementMatinDebutLundi;
    }

 
    @Column(name="horaire_placement_matin_debut_lundi"  )
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixHorairesAccueil'].test(_this.choixHorairesAccueil.toString());" +
                
              
              
            
            
            "return active",
    */
    public final org.joda.time.LocalTime getHorairePlacementMatinDebutLundi() {
        return this.horairePlacementMatinDebutLundi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementMatinDebutMardi;

    public final void setHorairePlacementMatinDebutMardi(final org.joda.time.LocalTime horairePlacementMatinDebutMardi) {
        this.horairePlacementMatinDebutMardi = horairePlacementMatinDebutMardi;
    }

    public org.joda.time.LocalTime getHorairePlacementMatinDebutLundi() {
        return this.horairePlacementMatinDebutLundi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementMatinDebutMardi;

    public void setHorairePlacementMatinDebutMardi(final org.joda.time.LocalTime horairePlacementMatinDebutMardi) {
        this.horairePlacementMatinDebutMardi = horairePlacementMatinDebutMardi;
    }

        * @hibernate.property
        *  column="horaire_placement_matin_debut_mardi"
        
    @Column(name="horaire_placement_matin_debut_mardi"  )
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementMatinDebutMardi() {
        return this.horairePlacementMatinDebutMardi;
    }
  
      
    public org.joda.time.LocalTime getHorairePlacementMatinDebutMardi() {
        return this.horairePlacementMatinDebutMardi;
    }
  
        profiles = {"accueil"},
        message = "lundi"
      )
    
    private org.joda.time.LocalTime horairePlacementMatinDebutMercredi;

    public final void setHorairePlacementMatinDebutMercredi(final org.joda.time.LocalTime horairePlacementMatinDebutMercredi) {
        this.horairePlacementMatinDebutMercredi = horairePlacementMatinDebutMercredi;
    }

    /**
 
        * @hibernate.property
        *  column="horaire_placement_matin_debut_mercredi"
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementMatinDebutMercredi() {
        return this.horairePlacementMatinDebutMercredi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementMatinDebutVendredi;

    public final void setHorairePlacementMatinDebutVendredi(final org.joda.time.LocalTime horairePlacementMatinDebutVendredi) {
        this.horairePlacementMatinDebutVendredi = horairePlacementMatinDebutVendredi;
    }

    /**
 
        * @hibernate.property
        *  column="horaire_placement_matin_debut_vendredi"
        
    private org.joda.time.LocalTime horairePlacementMatinDebutMercredi;

    public void setHorairePlacementMatinDebutMercredi(final org.joda.time.LocalTime horairePlacementMatinDebutMercredi) {
        this.horairePlacementMatinDebutMercredi = horairePlacementMatinDebutMercredi;
    }

 
    @Column(name="horaire_placement_matin_debut_mercredi"  )
      
    public org.joda.time.LocalTime getHorairePlacementMatinDebutMercredi() {
        return this.horairePlacementMatinDebutMercredi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementMatinDebutVendredi;

    public void setHorairePlacementMatinDebutVendredi(final org.joda.time.LocalTime horairePlacementMatinDebutVendredi) {
        this.horairePlacementMatinDebutVendredi = horairePlacementMatinDebutVendredi;
    }

 
    @Column(name="horaire_placement_matin_debut_vendredi"  )
      @AssertValid(
        
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementMatinDebutVendredi() {
        return this.horairePlacementMatinDebutVendredi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementMatinFin;

    public final void setHorairePlacementMatinFin(final org.joda.time.LocalTime horairePlacementMatinFin) {
        this.horairePlacementMatinFin = horairePlacementMatinFin;
    }

    /**
 
        * @hibernate.property
        *  column="horaire_placement_matin_fin"
        
      
    public org.joda.time.LocalTime getHorairePlacementMatinDebutVendredi() {
        return this.horairePlacementMatinDebutVendredi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementMatinFin;

    public void setHorairePlacementMatinFin(final org.joda.time.LocalTime horairePlacementMatinFin) {
        this.horairePlacementMatinFin = horairePlacementMatinFin;
    }

 
    @Column(name="horaire_placement_matin_fin"  )
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixHorairesAccueil'].test(_this.choixHorairesAccueil.toString());" +
                
              
              
            
            
            "return active",
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementMatinFin() {
        return this.horairePlacementMatinFin;
    }
  
      
    public org.joda.time.LocalTime getHorairePlacementMatinFin() {
        return this.horairePlacementMatinFin;
    }
  
        profiles = {"accueil"},
        message = "lundi"
      )
    
    private fr.cg95.cvq.business.request.school.DccrrPlageHoraireLundi lundi;

    public final void setHorairePlacementMatinFinJeudi(final org.joda.time.LocalTime horairePlacementMatinFinJeudi) {
        this.horairePlacementMatinFinJeudi = horairePlacementMatinFinJeudi;
    public void setHorairePlacementMatinFinJeudi(final org.joda.time.LocalTime horairePlacementMatinFinJeudi) {
        this.horairePlacementMatinFinJeudi = horairePlacementMatinFinJeudi;
    public final void setLundi(final fr.cg95.cvq.business.request.school.DccrrPlageHoraireLundi lundi) {
        this.lundi = lundi;
    }

 
        * @hibernate.property
        *  column="horaire_placement_matin_fin_jeudi"
        
    @Column(name="horaire_placement_matin_fin_jeudi"  )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="lundi_id"
        *  class="fr.cg95.cvq.business.request.school.DccrrPlageHoraireLundi"
      
    */
    public final org.joda.time.LocalTime getHorairePlacementMatinFinJeudi() {
        return this.horairePlacementMatinFinJeudi;
    public org.joda.time.LocalTime getHorairePlacementMatinFinJeudi() {
        return this.horairePlacementMatinFinJeudi;
    */
    public final fr.cg95.cvq.business.request.school.DccrrPlageHoraireLundi getLundi() {
        return this.lundi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementMatinFinLundi;

    public final void setHorairePlacementMatinFinLundi(final org.joda.time.LocalTime horairePlacementMatinFinLundi) {
        this.horairePlacementMatinFinLundi = horairePlacementMatinFinLundi;
    }

    /**
 
        * @hibernate.property
        *  column="horaire_placement_matin_fin_lundi"
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementMatinFinLundi() {
        return this.horairePlacementMatinFinLundi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementMatinFinMardi;

    public final void setHorairePlacementMatinFinMardi(final org.joda.time.LocalTime horairePlacementMatinFinMardi) {
        this.horairePlacementMatinFinMardi = horairePlacementMatinFinMardi;
    }

    /**
 
        * @hibernate.property
        *  column="horaire_placement_matin_fin_mardi"
        
    private org.joda.time.LocalTime horairePlacementMatinFinLundi;

    public void setHorairePlacementMatinFinLundi(final org.joda.time.LocalTime horairePlacementMatinFinLundi) {
        this.horairePlacementMatinFinLundi = horairePlacementMatinFinLundi;
    }

 
    @Column(name="horaire_placement_matin_fin_lundi"  )
      
    public org.joda.time.LocalTime getHorairePlacementMatinFinLundi() {
        return this.horairePlacementMatinFinLundi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementMatinFinMardi;

    public void setHorairePlacementMatinFinMardi(final org.joda.time.LocalTime horairePlacementMatinFinMardi) {
        this.horairePlacementMatinFinMardi = horairePlacementMatinFinMardi;
    }

 
    @Column(name="horaire_placement_matin_fin_mardi"  )
      @NotNull(
        
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementMatinFinMardi() {
        return this.horairePlacementMatinFinMardi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementMatinFinMercredi;

    public final void setHorairePlacementMatinFinMercredi(final org.joda.time.LocalTime horairePlacementMatinFinMercredi) {
        this.horairePlacementMatinFinMercredi = horairePlacementMatinFinMercredi;
    }

    /**
 
        * @hibernate.property
        *  column="horaire_placement_matin_fin_mercredi"
        
      
    public org.joda.time.LocalTime getHorairePlacementMatinFinMardi() {
        return this.horairePlacementMatinFinMardi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementMatinFinMercredi;

    public void setHorairePlacementMatinFinMercredi(final org.joda.time.LocalTime horairePlacementMatinFinMercredi) {
        this.horairePlacementMatinFinMercredi = horairePlacementMatinFinMercredi;
    }

 
    @Column(name="horaire_placement_matin_fin_mercredi"  )
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixHorairesAccueil'].test(_this.choixHorairesAccueil.toString());" +
                
              
              
            
            
            "return active",
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementMatinFinMercredi() {
        return this.horairePlacementMatinFinMercredi;
    }
  
      
    public org.joda.time.LocalTime getHorairePlacementMatinFinMercredi() {
        return this.horairePlacementMatinFinMercredi;
    }
  
        profiles = {"accueil"},
        message = "mardi"
      )
    
    private org.joda.time.LocalTime horairePlacementMatinFinVendredi;

    public final void setHorairePlacementMatinFinVendredi(final org.joda.time.LocalTime horairePlacementMatinFinVendredi) {
        this.horairePlacementMatinFinVendredi = horairePlacementMatinFinVendredi;
    }

    /**
 
        * @hibernate.property
        *  column="horaire_placement_matin_fin_vendredi"
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementMatinFinVendredi() {
        return this.horairePlacementMatinFinVendredi;
    }
  
    
    private String horairesReguliersMere;

    public final void setHorairesReguliersMere(final String horairesReguliersMere) {
        this.horairesReguliersMere = horairesReguliersMere;
    }

    /**
 
        * @hibernate.property
        *  column="horaires_reguliers_mere"
        
    private org.joda.time.LocalTime horairePlacementMatinFinVendredi;

    public void setHorairePlacementMatinFinVendredi(final org.joda.time.LocalTime horairePlacementMatinFinVendredi) {
        this.horairePlacementMatinFinVendredi = horairePlacementMatinFinVendredi;
    }

 
    @Column(name="horaire_placement_matin_fin_vendredi"  )
      
    public org.joda.time.LocalTime getHorairePlacementMatinFinVendredi() {
        return this.horairePlacementMatinFinVendredi;
    }
  
    
    private String horairesReguliersMere;

    public void setHorairesReguliersMere(final String horairesReguliersMere) {
        this.horairesReguliersMere = horairesReguliersMere;
    }

 
    @Column(name="horaires_reguliers_mere"  )
      @AssertValid(
        
        
      
    */
    public final String getHorairesReguliersMere() {
        return this.horairesReguliersMere;
    }
  
    
    private String horairesReguliersPere;

    public final void setHorairesReguliersPere(final String horairesReguliersPere) {
        this.horairesReguliersPere = horairesReguliersPere;
    }

    /**
 
        * @hibernate.property
        *  column="horaires_reguliers_pere"
        
      
    public String getHorairesReguliersMere() {
        return this.horairesReguliersMere;
    }
  
    
    private String horairesReguliersPere;

    public void setHorairesReguliersPere(final String horairesReguliersPere) {
        this.horairesReguliersPere = horairesReguliersPere;
    }

 
    @Column(name="horaires_reguliers_pere"  )
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixHorairesAccueil'].test(_this.choixHorairesAccueil.toString());" +
                
              
              
            
            
            "return active",
        
      
    */
    public final String getHorairesReguliersPere() {
        return this.horairesReguliersPere;
    }
  
      
    public String getHorairesReguliersPere() {
        return this.horairesReguliersPere;
    }
  
        profiles = {"accueil"},
        message = "mardi"
      )
    
    private fr.cg95.cvq.business.request.school.DccrrPlageHoraireMardi mardi;

    public final void setHorairesTravailJeudiMere(final String horairesTravailJeudiMere) {
        this.horairesTravailJeudiMere = horairesTravailJeudiMere;
    public void setHorairesTravailJeudiMere(final String horairesTravailJeudiMere) {
        this.horairesTravailJeudiMere = horairesTravailJeudiMere;
    public final void setMardi(final fr.cg95.cvq.business.request.school.DccrrPlageHoraireMardi mardi) {
        this.mardi = mardi;
    }

 
        * @hibernate.property
        *  column="horaires_travail_jeudi_mere"
        
    @Column(name="horaires_travail_jeudi_mere"  )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="mardi_id"
        *  class="fr.cg95.cvq.business.request.school.DccrrPlageHoraireMardi"
      
    */
    public final String getHorairesTravailJeudiMere() {
        return this.horairesTravailJeudiMere;
    public String getHorairesTravailJeudiMere() {
        return this.horairesTravailJeudiMere;
    */
    public final fr.cg95.cvq.business.request.school.DccrrPlageHoraireMardi getMardi() {
        return this.mardi;
    }
  
    
    private String horairesTravailJeudiPere;

    public final void setHorairesTravailJeudiPere(final String horairesTravailJeudiPere) {
        this.horairesTravailJeudiPere = horairesTravailJeudiPere;
    }

    /**
 
        * @hibernate.property
        *  column="horaires_travail_jeudi_pere"
        
      
    */
    public final String getHorairesTravailJeudiPere() {
        return this.horairesTravailJeudiPere;
    }
  
    
    private String horairesTravailLundiMere;

    public final void setHorairesTravailLundiMere(final String horairesTravailLundiMere) {
        this.horairesTravailLundiMere = horairesTravailLundiMere;
    }

    /**
 
        * @hibernate.property
        *  column="horaires_travail_lundi_mere"
        
    private String horairesTravailJeudiPere;

    public void setHorairesTravailJeudiPere(final String horairesTravailJeudiPere) {
        this.horairesTravailJeudiPere = horairesTravailJeudiPere;
    }

 
    @Column(name="horaires_travail_jeudi_pere"  )
      
    public String getHorairesTravailJeudiPere() {
        return this.horairesTravailJeudiPere;
    }
  
    
    private String horairesTravailLundiMere;

    public void setHorairesTravailLundiMere(final String horairesTravailLundiMere) {
        this.horairesTravailLundiMere = horairesTravailLundiMere;
    }

 
    @Column(name="horaires_travail_lundi_mere"  )
      @NotNull(
        
        
      
    */
    public final String getHorairesTravailLundiMere() {
        return this.horairesTravailLundiMere;
    }
  
    
    private String horairesTravailLundiPere;

    public final void setHorairesTravailLundiPere(final String horairesTravailLundiPere) {
        this.horairesTravailLundiPere = horairesTravailLundiPere;
    }

    /**
 
        * @hibernate.property
        *  column="horaires_travail_lundi_pere"
        
      
    public String getHorairesTravailLundiMere() {
        return this.horairesTravailLundiMere;
    }
  
    
    private String horairesTravailLundiPere;

    public void setHorairesTravailLundiPere(final String horairesTravailLundiPere) {
        this.horairesTravailLundiPere = horairesTravailLundiPere;
    }

 
    @Column(name="horaires_travail_lundi_pere"  )
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixHorairesAccueil'].test(_this.choixHorairesAccueil.toString());" +
                
              
              
            
            
            "return active",
        
      
    */
    public final String getHorairesTravailLundiPere() {
        return this.horairesTravailLundiPere;
    }
  
      
    public String getHorairesTravailLundiPere() {
        return this.horairesTravailLundiPere;
    }
  
        profiles = {"accueil"},
        message = "mercredi"
      )
    
    private String horairesTravailMardiMere;

    public final void setHorairesTravailMardiMere(final String horairesTravailMardiMere) {
        this.horairesTravailMardiMere = horairesTravailMardiMere;
    }

    /**
 
        * @hibernate.property
        *  column="horaires_travail_mardi_mere"
        
      
    */
    public final String getHorairesTravailMardiMere() {
        return this.horairesTravailMardiMere;
    }
  
    
    private String horairesTravailMardiPere;

    public final void setHorairesTravailMardiPere(final String horairesTravailMardiPere) {
        this.horairesTravailMardiPere = horairesTravailMardiPere;
    }

    /**
 
        * @hibernate.property
        *  column="horaires_travail_mardi_pere"
        
    private String horairesTravailMardiMere;

    public void setHorairesTravailMardiMere(final String horairesTravailMardiMere) {
        this.horairesTravailMardiMere = horairesTravailMardiMere;
    }

 
    @Column(name="horaires_travail_mardi_mere"  )
      
    public String getHorairesTravailMardiMere() {
        return this.horairesTravailMardiMere;
    }
  
    
    private String horairesTravailMardiPere;

    public void setHorairesTravailMardiPere(final String horairesTravailMardiPere) {
        this.horairesTravailMardiPere = horairesTravailMardiPere;
    }

 
    @Column(name="horaires_travail_mardi_pere"  )
      @AssertValid(
        
        
      
    */
    public final String getHorairesTravailMardiPere() {
        return this.horairesTravailMardiPere;
    }
  
    
    private String horairesTravailMercrediMere;

    public final void setHorairesTravailMercrediMere(final String horairesTravailMercrediMere) {
        this.horairesTravailMercrediMere = horairesTravailMercrediMere;
    }

    /**
 
        * @hibernate.property
        *  column="horaires_travail_mercredi_mere"
        
      
    public String getHorairesTravailMardiPere() {
        return this.horairesTravailMardiPere;
    }
  
    
    private String horairesTravailMercrediMere;

    public void setHorairesTravailMercrediMere(final String horairesTravailMercrediMere) {
        this.horairesTravailMercrediMere = horairesTravailMercrediMere;
    }

 
    @Column(name="horaires_travail_mercredi_mere"  )
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixHorairesAccueil'].test(_this.choixHorairesAccueil.toString());" +
                
              
              
            
            
            "return active",
        
      
    */
    public final String getHorairesTravailMercrediMere() {
        return this.horairesTravailMercrediMere;
    }
  
      
    public String getHorairesTravailMercrediMere() {
        return this.horairesTravailMercrediMere;
    }
  
        profiles = {"accueil"},
        message = "mercredi"
      )
    
    private fr.cg95.cvq.business.request.school.DccrrPlageHoraireMercredi mercredi;

    public final void setHorairesTravailMercrediPere(final String horairesTravailMercrediPere) {
        this.horairesTravailMercrediPere = horairesTravailMercrediPere;
    public void setHorairesTravailMercrediPere(final String horairesTravailMercrediPere) {
        this.horairesTravailMercrediPere = horairesTravailMercrediPere;
    public final void setMercredi(final fr.cg95.cvq.business.request.school.DccrrPlageHoraireMercredi mercredi) {
        this.mercredi = mercredi;
    }

 
        * @hibernate.property
        *  column="horaires_travail_mercredi_pere"
        
    @Column(name="horaires_travail_mercredi_pere"  )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="mercredi_id"
        *  class="fr.cg95.cvq.business.request.school.DccrrPlageHoraireMercredi"
      
    */
    public final String getHorairesTravailMercrediPere() {
        return this.horairesTravailMercrediPere;
    }
  
    
    private String horairesTravailVendrediMere;

    public final void setHorairesTravailVendrediMere(final String horairesTravailVendrediMere) {
        this.horairesTravailVendrediMere = horairesTravailVendrediMere;
    }

    /**
 
        * @hibernate.property
        *  column="horaires_travail_vendredi_mere"
        
      
    */
    public final String getHorairesTravailVendrediMere() {
        return this.horairesTravailVendrediMere;
    public String getHorairesTravailMercrediPere() {
        return this.horairesTravailMercrediPere;
    }
  
    
    private String horairesTravailVendrediMere;

    public void setHorairesTravailVendrediMere(final String horairesTravailVendrediMere) {
        this.horairesTravailVendrediMere = horairesTravailVendrediMere;
    }

 
    @Column(name="horaires_travail_vendredi_mere"  )
      
    public String getHorairesTravailVendrediMere() {
        return this.horairesTravailVendrediMere;
    */
    public final fr.cg95.cvq.business.request.school.DccrrPlageHoraireMercredi getMercredi() {
        return this.mercredi;
    }
  
    
    private String horairesTravailVendrediPere;

    public final void setHorairesTravailVendrediPere(final String horairesTravailVendrediPere) {
        this.horairesTravailVendrediPere = horairesTravailVendrediPere;
    }

    /**
 
        * @hibernate.property
        *  column="horaires_travail_vendredi_pere"
        
      
    */
    public final String getHorairesTravailVendrediPere() {
        return this.horairesTravailVendrediPere;
    }
  
    
    private String horairesTravailVendrediPere;

    public void setHorairesTravailVendrediPere(final String horairesTravailVendrediPere) {
        this.horairesTravailVendrediPere = horairesTravailVendrediPere;
    }

 
    @Column(name="horaires_travail_vendredi_pere"  )
      
    public String getHorairesTravailVendrediPere() {
        return this.horairesTravailVendrediPere;
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
        
        
        profiles = {"rendezVous"},
        message = "plageHoraireContact"
      )
    
    private fr.cg95.cvq.business.request.school.PlageHoraireContactType plageHoraireContact;

    public final void setPlageHoraireContact(final fr.cg95.cvq.business.request.school.PlageHoraireContactType plageHoraireContact) {
        this.plageHoraireContact = plageHoraireContact;
    }

    /**
 
        * @hibernate.property
        *  column="plage_horaire_contact"
        
      
    */
    public final fr.cg95.cvq.business.request.school.PlageHoraireContactType getPlageHoraireContact() {
        return this.plageHoraireContact;
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
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixHorairesAccueil'].test(_this.choixHorairesAccueil.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"accueil"},
        message = "plageHoraireAccueilReguliere"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixHorairesAccueil'].test(_this.choixHorairesAccueil.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"accueil"},
        message = "plageHoraireAccueilReguliere"
      )
    
    private fr.cg95.cvq.business.request.school.DccrrPlageHoraire plageHoraireAccueilReguliere;

    public final void setPrecisionAutreSituationActuelleMere(final String precisionAutreSituationActuelleMere) {
        this.precisionAutreSituationActuelleMere = precisionAutreSituationActuelleMere;
    public void setPrecisionAutreSituationActuelleMere(final String precisionAutreSituationActuelleMere) {
        this.precisionAutreSituationActuelleMere = precisionAutreSituationActuelleMere;
    public final void setPlageHoraireAccueilReguliere(final fr.cg95.cvq.business.request.school.DccrrPlageHoraire plageHoraireAccueilReguliere) {
        this.plageHoraireAccueilReguliere = plageHoraireAccueilReguliere;
    }

 
        * @hibernate.property
        *  column="precision_autre_situation_actuelle_mere"
        
    @Column(name="precision_autre_situation_actuelle_mere"  )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="plage_horaire_accueil_reguliere_id"
        *  class="fr.cg95.cvq.business.request.school.DccrrPlageHoraire"
      
    */
    public final String getPrecisionAutreSituationActuelleMere() {
        return this.precisionAutreSituationActuelleMere;
    public String getPrecisionAutreSituationActuelleMere() {
        return this.precisionAutreSituationActuelleMere;
    */
    public final fr.cg95.cvq.business.request.school.DccrrPlageHoraire getPlageHoraireAccueilReguliere() {
        return this.plageHoraireAccueilReguliere;
    }
  
    
      @NotNull(
        
        
        profiles = {"rendezVous"},
        message = "plageHoraireContact"
      )
    
    private fr.cg95.cvq.business.request.school.PlageHoraireContactType plageHoraireContact;

    public final void setPrecisionAutreSituationActuellePere(final String precisionAutreSituationActuellePere) {
        this.precisionAutreSituationActuellePere = precisionAutreSituationActuellePere;
    public void setPrecisionAutreSituationActuellePere(final String precisionAutreSituationActuellePere) {
        this.precisionAutreSituationActuellePere = precisionAutreSituationActuellePere;
    public final void setPlageHoraireContact(final fr.cg95.cvq.business.request.school.PlageHoraireContactType plageHoraireContact) {
        this.plageHoraireContact = plageHoraireContact;
    }

 
        * @hibernate.property
        *  column="precision_autre_situation_actuelle_pere"
        
    @Column(name="precision_autre_situation_actuelle_pere"  )
        * @hibernate.property
        *  column="plage_horaire_contact"
        
      
    */
    public final String getPrecisionAutreSituationActuellePere() {
        return this.precisionAutreSituationActuellePere;
    }
  
    
    private String professionMere;

    public final void setProfessionMere(final String professionMere) {
        this.professionMere = professionMere;
    }

    /**
 
        * @hibernate.property
        *  column="profession_mere"
        
      
    */
    public final String getProfessionMere() {
        return this.professionMere;
    }
  
    
    private String professionPere;

    public final void setProfessionPere(final String professionPere) {
        this.professionPere = professionPere;
    }

    /**
 
        * @hibernate.property
        *  column="profession_pere"
        
      
    */
    public final String getProfessionPere() {
        return this.professionPere;
    }
  
    
    private fr.cg95.cvq.business.request.school.ChoixSituationActuelle situationActuelleMere;

    public final void setSituationActuelleMere(final fr.cg95.cvq.business.request.school.ChoixSituationActuelle situationActuelleMere) {
        this.situationActuelleMere = situationActuelleMere;
    }

    /**
 
        * @hibernate.property
        *  column="situation_actuelle_mere"
        
      
    */
    public final fr.cg95.cvq.business.request.school.ChoixSituationActuelle getSituationActuelleMere() {
        return this.situationActuelleMere;
    public String getPrecisionAutreSituationActuellePere() {
        return this.precisionAutreSituationActuellePere;
    }
  
    
    private String professionMere;

    public void setProfessionMere(final String professionMere) {
        this.professionMere = professionMere;
    }

 
    @Column(name="profession_mere"  )
      
    public String getProfessionMere() {
        return this.professionMere;
    }
  
    
    private String professionPere;

    public void setProfessionPere(final String professionPere) {
        this.professionPere = professionPere;
    }

 
    @Column(name="profession_pere"  )
      
    public String getProfessionPere() {
        return this.professionPere;
    }
  
    
    private fr.cg95.cvq.business.request.school.ChoixSituationActuelle situationActuelleMere;

    public void setSituationActuelleMere(final fr.cg95.cvq.business.request.school.ChoixSituationActuelle situationActuelleMere) {
        this.situationActuelleMere = situationActuelleMere;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="situation_actuelle_mere"  )
      
    public fr.cg95.cvq.business.request.school.ChoixSituationActuelle getSituationActuelleMere() {
        return this.situationActuelleMere;
    */
    public final fr.cg95.cvq.business.request.school.PlageHoraireContactType getPlageHoraireContact() {
        return this.plageHoraireContact;
    }
  
    
    private fr.cg95.cvq.business.request.school.ChoixSituationActuelle situationActuellePere;

    public final void setSituationActuellePere(final fr.cg95.cvq.business.request.school.ChoixSituationActuelle situationActuellePere) {
        this.situationActuellePere = situationActuellePere;
    }

    /**
 
        * @hibernate.property
        *  column="situation_actuelle_pere"
        
      
    */
    public final fr.cg95.cvq.business.request.school.ChoixSituationActuelle getSituationActuellePere() {
        return this.situationActuellePere;
    }
  
    
    private fr.cg95.cvq.business.request.school.ChoixSituationActuelle situationActuellePere;

    public void setSituationActuellePere(final fr.cg95.cvq.business.request.school.ChoixSituationActuelle situationActuellePere) {
        this.situationActuellePere = situationActuellePere;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="situation_actuelle_pere"  )
      
    public fr.cg95.cvq.business.request.school.ChoixSituationActuelle getSituationActuellePere() {
        return this.situationActuellePere;
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
          
            "active &= _this.conditions['choixHorairesAccueil'].test(_this.choixHorairesAccueil.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"accueil"},
        message = "vendredi"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixHorairesAccueil'].test(_this.choixHorairesAccueil.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"accueil"},
        message = "vendredi"
      )
    
    private fr.cg95.cvq.business.request.school.DccrrPlageHoraireVendredi vendredi;

    public final void setVendredi(final fr.cg95.cvq.business.request.school.DccrrPlageHoraireVendredi vendredi) {
        this.vendredi = vendredi;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="vendredi_id"
        *  class="fr.cg95.cvq.business.request.school.DccrrPlageHoraireVendredi"
      
    */
    public final fr.cg95.cvq.business.request.school.DccrrPlageHoraireVendredi getVendredi() {
        return this.vendredi;
    }
  
}
