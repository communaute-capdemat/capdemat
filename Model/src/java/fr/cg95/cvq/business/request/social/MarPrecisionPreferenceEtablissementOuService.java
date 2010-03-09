
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

/**
 * Generated class file, do not edit !
 *
 * @hibernate.class
 *  table="mar_precision_preference_etablissement_ou_service"
 *  lazy="false"
 */
public class MarPrecisionPreferenceEtablissementOuService implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

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

    /**
     * @hibernate.id
     *  column="id"
     *  generator-class="sequence"
     */
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

    public final void setCommuneEtablissementPreference(final String communeEtablissementPreference) {
        this.communeEtablissementPreference = communeEtablissementPreference;
    }

    /**
  
        * @hibernate.property
        *  column="commune_etablissement_preference"
        *  length="32"
      
    */
    public final String getCommuneEtablissementPreference() {
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

    public final void setNomEtablissementPreference(final String nomEtablissementPreference) {
        this.nomEtablissementPreference = nomEtablissementPreference;
    }

    /**
  
        * @hibernate.property
        *  column="nom_etablissement_preference"
        
      
    */
    public final String getNomEtablissementPreference() {
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

    public final void setTelephoneEtablissementPreference(final String telephoneEtablissementPreference) {
        this.telephoneEtablissementPreference = telephoneEtablissementPreference;
    }

    /**
  
        * @hibernate.property
        *  column="telephone_etablissement_preference"
        *  length="10"
      
    */
    public final String getTelephoneEtablissementPreference() {
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

    public final void setCodePostalEtablissementPreference(final String codePostalEtablissementPreference) {
        this.codePostalEtablissementPreference = codePostalEtablissementPreference;
    }

    /**
  
        * @hibernate.property
        *  column="code_postal_etablissement_preference"
        *  length="5"
      
    */
    public final String getCodePostalEtablissementPreference() {
        return this.codePostalEtablissementPreference;
    }
  
}
