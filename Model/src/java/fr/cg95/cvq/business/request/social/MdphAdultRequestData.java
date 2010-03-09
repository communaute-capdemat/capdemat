

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
@Table(name="mdph_adult_request")
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

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
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

    public void setAdresseResponsableLegal(final fr.cg95.cvq.business.users.Address adresseResponsableLegal) {
        this.adresseResponsableLegal = adresseResponsableLegal;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="adresse_responsable_legal_id")
      
    public fr.cg95.cvq.business.users.Address getAdresseResponsableLegal() {
        return this.adresseResponsableLegal;
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
  
    
      @NotNull(
        
        
        profiles = {"demandeProfessionnelle"},
        message = "autre"
      )
    
    private Boolean autre;

    public void setAutre(final Boolean autre) {
        this.autre = autre;
    }

 
    @Column(name="autre"  )
      
    public Boolean getAutre() {
        return this.autre;
    }
  
    
      @AssertValid(
        
        
        profiles = {"demandePrestationCompensation"},
        message = "besoinsDemandePCH"
      )
    
    private fr.cg95.cvq.business.request.social.MarBesoinsDemandePch besoinsDemandePCH;

    public void setBesoinsDemandePCH(final fr.cg95.cvq.business.request.social.MarBesoinsDemandePch besoinsDemandePCH) {
        this.besoinsDemandePCH = besoinsDemandePCH;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="besoins_demande_p_c_h_id")
      
    public fr.cg95.cvq.business.request.social.MarBesoinsDemandePch getBesoinsDemandePCH() {
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
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['orientationReclassement'].test(_this.orientationReclassement.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"demandeProfessionnelle"},
        message = "choixOrientationReclassement"
      )
    
    private fr.cg95.cvq.business.request.social.ChoixOrientationReclassementType choixOrientationReclassement;

    public void setChoixOrientationReclassement(final fr.cg95.cvq.business.request.social.ChoixOrientationReclassementType choixOrientationReclassement) {
        this.choixOrientationReclassement = choixOrientationReclassement;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="choix_orientation_reclassement"  )
      
    public fr.cg95.cvq.business.request.social.ChoixOrientationReclassementType getChoixOrientationReclassement() {
        return this.choixOrientationReclassement;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandePrestationCompensation"},
        message = "choixPrestationCompensation"
      )
    
    private fr.cg95.cvq.business.request.social.ChoixPrestationCompensationType choixPrestationCompensation;

    public void setChoixPrestationCompensation(final fr.cg95.cvq.business.request.social.ChoixPrestationCompensationType choixPrestationCompensation) {
        this.choixPrestationCompensation = choixPrestationCompensation;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="choix_prestation_compensation"  )
      
    public fr.cg95.cvq.business.request.social.ChoixPrestationCompensationType getChoixPrestationCompensation() {
        return this.choixPrestationCompensation;
    }
  
    
      @NotNull(
        
        
        profiles = {"projetDeVie"},
        message = "choixProjetDeVie"
      )
    
    private fr.cg95.cvq.business.request.social.ChoixProjetDeVieType choixProjetDeVie;

    public void setChoixProjetDeVie(final fr.cg95.cvq.business.request.social.ChoixProjetDeVieType choixProjetDeVie) {
        this.choixProjetDeVie = choixProjetDeVie;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="choix_projet_de_vie"  )
      
    public fr.cg95.cvq.business.request.social.ChoixProjetDeVieType getChoixProjetDeVie() {
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

    public void setChoixTypeDemandeAllocEtCompl(final fr.cg95.cvq.business.request.social.MarChoixDemandeAllocEtCompl choixTypeDemandeAllocEtCompl) {
        this.choixTypeDemandeAllocEtCompl = choixTypeDemandeAllocEtCompl;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="choix_type_demande_alloc_et_compl_id")
      
    public fr.cg95.cvq.business.request.social.MarChoixDemandeAllocEtCompl getChoixTypeDemandeAllocEtCompl() {
        return this.choixTypeDemandeAllocEtCompl;
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
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['precedentsRevenusRecus'].test(_this.precedentsRevenusRecus.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"demandeAllocationEtComplementRessources"},
        message = "dateDebutRevenuRecu"
      )
    
    private java.util.Date dateDebutRevenuRecu;

    public void setDateDebutRevenuRecu(final java.util.Date dateDebutRevenuRecu) {
        this.dateDebutRevenuRecu = dateDebutRevenuRecu;
    }

 
    @Column(name="date_debut_revenu_recu"  )
      
    public java.util.Date getDateDebutRevenuRecu() {
        return this.dateDebutRevenuRecu;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandeOrientationMedicoSociale"},
        message = "dateEntreeSouhaitee"
      )
    
    private java.util.Date dateEntreeSouhaitee;

    public void setDateEntreeSouhaitee(final java.util.Date dateEntreeSouhaitee) {
        this.dateEntreeSouhaitee = dateEntreeSouhaitee;
    }

 
    @Column(name="date_entree_souhaitee"  )
      
    public java.util.Date getDateEntreeSouhaitee() {
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

    public void setDateFinRevenuRecu(final java.util.Date dateFinRevenuRecu) {
        this.dateFinRevenuRecu = dateFinRevenuRecu;
    }

 
    @Column(name="date_fin_revenu_recu"  )
      
    public java.util.Date getDateFinRevenuRecu() {
        return this.dateFinRevenuRecu;
    }
  
    
      @NotNull(
        
        
        profiles = {"affilitationAidant"},
        message = "dateNaissanceAidant"
      )
    
    private java.util.Date dateNaissanceAidant;

    public void setDateNaissanceAidant(final java.util.Date dateNaissanceAidant) {
        this.dateNaissanceAidant = dateNaissanceAidant;
    }

 
    @Column(name="date_naissance_aidant"  )
      
    public java.util.Date getDateNaissanceAidant() {
        return this.dateNaissanceAidant;
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
        
        
        profiles = {"affilitationAidant"},
        message = "domiciliationAidant"
      )
    
      @AssertValid(
        
        
        profiles = {"affilitationAidant"},
        message = "domiciliationAidant"
      )
    
    private fr.cg95.cvq.business.users.Address domiciliationAidant;

    public void setDomiciliationAidant(final fr.cg95.cvq.business.users.Address domiciliationAidant) {
        this.domiciliationAidant = domiciliationAidant;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="domiciliation_aidant_id")
      
    public fr.cg95.cvq.business.users.Address getDomiciliationAidant() {
        return this.domiciliationAidant;
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
  
    
    private String emailResponsableLegal;

    public void setEmailResponsableLegal(final String emailResponsableLegal) {
        this.emailResponsableLegal = emailResponsableLegal;
    }

 
    @Column(name="email_responsable_legal"  )
      
    public String getEmailResponsableLegal() {
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

    public void setExpressionProjetDeVie(final String expressionProjetDeVie) {
        this.expressionProjetDeVie = expressionProjetDeVie;
    }

 
    @Column(name="expression_projet_de_vie" , length=5096 )
      
    public String getExpressionProjetDeVie() {
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

    public void setFaxResponsableLegal(final String faxResponsableLegal) {
        this.faxResponsableLegal = faxResponsableLegal;
    }

 
    @Column(name="fax_responsable_legal" , length=10 )
      
    public String getFaxResponsableLegal() {
        return this.faxResponsableLegal;
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

    public void setIdentiteConjoint(final fr.cg95.cvq.business.request.social.MarConjointIdentite identiteConjoint) {
        this.identiteConjoint = identiteConjoint;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="identite_conjoint_id")
      
    public fr.cg95.cvq.business.request.social.MarConjointIdentite getIdentiteConjoint() {
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

    public void setLienParenteAidant(final String lienParenteAidant) {
        this.lienParenteAidant = lienParenteAidant;
    }

 
    @Column(name="lien_parente_aidant"  )
      
    public String getLienParenteAidant() {
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

    public void setLieuNaissanceSujet(final fr.cg95.cvq.business.request.social.MarBirthPlace lieuNaissanceSujet) {
        this.lieuNaissanceSujet = lieuNaissanceSujet;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="lieu_naissance_sujet_id")
      
    public fr.cg95.cvq.business.request.social.MarBirthPlace getLieuNaissanceSujet() {
        return this.lieuNaissanceSujet;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "nationalite"
      )
    
    private fr.cg95.cvq.business.request.social.NationaliteAvecSuisseType nationalite;

    public void setNationalite(final fr.cg95.cvq.business.request.social.NationaliteAvecSuisseType nationalite) {
        this.nationalite = nationalite;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="nationalite"  )
      
    public fr.cg95.cvq.business.request.social.NationaliteAvecSuisseType getNationalite() {
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

    public void setNomAidant(final String nomAidant) {
        this.nomAidant = nomAidant;
    }

 
    @Column(name="nom_aidant" , length=38 )
      
    public String getNomAidant() {
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

    public void setNomResponsableLegal(final String nomResponsableLegal) {
        this.nomResponsableLegal = nomResponsableLegal;
    }

 
    @Column(name="nom_responsable_legal"  )
      
    public String getNomResponsableLegal() {
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
    
      @NotBlank(
        
        
        profiles = {"organismePrestationFamiliale"},
        message = "numeroAllocataire"
      )
    
    private String numeroAllocataire;

    public void setNumeroAllocataire(final String numeroAllocataire) {
        this.numeroAllocataire = numeroAllocataire;
    }

 
    @Column(name="numero_allocataire"  )
      
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
    
    private fr.cg95.cvq.business.request.social.OrganismePayeurType organismePayeur;

    public void setOrganismePayeur(final fr.cg95.cvq.business.request.social.OrganismePayeurType organismePayeur) {
        this.organismePayeur = organismePayeur;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="organisme_payeur"  )
      
    public fr.cg95.cvq.business.request.social.OrganismePayeurType getOrganismePayeur() {
        return this.organismePayeur;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandeProfessionnelle"},
        message = "orientationReclassement"
      )
    
    private Boolean orientationReclassement;

    public void setOrientationReclassement(final Boolean orientationReclassement) {
        this.orientationReclassement = orientationReclassement;
    }

 
    @Column(name="orientation_reclassement"  )
      
    public Boolean getOrientationReclassement() {
        return this.orientationReclassement;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandeOrientationMedicoSociale"},
        message = "orientationSouhaitee"
      )
    
    private fr.cg95.cvq.business.request.social.OrientationSouhaiteeType orientationSouhaitee;

    public void setOrientationSouhaitee(final fr.cg95.cvq.business.request.social.OrientationSouhaiteeType orientationSouhaitee) {
        this.orientationSouhaitee = orientationSouhaitee;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="orientation_souhaitee"  )
      
    public fr.cg95.cvq.business.request.social.OrientationSouhaiteeType getOrientationSouhaitee() {
        return this.orientationSouhaitee;
    }
  
    
      @AssertValid(
        
        
        profiles = {"subject"},
        message = "precedentDossierMdph"
      )
    
    private fr.cg95.cvq.business.request.social.MarPrecedentDossierMdph precedentDossierMdph;

    public void setPrecedentDossierMdph(final fr.cg95.cvq.business.request.social.MarPrecedentDossierMdph precedentDossierMdph) {
        this.precedentDossierMdph = precedentDossierMdph;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="precedent_dossier_mdph_id")
      
    public fr.cg95.cvq.business.request.social.MarPrecedentDossierMdph getPrecedentDossierMdph() {
        return this.precedentDossierMdph;
    }
  
    
    private fr.cg95.cvq.business.request.social.PrecedentsRevenusRecusType precedentsRevenusRecus;

    public void setPrecedentsRevenusRecus(final fr.cg95.cvq.business.request.social.PrecedentsRevenusRecusType precedentsRevenusRecus) {
        this.precedentsRevenusRecus = precedentsRevenusRecus;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="precedents_revenus_recus"  )
      
    public fr.cg95.cvq.business.request.social.PrecedentsRevenusRecusType getPrecedentsRevenusRecus() {
        return this.precedentsRevenusRecus;
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

    public void setPrecisionPreferenceEtablissementOuService(final fr.cg95.cvq.business.request.social.MarPrecisionPreferenceEtablissementOuService precisionPreferenceEtablissementOuService) {
        this.precisionPreferenceEtablissementOuService = precisionPreferenceEtablissementOuService;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="precision_preference_etablissement_ou_service_id")
      
    public fr.cg95.cvq.business.request.social.MarPrecisionPreferenceEtablissementOuService getPrecisionPreferenceEtablissementOuService() {
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

    public void setPrecisionPreferencesEtablissementOuService(final fr.cg95.cvq.business.request.social.MarPreferenceEtablissementOuServiceScolaire precisionPreferencesEtablissementOuService) {
        this.precisionPreferencesEtablissementOuService = precisionPreferencesEtablissementOuService;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="precision_preferences_etablissement_ou_service_id")
      
    public fr.cg95.cvq.business.request.social.MarPreferenceEtablissementOuServiceScolaire getPrecisionPreferencesEtablissementOuService() {
        return this.precisionPreferencesEtablissementOuService;
    }
  
    
    private String precisionRevenuRecu;

    public void setPrecisionRevenuRecu(final String precisionRevenuRecu) {
        this.precisionRevenuRecu = precisionRevenuRecu;
    }

 
    @Column(name="precision_revenu_recu"  )
      
    public String getPrecisionRevenuRecu() {
        return this.precisionRevenuRecu;
    }
  
    
    private String precisionSiDomicileAupresOrganisme;

    public void setPrecisionSiDomicileAupresOrganisme(final String precisionSiDomicileAupresOrganisme) {
        this.precisionSiDomicileAupresOrganisme = precisionSiDomicileAupresOrganisme;
    }

 
    @Column(name="precision_si_domicile_aupres_organisme"  )
      
    public String getPrecisionSiDomicileAupresOrganisme() {
        return this.precisionSiDomicileAupresOrganisme;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandeOrientationMedicoSociale"},
        message = "preferenceEtablissementOuService"
      )
    
    private Boolean preferenceEtablissementOuService;

    public void setPreferenceEtablissementOuService(final Boolean preferenceEtablissementOuService) {
        this.preferenceEtablissementOuService = preferenceEtablissementOuService;
    }

 
    @Column(name="preference_etablissement_ou_service"  )
      
    public Boolean getPreferenceEtablissementOuService() {
        return this.preferenceEtablissementOuService;
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
  
    
      @NotNull(
        
        
        profiles = {"demandeProfessionnelle"},
        message = "primeReclassement"
      )
    
    private Boolean primeReclassement;

    public void setPrimeReclassement(final Boolean primeReclassement) {
        this.primeReclassement = primeReclassement;
    }

 
    @Column(name="prime_reclassement"  )
      
    public Boolean getPrimeReclassement() {
        return this.primeReclassement;
    }
  
    
      @NotNull(
        
        
        profiles = {"representantLegal"},
        message = "representantLegal"
      )
    
    private fr.cg95.cvq.business.request.social.RepresentantLegalType representantLegal;

    public void setRepresentantLegal(final fr.cg95.cvq.business.request.social.RepresentantLegalType representantLegal) {
        this.representantLegal = representantLegal;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="representant_legal"  )
      
    public fr.cg95.cvq.business.request.social.RepresentantLegalType getRepresentantLegal() {
        return this.representantLegal;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandeProfessionnelle"},
        message = "rqth"
      )
    
    private Boolean rqth;

    public void setRqth(final Boolean rqth) {
        this.rqth = rqth;
    }

 
    @Column(name="rqth"  )
      
    public Boolean getRqth() {
        return this.rqth;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandeOrientationMedicoSociale"},
        message = "situationActuelle"
      )
    
    private fr.cg95.cvq.business.request.social.SituationActuelleType situationActuelle;

    public void setSituationActuelle(final fr.cg95.cvq.business.request.social.SituationActuelleType situationActuelle) {
        this.situationActuelle = situationActuelle;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="situation_actuelle"  )
      
    public fr.cg95.cvq.business.request.social.SituationActuelleType getSituationActuelle() {
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

    public void setSituationActuellePrecision(final String situationActuellePrecision) {
        this.situationActuellePrecision = situationActuellePrecision;
    }

 
    @Column(name="situation_actuelle_precision"  )
      
    public String getSituationActuellePrecision() {
        return this.situationActuellePrecision;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationFamiliale"},
        message = "situationMaritale"
      )
    
    private fr.cg95.cvq.business.request.social.SituationFamilialeType situationMaritale;

    public void setSituationMaritale(final fr.cg95.cvq.business.request.social.SituationFamilialeType situationMaritale) {
        this.situationMaritale = situationMaritale;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="situation_maritale"  )
      
    public fr.cg95.cvq.business.request.social.SituationFamilialeType getSituationMaritale() {
        return this.situationMaritale;
    }
  
    
    private fr.cg95.cvq.business.request.social.SituationAutreType situationParticuliere;

    public void setSituationParticuliere(final fr.cg95.cvq.business.request.social.SituationAutreType situationParticuliere) {
        this.situationParticuliere = situationParticuliere;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="situation_particuliere"  )
      
    public fr.cg95.cvq.business.request.social.SituationAutreType getSituationParticuliere() {
        return this.situationParticuliere;
    }
  
    
    private fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType situationProfessionnelleConjoint;

    public void setSituationProfessionnelleConjoint(final fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType situationProfessionnelleConjoint) {
        this.situationProfessionnelleConjoint = situationProfessionnelleConjoint;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="situation_professionnelle_conjoint"  )
      
    public fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType getSituationProfessionnelleConjoint() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleAutre situationProfessionnelleConjointAutre;

    public void setSituationProfessionnelleConjointAutre(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleAutre situationProfessionnelleConjointAutre) {
        this.situationProfessionnelleConjointAutre = situationProfessionnelleConjointAutre;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_conjoint_autre_id")
      
    public fr.cg95.cvq.business.request.social.MarSituationProfessionnelleAutre getSituationProfessionnelleConjointAutre() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleBeneficiairePension situationProfessionnelleConjointBeneficiairePension;

    public void setSituationProfessionnelleConjointBeneficiairePension(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleBeneficiairePension situationProfessionnelleConjointBeneficiairePension) {
        this.situationProfessionnelleConjointBeneficiairePension = situationProfessionnelleConjointBeneficiairePension;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_conjoint_beneficiaire_pension_id")
      
    public fr.cg95.cvq.business.request.social.MarSituationProfessionnelleBeneficiairePension getSituationProfessionnelleConjointBeneficiairePension() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleDemandeurEmploi situationProfessionnelleConjointDemandeurEmploi;

    public void setSituationProfessionnelleConjointDemandeurEmploi(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleDemandeurEmploi situationProfessionnelleConjointDemandeurEmploi) {
        this.situationProfessionnelleConjointDemandeurEmploi = situationProfessionnelleConjointDemandeurEmploi;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_conjoint_demandeur_emploi_id")
      
    public fr.cg95.cvq.business.request.social.MarSituationProfessionnelleDemandeurEmploi getSituationProfessionnelleConjointDemandeurEmploi() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleNonSalarie situationProfessionnelleConjointNonSalarie;

    public void setSituationProfessionnelleConjointNonSalarie(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleNonSalarie situationProfessionnelleConjointNonSalarie) {
        this.situationProfessionnelleConjointNonSalarie = situationProfessionnelleConjointNonSalarie;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_conjoint_non_salarie_id")
      
    public fr.cg95.cvq.business.request.social.MarSituationProfessionnelleNonSalarie getSituationProfessionnelleConjointNonSalarie() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleRetraite situationProfessionnelleConjointRetraite;

    public void setSituationProfessionnelleConjointRetraite(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleRetraite situationProfessionnelleConjointRetraite) {
        this.situationProfessionnelleConjointRetraite = situationProfessionnelleConjointRetraite;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_conjoint_retraite_id")
      
    public fr.cg95.cvq.business.request.social.MarSituationProfessionnelleRetraite getSituationProfessionnelleConjointRetraite() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleSalarie situationProfessionnelleConjointSalarie;

    public void setSituationProfessionnelleConjointSalarie(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleSalarie situationProfessionnelleConjointSalarie) {
        this.situationProfessionnelleConjointSalarie = situationProfessionnelleConjointSalarie;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_conjoint_salarie_id")
      
    public fr.cg95.cvq.business.request.social.MarSituationProfessionnelleSalarie getSituationProfessionnelleConjointSalarie() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleStagiaire situationProfessionnelleConjointStagiaire;

    public void setSituationProfessionnelleConjointStagiaire(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleStagiaire situationProfessionnelleConjointStagiaire) {
        this.situationProfessionnelleConjointStagiaire = situationProfessionnelleConjointStagiaire;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_conjoint_stagiaire_id")
      
    public fr.cg95.cvq.business.request.social.MarSituationProfessionnelleStagiaire getSituationProfessionnelleConjointStagiaire() {
        return this.situationProfessionnelleConjointStagiaire;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "situationProfessionnelleVous"
      )
    
    private fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType situationProfessionnelleVous;

    public void setSituationProfessionnelleVous(final fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType situationProfessionnelleVous) {
        this.situationProfessionnelleVous = situationProfessionnelleVous;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="situation_professionnelle_vous"  )
      
    public fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType getSituationProfessionnelleVous() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleAutre situationProfessionnelleVousAutre;

    public void setSituationProfessionnelleVousAutre(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleAutre situationProfessionnelleVousAutre) {
        this.situationProfessionnelleVousAutre = situationProfessionnelleVousAutre;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_vous_autre_id")
      
    public fr.cg95.cvq.business.request.social.MarSituationProfessionnelleAutre getSituationProfessionnelleVousAutre() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleBeneficiairePension situationProfessionnelleVousBeneficiairePension;

    public void setSituationProfessionnelleVousBeneficiairePension(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleBeneficiairePension situationProfessionnelleVousBeneficiairePension) {
        this.situationProfessionnelleVousBeneficiairePension = situationProfessionnelleVousBeneficiairePension;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_vous_beneficiaire_pension_id")
      
    public fr.cg95.cvq.business.request.social.MarSituationProfessionnelleBeneficiairePension getSituationProfessionnelleVousBeneficiairePension() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleDemandeurEmploi situationProfessionnelleVousDemandeurEmploi;

    public void setSituationProfessionnelleVousDemandeurEmploi(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleDemandeurEmploi situationProfessionnelleVousDemandeurEmploi) {
        this.situationProfessionnelleVousDemandeurEmploi = situationProfessionnelleVousDemandeurEmploi;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_vous_demandeur_emploi_id")
      
    public fr.cg95.cvq.business.request.social.MarSituationProfessionnelleDemandeurEmploi getSituationProfessionnelleVousDemandeurEmploi() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleNonSalarie situationProfessionnelleVousNonSalarie;

    public void setSituationProfessionnelleVousNonSalarie(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleNonSalarie situationProfessionnelleVousNonSalarie) {
        this.situationProfessionnelleVousNonSalarie = situationProfessionnelleVousNonSalarie;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_vous_non_salarie_id")
      
    public fr.cg95.cvq.business.request.social.MarSituationProfessionnelleNonSalarie getSituationProfessionnelleVousNonSalarie() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleRetraite situationProfessionnelleVousRetraite;

    public void setSituationProfessionnelleVousRetraite(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleRetraite situationProfessionnelleVousRetraite) {
        this.situationProfessionnelleVousRetraite = situationProfessionnelleVousRetraite;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_vous_retraite_id")
      
    public fr.cg95.cvq.business.request.social.MarSituationProfessionnelleRetraite getSituationProfessionnelleVousRetraite() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleSalarie situationProfessionnelleVousSalarie;

    public void setSituationProfessionnelleVousSalarie(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleSalarie situationProfessionnelleVousSalarie) {
        this.situationProfessionnelleVousSalarie = situationProfessionnelleVousSalarie;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_vous_salarie_id")
      
    public fr.cg95.cvq.business.request.social.MarSituationProfessionnelleSalarie getSituationProfessionnelleVousSalarie() {
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
    
    private fr.cg95.cvq.business.request.social.MarSituationProfessionnelleStagiaire situationProfessionnelleVousStagiaire;

    public void setSituationProfessionnelleVousStagiaire(final fr.cg95.cvq.business.request.social.MarSituationProfessionnelleStagiaire situationProfessionnelleVousStagiaire) {
        this.situationProfessionnelleVousStagiaire = situationProfessionnelleVousStagiaire;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="situation_professionnelle_vous_stagiaire_id")
      
    public fr.cg95.cvq.business.request.social.MarSituationProfessionnelleStagiaire getSituationProfessionnelleVousStagiaire() {
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

    public void setTelResponsableLegal(final String telResponsableLegal) {
        this.telResponsableLegal = telResponsableLegal;
    }

 
    @Column(name="tel_responsable_legal" , length=10 )
      
    public String getTelResponsableLegal() {
        return this.telResponsableLegal;
    }
  
    
      @NotNull(
        
        
        profiles = {"autreSituation"},
        message = "typeLogement"
      )
    
    private fr.cg95.cvq.business.request.social.LogementType typeLogement;

    public void setTypeLogement(final fr.cg95.cvq.business.request.social.LogementType typeLogement) {
        this.typeLogement = typeLogement;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="type_logement"  )
      
    public fr.cg95.cvq.business.request.social.LogementType getTypeLogement() {
        return this.typeLogement;
    }
  
}
