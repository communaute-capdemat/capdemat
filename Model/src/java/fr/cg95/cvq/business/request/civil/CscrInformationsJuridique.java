
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
@Table(name="cscr_informations_juridique")
public class CscrInformationsJuridique implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        CivilStatusCertificateRequest.conditions;

    public CscrInformationsJuridique() {
        super();
      
    }

    public final String modelToXmlString() {
        CscrInformationsJuridiqueType object = (CscrInformationsJuridiqueType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final CscrInformationsJuridiqueType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        CscrInformationsJuridiqueType cscrInformationsJuridique = CscrInformationsJuridiqueType.Factory.newInstance();
        int i = 0;
    
        cscrInformationsJuridique.setNomMandataireJuridique(this.nomMandataireJuridique);
      
        cscrInformationsJuridique.setPrecisionAutreQualiteMandataireJuridique(this.precisionAutreQualiteMandataireJuridique);
      
        if (this.qualiteMandataireJuridique != null)
            cscrInformationsJuridique.setQualiteMandataireJuridique(fr.cg95.cvq.xml.request.civil.CscQualiteDemandeurType.Enum.forString(this.qualiteMandataireJuridique.getLegacyLabel()));
      
        return cscrInformationsJuridique;
    }

    public static CscrInformationsJuridique xmlToModel(CscrInformationsJuridiqueType cscrInformationsJuridiqueDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        CscrInformationsJuridique cscrInformationsJuridique = new CscrInformationsJuridique();
    
        cscrInformationsJuridique.setNomMandataireJuridique(cscrInformationsJuridiqueDoc.getNomMandataireJuridique());
      
        cscrInformationsJuridique.setPrecisionAutreQualiteMandataireJuridique(cscrInformationsJuridiqueDoc.getPrecisionAutreQualiteMandataireJuridique());
      
        if (cscrInformationsJuridiqueDoc.getQualiteMandataireJuridique() != null)
            cscrInformationsJuridique.setQualiteMandataireJuridique(fr.cg95.cvq.business.request.civil.CscQualiteDemandeurType.forString(cscrInformationsJuridiqueDoc.getQualiteMandataireJuridique().toString()));
        else
            cscrInformationsJuridique.setQualiteMandataireJuridique(fr.cg95.cvq.business.request.civil.CscQualiteDemandeurType.getDefaultCscQualiteDemandeurType());
      
        return cscrInformationsJuridique;
    }

    @Override
    public CscrInformationsJuridique clone() {
        CscrInformationsJuridique result = new CscrInformationsJuridique();
        
          
            
        result.setNomMandataireJuridique(nomMandataireJuridique);
      
          
        
          
            
        result.setPrecisionAutreQualiteMandataireJuridique(precisionAutreQualiteMandataireJuridique);
      
          
        
          
            
        if (qualiteMandataireJuridique != null)
            result.setQualiteMandataireJuridique(qualiteMandataireJuridique);
        else
            result.setQualiteMandataireJuridique(fr.cg95.cvq.business.request.civil.CscQualiteDemandeurType.getDefaultCscQualiteDemandeurType());
      
          
        
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

  
    
    private String nomMandataireJuridique;

    public void setNomMandataireJuridique(final String nomMandataireJuridique) {
        this.nomMandataireJuridique = nomMandataireJuridique;
    }

    
    @Column(name="nom_mandataire_juridique"  )
      
    public String getNomMandataireJuridique() {
        return this.nomMandataireJuridique;
    }
  
    
    private String precisionAutreQualiteMandataireJuridique;

    public void setPrecisionAutreQualiteMandataireJuridique(final String precisionAutreQualiteMandataireJuridique) {
        this.precisionAutreQualiteMandataireJuridique = precisionAutreQualiteMandataireJuridique;
    }

    
    @Column(name="precision_autre_qualite_mandataire_juridique"  )
      
    public String getPrecisionAutreQualiteMandataireJuridique() {
        return this.precisionAutreQualiteMandataireJuridique;
    }
  
    
    private fr.cg95.cvq.business.request.civil.CscQualiteDemandeurType qualiteMandataireJuridique;

    public void setQualiteMandataireJuridique(final fr.cg95.cvq.business.request.civil.CscQualiteDemandeurType qualiteMandataireJuridique) {
        this.qualiteMandataireJuridique = qualiteMandataireJuridique;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="qualite_mandataire_juridique"  )
      
    public fr.cg95.cvq.business.request.civil.CscQualiteDemandeurType getQualiteMandataireJuridique() {
        return this.qualiteMandataireJuridique;
    }
  
}
