
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
@Table(name="mar_conjoint_identite")
public class MarConjointIdentite implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        MdphAdultRequest.conditions;

    public MarConjointIdentite() {
        super();
      
    }

    public final String modelToXmlString() {
        MarConjointIdentiteType object = (MarConjointIdentiteType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MarConjointIdentiteType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MarConjointIdentiteType marConjointIdentite = MarConjointIdentiteType.Factory.newInstance();
        int i = 0;
    
        marConjointIdentite.setNomNaissanceConjoint(this.nomNaissanceConjoint);
      
        marConjointIdentite.setPrenomConjoint(this.prenomConjoint);
      
        date = this.dateNaissanceConjoint;
        if (date != null) {
            calendar.setTime(date);
            marConjointIdentite.setDateNaissanceConjoint(calendar);
        }
      
        return marConjointIdentite;
    }

    public static MarConjointIdentite xmlToModel(MarConjointIdentiteType marConjointIdentiteDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MarConjointIdentite marConjointIdentite = new MarConjointIdentite();
    
        marConjointIdentite.setNomNaissanceConjoint(marConjointIdentiteDoc.getNomNaissanceConjoint());
      
        marConjointIdentite.setPrenomConjoint(marConjointIdentiteDoc.getPrenomConjoint());
      
        calendar = marConjointIdentiteDoc.getDateNaissanceConjoint();
        if (calendar != null) {
            marConjointIdentite.setDateNaissanceConjoint(calendar.getTime());
        }
      
        return marConjointIdentite;
    }

    @Override
    public MarConjointIdentite clone() {
        MarConjointIdentite result = new MarConjointIdentite();
        
          
            
        result.setNomNaissanceConjoint(nomNaissanceConjoint);
      
          
        
          
            
        result.setPrenomConjoint(prenomConjoint);
      
          
        
          
            
        result.setDateNaissanceConjoint(dateNaissanceConjoint);
      
          
        
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

  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"situationFamiliale"},
        message = "nomNaissanceConjoint"
      )
    
      @NotNull(
        
        
        profiles = {"situationFamiliale"},
        message = "nomNaissanceConjoint"
      )
    
      @NotBlank(
        
        
        profiles = {"situationFamiliale"},
        message = "nomNaissanceConjoint"
      )
    
    private String nomNaissanceConjoint;

    public void setNomNaissanceConjoint(final String nomNaissanceConjoint) {
        this.nomNaissanceConjoint = nomNaissanceConjoint;
    }

    
    @Column(name="nom_naissance_conjoint" , length=38 )
      
    public String getNomNaissanceConjoint() {
        return this.nomNaissanceConjoint;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"situationFamiliale"},
        message = "prenomConjoint"
      )
    
      @NotNull(
        
        
        profiles = {"situationFamiliale"},
        message = "prenomConjoint"
      )
    
      @NotBlank(
        
        
        profiles = {"situationFamiliale"},
        message = "prenomConjoint"
      )
    
    private String prenomConjoint;

    public void setPrenomConjoint(final String prenomConjoint) {
        this.prenomConjoint = prenomConjoint;
    }

    
    @Column(name="prenom_conjoint" , length=38 )
      
    public String getPrenomConjoint() {
        return this.prenomConjoint;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationFamiliale"},
        message = "dateNaissanceConjoint"
      )
    
    private java.util.Date dateNaissanceConjoint;

    public void setDateNaissanceConjoint(final java.util.Date dateNaissanceConjoint) {
        this.dateNaissanceConjoint = dateNaissanceConjoint;
    }

    
    @Column(name="date_naissance_conjoint"  )
      
    public java.util.Date getDateNaissanceConjoint() {
        return this.dateNaissanceConjoint;
    }
  
}
