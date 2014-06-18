
package fr.cg95.cvq.business.request.leisure;

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
import fr.cg95.cvq.xml.request.leisure.*;
import fr.cg95.cvq.service.request.LocalReferential;
import fr.cg95.cvq.service.request.condition.IConditionChecker;
import javax.persistence.*;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Type;

/**
 * Generated class file, do not edit !
 */
@Entity
@Table(name="arr_produit")
public class ArrProduit implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        ActivityRegistrationRequest.conditions;

    public ArrProduit() {
        super();
      
    }

    public final String modelToXmlString() {
        ArrProduitType object = (ArrProduitType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final ArrProduitType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        ArrProduitType arrProduit = ArrProduitType.Factory.newInstance();
        int i = 0;
    
        arrProduit.setLabelProduit(this.labelProduit);
      
        arrProduit.setTypeProduit(this.typeProduit);
      
        arrProduit.setIdProduit(this.idProduit);
      
        return arrProduit;
    }

    public static ArrProduit xmlToModel(ArrProduitType arrProduitDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        ArrProduit arrProduit = new ArrProduit();
    
        arrProduit.setLabelProduit(arrProduitDoc.getLabelProduit());
      
        arrProduit.setTypeProduit(arrProduitDoc.getTypeProduit());
      
        arrProduit.setIdProduit(arrProduitDoc.getIdProduit());
      
        return arrProduit;
    }

    @Override
    public ArrProduit clone() {
        ArrProduit result = new ArrProduit();
        
          
            
        result.setLabelProduit(labelProduit);
      
          
        
          
            
        result.setTypeProduit(typeProduit);
      
          
        
          
            
        result.setIdProduit(idProduit);
      
          
        
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
        
        
        profiles = {"preinscription"},
        message = "labelProduit"
      )
    
      @NotBlank(
        
        
        profiles = {"preinscription"},
        message = "labelProduit"
      )
    
    private String labelProduit;

    public void setLabelProduit(final String labelProduit) {
        this.labelProduit = labelProduit;
    }

    
    @Column(name="label_produit"  )
      
    public String getLabelProduit() {
        return this.labelProduit;
    }
  
    
      @NotNull(
        
        
        profiles = {"preinscription"},
        message = "typeProduit"
      )
    
      @NotBlank(
        
        
        profiles = {"preinscription"},
        message = "typeProduit"
      )
    
    private String typeProduit;

    public void setTypeProduit(final String typeProduit) {
        this.typeProduit = typeProduit;
    }

    
    @Column(name="type_produit"  )
      
    public String getTypeProduit() {
        return this.typeProduit;
    }
  
    
      @NotNull(
        
        
        profiles = {"preinscription"},
        message = "idProduit"
      )
    
      @NotBlank(
        
        
        profiles = {"preinscription"},
        message = "idProduit"
      )
    
    private String idProduit;

    public void setIdProduit(final String idProduit) {
        this.idProduit = idProduit;
    }

    
    @Column(name="id_produit"  )
      
    public String getIdProduit() {
        return this.idProduit;
    }
  
}
