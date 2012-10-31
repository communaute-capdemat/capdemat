
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
@Table(name="transports")
public class Transports implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        LeisureCenterRegistrationRequest.conditions;

    public Transports() {
        super();
      
    }

    public final String modelToXmlString() {
        TransportsType object = (TransportsType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final TransportsType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        TransportsType transports = TransportsType.Factory.newInstance();
        int i = 0;
    
        transports.setIdLigne(this.idLigne);
      
        transports.setIdArret(this.idArret);
      
        transports.setLabelArret(this.labelArret);
      
        transports.setLabelLigne(this.labelLigne);
      
        return transports;
    }

    public static Transports xmlToModel(TransportsType transportsDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        Transports transports = new Transports();
    
        transports.setIdLigne(transportsDoc.getIdLigne());
      
        transports.setIdArret(transportsDoc.getIdArret());
      
        transports.setLabelArret(transportsDoc.getLabelArret());
      
        transports.setLabelLigne(transportsDoc.getLabelLigne());
      
        return transports;
    }

    @Override
    public Transports clone() {
        Transports result = new Transports();
        
          
            
        result.setIdLigne(idLigne);
      
          
        
          
            
        result.setIdArret(idArret);
      
          
        
          
            
        result.setLabelArret(labelArret);
      
          
        
          
            
        result.setLabelLigne(labelLigne);
      
          
        
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
        
        
        profiles = {"enfant"},
        message = "idLigne"
      )
    
      @NotBlank(
        
        
        profiles = {"enfant"},
        message = "idLigne"
      )
    
    private String idLigne;

    public void setIdLigne(final String idLigne) {
        this.idLigne = idLigne;
    }

    
    @Column(name="id_ligne"  )
      
    public String getIdLigne() {
        return this.idLigne;
    }
  
    
      @NotNull(
        
        
        profiles = {"enfant"},
        message = "idArret"
      )
    
      @NotBlank(
        
        
        profiles = {"enfant"},
        message = "idArret"
      )
    
    private String idArret;

    public void setIdArret(final String idArret) {
        this.idArret = idArret;
    }

    
    @Column(name="id_arret"  )
      
    public String getIdArret() {
        return this.idArret;
    }
  
    
      @NotNull(
        
        
        profiles = {"enfant"},
        message = "labelArret"
      )
    
      @NotBlank(
        
        
        profiles = {"enfant"},
        message = "labelArret"
      )
    
    private String labelArret;

    public void setLabelArret(final String labelArret) {
        this.labelArret = labelArret;
    }

    
    @Column(name="label_arret"  )
      
    public String getLabelArret() {
        return this.labelArret;
    }
  
    
      @NotNull(
        
        
        profiles = {"enfant"},
        message = "labelLigne"
      )
    
      @NotBlank(
        
        
        profiles = {"enfant"},
        message = "labelLigne"
      )
    
    private String labelLigne;

    public void setLabelLigne(final String labelLigne) {
        this.labelLigne = labelLigne;
    }

    
    @Column(name="label_ligne"  )
      
    public String getLabelLigne() {
        return this.labelLigne;
    }
  
}
