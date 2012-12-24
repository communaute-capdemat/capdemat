
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
@Table(name="dhr_spouse_status")
public class DhrSpouseStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        DomesticHelpRequest.conditions;

    public DhrSpouseStatus() {
        super();
      
        dhrIsSpouseRetired = Boolean.valueOf(false);
      
    }

    public final String modelToXmlString() {
        DhrSpouseStatusType object = (DhrSpouseStatusType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final DhrSpouseStatusType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        DhrSpouseStatusType dhrSpouseStatus = DhrSpouseStatusType.Factory.newInstance();
        int i = 0;
    
        if (this.dhrSpousePrincipalPensionPlan != null)
            dhrSpouseStatus.setDhrSpousePrincipalPensionPlan(fr.cg95.cvq.xml.request.social.DhrPrincipalPensionPlanType.Enum.forString(this.dhrSpousePrincipalPensionPlan.getLegacyLabel()));
      
        dhrSpouseStatus.setDhrSpouseProfession(this.dhrSpouseProfession);
      
        dhrSpouseStatus.setDhrSpousePensionPlanDetail(this.dhrSpousePensionPlanDetail);
      
        if (this.dhrIsSpouseRetired != null)
            dhrSpouseStatus.setDhrIsSpouseRetired(this.dhrIsSpouseRetired.booleanValue());
      
        dhrSpouseStatus.setDhrSpouseEmployer(this.dhrSpouseEmployer);
      
        dhrSpouseStatus.setDhrSpouseComplementaryPensionPlan(this.dhrSpouseComplementaryPensionPlan);
      
        if (this.dhrSpouseAddress != null)
            dhrSpouseStatus.setDhrSpouseAddress(this.dhrSpouseAddress.modelToXml());
      
        return dhrSpouseStatus;
    }

    public static DhrSpouseStatus xmlToModel(DhrSpouseStatusType dhrSpouseStatusDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        DhrSpouseStatus dhrSpouseStatus = new DhrSpouseStatus();
    
        if (dhrSpouseStatusDoc.getDhrSpousePrincipalPensionPlan() != null)
            dhrSpouseStatus.setDhrSpousePrincipalPensionPlan(fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType.forString(dhrSpouseStatusDoc.getDhrSpousePrincipalPensionPlan().toString()));
        else
            dhrSpouseStatus.setDhrSpousePrincipalPensionPlan(fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType.getDefaultDhrPrincipalPensionPlanType());
      
        dhrSpouseStatus.setDhrSpouseProfession(dhrSpouseStatusDoc.getDhrSpouseProfession());
      
        dhrSpouseStatus.setDhrSpousePensionPlanDetail(dhrSpouseStatusDoc.getDhrSpousePensionPlanDetail());
      
        dhrSpouseStatus.setDhrIsSpouseRetired(Boolean.valueOf(dhrSpouseStatusDoc.getDhrIsSpouseRetired()));
      
        dhrSpouseStatus.setDhrSpouseEmployer(dhrSpouseStatusDoc.getDhrSpouseEmployer());
      
        dhrSpouseStatus.setDhrSpouseComplementaryPensionPlan(dhrSpouseStatusDoc.getDhrSpouseComplementaryPensionPlan());
      
        if (dhrSpouseStatusDoc.getDhrSpouseAddress() != null)
            dhrSpouseStatus.setDhrSpouseAddress(Address.xmlToModel(dhrSpouseStatusDoc.getDhrSpouseAddress()));
      
        return dhrSpouseStatus;
    }

    @Override
    public DhrSpouseStatus clone() {
        DhrSpouseStatus result = new DhrSpouseStatus();
        
          
            
        if (dhrSpousePrincipalPensionPlan != null)
            result.setDhrSpousePrincipalPensionPlan(dhrSpousePrincipalPensionPlan);
        else
            result.setDhrSpousePrincipalPensionPlan(fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType.getDefaultDhrPrincipalPensionPlanType());
      
          
        
          
            
        result.setDhrSpouseProfession(dhrSpouseProfession);
      
          
        
          
            
        result.setDhrSpousePensionPlanDetail(dhrSpousePensionPlanDetail);
      
          
        
          
            
        result.setDhrIsSpouseRetired(dhrIsSpouseRetired);
      
          
        
          
            
        result.setDhrSpouseEmployer(dhrSpouseEmployer);
      
          
        
          
            
        result.setDhrSpouseComplementaryPensionPlan(dhrSpouseComplementaryPensionPlan);
      
          
        
          
            
        if (dhrSpouseAddress != null)
            result.setDhrSpouseAddress(dhrSpouseAddress.clone());
      
          
        
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

  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrSpouseStatus.dhrIsSpouseRetired'].test(_this.dhrIsSpouseRetired.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpousePrincipalPensionPlan"
      )
    
    private fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType dhrSpousePrincipalPensionPlan;

    public void setDhrSpousePrincipalPensionPlan(final fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType dhrSpousePrincipalPensionPlan) {
        this.dhrSpousePrincipalPensionPlan = dhrSpousePrincipalPensionPlan;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="dhr_spouse_principal_pension_plan"  )
      
    public fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType getDhrSpousePrincipalPensionPlan() {
        return this.dhrSpousePrincipalPensionPlan;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
             "active &= !_this.conditions['dhrSpouseStatus.dhrIsSpouseRetired'].test(_this.dhrIsSpouseRetired.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseProfession"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
             "active &= !_this.conditions['dhrSpouseStatus.dhrIsSpouseRetired'].test(_this.dhrIsSpouseRetired.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseProfession"
      )
    
    private String dhrSpouseProfession;

    public void setDhrSpouseProfession(final String dhrSpouseProfession) {
        this.dhrSpouseProfession = dhrSpouseProfession;
    }

    
    @Column(name="dhr_spouse_profession"  )
      
    public String getDhrSpouseProfession() {
        return this.dhrSpouseProfession;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrSpouseStatus.dhrSpousePrincipalPensionPlan'].test(_this.dhrSpousePrincipalPensionPlan.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpousePensionPlanDetail"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrSpouseStatus.dhrSpousePrincipalPensionPlan'].test(_this.dhrSpousePrincipalPensionPlan.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpousePensionPlanDetail"
      )
    
    private String dhrSpousePensionPlanDetail;

    public void setDhrSpousePensionPlanDetail(final String dhrSpousePensionPlanDetail) {
        this.dhrSpousePensionPlanDetail = dhrSpousePensionPlanDetail;
    }

    
    @Column(name="dhr_spouse_pension_plan_detail"  )
      
    public String getDhrSpousePensionPlanDetail() {
        return this.dhrSpousePensionPlanDetail;
    }
  
    
      @NotNull(
        
        
        profiles = {"spouse"},
        message = "dhrIsSpouseRetired"
      )
    
    private Boolean dhrIsSpouseRetired;

    public void setDhrIsSpouseRetired(final Boolean dhrIsSpouseRetired) {
        this.dhrIsSpouseRetired = dhrIsSpouseRetired;
    }

    
    @Column(name="dhr_is_spouse_retired"  )
      
    public Boolean getDhrIsSpouseRetired() {
        return this.dhrIsSpouseRetired;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
             "active &= !_this.conditions['dhrSpouseStatus.dhrIsSpouseRetired'].test(_this.dhrIsSpouseRetired.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseEmployer"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
             "active &= !_this.conditions['dhrSpouseStatus.dhrIsSpouseRetired'].test(_this.dhrIsSpouseRetired.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseEmployer"
      )
    
    private String dhrSpouseEmployer;

    public void setDhrSpouseEmployer(final String dhrSpouseEmployer) {
        this.dhrSpouseEmployer = dhrSpouseEmployer;
    }

    
    @Column(name="dhr_spouse_employer"  )
      
    public String getDhrSpouseEmployer() {
        return this.dhrSpouseEmployer;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrSpouseStatus.dhrIsSpouseRetired'].test(_this.dhrIsSpouseRetired.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseComplementaryPensionPlan"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrSpouseStatus.dhrIsSpouseRetired'].test(_this.dhrIsSpouseRetired.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseComplementaryPensionPlan"
      )
    
    private String dhrSpouseComplementaryPensionPlan;

    public void setDhrSpouseComplementaryPensionPlan(final String dhrSpouseComplementaryPensionPlan) {
        this.dhrSpouseComplementaryPensionPlan = dhrSpouseComplementaryPensionPlan;
    }

    
    @Column(name="dhr_spouse_complementary_pension_plan"  )
      
    public String getDhrSpouseComplementaryPensionPlan() {
        return this.dhrSpouseComplementaryPensionPlan;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
             "active &= !_this.conditions['dhrSpouseStatus.dhrIsSpouseRetired'].test(_this.dhrIsSpouseRetired.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseAddress"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
             "active &= !_this.conditions['dhrSpouseStatus.dhrIsSpouseRetired'].test(_this.dhrIsSpouseRetired.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseAddress"
      )
    
    private fr.cg95.cvq.business.users.Address dhrSpouseAddress;

    public void setDhrSpouseAddress(final fr.cg95.cvq.business.users.Address dhrSpouseAddress) {
        this.dhrSpouseAddress = dhrSpouseAddress;
    }

    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="dhr_spouse_address_id")
      
    public fr.cg95.cvq.business.users.Address getDhrSpouseAddress() {
        return this.dhrSpouseAddress;
    }
  
}
