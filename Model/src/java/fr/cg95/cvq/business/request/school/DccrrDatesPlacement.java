
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
 *  table="dccrr_dates_placement"
 *  lazy="false"
 */
public class DccrrDatesPlacement implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public DccrrDatesPlacement() {
        super();
      
    }

    public final String modelToXmlString() {
        DccrrDatesPlacementType object = (DccrrDatesPlacementType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final DccrrDatesPlacementType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        DccrrDatesPlacementType dccrrDatesPlacement = DccrrDatesPlacementType.Factory.newInstance();
        int i = 0;
    
        date = this.datePlacementFin;
        if (date != null) {
            calendar.setTime(date);
            dccrrDatesPlacement.setDatePlacementFin(calendar);
        }
      
        if (this.choixTypeDatePlacementAccueilRegulier != null)
            dccrrDatesPlacement.setChoixTypeDatePlacementAccueilRegulier(fr.cg95.cvq.xml.request.school.ChoixDatePlacement.Enum.forString(this.choixTypeDatePlacementAccueilRegulier.toString()));
      
        date = this.datePlacementDebut;
        if (date != null) {
            calendar.setTime(date);
            dccrrDatesPlacement.setDatePlacementDebut(calendar);
        }
      
        return dccrrDatesPlacement;
    }

    public static DccrrDatesPlacement xmlToModel(DccrrDatesPlacementType dccrrDatesPlacementDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        DccrrDatesPlacement dccrrDatesPlacement = new DccrrDatesPlacement();
    
        calendar = dccrrDatesPlacementDoc.getDatePlacementFin();
        if (calendar != null) {
            dccrrDatesPlacement.setDatePlacementFin(calendar.getTime());
        }
      
        if (dccrrDatesPlacementDoc.getChoixTypeDatePlacementAccueilRegulier() != null)
            dccrrDatesPlacement.setChoixTypeDatePlacementAccueilRegulier(fr.cg95.cvq.business.request.school.ChoixDatePlacement.forString(dccrrDatesPlacementDoc.getChoixTypeDatePlacementAccueilRegulier().toString()));
        else
            dccrrDatesPlacement.setChoixTypeDatePlacementAccueilRegulier(fr.cg95.cvq.business.request.school.ChoixDatePlacement.getDefaultChoixDatePlacement());
      
        calendar = dccrrDatesPlacementDoc.getDatePlacementDebut();
        if (calendar != null) {
            dccrrDatesPlacement.setDatePlacementDebut(calendar.getTime());
        }
      
        return dccrrDatesPlacement;
    }

    @Override
    public DccrrDatesPlacement clone() {
        DccrrDatesPlacement result = new DccrrDatesPlacement();
        
          
            
        result.setDatePlacementFin(datePlacementFin);
      
          
        
          
            
        if (choixTypeDatePlacementAccueilRegulier != null)
            result.setChoixTypeDatePlacementAccueilRegulier(choixTypeDatePlacementAccueilRegulier);
        else
            result.setChoixTypeDatePlacementAccueilRegulier(fr.cg95.cvq.business.request.school.ChoixDatePlacement.getDefaultChoixDatePlacement());
      
          
        
          
            
        result.setDatePlacementDebut(datePlacementDebut);
      
          
        
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

  
    
    private java.util.Date datePlacementFin;

    public final void setDatePlacementFin(final java.util.Date datePlacementFin) {
        this.datePlacementFin = datePlacementFin;
    }

    /**
  
        * @hibernate.property
        *  column="date_placement_fin"
        
      
    */
    public final java.util.Date getDatePlacementFin() {
        return this.datePlacementFin;
    }
  
    
      @NotNull(
        
        
        profiles = {"accueil"},
        message = "choixTypeDatePlacementAccueilRegulier"
      )
    
    private fr.cg95.cvq.business.request.school.ChoixDatePlacement choixTypeDatePlacementAccueilRegulier;

    public final void setChoixTypeDatePlacementAccueilRegulier(final fr.cg95.cvq.business.request.school.ChoixDatePlacement choixTypeDatePlacementAccueilRegulier) {
        this.choixTypeDatePlacementAccueilRegulier = choixTypeDatePlacementAccueilRegulier;
    }

    /**
  
        * @hibernate.property
        *  column="choix_type_date_placement_accueil_regulier"
        
      
    */
    public final fr.cg95.cvq.business.request.school.ChoixDatePlacement getChoixTypeDatePlacementAccueilRegulier() {
        return this.choixTypeDatePlacementAccueilRegulier;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dccrrDatesPlacement.choixTypeDatePlacementAccueilRegulier'].test(_this.choixTypeDatePlacementAccueilRegulier.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"accueil"},
        message = "datePlacementDebut"
      )
    
    private java.util.Date datePlacementDebut;

    public final void setDatePlacementDebut(final java.util.Date datePlacementDebut) {
        this.datePlacementDebut = datePlacementDebut;
    }

    /**
  
        * @hibernate.property
        *  column="date_placement_debut"
        
      
    */
    public final java.util.Date getDatePlacementDebut() {
        return this.datePlacementDebut;
    }
  
}
