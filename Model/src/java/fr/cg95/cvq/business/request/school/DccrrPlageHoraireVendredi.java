
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

/**
 * Generated class file, do not edit !
 *
 * @hibernate.class
 *  table="dccrr_plage_horaire_vendredi"
 *  lazy="false"
 */
public class DccrrPlageHoraireVendredi implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public DccrrPlageHoraireVendredi() {
        super();
      
    }

    public final String modelToXmlString() {
        DccrrPlageHoraireVendrediType object = (DccrrPlageHoraireVendrediType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final DccrrPlageHoraireVendrediType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        DccrrPlageHoraireVendrediType dccrrPlageHoraireVendredi = DccrrPlageHoraireVendrediType.Factory.newInstance();
        int i = 0;
    
        localTime = this.horairePlacementApresMidiFinVendredi;
        if (localTime != null) {
            calendar.set(Calendar.HOUR_OF_DAY,localTime.getHourOfDay());
            calendar.set(Calendar.MINUTE,localTime.getMinuteOfHour());
            dccrrPlageHoraireVendredi.setHorairePlacementApresMidiFinVendredi(calendar);
        }
      
        localTime = this.horairePlacementMatinFinVendredi;
        if (localTime != null) {
            calendar.set(Calendar.HOUR_OF_DAY,localTime.getHourOfDay());
            calendar.set(Calendar.MINUTE,localTime.getMinuteOfHour());
            dccrrPlageHoraireVendredi.setHorairePlacementMatinFinVendredi(calendar);
        }
      
        localTime = this.horairePlacementApresMidiDebutVendredi;
        if (localTime != null) {
            calendar.set(Calendar.HOUR_OF_DAY,localTime.getHourOfDay());
            calendar.set(Calendar.MINUTE,localTime.getMinuteOfHour());
            dccrrPlageHoraireVendredi.setHorairePlacementApresMidiDebutVendredi(calendar);
        }
      
        localTime = this.horairePlacementMatinDebutVendredi;
        if (localTime != null) {
            calendar.set(Calendar.HOUR_OF_DAY,localTime.getHourOfDay());
            calendar.set(Calendar.MINUTE,localTime.getMinuteOfHour());
            dccrrPlageHoraireVendredi.setHorairePlacementMatinDebutVendredi(calendar);
        }
      
        return dccrrPlageHoraireVendredi;
    }

    public static DccrrPlageHoraireVendredi xmlToModel(DccrrPlageHoraireVendrediType dccrrPlageHoraireVendrediDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        DccrrPlageHoraireVendredi dccrrPlageHoraireVendredi = new DccrrPlageHoraireVendredi();
    
        calendar = dccrrPlageHoraireVendrediDoc.getHorairePlacementApresMidiFinVendredi();
        if (calendar != null) {
            localTime = new LocalTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
            dccrrPlageHoraireVendredi.setHorairePlacementApresMidiFinVendredi(localTime);
        }
      
        calendar = dccrrPlageHoraireVendrediDoc.getHorairePlacementMatinFinVendredi();
        if (calendar != null) {
            localTime = new LocalTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
            dccrrPlageHoraireVendredi.setHorairePlacementMatinFinVendredi(localTime);
        }
      
        calendar = dccrrPlageHoraireVendrediDoc.getHorairePlacementApresMidiDebutVendredi();
        if (calendar != null) {
            localTime = new LocalTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
            dccrrPlageHoraireVendredi.setHorairePlacementApresMidiDebutVendredi(localTime);
        }
      
        calendar = dccrrPlageHoraireVendrediDoc.getHorairePlacementMatinDebutVendredi();
        if (calendar != null) {
            localTime = new LocalTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
            dccrrPlageHoraireVendredi.setHorairePlacementMatinDebutVendredi(localTime);
        }
      
        return dccrrPlageHoraireVendredi;
    }

    @Override
    public DccrrPlageHoraireVendredi clone() {
        DccrrPlageHoraireVendredi result = new DccrrPlageHoraireVendredi();
        
          
            
        result.setHorairePlacementApresMidiFinVendredi(horairePlacementApresMidiFinVendredi);
      
          
        
          
            
        result.setHorairePlacementMatinFinVendredi(horairePlacementMatinFinVendredi);
      
          
        
          
            
        result.setHorairePlacementApresMidiDebutVendredi(horairePlacementApresMidiDebutVendredi);
      
          
        
          
            
        result.setHorairePlacementMatinDebutVendredi(horairePlacementMatinDebutVendredi);
      
          
        
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

  
    
    private org.joda.time.LocalTime horairePlacementApresMidiFinVendredi;

    public final void setHorairePlacementApresMidiFinVendredi(final org.joda.time.LocalTime horairePlacementApresMidiFinVendredi) {
        this.horairePlacementApresMidiFinVendredi = horairePlacementApresMidiFinVendredi;
    }

    /**
  
        * @hibernate.property
        *  column="horaire_placement_apres_midi_fin_vendredi"
        *  type="serializable"
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementApresMidiFinVendredi() {
        return this.horairePlacementApresMidiFinVendredi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementMatinFinVendredi;

    public final void setHorairePlacementMatinFinVendredi(final org.joda.time.LocalTime horairePlacementMatinFinVendredi) {
        this.horairePlacementMatinFinVendredi = horairePlacementMatinFinVendredi;
    }

    /**
  
        * @hibernate.property
        *  column="horaire_placement_matin_fin_vendredi"
        *  type="serializable"
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementMatinFinVendredi() {
        return this.horairePlacementMatinFinVendredi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementApresMidiDebutVendredi;

    public final void setHorairePlacementApresMidiDebutVendredi(final org.joda.time.LocalTime horairePlacementApresMidiDebutVendredi) {
        this.horairePlacementApresMidiDebutVendredi = horairePlacementApresMidiDebutVendredi;
    }

    /**
  
        * @hibernate.property
        *  column="horaire_placement_apres_midi_debut_vendredi"
        *  type="serializable"
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementApresMidiDebutVendredi() {
        return this.horairePlacementApresMidiDebutVendredi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementMatinDebutVendredi;

    public final void setHorairePlacementMatinDebutVendredi(final org.joda.time.LocalTime horairePlacementMatinDebutVendredi) {
        this.horairePlacementMatinDebutVendredi = horairePlacementMatinDebutVendredi;
    }

    /**
  
        * @hibernate.property
        *  column="horaire_placement_matin_debut_vendredi"
        *  type="serializable"
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementMatinDebutVendredi() {
        return this.horairePlacementMatinDebutVendredi;
    }
  
}
