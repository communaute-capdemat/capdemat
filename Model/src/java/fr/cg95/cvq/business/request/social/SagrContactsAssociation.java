
package fr.cg95.cvq.business.request.social;

import java.io.Serializable;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import org.joda.time.LocalTime;

import net.sf.oval.constraint.*;
import org.apache.xmlbeans.XmlOptions;
import fr.cg95.cvq.business.authority.*;
import fr.cg95.cvq.business.request.*;
import fr.cg95.cvq.business.users.*;
import fr.cg95.cvq.xml.common.RequestType;
import fr.cg95.cvq.xml.common.*;
import fr.cg95.cvq.xml.request.social.*;
import fr.cg95.cvq.service.request.LocalReferential;
import fr.cg95.cvq.service.request.condition.IConditionChecker;
import javax.persistence.*;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Type;

/**
 * Generated class file, do not edit !
 */
@Entity
@Table(name="sagr_contacts_association")
public class SagrContactsAssociation implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        SportsAssociationsGrantRequest.conditions;

    public SagrContactsAssociation() {
        super();
      
        estAdresseCorrespondantPrincipal = Boolean.valueOf(true);
      
    }

    public final String modelToXmlString() {
        SagrContactsAssociationType object = (SagrContactsAssociationType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final SagrContactsAssociationType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        SagrContactsAssociationType sagrContactsAssociation = SagrContactsAssociationType.Factory.newInstance();
        int i = 0;
    
        sagrContactsAssociation.setNomCompletCorrespondantPrincipal(this.nomCompletCorrespondantPrincipal);
      
        sagrContactsAssociation.setEmailClubOuCorrespondant(this.emailClubOuCorrespondant);
      
        if (this.estAdresseCorrespondantPrincipal != null)
            sagrContactsAssociation.setEstAdresseCorrespondantPrincipal(this.estAdresseCorrespondantPrincipal.booleanValue());
      
        if (this.adresseCorrespondantPrincipal != null)
            sagrContactsAssociation.setAdresseCorrespondantPrincipal(this.adresseCorrespondantPrincipal.modelToXml());
      
        return sagrContactsAssociation;
    }

    public static SagrContactsAssociation xmlToModel(SagrContactsAssociationType sagrContactsAssociationDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        SagrContactsAssociation sagrContactsAssociation = new SagrContactsAssociation();
    
        sagrContactsAssociation.setNomCompletCorrespondantPrincipal(sagrContactsAssociationDoc.getNomCompletCorrespondantPrincipal());
      
        sagrContactsAssociation.setEmailClubOuCorrespondant(sagrContactsAssociationDoc.getEmailClubOuCorrespondant());
      
        sagrContactsAssociation.setEstAdresseCorrespondantPrincipal(Boolean.valueOf(sagrContactsAssociationDoc.getEstAdresseCorrespondantPrincipal()));
      
        if (sagrContactsAssociationDoc.getAdresseCorrespondantPrincipal() != null)
            sagrContactsAssociation.setAdresseCorrespondantPrincipal(Address.xmlToModel(sagrContactsAssociationDoc.getAdresseCorrespondantPrincipal()));
      
        return sagrContactsAssociation;
    }

    @Override
    public SagrContactsAssociation clone() {
        SagrContactsAssociation result = new SagrContactsAssociation();
        
          
            
        result.setNomCompletCorrespondantPrincipal(nomCompletCorrespondantPrincipal);
      
          
        
          
            
        result.setEmailClubOuCorrespondant(emailClubOuCorrespondant);
      
          
        
          
            
        result.setEstAdresseCorrespondantPrincipal(estAdresseCorrespondantPrincipal);
      
          
        
          
            
        if (adresseCorrespondantPrincipal != null)
            result.setAdresseCorrespondantPrincipal(adresseCorrespondantPrincipal.clone());
      
          
        
        return result;
    }

    private Long id;

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
          
             "active &= _this.conditions['sagrContactsAssociation.estAdresseCorrespondantPrincipal'].test(_this.estAdresseCorrespondantPrincipal.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"association"},
        message = "nomCompletCorrespondantPrincipal"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['sagrContactsAssociation.estAdresseCorrespondantPrincipal'].test(_this.estAdresseCorrespondantPrincipal.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"association"},
        message = "nomCompletCorrespondantPrincipal"
      )
    
    private String nomCompletCorrespondantPrincipal;

    public void setNomCompletCorrespondantPrincipal(final String nomCompletCorrespondantPrincipal) {
        this.nomCompletCorrespondantPrincipal = nomCompletCorrespondantPrincipal;
    }

    
    @Column(name="nom_complet_correspondant_principal"  )
      
    public String getNomCompletCorrespondantPrincipal() {
        return this.nomCompletCorrespondantPrincipal;
    }
  
    
    private String emailClubOuCorrespondant;

    public void setEmailClubOuCorrespondant(final String emailClubOuCorrespondant) {
        this.emailClubOuCorrespondant = emailClubOuCorrespondant;
    }

    
    @Column(name="email_club_ou_correspondant"  )
      
    public String getEmailClubOuCorrespondant() {
        return this.emailClubOuCorrespondant;
    }
  
    
      @NotNull(
        
        
        profiles = {"association"},
        message = "estAdresseCorrespondantPrincipal"
      )
    
    private Boolean estAdresseCorrespondantPrincipal;

    public void setEstAdresseCorrespondantPrincipal(final Boolean estAdresseCorrespondantPrincipal) {
        this.estAdresseCorrespondantPrincipal = estAdresseCorrespondantPrincipal;
    }

    
    @Column(name="est_adresse_correspondant_principal"  )
      
    public Boolean getEstAdresseCorrespondantPrincipal() {
        return this.estAdresseCorrespondantPrincipal;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['sagrContactsAssociation.estAdresseCorrespondantPrincipal'].test(_this.estAdresseCorrespondantPrincipal.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"association"},
        message = "adresseCorrespondantPrincipal"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['sagrContactsAssociation.estAdresseCorrespondantPrincipal'].test(_this.estAdresseCorrespondantPrincipal.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"association"},
        message = "adresseCorrespondantPrincipal"
      )
    
    private fr.cg95.cvq.business.users.Address adresseCorrespondantPrincipal;

    public void setAdresseCorrespondantPrincipal(final fr.cg95.cvq.business.users.Address adresseCorrespondantPrincipal) {
        this.adresseCorrespondantPrincipal = adresseCorrespondantPrincipal;
    }

    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="adresse_correspondant_principal_id")
      
    public fr.cg95.cvq.business.users.Address getAdresseCorrespondantPrincipal() {
        return this.adresseCorrespondantPrincipal;
    }
  
}
