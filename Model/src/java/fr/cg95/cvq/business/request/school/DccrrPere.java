
package fr.cg95.cvq.business.request.school;

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
import fr.cg95.cvq.xml.request.school.*;
import fr.cg95.cvq.service.request.LocalReferential;
import fr.cg95.cvq.service.request.condition.IConditionChecker;

/**
 * Generated class file, do not edit !
 *
 * @hibernate.class
 *  table="dccrr_pere"
 *  lazy="false"
 */
public class DccrrPere implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public DccrrPere() {
        super();
      
        estHorairesReguliersPere = Boolean.valueOf(true);
      
    }

    public final String modelToXmlString() {
        DccrrPereType object = (DccrrPereType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final DccrrPereType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        DccrrPereType dccrrPere = DccrrPereType.Factory.newInstance();
        int i = 0;
    
        dccrrPere.setHorairesTravailMardiPere(this.horairesTravailMardiPere);
      
        dccrrPere.setPrecisionAutreSituationActuellePere(this.precisionAutreSituationActuellePere);
      
        dccrrPere.setHorairesTravailMercrediPere(this.horairesTravailMercrediPere);
      
        dccrrPere.setCommuneLieuTravailPere(this.communeLieuTravailPere);
      
        if (this.estHorairesReguliersPere != null)
            dccrrPere.setEstHorairesReguliersPere(this.estHorairesReguliersPere.booleanValue());
      
        dccrrPere.setProfessionPere(this.professionPere);
      
        dccrrPere.setHorairesTravailLundiPere(this.horairesTravailLundiPere);
      
        dccrrPere.setHorairesTravailVendrediPere(this.horairesTravailVendrediPere);
      
        dccrrPere.setHorairesReguliersPere(this.horairesReguliersPere);
      
        if (this.situationActuellePere != null)
            dccrrPere.setSituationActuellePere(fr.cg95.cvq.xml.request.school.ChoixSituationActuelle.Enum.forString(this.situationActuellePere.toString()));
      
        dccrrPere.setHorairesTravailJeudiPere(this.horairesTravailJeudiPere);
      
        return dccrrPere;
    }

    public static DccrrPere xmlToModel(DccrrPereType dccrrPereDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        DccrrPere dccrrPere = new DccrrPere();
    
        dccrrPere.setHorairesTravailMardiPere(dccrrPereDoc.getHorairesTravailMardiPere());
      
        dccrrPere.setPrecisionAutreSituationActuellePere(dccrrPereDoc.getPrecisionAutreSituationActuellePere());
      
        dccrrPere.setHorairesTravailMercrediPere(dccrrPereDoc.getHorairesTravailMercrediPere());
      
        dccrrPere.setCommuneLieuTravailPere(dccrrPereDoc.getCommuneLieuTravailPere());
      
        dccrrPere.setEstHorairesReguliersPere(Boolean.valueOf(dccrrPereDoc.getEstHorairesReguliersPere()));
      
        dccrrPere.setProfessionPere(dccrrPereDoc.getProfessionPere());
      
        dccrrPere.setHorairesTravailLundiPere(dccrrPereDoc.getHorairesTravailLundiPere());
      
        dccrrPere.setHorairesTravailVendrediPere(dccrrPereDoc.getHorairesTravailVendrediPere());
      
        dccrrPere.setHorairesReguliersPere(dccrrPereDoc.getHorairesReguliersPere());
      
        if (dccrrPereDoc.getSituationActuellePere() != null)
            dccrrPere.setSituationActuellePere(fr.cg95.cvq.business.request.school.ChoixSituationActuelle.forString(dccrrPereDoc.getSituationActuellePere().toString()));
        else
            dccrrPere.setSituationActuellePere(fr.cg95.cvq.business.request.school.ChoixSituationActuelle.getDefaultChoixSituationActuelle());
      
        dccrrPere.setHorairesTravailJeudiPere(dccrrPereDoc.getHorairesTravailJeudiPere());
      
        return dccrrPere;
    }

    @Override
    public DccrrPere clone() {
        DccrrPere result = new DccrrPere();
        
          
            
        result.setHorairesTravailMardiPere(horairesTravailMardiPere);
      
          
        
          
            
        result.setPrecisionAutreSituationActuellePere(precisionAutreSituationActuellePere);
      
          
        
          
            
        result.setHorairesTravailMercrediPere(horairesTravailMercrediPere);
      
          
        
          
            
        result.setCommuneLieuTravailPere(communeLieuTravailPere);
      
          
        
          
            
        result.setEstHorairesReguliersPere(estHorairesReguliersPere);
      
          
        
          
            
        result.setProfessionPere(professionPere);
      
          
        
          
            
        result.setHorairesTravailLundiPere(horairesTravailLundiPere);
      
          
        
          
            
        result.setHorairesTravailVendrediPere(horairesTravailVendrediPere);
      
          
        
          
            
        result.setHorairesReguliersPere(horairesReguliersPere);
      
          
        
          
            
        if (situationActuellePere != null)
            result.setSituationActuellePere(situationActuellePere);
        else
            result.setSituationActuellePere(fr.cg95.cvq.business.request.school.ChoixSituationActuelle.getDefaultChoixSituationActuelle());
      
          
        
          
            
        result.setHorairesTravailJeudiPere(horairesTravailJeudiPere);
      
          
        
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

  
    
    private String horairesTravailMardiPere;

    public final void setHorairesTravailMardiPere(final String horairesTravailMardiPere) {
        this.horairesTravailMardiPere = horairesTravailMardiPere;
    }

    /**
  
        * @hibernate.property
        *  column="horaires_travail_mardi_pere"
        
      
    */
    public final String getHorairesTravailMardiPere() {
        return this.horairesTravailMardiPere;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dccrrPere.situationActuellePere'].test(_this.situationActuellePere.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "precisionAutreSituationActuellePere"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dccrrPere.situationActuellePere'].test(_this.situationActuellePere.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "precisionAutreSituationActuellePere"
      )
    
    private String precisionAutreSituationActuellePere;

    public final void setPrecisionAutreSituationActuellePere(final String precisionAutreSituationActuellePere) {
        this.precisionAutreSituationActuellePere = precisionAutreSituationActuellePere;
    }

    /**
  
        * @hibernate.property
        *  column="precision_autre_situation_actuelle_pere"
        
      
    */
    public final String getPrecisionAutreSituationActuellePere() {
        return this.precisionAutreSituationActuellePere;
    }
  
    
    private String horairesTravailMercrediPere;

    public final void setHorairesTravailMercrediPere(final String horairesTravailMercrediPere) {
        this.horairesTravailMercrediPere = horairesTravailMercrediPere;
    }

    /**
  
        * @hibernate.property
        *  column="horaires_travail_mercredi_pere"
        
      
    */
    public final String getHorairesTravailMercrediPere() {
        return this.horairesTravailMercrediPere;
    }
  
    
    private String communeLieuTravailPere;

    public final void setCommuneLieuTravailPere(final String communeLieuTravailPere) {
        this.communeLieuTravailPere = communeLieuTravailPere;
    }

    /**
  
        * @hibernate.property
        *  column="commune_lieu_travail_pere"
        
      
    */
    public final String getCommuneLieuTravailPere() {
        return this.communeLieuTravailPere;
    }
  
    
    private Boolean estHorairesReguliersPere;

    public final void setEstHorairesReguliersPere(final Boolean estHorairesReguliersPere) {
        this.estHorairesReguliersPere = estHorairesReguliersPere;
    }

    /**
  
        * @hibernate.property
        *  column="est_horaires_reguliers_pere"
        
      
    */
    public final Boolean getEstHorairesReguliersPere() {
        return this.estHorairesReguliersPere;
    }
  
    
    private String professionPere;

    public final void setProfessionPere(final String professionPere) {
        this.professionPere = professionPere;
    }

    /**
  
        * @hibernate.property
        *  column="profession_pere"
        
      
    */
    public final String getProfessionPere() {
        return this.professionPere;
    }
  
    
    private String horairesTravailLundiPere;

    public final void setHorairesTravailLundiPere(final String horairesTravailLundiPere) {
        this.horairesTravailLundiPere = horairesTravailLundiPere;
    }

    /**
  
        * @hibernate.property
        *  column="horaires_travail_lundi_pere"
        
      
    */
    public final String getHorairesTravailLundiPere() {
        return this.horairesTravailLundiPere;
    }
  
    
    private String horairesTravailVendrediPere;

    public final void setHorairesTravailVendrediPere(final String horairesTravailVendrediPere) {
        this.horairesTravailVendrediPere = horairesTravailVendrediPere;
    }

    /**
  
        * @hibernate.property
        *  column="horaires_travail_vendredi_pere"
        
      
    */
    public final String getHorairesTravailVendrediPere() {
        return this.horairesTravailVendrediPere;
    }
  
    
    private String horairesReguliersPere;

    public final void setHorairesReguliersPere(final String horairesReguliersPere) {
        this.horairesReguliersPere = horairesReguliersPere;
    }

    /**
  
        * @hibernate.property
        *  column="horaires_reguliers_pere"
        
      
    */
    public final String getHorairesReguliersPere() {
        return this.horairesReguliersPere;
    }
  
    
    private fr.cg95.cvq.business.request.school.ChoixSituationActuelle situationActuellePere;

    public final void setSituationActuellePere(final fr.cg95.cvq.business.request.school.ChoixSituationActuelle situationActuellePere) {
        this.situationActuellePere = situationActuellePere;
    }

    /**
  
        * @hibernate.property
        *  column="situation_actuelle_pere"
        
      
    */
    public final fr.cg95.cvq.business.request.school.ChoixSituationActuelle getSituationActuellePere() {
        return this.situationActuellePere;
    }
  
    
    private String horairesTravailJeudiPere;

    public final void setHorairesTravailJeudiPere(final String horairesTravailJeudiPere) {
        this.horairesTravailJeudiPere = horairesTravailJeudiPere;
    }

    /**
  
        * @hibernate.property
        *  column="horaires_travail_jeudi_pere"
        
      
    */
    public final String getHorairesTravailJeudiPere() {
        return this.horairesTravailJeudiPere;
    }
  
}
