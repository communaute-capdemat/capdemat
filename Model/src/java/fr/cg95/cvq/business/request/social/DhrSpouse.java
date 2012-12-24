
package fr.cg95.cvq.business.request.social;

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
import fr.cg95.cvq.xml.request.social.*;
import fr.cg95.cvq.service.request.LocalReferential;
import fr.cg95.cvq.service.request.condition.IConditionChecker;
import javax.persistence.*;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Type;

/**
 * Generated class file, do not edit !
 */
@Entity
@Table(name="dhr_spouse")
public class DhrSpouse implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        DomesticHelpRequest.conditions;

    public DhrSpouse() {
        super();
      
        dhrRequestKind = fr.cg95.cvq.business.request.social.DhrRequestKindType.INDIVIDUAL;
      
        dhrSpouseIsFrenchResident = Boolean.valueOf(false);
      
    }

    public final String modelToXmlString() {
        DhrSpouseType object = (DhrSpouseType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final DhrSpouseType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        DhrSpouseType dhrSpouse = DhrSpouseType.Factory.newInstance();
        int i = 0;
    
        if (this.dhrSpouseNationality != null)
            dhrSpouse.setDhrSpouseNationality(fr.cg95.cvq.xml.common.NationalityType.Enum.forString(this.dhrSpouseNationality.getLegacyLabel()));
      
        dhrSpouse.setDhrSpouseMaidenName(this.dhrSpouseMaidenName);
      
        date = this.dhrSpouseFranceArrivalDate;
        if (date != null) {
            calendar.setTime(date);
            dhrSpouse.setDhrSpouseFranceArrivalDate(calendar);
        }
      
        dhrSpouse.setDhrSpouseFirstName(this.dhrSpouseFirstName);
      
        if (this.dhrSpouseFamilyStatus != null)
            dhrSpouse.setDhrSpouseFamilyStatus(fr.cg95.cvq.xml.common.FamilyStatusType.Enum.forString(this.dhrSpouseFamilyStatus.getLegacyLabel()));
      
        dhrSpouse.setDhrSpouseName(this.dhrSpouseName);
      
        dhrSpouse.setDhrSpouseBirthPlace(this.dhrSpouseBirthPlace);
      
        date = this.dhrSpouseBirthDate;
        if (date != null) {
            calendar.setTime(date);
            dhrSpouse.setDhrSpouseBirthDate(calendar);
        }
      
        if (this.dhrRequestKind != null)
            dhrSpouse.setDhrRequestKind(fr.cg95.cvq.xml.request.social.DhrRequestKindType.Enum.forString(this.dhrRequestKind.getLegacyLabel()));
      
        if (this.dhrSpouseTitle != null)
            dhrSpouse.setDhrSpouseTitle(fr.cg95.cvq.xml.common.TitleType.Enum.forString(this.dhrSpouseTitle.getLegacyLabel()));
      
        if (this.dhrSpouseIsFrenchResident != null)
            dhrSpouse.setDhrSpouseIsFrenchResident(this.dhrSpouseIsFrenchResident.booleanValue());
      
        return dhrSpouse;
    }

    public static DhrSpouse xmlToModel(DhrSpouseType dhrSpouseDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        DhrSpouse dhrSpouse = new DhrSpouse();
    
        if (dhrSpouseDoc.getDhrSpouseNationality() != null)
            dhrSpouse.setDhrSpouseNationality(fr.cg95.cvq.business.users.NationalityType.forString(dhrSpouseDoc.getDhrSpouseNationality().toString()));
        else
            dhrSpouse.setDhrSpouseNationality(fr.cg95.cvq.business.users.NationalityType.getDefaultNationalityType());
      
        dhrSpouse.setDhrSpouseMaidenName(dhrSpouseDoc.getDhrSpouseMaidenName());
      
        calendar = dhrSpouseDoc.getDhrSpouseFranceArrivalDate();
        if (calendar != null) {
            dhrSpouse.setDhrSpouseFranceArrivalDate(calendar.getTime());
        }
      
        dhrSpouse.setDhrSpouseFirstName(dhrSpouseDoc.getDhrSpouseFirstName());
      
        if (dhrSpouseDoc.getDhrSpouseFamilyStatus() != null)
            dhrSpouse.setDhrSpouseFamilyStatus(fr.cg95.cvq.business.users.FamilyStatusType.forString(dhrSpouseDoc.getDhrSpouseFamilyStatus().toString()));
        else
            dhrSpouse.setDhrSpouseFamilyStatus(fr.cg95.cvq.business.users.FamilyStatusType.getDefaultFamilyStatusType());
      
        dhrSpouse.setDhrSpouseName(dhrSpouseDoc.getDhrSpouseName());
      
        dhrSpouse.setDhrSpouseBirthPlace(dhrSpouseDoc.getDhrSpouseBirthPlace());
      
        calendar = dhrSpouseDoc.getDhrSpouseBirthDate();
        if (calendar != null) {
            dhrSpouse.setDhrSpouseBirthDate(calendar.getTime());
        }
      
        if (dhrSpouseDoc.getDhrRequestKind() != null)
            dhrSpouse.setDhrRequestKind(fr.cg95.cvq.business.request.social.DhrRequestKindType.forString(dhrSpouseDoc.getDhrRequestKind().toString()));
        else
            dhrSpouse.setDhrRequestKind(fr.cg95.cvq.business.request.social.DhrRequestKindType.getDefaultDhrRequestKindType());
      
        if (dhrSpouseDoc.getDhrSpouseTitle() != null)
            dhrSpouse.setDhrSpouseTitle(fr.cg95.cvq.business.users.TitleType.forString(dhrSpouseDoc.getDhrSpouseTitle().toString()));
        else
            dhrSpouse.setDhrSpouseTitle(fr.cg95.cvq.business.users.TitleType.getDefaultTitleType());
      
        dhrSpouse.setDhrSpouseIsFrenchResident(Boolean.valueOf(dhrSpouseDoc.getDhrSpouseIsFrenchResident()));
      
        return dhrSpouse;
    }

    @Override
    public DhrSpouse clone() {
        DhrSpouse result = new DhrSpouse();
        
          
            
        if (dhrSpouseNationality != null)
            result.setDhrSpouseNationality(dhrSpouseNationality);
        else
            result.setDhrSpouseNationality(fr.cg95.cvq.business.users.NationalityType.getDefaultNationalityType());
      
          
        
          
            
        result.setDhrSpouseMaidenName(dhrSpouseMaidenName);
      
          
        
          
            
        result.setDhrSpouseFranceArrivalDate(dhrSpouseFranceArrivalDate);
      
          
        
          
            
        result.setDhrSpouseFirstName(dhrSpouseFirstName);
      
          
        
          
            
        if (dhrSpouseFamilyStatus != null)
            result.setDhrSpouseFamilyStatus(dhrSpouseFamilyStatus);
        else
            result.setDhrSpouseFamilyStatus(fr.cg95.cvq.business.users.FamilyStatusType.getDefaultFamilyStatusType());
      
          
        
          
            
        result.setDhrSpouseName(dhrSpouseName);
      
          
        
          
            
        result.setDhrSpouseBirthPlace(dhrSpouseBirthPlace);
      
          
        
          
            
        result.setDhrSpouseBirthDate(dhrSpouseBirthDate);
      
          
        
          
            
        if (dhrRequestKind != null)
            result.setDhrRequestKind(dhrRequestKind);
        else
            result.setDhrRequestKind(fr.cg95.cvq.business.request.social.DhrRequestKindType.getDefaultDhrRequestKindType());
      
          
        
          
            
        if (dhrSpouseTitle != null)
            result.setDhrSpouseTitle(dhrSpouseTitle);
        else
            result.setDhrSpouseTitle(fr.cg95.cvq.business.users.TitleType.getDefaultTitleType());
      
          
        
          
            
        result.setDhrSpouseIsFrenchResident(dhrSpouseIsFrenchResident);
      
          
        
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
          
             "active &= _this.conditions['dhrSpouse.dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseNationality"
      )
    
    private fr.cg95.cvq.business.users.NationalityType dhrSpouseNationality;

    public void setDhrSpouseNationality(final fr.cg95.cvq.business.users.NationalityType dhrSpouseNationality) {
        this.dhrSpouseNationality = dhrSpouseNationality;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="dhr_spouse_nationality" , length=32 )
      
    public fr.cg95.cvq.business.users.NationalityType getDhrSpouseNationality() {
        return this.dhrSpouseNationality;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrSpouse.dhrSpouseTitle'].test(_this.dhrSpouseTitle.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseMaidenName"
      )
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrSpouse.dhrSpouseTitle'].test(_this.dhrSpouseTitle.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseMaidenName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrSpouse.dhrSpouseTitle'].test(_this.dhrSpouseTitle.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseMaidenName"
      )
    
    private String dhrSpouseMaidenName;

    public void setDhrSpouseMaidenName(final String dhrSpouseMaidenName) {
        this.dhrSpouseMaidenName = dhrSpouseMaidenName;
    }

    
    @Column(name="dhr_spouse_maiden_name" , length=38 )
      
    public String getDhrSpouseMaidenName() {
        return this.dhrSpouseMaidenName;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrSpouse.dhrSpouseNationality'].test(_this.dhrSpouseNationality.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseFranceArrivalDate"
      )
    
    private java.util.Date dhrSpouseFranceArrivalDate;

    public void setDhrSpouseFranceArrivalDate(final java.util.Date dhrSpouseFranceArrivalDate) {
        this.dhrSpouseFranceArrivalDate = dhrSpouseFranceArrivalDate;
    }

    
    @Column(name="dhr_spouse_france_arrival_date"  )
      
    public java.util.Date getDhrSpouseFranceArrivalDate() {
        return this.dhrSpouseFranceArrivalDate;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrSpouse.dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseFirstName"
      )
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrSpouse.dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseFirstName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrSpouse.dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseFirstName"
      )
    
    private String dhrSpouseFirstName;

    public void setDhrSpouseFirstName(final String dhrSpouseFirstName) {
        this.dhrSpouseFirstName = dhrSpouseFirstName;
    }

    
    @Column(name="dhr_spouse_first_name" , length=38 )
      
    public String getDhrSpouseFirstName() {
        return this.dhrSpouseFirstName;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrSpouse.dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseFamilyStatus"
      )
    
    private fr.cg95.cvq.business.users.FamilyStatusType dhrSpouseFamilyStatus;

    public void setDhrSpouseFamilyStatus(final fr.cg95.cvq.business.users.FamilyStatusType dhrSpouseFamilyStatus) {
        this.dhrSpouseFamilyStatus = dhrSpouseFamilyStatus;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="dhr_spouse_family_status"  )
      
    public fr.cg95.cvq.business.users.FamilyStatusType getDhrSpouseFamilyStatus() {
        return this.dhrSpouseFamilyStatus;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrSpouse.dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseName"
      )
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrSpouse.dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrSpouse.dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseName"
      )
    
    private String dhrSpouseName;

    public void setDhrSpouseName(final String dhrSpouseName) {
        this.dhrSpouseName = dhrSpouseName;
    }

    
    @Column(name="dhr_spouse_name" , length=38 )
      
    public String getDhrSpouseName() {
        return this.dhrSpouseName;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrSpouse.dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseBirthPlace"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrSpouse.dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseBirthPlace"
      )
    
    private String dhrSpouseBirthPlace;

    public void setDhrSpouseBirthPlace(final String dhrSpouseBirthPlace) {
        this.dhrSpouseBirthPlace = dhrSpouseBirthPlace;
    }

    
    @Column(name="dhr_spouse_birth_place"  )
      
    public String getDhrSpouseBirthPlace() {
        return this.dhrSpouseBirthPlace;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrSpouse.dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseBirthDate"
      )
    
    private java.util.Date dhrSpouseBirthDate;

    public void setDhrSpouseBirthDate(final java.util.Date dhrSpouseBirthDate) {
        this.dhrSpouseBirthDate = dhrSpouseBirthDate;
    }

    
    @Column(name="dhr_spouse_birth_date"  )
      
    public java.util.Date getDhrSpouseBirthDate() {
        return this.dhrSpouseBirthDate;
    }
  
    
      @NotNull(
        
        
        profiles = {"spouse"},
        message = "dhrRequestKind"
      )
    
    private fr.cg95.cvq.business.request.social.DhrRequestKindType dhrRequestKind;

    public void setDhrRequestKind(final fr.cg95.cvq.business.request.social.DhrRequestKindType dhrRequestKind) {
        this.dhrRequestKind = dhrRequestKind;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="dhr_request_kind"  )
      
    public fr.cg95.cvq.business.request.social.DhrRequestKindType getDhrRequestKind() {
        return this.dhrRequestKind;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrSpouse.dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseTitle"
      )
    
    private fr.cg95.cvq.business.users.TitleType dhrSpouseTitle;

    public void setDhrSpouseTitle(final fr.cg95.cvq.business.users.TitleType dhrSpouseTitle) {
        this.dhrSpouseTitle = dhrSpouseTitle;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="dhr_spouse_title"  )
      
    public fr.cg95.cvq.business.users.TitleType getDhrSpouseTitle() {
        return this.dhrSpouseTitle;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dhrSpouse.dhrSpouseNationality'].test(_this.dhrSpouseNationality.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseIsFrenchResident"
      )
    
    private Boolean dhrSpouseIsFrenchResident;

    public void setDhrSpouseIsFrenchResident(final Boolean dhrSpouseIsFrenchResident) {
        this.dhrSpouseIsFrenchResident = dhrSpouseIsFrenchResident;
    }

    
    @Column(name="dhr_spouse_is_french_resident"  )
      
    public Boolean getDhrSpouseIsFrenchResident() {
        return this.dhrSpouseIsFrenchResident;
    }
  
}
