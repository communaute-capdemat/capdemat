
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
@Table(name="myr_precedent_dossier_mdph")
public class MyrPrecedentDossierMdph implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        MdphYouthRequest.conditions;

    public MyrPrecedentDossierMdph() {
        super();
      
    }

    public final String modelToXmlString() {
        MyrPrecedentDossierMdphType object = (MyrPrecedentDossierMdphType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MyrPrecedentDossierMdphType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MyrPrecedentDossierMdphType myrPrecedentDossierMdph = MyrPrecedentDossierMdphType.Factory.newInstance();
        int i = 0;
    
        if (this.departementMdph != null)
            myrPrecedentDossierMdph.setDepartementMdph(fr.cg95.cvq.xml.common.InseeDepartementCodeType.Enum.forString(this.departementMdph.getLegacyLabel()));
      
        myrPrecedentDossierMdph.setNumeroMdph(this.numeroMdph);
      
        return myrPrecedentDossierMdph;
    }

    public static MyrPrecedentDossierMdph xmlToModel(MyrPrecedentDossierMdphType myrPrecedentDossierMdphDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MyrPrecedentDossierMdph myrPrecedentDossierMdph = new MyrPrecedentDossierMdph();
    
        if (myrPrecedentDossierMdphDoc.getDepartementMdph() != null)
            myrPrecedentDossierMdph.setDepartementMdph(fr.cg95.cvq.business.users.InseeDepartementCodeType.forString(myrPrecedentDossierMdphDoc.getDepartementMdph().toString()));
        else
            myrPrecedentDossierMdph.setDepartementMdph(fr.cg95.cvq.business.users.InseeDepartementCodeType.getDefaultInseeDepartementCodeType());
      
        myrPrecedentDossierMdph.setNumeroMdph(myrPrecedentDossierMdphDoc.getNumeroMdph());
      
        return myrPrecedentDossierMdph;
    }

    @Override
    public MyrPrecedentDossierMdph clone() {
        MyrPrecedentDossierMdph result = new MyrPrecedentDossierMdph();
        
          
            
        if (departementMdph != null)
            result.setDepartementMdph(departementMdph);
        else
            result.setDepartementMdph(fr.cg95.cvq.business.users.InseeDepartementCodeType.getDefaultInseeDepartementCodeType());
      
          
        
          
            
        result.setNumeroMdph(numeroMdph);
      
          
        
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

  
    
    private fr.cg95.cvq.business.users.InseeDepartementCodeType departementMdph;

    public void setDepartementMdph(final fr.cg95.cvq.business.users.InseeDepartementCodeType departementMdph) {
        this.departementMdph = departementMdph;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="departement_mdph"  )
      
    public fr.cg95.cvq.business.users.InseeDepartementCodeType getDepartementMdph() {
        return this.departementMdph;
    }
  
    
      @MaxLength(
        
          value = 13,
        
        
        profiles = {"subject"},
        message = "numeroMdph"
      )
    
      @MatchPattern(
        
          pattern = "^.{0,13}$",
        
        
        profiles = {"subject"},
        message = "numeroMdph"
      )
    
    private String numeroMdph;

    public void setNumeroMdph(final String numeroMdph) {
        this.numeroMdph = numeroMdph;
    }

    
    @Column(name="numero_mdph" , length=13 )
      
    public String getNumeroMdph() {
        return this.numeroMdph;
    }
  
}
