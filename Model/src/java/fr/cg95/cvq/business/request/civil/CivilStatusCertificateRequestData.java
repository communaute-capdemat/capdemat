

package fr.cg95.cvq.business.request.civil;

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
@Table(name="civil_status_certificate_request")
public class CivilStatusCertificateRequestData implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>(RequestData.conditions);

    private Long id;

    public CivilStatusCertificateRequestData() {
      
        typeDemandeur = fr.cg95.cvq.business.request.civil.CscTypeDemandeurType.PARTICULIER;
      
    }

    @Override
    public CivilStatusCertificateRequestData clone() {
        CivilStatusCertificateRequestData result = new CivilStatusCertificateRequestData();
        
          
            
        result.setCommentaire(commentaire);
      
          
        
          
            
        if (complementTypeActe != null)
            result.setComplementTypeActe(complementTypeActe.clone());
      
          
        
          
            
        result.setDateEvenement(dateEvenement);
      
          
        
          
            
        if (formatActe != null)
            result.setFormatActe(formatActe);
        else
            result.setFormatActe(fr.cg95.cvq.business.request.civil.CscFormatActeType.getDefaultCscFormatActeType());
      
          
        
          
            
        if (informationsAdministration != null)
            result.setInformationsAdministration(informationsAdministration.clone());
      
          
        
          
            
        if (informationsJuridique != null)
            result.setInformationsJuridique(informationsJuridique.clone());
      
          
        
          
            
        if (informationsParticulier != null)
            result.setInformationsParticulier(informationsParticulier.clone());
      
          
        
          
            
        if (motif != null)
            result.setMotif(motif);
        else
            result.setMotif(fr.cg95.cvq.business.request.civil.CscMotifType.getDefaultCscMotifType());
      
          
        
          
            
        result.setNomTitulaireActe(nomTitulaireActe);
      
          
        
          
            
        result.setNombreActes(nombreActes);
      
          
        
          
            
        result.setPrecisionAutreMotif(precisionAutreMotif);
      
          
        
          
            
        result.setPrenomsTitulaireActe(prenomsTitulaireActe);
      
          
        
          
            
        if (typeActe != null)
            result.setTypeActe(typeActe);
        else
            result.setTypeActe(fr.cg95.cvq.business.request.civil.CscTypeActeType.getDefaultCscTypeActeType());
      
          
        
          
            
        if (typeDemandeur != null)
            result.setTypeDemandeur(typeDemandeur);
        else
            result.setTypeDemandeur(fr.cg95.cvq.business.request.civil.CscTypeDemandeurType.getDefaultCscTypeDemandeurType());
      
          
        
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

  
    
      @MaxLength(
        
          value = 2048,
        
        
        profiles = {"informations"},
        message = "commentaire"
      )
    
      @MatchPattern(
        
          pattern = "^[\\w\\W]{0,1024}$",
        
        
        profiles = {"informations"},
        message = "commentaire"
      )
    
    private String commentaire;

    public void setCommentaire(final String commentaire) {
        this.commentaire = commentaire;
    }

 
    @Column(name="commentaire" , length=2048 )
      
    public String getCommentaire() {
        return this.commentaire;
    }
  
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= !_this.conditions['formatActe'].test(_this.formatActe.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"acte"},
        message = "complementTypeActe"
      )
    
    private fr.cg95.cvq.business.request.civil.CscrComplementTypeActe complementTypeActe;

    public void setComplementTypeActe(final fr.cg95.cvq.business.request.civil.CscrComplementTypeActe complementTypeActe) {
        this.complementTypeActe = complementTypeActe;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="complement_type_acte_id")
      
    public fr.cg95.cvq.business.request.civil.CscrComplementTypeActe getComplementTypeActe() {
        return this.complementTypeActe;
    }
  
    
      @NotNull(
        
        
        profiles = {"acte"},
        message = "dateEvenement"
      )
    
    private java.util.Date dateEvenement;

    public void setDateEvenement(final java.util.Date dateEvenement) {
        this.dateEvenement = dateEvenement;
    }

 
    @Column(name="date_evenement"  )
      
    public java.util.Date getDateEvenement() {
        return this.dateEvenement;
    }
  
    
      @NotNull(
        
        
        profiles = {"acte"},
        message = "formatActe"
      )
    
    private fr.cg95.cvq.business.request.civil.CscFormatActeType formatActe;

    public void setFormatActe(final fr.cg95.cvq.business.request.civil.CscFormatActeType formatActe) {
        this.formatActe = formatActe;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="format_acte"  )
      
    public fr.cg95.cvq.business.request.civil.CscFormatActeType getFormatActe() {
        return this.formatActe;
    }
  
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['typeDemandeur'].test('estAdministration='+_this.typeDemandeur.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"informations"},
        message = "informationsAdministration"
      )
    
    private fr.cg95.cvq.business.request.civil.CscrInformationsAdministration informationsAdministration;

    public void setInformationsAdministration(final fr.cg95.cvq.business.request.civil.CscrInformationsAdministration informationsAdministration) {
        this.informationsAdministration = informationsAdministration;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="informations_administration_id")
      
    public fr.cg95.cvq.business.request.civil.CscrInformationsAdministration getInformationsAdministration() {
        return this.informationsAdministration;
    }
  
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['typeDemandeur'].test('estJuridique='+_this.typeDemandeur.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"informations"},
        message = "informationsJuridique"
      )
    
    private fr.cg95.cvq.business.request.civil.CscrInformationsJuridique informationsJuridique;

    public void setInformationsJuridique(final fr.cg95.cvq.business.request.civil.CscrInformationsJuridique informationsJuridique) {
        this.informationsJuridique = informationsJuridique;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="informations_juridique_id")
      
    public fr.cg95.cvq.business.request.civil.CscrInformationsJuridique getInformationsJuridique() {
        return this.informationsJuridique;
    }
  
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['typeDemandeur'].test('estParticulier='+_this.typeDemandeur.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"informations"},
        message = "informationsParticulier"
      )
    
    private fr.cg95.cvq.business.request.civil.CscrInformationsParticulier informationsParticulier;

    public void setInformationsParticulier(final fr.cg95.cvq.business.request.civil.CscrInformationsParticulier informationsParticulier) {
        this.informationsParticulier = informationsParticulier;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="informations_particulier_id")
      
    public fr.cg95.cvq.business.request.civil.CscrInformationsParticulier getInformationsParticulier() {
        return this.informationsParticulier;
    }
  
    
      @NotNull(
        
        
        profiles = {"acte"},
        message = "motif"
      )
    
    private fr.cg95.cvq.business.request.civil.CscMotifType motif;

    public void setMotif(final fr.cg95.cvq.business.request.civil.CscMotifType motif) {
        this.motif = motif;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="motif"  )
      
    public fr.cg95.cvq.business.request.civil.CscMotifType getMotif() {
        return this.motif;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"acte"},
        message = "nomTitulaireActe"
      )
    
      @NotNull(
        
        
        profiles = {"acte"},
        message = "nomTitulaireActe"
      )
    
      @NotBlank(
        
        
        profiles = {"acte"},
        message = "nomTitulaireActe"
      )
    
    private String nomTitulaireActe;

    public void setNomTitulaireActe(final String nomTitulaireActe) {
        this.nomTitulaireActe = nomTitulaireActe;
    }

 
    @Column(name="nom_titulaire_acte" , length=38 )
      
    public String getNomTitulaireActe() {
        return this.nomTitulaireActe;
    }
  
    
      @NotNull(
        
        
        profiles = {"acte"},
        message = "nombreActes"
      )
    
    private java.math.BigInteger nombreActes;

    public void setNombreActes(final java.math.BigInteger nombreActes) {
        this.nombreActes = nombreActes;
    }

 
    @Column(name="nombre_actes" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getNombreActes() {
        return this.nombreActes;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['motif'].test(_this.motif.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"acte"},
        message = "precisionAutreMotif"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['motif'].test(_this.motif.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"acte"},
        message = "precisionAutreMotif"
      )
    
    private String precisionAutreMotif;

    public void setPrecisionAutreMotif(final String precisionAutreMotif) {
        this.precisionAutreMotif = precisionAutreMotif;
    }

 
    @Column(name="precision_autre_motif"  )
      
    public String getPrecisionAutreMotif() {
        return this.precisionAutreMotif;
    }
  
    
      @NotNull(
        
        
        profiles = {"acte"},
        message = "prenomsTitulaireActe"
      )
    
      @NotBlank(
        
        
        profiles = {"acte"},
        message = "prenomsTitulaireActe"
      )
    
    private String prenomsTitulaireActe;

    public void setPrenomsTitulaireActe(final String prenomsTitulaireActe) {
        this.prenomsTitulaireActe = prenomsTitulaireActe;
    }

 
    @Column(name="prenoms_titulaire_acte"  )
      
    public String getPrenomsTitulaireActe() {
        return this.prenomsTitulaireActe;
    }
  
    
    private fr.cg95.cvq.business.request.civil.CscTypeActeType typeActe;

    public void setTypeActe(final fr.cg95.cvq.business.request.civil.CscTypeActeType typeActe) {
        this.typeActe = typeActe;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="type_acte"  )
      
    public fr.cg95.cvq.business.request.civil.CscTypeActeType getTypeActe() {
        return this.typeActe;
    }
  
    
      @NotNull(
        
        
        profiles = {"informations"},
        message = "typeDemandeur"
      )
    
    private fr.cg95.cvq.business.request.civil.CscTypeDemandeurType typeDemandeur;

    public void setTypeDemandeur(final fr.cg95.cvq.business.request.civil.CscTypeDemandeurType typeDemandeur) {
        this.typeDemandeur = typeDemandeur;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="type_demandeur"  )
      
    public fr.cg95.cvq.business.request.civil.CscTypeDemandeurType getTypeDemandeur() {
        return this.typeDemandeur;
    }
  
}
