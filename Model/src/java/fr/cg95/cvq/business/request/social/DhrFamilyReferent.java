
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
@Table(name="dhr_family_referent")
public class DhrFamilyReferent implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        DomesticHelpRequest.conditions;

    public DhrFamilyReferent() {
        super();
      
        dhrHaveFamilyReferent = Boolean.valueOf(false);
      
    }

    public final String modelToXmlString() {
        DhrFamilyReferentType object = (DhrFamilyReferentType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final DhrFamilyReferentType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        DhrFamilyReferentType dhrFamilyReferent = DhrFamilyReferentType.Factory.newInstance();
        int i = 0;
    
        dhrFamilyReferent.setDhrReferentFirstName(this.dhrReferentFirstName);
      
        dhrFamilyReferent.setDhrReferentName(this.dhrReferentName);
      
        if (this.dhrHaveFamilyReferent != null)
            dhrFamilyReferent.setDhrHaveFamilyReferent(this.dhrHaveFamilyReferent.booleanValue());
      
        if (this.dhrReferentAddress != null)
            dhrFamilyReferent.setDhrReferentAddress(this.dhrReferentAddress.modelToXml());
      
        return dhrFamilyReferent;
    }

    public static DhrFamilyReferent xmlToModel(DhrFamilyReferentType dhrFamilyReferentDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        DhrFamilyReferent dhrFamilyReferent = new DhrFamilyReferent();
    
        dhrFamilyReferent.setDhrReferentFirstName(dhrFamilyReferentDoc.getDhrReferentFirstName());
      
        dhrFamilyReferent.setDhrReferentName(dhrFamilyReferentDoc.getDhrReferentName());
      
        dhrFamilyReferent.setDhrHaveFamilyReferent(Boolean.valueOf(dhrFamilyReferentDoc.getDhrHaveFamilyReferent()));
      
        if (dhrFamilyReferentDoc.getDhrReferentAddress() != null)
            dhrFamilyReferent.setDhrReferentAddress(Address.xmlToModel(dhrFamilyReferentDoc.getDhrReferentAddress()));
      
        return dhrFamilyReferent;
    }

    @Override
    public DhrFamilyReferent clone() {
        DhrFamilyReferent result = new DhrFamilyReferent();
        
          
            
        result.setDhrReferentFirstName(dhrReferentFirstName);
      
          
        
          
            
        result.setDhrReferentName(dhrReferentName);
      
          
        
          
            
        result.setDhrHaveFamilyReferent(dhrHaveFamilyReferent);
      
          
        
          
            
        if (dhrReferentAddress != null)
            result.setDhrReferentAddress(dhrReferentAddress.clone());
      
          
        
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
          
             "active &= _this.conditions['dhrFamilyReferent.dhrHaveFamilyReferent'].test(_this.dhrHaveFamilyReferent.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"familyReferent"},
        message = "dhrReferentFirstName"
      )
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrFamilyReferent.dhrHaveFamilyReferent'].test(_this.dhrHaveFamilyReferent.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"familyReferent"},
        message = "dhrReferentFirstName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrFamilyReferent.dhrHaveFamilyReferent'].test(_this.dhrHaveFamilyReferent.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"familyReferent"},
        message = "dhrReferentFirstName"
      )
    
    private String dhrReferentFirstName;

    public void setDhrReferentFirstName(final String dhrReferentFirstName) {
        this.dhrReferentFirstName = dhrReferentFirstName;
    }

    
    @Column(name="dhr_referent_first_name" , length=38 )
      
    public String getDhrReferentFirstName() {
        return this.dhrReferentFirstName;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrFamilyReferent.dhrHaveFamilyReferent'].test(_this.dhrHaveFamilyReferent.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"familyReferent"},
        message = "dhrReferentName"
      )
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrFamilyReferent.dhrHaveFamilyReferent'].test(_this.dhrHaveFamilyReferent.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"familyReferent"},
        message = "dhrReferentName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrFamilyReferent.dhrHaveFamilyReferent'].test(_this.dhrHaveFamilyReferent.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"familyReferent"},
        message = "dhrReferentName"
      )
    
    private String dhrReferentName;

    public void setDhrReferentName(final String dhrReferentName) {
        this.dhrReferentName = dhrReferentName;
    }

    
    @Column(name="dhr_referent_name" , length=38 )
      
    public String getDhrReferentName() {
        return this.dhrReferentName;
    }
  
    
      @NotNull(
        
        
        profiles = {"familyReferent"},
        message = "dhrHaveFamilyReferent"
      )
    
    private Boolean dhrHaveFamilyReferent;

    public void setDhrHaveFamilyReferent(final Boolean dhrHaveFamilyReferent) {
        this.dhrHaveFamilyReferent = dhrHaveFamilyReferent;
    }

    
    @Column(name="dhr_have_family_referent"  )
      
    public Boolean getDhrHaveFamilyReferent() {
        return this.dhrHaveFamilyReferent;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrFamilyReferent.dhrHaveFamilyReferent'].test(_this.dhrHaveFamilyReferent.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"familyReferent"},
        message = "dhrReferentAddress"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrFamilyReferent.dhrHaveFamilyReferent'].test(_this.dhrHaveFamilyReferent.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"familyReferent"},
        message = "dhrReferentAddress"
      )
    
    private fr.cg95.cvq.business.users.Address dhrReferentAddress;

    public void setDhrReferentAddress(final fr.cg95.cvq.business.users.Address dhrReferentAddress) {
        this.dhrReferentAddress = dhrReferentAddress;
    }

    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="dhr_referent_address_id")
      
    public fr.cg95.cvq.business.users.Address getDhrReferentAddress() {
        return this.dhrReferentAddress;
    }
  
}
