
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
@Table(name="dhr_requester")
public class DhrRequester implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        DomesticHelpRequest.conditions;

    public DhrRequester() {
        super();
      
        dhrRequesterIsFrenchResident = Boolean.valueOf(false);
      
    }

    public final String modelToXmlString() {
        DhrRequesterType object = (DhrRequesterType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final DhrRequesterType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        DhrRequesterType dhrRequester = DhrRequesterType.Factory.newInstance();
        int i = 0;
    
        dhrRequester.setDhrRequesterBirthPlace(this.dhrRequesterBirthPlace);
      
        date = this.dhrRequesterBirthDate;
        if (date != null) {
            calendar.setTime(date);
            dhrRequester.setDhrRequesterBirthDate(calendar);
        }
      
        date = this.dhrRequesterFranceArrivalDate;
        if (date != null) {
            calendar.setTime(date);
            dhrRequester.setDhrRequesterFranceArrivalDate(calendar);
        }
      
        if (this.dhrRequesterIsFrenchResident != null)
            dhrRequester.setDhrRequesterIsFrenchResident(this.dhrRequesterIsFrenchResident.booleanValue());
      
        if (this.dhrRequesterNationality != null)
            dhrRequester.setDhrRequesterNationality(fr.cg95.cvq.xml.common.NationalityType.Enum.forString(this.dhrRequesterNationality.getLegacyLabel()));
      
        return dhrRequester;
    }

    public static DhrRequester xmlToModel(DhrRequesterType dhrRequesterDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        DhrRequester dhrRequester = new DhrRequester();
    
        dhrRequester.setDhrRequesterBirthPlace(dhrRequesterDoc.getDhrRequesterBirthPlace());
      
        calendar = dhrRequesterDoc.getDhrRequesterBirthDate();
        if (calendar != null) {
            dhrRequester.setDhrRequesterBirthDate(calendar.getTime());
        }
      
        calendar = dhrRequesterDoc.getDhrRequesterFranceArrivalDate();
        if (calendar != null) {
            dhrRequester.setDhrRequesterFranceArrivalDate(calendar.getTime());
        }
      
        dhrRequester.setDhrRequesterIsFrenchResident(Boolean.valueOf(dhrRequesterDoc.getDhrRequesterIsFrenchResident()));
      
        if (dhrRequesterDoc.getDhrRequesterNationality() != null)
            dhrRequester.setDhrRequesterNationality(fr.cg95.cvq.business.users.NationalityType.forString(dhrRequesterDoc.getDhrRequesterNationality().toString()));
        else
            dhrRequester.setDhrRequesterNationality(fr.cg95.cvq.business.users.NationalityType.getDefaultNationalityType());
      
        return dhrRequester;
    }

    @Override
    public DhrRequester clone() {
        DhrRequester result = new DhrRequester();
        
          
            
        result.setDhrRequesterBirthPlace(dhrRequesterBirthPlace);
      
          
        
          
            
        result.setDhrRequesterBirthDate(dhrRequesterBirthDate);
      
          
        
          
            
        result.setDhrRequesterFranceArrivalDate(dhrRequesterFranceArrivalDate);
      
          
        
          
            
        result.setDhrRequesterIsFrenchResident(dhrRequesterIsFrenchResident);
      
          
        
          
            
        if (dhrRequesterNationality != null)
            result.setDhrRequesterNationality(dhrRequesterNationality);
        else
            result.setDhrRequesterNationality(fr.cg95.cvq.business.users.NationalityType.getDefaultNationalityType());
      
          
        
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
        message = "dhrRequesterBirthPlace"
      )
    
      @NotBlank(
        
        
        profiles = {"subject"},
        message = "dhrRequesterBirthPlace"
      )
    
    private String dhrRequesterBirthPlace;

    public void setDhrRequesterBirthPlace(final String dhrRequesterBirthPlace) {
        this.dhrRequesterBirthPlace = dhrRequesterBirthPlace;
    }

    
    @Column(name="dhr_requester_birth_place"  )
      
    public String getDhrRequesterBirthPlace() {
        return this.dhrRequesterBirthPlace;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "dhrRequesterBirthDate"
      )
    
    private java.util.Date dhrRequesterBirthDate;

    public void setDhrRequesterBirthDate(final java.util.Date dhrRequesterBirthDate) {
        this.dhrRequesterBirthDate = dhrRequesterBirthDate;
    }

    
    @Column(name="dhr_requester_birth_date"  )
      
    public java.util.Date getDhrRequesterBirthDate() {
        return this.dhrRequesterBirthDate;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['dhrRequester.dhrRequesterNationality'].test(_this.dhrRequesterNationality.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "dhrRequesterFranceArrivalDate"
      )
    
    private java.util.Date dhrRequesterFranceArrivalDate;

    public void setDhrRequesterFranceArrivalDate(final java.util.Date dhrRequesterFranceArrivalDate) {
        this.dhrRequesterFranceArrivalDate = dhrRequesterFranceArrivalDate;
    }

    
    @Column(name="dhr_requester_france_arrival_date"  )
      
    public java.util.Date getDhrRequesterFranceArrivalDate() {
        return this.dhrRequesterFranceArrivalDate;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['dhrRequester.dhrRequesterNationality'].test(_this.dhrRequesterNationality.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "dhrRequesterIsFrenchResident"
      )
    
    private Boolean dhrRequesterIsFrenchResident;

    public void setDhrRequesterIsFrenchResident(final Boolean dhrRequesterIsFrenchResident) {
        this.dhrRequesterIsFrenchResident = dhrRequesterIsFrenchResident;
    }

    
    @Column(name="dhr_requester_is_french_resident"  )
      
    public Boolean getDhrRequesterIsFrenchResident() {
        return this.dhrRequesterIsFrenchResident;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "dhrRequesterNationality"
      )
    
    private fr.cg95.cvq.business.users.NationalityType dhrRequesterNationality;

    public void setDhrRequesterNationality(final fr.cg95.cvq.business.users.NationalityType dhrRequesterNationality) {
        this.dhrRequesterNationality = dhrRequesterNationality;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="dhr_requester_nationality" , length=32 )
      
    public fr.cg95.cvq.business.users.NationalityType getDhrRequesterNationality() {
        return this.dhrRequesterNationality;
    }
  
}
