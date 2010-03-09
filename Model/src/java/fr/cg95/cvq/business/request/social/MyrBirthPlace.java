
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
 *  table="myr_birth_place"
 *  lazy="false"
 */
public class MyrBirthPlace implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public MyrBirthPlace() {
        super();
      
    }

    public final String modelToXmlString() {
        MyrBirthPlaceType object = (MyrBirthPlaceType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final MyrBirthPlaceType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        MyrBirthPlaceType myrBirthPlace = MyrBirthPlaceType.Factory.newInstance();
        int i = 0;
    
        myrBirthPlace.setPostalCode(this.postalCode);
      
        if (this.country != null)
            myrBirthPlace.setCountry(fr.cg95.cvq.xml.common.CountryType.Enum.forString(this.country.toString()));
      
        myrBirthPlace.setCity(this.city);
      
        return myrBirthPlace;
    }

    public static MyrBirthPlace xmlToModel(MyrBirthPlaceType myrBirthPlaceDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        MyrBirthPlace myrBirthPlace = new MyrBirthPlace();
    
        myrBirthPlace.setPostalCode(myrBirthPlaceDoc.getPostalCode());
      
        if (myrBirthPlaceDoc.getCountry() != null)
            myrBirthPlace.setCountry(fr.cg95.cvq.business.users.CountryType.forString(myrBirthPlaceDoc.getCountry().toString()));
        else
            myrBirthPlace.setCountry(fr.cg95.cvq.business.users.CountryType.getDefaultCountryType());
      
        myrBirthPlace.setCity(myrBirthPlaceDoc.getCity());
      
        return myrBirthPlace;
    }

    @Override
    public MyrBirthPlace clone() {
        MyrBirthPlace result = new MyrBirthPlace();
        
          
            
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

    /**
     * @hibernate.id
     *  column="id"
     *  generator-class="sequence"
     */
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

    public final void setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
    }

    /**
  
        * @hibernate.property
        *  column="postal_code"
        *  length="5"
      
    */
    public final String getPostalCode() {
        return this.postalCode;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "country"
      )
    
    private fr.cg95.cvq.business.users.CountryType country;

    public final void setCountry(final fr.cg95.cvq.business.users.CountryType country) {
        this.country = country;
    }

    /**
  
        * @hibernate.property
        *  column="country"
        
      
    */
    public final fr.cg95.cvq.business.users.CountryType getCountry() {
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

    public final void setCity(final String city) {
        this.city = city;
    }

    /**
  
        * @hibernate.property
        *  column="city"
        *  length="32"
      
    */
    public final String getCity() {
        return this.city;
    }
  
}
