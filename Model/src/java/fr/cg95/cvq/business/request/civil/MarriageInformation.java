
package fr.cg95.cvq.business.request.civil;

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
import fr.cg95.cvq.xml.request.civil.*;
import fr.cg95.cvq.service.request.LocalReferential;
import fr.cg95.cvq.service.request.condition.IConditionChecker;

/**
 * Generated class file, do not edit !
 *
 * @hibernate.class
 *  table="marriage_information"
 *  lazy="false"
 */
public class MarriageInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public MarriageInformation() {
        super();
      
    }

    public final String modelToXmlString() {
        MarriageInformationType object = (MarriageInformationType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MarriageInformationType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MarriageInformationType marriageInformation = MarriageInformationType.Factory.newInstance();
        int i = 0;
    
        date = this.marriageDate;
        if (date != null) {
            calendar.setTime(date);
            marriageInformation.setMarriageDate(calendar);
        }
      
        marriageInformation.setMarriageCity(this.marriageCity);
      
        marriageInformation.setMarriagePostalCode(this.marriagePostalCode);
      
        return marriageInformation;
    }

    public static MarriageInformation xmlToModel(MarriageInformationType marriageInformationDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MarriageInformation marriageInformation = new MarriageInformation();
    
        calendar = marriageInformationDoc.getMarriageDate();
        if (calendar != null) {
            marriageInformation.setMarriageDate(calendar.getTime());
        }
      
        marriageInformation.setMarriageCity(marriageInformationDoc.getMarriageCity());
      
        marriageInformation.setMarriagePostalCode(marriageInformationDoc.getMarriagePostalCode());
      
        return marriageInformation;
    }

    @Override
    public MarriageInformation clone() {
        MarriageInformation result = new MarriageInformation();
        
          
            
        result.setMarriageDate(marriageDate);
      
          
        
          
            
        result.setMarriageCity(marriageCity);
      
          
        
          
            
        result.setMarriagePostalCode(marriagePostalCode);
      
          
        
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
        
        
        profiles = {"nature"},
        message = "marriageDate"
      )
    
    private java.util.Date marriageDate;

    public final void setMarriageDate(final java.util.Date marriageDate) {
        this.marriageDate = marriageDate;
    }

    /**
  
        * @hibernate.property
        *  column="marriage_date"
        
      
    */
    public final java.util.Date getMarriageDate() {
        return this.marriageDate;
    }
  
    
      @MaxLength(
        
          value = 32,
        
        
        profiles = {"nature"},
        message = "marriageCity"
      )
    
      @NotNull(
        
        
        profiles = {"nature"},
        message = "marriageCity"
      )
    
      @NotBlank(
        
        
        profiles = {"nature"},
        message = "marriageCity"
      )
    
    private String marriageCity;

    public final void setMarriageCity(final String marriageCity) {
        this.marriageCity = marriageCity;
    }

    /**
  
        * @hibernate.property
        *  column="marriage_city"
        *  length="32"
      
    */
    public final String getMarriageCity() {
        return this.marriageCity;
    }
  
    
      @MaxLength(
        
          value = 2,
        
        
        profiles = {"nature"},
        message = "marriagePostalCode"
      )
    
      @NotNull(
        
        
        profiles = {"nature"},
        message = "marriagePostalCode"
      )
    
      @NotBlank(
        
        
        profiles = {"nature"},
        message = "marriagePostalCode"
      )
    
    private String marriagePostalCode;

    public final void setMarriagePostalCode(final String marriagePostalCode) {
        this.marriagePostalCode = marriagePostalCode;
    }

    /**
  
        * @hibernate.property
        *  column="marriage_postal_code"
        *  length="2"
      
    */
    public final String getMarriagePostalCode() {
        return this.marriagePostalCode;
    }
  
}
