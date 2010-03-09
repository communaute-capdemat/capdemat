
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
@Table(name="myr_preference_etablissement_ou_service_scolaire")
public class MyrPreferenceEtablissementOuServiceScolaire implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        MdphYouthRequest.conditions;

    public MyrPreferenceEtablissementOuServiceScolaire() {
        super();
      
    }

    public final String modelToXmlString() {
        MyrPreferenceEtablissementOuServiceScolaireType object = (MyrPreferenceEtablissementOuServiceScolaireType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MyrPreferenceEtablissementOuServiceScolaireType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MyrPreferenceEtablissementOuServiceScolaireType myrPreferenceEtablissementOuServiceScolaire = MyrPreferenceEtablissementOuServiceScolaireType.Factory.newInstance();
        int i = 0;
    
        myrPreferenceEtablissementOuServiceScolaire.setCodePostalPreferenceEtablissementOuService(this.codePostalPreferenceEtablissementOuService);
      
        myrPreferenceEtablissementOuServiceScolaire.setNomPreferenceEtablissementOuService(this.nomPreferenceEtablissementOuService);
      
        myrPreferenceEtablissementOuServiceScolaire.setCommunePreferenceEtablissementOuService(this.communePreferenceEtablissementOuService);
      
        return myrPreferenceEtablissementOuServiceScolaire;
    }

    public static MyrPreferenceEtablissementOuServiceScolaire xmlToModel(MyrPreferenceEtablissementOuServiceScolaireType myrPreferenceEtablissementOuServiceScolaireDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MyrPreferenceEtablissementOuServiceScolaire myrPreferenceEtablissementOuServiceScolaire = new MyrPreferenceEtablissementOuServiceScolaire();
    
        myrPreferenceEtablissementOuServiceScolaire.setCodePostalPreferenceEtablissementOuService(myrPreferenceEtablissementOuServiceScolaireDoc.getCodePostalPreferenceEtablissementOuService());
      
        myrPreferenceEtablissementOuServiceScolaire.setNomPreferenceEtablissementOuService(myrPreferenceEtablissementOuServiceScolaireDoc.getNomPreferenceEtablissementOuService());
      
        myrPreferenceEtablissementOuServiceScolaire.setCommunePreferenceEtablissementOuService(myrPreferenceEtablissementOuServiceScolaireDoc.getCommunePreferenceEtablissementOuService());
      
        return myrPreferenceEtablissementOuServiceScolaire;
    }

    @Override
    public MyrPreferenceEtablissementOuServiceScolaire clone() {
        MyrPreferenceEtablissementOuServiceScolaire result = new MyrPreferenceEtablissementOuServiceScolaire();
        
          
            
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
