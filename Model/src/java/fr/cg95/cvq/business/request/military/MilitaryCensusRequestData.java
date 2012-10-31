

package fr.cg95.cvq.business.request.military;

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
@Table(name="military_census_request")
public class MilitaryCensusRequestData implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>(RequestData.conditions);

    private Long id;

    public MilitaryCensusRequestData() {
      
        affectionOrDisease = Boolean.valueOf(false);
      
        childBirthCountry = fr.cg95.cvq.business.users.CountryType.FR;
      
        childCountry = fr.cg95.cvq.business.users.FullNationalityType.FR;
      
        childResidenceCountry = fr.cg95.cvq.business.users.CountryType.FR;
      
        highlyInfirm = Boolean.valueOf(false);
      
        japdExemption = Boolean.valueOf(false);
      
    }

    @Override
    public MilitaryCensusRequestData clone() {
        MilitaryCensusRequestData result = new MilitaryCensusRequestData();
        
          
            
        result.setAffectionOrDisease(affectionOrDisease);
      
          
        
          
            
        if (childBirthCountry != null)
            result.setChildBirthCountry(childBirthCountry);
        else
            result.setChildBirthCountry(fr.cg95.cvq.business.users.CountryType.getDefaultCountryType());
      
          
        
          
            
        result.setChildConvention(childConvention);
      
          
        
          
            
        if (childCountry != null)
            result.setChildCountry(childCountry);
        else
            result.setChildCountry(fr.cg95.cvq.business.users.FullNationalityType.getDefaultFullNationalityType());
      
          
        
          
            
        result.setChildMail(childMail);
      
          
        
          
            
        if (childOtherCountry != null)
            result.setChildOtherCountry(childOtherCountry);
        else
            result.setChildOtherCountry(fr.cg95.cvq.business.users.FullNationalityType.getDefaultFullNationalityType());
      
          
        
          
            
        result.setChildPhone(childPhone);
      
          
        
          
            
        if (childResidenceCountry != null)
            result.setChildResidenceCountry(childResidenceCountry);
        else
            result.setChildResidenceCountry(fr.cg95.cvq.business.users.CountryType.getDefaultCountryType());
      
          
        
          
            
        if (childTitle != null)
            result.setChildTitle(childTitle);
        else
            result.setChildTitle(fr.cg95.cvq.business.users.TitleType.getDefaultTitleType());
      
          
        
          
            
        if (familySituationInformation != null)
            result.setFamilySituationInformation(familySituationInformation.clone());
      
          
        
          
            
        if (fatherInformation != null)
            result.setFatherInformation(fatherInformation.clone());
      
          
        
          
            
        result.setHighlyInfirm(highlyInfirm);
      
          
        
          
            
        result.setJapdExemption(japdExemption);
      
          
        
          
            
        result.setMaidenName(maidenName);
      
          
        
          
            
        if (motherInformation != null)
            result.setMotherInformation(motherInformation.clone());
      
          
        
          
            
        if (professionalSituationInformation != null)
            result.setProfessionalSituationInformation(professionalSituationInformation.clone());
      
          
        
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

  
    
    private Boolean affectionOrDisease;

    public void setAffectionOrDisease(final Boolean affectionOrDisease) {
        this.affectionOrDisease = affectionOrDisease;
    }

 
    @Column(name="affection_or_disease"  )
      
    public Boolean getAffectionOrDisease() {
        return this.affectionOrDisease;
    }
  
    
      @NotNull(
        
        
        profiles = {"census"},
        message = "childBirthCountry"
      )
    
    private fr.cg95.cvq.business.users.CountryType childBirthCountry;

    public void setChildBirthCountry(final fr.cg95.cvq.business.users.CountryType childBirthCountry) {
        this.childBirthCountry = childBirthCountry;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="child_birth_country"  )
      
    public fr.cg95.cvq.business.users.CountryType getChildBirthCountry() {
        return this.childBirthCountry;
    }
  
    
      @MaxLength(
        
          value = 255,
        
        
        profiles = {"census"},
        message = "childConvention"
      )
    
      @MatchPattern(
        
          pattern = "^[\\w\\W]{0,255}$",
        
        
        profiles = {"census"},
        message = "childConvention"
      )
    
    private String childConvention;

    public void setChildConvention(final String childConvention) {
        this.childConvention = childConvention;
    }

 
    @Column(name="child_convention" , length=255 )
      
    public String getChildConvention() {
        return this.childConvention;
    }
  
    
      @NotNull(
        
        
        profiles = {"census"},
        message = "childCountry"
      )
    
    private fr.cg95.cvq.business.users.FullNationalityType childCountry;

    public void setChildCountry(final fr.cg95.cvq.business.users.FullNationalityType childCountry) {
        this.childCountry = childCountry;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="child_country"  )
      
    public fr.cg95.cvq.business.users.FullNationalityType getChildCountry() {
        return this.childCountry;
    }
  
    
    private String childMail;

    public void setChildMail(final String childMail) {
        this.childMail = childMail;
    }

 
    @Column(name="child_mail"  )
      
    public String getChildMail() {
        return this.childMail;
    }
  
    
    private fr.cg95.cvq.business.users.FullNationalityType childOtherCountry;

    public void setChildOtherCountry(final fr.cg95.cvq.business.users.FullNationalityType childOtherCountry) {
        this.childOtherCountry = childOtherCountry;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="child_other_country"  )
      
    public fr.cg95.cvq.business.users.FullNationalityType getChildOtherCountry() {
        return this.childOtherCountry;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"census"},
        message = "childPhone"
      )
    
      @NotNull(
        
        
        profiles = {"census"},
        message = "childPhone"
      )
    
      @NotBlank(
        
        
        profiles = {"census"},
        message = "childPhone"
      )
    
    private String childPhone;

    public void setChildPhone(final String childPhone) {
        this.childPhone = childPhone;
    }

 
    @Column(name="child_phone" , length=10 )
      
    public String getChildPhone() {
        return this.childPhone;
    }
  
    
    private fr.cg95.cvq.business.users.CountryType childResidenceCountry;

    public void setChildResidenceCountry(final fr.cg95.cvq.business.users.CountryType childResidenceCountry) {
        this.childResidenceCountry = childResidenceCountry;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="child_residence_country"  )
      
    public fr.cg95.cvq.business.users.CountryType getChildResidenceCountry() {
        return this.childResidenceCountry;
    }
  
    
      @NotNull(
        
        
        profiles = {"census"},
        message = "childTitle"
      )
    
    private fr.cg95.cvq.business.users.TitleType childTitle;

    public void setChildTitle(final fr.cg95.cvq.business.users.TitleType childTitle) {
        this.childTitle = childTitle;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="child_title"  )
      
    public fr.cg95.cvq.business.users.TitleType getChildTitle() {
        return this.childTitle;
    }
  
    
      @NotNull(
        
        
        profiles = {"situation"},
        message = "familySituationInformation"
      )
    
      @AssertValid(
        
        
        profiles = {"situation"},
        message = "familySituationInformation"
      )
    
    private fr.cg95.cvq.business.request.military.FamilySituationInformation familySituationInformation;

    public void setFamilySituationInformation(final fr.cg95.cvq.business.request.military.FamilySituationInformation familySituationInformation) {
        this.familySituationInformation = familySituationInformation;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="family_situation_information_id")
      
    public fr.cg95.cvq.business.request.military.FamilySituationInformation getFamilySituationInformation() {
        return this.familySituationInformation;
    }
  
    
      @NotNull(
        
        
        profiles = {"parentage"},
        message = "fatherInformation"
      )
    
      @AssertValid(
        
        
        profiles = {"parentage"},
        message = "fatherInformation"
      )
    
    private fr.cg95.cvq.business.request.military.MilitaryFatherInformation fatherInformation;

    public void setFatherInformation(final fr.cg95.cvq.business.request.military.MilitaryFatherInformation fatherInformation) {
        this.fatherInformation = fatherInformation;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="father_information_id")
      
    public fr.cg95.cvq.business.request.military.MilitaryFatherInformation getFatherInformation() {
        return this.fatherInformation;
    }
  
    
    private Boolean highlyInfirm;

    public void setHighlyInfirm(final Boolean highlyInfirm) {
        this.highlyInfirm = highlyInfirm;
    }

 
    @Column(name="highly_infirm"  )
      
    public Boolean getHighlyInfirm() {
        return this.highlyInfirm;
    }
  
    
      @NotNull(
        
        
        profiles = {"exemption"},
        message = "japdExemption"
      )
    
    private Boolean japdExemption;

    public void setJapdExemption(final Boolean japdExemption) {
        this.japdExemption = japdExemption;
    }

 
    @Column(name="japd_exemption"  )
      
    public Boolean getJapdExemption() {
        return this.japdExemption;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"census"},
        message = "maidenName"
      )
    
    private String maidenName;

    public void setMaidenName(final String maidenName) {
        this.maidenName = maidenName;
    }

 
    @Column(name="maiden_name" , length=38 )
      
    public String getMaidenName() {
        return this.maidenName;
    }
  
    
      @NotNull(
        
        
        profiles = {"parentage"},
        message = "motherInformation"
      )
    
      @AssertValid(
        
        
        profiles = {"parentage"},
        message = "motherInformation"
      )
    
    private fr.cg95.cvq.business.request.military.MilitaryMotherInformation motherInformation;

    public void setMotherInformation(final fr.cg95.cvq.business.request.military.MilitaryMotherInformation motherInformation) {
        this.motherInformation = motherInformation;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="mother_information_id")
      
    public fr.cg95.cvq.business.request.military.MilitaryMotherInformation getMotherInformation() {
        return this.motherInformation;
    }
  
    
      @NotNull(
        
        
        profiles = {"situation"},
        message = "professionalSituationInformation"
      )
    
      @AssertValid(
        
        
        profiles = {"situation"},
        message = "professionalSituationInformation"
      )
    
    private fr.cg95.cvq.business.request.military.ProfessionalSituationInformation professionalSituationInformation;

    public void setProfessionalSituationInformation(final fr.cg95.cvq.business.request.military.ProfessionalSituationInformation professionalSituationInformation) {
        this.professionalSituationInformation = professionalSituationInformation;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="professional_situation_information_id")
      
    public fr.cg95.cvq.business.request.military.ProfessionalSituationInformation getProfessionalSituationInformation() {
        return this.professionalSituationInformation;
    }
  
}
