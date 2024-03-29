

package fr.cg95.cvq.business.request.leisure;

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
@Table(name="sms_notification_request")
public class SmsNotificationRequestData implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>(RequestData.conditions);

    private Long id;

    public SmsNotificationRequestData() {
      
        subscription = Boolean.valueOf(false);
      
    }

    @Override
    public SmsNotificationRequestData clone() {
        SmsNotificationRequestData result = new SmsNotificationRequestData();
        
          
            
        result.setCleverSmsContactId(cleverSmsContactId);
      
          
        
          
            
        List<fr.cg95.cvq.business.request.LocalReferentialData> interestsList = new ArrayList<fr.cg95.cvq.business.request.LocalReferentialData>();
        for (LocalReferentialData object : interests) {
            interestsList.add(object.clone());
        }
        result.setInterests(interestsList);
      
          
        
          
            
        result.setMobilePhone(mobilePhone);
      
          
        
          
            
        result.setSubscription(subscription);
      
          
        
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
        
        
        profiles = {"administration"},
        message = "cleverSmsContactId"
      )
    
      @NotBlank(
        
        
        profiles = {"administration"},
        message = "cleverSmsContactId"
      )
    
    private String cleverSmsContactId;

    public void setCleverSmsContactId(final String cleverSmsContactId) {
        this.cleverSmsContactId = cleverSmsContactId;
    }

 
    @Column(name="clever_sms_contact_id"  )
      
    public String getCleverSmsContactId() {
        return this.cleverSmsContactId;
    }
  
    
      @LocalReferential(
        
        
        profiles = {"subscription"},
        message = "interests"
      )
    
      @MinSize(
        
          value = 1,
        
        
        profiles = {"subscription"},
        message = "interests"
      )
    
    private List<fr.cg95.cvq.business.request.LocalReferentialData> interests;

    public void setInterests(final List<fr.cg95.cvq.business.request.LocalReferentialData> interests) {
        this.interests = interests;
    }

 
    @ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinTable(name="sms_notification_request_interests",
            joinColumns=
                @JoinColumn(name="sms_notification_request_id"),
            inverseJoinColumns=
                @JoinColumn(name="interests_id"))
    @OrderColumn(name="interests_index")
      
    public List<fr.cg95.cvq.business.request.LocalReferentialData> getInterests() {
        return this.interests;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"subscription"},
        message = "mobilePhone"
      )
    
    private String mobilePhone;

    public void setMobilePhone(final String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

 
    @Column(name="mobile_phone" , length=10 )
      
    public String getMobilePhone() {
        return this.mobilePhone;
    }
  
    
      @NotNull(
        
        
        profiles = {"subscription"},
        message = "subscription"
      )
    
    private Boolean subscription;

    public void setSubscription(final Boolean subscription) {
        this.subscription = subscription;
    }

 
    @Column(name="subscription"  )
      
    public Boolean getSubscription() {
        return this.subscription;
    }
  
}
