
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
@Table(name="dhr_requester_pension_plan")
public class DhrRequesterPensionPlan implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        DomesticHelpRequest.conditions;

    public DhrRequesterPensionPlan() {
        super();
      
    }

    public final String modelToXmlString() {
        DhrRequesterPensionPlanType object = (DhrRequesterPensionPlanType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final DhrRequesterPensionPlanType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        DhrRequesterPensionPlanType dhrRequesterPensionPlan = DhrRequesterPensionPlanType.Factory.newInstance();
        int i = 0;
    
        dhrRequesterPensionPlan.setDhrPensionPlanDetail(this.dhrPensionPlanDetail);
      
        if (this.dhrPrincipalPensionPlan != null)
            dhrRequesterPensionPlan.setDhrPrincipalPensionPlan(fr.cg95.cvq.xml.request.social.DhrPrincipalPensionPlanType.Enum.forString(this.dhrPrincipalPensionPlan.getLegacyLabel()));
      
        dhrRequesterPensionPlan.setDhrComplementaryPensionPlan(this.dhrComplementaryPensionPlan);
      
        return dhrRequesterPensionPlan;
    }

    public static DhrRequesterPensionPlan xmlToModel(DhrRequesterPensionPlanType dhrRequesterPensionPlanDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        DhrRequesterPensionPlan dhrRequesterPensionPlan = new DhrRequesterPensionPlan();
    
        dhrRequesterPensionPlan.setDhrPensionPlanDetail(dhrRequesterPensionPlanDoc.getDhrPensionPlanDetail());
      
        if (dhrRequesterPensionPlanDoc.getDhrPrincipalPensionPlan() != null)
            dhrRequesterPensionPlan.setDhrPrincipalPensionPlan(fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType.forString(dhrRequesterPensionPlanDoc.getDhrPrincipalPensionPlan().toString()));
        else
            dhrRequesterPensionPlan.setDhrPrincipalPensionPlan(fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType.getDefaultDhrPrincipalPensionPlanType());
      
        dhrRequesterPensionPlan.setDhrComplementaryPensionPlan(dhrRequesterPensionPlanDoc.getDhrComplementaryPensionPlan());
      
        return dhrRequesterPensionPlan;
    }

    @Override
    public DhrRequesterPensionPlan clone() {
        DhrRequesterPensionPlan result = new DhrRequesterPensionPlan();
        
          
            
        result.setDhrPensionPlanDetail(dhrPensionPlanDetail);
      
          
        
          
            
        if (dhrPrincipalPensionPlan != null)
            result.setDhrPrincipalPensionPlan(dhrPrincipalPensionPlan);
        else
            result.setDhrPrincipalPensionPlan(fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType.getDefaultDhrPrincipalPensionPlanType());
      
          
        
          
            
        result.setDhrComplementaryPensionPlan(dhrComplementaryPensionPlan);
      
          
        
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
          
              "active &= _this.conditions['dhrRequesterPensionPlan.dhrPrincipalPensionPlan'].test(_this.dhrPrincipalPensionPlan.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "dhrPensionPlanDetail"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['dhrRequesterPensionPlan.dhrPrincipalPensionPlan'].test(_this.dhrPrincipalPensionPlan.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "dhrPensionPlanDetail"
      )
    
    private String dhrPensionPlanDetail;

    public void setDhrPensionPlanDetail(final String dhrPensionPlanDetail) {
        this.dhrPensionPlanDetail = dhrPensionPlanDetail;
    }

    
    @Column(name="dhr_pension_plan_detail"  )
      
    public String getDhrPensionPlanDetail() {
        return this.dhrPensionPlanDetail;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "dhrPrincipalPensionPlan"
      )
    
    private fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType dhrPrincipalPensionPlan;

    public void setDhrPrincipalPensionPlan(final fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType dhrPrincipalPensionPlan) {
        this.dhrPrincipalPensionPlan = dhrPrincipalPensionPlan;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="dhr_principal_pension_plan"  )
      
    public fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType getDhrPrincipalPensionPlan() {
        return this.dhrPrincipalPensionPlan;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "dhrComplementaryPensionPlan"
      )
    
      @NotBlank(
        
        
        profiles = {"subject"},
        message = "dhrComplementaryPensionPlan"
      )
    
    private String dhrComplementaryPensionPlan;

    public void setDhrComplementaryPensionPlan(final String dhrComplementaryPensionPlan) {
        this.dhrComplementaryPensionPlan = dhrComplementaryPensionPlan;
    }

    
    @Column(name="dhr_complementary_pension_plan"  )
      
    public String getDhrComplementaryPensionPlan() {
        return this.dhrComplementaryPensionPlan;
    }
  
}
