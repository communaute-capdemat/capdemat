
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
@Table(name="myr_situation_professionnelle_demandeur_emploi")
public class MyrSituationProfessionnelleDemandeurEmploi implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        MdphYouthRequest.conditions;

    public MyrSituationProfessionnelleDemandeurEmploi() {
        super();
      
    }

    public final String modelToXmlString() {
        MyrSituationProfessionnelleDemandeurEmploiType object = (MyrSituationProfessionnelleDemandeurEmploiType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MyrSituationProfessionnelleDemandeurEmploiType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MyrSituationProfessionnelleDemandeurEmploiType myrSituationProfessionnelleDemandeurEmploi = MyrSituationProfessionnelleDemandeurEmploiType.Factory.newInstance();
        int i = 0;
    
        if (this.allocationSolidariteSpecifique != null)
            myrSituationProfessionnelleDemandeurEmploi.setAllocationSolidariteSpecifique(this.allocationSolidariteSpecifique.booleanValue());
      
        date = this.demandeurEmploiDepuisLe;
        if (date != null) {
            calendar.setTime(date);
            myrSituationProfessionnelleDemandeurEmploi.setDemandeurEmploiDepuisLe(calendar);
        }
      
        date = this.indemnisationDepuisLe;
        if (date != null) {
            calendar.setTime(date);
            myrSituationProfessionnelleDemandeurEmploi.setIndemnisationDepuisLe(calendar);
        }
      
        return myrSituationProfessionnelleDemandeurEmploi;
    }

    public static MyrSituationProfessionnelleDemandeurEmploi xmlToModel(MyrSituationProfessionnelleDemandeurEmploiType myrSituationProfessionnelleDemandeurEmploiDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MyrSituationProfessionnelleDemandeurEmploi myrSituationProfessionnelleDemandeurEmploi = new MyrSituationProfessionnelleDemandeurEmploi();
    
        myrSituationProfessionnelleDemandeurEmploi.setAllocationSolidariteSpecifique(Boolean.valueOf(myrSituationProfessionnelleDemandeurEmploiDoc.getAllocationSolidariteSpecifique()));
      
        calendar = myrSituationProfessionnelleDemandeurEmploiDoc.getDemandeurEmploiDepuisLe();
        if (calendar != null) {
            myrSituationProfessionnelleDemandeurEmploi.setDemandeurEmploiDepuisLe(calendar.getTime());
        }
      
        calendar = myrSituationProfessionnelleDemandeurEmploiDoc.getIndemnisationDepuisLe();
        if (calendar != null) {
            myrSituationProfessionnelleDemandeurEmploi.setIndemnisationDepuisLe(calendar.getTime());
        }
      
        return myrSituationProfessionnelleDemandeurEmploi;
    }

    @Override
    public MyrSituationProfessionnelleDemandeurEmploi clone() {
        MyrSituationProfessionnelleDemandeurEmploi result = new MyrSituationProfessionnelleDemandeurEmploi();
        
          
            
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