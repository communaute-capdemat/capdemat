
package fr.cg95.cvq.business.request.military;

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
import fr.cg95.cvq.xml.request.military.*;
import fr.cg95.cvq.service.request.LocalReferential;
import fr.cg95.cvq.service.request.condition.IConditionChecker;
import javax.persistence.*;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Type;

/**
 * Generated class file, do not edit !
 */
@Entity
@Table(name="family_situation_information")
public class FamilySituationInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        MilitaryCensusRequest.conditions;

    public FamilySituationInformation() {
        super();
      
        childStatus = fr.cg95.cvq.business.users.FamilyStatusType.OTHER;
      
        statePupil = Boolean.valueOf(false);
      
        prefectPupil = Boolean.valueOf(false);
      
    }

    public final String modelToXmlString() {
        FamilySituationInformationType object = (FamilySituationInformationType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final FamilySituationInformationType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        FamilySituationInformationType familySituationInformation = FamilySituationInformationType.Factory.newInstance();
        int i = 0;
    
        if (this.childStatus != null)
            familySituationInformation.setChildStatus(fr.cg95.cvq.xml.common.FamilyStatusType.Enum.forString(this.childStatus.getLegacyLabel()));
      
        if (this.statePupil != null)
            familySituationInformation.setStatePupil(this.statePupil.booleanValue());
      
        if (this.aliveChildren != null)
            familySituationInformation.setAliveChildren(new BigInteger(this.aliveChildren.toString()));
      
        if (this.prefectPupil != null)
            familySituationInformation.setPrefectPupil(this.prefectPupil.booleanValue());
      
        if (this.childrenInCharge != null)
            familySituationInformation.setChildrenInCharge(new BigInteger(this.childrenInCharge.toString()));
      
        familySituationInformation.setOtherSituation(this.otherSituation);
      
        if (this.prefectPupilDepartment != null)
            familySituationInformation.setPrefectPupilDepartment(fr.cg95.cvq.xml.common.InseeDepartementCodeType.Enum.forString(this.prefectPupilDepartment.getLegacyLabel()));
      
        return familySituationInformation;
    }

    public static FamilySituationInformation xmlToModel(FamilySituationInformationType familySituationInformationDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        FamilySituationInformation familySituationInformation = new FamilySituationInformation();
    
        if (familySituationInformationDoc.getChildStatus() != null)
            familySituationInformation.setChildStatus(fr.cg95.cvq.business.users.FamilyStatusType.forString(familySituationInformationDoc.getChildStatus().toString()));
        else
            familySituationInformation.setChildStatus(fr.cg95.cvq.business.users.FamilyStatusType.getDefaultFamilyStatusType());
      
        familySituationInformation.setStatePupil(Boolean.valueOf(familySituationInformationDoc.getStatePupil()));
      
        familySituationInformation.setAliveChildren(familySituationInformationDoc.getAliveChildren());
      
        familySituationInformation.setPrefectPupil(Boolean.valueOf(familySituationInformationDoc.getPrefectPupil()));
      
        familySituationInformation.setChildrenInCharge(familySituationInformationDoc.getChildrenInCharge());
      
        familySituationInformation.setOtherSituation(familySituationInformationDoc.getOtherSituation());
      
        if (familySituationInformationDoc.getPrefectPupilDepartment() != null)
            familySituationInformation.setPrefectPupilDepartment(fr.cg95.cvq.business.users.InseeDepartementCodeType.forString(familySituationInformationDoc.getPrefectPupilDepartment().toString()));
        else
            familySituationInformation.setPrefectPupilDepartment(fr.cg95.cvq.business.users.InseeDepartementCodeType.getDefaultInseeDepartementCodeType());
      
        return familySituationInformation;
    }

    @Override
    public FamilySituationInformation clone() {
        FamilySituationInformation result = new FamilySituationInformation();
        
          
            
        if (childStatus != null)
            result.setChildStatus(childStatus);
        else
            result.setChildStatus(fr.cg95.cvq.business.users.FamilyStatusType.getDefaultFamilyStatusType());
      
          
        
          
            
        result.setStatePupil(statePupil);
      
          
        
          
            
        result.setAliveChildren(aliveChildren);
      
          
        
          
            
        result.setPrefectPupil(prefectPupil);
      
          
        
          
            
        result.setChildrenInCharge(childrenInCharge);
      
          
        
          
            
        result.setOtherSituation(otherSituation);
      
          
        
          
            
        if (prefectPupilDepartment != null)
            result.setPrefectPupilDepartment(prefectPupilDepartment);
        else
            result.setPrefectPupilDepartment(fr.cg95.cvq.business.users.InseeDepartementCodeType.getDefaultInseeDepartementCodeType());
      
          
        
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
        
        
        profiles = {"situation"},
        message = "childStatus"
      )
    
    private fr.cg95.cvq.business.users.FamilyStatusType childStatus;

    public void setChildStatus(final fr.cg95.cvq.business.users.FamilyStatusType childStatus) {
        this.childStatus = childStatus;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="child_status"  )
      
    public fr.cg95.cvq.business.users.FamilyStatusType getChildStatus() {
        return this.childStatus;
    }
  
    
      @NotNull(
        
        
        profiles = {"situation"},
        message = "statePupil"
      )
    
    private Boolean statePupil;

    public void setStatePupil(final Boolean statePupil) {
        this.statePupil = statePupil;
    }

    
    @Column(name="state_pupil"  )
      
    public Boolean getStatePupil() {
        return this.statePupil;
    }
  
    
      @NotNull(
        
        
        profiles = {"situation"},
        message = "aliveChildren"
      )
    
    private java.math.BigInteger aliveChildren;

    public void setAliveChildren(final java.math.BigInteger aliveChildren) {
        this.aliveChildren = aliveChildren;
    }

    
    @Column(name="alive_children" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getAliveChildren() {
        return this.aliveChildren;
    }
  
    
      @NotNull(
        
        
        profiles = {"situation"},
        message = "prefectPupil"
      )
    
    private Boolean prefectPupil;

    public void setPrefectPupil(final Boolean prefectPupil) {
        this.prefectPupil = prefectPupil;
    }

    
    @Column(name="prefect_pupil"  )
      
    public Boolean getPrefectPupil() {
        return this.prefectPupil;
    }
  
    
      @NotNull(
        
        
        profiles = {"situation"},
        message = "childrenInCharge"
      )
    
    private java.math.BigInteger childrenInCharge;

    public void setChildrenInCharge(final java.math.BigInteger childrenInCharge) {
        this.childrenInCharge = childrenInCharge;
    }

    
    @Column(name="children_in_charge" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getChildrenInCharge() {
        return this.childrenInCharge;
    }
  
    
    private String otherSituation;

    public void setOtherSituation(final String otherSituation) {
        this.otherSituation = otherSituation;
    }

    
    @Column(name="other_situation"  )
      
    public String getOtherSituation() {
        return this.otherSituation;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
             "active &= _this.conditions['familySituationInformation.prefectPupil'].test(_this.prefectPupil.toString());" +
                  
                
              
            
            
            "return active",
        
        profiles = {"situation"},
        message = "prefectPupilDepartment"
      )
    
    private fr.cg95.cvq.business.users.InseeDepartementCodeType prefectPupilDepartment;

    public void setPrefectPupilDepartment(final fr.cg95.cvq.business.users.InseeDepartementCodeType prefectPupilDepartment) {
        this.prefectPupilDepartment = prefectPupilDepartment;
    }

    
    @Enumerated(EnumType.STRING)
    @Column(name="prefect_pupil_department"  )
      
    public fr.cg95.cvq.business.users.InseeDepartementCodeType getPrefectPupilDepartment() {
        return this.prefectPupilDepartment;
    }
  
}
