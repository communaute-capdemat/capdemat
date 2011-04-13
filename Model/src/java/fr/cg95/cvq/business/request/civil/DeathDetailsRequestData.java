

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
@Table(name="death_details_request")
public class DeathDetailsRequestData implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>(RequestData.conditions);

    private Long id;

    public DeathDetailsRequestData() {
      
        format = fr.cg95.cvq.business.request.civil.DeathCertificateFormatType.FULL_COPY;
      
    }

    @Override
    public DeathDetailsRequestData clone() {
        DeathDetailsRequestData result = new DeathDetailsRequestData();
        
          
            
        result.setComment(comment);
      
          
        
          
            
        result.setCopies(copies);
      
          
        
          
            
        result.setDeathCity(deathCity);
      
          
        
          
            
        result.setDeathDate(deathDate);
      
          
        
          
            
        result.setDeathFirstNames(deathFirstNames);
      
          
        
          
            
        result.setDeathLastName(deathLastName);
      
          
        
          
            
        if (deathPostalCode != null)
            result.setDeathPostalCode(deathPostalCode);
        else
            result.setDeathPostalCode(fr.cg95.cvq.business.users.InseeDepartementCodeType.getDefaultInseeDepartementCodeType());
      
          
        
          
            
        if (format != null)
            result.setFormat(format);
        else
            result.setFormat(fr.cg95.cvq.business.request.civil.DeathCertificateFormatType.getDefaultDeathCertificateFormatType());
      
          
        
          
            
        if (motive != null)
            result.setMotive(motive);
        else
            result.setMotive(fr.cg95.cvq.business.request.civil.DeathCertificateMotiveType.getDefaultDeathCertificateMotiveType());
      
          
        
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
        
          value = 255,
        
        
        profiles = {"type"},
        message = "comment"
      )
    
      @MatchPattern(
        
          pattern = "^[\\w\\W]{0,255}$",
        
        
        profiles = {"type"},
        message = "comment"
      )
    
    private String comment;

    public void setComment(final String comment) {
        this.comment = comment;
    }

 
    @Column(name="comment" , length=255 )
      
    public String getComment() {
        return this.comment;
    }
  
    
      @NotNull(
        
        
        profiles = {"type"},
        message = "copies"
      )
    
    private java.math.BigInteger copies;

    public void setCopies(final java.math.BigInteger copies) {
        this.copies = copies;
    }

 
    @Column(name="copies" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getCopies() {
        return this.copies;
    }
  
    
      @MaxLength(
        
          value = 32,
        
        
        profiles = {"nature"},
        message = "deathCity"
      )
    
      @NotNull(
        
        
        profiles = {"nature"},
        message = "deathCity"
      )
    
      @NotBlank(
        
        
        profiles = {"nature"},
        message = "deathCity"
      )
    
    private String deathCity;

    public void setDeathCity(final String deathCity) {
        this.deathCity = deathCity;
    }

 
    @Column(name="death_city" , length=32 )
      
    public String getDeathCity() {
        return this.deathCity;
    }
  
    
      @NotNull(
        
        
        profiles = {"nature"},
        message = "deathDate"
      )
    
    private java.util.Date deathDate;

    public void setDeathDate(final java.util.Date deathDate) {
        this.deathDate = deathDate;
    }

 
    @Column(name="death_date"  )
      
    public java.util.Date getDeathDate() {
        return this.deathDate;
    }
  
    
      @NotNull(
        
        
        profiles = {"nature"},
        message = "deathFirstNames"
      )
    
      @NotBlank(
        
        
        profiles = {"nature"},
        message = "deathFirstNames"
      )
    
    private String deathFirstNames;

    public void setDeathFirstNames(final String deathFirstNames) {
        this.deathFirstNames = deathFirstNames;
    }

 
    @Column(name="death_first_names"  )
      
    public String getDeathFirstNames() {
        return this.deathFirstNames;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"nature"},
        message = "deathLastName"
      )
    
      @NotNull(
        
        
        profiles = {"nature"},
        message = "deathLastName"
      )
    
      @NotBlank(
        
        
        profiles = {"nature"},
        message = "deathLastName"
      )
    
    private String deathLastName;

    public void setDeathLastName(final String deathLastName) {
        this.deathLastName = deathLastName;
    }

 
    @Column(name="death_last_name" , length=38 )
      
    public String getDeathLastName() {
        return this.deathLastName;
    }
  
    
      @NotNull(
        
        
        profiles = {"nature"},
        message = "deathPostalCode"
      )
    
    private fr.cg95.cvq.business.users.InseeDepartementCodeType deathPostalCode;

    public final void setDeathPostalCode(final String deathPostalCode) {
    public void setDeathPostalCode(final String deathPostalCode) {
    public final void setDeathPostalCode(final fr.cg95.cvq.business.users.InseeDepartementCodeType deathPostalCode) {
        this.deathPostalCode = deathPostalCode;
    }

 
        * @hibernate.property
        *  column="death_postal_code"
        *  length="2"
    @Column(name="death_postal_code" , length=2 )
        * @hibernate.property
        *  column="death_postal_code"
        
      
    */
    public final String getDeathPostalCode() {
    public String getDeathPostalCode() {
    */
    public final fr.cg95.cvq.business.users.InseeDepartementCodeType getDeathPostalCode() {
        return this.deathPostalCode;
    }
  
    
      @NotNull(
        
        
        profiles = {"type"},
        message = "format"
      )
    
    private fr.cg95.cvq.business.request.civil.DeathCertificateFormatType format;

    public void setFormat(final fr.cg95.cvq.business.request.civil.DeathCertificateFormatType format) {
        this.format = format;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="format"  )
      
    public fr.cg95.cvq.business.request.civil.DeathCertificateFormatType getFormat() {
        return this.format;
    }
  
    
    private fr.cg95.cvq.business.request.civil.DeathCertificateMotiveType motive;

    public void setMotive(final fr.cg95.cvq.business.request.civil.DeathCertificateMotiveType motive) {
        this.motive = motive;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="motive"  )
      
    public fr.cg95.cvq.business.request.civil.DeathCertificateMotiveType getMotive() {
        return this.motive;
    }
  
}
