

package fr.cg95.cvq.business.request.civil;

import java.io.Serializable;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.oval.constraint.*;
import fr.cg95.cvq.business.authority.*;
import fr.cg95.cvq.business.request.*;
import fr.cg95.cvq.business.users.*;
import fr.cg95.cvq.service.request.LocalReferential;
import fr.cg95.cvq.service.request.condition.IConditionChecker;

import javax.persistence.*;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Type;

/**
 * Generated class file, do not edit !
 */
@Entity
@Table(name="demande_de_suivi_request")
public class DemandeDeSuiviRequestData implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>(RequestData.conditions);

    private Long id;

    public DemandeDeSuiviRequestData() {
      
    }

    @Override
    public DemandeDeSuiviRequestData clone() {
        DemandeDeSuiviRequestData result = new DemandeDeSuiviRequestData();
        
          
            
        result.setCommentaire(commentaire);
      
          
        
          
            
        result.setNumeroDemande(numeroDemande);
      
          
        
        return result;
    }

    public final void setId(final Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    public final Long getId() {
        return this.id;
    }

  
    
      @MaxLength(
        
          value = 1024,
        
        
        profiles = {"demande"},
        message = "commentaire"
      )
    
    private String commentaire;

    public void setCommentaire(final String commentaire) {
        this.commentaire = commentaire;
    }

 
    @Column(name="commentaire" , length=1024 )
      
    public String getCommentaire() {
        return this.commentaire;
    }
  
    
      @MaxLength(
        
          value = 255,
        
        
        profiles = {"demande"},
        message = "numeroDemande"
      )
    
    private String numeroDemande;

    public void setNumeroDemande(final String numeroDemande) {
        this.numeroDemande = numeroDemande;
    }

 
    @Column(name="numero_demande" , length=255 )
      
    public String getNumeroDemande() {
        return this.numeroDemande;
    }
  
}
