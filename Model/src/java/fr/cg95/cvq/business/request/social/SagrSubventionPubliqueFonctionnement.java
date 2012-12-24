
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
@Table(name="sagr_subvention_publique_fonctionnement")
public class SagrSubventionPubliqueFonctionnement implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        SportsAssociationsGrantRequest.conditions;

    public SagrSubventionPubliqueFonctionnement() {
        super();
      
    }

    public final String modelToXmlString() {
        SagrSubventionPubliqueFonctionnementType object = (SagrSubventionPubliqueFonctionnementType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final SagrSubventionPubliqueFonctionnementType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        SagrSubventionPubliqueFonctionnementType sagrSubventionPubliqueFonctionnement = SagrSubventionPubliqueFonctionnementType.Factory.newInstance();
        int i = 0;
    
        sagrSubventionPubliqueFonctionnement.setBudgetSaisonEcouleeDepenses(this.budgetSaisonEcouleeDepenses);
      
        sagrSubventionPubliqueFonctionnement.setNombreLicenciePlusDixHuitSaisonEcoulee(this.nombreLicenciePlusDixHuitSaisonEcoulee);
      
        sagrSubventionPubliqueFonctionnement.setCommuneAnneeNPlusUn(this.communeAnneeNPlusUn);
      
        sagrSubventionPubliqueFonctionnement.setNombreLicencieMoinsDixHuitSaisonEcoulee(this.nombreLicencieMoinsDixHuitSaisonEcoulee);
      
        sagrSubventionPubliqueFonctionnement.setBudgetSaisonEcouleeRecette(this.budgetSaisonEcouleeRecette);
      
        sagrSubventionPubliqueFonctionnement.setCommuneAnneeN(this.communeAnneeN);
      
        return sagrSubventionPubliqueFonctionnement;
    }

    public static SagrSubventionPubliqueFonctionnement xmlToModel(SagrSubventionPubliqueFonctionnementType sagrSubventionPubliqueFonctionnementDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        SagrSubventionPubliqueFonctionnement sagrSubventionPubliqueFonctionnement = new SagrSubventionPubliqueFonctionnement();
    
        sagrSubventionPubliqueFonctionnement.setBudgetSaisonEcouleeDepenses(sagrSubventionPubliqueFonctionnementDoc.getBudgetSaisonEcouleeDepenses());
      
        sagrSubventionPubliqueFonctionnement.setNombreLicenciePlusDixHuitSaisonEcoulee(sagrSubventionPubliqueFonctionnementDoc.getNombreLicenciePlusDixHuitSaisonEcoulee());
      
        sagrSubventionPubliqueFonctionnement.setCommuneAnneeNPlusUn(sagrSubventionPubliqueFonctionnementDoc.getCommuneAnneeNPlusUn());
      
        sagrSubventionPubliqueFonctionnement.setNombreLicencieMoinsDixHuitSaisonEcoulee(sagrSubventionPubliqueFonctionnementDoc.getNombreLicencieMoinsDixHuitSaisonEcoulee());
      
        sagrSubventionPubliqueFonctionnement.setBudgetSaisonEcouleeRecette(sagrSubventionPubliqueFonctionnementDoc.getBudgetSaisonEcouleeRecette());
      
        sagrSubventionPubliqueFonctionnement.setCommuneAnneeN(sagrSubventionPubliqueFonctionnementDoc.getCommuneAnneeN());
      
        return sagrSubventionPubliqueFonctionnement;
    }

    @Override
    public SagrSubventionPubliqueFonctionnement clone() {
        SagrSubventionPubliqueFonctionnement result = new SagrSubventionPubliqueFonctionnement();
        
          
            
        result.setBudgetSaisonEcouleeDepenses(budgetSaisonEcouleeDepenses);
      
          
        
          
            
        result.setNombreLicenciePlusDixHuitSaisonEcoulee(nombreLicenciePlusDixHuitSaisonEcoulee);
      
          
        
          
            
        result.setCommuneAnneeNPlusUn(communeAnneeNPlusUn);
      
          
        
          
            
        result.setNombreLicencieMoinsDixHuitSaisonEcoulee(nombreLicencieMoinsDixHuitSaisonEcoulee);
      
          
        
          
            
        result.setBudgetSaisonEcouleeRecette(budgetSaisonEcouleeRecette);
      
          
        
          
            
        result.setCommuneAnneeN(communeAnneeN);
      
          
        
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

  
    
    private String budgetSaisonEcouleeDepenses;

    public void setBudgetSaisonEcouleeDepenses(final String budgetSaisonEcouleeDepenses) {
        this.budgetSaisonEcouleeDepenses = budgetSaisonEcouleeDepenses;
    }

    
    @Column(name="budget_saison_ecoulee_depenses"  )
      
    public String getBudgetSaisonEcouleeDepenses() {
        return this.budgetSaisonEcouleeDepenses;
    }
  
    
    private String nombreLicenciePlusDixHuitSaisonEcoulee;

    public void setNombreLicenciePlusDixHuitSaisonEcoulee(final String nombreLicenciePlusDixHuitSaisonEcoulee) {
        this.nombreLicenciePlusDixHuitSaisonEcoulee = nombreLicenciePlusDixHuitSaisonEcoulee;
    }

    
    @Column(name="nombre_licencie_plus_dix_huit_saison_ecoulee"  )
      
    public String getNombreLicenciePlusDixHuitSaisonEcoulee() {
        return this.nombreLicenciePlusDixHuitSaisonEcoulee;
    }
  
    
    private String communeAnneeNPlusUn;

    public void setCommuneAnneeNPlusUn(final String communeAnneeNPlusUn) {
        this.communeAnneeNPlusUn = communeAnneeNPlusUn;
    }

    
    @Column(name="commune_annee_n_plus_un"  )
      
    public String getCommuneAnneeNPlusUn() {
        return this.communeAnneeNPlusUn;
    }
  
    
    private String nombreLicencieMoinsDixHuitSaisonEcoulee;

    public void setNombreLicencieMoinsDixHuitSaisonEcoulee(final String nombreLicencieMoinsDixHuitSaisonEcoulee) {
        this.nombreLicencieMoinsDixHuitSaisonEcoulee = nombreLicencieMoinsDixHuitSaisonEcoulee;
    }

    
    @Column(name="nombre_licencie_moins_dix_huit_saison_ecoulee"  )
      
    public String getNombreLicencieMoinsDixHuitSaisonEcoulee() {
        return this.nombreLicencieMoinsDixHuitSaisonEcoulee;
    }
  
    
    private String budgetSaisonEcouleeRecette;

    public void setBudgetSaisonEcouleeRecette(final String budgetSaisonEcouleeRecette) {
        this.budgetSaisonEcouleeRecette = budgetSaisonEcouleeRecette;
    }

    
    @Column(name="budget_saison_ecoulee_recette"  )
      
    public String getBudgetSaisonEcouleeRecette() {
        return this.budgetSaisonEcouleeRecette;
    }
  
    
    private String communeAnneeN;

    public void setCommuneAnneeN(final String communeAnneeN) {
        this.communeAnneeN = communeAnneeN;
    }

    
    @Column(name="commune_annee_n"  )
      
    public String getCommuneAnneeN() {
        return this.communeAnneeN;
    }
  
}
