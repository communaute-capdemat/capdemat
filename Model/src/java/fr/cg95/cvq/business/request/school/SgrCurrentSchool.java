
package fr.cg95.cvq.business.request.school;

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
import fr.cg95.cvq.xml.request.school.*;
import fr.cg95.cvq.service.request.LocalReferential;
import fr.cg95.cvq.service.request.condition.IConditionChecker;
import javax.persistence.*;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Type;

/**
 * Generated class file, do not edit !
 */
@Entity
@Table(name="sgr_current_school")
public class SgrCurrentSchool implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        StudyGrantRequest.conditions;

    public SgrCurrentSchool() {
        super();
      
    }

    public final String modelToXmlString() {
        SgrCurrentSchoolType object = (SgrCurrentSchoolType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final SgrCurrentSchoolType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        SgrCurrentSchoolType sgrCurrentSchool = SgrCurrentSchoolType.Factory.newInstance();
        int i = 0;
    
        if (this.currentSchoolAddress != null)
            sgrCurrentSchool.setCurrentSchoolAddress(this.currentSchoolAddress.modelToXml());
      
        sgrCurrentSchool.setCurrentSchoolNamePrecision(this.currentSchoolNamePrecision);
      
        i = 0;
        if (this.currentSchoolName != null) {
            fr.cg95.cvq.xml.common.LocalReferentialDataType[] currentSchoolNameTypeTab = new fr.cg95.cvq.xml.common.LocalReferentialDataType[currentSchoolName.size()];
            for (LocalReferentialData object : currentSchoolName) {
              currentSchoolNameTypeTab[i++] = LocalReferentialData.modelToXml(object);
            }
            sgrCurrentSchool.setCurrentSchoolNameArray(currentSchoolNameTypeTab);
        }
      
        return sgrCurrentSchool;
    }

    public static SgrCurrentSchool xmlToModel(SgrCurrentSchoolType sgrCurrentSchoolDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        SgrCurrentSchool sgrCurrentSchool = new SgrCurrentSchool();
    
        if (sgrCurrentSchoolDoc.getCurrentSchoolAddress() != null)
            sgrCurrentSchool.setCurrentSchoolAddress(Address.xmlToModel(sgrCurrentSchoolDoc.getCurrentSchoolAddress()));
      
        sgrCurrentSchool.setCurrentSchoolNamePrecision(sgrCurrentSchoolDoc.getCurrentSchoolNamePrecision());
      
        List<fr.cg95.cvq.business.request.LocalReferentialData> currentSchoolNameList = new ArrayList<fr.cg95.cvq.business.request.LocalReferentialData>(sgrCurrentSchoolDoc.sizeOfCurrentSchoolNameArray());
        for (LocalReferentialDataType object : sgrCurrentSchoolDoc.getCurrentSchoolNameArray()) {
            currentSchoolNameList.add(fr.cg95.cvq.business.request.LocalReferentialData.xmlToModel(object));
        }
        sgrCurrentSchool.setCurrentSchoolName(currentSchoolNameList);
      
        return sgrCurrentSchool;
    }

    @Override
    public SgrCurrentSchool clone() {
        SgrCurrentSchool result = new SgrCurrentSchool();
        
          
            
        if (currentSchoolAddress != null)
            result.setCurrentSchoolAddress(currentSchoolAddress.clone());
      
          
        
          
            
        result.setCurrentSchoolNamePrecision(currentSchoolNamePrecision);
      
          
        
          
            
        List<fr.cg95.cvq.business.request.LocalReferentialData> currentSchoolNameList = new ArrayList<fr.cg95.cvq.business.request.LocalReferentialData>();
        for (LocalReferentialData object : currentSchoolName) {
            currentSchoolNameList.add(object.clone());
        }
        result.setCurrentSchoolName(currentSchoolNameList);
      
          
        
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
          
              "if (_this.currentSchoolName == null || _this.currentSchoolName.isEmpty()) return false; _this.currentSchoolName.each { active &= _this.conditions['sgrCurrentSchool.currentSchoolName'].test(it.name) };" +
                  
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "currentSchoolAddress"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
              "if (_this.currentSchoolName == null || _this.currentSchoolName.isEmpty()) return false; _this.currentSchoolName.each { active &= _this.conditions['sgrCurrentSchool.currentSchoolName'].test(it.name) };" +
                  
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "currentSchoolAddress"
      )
    
    private fr.cg95.cvq.business.users.Address currentSchoolAddress;

    public void setCurrentSchoolAddress(final fr.cg95.cvq.business.users.Address currentSchoolAddress) {
        this.currentSchoolAddress = currentSchoolAddress;
    }

    
    @ManyToOne
    @JoinColumn(name="current_school_address_id")
      
    public fr.cg95.cvq.business.users.Address getCurrentSchoolAddress() {
        return this.currentSchoolAddress;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
              "if (_this.currentSchoolName == null || _this.currentSchoolName.isEmpty()) return false; _this.currentSchoolName.each { active &= _this.conditions['sgrCurrentSchool.currentSchoolName'].test(it.name) };" +
                  
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "currentSchoolNamePrecision"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
              "if (_this.currentSchoolName == null || _this.currentSchoolName.isEmpty()) return false; _this.currentSchoolName.each { active &= _this.conditions['sgrCurrentSchool.currentSchoolName'].test(it.name) };" +
                  
                
              
            
            
            "return active",
        
        profiles = {"currentStudies"},
        message = "currentSchoolNamePrecision"
      )
    
    private String currentSchoolNamePrecision;

    public void setCurrentSchoolNamePrecision(final String currentSchoolNamePrecision) {
        this.currentSchoolNamePrecision = currentSchoolNamePrecision;
    }

    
    @Column(name="current_school_name_precision"  )
      
    public String getCurrentSchoolNamePrecision() {
        return this.currentSchoolNamePrecision;
    }
  
    
      @LocalReferential(
        
        
        profiles = {"currentStudies"},
        message = "currentSchoolName"
      )
    
      @MinSize(
        
          value = 1,
        
        
        profiles = {"currentStudies"},
        message = "currentSchoolName"
      )
    
    private List<fr.cg95.cvq.business.request.LocalReferentialData> currentSchoolName;

    public void setCurrentSchoolName(final List<fr.cg95.cvq.business.request.LocalReferentialData> currentSchoolName) {
        this.currentSchoolName = currentSchoolName;
    }

    
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="current_school_name")
    @JoinColumn(name="current_school_name_id")
    @OrderColumn(name="current_school_name_index")
      
    public List<fr.cg95.cvq.business.request.LocalReferentialData> getCurrentSchoolName() {
        return this.currentSchoolName;
    }
  
}
