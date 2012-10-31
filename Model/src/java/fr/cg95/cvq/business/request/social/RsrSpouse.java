
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
@Table(name="rsr_spouse")
public class RsrSpouse implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        RemoteSupportRequest.conditions;

    public RsrSpouse() {
        super();
      
        spouseIsDisabledPerson = Boolean.valueOf(false);
      
    }

    public final String modelToXmlString() {
        RsrSpouseType object = (RsrSpouseType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final RsrSpouseType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        RsrSpouseType rsrSpouse = RsrSpouseType.Factory.newInstance();
        int i = 0;
    
        if (this.spouseIsDisabledPerson != null)
            rsrSpouse.setSpouseIsDisabledPerson(this.spouseIsDisabledPerson.booleanValue());
      
        rsrSpouse.setSpouseLastName(this.spouseLastName);
      
        rsrSpouse.setSpouseFirstName(this.spouseFirstName);
      
        date = this.spouseBirthDate;
        if (date != null) {
            calendar.setTime(date);
            rsrSpouse.setSpouseBirthDate(calendar);
        }
      
        if (this.spouseTitle != null)
            rsrSpouse.setSpouseTitle(fr.cg95.cvq.xml.common.TitleType.Enum.forString(this.spouseTitle.getLegacyLabel()));
      
        return rsrSpouse;
    }

    public static RsrSpouse xmlToModel(RsrSpouseType rsrSpouseDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        RsrSpouse rsrSpouse = new RsrSpouse();
    
        rsrSpouse.setSpouseIsDisabledPerson(Boolean.valueOf(rsrSpouseDoc.getSpouseIsDisabledPerson()));
      
        rsrSpouse.setSpouseLastName(rsrSpouseDoc.getSpouseLastName());
      
        rsrSpouse.setSpouseFirstName(rsrSpouseDoc.getSpouseFirstName());
      
        calendar = rsrSpouseDoc.getSpouseBirthDate();
        if (calendar != null) {
            rsrSpouse.setSpouseBirthDate(calendar.getTime());
        }
      
        if (rsrSpouseDoc.getSpouseTitle() != null)
            rsrSpouse.setSpouseTitle(fr.cg95.cvq.business.users.TitleType.forString(rsrSpouseDoc.getSpouseTitle().toString()));
        else
            rsrSpouse.setSpouseTitle(fr.cg95.cvq.business.users.TitleType.getDefaultTitleType());
      
        return rsrSpouse;
    }

    @Override
    public RsrSpouse clone() {
        RsrSpouse result = new RsrSpouse();
        
          
            
        result.setSpouseIsDisabledPerson(spouseIsDisabledPerson);
      
          
        
          
            
        result.setSpouseLastName(spouseLastName);
      
          
        
          
            
        result.setSpouseFirstName(spouseFirstName);
      
          
        
          
            
        result.setSpouseBirthDate(spouseBirthDate);
      
          
        
          
            
        if (spouseTitle != null)
            result.setSpouseTitle(spouseTitle);
        else
            result.setSpouseTitle(fr.cg95.cvq.business.users.TitleType.getDefaultTitleType());
      
          
        
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
        
        
        profiles = {"subject"},
        message = "spouseLastName"
      )
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "spouseLastName"
      )
    
      @NotBlank(
        
        
        profiles = {"subject"},
        message = "spouseLastName"
      )
    
    private String spouseLastName;

    public void setSpouseLastName(final String spouseLastName) {
        this.spouseLastName = spouseLastName;
    }

    
    @Column(name="spouse_last_name" , length=38 )
      
    public String getSpouseLastName() {
        return this.spouseLastName;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"subject"},
        message = "spouseFirstName"
      )
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "spouseFirstName"
      )
    
      @NotBlank(
        
        
        profiles = {"subject"},
        message = "spouseFirstName"
      )
    
    private String spouseFirstName;

    public void setSpouseFirstName(final String spouseFirstName) {
        this.spouseFirstName = spouseFirstName;
    }

    
    @Column(name="spouse_first_name" , length=38 )
      
    public String getSpouseFirstName() {
        return this.spouseFirstName;
    }
  
    
      @NotNull(
        
        
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
  
    
      @NotNull(
        
        
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
  
}
