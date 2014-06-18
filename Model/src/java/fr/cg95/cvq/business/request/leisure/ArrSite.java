
package fr.cg95.cvq.business.request.leisure;

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
import fr.cg95.cvq.xml.request.leisure.*;
import fr.cg95.cvq.service.request.LocalReferential;
import fr.cg95.cvq.service.request.condition.IConditionChecker;
import javax.persistence.*;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Type;

/**
 * Generated class file, do not edit !
 */
@Entity
@Table(name="arr_site")
public class ArrSite implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        ActivityRegistrationRequest.conditions;

    public ArrSite() {
        super();
      
    }

    public final String modelToXmlString() {
        ArrSiteType object = (ArrSiteType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final ArrSiteType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        ArrSiteType arrSite = ArrSiteType.Factory.newInstance();
        int i = 0;
    
        arrSite.setIdSite(this.idSite);
      
        arrSite.setLabelSite(this.labelSite);
      
        return arrSite;
    }

    public static ArrSite xmlToModel(ArrSiteType arrSiteDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        ArrSite arrSite = new ArrSite();
    
        arrSite.setIdSite(arrSiteDoc.getIdSite());
      
        arrSite.setLabelSite(arrSiteDoc.getLabelSite());
      
        return arrSite;
    }

    @Override
    public ArrSite clone() {
        ArrSite result = new ArrSite();
        
          
            
        result.setIdSite(idSite);
      
          
        
          
            
        result.setLabelSite(labelSite);
      
          
        
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
        
        
        profiles = {"preinscription"},
        message = "idSite"
      )
    
      @NotBlank(
        
        
        profiles = {"preinscription"},
        message = "idSite"
      )
    
    private String idSite;

    public void setIdSite(final String idSite) {
        this.idSite = idSite;
    }

    
    @Column(name="id_site"  )
      
    public String getIdSite() {
        return this.idSite;
    }
  
    
      @NotNull(
        
        
        profiles = {"preinscription"},
        message = "labelSite"
      )
    
      @NotBlank(
        
        
        profiles = {"preinscription"},
        message = "labelSite"
      )
    
    private String labelSite;

    public void setLabelSite(final String labelSite) {
        this.labelSite = labelSite;
    }

    
    @Column(name="label_site"  )
      
    public String getLabelSite() {
        return this.labelSite;
    }
  
}
