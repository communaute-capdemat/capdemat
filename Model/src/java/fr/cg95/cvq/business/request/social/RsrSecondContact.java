
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
@Table(name="rsr_second_contact")
public class RsrSecondContact implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        RemoteSupportRequest.conditions;

    public RsrSecondContact() {
        super();
      
    }

    public final String modelToXmlString() {
        RsrSecondContactType object = (RsrSecondContactType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final RsrSecondContactType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        RsrSecondContactType rsrSecondContact = RsrSecondContactType.Factory.newInstance();
        int i = 0;
    
        rsrSecondContact.setSecondContactPhone(this.secondContactPhone);
      
        rsrSecondContact.setSecondContactLastName(this.secondContactLastName);
      
        rsrSecondContact.setSecondContactFirstName(this.secondContactFirstName);
      
        return rsrSecondContact;
    }

    public static RsrSecondContact xmlToModel(RsrSecondContactType rsrSecondContactDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        RsrSecondContact rsrSecondContact = new RsrSecondContact();
    
        rsrSecondContact.setSecondContactPhone(rsrSecondContactDoc.getSecondContactPhone());
      
        rsrSecondContact.setSecondContactLastName(rsrSecondContactDoc.getSecondContactLastName());
      
        rsrSecondContact.setSecondContactFirstName(rsrSecondContactDoc.getSecondContactFirstName());
      
        return rsrSecondContact;
    }

    @Override
    public RsrSecondContact clone() {
        RsrSecondContact result = new RsrSecondContact();
        
          
            
        result.setSecondContactPhone(secondContactPhone);
      
          
        
          
            
        result.setSecondContactLastName(secondContactLastName);
      
          
        
          
            
        result.setSecondContactFirstName(secondContactFirstName);
      
          
        
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
        
          value = 10,
        
        
        profiles = {"contact"},
        message = "secondContactPhone"
      )
    
    private String secondContactPhone;

    public void setSecondContactPhone(final String secondContactPhone) {
        this.secondContactPhone = secondContactPhone;
    }

    
    @Column(name="second_contact_phone" , length=10 )
      
    public String getSecondContactPhone() {
        return this.secondContactPhone;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"contact"},
        message = "secondContactLastName"
      )
    
    private String secondContactLastName;

    public void setSecondContactLastName(final String secondContactLastName) {
        this.secondContactLastName = secondContactLastName;
    }

    
    @Column(name="second_contact_last_name" , length=38 )
      
    public String getSecondContactLastName() {
        return this.secondContactLastName;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"contact"},
        message = "secondContactFirstName"
      )
    
    private String secondContactFirstName;

    public void setSecondContactFirstName(final String secondContactFirstName) {
        this.secondContactFirstName = secondContactFirstName;
    }

    
    @Column(name="second_contact_first_name" , length=38 )
      
    public String getSecondContactFirstName() {
        return this.secondContactFirstName;
    }
  
}