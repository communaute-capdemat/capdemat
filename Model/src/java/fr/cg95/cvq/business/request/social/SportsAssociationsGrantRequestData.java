

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
@Table(name="sports_associations_grant_request")
public class SportsAssociationsGrantRequestData implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>(RequestData.conditions);

    private Long id;

    public SportsAssociationsGrantRequestData() {
      
        roleDemandeur = fr.cg95.cvq.business.request.social.SagrRoleAssociationType.PRESIDENT;
      
    }

    @Override
    public SportsAssociationsGrantRequestData clone() {
        SportsAssociationsGrantRequestData result = new SportsAssociationsGrantRequestData();
        
          
            
        List<fr.cg95.cvq.business.request.social.SagrMembreBureau> autreMembreBureauList = new ArrayList<fr.cg95.cvq.business.request.social.SagrMembreBureau>();
        for (SagrMembreBureau object : autreMembreBureau) {
            autreMembreBureauList.add(object.clone());
        }
        result.setAutreMembreBureau(autreMembreBureauList);
      
          
        
          
            
        if (compteBancaire != null)
            result.setCompteBancaire(compteBancaire.clone());
      
          
        
          
            
        if (contactsAssociation != null)
            result.setContactsAssociation(contactsAssociation.clone());
      
          
        
          
            
        result.setIdentifiantEDemandeAssociation(identifiantEDemandeAssociation);
      
          
        
          
            
        result.setMontantSubvention(montantSubvention);
      
          
        
          
            
        result.setNomAssociation(nomAssociation);
      
          
        
          
            
        result.setNumeroEnregistrementAssociation(numeroEnregistrementAssociation);
      
          
        
          
            
        if (numerosAssociation != null)
            result.setNumerosAssociation(numerosAssociation.clone());
      
          
        
          
            
        if (precisionPresident != null)
            result.setPrecisionPresident(precisionPresident.clone());
      
          
        
          
            
        if (roleDemandeur != null)
            result.setRoleDemandeur(roleDemandeur);
        else
            result.setRoleDemandeur(fr.cg95.cvq.business.request.social.SagrRoleAssociationType.getDefaultSagrRoleAssociationType());
      
          
        
          
            
        List<fr.cg95.cvq.business.request.social.SagrActiviteAssociation> sagrActiviteAssociationList = new ArrayList<fr.cg95.cvq.business.request.social.SagrActiviteAssociation>();
        for (SagrActiviteAssociation object : sagrActiviteAssociation) {
            sagrActiviteAssociationList.add(object.clone());
        }
        result.setSagrActiviteAssociation(sagrActiviteAssociationList);
      
          
        
          
            
        if (siegeSocialAssociation != null)
            result.setSiegeSocialAssociation(siegeSocialAssociation.clone());
      
          
        
          
            
        if (subventionPubliqueFonctionnement != null)
            result.setSubventionPubliqueFonctionnement(subventionPubliqueFonctionnement.clone());
      
          
        
          
            
        result.setSubventionSolliciteConseilGeneral(subventionSolliciteConseilGeneral);
      
          
        
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

  
    
      @AssertValid(
        
        
        profiles = {"bureau"},
        message = "autreMembreBureau"
      )
    
    private List<fr.cg95.cvq.business.request.social.SagrMembreBureau> autreMembreBureau;

    public void setAutreMembreBureau(final List<fr.cg95.cvq.business.request.social.SagrMembreBureau> autreMembreBureau) {
        this.autreMembreBureau = autreMembreBureau;
    }

 
    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @OrderColumn(name="autre_membre_bureau_index")
    @JoinColumn(name="sports_associations_grant_request_id")
      
    public List<fr.cg95.cvq.business.request.social.SagrMembreBureau> getAutreMembreBureau() {
        return this.autreMembreBureau;
    }
  
    
      @NotNull(
        
        
        profiles = {"subvention"},
        message = "compteBancaire"
      )
    
      @AssertValid(
        
        
        profiles = {"subvention"},
        message = "compteBancaire"
      )
    
    private fr.cg95.cvq.business.users.BankAccount compteBancaire;

    public void setCompteBancaire(final fr.cg95.cvq.business.users.BankAccount compteBancaire) {
        this.compteBancaire = compteBancaire;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="compte_bancaire_id")
      
    public fr.cg95.cvq.business.users.BankAccount getCompteBancaire() {
        return this.compteBancaire;
    }
  
    
      @NotNull(
        
        
        profiles = {"association"},
        message = "contactsAssociation"
      )
    
      @AssertValid(
        
        
        profiles = {"association"},
        message = "contactsAssociation"
      )
    
    private fr.cg95.cvq.business.request.social.SagrContactsAssociation contactsAssociation;

    public void setContactsAssociation(final fr.cg95.cvq.business.request.social.SagrContactsAssociation contactsAssociation) {
        this.contactsAssociation = contactsAssociation;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="contacts_association_id")
      
    public fr.cg95.cvq.business.request.social.SagrContactsAssociation getContactsAssociation() {
        return this.contactsAssociation;
    }
  
    
    private String identifiantEDemandeAssociation;

    public void setIdentifiantEDemandeAssociation(final String identifiantEDemandeAssociation) {
        this.identifiantEDemandeAssociation = identifiantEDemandeAssociation;
    }

 
    @Column(name="identifiant_e_demande_association"  )
      
    public String getIdentifiantEDemandeAssociation() {
        return this.identifiantEDemandeAssociation;
    }
  
    
      @NotNull(
        
        
        profiles = {"administration"},
        message = "montantSubvention"
      )
    
    private java.math.BigDecimal montantSubvention;

    public void setMontantSubvention(final java.math.BigDecimal montantSubvention) {
        this.montantSubvention = montantSubvention;
    }

 
    @Column(name="montant_subvention"  )
      
    public java.math.BigDecimal getMontantSubvention() {
        return this.montantSubvention;
    }
  
    
      @NotNull(
        
        
        profiles = {"association"},
        message = "nomAssociation"
      )
    
      @NotBlank(
        
        
        profiles = {"association"},
        message = "nomAssociation"
      )
    
    private String nomAssociation;

    public void setNomAssociation(final String nomAssociation) {
        this.nomAssociation = nomAssociation;
    }

 
    @Column(name="nom_association"  )
      
    public String getNomAssociation() {
        return this.nomAssociation;
    }
  
    
      @NotNull(
        
        
        profiles = {"administration"},
        message = "numeroEnregistrementAssociation"
      )
    
      @NotBlank(
        
        
        profiles = {"administration"},
        message = "numeroEnregistrementAssociation"
      )
    
    private String numeroEnregistrementAssociation;

    public void setNumeroEnregistrementAssociation(final String numeroEnregistrementAssociation) {
        this.numeroEnregistrementAssociation = numeroEnregistrementAssociation;
    }

 
    @Column(name="numero_enregistrement_association"  )
      
    public String getNumeroEnregistrementAssociation() {
        return this.numeroEnregistrementAssociation;
    }
  
    
      @NotNull(
        
        
        profiles = {"association"},
        message = "numerosAssociation"
      )
    
      @AssertValid(
        
        
        profiles = {"association"},
        message = "numerosAssociation"
      )
    
    private fr.cg95.cvq.business.request.social.SagrNumerosAssociation numerosAssociation;

    public void setNumerosAssociation(final fr.cg95.cvq.business.request.social.SagrNumerosAssociation numerosAssociation) {
        this.numerosAssociation = numerosAssociation;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="numeros_association_id")
      
    public fr.cg95.cvq.business.request.social.SagrNumerosAssociation getNumerosAssociation() {
        return this.numerosAssociation;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= !_this.conditions['roleDemandeur'].test(_this.roleDemandeur.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"president"},
        message = "precisionPresident"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= !_this.conditions['roleDemandeur'].test(_this.roleDemandeur.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"president"},
        message = "precisionPresident"
      )
    
    private fr.cg95.cvq.business.request.social.SagrPrecisionPresident precisionPresident;

    public void setPrecisionPresident(final fr.cg95.cvq.business.request.social.SagrPrecisionPresident precisionPresident) {
        this.precisionPresident = precisionPresident;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="precision_president_id")
      
    public fr.cg95.cvq.business.request.social.SagrPrecisionPresident getPrecisionPresident() {
        return this.precisionPresident;
    }
  
    
      @NotNull(
        
        
        profiles = {"president"},
        message = "roleDemandeur"
      )
    
    private fr.cg95.cvq.business.request.social.SagrRoleAssociationType roleDemandeur;

    public void setRoleDemandeur(final fr.cg95.cvq.business.request.social.SagrRoleAssociationType roleDemandeur) {
        this.roleDemandeur = roleDemandeur;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="role_demandeur"  )
      
    public fr.cg95.cvq.business.request.social.SagrRoleAssociationType getRoleDemandeur() {
        return this.roleDemandeur;
    }
  
    
      @AssertValid(
        
        
        profiles = {"activites"},
        message = "sagrActiviteAssociation"
      )
    
      @MinSize(
        
          value = 1,
        
        
        profiles = {"activites"},
        message = "sagrActiviteAssociation"
      )
    
    private List<fr.cg95.cvq.business.request.social.SagrActiviteAssociation> sagrActiviteAssociation;

    public void setSagrActiviteAssociation(final List<fr.cg95.cvq.business.request.social.SagrActiviteAssociation> sagrActiviteAssociation) {
        this.sagrActiviteAssociation = sagrActiviteAssociation;
    }

 
    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @OrderColumn(name="sagr_activite_association_index")
    @JoinColumn(name="sports_associations_grant_request_id")
      
    public List<fr.cg95.cvq.business.request.social.SagrActiviteAssociation> getSagrActiviteAssociation() {
        return this.sagrActiviteAssociation;
    }
  
    
      @NotNull(
        
        
        profiles = {"association"},
        message = "siegeSocialAssociation"
      )
    
      @AssertValid(
        
        
        profiles = {"association"},
        message = "siegeSocialAssociation"
      )
    
    private fr.cg95.cvq.business.users.Address siegeSocialAssociation;

    public void setSiegeSocialAssociation(final fr.cg95.cvq.business.users.Address siegeSocialAssociation) {
        this.siegeSocialAssociation = siegeSocialAssociation;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="siege_social_association_id")
      
    public fr.cg95.cvq.business.users.Address getSiegeSocialAssociation() {
        return this.siegeSocialAssociation;
    }
  
    
      @NotNull(
        
        
        profiles = {"subvention"},
        message = "subventionPubliqueFonctionnement"
      )
    
      @AssertValid(
        
        
        profiles = {"subvention"},
        message = "subventionPubliqueFonctionnement"
      )
    
    private fr.cg95.cvq.business.request.social.SagrSubventionPubliqueFonctionnement subventionPubliqueFonctionnement;

    public void setSubventionPubliqueFonctionnement(final fr.cg95.cvq.business.request.social.SagrSubventionPubliqueFonctionnement subventionPubliqueFonctionnement) {
        this.subventionPubliqueFonctionnement = subventionPubliqueFonctionnement;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="subvention_publique_fonctionnement_id")
      
    public fr.cg95.cvq.business.request.social.SagrSubventionPubliqueFonctionnement getSubventionPubliqueFonctionnement() {
        return this.subventionPubliqueFonctionnement;
    }
  
    
    private java.math.BigDecimal subventionSolliciteConseilGeneral;

    public void setSubventionSolliciteConseilGeneral(final java.math.BigDecimal subventionSolliciteConseilGeneral) {
        this.subventionSolliciteConseilGeneral = subventionSolliciteConseilGeneral;
    }

 
    @Column(name="subvention_sollicite_conseil_general"  )
      
    public java.math.BigDecimal getSubventionSolliciteConseilGeneral() {
        return this.subventionSolliciteConseilGeneral;
    }
  
}
