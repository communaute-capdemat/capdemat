
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
@Table(name="centre_sejours")
public class CentreSejours implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        HolidayCampRegistrationRequest.conditions;

    public CentreSejours() {
        super();
      
    }

    public final String modelToXmlString() {
        CentreSejoursType object = (CentreSejoursType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final CentreSejoursType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        CentreSejoursType centreSejours = CentreSejoursType.Factory.newInstance();
        int i = 0;
    
        centreSejours.setLabelCentreSejours(this.labelCentreSejours);
      
        centreSejours.setIdCentreSejours(this.idCentreSejours);
      
        return centreSejours;
    }

    public static CentreSejours xmlToModel(CentreSejoursType centreSejoursDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        CentreSejours centreSejours = new CentreSejours();
    
        centreSejours.setLabelCentreSejours(centreSejoursDoc.getLabelCentreSejours());
      
        centreSejours.setIdCentreSejours(centreSejoursDoc.getIdCentreSejours());
      
        return centreSejours;
    }

    @Override
    public CentreSejours clone() {
        CentreSejours result = new CentreSejours();
        
          
            
        result.setLabelCentreSejours(labelCentreSejours);
      
          
        
          
            
        result.setIdCentreSejours(idCentreSejours);
      
          
        
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
        message = "labelCentreSejours"
      )
    
      @NotBlank(
        
        
        profiles = {"enfant"},
        message = "labelCentreSejours"
      )
    
    private String labelCentreSejours;

    public void setLabelCentreSejours(final String labelCentreSejours) {
        this.labelCentreSejours = labelCentreSejours;
    }

    
    @Column(name="label_centre_sejours"  )
      
    public String getLabelCentreSejours() {
        return this.labelCentreSejours;
    }
  
    
      @NotNull(
        
        
        profiles = {"enfant"},
        message = "idCentreSejours"
      )
    
      @NotBlank(
        
        
        profiles = {"enfant"},
        message = "idCentreSejours"
      )
    
    private String idCentreSejours;

    public void setIdCentreSejours(final String idCentreSejours) {
        this.idCentreSejours = idCentreSejours;
    }

    
    @Column(name="id_centre_sejours"  )
      
    public String getIdCentreSejours() {
        return this.idCentreSejours;
    }
  
}
