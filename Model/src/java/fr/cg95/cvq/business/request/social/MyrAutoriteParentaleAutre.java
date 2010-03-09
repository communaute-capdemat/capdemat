
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
@Table(name="myr_autorite_parentale_autre")
public class MyrAutoriteParentaleAutre implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        MdphYouthRequest.conditions;

    public MyrAutoriteParentaleAutre() {
        super();
      
    }

    public final String modelToXmlString() {
        MyrAutoriteParentaleAutreType object = (MyrAutoriteParentaleAutreType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MyrAutoriteParentaleAutreType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MyrAutoriteParentaleAutreType myrAutoriteParentaleAutre = MyrAutoriteParentaleAutreType.Factory.newInstance();
        int i = 0;
    
        myrAutoriteParentaleAutre.setNom(this.nom);
      
        myrAutoriteParentaleAutre.setEmail(this.email);
      
        myrAutoriteParentaleAutre.setTelephone(this.telephone);
      
        myrAutoriteParentaleAutre.setFax(this.fax);
      
        if (this.domiciliation != null)
            myrAutoriteParentaleAutre.setDomiciliation(this.domiciliation.modelToXml());
      
        return myrAutoriteParentaleAutre;
    }

    public static MyrAutoriteParentaleAutre xmlToModel(MyrAutoriteParentaleAutreType myrAutoriteParentaleAutreDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MyrAutoriteParentaleAutre myrAutoriteParentaleAutre = new MyrAutoriteParentaleAutre();
    
        myrAutoriteParentaleAutre.setNom(myrAutoriteParentaleAutreDoc.getNom());
      
        myrAutoriteParentaleAutre.setEmail(myrAutoriteParentaleAutreDoc.getEmail());
      
        myrAutoriteParentaleAutre.setTelephone(myrAutoriteParentaleAutreDoc.getTelephone());
      
        myrAutoriteParentaleAutre.setFax(myrAutoriteParentaleAutreDoc.getFax());
      
        if (myrAutoriteParentaleAutreDoc.getDomiciliation() != null)
            myrAutoriteParentaleAutre.setDomiciliation(Address.xmlToModel(myrAutoriteParentaleAutreDoc.getDomiciliation()));
      
        return myrAutoriteParentaleAutre;
    }

    @Override
    public MyrAutoriteParentaleAutre clone() {
        MyrAutoriteParentaleAutre result = new MyrAutoriteParentaleAutre();
        
          
            
        result.setNom(nom);
      
          
        
          
            
        result.setEmail(email);
      
          
        
          
            
        result.setTelephone(telephone);
      
          
        
          
            
        result.setFax(fax);
      
          
        
          
            
        if (domiciliation != null)
            result.setDomiciliation(domiciliation.clone());
      
          
        
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
        
        
        profiles = {"autoriteParentale"},
        message = "nom"
      )
    
      @NotNull(
        
        
        profiles = {"autoriteParentale"},
        message = "nom"
      )
    
      @NotBlank(
        
        
        profiles = {"autoriteParentale"},
        message = "nom"
      )
    
    private String nom;

    public void setNom(final String nom) {
        this.nom = nom;
    }

    
    @Column(name="nom" , length=38 )
      
    public String getNom() {
        return this.nom;
    }
  
    
    private String email;

    public void setEmail(final String email) {
        this.email = email;
    }

    
    @Column(name="email"  )
      
    public String getEmail() {
        return this.email;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"autoriteParentale"},
        message = "telephone"
      )
    
      @NotNull(
        
        
        profiles = {"autoriteParentale"},
        message = "telephone"
      )
    
      @NotBlank(
        
        
        profiles = {"autoriteParentale"},
        message = "telephone"
      )
    
    private String telephone;

    public void setTelephone(final String telephone) {
        this.telephone = telephone;
    }

    
    @Column(name="telephone" , length=10 )
      
    public String getTelephone() {
        return this.telephone;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"autoriteParentale"},
        message = "fax"
      )
    
    private String fax;

    public void setFax(final String fax) {
        this.fax = fax;
    }

    
    @Column(name="fax" , length=10 )
      
    public String getFax() {
        return this.fax;
    }
  
    
      @NotNull(
        
        
        profiles = {"autoriteParentale"},
        message = "domiciliation"
      )
    
      @AssertValid(
        
        
        profiles = {"autoriteParentale"},
        message = "domiciliation"
      )
    
    private fr.cg95.cvq.business.users.Address domiciliation;

    public void setDomiciliation(final fr.cg95.cvq.business.users.Address domiciliation) {
        this.domiciliation = domiciliation;
    }

    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="domiciliation_id")
      
    public fr.cg95.cvq.business.users.Address getDomiciliation() {
        return this.domiciliation;
    }
  
}
