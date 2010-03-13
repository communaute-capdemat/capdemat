
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

/**
 * Generated class file, do not edit !
 *
 * @hibernate.class
 *  table="dhr_spouse"
 *  lazy="false"
 */
public class DhrSpouse implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

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
            dhrSpouse.setDhrSpouseNationality(fr.cg95.cvq.xml.common.NationalityType.Enum.forString(this.dhrSpouseNationality.toString()));
      
        dhrSpouse.setDhrSpouseMaidenName(this.dhrSpouseMaidenName);
      
        date = this.dhrSpouseFranceArrivalDate;
        if (date != null) {
            calendar.setTime(date);
            dhrSpouse.setDhrSpouseFranceArrivalDate(calendar);
        }
      
        dhrSpouse.setDhrSpouseFirstName(this.dhrSpouseFirstName);
      
        if (this.dhrSpouseFamilyStatus != null)
            dhrSpouse.setDhrSpouseFamilyStatus(fr.cg95.cvq.xml.common.FamilyStatusType.Enum.forString(this.dhrSpouseFamilyStatus.toString()));
      
        dhrSpouse.setDhrSpouseName(this.dhrSpouseName);
      
        dhrSpouse.setDhrSpouseBirthPlace(this.dhrSpouseBirthPlace);
      
        date = this.dhrSpouseBirthDate;
        if (date != null) {
            calendar.setTime(date);
            dhrSpouse.setDhrSpouseBirthDate(calendar);
        }
      
        if (this.dhrRequestKind != null)
            dhrSpouse.setDhrRequestKind(fr.cg95.cvq.xml.request.social.DhrRequestKindType.Enum.forString(this.dhrRequestKind.toString()));
      
        if (this.dhrSpouseTitle != null)
            dhrSpouse.setDhrSpouseTitle(fr.cg95.cvq.xml.common.TitleType.Enum.forString(this.dhrSpouseTitle.toString()));
      
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

    /**
     * @hibernate.id
     *  column="id"
     *  generator-class="sequence"
     */
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

    public final void setDhrSpouseNationality(final fr.cg95.cvq.business.users.NationalityType dhrSpouseNationality) {
        this.dhrSpouseNationality = dhrSpouseNationality;
    }

    /**
  
        * @hibernate.property
        *  column="dhr_spouse_nationality"
        *  length="32"
      
    */
    public final fr.cg95.cvq.business.users.NationalityType getDhrSpouseNationality() {
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

    public final void setDhrSpouseMaidenName(final String dhrSpouseMaidenName) {
        this.dhrSpouseMaidenName = dhrSpouseMaidenName;
    }

    /**
  
        * @hibernate.property
        *  column="dhr_spouse_maiden_name"
        *  length="38"
      
    */
    public final String getDhrSpouseMaidenName() {
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

    public final void setDhrSpouseFranceArrivalDate(final java.util.Date dhrSpouseFranceArrivalDate) {
        this.dhrSpouseFranceArrivalDate = dhrSpouseFranceArrivalDate;
    }

    /**
  
        * @hibernate.property
        *  column="dhr_spouse_france_arrival_date"
        
      
    */
    public final java.util.Date getDhrSpouseFranceArrivalDate() {
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

    public final void setDhrSpouseFirstName(final String dhrSpouseFirstName) {
        this.dhrSpouseFirstName = dhrSpouseFirstName;
    }

    /**
  
        * @hibernate.property
        *  column="dhr_spouse_first_name"
        *  length="38"
      
    */
    public final String getDhrSpouseFirstName() {
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

    public final void setDhrSpouseFamilyStatus(final fr.cg95.cvq.business.users.FamilyStatusType dhrSpouseFamilyStatus) {
        this.dhrSpouseFamilyStatus = dhrSpouseFamilyStatus;
    }

    /**
  
        * @hibernate.property
        *  column="dhr_spouse_family_status"
        
      
    */
    public final fr.cg95.cvq.business.users.FamilyStatusType getDhrSpouseFamilyStatus() {
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

    public final void setDhrSpouseName(final String dhrSpouseName) {
        this.dhrSpouseName = dhrSpouseName;
    }

    /**
  
        * @hibernate.property
        *  column="dhr_spouse_name"
        *  length="38"
      
    */
    public final String getDhrSpouseName() {
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

    public final void setDhrSpouseBirthPlace(final String dhrSpouseBirthPlace) {
        this.dhrSpouseBirthPlace = dhrSpouseBirthPlace;
    }

    /**
  
        * @hibernate.property
        *  column="dhr_spouse_birth_place"
        
      
    */
    public final String getDhrSpouseBirthPlace() {
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

    public final void setDhrSpouseBirthDate(final java.util.Date dhrSpouseBirthDate) {
        this.dhrSpouseBirthDate = dhrSpouseBirthDate;
    }

    /**
  
        * @hibernate.property
        *  column="dhr_spouse_birth_date"
        
      
    */
    public final java.util.Date getDhrSpouseBirthDate() {
        return this.dhrSpouseBirthDate;
    }
  
    
      @NotNull(
        
        
        profiles = {"spouse"},
        message = "dhrRequestKind"
      )
    
    private fr.cg95.cvq.business.request.social.DhrRequestKindType dhrRequestKind;

    public final void setDhrRequestKind(final fr.cg95.cvq.business.request.social.DhrRequestKindType dhrRequestKind) {
        this.dhrRequestKind = dhrRequestKind;
    }

    /**
  
        * @hibernate.property
        *  column="dhr_request_kind"
        
      
    */
    public final fr.cg95.cvq.business.request.social.DhrRequestKindType getDhrRequestKind() {
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

    public final void setDhrSpouseTitle(final fr.cg95.cvq.business.users.TitleType dhrSpouseTitle) {
        this.dhrSpouseTitle = dhrSpouseTitle;
    }

    /**
  
        * @hibernate.property
        *  column="dhr_spouse_title"
        
      
    */
    public final fr.cg95.cvq.business.users.TitleType getDhrSpouseTitle() {
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

    public final void setDhrSpouseIsFrenchResident(final Boolean dhrSpouseIsFrenchResident) {
        this.dhrSpouseIsFrenchResident = dhrSpouseIsFrenchResident;
    }

    /**
  
        * @hibernate.property
        *  column="dhr_spouse_is_french_resident"
        
      
    */
    public final Boolean getDhrSpouseIsFrenchResident() {
        return this.dhrSpouseIsFrenchResident;
    }
  
}
