

package fr.cg95.cvq.business.request.social;

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
@Table(name="mdph_youth_request")
public class MdphYouthRequestData implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>(RequestData.conditions);

    private Long id;

    public MdphYouthRequestData() {
      
        allocationPersonnaliseeAutonomie = Boolean.valueOf(false);
      
        carteAccompagnement = Boolean.valueOf(false);
      
        carteInvalidite = Boolean.valueOf(false);
      
        carteStationnement = Boolean.valueOf(false);
      
        enfantEnInternat = Boolean.valueOf(false);
      
        fraisSejourPrisEnCharge = Boolean.valueOf(false);
      
        preferencesEtablissementOuService = Boolean.valueOf(false);
      
    }

    @Override
    public MdphYouthRequestData clone() {
        MdphYouthRequestData result = new MdphYouthRequestData();
        
          
            
        result.setAllocationPersonnaliseeAutonomie(allocationPersonnaliseeAutonomie);
      
          
        
          
            
        if (autoriteParentaleMere != null)
            result.setAutoriteParentaleMere(autoriteParentaleMere.clone());
      
          
        
          
            
        if (autoriteParentalePere != null)
            result.setAutoriteParentalePere(autoriteParentalePere.clone());
      
          
        
          
            
        if (besoinsDemandePCH != null)
            result.setBesoinsDemandePCH(besoinsDemandePCH.clone());
      
          
        
          
            
        result.setCarteAccompagnement(carteAccompagnement);
      
          
        
          
            
        result.setCarteInvalidite(carteInvalidite);
      
          
        
          
            
        result.setCarteStationnement(carteStationnement);
      
          
        
          
            
        if (choixPrestationCompensation != null)
            result.setChoixPrestationCompensation(choixPrestationCompensation);
        else
            result.setChoixPrestationCompensation(fr.cg95.cvq.business.request.social.MyrChoixPrestationCompensationType.getDefaultMyrChoixPrestationCompensationType());
      
          
        
          
            
        if (choixProjetDeVie != null)
            result.setChoixProjetDeVie(choixProjetDeVie);
        else
            result.setChoixProjetDeVie(fr.cg95.cvq.business.request.social.MyrChoixProjetDeVieType.getDefaultMyrChoixProjetDeVieType());
      
          
        
          
            
        result.setConseilleProjetDeVie(conseilleProjetDeVie);
      
          
        
          
            
        result.setDateArriveeFrance(dateArriveeFrance);
      
          
        
          
            
        result.setDateNaissanceSujet(dateNaissanceSujet);
      
          
        
          
            
        result.setDateSituationFamiliale(dateSituationFamiliale);
      
          
        
          
            
        result.setDemandeLibreScolaire(demandeLibreScolaire);
      
          
        
          
            
        if (deteneurAutoriteParentale != null)
            result.setDeteneurAutoriteParentale(deteneurAutoriteParentale);
        else
            result.setDeteneurAutoriteParentale(fr.cg95.cvq.business.request.social.DeteneurAutoriteParentaleType.getDefaultDeteneurAutoriteParentaleType());
      
          
        
          
            
        if (domiciliationEtablissement != null)
            result.setDomiciliationEtablissement(domiciliationEtablissement.clone());
      
          
        
          
            
        if (domiciliationOrganismePayeur != null)
            result.setDomiciliationOrganismePayeur(domiciliationOrganismePayeur.clone());
      
          
        
          
            
        result.setEnInternatDepuisLe(enInternatDepuisLe);
      
          
        
          
            
        result.setEnfantEnInternat(enfantEnInternat);
      
          
        
          
            
        result.setExpressionProjetDeVie(expressionProjetDeVie);
      
          
        
          
            
        result.setFaxSujet(faxSujet);
      
          
        
          
            
        result.setFraisSejourPrisEnCharge(fraisSejourPrisEnCharge);
      
          
        
          
            
        List<fr.cg95.cvq.business.request.social.MyrFraisSuppLiesHandicap> fraisSuppLiesHandicapList = new ArrayList<fr.cg95.cvq.business.request.social.MyrFraisSuppLiesHandicap>();
        for (MyrFraisSuppLiesHandicap object : fraisSuppLiesHandicap) {
            fraisSuppLiesHandicapList.add(object.clone());
        }
        result.setFraisSuppLiesHandicap(fraisSuppLiesHandicapList);
      
          
        
          
            
        if (identiteConjoint != null)
            result.setIdentiteConjoint(identiteConjoint.clone());
      
          
        
          
            
        if (informationAutreDeteneurAutoriteParentale != null)
            result.setInformationAutreDeteneurAutoriteParentale(informationAutreDeteneurAutoriteParentale.clone());
      
          
        
          
            
        if (lieuNaissanceSujet != null)
            result.setLieuNaissanceSujet(lieuNaissanceSujet.clone());
      
          
        
          
            
        if (nationalite != null)
            result.setNationalite(nationalite);
        else
            result.setNationalite(fr.cg95.cvq.business.request.social.MyrNationaliteAvecSuisseType.getDefaultMyrNationaliteAvecSuisseType());
      
          
        
          
            
        result.setNomAllocataire(nomAllocataire);
      
          
        
          
            
        result.setNomEtablissement(nomEtablissement);
      
          
        
          
            
        result.setNomOrganismePayeur(nomOrganismePayeur);
      
          
        
          
            
        result.setNomOrganismeSecuriteSociale(nomOrganismeSecuriteSociale);
      
          
        
          
            
        result.setNombreEnfantsACharge(nombreEnfantsACharge);
      
          
        
          
            
        result.setNumeroAllocataire(numeroAllocataire);
      
          
        
          
            
        result.setNumeroSecuriteSocialeSujet(numeroSecuriteSocialeSujet);
      
          
        
          
            
        if (organismePayeur != null)
            result.setOrganismePayeur(organismePayeur);
        else
            result.setOrganismePayeur(fr.cg95.cvq.business.request.social.MyrOrganismePayeurType.getDefaultMyrOrganismePayeurType());
      
          
        
          
            
        if (precedentDossierMdph != null)
            result.setPrecedentDossierMdph(precedentDossierMdph.clone());
      
          
        
          
            
        result.setPrecisionAutre(precisionAutre);
      
          
        
          
            
        result.setPrecisionLogementAutre(precisionLogementAutre);
      
          
        
          
            
        if (precisionPreferencesEtablissementOuService != null)
            result.setPrecisionPreferencesEtablissementOuService(precisionPreferencesEtablissementOuService.clone());
      
          
        
          
            
        result.setPrecisionSiDomicileAupresOrganisme(precisionSiDomicileAupresOrganisme);
      
          
        
          
            
        result.setPreferencesEtablissementOuService(preferencesEtablissementOuService);
      
          
        
          
            
        result.setPrenomAllocataire(prenomAllocataire);
      
          
        
          
            
        if (presencePersonneAupresEnfant != null)
            result.setPresencePersonneAupresEnfant(presencePersonneAupresEnfant.clone());
      
          
        
          
            
        if (situationMaritale != null)
            result.setSituationMaritale(situationMaritale);
        else
            result.setSituationMaritale(fr.cg95.cvq.business.request.social.MyrSituationFamilialeType.getDefaultMyrSituationFamilialeType());
      
          
        
          
            
        if (situationParticuliere != null)
            result.setSituationParticuliere(situationParticuliere);
        else
            result.setSituationParticuliere(fr.cg95.cvq.business.request.social.MyrSituationAutreType.getDefaultMyrSituationAutreType());
      
          
        
          
            
        if (situationProfessionnelleConjoint != null)
            result.setSituationProfessionnelleConjoint(situationProfessionnelleConjoint);
        else
            result.setSituationProfessionnelleConjoint(fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType.getDefaultMyrChoixSituationProfessionnelleType());
      
          
        
          
            
        if (situationProfessionnelleConjointAutre != null)
            result.setSituationProfessionnelleConjointAutre(situationProfessionnelleConjointAutre.clone());
      
          
        
          
            
        if (situationProfessionnelleConjointBeneficiairePension != null)
            result.setSituationProfessionnelleConjointBeneficiairePension(situationProfessionnelleConjointBeneficiairePension.clone());
      
          
        
          
            
        if (situationProfessionnelleConjointDemandeurEmploi != null)
            result.setSituationProfessionnelleConjointDemandeurEmploi(situationProfessionnelleConjointDemandeurEmploi.clone());
      
          
        
          
            
        if (situationProfessionnelleConjointNonSalarie != null)
            result.setSituationProfessionnelleConjointNonSalarie(situationProfessionnelleConjointNonSalarie.clone());
      
          
        
          
            
        if (situationProfessionnelleConjointRetraite != null)
            result.setSituationProfessionnelleConjointRetraite(situationProfessionnelleConjointRetraite.clone());
      
          
        
          
            
        if (situationProfessionnelleConjointSalarie != null)
            result.setSituationProfessionnelleConjointSalarie(situationProfessionnelleConjointSalarie.clone());
      
          
        
          
            
        if (situationProfessionnelleConjointStagiaire != null)
            result.setSituationProfessionnelleConjointStagiaire(situationProfessionnelleConjointStagiaire.clone());
      
          
        
          
            
        if (situationProfessionnelleVous != null)
            result.setSituationProfessionnelleVous(situationProfessionnelleVous);
        else
            result.setSituationProfessionnelleVous(fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType.getDefaultMyrChoixSituationProfessionnelleType());
      
          
        
          
            
        if (situationProfessionnelleVousAutre != null)
            result.setSituationProfessionnelleVousAutre(situationProfessionnelleVousAutre.clone());
      
          
        
          
            
        if (situationProfessionnelleVousBeneficiairePension != null)
            result.setSituationProfessionnelleVousBeneficiairePension(situationProfessionnelleVousBeneficiairePension.clone());
      
          
        
          
            
        if (situationProfessionnelleVousDemandeurEmploi != null)
            result.setSituationProfessionnelleVousDemandeurEmploi(situationProfessionnelleVousDemandeurEmploi.clone());
      
          
        
          
            
        if (situationProfessionnelleVousNonSalarie != null)
            result.setSituationProfessionnelleVousNonSalarie(situationProfessionnelleVousNonSalarie.clone());
      
          
        
          
            
        if (situationProfessionnelleVousRetraite != null)
            result.setSituationProfessionnelleVousRetraite(situationProfessionnelleVousRetraite.clone());
      
          
        
          
            
        if (situationProfessionnelleVousSalarie != null)
            result.setSituationProfessionnelleVousSalarie(situationProfessionnelleVousSalarie.clone());
      
          
        
          
            
        if (situationProfessionnelleVousStagiaire != null)
            result.setSituationProfessionnelleVousStagiaire(situationProfessionnelleVousStagiaire.clone());
      
          
        
          
            
        result.setTypeAccueil(typeAccueil);
      
          
        
          
            
        if (typeLogement != null)
            result.setTypeLogement(typeLogement);
        else
            result.setTypeLogement(fr.cg95.cvq.business.request.social.MyrLogementType.getDefaultMyrLogementType());
      
          
        
          
            
        result.setTypeScolarisation(typeScolarisation);
      
          
        
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
        
        
        profiles = {"demandePrestationCompensation"},
        message = "allocationPersonnaliseeAutonomie"
      )
    
    private Boolean allocationPersonnaliseeAutonomie;

    public void setAllocationPersonnaliseeAutonomie(final Boolean allocationPersonnaliseeAutonomie) {
        this.allocationPersonnaliseeAutonomie = allocationPersonnaliseeAutonomie;
    }

 
    @Column(name="allocation_personnalisee_autonomie"  )
      
    public Boolean getAllocationPersonnaliseeAutonomie() {
        return this.allocationPersonnaliseeAutonomie;
    }
  
    
      @AssertValid(
        
        
        profiles = {"autoriteParentale"},
        message = "autoriteParentaleMere"
      )
    
    private fr.cg95.cvq.business.request.social.MyrAutoriteParentale autoriteParentaleMere;

    public void setAutoriteParentaleMere(final fr.cg95.cvq.business.request.social.MyrAutoriteParentale autoriteParentaleMere) {
        this.autoriteParentaleMere = autoriteParentaleMere;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="autorite_parentale_mere_id")
      
    public fr.cg95.cvq.business.request.social.MyrAutoriteParentale getAutoriteParentaleMere() {
        return this.autoriteParentaleMere;
    }
  
    
      @AssertValid(
        
        
        profiles = {"autoriteParentale"},
        message = "autoriteParentalePere"
      )
    
    private fr.cg95.cvq.business.request.social.MyrAutoriteParentale autoriteParentalePere;

    public void setAutoriteParentalePere(final fr.cg95.cvq.business.request.social.MyrAutoriteParentale autoriteParentalePere) {
        this.autoriteParentalePere = autoriteParentalePere;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="autorite_parentale_pere_id")
      
    public fr.cg95.cvq.business.request.social.MyrAutoriteParentale getAutoriteParentalePere() {
        return this.autoriteParentalePere;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandePrestationCompensation"},
        message = "besoinsDemandePCH"
      )
    
      @AssertValid(
        
        
        profiles = {"demandePrestationCompensation"},
        message = "besoinsDemandePCH"
      )
    
    private fr.cg95.cvq.business.request.social.MyrBesoinsDemandePch besoinsDemandePCH;

    public void setBesoinsDemandePCH(final fr.cg95.cvq.business.request.social.MyrBesoinsDemandePch besoinsDemandePCH) {
        this.besoinsDemandePCH = besoinsDemandePCH;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="besoins_demande_p_c_h_id")
      
    public fr.cg95.cvq.business.request.social.MyrBesoinsDemandePch getBesoinsDemandePCH() {
        return this.besoinsDemandePCH;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandeCartes"},
        message = "carteAccompagnement"
      )
    
    private Boolean carteAccompagnement;

    public void setCarteAccompagnement(final Boolean carteAccompagnement) {
        this.carteAccompagnement = carteAccompagnement;
    }

 
    @Column(name="carte_accompagnement"  )
      
    public Boolean getCarteAccompagnement() {
        return this.carteAccompagnement;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandeCartes"},
        message = "carteInvalidite"
      )
    
    private Boolean carteInvalidite;

    public void setCarteInvalidite(final Boolean carteInvalidite) {
        this.carteInvalidite = carteInvalidite;
    }

 
    @Column(name="carte_invalidite"  )
      
    public Boolean getCarteInvalidite() {
        return this.carteInvalidite;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandeCartes"},
        message = "carteStationnement"
      )
    
    private Boolean carteStationnement;

    public void setCarteStationnement(final Boolean carteStationnement) {
        this.carteStationnement = carteStationnement;
    }

 
    @Column(name="carte_stationnement"  )
      
    public Boolean getCarteStationnement() {
        return this.carteStationnement;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandePrestationCompensation"},
        message = "choixPrestationCompensation"
      )
    
    private fr.cg95.cvq.business.request.social.MyrChoixPrestationCompensationType choixPrestationCompensation;

    public void setChoixPrestationCompensation(final fr.cg95.cvq.business.request.social.MyrChoixPrestationCompensationType choixPrestationCompensation) {
        this.choixPrestationCompensation = choixPrestationCompensation;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="choix_prestation_compensation"  )
      
    public fr.cg95.cvq.business.request.social.MyrChoixPrestationCompensationType getChoixPrestationCompensation() {
        return this.choixPrestationCompensation;
    }
  
    
      @NotNull(
        
        
        profiles = {"projetDeVie"},
        message = "choixProjetDeVie"
      )
    
    private fr.cg95.cvq.business.request.social.MyrChoixProjetDeVieType choixProjetDeVie;

    public void setChoixProjetDeVie(final fr.cg95.cvq.business.request.social.MyrChoixProjetDeVieType choixProjetDeVie) {
        this.choixProjetDeVie = choixProjetDeVie;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="choix_projet_de_vie"  )
      
    public fr.cg95.cvq.business.request.social.MyrChoixProjetDeVieType getChoixProjetDeVie() {
        return this.choixProjetDeVie;
    }
  
    
    private String conseilleProjetDeVie;

    public void setConseilleProjetDeVie(final String conseilleProjetDeVie) {
        this.conseilleProjetDeVie = conseilleProjetDeVie;
    }

 
    @Column(name="conseille_projet_de_vie"  )
      
    public String getConseilleProjetDeVie() {
        return this.conseilleProjetDeVie;
    }
  
    
    private java.util.Date dateArriveeFrance;

    public void setDateArriveeFrance(final java.util.Date dateArriveeFrance) {
        this.dateArriveeFrance = dateArriveeFrance;
    }

 
    @Column(name="date_arrivee_france"  )
      
    public java.util.Date getDateArriveeFrance() {
        return this.dateArriveeFrance;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "dateNaissanceSujet"
      )
    
    private java.util.Date dateNaissanceSujet;

    public void setDateNaissanceSujet(final java.util.Date dateNaissanceSujet) {
        this.dateNaissanceSujet = dateNaissanceSujet;
    }

 
    @Column(name="date_naissance_sujet"  )
      
    public java.util.Date getDateNaissanceSujet() {
        return this.dateNaissanceSujet;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationFamiliale"},
        message = "dateSituationFamiliale"
      )
    
    private java.util.Date dateSituationFamiliale;

    public void setDateSituationFamiliale(final java.util.Date dateSituationFamiliale) {
        this.dateSituationFamiliale = dateSituationFamiliale;
    }

 
    @Column(name="date_situation_familiale"  )
      
    public java.util.Date getDateSituationFamiliale() {
        return this.dateSituationFamiliale;
    }
  
    
      @MaxLength(
        
          value = 2048,
        
        
        profiles = {"demandeParcoursScolaireEtFormation"},
        message = "demandeLibreScolaire"
      )
    
      @NotNull(
        
        
        profiles = {"demandeParcoursScolaireEtFormation"},
        message = "demandeLibreScolaire"
      )
    
      @MatchPattern(
        
          pattern = "^.{0,2048}$",
        
        
        profiles = {"demandeParcoursScolaireEtFormation"},
        message = "demandeLibreScolaire"
      )
    
      @NotBlank(
        
        
        profiles = {"demandeParcoursScolaireEtFormation"},
        message = "demandeLibreScolaire"
      )
    
    private String demandeLibreScolaire;

    public void setDemandeLibreScolaire(final String demandeLibreScolaire) {
        this.demandeLibreScolaire = demandeLibreScolaire;
    }

 
    @Column(name="demande_libre_scolaire" , length=2048 )
      
    public String getDemandeLibreScolaire() {
        return this.demandeLibreScolaire;
    }
  
    
      @NotNull(
        
        
        profiles = {"autoriteParentale"},
        message = "deteneurAutoriteParentale"
      )
    
    private fr.cg95.cvq.business.request.social.DeteneurAutoriteParentaleType deteneurAutoriteParentale;

    public void setDeteneurAutoriteParentale(final fr.cg95.cvq.business.request.social.DeteneurAutoriteParentaleType deteneurAutoriteParentale) {
        this.deteneurAutoriteParentale = deteneurAutoriteParentale;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="deteneur_autorite_parentale"  )
      
    public fr.cg95.cvq.business.request.social.DeteneurAutoriteParentaleType getDeteneurAutoriteParentale() {
        return this.deteneurAutoriteParentale;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationParticuliere'].test('estUnCas='+_this.situationParticuliere.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"autreSituation"},
        message = "domiciliationEtablissement"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationParticuliere'].test('estUnCas='+_this.situationParticuliere.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"autreSituation"},
        message = "domiciliationEtablissement"
      )
    
    private fr.cg95.cvq.business.users.Address domiciliationEtablissement;

    public void setDomiciliationEtablissement(final fr.cg95.cvq.business.users.Address domiciliationEtablissement) {
        this.domiciliationEtablissement = domiciliationEtablissement;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="domiciliation_etablissement_id")
      
    public fr.cg95.cvq.business.users.Address getDomiciliationEtablissement() {
        return this.domiciliationEtablissement;
    }
  
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['organismePayeur'].test(_this.organismePayeur.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"organismePrestationFamiliale"},
        message = "domiciliationOrganismePayeur"
      )
    
    private fr.cg95.cvq.business.users.Address domiciliationOrganismePayeur;

    public void setDomiciliationOrganismePayeur(final fr.cg95.cvq.business.users.Address domiciliationOrganismePayeur) {
        this.domiciliationOrganismePayeur = domiciliationOrganismePayeur;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="domiciliation_organisme_payeur_id")
      
    public fr.cg95.cvq.business.users.Address getDomiciliationOrganismePayeur() {
        return this.domiciliationOrganismePayeur;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['enfantEnInternat'].test(_this.enfantEnInternat.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "enInternatDepuisLe"
      )
    
    private java.util.Date enInternatDepuisLe;

    public void setEnInternatDepuisLe(final java.util.Date enInternatDepuisLe) {
        this.enInternatDepuisLe = enInternatDepuisLe;
    }

 
    @Column(name="en_internat_depuis_le"  )
      
    public java.util.Date getEnInternatDepuisLe() {
        return this.enInternatDepuisLe;
    }
  
    
      @NotNull(
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "enfantEnInternat"
      )
    
    private Boolean enfantEnInternat;

    public void setEnfantEnInternat(final Boolean enfantEnInternat) {
        this.enfantEnInternat = enfantEnInternat;
    }

 
    @Column(name="enfant_en_internat"  )
      
    public Boolean getEnfantEnInternat() {
        return this.enfantEnInternat;
    }
  
    
      @MaxLength(
        
          value = 5096,
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixProjetDeVie'].test(_this.choixProjetDeVie.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"projetDeVie"},
        message = "expressionProjetDeVie"
      )
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixProjetDeVie'].test(_this.choixProjetDeVie.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"projetDeVie"},
        message = "expressionProjetDeVie"
      )
    
      @MatchPattern(
        
          pattern = "^.{0,5096}$",
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixProjetDeVie'].test(_this.choixProjetDeVie.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"projetDeVie"},
        message = "expressionProjetDeVie"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['choixProjetDeVie'].test(_this.choixProjetDeVie.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"projetDeVie"},
        message = "expressionProjetDeVie"
      )
    
    private String expressionProjetDeVie;

    public void setExpressionProjetDeVie(final String expressionProjetDeVie) {
        this.expressionProjetDeVie = expressionProjetDeVie;
    }

 
    @Column(name="expression_projet_de_vie" , length=5096 )
      
    public String getExpressionProjetDeVie() {
        return this.expressionProjetDeVie;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"subject"},
        message = "faxSujet"
      )
    
    private String faxSujet;

    public void setFaxSujet(final String faxSujet) {
        this.faxSujet = faxSujet;
    }

 
    @Column(name="fax_sujet" , length=10 )
      
    public String getFaxSujet() {
        return this.faxSujet;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['enfantEnInternat'].test(_this.enfantEnInternat.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "fraisSejourPrisEnCharge"
      )
    
    private Boolean fraisSejourPrisEnCharge;

    public void setFraisSejourPrisEnCharge(final Boolean fraisSejourPrisEnCharge) {
        this.fraisSejourPrisEnCharge = fraisSejourPrisEnCharge;
    }

 
    @Column(name="frais_sejour_pris_en_charge"  )
      
    public Boolean getFraisSejourPrisEnCharge() {
        return this.fraisSejourPrisEnCharge;
    }
  
    
      @AssertValid(
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "fraisSuppLiesHandicap"
      )
    
    private List<fr.cg95.cvq.business.request.social.MyrFraisSuppLiesHandicap> fraisSuppLiesHandicap;

    public void setFraisSuppLiesHandicap(final List<fr.cg95.cvq.business.request.social.MyrFraisSuppLiesHandicap> fraisSuppLiesHandicap) {
        this.fraisSuppLiesHandicap = fraisSuppLiesHandicap;
    }

 
    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @OrderColumn(name="frais_supp_lies_handicap_index")
    @JoinColumn(name="mdph_youth_request_id")
      
    public List<fr.cg95.cvq.business.request.social.MyrFraisSuppLiesHandicap> getFraisSuppLiesHandicap() {
        return this.fraisSuppLiesHandicap;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationMaritale'].test(_this.situationMaritale.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationFamiliale"},
        message = "identiteConjoint"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationMaritale'].test(_this.situationMaritale.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationFamiliale"},
        message = "identiteConjoint"
      )
    
    private fr.cg95.cvq.business.request.social.MyrConjointIdentite identiteConjoint;

    public void setIdentiteConjoint(final fr.cg95.cvq.business.request.social.MyrConjointIdentite identiteConjoint) {
        this.identiteConjoint = identiteConjoint;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="identite_conjoint_id")
      
    public fr.cg95.cvq.business.request.social.MyrConjointIdentite getIdentiteConjoint() {
        return this.identiteConjoint;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['deteneurAutoriteParentale'].test(_this.deteneurAutoriteParentale.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"autoriteParentale"},
        message = "informationAutreDeteneurAutoriteParentale"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['deteneurAutoriteParentale'].test(_this.deteneurAutoriteParentale.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"autoriteParentale"},
        message = "informationAutreDeteneurAutoriteParentale"
      )
    
    private fr.cg95.cvq.business.request.social.MyrAutoriteParentaleAutre informationAutreDeteneurAutoriteParentale;

    public void setInformationAutreDeteneurAutoriteParentale(final fr.cg95.cvq.business.request.social.MyrAutoriteParentaleAutre informationAutreDeteneurAutoriteParentale) {
        this.informationAutreDeteneurAutoriteParentale = informationAutreDeteneurAutoriteParentale;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="information_autre_deteneur_autorite_parentale_id")
      
    public fr.cg95.cvq.business.request.social.MyrAutoriteParentaleAutre getInformationAutreDeteneurAutoriteParentale() {
        return this.informationAutreDeteneurAutoriteParentale;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "lieuNaissanceSujet"
      )
    
      @AssertValid(
        
        
        profiles = {"subject"},
        message = "lieuNaissanceSujet"
      )
    
    private fr.cg95.cvq.business.request.social.MyrBirthPlace lieuNaissanceSujet;

    public void setLieuNaissanceSujet(final fr.cg95.cvq.business.request.social.MyrBirthPlace lieuNaissanceSujet) {
        this.lieuNaissanceSujet = lieuNaissanceSujet;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="lieu_naissance_sujet_id")
      
    public fr.cg95.cvq.business.request.social.MyrBirthPlace getLieuNaissanceSujet() {
        return this.lieuNaissanceSujet;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "nationalite"
      )
    
    private fr.cg95.cvq.business.request.social.MyrNationaliteAvecSuisseType nationalite;

    public void setNationalite(final fr.cg95.cvq.business.request.social.MyrNationaliteAvecSuisseType nationalite) {
        this.nationalite = nationalite;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="nationalite"  )
      
    public fr.cg95.cvq.business.request.social.MyrNationaliteAvecSuisseType getNationalite() {
        return this.nationalite;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"organismePrestationFamiliale"},
        message = "nomAllocataire"
      )
    
      @NotNull(
        
        
        profiles = {"organismePrestationFamiliale"},
        message = "nomAllocataire"
      )
    
      @NotBlank(
        
        
        profiles = {"organismePrestationFamiliale"},
        message = "nomAllocataire"
      )
    
    private String nomAllocataire;

    public void setNomAllocataire(final String nomAllocataire) {
        this.nomAllocataire = nomAllocataire;
    }

 
    @Column(name="nom_allocataire" , length=38 )
      
    public String getNomAllocataire() {
        return this.nomAllocataire;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationParticuliere'].test('estUnCas='+_this.situationParticuliere.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"autreSituation"},
        message = "nomEtablissement"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationParticuliere'].test('estUnCas='+_this.situationParticuliere.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"autreSituation"},
        message = "nomEtablissement"
      )
    
    private String nomEtablissement;

    public void setNomEtablissement(final String nomEtablissement) {
        this.nomEtablissement = nomEtablissement;
    }

 
    @Column(name="nom_etablissement"  )
      
    public String getNomEtablissement() {
        return this.nomEtablissement;
    }
  
    
    private String nomOrganismePayeur;

    public void setNomOrganismePayeur(final String nomOrganismePayeur) {
        this.nomOrganismePayeur = nomOrganismePayeur;
    }

 
    @Column(name="nom_organisme_payeur"  )
      
    public String getNomOrganismePayeur() {
        return this.nomOrganismePayeur;
    }
  
    
      @MaxLength(
        
          value = 50,
        
        
        profiles = {"subject"},
        message = "nomOrganismeSecuriteSociale"
      )
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "nomOrganismeSecuriteSociale"
      )
    
      @MatchPattern(
        
          pattern = "^.{0,50}$",
        
        
        profiles = {"subject"},
        message = "nomOrganismeSecuriteSociale"
      )
    
      @NotBlank(
        
        
        profiles = {"subject"},
        message = "nomOrganismeSecuriteSociale"
      )
    
    private String nomOrganismeSecuriteSociale;

    public void setNomOrganismeSecuriteSociale(final String nomOrganismeSecuriteSociale) {
        this.nomOrganismeSecuriteSociale = nomOrganismeSecuriteSociale;
    }

 
    @Column(name="nom_organisme_securite_sociale" , length=50 )
      
    public String getNomOrganismeSecuriteSociale() {
        return this.nomOrganismeSecuriteSociale;
    }
  
    
      @MaxLength(
        
          value = 2,
        
        
        profiles = {"situationFamiliale"},
        message = "nombreEnfantsACharge"
      )
    
      @NotNull(
        
        
        profiles = {"situationFamiliale"},
        message = "nombreEnfantsACharge"
      )
    
      @MatchPattern(
        
          pattern = "[0-9]{1,2}$",
        
        
        profiles = {"situationFamiliale"},
        message = "nombreEnfantsACharge"
      )
    
      @NotBlank(
        
        
        profiles = {"situationFamiliale"},
        message = "nombreEnfantsACharge"
      )
    
    private String nombreEnfantsACharge;

    public void setNombreEnfantsACharge(final String nombreEnfantsACharge) {
        this.nombreEnfantsACharge = nombreEnfantsACharge;
    }

 
    @Column(name="nombre_enfants_a_charge" , length=2 )
      
    public String getNombreEnfantsACharge() {
        return this.nombreEnfantsACharge;
    }
  
    
      @NotNull(
        
        
        profiles = {"organismePrestationFamiliale"},
        message = "numeroAllocataire"
      )
    
      @MatchPattern(
        
          pattern = "^.{0,50}$",
        
        
        profiles = {"organismePrestationFamiliale"},
        message = "numeroAllocataire"
      )
    
      @NotBlank(
        
        
        profiles = {"organismePrestationFamiliale"},
        message = "numeroAllocataire"
      )
    
    private String numeroAllocataire;

    public void setNumeroAllocataire(final String numeroAllocataire) {
        this.numeroAllocataire = numeroAllocataire;
    }

 
    @Column(name="numero_allocataire" , length=50 )
      
    public String getNumeroAllocataire() {
        return this.numeroAllocataire;
    }
  
    
      @MaxLength(
        
          value = 13,
        
        
        profiles = {"subject"},
        message = "numeroSecuriteSocialeSujet"
      )
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "numeroSecuriteSocialeSujet"
      )
    
      @MatchPattern(
        
          pattern = "[0-9]{13}",
        
        
        profiles = {"subject"},
        message = "numeroSecuriteSocialeSujet"
      )
    
      @NotBlank(
        
        
        profiles = {"subject"},
        message = "numeroSecuriteSocialeSujet"
      )
    
    private String numeroSecuriteSocialeSujet;

    public void setNumeroSecuriteSocialeSujet(final String numeroSecuriteSocialeSujet) {
        this.numeroSecuriteSocialeSujet = numeroSecuriteSocialeSujet;
    }

 
    @Column(name="numero_securite_sociale_sujet" , length=13 )
      
    public String getNumeroSecuriteSocialeSujet() {
        return this.numeroSecuriteSocialeSujet;
    }
  
    
      @NotNull(
        
        
        profiles = {"organismePrestationFamiliale"},
        message = "organismePayeur"
      )
    
    private fr.cg95.cvq.business.request.social.MyrOrganismePayeurType organismePayeur;

    public void setOrganismePayeur(final fr.cg95.cvq.business.request.social.MyrOrganismePayeurType organismePayeur) {
        this.organismePayeur = organismePayeur;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="organisme_payeur"  )
      
    public fr.cg95.cvq.business.request.social.MyrOrganismePayeurType getOrganismePayeur() {
        return this.organismePayeur;
    }
  
    
      @AssertValid(
        
        
        profiles = {"subject"},
        message = "precedentDossierMdph"
      )
    
    private fr.cg95.cvq.business.request.social.MyrPrecedentDossierMdph precedentDossierMdph;

    public void setPrecedentDossierMdph(final fr.cg95.cvq.business.request.social.MyrPrecedentDossierMdph precedentDossierMdph) {
        this.precedentDossierMdph = precedentDossierMdph;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="precedent_dossier_mdph_id")
      
    public fr.cg95.cvq.business.request.social.MyrPrecedentDossierMdph getPrecedentDossierMdph() {
        return this.precedentDossierMdph;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationParticuliere'].test('estAutreCas='+_this.situationParticuliere.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"autreSituation"},
        message = "precisionAutre"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationParticuliere'].test('estAutreCas='+_this.situationParticuliere.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"autreSituation"},
        message = "precisionAutre"
      )
    
    private String precisionAutre;

    public void setPrecisionAutre(final String precisionAutre) {
        this.precisionAutre = precisionAutre;
    }

 
    @Column(name="precision_autre"  )
      
    public String getPrecisionAutre() {
        return this.precisionAutre;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['typeLogement'].test(_this.typeLogement.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"autreSituation"},
        message = "precisionLogementAutre"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['typeLogement'].test(_this.typeLogement.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"autreSituation"},
        message = "precisionLogementAutre"
      )
    
    private String precisionLogementAutre;

    public void setPrecisionLogementAutre(final String precisionLogementAutre) {
        this.precisionLogementAutre = precisionLogementAutre;
    }

 
    @Column(name="precision_logement_autre"  )
      
    public String getPrecisionLogementAutre() {
        return this.precisionLogementAutre;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['preferencesEtablissementOuService'].test(_this.preferencesEtablissementOuService.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"demandeParcoursScolaireEtFormation"},
        message = "precisionPreferencesEtablissementOuService"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['preferencesEtablissementOuService'].test(_this.preferencesEtablissementOuService.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"demandeParcoursScolaireEtFormation"},
        message = "precisionPreferencesEtablissementOuService"
      )
    
    private fr.cg95.cvq.business.request.social.MyrPreferenceEtablissementOuServiceScolaire precisionPreferencesEtablissementOuService;

    public void setPrecisionPreferencesEtablissementOuService(final fr.cg95.cvq.business.request.social.MyrPreferenceEtablissementOuServiceScolaire precisionPreferencesEtablissementOuService) {
        this.precisionPreferencesEtablissementOuService = precisionPreferencesEtablissementOuService;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="precision_preferences_etablissement_ou_service_id")
      
    public fr.cg95.cvq.business.request.social.MyrPreferenceEtablissementOuServiceScolaire getPrecisionPreferencesEtablissementOuService() {
        return this.precisionPreferencesEtablissementOuService;
    }
  
    
    private String precisionSiDomicileAupresOrganisme;

    public void setPrecisionSiDomicileAupresOrganisme(final String precisionSiDomicileAupresOrganisme) {
        this.precisionSiDomicileAupresOrganisme = precisionSiDomicileAupresOrganisme;
    }

 
    @Column(name="precision_si_domicile_aupres_organisme"  )
      
    public String getPrecisionSiDomicileAupresOrganisme() {
        return this.precisionSiDomicileAupresOrganisme;
    }
  
    
    private Boolean preferencesEtablissementOuService;

    public void setPreferencesEtablissementOuService(final Boolean preferencesEtablissementOuService) {
        this.preferencesEtablissementOuService = preferencesEtablissementOuService;
    }

 
    @Column(name="preferences_etablissement_ou_service"  )
      
    public Boolean getPreferencesEtablissementOuService() {
        return this.preferencesEtablissementOuService;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"organismePrestationFamiliale"},
        message = "prenomAllocataire"
      )
    
      @NotNull(
        
        
        profiles = {"organismePrestationFamiliale"},
        message = "prenomAllocataire"
      )
    
      @NotBlank(
        
        
        profiles = {"organismePrestationFamiliale"},
        message = "prenomAllocataire"
      )
    
    private String prenomAllocataire;

    public void setPrenomAllocataire(final String prenomAllocataire) {
        this.prenomAllocataire = prenomAllocataire;
    }

 
    @Column(name="prenom_allocataire" , length=38 )
      
    public String getPrenomAllocataire() {
        return this.prenomAllocataire;
    }
  
    
      @AssertValid(
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "presencePersonneAupresEnfant"
      )
    
    private fr.cg95.cvq.business.request.social.MyrPresencePersonneAupresEnfant presencePersonneAupresEnfant;

    public void setPresencePersonneAupresEnfant(final fr.cg95.cvq.business.request.social.MyrPresencePersonneAupresEnfant presencePersonneAupresEnfant) {
        this.presencePersonneAupresEnfant = presencePersonneAupresEnfant;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="presence_personne_aupres_enfant_id")
      
    public fr.cg95.cvq.business.request.social.MyrPresencePersonneAupresEnfant getPresencePersonneAupresEnfant() {
        return this.presencePersonneAupresEnfant;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationFamiliale"},
        message = "situationMaritale"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationFamilialeType situationMaritale;

    public void setSituationMaritale(final fr.cg95.cvq.business.request.social.MyrSituationFamilialeType situationMaritale) {
        this.situationMaritale = situationMaritale;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="situation_maritale"  )
      
    public fr.cg95.cvq.business.request.social.MyrSituationFamilialeType getSituationMaritale() {
        return this.situationMaritale;
    }
  
    
    private fr.cg95.cvq.business.request.social.MyrSituationAutreType situationParticuliere;

    public void setSituationParticuliere(final fr.cg95.cvq.business.request.social.MyrSituationAutreType situationParticuliere) {
        this.situationParticuliere = situationParticuliere;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="situation_particuliere"  )
      
    public fr.cg95.cvq.business.request.social.MyrSituationAutreType getSituationParticuliere() {
        return this.situationParticuliere;
    }
  
    
    private fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType situationProfessionnelleConjoint;

    public void setSituationProfessionnelleConjoint(final fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType situationProfessionnelleConjoint) {
        this.situationProfessionnelleConjoint = situationProfessionnelleConjoint;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="situation_professionnelle_conjoint"  )
      
    public fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType getSituationProfessionnelleConjoint() {
        return this.situationProfessionnelleConjoint;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test('estAutreConjoint='+_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointAutre"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test('estAutreConjoint='+_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointAutre"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleAutre situationProfessionnelleConjointAutre;

    public void setSituationProfessionnelleConjointAutre(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleAutre situationProfessionnelleConjointAutre) {
        this.situationProfessionnelleConjointAutre = situationProfessionnelleConjointAutre;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_conjoint_autre_id")
      
    public fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleAutre getSituationProfessionnelleConjointAutre() {
        return this.situationProfessionnelleConjointAutre;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test('estBeneficiairePensionConjoint='+_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointBeneficiairePension"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test('estBeneficiairePensionConjoint='+_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointBeneficiairePension"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleBeneficiairePension situationProfessionnelleConjointBeneficiairePension;

    public void setSituationProfessionnelleConjointBeneficiairePension(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleBeneficiairePension situationProfessionnelleConjointBeneficiairePension) {
        this.situationProfessionnelleConjointBeneficiairePension = situationProfessionnelleConjointBeneficiairePension;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_conjoint_beneficiaire_pension_id")
      
    public fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleBeneficiairePension getSituationProfessionnelleConjointBeneficiairePension() {
        return this.situationProfessionnelleConjointBeneficiairePension;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test('estDemandeurEmploiConjoint='+_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointDemandeurEmploi"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test('estDemandeurEmploiConjoint='+_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointDemandeurEmploi"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleDemandeurEmploi situationProfessionnelleConjointDemandeurEmploi;

    public void setSituationProfessionnelleConjointDemandeurEmploi(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleDemandeurEmploi situationProfessionnelleConjointDemandeurEmploi) {
        this.situationProfessionnelleConjointDemandeurEmploi = situationProfessionnelleConjointDemandeurEmploi;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_conjoint_demandeur_emploi_id")
      
    public fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleDemandeurEmploi getSituationProfessionnelleConjointDemandeurEmploi() {
        return this.situationProfessionnelleConjointDemandeurEmploi;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test('estNonSalarieConjoint='+_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointNonSalarie"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test('estNonSalarieConjoint='+_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointNonSalarie"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleNonSalarie situationProfessionnelleConjointNonSalarie;

    public void setSituationProfessionnelleConjointNonSalarie(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleNonSalarie situationProfessionnelleConjointNonSalarie) {
        this.situationProfessionnelleConjointNonSalarie = situationProfessionnelleConjointNonSalarie;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_conjoint_non_salarie_id")
      
    public fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleNonSalarie getSituationProfessionnelleConjointNonSalarie() {
        return this.situationProfessionnelleConjointNonSalarie;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test('estRetraiteConjoint='+_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointRetraite"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test('estRetraiteConjoint='+_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointRetraite"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleRetraite situationProfessionnelleConjointRetraite;

    public void setSituationProfessionnelleConjointRetraite(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleRetraite situationProfessionnelleConjointRetraite) {
        this.situationProfessionnelleConjointRetraite = situationProfessionnelleConjointRetraite;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_conjoint_retraite_id")
      
    public fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleRetraite getSituationProfessionnelleConjointRetraite() {
        return this.situationProfessionnelleConjointRetraite;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test('estSalarieConjoint='+_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointSalarie"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test('estSalarieConjoint='+_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointSalarie"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleSalarie situationProfessionnelleConjointSalarie;

    public void setSituationProfessionnelleConjointSalarie(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleSalarie situationProfessionnelleConjointSalarie) {
        this.situationProfessionnelleConjointSalarie = situationProfessionnelleConjointSalarie;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_conjoint_salarie_id")
      
    public fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleSalarie getSituationProfessionnelleConjointSalarie() {
        return this.situationProfessionnelleConjointSalarie;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test('estStagiaireConjoint='+_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointStagiaire"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test('estStagiaireConjoint='+_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointStagiaire"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleStagiaire situationProfessionnelleConjointStagiaire;

    public void setSituationProfessionnelleConjointStagiaire(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleStagiaire situationProfessionnelleConjointStagiaire) {
        this.situationProfessionnelleConjointStagiaire = situationProfessionnelleConjointStagiaire;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_conjoint_stagiaire_id")
      
    public fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleStagiaire getSituationProfessionnelleConjointStagiaire() {
        return this.situationProfessionnelleConjointStagiaire;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVous"
      )
    
    private fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType situationProfessionnelleVous;

    public void setSituationProfessionnelleVous(final fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType situationProfessionnelleVous) {
        this.situationProfessionnelleVous = situationProfessionnelleVous;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="situation_professionnelle_vous"  )
      
    public fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType getSituationProfessionnelleVous() {
        return this.situationProfessionnelleVous;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test('estAutreVous='+_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousAutre"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test('estAutreVous='+_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousAutre"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleAutre situationProfessionnelleVousAutre;

    public void setSituationProfessionnelleVousAutre(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleAutre situationProfessionnelleVousAutre) {
        this.situationProfessionnelleVousAutre = situationProfessionnelleVousAutre;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_vous_autre_id")
      
    public fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleAutre getSituationProfessionnelleVousAutre() {
        return this.situationProfessionnelleVousAutre;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test('estBeneficiairePensionVous='+_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousBeneficiairePension"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test('estBeneficiairePensionVous='+_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousBeneficiairePension"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleBeneficiairePension situationProfessionnelleVousBeneficiairePension;

    public void setSituationProfessionnelleVousBeneficiairePension(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleBeneficiairePension situationProfessionnelleVousBeneficiairePension) {
        this.situationProfessionnelleVousBeneficiairePension = situationProfessionnelleVousBeneficiairePension;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_vous_beneficiaire_pension_id")
      
    public fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleBeneficiairePension getSituationProfessionnelleVousBeneficiairePension() {
        return this.situationProfessionnelleVousBeneficiairePension;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test('estDemandeurEmploiVous='+_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousDemandeurEmploi"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test('estDemandeurEmploiVous='+_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousDemandeurEmploi"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleDemandeurEmploi situationProfessionnelleVousDemandeurEmploi;

    public void setSituationProfessionnelleVousDemandeurEmploi(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleDemandeurEmploi situationProfessionnelleVousDemandeurEmploi) {
        this.situationProfessionnelleVousDemandeurEmploi = situationProfessionnelleVousDemandeurEmploi;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_vous_demandeur_emploi_id")
      
    public fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleDemandeurEmploi getSituationProfessionnelleVousDemandeurEmploi() {
        return this.situationProfessionnelleVousDemandeurEmploi;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test('estNonSalarieVous='+_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousNonSalarie"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test('estNonSalarieVous='+_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousNonSalarie"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleNonSalarie situationProfessionnelleVousNonSalarie;

    public void setSituationProfessionnelleVousNonSalarie(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleNonSalarie situationProfessionnelleVousNonSalarie) {
        this.situationProfessionnelleVousNonSalarie = situationProfessionnelleVousNonSalarie;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_vous_non_salarie_id")
      
    public fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleNonSalarie getSituationProfessionnelleVousNonSalarie() {
        return this.situationProfessionnelleVousNonSalarie;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test('estRetraiteVous='+_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousRetraite"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test('estRetraiteVous='+_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousRetraite"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleRetraite situationProfessionnelleVousRetraite;

    public void setSituationProfessionnelleVousRetraite(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleRetraite situationProfessionnelleVousRetraite) {
        this.situationProfessionnelleVousRetraite = situationProfessionnelleVousRetraite;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_vous_retraite_id")
      
    public fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleRetraite getSituationProfessionnelleVousRetraite() {
        return this.situationProfessionnelleVousRetraite;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test('estSalarieVous='+_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousSalarie"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test('estSalarieVous='+_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousSalarie"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleSalarie situationProfessionnelleVousSalarie;

    public void setSituationProfessionnelleVousSalarie(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleSalarie situationProfessionnelleVousSalarie) {
        this.situationProfessionnelleVousSalarie = situationProfessionnelleVousSalarie;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_vous_salarie_id")
      
    public fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleSalarie getSituationProfessionnelleVousSalarie() {
        return this.situationProfessionnelleVousSalarie;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test('estStagiaireVous='+_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousStagiaire"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test('estStagiaireVous='+_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousStagiaire"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleStagiaire situationProfessionnelleVousStagiaire;

    public void setSituationProfessionnelleVousStagiaire(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleStagiaire situationProfessionnelleVousStagiaire) {
        this.situationProfessionnelleVousStagiaire = situationProfessionnelleVousStagiaire;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_vous_stagiaire_id")
      
    public fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleStagiaire getSituationProfessionnelleVousStagiaire() {
        return this.situationProfessionnelleVousStagiaire;
    }
  
    
      @MaxLength(
        
          value = 1024,
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "typeAccueil"
      )
    
      @NotNull(
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "typeAccueil"
      )
    
      @MatchPattern(
        
          pattern = "^.{0,1024}$",
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "typeAccueil"
      )
    
      @NotBlank(
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "typeAccueil"
      )
    
    private String typeAccueil;

    public void setTypeAccueil(final String typeAccueil) {
        this.typeAccueil = typeAccueil;
    }

 
    @Column(name="type_accueil" , length=1024 )
      
    public String getTypeAccueil() {
        return this.typeAccueil;
    }
  
    
      @NotNull(
        
        
        profiles = {"autreSituation"},
        message = "typeLogement"
      )
    
    private fr.cg95.cvq.business.request.social.MyrLogementType typeLogement;

    public void setTypeLogement(final fr.cg95.cvq.business.request.social.MyrLogementType typeLogement) {
        this.typeLogement = typeLogement;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="type_logement"  )
      
    public fr.cg95.cvq.business.request.social.MyrLogementType getTypeLogement() {
        return this.typeLogement;
    }
  
    
      @MaxLength(
        
          value = 1024,
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "typeScolarisation"
      )
    
      @NotNull(
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "typeScolarisation"
      )
    
      @MatchPattern(
        
          pattern = "^.{0,1024}$",
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "typeScolarisation"
      )
    
      @NotBlank(
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "typeScolarisation"
      )
    
    private String typeScolarisation;

    public void setTypeScolarisation(final String typeScolarisation) {
        this.typeScolarisation = typeScolarisation;
    }

 
    @Column(name="type_scolarisation" , length=1024 )
      
    public String getTypeScolarisation() {
        return this.typeScolarisation;
    }
  
}
