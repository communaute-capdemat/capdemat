
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
 *  table="myr_situation_professionnelle_autre"
 *  lazy="false"
 */
public class MyrSituationProfessionnelleAutre implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public MyrSituationProfessionnelleAutre() {
        super();
      
    }

    public final String modelToXmlString() {
        MyrSituationProfessionnelleAutreType object = (MyrSituationProfessionnelleAutreType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MyrSituationProfessionnelleAutreType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MyrSituationProfessionnelleAutreType myrSituationProfessionnelleAutre = MyrSituationProfessionnelleAutreType.Factory.newInstance();
        int i = 0;
    
        myrSituationProfessionnelleAutre.setPrecisionAutreSituationProfessionnelle(this.precisionAutreSituationProfessionnelle);
      
        date = this.autreDepuisLe;
        if (date != null) {
            calendar.setTime(date);
            myrSituationProfessionnelleAutre.setAutreDepuisLe(calendar);
        }
      
        return myrSituationProfessionnelleAutre;
    }

    public static MyrSituationProfessionnelleAutre xmlToModel(MyrSituationProfessionnelleAutreType myrSituationProfessionnelleAutreDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MyrSituationProfessionnelleAutre myrSituationProfessionnelleAutre = new MyrSituationProfessionnelleAutre();
    
        myrSituationProfessionnelleAutre.setPrecisionAutreSituationProfessionnelle(myrSituationProfessionnelleAutreDoc.getPrecisionAutreSituationProfessionnelle());
      
        calendar = myrSituationProfessionnelleAutreDoc.getAutreDepuisLe();
        if (calendar != null) {
            myrSituationProfessionnelleAutre.setAutreDepuisLe(calendar.getTime());
        }
      
        return myrSituationProfessionnelleAutre;
    }

    @Override
    public MyrSituationProfessionnelleAutre clone() {
        MyrSituationProfessionnelleAutre result = new MyrSituationProfessionnelleAutre();
        
          
            
        result.setPrecisionAutreSituationProfessionnelle(precisionAutreSituationProfessionnelle);
      
          
        
          
            
        result.setAutreDepuisLe(autreDepuisLe);
      
          
        
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
        message = "precisionAutreSituationProfessionnelle"
      )
    
      @NotBlank(
        
        
        profiles = {"situationProfessionnelle"},
        message = "precisionAutreSituationProfessionnelle"
      )
    
    private String precisionAutreSituationProfessionnelle;

    public final void setPrecisionAutreSituationProfessionnelle(final String precisionAutreSituationProfessionnelle) {
        this.precisionAutreSituationProfessionnelle = precisionAutreSituationProfessionnelle;
    }

    /**
  
        * @hibernate.property
        *  column="precision_autre_situation_professionnelle"
        
      
    */
    public final String getPrecisionAutreSituationProfessionnelle() {
        return this.precisionAutreSituationProfessionnelle;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "autreDepuisLe"
      )
    
    private java.util.Date autreDepuisLe;

    public final void setAutreDepuisLe(final java.util.Date autreDepuisLe) {
        this.autreDepuisLe = autreDepuisLe;
    }

    /**
  
        * @hibernate.property
        *  column="autre_depuis_le"
        
      
    */
    public final java.util.Date getAutreDepuisLe() {
        return this.autreDepuisLe;
    }
  
}
