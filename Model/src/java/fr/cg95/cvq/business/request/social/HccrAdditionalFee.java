
package fr.cg95.cvq.business.request.social;

import java.io.Serializable;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.xmlbeans.XmlOptions;

import fr.cg95.cvq.business.authority.*;
import fr.cg95.cvq.business.request.*;
import fr.cg95.cvq.business.users.*;
import fr.cg95.cvq.xml.common.RequestType;
import fr.cg95.cvq.xml.common.*;
import fr.cg95.cvq.xml.request.social.*;

/**
 * Generated class file, do not edit !
 *
 * @hibernate.class
 *  table="hccr_additional_fee"
 *  lazy="false"
 */
public class HccrAdditionalFee implements Serializable {

    private static final long serialVersionUID = 1L;

    public HccrAdditionalFee() {
        super();
      
    }

    public final String modelToXmlString() {
        HccrAdditionalFeeType object = (HccrAdditionalFeeType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final HccrAdditionalFeeType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        HccrAdditionalFeeType hccrAdditionalFee = HccrAdditionalFeeType.Factory.newInstance();
        int i = 0;
    
        hccrAdditionalFee.setAdditionalFeeKind(this.additionalFeeKind);
      
        hccrAdditionalFee.setAdditionalFeePeriodicity(this.additionalFeePeriodicity);
      
        hccrAdditionalFee.setAdditionalFeeCost(this.additionalFeeCost);
      
        return hccrAdditionalFee;
    }

    public static HccrAdditionalFee xmlToModel(HccrAdditionalFeeType hccrAdditionalFeeDoc) {
        Calendar calendar = Calendar.getInstance();
        List list = new ArrayList();
        HccrAdditionalFee hccrAdditionalFee = new HccrAdditionalFee();
    
        hccrAdditionalFee.setAdditionalFeeKind(hccrAdditionalFeeDoc.getAdditionalFeeKind());
      
        hccrAdditionalFee.setAdditionalFeePeriodicity(hccrAdditionalFeeDoc.getAdditionalFeePeriodicity());
      
        hccrAdditionalFee.setAdditionalFeeCost(hccrAdditionalFeeDoc.getAdditionalFeeCost());
      
        return hccrAdditionalFee;
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

  
    private String additionalFeeKind;

    public final void setAdditionalFeeKind(final String additionalFeeKind) {
        this.additionalFeeKind = additionalFeeKind;
    }

    /**
  
        * @hibernate.property
        *  column="additional_fee_kind"
        *  length="30"
      
    */
    public final String getAdditionalFeeKind() {
        return this.additionalFeeKind;
    }
  
    private String additionalFeePeriodicity;

    public final void setAdditionalFeePeriodicity(final String additionalFeePeriodicity) {
        this.additionalFeePeriodicity = additionalFeePeriodicity;
    }

    /**
  
        * @hibernate.property
        *  column="additional_fee_periodicity"
        *  length="30"
      
    */
    public final String getAdditionalFeePeriodicity() {
        return this.additionalFeePeriodicity;
    }
  
    private String additionalFeeCost;

    public final void setAdditionalFeeCost(final String additionalFeeCost) {
        this.additionalFeeCost = additionalFeeCost;
    }

    /**
  
        * @hibernate.property
        *  column="additional_fee_cost"
        *  length="6"
      
    */
    public final String getAdditionalFeeCost() {
        return this.additionalFeeCost;
    }
  
}
