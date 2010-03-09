
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

/**
 * Generated class file, do not edit !
 *
 * @hibernate.class
 *  table="myr_autorite_parentale_autre"
 *  lazy="false"
 */
public class MyrAutoriteParentaleAutre implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

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

    /**
     * @hibernate.id
     *  column="id"
     *  generator-class="sequence"
     */
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

    public final void setNom(final String nom) {
        this.nom = nom;
    }

    /**
  
        * @hibernate.property
        *  column="nom"
        *  length="38"
      
    */
    public final String getNom() {
        return this.nom;
    }
  
    
    private String email;

    public final void setEmail(final String email) {
        this.email = email;
    }

    /**
  
        * @hibernate.property
        *  column="email"
        
      
    */
    public final String getEmail() {
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

    public final void setTelephone(final String telephone) {
        this.telephone = telephone;
    }

    /**
  
        * @hibernate.property
        *  column="telephone"
        *  length="10"
      
    */
    public final String getTelephone() {
        return this.telephone;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"autoriteParentale"},
        message = "fax"
      )
    
    private String fax;

    public final void setFax(final String fax) {
        this.fax = fax;
    }

    /**
  
        * @hibernate.property
        *  column="fax"
        *  length="10"
      
    */
    public final String getFax() {
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

    public final void setDomiciliation(final fr.cg95.cvq.business.users.Address domiciliation) {
        this.domiciliation = domiciliation;
    }

    /**
  
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="domiciliation_id"
        *  class="fr.cg95.cvq.business.users.Address"
      
    */
    public final fr.cg95.cvq.business.users.Address getDomiciliation() {
        return this.domiciliation;
    }
  
}
