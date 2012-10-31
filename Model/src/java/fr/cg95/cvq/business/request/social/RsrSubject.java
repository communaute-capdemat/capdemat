
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
@Table(name="rsr_subject")
public class RsrSubject implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        RemoteSupportRequest.conditions;

    public RsrSubject() {
        super();
      
        subjectResideWith = fr.cg95.cvq.business.request.social.RsrSubjectResideWithType.ALONE;
      
        subjectIsTaxable = Boolean.valueOf(false);
      
        subjectIsDisabledPerson = Boolean.valueOf(false);
      
        subjectIsAPABeneficiary = Boolean.valueOf(false);
      
    }

    public final String modelToXmlString() {
        RsrSubjectType object = (RsrSubjectType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final RsrSubjectType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        RsrSubjectType rsrSubject = RsrSubjectType.Factory.newInstance();
        int i = 0;
    
        if (this.subjectResideWith != null)
            rsrSubject.setSubjectResideWith(fr.cg95.cvq.xml.request.social.RsrSubjectResideWithType.Enum.forString(this.subjectResideWith.getLegacyLabel()));
      
        if (this.subjectIsTaxable != null)
            rsrSubject.setSubjectIsTaxable(this.subjectIsTaxable.booleanValue());
      
        if (this.subjectIsDisabledPerson != null)
            rsrSubject.setSubjectIsDisabledPerson(this.subjectIsDisabledPerson.booleanValue());
      
        date = this.subjectBirthDate;
        if (date != null) {
            calendar.setTime(date);
            rsrSubject.setSubjectBirthDate(calendar);
        }
      
        if (this.subjectIsAPABeneficiary != null)
            rsrSubject.setSubjectIsAPABeneficiary(this.subjectIsAPABeneficiary.booleanValue());
      
        if (this.subjectTitle != null)
            rsrSubject.setSubjectTitle(fr.cg95.cvq.xml.common.TitleType.Enum.forString(this.subjectTitle.getLegacyLabel()));
      
        return rsrSubject;
    }

    public static RsrSubject xmlToModel(RsrSubjectType rsrSubjectDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        RsrSubject rsrSubject = new RsrSubject();
    
        if (rsrSubjectDoc.getSubjectResideWith() != null)
            rsrSubject.setSubjectResideWith(fr.cg95.cvq.business.request.social.RsrSubjectResideWithType.forString(rsrSubjectDoc.getSubjectResideWith().toString()));
        else
            rsrSubject.setSubjectResideWith(fr.cg95.cvq.business.request.social.RsrSubjectResideWithType.getDefaultRsrSubjectResideWithType());
      
        rsrSubject.setSubjectIsTaxable(Boolean.valueOf(rsrSubjectDoc.getSubjectIsTaxable()));
      
        rsrSubject.setSubjectIsDisabledPerson(Boolean.valueOf(rsrSubjectDoc.getSubjectIsDisabledPerson()));
      
        calendar = rsrSubjectDoc.getSubjectBirthDate();
        if (calendar != null) {
            rsrSubject.setSubjectBirthDate(calendar.getTime());
        }
      
        rsrSubject.setSubjectIsAPABeneficiary(Boolean.valueOf(rsrSubjectDoc.getSubjectIsAPABeneficiary()));
      
        if (rsrSubjectDoc.getSubjectTitle() != null)
            rsrSubject.setSubjectTitle(fr.cg95.cvq.business.users.TitleType.forString(rsrSubjectDoc.getSubjectTitle().toString()));
        else
            rsrSubject.setSubjectTitle(fr.cg95.cvq.business.users.TitleType.getDefaultTitleType());
      
        return rsrSubject;
    }

    @Override
    public RsrSubject clone() {
        RsrSubject result = new RsrSubject();
        
          
            
        if (subjectResideWith != null)
            result.setSubjectResideWith(subjectResideWith);
        else
            result.setSubjectResideWith(fr.cg95.cvq.business.request.social.RsrSubjectResideWithType.getDefaultRsrSubjectResideWithType());
      
          
        
          
            
        result.setSubjectIsTaxable(subjectIsTaxable);
      
          
        
          
            
        result.setSubjectIsDisabledPerson(subjectIsDisabledPerson);
      
          
        
          
            
        result.setSubjectBirthDate(subjectBirthDate);
      
          
        
          
            
        result.setSubjectIsAPABeneficiary(subjectIsAPABeneficiary);
      
          
        
          
            
        if (subjectTitle != null)
            result.setSubjectTitle(subjectTitle);
        else
            result.setSubjectTitle(fr.cg95.cvq.business.users.TitleType.getDefaultTitleType());
      
          
        
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
        message = "subjectBirthDate"
      )
    
    private java.util.Date subjectBirthDate;

    public void setSubjectBirthDate(final java.util.Date subjectBirthDate) {
        this.subjectBirthDate = subjectBirthDate;
    }

    
    @Column(name="subject_birth_date"  )
      
    public java.util.Date getSubjectBirthDate() {
        return this.subjectBirthDate;
    }
  
    
      @NotNull(
        
        
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
  
}
