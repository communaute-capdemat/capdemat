
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
@Table(name="mar_situation_professionnelle_autre")
public class MarSituationProfessionnelleAutre implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        MdphAdultRequest.conditions;

    public MarSituationProfessionnelleAutre() {
        super();
      
    }

    public final String modelToXmlString() {
        MarSituationProfessionnelleAutreType object = (MarSituationProfessionnelleAutreType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MarSituationProfessionnelleAutreType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MarSituationProfessionnelleAutreType marSituationProfessionnelleAutre = MarSituationProfessionnelleAutreType.Factory.newInstance();
        int i = 0;
    
        marSituationProfessionnelleAutre.setPrecisionAutreSituationProfessionnelle(this.precisionAutreSituationProfessionnelle);
      
        date = this.autreDepuisLe;
        if (date != null) {
            calendar.setTime(date);
            marSituationProfessionnelleAutre.setAutreDepuisLe(calendar);
        }
      
        return marSituationProfessionnelleAutre;
    }

    public static MarSituationProfessionnelleAutre xmlToModel(MarSituationProfessionnelleAutreType marSituationProfessionnelleAutreDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MarSituationProfessionnelleAutre marSituationProfessionnelleAutre = new MarSituationProfessionnelleAutre();
    
        marSituationProfessionnelleAutre.setPrecisionAutreSituationProfessionnelle(marSituationProfessionnelleAutreDoc.getPrecisionAutreSituationProfessionnelle());
      
        calendar = marSituationProfessionnelleAutreDoc.getAutreDepuisLe();
        if (calendar != null) {
            marSituationProfessionnelleAutre.setAutreDepuisLe(calendar.getTime());
        }
      
        return marSituationProfessionnelleAutre;
    }

    @Override
    public MarSituationProfessionnelleAutre clone() {
        MarSituationProfessionnelleAutre result = new MarSituationProfessionnelleAutre();
        
          
            
        result.setPrecisionAutreSituationProfessionnelle(precisionAutreSituationProfessionnelle);
      
          
        
          
            
        result.setAutreDepuisLe(autreDepuisLe);
      
          
        
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
        message = "precisionAutreSituationProfessionnelle"
      )
    
      @NotBlank(
        
        
        profiles = {"situationProfessionnelle"},
        message = "precisionAutreSituationProfessionnelle"
      )
    
    private String precisionAutreSituationProfessionnelle;

    public void setPrecisionAutreSituationProfessionnelle(final String precisionAutreSituationProfessionnelle) {
        this.precisionAutreSituationProfessionnelle = precisionAutreSituationProfessionnelle;
    }

    
    @Column(name="precision_autre_situation_professionnelle"  )
      
    public String getPrecisionAutreSituationProfessionnelle() {
        return this.precisionAutreSituationProfessionnelle;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "autreDepuisLe"
      )
    
    private java.util.Date autreDepuisLe;

    public void setAutreDepuisLe(final java.util.Date autreDepuisLe) {
        this.autreDepuisLe = autreDepuisLe;
    }

    
    @Column(name="autre_depuis_le"  )
      
    public java.util.Date getAutreDepuisLe() {
        return this.autreDepuisLe;
    }
  
}