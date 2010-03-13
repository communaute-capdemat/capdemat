
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

/**
 * Generated class file, do not edit !
 *
 * @hibernate.class
 *  table="rsr_spouse"
 *  lazy="false"
 */
public class RsrSpouse implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

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
            rsrSpouse.setSpouseTitle(fr.cg95.cvq.xml.common.TitleType.Enum.forString(this.spouseTitle.toString()));
      
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

    /**
     * @hibernate.id
     *  column="id"
     *  generator-class="sequence"
     */
    public final Long getId() {
        return this.id;
    }

  
    
      @NotNull(
        
        
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

    public final void setSpouseLastName(final String spouseLastName) {
        this.spouseLastName = spouseLastName;
    }

    /**
  
        * @hibernate.property
        *  column="spouse_last_name"
        *  length="38"
      
    */
    public final String getSpouseLastName() {
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

    public final void setSpouseFirstName(final String spouseFirstName) {
        this.spouseFirstName = spouseFirstName;
    }

    /**
  
        * @hibernate.property
        *  column="spouse_first_name"
        *  length="38"
      
    */
    public final String getSpouseFirstName() {
        return this.spouseFirstName;
    }
  
    
      @NotNull(
        
        
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
  
    
      @NotNull(
        
        
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
  
}
