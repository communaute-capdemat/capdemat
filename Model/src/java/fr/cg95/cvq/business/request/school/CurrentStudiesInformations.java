
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
import javax.persistence.*;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Type;

/**
 * Generated class file, do not edit !
 */
@Entity
@Table(name="current_studies_informations")
public class CurrentStudiesInformations implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        StudyGrantRequest.conditions;

    public CurrentStudiesInformations() {
        super();
      
        abroadInternship = Boolean.valueOf(false);
      
        sandwichCourses = Boolean.valueOf(false);
      
    }

    public final String modelToXmlString() {
        CurrentStudiesInformationsType object = (CurrentStudiesInformationsType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final CurrentStudiesInformationsType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        CurrentStudiesInformationsType currentStudiesInformations = CurrentStudiesInformationsType.Factory.newInstance();
        int i = 0;
    
        currentStudiesInformations.setAbroadInternshipSchoolName(this.abroadInternshipSchoolName);
      
        if (this.abroadInternshipSchoolCountry != null)
            currentStudiesInformations.setAbroadInternshipSchoolCountry(fr.cg95.cvq.xml.common.CountryType.Enum.forString(this.abroadInternshipSchoolCountry.getLegacyLabel()));
      
        date = this.abroadInternshipEndDate;
        if (date != null) {
            calendar.setTime(date);
            currentStudiesInformations.setAbroadInternshipEndDate(calendar);
        }
      
        currentStudiesInformations.setOtherStudiesLabel(this.otherStudiesLabel);
      
        if (this.currentStudiesDiploma != null)
            currentStudiesInformations.setCurrentStudiesDiploma(fr.cg95.cvq.xml.request.school.CurrentStudiesType.Enum.forString(this.currentStudiesDiploma.getLegacyLabel()));
      
        if (this.abroadInternship != null)
            currentStudiesInformations.setAbroadInternship(this.abroadInternship.booleanValue());
      
        if (this.currentStudiesLevel != null)
            currentStudiesInformations.setCurrentStudiesLevel(fr.cg95.cvq.xml.request.school.CurrentStudiesLevelType.Enum.forString(this.currentStudiesLevel.getLegacyLabel()));
      
        date = this.abroadInternshipStartDate;
        if (date != null) {
            calendar.setTime(date);
            currentStudiesInformations.setAbroadInternshipStartDate(calendar);
        }
      
        if (this.sandwichCourses != null)
            currentStudiesInformations.setSandwichCourses(this.sandwichCourses.booleanValue());
      
        return currentStudiesInformations;
    }

    public static CurrentStudiesInformations xmlToModel(CurrentStudiesInformationsType currentStudiesInformationsDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        CurrentStudiesInformations currentStudiesInformations = new CurrentStudiesInformations();
    
        currentStudiesInformations.setAbroadInternshipSchoolName(currentStudiesInformationsDoc.getAbroadInternshipSchoolName());
      
        if (currentStudiesInformationsDoc.getAbroadInternshipSchoolCountry() != null)
            currentStudiesInformations.setAbroadInternshipSchoolCountry(fr.cg95.cvq.business.users.CountryType.forString(currentStudiesInformationsDoc.getAbroadInternshipSchoolCountry().toString()));
        else
            currentStudiesInformations.setAbroadInternshipSchoolCountry(fr.cg95.cvq.business.users.CountryType.getDefaultCountryType());
      
        calendar = currentStudiesInformationsDoc.getAbroadInternshipEndDate();
        if (calendar != null) {
            currentStudiesInformations.setAbroadInternshipEndDate(calendar.getTime());
        }
      
        currentStudiesInformations.setOtherStudiesLabel(currentStudiesInformationsDoc.getOtherStudiesLabel());
      
        if (currentStudiesInformationsDoc.getCurrentStudiesDiploma() != null)
            currentStudiesInformations.setCurrentStudiesDiploma(fr.cg95.cvq.business.request.school.CurrentStudiesType.forString(currentStudiesInformationsDoc.getCurrentStudiesDiploma().toString()));
        else
            currentStudiesInformations.setCurrentStudiesDiploma(fr.cg95.cvq.business.request.school.CurrentStudiesType.getDefaultCurrentStudiesType());
      
        currentStudiesInformations.setAbroadInternship(Boolean.valueOf(currentStudiesInformationsDoc.getAbroadInternship()));
      
        if (currentStudiesInformationsDoc.getCurrentStudiesLevel() != null)
            currentStudiesInformations.setCurrentStudiesLevel(fr.cg95.cvq.business.request.school.CurrentStudiesLevelType.forString(currentStudiesInformationsDoc.getCurrentStudiesLevel().toString()));
        else
            currentStudiesInformations.setCurrentStudiesLevel(fr.cg95.cvq.business.request.school.CurrentStudiesLevelType.getDefaultCurrentStudiesLevelType());
      
        calendar = currentStudiesInformationsDoc.getAbroadInternshipStartDate();
        if (calendar != null) {
            currentStudiesInformations.setAbroadInternshipStartDate(calendar.getTime());
        }
      
        currentStudiesInformations.setSandwichCourses(Boolean.valueOf(currentStudiesInformationsDoc.getSandwichCourses()));
      
        return currentStudiesInformations;
    }

    @Override
    public CurrentStudiesInformations clone() {
        CurrentStudiesInformations result = new CurrentStudiesInformations();
        
          
            
        result.setAbroadInternshipSchoolName(abroadInternshipSchoolName);
      
          
        
          
            
        if (abroadInternshipSchoolCountry != null)
            result.setAbroadInternshipSchoolCountry(abroadInternshipSchoolCountry);
        else
            result.setAbroadInternshipSchoolCountry(fr.cg95.cvq.business.users.CountryType.getDefaultCountryType());
      
          
        
          
            
        result.setAbroadInternshipEndDate(abroadInternshipEndDate);
      
          
        
          
            
        result.setOtherStudiesLabel(otherStudiesLabel);
      
          
        
          
            
        if (currentStudiesDiploma != null)
            result.setCurrentStudiesDiploma(currentStudiesDiploma);
        else
            result.setCurrentStudiesDiploma(fr.cg95.cvq.business.request.school.CurrentStudiesType.getDefaultCurrentStudiesType());
      
          
        
          
            
        result.setAbroadInternship(abroadInternship);
      
          
        
          
            
        if (currentStudiesLevel != null)
            result.setCurrentStudiesLevel(currentStudiesLevel);
        else
            result.setCurrentStudiesLevel(fr.cg95.cvq.business.request.school.CurrentStudiesLevelType.getDefaultCurrentStudiesLevelType());
      
          
        
          
            
        result.setAbroadInternshipStartDate(abroadInternshipStartDate);
      
          
        
          
            
        result.setSandwichCourses(sandwichCourses);
      
          
        
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
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['currentStudiesInformations.abroadInternship'].test(_this.abroadInternship.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "abroadInternshipSchoolName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['currentStudiesInformations.abroadInternship'].test(_this.abroadInternship.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "abroadInternshipSchoolName"
      )
    
    private String abroadInternshipSchoolName;

    public void setAbroadInternshipSchoolName(final String abroadInternshipSchoolName) {
        this.abroadInternshipSchoolName = abroadInternshipSchoolName;
    }

    
    @Column(name="abroad_internship_school_name"  )
      
    public String getAbroadInternshipSchoolName() {
        return this.abroadInternshipSchoolName;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['currentStudiesInformations.abroadInternship'].test(_this.abroadInternship.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "abroadInternshipSchoolCountry"
      )
    
    private fr.cg95.cvq.business.users.CountryType abroadInternshipSchoolCountry;

    public void setAbroadInternshipSchoolCountry(final fr.cg95.cvq.business.users.CountryType abroadInternshipSchoolCountry) {
        this.abroadInternshipSchoolCountry = abroadInternshipSchoolCountry;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="abroad_internship_school_country"  )
      
    public fr.cg95.cvq.business.users.CountryType getAbroadInternshipSchoolCountry() {
        return this.abroadInternshipSchoolCountry;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['currentStudiesInformations.abroadInternship'].test(_this.abroadInternship.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "abroadInternshipEndDate"
      )
    
    private java.util.Date abroadInternshipEndDate;

    public void setAbroadInternshipEndDate(final java.util.Date abroadInternshipEndDate) {
        this.abroadInternshipEndDate = abroadInternshipEndDate;
    }

    
    @Column(name="abroad_internship_end_date"  )
      
    public java.util.Date getAbroadInternshipEndDate() {
        return this.abroadInternshipEndDate;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['currentStudiesInformations.currentStudiesDiploma'].test(_this.currentStudiesDiploma.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "otherStudiesLabel"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['currentStudiesInformations.currentStudiesDiploma'].test(_this.currentStudiesDiploma.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "otherStudiesLabel"
      )
    
    private String otherStudiesLabel;

    public void setOtherStudiesLabel(final String otherStudiesLabel) {
        this.otherStudiesLabel = otherStudiesLabel;
    }

    
    @Column(name="other_studies_label"  )
      
    public String getOtherStudiesLabel() {
        return this.otherStudiesLabel;
    }
  
    
      @NotNull(
        
        
        profiles = {"currentStudies"},
        message = "currentStudiesDiploma"
      )
    
    private fr.cg95.cvq.business.request.school.CurrentStudiesType currentStudiesDiploma;

    public void setCurrentStudiesDiploma(final fr.cg95.cvq.business.request.school.CurrentStudiesType currentStudiesDiploma) {
        this.currentStudiesDiploma = currentStudiesDiploma;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="current_studies_diploma"  )
      
    public fr.cg95.cvq.business.request.school.CurrentStudiesType getCurrentStudiesDiploma() {
        return this.currentStudiesDiploma;
    }
  
    
      @NotNull(
        
        
        profiles = {"currentStudies"},
        message = "abroadInternship"
      )
    
    private Boolean abroadInternship;

    public void setAbroadInternship(final Boolean abroadInternship) {
        this.abroadInternship = abroadInternship;
    }

    
    @Column(name="abroad_internship"  )
      
    public Boolean getAbroadInternship() {
        return this.abroadInternship;
    }
  
    
      @NotNull(
        
        
        profiles = {"currentStudies"},
        message = "currentStudiesLevel"
      )
    
    private fr.cg95.cvq.business.request.school.CurrentStudiesLevelType currentStudiesLevel;

    public void setCurrentStudiesLevel(final fr.cg95.cvq.business.request.school.CurrentStudiesLevelType currentStudiesLevel) {
        this.currentStudiesLevel = currentStudiesLevel;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="current_studies_level"  )
      
    public fr.cg95.cvq.business.request.school.CurrentStudiesLevelType getCurrentStudiesLevel() {
        return this.currentStudiesLevel;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['currentStudiesInformations.abroadInternship'].test(_this.abroadInternship.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "abroadInternshipStartDate"
      )
    
    private java.util.Date abroadInternshipStartDate;

    public void setAbroadInternshipStartDate(final java.util.Date abroadInternshipStartDate) {
        this.abroadInternshipStartDate = abroadInternshipStartDate;
    }

    
    @Column(name="abroad_internship_start_date"  )
      
    public java.util.Date getAbroadInternshipStartDate() {
        return this.abroadInternshipStartDate;
    }
  
    
      @NotNull(
        
        
        profiles = {"currentStudies"},
        message = "sandwichCourses"
      )
    
    private Boolean sandwichCourses;

    public void setSandwichCourses(final Boolean sandwichCourses) {
        this.sandwichCourses = sandwichCourses;
    }

    
    @Column(name="sandwich_courses"  )
      
    public Boolean getSandwichCourses() {
        return this.sandwichCourses;
    }
  
}
