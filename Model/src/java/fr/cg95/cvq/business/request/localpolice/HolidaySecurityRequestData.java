

package fr.cg95.cvq.business.request.localpolice;

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
@Table(name="holiday_security_request")
public class HolidaySecurityRequestData implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>(RequestData.conditions);

    private Long id;

    public HolidaySecurityRequestData() {
      
        alarm = Boolean.valueOf(false);
      
        light = Boolean.valueOf(false);
      
        otherContact = Boolean.valueOf(false);
      
        rulesAndRegulationsAcceptance = Boolean.valueOf(false);
      
    }

    @Override
    public HolidaySecurityRequestData clone() {
        HolidaySecurityRequestData result = new HolidaySecurityRequestData();
        
          
            
        result.setAbsenceEndDate(absenceEndDate);
      
          
        
          
            
        result.setAbsenceStartDate(absenceStartDate);
      
          
        
          
            
        result.setAlarm(alarm);
      
          
        
          
            
        result.setAlertPhone(alertPhone);
      
          
        
          
            
        result.setLight(light);
      
          
        
          
            
        result.setOtherContact(otherContact);
      
          
        
          
            
        if (otherContactInformations != null)
            result.setOtherContactInformations(otherContactInformations.clone());
      
          
        
          
            
        result.setRulesAndRegulationsAcceptance(rulesAndRegulationsAcceptance);
      
          
        
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
        
        
        profiles = {"registration"},
        message = "absenceEndDate"
      )
    
    private java.util.Date absenceEndDate;

    public void setAbsenceEndDate(final java.util.Date absenceEndDate) {
        this.absenceEndDate = absenceEndDate;
    }

 
    @Column(name="absence_end_date"  )
      
    public java.util.Date getAbsenceEndDate() {
        return this.absenceEndDate;
    }
  
    
      @NotNull(
        
        
        profiles = {"registration"},
        message = "absenceStartDate"
      )
    
    private java.util.Date absenceStartDate;

    public void setAbsenceStartDate(final java.util.Date absenceStartDate) {
        this.absenceStartDate = absenceStartDate;
    }

 
    @Column(name="absence_start_date"  )
      
    public java.util.Date getAbsenceStartDate() {
        return this.absenceStartDate;
    }
  
    
      @NotNull(
        
        
        profiles = {"additional"},
        message = "alarm"
      )
    
    private Boolean alarm;

    public void setAlarm(final Boolean alarm) {
        this.alarm = alarm;
    }

 
    @Column(name="alarm"  )
      
    public Boolean getAlarm() {
        return this.alarm;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"contactphone"},
        message = "alertPhone"
      )
    
      @NotNull(
        
        
        profiles = {"contactphone"},
        message = "alertPhone"
      )
    
      @NotBlank(
        
        
        profiles = {"contactphone"},
        message = "alertPhone"
      )
    
    private String alertPhone;

    public void setAlertPhone(final String alertPhone) {
        this.alertPhone = alertPhone;
    }

 
    @Column(name="alert_phone" , length=10 )
      
    public String getAlertPhone() {
        return this.alertPhone;
    }
  
    
      @NotNull(
        
        
        profiles = {"additional"},
        message = "light"
      )
    
    private Boolean light;

    public void setLight(final Boolean light) {
        this.light = light;
    }

 
    @Column(name="light"  )
      
    public Boolean getLight() {
        return this.light;
    }
  
    
      @NotNull(
        
        
        profiles = {"contact"},
        message = "otherContact"
      )
    
    private Boolean otherContact;

    public void setOtherContact(final Boolean otherContact) {
        this.otherContact = otherContact;
    }

 
    @Column(name="other_contact"  )
      
    public Boolean getOtherContact() {
        return this.otherContact;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['otherContact'].test(_this.otherContact.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"contact"},
        message = "otherContactInformations"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['otherContact'].test(_this.otherContact.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"contact"},
        message = "otherContactInformations"
      )
    
    private fr.cg95.cvq.business.request.localpolice.HsrOtherContact otherContactInformations;

    public void setOtherContactInformations(final fr.cg95.cvq.business.request.localpolice.HsrOtherContact otherContactInformations) {
        this.otherContactInformations = otherContactInformations;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="other_contact_informations_id")
      
    public fr.cg95.cvq.business.request.localpolice.HsrOtherContact getOtherContactInformations() {
        return this.otherContactInformations;
    }
  
    
    private Boolean rulesAndRegulationsAcceptance;

    public void setRulesAndRegulationsAcceptance(final Boolean rulesAndRegulationsAcceptance) {
        this.rulesAndRegulationsAcceptance = rulesAndRegulationsAcceptance;
    }

 
    @Column(name="rules_and_regulations_acceptance"  )
      
    public Boolean getRulesAndRegulationsAcceptance() {
        return this.rulesAndRegulationsAcceptance;
    }
  
}
