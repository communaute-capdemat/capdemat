
package fr.cg95.cvq.business.request.localpolice;

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
import fr.cg95.cvq.xml.request.localpolice.*;
import fr.cg95.cvq.service.request.LocalReferential;
import fr.cg95.cvq.service.request.condition.IConditionChecker;

/**
 * Generated class file, do not edit !
 *
 * @hibernate.class
 *  table="hsr_other_contact"
 *  lazy="false"
 */
public class HsrOtherContact implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public HsrOtherContact() {
        super();
      
    }

    public final String modelToXmlString() {
        HsrOtherContactType object = (HsrOtherContactType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final HsrOtherContactType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        HsrOtherContactType hsrOtherContact = HsrOtherContactType.Factory.newInstance();
        int i = 0;
    
        if (this.otherContactAddress != null)
            hsrOtherContact.setOtherContactAddress(this.otherContactAddress.modelToXml());
      
        hsrOtherContact.setOtherContactFirstName(this.otherContactFirstName);
      
        hsrOtherContact.setOtherContactPhone(this.otherContactPhone);
      
        hsrOtherContact.setOtherContactLastName(this.otherContactLastName);
      
        return hsrOtherContact;
    }

    public static HsrOtherContact xmlToModel(HsrOtherContactType hsrOtherContactDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        HsrOtherContact hsrOtherContact = new HsrOtherContact();
    
        if (hsrOtherContactDoc.getOtherContactAddress() != null)
            hsrOtherContact.setOtherContactAddress(Address.xmlToModel(hsrOtherContactDoc.getOtherContactAddress()));
      
        hsrOtherContact.setOtherContactFirstName(hsrOtherContactDoc.getOtherContactFirstName());
      
        hsrOtherContact.setOtherContactPhone(hsrOtherContactDoc.getOtherContactPhone());
      
        hsrOtherContact.setOtherContactLastName(hsrOtherContactDoc.getOtherContactLastName());
      
        return hsrOtherContact;
    }

    @Override
    public HsrOtherContact clone() {
        HsrOtherContact result = new HsrOtherContact();
        
          
            
        if (otherContactAddress != null)
            result.setOtherContactAddress(otherContactAddress.clone());
      
          
        
          
            
        result.setOtherContactFirstName(otherContactFirstName);
      
          
        
          
            
        result.setOtherContactPhone(otherContactPhone);
      
          
        
          
            
        result.setOtherContactLastName(otherContactLastName);
      
          
        
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

  
    
      @NotNull(
        
        
        profiles = {"contact"},
        message = "otherContactAddress"
      )
    
      @AssertValid(
        
        
        profiles = {"contact"},
        message = "otherContactAddress"
      )
    
    private fr.cg95.cvq.business.users.Address otherContactAddress;

    public final void setOtherContactAddress(final fr.cg95.cvq.business.users.Address otherContactAddress) {
        this.otherContactAddress = otherContactAddress;
    }

    /**
  
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="other_contact_address_id"
        *  class="fr.cg95.cvq.business.users.Address"
      
    */
    public final fr.cg95.cvq.business.users.Address getOtherContactAddress() {
        return this.otherContactAddress;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"contact"},
        message = "otherContactFirstName"
      )
    
      @NotNull(
        
        
        profiles = {"contact"},
        message = "otherContactFirstName"
      )
    
      @NotBlank(
        
        
        profiles = {"contact"},
        message = "otherContactFirstName"
      )
    
    private String otherContactFirstName;

    public final void setOtherContactFirstName(final String otherContactFirstName) {
        this.otherContactFirstName = otherContactFirstName;
    }

    /**
  
        * @hibernate.property
        *  column="other_contact_first_name"
        *  length="38"
      
    */
    public final String getOtherContactFirstName() {
        return this.otherContactFirstName;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"contact"},
        message = "otherContactPhone"
      )
    
      @NotNull(
        
        
        profiles = {"contact"},
        message = "otherContactPhone"
      )
    
      @NotBlank(
        
        
        profiles = {"contact"},
        message = "otherContactPhone"
      )
    
    private String otherContactPhone;

    public final void setOtherContactPhone(final String otherContactPhone) {
        this.otherContactPhone = otherContactPhone;
    }

    /**
  
        * @hibernate.property
        *  column="other_contact_phone"
        *  length="10"
      
    */
    public final String getOtherContactPhone() {
        return this.otherContactPhone;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"contact"},
        message = "otherContactLastName"
      )
    
      @NotNull(
        
        
        profiles = {"contact"},
        message = "otherContactLastName"
      )
    
      @NotBlank(
        
        
        profiles = {"contact"},
        message = "otherContactLastName"
      )
    
    private String otherContactLastName;

    public final void setOtherContactLastName(final String otherContactLastName) {
        this.otherContactLastName = otherContactLastName;
    }

    /**
  
        * @hibernate.property
        *  column="other_contact_last_name"
        *  length="38"
      
    */
    public final String getOtherContactLastName() {
        return this.otherContactLastName;
    }
  
}
