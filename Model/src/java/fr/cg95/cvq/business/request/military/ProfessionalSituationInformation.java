
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
 *  table="professional_situation_information"
 *  lazy="false"
 */
public class ProfessionalSituationInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>();

    public ProfessionalSituationInformation() {
        super();
      
    }

    public final String modelToXmlString() {
        ProfessionalSituationInformationType object = (ProfessionalSituationInformationType) this.modelToXml();
        XmlOptions opts = new XmlOptions();
        opts.setSavePrettyPrint();
        opts.setSavePrettyPrintIndent(4);
        opts.setUseDefaultNamespace();
        opts.setCharacterEncoding("UTF-8");
        return object.xmlText(opts);
    }

    public final ProfessionalSituationInformationType modelToXml() {
        
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        LocalTime localTime = new LocalTime();
        ProfessionalSituationInformationType professionalSituationInformation = ProfessionalSituationInformationType.Factory.newInstance();
        int i = 0;
    
        if (this.childDiploma != null)
            professionalSituationInformation.setChildDiploma(fr.cg95.cvq.xml.request.military.ChildDiplomaType.Enum.forString(this.childDiploma.toString()));
      
        professionalSituationInformation.setChildProfession(this.childProfession);
      
        professionalSituationInformation.setChildSpeciality(this.childSpeciality);
      
        if (this.childSituation != null)
            professionalSituationInformation.setChildSituation(fr.cg95.cvq.xml.request.military.ChildSituationType.Enum.forString(this.childSituation.toString()));
      
        return professionalSituationInformation;
    }

    public static ProfessionalSituationInformation xmlToModel(ProfessionalSituationInformationType professionalSituationInformationDoc) {
        Calendar calendar = Calendar.getInstance();
        LocalTime localTime = new LocalTime();
        List list = new ArrayList();
        ProfessionalSituationInformation professionalSituationInformation = new ProfessionalSituationInformation();
    
        if (professionalSituationInformationDoc.getChildDiploma() != null)
            professionalSituationInformation.setChildDiploma(fr.cg95.cvq.business.request.military.ChildDiplomaType.forString(professionalSituationInformationDoc.getChildDiploma().toString()));
        else
            professionalSituationInformation.setChildDiploma(fr.cg95.cvq.business.request.military.ChildDiplomaType.getDefaultChildDiplomaType());
      
        professionalSituationInformation.setChildProfession(professionalSituationInformationDoc.getChildProfession());
      
        professionalSituationInformation.setChildSpeciality(professionalSituationInformationDoc.getChildSpeciality());
      
        if (professionalSituationInformationDoc.getChildSituation() != null)
            professionalSituationInformation.setChildSituation(fr.cg95.cvq.business.request.military.ChildSituationType.forString(professionalSituationInformationDoc.getChildSituation().toString()));
        else
            professionalSituationInformation.setChildSituation(fr.cg95.cvq.business.request.military.ChildSituationType.getDefaultChildSituationType());
      
        return professionalSituationInformation;
    }

    @Override
    public ProfessionalSituationInformation clone() {
        ProfessionalSituationInformation result = new ProfessionalSituationInformation();
        
          
            
        if (childDiploma != null)
            result.setChildDiploma(childDiploma);
        else
            result.setChildDiploma(fr.cg95.cvq.business.request.military.ChildDiplomaType.getDefaultChildDiplomaType());
      
          
        
          
            
        result.setChildProfession(childProfession);
      
          
        
          
            
        result.setChildSpeciality(childSpeciality);
      
          
        
          
            
        if (childSituation != null)
            result.setChildSituation(childSituation);
        else
            result.setChildSituation(fr.cg95.cvq.business.request.military.ChildSituationType.getDefaultChildSituationType());
      
          
        
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
        message = "childDiploma"
      )
    
    private fr.cg95.cvq.business.request.military.ChildDiplomaType childDiploma;

    public final void setChildDiploma(final fr.cg95.cvq.business.request.military.ChildDiplomaType childDiploma) {
        this.childDiploma = childDiploma;
    }

    /**
  
        * @hibernate.property
        *  column="child_diploma"
        
      
    */
    public final fr.cg95.cvq.business.request.military.ChildDiplomaType getChildDiploma() {
        return this.childDiploma;
    }
  
    
    private String childProfession;

    public final void setChildProfession(final String childProfession) {
        this.childProfession = childProfession;
    }

    /**
  
        * @hibernate.property
        *  column="child_profession"
        
      
    */
    public final String getChildProfession() {
        return this.childProfession;
    }
  
    
    private String childSpeciality;

    public final void setChildSpeciality(final String childSpeciality) {
        this.childSpeciality = childSpeciality;
    }

    /**
  
        * @hibernate.property
        *  column="child_speciality"
        
      
    */
    public final String getChildSpeciality() {
        return this.childSpeciality;
    }
  
    
      @NotNull(
        
        
        profiles = {"situation"},
        message = "childSituation"
      )
    
    private fr.cg95.cvq.business.request.military.ChildSituationType childSituation;

    public final void setChildSituation(final fr.cg95.cvq.business.request.military.ChildSituationType childSituation) {
        this.childSituation = childSituation;
    }

    /**
  
        * @hibernate.property
        *  column="child_situation"
        
      
    */
    public final fr.cg95.cvq.business.request.military.ChildSituationType getChildSituation() {
        return this.childSituation;
    }
  
}
