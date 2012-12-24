
package fr.cg95.cvq.business.request.school;

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
import fr.cg95.cvq.xml.request.school.*;
import fr.cg95.cvq.service.request.LocalReferential;
import fr.cg95.cvq.service.request.condition.IConditionChecker;
import javax.persistence.*;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Type;

/**
 * Generated class file, do not edit !
 */
@Entity
@Table(name="subject_informations")
public class SubjectInformations implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        StudyGrantRequest.conditions;

    public SubjectInformations() {
        super();
      
        subjectFirstRequest = Boolean.valueOf(true);
      
    }

    public final String modelToXmlString() {
        SubjectInformationsType object = (SubjectInformationsType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final SubjectInformationsType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        SubjectInformationsType subjectInformations = SubjectInformationsType.Factory.newInstance();
        int i = 0;
    
        date = this.subjectBirthDate;
        if (date != null) {
            calendar.setTime(date);
            subjectInformations.setSubjectBirthDate(calendar);
        }
      
        if (this.subjectFirstRequest != null)
            subjectInformations.setSubjectFirstRequest(this.subjectFirstRequest.booleanValue());
      
        return subjectInformations;
    }

    public static SubjectInformations xmlToModel(SubjectInformationsType subjectInformationsDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        SubjectInformations subjectInformations = new SubjectInformations();
    
        calendar = subjectInformationsDoc.getSubjectBirthDate();
        if (calendar != null) {
            subjectInformations.setSubjectBirthDate(calendar.getTime());
        }
      
        subjectInformations.setSubjectFirstRequest(Boolean.valueOf(subjectInformationsDoc.getSubjectFirstRequest()));
      
        return subjectInformations;
    }

    @Override
    public SubjectInformations clone() {
        SubjectInformations result = new SubjectInformations();
        
          
            
        result.setSubjectBirthDate(subjectBirthDate);
      
          
        
          
            
        result.setSubjectFirstRequest(subjectFirstRequest);
      
          
        
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
        message = "subjectFirstRequest"
      )
    
    private Boolean subjectFirstRequest;

    public void setSubjectFirstRequest(final Boolean subjectFirstRequest) {
        this.subjectFirstRequest = subjectFirstRequest;
    }

    
    @Column(name="subject_first_request"  )
      
    public Boolean getSubjectFirstRequest() {
        return this.subjectFirstRequest;
    }
  
}
