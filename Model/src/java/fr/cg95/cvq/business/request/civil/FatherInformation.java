
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
@Table(name="father_information")
public class FatherInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        BirthDetailsRequest.conditions;

    public FatherInformation() {
        super();
      
    }

    public final String modelToXmlString() {
        FatherInformationType object = (FatherInformationType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final FatherInformationType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        FatherInformationType fatherInformation = FatherInformationType.Factory.newInstance();
        int i = 0;
    
        fatherInformation.setFatherLastName(this.fatherLastName);
      
        fatherInformation.setFatherFirstNames(this.fatherFirstNames);
      
        return fatherInformation;
    }

    public static FatherInformation xmlToModel(FatherInformationType fatherInformationDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        FatherInformation fatherInformation = new FatherInformation();
    
        fatherInformation.setFatherLastName(fatherInformationDoc.getFatherLastName());
      
        fatherInformation.setFatherFirstNames(fatherInformationDoc.getFatherFirstNames());
      
        return fatherInformation;
    }

    @Override
    public FatherInformation clone() {
        FatherInformation result = new FatherInformation();
        
          
            
        result.setFatherLastName(fatherLastName);
      
          
        
          
            
        result.setFatherFirstNames(fatherFirstNames);
      
          
        
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

  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"type"},
        message = "fatherLastName"
      )
    
      @NotNull(
        
        
        profiles = {"type"},
        message = "fatherLastName"
      )
    
      @NotBlank(
        
        
        profiles = {"type"},
        message = "fatherLastName"
      )
    
    private String fatherLastName;

    public void setFatherLastName(final String fatherLastName) {
        this.fatherLastName = fatherLastName;
    }

    
    @Column(name="father_last_name" , length=38 )
      
    public String getFatherLastName() {
        return this.fatherLastName;
    }
  
    
      @NotNull(
        
        
        profiles = {"type"},
        message = "fatherFirstNames"
      )
    
      @NotBlank(
        
        
        profiles = {"type"},
        message = "fatherFirstNames"
      )
    
    private String fatherFirstNames;

    public void setFatherFirstNames(final String fatherFirstNames) {
        this.fatherFirstNames = fatherFirstNames;
    }

    
    @Column(name="father_first_names"  )
      
    public String getFatherFirstNames() {
        return this.fatherFirstNames;
    }
  
}
