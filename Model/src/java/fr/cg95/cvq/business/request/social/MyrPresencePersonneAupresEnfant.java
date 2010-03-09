
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
 *  table="myr_presence_personne_aupres_enfant"
 *  lazy="false"
 */
public class MyrPresencePersonneAupresEnfant implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public MyrPresencePersonneAupresEnfant() {
        super();
      
        exerciceActiviteProfessionnelle = Boolean.valueOf(false);
      
    }

    public final String modelToXmlString() {
        MyrPresencePersonneAupresEnfantType object = (MyrPresencePersonneAupresEnfantType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MyrPresencePersonneAupresEnfantType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MyrPresencePersonneAupresEnfantType myrPresencePersonneAupresEnfant = MyrPresencePersonneAupresEnfantType.Factory.newInstance();
        int i = 0;
    
        if (this.exerciceActiviteProfessionnelle != null)
            myrPresencePersonneAupresEnfant.setExerciceActiviteProfessionnelle(this.exerciceActiviteProfessionnelle.booleanValue());
      
        myrPresencePersonneAupresEnfant.setRecoursEmploiRemunereTiercePersonne(this.recoursEmploiRemunereTiercePersonne);
      
        myrPresencePersonneAupresEnfant.setNbHeureParAnEmploiNonRegulier(this.nbHeureParAnEmploiNonRegulier);
      
        return myrPresencePersonneAupresEnfant;
    }

    public static MyrPresencePersonneAupresEnfant xmlToModel(MyrPresencePersonneAupresEnfantType myrPresencePersonneAupresEnfantDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MyrPresencePersonneAupresEnfant myrPresencePersonneAupresEnfant = new MyrPresencePersonneAupresEnfant();
    
        myrPresencePersonneAupresEnfant.setExerciceActiviteProfessionnelle(Boolean.valueOf(myrPresencePersonneAupresEnfantDoc.getExerciceActiviteProfessionnelle()));
      
        myrPresencePersonneAupresEnfant.setRecoursEmploiRemunereTiercePersonne(myrPresencePersonneAupresEnfantDoc.getRecoursEmploiRemunereTiercePersonne());
      
        myrPresencePersonneAupresEnfant.setNbHeureParAnEmploiNonRegulier(myrPresencePersonneAupresEnfantDoc.getNbHeureParAnEmploiNonRegulier());
      
        return myrPresencePersonneAupresEnfant;
    }

    @Override
    public MyrPresencePersonneAupresEnfant clone() {
        MyrPresencePersonneAupresEnfant result = new MyrPresencePersonneAupresEnfant();
        
          
            
        result.setExerciceActiviteProfessionnelle(exerciceActiviteProfessionnelle);
      
          
        
          
            
        result.setRecoursEmploiRemunereTiercePersonne(recoursEmploiRemunereTiercePersonne);
      
          
        
          
            
        result.setNbHeureParAnEmploiNonRegulier(nbHeureParAnEmploiNonRegulier);
      
          
        
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
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "exerciceActiviteProfessionnelle"
      )
    
    private Boolean exerciceActiviteProfessionnelle;

    public final void setExerciceActiviteProfessionnelle(final Boolean exerciceActiviteProfessionnelle) {
        this.exerciceActiviteProfessionnelle = exerciceActiviteProfessionnelle;
    }

    /**
  
        * @hibernate.property
        *  column="exercice_activite_professionnelle"
        
      
    */
    public final Boolean getExerciceActiviteProfessionnelle() {
        return this.exerciceActiviteProfessionnelle;
    }
  
    
      @MaxLength(
        
          value = 3,
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "recoursEmploiRemunereTiercePersonne"
      )
    
      @MatchPattern(
        
          pattern = "[0-9]{0,3}",
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "recoursEmploiRemunereTiercePersonne"
      )
    
    private String recoursEmploiRemunereTiercePersonne;

    public final void setRecoursEmploiRemunereTiercePersonne(final String recoursEmploiRemunereTiercePersonne) {
        this.recoursEmploiRemunereTiercePersonne = recoursEmploiRemunereTiercePersonne;
    }

    /**
  
        * @hibernate.property
        *  column="recours_emploi_remunere_tierce_personne"
        *  length="3"
      
    */
    public final String getRecoursEmploiRemunereTiercePersonne() {
        return this.recoursEmploiRemunereTiercePersonne;
    }
  
    
      @MaxLength(
        
          value = 3,
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "nbHeureParAnEmploiNonRegulier"
      )
    
      @MatchPattern(
        
          pattern = "[0-9]{0,3}",
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "nbHeureParAnEmploiNonRegulier"
      )
    
    private String nbHeureParAnEmploiNonRegulier;

    public final void setNbHeureParAnEmploiNonRegulier(final String nbHeureParAnEmploiNonRegulier) {
        this.nbHeureParAnEmploiNonRegulier = nbHeureParAnEmploiNonRegulier;
    }

    /**
  
        * @hibernate.property
        *  column="nb_heure_par_an_emploi_non_regulier"
        *  length="3"
      
    */
    public final String getNbHeureParAnEmploiNonRegulier() {
        return this.nbHeureParAnEmploiNonRegulier;
    }
  
}
