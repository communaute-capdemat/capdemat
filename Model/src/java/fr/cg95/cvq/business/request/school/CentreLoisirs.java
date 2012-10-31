
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
@Table(name="centre_loisirs")
public class CentreLoisirs implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        LeisureCenterRegistrationRequest.conditions;

    public CentreLoisirs() {
        super();
      
    }

    public final String modelToXmlString() {
        CentreLoisirsType object = (CentreLoisirsType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final CentreLoisirsType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        CentreLoisirsType centreLoisirs = CentreLoisirsType.Factory.newInstance();
        int i = 0;
    
        centreLoisirs.setIdCentreLoisirs(this.idCentreLoisirs);
      
        centreLoisirs.setLabelCentreLoisirs(this.labelCentreLoisirs);
      
        return centreLoisirs;
    }

    public static CentreLoisirs xmlToModel(CentreLoisirsType centreLoisirsDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        CentreLoisirs centreLoisirs = new CentreLoisirs();
    
        centreLoisirs.setIdCentreLoisirs(centreLoisirsDoc.getIdCentreLoisirs());
      
        centreLoisirs.setLabelCentreLoisirs(centreLoisirsDoc.getLabelCentreLoisirs());
      
        return centreLoisirs;
    }

    @Override
    public CentreLoisirs clone() {
        CentreLoisirs result = new CentreLoisirs();
        
          
            
        result.setIdCentreLoisirs(idCentreLoisirs);
      
          
        
          
            
        result.setLabelCentreLoisirs(labelCentreLoisirs);
      
          
        
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
        message = "idCentreLoisirs"
      )
    
      @NotBlank(
        
        
        profiles = {"enfant"},
        message = "idCentreLoisirs"
      )
    
    private String idCentreLoisirs;

    public void setIdCentreLoisirs(final String idCentreLoisirs) {
        this.idCentreLoisirs = idCentreLoisirs;
    }

    
    @Column(name="id_centre_loisirs"  )
      
    public String getIdCentreLoisirs() {
        return this.idCentreLoisirs;
    }
  
    
      @NotNull(
        
        
        profiles = {"enfant"},
        message = "labelCentreLoisirs"
      )
    
      @NotBlank(
        
        
        profiles = {"enfant"},
        message = "labelCentreLoisirs"
      )
    
    private String labelCentreLoisirs;

    public void setLabelCentreLoisirs(final String labelCentreLoisirs) {
        this.labelCentreLoisirs = labelCentreLoisirs;
    }

    
    @Column(name="label_centre_loisirs"  )
      
    public String getLabelCentreLoisirs() {
        return this.labelCentreLoisirs;
    }
  
}
