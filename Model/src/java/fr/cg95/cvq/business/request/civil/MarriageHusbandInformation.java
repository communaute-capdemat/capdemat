
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
 *  table="marriage_husband_information"
 *  lazy="false"
 */
public class MarriageHusbandInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public MarriageHusbandInformation() {
        super();
      
    }

    public final String modelToXmlString() {
        MarriageHusbandInformationType object = (MarriageHusbandInformationType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MarriageHusbandInformationType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MarriageHusbandInformationType marriageHusbandInformation = MarriageHusbandInformationType.Factory.newInstance();
        int i = 0;
    
        marriageHusbandInformation.setMarriageHusbandFirstNames(this.marriageHusbandFirstNames);
      
        marriageHusbandInformation.setMarriageHusbandLastName(this.marriageHusbandLastName);
      
        return marriageHusbandInformation;
    }

    public static MarriageHusbandInformation xmlToModel(MarriageHusbandInformationType marriageHusbandInformationDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MarriageHusbandInformation marriageHusbandInformation = new MarriageHusbandInformation();
    
        marriageHusbandInformation.setMarriageHusbandFirstNames(marriageHusbandInformationDoc.getMarriageHusbandFirstNames());
      
        marriageHusbandInformation.setMarriageHusbandLastName(marriageHusbandInformationDoc.getMarriageHusbandLastName());
      
        return marriageHusbandInformation;
    }

    @Override
    public MarriageHusbandInformation clone() {
        MarriageHusbandInformation result = new MarriageHusbandInformation();
        
          
            
        result.setMarriageHusbandFirstNames(marriageHusbandFirstNames);
      
          
        
          
            
        result.setMarriageHusbandLastName(marriageHusbandLastName);
      
          
        
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
        message = "marriageHusbandFirstNames"
      )
    
      @NotBlank(
        
        
        profiles = {"nature"},
        message = "marriageHusbandFirstNames"
      )
    
    private String marriageHusbandFirstNames;

    public final void setMarriageHusbandFirstNames(final String marriageHusbandFirstNames) {
        this.marriageHusbandFirstNames = marriageHusbandFirstNames;
    }

    /**
  
        * @hibernate.property
        *  column="marriage_husband_first_names"
        
      
    */
    public final String getMarriageHusbandFirstNames() {
        return this.marriageHusbandFirstNames;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"nature"},
        message = "marriageHusbandLastName"
      )
    
      @NotNull(
        
        
        profiles = {"nature"},
        message = "marriageHusbandLastName"
      )
    
      @NotBlank(
        
        
        profiles = {"nature"},
        message = "marriageHusbandLastName"
      )
    
    private String marriageHusbandLastName;

    public final void setMarriageHusbandLastName(final String marriageHusbandLastName) {
        this.marriageHusbandLastName = marriageHusbandLastName;
    }

    /**
  
        * @hibernate.property
        *  column="marriage_husband_last_name"
        *  length="38"
      
    */
    public final String getMarriageHusbandLastName() {
        return this.marriageHusbandLastName;
    }
  
}
