
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
@Table(name="mar_precision_preference_etablissement_ou_service")
public class MarPrecisionPreferenceEtablissementOuService implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        MdphAdultRequest.conditions;

    public MarPrecisionPreferenceEtablissementOuService() {
        super();
      
    }

    public final String modelToXmlString() {
        MarPrecisionPreferenceEtablissementOuServiceType object = (MarPrecisionPreferenceEtablissementOuServiceType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MarPrecisionPreferenceEtablissementOuServiceType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MarPrecisionPreferenceEtablissementOuServiceType marPrecisionPreferenceEtablissementOuService = MarPrecisionPreferenceEtablissementOuServiceType.Factory.newInstance();
        int i = 0;
    
        marPrecisionPreferenceEtablissementOuService.setCommuneEtablissementPreference(this.communeEtablissementPreference);
      
        marPrecisionPreferenceEtablissementOuService.setNomEtablissementPreference(this.nomEtablissementPreference);
      
        marPrecisionPreferenceEtablissementOuService.setTelephoneEtablissementPreference(this.telephoneEtablissementPreference);
      
        marPrecisionPreferenceEtablissementOuService.setCodePostalEtablissementPreference(this.codePostalEtablissementPreference);
      
        return marPrecisionPreferenceEtablissementOuService;
    }

    public static MarPrecisionPreferenceEtablissementOuService xmlToModel(MarPrecisionPreferenceEtablissementOuServiceType marPrecisionPreferenceEtablissementOuServiceDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MarPrecisionPreferenceEtablissementOuService marPrecisionPreferenceEtablissementOuService = new MarPrecisionPreferenceEtablissementOuService();
    
        marPrecisionPreferenceEtablissementOuService.setCommuneEtablissementPreference(marPrecisionPreferenceEtablissementOuServiceDoc.getCommuneEtablissementPreference());
      
        marPrecisionPreferenceEtablissementOuService.setNomEtablissementPreference(marPrecisionPreferenceEtablissementOuServiceDoc.getNomEtablissementPreference());
      
        marPrecisionPreferenceEtablissementOuService.setTelephoneEtablissementPreference(marPrecisionPreferenceEtablissementOuServiceDoc.getTelephoneEtablissementPreference());
      
        marPrecisionPreferenceEtablissementOuService.setCodePostalEtablissementPreference(marPrecisionPreferenceEtablissementOuServiceDoc.getCodePostalEtablissementPreference());
      
        return marPrecisionPreferenceEtablissementOuService;
    }

    @Override
    public MarPrecisionPreferenceEtablissementOuService clone() {
        MarPrecisionPreferenceEtablissementOuService result = new MarPrecisionPreferenceEtablissementOuService();
        
          
            
        result.setCommuneEtablissementPreference(communeEtablissementPreference);
      
          
        
          
            
        result.setNomEtablissementPreference(nomEtablissementPreference);
      
          
        
          
            
        result.setTelephoneEtablissementPreference(telephoneEtablissementPreference);
      
          
        
          
            
        result.setCodePostalEtablissementPreference(codePostalEtablissementPreference);
      
          
        
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
        
        
        profiles = {"demandeOrientationMedicoSociale"},
        message = "communeEtablissementPreference"
      )
    
      @NotNull(
        
        
        profiles = {"demandeOrientationMedicoSociale"},
        message = "communeEtablissementPreference"
      )
    
      @NotBlank(
        
        
        profiles = {"demandeOrientationMedicoSociale"},
        message = "communeEtablissementPreference"
      )
    
    private String communeEtablissementPreference;

    public void setCommuneEtablissementPreference(final String communeEtablissementPreference) {
        this.communeEtablissementPreference = communeEtablissementPreference;
    }

    
    @Column(name="commune_etablissement_preference" , length=32 )
      
    public String getCommuneEtablissementPreference() {
        return this.communeEtablissementPreference;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandeOrientationMedicoSociale"},
        message = "nomEtablissementPreference"
      )
    
      @NotBlank(
        
        
        profiles = {"demandeOrientationMedicoSociale"},
        message = "nomEtablissementPreference"
      )
    
    private String nomEtablissementPreference;

    public void setNomEtablissementPreference(final String nomEtablissementPreference) {
        this.nomEtablissementPreference = nomEtablissementPreference;
    }

    
    @Column(name="nom_etablissement_preference"  )
      
    public String getNomEtablissementPreference() {
        return this.nomEtablissementPreference;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"demandeOrientationMedicoSociale"},
        message = "telephoneEtablissementPreference"
      )
    
      @NotNull(
        
        
        profiles = {"demandeOrientationMedicoSociale"},
        message = "telephoneEtablissementPreference"
      )
    
      @NotBlank(
        
        
        profiles = {"demandeOrientationMedicoSociale"},
        message = "telephoneEtablissementPreference"
      )
    
    private String telephoneEtablissementPreference;

    public void setTelephoneEtablissementPreference(final String telephoneEtablissementPreference) {
        this.telephoneEtablissementPreference = telephoneEtablissementPreference;
    }

    
    @Column(name="telephone_etablissement_preference" , length=10 )
      
    public String getTelephoneEtablissementPreference() {
        return this.telephoneEtablissementPreference;
    }
  
    
      @MaxLength(
        
          value = 5,
        
        
        profiles = {"demandeOrientationMedicoSociale"},
        message = "codePostalEtablissementPreference"
      )
    
      @NotNull(
        
        
        profiles = {"demandeOrientationMedicoSociale"},
        message = "codePostalEtablissementPreference"
      )
    
      @NotBlank(
        
        
        profiles = {"demandeOrientationMedicoSociale"},
        message = "codePostalEtablissementPreference"
      )
    
    private String codePostalEtablissementPreference;

    public void setCodePostalEtablissementPreference(final String codePostalEtablissementPreference) {
        this.codePostalEtablissementPreference = codePostalEtablissementPreference;
    }

    
    @Column(name="code_postal_etablissement_preference" , length=5 )
      
    public String getCodePostalEtablissementPreference() {
        return this.codePostalEtablissementPreference;
    }
  
}
