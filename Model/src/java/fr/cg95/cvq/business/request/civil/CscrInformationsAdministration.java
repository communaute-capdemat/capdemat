
package fr.cg95.cvq.business.request.civil;

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
import fr.cg95.cvq.xml.request.civil.*;
import fr.cg95.cvq.service.request.LocalReferential;
import fr.cg95.cvq.service.request.condition.IConditionChecker;
import javax.persistence.*;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Type;

/**
 * Generated class file, do not edit !
 */
@Entity
@Table(name="cscr_informations_administration")
public class CscrInformationsAdministration implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        CivilStatusCertificateRequest.conditions;

    public CscrInformationsAdministration() {
        super();
      
    }

    public final String modelToXmlString() {
        CscrInformationsAdministrationType object = (CscrInformationsAdministrationType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final CscrInformationsAdministrationType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        CscrInformationsAdministrationType cscrInformationsAdministration = CscrInformationsAdministrationType.Factory.newInstance();
        int i = 0;
    
        cscrInformationsAdministration.setNomMandataireAdministration(this.nomMandataireAdministration);
      
        if (this.qualiteMandataireAdministration != null)
            cscrInformationsAdministration.setQualiteMandataireAdministration(fr.cg95.cvq.xml.request.civil.CscQualiteDemandeurType.Enum.forString(this.qualiteMandataireAdministration.getLegacyLabel()));
      
        cscrInformationsAdministration.setNomAdministration(this.nomAdministration);
      
        cscrInformationsAdministration.setPrecisionAutreQualiteMandataireAdministration(this.precisionAutreQualiteMandataireAdministration);
      
        return cscrInformationsAdministration;
    }

    public static CscrInformationsAdministration xmlToModel(CscrInformationsAdministrationType cscrInformationsAdministrationDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        CscrInformationsAdministration cscrInformationsAdministration = new CscrInformationsAdministration();
    
        cscrInformationsAdministration.setNomMandataireAdministration(cscrInformationsAdministrationDoc.getNomMandataireAdministration());
      
        if (cscrInformationsAdministrationDoc.getQualiteMandataireAdministration() != null)
            cscrInformationsAdministration.setQualiteMandataireAdministration(fr.cg95.cvq.business.request.civil.CscQualiteDemandeurType.forString(cscrInformationsAdministrationDoc.getQualiteMandataireAdministration().toString()));
        else
            cscrInformationsAdministration.setQualiteMandataireAdministration(fr.cg95.cvq.business.request.civil.CscQualiteDemandeurType.getDefaultCscQualiteDemandeurType());
      
        cscrInformationsAdministration.setNomAdministration(cscrInformationsAdministrationDoc.getNomAdministration());
      
        cscrInformationsAdministration.setPrecisionAutreQualiteMandataireAdministration(cscrInformationsAdministrationDoc.getPrecisionAutreQualiteMandataireAdministration());
      
        return cscrInformationsAdministration;
    }

    @Override
    public CscrInformationsAdministration clone() {
        CscrInformationsAdministration result = new CscrInformationsAdministration();
        
          
            
        result.setNomMandataireAdministration(nomMandataireAdministration);
      
          
        
          
            
        if (qualiteMandataireAdministration != null)
            result.setQualiteMandataireAdministration(qualiteMandataireAdministration);
        else
            result.setQualiteMandataireAdministration(fr.cg95.cvq.business.request.civil.CscQualiteDemandeurType.getDefaultCscQualiteDemandeurType());
      
          
        
          
            
        result.setNomAdministration(nomAdministration);
      
          
        
          
            
        result.setPrecisionAutreQualiteMandataireAdministration(precisionAutreQualiteMandataireAdministration);
      
          
        
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

  
    
    private String nomMandataireAdministration;

    public void setNomMandataireAdministration(final String nomMandataireAdministration) {
        this.nomMandataireAdministration = nomMandataireAdministration;
    }

    
    @Column(name="nom_mandataire_administration"  )
      
    public String getNomMandataireAdministration() {
        return this.nomMandataireAdministration;
    }
  
    
    private fr.cg95.cvq.business.request.civil.CscQualiteDemandeurType qualiteMandataireAdministration;

    public void setQualiteMandataireAdministration(final fr.cg95.cvq.business.request.civil.CscQualiteDemandeurType qualiteMandataireAdministration) {
        this.qualiteMandataireAdministration = qualiteMandataireAdministration;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="qualite_mandataire_administration"  )
      
    public fr.cg95.cvq.business.request.civil.CscQualiteDemandeurType getQualiteMandataireAdministration() {
        return this.qualiteMandataireAdministration;
    }
  
    
    private String nomAdministration;

    public void setNomAdministration(final String nomAdministration) {
        this.nomAdministration = nomAdministration;
    }

    
    @Column(name="nom_administration"  )
      
    public String getNomAdministration() {
        return this.nomAdministration;
    }
  
    
    private String precisionAutreQualiteMandataireAdministration;

    public void setPrecisionAutreQualiteMandataireAdministration(final String precisionAutreQualiteMandataireAdministration) {
        this.precisionAutreQualiteMandataireAdministration = precisionAutreQualiteMandataireAdministration;
    }

    
    @Column(name="precision_autre_qualite_mandataire_administration"  )
      
    public String getPrecisionAutreQualiteMandataireAdministration() {
        return this.precisionAutreQualiteMandataireAdministration;
    }
  
}
