
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
@Table(name="myr_situation_professionnelle_beneficiaire_pension")
public class MyrSituationProfessionnelleBeneficiairePension implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        MdphYouthRequest.conditions;

    public MyrSituationProfessionnelleBeneficiairePension() {
        super();
      
    }

    public final String modelToXmlString() {
        MyrSituationProfessionnelleBeneficiairePensionType object = (MyrSituationProfessionnelleBeneficiairePensionType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MyrSituationProfessionnelleBeneficiairePensionType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MyrSituationProfessionnelleBeneficiairePensionType myrSituationProfessionnelleBeneficiairePension = MyrSituationProfessionnelleBeneficiairePensionType.Factory.newInstance();
        int i = 0;
    
        if (this.allocationSupplementaireInvalidite != null)
            myrSituationProfessionnelleBeneficiairePension.setAllocationSupplementaireInvalidite(this.allocationSupplementaireInvalidite.booleanValue());
      
        if (this.renteAccidentTravail != null)
            myrSituationProfessionnelleBeneficiairePension.setRenteAccidentTravail(this.renteAccidentTravail.booleanValue());
      
        if (this.categoriePensionInvalidite != null)
            myrSituationProfessionnelleBeneficiairePension.setCategoriePensionInvalidite(fr.cg95.cvq.xml.request.social.MyrCategoriePensionInvaliditeType.Enum.forString(this.categoriePensionInvalidite.getLegacyLabel()));
      
        date = this.beneficiairePensionDepuisLe;
        if (date != null) {
            calendar.setTime(date);
            myrSituationProfessionnelleBeneficiairePension.setBeneficiairePensionDepuisLe(calendar);
        }
      
        return myrSituationProfessionnelleBeneficiairePension;
    }

    public static MyrSituationProfessionnelleBeneficiairePension xmlToModel(MyrSituationProfessionnelleBeneficiairePensionType myrSituationProfessionnelleBeneficiairePensionDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MyrSituationProfessionnelleBeneficiairePension myrSituationProfessionnelleBeneficiairePension = new MyrSituationProfessionnelleBeneficiairePension();
    
        myrSituationProfessionnelleBeneficiairePension.setAllocationSupplementaireInvalidite(Boolean.valueOf(myrSituationProfessionnelleBeneficiairePensionDoc.getAllocationSupplementaireInvalidite()));
      
        myrSituationProfessionnelleBeneficiairePension.setRenteAccidentTravail(Boolean.valueOf(myrSituationProfessionnelleBeneficiairePensionDoc.getRenteAccidentTravail()));
      
        if (myrSituationProfessionnelleBeneficiairePensionDoc.getCategoriePensionInvalidite() != null)
            myrSituationProfessionnelleBeneficiairePension.setCategoriePensionInvalidite(fr.cg95.cvq.business.request.social.MyrCategoriePensionInvaliditeType.forString(myrSituationProfessionnelleBeneficiairePensionDoc.getCategoriePensionInvalidite().toString()));
        else
            myrSituationProfessionnelleBeneficiairePension.setCategoriePensionInvalidite(fr.cg95.cvq.business.request.social.MyrCategoriePensionInvaliditeType.getDefaultMyrCategoriePensionInvaliditeType());
      
        calendar = myrSituationProfessionnelleBeneficiairePensionDoc.getBeneficiairePensionDepuisLe();
        if (calendar != null) {
            myrSituationProfessionnelleBeneficiairePension.setBeneficiairePensionDepuisLe(calendar.getTime());
        }
      
        return myrSituationProfessionnelleBeneficiairePension;
    }

    @Override
    public MyrSituationProfessionnelleBeneficiairePension clone() {
        MyrSituationProfessionnelleBeneficiairePension result = new MyrSituationProfessionnelleBeneficiairePension();
        
          
            
        result.setAllocationSupplementaireInvalidite(allocationSupplementaireInvalidite);
      
          
        
          
            
        result.setRenteAccidentTravail(renteAccidentTravail);
      
          
        
          
            
        if (categoriePensionInvalidite != null)
            result.setCategoriePensionInvalidite(categoriePensionInvalidite);
        else
            result.setCategoriePensionInvalidite(fr.cg95.cvq.business.request.social.MyrCategoriePensionInvaliditeType.getDefaultMyrCategoriePensionInvaliditeType());
      
          
        
          
            
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
    
    private fr.cg95.cvq.business.request.social.MyrCategoriePensionInvaliditeType categoriePensionInvalidite;

    public void setCategoriePensionInvalidite(final fr.cg95.cvq.business.request.social.MyrCategoriePensionInvaliditeType categoriePensionInvalidite) {
        this.categoriePensionInvalidite = categoriePensionInvalidite;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="categorie_pension_invalidite"  )
      
    public fr.cg95.cvq.business.request.social.MyrCategoriePensionInvaliditeType getCategoriePensionInvalidite() {
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
