
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
 *  table="marriage_mother_information"
 *  lazy="false"
 */
public class MarriageMotherInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public MarriageMotherInformation() {
        super();
      
    }

    public final String modelToXmlString() {
        MarriageMotherInformationType object = (MarriageMotherInformationType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MarriageMotherInformationType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MarriageMotherInformationType marriageMotherInformation = MarriageMotherInformationType.Factory.newInstance();
        int i = 0;
    
        marriageMotherInformation.setMotherFirstNames(this.motherFirstNames);
      
        marriageMotherInformation.setMotherMaidenName(this.motherMaidenName);
      
        return marriageMotherInformation;
    }

    public static MarriageMotherInformation xmlToModel(MarriageMotherInformationType marriageMotherInformationDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MarriageMotherInformation marriageMotherInformation = new MarriageMotherInformation();
    
        marriageMotherInformation.setMotherFirstNames(marriageMotherInformationDoc.getMotherFirstNames());
      
        marriageMotherInformation.setMotherMaidenName(marriageMotherInformationDoc.getMotherMaidenName());
      
        return marriageMotherInformation;
    }

    @Override
    public MarriageMotherInformation clone() {
        MarriageMotherInformation result = new MarriageMotherInformation();
        
          
            
        result.setMotherFirstNames(motherFirstNames);
      
          
        
          
            
        result.setMotherMaidenName(motherMaidenName);
      
          
        
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
        
        
        profiles = {"type"},
        message = "motherFirstNames"
      )
    
      @NotBlank(
        
        
        profiles = {"type"},
        message = "motherFirstNames"
      )
    
    private String motherFirstNames;

    public final void setMotherFirstNames(final String motherFirstNames) {
        this.motherFirstNames = motherFirstNames;
    }

    /**
  
        * @hibernate.property
        *  column="mother_first_names"
        
      
    */
    public final String getMotherFirstNames() {
        return this.motherFirstNames;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"type"},
        message = "motherMaidenName"
      )
    
      @NotNull(
        
        
        profiles = {"type"},
        message = "motherMaidenName"
      )
    
      @NotBlank(
        
        
        profiles = {"type"},
        message = "motherMaidenName"
      )
    
    private String motherMaidenName;

    public final void setMotherMaidenName(final String motherMaidenName) {
        this.motherMaidenName = motherMaidenName;
    }

    /**
  
        * @hibernate.property
        *  column="mother_maiden_name"
        *  length="38"
      
    */
    public final String getMotherMaidenName() {
        return this.motherMaidenName;
    }
  
}
