

package fr.cg95.cvq.business.request.school;

import java.io.Serializable;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.oval.constraint.*;
import fr.cg95.cvq.business.authority.*;
import fr.cg95.cvq.business.request.*;
import fr.cg95.cvq.business.users.*;
import fr.cg95.cvq.service.request.LocalReferential;
import fr.cg95.cvq.service.request.condition.IConditionChecker;

import javax.persistence.*;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Type;

/**
 * Generated class file, do not edit !
 */
@Entity
@Table(name="study_grant_request")
public class StudyGrantRequestData implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>(RequestData.conditions);

    private Long id;

    public StudyGrantRequestData() {
      
        abroadInternship = Boolean.valueOf(false);
      
        currentSchoolCountry = fr.cg95.cvq.business.users.CountryType.FR;
      
        abroadInternship = Boolean.valueOf(false);
      
        distance = fr.cg95.cvq.business.request.school.DistanceType.UNDETERMINED;
      
        isSubjectAccountHolder = Boolean.valueOf(true);
      
    }

    @Override
    public StudyGrantRequestData clone() {
        StudyGrantRequestData result = new StudyGrantRequestData();
        
          
            
        result.setAccountHolderBirthDate(accountHolderBirthDate);
      
          
        
          
            
        result.setAccountHolderEdemandeId(accountHolderEdemandeId);
      
          
        
          
            
        result.setAccountHolderFirstName(accountHolderFirstName);
      
          
        
          
            
        result.setAccountHolderLastName(accountHolderLastName);
      
          
        
          
            
        if (accountHolderTitle != null)
            result.setAccountHolderTitle(accountHolderTitle);
        else
            result.setAccountHolderTitle(fr.cg95.cvq.business.users.TitleType.getDefaultTitleType());
      
          
        
          
            
        if (alevelsInformations != null)
            result.setAlevelsInformations(alevelsInformations.clone());
      
          
        
          
            
        if (currentSchool != null)
            result.setCurrentSchool(currentSchool.clone());
      
          
        
          
            
        result.setCurrentSchoolCity(currentSchoolCity);
      
          
        
          
            
        if (currentSchoolCountry != null)
            result.setCurrentSchoolCountry(currentSchoolCountry);
        else
            result.setCurrentSchoolCountry(fr.cg95.cvq.business.users.CountryType.getDefaultCountryType());
      
          
        
          
            
        List<fr.cg95.cvq.business.request.LocalReferentialData> currentSchoolNameList = new ArrayList<fr.cg95.cvq.business.request.LocalReferentialData>();
        for (LocalReferentialData object : currentSchoolName) {
            currentSchoolNameList.add(object.clone());
        }
        result.setCurrentSchoolName(currentSchoolNameList);
      
          
        
          
            
        result.setCurrentSchoolNamePrecision(currentSchoolNamePrecision);
        if (bankAccount != null)
            result.setBankAccount(bankAccount.clone());
      
          
        
          
            
        if (currentSchoolAddress != null)
            result.setCurrentSchoolAddress(currentSchoolAddress.clone());
      
          
        
          
            
        List<fr.cg95.cvq.business.request.LocalReferentialData> currentSchoolNameList = new ArrayList<fr.cg95.cvq.business.request.LocalReferentialData>();
        for (LocalReferentialData object : currentSchoolName) {
            currentSchoolNameList.add(object.clone());
        }
        result.setCurrentSchoolName(currentSchoolNameList);
      
          
        
          
            
        result.setCurrentSchoolNamePrecision(currentSchoolNamePrecision);
        if (currentStudiesInformations != null)
            result.setCurrentStudiesInformations(currentStudiesInformations.clone());
      
          
        
          
            
        if (distance != null)
            result.setDistance(distance);
        else
            result.setDistance(fr.cg95.cvq.business.request.school.DistanceType.getDefaultDistanceType());
      
          
        
          
            
        result.setEdemandeId(edemandeId);
      
          
        
          
            
        result.setHasCROUSHelp(hasCROUSHelp);
      
          
        
          
            
        result.setHasEuropeHelp(hasEuropeHelp);
      
          
        
          
            
        result.setHasOtherHelp(hasOtherHelp);
      
          
        
          
            
        result.setHasRegionalCouncilHelp(hasRegionalCouncilHelp);
      
          
        
          
            
        result.setIsSubjectAccountHolder(isSubjectAccountHolder);
      
          
        
          
            
        if (subjectInformations != null)
            result.setSubjectInformations(subjectInformations.clone());
      
          
        
          
            
        List<fr.cg95.cvq.business.request.LocalReferentialData> taxHouseholdCityList = new ArrayList<fr.cg95.cvq.business.request.LocalReferentialData>();
        for (LocalReferentialData object : taxHouseholdCity) {
            taxHouseholdCityList.add(object.clone());
        }
        result.setTaxHouseholdCity(taxHouseholdCityList);
      
          
        
          
            
        result.setTaxHouseholdCityPrecision(taxHouseholdCityPrecision);
      
          
        
          
            
        result.setTaxHouseholdFirstName(taxHouseholdFirstName);
      
          
        
          
            
        result.setTaxHouseholdIncome(taxHouseholdIncome);
      
          
        
          
            
        result.setTaxHouseholdLastName(taxHouseholdLastName);
      
          
        
        return result;
    }

    public final void setId(final Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    public final Long getId() {
        return this.id;
    }

  
    
      @NotNull(
        
        
        profiles = {"currentStudies"},
        message = "abroadInternship"
      )
    
    private Boolean abroadInternship;

    public final void setAbroadInternship(final Boolean abroadInternship) {
        this.abroadInternship = abroadInternship;
    }

    /**
 
        * @hibernate.property
        *  column="abroad_internship"
        
      
    */
    public final Boolean getAbroadInternship() {
        return this.abroadInternship;
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
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['abroadInternship'].test(_this.abroadInternship.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "abroadInternshipEndDate"
      )
    
    private java.util.Date abroadInternshipEndDate;

    public final void setAbroadInternshipEndDate(final java.util.Date abroadInternshipEndDate) {
        this.abroadInternshipEndDate = abroadInternshipEndDate;
    }

    /**
 
        * @hibernate.property
        *  column="abroad_internship_end_date"
        
      
    */
    public final java.util.Date getAbroadInternshipEndDate() {
        return this.abroadInternshipEndDate;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['abroadInternship'].test(_this.abroadInternship.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "abroadInternshipSchoolCountry"
      )
    
    private fr.cg95.cvq.business.users.CountryType abroadInternshipSchoolCountry;

    public final void setAbroadInternshipSchoolCountry(final fr.cg95.cvq.business.users.CountryType abroadInternshipSchoolCountry) {
        this.abroadInternshipSchoolCountry = abroadInternshipSchoolCountry;
    }

    /**
 
        * @hibernate.property
        *  column="abroad_internship_school_country"
        
      
    */
    public final fr.cg95.cvq.business.users.CountryType getAbroadInternshipSchoolCountry() {
        return this.abroadInternshipSchoolCountry;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['abroadInternship'].test(_this.abroadInternship.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "abroadInternshipSchoolName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['abroadInternship'].test(_this.abroadInternship.toString());" +
            "active &= _this.conditions['abroadInternship'].test(_this.abroadInternship.toString());" +
                
              
            
            
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
          
            "active &= _this.conditions['abroadInternship'].test(_this.abroadInternship.toString());" +
                
              
            
            
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
          
            "active &= _this.conditions['abroadInternship'].test(_this.abroadInternship.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "abroadInternshipSchoolName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['abroadInternship'].test(_this.abroadInternship.toString());" +
            "active &= !_this.conditions['isSubjectAccountHolder'].test(_this.isSubjectAccountHolder.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "abroadInternshipSchoolName"
      )
    
    private String abroadInternshipSchoolName;

    public final void setAbroadInternshipSchoolName(final String abroadInternshipSchoolName) {
        this.abroadInternshipSchoolName = abroadInternshipSchoolName;
    }

    /**
 
        * @hibernate.property
        *  column="abroad_internship_school_name"
        
      
    */
    public final String getAbroadInternshipSchoolName() {
        return this.abroadInternshipSchoolName;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['abroadInternship'].test(_this.abroadInternship.toString());" +
                
            
            
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
          
            "active &= _this.conditions['abroadInternship'].test(_this.abroadInternship.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "abroadInternshipStartDate"
      )
    
    private java.util.Date abroadInternshipStartDate;

    public final void setAbroadInternshipStartDate(final java.util.Date abroadInternshipStartDate) {
        this.abroadInternshipStartDate = abroadInternshipStartDate;
    }

    /**
 
        * @hibernate.property
        *  column="abroad_internship_start_date"
        
      
    */
    public final java.util.Date getAbroadInternshipStartDate() {
        return this.abroadInternshipStartDate;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= !_this.conditions['isSubjectAccountHolder'].test(_this.isSubjectAccountHolder.toString());" +
                
              
            
            
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
        
        
          when = "groovy:def active = true;" +
          
            "active &= !_this.conditions['isSubjectAccountHolder'].test(_this.isSubjectAccountHolder.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"bankReference"},
        message = "accountHolderBirthDate"
      )
    
    private java.util.Date accountHolderBirthDate;

    public void setAccountHolderBirthDate(final java.util.Date accountHolderBirthDate) {
        this.accountHolderBirthDate = accountHolderBirthDate;
    }

 
    @Column(name="account_holder_birth_date"  )
      
    public java.util.Date getAccountHolderBirthDate() {
        return this.accountHolderBirthDate;
    }
  
    
      @NotNull(
        
        
        profiles = {"administration"},
        message = "accountHolderEdemandeId"
      )
    
      @NotBlank(
        
        
        profiles = {"administration"},
        message = "accountHolderEdemandeId"
      )
    
    private String accountHolderEdemandeId;

    public void setAccountHolderEdemandeId(final String accountHolderEdemandeId) {
        this.accountHolderEdemandeId = accountHolderEdemandeId;
    }

 
    @Column(name="account_holder_edemande_id"  )
      
    public String getAccountHolderEdemandeId() {
        return this.accountHolderEdemandeId;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
            "active &= !_this.conditions['isSubjectAccountHolder'].test(_this.isSubjectAccountHolder.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"bankReference"},
        message = "accountHolderFirstName"
      )
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= !_this.conditions['isSubjectAccountHolder'].test(_this.isSubjectAccountHolder.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"bankReference"},
        message = "accountHolderFirstName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= !_this.conditions['isSubjectAccountHolder'].test(_this.isSubjectAccountHolder.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"bankReference"},
        message = "accountHolderFirstName"
      )
    
    private String accountHolderFirstName;

    public void setAccountHolderFirstName(final String accountHolderFirstName) {
        this.accountHolderFirstName = accountHolderFirstName;
    }

 
    @Column(name="account_holder_first_name" , length=38 )
      
    public String getAccountHolderFirstName() {
        return this.accountHolderFirstName;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
            "active &= !_this.conditions['isSubjectAccountHolder'].test(_this.isSubjectAccountHolder.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"bankReference"},
        message = "accountHolderLastName"
      )
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= !_this.conditions['isSubjectAccountHolder'].test(_this.isSubjectAccountHolder.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"bankReference"},
        message = "accountHolderLastName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= !_this.conditions['isSubjectAccountHolder'].test(_this.isSubjectAccountHolder.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"bankReference"},
        message = "accountHolderLastName"
      )
    
    private String accountHolderLastName;

    public void setAccountHolderLastName(final String accountHolderLastName) {
        this.accountHolderLastName = accountHolderLastName;
    }

 
    @Column(name="account_holder_last_name" , length=38 )
      
    public String getAccountHolderLastName() {
        return this.accountHolderLastName;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= !_this.conditions['isSubjectAccountHolder'].test(_this.isSubjectAccountHolder.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"bankReference"},
        message = "accountHolderTitle"
      )
    
    private fr.cg95.cvq.business.users.TitleType accountHolderTitle;

    public void setAccountHolderTitle(final fr.cg95.cvq.business.users.TitleType accountHolderTitle) {
        this.accountHolderTitle = accountHolderTitle;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="account_holder_title"  )
      
    public fr.cg95.cvq.business.users.TitleType getAccountHolderTitle() {
        return this.accountHolderTitle;
    }
  
    
      @NotNull(
        
        
        profiles = {"currentStudies"},
        message = "alevelsInformations"
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
        
    private fr.cg95.cvq.business.request.school.ALevelsType alevels;

    public void setAlevels(final fr.cg95.cvq.business.request.school.ALevelsType alevels) {
        this.alevels = alevels;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="alevels"  )
      
    public fr.cg95.cvq.business.request.school.ALevelsType getAlevels() {
        return this.alevels;
    }
  
    
      @MaxLength(
        
          value = 4,
        
      @AssertValid(
        
        
        profiles = {"currentStudies"},
        message = "alevelsInformations"
      )
    
    private fr.cg95.cvq.business.request.school.ALevelsInformations alevelsInformations;

    public final void setAlevelsDate(final String alevelsDate) {
        this.alevelsDate = alevelsDate;
    public void setAlevelsDate(final String alevelsDate) {
        this.alevelsDate = alevelsDate;
    public final void setAlevelsInformations(final fr.cg95.cvq.business.request.school.ALevelsInformations alevelsInformations) {
        this.alevelsInformations = alevelsInformations;
    }

 
        * @hibernate.property
        *  column="alevels_date"
        *  length="4"
    @Column(name="alevels_date" , length=4 )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="alevels_informations_id"
        *  class="fr.cg95.cvq.business.request.school.ALevelsInformations"
      
    */
    public final String getAlevelsDate() {
        return this.alevelsDate;
    public String getAlevelsDate() {
        return this.alevelsDate;
    */
    public final fr.cg95.cvq.business.request.school.ALevelsInformations getAlevelsInformations() {
        return this.alevelsInformations;
    }
  
    
      @AssertValid(
        message = "currentSchoolCity"
      )
    
        message = "currentSchool"
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
      @NotNull(
        
        
        profiles = {"bankReference"},
        message = "bankAccount"
      )
    
      @AssertValid(
        
        
        profiles = {"bankReference"},
        message = "bankAccount"
      )
    
    private fr.cg95.cvq.business.users.BankAccount bankAccount;
    private fr.cg95.cvq.business.request.school.SgrCurrentSchool currentSchool;

    public final void setCurrentSchoolCity(final String currentSchoolCity) {
        this.currentSchoolCity = currentSchoolCity;
    public void setBankAccount(final fr.cg95.cvq.business.users.BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    public final void setCurrentSchool(final fr.cg95.cvq.business.request.school.SgrCurrentSchool currentSchool) {
        this.currentSchool = currentSchool;
    }

 
        * @hibernate.property
        *  column="current_school_city"
        *  length="32"
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="bank_account_id")
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="current_school_id"
        *  class="fr.cg95.cvq.business.request.school.SgrCurrentSchool"
      
    */
    public final String getCurrentSchoolCity() {
        return this.currentSchoolCity;
    public fr.cg95.cvq.business.users.BankAccount getBankAccount() {
        return this.bankAccount;
    */
    public final fr.cg95.cvq.business.request.school.SgrCurrentSchool getCurrentSchool() {
        return this.currentSchool;
    }
  
    
        
        
          when = "groovy:def active = true;" +
          
            "if (_this.currentSchoolName == null || _this.currentSchoolName.isEmpty()) return false; _this.currentSchoolName.each { active &= _this.conditions['currentSchoolName'].test(it.name) };" +
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "currentSchoolAddress"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "if (_this.currentSchoolName == null || _this.currentSchoolName.isEmpty()) return false; _this.currentSchoolName.each { active &= _this.conditions['currentSchoolName'].test(it.name) };" +
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "currentSchoolCountry"
        message = "currentSchoolAddress"
        message = "currentStudiesInformations"
      )
    
    private fr.cg95.cvq.business.users.CountryType currentSchoolCountry;
    private fr.cg95.cvq.business.users.Address currentSchoolAddress;
    private fr.cg95.cvq.business.request.school.CurrentStudiesInformations currentStudiesInformations;

    public final void setCurrentSchoolCountry(final fr.cg95.cvq.business.users.CountryType currentSchoolCountry) {
        this.currentSchoolCountry = currentSchoolCountry;
    public void setCurrentSchoolAddress(final fr.cg95.cvq.business.users.Address currentSchoolAddress) {
        this.currentSchoolAddress = currentSchoolAddress;
    public final void setCurrentStudiesInformations(final fr.cg95.cvq.business.request.school.CurrentStudiesInformations currentStudiesInformations) {
        this.currentStudiesInformations = currentStudiesInformations;
    }

 
        * @hibernate.property
        *  column="current_school_country"
        
      
    */
    public final fr.cg95.cvq.business.users.CountryType getCurrentSchoolCountry() {
        return this.currentSchoolCountry;
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

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="current_school_address_id")
      
    public fr.cg95.cvq.business.users.Address getCurrentSchoolAddress() {
        return this.currentSchoolAddress;
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

    public void setCurrentSchoolName(final List<fr.cg95.cvq.business.request.LocalReferentialData> currentSchoolName) {
        this.currentSchoolName = currentSchoolName;
    }

        * @hibernate.many-to-one
        * @hibernate.list
        *  inverse="false"
        *  lazy="false"
        *  cascade="all"
        *  table="study_grant_request_current_school_name"
        * @hibernate.key
        *  column="study_grant_request_id"
        * @hibernate.list-index
        *  column="current_school_name_index"
        * @hibernate.many-to-many
        *  column="current_school_name_id"
        *  class="fr.cg95.cvq.business.request.LocalReferentialData"
    @ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinTable(name="study_grant_request_current_school_name",
            joinColumns=
                @JoinColumn(name="study_grant_request_id"),
            inverseJoinColumns=
                @JoinColumn(name="current_school_name_id"))
    @OrderColumn(name="current_school_name_index")
        *  cascade="all"
        *  column="current_studies_informations_id"
        *  class="fr.cg95.cvq.business.request.school.CurrentStudiesInformations"
      
    */
    public final List<fr.cg95.cvq.business.request.LocalReferentialData> getCurrentSchoolName() {
        return this.currentSchoolName;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "if (_this.currentSchoolName == null || _this.currentSchoolName.isEmpty()) return false; _this.currentSchoolName.each { active &= _this.conditions['currentSchoolName'].test(it.name) };" +
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "currentSchoolNamePrecision"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "if (_this.currentSchoolName == null || _this.currentSchoolName.isEmpty()) return false; _this.currentSchoolName.each { active &= _this.conditions['currentSchoolName'].test(it.name) };" +
                
              
            
            
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
        
        
        profiles = {"currentStudies"},
        message = "currentStudiesDiploma"
      )
    
    private fr.cg95.cvq.business.request.school.CurrentStudiesType currentStudiesDiploma;

    public final void setCurrentStudiesDiploma(final fr.cg95.cvq.business.request.school.CurrentStudiesType currentStudiesDiploma) {
        this.currentStudiesDiploma = currentStudiesDiploma;
    }

    /**
 
        * @hibernate.property
        *  column="current_studies_diploma"
        
      
    */
    public final fr.cg95.cvq.business.request.school.CurrentStudiesType getCurrentStudiesDiploma() {
        return this.currentStudiesDiploma;
    }
  
    
      @NotNull(
        
        
        profiles = {"currentStudies"},
        message = "currentStudiesLevel"
      )
    
    private fr.cg95.cvq.business.request.school.CurrentStudiesLevelType currentStudiesLevel;

    public final void setCurrentStudiesLevel(final fr.cg95.cvq.business.request.school.CurrentStudiesLevelType currentStudiesLevel) {
        this.currentStudiesLevel = currentStudiesLevel;
    public List<fr.cg95.cvq.business.request.LocalReferentialData> getCurrentSchoolName() {
        return this.currentSchoolName;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "if (_this.currentSchoolName == null || _this.currentSchoolName.isEmpty()) return false; _this.currentSchoolName.each { active &= _this.conditions['currentSchoolName'].test(it.name) };" +
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "currentSchoolNamePrecision"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "if (_this.currentSchoolName == null || _this.currentSchoolName.isEmpty()) return false; _this.currentSchoolName.each { active &= _this.conditions['currentSchoolName'].test(it.name) };" +
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "currentSchoolNamePrecision"
      )
    
    private String currentSchoolNamePrecision;

    public void setCurrentSchoolNamePrecision(final String currentSchoolNamePrecision) {
        this.currentSchoolNamePrecision = currentSchoolNamePrecision;
    }

 
    @Column(name="current_school_name_precision"  )
      
    public String getCurrentSchoolNamePrecision() {
        return this.currentSchoolNamePrecision;
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
        message = "currentStudiesLevel"
      )
    
    private fr.cg95.cvq.business.request.school.CurrentStudiesLevelType currentStudiesLevel;

    public void setCurrentStudiesLevel(final fr.cg95.cvq.business.request.school.CurrentStudiesLevelType currentStudiesLevel) {
        this.currentStudiesLevel = currentStudiesLevel;
    */
    public final fr.cg95.cvq.business.request.school.CurrentStudiesInformations getCurrentStudiesInformations() {
        return this.currentStudiesInformations;
    }
        * @hibernate.property
        *  column="current_studies_level"
        
      
    */
    public final fr.cg95.cvq.business.request.school.CurrentStudiesLevelType getCurrentStudiesLevel() {
        return this.currentStudiesLevel;
    }
    @Enumerated(EnumType.STRING)
    @Column(name="current_studies_level"  )
      
    public fr.cg95.cvq.business.request.school.CurrentStudiesLevelType getCurrentStudiesLevel() {
        return this.currentStudiesLevel;
    }
  
    
      @NotNull(
        
        
        profiles = {"administration"},
        message = "distance"
      )
    
    private fr.cg95.cvq.business.request.school.DistanceType distance;

    public void setDistance(final fr.cg95.cvq.business.request.school.DistanceType distance) {
        this.distance = distance;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="distance"  )
      
    public fr.cg95.cvq.business.request.school.DistanceType getDistance() {
        return this.distance;
    }
  
    
      @NotNull(
        
        
        profiles = {"administration"},
        message = "edemandeId"
      )
    
      @NotBlank(
        
        
        profiles = {"administration"},
        message = "edemandeId"
      )
    
    private String edemandeId;

    public void setEdemandeId(final String edemandeId) {
        this.edemandeId = edemandeId;
    }

 
    @Column(name="edemande_id"  )
      
    public String getEdemandeId() {
        return this.edemandeId;
    }
  
    
      @NotNull(
        
        
        profiles = {"otherHelps"},
        message = "hasCROUSHelp"
      )
    
    private Boolean hasCROUSHelp;

    public void setHasCROUSHelp(final Boolean hasCROUSHelp) {
        this.hasCROUSHelp = hasCROUSHelp;
    }

 
    @Column(name="has_c_r_o_u_s_help"  )
      
    public Boolean getHasCROUSHelp() {
        return this.hasCROUSHelp;
    }
  
    
      @NotNull(
        
        
        profiles = {"otherHelps"},
        message = "hasEuropeHelp"
      )
    
    private Boolean hasEuropeHelp;

    public void setHasEuropeHelp(final Boolean hasEuropeHelp) {
        this.hasEuropeHelp = hasEuropeHelp;
    }

 
    @Column(name="has_europe_help"  )
      
    public Boolean getHasEuropeHelp() {
        return this.hasEuropeHelp;
    }
  
    
      @NotNull(
        
        
        profiles = {"otherHelps"},
        message = "hasOtherHelp"
      )
    
    private Boolean hasOtherHelp;

    public void setHasOtherHelp(final Boolean hasOtherHelp) {
        this.hasOtherHelp = hasOtherHelp;
    }

 
    @Column(name="has_other_help"  )
      
    public Boolean getHasOtherHelp() {
        return this.hasOtherHelp;
    }
  
    
      @NotNull(
        
        
        profiles = {"otherHelps"},
        message = "hasRegionalCouncilHelp"
      )
    
    private Boolean hasRegionalCouncilHelp;

    public void setHasRegionalCouncilHelp(final Boolean hasRegionalCouncilHelp) {
        this.hasRegionalCouncilHelp = hasRegionalCouncilHelp;
    }

 
    @Column(name="has_regional_council_help"  )
      
    public Boolean getHasRegionalCouncilHelp() {
        return this.hasRegionalCouncilHelp;
    }
  
    
      @NotNull(
        
        
        profiles = {"bankReference"},
        message = "isSubjectAccountHolder"
      )
    
    private Boolean isSubjectAccountHolder;

    public void setIsSubjectAccountHolder(final Boolean isSubjectAccountHolder) {
        this.isSubjectAccountHolder = isSubjectAccountHolder;
    }

 
    @Column(name="is_subject_account_holder"  )
      
    public Boolean getIsSubjectAccountHolder() {
        return this.isSubjectAccountHolder;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['currentStudiesDiploma'].test(_this.currentStudiesDiploma.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "otherStudiesLabel"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['currentStudiesDiploma'].test(_this.currentStudiesDiploma.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "otherStudiesLabel"
      )
    
    private String otherStudiesLabel;

    public final void setOtherStudiesLabel(final String otherStudiesLabel) {
        this.otherStudiesLabel = otherStudiesLabel;
    }

    /**
 
        * @hibernate.property
        *  column="other_studies_label"
        
      
    */
    public final String getOtherStudiesLabel() {
        return this.otherStudiesLabel;
    }
  
    
      @NotNull(
        
        
        profiles = {"currentStudies"},
        message = "sandwichCourses"
      )
    
    private Boolean sandwichCourses;

    public final void setSandwichCourses(final Boolean sandwichCourses) {
        this.sandwichCourses = sandwichCourses;
    }

    /**
 
        * @hibernate.property
        *  column="sandwich_courses"
        
      
    */
    public final Boolean getSandwichCourses() {
        return this.sandwichCourses;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['currentStudiesDiploma'].test(_this.currentStudiesDiploma.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "otherStudiesLabel"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['currentStudiesDiploma'].test(_this.currentStudiesDiploma.toString());" +
                
              
            
            
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
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "subjectInformations"
      )
    
    private java.util.Date subjectBirthDate;

    public final void setSubjectBirthDate(final java.util.Date subjectBirthDate) {
        this.subjectBirthDate = subjectBirthDate;
    }

    /**
 
        * @hibernate.property
        *  column="subject_birth_date"
        
      
    */
    public final java.util.Date getSubjectBirthDate() {
        return this.subjectBirthDate;
    }
  
    
      @NotNull(
    private java.util.Date subjectBirthDate;

    public void setSubjectBirthDate(final java.util.Date subjectBirthDate) {
        this.subjectBirthDate = subjectBirthDate;
    }

 
    @Column(name="subject_birth_date"  )
      
    public java.util.Date getSubjectBirthDate() {
        return this.subjectBirthDate;
    }
  
    
      @NotNull(
      @AssertValid(
        
        
        profiles = {"subject"},
        message = "subjectInformations"
      )
    
    private fr.cg95.cvq.business.request.school.SubjectInformations subjectInformations;

    public final void setSubjectFirstRequest(final Boolean subjectFirstRequest) {
        this.subjectFirstRequest = subjectFirstRequest;
    public void setSubjectFirstRequest(final Boolean subjectFirstRequest) {
        this.subjectFirstRequest = subjectFirstRequest;
    public final void setSubjectInformations(final fr.cg95.cvq.business.request.school.SubjectInformations subjectInformations) {
        this.subjectInformations = subjectInformations;
    }

 
        * @hibernate.property
        *  column="subject_first_request"
        
    @Column(name="subject_first_request"  )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="subject_informations_id"
        *  class="fr.cg95.cvq.business.request.school.SubjectInformations"
      
    */
    public final Boolean getSubjectFirstRequest() {
        return this.subjectFirstRequest;
    public Boolean getSubjectFirstRequest() {
        return this.subjectFirstRequest;
    */
    public final fr.cg95.cvq.business.request.school.SubjectInformations getSubjectInformations() {
        return this.subjectInformations;
    }
  
    
      @LocalReferential(
        
        
        profiles = {"taxHousehold"},
        message = "taxHouseholdCity"
      )
    
      @MinSize(
        
          value = 1,
        
        
        profiles = {"taxHousehold"},
        message = "taxHouseholdCity"
      )
    
    private List<fr.cg95.cvq.business.request.LocalReferentialData> taxHouseholdCity;

    public void setTaxHouseholdCity(final List<fr.cg95.cvq.business.request.LocalReferentialData> taxHouseholdCity) {
        this.taxHouseholdCity = taxHouseholdCity;
    }

 
    @ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinTable(name="study_grant_request_tax_household_city",
            joinColumns=
                @JoinColumn(name="study_grant_request_id"),
            inverseJoinColumns=
                @JoinColumn(name="tax_household_city_id"))
    @OrderColumn(name="tax_household_city_index")
      
    public List<fr.cg95.cvq.business.request.LocalReferentialData> getTaxHouseholdCity() {
        return this.taxHouseholdCity;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "if (_this.taxHouseholdCity == null || _this.taxHouseholdCity.isEmpty()) return false; _this.taxHouseholdCity.each { active &= _this.conditions['taxHouseholdCity'].test(it.name) };" +
                
              
              
            
            
            "return active",
        
        profiles = {"taxHousehold"},
        message = "taxHouseholdCityPrecision"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "if (_this.taxHouseholdCity == null || _this.taxHouseholdCity.isEmpty()) return false; _this.taxHouseholdCity.each { active &= _this.conditions['taxHouseholdCity'].test(it.name) };" +
                
              
              
            
            
            "return active",
        
        profiles = {"taxHousehold"},
        message = "taxHouseholdCityPrecision"
      )
    
    private String taxHouseholdCityPrecision;

    public void setTaxHouseholdCityPrecision(final String taxHouseholdCityPrecision) {
        this.taxHouseholdCityPrecision = taxHouseholdCityPrecision;
    }

 
    @Column(name="tax_household_city_precision"  )
      
    public String getTaxHouseholdCityPrecision() {
        return this.taxHouseholdCityPrecision;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"taxHousehold"},
        message = "taxHouseholdFirstName"
      )
    
      @NotNull(
        
        
        profiles = {"taxHousehold"},
        message = "taxHouseholdFirstName"
      )
    
      @NotBlank(
        
        
        profiles = {"taxHousehold"},
        message = "taxHouseholdFirstName"
      )
    
    private String taxHouseholdFirstName;

    public void setTaxHouseholdFirstName(final String taxHouseholdFirstName) {
        this.taxHouseholdFirstName = taxHouseholdFirstName;
    }

 
    @Column(name="tax_household_first_name" , length=38 )
      
    public String getTaxHouseholdFirstName() {
        return this.taxHouseholdFirstName;
    }
  
    
      @NotNull(
        
        
        profiles = {"taxHousehold"},
        message = "taxHouseholdIncome"
      )
    
      @MatchPattern(
        
          pattern = "^\\d+(?:\\,\\d{1,2})?$",
        
        
        profiles = {"taxHousehold"},
        message = "taxHouseholdIncome"
      )
    
    private Double taxHouseholdIncome;

    public void setTaxHouseholdIncome(final Double taxHouseholdIncome) {
        this.taxHouseholdIncome = taxHouseholdIncome;
    }

 
    @Column(name="tax_household_income"  )
      
    public Double getTaxHouseholdIncome() {
        return this.taxHouseholdIncome;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"taxHousehold"},
        message = "taxHouseholdLastName"
      )
    
      @NotNull(
        
        
        profiles = {"taxHousehold"},
        message = "taxHouseholdLastName"
      )
    
      @NotBlank(
        
        
        profiles = {"taxHousehold"},
        message = "taxHouseholdLastName"
      )
    
    private String taxHouseholdLastName;

    public void setTaxHouseholdLastName(final String taxHouseholdLastName) {
        this.taxHouseholdLastName = taxHouseholdLastName;
    }

 
    @Column(name="tax_household_last_name" , length=38 )
      
    public String getTaxHouseholdLastName() {
        return this.taxHouseholdLastName;
    }
  
}
