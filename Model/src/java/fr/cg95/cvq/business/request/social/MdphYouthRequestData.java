
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

/**
 * Generated class file, do not edit !
 *
 * @hibernate.class
 *  table="mdph_youth_request"
 *  lazy="false"
 */
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

    /**
     * @hibernate.id
     *  column="id"
     *  generator-class="sequence"
     */
    public final Long getId() {
        return this.id;
    }

  
    
      @NotNull(
        
        
        profiles = {"demandePrestationCompensation"},
        message = "allocationPersonnaliseeAutonomie"
      )
    
    private Boolean allocationPersonnaliseeAutonomie;

    public final void setAllocationPersonnaliseeAutonomie(final Boolean allocationPersonnaliseeAutonomie) {
        this.allocationPersonnaliseeAutonomie = allocationPersonnaliseeAutonomie;
    }

    /**
 
        * @hibernate.property
        *  column="allocation_personnalisee_autonomie"
        
      
    */
    public final Boolean getAllocationPersonnaliseeAutonomie() {
        return this.allocationPersonnaliseeAutonomie;
    }
  
    
      @AssertValid(
        
        
        profiles = {"autoriteParentale"},
        message = "autoriteParentaleMere"
      )
    
    private fr.cg95.cvq.business.request.social.MyrAutoriteParentale autoriteParentaleMere;

    public final void setAutoriteParentaleMere(final fr.cg95.cvq.business.request.social.MyrAutoriteParentale autoriteParentaleMere) {
        this.autoriteParentaleMere = autoriteParentaleMere;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="autorite_parentale_mere_id"
        *  class="fr.cg95.cvq.business.request.social.MyrAutoriteParentale"
      
    */
    public final fr.cg95.cvq.business.request.social.MyrAutoriteParentale getAutoriteParentaleMere() {
        return this.autoriteParentaleMere;
    }
  
    
      @AssertValid(
        
        
        profiles = {"autoriteParentale"},
        message = "autoriteParentalePere"
      )
    
    private fr.cg95.cvq.business.request.social.MyrAutoriteParentale autoriteParentalePere;

    public final void setAutoriteParentalePere(final fr.cg95.cvq.business.request.social.MyrAutoriteParentale autoriteParentalePere) {
        this.autoriteParentalePere = autoriteParentalePere;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="autorite_parentale_pere_id"
        *  class="fr.cg95.cvq.business.request.social.MyrAutoriteParentale"
      
    */
    public final fr.cg95.cvq.business.request.social.MyrAutoriteParentale getAutoriteParentalePere() {
        return this.autoriteParentalePere;
    }
  
    
      @AssertValid(
        
        
        profiles = {"demandePrestationCompensation"},
        message = "besoinsDemandePCH"
      )
    
    private fr.cg95.cvq.business.request.social.MyrBesoinsDemandePch besoinsDemandePCH;

    public final void setBesoinsDemandePCH(final fr.cg95.cvq.business.request.social.MyrBesoinsDemandePch besoinsDemandePCH) {
        this.besoinsDemandePCH = besoinsDemandePCH;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="besoins_demande_p_c_h_id"
        *  class="fr.cg95.cvq.business.request.social.MyrBesoinsDemandePch"
      
    */
    public final fr.cg95.cvq.business.request.social.MyrBesoinsDemandePch getBesoinsDemandePCH() {
        return this.besoinsDemandePCH;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandeCartes"},
        message = "carteAccompagnement"
      )
    
    private Boolean carteAccompagnement;

    public final void setCarteAccompagnement(final Boolean carteAccompagnement) {
        this.carteAccompagnement = carteAccompagnement;
    }

    /**
 
        * @hibernate.property
        *  column="carte_accompagnement"
        
      
    */
    public final Boolean getCarteAccompagnement() {
        return this.carteAccompagnement;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandeCartes"},
        message = "carteInvalidite"
      )
    
    private Boolean carteInvalidite;

    public final void setCarteInvalidite(final Boolean carteInvalidite) {
        this.carteInvalidite = carteInvalidite;
    }

    /**
 
        * @hibernate.property
        *  column="carte_invalidite"
        
      
    */
    public final Boolean getCarteInvalidite() {
        return this.carteInvalidite;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandeCartes"},
        message = "carteStationnement"
      )
    
    private Boolean carteStationnement;

    public final void setCarteStationnement(final Boolean carteStationnement) {
        this.carteStationnement = carteStationnement;
    }

    /**
 
        * @hibernate.property
        *  column="carte_stationnement"
        
      
    */
    public final Boolean getCarteStationnement() {
        return this.carteStationnement;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandePrestationCompensation"},
        message = "choixPrestationCompensation"
      )
    
    private fr.cg95.cvq.business.request.social.MyrChoixPrestationCompensationType choixPrestationCompensation;

    public final void setChoixPrestationCompensation(final fr.cg95.cvq.business.request.social.MyrChoixPrestationCompensationType choixPrestationCompensation) {
        this.choixPrestationCompensation = choixPrestationCompensation;
    }

    /**
 
        * @hibernate.property
        *  column="choix_prestation_compensation"
        
      
    */
    public final fr.cg95.cvq.business.request.social.MyrChoixPrestationCompensationType getChoixPrestationCompensation() {
        return this.choixPrestationCompensation;
    }
  
    
      @NotNull(
        
        
        profiles = {"projetDeVie"},
        message = "choixProjetDeVie"
      )
    
    private fr.cg95.cvq.business.request.social.MyrChoixProjetDeVieType choixProjetDeVie;

    public final void setChoixProjetDeVie(final fr.cg95.cvq.business.request.social.MyrChoixProjetDeVieType choixProjetDeVie) {
        this.choixProjetDeVie = choixProjetDeVie;
    }

    /**
 
        * @hibernate.property
        *  column="choix_projet_de_vie"
        
      
    */
    public final fr.cg95.cvq.business.request.social.MyrChoixProjetDeVieType getChoixProjetDeVie() {
        return this.choixProjetDeVie;
    }
  
    
    private String conseilleProjetDeVie;

    public final void setConseilleProjetDeVie(final String conseilleProjetDeVie) {
        this.conseilleProjetDeVie = conseilleProjetDeVie;
    }

    /**
 
        * @hibernate.property
        *  column="conseille_projet_de_vie"
        
      
    */
    public final String getConseilleProjetDeVie() {
        return this.conseilleProjetDeVie;
    }
  
    
    private java.util.Date dateArriveeFrance;

    public final void setDateArriveeFrance(final java.util.Date dateArriveeFrance) {
        this.dateArriveeFrance = dateArriveeFrance;
    }

    /**
 
        * @hibernate.property
        *  column="date_arrivee_france"
        
      
    */
    public final java.util.Date getDateArriveeFrance() {
        return this.dateArriveeFrance;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "dateNaissanceSujet"
      )
    
    private java.util.Date dateNaissanceSujet;

    public final void setDateNaissanceSujet(final java.util.Date dateNaissanceSujet) {
        this.dateNaissanceSujet = dateNaissanceSujet;
    }

    /**
 
        * @hibernate.property
        *  column="date_naissance_sujet"
        
      
    */
    public final java.util.Date getDateNaissanceSujet() {
        return this.dateNaissanceSujet;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationFamiliale"},
        message = "dateSituationFamiliale"
      )
    
    private java.util.Date dateSituationFamiliale;

    public final void setDateSituationFamiliale(final java.util.Date dateSituationFamiliale) {
        this.dateSituationFamiliale = dateSituationFamiliale;
    }

    /**
 
        * @hibernate.property
        *  column="date_situation_familiale"
        
      
    */
    public final java.util.Date getDateSituationFamiliale() {
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

    public final void setDemandeLibreScolaire(final String demandeLibreScolaire) {
        this.demandeLibreScolaire = demandeLibreScolaire;
    }

    /**
 
        * @hibernate.property
        *  column="demande_libre_scolaire"
        *  length="2048"
      
    */
    public final String getDemandeLibreScolaire() {
        return this.demandeLibreScolaire;
    }
  
    
      @NotNull(
        
        
        profiles = {"autoriteParentale"},
        message = "deteneurAutoriteParentale"
      )
    
    private fr.cg95.cvq.business.request.social.DeteneurAutoriteParentaleType deteneurAutoriteParentale;

    public final void setDeteneurAutoriteParentale(final fr.cg95.cvq.business.request.social.DeteneurAutoriteParentaleType deteneurAutoriteParentale) {
        this.deteneurAutoriteParentale = deteneurAutoriteParentale;
    }

    /**
 
        * @hibernate.property
        *  column="deteneur_autorite_parentale"
        
      
    */
    public final fr.cg95.cvq.business.request.social.DeteneurAutoriteParentaleType getDeteneurAutoriteParentale() {
        return this.deteneurAutoriteParentale;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationParticuliere'].test(_this.situationParticuliere.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"autreSituation"},
        message = "domiciliationEtablissement"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationParticuliere'].test(_this.situationParticuliere.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"autreSituation"},
        message = "domiciliationEtablissement"
      )
    
    private fr.cg95.cvq.business.users.Address domiciliationEtablissement;

    public final void setDomiciliationEtablissement(final fr.cg95.cvq.business.users.Address domiciliationEtablissement) {
        this.domiciliationEtablissement = domiciliationEtablissement;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="domiciliation_etablissement_id"
        *  class="fr.cg95.cvq.business.users.Address"
      
    */
    public final fr.cg95.cvq.business.users.Address getDomiciliationEtablissement() {
        return this.domiciliationEtablissement;
    }
  
    
      @AssertValid(
        
        
        profiles = {"organismePrestationFamiliale"},
        message = "domiciliationOrganismePayeur"
      )
    
    private fr.cg95.cvq.business.users.Address domiciliationOrganismePayeur;

    public final void setDomiciliationOrganismePayeur(final fr.cg95.cvq.business.users.Address domiciliationOrganismePayeur) {
        this.domiciliationOrganismePayeur = domiciliationOrganismePayeur;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="domiciliation_organisme_payeur_id"
        *  class="fr.cg95.cvq.business.users.Address"
      
    */
    public final fr.cg95.cvq.business.users.Address getDomiciliationOrganismePayeur() {
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

    public final void setEnInternatDepuisLe(final java.util.Date enInternatDepuisLe) {
        this.enInternatDepuisLe = enInternatDepuisLe;
    }

    /**
 
        * @hibernate.property
        *  column="en_internat_depuis_le"
        
      
    */
    public final java.util.Date getEnInternatDepuisLe() {
        return this.enInternatDepuisLe;
    }
  
    
      @NotNull(
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "enfantEnInternat"
      )
    
    private Boolean enfantEnInternat;

    public final void setEnfantEnInternat(final Boolean enfantEnInternat) {
        this.enfantEnInternat = enfantEnInternat;
    }

    /**
 
        * @hibernate.property
        *  column="enfant_en_internat"
        
      
    */
    public final Boolean getEnfantEnInternat() {
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

    public final void setExpressionProjetDeVie(final String expressionProjetDeVie) {
        this.expressionProjetDeVie = expressionProjetDeVie;
    }

    /**
 
        * @hibernate.property
        *  column="expression_projet_de_vie"
        *  length="5096"
      
    */
    public final String getExpressionProjetDeVie() {
        return this.expressionProjetDeVie;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"subject"},
        message = "faxSujet"
      )
    
    private String faxSujet;

    public final void setFaxSujet(final String faxSujet) {
        this.faxSujet = faxSujet;
    }

    /**
 
        * @hibernate.property
        *  column="fax_sujet"
        *  length="10"
      
    */
    public final String getFaxSujet() {
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

    public final void setFraisSejourPrisEnCharge(final Boolean fraisSejourPrisEnCharge) {
        this.fraisSejourPrisEnCharge = fraisSejourPrisEnCharge;
    }

    /**
 
        * @hibernate.property
        *  column="frais_sejour_pris_en_charge"
        
      
    */
    public final Boolean getFraisSejourPrisEnCharge() {
        return this.fraisSejourPrisEnCharge;
    }
  
    
      @AssertValid(
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "fraisSuppLiesHandicap"
      )
    
    private List<fr.cg95.cvq.business.request.social.MyrFraisSuppLiesHandicap> fraisSuppLiesHandicap;

    public final void setFraisSuppLiesHandicap(final List<fr.cg95.cvq.business.request.social.MyrFraisSuppLiesHandicap> fraisSuppLiesHandicap) {
        this.fraisSuppLiesHandicap = fraisSuppLiesHandicap;
    }

    /**
 
        * @hibernate.list
        *  inverse="false"
        *  lazy="false"
        *  cascade="all"
        * @hibernate.key
        *  column="mdph_youth_request_id"
        * @hibernate.list-index
        *  column="frais_supp_lies_handicap_index"
        * @hibernate.one-to-many
        *  class="fr.cg95.cvq.business.request.social.MyrFraisSuppLiesHandicap"
      
    */
    public final List<fr.cg95.cvq.business.request.social.MyrFraisSuppLiesHandicap> getFraisSuppLiesHandicap() {
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

    public final void setIdentiteConjoint(final fr.cg95.cvq.business.request.social.MyrConjointIdentite identiteConjoint) {
        this.identiteConjoint = identiteConjoint;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="identite_conjoint_id"
        *  class="fr.cg95.cvq.business.request.social.MyrConjointIdentite"
      
    */
    public final fr.cg95.cvq.business.request.social.MyrConjointIdentite getIdentiteConjoint() {
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

    public final void setInformationAutreDeteneurAutoriteParentale(final fr.cg95.cvq.business.request.social.MyrAutoriteParentaleAutre informationAutreDeteneurAutoriteParentale) {
        this.informationAutreDeteneurAutoriteParentale = informationAutreDeteneurAutoriteParentale;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="information_autre_deteneur_autorite_parentale_id"
        *  class="fr.cg95.cvq.business.request.social.MyrAutoriteParentaleAutre"
      
    */
    public final fr.cg95.cvq.business.request.social.MyrAutoriteParentaleAutre getInformationAutreDeteneurAutoriteParentale() {
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

    public final void setLieuNaissanceSujet(final fr.cg95.cvq.business.request.social.MyrBirthPlace lieuNaissanceSujet) {
        this.lieuNaissanceSujet = lieuNaissanceSujet;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="lieu_naissance_sujet_id"
        *  class="fr.cg95.cvq.business.request.social.MyrBirthPlace"
      
    */
    public final fr.cg95.cvq.business.request.social.MyrBirthPlace getLieuNaissanceSujet() {
        return this.lieuNaissanceSujet;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "nationalite"
      )
    
    private fr.cg95.cvq.business.request.social.MyrNationaliteAvecSuisseType nationalite;

    public final void setNationalite(final fr.cg95.cvq.business.request.social.MyrNationaliteAvecSuisseType nationalite) {
        this.nationalite = nationalite;
    }

    /**
 
        * @hibernate.property
        *  column="nationalite"
        
      
    */
    public final fr.cg95.cvq.business.request.social.MyrNationaliteAvecSuisseType getNationalite() {
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

    public final void setNomAllocataire(final String nomAllocataire) {
        this.nomAllocataire = nomAllocataire;
    }

    /**
 
        * @hibernate.property
        *  column="nom_allocataire"
        *  length="38"
      
    */
    public final String getNomAllocataire() {
        return this.nomAllocataire;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationParticuliere'].test(_this.situationParticuliere.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"autreSituation"},
        message = "nomEtablissement"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationParticuliere'].test(_this.situationParticuliere.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"autreSituation"},
        message = "nomEtablissement"
      )
    
    private String nomEtablissement;

    public final void setNomEtablissement(final String nomEtablissement) {
        this.nomEtablissement = nomEtablissement;
    }

    /**
 
        * @hibernate.property
        *  column="nom_etablissement"
        
      
    */
    public final String getNomEtablissement() {
        return this.nomEtablissement;
    }
  
    
    private String nomOrganismePayeur;

    public final void setNomOrganismePayeur(final String nomOrganismePayeur) {
        this.nomOrganismePayeur = nomOrganismePayeur;
    }

    /**
 
        * @hibernate.property
        *  column="nom_organisme_payeur"
        
      
    */
    public final String getNomOrganismePayeur() {
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

    public final void setNomOrganismeSecuriteSociale(final String nomOrganismeSecuriteSociale) {
        this.nomOrganismeSecuriteSociale = nomOrganismeSecuriteSociale;
    }

    /**
 
        * @hibernate.property
        *  column="nom_organisme_securite_sociale"
        *  length="50"
      
    */
    public final String getNomOrganismeSecuriteSociale() {
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

    public final void setNombreEnfantsACharge(final String nombreEnfantsACharge) {
        this.nombreEnfantsACharge = nombreEnfantsACharge;
    }

    /**
 
        * @hibernate.property
        *  column="nombre_enfants_a_charge"
        *  length="2"
      
    */
    public final String getNombreEnfantsACharge() {
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

    public final void setNumeroAllocataire(final String numeroAllocataire) {
        this.numeroAllocataire = numeroAllocataire;
    }

    /**
 
        * @hibernate.property
        *  column="numero_allocataire"
        *  length="50"
      
    */
    public final String getNumeroAllocataire() {
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

    public final void setNumeroSecuriteSocialeSujet(final String numeroSecuriteSocialeSujet) {
        this.numeroSecuriteSocialeSujet = numeroSecuriteSocialeSujet;
    }

    /**
 
        * @hibernate.property
        *  column="numero_securite_sociale_sujet"
        *  length="13"
      
    */
    public final String getNumeroSecuriteSocialeSujet() {
        return this.numeroSecuriteSocialeSujet;
    }
  
    
      @NotNull(
        
        
        profiles = {"organismePrestationFamiliale"},
        message = "organismePayeur"
      )
    
    private fr.cg95.cvq.business.request.social.MyrOrganismePayeurType organismePayeur;

    public final void setOrganismePayeur(final fr.cg95.cvq.business.request.social.MyrOrganismePayeurType organismePayeur) {
        this.organismePayeur = organismePayeur;
    }

    /**
 
        * @hibernate.property
        *  column="organisme_payeur"
        
      
    */
    public final fr.cg95.cvq.business.request.social.MyrOrganismePayeurType getOrganismePayeur() {
        return this.organismePayeur;
    }
  
    
      @AssertValid(
        
        
        profiles = {"subject"},
        message = "precedentDossierMdph"
      )
    
    private fr.cg95.cvq.business.request.social.MyrPrecedentDossierMdph precedentDossierMdph;

    public final void setPrecedentDossierMdph(final fr.cg95.cvq.business.request.social.MyrPrecedentDossierMdph precedentDossierMdph) {
        this.precedentDossierMdph = precedentDossierMdph;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="precedent_dossier_mdph_id"
        *  class="fr.cg95.cvq.business.request.social.MyrPrecedentDossierMdph"
      
    */
    public final fr.cg95.cvq.business.request.social.MyrPrecedentDossierMdph getPrecedentDossierMdph() {
        return this.precedentDossierMdph;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationParticuliere'].test(_this.situationParticuliere.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"autreSituation"},
        message = "precisionAutre"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationParticuliere'].test(_this.situationParticuliere.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"autreSituation"},
        message = "precisionAutre"
      )
    
    private String precisionAutre;

    public final void setPrecisionAutre(final String precisionAutre) {
        this.precisionAutre = precisionAutre;
    }

    /**
 
        * @hibernate.property
        *  column="precision_autre"
        
      
    */
    public final String getPrecisionAutre() {
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

    public final void setPrecisionLogementAutre(final String precisionLogementAutre) {
        this.precisionLogementAutre = precisionLogementAutre;
    }

    /**
 
        * @hibernate.property
        *  column="precision_logement_autre"
        
      
    */
    public final String getPrecisionLogementAutre() {
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

    public final void setPrecisionPreferencesEtablissementOuService(final fr.cg95.cvq.business.request.social.MyrPreferenceEtablissementOuServiceScolaire precisionPreferencesEtablissementOuService) {
        this.precisionPreferencesEtablissementOuService = precisionPreferencesEtablissementOuService;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="precision_preferences_etablissement_ou_service_id"
        *  class="fr.cg95.cvq.business.request.social.MyrPreferenceEtablissementOuServiceScolaire"
      
    */
    public final fr.cg95.cvq.business.request.social.MyrPreferenceEtablissementOuServiceScolaire getPrecisionPreferencesEtablissementOuService() {
        return this.precisionPreferencesEtablissementOuService;
    }
  
    
    private String precisionSiDomicileAupresOrganisme;

    public final void setPrecisionSiDomicileAupresOrganisme(final String precisionSiDomicileAupresOrganisme) {
        this.precisionSiDomicileAupresOrganisme = precisionSiDomicileAupresOrganisme;
    }

    /**
 
        * @hibernate.property
        *  column="precision_si_domicile_aupres_organisme"
        
      
    */
    public final String getPrecisionSiDomicileAupresOrganisme() {
        return this.precisionSiDomicileAupresOrganisme;
    }
  
    
    private Boolean preferencesEtablissementOuService;

    public final void setPreferencesEtablissementOuService(final Boolean preferencesEtablissementOuService) {
        this.preferencesEtablissementOuService = preferencesEtablissementOuService;
    }

    /**
 
        * @hibernate.property
        *  column="preferences_etablissement_ou_service"
        
      
    */
    public final Boolean getPreferencesEtablissementOuService() {
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

    public final void setPrenomAllocataire(final String prenomAllocataire) {
        this.prenomAllocataire = prenomAllocataire;
    }

    /**
 
        * @hibernate.property
        *  column="prenom_allocataire"
        *  length="38"
      
    */
    public final String getPrenomAllocataire() {
        return this.prenomAllocataire;
    }
  
    
      @AssertValid(
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "presencePersonneAupresEnfant"
      )
    
    private fr.cg95.cvq.business.request.social.MyrPresencePersonneAupresEnfant presencePersonneAupresEnfant;

    public final void setPresencePersonneAupresEnfant(final fr.cg95.cvq.business.request.social.MyrPresencePersonneAupresEnfant presencePersonneAupresEnfant) {
        this.presencePersonneAupresEnfant = presencePersonneAupresEnfant;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="presence_personne_aupres_enfant_id"
        *  class="fr.cg95.cvq.business.request.social.MyrPresencePersonneAupresEnfant"
      
    */
    public final fr.cg95.cvq.business.request.social.MyrPresencePersonneAupresEnfant getPresencePersonneAupresEnfant() {
        return this.presencePersonneAupresEnfant;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationFamiliale"},
        message = "situationMaritale"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationFamilialeType situationMaritale;

    public final void setSituationMaritale(final fr.cg95.cvq.business.request.social.MyrSituationFamilialeType situationMaritale) {
        this.situationMaritale = situationMaritale;
    }

    /**
 
        * @hibernate.property
        *  column="situation_maritale"
        
      
    */
    public final fr.cg95.cvq.business.request.social.MyrSituationFamilialeType getSituationMaritale() {
        return this.situationMaritale;
    }
  
    
    private fr.cg95.cvq.business.request.social.MyrSituationAutreType situationParticuliere;

    public final void setSituationParticuliere(final fr.cg95.cvq.business.request.social.MyrSituationAutreType situationParticuliere) {
        this.situationParticuliere = situationParticuliere;
    }

    /**
 
        * @hibernate.property
        *  column="situation_particuliere"
        
      
    */
    public final fr.cg95.cvq.business.request.social.MyrSituationAutreType getSituationParticuliere() {
        return this.situationParticuliere;
    }
  
    
    private fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType situationProfessionnelleConjoint;

    public final void setSituationProfessionnelleConjoint(final fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType situationProfessionnelleConjoint) {
        this.situationProfessionnelleConjoint = situationProfessionnelleConjoint;
    }

    /**
 
        * @hibernate.property
        *  column="situation_professionnelle_conjoint"
        
      
    */
    public final fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType getSituationProfessionnelleConjoint() {
        return this.situationProfessionnelleConjoint;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test(_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointAutre"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test(_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointAutre"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleAutre situationProfessionnelleConjointAutre;

    public final void setSituationProfessionnelleConjointAutre(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleAutre situationProfessionnelleConjointAutre) {
        this.situationProfessionnelleConjointAutre = situationProfessionnelleConjointAutre;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_conjoint_autre_id"
        *  class="fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleAutre"
      
    */
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleAutre getSituationProfessionnelleConjointAutre() {
        return this.situationProfessionnelleConjointAutre;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test(_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointBeneficiairePension"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test(_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointBeneficiairePension"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleBeneficiairePension situationProfessionnelleConjointBeneficiairePension;

    public final void setSituationProfessionnelleConjointBeneficiairePension(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleBeneficiairePension situationProfessionnelleConjointBeneficiairePension) {
        this.situationProfessionnelleConjointBeneficiairePension = situationProfessionnelleConjointBeneficiairePension;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_conjoint_beneficiaire_pension_id"
        *  class="fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleBeneficiairePension"
      
    */
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleBeneficiairePension getSituationProfessionnelleConjointBeneficiairePension() {
        return this.situationProfessionnelleConjointBeneficiairePension;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test(_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointDemandeurEmploi"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test(_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointDemandeurEmploi"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleDemandeurEmploi situationProfessionnelleConjointDemandeurEmploi;

    public final void setSituationProfessionnelleConjointDemandeurEmploi(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleDemandeurEmploi situationProfessionnelleConjointDemandeurEmploi) {
        this.situationProfessionnelleConjointDemandeurEmploi = situationProfessionnelleConjointDemandeurEmploi;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_conjoint_demandeur_emploi_id"
        *  class="fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleDemandeurEmploi"
      
    */
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleDemandeurEmploi getSituationProfessionnelleConjointDemandeurEmploi() {
        return this.situationProfessionnelleConjointDemandeurEmploi;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test(_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointNonSalarie"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test(_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointNonSalarie"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleNonSalarie situationProfessionnelleConjointNonSalarie;

    public final void setSituationProfessionnelleConjointNonSalarie(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleNonSalarie situationProfessionnelleConjointNonSalarie) {
        this.situationProfessionnelleConjointNonSalarie = situationProfessionnelleConjointNonSalarie;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_conjoint_non_salarie_id"
        *  class="fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleNonSalarie"
      
    */
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleNonSalarie getSituationProfessionnelleConjointNonSalarie() {
        return this.situationProfessionnelleConjointNonSalarie;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test(_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointRetraite"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test(_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointRetraite"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleRetraite situationProfessionnelleConjointRetraite;

    public final void setSituationProfessionnelleConjointRetraite(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleRetraite situationProfessionnelleConjointRetraite) {
        this.situationProfessionnelleConjointRetraite = situationProfessionnelleConjointRetraite;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_conjoint_retraite_id"
        *  class="fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleRetraite"
      
    */
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleRetraite getSituationProfessionnelleConjointRetraite() {
        return this.situationProfessionnelleConjointRetraite;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test(_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointSalarie"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test(_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointSalarie"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleSalarie situationProfessionnelleConjointSalarie;

    public final void setSituationProfessionnelleConjointSalarie(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleSalarie situationProfessionnelleConjointSalarie) {
        this.situationProfessionnelleConjointSalarie = situationProfessionnelleConjointSalarie;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_conjoint_salarie_id"
        *  class="fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleSalarie"
      
    */
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleSalarie getSituationProfessionnelleConjointSalarie() {
        return this.situationProfessionnelleConjointSalarie;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test(_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointStagiaire"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleConjoint'].test(_this.situationProfessionnelleConjoint.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleConjointStagiaire"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleStagiaire situationProfessionnelleConjointStagiaire;

    public final void setSituationProfessionnelleConjointStagiaire(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleStagiaire situationProfessionnelleConjointStagiaire) {
        this.situationProfessionnelleConjointStagiaire = situationProfessionnelleConjointStagiaire;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_conjoint_stagiaire_id"
        *  class="fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleStagiaire"
      
    */
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleStagiaire getSituationProfessionnelleConjointStagiaire() {
        return this.situationProfessionnelleConjointStagiaire;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVous"
      )
    
    private fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType situationProfessionnelleVous;

    public final void setSituationProfessionnelleVous(final fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType situationProfessionnelleVous) {
        this.situationProfessionnelleVous = situationProfessionnelleVous;
    }

    /**
 
        * @hibernate.property
        *  column="situation_professionnelle_vous"
        
      
    */
    public final fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType getSituationProfessionnelleVous() {
        return this.situationProfessionnelleVous;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test(_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousAutre"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test(_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousAutre"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleAutre situationProfessionnelleVousAutre;

    public final void setSituationProfessionnelleVousAutre(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleAutre situationProfessionnelleVousAutre) {
        this.situationProfessionnelleVousAutre = situationProfessionnelleVousAutre;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_vous_autre_id"
        *  class="fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleAutre"
      
    */
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleAutre getSituationProfessionnelleVousAutre() {
        return this.situationProfessionnelleVousAutre;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test(_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousBeneficiairePension"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test(_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousBeneficiairePension"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleBeneficiairePension situationProfessionnelleVousBeneficiairePension;

    public final void setSituationProfessionnelleVousBeneficiairePension(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleBeneficiairePension situationProfessionnelleVousBeneficiairePension) {
        this.situationProfessionnelleVousBeneficiairePension = situationProfessionnelleVousBeneficiairePension;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_vous_beneficiaire_pension_id"
        *  class="fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleBeneficiairePension"
      
    */
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleBeneficiairePension getSituationProfessionnelleVousBeneficiairePension() {
        return this.situationProfessionnelleVousBeneficiairePension;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test(_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousDemandeurEmploi"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test(_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousDemandeurEmploi"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleDemandeurEmploi situationProfessionnelleVousDemandeurEmploi;

    public final void setSituationProfessionnelleVousDemandeurEmploi(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleDemandeurEmploi situationProfessionnelleVousDemandeurEmploi) {
        this.situationProfessionnelleVousDemandeurEmploi = situationProfessionnelleVousDemandeurEmploi;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_vous_demandeur_emploi_id"
        *  class="fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleDemandeurEmploi"
      
    */
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleDemandeurEmploi getSituationProfessionnelleVousDemandeurEmploi() {
        return this.situationProfessionnelleVousDemandeurEmploi;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test(_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousNonSalarie"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test(_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousNonSalarie"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleNonSalarie situationProfessionnelleVousNonSalarie;

    public final void setSituationProfessionnelleVousNonSalarie(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleNonSalarie situationProfessionnelleVousNonSalarie) {
        this.situationProfessionnelleVousNonSalarie = situationProfessionnelleVousNonSalarie;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_vous_non_salarie_id"
        *  class="fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleNonSalarie"
      
    */
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleNonSalarie getSituationProfessionnelleVousNonSalarie() {
        return this.situationProfessionnelleVousNonSalarie;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test(_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousRetraite"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test(_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousRetraite"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleRetraite situationProfessionnelleVousRetraite;

    public final void setSituationProfessionnelleVousRetraite(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleRetraite situationProfessionnelleVousRetraite) {
        this.situationProfessionnelleVousRetraite = situationProfessionnelleVousRetraite;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_vous_retraite_id"
        *  class="fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleRetraite"
      
    */
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleRetraite getSituationProfessionnelleVousRetraite() {
        return this.situationProfessionnelleVousRetraite;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test(_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousSalarie"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test(_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousSalarie"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleSalarie situationProfessionnelleVousSalarie;

    public final void setSituationProfessionnelleVousSalarie(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleSalarie situationProfessionnelleVousSalarie) {
        this.situationProfessionnelleVousSalarie = situationProfessionnelleVousSalarie;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_vous_salarie_id"
        *  class="fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleSalarie"
      
    */
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleSalarie getSituationProfessionnelleVousSalarie() {
        return this.situationProfessionnelleVousSalarie;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test(_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousStagiaire"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situationProfessionnelleVous'].test(_this.situationProfessionnelleVous.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVousStagiaire"
      )
    
    private fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleStagiaire situationProfessionnelleVousStagiaire;

    public final void setSituationProfessionnelleVousStagiaire(final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleStagiaire situationProfessionnelleVousStagiaire) {
        this.situationProfessionnelleVousStagiaire = situationProfessionnelleVousStagiaire;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_vous_stagiaire_id"
        *  class="fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleStagiaire"
      
    */
    public final fr.cg95.cvq.business.request.social.MyrSituationProfessionnelleStagiaire getSituationProfessionnelleVousStagiaire() {
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

    public final void setTypeAccueil(final String typeAccueil) {
        this.typeAccueil = typeAccueil;
    }

    /**
 
        * @hibernate.property
        *  column="type_accueil"
        *  length="1024"
      
    */
    public final String getTypeAccueil() {
        return this.typeAccueil;
    }
  
    
      @NotNull(
        
        
        profiles = {"autreSituation"},
        message = "typeLogement"
      )
    
    private fr.cg95.cvq.business.request.social.MyrLogementType typeLogement;

    public final void setTypeLogement(final fr.cg95.cvq.business.request.social.MyrLogementType typeLogement) {
        this.typeLogement = typeLogement;
    }

    /**
 
        * @hibernate.property
        *  column="type_logement"
        
      
    */
    public final fr.cg95.cvq.business.request.social.MyrLogementType getTypeLogement() {
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

    public final void setTypeScolarisation(final String typeScolarisation) {
        this.typeScolarisation = typeScolarisation;
    }

    /**
 
        * @hibernate.property
        *  column="type_scolarisation"
        *  length="1024"
      
    */
    public final String getTypeScolarisation() {
        return this.typeScolarisation;
    }
  
}
