
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
@Table(name="dhr_incomes")
public class DhrIncomes implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        DomesticHelpRequest.conditions;

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

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    public final Long getId() {
        return this.id;
    }

  
    
    private java.math.BigInteger dhrAllowances;

    public void setDhrAllowances(final java.math.BigInteger dhrAllowances) {
        this.dhrAllowances = dhrAllowances;
    }

    
    @Column(name="dhr_allowances" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getDhrAllowances() {
        return this.dhrAllowances;
    }
  
    
    private java.math.BigInteger dhrIncomesAnnualTotal;

    public void setDhrIncomesAnnualTotal(final java.math.BigInteger dhrIncomesAnnualTotal) {
        this.dhrIncomesAnnualTotal = dhrIncomesAnnualTotal;
    }

    
    @Column(name="dhr_incomes_annual_total" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getDhrIncomesAnnualTotal() {
        return this.dhrIncomesAnnualTotal;
    }
  
    
    private java.math.BigInteger pensions;

    public void setPensions(final java.math.BigInteger pensions) {
        this.pensions = pensions;
    }

    
    @Column(name="pensions" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getPensions() {
        return this.pensions;
    }
  
    
    private java.math.BigInteger dhrNetIncome;

    public void setDhrNetIncome(final java.math.BigInteger dhrNetIncome) {
        this.dhrNetIncome = dhrNetIncome;
    }

    
    @Column(name="dhr_net_income" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getDhrNetIncome() {
        return this.dhrNetIncome;
    }
  
    
    private java.math.BigInteger dhrFurnitureInvestmentIncome;

    public void setDhrFurnitureInvestmentIncome(final java.math.BigInteger dhrFurnitureInvestmentIncome) {
        this.dhrFurnitureInvestmentIncome = dhrFurnitureInvestmentIncome;
    }

    
    @Column(name="dhr_furniture_investment_income" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getDhrFurnitureInvestmentIncome() {
        return this.dhrFurnitureInvestmentIncome;
    }
  
    
    private java.math.BigInteger dhrRealEstateInvestmentIncome;

    public void setDhrRealEstateInvestmentIncome(final java.math.BigInteger dhrRealEstateInvestmentIncome) {
        this.dhrRealEstateInvestmentIncome = dhrRealEstateInvestmentIncome;
    }

    
    @Column(name="dhr_real_estate_investment_income" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getDhrRealEstateInvestmentIncome() {
        return this.dhrRealEstateInvestmentIncome;
    }
  
}
