
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
@Table(name="dccrr_plage_horaire_mardi")
public class DccrrPlageHoraireMardi implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        DayCareCenterRegistrationRequest.conditions;

    public DccrrPlageHoraireMardi() {
        super();
      
    }

    public final String modelToXmlString() {
        DccrrPlageHoraireMardiType object = (DccrrPlageHoraireMardiType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final DccrrPlageHoraireMardiType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        DccrrPlageHoraireMardiType dccrrPlageHoraireMardi = DccrrPlageHoraireMardiType.Factory.newInstance();
        int i = 0;
    
        localTime = this.horairePlacementApresMidiFinMardi;
        if (localTime != null) {
            calendar.set(Calendar.HOUR_OF_DAY,localTime.getHourOfDay());
            calendar.set(Calendar.MINUTE,localTime.getMinuteOfHour());
            dccrrPlageHoraireMardi.setHorairePlacementApresMidiFinMardi(calendar);
        }
      
        localTime = this.horairePlacementApresMidiDebutMardi;
        if (localTime != null) {
            calendar.set(Calendar.HOUR_OF_DAY,localTime.getHourOfDay());
            calendar.set(Calendar.MINUTE,localTime.getMinuteOfHour());
            dccrrPlageHoraireMardi.setHorairePlacementApresMidiDebutMardi(calendar);
        }
      
        localTime = this.horairePlacementMatinFinMardi;
        if (localTime != null) {
            calendar.set(Calendar.HOUR_OF_DAY,localTime.getHourOfDay());
            calendar.set(Calendar.MINUTE,localTime.getMinuteOfHour());
            dccrrPlageHoraireMardi.setHorairePlacementMatinFinMardi(calendar);
        }
      
        localTime = this.horairePlacementMatinDebutMardi;
        if (localTime != null) {
            calendar.set(Calendar.HOUR_OF_DAY,localTime.getHourOfDay());
            calendar.set(Calendar.MINUTE,localTime.getMinuteOfHour());
            dccrrPlageHoraireMardi.setHorairePlacementMatinDebutMardi(calendar);
        }
      
        return dccrrPlageHoraireMardi;
    }

    public static DccrrPlageHoraireMardi xmlToModel(DccrrPlageHoraireMardiType dccrrPlageHoraireMardiDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        DccrrPlageHoraireMardi dccrrPlageHoraireMardi = new DccrrPlageHoraireMardi();
    
        calendar = dccrrPlageHoraireMardiDoc.getHorairePlacementApresMidiFinMardi();
        if (calendar != null) {
            localTime = new LocalTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
            dccrrPlageHoraireMardi.setHorairePlacementApresMidiFinMardi(localTime);
        }
      
        calendar = dccrrPlageHoraireMardiDoc.getHorairePlacementApresMidiDebutMardi();
        if (calendar != null) {
            localTime = new LocalTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
            dccrrPlageHoraireMardi.setHorairePlacementApresMidiDebutMardi(localTime);
        }
      
        calendar = dccrrPlageHoraireMardiDoc.getHorairePlacementMatinFinMardi();
        if (calendar != null) {
            localTime = new LocalTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
            dccrrPlageHoraireMardi.setHorairePlacementMatinFinMardi(localTime);
        }
      
        calendar = dccrrPlageHoraireMardiDoc.getHorairePlacementMatinDebutMardi();
        if (calendar != null) {
            localTime = new LocalTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
            dccrrPlageHoraireMardi.setHorairePlacementMatinDebutMardi(localTime);
        }
      
        return dccrrPlageHoraireMardi;
    }

    @Override
    public DccrrPlageHoraireMardi clone() {
        DccrrPlageHoraireMardi result = new DccrrPlageHoraireMardi();
        
          
            
        result.setHorairePlacementApresMidiFinMardi(horairePlacementApresMidiFinMardi);
      
          
        
          
            
        result.setHorairePlacementApresMidiDebutMardi(horairePlacementApresMidiDebutMardi);
      
          
        
          
            
        result.setHorairePlacementMatinFinMardi(horairePlacementMatinFinMardi);
      
          
        
          
            
        result.setHorairePlacementMatinDebutMardi(horairePlacementMatinDebutMardi);
      
          
        
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

  
    
    private org.joda.time.LocalTime horairePlacementApresMidiFinMardi;

    public void setHorairePlacementApresMidiFinMardi(final org.joda.time.LocalTime horairePlacementApresMidiFinMardi) {
        this.horairePlacementApresMidiFinMardi = horairePlacementApresMidiFinMardi;
    }

    
    @Column(name="horaire_placement_apres_midi_fin_mardi"  )
      
    public org.joda.time.LocalTime getHorairePlacementApresMidiFinMardi() {
        return this.horairePlacementApresMidiFinMardi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementApresMidiDebutMardi;

    public void setHorairePlacementApresMidiDebutMardi(final org.joda.time.LocalTime horairePlacementApresMidiDebutMardi) {
        this.horairePlacementApresMidiDebutMardi = horairePlacementApresMidiDebutMardi;
    }

    
    @Column(name="horaire_placement_apres_midi_debut_mardi"  )
      
    public org.joda.time.LocalTime getHorairePlacementApresMidiDebutMardi() {
        return this.horairePlacementApresMidiDebutMardi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementMatinFinMardi;

    public void setHorairePlacementMatinFinMardi(final org.joda.time.LocalTime horairePlacementMatinFinMardi) {
        this.horairePlacementMatinFinMardi = horairePlacementMatinFinMardi;
    }

    
    @Column(name="horaire_placement_matin_fin_mardi"  )
      
    public org.joda.time.LocalTime getHorairePlacementMatinFinMardi() {
        return this.horairePlacementMatinFinMardi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementMatinDebutMardi;

    public void setHorairePlacementMatinDebutMardi(final org.joda.time.LocalTime horairePlacementMatinDebutMardi) {
        this.horairePlacementMatinDebutMardi = horairePlacementMatinDebutMardi;
    }

    
    @Column(name="horaire_placement_matin_debut_mardi"  )
      
    public org.joda.time.LocalTime getHorairePlacementMatinDebutMardi() {
        return this.horairePlacementMatinDebutMardi;
    }
  
}
