
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
 *  table="dhr_taxes_amount"
 *  lazy="false"
 */
public class DhrTaxesAmount implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public DhrTaxesAmount() {
        super();
      
    }

    public final String modelToXmlString() {
        DhrTaxesAmountType object = (DhrTaxesAmountType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final DhrTaxesAmountType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        DhrTaxesAmountType dhrTaxesAmount = DhrTaxesAmountType.Factory.newInstance();
        int i = 0;
    
        if (this.propertyTaxes != null)
            dhrTaxesAmount.setPropertyTaxes(new BigInteger(this.propertyTaxes.toString()));
      
        if (this.professionalTaxes != null)
            dhrTaxesAmount.setProfessionalTaxes(new BigInteger(this.professionalTaxes.toString()));
      
        if (this.localRate != null)
            dhrTaxesAmount.setLocalRate(new BigInteger(this.localRate.toString()));
      
        if (this.dhrIncomeTax != null)
            dhrTaxesAmount.setDhrIncomeTax(new BigInteger(this.dhrIncomeTax.toString()));
      
        return dhrTaxesAmount;
    }

    public static DhrTaxesAmount xmlToModel(DhrTaxesAmountType dhrTaxesAmountDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        DhrTaxesAmount dhrTaxesAmount = new DhrTaxesAmount();
    
        dhrTaxesAmount.setPropertyTaxes(dhrTaxesAmountDoc.getPropertyTaxes());
      
        dhrTaxesAmount.setProfessionalTaxes(dhrTaxesAmountDoc.getProfessionalTaxes());
      
        dhrTaxesAmount.setLocalRate(dhrTaxesAmountDoc.getLocalRate());
      
        dhrTaxesAmount.setDhrIncomeTax(dhrTaxesAmountDoc.getDhrIncomeTax());
      
        return dhrTaxesAmount;
    }

    @Override
    public DhrTaxesAmount clone() {
        DhrTaxesAmount result = new DhrTaxesAmount();
        
          
            
        result.setPropertyTaxes(propertyTaxes);
      
          
        
          
            
        result.setProfessionalTaxes(professionalTaxes);
      
          
        
          
            
        result.setLocalRate(localRate);
      
          
        
          
            
        result.setDhrIncomeTax(dhrIncomeTax);
      
          
        
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

  
    
    private java.math.BigInteger propertyTaxes;

    public final void setPropertyTaxes(final java.math.BigInteger propertyTaxes) {
        this.propertyTaxes = propertyTaxes;
    }

    /**
  
        * @hibernate.property
        *  column="property_taxes"
        *  type="serializable"
        
      
    */
    public final java.math.BigInteger getPropertyTaxes() {
        return this.propertyTaxes;
    }
  
    
    private java.math.BigInteger professionalTaxes;

    public final void setProfessionalTaxes(final java.math.BigInteger professionalTaxes) {
        this.professionalTaxes = professionalTaxes;
    }

    /**
  
        * @hibernate.property
        *  column="professional_taxes"
        *  type="serializable"
        
      
    */
    public final java.math.BigInteger getProfessionalTaxes() {
        return this.professionalTaxes;
    }
  
    
    private java.math.BigInteger localRate;

    public final void setLocalRate(final java.math.BigInteger localRate) {
        this.localRate = localRate;
    }

    /**
  
        * @hibernate.property
        *  column="local_rate"
        *  type="serializable"
        
      
    */
    public final java.math.BigInteger getLocalRate() {
        return this.localRate;
    }
  
    
    private java.math.BigInteger dhrIncomeTax;

    public final void setDhrIncomeTax(final java.math.BigInteger dhrIncomeTax) {
        this.dhrIncomeTax = dhrIncomeTax;
    }

    /**
  
        * @hibernate.property
        *  column="dhr_income_tax"
        *  type="serializable"
        
      
    */
    public final java.math.BigInteger getDhrIncomeTax() {
        return this.dhrIncomeTax;
    }
  
}
