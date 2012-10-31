
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
@Table(name="mar_situation_professionnelle_beneficiaire_pension")
public class MarSituationProfessionnelleBeneficiairePension implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        MdphAdultRequest.conditions;

    public MarSituationProfessionnelleBeneficiairePension() {
        super();
      
    }

    public final String modelToXmlString() {
        MarSituationProfessionnelleBeneficiairePensionType object = (MarSituationProfessionnelleBeneficiairePensionType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MarSituationProfessionnelleBeneficiairePensionType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MarSituationProfessionnelleBeneficiairePensionType marSituationProfessionnelleBeneficiairePension = MarSituationProfessionnelleBeneficiairePensionType.Factory.newInstance();
        int i = 0;
    
        if (this.allocationSupplementaireInvalidite != null)
            marSituationProfessionnelleBeneficiairePension.setAllocationSupplementaireInvalidite(this.allocationSupplementaireInvalidite.booleanValue());
      
        if (this.renteAccidentTravail != null)
            marSituationProfessionnelleBeneficiairePension.setRenteAccidentTravail(this.renteAccidentTravail.booleanValue());
      
        if (this.categoriePensionInvalidite != null)
            marSituationProfessionnelleBeneficiairePension.setCategoriePensionInvalidite(fr.cg95.cvq.xml.request.social.CategoriePensionInvaliditeType.Enum.forString(this.categoriePensionInvalidite.getLegacyLabel()));
      
        date = this.beneficiairePensionDepuisLe;
        if (date != null) {
            calendar.setTime(date);
            marSituationProfessionnelleBeneficiairePension.setBeneficiairePensionDepuisLe(calendar);
        }
      
        return marSituationProfessionnelleBeneficiairePension;
    }

    public static MarSituationProfessionnelleBeneficiairePension xmlToModel(MarSituationProfessionnelleBeneficiairePensionType marSituationProfessionnelleBeneficiairePensionDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MarSituationProfessionnelleBeneficiairePension marSituationProfessionnelleBeneficiairePension = new MarSituationProfessionnelleBeneficiairePension();
    
        marSituationProfessionnelleBeneficiairePension.setAllocationSupplementaireInvalidite(Boolean.valueOf(marSituationProfessionnelleBeneficiairePensionDoc.getAllocationSupplementaireInvalidite()));
      
        marSituationProfessionnelleBeneficiairePension.setRenteAccidentTravail(Boolean.valueOf(marSituationProfessionnelleBeneficiairePensionDoc.getRenteAccidentTravail()));
      
        if (marSituationProfessionnelleBeneficiairePensionDoc.getCategoriePensionInvalidite() != null)
            marSituationProfessionnelleBeneficiairePension.setCategoriePensionInvalidite(fr.cg95.cvq.business.request.social.CategoriePensionInvaliditeType.forString(marSituationProfessionnelleBeneficiairePensionDoc.getCategoriePensionInvalidite().toString()));
        else
            marSituationProfessionnelleBeneficiairePension.setCategoriePensionInvalidite(fr.cg95.cvq.business.request.social.CategoriePensionInvaliditeType.getDefaultCategoriePensionInvaliditeType());
      
        calendar = marSituationProfessionnelleBeneficiairePensionDoc.getBeneficiairePensionDepuisLe();
        if (calendar != null) {
            marSituationProfessionnelleBeneficiairePension.setBeneficiairePensionDepuisLe(calendar.getTime());
        }
      
        return marSituationProfessionnelleBeneficiairePension;
    }

    @Override
    public MarSituationProfessionnelleBeneficiairePension clone() {
        MarSituationProfessionnelleBeneficiairePension result = new MarSituationProfessionnelleBeneficiairePension();
        
          
            
        result.setAllocationSupplementaireInvalidite(allocationSupplementaireInvalidite);
      
          
        
          
            
        result.setRenteAccidentTravail(renteAccidentTravail);
      
          
        
          
            
        if (categoriePensionInvalidite != null)
            result.setCategoriePensionInvalidite(categoriePensionInvalidite);
        else
            result.setCategoriePensionInvalidite(fr.cg95.cvq.business.request.social.CategoriePensionInvaliditeType.getDefaultCategoriePensionInvaliditeType());
      
          
        
          
            
        result.setBeneficiairePensionDepuisLe(beneficiairePensionDepuisLe);
      
          
        
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

  
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "allocationSupplementaireInvalidite"
      )
    
    private Boolean allocationSupplementaireInvalidite;

    public void setAllocationSupplementaireInvalidite(final Boolean allocationSupplementaireInvalidite) {
        this.allocationSupplementaireInvalidite = allocationSupplementaireInvalidite;
    }

    
    @Column(name="allocation_supplementaire_invalidite"  )
      
    public Boolean getAllocationSupplementaireInvalidite() {
        return this.allocationSupplementaireInvalidite;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "renteAccidentTravail"
      )
    
    private Boolean renteAccidentTravail;

    public void setRenteAccidentTravail(final Boolean renteAccidentTravail) {
        this.renteAccidentTravail = renteAccidentTravail;
    }

    
    @Column(name="rente_accident_travail"  )
      
    public Boolean getRenteAccidentTravail() {
        return this.renteAccidentTravail;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "categoriePensionInvalidite"
      )
    
    private fr.cg95.cvq.business.request.social.CategoriePensionInvaliditeType categoriePensionInvalidite;

    public void setCategoriePensionInvalidite(final fr.cg95.cvq.business.request.social.CategoriePensionInvaliditeType categoriePensionInvalidite) {
        this.categoriePensionInvalidite = categoriePensionInvalidite;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="categorie_pension_invalidite"  )
      
    public fr.cg95.cvq.business.request.social.CategoriePensionInvaliditeType getCategoriePensionInvalidite() {
        return this.categoriePensionInvalidite;
    }
  
    
      @NotNull(
        
        
        profiles = {"situationProfessionnelle"},
        message = "beneficiairePensionDepuisLe"
      )
    
    private java.util.Date beneficiairePensionDepuisLe;

    public void setBeneficiairePensionDepuisLe(final java.util.Date beneficiairePensionDepuisLe) {
        this.beneficiairePensionDepuisLe = beneficiairePensionDepuisLe;
    }

    
    @Column(name="beneficiaire_pension_depuis_le"  )
      
    public java.util.Date getBeneficiairePensionDepuisLe() {
        return this.beneficiairePensionDepuisLe;
    }
  
}
