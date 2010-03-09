
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
 *  table="mdph_adult_request"
 *  lazy="false"
 */
public class MdphAdultRequestData implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>(RequestData.conditions);

    private Long id;

    public MdphAdultRequestData() {
      
        allocationPersonnaliseeAutonomie = Boolean.valueOf(false);
      
        autre = Boolean.valueOf(false);
      
        carteAccompagnement = Boolean.valueOf(false);
      
        carteInvalidite = Boolean.valueOf(false);
      
        carteStationnement = Boolean.valueOf(false);
      
        orientationReclassement = Boolean.valueOf(false);
      
        preferenceEtablissementOuService = Boolean.valueOf(false);
      
        preferencesEtablissementOuService = Boolean.valueOf(false);
      
        primeReclassement = Boolean.valueOf(false);
      
        rqth = Boolean.valueOf(false);
      
    }

    @Override
    public MdphAdultRequestData clone() {
        MdphAdultRequestData result = new MdphAdultRequestData();
        
          
            
        if (adresseResponsableLegal != null)
            result.setAdresseResponsableLegal(adresseResponsableLegal.clone());
      
          
        
          
            
        result.setAllocationPersonnaliseeAutonomie(allocationPersonnaliseeAutonomie);
      
          
        
          
            
        result.setAutre(autre);
      
          
        
          
            
        if (besoinsDemandePCH != null)
            result.setBesoinsDemandePCH(besoinsDemandePCH.clone());
      
          
        
          
            
        result.setCarteAccompagnement(carteAccompagnement);
      
          
        
          
            
        result.setCarteInvalidite(carteInvalidite);
      
          
        
          
            
        result.setCarteStationnement(carteStationnement);
      
          
        
          
            
        if (choixOrientationReclassement != null)
            result.setChoixOrientationReclassement(choixOrientationReclassement);
        else
            result.setChoixOrientationReclassement(fr.cg95.cvq.business.request.social.ChoixOrientationReclassementType.getDefaultChoixOrientationReclassementType());
      
          
        
          
            
        if (choixPrestationCompensation != null)
            result.setChoixPrestationCompensation(choixPrestationCompensation);
        else
            result.setChoixPrestationCompensation(fr.cg95.cvq.business.request.social.ChoixPrestationCompensationType.getDefaultChoixPrestationCompensationType());
      
          
        
          
            
        if (choixProjetDeVie != null)
            result.setChoixProjetDeVie(choixProjetDeVie);
        else
            result.setChoixProjetDeVie(fr.cg95.cvq.business.request.social.ChoixProjetDeVieType.getDefaultChoixProjetDeVieType());
      
          
        
          
            
        if (choixTypeDemandeAllocEtCompl != null)
            result.setChoixTypeDemandeAllocEtCompl(choixTypeDemandeAllocEtCompl.clone());
      
          
        
          
            
        result.setConseilleProjetDeVie(conseilleProjetDeVie);
      
          
        
          
            
        result.setDateArriveeFrance(dateArriveeFrance);
      
          
        
          
            
        result.setDateDebutRevenuRecu(dateDebutRevenuRecu);
      
          
        
          
            
        result.setDateEntreeSouhaitee(dateEntreeSouhaitee);
      
          
        
          
            
        result.setDateFinRevenuRecu(dateFinRevenuRecu);
      
          
        
          
            
        result.setDateNaissanceAidant(dateNaissanceAidant);
      
          
        
          
            
        result.setDateNaissanceSujet(dateNaissanceSujet);
      
          
        
          
            
        result.setDateSituationFamiliale(dateSituationFamiliale);
      
          
        
          
            
        result.setDemandeLibreScolaire(demandeLibreScolaire);
      
          
        
          
            
        if (domiciliationAidant != null)
            result.setDomiciliationAidant(domiciliationAidant.clone());
      
          
        
          
            
        if (domiciliationEtablissement != null)
            result.setDomiciliationEtablissement(domiciliationEtablissement.clone());
      
          
        
          
            
        if (domiciliationOrganismePayeur != null)
            result.setDomiciliationOrganismePayeur(domiciliationOrganismePayeur.clone());
      
          
        
          
            
        result.setEmailResponsableLegal(emailResponsableLegal);
      
          
        
          
            
        result.setExpressionProjetDeVie(expressionProjetDeVie);
      
          
        
          
            
        result.setFaxResponsableLegal(faxResponsableLegal);
      
          
        
          
            
        result.setFaxSujet(faxSujet);
      
          
        
          
            
        if (identiteConjoint != null)
            result.setIdentiteConjoint(identiteConjoint.clone());
      
          
        
          
            
        result.setLienParenteAidant(lienParenteAidant);
      
          
        
          
            
        if (lieuNaissanceSujet != null)
            result.setLieuNaissanceSujet(lieuNaissanceSujet.clone());
      
          
        
          
            
        if (nationalite != null)
            result.setNationalite(nationalite);
        else
            result.setNationalite(fr.cg95.cvq.business.request.social.NationaliteAvecSuisseType.getDefaultNationaliteAvecSuisseType());
      
          
        
          
            
        result.setNomAidant(nomAidant);
      
          
        
          
            
        result.setNomAllocataire(nomAllocataire);
      
          
        
          
            
        result.setNomEtablissement(nomEtablissement);
      
          
        
          
            
        result.setNomOrganismePayeur(nomOrganismePayeur);
      
          
        
          
            
        result.setNomOrganismeSecuriteSociale(nomOrganismeSecuriteSociale);
      
          
        
          
            
        result.setNomResponsableLegal(nomResponsableLegal);
      
          
        
          
            
        result.setNombreEnfantsACharge(nombreEnfantsACharge);
      
          
        
          
            
        result.setNumeroAllocataire(numeroAllocataire);
      
          
        
          
            
        result.setNumeroSecuriteSocialeSujet(numeroSecuriteSocialeSujet);
      
          
        
          
            
        if (organismePayeur != null)
            result.setOrganismePayeur(organismePayeur);
        else
            result.setOrganismePayeur(fr.cg95.cvq.business.request.social.OrganismePayeurType.getDefaultOrganismePayeurType());
      
          
        
          
            
        result.setOrientationReclassement(orientationReclassement);
      
          
        
          
            
        if (orientationSouhaitee != null)
            result.setOrientationSouhaitee(orientationSouhaitee);
        else
            result.setOrientationSouhaitee(fr.cg95.cvq.business.request.social.OrientationSouhaiteeType.getDefaultOrientationSouhaiteeType());
      
          
        
          
            
        if (precedentDossierMdph != null)
            result.setPrecedentDossierMdph(precedentDossierMdph.clone());
      
          
        
          
            
        if (precedentsRevenusRecus != null)
            result.setPrecedentsRevenusRecus(precedentsRevenusRecus);
        else
            result.setPrecedentsRevenusRecus(fr.cg95.cvq.business.request.social.PrecedentsRevenusRecusType.getDefaultPrecedentsRevenusRecusType());
      
          
        
          
            
        result.setPrecisionAutre(precisionAutre);
      
          
        
          
            
        result.setPrecisionLogementAutre(precisionLogementAutre);
      
          
        
          
            
        if (precisionPreferenceEtablissementOuService != null)
            result.setPrecisionPreferenceEtablissementOuService(precisionPreferenceEtablissementOuService.clone());
      
          
        
          
            
        if (precisionPreferencesEtablissementOuService != null)
            result.setPrecisionPreferencesEtablissementOuService(precisionPreferencesEtablissementOuService.clone());
      
          
        
          
            
        result.setPrecisionRevenuRecu(precisionRevenuRecu);
      
          
        
          
            
        result.setPrecisionSiDomicileAupresOrganisme(precisionSiDomicileAupresOrganisme);
      
          
        
          
            
        result.setPreferenceEtablissementOuService(preferenceEtablissementOuService);
      
          
        
          
            
        result.setPreferencesEtablissementOuService(preferencesEtablissementOuService);
      
          
        
          
            
        result.setPrenomAllocataire(prenomAllocataire);
      
          
        
          
            
        result.setPrimeReclassement(primeReclassement);
      
          
        
          
            
        if (representantLegal != null)
            result.setRepresentantLegal(representantLegal);
        else
            result.setRepresentantLegal(fr.cg95.cvq.business.request.social.RepresentantLegalType.getDefaultRepresentantLegalType());
      
          
        
          
            
        result.setRqth(rqth);
      
          
        
          
            
        if (situationActuelle != null)
            result.setSituationActuelle(situationActuelle);
        else
            result.setSituationActuelle(fr.cg95.cvq.business.request.social.SituationActuelleType.getDefaultSituationActuelleType());
      
          
        
          
            
        result.setSituationActuellePrecision(situationActuellePrecision);
      
          
        
          
            
        if (situationMaritale != null)
            result.setSituationMaritale(situationMaritale);
        else
            result.setSituationMaritale(fr.cg95.cvq.business.request.social.SituationFamilialeType.getDefaultSituationFamilialeType());
      
          
        
          
            
        if (situationParticuliere != null)
            result.setSituationParticuliere(situationParticuliere);
        else
            result.setSituationParticuliere(fr.cg95.cvq.business.request.social.SituationAutreType.getDefaultSituationAutreType());
      
          
        
          
            
        if (situationProfessionnelleConjoint != null)
            result.setSituationProfessionnelleConjoint(situationProfessionnelleConjoint);
        else
            result.setSituationProfessionnelleConjoint(fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType.getDefaultChoixSituationProfessionnelleType());
      
          
        
          
            
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
            result.setSituationProfessionnelleVous(fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType.getDefaultChoixSituationProfessionnelleType());
      
          
        
          
            
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
      
          
        
          
            
        result.setTelResponsableLegal(telResponsableLegal);
      
          
        
          
            
        if (typeLogement != null)
            result.setTypeLogement(typeLogement);
        else
            result.setTypeLogement(fr.cg95.cvq.business.request.social.LogementType.getDefaultLogementType());
      
          
        
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
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['representantLegal'].test(_this.representantLegal.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"representantLegal"},
        message = "adresseResponsableLegal"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['representantLegal'].test(_this.representantLegal.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"representantLegal"},
        message = "adresseResponsableLegal"
      )
    
    private fr.cg95.cvq.business.users.Address adresseResponsableLegal;

    public final void setAdresseResponsableLegal(final fr.cg95.cvq.business.users.Address adresseResponsableLegal) {
        this.adresseResponsableLegal = adresseResponsableLegal;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="adresse_responsable_legal_id"
        *  class="fr.cg95.cvq.business.users.Address"
      
    */
    public final fr.cg95.cvq.business.users.Address getAdresseResponsableLegal() {
        return this.adresseResponsableLegal;
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
  
    
      @NotNull(
        
        
        profiles = {"demandeProfessionnelle"},
        message = "autre"
      )
    
    private Boolean autre;

    public final void setAutre(final Boolean autre) {
        this.autre = autre;
    }

    /**
 
        * @hibernate.property
        *  column="autre"
        
      
    */
    public final Boolean getAutre() {
        return this.autre;
    }
  
    
      @AssertValid(
        
        
        profiles = {"demandePrestationCompensation"},
        message = "besoinsDemandePCH"
      )
    
    private fr.cg95.cvq.business.request.social.MarBesoinsDemandePch besoinsDemandePCH;

    public final void setBesoinsDemandePCH(final fr.cg95.cvq.business.request.social.MarBesoinsDemandePch besoinsDemandePCH) {
        this.besoinsDemandePCH = besoinsDemandePCH;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="besoins_demande_p_c_h_id"
        *  class="fr.cg95.cvq.business.request.social.MarBesoinsDemandePch"
      
    */
    public final fr.cg95.cvq.business.request.social.MarBesoinsDemandePch getBesoinsDemandePCH() {
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
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['orientationReclassement'].test(_this.orientationReclassement.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"demandeProfessionnelle"},
        message = "choixOrientationReclassement"
      )
    
    private fr.cg95.cvq.business.request.social.ChoixOrientationReclassementType choixOrientationReclassement;

    public final void setChoixOrientationReclassement(final fr.cg95.cvq.business.request.social.ChoixOrientationReclassementType choixOrientationReclassement) {
        this.choixOrientationReclassement = choixOrientationReclassement;
    }

    /**
 
        * @hibernate.property
        *  column="choix_orientation_reclassement"
        
      
    */
    public final fr.cg95.cvq.business.request.social.ChoixOrientationReclassementType getChoixOrientationReclassement() {
        return this.choixOrientationReclassement;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandePrestationCompensation"},
        message = "choixPrestationCompensation"
      )
    
    private fr.cg95.cvq.business.request.social.ChoixPrestationCompensationType choixPrestationCompensation;

    public final void setChoixPrestationCompensation(final fr.cg95.cvq.business.request.social.ChoixPrestationCompensationType choixPrestationCompensation) {
        this.choixPrestationCompensation = choixPrestationCompensation;
    }

    /**
 
        * @hibernate.property
        *  column="choix_prestation_compensation"
        
      
    */
    public final fr.cg95.cvq.business.request.social.ChoixPrestationCompensationType getChoixPrestationCompensation() {
        return this.choixPrestationCompensation;
    }
  
    
      @NotNull(
        
        
        profiles = {"projetDeVie"},
        message = "choixProjetDeVie"
      )
    
    private fr.cg95.cvq.business.request.social.ChoixProjetDeVieType choixProjetDeVie;

    public final void setChoixProjetDeVie(final fr.cg95.cvq.business.request.social.ChoixProjetDeVieType choixProjetDeVie) {
        this.choixProjetDeVie = choixProjetDeVie;
    }

    /**
 
        * @hibernate.property
        *  column="choix_projet_de_vie"
        
      
    */
    public final fr.cg95.cvq.business.request.social.ChoixProjetDeVieType getChoixProjetDeVie() {
        return this.choixProjetDeVie;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandeAllocationEtComplementRessources"},
        message = "choixTypeDemandeAllocEtCompl"
      )
    
      @AssertValid(
        
        
        profiles = {"demandeAllocationEtComplementRessources"},
        message = "choixTypeDemandeAllocEtCompl"
      )
    
    private fr.cg95.cvq.business.request.social.MarChoixDemandeAllocEtCompl choixTypeDemandeAllocEtCompl;

    public final void setChoixTypeDemandeAllocEtCompl(final fr.cg95.cvq.business.request.social.MarChoixDemandeAllocEtCompl choixTypeDemandeAllocEtCompl) {
        this.choixTypeDemandeAllocEtCompl = choixTypeDemandeAllocEtCompl;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="choix_type_demande_alloc_et_compl_id"
        *  class="fr.cg95.cvq.business.request.social.MarChoixDemandeAllocEtCompl"
      
    */
    public final fr.cg95.cvq.business.request.social.MarChoixDemandeAllocEtCompl getChoixTypeDemandeAllocEtCompl() {
        return this.choixTypeDemandeAllocEtCompl;
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
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['precedentsRevenusRecus'].test(_this.precedentsRevenusRecus.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"demandeAllocationEtComplementRessources"},
        message = "dateDebutRevenuRecu"
      )
    
    private java.util.Date dateDebutRevenuRecu;

    public final void setDateDebutRevenuRecu(final java.util.Date dateDebutRevenuRecu) {
        this.dateDebutRevenuRecu = dateDebutRevenuRecu;
    }

    /**
 
        * @hibernate.property
        *  column="date_debut_revenu_recu"
        
      
    */
    public final java.util.Date getDateDebutRevenuRecu() {
        return this.dateDebutRevenuRecu;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandeOrientationMedicoSociale"},
        message = "dateEntreeSouhaitee"
      )
    
    private java.util.Date dateEntreeSouhaitee;

    public final void setDateEntreeSouhaitee(final java.util.Date dateEntreeSouhaitee) {
        this.dateEntreeSouhaitee = dateEntreeSouhaitee;
    }

    /**
 
        * @hibernate.property
        *  column="date_entree_souhaitee"
        
      
    */
    public final java.util.Date getDateEntreeSouhaitee() {
        return this.dateEntreeSouhaitee;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['precedentsRevenusRecus'].test(_this.precedentsRevenusRecus.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"demandeAllocationEtComplementRessources"},
        message = "dateFinRevenuRecu"
      )
    
    private java.util.Date dateFinRevenuRecu;

    public final void setDateFinRevenuRecu(final java.util.Date dateFinRevenuRecu) {
        this.dateFinRevenuRecu = dateFinRevenuRecu;
    }

    /**
 
        * @hibernate.property
        *  column="date_fin_revenu_recu"
        
      
    */
    public final java.util.Date getDateFinRevenuRecu() {
        return this.dateFinRevenuRecu;
    }
  
    
      @NotNull(
        
        
        profiles = {"affilitationAidant"},
        message = "dateNaissanceAidant"
      )
    
    private java.util.Date dateNaissanceAidant;

    public final void setDateNaissanceAidant(final java.util.Date dateNaissanceAidant) {
        this.dateNaissanceAidant = dateNaissanceAidant;
    }

    /**
 
        * @hibernate.property
        *  column="date_naissance_aidant"
        
      
    */
    public final java.util.Date getDateNaissanceAidant() {
        return this.dateNaissanceAidant;
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
        
        
        profiles = {"affilitationAidant"},
        message = "domiciliationAidant"
      )
    
      @AssertValid(
        
        
        profiles = {"affilitationAidant"},
        message = "domiciliationAidant"
      )
    
    private fr.cg95.cvq.business.users.Address domiciliationAidant;

    public final void setDomiciliationAidant(final fr.cg95.cvq.business.users.Address domiciliationAidant) {
        this.domiciliationAidant = domiciliationAidant;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="domiciliation_aidant_id"
        *  class="fr.cg95.cvq.business.users.Address"
      
    */
    public final fr.cg95.cvq.business.users.Address getDomiciliationAidant() {
        return this.domiciliationAidant;
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
  
    
    private String emailResponsableLegal;

    public final void setEmailResponsableLegal(final String emailResponsableLegal) {
        this.emailResponsableLegal = emailResponsableLegal;
    }

    /**
 
        * @hibernate.property
        *  column="email_responsable_legal"
        
      
    */
    public final String getEmailResponsableLegal() {
        return this.emailResponsableLegal;
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
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['representantLegal'].test(_this.representantLegal.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"representantLegal"},
        message = "faxResponsableLegal"
      )
    
    private String faxResponsableLegal;

    public final void setFaxResponsableLegal(final String faxResponsableLegal) {
        this.faxResponsableLegal = faxResponsableLegal;
    }

    /**
 
        * @hibernate.property
        *  column="fax_responsable_legal"
        *  length="10"
      
    */
    public final String getFaxResponsableLegal() {
        return this.faxResponsableLegal;
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
    
    private fr.cg95.cvq.business.request.social.MarConjointIdentite identiteConjoint;

    public final void setIdentiteConjoint(final fr.cg95.cvq.business.request.social.MarConjointIdentite identiteConjoint) {
        this.identiteConjoint = identiteConjoint;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="identite_conjoint_id"
        *  class="fr.cg95.cvq.business.request.social.MarConjointIdentite"
      
    */
    public final fr.cg95.cvq.business.request.social.MarConjointIdentite getIdentiteConjoint() {
        return this.identiteConjoint;
    }
  
    
      @NotNull(
        
        
        profiles = {"affilitationAidant"},
        message = "lienParenteAidant"
      )
    
      @NotBlank(
        
        
        profiles = {"affilitationAidant"},
        message = "lienParenteAidant"
      )
    
    private String lienParenteAidant;

    public final void setLienParenteAidant(final String lienParenteAidant) {
        this.lienParenteAidant = lienParenteAidant;
    }

    /**
 
        * @hibernate.property
        *  column="lien_parente_aidant"
        
      
    */
    public final String getLienParenteAidant() {
        return this.lienParenteAidant;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "lieuNaissanceSujet"
      )
    
      @AssertValid(
        
        
        profiles = {"subject"},
        message = "lieuNaissanceSujet"
      )
    
    private fr.cg95.cvq.business.request.social.MarBirthPlace lieuNaissanceSujet;

    public final void setLieuNaissanceSujet(final fr.cg95.cvq.business.request.social.MarBirthPlace lieuNaissanceSujet) {
        this.lieuNaissanceSujet = lieuNaissanceSujet;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="lieu_naissance_sujet_id"
        *  class="fr.cg95.cvq.business.request.social.MarBirthPlace"
      
    */
    public final fr.cg95.cvq.business.request.social.MarBirthPlace getLieuNaissanceSujet() {
        return this.lieuNaissanceSujet;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "nationalite"
      )
    
    private fr.cg95.cvq.business.request.social.NationaliteAvecSuisseType nationalite;

    public final void setNationalite(final fr.cg95.cvq.business.request.social.NationaliteAvecSuisseType nationalite) {
        this.nationalite = nationalite;
    }

    /**
 
        * @hibernate.property
        *  column="nationalite"
        
      
    */
    public final fr.cg95.cvq.business.request.social.NationaliteAvecSuisseType getNationalite() {
        return this.nationalite;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"affilitationAidant"},
        message = "nomAidant"
      )
    
      @NotNull(
        
        
        profiles = {"affilitationAidant"},
        message = "nomAidant"
      )
    
      @NotBlank(
        
        
        profiles = {"affilitationAidant"},
        message = "nomAidant"
      )
    
    private String nomAidant;

    public final void setNomAidant(final String nomAidant) {
        this.nomAidant = nomAidant;
    }

    /**
 
        * @hibernate.property
        *  column="nom_aidant"
        *  length="38"
      
    */
    public final String getNomAidant() {
        return this.nomAidant;
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
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['representantLegal'].test(_this.representantLegal.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"representantLegal"},
        message = "nomResponsableLegal"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['representantLegal'].test(_this.representantLegal.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"representantLegal"},
        message = "nomResponsableLegal"
      )
    
    private String nomResponsableLegal;

    public final void setNomResponsableLegal(final String nomResponsableLegal) {
        this.nomResponsableLegal = nomResponsableLegal;
    }

    /**
 
        * @hibernate.property
        *  column="nom_responsable_legal"
        
      
    */
    public final String getNomResponsableLegal() {
        return this.nomResponsableLegal;
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
    
    private fr.cg95.cvq.business.request.social.OrganismePayeurType organismePayeur;

    public final void setOrganismePayeur(final fr.cg95.cvq.business.request.social.OrganismePayeurType organismePayeur) {
        this.organismePayeur = organismePayeur;
    }

    /**
 
        * @hibernate.property
        *  column="organisme_payeur"
        
      
    */
    public final fr.cg95.cvq.business.request.social.OrganismePayeurType getOrganismePayeur() {
        return this.organismePayeur;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandeProfessionnelle"},
        message = "orientationReclassement"
      )
    
    private Boolean orientationReclassement;

    public final void setOrientationReclassement(final Boolean orientationReclassement) {
        this.orientationReclassement = orientationReclassement;
    }

    /**
 
        * @hibernate.property
        *  column="orientation_reclassement"
        
      
    */
    public final Boolean getOrientationReclassement() {
        return this.orientationReclassement;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandeOrientationMedicoSociale"},
        message = "orientationSouhaitee"
      )
    
    private fr.cg95.cvq.business.request.social.OrientationSouhaiteeType orientationSouhaitee;

    public final void setOrientationSouhaitee(final fr.cg95.cvq.business.request.social.OrientationSouhaiteeType orientationSouhaitee) {
        this.orientationSouhaitee = orientationSouhaitee;
    }

    /**
 
        * @hibernate.property
        *  column="orientation_souhaitee"
        
      
    */
    public final fr.cg95.cvq.business.request.social.OrientationSouhaiteeType getOrientationSouhaitee() {
        return this.orientationSouhaitee;
    }
  
    
      @AssertValid(
        
        
        profiles = {"subject"},
        message = "precedentDossierMdph"
      )
    
    private fr.cg95.cvq.business.request.social.MarPrecedentDossierMdph precedentDossierMdph;

    public final void setPrecedentDossierMdph(final fr.cg95.cvq.business.request.social.MarPrecedentDossierMdph precedentDossierMdph) {
        this.precedentDossierMdph = precedentDossierMdph;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="precedent_dossier_mdph_id"
        *  class="fr.cg95.cvq.business.request.social.MarPrecedentDossierMdph"
      
    */
    public final fr.cg95.cvq.business.request.social.MarPrecedentDossierMdph getPrecedentDossierMdph() {
        return this.precedentDossierMdph;
    }
  
    
    private fr.cg95.cvq.business.request.social.PrecedentsRevenusRecusType precedentsRevenusRecus;

    public final void setPrecedentsRevenusRecus(final fr.cg95.cvq.business.request.social.PrecedentsRevenusRecusType precedentsRevenusRecus) {
        this.precedentsRevenusRecus = precedentsRevenusRecus;
    }

    /**
 
        * @hibernate.property
        *  column="precedents_revenus_recus"
        
      
    */
    public final fr.cg95.cvq.business.request.social.PrecedentsRevenusRecusType getPrecedentsRevenusRecus() {
        return this.precedentsRevenusRecus;
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
          
            "active &= _this.conditions['preferenceEtablissementOuService'].test(_this.preferenceEtablissementOuService.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"demandeOrientationMedicoSociale"},
        message = "precisionPreferenceEtablissementOuService"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['preferenceEtablissementOuService'].test(_this.preferenceEtablissementOuService.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"demandeOrientationMedicoSociale"},
        message = "precisionPreferenceEtablissementOuService"
      )
    
    private fr.cg95.cvq.business.request.social.MarPrecisionPreferenceEtablissementOuService precisionPreferenceEtablissementOuService;

    public final void setPrecisionPreferenceEtablissementOuService(final fr.cg95.cvq.business.request.social.MarPrecisionPreferenceEtablissementOuService precisionPreferenceEtablissementOuService) {
        this.precisionPreferenceEtablissementOuService = precisionPreferenceEtablissementOuService;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="precision_preference_etablissement_ou_service_id"
        *  class="fr.cg95.cvq.business.request.social.MarPrecisionPreferenceEtablissementOuService"
      
    */
    public final fr.cg95.cvq.business.request.social.MarPrecisionPreferenceEtablissementOuService getPrecisionPreferenceEtablissementOuService() {
        return this.precisionPreferenceEtablissementOuService;
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
    
    private fr.cg95.cvq.business.request.social.MarPreferenceEtablissementOuServiceScolaire precisionPreferencesEtablissementOuService;

    public final void setPrecisionPreferencesEtablissementOuService(final fr.cg95.cvq.business.request.social.MarPreferenceEtablissementOuServiceScolaire precisionPreferencesEtablissementOuService) {
        this.precisionPreferencesEtablissementOuService = precisionPreferencesEtablissementOuService;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="precision_preferences_etablissement_ou_service_id"
        *  class="fr.cg95.cvq.business.request.social.MarPreferenceEtablissementOuServiceScolaire"
      
    */
    public final fr.cg95.cvq.business.request.social.MarPreferenceEtablissementOuServiceScolaire getPrecisionPreferencesEtablissementOuService() {
        return this.precisionPreferencesEtablissementOuService;
    }
  
    
    private String precisionRevenuRecu;

    public final void setPrecisionRevenuRecu(final String precisionRevenuRecu) {
        this.precisionRevenuRecu = precisionRevenuRecu;
    }

    /**
 
        * @hibernate.property
        *  column="precision_revenu_recu"
        
      
    */
    public final String getPrecisionRevenuRecu() {
        return this.precisionRevenuRecu;
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
  
    
      @NotNull(
        
        
        profiles = {"demandeOrientationMedicoSociale"},
        message = "preferenceEtablissementOuService"
      )
    
    private Boolean preferenceEtablissementOuService;

    public final void setPreferenceEtablissementOuService(final Boolean preferenceEtablissementOuService) {
        this.preferenceEtablissementOuService = preferenceEtablissementOuService;
    }

    /**
 
        * @hibernate.property
        *  column="preference_etablissement_ou_service"
        
      
    */
    public final Boolean getPreferenceEtablissementOuService() {
        return this.preferenceEtablissementOuService;
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
  
    
      @NotNull(
        
        
        profiles = {"demandeProfessionnelle"},
        message = "primeReclassement"
      )
    
    private Boolean primeReclassement;

    public final void setPrimeReclassement(final Boolean primeReclassement) {
        this.primeReclassement = primeReclassement;
    }

    /**
 
        * @hibernate.property
        *  column="prime_reclassement"
        
      
    */
    public final Boolean getPrimeReclassement() {
        return this.primeReclassement;
    }
  
    
      @NotNull(
        
        
        profiles = {"representantLegal"},
        message = "representantLegal"
      )
    
    private fr.cg95.cvq.business.request.social.RepresentantLegalType representantLegal;

    public final void setRepresentantLegal(final fr.cg95.cvq.business.request.social.RepresentantLegalType representantLegal) {
        this.representantLegal = representantLegal;
    }

    /**
 
        * @hibernate.property
        *  column="representant_legal"
        
      
    */
    public final fr.cg95.cvq.business.request.social.RepresentantLegalType getRepresentantLegal() {
        return this.representantLegal;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandeProfessionnelle"},
        message = "rqth"
      )
    
    private Boolean rqth;

    public final void setRqth(final Boolean rqth) {
        this.rqth = rqth;
    }

    /**
 
        * @hibernate.property
        *  column="rqth"
        
      
    */
    public final Boolean getRqth() {
        return this.rqth;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandeOrientationMedicoSociale"},
        message = "situationActuelle"
      )
    
    private fr.cg95.cvq.business.request.social.SituationActuelleType situationActuelle;

    public final void setSituationActuelle(final fr.cg95.cvq.business.request.social.SituationActuelleType situationActuelle) {
        this.situationActuelle = situationActuelle;
    }

    /**
 
        * @hibernate.property
        *  column="situation_actuelle"
        
      
    */
    public final fr.cg95.cvq.business.request.social.SituationActuelleType getSituationActuelle() {
        return this.situationActuelle;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandeOrientationMedicoSociale"},
        message = "situationActuellePrecision"
      )
    
      @NotBlank(
        
        
        profiles = {"demandeOrientationMedicoSociale"},
        message = "situationActuellePrecision"
      )
    
    private String situationActuellePrecision;

    public final void setSituationActuellePrecision(final String situationActuellePrecision) {
        this.situationActuellePrecision = situationActuellePrecision;
    }

    /**
 
        * @hibernate.property
        *  column="situation_actuelle_precision"
        
      
    */
    public final String getSituationActuellePrecision() {
        return this.situationActuellePrecision;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationFamiliale"},
        message = "situationMaritale"
      )
    
    private fr.cg95.cvq.business.request.social.SituationFamilialeType situationMaritale;

    public final void setSituationMaritale(final fr.cg95.cvq.business.request.social.SituationFamilialeType situationMaritale) {
        this.situationMaritale = situationMaritale;
    }

    /**
 
        * @hibernate.property
        *  column="situation_maritale"
        
      
    */
    public final fr.cg95.cvq.business.request.social.SituationFamilialeType getSituationMaritale() {
        return this.situationMaritale;
    }
  
    
    private fr.cg95.cvq.business.request.social.SituationAutreType situationParticuliere;

    public final void setSituationParticuliere(final fr.cg95.cvq.business.request.social.SituationAutreType situationParticuliere) {
        this.situationParticuliere = situationParticuliere;
    }

    /**
 
        * @hibernate.property
        *  column="situation_particuliere"
        
      
    */
    public final fr.cg95.cvq.business.request.social.SituationAutreType getSituationParticuliere() {
        return this.situationParticuliere;
    }
  
    
    private fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType situationProfessionnelleConjoint;

    public final void setSituationProfessionnelleConjoint(final fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType situationProfessionnelleConjoint) {
        this.situationProfessionnelleConjoint = situationProfessionnelleConjoint;
    }

    /**
 
        * @hibernate.property
        *  column="situation_professionnelle_conjoint"
        
      
    */
    public final fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType getSituationProfessionnelleConjoint() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleAutre situationProfessionnelleConjointAutre;

    public final void setSituationProfessionnelleConjointAutre(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleAutre situationProfessionnelleConjointAutre) {
        this.situationProfessionnelleConjointAutre = situationProfessionnelleConjointAutre;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_conjoint_autre_id"
        *  class="fr.cg95.cvq.business.request.social.MarSituationProfessionnelleAutre"
      
    */
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleAutre getSituationProfessionnelleConjointAutre() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleBeneficiairePension situationProfessionnelleConjointBeneficiairePension;

    public final void setSituationProfessionnelleConjointBeneficiairePension(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleBeneficiairePension situationProfessionnelleConjointBeneficiairePension) {
        this.situationProfessionnelleConjointBeneficiairePension = situationProfessionnelleConjointBeneficiairePension;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_conjoint_beneficiaire_pension_id"
        *  class="fr.cg95.cvq.business.request.social.MarSituationProfessionnelleBeneficiairePension"
      
    */
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleBeneficiairePension getSituationProfessionnelleConjointBeneficiairePension() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleDemandeurEmploi situationProfessionnelleConjointDemandeurEmploi;

    public final void setSituationProfessionnelleConjointDemandeurEmploi(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleDemandeurEmploi situationProfessionnelleConjointDemandeurEmploi) {
        this.situationProfessionnelleConjointDemandeurEmploi = situationProfessionnelleConjointDemandeurEmploi;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_conjoint_demandeur_emploi_id"
        *  class="fr.cg95.cvq.business.request.social.MarSituationProfessionnelleDemandeurEmploi"
      
    */
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleDemandeurEmploi getSituationProfessionnelleConjointDemandeurEmploi() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleNonSalarie situationProfessionnelleConjointNonSalarie;

    public final void setSituationProfessionnelleConjointNonSalarie(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleNonSalarie situationProfessionnelleConjointNonSalarie) {
        this.situationProfessionnelleConjointNonSalarie = situationProfessionnelleConjointNonSalarie;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_conjoint_non_salarie_id"
        *  class="fr.cg95.cvq.business.request.social.MarSituationProfessionnelleNonSalarie"
      
    */
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleNonSalarie getSituationProfessionnelleConjointNonSalarie() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleRetraite situationProfessionnelleConjointRetraite;

    public final void setSituationProfessionnelleConjointRetraite(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleRetraite situationProfessionnelleConjointRetraite) {
        this.situationProfessionnelleConjointRetraite = situationProfessionnelleConjointRetraite;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_conjoint_retraite_id"
        *  class="fr.cg95.cvq.business.request.social.MarSituationProfessionnelleRetraite"
      
    */
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleRetraite getSituationProfessionnelleConjointRetraite() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleSalarie situationProfessionnelleConjointSalarie;

    public final void setSituationProfessionnelleConjointSalarie(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleSalarie situationProfessionnelleConjointSalarie) {
        this.situationProfessionnelleConjointSalarie = situationProfessionnelleConjointSalarie;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_conjoint_salarie_id"
        *  class="fr.cg95.cvq.business.request.social.MarSituationProfessionnelleSalarie"
      
    */
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleSalarie getSituationProfessionnelleConjointSalarie() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleStagiaire situationProfessionnelleConjointStagiaire;

    public final void setSituationProfessionnelleConjointStagiaire(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleStagiaire situationProfessionnelleConjointStagiaire) {
        this.situationProfessionnelleConjointStagiaire = situationProfessionnelleConjointStagiaire;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_conjoint_stagiaire_id"
        *  class="fr.cg95.cvq.business.request.social.MarSituationProfessionnelleStagiaire"
      
    */
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleStagiaire getSituationProfessionnelleConjointStagiaire() {
        return this.situationProfessionnelleConjointStagiaire;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVous"
      )
    
    private fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType situationProfessionnelleVous;

    public final void setSituationProfessionnelleVous(final fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType situationProfessionnelleVous) {
        this.situationProfessionnelleVous = situationProfessionnelleVous;
    }

    /**
 
        * @hibernate.property
        *  column="situation_professionnelle_vous"
        
      
    */
    public final fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType getSituationProfessionnelleVous() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleAutre situationProfessionnelleVousAutre;

    public final void setSituationProfessionnelleVousAutre(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleAutre situationProfessionnelleVousAutre) {
        this.situationProfessionnelleVousAutre = situationProfessionnelleVousAutre;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_vous_autre_id"
        *  class="fr.cg95.cvq.business.request.social.MarSituationProfessionnelleAutre"
      
    */
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleAutre getSituationProfessionnelleVousAutre() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleBeneficiairePension situationProfessionnelleVousBeneficiairePension;

    public final void setSituationProfessionnelleVousBeneficiairePension(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleBeneficiairePension situationProfessionnelleVousBeneficiairePension) {
        this.situationProfessionnelleVousBeneficiairePension = situationProfessionnelleVousBeneficiairePension;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_vous_beneficiaire_pension_id"
        *  class="fr.cg95.cvq.business.request.social.MarSituationProfessionnelleBeneficiairePension"
      
    */
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleBeneficiairePension getSituationProfessionnelleVousBeneficiairePension() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleDemandeurEmploi situationProfessionnelleVousDemandeurEmploi;

    public final void setSituationProfessionnelleVousDemandeurEmploi(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleDemandeurEmploi situationProfessionnelleVousDemandeurEmploi) {
        this.situationProfessionnelleVousDemandeurEmploi = situationProfessionnelleVousDemandeurEmploi;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_vous_demandeur_emploi_id"
        *  class="fr.cg95.cvq.business.request.social.MarSituationProfessionnelleDemandeurEmploi"
      
    */
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleDemandeurEmploi getSituationProfessionnelleVousDemandeurEmploi() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleNonSalarie situationProfessionnelleVousNonSalarie;

    public final void setSituationProfessionnelleVousNonSalarie(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleNonSalarie situationProfessionnelleVousNonSalarie) {
        this.situationProfessionnelleVousNonSalarie = situationProfessionnelleVousNonSalarie;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_vous_non_salarie_id"
        *  class="fr.cg95.cvq.business.request.social.MarSituationProfessionnelleNonSalarie"
      
    */
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleNonSalarie getSituationProfessionnelleVousNonSalarie() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleRetraite situationProfessionnelleVousRetraite;

    public final void setSituationProfessionnelleVousRetraite(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleRetraite situationProfessionnelleVousRetraite) {
        this.situationProfessionnelleVousRetraite = situationProfessionnelleVousRetraite;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_vous_retraite_id"
        *  class="fr.cg95.cvq.business.request.social.MarSituationProfessionnelleRetraite"
      
    */
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleRetraite getSituationProfessionnelleVousRetraite() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleSalarie situationProfessionnelleVousSalarie;

    public final void setSituationProfessionnelleVousSalarie(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleSalarie situationProfessionnelleVousSalarie) {
        this.situationProfessionnelleVousSalarie = situationProfessionnelleVousSalarie;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_vous_salarie_id"
        *  class="fr.cg95.cvq.business.request.social.MarSituationProfessionnelleSalarie"
      
    */
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleSalarie getSituationProfessionnelleVousSalarie() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleStagiaire situationProfessionnelleVousStagiaire;

    public final void setSituationProfessionnelleVousStagiaire(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleStagiaire situationProfessionnelleVousStagiaire) {
        this.situationProfessionnelleVousStagiaire = situationProfessionnelleVousStagiaire;
    }

    /**
 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="situation_professionnelle_vous_stagiaire_id"
        *  class="fr.cg95.cvq.business.request.social.MarSituationProfessionnelleStagiaire"
      
    */
    public final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleStagiaire getSituationProfessionnelleVousStagiaire() {
        return this.situationProfessionnelleVousStagiaire;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['representantLegal'].test(_this.representantLegal.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"representantLegal"},
        message = "telResponsableLegal"
      )
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['representantLegal'].test(_this.representantLegal.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"representantLegal"},
        message = "telResponsableLegal"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['representantLegal'].test(_this.representantLegal.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"representantLegal"},
        message = "telResponsableLegal"
      )
    
    private String telResponsableLegal;

    public final void setTelResponsableLegal(final String telResponsableLegal) {
        this.telResponsableLegal = telResponsableLegal;
    }

    /**
 
        * @hibernate.property
        *  column="tel_responsable_legal"
        *  length="10"
      
    */
    public final String getTelResponsableLegal() {
        return this.telResponsableLegal;
    }
  
    
      @NotNull(
        
        
        profiles = {"autreSituation"},
        message = "typeLogement"
      )
    
    private fr.cg95.cvq.business.request.social.LogementType typeLogement;

    public final void setTypeLogement(final fr.cg95.cvq.business.request.social.LogementType typeLogement) {
        this.typeLogement = typeLogement;
    }

    /**
 
        * @hibernate.property
        *  column="type_logement"
        
      
    */
    public final fr.cg95.cvq.business.request.social.LogementType getTypeLogement() {
        return this.typeLogement;
    }
  
}
