
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
@Table(name="mar_situation_professionnelle_demandeur_emploi")
public class MarSituationProfessionnelleDemandeurEmploi implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        MdphAdultRequest.conditions;

    public MarSituationProfessionnelleDemandeurEmploi() {
        super();
      
    }

    public final String modelToXmlString() {
        MarSituationProfessionnelleDemandeurEmploiType object = (MarSituationProfessionnelleDemandeurEmploiType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MarSituationProfessionnelleDemandeurEmploiType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MarSituationProfessionnelleDemandeurEmploiType marSituationProfessionnelleDemandeurEmploi = MarSituationProfessionnelleDemandeurEmploiType.Factory.newInstance();
        int i = 0;
    
        if (this.allocationSolidariteSpecifique != null)
            marSituationProfessionnelleDemandeurEmploi.setAllocationSolidariteSpecifique(this.allocationSolidariteSpecifique.booleanValue());
      
        date = this.demandeurEmploiDepuisLe;
        if (date != null) {
            calendar.setTime(date);
            marSituationProfessionnelleDemandeurEmploi.setDemandeurEmploiDepuisLe(calendar);
        }
      
        date = this.indemnisationDepuisLe;
        if (date != null) {
            calendar.setTime(date);
            marSituationProfessionnelleDemandeurEmploi.setIndemnisationDepuisLe(calendar);
        }
      
        return marSituationProfessionnelleDemandeurEmploi;
    }

    public static MarSituationProfessionnelleDemandeurEmploi xmlToModel(MarSituationProfessionnelleDemandeurEmploiType marSituationProfessionnelleDemandeurEmploiDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MarSituationProfessionnelleDemandeurEmploi marSituationProfessionnelleDemandeurEmploi = new MarSituationProfessionnelleDemandeurEmploi();
    
        marSituationProfessionnelleDemandeurEmploi.setAllocationSolidariteSpecifique(Boolean.valueOf(marSituationProfessionnelleDemandeurEmploiDoc.getAllocationSolidariteSpecifique()));
      
        calendar = marSituationProfessionnelleDemandeurEmploiDoc.getDemandeurEmploiDepuisLe();
        if (calendar != null) {
            marSituationProfessionnelleDemandeurEmploi.setDemandeurEmploiDepuisLe(calendar.getTime());
        }
      
        calendar = marSituationProfessionnelleDemandeurEmploiDoc.getIndemnisationDepuisLe();
        if (calendar != null) {
            marSituationProfessionnelleDemandeurEmploi.setIndemnisationDepuisLe(calendar.getTime());
        }
      
        return marSituationProfessionnelleDemandeurEmploi;
    }

    @Override
    public MarSituationProfessionnelleDemandeurEmploi clone() {
        MarSituationProfessionnelleDemandeurEmploi result = new MarSituationProfessionnelleDemandeurEmploi();
        
          
            
        result.setAllocationSolidariteSpecifique(allocationSolidariteSpecifique);
      
          
        
          
            
        result.setDemandeurEmploiDepuisLe(demandeurEmploiDepuisLe);
      
          
        
          
            
        result.setIndemnisationDepuisLe(indemnisationDepuisLe);
      
          
        
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
        
        
        profiles = {"situationProfessionnelle"},
        message = "allocationSolidariteSpecifique"
      )
    
    private Boolean allocationSolidariteSpecifique;

    public void setAllocationSolidariteSpecifique(final Boolean allocationSolidariteSpecifique) {
        this.allocationSolidariteSpecifique = allocationSolidariteSpecifique;
    }

    
    @Column(name="allocation_solidarite_specifique"  )
      
    public Boolean getAllocationSolidariteSpecifique() {
        return this.allocationSolidariteSpecifique;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "demandeurEmploiDepuisLe"
      )
    
    private java.util.Date demandeurEmploiDepuisLe;

    public void setDemandeurEmploiDepuisLe(final java.util.Date demandeurEmploiDepuisLe) {
        this.demandeurEmploiDepuisLe = demandeurEmploiDepuisLe;
    }

    
    @Column(name="demandeur_emploi_depuis_le"  )
      
    public java.util.Date getDemandeurEmploiDepuisLe() {
        return this.demandeurEmploiDepuisLe;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "indemnisationDepuisLe"
      )
    
    private java.util.Date indemnisationDepuisLe;

    public void setIndemnisationDepuisLe(final java.util.Date indemnisationDepuisLe) {
        this.indemnisationDepuisLe = indemnisationDepuisLe;
    }

    
    @Column(name="indemnisation_depuis_le"  )
      
    public java.util.Date getIndemnisationDepuisLe() {
        return this.indemnisationDepuisLe;
    }
  
}
