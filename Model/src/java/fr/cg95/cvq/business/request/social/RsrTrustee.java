
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
@Table(name="rsr_trustee")
public class RsrTrustee implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        RemoteSupportRequest.conditions;

    public RsrTrustee() {
        super();
      
    }

    public final String modelToXmlString() {
        RsrTrusteeType object = (RsrTrusteeType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final RsrTrusteeType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        RsrTrusteeType rsrTrustee = RsrTrusteeType.Factory.newInstance();
        int i = 0;
    
        rsrTrustee.setTrusteeFirstName(this.trusteeFirstName);
      
        rsrTrustee.setTrusteeLastName(this.trusteeLastName);
      
        rsrTrustee.setTrusteePhone(this.trusteePhone);
      
        return rsrTrustee;
    }

    public static RsrTrustee xmlToModel(RsrTrusteeType rsrTrusteeDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        RsrTrustee rsrTrustee = new RsrTrustee();
    
        rsrTrustee.setTrusteeFirstName(rsrTrusteeDoc.getTrusteeFirstName());
      
        rsrTrustee.setTrusteeLastName(rsrTrusteeDoc.getTrusteeLastName());
      
        rsrTrustee.setTrusteePhone(rsrTrusteeDoc.getTrusteePhone());
      
        return rsrTrustee;
    }

    @Override
    public RsrTrustee clone() {
        RsrTrustee result = new RsrTrustee();
        
          
            
        result.setTrusteeFirstName(trusteeFirstName);
      
          
        
          
            
        result.setTrusteeLastName(trusteeLastName);
      
          
        
          
            
        result.setTrusteePhone(trusteePhone);
      
          
        
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
        
        
        profiles = {"contact"},
        message = "trusteeFirstName"
      )
    
    private String trusteeFirstName;

    public void setTrusteeFirstName(final String trusteeFirstName) {
        this.trusteeFirstName = trusteeFirstName;
    }

    
    @Column(name="trustee_first_name" , length=38 )
      
    public String getTrusteeFirstName() {
        return this.trusteeFirstName;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"contact"},
        message = "trusteeLastName"
      )
    
    private String trusteeLastName;

    public void setTrusteeLastName(final String trusteeLastName) {
        this.trusteeLastName = trusteeLastName;
    }

    
    @Column(name="trustee_last_name" , length=38 )
      
    public String getTrusteeLastName() {
        return this.trusteeLastName;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"contact"},
        message = "trusteePhone"
      )
    
    private String trusteePhone;

    public void setTrusteePhone(final String trusteePhone) {
        this.trusteePhone = trusteePhone;
    }

    
    @Column(name="trustee_phone" , length=10 )
      
    public String getTrusteePhone() {
        return this.trusteePhone;
    }
  
}
