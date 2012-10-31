
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
@Table(name="dccrr_plage_horaire_mercredi")
public class DccrrPlageHoraireMercredi implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        DayCareCenterRegistrationRequest.conditions;

    public DccrrPlageHoraireMercredi() {
        super();
      
    }

    public final String modelToXmlString() {
        DccrrPlageHoraireMercrediType object = (DccrrPlageHoraireMercrediType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final DccrrPlageHoraireMercrediType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        DccrrPlageHoraireMercrediType dccrrPlageHoraireMercredi = DccrrPlageHoraireMercrediType.Factory.newInstance();
        int i = 0;
    
        localTime = this.horairePlacementMatinFinMercredi;
        if (localTime != null) {
            calendar.set(Calendar.HOUR_OF_DAY,localTime.getHourOfDay());
            calendar.set(Calendar.MINUTE,localTime.getMinuteOfHour());
            dccrrPlageHoraireMercredi.setHorairePlacementMatinFinMercredi(calendar);
        }
      
        localTime = this.horairePlacementApresMidiDebutMercredi;
        if (localTime != null) {
            calendar.set(Calendar.HOUR_OF_DAY,localTime.getHourOfDay());
            calendar.set(Calendar.MINUTE,localTime.getMinuteOfHour());
            dccrrPlageHoraireMercredi.setHorairePlacementApresMidiDebutMercredi(calendar);
        }
      
        localTime = this.horairePlacementMatinDebutMercredi;
        if (localTime != null) {
            calendar.set(Calendar.HOUR_OF_DAY,localTime.getHourOfDay());
            calendar.set(Calendar.MINUTE,localTime.getMinuteOfHour());
            dccrrPlageHoraireMercredi.setHorairePlacementMatinDebutMercredi(calendar);
        }
      
        localTime = this.horairePlacementApresMidiFinMercredi;
        if (localTime != null) {
            calendar.set(Calendar.HOUR_OF_DAY,localTime.getHourOfDay());
            calendar.set(Calendar.MINUTE,localTime.getMinuteOfHour());
            dccrrPlageHoraireMercredi.setHorairePlacementApresMidiFinMercredi(calendar);
        }
      
        return dccrrPlageHoraireMercredi;
    }

    public static DccrrPlageHoraireMercredi xmlToModel(DccrrPlageHoraireMercrediType dccrrPlageHoraireMercrediDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        DccrrPlageHoraireMercredi dccrrPlageHoraireMercredi = new DccrrPlageHoraireMercredi();
    
        calendar = dccrrPlageHoraireMercrediDoc.getHorairePlacementMatinFinMercredi();
        if (calendar != null) {
            localTime = new LocalTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
            dccrrPlageHoraireMercredi.setHorairePlacementMatinFinMercredi(localTime);
        }
      
        calendar = dccrrPlageHoraireMercrediDoc.getHorairePlacementApresMidiDebutMercredi();
        if (calendar != null) {
            localTime = new LocalTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
            dccrrPlageHoraireMercredi.setHorairePlacementApresMidiDebutMercredi(localTime);
        }
      
        calendar = dccrrPlageHoraireMercrediDoc.getHorairePlacementMatinDebutMercredi();
        if (calendar != null) {
            localTime = new LocalTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
            dccrrPlageHoraireMercredi.setHorairePlacementMatinDebutMercredi(localTime);
        }
      
        calendar = dccrrPlageHoraireMercrediDoc.getHorairePlacementApresMidiFinMercredi();
        if (calendar != null) {
            localTime = new LocalTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
            dccrrPlageHoraireMercredi.setHorairePlacementApresMidiFinMercredi(localTime);
        }
      
        return dccrrPlageHoraireMercredi;
    }

    @Override
    public DccrrPlageHoraireMercredi clone() {
        DccrrPlageHoraireMercredi result = new DccrrPlageHoraireMercredi();
        
          
            
        result.setHorairePlacementMatinFinMercredi(horairePlacementMatinFinMercredi);
      
          
        
          
            
        result.setHorairePlacementApresMidiDebutMercredi(horairePlacementApresMidiDebutMercredi);
      
          
        
          
            
        result.setHorairePlacementMatinDebutMercredi(horairePlacementMatinDebutMercredi);
      
          
        
          
            
        result.setHorairePlacementApresMidiFinMercredi(horairePlacementApresMidiFinMercredi);
      
          
        
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

  
    
    private org.joda.time.LocalTime horairePlacementMatinFinMercredi;

    public void setHorairePlacementMatinFinMercredi(final org.joda.time.LocalTime horairePlacementMatinFinMercredi) {
        this.horairePlacementMatinFinMercredi = horairePlacementMatinFinMercredi;
    }

    
    @Column(name="horaire_placement_matin_fin_mercredi"  )
      
    public org.joda.time.LocalTime getHorairePlacementMatinFinMercredi() {
        return this.horairePlacementMatinFinMercredi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementApresMidiDebutMercredi;

    public void setHorairePlacementApresMidiDebutMercredi(final org.joda.time.LocalTime horairePlacementApresMidiDebutMercredi) {
        this.horairePlacementApresMidiDebutMercredi = horairePlacementApresMidiDebutMercredi;
    }

    
    @Column(name="horaire_placement_apres_midi_debut_mercredi"  )
      
    public org.joda.time.LocalTime getHorairePlacementApresMidiDebutMercredi() {
        return this.horairePlacementApresMidiDebutMercredi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementMatinDebutMercredi;

    public void setHorairePlacementMatinDebutMercredi(final org.joda.time.LocalTime horairePlacementMatinDebutMercredi) {
        this.horairePlacementMatinDebutMercredi = horairePlacementMatinDebutMercredi;
    }

    
    @Column(name="horaire_placement_matin_debut_mercredi"  )
      
    public org.joda.time.LocalTime getHorairePlacementMatinDebutMercredi() {
        return this.horairePlacementMatinDebutMercredi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementApresMidiFinMercredi;

    public void setHorairePlacementApresMidiFinMercredi(final org.joda.time.LocalTime horairePlacementApresMidiFinMercredi) {
        this.horairePlacementApresMidiFinMercredi = horairePlacementApresMidiFinMercredi;
    }

    
    @Column(name="horaire_placement_apres_midi_fin_mercredi"  )
      
    public org.joda.time.LocalTime getHorairePlacementApresMidiFinMercredi() {
        return this.horairePlacementApresMidiFinMercredi;
    }
  
}
