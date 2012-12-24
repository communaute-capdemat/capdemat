
package fr.cg95.cvq.business.request.school;

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
import fr.cg95.cvq.xml.request.school.*;
import fr.cg95.cvq.service.request.LocalReferential;
import fr.cg95.cvq.service.request.condition.IConditionChecker;
import javax.persistence.*;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Type;

/**
 * Generated class file, do not edit !
 */
@Entity
@Table(name="frere_ou_soeur_informations")
public class FrereOuSoeurInformations implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        SchoolTransportRegistrationRequest.conditions;

    public FrereOuSoeurInformations() {
        super();
      
    }

    public final String modelToXmlString() {
        FrereOuSoeurInformationsType object = (FrereOuSoeurInformationsType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final FrereOuSoeurInformationsType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        FrereOuSoeurInformationsType frereOuSoeurInformations = FrereOuSoeurInformationsType.Factory.newInstance();
        int i = 0;
    
        frereOuSoeurInformations.setFrereOuSoeurNom(this.frereOuSoeurNom);
      
        frereOuSoeurInformations.setFrereOuSoeurEcole(this.frereOuSoeurEcole);
      
        frereOuSoeurInformations.setFrereOuSoeurPrenom(this.frereOuSoeurPrenom);
      
        frereOuSoeurInformations.setFrereOuSoeurClasse(this.frereOuSoeurClasse);
      
        return frereOuSoeurInformations;
    }

    public static FrereOuSoeurInformations xmlToModel(FrereOuSoeurInformationsType frereOuSoeurInformationsDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        FrereOuSoeurInformations frereOuSoeurInformations = new FrereOuSoeurInformations();
    
        frereOuSoeurInformations.setFrereOuSoeurNom(frereOuSoeurInformationsDoc.getFrereOuSoeurNom());
      
        frereOuSoeurInformations.setFrereOuSoeurEcole(frereOuSoeurInformationsDoc.getFrereOuSoeurEcole());
      
        frereOuSoeurInformations.setFrereOuSoeurPrenom(frereOuSoeurInformationsDoc.getFrereOuSoeurPrenom());
      
        frereOuSoeurInformations.setFrereOuSoeurClasse(frereOuSoeurInformationsDoc.getFrereOuSoeurClasse());
      
        return frereOuSoeurInformations;
    }

    @Override
    public FrereOuSoeurInformations clone() {
        FrereOuSoeurInformations result = new FrereOuSoeurInformations();
        
          
            
        result.setFrereOuSoeurNom(frereOuSoeurNom);
      
          
        
          
            
        result.setFrereOuSoeurEcole(frereOuSoeurEcole);
      
          
        
          
            
        result.setFrereOuSoeurPrenom(frereOuSoeurPrenom);
      
          
        
          
            
        result.setFrereOuSoeurClasse(frereOuSoeurClasse);
      
          
        
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

  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"autorisations"},
        message = "frereOuSoeurNom"
      )
    
      @NotNull(
        
        
        profiles = {"autorisations"},
        message = "frereOuSoeurNom"
      )
    
      @NotBlank(
        
        
        profiles = {"autorisations"},
        message = "frereOuSoeurNom"
      )
    
    private String frereOuSoeurNom;

    public void setFrereOuSoeurNom(final String frereOuSoeurNom) {
        this.frereOuSoeurNom = frereOuSoeurNom;
    }

    
    @Column(name="frere_ou_soeur_nom" , length=38 )
      
    public String getFrereOuSoeurNom() {
        return this.frereOuSoeurNom;
    }
  
    
      @NotNull(
        
        
        profiles = {"autorisations"},
        message = "frereOuSoeurEcole"
      )
    
      @NotBlank(
        
        
        profiles = {"autorisations"},
        message = "frereOuSoeurEcole"
      )
    
    private String frereOuSoeurEcole;

    public void setFrereOuSoeurEcole(final String frereOuSoeurEcole) {
        this.frereOuSoeurEcole = frereOuSoeurEcole;
    }

    
    @Column(name="frere_ou_soeur_ecole"  )
      
    public String getFrereOuSoeurEcole() {
        return this.frereOuSoeurEcole;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"autorisations"},
        message = "frereOuSoeurPrenom"
      )
    
      @NotNull(
        
        
        profiles = {"autorisations"},
        message = "frereOuSoeurPrenom"
      )
    
      @NotBlank(
        
        
        profiles = {"autorisations"},
        message = "frereOuSoeurPrenom"
      )
    
    private String frereOuSoeurPrenom;

    public void setFrereOuSoeurPrenom(final String frereOuSoeurPrenom) {
        this.frereOuSoeurPrenom = frereOuSoeurPrenom;
    }

    
    @Column(name="frere_ou_soeur_prenom" , length=38 )
      
    public String getFrereOuSoeurPrenom() {
        return this.frereOuSoeurPrenom;
    }
  
    
      @NotNull(
        
        
        profiles = {"autorisations"},
        message = "frereOuSoeurClasse"
      )
    
      @NotBlank(
        
        
        profiles = {"autorisations"},
        message = "frereOuSoeurClasse"
      )
    
    private String frereOuSoeurClasse;

    public void setFrereOuSoeurClasse(final String frereOuSoeurClasse) {
        this.frereOuSoeurClasse = frereOuSoeurClasse;
    }

    
    @Column(name="frere_ou_soeur_classe"  )
      
    public String getFrereOuSoeurClasse() {
        return this.frereOuSoeurClasse;
    }
  
}
