
package fr.cg95.cvq.business.request.leisure;

import java.io.Serializable;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
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
@Table(name="crer_reservation")
public class CrerReservation implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        CG34ReservationEvenementRequest.conditions;

    public CrerReservation() {
        super();
      
    }

    public final String modelToXmlString() {
        CrerReservationType object = (CrerReservationType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final CrerReservationType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        CrerReservationType crerReservation = CrerReservationType.Factory.newInstance();
        int i = 0;
    
        crerReservation.setReservationType(this.reservationType);
      
        if (this.nombrePlaces != null)
            crerReservation.setNombrePlaces(new BigInteger(this.nombrePlaces.toString()));
      
        return crerReservation;
    }

    public static CrerReservation xmlToModel(CrerReservationType crerReservationDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        CrerReservation crerReservation = new CrerReservation();
    
        crerReservation.setReservationType(crerReservationDoc.getReservationType());
      
        crerReservation.setNombrePlaces(crerReservationDoc.getNombrePlaces());
      
        return crerReservation;
    }

    @Override
    public CrerReservation clone() {
        CrerReservation result = new CrerReservation();
        
          
            
        result.setReservationType(reservationType);
      
          
        
          
            
        result.setNombrePlaces(nombrePlaces);
      
          
        
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
        
        
        profiles = {"reservation"},
        message = "reservationType"
      )
    
      @NotBlank(
        
        
        profiles = {"reservation"},
        message = "reservationType"
      )
    
    private String reservationType;

    public void setReservationType(final String reservationType) {
        this.reservationType = reservationType;
    }


    @Column(name="reservation_type"  )
      
    public String getReservationType() {
        return this.reservationType;
    }
  
    
      @NotNull(
        
        
        profiles = {"reservation"},
        message = "nombrePlaces"
      )
    
    private java.math.BigInteger nombrePlaces;

    public void setNombrePlaces(final java.math.BigInteger nombrePlaces) {
        this.nombrePlaces = nombrePlaces;
    }


    @Column(name="nombre_places" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getNombrePlaces() {
        return this.nombrePlaces;
    }
  
}
