
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
 *  table="current_school"
 *  lazy="false"
 */
public class CurrentSchool implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public CurrentSchool() {
        super();
      
        currentSection = fr.cg95.cvq.business.users.SectionType.UNKNOWN;
      
    }

    public final String modelToXmlString() {
        CurrentSchoolType object = (CurrentSchoolType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final CurrentSchoolType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        CurrentSchoolType currentSchool = CurrentSchoolType.Factory.newInstance();
        int i = 0;
    
        currentSchool.setCurrentSchoolAddress(this.currentSchoolAddress);
      
        if (this.currentSection != null)
            currentSchool.setCurrentSection(fr.cg95.cvq.xml.common.SectionType.Enum.forString(this.currentSection.toString()));
      
        currentSchool.setCurrentSchoolName(this.currentSchoolName);
      
        return currentSchool;
    }

    public static CurrentSchool xmlToModel(CurrentSchoolType currentSchoolDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        CurrentSchool currentSchool = new CurrentSchool();
    
        currentSchool.setCurrentSchoolAddress(currentSchoolDoc.getCurrentSchoolAddress());
      
        if (currentSchoolDoc.getCurrentSection() != null)
            currentSchool.setCurrentSection(fr.cg95.cvq.business.users.SectionType.forString(currentSchoolDoc.getCurrentSection().toString()));
        else
            currentSchool.setCurrentSection(fr.cg95.cvq.business.users.SectionType.getDefaultSectionType());
      
        currentSchool.setCurrentSchoolName(currentSchoolDoc.getCurrentSchoolName());
      
        return currentSchool;
    }

    @Override
    public CurrentSchool clone() {
        CurrentSchool result = new CurrentSchool();
        
          
            
        result.setCurrentSchoolAddress(currentSchoolAddress);
      
          
        
          
            
        if (currentSection != null)
            result.setCurrentSection(currentSection);
        else
            result.setCurrentSection(fr.cg95.cvq.business.users.SectionType.getDefaultSectionType());
      
          
        
          
            
        result.setCurrentSchoolName(currentSchoolName);
      
          
        
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

  
    
    private String currentSchoolAddress;

    public final void setCurrentSchoolAddress(final String currentSchoolAddress) {
        this.currentSchoolAddress = currentSchoolAddress;
    }

    /**
  
        * @hibernate.property
        *  column="current_school_address"
        
      
    */
    public final String getCurrentSchoolAddress() {
        return this.currentSchoolAddress;
    }
  
    
    private fr.cg95.cvq.business.users.SectionType currentSection;

    public final void setCurrentSection(final fr.cg95.cvq.business.users.SectionType currentSection) {
        this.currentSection = currentSection;
    }

    /**
  
        * @hibernate.property
        *  column="current_section"
        *  length="32"
      
    */
    public final fr.cg95.cvq.business.users.SectionType getCurrentSection() {
        return this.currentSection;
    }
  
    
    private String currentSchoolName;

    public final void setCurrentSchoolName(final String currentSchoolName) {
        this.currentSchoolName = currentSchoolName;
    }

    /**
  
        * @hibernate.property
        *  column="current_school_name"
        
      
    */
    public final String getCurrentSchoolName() {
        return this.currentSchoolName;
    }
  
}
