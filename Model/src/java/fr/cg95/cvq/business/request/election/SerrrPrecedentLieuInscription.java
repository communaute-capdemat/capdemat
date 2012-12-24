
package fr.cg95.cvq.business.request.election;

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
import fr.cg95.cvq.xml.request.election.*;
import fr.cg95.cvq.service.request.LocalReferential;
import fr.cg95.cvq.service.request.condition.IConditionChecker;
import javax.persistence.*;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Type;

/**
 * Generated class file, do not edit !
 */
@Entity
@Table(name="serrr_precedent_lieu_inscription")
public class SerrrPrecedentLieuInscription implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        StandardElectoralRollRegistrationRequest.conditions;

    public SerrrPrecedentLieuInscription() {
        super();
      
    }

    public final String modelToXmlString() {
        SerrrPrecedentLieuInscriptionType object = (SerrrPrecedentLieuInscriptionType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final SerrrPrecedentLieuInscriptionType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        SerrrPrecedentLieuInscriptionType serrrPrecedentLieuInscription = SerrrPrecedentLieuInscriptionType.Factory.newInstance();
        int i = 0;
    
        if (this.departementAncienneCommune != null)
            serrrPrecedentLieuInscription.setDepartementAncienneCommune(fr.cg95.cvq.xml.common.InseeDepartementCodeType.Enum.forString(this.departementAncienneCommune.getLegacyLabel()));
      
        serrrPrecedentLieuInscription.setAncienneCommune(this.ancienneCommune);
      
        return serrrPrecedentLieuInscription;
    }

    public static SerrrPrecedentLieuInscription xmlToModel(SerrrPrecedentLieuInscriptionType serrrPrecedentLieuInscriptionDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        SerrrPrecedentLieuInscription serrrPrecedentLieuInscription = new SerrrPrecedentLieuInscription();
    
        if (serrrPrecedentLieuInscriptionDoc.getDepartementAncienneCommune() != null)
            serrrPrecedentLieuInscription.setDepartementAncienneCommune(fr.cg95.cvq.business.users.InseeDepartementCodeType.forString(serrrPrecedentLieuInscriptionDoc.getDepartementAncienneCommune().toString()));
        else
            serrrPrecedentLieuInscription.setDepartementAncienneCommune(fr.cg95.cvq.business.users.InseeDepartementCodeType.getDefaultInseeDepartementCodeType());
      
        serrrPrecedentLieuInscription.setAncienneCommune(serrrPrecedentLieuInscriptionDoc.getAncienneCommune());
      
        return serrrPrecedentLieuInscription;
    }

    @Override
    public SerrrPrecedentLieuInscription clone() {
        SerrrPrecedentLieuInscription result = new SerrrPrecedentLieuInscription();
        
          
            
        if (departementAncienneCommune != null)
            result.setDepartementAncienneCommune(departementAncienneCommune);
        else
            result.setDepartementAncienneCommune(fr.cg95.cvq.business.users.InseeDepartementCodeType.getDefaultInseeDepartementCodeType());
      
          
        
          
            
        result.setAncienneCommune(ancienneCommune);
      
          
        
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
        
        
        profiles = {"situation"},
        message = "departementAncienneCommune"
      )
    
    private fr.cg95.cvq.business.users.InseeDepartementCodeType departementAncienneCommune;

    public void setDepartementAncienneCommune(final fr.cg95.cvq.business.users.InseeDepartementCodeType departementAncienneCommune) {
        this.departementAncienneCommune = departementAncienneCommune;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="departement_ancienne_commune"  )
      
    public fr.cg95.cvq.business.users.InseeDepartementCodeType getDepartementAncienneCommune() {
        return this.departementAncienneCommune;
    }
  
    
      @MaxLength(
        
          value = 32,
        
        
        profiles = {"situation"},
        message = "ancienneCommune"
      )
    
      @NotNull(
        
        
        profiles = {"situation"},
        message = "ancienneCommune"
      )
    
      @NotBlank(
        
        
        profiles = {"situation"},
        message = "ancienneCommune"
      )
    
    private String ancienneCommune;

    public void setAncienneCommune(final String ancienneCommune) {
        this.ancienneCommune = ancienneCommune;
    }

    
    @Column(name="ancienne_commune" , length=32 )
      
    public String getAncienneCommune() {
        return this.ancienneCommune;
    }
  
}
