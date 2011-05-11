
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
@Table(name="cscr_informations_particulier")
public class CscrInformationsParticulier implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        CivilStatusCertificateRequest.conditions;

    public CscrInformationsParticulier() {
        super();
      
    }

    public final String modelToXmlString() {
        CscrInformationsParticulierType object = (CscrInformationsParticulierType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final CscrInformationsParticulierType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        CscrInformationsParticulierType cscrInformationsParticulier = CscrInformationsParticulierType.Factory.newInstance();
        int i = 0;
    
        if (this.qualiteDemandeurParticulier != null)
            cscrInformationsParticulier.setQualiteDemandeurParticulier(fr.cg95.cvq.xml.request.civil.CscQualiteDemandeurType.Enum.forString(this.qualiteDemandeurParticulier.getLegacyLabel()));
      
        cscrInformationsParticulier.setPrecisionAutreQualiteDemandeurParticulier(this.precisionAutreQualiteDemandeurParticulier);
      
        return cscrInformationsParticulier;
    }

    public static CscrInformationsParticulier xmlToModel(CscrInformationsParticulierType cscrInformationsParticulierDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        CscrInformationsParticulier cscrInformationsParticulier = new CscrInformationsParticulier();
    
        if (cscrInformationsParticulierDoc.getQualiteDemandeurParticulier() != null)
            cscrInformationsParticulier.setQualiteDemandeurParticulier(fr.cg95.cvq.business.request.civil.CscQualiteDemandeurType.forString(cscrInformationsParticulierDoc.getQualiteDemandeurParticulier().toString()));
        else
            cscrInformationsParticulier.setQualiteDemandeurParticulier(fr.cg95.cvq.business.request.civil.CscQualiteDemandeurType.getDefaultCscQualiteDemandeurType());
      
        cscrInformationsParticulier.setPrecisionAutreQualiteDemandeurParticulier(cscrInformationsParticulierDoc.getPrecisionAutreQualiteDemandeurParticulier());
      
        return cscrInformationsParticulier;
    }

    @Override
    public CscrInformationsParticulier clone() {
        CscrInformationsParticulier result = new CscrInformationsParticulier();
        
          
            
        if (qualiteDemandeurParticulier != null)
            result.setQualiteDemandeurParticulier(qualiteDemandeurParticulier);
        else
            result.setQualiteDemandeurParticulier(fr.cg95.cvq.business.request.civil.CscQualiteDemandeurType.getDefaultCscQualiteDemandeurType());
      
          
        
          
            
        result.setPrecisionAutreQualiteDemandeurParticulier(precisionAutreQualiteDemandeurParticulier);
      
          
        
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

  
    
    private fr.cg95.cvq.business.request.civil.CscQualiteDemandeurType qualiteDemandeurParticulier;

    public void setQualiteDemandeurParticulier(final fr.cg95.cvq.business.request.civil.CscQualiteDemandeurType qualiteDemandeurParticulier) {
        this.qualiteDemandeurParticulier = qualiteDemandeurParticulier;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="qualite_demandeur_particulier"  )
      
    public fr.cg95.cvq.business.request.civil.CscQualiteDemandeurType getQualiteDemandeurParticulier() {
        return this.qualiteDemandeurParticulier;
    }
  
    
    private String precisionAutreQualiteDemandeurParticulier;

    public void setPrecisionAutreQualiteDemandeurParticulier(final String precisionAutreQualiteDemandeurParticulier) {
        this.precisionAutreQualiteDemandeurParticulier = precisionAutreQualiteDemandeurParticulier;
    }

    
    @Column(name="precision_autre_qualite_demandeur_particulier"  )
      
    public String getPrecisionAutreQualiteDemandeurParticulier() {
        return this.precisionAutreQualiteDemandeurParticulier;
    }
  
}
