

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
      
          
        
          
            
        if (bankAccount != null)
            result.setBankAccount(bankAccount.clone());
      
          
        
          
            
        if (currentSchool != null)
            result.setCurrentSchool(currentSchool.clone());
      
          
        
          
            
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
    
      @AssertValid(
        
        
        profiles = {"currentStudies"},
        message = "alevelsInformations"
      )
    
    private fr.cg95.cvq.business.request.school.ALevelsInformations alevelsInformations;

    public void setAlevelsInformations(final fr.cg95.cvq.business.request.school.ALevelsInformations alevelsInformations) {
        this.alevelsInformations = alevelsInformations;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="alevels_informations_id")
      
    public fr.cg95.cvq.business.request.school.ALevelsInformations getAlevelsInformations() {
        return this.alevelsInformations;
    }
  
    
      @NotNull(
        
        
        profiles = {"bankReference"},
        message = "bankAccount"
      )
    
      @AssertValid(
        
        
        profiles = {"bankReference"},
        message = "bankAccount"
      )
    
    private fr.cg95.cvq.business.users.BankAccount bankAccount;

    public void setBankAccount(final fr.cg95.cvq.business.users.BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="bank_account_id")
      
    public fr.cg95.cvq.business.users.BankAccount getBankAccount() {
        return this.bankAccount;
    }
  
    
      @AssertValid(
        
        
        profiles = {"currentStudies"},
        message = "currentSchool"
      )
    
    private fr.cg95.cvq.business.request.school.SgrCurrentSchool currentSchool;

    public void setCurrentSchool(final fr.cg95.cvq.business.request.school.SgrCurrentSchool currentSchool) {
        this.currentSchool = currentSchool;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="current_school_id")
      
    public fr.cg95.cvq.business.request.school.SgrCurrentSchool getCurrentSchool() {
        return this.currentSchool;
    }
  
    
      @AssertValid(
        
        
        profiles = {"currentStudies"},
        message = "currentStudiesInformations"
      )
    
    private fr.cg95.cvq.business.request.school.CurrentStudiesInformations currentStudiesInformations;

    public void setCurrentStudiesInformations(final fr.cg95.cvq.business.request.school.CurrentStudiesInformations currentStudiesInformations) {
        this.currentStudiesInformations = currentStudiesInformations;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="current_studies_informations_id")
      
    public fr.cg95.cvq.business.request.school.CurrentStudiesInformations getCurrentStudiesInformations() {
        return this.currentStudiesInformations;
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
        
        
        profiles = {"subject"},
        message = "subjectInformations"
      )
    
      @AssertValid(
        
        
        profiles = {"subject"},
        message = "subjectInformations"
      )
    
    private fr.cg95.cvq.business.request.school.SubjectInformations subjectInformations;

    public void setSubjectInformations(final fr.cg95.cvq.business.request.school.SubjectInformations subjectInformations) {
        this.subjectInformations = subjectInformations;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="subject_informations_id")
      
    public fr.cg95.cvq.business.request.school.SubjectInformations getSubjectInformations() {
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
        
          pattern = "^[\\d+\\s?]+(?:(\\.|,)\\d{1,2})?$",
        
        
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
