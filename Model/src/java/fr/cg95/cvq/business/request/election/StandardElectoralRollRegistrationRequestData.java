

package fr.cg95.cvq.business.request.election;

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
@Table(name="standard_electoral_roll_registration_request")
public class StandardElectoralRollRegistrationRequestData implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>(RequestData.conditions);

    private Long id;

    public StandardElectoralRollRegistrationRequestData() {
      
        nationalite = fr.cg95.cvq.business.request.election.SerrrNationaliteType.FRANCAISE;
      
        sexe = fr.cg95.cvq.business.request.election.SerrrSexeType.MASCULIN;
      
        situation = fr.cg95.cvq.business.request.election.SerrrSituationType.PREMIERE_INSCRIPTION;
      
    }

    @Override
    public StandardElectoralRollRegistrationRequestData clone() {
        StandardElectoralRollRegistrationRequestData result = new StandardElectoralRollRegistrationRequestData();
        
          
            
        result.setAmbassadeOuPosteConsulaire(ambassadeOuPosteConsulaire);
      
          
        
          
            
        result.setDateNaissance(dateNaissance);
      
          
        
          
            
        result.setDeuxiemePrenom(deuxiemePrenom);
      
          
        
          
            
        if (fieldsetEstUnionEuropeenne != null)
            result.setFieldsetEstUnionEuropeenne(fieldsetEstUnionEuropeenne.clone());
      
          
        
          
            
        if (lieuNaissance != null)
            result.setLieuNaissance(lieuNaissance.clone());
      
          
        
          
            
        if (nationalite != null)
            result.setNationalite(nationalite);
        else
            result.setNationalite(fr.cg95.cvq.business.request.election.SerrrNationaliteType.getDefaultSerrrNationaliteType());
      
          
        
          
            
        result.setNomMarital(nomMarital);
      
          
        
          
            
        result.setNomNaissance(nomNaissance);
      
          
        
          
            
        if (paysRadiation != null)
            result.setPaysRadiation(paysRadiation);
        else
            result.setPaysRadiation(fr.cg95.cvq.business.users.CountryType.getDefaultCountryType());
      
          
        
          
            
        if (precedentLieuInscription != null)
            result.setPrecedentLieuInscription(precedentLieuInscription.clone());
      
          
        
          
            
        result.setPrenom(prenom);
      
          
        
          
            
        if (sexe != null)
            result.setSexe(sexe);
        else
            result.setSexe(fr.cg95.cvq.business.request.election.SerrrSexeType.getDefaultSerrrSexeType());
      
          
        
          
            
        if (situation != null)
            result.setSituation(situation);
        else
            result.setSituation(fr.cg95.cvq.business.request.election.SerrrSituationType.getDefaultSerrrSituationType());
      
          
        
          
            
        result.setTroisiemePrenom(troisiemePrenom);
      
          
        
          
            
        if (typeInscription != null)
            result.setTypeInscription(typeInscription);
        else
            result.setTypeInscription(fr.cg95.cvq.business.request.election.SerrrTypeInscriptionType.getDefaultSerrrTypeInscriptionType());
      
          
        
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

  
    
    private String ambassadeOuPosteConsulaire;

    public void setAmbassadeOuPosteConsulaire(final String ambassadeOuPosteConsulaire) {
        this.ambassadeOuPosteConsulaire = ambassadeOuPosteConsulaire;
    }

 
    @Column(name="ambassade_ou_poste_consulaire"  )
      
    public String getAmbassadeOuPosteConsulaire() {
        return this.ambassadeOuPosteConsulaire;
    }
  
    
      @NotNull(
        
        
        profiles = {"inscription"},
        message = "dateNaissance"
      )
    
    private java.util.Date dateNaissance;

    public void setDateNaissance(final java.util.Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

 
    @Column(name="date_naissance"  )
      
    public java.util.Date getDateNaissance() {
        return this.dateNaissance;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"inscription"},
        message = "deuxiemePrenom"
      )
    
    private String deuxiemePrenom;

    public void setDeuxiemePrenom(final String deuxiemePrenom) {
        this.deuxiemePrenom = deuxiemePrenom;
    }

 
    @Column(name="deuxieme_prenom" , length=38 )
      
    public String getDeuxiemePrenom() {
        return this.deuxiemePrenom;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['nationalite'].test(_this.nationalite.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"inscription"},
        message = "fieldsetEstUnionEuropeenne"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['nationalite'].test(_this.nationalite.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"inscription"},
        message = "fieldsetEstUnionEuropeenne"
      )
    
    private fr.cg95.cvq.business.request.election.SerrrFieldsetEstUnionEuropeenne fieldsetEstUnionEuropeenne;

    public void setFieldsetEstUnionEuropeenne(final fr.cg95.cvq.business.request.election.SerrrFieldsetEstUnionEuropeenne fieldsetEstUnionEuropeenne) {
        this.fieldsetEstUnionEuropeenne = fieldsetEstUnionEuropeenne;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="fieldset_est_union_europeenne_id")
      
    public fr.cg95.cvq.business.request.election.SerrrFieldsetEstUnionEuropeenne getFieldsetEstUnionEuropeenne() {
        return this.fieldsetEstUnionEuropeenne;
    }
  
    
      @NotNull(
        
        
        profiles = {"inscription"},
        message = "lieuNaissance"
      )
    
      @AssertValid(
        
        
        profiles = {"inscription"},
        message = "lieuNaissance"
      )
    
    private fr.cg95.cvq.business.request.election.SerrrLieuNaissance lieuNaissance;

    public void setLieuNaissance(final fr.cg95.cvq.business.request.election.SerrrLieuNaissance lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="lieu_naissance_id")
      
    public fr.cg95.cvq.business.request.election.SerrrLieuNaissance getLieuNaissance() {
        return this.lieuNaissance;
    }
  
    
      @NotNull(
        
        
        profiles = {"inscription"},
        message = "nationalite"
      )
    
    private fr.cg95.cvq.business.request.election.SerrrNationaliteType nationalite;

    public void setNationalite(final fr.cg95.cvq.business.request.election.SerrrNationaliteType nationalite) {
        this.nationalite = nationalite;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="nationalite"  )
      
    public fr.cg95.cvq.business.request.election.SerrrNationaliteType getNationalite() {
        return this.nationalite;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['sexe'].test(_this.sexe.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"inscription"},
        message = "nomMarital"
      )
    
    private String nomMarital;

    public void setNomMarital(final String nomMarital) {
        this.nomMarital = nomMarital;
    }

 
    @Column(name="nom_marital" , length=38 )
      
    public String getNomMarital() {
        return this.nomMarital;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"inscription"},
        message = "nomNaissance"
      )
    
      @NotNull(
        
        
        profiles = {"inscription"},
        message = "nomNaissance"
      )
    
      @NotBlank(
        
        
        profiles = {"inscription"},
        message = "nomNaissance"
      )
    
    private String nomNaissance;

    public void setNomNaissance(final String nomNaissance) {
        this.nomNaissance = nomNaissance;
    }

 
    @Column(name="nom_naissance" , length=38 )
      
    public String getNomNaissance() {
        return this.nomNaissance;
    }
  
    
    private fr.cg95.cvq.business.users.CountryType paysRadiation;

    public void setPaysRadiation(final fr.cg95.cvq.business.users.CountryType paysRadiation) {
        this.paysRadiation = paysRadiation;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="pays_radiation"  )
      
    public fr.cg95.cvq.business.users.CountryType getPaysRadiation() {
        return this.paysRadiation;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situation'].test(_this.situation.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situation"},
        message = "precedentLieuInscription"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['situation'].test(_this.situation.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"situation"},
        message = "precedentLieuInscription"
      )
    
    private fr.cg95.cvq.business.request.election.SerrrPrecedentLieuInscription precedentLieuInscription;

    public void setPrecedentLieuInscription(final fr.cg95.cvq.business.request.election.SerrrPrecedentLieuInscription precedentLieuInscription) {
        this.precedentLieuInscription = precedentLieuInscription;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="precedent_lieu_inscription_id")
      
    public fr.cg95.cvq.business.request.election.SerrrPrecedentLieuInscription getPrecedentLieuInscription() {
        return this.precedentLieuInscription;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"inscription"},
        message = "prenom"
      )
    
      @NotNull(
        
        
        profiles = {"inscription"},
        message = "prenom"
      )
    
      @NotBlank(
        
        
        profiles = {"inscription"},
        message = "prenom"
      )
    
    private String prenom;

    public void setPrenom(final String prenom) {
        this.prenom = prenom;
    }

 
    @Column(name="prenom" , length=38 )
      
    public String getPrenom() {
        return this.prenom;
    }
  
    
      @NotNull(
        
        
        profiles = {"inscription"},
        message = "sexe"
      )
    
    private fr.cg95.cvq.business.request.election.SerrrSexeType sexe;

    public void setSexe(final fr.cg95.cvq.business.request.election.SerrrSexeType sexe) {
        this.sexe = sexe;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="sexe"  )
      
    public fr.cg95.cvq.business.request.election.SerrrSexeType getSexe() {
        return this.sexe;
    }
  
    
      @NotNull(
        
        
        profiles = {"situation"},
        message = "situation"
      )
    
    private fr.cg95.cvq.business.request.election.SerrrSituationType situation;

    public void setSituation(final fr.cg95.cvq.business.request.election.SerrrSituationType situation) {
        this.situation = situation;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="situation"  )
      
    public fr.cg95.cvq.business.request.election.SerrrSituationType getSituation() {
        return this.situation;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"inscription"},
        message = "troisiemePrenom"
      )
    
    private String troisiemePrenom;

    public void setTroisiemePrenom(final String troisiemePrenom) {
        this.troisiemePrenom = troisiemePrenom;
    }

 
    @Column(name="troisieme_prenom" , length=38 )
      
    public String getTroisiemePrenom() {
        return this.troisiemePrenom;
    }
  
    
    private fr.cg95.cvq.business.request.election.SerrrTypeInscriptionType typeInscription;

    public void setTypeInscription(final fr.cg95.cvq.business.request.election.SerrrTypeInscriptionType typeInscription) {
        this.typeInscription = typeInscription;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="type_inscription"  )
      
    public fr.cg95.cvq.business.request.election.SerrrTypeInscriptionType getTypeInscription() {
        return this.typeInscription;
    }
  
}
