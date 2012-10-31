
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
@Table(name="mar_situation_professionnelle_salarie")
public class MarSituationProfessionnelleSalarie implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        MdphAdultRequest.conditions;

    public MarSituationProfessionnelleSalarie() {
        super();
      
    }

    public final String modelToXmlString() {
        MarSituationProfessionnelleSalarieType object = (MarSituationProfessionnelleSalarieType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MarSituationProfessionnelleSalarieType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MarSituationProfessionnelleSalarieType marSituationProfessionnelleSalarie = MarSituationProfessionnelleSalarieType.Factory.newInstance();
        int i = 0;
    
        marSituationProfessionnelleSalarie.setTypeContrat(this.typeContrat);
      
        date = this.salarieDateDebutContrat;
        if (date != null) {
            calendar.setTime(date);
            marSituationProfessionnelleSalarie.setSalarieDateDebutContrat(calendar);
        }
      
        date = this.esatDepuisLe;
        if (date != null) {
            calendar.setTime(date);
            marSituationProfessionnelleSalarie.setEsatDepuisLe(calendar);
        }
      
        date = this.salarieDateFinContrat;
        if (date != null) {
            calendar.setTime(date);
            marSituationProfessionnelleSalarie.setSalarieDateFinContrat(calendar);
        }
      
        date = this.salarieDepuisLe;
        if (date != null) {
            calendar.setTime(date);
            marSituationProfessionnelleSalarie.setSalarieDepuisLe(calendar);
        }
      
        return marSituationProfessionnelleSalarie;
    }

    public static MarSituationProfessionnelleSalarie xmlToModel(MarSituationProfessionnelleSalarieType marSituationProfessionnelleSalarieDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MarSituationProfessionnelleSalarie marSituationProfessionnelleSalarie = new MarSituationProfessionnelleSalarie();
    
        marSituationProfessionnelleSalarie.setTypeContrat(marSituationProfessionnelleSalarieDoc.getTypeContrat());
      
        calendar = marSituationProfessionnelleSalarieDoc.getSalarieDateDebutContrat();
        if (calendar != null) {
            marSituationProfessionnelleSalarie.setSalarieDateDebutContrat(calendar.getTime());
        }
      
        calendar = marSituationProfessionnelleSalarieDoc.getEsatDepuisLe();
        if (calendar != null) {
            marSituationProfessionnelleSalarie.setEsatDepuisLe(calendar.getTime());
        }
      
        calendar = marSituationProfessionnelleSalarieDoc.getSalarieDateFinContrat();
        if (calendar != null) {
            marSituationProfessionnelleSalarie.setSalarieDateFinContrat(calendar.getTime());
        }
      
        calendar = marSituationProfessionnelleSalarieDoc.getSalarieDepuisLe();
        if (calendar != null) {
            marSituationProfessionnelleSalarie.setSalarieDepuisLe(calendar.getTime());
        }
      
        return marSituationProfessionnelleSalarie;
    }

    @Override
    public MarSituationProfessionnelleSalarie clone() {
        MarSituationProfessionnelleSalarie result = new MarSituationProfessionnelleSalarie();
        
          
            
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

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
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

    public void setTypeContrat(final String typeContrat) {
        this.typeContrat = typeContrat;
    }

    
    @Column(name="type_contrat"  )
      
    public String getTypeContrat() {
        return this.typeContrat;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "salarieDateDebutContrat"
      )
    
    private java.util.Date salarieDateDebutContrat;

    public void setSalarieDateDebutContrat(final java.util.Date salarieDateDebutContrat) {
        this.salarieDateDebutContrat = salarieDateDebutContrat;
    }

    
    @Column(name="salarie_date_debut_contrat"  )
      
    public java.util.Date getSalarieDateDebutContrat() {
        return this.salarieDateDebutContrat;
    }
  
    
    private java.util.Date esatDepuisLe;

    public void setEsatDepuisLe(final java.util.Date esatDepuisLe) {
        this.esatDepuisLe = esatDepuisLe;
    }

    
    @Column(name="esat_depuis_le"  )
      
    public java.util.Date getEsatDepuisLe() {
        return this.esatDepuisLe;
    }
  
    
    private java.util.Date salarieDateFinContrat;

    public void setSalarieDateFinContrat(final java.util.Date salarieDateFinContrat) {
        this.salarieDateFinContrat = salarieDateFinContrat;
    }

    
    @Column(name="salarie_date_fin_contrat"  )
      
    public java.util.Date getSalarieDateFinContrat() {
        return this.salarieDateFinContrat;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "salarieDepuisLe"
      )
    
    private java.util.Date salarieDepuisLe;

    public void setSalarieDepuisLe(final java.util.Date salarieDepuisLe) {
        this.salarieDepuisLe = salarieDepuisLe;
    }

    
    @Column(name="salarie_depuis_le"  )
      
    public java.util.Date getSalarieDepuisLe() {
        return this.salarieDepuisLe;
    }
  
}
