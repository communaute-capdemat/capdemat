
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
@Table(name="sagr_numeros_association")
public class SagrNumerosAssociation implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        SportsAssociationsGrantRequest.conditions;

    public SagrNumerosAssociation() {
        super();
      
    }

    public final String modelToXmlString() {
        SagrNumerosAssociationType object = (SagrNumerosAssociationType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final SagrNumerosAssociationType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        SagrNumerosAssociationType sagrNumerosAssociation = SagrNumerosAssociationType.Factory.newInstance();
        int i = 0;
    
        sagrNumerosAssociation.setNumeroSiretAssociation(this.numeroSiretAssociation);
      
        sagrNumerosAssociation.setNumeroEnregistrementPrefectureAssociation(this.numeroEnregistrementPrefectureAssociation);
      
        return sagrNumerosAssociation;
    }

    public static SagrNumerosAssociation xmlToModel(SagrNumerosAssociationType sagrNumerosAssociationDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        SagrNumerosAssociation sagrNumerosAssociation = new SagrNumerosAssociation();
    
        sagrNumerosAssociation.setNumeroSiretAssociation(sagrNumerosAssociationDoc.getNumeroSiretAssociation());
      
        sagrNumerosAssociation.setNumeroEnregistrementPrefectureAssociation(sagrNumerosAssociationDoc.getNumeroEnregistrementPrefectureAssociation());
      
        return sagrNumerosAssociation;
    }

    @Override
    public SagrNumerosAssociation clone() {
        SagrNumerosAssociation result = new SagrNumerosAssociation();
        
          
            
        result.setNumeroSiretAssociation(numeroSiretAssociation);
      
          
        
          
            
        result.setNumeroEnregistrementPrefectureAssociation(numeroEnregistrementPrefectureAssociation);
      
          
        
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
        
          value = 14,
        
        
        profiles = {"association"},
        message = "numeroSiretAssociation"
      )
    
      @NotNull(
        
        
        profiles = {"association"},
        message = "numeroSiretAssociation"
      )
    
      @MatchPattern(
        
          pattern = "^[\\w\\W]{0,14}$",
        
        
        profiles = {"association"},
        message = "numeroSiretAssociation"
      )
    
      @NotBlank(
        
        
        profiles = {"association"},
        message = "numeroSiretAssociation"
      )
    
    private String numeroSiretAssociation;

    public void setNumeroSiretAssociation(final String numeroSiretAssociation) {
        this.numeroSiretAssociation = numeroSiretAssociation;
    }

    
    @Column(name="numero_siret_association" , length=14 )
      
    public String getNumeroSiretAssociation() {
        return this.numeroSiretAssociation;
    }
  
    
      @MaxLength(
        
          value = 9,
        
        
        profiles = {"association"},
        message = "numeroEnregistrementPrefectureAssociation"
      )
    
      @NotNull(
        
        
        profiles = {"association"},
        message = "numeroEnregistrementPrefectureAssociation"
      )
    
      @MatchPattern(
        
          pattern = "^[\\w\\W]{0,9}$",
        
        
        profiles = {"association"},
        message = "numeroEnregistrementPrefectureAssociation"
      )
    
      @NotBlank(
        
        
        profiles = {"association"},
        message = "numeroEnregistrementPrefectureAssociation"
      )
    
    private String numeroEnregistrementPrefectureAssociation;

    public void setNumeroEnregistrementPrefectureAssociation(final String numeroEnregistrementPrefectureAssociation) {
        this.numeroEnregistrementPrefectureAssociation = numeroEnregistrementPrefectureAssociation;
    }

    
    @Column(name="numero_enregistrement_prefecture_association" , length=9 )
      
    public String getNumeroEnregistrementPrefectureAssociation() {
        return this.numeroEnregistrementPrefectureAssociation;
    }
  
}
