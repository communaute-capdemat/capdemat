
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
 *  table="marriage_wife_information"
 *  lazy="false"
 */
public class MarriageWifeInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public MarriageWifeInformation() {
        super();
      
    }

    public final String modelToXmlString() {
        MarriageWifeInformationType object = (MarriageWifeInformationType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MarriageWifeInformationType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MarriageWifeInformationType marriageWifeInformation = MarriageWifeInformationType.Factory.newInstance();
        int i = 0;
    
        marriageWifeInformation.setMarriageWifeFirstNames(this.marriageWifeFirstNames);
      
        marriageWifeInformation.setMarriageWifeLastName(this.marriageWifeLastName);
      
        return marriageWifeInformation;
    }

    public static MarriageWifeInformation xmlToModel(MarriageWifeInformationType marriageWifeInformationDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MarriageWifeInformation marriageWifeInformation = new MarriageWifeInformation();
    
        marriageWifeInformation.setMarriageWifeFirstNames(marriageWifeInformationDoc.getMarriageWifeFirstNames());
      
        marriageWifeInformation.setMarriageWifeLastName(marriageWifeInformationDoc.getMarriageWifeLastName());
      
        return marriageWifeInformation;
    }

    @Override
    public MarriageWifeInformation clone() {
        MarriageWifeInformation result = new MarriageWifeInformation();
        
          
            
        result.setMarriageWifeFirstNames(marriageWifeFirstNames);
      
          
        
          
            
        result.setMarriageWifeLastName(marriageWifeLastName);
      
          
        
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
        message = "marriageWifeFirstNames"
      )
    
      @NotBlank(
        
        
        profiles = {"nature"},
        message = "marriageWifeFirstNames"
      )
    
    private String marriageWifeFirstNames;

    public final void setMarriageWifeFirstNames(final String marriageWifeFirstNames) {
        this.marriageWifeFirstNames = marriageWifeFirstNames;
    }

    /**
  
        * @hibernate.property
        *  column="marriage_wife_first_names"
        
      
    */
    public final String getMarriageWifeFirstNames() {
        return this.marriageWifeFirstNames;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"nature"},
        message = "marriageWifeLastName"
      )
    
      @NotNull(
        
        
        profiles = {"nature"},
        message = "marriageWifeLastName"
      )
    
      @NotBlank(
        
        
        profiles = {"nature"},
        message = "marriageWifeLastName"
      )
    
    private String marriageWifeLastName;

    public final void setMarriageWifeLastName(final String marriageWifeLastName) {
        this.marriageWifeLastName = marriageWifeLastName;
    }

    /**
  
        * @hibernate.property
        *  column="marriage_wife_last_name"
        *  length="38"
      
    */
    public final String getMarriageWifeLastName() {
        return this.marriageWifeLastName;
    }
  
}
