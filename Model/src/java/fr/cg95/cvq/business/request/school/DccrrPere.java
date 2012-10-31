
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
import javax.persistence.*;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Type;

/**
 * Generated class file, do not edit !
 */
@Entity
@Table(name="dccrr_pere")
public class DccrrPere implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        DayCareCenterRegistrationRequest.conditions;

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
            dccrrPere.setSituationActuellePere(fr.cg95.cvq.xml.request.school.ChoixSituationActuelle.Enum.forString(this.situationActuellePere.getLegacyLabel()));
      
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

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    public final Long getId() {
        return this.id;
    }

  
    
    private String horairesTravailMardiPere;

    public void setHorairesTravailMardiPere(final String horairesTravailMardiPere) {
        this.horairesTravailMardiPere = horairesTravailMardiPere;
    }

    
    @Column(name="horaires_travail_mardi_pere"  )
      
    public String getHorairesTravailMardiPere() {
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

    public void setPrecisionAutreSituationActuellePere(final String precisionAutreSituationActuellePere) {
        this.precisionAutreSituationActuellePere = precisionAutreSituationActuellePere;
    }

    
    @Column(name="precision_autre_situation_actuelle_pere"  )
      
    public String getPrecisionAutreSituationActuellePere() {
        return this.precisionAutreSituationActuellePere;
    }
  
    
    private String horairesTravailMercrediPere;

    public void setHorairesTravailMercrediPere(final String horairesTravailMercrediPere) {
        this.horairesTravailMercrediPere = horairesTravailMercrediPere;
    }

    
    @Column(name="horaires_travail_mercredi_pere"  )
      
    public String getHorairesTravailMercrediPere() {
        return this.horairesTravailMercrediPere;
    }
  
    
    private String communeLieuTravailPere;

    public void setCommuneLieuTravailPere(final String communeLieuTravailPere) {
        this.communeLieuTravailPere = communeLieuTravailPere;
    }

    
    @Column(name="commune_lieu_travail_pere"  )
      
    public String getCommuneLieuTravailPere() {
        return this.communeLieuTravailPere;
    }
  
    
    private Boolean estHorairesReguliersPere;

    public void setEstHorairesReguliersPere(final Boolean estHorairesReguliersPere) {
        this.estHorairesReguliersPere = estHorairesReguliersPere;
    }

    
    @Column(name="est_horaires_reguliers_pere"  )
      
    public Boolean getEstHorairesReguliersPere() {
        return this.estHorairesReguliersPere;
    }
  
    
    private String professionPere;

    public void setProfessionPere(final String professionPere) {
        this.professionPere = professionPere;
    }

    
    @Column(name="profession_pere"  )
      
    public String getProfessionPere() {
        return this.professionPere;
    }
  
    
    private String horairesTravailLundiPere;

    public void setHorairesTravailLundiPere(final String horairesTravailLundiPere) {
        this.horairesTravailLundiPere = horairesTravailLundiPere;
    }

    
    @Column(name="horaires_travail_lundi_pere"  )
      
    public String getHorairesTravailLundiPere() {
        return this.horairesTravailLundiPere;
    }
  
    
    private String horairesTravailVendrediPere;

    public void setHorairesTravailVendrediPere(final String horairesTravailVendrediPere) {
        this.horairesTravailVendrediPere = horairesTravailVendrediPere;
    }

    
    @Column(name="horaires_travail_vendredi_pere"  )
      
    public String getHorairesTravailVendrediPere() {
        return this.horairesTravailVendrediPere;
    }
  
    
    private String horairesReguliersPere;

    public void setHorairesReguliersPere(final String horairesReguliersPere) {
        this.horairesReguliersPere = horairesReguliersPere;
    }

    
    @Column(name="horaires_reguliers_pere"  )
      
    public String getHorairesReguliersPere() {
        return this.horairesReguliersPere;
    }
  
    
    private fr.cg95.cvq.business.request.school.ChoixSituationActuelle situationActuellePere;

    public void setSituationActuellePere(final fr.cg95.cvq.business.request.school.ChoixSituationActuelle situationActuellePere) {
        this.situationActuellePere = situationActuellePere;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="situation_actuelle_pere"  )
      
    public fr.cg95.cvq.business.request.school.ChoixSituationActuelle getSituationActuellePere() {
        return this.situationActuellePere;
    }
  
    
    private String horairesTravailJeudiPere;

    public void setHorairesTravailJeudiPere(final String horairesTravailJeudiPere) {
        this.horairesTravailJeudiPere = horairesTravailJeudiPere;
    }

    
    @Column(name="horaires_travail_jeudi_pere"  )
      
    public String getHorairesTravailJeudiPere() {
        return this.horairesTravailJeudiPere;
    }
  
}
