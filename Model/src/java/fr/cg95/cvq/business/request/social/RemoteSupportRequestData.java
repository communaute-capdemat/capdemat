

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
        message = "contactFirstName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            
            "active &= _this.conditions['contactKind'].test(_this.contactKind.toString());" +
                
              
            
            "return active",
        
        profiles = {"contact"},
        message = "contactFirstName"
      )
    
    private String contactFirstName;

    public final void setContactFirstName(final String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    /**
 
        * @hibernate.property
        *  column="contact_first_name"
        *  length="38"
      
    */
    public final String getContactFirstName() {
        return this.contactFirstName;
    }
  
    
      @NotNull(
        
        
        profiles = {"contact"},
        message = "contactFirstName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            
            "active &= _this.conditions['contactKind'].test(_this.contactKind.toString());" +
                
              
            
            "return active",
        
        profiles = {"contact"},
        message = "contactFirstName"
      )
    
    private String contactFirstName;

    public void setContactFirstName(final String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

 
    @Column(name="contact_first_name" , length=38 )
      
    public String getContactFirstName() {
        return this.contactFirstName;
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
    
    private String contactLastName;

    public final void setContactLastName(final String contactLastName) {
        this.contactLastName = contactLastName;
    }

    /**
 
        * @hibernate.property
        *  column="contact_last_name"
        *  length="38"
      
    */
    public final String getContactLastName() {
        return this.contactLastName;
    }
  
    
      @MaxLength(
        
          value = 10,
    private String contactLastName;

    public void setContactLastName(final String contactLastName) {
        this.contactLastName = contactLastName;
    }

 
    @Column(name="contact_last_name" , length=38 )
      
    public String getContactLastName() {
        return this.contactLastName;
    }
  
    
      @MaxLength(
        
          value = 10,
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['contactKind'].test(_this.contactKind.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"contact"},
        message = "firstContact"
      )
    
    private fr.cg95.cvq.business.request.social.RsrContact firstContact;

    public final void setContactPhone(final String contactPhone) {
        this.contactPhone = contactPhone;
    public void setContactPhone(final String contactPhone) {
        this.contactPhone = contactPhone;
    public final void setFirstContact(final fr.cg95.cvq.business.request.social.RsrContact firstContact) {
        this.firstContact = firstContact;
    }

 
        * @hibernate.property
        *  column="contact_phone"
        *  length="10"
    @Column(name="contact_phone" , length=10 )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="first_contact_id"
        *  class="fr.cg95.cvq.business.request.social.RsrContact"
      
    */
    public final String getContactPhone() {
        return this.contactPhone;
    public String getContactPhone() {
        return this.contactPhone;
    */
    public final fr.cg95.cvq.business.request.social.RsrContact getFirstContact() {
        return this.firstContact;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "requestInformation"
      )
    
    private Boolean requestInformationEmergency;

    public final void setRequestInformationEmergency(final Boolean requestInformationEmergency) {
        this.requestInformationEmergency = requestInformationEmergency;
    }

    /**
 
        * @hibernate.property
        *  column="request_information_emergency"
        
      
    */
    public final Boolean getRequestInformationEmergency() {
        return this.requestInformationEmergency;
    }
  
    
      @MaxLength(
        
          value = 180,
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['requestInformationEmergency'].test(_this.requestInformationEmergency.toString());" +
                
              
            
            
            "return active",
    private Boolean requestInformationEmergency;

    public void setRequestInformationEmergency(final Boolean requestInformationEmergency) {
        this.requestInformationEmergency = requestInformationEmergency;
    }

 
    @Column(name="request_information_emergency"  )
      
    public Boolean getRequestInformationEmergency() {
        return this.requestInformationEmergency;
    }
  
    
      @MaxLength(
        
          value = 180,
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['requestInformationEmergency'].test(_this.requestInformationEmergency.toString());" +
                
              
            
            
            "return active",
      @AssertValid(
        
        
        profiles = {"subject"},
        message = "requestInformation"
      )
    
    private fr.cg95.cvq.business.request.social.RsrRequestInformation requestInformation;

    public final void setRequestInformationEmergencyMotive(final String requestInformationEmergencyMotive) {
        this.requestInformationEmergencyMotive = requestInformationEmergencyMotive;
    public void setRequestInformationEmergencyMotive(final String requestInformationEmergencyMotive) {
        this.requestInformationEmergencyMotive = requestInformationEmergencyMotive;
    public final void setRequestInformation(final fr.cg95.cvq.business.request.social.RsrRequestInformation requestInformation) {
        this.requestInformation = requestInformation;
    }

 
        * @hibernate.property
        *  column="request_information_emergency_motive"
        *  length="180"
    @Column(name="request_information_emergency_motive" , length=180 )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="request_information_id"
        *  class="fr.cg95.cvq.business.request.social.RsrRequestInformation"
      
    */
    public final String getRequestInformationEmergencyMotive() {
        return this.requestInformationEmergencyMotive;
    public String getRequestInformationEmergencyMotive() {
        return this.requestInformationEmergencyMotive;
    */
    public final fr.cg95.cvq.business.request.social.RsrRequestInformation getRequestInformation() {
        return this.requestInformation;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "requestInformationRequestKind"
        message = "rsrSubject"
      )
    
    private fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType requestInformationRequestKind;

    public final void setRequestInformationRequestKind(final fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType requestInformationRequestKind) {
        this.requestInformationRequestKind = requestInformationRequestKind;
    }

    /**
 
        * @hibernate.property
        *  column="request_information_request_kind"
        
      
    */
    public final fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType getRequestInformationRequestKind() {
        return this.requestInformationRequestKind;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
      )
    
    private fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType requestInformationRequestKind;

    public final void setRequestInformationRequestKind(final fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType requestInformationRequestKind) {
        this.requestInformationRequestKind = requestInformationRequestKind;
    }

    /**
 
        * @hibernate.property
        *  column="request_information_request_kind"
        
      
    */
    public final fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType getRequestInformationRequestKind() {
        return this.requestInformationRequestKind;
    }
  
    
      @MaxLength(
    private fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType requestInformationRequestKind;

    public void setRequestInformationRequestKind(final fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType requestInformationRequestKind) {
        this.requestInformationRequestKind = requestInformationRequestKind;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="request_information_request_kind"  )
      
    public fr.cg95.cvq.business.request.social.RsrRequestInformationRequestKindType getRequestInformationRequestKind() {
        return this.requestInformationRequestKind;
    }
  
    
      @MaxLength(
      @AssertValid(
        
        
        profiles = {"subject"},
        message = "rsrSubject"
      )
    
    private fr.cg95.cvq.business.request.social.RsrSubject rsrSubject;

    public final void setSecondContactFirstName(final String secondContactFirstName) {
        this.secondContactFirstName = secondContactFirstName;
    public void setSecondContactFirstName(final String secondContactFirstName) {
        this.secondContactFirstName = secondContactFirstName;
    public final void setRsrSubject(final fr.cg95.cvq.business.request.social.RsrSubject rsrSubject) {
        this.rsrSubject = rsrSubject;
    }

 
        * @hibernate.property
        *  column="second_contact_first_name"
        *  length="38"
    @Column(name="second_contact_first_name" , length=38 )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="rsr_subject_id"
        *  class="fr.cg95.cvq.business.request.social.RsrSubject"
      
    */
    public final String getSecondContactFirstName() {
        return this.secondContactFirstName;
    public String getSecondContactFirstName() {
        return this.secondContactFirstName;
    */
    public final fr.cg95.cvq.business.request.social.RsrSubject getRsrSubject() {
        return this.rsrSubject;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['contactKind'].test(_this.contactKind.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"contact"},
        message = "secondContact"
      )
    
    private String secondContactLastName;

    public final void setSecondContactLastName(final String secondContactLastName) {
        this.secondContactLastName = secondContactLastName;
    }

    /**
 
        * @hibernate.property
        *  column="second_contact_last_name"
        *  length="38"
      
    */
    public final String getSecondContactLastName() {
        return this.secondContactLastName;
    }
  
    
      @MaxLength(
    private String secondContactLastName;

    public void setSecondContactLastName(final String secondContactLastName) {
        this.secondContactLastName = secondContactLastName;
    }

 
    @Column(name="second_contact_last_name" , length=38 )
      
    public String getSecondContactLastName() {
        return this.secondContactLastName;
    }
  
    
      @MaxLength(
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['contactKind'].test(_this.contactKind.toString());" +
                
              
            
            "return active",
        
        profiles = {"contact"},
        message = "secondContactPhone"
      )
    
    private String secondContactPhone;

    public final void setSecondContactPhone(final String secondContactPhone) {
        this.secondContactPhone = secondContactPhone;
    }

    /**
 
        * @hibernate.property
        *  column="second_contact_phone"
        *  length="10"
      
    */
    public final String getSecondContactPhone() {
        return this.secondContactPhone;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            
            "active &= _this.conditions['requestInformationRequestKind'].test(_this.requestInformationRequestKind.toString());" +
                
            
            "return active",
        
        profiles = {"contact"},
        message = "secondContactPhone"
      )
    
    private String secondContactPhone;

    public void setSecondContactPhone(final String secondContactPhone) {
        this.secondContactPhone = secondContactPhone;
    }

 
    @Column(name="second_contact_phone" , length=10 )
      
    public String getSecondContactPhone() {
        return this.secondContactPhone;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            
            "active &= _this.conditions['requestInformationRequestKind'].test(_this.requestInformationRequestKind.toString());" +
                
              
            
            "return active",
        
        profiles = {"subject"},
        message = "spouseBirthDate"
      )
    
    private java.util.Date spouseBirthDate;

    public final void setSpouseBirthDate(final java.util.Date spouseBirthDate) {
        this.spouseBirthDate = spouseBirthDate;
    }

    /**
 
        * @hibernate.property
        *  column="spouse_birth_date"
        
      
    */
    public final java.util.Date getSpouseBirthDate() {
        return this.spouseBirthDate;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
            "return active",
        
        profiles = {"subject"},
        message = "spouseBirthDate"
      )
    
    private java.util.Date spouseBirthDate;

    public void setSpouseBirthDate(final java.util.Date spouseBirthDate) {
        this.spouseBirthDate = spouseBirthDate;
    }

 
    @Column(name="spouse_birth_date"  )
      
    public java.util.Date getSpouseBirthDate() {
        return this.spouseBirthDate;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
            
            "return active",
        
        profiles = {"contact"},
        message = "secondContact"
      )
    
    private fr.cg95.cvq.business.request.social.RsrSecondContact secondContact;

    public final void setSpouseFirstName(final String spouseFirstName) {
        this.spouseFirstName = spouseFirstName;
    public void setSpouseFirstName(final String spouseFirstName) {
        this.spouseFirstName = spouseFirstName;
    public final void setSecondContact(final fr.cg95.cvq.business.request.social.RsrSecondContact secondContact) {
        this.secondContact = secondContact;
    }

 
        * @hibernate.property
        *  column="spouse_first_name"
        *  length="38"
    @Column(name="spouse_first_name" , length=38 )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="second_contact_id"
        *  class="fr.cg95.cvq.business.request.social.RsrSecondContact"
      
    */
    public final String getSpouseFirstName() {
        return this.spouseFirstName;
    public String getSpouseFirstName() {
        return this.spouseFirstName;
    */
    public final fr.cg95.cvq.business.request.social.RsrSecondContact getSecondContact() {
        return this.secondContact;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['requestInformationRequestKind'].test(_this.requestInformationRequestKind.toString());" +
                
              
              
            
            "return active",
        
        profiles = {"subject"},
        message = "spouseIsDisabledPerson"
      )
    
    private Boolean spouseIsDisabledPerson;

    public final void setSpouseIsDisabledPerson(final Boolean spouseIsDisabledPerson) {
        this.spouseIsDisabledPerson = spouseIsDisabledPerson;
    }

    /**
 
        * @hibernate.property
        *  column="spouse_is_disabled_person"
        
      
    */
    public final Boolean getSpouseIsDisabledPerson() {
        return this.spouseIsDisabledPerson;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
            "return active",
        
        profiles = {"subject"},
        message = "spouseIsDisabledPerson"
      )
    
    private Boolean spouseIsDisabledPerson;

    public void setSpouseIsDisabledPerson(final Boolean spouseIsDisabledPerson) {
        this.spouseIsDisabledPerson = spouseIsDisabledPerson;
    }

 
    @Column(name="spouse_is_disabled_person"  )
      
    public Boolean getSpouseIsDisabledPerson() {
        return this.spouseIsDisabledPerson;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
            
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

    public final void setSpouseLastName(final String spouseLastName) {
        this.spouseLastName = spouseLastName;
    public void setSpouseLastName(final String spouseLastName) {
        this.spouseLastName = spouseLastName;
    public final void setSpouse(final fr.cg95.cvq.business.request.social.RsrSpouse spouse) {
        this.spouse = spouse;
    }

 
        * @hibernate.property
        *  column="spouse_last_name"
        *  length="38"
    @Column(name="spouse_last_name" , length=38 )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="spouse_id"
        *  class="fr.cg95.cvq.business.request.social.RsrSpouse"
      
    */
    public final String getSpouseLastName() {
        return this.spouseLastName;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            
            "active &= _this.conditions['requestInformationRequestKind'].test(_this.requestInformationRequestKind.toString());" +
                
              
            
            "return active",
        
        profiles = {"subject"},
        message = "spouseTitle"
      )
    
    private fr.cg95.cvq.business.users.TitleType spouseTitle;

    public final void setSpouseTitle(final fr.cg95.cvq.business.users.TitleType spouseTitle) {
        this.spouseTitle = spouseTitle;
    }

    /**
 
        * @hibernate.property
        *  column="spouse_title"
        
      
    */
    public final fr.cg95.cvq.business.users.TitleType getSpouseTitle() {
        return this.spouseTitle;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "subjectBirthDate"
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
    public String getSpouseLastName() {
        return this.spouseLastName;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            
            "active &= _this.conditions['requestInformationRequestKind'].test(_this.requestInformationRequestKind.toString());" +
                
              
            
            "return active",
        
        profiles = {"subject"},
        message = "spouseTitle"
      )
    
    private fr.cg95.cvq.business.users.TitleType spouseTitle;

    public void setSpouseTitle(final fr.cg95.cvq.business.users.TitleType spouseTitle) {
        this.spouseTitle = spouseTitle;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="spouse_title"  )
      
    public fr.cg95.cvq.business.users.TitleType getSpouseTitle() {
        return this.spouseTitle;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "subjectBirthDate"
      )
    
    private java.util.Date subjectBirthDate;

    public void setSubjectBirthDate(final java.util.Date subjectBirthDate) {
        this.subjectBirthDate = subjectBirthDate;
    }

 
    @Column(name="subject_birth_date"  )
      
    public java.util.Date getSubjectBirthDate() {
        return this.subjectBirthDate;
    */
    public final fr.cg95.cvq.business.request.social.RsrSpouse getSpouse() {
        return this.spouse;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "subjectIsAPABeneficiary"
      )
    
    private Boolean subjectIsAPABeneficiary;

    public final void setSubjectIsAPABeneficiary(final Boolean subjectIsAPABeneficiary) {
        this.subjectIsAPABeneficiary = subjectIsAPABeneficiary;
    }

    /**
 
        * @hibernate.property
        *  column="subject_is_a_p_a_beneficiary"
        
      
    */
    public final Boolean getSubjectIsAPABeneficiary() {
        return this.subjectIsAPABeneficiary;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "subjectIsDisabledPerson"
      )
    
    private Boolean subjectIsDisabledPerson;

    public final void setSubjectIsDisabledPerson(final Boolean subjectIsDisabledPerson) {
        this.subjectIsDisabledPerson = subjectIsDisabledPerson;
    }

    /**
 
        * @hibernate.property
        *  column="subject_is_disabled_person"
        
      
    */
    public final Boolean getSubjectIsDisabledPerson() {
        return this.subjectIsDisabledPerson;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "subjectIsTaxable"
      )
    
    private Boolean subjectIsTaxable;

    public final void setSubjectIsTaxable(final Boolean subjectIsTaxable) {
        this.subjectIsTaxable = subjectIsTaxable;
    }

    /**
 
        * @hibernate.property
        *  column="subject_is_taxable"
        
      
    */
    public final Boolean getSubjectIsTaxable() {
        return this.subjectIsTaxable;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "subjectResideWith"
      )
    
    private fr.cg95.cvq.business.request.social.RsrSubjectResideWithType subjectResideWith;

    public final void setSubjectResideWith(final fr.cg95.cvq.business.request.social.RsrSubjectResideWithType subjectResideWith) {
        this.subjectResideWith = subjectResideWith;
    }

    /**
 
        * @hibernate.property
        *  column="subject_reside_with"
        
      
    */
    public final fr.cg95.cvq.business.request.social.RsrSubjectResideWithType getSubjectResideWith() {
        return this.subjectResideWith;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "subjectTitle"
      )
    
    private fr.cg95.cvq.business.users.TitleType subjectTitle;

    public final void setSubjectTitle(final fr.cg95.cvq.business.users.TitleType subjectTitle) {
        this.subjectTitle = subjectTitle;
    }

    /**
 
        * @hibernate.property
        *  column="subject_title"
        
      
    */
    public final fr.cg95.cvq.business.users.TitleType getSubjectTitle() {
        return this.subjectTitle;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"subject"},
        message = "subjectIsAPABeneficiary"
      )
    
    private Boolean subjectIsAPABeneficiary;

    public void setSubjectIsAPABeneficiary(final Boolean subjectIsAPABeneficiary) {
        this.subjectIsAPABeneficiary = subjectIsAPABeneficiary;
    }

 
    @Column(name="subject_is_a_p_a_beneficiary"  )
      
    public Boolean getSubjectIsAPABeneficiary() {
        return this.subjectIsAPABeneficiary;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "subjectIsDisabledPerson"
      )
    
    private Boolean subjectIsDisabledPerson;

    public void setSubjectIsDisabledPerson(final Boolean subjectIsDisabledPerson) {
        this.subjectIsDisabledPerson = subjectIsDisabledPerson;
    }

 
    @Column(name="subject_is_disabled_person"  )
      
    public Boolean getSubjectIsDisabledPerson() {
        return this.subjectIsDisabledPerson;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "subjectIsTaxable"
      )
    
    private Boolean subjectIsTaxable;

    public void setSubjectIsTaxable(final Boolean subjectIsTaxable) {
        this.subjectIsTaxable = subjectIsTaxable;
    }

 
    @Column(name="subject_is_taxable"  )
      
    public Boolean getSubjectIsTaxable() {
        return this.subjectIsTaxable;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "subjectResideWith"
      )
    
    private fr.cg95.cvq.business.request.social.RsrSubjectResideWithType subjectResideWith;

    public void setSubjectResideWith(final fr.cg95.cvq.business.request.social.RsrSubjectResideWithType subjectResideWith) {
        this.subjectResideWith = subjectResideWith;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="subject_reside_with"  )
      
    public fr.cg95.cvq.business.request.social.RsrSubjectResideWithType getSubjectResideWith() {
        return this.subjectResideWith;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "subjectTitle"
      )
    
    private fr.cg95.cvq.business.users.TitleType subjectTitle;

    public void setSubjectTitle(final fr.cg95.cvq.business.users.TitleType subjectTitle) {
        this.subjectTitle = subjectTitle;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="subject_title"  )
      
    public fr.cg95.cvq.business.users.TitleType getSubjectTitle() {
        return this.subjectTitle;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"contact"},
        message = "trustee"
      )
    
    private String trusteeFirstName;

    public final void setTrusteeFirstName(final String trusteeFirstName) {
        this.trusteeFirstName = trusteeFirstName;
    }

    /**
 
        * @hibernate.property
        *  column="trustee_first_name"
        *  length="38"
      
    */
    public final String getTrusteeFirstName() {
        return this.trusteeFirstName;
    }
  
    
      @MaxLength(
    private String trusteeFirstName;

    public void setTrusteeFirstName(final String trusteeFirstName) {
        this.trusteeFirstName = trusteeFirstName;
    }

 
    @Column(name="trustee_first_name" , length=38 )
      
    public String getTrusteeFirstName() {
        return this.trusteeFirstName;
    }
  
    
      @MaxLength(
      @AssertValid(
        
        
        profiles = {"contact"},
        message = "trustee"
      )
    
    private fr.cg95.cvq.business.request.social.RsrTrustee trustee;

    public final void setTrusteeLastName(final String trusteeLastName) {
        this.trusteeLastName = trusteeLastName;
    public void setTrusteeLastName(final String trusteeLastName) {
        this.trusteeLastName = trusteeLastName;
    public final void setTrustee(final fr.cg95.cvq.business.request.social.RsrTrustee trustee) {
        this.trustee = trustee;
    }

 
        * @hibernate.property
        *  column="trustee_last_name"
        *  length="38"
    @Column(name="trustee_last_name" , length=38 )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="trustee_id"
        *  class="fr.cg95.cvq.business.request.social.RsrTrustee"
      
    */
    public final String getTrusteeLastName() {
        return this.trusteeLastName;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"contact"},
        message = "trusteePhone"
      )
    
    private String trusteePhone;

    public final void setTrusteePhone(final String trusteePhone) {
        this.trusteePhone = trusteePhone;
    }

    /**
 
        * @hibernate.property
        *  column="trustee_phone"
        *  length="10"
      
    */
    public final String getTrusteePhone() {
        return this.trusteePhone;
    public String getTrusteeLastName() {
        return this.trusteeLastName;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"contact"},
        message = "trusteePhone"
      )
    
    private String trusteePhone;

    public void setTrusteePhone(final String trusteePhone) {
        this.trusteePhone = trusteePhone;
    }

 
    @Column(name="trustee_phone" , length=10 )
      
    public String getTrusteePhone() {
        return this.trusteePhone;
    */
    public final fr.cg95.cvq.business.request.social.RsrTrustee getTrustee() {
        return this.trustee;
    }
  
}
