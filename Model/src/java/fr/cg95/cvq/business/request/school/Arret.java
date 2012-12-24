
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
@Table(name="arret")
public class Arret implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        SchoolTransportRegistrationRequest.conditions;

    public Arret() {
        super();
      
    }

    public final String modelToXmlString() {
        ArretType object = (ArretType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final ArretType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        ArretType arret = ArretType.Factory.newInstance();
        int i = 0;
    
        arret.setIdArret(this.idArret);
      
        arret.setLabelArret(this.labelArret);
      
        return arret;
    }

    public static Arret xmlToModel(ArretType arretDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        Arret arret = new Arret();
    
        arret.setIdArret(arretDoc.getIdArret());
      
        arret.setLabelArret(arretDoc.getLabelArret());
      
        return arret;
    }

    @Override
    public Arret clone() {
        Arret result = new Arret();
        
          
            
        result.setIdArret(idArret);
      
          
        
          
            
        result.setLabelArret(labelArret);
      
          
        
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
  
}
