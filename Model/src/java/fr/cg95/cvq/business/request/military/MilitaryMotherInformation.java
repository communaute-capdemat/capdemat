
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
 *  table="military_mother_information"
 *  lazy="false"
 */
public class MilitaryMotherInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public MilitaryMotherInformation() {
        super();
      
        motherNationality = fr.cg95.cvq.business.users.FullNationalityType.FR;
      
    }

    public final String modelToXmlString() {
        MilitaryMotherInformationType object = (MilitaryMotherInformationType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MilitaryMotherInformationType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MilitaryMotherInformationType militaryMotherInformation = MilitaryMotherInformationType.Factory.newInstance();
        int i = 0;
    
        date = this.motherBirthDate;
        if (date != null) {
            calendar.setTime(date);
            militaryMotherInformation.setMotherBirthDate(calendar);
        }
      
        militaryMotherInformation.setMotherFirstName(this.motherFirstName);
      
        if (this.motherBirthCountry != null)
            militaryMotherInformation.setMotherBirthCountry(fr.cg95.cvq.xml.common.CountryType.Enum.forString(this.motherBirthCountry.toString()));
      
        if (this.motherNationality != null)
            militaryMotherInformation.setMotherNationality(fr.cg95.cvq.xml.common.FullNationalityType.Enum.forString(this.motherNationality.toString()));
      
        militaryMotherInformation.setMotherBirthCity(this.motherBirthCity);
      
        militaryMotherInformation.setMotherLastName(this.motherLastName);
      
        if (this.motherBirthDepartment != null)
            militaryMotherInformation.setMotherBirthDepartment(fr.cg95.cvq.xml.common.InseeDepartementCodeType.Enum.forString(this.motherBirthDepartment.toString()));
      
        return militaryMotherInformation;
    }

    public static MilitaryMotherInformation xmlToModel(MilitaryMotherInformationType militaryMotherInformationDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MilitaryMotherInformation militaryMotherInformation = new MilitaryMotherInformation();
    
        calendar = militaryMotherInformationDoc.getMotherBirthDate();
        if (calendar != null) {
            militaryMotherInformation.setMotherBirthDate(calendar.getTime());
        }
      
        militaryMotherInformation.setMotherFirstName(militaryMotherInformationDoc.getMotherFirstName());
      
        if (militaryMotherInformationDoc.getMotherBirthCountry() != null)
            militaryMotherInformation.setMotherBirthCountry(fr.cg95.cvq.business.users.CountryType.forString(militaryMotherInformationDoc.getMotherBirthCountry().toString()));
        else
            militaryMotherInformation.setMotherBirthCountry(fr.cg95.cvq.business.users.CountryType.getDefaultCountryType());
      
        if (militaryMotherInformationDoc.getMotherNationality() != null)
            militaryMotherInformation.setMotherNationality(fr.cg95.cvq.business.users.FullNationalityType.forString(militaryMotherInformationDoc.getMotherNationality().toString()));
        else
            militaryMotherInformation.setMotherNationality(fr.cg95.cvq.business.users.FullNationalityType.getDefaultFullNationalityType());
      
        militaryMotherInformation.setMotherBirthCity(militaryMotherInformationDoc.getMotherBirthCity());
      
        militaryMotherInformation.setMotherLastName(militaryMotherInformationDoc.getMotherLastName());
      
        if (militaryMotherInformationDoc.getMotherBirthDepartment() != null)
            militaryMotherInformation.setMotherBirthDepartment(fr.cg95.cvq.business.users.InseeDepartementCodeType.forString(militaryMotherInformationDoc.getMotherBirthDepartment().toString()));
        else
            militaryMotherInformation.setMotherBirthDepartment(fr.cg95.cvq.business.users.InseeDepartementCodeType.getDefaultInseeDepartementCodeType());
      
        return militaryMotherInformation;
    }

    @Override
    public MilitaryMotherInformation clone() {
        MilitaryMotherInformation result = new MilitaryMotherInformation();
        
          
            
        result.setMotherBirthDate(motherBirthDate);
      
          
        
          
            
        result.setMotherFirstName(motherFirstName);
      
          
        
          
            
        if (motherBirthCountry != null)
            result.setMotherBirthCountry(motherBirthCountry);
        else
            result.setMotherBirthCountry(fr.cg95.cvq.business.users.CountryType.getDefaultCountryType());
      
          
        
          
            
        if (motherNationality != null)
            result.setMotherNationality(motherNationality);
        else
            result.setMotherNationality(fr.cg95.cvq.business.users.FullNationalityType.getDefaultFullNationalityType());
      
          
        
          
            
        result.setMotherBirthCity(motherBirthCity);
      
          
        
          
            
        result.setMotherLastName(motherLastName);
      
          
        
          
            
        if (motherBirthDepartment != null)
            result.setMotherBirthDepartment(motherBirthDepartment);
        else
            result.setMotherBirthDepartment(fr.cg95.cvq.business.users.InseeDepartementCodeType.getDefaultInseeDepartementCodeType());
      
          
        
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
        
        
        profiles = {"parentage"},
        message = "motherBirthDate"
      )
    
    private java.util.Date motherBirthDate;

    public final void setMotherBirthDate(final java.util.Date motherBirthDate) {
        this.motherBirthDate = motherBirthDate;
    }

    /**
  
        * @hibernate.property
        *  column="mother_birth_date"
        
      
    */
    public final java.util.Date getMotherBirthDate() {
        return this.motherBirthDate;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"parentage"},
        message = "motherFirstName"
      )
    
      @NotNull(
        
        
        profiles = {"parentage"},
        message = "motherFirstName"
      )
    
      @NotBlank(
        
        
        profiles = {"parentage"},
        message = "motherFirstName"
      )
    
    private String motherFirstName;

    public final void setMotherFirstName(final String motherFirstName) {
        this.motherFirstName = motherFirstName;
    }

    /**
  
        * @hibernate.property
        *  column="mother_first_name"
        *  length="38"
      
    */
    public final String getMotherFirstName() {
        return this.motherFirstName;
    }
  
    
    private fr.cg95.cvq.business.users.CountryType motherBirthCountry;

    public final void setMotherBirthCountry(final fr.cg95.cvq.business.users.CountryType motherBirthCountry) {
        this.motherBirthCountry = motherBirthCountry;
    }

    /**
  
        * @hibernate.property
        *  column="mother_birth_country"
        
      
    */
    public final fr.cg95.cvq.business.users.CountryType getMotherBirthCountry() {
        return this.motherBirthCountry;
    }
  
    
      @NotNull(
        
        
        profiles = {"parentage"},
        message = "motherNationality"
      )
    
    private fr.cg95.cvq.business.users.FullNationalityType motherNationality;

    public final void setMotherNationality(final fr.cg95.cvq.business.users.FullNationalityType motherNationality) {
        this.motherNationality = motherNationality;
    }

    /**
  
        * @hibernate.property
        *  column="mother_nationality"
        
      
    */
    public final fr.cg95.cvq.business.users.FullNationalityType getMotherNationality() {
        return this.motherNationality;
    }
  
    
      @NotNull(
        
        
        profiles = {"parentage"},
        message = "motherBirthCity"
      )
    
      @NotBlank(
        
        
        profiles = {"parentage"},
        message = "motherBirthCity"
      )
    
    private String motherBirthCity;

    public final void setMotherBirthCity(final String motherBirthCity) {
        this.motherBirthCity = motherBirthCity;
    }

    /**
  
        * @hibernate.property
        *  column="mother_birth_city"
        
      
    */
    public final String getMotherBirthCity() {
        return this.motherBirthCity;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"parentage"},
        message = "motherLastName"
      )
    
      @NotNull(
        
        
        profiles = {"parentage"},
        message = "motherLastName"
      )
    
      @NotBlank(
        
        
        profiles = {"parentage"},
        message = "motherLastName"
      )
    
    private String motherLastName;

    public final void setMotherLastName(final String motherLastName) {
        this.motherLastName = motherLastName;
    }

    /**
  
        * @hibernate.property
        *  column="mother_last_name"
        *  length="38"
      
    */
    public final String getMotherLastName() {
        return this.motherLastName;
    }
  
    
    private fr.cg95.cvq.business.users.InseeDepartementCodeType motherBirthDepartment;

    public final void setMotherBirthDepartment(final fr.cg95.cvq.business.users.InseeDepartementCodeType motherBirthDepartment) {
        this.motherBirthDepartment = motherBirthDepartment;
    }

    /**
  
        * @hibernate.property
        *  column="mother_birth_department"
        
      
    */
    public final fr.cg95.cvq.business.users.InseeDepartementCodeType getMotherBirthDepartment() {
        return this.motherBirthDepartment;
    }
  
}
