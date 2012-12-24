
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
@Table(name="ligne")
public class Ligne implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        SchoolTransportRegistrationRequest.conditions;

    public Ligne() {
        super();
      
    }

    public final String modelToXmlString() {
        LigneType object = (LigneType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final LigneType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        LigneType ligne = LigneType.Factory.newInstance();
        int i = 0;
    
        ligne.setIdLigne(this.idLigne);
      
        ligne.setLabelLigne(this.labelLigne);
      
        return ligne;
    }

    public static Ligne xmlToModel(LigneType ligneDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        Ligne ligne = new Ligne();
    
        ligne.setIdLigne(ligneDoc.getIdLigne());
      
        ligne.setLabelLigne(ligneDoc.getLabelLigne());
      
        return ligne;
    }

    @Override
    public Ligne clone() {
        Ligne result = new Ligne();
        
          
            
        result.setIdLigne(idLigne);
      
          
        
          
            
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
