
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
@Table(name="segment")
public class Segment implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        ActivityRegistrationRequest.conditions;

    public Segment() {
        super();
      
    }

    public final String modelToXmlString() {
        SegmentType object = (SegmentType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final SegmentType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        SegmentType segment = SegmentType.Factory.newInstance();
        int i = 0;
    
        segment.setLabelSegment(this.labelSegment);
      
        segment.setIdSegment(this.idSegment);
      
        return segment;
    }

    public static Segment xmlToModel(SegmentType segmentDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        Segment segment = new Segment();
    
        segment.setLabelSegment(segmentDoc.getLabelSegment());
      
        segment.setIdSegment(segmentDoc.getIdSegment());
      
        return segment;
    }

    @Override
    public Segment clone() {
        Segment result = new Segment();
        
          
            
        result.setLabelSegment(labelSegment);
      
          
        
          
            
        result.setIdSegment(idSegment);
      
          
        
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
        message = "labelSegment"
      )
    
      @NotBlank(
        
        
        profiles = {"preinscription"},
        message = "labelSegment"
      )
    
    private String labelSegment;

    public void setLabelSegment(final String labelSegment) {
        this.labelSegment = labelSegment;
    }

    
    @Column(name="label_segment"  )
      
    public String getLabelSegment() {
        return this.labelSegment;
    }
  
    
      @NotNull(
        
        
        profiles = {"preinscription"},
        message = "idSegment"
      )
    
      @NotBlank(
        
        
        profiles = {"preinscription"},
        message = "idSegment"
      )
    
    private String idSegment;

    public void setIdSegment(final String idSegment) {
        this.idSegment = idSegment;
    }

    
    @Column(name="id_segment"  )
      
    public String getIdSegment() {
        return this.idSegment;
    }
  
}
