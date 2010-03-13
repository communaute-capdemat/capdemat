
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

/**
 * Generated class file, do not edit !
 *
 * @hibernate.class
 *  table="family_situation_information"
 *  lazy="false"
 */
public class FamilySituationInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

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
            familySituationInformation.setChildStatus(fr.cg95.cvq.xml.common.FamilyStatusType.Enum.forString(this.childStatus.toString()));
      
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
            familySituationInformation.setPrefectPupilDepartment(fr.cg95.cvq.xml.common.InseeDepartementCodeType.Enum.forString(this.prefectPupilDepartment.toString()));
      
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

    /**
     * @hibernate.id
     *  column="id"
     *  generator-class="sequence"
     */
    public final Long getId() {
        return this.id;
    }

  
    
      @NotNull(
        
        
        profiles = {"situation"},
        message = "childStatus"
      )
    
    private fr.cg95.cvq.business.users.FamilyStatusType childStatus;

    public final void setChildStatus(final fr.cg95.cvq.business.users.FamilyStatusType childStatus) {
        this.childStatus = childStatus;
    }

    /**
  
        * @hibernate.property
        *  column="child_status"
        
      
    */
    public final fr.cg95.cvq.business.users.FamilyStatusType getChildStatus() {
        return this.childStatus;
    }
  
    
      @NotNull(
        
        
        profiles = {"situation"},
        message = "statePupil"
      )
    
    private Boolean statePupil;

    public final void setStatePupil(final Boolean statePupil) {
        this.statePupil = statePupil;
    }

    /**
  
        * @hibernate.property
        *  column="state_pupil"
        
      
    */
    public final Boolean getStatePupil() {
        return this.statePupil;
    }
  
    
      @NotNull(
        
        
        profiles = {"situation"},
        message = "aliveChildren"
      )
    
    private java.math.BigInteger aliveChildren;

    public final void setAliveChildren(final java.math.BigInteger aliveChildren) {
        this.aliveChildren = aliveChildren;
    }

    /**
  
        * @hibernate.property
        *  column="alive_children"
        *  type="serializable"
        
      
    */
    public final java.math.BigInteger getAliveChildren() {
        return this.aliveChildren;
    }
  
    
      @NotNull(
        
        
        profiles = {"situation"},
        message = "prefectPupil"
      )
    
    private Boolean prefectPupil;

    public final void setPrefectPupil(final Boolean prefectPupil) {
        this.prefectPupil = prefectPupil;
    }

    /**
  
        * @hibernate.property
        *  column="prefect_pupil"
        
      
    */
    public final Boolean getPrefectPupil() {
        return this.prefectPupil;
    }
  
    
      @NotNull(
        
        
        profiles = {"situation"},
        message = "childrenInCharge"
      )
    
    private java.math.BigInteger childrenInCharge;

    public final void setChildrenInCharge(final java.math.BigInteger childrenInCharge) {
        this.childrenInCharge = childrenInCharge;
    }

    /**
  
        * @hibernate.property
        *  column="children_in_charge"
        *  type="serializable"
        
      
    */
    public final java.math.BigInteger getChildrenInCharge() {
        return this.childrenInCharge;
    }
  
    
    private String otherSituation;

    public final void setOtherSituation(final String otherSituation) {
        this.otherSituation = otherSituation;
    }

    /**
  
        * @hibernate.property
        *  column="other_situation"
        
      
    */
    public final String getOtherSituation() {
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

    public final void setPrefectPupilDepartment(final fr.cg95.cvq.business.users.InseeDepartementCodeType prefectPupilDepartment) {
        this.prefectPupilDepartment = prefectPupilDepartment;
    }

    /**
  
        * @hibernate.property
        *  column="prefect_pupil_department"
        
      
    */
    public final fr.cg95.cvq.business.users.InseeDepartementCodeType getPrefectPupilDepartment() {
        return this.prefectPupilDepartment;
    }
  
}
