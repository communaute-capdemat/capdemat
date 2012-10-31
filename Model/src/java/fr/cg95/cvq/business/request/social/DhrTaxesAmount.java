
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
@Table(name="dhr_taxes_amount")
public class DhrTaxesAmount implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        DomesticHelpRequest.conditions;

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

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    public final Long getId() {
        return this.id;
    }

  
    
    private java.math.BigInteger propertyTaxes;

    public void setPropertyTaxes(final java.math.BigInteger propertyTaxes) {
        this.propertyTaxes = propertyTaxes;
    }

    
    @Column(name="property_taxes" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getPropertyTaxes() {
        return this.propertyTaxes;
    }
  
    
    private java.math.BigInteger professionalTaxes;

    public void setProfessionalTaxes(final java.math.BigInteger professionalTaxes) {
        this.professionalTaxes = professionalTaxes;
    }

    
    @Column(name="professional_taxes" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getProfessionalTaxes() {
        return this.professionalTaxes;
    }
  
    
    private java.math.BigInteger localRate;

    public void setLocalRate(final java.math.BigInteger localRate) {
        this.localRate = localRate;
    }

    
    @Column(name="local_rate" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getLocalRate() {
        return this.localRate;
    }
  
    
    private java.math.BigInteger dhrIncomeTax;

    public void setDhrIncomeTax(final java.math.BigInteger dhrIncomeTax) {
        this.dhrIncomeTax = dhrIncomeTax;
    }

    
    @Column(name="dhr_income_tax" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getDhrIncomeTax() {
        return this.dhrIncomeTax;
    }
  
}
