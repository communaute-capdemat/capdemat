
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
@Table(name="dccrr_plage_horaire_jeudi")
public class DccrrPlageHoraireJeudi implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        DayCareCenterRegistrationRequest.conditions;

    public DccrrPlageHoraireJeudi() {
        super();
      
    }

    public final String modelToXmlString() {
        DccrrPlageHoraireJeudiType object = (DccrrPlageHoraireJeudiType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final DccrrPlageHoraireJeudiType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        DccrrPlageHoraireJeudiType dccrrPlageHoraireJeudi = DccrrPlageHoraireJeudiType.Factory.newInstance();
        int i = 0;
    
        localTime = this.horairePlacementMatinFinJeudi;
        if (localTime != null) {
            calendar.set(Calendar.HOUR_OF_DAY,localTime.getHourOfDay());
            calendar.set(Calendar.MINUTE,localTime.getMinuteOfHour());
            dccrrPlageHoraireJeudi.setHorairePlacementMatinFinJeudi(calendar);
        }
      
        localTime = this.horairePlacementApresMidiFinJeudi;
        if (localTime != null) {
            calendar.set(Calendar.HOUR_OF_DAY,localTime.getHourOfDay());
            calendar.set(Calendar.MINUTE,localTime.getMinuteOfHour());
            dccrrPlageHoraireJeudi.setHorairePlacementApresMidiFinJeudi(calendar);
        }
      
        localTime = this.horairePlacementApresMidiDebutJeudi;
        if (localTime != null) {
            calendar.set(Calendar.HOUR_OF_DAY,localTime.getHourOfDay());
            calendar.set(Calendar.MINUTE,localTime.getMinuteOfHour());
            dccrrPlageHoraireJeudi.setHorairePlacementApresMidiDebutJeudi(calendar);
        }
      
        localTime = this.horairePlacementMatinDebutJeudi;
        if (localTime != null) {
            calendar.set(Calendar.HOUR_OF_DAY,localTime.getHourOfDay());
            calendar.set(Calendar.MINUTE,localTime.getMinuteOfHour());
            dccrrPlageHoraireJeudi.setHorairePlacementMatinDebutJeudi(calendar);
        }
      
        return dccrrPlageHoraireJeudi;
    }

    public static DccrrPlageHoraireJeudi xmlToModel(DccrrPlageHoraireJeudiType dccrrPlageHoraireJeudiDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        DccrrPlageHoraireJeudi dccrrPlageHoraireJeudi = new DccrrPlageHoraireJeudi();
    
        calendar = dccrrPlageHoraireJeudiDoc.getHorairePlacementMatinFinJeudi();
        if (calendar != null) {
            localTime = new LocalTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
            dccrrPlageHoraireJeudi.setHorairePlacementMatinFinJeudi(localTime);
        }
      
        calendar = dccrrPlageHoraireJeudiDoc.getHorairePlacementApresMidiFinJeudi();
        if (calendar != null) {
            localTime = new LocalTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
            dccrrPlageHoraireJeudi.setHorairePlacementApresMidiFinJeudi(localTime);
        }
      
        calendar = dccrrPlageHoraireJeudiDoc.getHorairePlacementApresMidiDebutJeudi();
        if (calendar != null) {
            localTime = new LocalTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
            dccrrPlageHoraireJeudi.setHorairePlacementApresMidiDebutJeudi(localTime);
        }
      
        calendar = dccrrPlageHoraireJeudiDoc.getHorairePlacementMatinDebutJeudi();
        if (calendar != null) {
            localTime = new LocalTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
            dccrrPlageHoraireJeudi.setHorairePlacementMatinDebutJeudi(localTime);
        }
      
        return dccrrPlageHoraireJeudi;
    }

    @Override
    public DccrrPlageHoraireJeudi clone() {
        DccrrPlageHoraireJeudi result = new DccrrPlageHoraireJeudi();
        
          
            
        result.setHorairePlacementMatinFinJeudi(horairePlacementMatinFinJeudi);
      
          
        
          
            
        result.setHorairePlacementApresMidiFinJeudi(horairePlacementApresMidiFinJeudi);
      
          
        
          
            
        result.setHorairePlacementApresMidiDebutJeudi(horairePlacementApresMidiDebutJeudi);
      
          
        
          
            
        result.setHorairePlacementMatinDebutJeudi(horairePlacementMatinDebutJeudi);
      
          
        
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

  
    
    private org.joda.time.LocalTime horairePlacementMatinFinJeudi;

    public void setHorairePlacementMatinFinJeudi(final org.joda.time.LocalTime horairePlacementMatinFinJeudi) {
        this.horairePlacementMatinFinJeudi = horairePlacementMatinFinJeudi;
    }

    
    @Column(name="horaire_placement_matin_fin_jeudi"  )
      
    public org.joda.time.LocalTime getHorairePlacementMatinFinJeudi() {
        return this.horairePlacementMatinFinJeudi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementApresMidiFinJeudi;

    public void setHorairePlacementApresMidiFinJeudi(final org.joda.time.LocalTime horairePlacementApresMidiFinJeudi) {
        this.horairePlacementApresMidiFinJeudi = horairePlacementApresMidiFinJeudi;
    }

    
    @Column(name="horaire_placement_apres_midi_fin_jeudi"  )
      
    public org.joda.time.LocalTime getHorairePlacementApresMidiFinJeudi() {
        return this.horairePlacementApresMidiFinJeudi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementApresMidiDebutJeudi;

    public void setHorairePlacementApresMidiDebutJeudi(final org.joda.time.LocalTime horairePlacementApresMidiDebutJeudi) {
        this.horairePlacementApresMidiDebutJeudi = horairePlacementApresMidiDebutJeudi;
    }

    
    @Column(name="horaire_placement_apres_midi_debut_jeudi"  )
      
    public org.joda.time.LocalTime getHorairePlacementApresMidiDebutJeudi() {
        return this.horairePlacementApresMidiDebutJeudi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementMatinDebutJeudi;

    public void setHorairePlacementMatinDebutJeudi(final org.joda.time.LocalTime horairePlacementMatinDebutJeudi) {
        this.horairePlacementMatinDebutJeudi = horairePlacementMatinDebutJeudi;
    }

    
    @Column(name="horaire_placement_matin_debut_jeudi"  )
      
    public org.joda.time.LocalTime getHorairePlacementMatinDebutJeudi() {
        return this.horairePlacementMatinDebutJeudi;
    }
  
}
