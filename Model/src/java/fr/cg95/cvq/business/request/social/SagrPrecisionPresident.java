
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
@Table(name="sagr_precision_president")
public class SagrPrecisionPresident implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        SportsAssociationsGrantRequest.conditions;

    public SagrPrecisionPresident() {
        super();
      
    }

    public final String modelToXmlString() {
        SagrPrecisionPresidentType object = (SagrPrecisionPresidentType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final SagrPrecisionPresidentType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        SagrPrecisionPresidentType sagrPrecisionPresident = SagrPrecisionPresidentType.Factory.newInstance();
        int i = 0;
    
        sagrPrecisionPresident.setEmailPresident(this.emailPresident);
      
        sagrPrecisionPresident.setTelephonePresident(this.telephonePresident);
      
        sagrPrecisionPresident.setPrenomPresident(this.prenomPresident);
      
        sagrPrecisionPresident.setNomPresident(this.nomPresident);
      
        return sagrPrecisionPresident;
    }

    public static SagrPrecisionPresident xmlToModel(SagrPrecisionPresidentType sagrPrecisionPresidentDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        SagrPrecisionPresident sagrPrecisionPresident = new SagrPrecisionPresident();
    
        sagrPrecisionPresident.setEmailPresident(sagrPrecisionPresidentDoc.getEmailPresident());
      
        sagrPrecisionPresident.setTelephonePresident(sagrPrecisionPresidentDoc.getTelephonePresident());
      
        sagrPrecisionPresident.setPrenomPresident(sagrPrecisionPresidentDoc.getPrenomPresident());
      
        sagrPrecisionPresident.setNomPresident(sagrPrecisionPresidentDoc.getNomPresident());
      
        return sagrPrecisionPresident;
    }

    @Override
    public SagrPrecisionPresident clone() {
        SagrPrecisionPresident result = new SagrPrecisionPresident();
        
          
            
        result.setEmailPresident(emailPresident);
      
          
        
          
            
        result.setTelephonePresident(telephonePresident);
      
          
        
          
            
        result.setPrenomPresident(prenomPresident);
      
          
        
          
            
        result.setNomPresident(nomPresident);
      
          
        
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

  
    
    private String emailPresident;

    public void setEmailPresident(final String emailPresident) {
        this.emailPresident = emailPresident;
    }

    
    @Column(name="email_president"  )
      
    public String getEmailPresident() {
        return this.emailPresident;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"president"},
        message = "telephonePresident"
      )
    
    private String telephonePresident;

    public void setTelephonePresident(final String telephonePresident) {
        this.telephonePresident = telephonePresident;
    }

    
    @Column(name="telephone_president" , length=10 )
      
    public String getTelephonePresident() {
        return this.telephonePresident;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"president"},
        message = "prenomPresident"
      )
    
      @NotNull(
        
        
        profiles = {"president"},
        message = "prenomPresident"
      )
    
      @NotBlank(
        
        
        profiles = {"president"},
        message = "prenomPresident"
      )
    
    private String prenomPresident;

    public void setPrenomPresident(final String prenomPresident) {
        this.prenomPresident = prenomPresident;
    }

    
    @Column(name="prenom_president" , length=38 )
      
    public String getPrenomPresident() {
        return this.prenomPresident;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"president"},
        message = "nomPresident"
      )
    
      @NotNull(
        
        
        profiles = {"president"},
        message = "nomPresident"
      )
    
      @NotBlank(
        
        
        profiles = {"president"},
        message = "nomPresident"
      )
    
    private String nomPresident;

    public void setNomPresident(final String nomPresident) {
        this.nomPresident = nomPresident;
    }

    
    @Column(name="nom_president" , length=38 )
      
    public String getNomPresident() {
        return this.nomPresident;
    }
  
}
