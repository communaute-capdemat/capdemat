
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
@Table(name="dhr_current_dwelling")
public class DhrCurrentDwelling implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        DomesticHelpRequest.conditions;

    public DhrCurrentDwelling() {
        super();
      
    }

    public final String modelToXmlString() {
        DhrCurrentDwellingType object = (DhrCurrentDwellingType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final DhrCurrentDwellingType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        DhrCurrentDwellingType dhrCurrentDwelling = DhrCurrentDwellingType.Factory.newInstance();
        int i = 0;
    
        date = this.dhrCurrentDwellingArrivalDate;
        if (date != null) {
            calendar.setTime(date);
            dhrCurrentDwelling.setDhrCurrentDwellingArrivalDate(calendar);
        }
      
        if (this.dhrCurrentDwellingStatus != null)
            dhrCurrentDwelling.setDhrCurrentDwellingStatus(fr.cg95.cvq.xml.request.social.DhrDwellingStatusType.Enum.forString(this.dhrCurrentDwellingStatus.getLegacyLabel()));
      
        if (this.dhrCurrentDwellingAddress != null)
            dhrCurrentDwelling.setDhrCurrentDwellingAddress(this.dhrCurrentDwellingAddress.modelToXml());
      
        if (this.dhrCurrentDwellingKind != null)
            dhrCurrentDwelling.setDhrCurrentDwellingKind(fr.cg95.cvq.xml.request.social.DhrDwellingKindType.Enum.forString(this.dhrCurrentDwellingKind.getLegacyLabel()));
      
        if (this.dhrCurrentDwellingNetArea != null)
            dhrCurrentDwelling.setDhrCurrentDwellingNetArea(this.dhrCurrentDwellingNetArea);
      
        if (this.dhrCurrentDwellingNumberOfRoom != null)
            dhrCurrentDwelling.setDhrCurrentDwellingNumberOfRoom(this.dhrCurrentDwellingNumberOfRoom);
      
        dhrCurrentDwelling.setDhrCurrentDwellingPhone(this.dhrCurrentDwellingPhone);
      
        return dhrCurrentDwelling;
    }

    public static DhrCurrentDwelling xmlToModel(DhrCurrentDwellingType dhrCurrentDwellingDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        DhrCurrentDwelling dhrCurrentDwelling = new DhrCurrentDwelling();
    
        calendar = dhrCurrentDwellingDoc.getDhrCurrentDwellingArrivalDate();
        if (calendar != null) {
            dhrCurrentDwelling.setDhrCurrentDwellingArrivalDate(calendar.getTime());
        }
      
        if (dhrCurrentDwellingDoc.getDhrCurrentDwellingStatus() != null)
            dhrCurrentDwelling.setDhrCurrentDwellingStatus(fr.cg95.cvq.business.request.social.DhrDwellingStatusType.forString(dhrCurrentDwellingDoc.getDhrCurrentDwellingStatus().toString()));
        else
            dhrCurrentDwelling.setDhrCurrentDwellingStatus(fr.cg95.cvq.business.request.social.DhrDwellingStatusType.getDefaultDhrDwellingStatusType());
      
        if (dhrCurrentDwellingDoc.getDhrCurrentDwellingAddress() != null)
            dhrCurrentDwelling.setDhrCurrentDwellingAddress(Address.xmlToModel(dhrCurrentDwellingDoc.getDhrCurrentDwellingAddress()));
      
        if (dhrCurrentDwellingDoc.getDhrCurrentDwellingKind() != null)
            dhrCurrentDwelling.setDhrCurrentDwellingKind(fr.cg95.cvq.business.request.social.DhrDwellingKindType.forString(dhrCurrentDwellingDoc.getDhrCurrentDwellingKind().toString()));
        else
            dhrCurrentDwelling.setDhrCurrentDwellingKind(fr.cg95.cvq.business.request.social.DhrDwellingKindType.getDefaultDhrDwellingKindType());
      
        if (dhrCurrentDwellingDoc.getDhrCurrentDwellingNetArea() != null)
            dhrCurrentDwelling.setDhrCurrentDwellingNetArea(dhrCurrentDwellingDoc.getDhrCurrentDwellingNetArea());
      
        if (dhrCurrentDwellingDoc.getDhrCurrentDwellingNumberOfRoom() != null)
            dhrCurrentDwelling.setDhrCurrentDwellingNumberOfRoom(dhrCurrentDwellingDoc.getDhrCurrentDwellingNumberOfRoom());
      
        dhrCurrentDwelling.setDhrCurrentDwellingPhone(dhrCurrentDwellingDoc.getDhrCurrentDwellingPhone());
      
        return dhrCurrentDwelling;
    }

    @Override
    public DhrCurrentDwelling clone() {
        DhrCurrentDwelling result = new DhrCurrentDwelling();
        
          
            
        result.setDhrCurrentDwellingArrivalDate(dhrCurrentDwellingArrivalDate);
      
          
        
          
            
        if (dhrCurrentDwellingStatus != null)
            result.setDhrCurrentDwellingStatus(dhrCurrentDwellingStatus);
        else
            result.setDhrCurrentDwellingStatus(fr.cg95.cvq.business.request.social.DhrDwellingStatusType.getDefaultDhrDwellingStatusType());
      
          
        
          
            
        if (dhrCurrentDwellingAddress != null)
            result.setDhrCurrentDwellingAddress(dhrCurrentDwellingAddress.clone());
      
          
        
          
            
        if (dhrCurrentDwellingKind != null)
            result.setDhrCurrentDwellingKind(dhrCurrentDwellingKind);
        else
            result.setDhrCurrentDwellingKind(fr.cg95.cvq.business.request.social.DhrDwellingKindType.getDefaultDhrDwellingKindType());
      
          
        
          
            
        result.setDhrCurrentDwellingNetArea(dhrCurrentDwellingNetArea);
      
          
        
          
            
        result.setDhrCurrentDwellingNumberOfRoom(dhrCurrentDwellingNumberOfRoom);
      
          
        
          
            
        result.setDhrCurrentDwellingPhone(dhrCurrentDwellingPhone);
      
          
        
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
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['dhrCurrentDwelling.dhrCurrentDwellingKind'].test(_this.dhrCurrentDwellingKind.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwellingArrivalDate"
      )
    
    private java.util.Date dhrCurrentDwellingArrivalDate;

    public void setDhrCurrentDwellingArrivalDate(final java.util.Date dhrCurrentDwellingArrivalDate) {
        this.dhrCurrentDwellingArrivalDate = dhrCurrentDwellingArrivalDate;
    }

    
    @Column(name="dhr_current_dwelling_arrival_date"  )
      
    public java.util.Date getDhrCurrentDwellingArrivalDate() {
        return this.dhrCurrentDwellingArrivalDate;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['dhrCurrentDwelling.dhrCurrentDwellingKind'].test(_this.dhrCurrentDwellingKind.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwellingStatus"
      )
    
    private fr.cg95.cvq.business.request.social.DhrDwellingStatusType dhrCurrentDwellingStatus;

    public void setDhrCurrentDwellingStatus(final fr.cg95.cvq.business.request.social.DhrDwellingStatusType dhrCurrentDwellingStatus) {
        this.dhrCurrentDwellingStatus = dhrCurrentDwellingStatus;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="dhr_current_dwelling_status"  )
      
    public fr.cg95.cvq.business.request.social.DhrDwellingStatusType getDhrCurrentDwellingStatus() {
        return this.dhrCurrentDwellingStatus;
    }
  
    
      @NotNull(
        
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwellingAddress"
      )
    
      @AssertValid(
        
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwellingAddress"
      )
    
    private fr.cg95.cvq.business.users.Address dhrCurrentDwellingAddress;

    public void setDhrCurrentDwellingAddress(final fr.cg95.cvq.business.users.Address dhrCurrentDwellingAddress) {
        this.dhrCurrentDwellingAddress = dhrCurrentDwellingAddress;
    }

    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="dhr_current_dwelling_address_id")
      
    public fr.cg95.cvq.business.users.Address getDhrCurrentDwellingAddress() {
        return this.dhrCurrentDwellingAddress;
    }
  
    
      @NotNull(
        
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwellingKind"
      )
    
    private fr.cg95.cvq.business.request.social.DhrDwellingKindType dhrCurrentDwellingKind;

    public void setDhrCurrentDwellingKind(final fr.cg95.cvq.business.request.social.DhrDwellingKindType dhrCurrentDwellingKind) {
        this.dhrCurrentDwellingKind = dhrCurrentDwellingKind;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="dhr_current_dwelling_kind"  )
      
    public fr.cg95.cvq.business.request.social.DhrDwellingKindType getDhrCurrentDwellingKind() {
        return this.dhrCurrentDwellingKind;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['dhrCurrentDwelling.dhrCurrentDwellingKind'].test(_this.dhrCurrentDwellingKind.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwellingNetArea"
      )
    
      @MatchPattern(
        
          pattern = "^[1-9]$|^[1-9][0-9]$|^[1-4][0-9][0-9]$|^500$",
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['dhrCurrentDwelling.dhrCurrentDwellingKind'].test(_this.dhrCurrentDwellingKind.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwellingNetArea"
      )
    
    private java.math.BigDecimal dhrCurrentDwellingNetArea;

    public void setDhrCurrentDwellingNetArea(final java.math.BigDecimal dhrCurrentDwellingNetArea) {
        this.dhrCurrentDwellingNetArea = dhrCurrentDwellingNetArea;
    }

    
    @Column(name="dhr_current_dwelling_net_area"  )
      
    public java.math.BigDecimal getDhrCurrentDwellingNetArea() {
        return this.dhrCurrentDwellingNetArea;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
              "active &= _this.conditions['dhrCurrentDwelling.dhrCurrentDwellingKind'].test(_this.dhrCurrentDwellingKind.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwellingNumberOfRoom"
      )
    
    private java.math.BigDecimal dhrCurrentDwellingNumberOfRoom;

    public void setDhrCurrentDwellingNumberOfRoom(final java.math.BigDecimal dhrCurrentDwellingNumberOfRoom) {
        this.dhrCurrentDwellingNumberOfRoom = dhrCurrentDwellingNumberOfRoom;
    }

    
    @Column(name="dhr_current_dwelling_number_of_room"  )
      
    public java.math.BigDecimal getDhrCurrentDwellingNumberOfRoom() {
        return this.dhrCurrentDwellingNumberOfRoom;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwellingPhone"
      )
    
    private String dhrCurrentDwellingPhone;

    public void setDhrCurrentDwellingPhone(final String dhrCurrentDwellingPhone) {
        this.dhrCurrentDwellingPhone = dhrCurrentDwellingPhone;
    }

    
    @Column(name="dhr_current_dwelling_phone" , length=10 )
      
    public String getDhrCurrentDwellingPhone() {
        return this.dhrCurrentDwellingPhone;
    }
  
}
