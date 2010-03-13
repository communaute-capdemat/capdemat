
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
 *  table="rsr_contact"
 *  lazy="false"
 */
public class RsrContact implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public RsrContact() {
        super();
      
    }

    public final String modelToXmlString() {
        RsrContactType object = (RsrContactType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final RsrContactType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        RsrContactType rsrContact = RsrContactType.Factory.newInstance();
        int i = 0;
    
        rsrContact.setContactLastName(this.contactLastName);
      
        rsrContact.setContactFirstName(this.contactFirstName);
      
        rsrContact.setContactPhone(this.contactPhone);
      
        return rsrContact;
    }

    public static RsrContact xmlToModel(RsrContactType rsrContactDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        RsrContact rsrContact = new RsrContact();
    
        rsrContact.setContactLastName(rsrContactDoc.getContactLastName());
      
        rsrContact.setContactFirstName(rsrContactDoc.getContactFirstName());
      
        rsrContact.setContactPhone(rsrContactDoc.getContactPhone());
      
        return rsrContact;
    }

    @Override
    public RsrContact clone() {
        RsrContact result = new RsrContact();
        
          
            
        result.setContactLastName(contactLastName);
      
          
        
          
            
        result.setContactFirstName(contactFirstName);
      
          
        
          
            
        result.setContactPhone(contactPhone);
      
          
        
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
        
        
        profiles = {"contact"},
        message = "contactLastName"
      )
    
      @NotNull(
        
        
        profiles = {"contact"},
        message = "contactLastName"
      )
    
      @NotBlank(
        
        
        profiles = {"contact"},
        message = "contactLastName"
      )
    
    private String contactLastName;

    public final void setContactLastName(final String contactLastName) {
        this.contactLastName = contactLastName;
    }

    /**
  
        * @hibernate.property
        *  column="contact_last_name"
        *  length="38"
      
    */
    public final String getContactLastName() {
        return this.contactLastName;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"contact"},
        message = "contactFirstName"
      )
    
      @NotNull(
        
        
        profiles = {"contact"},
        message = "contactFirstName"
      )
    
      @NotBlank(
        
        
        profiles = {"contact"},
        message = "contactFirstName"
      )
    
    private String contactFirstName;

    public final void setContactFirstName(final String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    /**
  
        * @hibernate.property
        *  column="contact_first_name"
        *  length="38"
      
    */
    public final String getContactFirstName() {
        return this.contactFirstName;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"contact"},
        message = "contactPhone"
      )
    
      @NotNull(
        
        
        profiles = {"contact"},
        message = "contactPhone"
      )
    
      @NotBlank(
        
        
        profiles = {"contact"},
        message = "contactPhone"
      )
    
    private String contactPhone;

    public final void setContactPhone(final String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /**
  
        * @hibernate.property
        *  column="contact_phone"
        *  length="10"
      
    */
    public final String getContactPhone() {
        return this.contactPhone;
    }
  
}
