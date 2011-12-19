

package fr.cg95.cvq.business.request.urbanism;

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
@Table(name="taverny_approval_road_occupancy_request")
public class TavernyApprovalRoadOccupancyRequestData implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>(RequestData.conditions);

    private Long id;

    public TavernyApprovalRoadOccupancyRequestData() {
      
        reglement = Boolean.valueOf(false);
      
    }

    @Override
    public TavernyApprovalRoadOccupancyRequestData clone() {
        TavernyApprovalRoadOccupancyRequestData result = new TavernyApprovalRoadOccupancyRequestData();
        
          
            
        if (adresseEntreprise != null)
            result.setAdresseEntreprise(adresseEntreprise.clone());
      
          
        
          
            
        if (adresseLieuConcerne != null)
            result.setAdresseLieuConcerne(adresseLieuConcerne.clone());
      
          
        
          
            
        result.setAvisServiceTechnique(avisServiceTechnique);
      
          
        
          
            
        List<fr.cg95.cvq.business.request.LocalReferentialData> choixMesuresDemandeesList = new ArrayList<fr.cg95.cvq.business.request.LocalReferentialData>();
        for (LocalReferentialData object : choixMesuresDemandees) {
            choixMesuresDemandeesList.add(object.clone());
        }
        result.setChoixMesuresDemandees(choixMesuresDemandeesList);
      
          
        
          
            
        List<fr.cg95.cvq.business.request.LocalReferentialData> choixObjetDemandeList = new ArrayList<fr.cg95.cvq.business.request.LocalReferentialData>();
        for (LocalReferentialData object : choixObjetDemande) {
            choixObjetDemandeList.add(object.clone());
        }
        result.setChoixObjetDemande(choixObjetDemandeList);
      
          
        
          
            
        List<fr.cg95.cvq.business.request.LocalReferentialData> choixTypeTravauxList = new ArrayList<fr.cg95.cvq.business.request.LocalReferentialData>();
        for (LocalReferentialData object : choixTypeTravaux) {
            choixTypeTravauxList.add(object.clone());
        }
        result.setChoixTypeTravaux(choixTypeTravauxList);
      
          
        
          
            
        List<fr.cg95.cvq.business.request.LocalReferentialData> choixZonesConcerneesList = new ArrayList<fr.cg95.cvq.business.request.LocalReferentialData>();
        for (LocalReferentialData object : choixZonesConcernees) {
            choixZonesConcerneesList.add(object.clone());
        }
        result.setChoixZonesConcernees(choixZonesConcerneesList);
      
          
        
          
            
        result.setDebutPeriode(debutPeriode);
      
          
        
          
            
        result.setDescriptifLieuConcerne(descriptifLieuConcerne);
      
          
        
          
            
        result.setDroitsVoirie(droitsVoirie);
      
          
        
          
            
        result.setFinPeriode(finPeriode);
      
          
        
          
            
        result.setHauteurSurfaceOccupee(hauteurSurfaceOccupee);
      
          
        
          
            
        result.setLargeurSurfaceOccupee(largeurSurfaceOccupee);
      
          
        
          
            
        result.setLongueurSurfaceOccupee(longueurSurfaceOccupee);
      
          
        
          
            
        result.setNomEntreprise(nomEntreprise);
      
          
        
          
            
        result.setPrecisionsMesuresDemandees(precisionsMesuresDemandees);
      
          
        
          
            
        result.setPrecisionsObjetDemande(precisionsObjetDemande);
      
          
        
          
            
        result.setPrecisionsTypeTravaux(precisionsTypeTravaux);
      
          
        
          
            
        result.setPrecisionsZonesConcernees(precisionsZonesConcernees);
      
          
        
          
            
        result.setProprietaireLieuConcerne(proprietaireLieuConcerne);
      
          
        
          
            
        result.setReglement(reglement);
      
          
        
          
            
        result.setSurfaceTotale(surfaceTotale);
      
          
        
          
            
        result.setTelecopieEntreprise(telecopieEntreprise);
      
          
        
          
            
        result.setTelephoneEntreprise(telephoneEntreprise);
      
          
        
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
        
        
        profiles = {"general"},
        message = "adresseEntreprise"
      )
    
      @AssertValid(
        
        
        profiles = {"general"},
        message = "adresseEntreprise"
      )
    
    private fr.cg95.cvq.business.users.Address adresseEntreprise;

    public void setAdresseEntreprise(final fr.cg95.cvq.business.users.Address adresseEntreprise) {
        this.adresseEntreprise = adresseEntreprise;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="adresse_entreprise_id")
      
    public fr.cg95.cvq.business.users.Address getAdresseEntreprise() {
        return this.adresseEntreprise;
    }
  
    
      @NotNull(
        
        
        profiles = {"general"},
        message = "adresseLieuConcerne"
      )
    
      @AssertValid(
        
        
        profiles = {"general"},
        message = "adresseLieuConcerne"
      )
    
    private fr.cg95.cvq.business.users.Address adresseLieuConcerne;

    public void setAdresseLieuConcerne(final fr.cg95.cvq.business.users.Address adresseLieuConcerne) {
        this.adresseLieuConcerne = adresseLieuConcerne;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="adresse_lieu_concerne_id")
      
    public fr.cg95.cvq.business.users.Address getAdresseLieuConcerne() {
        return this.adresseLieuConcerne;
    }
  
    
    private String avisServiceTechnique;

    public void setAvisServiceTechnique(final String avisServiceTechnique) {
        this.avisServiceTechnique = avisServiceTechnique;
    }

 
    @Column(name="avis_service_technique"  )
      
    public String getAvisServiceTechnique() {
        return this.avisServiceTechnique;
    }
  
    
      @LocalReferential(
        
        
        profiles = {"technique"},
        message = "choixMesuresDemandees"
      )
    
      @MinSize(
        
          value = 1,
        
        
        profiles = {"technique"},
        message = "choixMesuresDemandees"
      )
    
    private List<fr.cg95.cvq.business.request.LocalReferentialData> choixMesuresDemandees;

    public void setChoixMesuresDemandees(final List<fr.cg95.cvq.business.request.LocalReferentialData> choixMesuresDemandees) {
        this.choixMesuresDemandees = choixMesuresDemandees;
    }

 
    @ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinTable(name="taverny_approval_road_occupancy_request_choix_mesures_demandees",
            joinColumns=
                @JoinColumn(name="taverny_approval_road_occupancy_request_id"),
            inverseJoinColumns=
                @JoinColumn(name="choix_mesures_demandees_id"))
    @OrderColumn(name="choix_mesures_demandees_index")
      
    public List<fr.cg95.cvq.business.request.LocalReferentialData> getChoixMesuresDemandees() {
        return this.choixMesuresDemandees;
    }
  
    
      @LocalReferential(
        
        
        profiles = {"technique"},
        message = "choixObjetDemande"
      )
    
      @MinSize(
        
          value = 1,
        
        
        profiles = {"technique"},
        message = "choixObjetDemande"
      )
    
    private List<fr.cg95.cvq.business.request.LocalReferentialData> choixObjetDemande;

    public void setChoixObjetDemande(final List<fr.cg95.cvq.business.request.LocalReferentialData> choixObjetDemande) {
        this.choixObjetDemande = choixObjetDemande;
    }

 
    @ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinTable(name="taverny_approval_road_occupancy_request_choix_objet_demande",
            joinColumns=
                @JoinColumn(name="taverny_approval_road_occupancy_request_id"),
            inverseJoinColumns=
                @JoinColumn(name="choix_objet_demande_id"))
    @OrderColumn(name="choix_objet_demande_index")
      
    public List<fr.cg95.cvq.business.request.LocalReferentialData> getChoixObjetDemande() {
        return this.choixObjetDemande;
    }
  
    
      @LocalReferential(
        
        
        profiles = {"technique"},
        message = "choixTypeTravaux"
      )
    
      @MinSize(
        
          value = 1,
        
        
        profiles = {"technique"},
        message = "choixTypeTravaux"
      )
    
    private List<fr.cg95.cvq.business.request.LocalReferentialData> choixTypeTravaux;

    public void setChoixTypeTravaux(final List<fr.cg95.cvq.business.request.LocalReferentialData> choixTypeTravaux) {
        this.choixTypeTravaux = choixTypeTravaux;
    }

 
    @ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinTable(name="taverny_approval_road_occupancy_request_choix_type_travaux",
            joinColumns=
                @JoinColumn(name="taverny_approval_road_occupancy_request_id"),
            inverseJoinColumns=
                @JoinColumn(name="choix_type_travaux_id"))
    @OrderColumn(name="choix_type_travaux_index")
      
    public List<fr.cg95.cvq.business.request.LocalReferentialData> getChoixTypeTravaux() {
        return this.choixTypeTravaux;
    }
  
    
      @LocalReferential(
        
        
        profiles = {"technique"},
        message = "choixZonesConcernees"
      )
    
      @MinSize(
        
          value = 1,
        
        
        profiles = {"technique"},
        message = "choixZonesConcernees"
      )
    
    private List<fr.cg95.cvq.business.request.LocalReferentialData> choixZonesConcernees;

    public void setChoixZonesConcernees(final List<fr.cg95.cvq.business.request.LocalReferentialData> choixZonesConcernees) {
        this.choixZonesConcernees = choixZonesConcernees;
    }

 
    @ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinTable(name="taverny_approval_road_occupancy_request_choix_zones_concernees",
            joinColumns=
                @JoinColumn(name="taverny_approval_road_occupancy_request_id"),
            inverseJoinColumns=
                @JoinColumn(name="choix_zones_concernees_id"))
    @OrderColumn(name="choix_zones_concernees_index")
      
    public List<fr.cg95.cvq.business.request.LocalReferentialData> getChoixZonesConcernees() {
        return this.choixZonesConcernees;
    }
  
    
      @NotNull(
        
        
        profiles = {"general"},
        message = "debutPeriode"
      )
    
    private java.util.Date debutPeriode;

    public void setDebutPeriode(final java.util.Date debutPeriode) {
        this.debutPeriode = debutPeriode;
    }

 
    @Column(name="debut_periode"  )
      
    public java.util.Date getDebutPeriode() {
        return this.debutPeriode;
    }
  
    
    private String descriptifLieuConcerne;

    public void setDescriptifLieuConcerne(final String descriptifLieuConcerne) {
        this.descriptifLieuConcerne = descriptifLieuConcerne;
    }

 
    @Column(name="descriptif_lieu_concerne"  )
      
    public String getDescriptifLieuConcerne() {
        return this.descriptifLieuConcerne;
    }
  
    
    private String droitsVoirie;

    public void setDroitsVoirie(final String droitsVoirie) {
        this.droitsVoirie = droitsVoirie;
    }

 
    @Column(name="droits_voirie"  )
      
    public String getDroitsVoirie() {
        return this.droitsVoirie;
    }
  
    
      @NotNull(
        
        
        profiles = {"general"},
        message = "finPeriode"
      )
    
    private java.util.Date finPeriode;

    public void setFinPeriode(final java.util.Date finPeriode) {
        this.finPeriode = finPeriode;
    }

 
    @Column(name="fin_periode"  )
      
    public java.util.Date getFinPeriode() {
        return this.finPeriode;
    }
  
    
      @NotNull(
        
        
        profiles = {"technique"},
        message = "hauteurSurfaceOccupee"
      )
    
      @NotBlank(
        
        
        profiles = {"technique"},
        message = "hauteurSurfaceOccupee"
      )
    
    private String hauteurSurfaceOccupee;

    public void setHauteurSurfaceOccupee(final String hauteurSurfaceOccupee) {
        this.hauteurSurfaceOccupee = hauteurSurfaceOccupee;
    }

 
    @Column(name="hauteur_surface_occupee"  )
      
    public String getHauteurSurfaceOccupee() {
        return this.hauteurSurfaceOccupee;
    }
  
    
      @NotNull(
        
        
        profiles = {"technique"},
        message = "largeurSurfaceOccupee"
      )
    
      @NotBlank(
        
        
        profiles = {"technique"},
        message = "largeurSurfaceOccupee"
      )
    
    private String largeurSurfaceOccupee;

    public void setLargeurSurfaceOccupee(final String largeurSurfaceOccupee) {
        this.largeurSurfaceOccupee = largeurSurfaceOccupee;
    }

 
    @Column(name="largeur_surface_occupee"  )
      
    public String getLargeurSurfaceOccupee() {
        return this.largeurSurfaceOccupee;
    }
  
    
      @NotNull(
        
        
        profiles = {"technique"},
        message = "longueurSurfaceOccupee"
      )
    
      @NotBlank(
        
        
        profiles = {"technique"},
        message = "longueurSurfaceOccupee"
      )
    
    private String longueurSurfaceOccupee;

    public void setLongueurSurfaceOccupee(final String longueurSurfaceOccupee) {
        this.longueurSurfaceOccupee = longueurSurfaceOccupee;
    }

 
    @Column(name="longueur_surface_occupee"  )
      
    public String getLongueurSurfaceOccupee() {
        return this.longueurSurfaceOccupee;
    }
  
    
      @NotNull(
        
        
        profiles = {"general"},
        message = "nomEntreprise"
      )
    
      @NotBlank(
        
        
        profiles = {"general"},
        message = "nomEntreprise"
      )
    
    private String nomEntreprise;

    public void setNomEntreprise(final String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

 
    @Column(name="nom_entreprise"  )
      
    public String getNomEntreprise() {
        return this.nomEntreprise;
    }
  
    
    private String precisionsMesuresDemandees;

    public void setPrecisionsMesuresDemandees(final String precisionsMesuresDemandees) {
        this.precisionsMesuresDemandees = precisionsMesuresDemandees;
    }

 
    @Column(name="precisions_mesures_demandees"  )
      
    public String getPrecisionsMesuresDemandees() {
        return this.precisionsMesuresDemandees;
    }
  
    
    private String precisionsObjetDemande;

    public void setPrecisionsObjetDemande(final String precisionsObjetDemande) {
        this.precisionsObjetDemande = precisionsObjetDemande;
    }

 
    @Column(name="precisions_objet_demande"  )
      
    public String getPrecisionsObjetDemande() {
        return this.precisionsObjetDemande;
    }
  
    
    private String precisionsTypeTravaux;

    public void setPrecisionsTypeTravaux(final String precisionsTypeTravaux) {
        this.precisionsTypeTravaux = precisionsTypeTravaux;
    }

 
    @Column(name="precisions_type_travaux"  )
      
    public String getPrecisionsTypeTravaux() {
        return this.precisionsTypeTravaux;
    }
  
    
    private String precisionsZonesConcernees;

    public void setPrecisionsZonesConcernees(final String precisionsZonesConcernees) {
        this.precisionsZonesConcernees = precisionsZonesConcernees;
    }

 
    @Column(name="precisions_zones_concernees"  )
      
    public String getPrecisionsZonesConcernees() {
        return this.precisionsZonesConcernees;
    }
  
    
      @NotNull(
        
        
        profiles = {"general"},
        message = "proprietaireLieuConcerne"
      )
    
      @NotBlank(
        
        
        profiles = {"general"},
        message = "proprietaireLieuConcerne"
      )
    
    private String proprietaireLieuConcerne;

    public void setProprietaireLieuConcerne(final String proprietaireLieuConcerne) {
        this.proprietaireLieuConcerne = proprietaireLieuConcerne;
    }

 
    @Column(name="proprietaire_lieu_concerne"  )
      
    public String getProprietaireLieuConcerne() {
        return this.proprietaireLieuConcerne;
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
        
        
        profiles = {"technique"},
        message = "surfaceTotale"
      )
    
      @NotBlank(
        
        
        profiles = {"technique"},
        message = "surfaceTotale"
      )
    
    private String surfaceTotale;

    public void setSurfaceTotale(final String surfaceTotale) {
        this.surfaceTotale = surfaceTotale;
    }

 
    @Column(name="surface_totale"  )
      
    public String getSurfaceTotale() {
        return this.surfaceTotale;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"general"},
        message = "telecopieEntreprise"
      )
    
    private String telecopieEntreprise;

    public void setTelecopieEntreprise(final String telecopieEntreprise) {
        this.telecopieEntreprise = telecopieEntreprise;
    }

 
    @Column(name="telecopie_entreprise" , length=10 )
      
    public String getTelecopieEntreprise() {
        return this.telecopieEntreprise;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"general"},
        message = "telephoneEntreprise"
      )
    
      @NotNull(
        
        
        profiles = {"general"},
        message = "telephoneEntreprise"
      )
    
      @NotBlank(
        
        
        profiles = {"general"},
        message = "telephoneEntreprise"
      )
    
    private String telephoneEntreprise;

    public void setTelephoneEntreprise(final String telephoneEntreprise) {
        this.telephoneEntreprise = telephoneEntreprise;
    }

 
    @Column(name="telephone_entreprise" , length=10 )
      
    public String getTelephoneEntreprise() {
        return this.telephoneEntreprise;
    }
  
}
