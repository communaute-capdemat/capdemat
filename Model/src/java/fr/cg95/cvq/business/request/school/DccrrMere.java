
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
@Table(name="dccrr_mere")
public class DccrrMere implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        DayCareCenterRegistrationRequest.conditions;

    public DccrrMere() {
        super();
      
        estHorairesReguliersMere = Boolean.valueOf(true);
      
    }

    public final String modelToXmlString() {
        DccrrMereType object = (DccrrMereType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final DccrrMereType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        DccrrMereType dccrrMere = DccrrMereType.Factory.newInstance();
        int i = 0;
    
        dccrrMere.setHorairesReguliersMere(this.horairesReguliersMere);
      
        dccrrMere.setHorairesTravailJeudiMere(this.horairesTravailJeudiMere);
      
        if (this.estHorairesReguliersMere != null)
            dccrrMere.setEstHorairesReguliersMere(this.estHorairesReguliersMere.booleanValue());
      
        dccrrMere.setHorairesTravailMardiMere(this.horairesTravailMardiMere);
      
        dccrrMere.setHorairesTravailVendrediMere(this.horairesTravailVendrediMere);
      
        dccrrMere.setProfessionMere(this.professionMere);
      
        if (this.situationActuelleMere != null)
            dccrrMere.setSituationActuelleMere(fr.cg95.cvq.xml.request.school.ChoixSituationActuelle.Enum.forString(this.situationActuelleMere.getLegacyLabel()));
      
        dccrrMere.setHorairesTravailMercrediMere(this.horairesTravailMercrediMere);
      
        dccrrMere.setCommuneLieuTravailMere(this.communeLieuTravailMere);
      
        dccrrMere.setPrecisionAutreSituationActuelleMere(this.precisionAutreSituationActuelleMere);
      
        dccrrMere.setHorairesTravailLundiMere(this.horairesTravailLundiMere);
      
        return dccrrMere;
    }

    public static DccrrMere xmlToModel(DccrrMereType dccrrMereDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        DccrrMere dccrrMere = new DccrrMere();
    
        dccrrMere.setHorairesReguliersMere(dccrrMereDoc.getHorairesReguliersMere());
      
        dccrrMere.setHorairesTravailJeudiMere(dccrrMereDoc.getHorairesTravailJeudiMere());
      
        dccrrMere.setEstHorairesReguliersMere(Boolean.valueOf(dccrrMereDoc.getEstHorairesReguliersMere()));
      
        dccrrMere.setHorairesTravailMardiMere(dccrrMereDoc.getHorairesTravailMardiMere());
      
        dccrrMere.setHorairesTravailVendrediMere(dccrrMereDoc.getHorairesTravailVendrediMere());
      
        dccrrMere.setProfessionMere(dccrrMereDoc.getProfessionMere());
      
        if (dccrrMereDoc.getSituationActuelleMere() != null)
            dccrrMere.setSituationActuelleMere(fr.cg95.cvq.business.request.school.ChoixSituationActuelle.forString(dccrrMereDoc.getSituationActuelleMere().toString()));
        else
            dccrrMere.setSituationActuelleMere(fr.cg95.cvq.business.request.school.ChoixSituationActuelle.getDefaultChoixSituationActuelle());
      
        dccrrMere.setHorairesTravailMercrediMere(dccrrMereDoc.getHorairesTravailMercrediMere());
      
        dccrrMere.setCommuneLieuTravailMere(dccrrMereDoc.getCommuneLieuTravailMere());
      
        dccrrMere.setPrecisionAutreSituationActuelleMere(dccrrMereDoc.getPrecisionAutreSituationActuelleMere());
      
        dccrrMere.setHorairesTravailLundiMere(dccrrMereDoc.getHorairesTravailLundiMere());
      
        return dccrrMere;
    }

    @Override
    public DccrrMere clone() {
        DccrrMere result = new DccrrMere();
        
          
            
        result.setHorairesReguliersMere(horairesReguliersMere);
      
          
        
          
            
        result.setHorairesTravailJeudiMere(horairesTravailJeudiMere);
      
          
        
          
            
        result.setEstHorairesReguliersMere(estHorairesReguliersMere);
      
          
        
          
            
        result.setHorairesTravailMardiMere(horairesTravailMardiMere);
      
          
        
          
            
        result.setHorairesTravailVendrediMere(horairesTravailVendrediMere);
      
          
        
          
            
        result.setProfessionMere(professionMere);
      
          
        
          
            
        if (situationActuelleMere != null)
            result.setSituationActuelleMere(situationActuelleMere);
        else
            result.setSituationActuelleMere(fr.cg95.cvq.business.request.school.ChoixSituationActuelle.getDefaultChoixSituationActuelle());
      
          
        
          
            
        result.setHorairesTravailMercrediMere(horairesTravailMercrediMere);
      
          
        
          
            
        result.setCommuneLieuTravailMere(communeLieuTravailMere);
      
          
        
          
            
        result.setPrecisionAutreSituationActuelleMere(precisionAutreSituationActuelleMere);
      
          
        
          
            
        result.setHorairesTravailLundiMere(horairesTravailLundiMere);
      
          
        
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

  
    
    private String horairesReguliersMere;

    public void setHorairesReguliersMere(final String horairesReguliersMere) {
        this.horairesReguliersMere = horairesReguliersMere;
    }

    
    @Column(name="horaires_reguliers_mere"  )
      
    public String getHorairesReguliersMere() {
        return this.horairesReguliersMere;
    }
  
    
    private String horairesTravailJeudiMere;

    public void setHorairesTravailJeudiMere(final String horairesTravailJeudiMere) {
        this.horairesTravailJeudiMere = horairesTravailJeudiMere;
    }

    
    @Column(name="horaires_travail_jeudi_mere"  )
      
    public String getHorairesTravailJeudiMere() {
        return this.horairesTravailJeudiMere;
    }
  
    
    private Boolean estHorairesReguliersMere;

    public void setEstHorairesReguliersMere(final Boolean estHorairesReguliersMere) {
        this.estHorairesReguliersMere = estHorairesReguliersMere;
    }

    
    @Column(name="est_horaires_reguliers_mere"  )
      
    public Boolean getEstHorairesReguliersMere() {
        return this.estHorairesReguliersMere;
    }
  
    
    private String horairesTravailMardiMere;

    public void setHorairesTravailMardiMere(final String horairesTravailMardiMere) {
        this.horairesTravailMardiMere = horairesTravailMardiMere;
    }

    
    @Column(name="horaires_travail_mardi_mere"  )
      
    public String getHorairesTravailMardiMere() {
        return this.horairesTravailMardiMere;
    }
  
    
    private String horairesTravailVendrediMere;

    public void setHorairesTravailVendrediMere(final String horairesTravailVendrediMere) {
        this.horairesTravailVendrediMere = horairesTravailVendrediMere;
    }

    
    @Column(name="horaires_travail_vendredi_mere"  )
      
    public String getHorairesTravailVendrediMere() {
        return this.horairesTravailVendrediMere;
    }
  
    
    private String professionMere;

    public void setProfessionMere(final String professionMere) {
        this.professionMere = professionMere;
    }

    
    @Column(name="profession_mere"  )
      
    public String getProfessionMere() {
        return this.professionMere;
    }
  
    
    private fr.cg95.cvq.business.request.school.ChoixSituationActuelle situationActuelleMere;

    public void setSituationActuelleMere(final fr.cg95.cvq.business.request.school.ChoixSituationActuelle situationActuelleMere) {
        this.situationActuelleMere = situationActuelleMere;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="situation_actuelle_mere"  )
      
    public fr.cg95.cvq.business.request.school.ChoixSituationActuelle getSituationActuelleMere() {
        return this.situationActuelleMere;
    }
  
    
    private String horairesTravailMercrediMere;

    public void setHorairesTravailMercrediMere(final String horairesTravailMercrediMere) {
        this.horairesTravailMercrediMere = horairesTravailMercrediMere;
    }

    
    @Column(name="horaires_travail_mercredi_mere"  )
      
    public String getHorairesTravailMercrediMere() {
        return this.horairesTravailMercrediMere;
    }
  
    
    private String communeLieuTravailMere;

    public void setCommuneLieuTravailMere(final String communeLieuTravailMere) {
        this.communeLieuTravailMere = communeLieuTravailMere;
    }

    
    @Column(name="commune_lieu_travail_mere"  )
      
    public String getCommuneLieuTravailMere() {
        return this.communeLieuTravailMere;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dccrrMere.situationActuelleMere'].test(_this.situationActuelleMere.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "precisionAutreSituationActuelleMere"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['dccrrMere.situationActuelleMere'].test(_this.situationActuelleMere.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "precisionAutreSituationActuelleMere"
      )
    
    private String precisionAutreSituationActuelleMere;

    public void setPrecisionAutreSituationActuelleMere(final String precisionAutreSituationActuelleMere) {
        this.precisionAutreSituationActuelleMere = precisionAutreSituationActuelleMere;
    }

    
    @Column(name="precision_autre_situation_actuelle_mere"  )
      
    public String getPrecisionAutreSituationActuelleMere() {
        return this.precisionAutreSituationActuelleMere;
    }
  
    
    private String horairesTravailLundiMere;

    public void setHorairesTravailLundiMere(final String horairesTravailLundiMere) {
        this.horairesTravailLundiMere = horairesTravailLundiMere;
    }

    
    @Column(name="horaires_travail_lundi_mere"  )
      
    public String getHorairesTravailLundiMere() {
        return this.horairesTravailLundiMere;
    }
  
}
