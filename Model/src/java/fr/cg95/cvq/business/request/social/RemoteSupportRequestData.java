

package fr.cg95.cvq.business.request.social;

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
@Table(name="remote_support_request")
public class RemoteSupportRequestData implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>(RequestData.conditions);

    private Long id;

    public RemoteSupportRequestData() {
      
        contactKind = fr.cg95.cvq.business.request.social.RsrContactKindType.REQUESTER;
      
        requestInformationRequestKind = fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType.INDIVIDUAL;
      
    }

    @Override
    public RemoteSupportRequestData clone() {
        RemoteSupportRequestData result = new RemoteSupportRequestData();
        
          
            
        if (contactKind != null)
            result.setContactKind(contactKind);
        else
            result.setContactKind(fr.cg95.cvq.business.request.social.RsrContactKindType.getDefaultRsrContactKindType());
      
          
        
          
            
        if (firstContact != null)
            result.setFirstContact(firstContact.clone());
      
          
        
          
            
        if (requestInformation != null)
            result.setRequestInformation(requestInformation.clone());
      
          
        
          
            
        if (requestInformationRequestKind != null)
            result.setRequestInformationRequestKind(requestInformationRequestKind);
        else
            result.setRequestInformationRequestKind(fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType.getDefaultRsrRequestInformationRequestKindType());
      
          
        
          
            
        if (rsrSubject != null)
            result.setRsrSubject(rsrSubject.clone());
      
          
        
          
            
        if (secondContact != null)
            result.setSecondContact(secondContact.clone());
      
          
        
          
            
        if (spouse != null)
            result.setSpouse(spouse.clone());
      
          
        
          
            
        if (trustee != null)
            result.setTrustee(trustee.clone());
      
          
        
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
        
        
        profiles = {"contact"},
        message = "contactKind"
      )
    
    private fr.cg95.cvq.business.request.social.RsrContactKindType contactKind;

    public void setContactKind(final fr.cg95.cvq.business.request.social.RsrContactKindType contactKind) {
        this.contactKind = contactKind;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="contact_kind"  )
      
    public fr.cg95.cvq.business.request.social.RsrContactKindType getContactKind() {
        return this.contactKind;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['contactKind'].test(_this.contactKind.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"contact"},
        message = "firstContact"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['contactKind'].test(_this.contactKind.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"contact"},
        message = "firstContact"
      )
    
    private fr.cg95.cvq.business.request.social.RsrContact firstContact;

    public void setFirstContact(final fr.cg95.cvq.business.request.social.RsrContact firstContact) {
        this.firstContact = firstContact;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="first_contact_id")
      
    public fr.cg95.cvq.business.request.social.RsrContact getFirstContact() {
        return this.firstContact;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "requestInformation"
      )
    
      @AssertValid(
        
        
        profiles = {"subject"},
        message = "requestInformation"
      )
    
    private fr.cg95.cvq.business.request.social.RsrRequestInformation requestInformation;

    public void setRequestInformation(final fr.cg95.cvq.business.request.social.RsrRequestInformation requestInformation) {
        this.requestInformation = requestInformation;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="request_information_id")
      
    public fr.cg95.cvq.business.request.social.RsrRequestInformation getRequestInformation() {
        return this.requestInformation;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "requestInformationRequestKind"
      )
    
    private fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType requestInformationRequestKind;

    public void setRequestInformationRequestKind(final fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType requestInformationRequestKind) {
        this.requestInformationRequestKind = requestInformationRequestKind;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="request_information_request_kind"  )
      
    public fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType getRequestInformationRequestKind() {
        return this.requestInformationRequestKind;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "rsrSubject"
      )
    
      @AssertValid(
        
        
        profiles = {"subject"},
        message = "rsrSubject"
      )
    
    private fr.cg95.cvq.business.request.social.RsrSubject rsrSubject;

    public void setRsrSubject(final fr.cg95.cvq.business.request.social.RsrSubject rsrSubject) {
        this.rsrSubject = rsrSubject;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="rsr_subject_id")
      
    public fr.cg95.cvq.business.request.social.RsrSubject getRsrSubject() {
        return this.rsrSubject;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['contactKind'].test(_this.contactKind.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"contact"},
        message = "secondContact"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['contactKind'].test(_this.contactKind.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"contact"},
        message = "secondContact"
      )
    
    private fr.cg95.cvq.business.request.social.RsrSecondContact secondContact;

    public void setSecondContact(final fr.cg95.cvq.business.request.social.RsrSecondContact secondContact) {
        this.secondContact = secondContact;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="second_contact_id")
      
    public fr.cg95.cvq.business.request.social.RsrSecondContact getSecondContact() {
        return this.secondContact;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['requestInformationRequestKind'].test(_this.requestInformationRequestKind.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "spouse"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['requestInformationRequestKind'].test(_this.requestInformationRequestKind.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "spouse"
      )
    
    private fr.cg95.cvq.business.request.social.RsrSpouse spouse;

    public void setSpouse(final fr.cg95.cvq.business.request.social.RsrSpouse spouse) {
        this.spouse = spouse;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="spouse_id")
      
    public fr.cg95.cvq.business.request.social.RsrSpouse getSpouse() {
        return this.spouse;
    }
  
    
      @NotNull(
        
        
        profiles = {"contact"},
        message = "trustee"
      )
    
      @AssertValid(
        
        
        profiles = {"contact"},
        message = "trustee"
      )
    
    private fr.cg95.cvq.business.request.social.RsrTrustee trustee;

    public void setTrustee(final fr.cg95.cvq.business.request.social.RsrTrustee trustee) {
        this.trustee = trustee;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="trustee_id")
      
    public fr.cg95.cvq.business.request.social.RsrTrustee getTrustee() {
        return this.trustee;
    }
  
}
