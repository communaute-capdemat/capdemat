

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
        message = "fatherFirstNames"
      )
    
    private String fatherFirstNames;

    public final void setFatherFirstNames(final String fatherFirstNames) {
        this.fatherFirstNames = fatherFirstNames;
    }

    /**
 
        * @hibernate.property
        *  column="father_first_names"
        
      
    */
    public final String getFatherFirstNames() {
        return this.fatherFirstNames;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
            "return active",
        
        profiles = {"type"},
        message = "fatherFirstNames"
      )
    
    private String fatherFirstNames;

    public void setFatherFirstNames(final String fatherFirstNames) {
        this.fatherFirstNames = fatherFirstNames;
    }

 
    @Column(name="father_first_names"  )
      
    public String getFatherFirstNames() {
        return this.fatherFirstNames;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
            
            "return active",
        
        profiles = {"type"},
        message = "fatherInformation"
      )
    
    private fr.cg95.cvq.business.request.civil.MarriageFatherInformation fatherInformation;

    public final void setFatherLastName(final String fatherLastName) {
        this.fatherLastName = fatherLastName;
    public void setFatherLastName(final String fatherLastName) {
        this.fatherLastName = fatherLastName;
    public final void setFatherInformation(final fr.cg95.cvq.business.request.civil.MarriageFatherInformation fatherInformation) {
        this.fatherInformation = fatherInformation;
    }

 
        * @hibernate.property
        *  column="father_last_name"
        *  length="38"
    @Column(name="father_last_name" , length=38 )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="father_information_id"
        *  class="fr.cg95.cvq.business.request.civil.MarriageFatherInformation"
      
    */
    public final String getFatherLastName() {
        return this.fatherLastName;
    public String getFatherLastName() {
        return this.fatherLastName;
    */
    public final fr.cg95.cvq.business.request.civil.MarriageFatherInformation getFatherInformation() {
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

    public final void setMarriageCity(final String marriageCity) {
        this.marriageCity = marriageCity;
    public void setMarriageCity(final String marriageCity) {
        this.marriageCity = marriageCity;
    public final void setMarriage(final fr.cg95.cvq.business.request.civil.MarriageInformation marriage) {
        this.marriage = marriage;
    }

 
        * @hibernate.property
        *  column="marriage_city"
        *  length="32"
    @Column(name="marriage_city" , length=32 )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="marriage_id"
        *  class="fr.cg95.cvq.business.request.civil.MarriageInformation"
      
    */
    public final String getMarriageCity() {
        return this.marriageCity;
    public String getMarriageCity() {
        return this.marriageCity;
    */
    public final fr.cg95.cvq.business.request.civil.MarriageInformation getMarriage() {
        return this.marriage;
    }
  
    
      @NotNull(
        
        
        profiles = {"nature"},
        message = "marriageHusband"
      )
    
    private java.util.Date marriageDate;

    public final void setMarriageDate(final java.util.Date marriageDate) {
        this.marriageDate = marriageDate;
    }

    /**
 
        * @hibernate.property
        *  column="marriage_date"
        
      
    */
    public final java.util.Date getMarriageDate() {
        return this.marriageDate;
    }
  
    
      @NotNull(
    private java.util.Date marriageDate;

    public void setMarriageDate(final java.util.Date marriageDate) {
        this.marriageDate = marriageDate;
    }

 
    @Column(name="marriage_date"  )
      
    public java.util.Date getMarriageDate() {
        return this.marriageDate;
    }
  
    
      @NotNull(
      @AssertValid(
        
        
        profiles = {"nature"},
        message = "marriageHusband"
      )
    
    private fr.cg95.cvq.business.request.civil.MarriageHusbandInformation marriageHusband;

    public final void setMarriageHusbandFirstNames(final String marriageHusbandFirstNames) {
        this.marriageHusbandFirstNames = marriageHusbandFirstNames;
    public void setMarriageHusbandFirstNames(final String marriageHusbandFirstNames) {
        this.marriageHusbandFirstNames = marriageHusbandFirstNames;
    public final void setMarriageHusband(final fr.cg95.cvq.business.request.civil.MarriageHusbandInformation marriageHusband) {
        this.marriageHusband = marriageHusband;
    }

 
        * @hibernate.property
        *  column="marriage_husband_first_names"
        
    @Column(name="marriage_husband_first_names"  )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="marriage_husband_id"
        *  class="fr.cg95.cvq.business.request.civil.MarriageHusbandInformation"
      
    */
    public final String getMarriageHusbandFirstNames() {
        return this.marriageHusbandFirstNames;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"nature"},
        message = "marriageHusbandLastName"
      )
    
      @NotNull(
        
        
        profiles = {"nature"},
        message = "marriageHusbandLastName"
      )
    
      @NotBlank(
        
        
        profiles = {"nature"},
        message = "marriageHusbandLastName"
      )
    
    private String marriageHusbandLastName;

    public final void setMarriageHusbandLastName(final String marriageHusbandLastName) {
        this.marriageHusbandLastName = marriageHusbandLastName;
    public String getMarriageHusbandFirstNames() {
        return this.marriageHusbandFirstNames;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"nature"},
        message = "marriageHusbandLastName"
      )
    
      @NotNull(
        
        
        profiles = {"nature"},
        message = "marriageHusbandLastName"
      )
    
      @NotBlank(
        
        
        profiles = {"nature"},
        message = "marriageHusbandLastName"
      )
    
    private String marriageHusbandLastName;

    public void setMarriageHusbandLastName(final String marriageHusbandLastName) {
        this.marriageHusbandLastName = marriageHusbandLastName;
    */
    public final fr.cg95.cvq.business.request.civil.MarriageHusbandInformation getMarriageHusband() {
        return this.marriageHusband;
    }
        * @hibernate.property
        *  column="marriage_husband_last_name"
        *  length="38"
      
    */
    public final String getMarriageHusbandLastName() {
        return this.marriageHusbandLastName;
    }
    @Column(name="marriage_husband_last_name" , length=38 )
      
    public String getMarriageHusbandLastName() {
        return this.marriageHusbandLastName;
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

    public final void setMarriagePostalCode(final String marriagePostalCode) {
        this.marriagePostalCode = marriagePostalCode;
    public void setMarriagePostalCode(final String marriagePostalCode) {
        this.marriagePostalCode = marriagePostalCode;
    public final void setMarriageWife(final fr.cg95.cvq.business.request.civil.MarriageWifeInformation marriageWife) {
        this.marriageWife = marriageWife;
    }

 
        * @hibernate.property
        *  column="marriage_postal_code"
        *  length="2"
    @Column(name="marriage_postal_code" , length=2 )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="marriage_wife_id"
        *  class="fr.cg95.cvq.business.request.civil.MarriageWifeInformation"
      
    */
    public final String getMarriagePostalCode() {
        return this.marriagePostalCode;
    public String getMarriagePostalCode() {
        return this.marriagePostalCode;
    */
    public final fr.cg95.cvq.business.request.civil.MarriageWifeInformation getMarriageWife() {
        return this.marriageWife;
    }
  
    
      @AssertValid(
        
        
        profiles = {"nature"},
        message = "marriageWifeFirstNames"
      )
    
    private String marriageWifeFirstNames;

    public final void setMarriageWifeFirstNames(final String marriageWifeFirstNames) {
        this.marriageWifeFirstNames = marriageWifeFirstNames;
    }

    /**
 
        * @hibernate.property
        *  column="marriage_wife_first_names"
        
      
    */
    public final String getMarriageWifeFirstNames() {
        return this.marriageWifeFirstNames;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"nature"},
        message = "marriageWifeLastName"
      )
    
      @NotNull(
        
        
        profiles = {"nature"},
        message = "marriageWifeLastName"
      )
    
      @NotBlank(
        
        
        profiles = {"nature"},
        message = "marriageWifeLastName"
      )
    
    private String marriageWifeLastName;

    public final void setMarriageWifeLastName(final String marriageWifeLastName) {
        this.marriageWifeLastName = marriageWifeLastName;
    }

    /**
 
        * @hibernate.property
        *  column="marriage_wife_last_name"
        *  length="38"
      
    */
    public final String getMarriageWifeLastName() {
        return this.marriageWifeLastName;
    }
  
    
      @NotNull(
        
        
        profiles = {"nature"},
        message = "marriageWifeFirstNames"
      )
    
    private String marriageWifeFirstNames;

    public void setMarriageWifeFirstNames(final String marriageWifeFirstNames) {
        this.marriageWifeFirstNames = marriageWifeFirstNames;
    }

 
    @Column(name="marriage_wife_first_names"  )
      
    public String getMarriageWifeFirstNames() {
        return this.marriageWifeFirstNames;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
        profiles = {"nature"},
        message = "marriageWifeLastName"
      )
    
      @NotNull(
        
        
        profiles = {"nature"},
        message = "marriageWifeLastName"
      )
    
      @NotBlank(
        
        
        profiles = {"nature"},
        message = "marriageWifeLastName"
      )
    
    private String marriageWifeLastName;

    public void setMarriageWifeLastName(final String marriageWifeLastName) {
        this.marriageWifeLastName = marriageWifeLastName;
    }

 
    @Column(name="marriage_wife_last_name" , length=38 )
      
    public String getMarriageWifeLastName() {
        return this.marriageWifeLastName;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['format'].test(_this.format.toString());" +
                
              
              
            
            "return active",
        
        profiles = {"type"},
        message = "motherFirstNames"
      )
    
    private String motherFirstNames;

    public final void setMotherFirstNames(final String motherFirstNames) {
        this.motherFirstNames = motherFirstNames;
    }

    /**
 
        * @hibernate.property
        *  column="mother_first_names"
        
      
    */
    public final String getMotherFirstNames() {
        return this.motherFirstNames;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
            
            "active &= _this.conditions['format'].test(_this.format.toString());" +
                
              
            "return active",
        
        profiles = {"type"},
        message = "motherFirstNames"
      )
    
    private String motherFirstNames;

    public void setMotherFirstNames(final String motherFirstNames) {
        this.motherFirstNames = motherFirstNames;
    }

 
    @Column(name="mother_first_names"  )
      
    public String getMotherFirstNames() {
        return this.motherFirstNames;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
            
            "active &= _this.conditions['format'].test(_this.format.toString());" +
                
              
            
            "return active",
        
        profiles = {"type"},
        message = "motherInformation"
      )
    
    private fr.cg95.cvq.business.request.civil.MarriageMotherInformation motherInformation;

    public final void setMotherMaidenName(final String motherMaidenName) {
        this.motherMaidenName = motherMaidenName;
    public void setMotherMaidenName(final String motherMaidenName) {
        this.motherMaidenName = motherMaidenName;
    public final void setMotherInformation(final fr.cg95.cvq.business.request.civil.MarriageMotherInformation motherInformation) {
        this.motherInformation = motherInformation;
    }

 
        * @hibernate.property
        *  column="mother_maiden_name"
        *  length="38"
    @Column(name="mother_maiden_name" , length=38 )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="mother_information_id"
        *  class="fr.cg95.cvq.business.request.civil.MarriageMotherInformation"
      
    */
    public final String getMotherMaidenName() {
        return this.motherMaidenName;
    public String getMotherMaidenName() {
        return this.motherMaidenName;
    */
    public final fr.cg95.cvq.business.request.civil.MarriageMotherInformation getMotherInformation() {
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
