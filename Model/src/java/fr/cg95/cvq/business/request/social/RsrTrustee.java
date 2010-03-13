
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
 *  table="rsr_trustee"
 *  lazy="false"
 */
public class RsrTrustee implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

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
        message = "trusteeFirstName"
      )
    
    private String trusteeFirstName;

    public final void setTrusteeFirstName(final String trusteeFirstName) {
        this.trusteeFirstName = trusteeFirstName;
    }

    /**
  
        * @hibernate.property
        *  column="trustee_first_name"
        *  length="38"
      
    */
    public final String getTrusteeFirstName() {
        return this.trusteeFirstName;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"contact"},
        message = "trusteeLastName"
      )
    
    private String trusteeLastName;

    public final void setTrusteeLastName(final String trusteeLastName) {
        this.trusteeLastName = trusteeLastName;
    }

    /**
  
        * @hibernate.property
        *  column="trustee_last_name"
        *  length="38"
      
    */
    public final String getTrusteeLastName() {
        return this.trusteeLastName;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"contact"},
        message = "trusteePhone"
      )
    
    private String trusteePhone;

    public final void setTrusteePhone(final String trusteePhone) {
        this.trusteePhone = trusteePhone;
    }

    /**
  
        * @hibernate.property
        *  column="trustee_phone"
        *  length="10"
      
    */
    public final String getTrusteePhone() {
        return this.trusteePhone;
    }
  
}
