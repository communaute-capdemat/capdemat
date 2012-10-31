
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
@Table(name="dccrr_plage_horaire")
public class DccrrPlageHoraire implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        DayCareCenterRegistrationRequest.conditions;

    public DccrrPlageHoraire() {
        super();
      
    }

    public final String modelToXmlString() {
        DccrrPlageHoraireType object = (DccrrPlageHoraireType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final DccrrPlageHoraireType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        DccrrPlageHoraireType dccrrPlageHoraire = DccrrPlageHoraireType.Factory.newInstance();
        int i = 0;
    
        localTime = this.horairePlacementMatinFin;
        if (localTime != null) {
            calendar.set(Calendar.HOUR_OF_DAY,localTime.getHourOfDay());
            calendar.set(Calendar.MINUTE,localTime.getMinuteOfHour());
            dccrrPlageHoraire.setHorairePlacementMatinFin(calendar);
        }
      
        localTime = this.horairePlacementMatinDebut;
        if (localTime != null) {
            calendar.set(Calendar.HOUR_OF_DAY,localTime.getHourOfDay());
            calendar.set(Calendar.MINUTE,localTime.getMinuteOfHour());
            dccrrPlageHoraire.setHorairePlacementMatinDebut(calendar);
        }
      
        localTime = this.horairePlacementApresMidiFin;
        if (localTime != null) {
            calendar.set(Calendar.HOUR_OF_DAY,localTime.getHourOfDay());
            calendar.set(Calendar.MINUTE,localTime.getMinuteOfHour());
            dccrrPlageHoraire.setHorairePlacementApresMidiFin(calendar);
        }
      
        localTime = this.horairePlacementApresMidiDebut;
        if (localTime != null) {
            calendar.set(Calendar.HOUR_OF_DAY,localTime.getHourOfDay());
            calendar.set(Calendar.MINUTE,localTime.getMinuteOfHour());
            dccrrPlageHoraire.setHorairePlacementApresMidiDebut(calendar);
        }
      
        return dccrrPlageHoraire;
    }

    public static DccrrPlageHoraire xmlToModel(DccrrPlageHoraireType dccrrPlageHoraireDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        DccrrPlageHoraire dccrrPlageHoraire = new DccrrPlageHoraire();
    
        calendar = dccrrPlageHoraireDoc.getHorairePlacementMatinFin();
        if (calendar != null) {
            localTime = new LocalTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
            dccrrPlageHoraire.setHorairePlacementMatinFin(localTime);
        }
      
        calendar = dccrrPlageHoraireDoc.getHorairePlacementMatinDebut();
        if (calendar != null) {
            localTime = new LocalTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
            dccrrPlageHoraire.setHorairePlacementMatinDebut(localTime);
        }
      
        calendar = dccrrPlageHoraireDoc.getHorairePlacementApresMidiFin();
        if (calendar != null) {
            localTime = new LocalTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
            dccrrPlageHoraire.setHorairePlacementApresMidiFin(localTime);
        }
      
        calendar = dccrrPlageHoraireDoc.getHorairePlacementApresMidiDebut();
        if (calendar != null) {
            localTime = new LocalTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
            dccrrPlageHoraire.setHorairePlacementApresMidiDebut(localTime);
        }
      
        return dccrrPlageHoraire;
    }

    @Override
    public DccrrPlageHoraire clone() {
        DccrrPlageHoraire result = new DccrrPlageHoraire();
        
          
            
        result.setHorairePlacementMatinFin(horairePlacementMatinFin);
      
          
        
          
            
        result.setHorairePlacementMatinDebut(horairePlacementMatinDebut);
      
          
        
          
            
        result.setHorairePlacementApresMidiFin(horairePlacementApresMidiFin);
      
          
        
          
            
        result.setHorairePlacementApresMidiDebut(horairePlacementApresMidiDebut);
      
          
        
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

  
    
    private org.joda.time.LocalTime horairePlacementMatinFin;

    public void setHorairePlacementMatinFin(final org.joda.time.LocalTime horairePlacementMatinFin) {
        this.horairePlacementMatinFin = horairePlacementMatinFin;
    }

    
    @Column(name="horaire_placement_matin_fin"  )
      
    public org.joda.time.LocalTime getHorairePlacementMatinFin() {
        return this.horairePlacementMatinFin;
    }
  
    
    private org.joda.time.LocalTime horairePlacementMatinDebut;

    public void setHorairePlacementMatinDebut(final org.joda.time.LocalTime horairePlacementMatinDebut) {
        this.horairePlacementMatinDebut = horairePlacementMatinDebut;
    }

    
    @Column(name="horaire_placement_matin_debut"  )
      
    public org.joda.time.LocalTime getHorairePlacementMatinDebut() {
        return this.horairePlacementMatinDebut;
    }
  
    
    private org.joda.time.LocalTime horairePlacementApresMidiFin;

    public void setHorairePlacementApresMidiFin(final org.joda.time.LocalTime horairePlacementApresMidiFin) {
        this.horairePlacementApresMidiFin = horairePlacementApresMidiFin;
    }

    
    @Column(name="horaire_placement_apres_midi_fin"  )
      
    public org.joda.time.LocalTime getHorairePlacementApresMidiFin() {
        return this.horairePlacementApresMidiFin;
    }
  
    
    private org.joda.time.LocalTime horairePlacementApresMidiDebut;

    public void setHorairePlacementApresMidiDebut(final org.joda.time.LocalTime horairePlacementApresMidiDebut) {
        this.horairePlacementApresMidiDebut = horairePlacementApresMidiDebut;
    }

    
    @Column(name="horaire_placement_apres_midi_debut"  )
      
    public org.joda.time.LocalTime getHorairePlacementApresMidiDebut() {
        return this.horairePlacementApresMidiDebut;
    }
  
}
