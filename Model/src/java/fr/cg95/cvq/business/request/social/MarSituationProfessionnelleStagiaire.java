
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
 *  table="mar_situation_professionnelle_stagiaire"
 *  lazy="false"
 */
public class MarSituationProfessionnelleStagiaire implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public MarSituationProfessionnelleStagiaire() {
        super();
      
    }

    public final String modelToXmlString() {
        MarSituationProfessionnelleStagiaireType object = (MarSituationProfessionnelleStagiaireType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MarSituationProfessionnelleStagiaireType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MarSituationProfessionnelleStagiaireType marSituationProfessionnelleStagiaire = MarSituationProfessionnelleStagiaireType.Factory.newInstance();
        int i = 0;
    
        if (this.stageRenumeration != null)
            marSituationProfessionnelleStagiaire.setStageRenumeration(this.stageRenumeration.booleanValue());
      
        marSituationProfessionnelleStagiaire.setNomEmployeurStage(this.nomEmployeurStage);
      
        marSituationProfessionnelleStagiaire.setTelephoneEmployeurStage(this.telephoneEmployeurStage);
      
        if (this.adresseEmployeurStage != null)
            marSituationProfessionnelleStagiaire.setAdresseEmployeurStage(this.adresseEmployeurStage.modelToXml());
      
        date = this.stagiaireDepuisLe;
        if (date != null) {
            calendar.setTime(date);
            marSituationProfessionnelleStagiaire.setStagiaireDepuisLe(calendar);
        }
      
        return marSituationProfessionnelleStagiaire;
    }

    public static MarSituationProfessionnelleStagiaire xmlToModel(MarSituationProfessionnelleStagiaireType marSituationProfessionnelleStagiaireDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MarSituationProfessionnelleStagiaire marSituationProfessionnelleStagiaire = new MarSituationProfessionnelleStagiaire();
    
        marSituationProfessionnelleStagiaire.setStageRenumeration(Boolean.valueOf(marSituationProfessionnelleStagiaireDoc.getStageRenumeration()));
      
        marSituationProfessionnelleStagiaire.setNomEmployeurStage(marSituationProfessionnelleStagiaireDoc.getNomEmployeurStage());
      
        marSituationProfessionnelleStagiaire.setTelephoneEmployeurStage(marSituationProfessionnelleStagiaireDoc.getTelephoneEmployeurStage());
      
        if (marSituationProfessionnelleStagiaireDoc.getAdresseEmployeurStage() != null)
            marSituationProfessionnelleStagiaire.setAdresseEmployeurStage(Address.xmlToModel(marSituationProfessionnelleStagiaireDoc.getAdresseEmployeurStage()));
      
        calendar = marSituationProfessionnelleStagiaireDoc.getStagiaireDepuisLe();
        if (calendar != null) {
            marSituationProfessionnelleStagiaire.setStagiaireDepuisLe(calendar.getTime());
        }
      
        return marSituationProfessionnelleStagiaire;
    }

    @Override
    public MarSituationProfessionnelleStagiaire clone() {
        MarSituationProfessionnelleStagiaire result = new MarSituationProfessionnelleStagiaire();
        
          
            
        result.setStageRenumeration(stageRenumeration);
      
          
        
          
            
        result.setNomEmployeurStage(nomEmployeurStage);
      
          
        
          
            
        result.setTelephoneEmployeurStage(telephoneEmployeurStage);
      
          
        
          
            
        if (adresseEmployeurStage != null)
            result.setAdresseEmployeurStage(adresseEmployeurStage.clone());
      
          
        
          
            
        result.setStagiaireDepuisLe(stagiaireDepuisLe);
      
          
        
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

  
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "stageRenumeration"
      )
    
    private Boolean stageRenumeration;

    public final void setStageRenumeration(final Boolean stageRenumeration) {
        this.stageRenumeration = stageRenumeration;
    }

    /**
  
        * @hibernate.property
        *  column="stage_renumeration"
        
      
    */
    public final Boolean getStageRenumeration() {
        return this.stageRenumeration;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"situationProfessionnelle"},
        message = "nomEmployeurStage"
      )
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "nomEmployeurStage"
      )
    
      @NotBlank(
        
        
        profiles = {"situationProfessionnelle"},
        message = "nomEmployeurStage"
      )
    
    private String nomEmployeurStage;

    public final void setNomEmployeurStage(final String nomEmployeurStage) {
        this.nomEmployeurStage = nomEmployeurStage;
    }

    /**
  
        * @hibernate.property
        *  column="nom_employeur_stage"
        *  length="38"
      
    */
    public final String getNomEmployeurStage() {
        return this.nomEmployeurStage;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"situationProfessionnelle"},
        message = "telephoneEmployeurStage"
      )
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "telephoneEmployeurStage"
      )
    
      @NotBlank(
        
        
        profiles = {"situationProfessionnelle"},
        message = "telephoneEmployeurStage"
      )
    
    private String telephoneEmployeurStage;

    public final void setTelephoneEmployeurStage(final String telephoneEmployeurStage) {
        this.telephoneEmployeurStage = telephoneEmployeurStage;
    }

    /**
  
        * @hibernate.property
        *  column="telephone_employeur_stage"
        *  length="10"
      
    */
    public final String getTelephoneEmployeurStage() {
        return this.telephoneEmployeurStage;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "adresseEmployeurStage"
      )
    
      @AssertValid(
        
        
        profiles = {"situationProfessionnelle"},
        message = "adresseEmployeurStage"
      )
    
    private fr.cg95.cvq.business.users.Address adresseEmployeurStage;

    public final void setAdresseEmployeurStage(final fr.cg95.cvq.business.users.Address adresseEmployeurStage) {
        this.adresseEmployeurStage = adresseEmployeurStage;
    }

    /**
  
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="adresse_employeur_stage_id"
        *  class="fr.cg95.cvq.business.users.Address"
      
    */
    public final fr.cg95.cvq.business.users.Address getAdresseEmployeurStage() {
        return this.adresseEmployeurStage;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "stagiaireDepuisLe"
      )
    
    private java.util.Date stagiaireDepuisLe;

    public final void setStagiaireDepuisLe(final java.util.Date stagiaireDepuisLe) {
        this.stagiaireDepuisLe = stagiaireDepuisLe;
    }

    /**
  
        * @hibernate.property
        *  column="stagiaire_depuis_le"
        
      
    */
    public final java.util.Date getStagiaireDepuisLe() {
        return this.stagiaireDepuisLe;
    }
  
}
