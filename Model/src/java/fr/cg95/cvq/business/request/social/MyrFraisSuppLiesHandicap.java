
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
 *  table="myr_frais_supp_lies_handicap"
 *  lazy="false"
 */
public class MyrFraisSuppLiesHandicap implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public MyrFraisSuppLiesHandicap() {
        super();
      
    }

    public final String modelToXmlString() {
        MyrFraisSuppLiesHandicapType object = (MyrFraisSuppLiesHandicapType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MyrFraisSuppLiesHandicapType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MyrFraisSuppLiesHandicapType myrFraisSuppLiesHandicap = MyrFraisSuppLiesHandicapType.Factory.newInstance();
        int i = 0;
    
        myrFraisSuppLiesHandicap.setNatureFrais(this.natureFrais);
      
        myrFraisSuppLiesHandicap.setResteAVotreCharge(this.resteAVotreCharge);
      
        myrFraisSuppLiesHandicap.setMontantsObtenus(this.montantsObtenus);
      
        if (this.periodicite != null)
            myrFraisSuppLiesHandicap.setPeriodicite(fr.cg95.cvq.xml.request.social.PeriodiciteFraisSuppType.Enum.forString(this.periodicite.toString()));
      
        myrFraisSuppLiesHandicap.setFinanceursSollicites(this.financeursSollicites);
      
        return myrFraisSuppLiesHandicap;
    }

    public static MyrFraisSuppLiesHandicap xmlToModel(MyrFraisSuppLiesHandicapType myrFraisSuppLiesHandicapDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MyrFraisSuppLiesHandicap myrFraisSuppLiesHandicap = new MyrFraisSuppLiesHandicap();
    
        myrFraisSuppLiesHandicap.setNatureFrais(myrFraisSuppLiesHandicapDoc.getNatureFrais());
      
        myrFraisSuppLiesHandicap.setResteAVotreCharge(myrFraisSuppLiesHandicapDoc.getResteAVotreCharge());
      
        myrFraisSuppLiesHandicap.setMontantsObtenus(myrFraisSuppLiesHandicapDoc.getMontantsObtenus());
      
        if (myrFraisSuppLiesHandicapDoc.getPeriodicite() != null)
            myrFraisSuppLiesHandicap.setPeriodicite(fr.cg95.cvq.business.request.social.PeriodiciteFraisSuppType.forString(myrFraisSuppLiesHandicapDoc.getPeriodicite().toString()));
        else
            myrFraisSuppLiesHandicap.setPeriodicite(fr.cg95.cvq.business.request.social.PeriodiciteFraisSuppType.getDefaultPeriodiciteFraisSuppType());
      
        myrFraisSuppLiesHandicap.setFinanceursSollicites(myrFraisSuppLiesHandicapDoc.getFinanceursSollicites());
      
        return myrFraisSuppLiesHandicap;
    }

    @Override
    public MyrFraisSuppLiesHandicap clone() {
        MyrFraisSuppLiesHandicap result = new MyrFraisSuppLiesHandicap();
        
          
            
        result.setNatureFrais(natureFrais);
      
          
        
          
            
        result.setResteAVotreCharge(resteAVotreCharge);
      
          
        
          
            
        result.setMontantsObtenus(montantsObtenus);
      
          
        
          
            
        if (periodicite != null)
            result.setPeriodicite(periodicite);
        else
            result.setPeriodicite(fr.cg95.cvq.business.request.social.PeriodiciteFraisSuppType.getDefaultPeriodiciteFraisSuppType());
      
          
        
          
            
        result.setFinanceursSollicites(financeursSollicites);
      
          
        
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
        message = "natureFrais"
      )
    
      @NotBlank(
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "natureFrais"
      )
    
    private String natureFrais;

    public final void setNatureFrais(final String natureFrais) {
        this.natureFrais = natureFrais;
    }

    /**
  
        * @hibernate.property
        *  column="nature_frais"
        
      
    */
    public final String getNatureFrais() {
        return this.natureFrais;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "resteAVotreCharge"
      )
    
      @NotNull(
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "resteAVotreCharge"
      )
    
      @MatchPattern(
        
          pattern = "[0-9]{0,7},[0-9]{2}$",
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "resteAVotreCharge"
      )
    
      @NotBlank(
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "resteAVotreCharge"
      )
    
    private String resteAVotreCharge;

    public final void setResteAVotreCharge(final String resteAVotreCharge) {
        this.resteAVotreCharge = resteAVotreCharge;
    }

    /**
  
        * @hibernate.property
        *  column="reste_a_votre_charge"
        *  length="10"
      
    */
    public final String getResteAVotreCharge() {
        return this.resteAVotreCharge;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "montantsObtenus"
      )
    
      @NotNull(
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "montantsObtenus"
      )
    
      @MatchPattern(
        
          pattern = "[0-9]{0,7},[0-9]{2}$",
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "montantsObtenus"
      )
    
      @NotBlank(
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "montantsObtenus"
      )
    
    private String montantsObtenus;

    public final void setMontantsObtenus(final String montantsObtenus) {
        this.montantsObtenus = montantsObtenus;
    }

    /**
  
        * @hibernate.property
        *  column="montants_obtenus"
        *  length="10"
      
    */
    public final String getMontantsObtenus() {
        return this.montantsObtenus;
    }
  
    
      @NotNull(
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "periodicite"
      )
    
    private fr.cg95.cvq.business.request.social.PeriodiciteFraisSuppType periodicite;

    public final void setPeriodicite(final fr.cg95.cvq.business.request.social.PeriodiciteFraisSuppType periodicite) {
        this.periodicite = periodicite;
    }

    /**
  
        * @hibernate.property
        *  column="periodicite"
        
      
    */
    public final fr.cg95.cvq.business.request.social.PeriodiciteFraisSuppType getPeriodicite() {
        return this.periodicite;
    }
  
    
      @NotNull(
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "financeursSollicites"
      )
    
      @NotBlank(
        
        
        profiles = {"allocationEducationEnfantHandicape"},
        message = "financeursSollicites"
      )
    
    private String financeursSollicites;

    public final void setFinanceursSollicites(final String financeursSollicites) {
        this.financeursSollicites = financeursSollicites;
    }

    /**
  
        * @hibernate.property
        *  column="financeurs_sollicites"
        
      
    */
    public final String getFinanceursSollicites() {
        return this.financeursSollicites;
    }
  
}
