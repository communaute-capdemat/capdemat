
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
 *  table="rsr_request_information"
 *  lazy="false"
 */
public class RsrRequestInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public RsrRequestInformation() {
        super();
      
        requestInformationEmergency = Boolean.valueOf(false);
      
        requestInformationRequestKind = fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType.INDIVIDUAL;
      
    }

    public final String modelToXmlString() {
        RsrRequestInformationType object = (RsrRequestInformationType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final RsrRequestInformationType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        RsrRequestInformationType rsrRequestInformation = RsrRequestInformationType.Factory.newInstance();
        int i = 0;
    
        if (this.requestInformationEmergency != null)
            rsrRequestInformation.setRequestInformationEmergency(this.requestInformationEmergency.booleanValue());
      
        if (this.requestInformationRequestKind != null)
            rsrRequestInformation.setRequestInformationRequestKind(fr.cg95.cvq.xml.request.social.RsrRequestInformationRequestKindType.Enum.forString(this.requestInformationRequestKind.toString()));
      
        rsrRequestInformation.setRequestInformationEmergencyMotive(this.requestInformationEmergencyMotive);
      
        return rsrRequestInformation;
    }

    public static RsrRequestInformation xmlToModel(RsrRequestInformationType rsrRequestInformationDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        RsrRequestInformation rsrRequestInformation = new RsrRequestInformation();
    
        rsrRequestInformation.setRequestInformationEmergency(Boolean.valueOf(rsrRequestInformationDoc.getRequestInformationEmergency()));
      
        if (rsrRequestInformationDoc.getRequestInformationRequestKind() != null)
            rsrRequestInformation.setRequestInformationRequestKind(fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType.forString(rsrRequestInformationDoc.getRequestInformationRequestKind().toString()));
        else
            rsrRequestInformation.setRequestInformationRequestKind(fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType.getDefaultRsrRequestInformationRequestKindType());
      
        rsrRequestInformation.setRequestInformationEmergencyMotive(rsrRequestInformationDoc.getRequestInformationEmergencyMotive());
      
        return rsrRequestInformation;
    }

    @Override
    public RsrRequestInformation clone() {
        RsrRequestInformation result = new RsrRequestInformation();
        
          
            
        result.setRequestInformationEmergency(requestInformationEmergency);
      
          
        
          
            
        if (requestInformationRequestKind != null)
            result.setRequestInformationRequestKind(requestInformationRequestKind);
        else
            result.setRequestInformationRequestKind(fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType.getDefaultRsrRequestInformationRequestKindType());
      
          
        
          
            
        result.setRequestInformationEmergencyMotive(requestInformationEmergencyMotive);
      
          
        
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
        
        
        profiles = {"subject"},
        message = "requestInformationEmergency"
      )
    
    private Boolean requestInformationEmergency;

    public final void setRequestInformationEmergency(final Boolean requestInformationEmergency) {
        this.requestInformationEmergency = requestInformationEmergency;
    }

    /**
  
        * @hibernate.property
        *  column="request_information_emergency"
        
      
    */
    public final Boolean getRequestInformationEmergency() {
        return this.requestInformationEmergency;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "requestInformationRequestKind"
      )
    
    private fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType requestInformationRequestKind;

    public final void setRequestInformationRequestKind(final fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType requestInformationRequestKind) {
        this.requestInformationRequestKind = requestInformationRequestKind;
    }

    /**
  
        * @hibernate.property
        *  column="request_information_request_kind"
        
      
    */
    public final fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType getRequestInformationRequestKind() {
        return this.requestInformationRequestKind;
    }
  
    
      @MaxLength(
        
          value = 180,
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['rsrRequestInformation.requestInformationEmergency'].test(_this.requestInformationEmergency.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "requestInformationEmergencyMotive"
      )
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['rsrRequestInformation.requestInformationEmergency'].test(_this.requestInformationEmergency.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "requestInformationEmergencyMotive"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['rsrRequestInformation.requestInformationEmergency'].test(_this.requestInformationEmergency.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "requestInformationEmergencyMotive"
      )
    
    private String requestInformationEmergencyMotive;

    public final void setRequestInformationEmergencyMotive(final String requestInformationEmergencyMotive) {
        this.requestInformationEmergencyMotive = requestInformationEmergencyMotive;
    }

    /**
  
        * @hibernate.property
        *  column="request_information_emergency_motive"
        *  length="180"
      
    */
    public final String getRequestInformationEmergencyMotive() {
        return this.requestInformationEmergencyMotive;
    }
  
}
