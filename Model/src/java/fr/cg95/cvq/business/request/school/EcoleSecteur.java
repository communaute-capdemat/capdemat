
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
@Table(name="ecole_secteur")
public class EcoleSecteur implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        GlobalSchoolRegistrationRequest.conditions;

    public EcoleSecteur() {
        super();
      
    }

    public final String modelToXmlString() {
        EcoleSecteurType object = (EcoleSecteurType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final EcoleSecteurType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        EcoleSecteurType ecoleSecteur = EcoleSecteurType.Factory.newInstance();
        int i = 0;
    
        ecoleSecteur.setIdEcoleSecteur(this.idEcoleSecteur);
      
        ecoleSecteur.setLabelEcoleSecteur(this.labelEcoleSecteur);
      
        return ecoleSecteur;
    }

    public static EcoleSecteur xmlToModel(EcoleSecteurType ecoleSecteurDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        EcoleSecteur ecoleSecteur = new EcoleSecteur();
    
        ecoleSecteur.setIdEcoleSecteur(ecoleSecteurDoc.getIdEcoleSecteur());
      
        ecoleSecteur.setLabelEcoleSecteur(ecoleSecteurDoc.getLabelEcoleSecteur());
      
        return ecoleSecteur;
    }

    @Override
    public EcoleSecteur clone() {
        EcoleSecteur result = new EcoleSecteur();
        
          
            
        result.setIdEcoleSecteur(idEcoleSecteur);
      
          
        
          
            
        result.setLabelEcoleSecteur(labelEcoleSecteur);
      
          
        
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
        message = "idEcoleSecteur"
      )
    
      @NotBlank(
        
        
        profiles = {"enfant"},
        message = "idEcoleSecteur"
      )
    
    private String idEcoleSecteur;

    public void setIdEcoleSecteur(final String idEcoleSecteur) {
        this.idEcoleSecteur = idEcoleSecteur;
    }

    
    @Column(name="id_ecole_secteur"  )
      
    public String getIdEcoleSecteur() {
        return this.idEcoleSecteur;
    }
  
    
      @NotNull(
        
        
        profiles = {"enfant"},
        message = "labelEcoleSecteur"
      )
    
      @NotBlank(
        
        
        profiles = {"enfant"},
        message = "labelEcoleSecteur"
      )
    
    private String labelEcoleSecteur;

    public void setLabelEcoleSecteur(final String labelEcoleSecteur) {
        this.labelEcoleSecteur = labelEcoleSecteur;
    }

    
    @Column(name="label_ecole_secteur"  )
      
    public String getLabelEcoleSecteur() {
        return this.labelEcoleSecteur;
    }
  
}
