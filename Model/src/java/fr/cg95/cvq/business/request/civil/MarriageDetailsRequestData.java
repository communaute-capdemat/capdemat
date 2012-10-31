

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
@Table(name="marriage_details_request")
public class MarriageDetailsRequestData implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>(RequestData.conditions);

    private Long id;

    public MarriageDetailsRequestData() {
      
        format = fr.cg95.cvq.business.request.civil.MarriageCertificateFormatType.FULL_COPY;
      
    }

    @Override
    public MarriageDetailsRequestData clone() {
        MarriageDetailsRequestData result = new MarriageDetailsRequestData();
        
          
            
        result.setComment(comment);
      
          
        
          
            
        result.setCopies(copies);
      
          
        
          
            
        if (fatherInformation != null)
            result.setFatherInformation(fatherInformation.clone());
      
          
        
          
            
        if (format != null)
            result.setFormat(format);
        else
            result.setFormat(fr.cg95.cvq.business.request.civil.MarriageCertificateFormatType.getDefaultMarriageCertificateFormatType());
      
          
        
          
            
        if (marriage != null)
            result.setMarriage(marriage.clone());
      
          
        
          
            
        if (marriageHusband != null)
            result.setMarriageHusband(marriageHusband.clone());
      
          
        
          
            
        if (marriageWife != null)
            result.setMarriageWife(marriageWife.clone());
      
          
        
          
            
        if (motherInformation != null)
            result.setMotherInformation(motherInformation.clone());
      
          
        
          
            
        if (motive != null)
            result.setMotive(motive);
        else
            result.setMotive(fr.cg95.cvq.business.request.civil.MarriageCertificateMotiveType.getDefaultMarriageCertificateMotiveType());
      
          
        
          
            
        if (relationship != null)
            result.setRelationship(relationship);
        else
            result.setRelationship(fr.cg95.cvq.business.request.civil.MarriageRelationshipType.getDefaultMarriageRelationshipType());
      
          
        
          
            
        if (requesterQuality != null)
            result.setRequesterQuality(requesterQuality);
        else
            result.setRequesterQuality(fr.cg95.cvq.business.request.civil.MarriageRequesterQualityType.getDefaultMarriageRequesterQualityType());
      
          
        
          
            
        result.setRequesterQualityPrecision(requesterQualityPrecision);
      
          
        
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
        
          pattern = "[\\w\\W]{0,255}$",
        
        
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
  
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['format'].test(_this.format.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"type"},
        message = "fatherInformation"
      )
    
    private fr.cg95.cvq.business.request.civil.MarriageFatherInformation fatherInformation;

    public void setFatherInformation(final fr.cg95.cvq.business.request.civil.MarriageFatherInformation fatherInformation) {
        this.fatherInformation = fatherInformation;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="father_information_id")
      
    public fr.cg95.cvq.business.request.civil.MarriageFatherInformation getFatherInformation() {
        return this.fatherInformation;
    }
  
    
      @NotNull(
        
        
        profiles = {"type"},
        message = "format"
      )
    
    private fr.cg95.cvq.business.request.civil.MarriageCertificateFormatType format;

    public void setFormat(final fr.cg95.cvq.business.request.civil.MarriageCertificateFormatType format) {
        this.format = format;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="format"  )
      
    public fr.cg95.cvq.business.request.civil.MarriageCertificateFormatType getFormat() {
        return this.format;
    }
  
    
      @NotNull(
        
        
        profiles = {"nature"},
        message = "marriage"
      )
    
      @AssertValid(
        
        
        profiles = {"nature"},
        message = "marriage"
      )
    
    private fr.cg95.cvq.business.request.civil.MarriageInformation marriage;

    public void setMarriage(final fr.cg95.cvq.business.request.civil.MarriageInformation marriage) {
        this.marriage = marriage;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="marriage_id")
      
    public fr.cg95.cvq.business.request.civil.MarriageInformation getMarriage() {
        return this.marriage;
    }
  
    
      @NotNull(
        
        
        profiles = {"nature"},
        message = "marriageHusband"
      )
    
      @AssertValid(
        
        
        profiles = {"nature"},
        message = "marriageHusband"
      )
    
    private fr.cg95.cvq.business.request.civil.MarriageHusbandInformation marriageHusband;

    public void setMarriageHusband(final fr.cg95.cvq.business.request.civil.MarriageHusbandInformation marriageHusband) {
        this.marriageHusband = marriageHusband;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="marriage_husband_id")
      
    public fr.cg95.cvq.business.request.civil.MarriageHusbandInformation getMarriageHusband() {
        return this.marriageHusband;
    }
  
    
      @NotNull(
        
        
        profiles = {"nature"},
        message = "marriageWife"
      )
    
      @AssertValid(
        
        
        profiles = {"nature"},
        message = "marriageWife"
      )
    
    private fr.cg95.cvq.business.request.civil.MarriageWifeInformation marriageWife;

    public void setMarriageWife(final fr.cg95.cvq.business.request.civil.MarriageWifeInformation marriageWife) {
        this.marriageWife = marriageWife;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="marriage_wife_id")
      
    public fr.cg95.cvq.business.request.civil.MarriageWifeInformation getMarriageWife() {
        return this.marriageWife;
    }
  
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['format'].test(_this.format.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"type"},
        message = "motherInformation"
      )
    
    private fr.cg95.cvq.business.request.civil.MarriageMotherInformation motherInformation;

    public void setMotherInformation(final fr.cg95.cvq.business.request.civil.MarriageMotherInformation motherInformation) {
        this.motherInformation = motherInformation;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="mother_information_id")
      
    public fr.cg95.cvq.business.request.civil.MarriageMotherInformation getMotherInformation() {
        return this.motherInformation;
    }
  
    
    private fr.cg95.cvq.business.request.civil.MarriageCertificateMotiveType motive;

    public void setMotive(final fr.cg95.cvq.business.request.civil.MarriageCertificateMotiveType motive) {
        this.motive = motive;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="motive"  )
      
    public fr.cg95.cvq.business.request.civil.MarriageCertificateMotiveType getMotive() {
        return this.motive;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['format'].test(_this.format.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"type"},
        message = "relationship"
      )
    
    private fr.cg95.cvq.business.request.civil.MarriageRelationshipType relationship;

    public void setRelationship(final fr.cg95.cvq.business.request.civil.MarriageRelationshipType relationship) {
        this.relationship = relationship;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="relationship"  )
      
    public fr.cg95.cvq.business.request.civil.MarriageRelationshipType getRelationship() {
        return this.relationship;
    }
  
    
    private fr.cg95.cvq.business.request.civil.MarriageRequesterQualityType requesterQuality;

    public void setRequesterQuality(final fr.cg95.cvq.business.request.civil.MarriageRequesterQualityType requesterQuality) {
        this.requesterQuality = requesterQuality;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="requester_quality"  )
      
    public fr.cg95.cvq.business.request.civil.MarriageRequesterQualityType getRequesterQuality() {
        return this.requesterQuality;
    }
  
    
    private String requesterQualityPrecision;

    public void setRequesterQualityPrecision(final String requesterQualityPrecision) {
        this.requesterQualityPrecision = requesterQualityPrecision;
    }

 
    @Column(name="requester_quality_precision"  )
      
    public String getRequesterQualityPrecision() {
        return this.requesterQualityPrecision;
    }
  
}
