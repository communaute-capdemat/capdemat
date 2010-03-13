
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
 *  table="dccrr_plage_horaire_lundi"
 *  lazy="false"
 */
public class DccrrPlageHoraireLundi implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public DccrrPlageHoraireLundi() {
        super();
      
    }

    public final String modelToXmlString() {
        DccrrPlageHoraireLundiType object = (DccrrPlageHoraireLundiType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final DccrrPlageHoraireLundiType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        DccrrPlageHoraireLundiType dccrrPlageHoraireLundi = DccrrPlageHoraireLundiType.Factory.newInstance();
        int i = 0;
    
        localTime = this.horairePlacementApresMidiDebutLundi;
        if (localTime != null) {
            calendar.set(Calendar.HOUR_OF_DAY,localTime.getHourOfDay());
            calendar.set(Calendar.MINUTE,localTime.getMinuteOfHour());
            dccrrPlageHoraireLundi.setHorairePlacementApresMidiDebutLundi(calendar);
        }
      
        localTime = this.horairePlacementApresMidiFinLundi;
        if (localTime != null) {
            calendar.set(Calendar.HOUR_OF_DAY,localTime.getHourOfDay());
            calendar.set(Calendar.MINUTE,localTime.getMinuteOfHour());
            dccrrPlageHoraireLundi.setHorairePlacementApresMidiFinLundi(calendar);
        }
      
        localTime = this.horairePlacementMatinFinLundi;
        if (localTime != null) {
            calendar.set(Calendar.HOUR_OF_DAY,localTime.getHourOfDay());
            calendar.set(Calendar.MINUTE,localTime.getMinuteOfHour());
            dccrrPlageHoraireLundi.setHorairePlacementMatinFinLundi(calendar);
        }
      
        localTime = this.horairePlacementMatinDebutLundi;
        if (localTime != null) {
            calendar.set(Calendar.HOUR_OF_DAY,localTime.getHourOfDay());
            calendar.set(Calendar.MINUTE,localTime.getMinuteOfHour());
            dccrrPlageHoraireLundi.setHorairePlacementMatinDebutLundi(calendar);
        }
      
        return dccrrPlageHoraireLundi;
    }

    public static DccrrPlageHoraireLundi xmlToModel(DccrrPlageHoraireLundiType dccrrPlageHoraireLundiDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        DccrrPlageHoraireLundi dccrrPlageHoraireLundi = new DccrrPlageHoraireLundi();
    
        calendar = dccrrPlageHoraireLundiDoc.getHorairePlacementApresMidiDebutLundi();
        if (calendar != null) {
            localTime = new LocalTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
            dccrrPlageHoraireLundi.setHorairePlacementApresMidiDebutLundi(localTime);
        }
      
        calendar = dccrrPlageHoraireLundiDoc.getHorairePlacementApresMidiFinLundi();
        if (calendar != null) {
            localTime = new LocalTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
            dccrrPlageHoraireLundi.setHorairePlacementApresMidiFinLundi(localTime);
        }
      
        calendar = dccrrPlageHoraireLundiDoc.getHorairePlacementMatinFinLundi();
        if (calendar != null) {
            localTime = new LocalTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
            dccrrPlageHoraireLundi.setHorairePlacementMatinFinLundi(localTime);
        }
      
        calendar = dccrrPlageHoraireLundiDoc.getHorairePlacementMatinDebutLundi();
        if (calendar != null) {
            localTime = new LocalTime(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
            dccrrPlageHoraireLundi.setHorairePlacementMatinDebutLundi(localTime);
        }
      
        return dccrrPlageHoraireLundi;
    }

    @Override
    public DccrrPlageHoraireLundi clone() {
        DccrrPlageHoraireLundi result = new DccrrPlageHoraireLundi();
        
          
            
        result.setHorairePlacementApresMidiDebutLundi(horairePlacementApresMidiDebutLundi);
      
          
        
          
            
        result.setHorairePlacementApresMidiFinLundi(horairePlacementApresMidiFinLundi);
      
          
        
          
            
        result.setHorairePlacementMatinFinLundi(horairePlacementMatinFinLundi);
      
          
        
          
            
        result.setHorairePlacementMatinDebutLundi(horairePlacementMatinDebutLundi);
      
          
        
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

  
    
    private org.joda.time.LocalTime horairePlacementApresMidiDebutLundi;

    public final void setHorairePlacementApresMidiDebutLundi(final org.joda.time.LocalTime horairePlacementApresMidiDebutLundi) {
        this.horairePlacementApresMidiDebutLundi = horairePlacementApresMidiDebutLundi;
    }

    /**
  
        * @hibernate.property
        *  column="horaire_placement_apres_midi_debut_lundi"
        *  type="serializable"
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementApresMidiDebutLundi() {
        return this.horairePlacementApresMidiDebutLundi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementApresMidiFinLundi;

    public final void setHorairePlacementApresMidiFinLundi(final org.joda.time.LocalTime horairePlacementApresMidiFinLundi) {
        this.horairePlacementApresMidiFinLundi = horairePlacementApresMidiFinLundi;
    }

    /**
  
        * @hibernate.property
        *  column="horaire_placement_apres_midi_fin_lundi"
        *  type="serializable"
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementApresMidiFinLundi() {
        return this.horairePlacementApresMidiFinLundi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementMatinFinLundi;

    public final void setHorairePlacementMatinFinLundi(final org.joda.time.LocalTime horairePlacementMatinFinLundi) {
        this.horairePlacementMatinFinLundi = horairePlacementMatinFinLundi;
    }

    /**
  
        * @hibernate.property
        *  column="horaire_placement_matin_fin_lundi"
        *  type="serializable"
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementMatinFinLundi() {
        return this.horairePlacementMatinFinLundi;
    }
  
    
    private org.joda.time.LocalTime horairePlacementMatinDebutLundi;

    public final void setHorairePlacementMatinDebutLundi(final org.joda.time.LocalTime horairePlacementMatinDebutLundi) {
        this.horairePlacementMatinDebutLundi = horairePlacementMatinDebutLundi;
    }

    /**
  
        * @hibernate.property
        *  column="horaire_placement_matin_debut_lundi"
        *  type="serializable"
        
      
    */
    public final org.joda.time.LocalTime getHorairePlacementMatinDebutLundi() {
        return this.horairePlacementMatinDebutLundi;
    }
  
}
