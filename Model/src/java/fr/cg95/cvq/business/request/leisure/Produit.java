
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
@Table(name="produit")
public class Produit implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        EcoleDeMusiqueRequest.conditions;

    public Produit() {
        super();
      
    }

    public final String modelToXmlString() {
        ProduitType object = (ProduitType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final ProduitType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        ProduitType produit = ProduitType.Factory.newInstance();
        int i = 0;
    
        produit.setLabelProduit(this.labelProduit);
      
        produit.setIdProduit(this.idProduit);
      
        return produit;
    }

    public static Produit xmlToModel(ProduitType produitDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        Produit produit = new Produit();
    
        produit.setLabelProduit(produitDoc.getLabelProduit());
      
        produit.setIdProduit(produitDoc.getIdProduit());
      
        return produit;
    }

    @Override
    public Produit clone() {
        Produit result = new Produit();
        
          
            
        result.setLabelProduit(labelProduit);
      
          
        
          
            
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
        
        
        profiles = {"enfant"},
        message = "labelProduit"
      )
    
      @NotBlank(
        
        
        profiles = {"enfant"},
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
        
        
        profiles = {"enfant"},
        message = "idProduit"
      )
    
      @NotBlank(
        
        
        profiles = {"enfant"},
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
