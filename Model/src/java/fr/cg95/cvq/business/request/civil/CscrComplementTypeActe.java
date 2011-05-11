
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
@Table(name="cscr_complement_type_acte")
public class CscrComplementTypeActe implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        CivilStatusCertificateRequest.conditions;

    public CscrComplementTypeActe() {
        super();
      
    }

    public final String modelToXmlString() {
        CscrComplementTypeActeType object = (CscrComplementTypeActeType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final CscrComplementTypeActeType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        CscrComplementTypeActeType cscrComplementTypeActe = CscrComplementTypeActeType.Factory.newInstance();
        int i = 0;
    
        cscrComplementTypeActe.setPereNom(this.pereNom);
      
        cscrComplementTypeActe.setMerePrenoms(this.merePrenoms);
      
        cscrComplementTypeActe.setMereNom(this.mereNom);
      
        cscrComplementTypeActe.setPerePrenoms(this.perePrenoms);
      
        return cscrComplementTypeActe;
    }

    public static CscrComplementTypeActe xmlToModel(CscrComplementTypeActeType cscrComplementTypeActeDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        CscrComplementTypeActe cscrComplementTypeActe = new CscrComplementTypeActe();
    
        cscrComplementTypeActe.setPereNom(cscrComplementTypeActeDoc.getPereNom());
      
        cscrComplementTypeActe.setMerePrenoms(cscrComplementTypeActeDoc.getMerePrenoms());
      
        cscrComplementTypeActe.setMereNom(cscrComplementTypeActeDoc.getMereNom());
      
        cscrComplementTypeActe.setPerePrenoms(cscrComplementTypeActeDoc.getPerePrenoms());
      
        return cscrComplementTypeActe;
    }

    @Override
    public CscrComplementTypeActe clone() {
        CscrComplementTypeActe result = new CscrComplementTypeActe();
        
          
            
        result.setPereNom(pereNom);
      
          
        
          
            
        result.setMerePrenoms(merePrenoms);
      
          
        
          
            
        result.setMereNom(mereNom);
      
          
        
          
            
        result.setPerePrenoms(perePrenoms);
      
          
        
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
        
          value = 38,
        
        
        profiles = {"acte"},
        message = "pereNom"
      )
    
      @NotNull(
        
        
        profiles = {"acte"},
        message = "pereNom"
      )
    
      @NotBlank(
        
        
        profiles = {"acte"},
        message = "pereNom"
      )
    
    private String pereNom;

    public void setPereNom(final String pereNom) {
        this.pereNom = pereNom;
    }

    
    @Column(name="pere_nom" , length=38 )
      
    public String getPereNom() {
        return this.pereNom;
    }
  
    
      @NotNull(
        
        
        profiles = {"acte"},
        message = "merePrenoms"
      )
    
      @NotBlank(
        
        
        profiles = {"acte"},
        message = "merePrenoms"
      )
    
    private String merePrenoms;

    public void setMerePrenoms(final String merePrenoms) {
        this.merePrenoms = merePrenoms;
    }

    
    @Column(name="mere_prenoms"  )
      
    public String getMerePrenoms() {
        return this.merePrenoms;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"acte"},
        message = "mereNom"
      )
    
      @NotNull(
        
        
        profiles = {"acte"},
        message = "mereNom"
      )
    
      @NotBlank(
        
        
        profiles = {"acte"},
        message = "mereNom"
      )
    
    private String mereNom;

    public void setMereNom(final String mereNom) {
        this.mereNom = mereNom;
    }

    
    @Column(name="mere_nom" , length=38 )
      
    public String getMereNom() {
        return this.mereNom;
    }
  
    
      @NotNull(
        
        
        profiles = {"acte"},
        message = "perePrenoms"
      )
    
      @NotBlank(
        
        
        profiles = {"acte"},
        message = "perePrenoms"
      )
    
    private String perePrenoms;

    public void setPerePrenoms(final String perePrenoms) {
        this.perePrenoms = perePrenoms;
    }

    
    @Column(name="pere_prenoms"  )
      
    public String getPerePrenoms() {
        return this.perePrenoms;
    }
  
}
