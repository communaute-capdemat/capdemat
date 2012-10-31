
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
import javax.persistence.*;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Type;

/**
 * Generated class file, do not edit !
 */
@Entity
@Table(name="marriage_information")
public class MarriageInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        MarriageDetailsRequest.conditions;

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
      
        if (this.marriagePostalCode != null)
            marriageInformation.setMarriagePostalCode(fr.cg95.cvq.xml.common.InseeDepartementCodeType.Enum.forString(this.marriagePostalCode.getLegacyLabel()));
      
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
      
        if (marriageInformationDoc.getMarriagePostalCode() != null)
            marriageInformation.setMarriagePostalCode(fr.cg95.cvq.business.users.InseeDepartementCodeType.forString(marriageInformationDoc.getMarriagePostalCode().toString()));
        else
            marriageInformation.setMarriagePostalCode(fr.cg95.cvq.business.users.InseeDepartementCodeType.getDefaultInseeDepartementCodeType());
      
        return marriageInformation;
    }

    @Override
    public MarriageInformation clone() {
        MarriageInformation result = new MarriageInformation();
        
          
            
        result.setMarriageDate(marriageDate);
      
          
        
          
            
        result.setMarriageCity(marriageCity);
      
          
        
          
            
        if (marriagePostalCode != null)
            result.setMarriagePostalCode(marriagePostalCode);
        else
            result.setMarriagePostalCode(fr.cg95.cvq.business.users.InseeDepartementCodeType.getDefaultInseeDepartementCodeType());
      
          
        
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
        
        
        profiles = {"nature"},
        message = "marriageDate"
      )
    
    private java.util.Date marriageDate;

    public void setMarriageDate(final java.util.Date marriageDate) {
        this.marriageDate = marriageDate;
    }

    
    @Column(name="marriage_date"  )
      
    public java.util.Date getMarriageDate() {
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

    public void setMarriageCity(final String marriageCity) {
        this.marriageCity = marriageCity;
    }

    
    @Column(name="marriage_city" , length=32 )
      
    public String getMarriageCity() {
        return this.marriageCity;
    }
  
    
      @NotNull(
        
        
        profiles = {"nature"},
        message = "marriagePostalCode"
      )
    
    private fr.cg95.cvq.business.users.InseeDepartementCodeType marriagePostalCode;

    public void setMarriagePostalCode(final fr.cg95.cvq.business.users.InseeDepartementCodeType marriagePostalCode) {
        this.marriagePostalCode = marriagePostalCode;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="marriage_postal_code"  )
      
    public fr.cg95.cvq.business.users.InseeDepartementCodeType getMarriagePostalCode() {
        return this.marriagePostalCode;
    }
  
}
