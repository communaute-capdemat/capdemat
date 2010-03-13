
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
 *  table="dhr_incomes"
 *  lazy="false"
 */
public class DhrIncomes implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public DhrIncomes() {
        super();
      
    }

    public final String modelToXmlString() {
        DhrIncomesType object = (DhrIncomesType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final DhrIncomesType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        DhrIncomesType dhrIncomes = DhrIncomesType.Factory.newInstance();
        int i = 0;
    
        if (this.dhrAllowances != null)
            dhrIncomes.setDhrAllowances(new BigInteger(this.dhrAllowances.toString()));
      
        if (this.dhrIncomesAnnualTotal != null)
            dhrIncomes.setDhrIncomesAnnualTotal(new BigInteger(this.dhrIncomesAnnualTotal.toString()));
      
        if (this.pensions != null)
            dhrIncomes.setPensions(new BigInteger(this.pensions.toString()));
      
        if (this.dhrNetIncome != null)
            dhrIncomes.setDhrNetIncome(new BigInteger(this.dhrNetIncome.toString()));
      
        if (this.dhrFurnitureInvestmentIncome != null)
            dhrIncomes.setDhrFurnitureInvestmentIncome(new BigInteger(this.dhrFurnitureInvestmentIncome.toString()));
      
        if (this.dhrRealEstateInvestmentIncome != null)
            dhrIncomes.setDhrRealEstateInvestmentIncome(new BigInteger(this.dhrRealEstateInvestmentIncome.toString()));
      
        return dhrIncomes;
    }

    public static DhrIncomes xmlToModel(DhrIncomesType dhrIncomesDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        DhrIncomes dhrIncomes = new DhrIncomes();
    
        dhrIncomes.setDhrAllowances(dhrIncomesDoc.getDhrAllowances());
      
        dhrIncomes.setDhrIncomesAnnualTotal(dhrIncomesDoc.getDhrIncomesAnnualTotal());
      
        dhrIncomes.setPensions(dhrIncomesDoc.getPensions());
      
        dhrIncomes.setDhrNetIncome(dhrIncomesDoc.getDhrNetIncome());
      
        dhrIncomes.setDhrFurnitureInvestmentIncome(dhrIncomesDoc.getDhrFurnitureInvestmentIncome());
      
        dhrIncomes.setDhrRealEstateInvestmentIncome(dhrIncomesDoc.getDhrRealEstateInvestmentIncome());
      
        return dhrIncomes;
    }

    @Override
    public DhrIncomes clone() {
        DhrIncomes result = new DhrIncomes();
        
          
            
        result.setDhrAllowances(dhrAllowances);
      
          
        
          
            
        result.setDhrIncomesAnnualTotal(dhrIncomesAnnualTotal);
      
          
        
          
            
        result.setPensions(pensions);
      
          
        
          
            
        result.setDhrNetIncome(dhrNetIncome);
      
          
        
          
            
        result.setDhrFurnitureInvestmentIncome(dhrFurnitureInvestmentIncome);
      
          
        
          
            
        result.setDhrRealEstateInvestmentIncome(dhrRealEstateInvestmentIncome);
      
          
        
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

  
    
    private java.math.BigInteger dhrAllowances;

    public final void setDhrAllowances(final java.math.BigInteger dhrAllowances) {
        this.dhrAllowances = dhrAllowances;
    }

    /**
  
        * @hibernate.property
        *  column="dhr_allowances"
        *  type="serializable"
        
      
    */
    public final java.math.BigInteger getDhrAllowances() {
        return this.dhrAllowances;
    }
  
    
      @NotNull(
        
        
        profiles = {"resources"},
        message = "dhrIncomesAnnualTotal"
      )
    
    private java.math.BigInteger dhrIncomesAnnualTotal;

    public final void setDhrIncomesAnnualTotal(final java.math.BigInteger dhrIncomesAnnualTotal) {
        this.dhrIncomesAnnualTotal = dhrIncomesAnnualTotal;
    }

    /**
  
        * @hibernate.property
        *  column="dhr_incomes_annual_total"
        *  type="serializable"
        
      
    */
    public final java.math.BigInteger getDhrIncomesAnnualTotal() {
        return this.dhrIncomesAnnualTotal;
    }
  
    
    private java.math.BigInteger pensions;

    public final void setPensions(final java.math.BigInteger pensions) {
        this.pensions = pensions;
    }

    /**
  
        * @hibernate.property
        *  column="pensions"
        *  type="serializable"
        
      
    */
    public final java.math.BigInteger getPensions() {
        return this.pensions;
    }
  
    
    private java.math.BigInteger dhrNetIncome;

    public final void setDhrNetIncome(final java.math.BigInteger dhrNetIncome) {
        this.dhrNetIncome = dhrNetIncome;
    }

    /**
  
        * @hibernate.property
        *  column="dhr_net_income"
        *  type="serializable"
        
      
    */
    public final java.math.BigInteger getDhrNetIncome() {
        return this.dhrNetIncome;
    }
  
    
    private java.math.BigInteger dhrFurnitureInvestmentIncome;

    public final void setDhrFurnitureInvestmentIncome(final java.math.BigInteger dhrFurnitureInvestmentIncome) {
        this.dhrFurnitureInvestmentIncome = dhrFurnitureInvestmentIncome;
    }

    /**
  
        * @hibernate.property
        *  column="dhr_furniture_investment_income"
        *  type="serializable"
        
      
    */
    public final java.math.BigInteger getDhrFurnitureInvestmentIncome() {
        return this.dhrFurnitureInvestmentIncome;
    }
  
    
    private java.math.BigInteger dhrRealEstateInvestmentIncome;

    public final void setDhrRealEstateInvestmentIncome(final java.math.BigInteger dhrRealEstateInvestmentIncome) {
        this.dhrRealEstateInvestmentIncome = dhrRealEstateInvestmentIncome;
    }

    /**
  
        * @hibernate.property
        *  column="dhr_real_estate_investment_income"
        *  type="serializable"
        
      
    */
    public final java.math.BigInteger getDhrRealEstateInvestmentIncome() {
        return this.dhrRealEstateInvestmentIncome;
    }
  
}
