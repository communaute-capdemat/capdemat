
package fr.cg95.cvq.business.request.military;

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
import fr.cg95.cvq.xml.request.military.*;
import fr.cg95.cvq.service.request.LocalReferential;
import fr.cg95.cvq.service.request.condition.IConditionChecker;

/**
 * Generated class file, do not edit !
 *
 * @hibernate.class
 *  table="military_father_information"
 *  lazy="false"
 */
public class MilitaryFatherInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public MilitaryFatherInformation() {
        super();
      
    }

    public final String modelToXmlString() {
        MilitaryFatherInformationType object = (MilitaryFatherInformationType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MilitaryFatherInformationType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MilitaryFatherInformationType militaryFatherInformation = MilitaryFatherInformationType.Factory.newInstance();
        int i = 0;
    
        militaryFatherInformation.setFatherBirthCity(this.fatherBirthCity);
      
        date = this.fatherBirthDate;
        if (date != null) {
            calendar.setTime(date);
            militaryFatherInformation.setFatherBirthDate(calendar);
        }
      
        if (this.fatherBirthDepartment != null)
            militaryFatherInformation.setFatherBirthDepartment(fr.cg95.cvq.xml.common.InseeDepartementCodeType.Enum.forString(this.fatherBirthDepartment.toString()));
      
        militaryFatherInformation.setFatherFirstName(this.fatherFirstName);
      
        militaryFatherInformation.setFatherLastName(this.fatherLastName);
      
        if (this.fatherBirthCountry != null)
            militaryFatherInformation.setFatherBirthCountry(fr.cg95.cvq.xml.common.CountryType.Enum.forString(this.fatherBirthCountry.toString()));
      
        if (this.fatherNationality != null)
            militaryFatherInformation.setFatherNationality(fr.cg95.cvq.xml.common.FullNationalityType.Enum.forString(this.fatherNationality.toString()));
      
        return militaryFatherInformation;
    }

    public static MilitaryFatherInformation xmlToModel(MilitaryFatherInformationType militaryFatherInformationDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MilitaryFatherInformation militaryFatherInformation = new MilitaryFatherInformation();
    
        militaryFatherInformation.setFatherBirthCity(militaryFatherInformationDoc.getFatherBirthCity());
      
        calendar = militaryFatherInformationDoc.getFatherBirthDate();
        if (calendar != null) {
            militaryFatherInformation.setFatherBirthDate(calendar.getTime());
        }
      
        if (militaryFatherInformationDoc.getFatherBirthDepartment() != null)
            militaryFatherInformation.setFatherBirthDepartment(fr.cg95.cvq.business.users.InseeDepartementCodeType.forString(militaryFatherInformationDoc.getFatherBirthDepartment().toString()));
        else
            militaryFatherInformation.setFatherBirthDepartment(fr.cg95.cvq.business.users.InseeDepartementCodeType.getDefaultInseeDepartementCodeType());
      
        militaryFatherInformation.setFatherFirstName(militaryFatherInformationDoc.getFatherFirstName());
      
        militaryFatherInformation.setFatherLastName(militaryFatherInformationDoc.getFatherLastName());
      
        if (militaryFatherInformationDoc.getFatherBirthCountry() != null)
            militaryFatherInformation.setFatherBirthCountry(fr.cg95.cvq.business.users.CountryType.forString(militaryFatherInformationDoc.getFatherBirthCountry().toString()));
        else
            militaryFatherInformation.setFatherBirthCountry(fr.cg95.cvq.business.users.CountryType.getDefaultCountryType());
      
        if (militaryFatherInformationDoc.getFatherNationality() != null)
            militaryFatherInformation.setFatherNationality(fr.cg95.cvq.business.users.FullNationalityType.forString(militaryFatherInformationDoc.getFatherNationality().toString()));
        else
            militaryFatherInformation.setFatherNationality(fr.cg95.cvq.business.users.FullNationalityType.getDefaultFullNationalityType());
      
        return militaryFatherInformation;
    }

    @Override
    public MilitaryFatherInformation clone() {
        MilitaryFatherInformation result = new MilitaryFatherInformation();
        
          
            
        result.setFatherBirthCity(fatherBirthCity);
      
          
        
          
            
        result.setFatherBirthDate(fatherBirthDate);
      
          
        
          
            
        if (fatherBirthDepartment != null)
            result.setFatherBirthDepartment(fatherBirthDepartment);
        else
            result.setFatherBirthDepartment(fr.cg95.cvq.business.users.InseeDepartementCodeType.getDefaultInseeDepartementCodeType());
      
          
        
          
            
        result.setFatherFirstName(fatherFirstName);
      
          
        
          
            
        result.setFatherLastName(fatherLastName);
      
          
        
          
            
        if (fatherBirthCountry != null)
            result.setFatherBirthCountry(fatherBirthCountry);
        else
            result.setFatherBirthCountry(fr.cg95.cvq.business.users.CountryType.getDefaultCountryType());
      
          
        
          
            
        if (fatherNationality != null)
            result.setFatherNationality(fatherNationality);
        else
            result.setFatherNationality(fr.cg95.cvq.business.users.FullNationalityType.getDefaultFullNationalityType());
      
          
        
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

  
    
    private String fatherBirthCity;

    public final void setFatherBirthCity(final String fatherBirthCity) {
        this.fatherBirthCity = fatherBirthCity;
    }

    /**
  
        * @hibernate.property
        *  column="father_birth_city"
        
      
    */
    public final String getFatherBirthCity() {
        return this.fatherBirthCity;
    }
  
    
    private java.util.Date fatherBirthDate;

    public final void setFatherBirthDate(final java.util.Date fatherBirthDate) {
        this.fatherBirthDate = fatherBirthDate;
    }

    /**
  
        * @hibernate.property
        *  column="father_birth_date"
        
      
    */
    public final java.util.Date getFatherBirthDate() {
        return this.fatherBirthDate;
    }
  
    
    private fr.cg95.cvq.business.users.InseeDepartementCodeType fatherBirthDepartment;

    public final void setFatherBirthDepartment(final fr.cg95.cvq.business.users.InseeDepartementCodeType fatherBirthDepartment) {
        this.fatherBirthDepartment = fatherBirthDepartment;
    }

    /**
  
        * @hibernate.property
        *  column="father_birth_department"
        
      
    */
    public final fr.cg95.cvq.business.users.InseeDepartementCodeType getFatherBirthDepartment() {
        return this.fatherBirthDepartment;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"parentage"},
        message = "fatherFirstName"
      )
    
    private String fatherFirstName;

    public final void setFatherFirstName(final String fatherFirstName) {
        this.fatherFirstName = fatherFirstName;
    }

    /**
  
        * @hibernate.property
        *  column="father_first_name"
        *  length="38"
      
    */
    public final String getFatherFirstName() {
        return this.fatherFirstName;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"parentage"},
        message = "fatherLastName"
      )
    
    private String fatherLastName;

    public final void setFatherLastName(final String fatherLastName) {
        this.fatherLastName = fatherLastName;
    }

    /**
  
        * @hibernate.property
        *  column="father_last_name"
        *  length="38"
      
    */
    public final String getFatherLastName() {
        return this.fatherLastName;
    }
  
    
    private fr.cg95.cvq.business.users.CountryType fatherBirthCountry;

    public final void setFatherBirthCountry(final fr.cg95.cvq.business.users.CountryType fatherBirthCountry) {
        this.fatherBirthCountry = fatherBirthCountry;
    }

    /**
  
        * @hibernate.property
        *  column="father_birth_country"
        
      
    */
    public final fr.cg95.cvq.business.users.CountryType getFatherBirthCountry() {
        return this.fatherBirthCountry;
    }
  
    
    private fr.cg95.cvq.business.users.FullNationalityType fatherNationality;

    public final void setFatherNationality(final fr.cg95.cvq.business.users.FullNationalityType fatherNationality) {
        this.fatherNationality = fatherNationality;
    }

    /**
  
        * @hibernate.property
        *  column="father_nationality"
        
      
    */
    public final fr.cg95.cvq.business.users.FullNationalityType getFatherNationality() {
        return this.fatherNationality;
    }
  
}
