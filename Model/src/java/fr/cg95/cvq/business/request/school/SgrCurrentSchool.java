
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
 *  table="sgr_current_school"
 *  lazy="false"
 */
public class SgrCurrentSchool implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public SgrCurrentSchool() {
        super();
      
        currentSchoolCountry = fr.cg95.cvq.business.users.CountryType.FR;
      
    }

    public final String modelToXmlString() {
        SgrCurrentSchoolType object = (SgrCurrentSchoolType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final SgrCurrentSchoolType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        SgrCurrentSchoolType sgrCurrentSchool = SgrCurrentSchoolType.Factory.newInstance();
        int i = 0;
    
        sgrCurrentSchool.setCurrentSchoolPostalCode(this.currentSchoolPostalCode);
      
        sgrCurrentSchool.setCurrentSchoolNamePrecision(this.currentSchoolNamePrecision);
      
        if (this.currentSchoolCountry != null)
            sgrCurrentSchool.setCurrentSchoolCountry(fr.cg95.cvq.xml.common.CountryType.Enum.forString(this.currentSchoolCountry.toString()));
      
        sgrCurrentSchool.setCurrentSchoolCity(this.currentSchoolCity);
      
        i = 0;
        if (this.currentSchoolName != null) {
            fr.cg95.cvq.xml.common.LocalReferentialDataType[] currentSchoolNameTypeTab = new fr.cg95.cvq.xml.common.LocalReferentialDataType[currentSchoolName.size()];
            for (LocalReferentialData object : currentSchoolName) {
              currentSchoolNameTypeTab[i++] = LocalReferentialData.modelToXml(object);
            }
            sgrCurrentSchool.setCurrentSchoolNameArray(currentSchoolNameTypeTab);
        }
      
        return sgrCurrentSchool;
    }

    public static SgrCurrentSchool xmlToModel(SgrCurrentSchoolType sgrCurrentSchoolDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        SgrCurrentSchool sgrCurrentSchool = new SgrCurrentSchool();
    
        sgrCurrentSchool.setCurrentSchoolPostalCode(sgrCurrentSchoolDoc.getCurrentSchoolPostalCode());
      
        sgrCurrentSchool.setCurrentSchoolNamePrecision(sgrCurrentSchoolDoc.getCurrentSchoolNamePrecision());
      
        if (sgrCurrentSchoolDoc.getCurrentSchoolCountry() != null)
            sgrCurrentSchool.setCurrentSchoolCountry(fr.cg95.cvq.business.users.CountryType.forString(sgrCurrentSchoolDoc.getCurrentSchoolCountry().toString()));
        else
            sgrCurrentSchool.setCurrentSchoolCountry(fr.cg95.cvq.business.users.CountryType.getDefaultCountryType());
      
        sgrCurrentSchool.setCurrentSchoolCity(sgrCurrentSchoolDoc.getCurrentSchoolCity());
      
        List<fr.cg95.cvq.business.request.LocalReferentialData> currentSchoolNameList = new ArrayList<fr.cg95.cvq.business.request.LocalReferentialData>(sgrCurrentSchoolDoc.sizeOfCurrentSchoolNameArray());
        for (LocalReferentialDataType object : sgrCurrentSchoolDoc.getCurrentSchoolNameArray()) {
            currentSchoolNameList.add(fr.cg95.cvq.business.request.LocalReferentialData.xmlToModel(object));
        }
        sgrCurrentSchool.setCurrentSchoolName(currentSchoolNameList);
      
        return sgrCurrentSchool;
    }

    @Override
    public SgrCurrentSchool clone() {
        SgrCurrentSchool result = new SgrCurrentSchool();
        
          
            
        result.setCurrentSchoolPostalCode(currentSchoolPostalCode);
      
          
        
          
            
        result.setCurrentSchoolNamePrecision(currentSchoolNamePrecision);
      
          
        
          
            
        if (currentSchoolCountry != null)
            result.setCurrentSchoolCountry(currentSchoolCountry);
        else
            result.setCurrentSchoolCountry(fr.cg95.cvq.business.users.CountryType.getDefaultCountryType());
      
          
        
          
            
        result.setCurrentSchoolCity(currentSchoolCity);
      
          
        
          
            
        List<fr.cg95.cvq.business.request.LocalReferentialData> currentSchoolNameList = new ArrayList<fr.cg95.cvq.business.request.LocalReferentialData>();
        for (LocalReferentialData object : currentSchoolName) {
            currentSchoolNameList.add(object.clone());
        }
        result.setCurrentSchoolName(currentSchoolNameList);
      
          
        
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

  
    
      @MaxLength(
        
          value = 5,
        
        
        profiles = {"currentStudies"},
        message = "currentSchoolPostalCode"
      )
    
      @NotNull(
        
        
        profiles = {"currentStudies"},
        message = "currentSchoolPostalCode"
      )
    
      @NotBlank(
        
        
        profiles = {"currentStudies"},
        message = "currentSchoolPostalCode"
      )
    
    private String currentSchoolPostalCode;

    public final void setCurrentSchoolPostalCode(final String currentSchoolPostalCode) {
        this.currentSchoolPostalCode = currentSchoolPostalCode;
    }

    /**
  
        * @hibernate.property
        *  column="current_school_postal_code"
        *  length="5"
      
    */
    public final String getCurrentSchoolPostalCode() {
        return this.currentSchoolPostalCode;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "if (_this.currentSchoolName == null || _this.currentSchoolName.isEmpty()) return false; _this.currentSchoolName.each { active &= _this.conditions['sgrCurrentSchool.currentSchoolName'].test(it.name) };" +
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "currentSchoolNamePrecision"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "if (_this.currentSchoolName == null || _this.currentSchoolName.isEmpty()) return false; _this.currentSchoolName.each { active &= _this.conditions['sgrCurrentSchool.currentSchoolName'].test(it.name) };" +
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "currentSchoolNamePrecision"
      )
    
    private String currentSchoolNamePrecision;

    public final void setCurrentSchoolNamePrecision(final String currentSchoolNamePrecision) {
        this.currentSchoolNamePrecision = currentSchoolNamePrecision;
    }

    /**
  
        * @hibernate.property
        *  column="current_school_name_precision"
        
      
    */
    public final String getCurrentSchoolNamePrecision() {
        return this.currentSchoolNamePrecision;
    }
  
    
      @NotNull(
        
        
        profiles = {"currentStudies"},
        message = "currentSchoolCountry"
      )
    
    private fr.cg95.cvq.business.users.CountryType currentSchoolCountry;

    public final void setCurrentSchoolCountry(final fr.cg95.cvq.business.users.CountryType currentSchoolCountry) {
        this.currentSchoolCountry = currentSchoolCountry;
    }

    /**
  
        * @hibernate.property
        *  column="current_school_country"
        
      
    */
    public final fr.cg95.cvq.business.users.CountryType getCurrentSchoolCountry() {
        return this.currentSchoolCountry;
    }
  
    
      @MaxLength(
        
          value = 32,
        
        
        profiles = {"currentStudies"},
        message = "currentSchoolCity"
      )
    
      @NotNull(
        
        
        profiles = {"currentStudies"},
        message = "currentSchoolCity"
      )
    
      @NotBlank(
        
        
        profiles = {"currentStudies"},
        message = "currentSchoolCity"
      )
    
    private String currentSchoolCity;

    public final void setCurrentSchoolCity(final String currentSchoolCity) {
        this.currentSchoolCity = currentSchoolCity;
    }

    /**
  
        * @hibernate.property
        *  column="current_school_city"
        *  length="32"
      
    */
    public final String getCurrentSchoolCity() {
        return this.currentSchoolCity;
    }
  
    
      @LocalReferential(
        
        
        profiles = {"currentStudies"},
        message = "currentSchoolName"
      )
    
      @MinSize(
        
          value = 1,
        
        
        profiles = {"currentStudies"},
        message = "currentSchoolName"
      )
    
    private List<fr.cg95.cvq.business.request.LocalReferentialData> currentSchoolName;

    public final void setCurrentSchoolName(final List<fr.cg95.cvq.business.request.LocalReferentialData> currentSchoolName) {
        this.currentSchoolName = currentSchoolName;
    }

    /**
  
        * @hibernate.list
        *  inverse="false"
        *  lazy="false"
        *  cascade="all"
        *  table="current_school_name"
        * @hibernate.key
        *  column="sgr_current_school_id"
        * @hibernate.list-index
        *  column="current_school_name_index"
        * @hibernate.many-to-many
        *  column="current_school_name_id"
        *  class="fr.cg95.cvq.business.request.LocalReferentialData"
      
    */
    public final List<fr.cg95.cvq.business.request.LocalReferentialData> getCurrentSchoolName() {
        return this.currentSchoolName;
    }
  
}
