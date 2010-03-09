
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

/**
 * Generated class file, do not edit !
 *
 * @hibernate.class
 *  table="myr_situation_professionnelle_salarie"
 *  lazy="false"
 */
public class MyrSituationProfessionnelleSalarie implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public MyrSituationProfessionnelleSalarie() {
        super();
      
    }

    public final String modelToXmlString() {
        MyrSituationProfessionnelleSalarieType object = (MyrSituationProfessionnelleSalarieType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MyrSituationProfessionnelleSalarieType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MyrSituationProfessionnelleSalarieType myrSituationProfessionnelleSalarie = MyrSituationProfessionnelleSalarieType.Factory.newInstance();
        int i = 0;
    
        myrSituationProfessionnelleSalarie.setTypeContrat(this.typeContrat);
      
        date = this.salarieDateDebutContrat;
        if (date != null) {
            calendar.setTime(date);
            myrSituationProfessionnelleSalarie.setSalarieDateDebutContrat(calendar);
        }
      
        date = this.esatDepuisLe;
        if (date != null) {
            calendar.setTime(date);
            myrSituationProfessionnelleSalarie.setEsatDepuisLe(calendar);
        }
      
        date = this.salarieDateFinContrat;
        if (date != null) {
            calendar.setTime(date);
            myrSituationProfessionnelleSalarie.setSalarieDateFinContrat(calendar);
        }
      
        date = this.salarieDepuisLe;
        if (date != null) {
            calendar.setTime(date);
            myrSituationProfessionnelleSalarie.setSalarieDepuisLe(calendar);
        }
      
        return myrSituationProfessionnelleSalarie;
    }

    public static MyrSituationProfessionnelleSalarie xmlToModel(MyrSituationProfessionnelleSalarieType myrSituationProfessionnelleSalarieDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MyrSituationProfessionnelleSalarie myrSituationProfessionnelleSalarie = new MyrSituationProfessionnelleSalarie();
    
        myrSituationProfessionnelleSalarie.setTypeContrat(myrSituationProfessionnelleSalarieDoc.getTypeContrat());
      
        calendar = myrSituationProfessionnelleSalarieDoc.getSalarieDateDebutContrat();
        if (calendar != null) {
            myrSituationProfessionnelleSalarie.setSalarieDateDebutContrat(calendar.getTime());
        }
      
        calendar = myrSituationProfessionnelleSalarieDoc.getEsatDepuisLe();
        if (calendar != null) {
            myrSituationProfessionnelleSalarie.setEsatDepuisLe(calendar.getTime());
        }
      
        calendar = myrSituationProfessionnelleSalarieDoc.getSalarieDateFinContrat();
        if (calendar != null) {
            myrSituationProfessionnelleSalarie.setSalarieDateFinContrat(calendar.getTime());
        }
      
        calendar = myrSituationProfessionnelleSalarieDoc.getSalarieDepuisLe();
        if (calendar != null) {
            myrSituationProfessionnelleSalarie.setSalarieDepuisLe(calendar.getTime());
        }
      
        return myrSituationProfessionnelleSalarie;
    }

    @Override
    public MyrSituationProfessionnelleSalarie clone() {
        MyrSituationProfessionnelleSalarie result = new MyrSituationProfessionnelleSalarie();
        
          
            
        result.setTypeContrat(typeContrat);
      
          
        
          
            
        result.setSalarieDateDebutContrat(salarieDateDebutContrat);
      
          
        
          
            
        result.setEsatDepuisLe(esatDepuisLe);
      
          
        
          
            
        result.setSalarieDateFinContrat(salarieDateFinContrat);
      
          
        
          
            
        result.setSalarieDepuisLe(salarieDepuisLe);
      
          
        
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

  
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "typeContrat"
      )
    
      @NotBlank(
        
        
        profiles = {"situationProfessionnelle"},
        message = "typeContrat"
      )
    
    private String typeContrat;

    public final void setTypeContrat(final String typeContrat) {
        this.typeContrat = typeContrat;
    }

    /**
  
        * @hibernate.property
        *  column="type_contrat"
        
      
    */
    public final String getTypeContrat() {
        return this.typeContrat;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "salarieDateDebutContrat"
      )
    
    private java.util.Date salarieDateDebutContrat;

    public final void setSalarieDateDebutContrat(final java.util.Date salarieDateDebutContrat) {
        this.salarieDateDebutContrat = salarieDateDebutContrat;
    }

    /**
  
        * @hibernate.property
        *  column="salarie_date_debut_contrat"
        
      
    */
    public final java.util.Date getSalarieDateDebutContrat() {
        return this.salarieDateDebutContrat;
    }
  
    
    private java.util.Date esatDepuisLe;

    public final void setEsatDepuisLe(final java.util.Date esatDepuisLe) {
        this.esatDepuisLe = esatDepuisLe;
    }

    /**
  
        * @hibernate.property
        *  column="esat_depuis_le"
        
      
    */
    public final java.util.Date getEsatDepuisLe() {
        return this.esatDepuisLe;
    }
  
    
    private java.util.Date salarieDateFinContrat;

    public final void setSalarieDateFinContrat(final java.util.Date salarieDateFinContrat) {
        this.salarieDateFinContrat = salarieDateFinContrat;
    }

    /**
  
        * @hibernate.property
        *  column="salarie_date_fin_contrat"
        
      
    */
    public final java.util.Date getSalarieDateFinContrat() {
        return this.salarieDateFinContrat;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "salarieDepuisLe"
      )
    
    private java.util.Date salarieDepuisLe;

    public final void setSalarieDepuisLe(final java.util.Date salarieDepuisLe) {
        this.salarieDepuisLe = salarieDepuisLe;
    }

    /**
  
        * @hibernate.property
        *  column="salarie_depuis_le"
        
      
    */
    public final java.util.Date getSalarieDepuisLe() {
        return this.salarieDepuisLe;
    }
  
}
