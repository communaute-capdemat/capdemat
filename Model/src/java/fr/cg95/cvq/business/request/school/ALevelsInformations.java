
package fr.cg95.cvq.business.request.school;

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
import fr.cg95.cvq.xml.request.school.*;
import fr.cg95.cvq.service.request.LocalReferential;
import fr.cg95.cvq.service.request.condition.IConditionChecker;

/**
 * Generated class file, do not edit !
 *
 * @hibernate.class
 *  table="a_levels_informations"
 *  lazy="false"
 */
public class ALevelsInformations implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public ALevelsInformations() {
        super();
      
    }

    public final String modelToXmlString() {
        ALevelsInformationsType object = (ALevelsInformationsType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final ALevelsInformationsType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        ALevelsInformationsType aLevelsInformations = ALevelsInformationsType.Factory.newInstance();
        int i = 0;
    
        if (this.alevels != null)
            aLevelsInformations.setAlevels(fr.cg95.cvq.xml.request.school.ALevelsType.Enum.forString(this.alevels.toString()));
      
        aLevelsInformations.setAlevelsDate(this.alevelsDate);
      
        return aLevelsInformations;
    }

    public static ALevelsInformations xmlToModel(ALevelsInformationsType aLevelsInformationsDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        ALevelsInformations aLevelsInformations = new ALevelsInformations();
    
        if (aLevelsInformationsDoc.getAlevels() != null)
            aLevelsInformations.setAlevels(fr.cg95.cvq.business.request.school.ALevelsType.forString(aLevelsInformationsDoc.getAlevels().toString()));
        else
            aLevelsInformations.setAlevels(fr.cg95.cvq.business.request.school.ALevelsType.getDefaultALevelsType());
      
        aLevelsInformations.setAlevelsDate(aLevelsInformationsDoc.getAlevelsDate());
      
        return aLevelsInformations;
    }

    @Override
    public ALevelsInformations clone() {
        ALevelsInformations result = new ALevelsInformations();
        
          
            
        if (alevels != null)
            result.setAlevels(alevels);
        else
            result.setAlevels(fr.cg95.cvq.business.request.school.ALevelsType.getDefaultALevelsType());
      
          
        
          
            
        result.setAlevelsDate(alevelsDate);
      
          
        
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
        
        
        profiles = {"currentStudies"},
        message = "alevels"
      )
    
    private fr.cg95.cvq.business.request.school.ALevelsType alevels;

    public final void setAlevels(final fr.cg95.cvq.business.request.school.ALevelsType alevels) {
        this.alevels = alevels;
    }

    /**
  
        * @hibernate.property
        *  column="alevels"
        
      
    */
    public final fr.cg95.cvq.business.request.school.ALevelsType getAlevels() {
        return this.alevels;
    }
  
    
      @MaxLength(
        
          value = 4,
        
        
        profiles = {"currentStudies"},
        message = "alevelsDate"
      )
    
      @NotNull(
        
        
        profiles = {"currentStudies"},
        message = "alevelsDate"
      )
    
      @MatchPattern(
        
          pattern = "^\\d{2,4}$",
        
        
        profiles = {"currentStudies"},
        message = "alevelsDate"
      )
    
      @NotBlank(
        
        
        profiles = {"currentStudies"},
        message = "alevelsDate"
      )
    
    private String alevelsDate;

    public final void setAlevelsDate(final String alevelsDate) {
        this.alevelsDate = alevelsDate;
    }

    /**
  
        * @hibernate.property
        *  column="alevels_date"
        *  length="4"
      
    */
    public final String getAlevelsDate() {
        return this.alevelsDate;
    }
  
}
