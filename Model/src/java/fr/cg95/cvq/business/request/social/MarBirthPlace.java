
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
@Table(name="mar_birth_place")
public class MarBirthPlace implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        MdphAdultRequest.conditions;

    public MarBirthPlace() {
        super();
      
    }

    public final String modelToXmlString() {
        MarBirthPlaceType object = (MarBirthPlaceType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MarBirthPlaceType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MarBirthPlaceType marBirthPlace = MarBirthPlaceType.Factory.newInstance();
        int i = 0;
    
        marBirthPlace.setPostalCode(this.postalCode);
      
        if (this.country != null)
            marBirthPlace.setCountry(fr.cg95.cvq.xml.common.CountryType.Enum.forString(this.country.getLegacyLabel()));
      
        marBirthPlace.setCity(this.city);
      
        return marBirthPlace;
    }

    public static MarBirthPlace xmlToModel(MarBirthPlaceType marBirthPlaceDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MarBirthPlace marBirthPlace = new MarBirthPlace();
    
        marBirthPlace.setPostalCode(marBirthPlaceDoc.getPostalCode());
      
        if (marBirthPlaceDoc.getCountry() != null)
            marBirthPlace.setCountry(fr.cg95.cvq.business.users.CountryType.forString(marBirthPlaceDoc.getCountry().toString()));
        else
            marBirthPlace.setCountry(fr.cg95.cvq.business.users.CountryType.getDefaultCountryType());
      
        marBirthPlace.setCity(marBirthPlaceDoc.getCity());
      
        return marBirthPlace;
    }

    @Override
    public MarBirthPlace clone() {
        MarBirthPlace result = new MarBirthPlace();
        
          
            
        result.setPostalCode(postalCode);
      
          
        
          
            
        if (country != null)
            result.setCountry(country);
        else
            result.setCountry(fr.cg95.cvq.business.users.CountryType.getDefaultCountryType());
      
          
        
          
            
        result.setCity(city);
      
          
        
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
        
          value = 5,
        
        
        profiles = {"subject"},
        message = "postalCode"
      )
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "postalCode"
      )
    
      @NotBlank(
        
        
        profiles = {"subject"},
        message = "postalCode"
      )
    
    private String postalCode;

    public void setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
    }

    
    @Column(name="postal_code" , length=5 )
      
    public String getPostalCode() {
        return this.postalCode;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "country"
      )
    
    private fr.cg95.cvq.business.users.CountryType country;

    public void setCountry(final fr.cg95.cvq.business.users.CountryType country) {
        this.country = country;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="country"  )
      
    public fr.cg95.cvq.business.users.CountryType getCountry() {
        return this.country;
    }
  
    
      @MaxLength(
        
          value = 32,
        
        
        profiles = {"subject"},
        message = "city"
      )
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "city"
      )
    
      @NotBlank(
        
        
        profiles = {"subject"},
        message = "city"
      )
    
    private String city;

    public void setCity(final String city) {
        this.city = city;
    }

    
    @Column(name="city" , length=32 )
      
    public String getCity() {
        return this.city;
    }
  
}
