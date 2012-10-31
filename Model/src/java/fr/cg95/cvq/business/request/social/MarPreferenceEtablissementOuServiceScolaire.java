
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
@Table(name="mar_preference_etablissement_ou_service_scolaire")
public class MarPreferenceEtablissementOuServiceScolaire implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        MdphAdultRequest.conditions;

    public MarPreferenceEtablissementOuServiceScolaire() {
        super();
      
    }

    public final String modelToXmlString() {
        MarPreferenceEtablissementOuServiceScolaireType object = (MarPreferenceEtablissementOuServiceScolaireType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MarPreferenceEtablissementOuServiceScolaireType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MarPreferenceEtablissementOuServiceScolaireType marPreferenceEtablissementOuServiceScolaire = MarPreferenceEtablissementOuServiceScolaireType.Factory.newInstance();
        int i = 0;
    
        marPreferenceEtablissementOuServiceScolaire.setCodePostalPreferenceEtablissementOuService(this.codePostalPreferenceEtablissementOuService);
      
        marPreferenceEtablissementOuServiceScolaire.setNomPreferenceEtablissementOuService(this.nomPreferenceEtablissementOuService);
      
        marPreferenceEtablissementOuServiceScolaire.setCommunePreferenceEtablissementOuService(this.communePreferenceEtablissementOuService);
      
        return marPreferenceEtablissementOuServiceScolaire;
    }

    public static MarPreferenceEtablissementOuServiceScolaire xmlToModel(MarPreferenceEtablissementOuServiceScolaireType marPreferenceEtablissementOuServiceScolaireDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MarPreferenceEtablissementOuServiceScolaire marPreferenceEtablissementOuServiceScolaire = new MarPreferenceEtablissementOuServiceScolaire();
    
        marPreferenceEtablissementOuServiceScolaire.setCodePostalPreferenceEtablissementOuService(marPreferenceEtablissementOuServiceScolaireDoc.getCodePostalPreferenceEtablissementOuService());
      
        marPreferenceEtablissementOuServiceScolaire.setNomPreferenceEtablissementOuService(marPreferenceEtablissementOuServiceScolaireDoc.getNomPreferenceEtablissementOuService());
      
        marPreferenceEtablissementOuServiceScolaire.setCommunePreferenceEtablissementOuService(marPreferenceEtablissementOuServiceScolaireDoc.getCommunePreferenceEtablissementOuService());
      
        return marPreferenceEtablissementOuServiceScolaire;
    }

    @Override
    public MarPreferenceEtablissementOuServiceScolaire clone() {
        MarPreferenceEtablissementOuServiceScolaire result = new MarPreferenceEtablissementOuServiceScolaire();
        
          
            
        result.setCodePostalPreferenceEtablissementOuService(codePostalPreferenceEtablissementOuService);
      
          
        
          
            
        result.setNomPreferenceEtablissementOuService(nomPreferenceEtablissementOuService);
      
          
        
          
            
        result.setCommunePreferenceEtablissementOuService(communePreferenceEtablissementOuService);
      
          
        
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
        
          value = 5,
        
        
        profiles = {"demandeParcoursScolaireEtFormation"},
        message = "codePostalPreferenceEtablissementOuService"
      )
    
      @NotNull(
        
        
        profiles = {"demandeParcoursScolaireEtFormation"},
        message = "codePostalPreferenceEtablissementOuService"
      )
    
      @NotBlank(
        
        
        profiles = {"demandeParcoursScolaireEtFormation"},
        message = "codePostalPreferenceEtablissementOuService"
      )
    
    private String codePostalPreferenceEtablissementOuService;

    public void setCodePostalPreferenceEtablissementOuService(final String codePostalPreferenceEtablissementOuService) {
        this.codePostalPreferenceEtablissementOuService = codePostalPreferenceEtablissementOuService;
    }

    
    @Column(name="code_postal_preference_etablissement_ou_service" , length=5 )
      
    public String getCodePostalPreferenceEtablissementOuService() {
        return this.codePostalPreferenceEtablissementOuService;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandeParcoursScolaireEtFormation"},
        message = "nomPreferenceEtablissementOuService"
      )
    
      @NotBlank(
        
        
        profiles = {"demandeParcoursScolaireEtFormation"},
        message = "nomPreferenceEtablissementOuService"
      )
    
    private String nomPreferenceEtablissementOuService;

    public void setNomPreferenceEtablissementOuService(final String nomPreferenceEtablissementOuService) {
        this.nomPreferenceEtablissementOuService = nomPreferenceEtablissementOuService;
    }

    
    @Column(name="nom_preference_etablissement_ou_service"  )
      
    public String getNomPreferenceEtablissementOuService() {
        return this.nomPreferenceEtablissementOuService;
    }
  
    
      @MaxLength(
        
          value = 32,
        
        
        profiles = {"demandeParcoursScolaireEtFormation"},
        message = "communePreferenceEtablissementOuService"
      )
    
      @NotNull(
        
        
        profiles = {"demandeParcoursScolaireEtFormation"},
        message = "communePreferenceEtablissementOuService"
      )
    
      @NotBlank(
        
        
        profiles = {"demandeParcoursScolaireEtFormation"},
        message = "communePreferenceEtablissementOuService"
      )
    
    private String communePreferenceEtablissementOuService;

    public void setCommunePreferenceEtablissementOuService(final String communePreferenceEtablissementOuService) {
        this.communePreferenceEtablissementOuService = communePreferenceEtablissementOuService;
    }

    
    @Column(name="commune_preference_etablissement_ou_service" , length=32 )
      
    public String getCommunePreferenceEtablissementOuService() {
        return this.communePreferenceEtablissementOuService;
    }
  
}
