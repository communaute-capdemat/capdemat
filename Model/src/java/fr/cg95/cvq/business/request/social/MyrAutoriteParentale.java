
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
 *  table="myr_autorite_parentale"
 *  lazy="false"
 */
public class MyrAutoriteParentale implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public MyrAutoriteParentale() {
        super();
      
    }

    public final String modelToXmlString() {
        MyrAutoriteParentaleType object = (MyrAutoriteParentaleType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MyrAutoriteParentaleType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MyrAutoriteParentaleType myrAutoriteParentale = MyrAutoriteParentaleType.Factory.newInstance();
        int i = 0;
    
        myrAutoriteParentale.setNom(this.nom);
      
        myrAutoriteParentale.setEmail(this.email);
      
        myrAutoriteParentale.setTelephone(this.telephone);
      
        myrAutoriteParentale.setFax(this.fax);
      
        myrAutoriteParentale.setPrenom(this.prenom);
      
        if (this.domiciliation != null)
            myrAutoriteParentale.setDomiciliation(this.domiciliation.modelToXml());
      
        return myrAutoriteParentale;
    }

    public static MyrAutoriteParentale xmlToModel(MyrAutoriteParentaleType myrAutoriteParentaleDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MyrAutoriteParentale myrAutoriteParentale = new MyrAutoriteParentale();
    
        myrAutoriteParentale.setNom(myrAutoriteParentaleDoc.getNom());
      
        myrAutoriteParentale.setEmail(myrAutoriteParentaleDoc.getEmail());
      
        myrAutoriteParentale.setTelephone(myrAutoriteParentaleDoc.getTelephone());
      
        myrAutoriteParentale.setFax(myrAutoriteParentaleDoc.getFax());
      
        myrAutoriteParentale.setPrenom(myrAutoriteParentaleDoc.getPrenom());
      
        if (myrAutoriteParentaleDoc.getDomiciliation() != null)
            myrAutoriteParentale.setDomiciliation(Address.xmlToModel(myrAutoriteParentaleDoc.getDomiciliation()));
      
        return myrAutoriteParentale;
    }

    @Override
    public MyrAutoriteParentale clone() {
        MyrAutoriteParentale result = new MyrAutoriteParentale();
        
          
            
        result.setNom(nom);
      
          
        
          
            
        result.setEmail(email);
      
          
        
          
            
        result.setTelephone(telephone);
      
          
        
          
            
        result.setFax(fax);
      
          
        
          
            
        result.setPrenom(prenom);
      
          
        
          
            
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
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"autoriteParentale"},
        message = "prenom"
      )
    
    private String prenom;

    public final void setPrenom(final String prenom) {
        this.prenom = prenom;
    }

    /**
  
        * @hibernate.property
        *  column="prenom"
        *  length="38"
      
    */
    public final String getPrenom() {
        return this.prenom;
    }
  
    
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
