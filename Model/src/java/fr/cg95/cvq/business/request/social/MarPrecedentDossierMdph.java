
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

/**
 * Generated class file, do not edit !
 *
 * @hibernate.class
 *  table="mar_precedent_dossier_mdph"
 *  lazy="false"
 */
public class MarPrecedentDossierMdph implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public MarPrecedentDossierMdph() {
        super();
      
    }

    public final String modelToXmlString() {
        MarPrecedentDossierMdphType object = (MarPrecedentDossierMdphType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MarPrecedentDossierMdphType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MarPrecedentDossierMdphType marPrecedentDossierMdph = MarPrecedentDossierMdphType.Factory.newInstance();
        int i = 0;
    
        if (this.departementMdph != null)
            marPrecedentDossierMdph.setDepartementMdph(fr.cg95.cvq.xml.common.InseeDepartementCodeType.Enum.forString(this.departementMdph.toString()));
      
        marPrecedentDossierMdph.setNumeroMdph(this.numeroMdph);
      
        return marPrecedentDossierMdph;
    }

    public static MarPrecedentDossierMdph xmlToModel(MarPrecedentDossierMdphType marPrecedentDossierMdphDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MarPrecedentDossierMdph marPrecedentDossierMdph = new MarPrecedentDossierMdph();
    
        if (marPrecedentDossierMdphDoc.getDepartementMdph() != null)
            marPrecedentDossierMdph.setDepartementMdph(fr.cg95.cvq.business.users.InseeDepartementCodeType.forString(marPrecedentDossierMdphDoc.getDepartementMdph().toString()));
        else
            marPrecedentDossierMdph.setDepartementMdph(fr.cg95.cvq.business.users.InseeDepartementCodeType.getDefaultInseeDepartementCodeType());
      
        marPrecedentDossierMdph.setNumeroMdph(marPrecedentDossierMdphDoc.getNumeroMdph());
      
        return marPrecedentDossierMdph;
    }

    @Override
    public MarPrecedentDossierMdph clone() {
        MarPrecedentDossierMdph result = new MarPrecedentDossierMdph();
        
          
            
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

    /**
     * @hibernate.id
     *  column="id"
     *  generator-class="sequence"
     */
    public final Long getId() {
        return this.id;
    }

  
    
    private fr.cg95.cvq.business.users.InseeDepartementCodeType departementMdph;

    public final void setDepartementMdph(final fr.cg95.cvq.business.users.InseeDepartementCodeType departementMdph) {
        this.departementMdph = departementMdph;
    }

    /**
  
        * @hibernate.property
        *  column="departement_mdph"
        
      
    */
    public final fr.cg95.cvq.business.users.InseeDepartementCodeType getDepartementMdph() {
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

    public final void setNumeroMdph(final String numeroMdph) {
        this.numeroMdph = numeroMdph;
    }

    /**
  
        * @hibernate.property
        *  column="numero_mdph"
        *  length="13"
      
    */
    public final String getNumeroMdph() {
        return this.numeroMdph;
    }
  
}
