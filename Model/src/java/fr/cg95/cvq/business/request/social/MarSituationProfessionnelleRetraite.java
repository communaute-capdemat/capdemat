
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
@Table(name="mar_situation_professionnelle_retraite")
public class MarSituationProfessionnelleRetraite implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        MdphAdultRequest.conditions;

    public MarSituationProfessionnelleRetraite() {
        super();
      
    }

    public final String modelToXmlString() {
        MarSituationProfessionnelleRetraiteType object = (MarSituationProfessionnelleRetraiteType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MarSituationProfessionnelleRetraiteType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MarSituationProfessionnelleRetraiteType marSituationProfessionnelleRetraite = MarSituationProfessionnelleRetraiteType.Factory.newInstance();
        int i = 0;
    
        date = this.retraiteDepuisLe;
        if (date != null) {
            calendar.setTime(date);
            marSituationProfessionnelleRetraite.setRetraiteDepuisLe(calendar);
        }
      
        if (this.pensionRetraite != null)
            marSituationProfessionnelleRetraite.setPensionRetraite(this.pensionRetraite.booleanValue());
      
        if (this.supplementairePersonneAgee != null)
            marSituationProfessionnelleRetraite.setSupplementairePersonneAgee(this.supplementairePersonneAgee.booleanValue());
      
        return marSituationProfessionnelleRetraite;
    }

    public static MarSituationProfessionnelleRetraite xmlToModel(MarSituationProfessionnelleRetraiteType marSituationProfessionnelleRetraiteDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MarSituationProfessionnelleRetraite marSituationProfessionnelleRetraite = new MarSituationProfessionnelleRetraite();
    
        calendar = marSituationProfessionnelleRetraiteDoc.getRetraiteDepuisLe();
        if (calendar != null) {
            marSituationProfessionnelleRetraite.setRetraiteDepuisLe(calendar.getTime());
        }
      
        marSituationProfessionnelleRetraite.setPensionRetraite(Boolean.valueOf(marSituationProfessionnelleRetraiteDoc.getPensionRetraite()));
      
        marSituationProfessionnelleRetraite.setSupplementairePersonneAgee(Boolean.valueOf(marSituationProfessionnelleRetraiteDoc.getSupplementairePersonneAgee()));
      
        return marSituationProfessionnelleRetraite;
    }

    @Override
    public MarSituationProfessionnelleRetraite clone() {
        MarSituationProfessionnelleRetraite result = new MarSituationProfessionnelleRetraite();
        
          
            
        result.setRetraiteDepuisLe(retraiteDepuisLe);
      
          
        
          
            
        result.setPensionRetraite(pensionRetraite);
      
          
        
          
            
        result.setSupplementairePersonneAgee(supplementairePersonneAgee);
      
          
        
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
        message = "retraiteDepuisLe"
      )
    
    private java.util.Date retraiteDepuisLe;

    public void setRetraiteDepuisLe(final java.util.Date retraiteDepuisLe) {
        this.retraiteDepuisLe = retraiteDepuisLe;
    }

    
    @Column(name="retraite_depuis_le"  )
      
    public java.util.Date getRetraiteDepuisLe() {
        return this.retraiteDepuisLe;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "pensionRetraite"
      )
    
    private Boolean pensionRetraite;

    public void setPensionRetraite(final Boolean pensionRetraite) {
        this.pensionRetraite = pensionRetraite;
    }

    
    @Column(name="pension_retraite"  )
      
    public Boolean getPensionRetraite() {
        return this.pensionRetraite;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "supplementairePersonneAgee"
      )
    
    private Boolean supplementairePersonneAgee;

    public void setSupplementairePersonneAgee(final Boolean supplementairePersonneAgee) {
        this.supplementairePersonneAgee = supplementairePersonneAgee;
    }

    
    @Column(name="supplementaire_personne_agee"  )
      
    public Boolean getSupplementairePersonneAgee() {
        return this.supplementairePersonneAgee;
    }
  
}
