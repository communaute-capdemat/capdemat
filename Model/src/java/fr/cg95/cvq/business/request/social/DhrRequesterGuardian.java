
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
@Table(name="dhr_requester_guardian")
public class DhrRequesterGuardian implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        DomesticHelpRequest.conditions;

    public DhrRequesterGuardian() {
        super();
      
        dhrRequesterHaveGuardian = Boolean.valueOf(false);
      
    }

    public final String modelToXmlString() {
        DhrRequesterGuardianType object = (DhrRequesterGuardianType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final DhrRequesterGuardianType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        DhrRequesterGuardianType dhrRequesterGuardian = DhrRequesterGuardianType.Factory.newInstance();
        int i = 0;
    
        dhrRequesterGuardian.setDhrGuardianName(this.dhrGuardianName);
      
        if (this.dhrGuardianAddress != null)
            dhrRequesterGuardian.setDhrGuardianAddress(this.dhrGuardianAddress.modelToXml());
      
        if (this.dhrRequesterHaveGuardian != null)
            dhrRequesterGuardian.setDhrRequesterHaveGuardian(this.dhrRequesterHaveGuardian.booleanValue());
      
        if (this.dhrGuardianMeasure != null)
            dhrRequesterGuardian.setDhrGuardianMeasure(fr.cg95.cvq.xml.request.social.DhrGuardianMeasureType.Enum.forString(this.dhrGuardianMeasure.getLegacyLabel()));
      
        return dhrRequesterGuardian;
    }

    public static DhrRequesterGuardian xmlToModel(DhrRequesterGuardianType dhrRequesterGuardianDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        DhrRequesterGuardian dhrRequesterGuardian = new DhrRequesterGuardian();
    
        dhrRequesterGuardian.setDhrGuardianName(dhrRequesterGuardianDoc.getDhrGuardianName());
      
        if (dhrRequesterGuardianDoc.getDhrGuardianAddress() != null)
            dhrRequesterGuardian.setDhrGuardianAddress(Address.xmlToModel(dhrRequesterGuardianDoc.getDhrGuardianAddress()));
      
        dhrRequesterGuardian.setDhrRequesterHaveGuardian(Boolean.valueOf(dhrRequesterGuardianDoc.getDhrRequesterHaveGuardian()));
      
        if (dhrRequesterGuardianDoc.getDhrGuardianMeasure() != null)
            dhrRequesterGuardian.setDhrGuardianMeasure(fr.cg95.cvq.business.request.social.DhrGuardianMeasureType.forString(dhrRequesterGuardianDoc.getDhrGuardianMeasure().toString()));
        else
            dhrRequesterGuardian.setDhrGuardianMeasure(fr.cg95.cvq.business.request.social.DhrGuardianMeasureType.getDefaultDhrGuardianMeasureType());
      
        return dhrRequesterGuardian;
    }

    @Override
    public DhrRequesterGuardian clone() {
        DhrRequesterGuardian result = new DhrRequesterGuardian();
        
          
            
        result.setDhrGuardianName(dhrGuardianName);
      
          
        
          
            
        if (dhrGuardianAddress != null)
            result.setDhrGuardianAddress(dhrGuardianAddress.clone());
      
          
        
          
            
        result.setDhrRequesterHaveGuardian(dhrRequesterHaveGuardian);
      
          
        
          
            
        if (dhrGuardianMeasure != null)
            result.setDhrGuardianMeasure(dhrGuardianMeasure);
        else
            result.setDhrGuardianMeasure(fr.cg95.cvq.business.request.social.DhrGuardianMeasureType.getDefaultDhrGuardianMeasureType());
      
          
        
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
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['dhrRequesterGuardian.dhrRequesterHaveGuardian'].test(_this.dhrRequesterHaveGuardian.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "dhrGuardianName"
      )
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['dhrRequesterGuardian.dhrRequesterHaveGuardian'].test(_this.dhrRequesterHaveGuardian.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "dhrGuardianName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['dhrRequesterGuardian.dhrRequesterHaveGuardian'].test(_this.dhrRequesterHaveGuardian.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "dhrGuardianName"
      )
    
    private String dhrGuardianName;

    public void setDhrGuardianName(final String dhrGuardianName) {
        this.dhrGuardianName = dhrGuardianName;
    }

    
    @Column(name="dhr_guardian_name" , length=38 )
      
    public String getDhrGuardianName() {
        return this.dhrGuardianName;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['dhrRequesterGuardian.dhrRequesterHaveGuardian'].test(_this.dhrRequesterHaveGuardian.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "dhrGuardianAddress"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['dhrRequesterGuardian.dhrRequesterHaveGuardian'].test(_this.dhrRequesterHaveGuardian.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "dhrGuardianAddress"
      )
    
    private fr.cg95.cvq.business.users.Address dhrGuardianAddress;

    public void setDhrGuardianAddress(final fr.cg95.cvq.business.users.Address dhrGuardianAddress) {
        this.dhrGuardianAddress = dhrGuardianAddress;
    }

    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="dhr_guardian_address_id")
      
    public fr.cg95.cvq.business.users.Address getDhrGuardianAddress() {
        return this.dhrGuardianAddress;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "dhrRequesterHaveGuardian"
      )
    
    private Boolean dhrRequesterHaveGuardian;

    public void setDhrRequesterHaveGuardian(final Boolean dhrRequesterHaveGuardian) {
        this.dhrRequesterHaveGuardian = dhrRequesterHaveGuardian;
    }

    
    @Column(name="dhr_requester_have_guardian"  )
      
    public Boolean getDhrRequesterHaveGuardian() {
        return this.dhrRequesterHaveGuardian;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['dhrRequesterGuardian.dhrRequesterHaveGuardian'].test(_this.dhrRequesterHaveGuardian.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "dhrGuardianMeasure"
      )
    
    private fr.cg95.cvq.business.request.social.DhrGuardianMeasureType dhrGuardianMeasure;

    public void setDhrGuardianMeasure(final fr.cg95.cvq.business.request.social.DhrGuardianMeasureType dhrGuardianMeasure) {
        this.dhrGuardianMeasure = dhrGuardianMeasure;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="dhr_guardian_measure"  )
      
    public fr.cg95.cvq.business.request.social.DhrGuardianMeasureType getDhrGuardianMeasure() {
        return this.dhrGuardianMeasure;
    }
  
}
