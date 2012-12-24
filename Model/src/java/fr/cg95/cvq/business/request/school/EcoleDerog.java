
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
@Table(name="ecole_derog")
public class EcoleDerog implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        GlobalSchoolRegistrationRequest.conditions;

    public EcoleDerog() {
        super();
      
    }

    public final String modelToXmlString() {
        EcoleDerogType object = (EcoleDerogType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final EcoleDerogType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        EcoleDerogType ecoleDerog = EcoleDerogType.Factory.newInstance();
        int i = 0;
    
        ecoleDerog.setLabelEcoleDerog(this.labelEcoleDerog);
      
        ecoleDerog.setIdEcoleDerog(this.idEcoleDerog);
      
        return ecoleDerog;
    }

    public static EcoleDerog xmlToModel(EcoleDerogType ecoleDerogDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        EcoleDerog ecoleDerog = new EcoleDerog();
    
        ecoleDerog.setLabelEcoleDerog(ecoleDerogDoc.getLabelEcoleDerog());
      
        ecoleDerog.setIdEcoleDerog(ecoleDerogDoc.getIdEcoleDerog());
      
        return ecoleDerog;
    }

    @Override
    public EcoleDerog clone() {
        EcoleDerog result = new EcoleDerog();
        
          
            
        result.setLabelEcoleDerog(labelEcoleDerog);
      
          
        
          
            
        result.setIdEcoleDerog(idEcoleDerog);
      
          
        
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
        message = "labelEcoleDerog"
      )
    
      @NotBlank(
        
        
        profiles = {"enfant"},
        message = "labelEcoleDerog"
      )
    
    private String labelEcoleDerog;

    public void setLabelEcoleDerog(final String labelEcoleDerog) {
        this.labelEcoleDerog = labelEcoleDerog;
    }

    
    @Column(name="label_ecole_derog"  )
      
    public String getLabelEcoleDerog() {
        return this.labelEcoleDerog;
    }
  
    
      @NotNull(
        
        
        profiles = {"enfant"},
        message = "idEcoleDerog"
      )
    
      @NotBlank(
        
        
        profiles = {"enfant"},
        message = "idEcoleDerog"
      )
    
    private String idEcoleDerog;

    public void setIdEcoleDerog(final String idEcoleDerog) {
        this.idEcoleDerog = idEcoleDerog;
    }

    
    @Column(name="id_ecole_derog"  )
      
    public String getIdEcoleDerog() {
        return this.idEcoleDerog;
    }
  
}
