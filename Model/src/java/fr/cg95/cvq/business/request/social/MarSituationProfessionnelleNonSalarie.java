
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
 *  table="mar_situation_professionnelle_non_salarie"
 *  lazy="false"
 */
public class MarSituationProfessionnelleNonSalarie implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public MarSituationProfessionnelleNonSalarie() {
        super();
      
    }

    public final String modelToXmlString() {
        MarSituationProfessionnelleNonSalarieType object = (MarSituationProfessionnelleNonSalarieType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MarSituationProfessionnelleNonSalarieType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MarSituationProfessionnelleNonSalarieType marSituationProfessionnelleNonSalarie = MarSituationProfessionnelleNonSalarieType.Factory.newInstance();
        int i = 0;
    
        marSituationProfessionnelleNonSalarie.setRegimeCotisations(this.regimeCotisations);
      
        date = this.nonSalarieDepuisLe;
        if (date != null) {
            calendar.setTime(date);
            marSituationProfessionnelleNonSalarie.setNonSalarieDepuisLe(calendar);
        }
      
        return marSituationProfessionnelleNonSalarie;
    }

    public static MarSituationProfessionnelleNonSalarie xmlToModel(MarSituationProfessionnelleNonSalarieType marSituationProfessionnelleNonSalarieDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MarSituationProfessionnelleNonSalarie marSituationProfessionnelleNonSalarie = new MarSituationProfessionnelleNonSalarie();
    
        marSituationProfessionnelleNonSalarie.setRegimeCotisations(marSituationProfessionnelleNonSalarieDoc.getRegimeCotisations());
      
        calendar = marSituationProfessionnelleNonSalarieDoc.getNonSalarieDepuisLe();
        if (calendar != null) {
            marSituationProfessionnelleNonSalarie.setNonSalarieDepuisLe(calendar.getTime());
        }
      
        return marSituationProfessionnelleNonSalarie;
    }

    @Override
    public MarSituationProfessionnelleNonSalarie clone() {
        MarSituationProfessionnelleNonSalarie result = new MarSituationProfessionnelleNonSalarie();
        
          
            
        result.setRegimeCotisations(regimeCotisations);
      
          
        
          
            
        result.setNonSalarieDepuisLe(nonSalarieDepuisLe);
      
          
        
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
        message = "regimeCotisations"
      )
    
      @NotBlank(
        
        
        profiles = {"situationProfessionnelle"},
        message = "regimeCotisations"
      )
    
    private String regimeCotisations;

    public final void setRegimeCotisations(final String regimeCotisations) {
        this.regimeCotisations = regimeCotisations;
    }

    /**
  
        * @hibernate.property
        *  column="regime_cotisations"
        
      
    */
    public final String getRegimeCotisations() {
        return this.regimeCotisations;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "nonSalarieDepuisLe"
      )
    
    private java.util.Date nonSalarieDepuisLe;

    public final void setNonSalarieDepuisLe(final java.util.Date nonSalarieDepuisLe) {
        this.nonSalarieDepuisLe = nonSalarieDepuisLe;
    }

    /**
  
        * @hibernate.property
        *  column="non_salarie_depuis_le"
        
      
    */
    public final java.util.Date getNonSalarieDepuisLe() {
        return this.nonSalarieDepuisLe;
    }
  
}
