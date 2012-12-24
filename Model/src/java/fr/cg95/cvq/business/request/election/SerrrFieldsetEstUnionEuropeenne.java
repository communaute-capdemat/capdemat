
package fr.cg95.cvq.business.request.election;

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
import fr.cg95.cvq.xml.request.election.*;
import fr.cg95.cvq.service.request.LocalReferential;
import fr.cg95.cvq.service.request.condition.IConditionChecker;
import javax.persistence.*;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Type;

/**
 * Generated class file, do not edit !
 */
@Entity
@Table(name="serrr_fieldset_est_union_europeenne")
public class SerrrFieldsetEstUnionEuropeenne implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        StandardElectoralRollRegistrationRequest.conditions;

    public SerrrFieldsetEstUnionEuropeenne() {
        super();
      
        typeElection = fr.cg95.cvq.business.request.election.SerrrTypeElectionType.ELECTION_MUNICIPALE;
      
    }

    public final String modelToXmlString() {
        SerrrFieldsetEstUnionEuropeenneType object = (SerrrFieldsetEstUnionEuropeenneType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final SerrrFieldsetEstUnionEuropeenneType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        SerrrFieldsetEstUnionEuropeenneType serrrFieldsetEstUnionEuropeenne = SerrrFieldsetEstUnionEuropeenneType.Factory.newInstance();
        int i = 0;
    
        if (this.precisionNationalite != null)
            serrrFieldsetEstUnionEuropeenne.setPrecisionNationalite(fr.cg95.cvq.xml.request.election.SerrrPrecisionNationaliteType.Enum.forString(this.precisionNationalite.getLegacyLabel()));
      
        serrrFieldsetEstUnionEuropeenne.setSubdivisionAdministrativePrecedente(this.subdivisionAdministrativePrecedente);
      
        if (this.paysPrecedent != null)
            serrrFieldsetEstUnionEuropeenne.setPaysPrecedent(fr.cg95.cvq.xml.common.CountryType.Enum.forString(this.paysPrecedent.getLegacyLabel()));
      
        serrrFieldsetEstUnionEuropeenne.setCommuneOuLocalitePrecedente(this.communeOuLocalitePrecedente);
      
        if (this.typeElection != null)
            serrrFieldsetEstUnionEuropeenne.setTypeElection(fr.cg95.cvq.xml.request.election.SerrrTypeElectionType.Enum.forString(this.typeElection.getLegacyLabel()));
      
        return serrrFieldsetEstUnionEuropeenne;
    }

    public static SerrrFieldsetEstUnionEuropeenne xmlToModel(SerrrFieldsetEstUnionEuropeenneType serrrFieldsetEstUnionEuropeenneDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        SerrrFieldsetEstUnionEuropeenne serrrFieldsetEstUnionEuropeenne = new SerrrFieldsetEstUnionEuropeenne();
    
        if (serrrFieldsetEstUnionEuropeenneDoc.getPrecisionNationalite() != null)
            serrrFieldsetEstUnionEuropeenne.setPrecisionNationalite(fr.cg95.cvq.business.request.election.SerrrPrecisionNationaliteType.forString(serrrFieldsetEstUnionEuropeenneDoc.getPrecisionNationalite().toString()));
        else
            serrrFieldsetEstUnionEuropeenne.setPrecisionNationalite(fr.cg95.cvq.business.request.election.SerrrPrecisionNationaliteType.getDefaultSerrrPrecisionNationaliteType());
      
        serrrFieldsetEstUnionEuropeenne.setSubdivisionAdministrativePrecedente(serrrFieldsetEstUnionEuropeenneDoc.getSubdivisionAdministrativePrecedente());
      
        if (serrrFieldsetEstUnionEuropeenneDoc.getPaysPrecedent() != null)
            serrrFieldsetEstUnionEuropeenne.setPaysPrecedent(fr.cg95.cvq.business.users.CountryType.forString(serrrFieldsetEstUnionEuropeenneDoc.getPaysPrecedent().toString()));
        else
            serrrFieldsetEstUnionEuropeenne.setPaysPrecedent(fr.cg95.cvq.business.users.CountryType.getDefaultCountryType());
      
        serrrFieldsetEstUnionEuropeenne.setCommuneOuLocalitePrecedente(serrrFieldsetEstUnionEuropeenneDoc.getCommuneOuLocalitePrecedente());
      
        if (serrrFieldsetEstUnionEuropeenneDoc.getTypeElection() != null)
            serrrFieldsetEstUnionEuropeenne.setTypeElection(fr.cg95.cvq.business.request.election.SerrrTypeElectionType.forString(serrrFieldsetEstUnionEuropeenneDoc.getTypeElection().toString()));
        else
            serrrFieldsetEstUnionEuropeenne.setTypeElection(fr.cg95.cvq.business.request.election.SerrrTypeElectionType.getDefaultSerrrTypeElectionType());
      
        return serrrFieldsetEstUnionEuropeenne;
    }

    @Override
    public SerrrFieldsetEstUnionEuropeenne clone() {
        SerrrFieldsetEstUnionEuropeenne result = new SerrrFieldsetEstUnionEuropeenne();
        
          
            
        if (precisionNationalite != null)
            result.setPrecisionNationalite(precisionNationalite);
        else
            result.setPrecisionNationalite(fr.cg95.cvq.business.request.election.SerrrPrecisionNationaliteType.getDefaultSerrrPrecisionNationaliteType());
      
          
        
          
            
        result.setSubdivisionAdministrativePrecedente(subdivisionAdministrativePrecedente);
      
          
        
          
            
        if (paysPrecedent != null)
            result.setPaysPrecedent(paysPrecedent);
        else
            result.setPaysPrecedent(fr.cg95.cvq.business.users.CountryType.getDefaultCountryType());
      
          
        
          
            
        result.setCommuneOuLocalitePrecedente(communeOuLocalitePrecedente);
      
          
        
          
            
        if (typeElection != null)
            result.setTypeElection(typeElection);
        else
            result.setTypeElection(fr.cg95.cvq.business.request.election.SerrrTypeElectionType.getDefaultSerrrTypeElectionType());
      
          
        
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
        
        
          when = "groovy:def active = true;" +
          
              
            
            
            "return active",
        
        profiles = {"inscription"},
        message = "precisionNationalite"
      )
    
    private fr.cg95.cvq.business.request.election.SerrrPrecisionNationaliteType precisionNationalite;

    public void setPrecisionNationalite(final fr.cg95.cvq.business.request.election.SerrrPrecisionNationaliteType precisionNationalite) {
        this.precisionNationalite = precisionNationalite;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="precision_nationalite"  )
      
    public fr.cg95.cvq.business.request.election.SerrrPrecisionNationaliteType getPrecisionNationalite() {
        return this.precisionNationalite;
    }
  
    
    private String subdivisionAdministrativePrecedente;

    public void setSubdivisionAdministrativePrecedente(final String subdivisionAdministrativePrecedente) {
        this.subdivisionAdministrativePrecedente = subdivisionAdministrativePrecedente;
    }

    
    @Column(name="subdivision_administrative_precedente"  )
      
    public String getSubdivisionAdministrativePrecedente() {
        return this.subdivisionAdministrativePrecedente;
    }
  
    
    private fr.cg95.cvq.business.users.CountryType paysPrecedent;

    public void setPaysPrecedent(final fr.cg95.cvq.business.users.CountryType paysPrecedent) {
        this.paysPrecedent = paysPrecedent;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="pays_precedent"  )
      
    public fr.cg95.cvq.business.users.CountryType getPaysPrecedent() {
        return this.paysPrecedent;
    }
  
    
      @MaxLength(
        
          value = 32,
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['serrrFieldsetEstUnionEuropeenne.typeElection'].test(_this.typeElection.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"inscription"},
        message = "communeOuLocalitePrecedente"
      )
    
    private String communeOuLocalitePrecedente;

    public void setCommuneOuLocalitePrecedente(final String communeOuLocalitePrecedente) {
        this.communeOuLocalitePrecedente = communeOuLocalitePrecedente;
    }

    
    @Column(name="commune_ou_localite_precedente" , length=32 )
      
    public String getCommuneOuLocalitePrecedente() {
        return this.communeOuLocalitePrecedente;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
              
            
            
            "return active",
        
        profiles = {"inscription"},
        message = "typeElection"
      )
    
    private fr.cg95.cvq.business.request.election.SerrrTypeElectionType typeElection;

    public void setTypeElection(final fr.cg95.cvq.business.request.election.SerrrTypeElectionType typeElection) {
        this.typeElection = typeElection;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="type_election"  )
      
    public fr.cg95.cvq.business.request.election.SerrrTypeElectionType getTypeElection() {
        return this.typeElection;
    }
  
}
