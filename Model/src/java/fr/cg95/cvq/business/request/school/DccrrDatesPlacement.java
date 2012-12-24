
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
@Table(name="dccrr_dates_placement")
public class DccrrDatesPlacement implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        DayCareCenterRegistrationRequest.conditions;

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
    
        if (this.choixTypeDatePlacementAccueilRegulier != null)
            dccrrDatesPlacement.setChoixTypeDatePlacementAccueilRegulier(fr.cg95.cvq.xml.request.school.ChoixDatePlacement.Enum.forString(this.choixTypeDatePlacementAccueilRegulier.getLegacyLabel()));
      
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

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    public final Long getId() {
        return this.id;
    }

  
    
      @NotNull(
        
        
        profiles = {"accueil"},
        message = "choixTypeDatePlacementAccueilRegulier"
      )
    
    private fr.cg95.cvq.business.request.school.ChoixDatePlacement choixTypeDatePlacementAccueilRegulier;

    public void setChoixTypeDatePlacementAccueilRegulier(final fr.cg95.cvq.business.request.school.ChoixDatePlacement choixTypeDatePlacementAccueilRegulier) {
        this.choixTypeDatePlacementAccueilRegulier = choixTypeDatePlacementAccueilRegulier;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="choix_type_date_placement_accueil_regulier"  )
      
    public fr.cg95.cvq.business.request.school.ChoixDatePlacement getChoixTypeDatePlacementAccueilRegulier() {
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

    public void setDatePlacementDebut(final java.util.Date datePlacementDebut) {
        this.datePlacementDebut = datePlacementDebut;
    }

    
    @Column(name="date_placement_debut"  )
      
    public java.util.Date getDatePlacementDebut() {
        return this.datePlacementDebut;
    }
  
}
