
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
@Table(name="mar_choix_demande_alloc_et_compl")
public class MarChoixDemandeAllocEtCompl implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        MdphAdultRequest.conditions;

    public MarChoixDemandeAllocEtCompl() {
        super();
      
        complementRessources = Boolean.valueOf(false);
      
        aah = Boolean.valueOf(false);
      
    }

    public final String modelToXmlString() {
        MarChoixDemandeAllocEtComplType object = (MarChoixDemandeAllocEtComplType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MarChoixDemandeAllocEtComplType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MarChoixDemandeAllocEtComplType marChoixDemandeAllocEtCompl = MarChoixDemandeAllocEtComplType.Factory.newInstance();
        int i = 0;
    
        if (this.complementRessources != null)
            marChoixDemandeAllocEtCompl.setComplementRessources(this.complementRessources.booleanValue());
      
        if (this.aah != null)
            marChoixDemandeAllocEtCompl.setAah(this.aah.booleanValue());
      
        return marChoixDemandeAllocEtCompl;
    }

    public static MarChoixDemandeAllocEtCompl xmlToModel(MarChoixDemandeAllocEtComplType marChoixDemandeAllocEtComplDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MarChoixDemandeAllocEtCompl marChoixDemandeAllocEtCompl = new MarChoixDemandeAllocEtCompl();
    
        marChoixDemandeAllocEtCompl.setComplementRessources(Boolean.valueOf(marChoixDemandeAllocEtComplDoc.getComplementRessources()));
      
        marChoixDemandeAllocEtCompl.setAah(Boolean.valueOf(marChoixDemandeAllocEtComplDoc.getAah()));
      
        return marChoixDemandeAllocEtCompl;
    }

    @Override
    public MarChoixDemandeAllocEtCompl clone() {
        MarChoixDemandeAllocEtCompl result = new MarChoixDemandeAllocEtCompl();
        
          
            
        result.setComplementRessources(complementRessources);
      
          
        
          
            
        result.setAah(aah);
      
          
        
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
        
        
        profiles = {"demandeAllocationEtComplementRessources"},
        message = "complementRessources"
      )
    
    private Boolean complementRessources;

    public void setComplementRessources(final Boolean complementRessources) {
        this.complementRessources = complementRessources;
    }

    
    @Column(name="complement_ressources"  )
      
    public Boolean getComplementRessources() {
        return this.complementRessources;
    }
  
    
      @NotNull(
        
        
        profiles = {"demandeAllocationEtComplementRessources"},
        message = "aah"
      )
    
    private Boolean aah;

    public void setAah(final Boolean aah) {
        this.aah = aah;
    }

    
    @Column(name="aah"  )
      
    public Boolean getAah() {
        return this.aah;
    }
  
}
