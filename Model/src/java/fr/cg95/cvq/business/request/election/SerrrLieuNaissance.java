
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
@Table(name="serrr_lieu_naissance")
public class SerrrLieuNaissance implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        StandardElectoralRollRegistrationRequest.conditions;

    public SerrrLieuNaissance() {
        super();
      
    }

    public final String modelToXmlString() {
        SerrrLieuNaissanceType object = (SerrrLieuNaissanceType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final SerrrLieuNaissanceType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        SerrrLieuNaissanceType serrrLieuNaissance = SerrrLieuNaissanceType.Factory.newInstance();
        int i = 0;
    
        serrrLieuNaissance.setVilleNaissanceCodePostal(this.villeNaissanceCodePostal);
      
        if (this.lieuNaissancePays != null)
            serrrLieuNaissance.setLieuNaissancePays(fr.cg95.cvq.xml.common.CountryType.Enum.forString(this.lieuNaissancePays.getLegacyLabel()));
      
        if (this.lieuNaissanceDepartement != null)
            serrrLieuNaissance.setLieuNaissanceDepartement(fr.cg95.cvq.xml.common.InseeDepartementCodeType.Enum.forString(this.lieuNaissanceDepartement.getLegacyLabel()));
      
        return serrrLieuNaissance;
    }

    public static SerrrLieuNaissance xmlToModel(SerrrLieuNaissanceType serrrLieuNaissanceDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        SerrrLieuNaissance serrrLieuNaissance = new SerrrLieuNaissance();
    
        serrrLieuNaissance.setVilleNaissanceCodePostal(serrrLieuNaissanceDoc.getVilleNaissanceCodePostal());
      
        if (serrrLieuNaissanceDoc.getLieuNaissancePays() != null)
            serrrLieuNaissance.setLieuNaissancePays(fr.cg95.cvq.business.users.CountryType.forString(serrrLieuNaissanceDoc.getLieuNaissancePays().toString()));
        else
            serrrLieuNaissance.setLieuNaissancePays(fr.cg95.cvq.business.users.CountryType.getDefaultCountryType());
      
        if (serrrLieuNaissanceDoc.getLieuNaissanceDepartement() != null)
            serrrLieuNaissance.setLieuNaissanceDepartement(fr.cg95.cvq.business.users.InseeDepartementCodeType.forString(serrrLieuNaissanceDoc.getLieuNaissanceDepartement().toString()));
        else
            serrrLieuNaissance.setLieuNaissanceDepartement(fr.cg95.cvq.business.users.InseeDepartementCodeType.getDefaultInseeDepartementCodeType());
      
        return serrrLieuNaissance;
    }

    @Override
    public SerrrLieuNaissance clone() {
        SerrrLieuNaissance result = new SerrrLieuNaissance();
        
          
            
        result.setVilleNaissanceCodePostal(villeNaissanceCodePostal);
      
          
        
          
            
        if (lieuNaissancePays != null)
            result.setLieuNaissancePays(lieuNaissancePays);
        else
            result.setLieuNaissancePays(fr.cg95.cvq.business.users.CountryType.getDefaultCountryType());
      
          
        
          
            
        if (lieuNaissanceDepartement != null)
            result.setLieuNaissanceDepartement(lieuNaissanceDepartement);
        else
            result.setLieuNaissanceDepartement(fr.cg95.cvq.business.users.InseeDepartementCodeType.getDefaultInseeDepartementCodeType());
      
          
        
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

  
    
      @MaxLength(
        
          value = 32,
        
        
        profiles = {"inscription"},
        message = "villeNaissanceCodePostal"
      )
    
      @NotNull(
        
        
        profiles = {"inscription"},
        message = "villeNaissanceCodePostal"
      )
    
      @NotBlank(
        
        
        profiles = {"inscription"},
        message = "villeNaissanceCodePostal"
      )
    
    private String villeNaissanceCodePostal;

    public void setVilleNaissanceCodePostal(final String villeNaissanceCodePostal) {
        this.villeNaissanceCodePostal = villeNaissanceCodePostal;
    }

    
    @Column(name="ville_naissance_code_postal" , length=32 )
      
    public String getVilleNaissanceCodePostal() {
        return this.villeNaissanceCodePostal;
    }
  
    
    private fr.cg95.cvq.business.users.CountryType lieuNaissancePays;

    public void setLieuNaissancePays(final fr.cg95.cvq.business.users.CountryType lieuNaissancePays) {
        this.lieuNaissancePays = lieuNaissancePays;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="lieu_naissance_pays"  )
      
    public fr.cg95.cvq.business.users.CountryType getLieuNaissancePays() {
        return this.lieuNaissancePays;
    }
  
    
    private fr.cg95.cvq.business.users.InseeDepartementCodeType lieuNaissanceDepartement;

    public void setLieuNaissanceDepartement(final fr.cg95.cvq.business.users.InseeDepartementCodeType lieuNaissanceDepartement) {
        this.lieuNaissanceDepartement = lieuNaissanceDepartement;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="lieu_naissance_departement"  )
      
    public fr.cg95.cvq.business.users.InseeDepartementCodeType getLieuNaissanceDepartement() {
        return this.lieuNaissanceDepartement;
    }
  
}
