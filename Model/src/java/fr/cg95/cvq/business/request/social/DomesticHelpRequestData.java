

package fr.cg95.cvq.business.request.social;

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
@Table(name="domestic_help_request")
public class DomesticHelpRequestData implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Map<String, IConditionChecker> conditions =
        new HashMap<String, IConditionChecker>(RequestData.conditions);

    private Long id;

    public DomesticHelpRequestData() {
      
        dhrRequestKind = fr.cg95.cvq.business.request.social.DhrRequestKindType.INDIVIDUAL;
      
    }

    @Override
    public DomesticHelpRequestData clone() {
        DomesticHelpRequestData result = new DomesticHelpRequestData();
        
          
            
        if (dhrCurrentDwelling != null)
            result.setDhrCurrentDwelling(dhrCurrentDwelling.clone());
      
          
        
          
            
        if (dhrFamilyReferent != null)
            result.setDhrFamilyReferent(dhrFamilyReferent.clone());
      
          
        
          
            
        List<fr.cg95.cvq.business.request.social.DhrNotRealAsset> dhrNotRealAssetList = new ArrayList<fr.cg95.cvq.business.request.social.DhrNotRealAsset>();
        for (DhrNotRealAsset object : dhrNotRealAsset) {
            dhrNotRealAssetList.add(object.clone());
        }
        result.setDhrNotRealAsset(dhrNotRealAssetList);
      
          
        
          
            
        List<fr.cg95.cvq.business.request.social.DhrPreviousDwelling> dhrPreviousDwellingList = new ArrayList<fr.cg95.cvq.business.request.social.DhrPreviousDwelling>();
        for (DhrPreviousDwelling object : dhrPreviousDwelling) {
            dhrPreviousDwellingList.add(object.clone());
        }
        result.setDhrPreviousDwelling(dhrPreviousDwellingList);
      
          
        
          
            
        List<fr.cg95.cvq.business.request.social.DhrRealAsset> dhrRealAssetList = new ArrayList<fr.cg95.cvq.business.request.social.DhrRealAsset>();
        for (DhrRealAsset object : dhrRealAsset) {
            dhrRealAssetList.add(object.clone());
        }
        result.setDhrRealAsset(dhrRealAssetList);
      
          
        
          
            
        if (dhrRequestKind != null)
            result.setDhrRequestKind(dhrRequestKind);
        else
            result.setDhrRequestKind(fr.cg95.cvq.business.request.social.DhrRequestKindType.getDefaultDhrRequestKindType());
      
          
        
          
            
        if (dhrRequester != null)
            result.setDhrRequester(dhrRequester.clone());
      
          
        
          
            
        if (dhrRequesterGuardian != null)
            result.setDhrRequesterGuardian(dhrRequesterGuardian.clone());
      
          
        
          
            
        if (dhrRequesterIncomes != null)
            result.setDhrRequesterIncomes(dhrRequesterIncomes.clone());
      
          
        
          
            
        if (dhrRequesterPensionPlan != null)
            result.setDhrRequesterPensionPlan(dhrRequesterPensionPlan.clone());
      
          
        
          
            
        if (dhrSpouse != null)
            result.setDhrSpouse(dhrSpouse.clone());
      
          
        
          
            
        if (dhrSpouseIncomes != null)
            result.setDhrSpouseIncomes(dhrSpouseIncomes.clone());
      
          
        
          
            
        if (dhrSpouseStatus != null)
            result.setDhrSpouseStatus(dhrSpouseStatus.clone());
      
          
        
          
            
        if (dhrTaxesAmount != null)
            result.setDhrTaxesAmount(dhrTaxesAmount.clone());
      
          
        
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

  
    
    private java.math.BigInteger dhrAllowances;

    public final void setDhrAllowances(final java.math.BigInteger dhrAllowances) {
        this.dhrAllowances = dhrAllowances;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_allowances"
        *  type="serializable"
        
      
    */
    public final java.math.BigInteger getDhrAllowances() {
        return this.dhrAllowances;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "dhrComplementaryPensionPlan"
      )
    
      @NotBlank(
        
        
        profiles = {"subject"},
        message = "dhrComplementaryPensionPlan"
      )
    
    private String dhrComplementaryPensionPlan;

    public final void setDhrComplementaryPensionPlan(final String dhrComplementaryPensionPlan) {
        this.dhrComplementaryPensionPlan = dhrComplementaryPensionPlan;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_complementary_pension_plan"
        
      
    */
    public final String getDhrComplementaryPensionPlan() {
        return this.dhrComplementaryPensionPlan;
    }
  
    
    private java.math.BigInteger dhrAllowances;

    public void setDhrAllowances(final java.math.BigInteger dhrAllowances) {
        this.dhrAllowances = dhrAllowances;
    }

 
    @Column(name="dhr_allowances" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getDhrAllowances() {
        return this.dhrAllowances;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "dhrComplementaryPensionPlan"
      )
    
      @NotBlank(
        
        
        profiles = {"subject"},
        message = "dhrComplementaryPensionPlan"
      )
    
    private String dhrComplementaryPensionPlan;

    public void setDhrComplementaryPensionPlan(final String dhrComplementaryPensionPlan) {
        this.dhrComplementaryPensionPlan = dhrComplementaryPensionPlan;
    }

 
    @Column(name="dhr_complementary_pension_plan"  )
      
    public String getDhrComplementaryPensionPlan() {
        return this.dhrComplementaryPensionPlan;
    }
  
    
      @NotNull(
        
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwelling"
      )
    
      @AssertValid(
        
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwelling"
      )
    
    private fr.cg95.cvq.business.request.social.DhrCurrentDwelling dhrCurrentDwelling;

    public final void setDhrCurrentDwellingAddress(final fr.cg95.cvq.business.users.Address dhrCurrentDwellingAddress) {
        this.dhrCurrentDwellingAddress = dhrCurrentDwellingAddress;
    public void setDhrCurrentDwellingAddress(final fr.cg95.cvq.business.users.Address dhrCurrentDwellingAddress) {
        this.dhrCurrentDwellingAddress = dhrCurrentDwellingAddress;
    public final void setDhrCurrentDwelling(final fr.cg95.cvq.business.request.social.DhrCurrentDwelling dhrCurrentDwelling) {
        this.dhrCurrentDwelling = dhrCurrentDwelling;
    }

 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="dhr_current_dwelling_address_id"
        *  class="fr.cg95.cvq.business.users.Address"
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="dhr_current_dwelling_address_id")
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="dhr_current_dwelling_id"
        *  class="fr.cg95.cvq.business.request.social.DhrCurrentDwelling"
      
    */
    public final fr.cg95.cvq.business.users.Address getDhrCurrentDwellingAddress() {
        return this.dhrCurrentDwellingAddress;
    public fr.cg95.cvq.business.users.Address getDhrCurrentDwellingAddress() {
        return this.dhrCurrentDwellingAddress;
    */
    public final fr.cg95.cvq.business.request.social.DhrCurrentDwelling getDhrCurrentDwelling() {
        return this.dhrCurrentDwelling;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrCurrentDwellingKind'].test(_this.dhrCurrentDwellingKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwellingArrivalDate"
      )
    
    private java.util.Date dhrCurrentDwellingArrivalDate;

    public final void setDhrCurrentDwellingArrivalDate(final java.util.Date dhrCurrentDwellingArrivalDate) {
        this.dhrCurrentDwellingArrivalDate = dhrCurrentDwellingArrivalDate;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_current_dwelling_arrival_date"
        
      
    */
    public final java.util.Date getDhrCurrentDwellingArrivalDate() {
        return this.dhrCurrentDwellingArrivalDate;
    }
  
    
      @NotNull(
        
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwellingKind"
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrCurrentDwellingKind'].test(_this.dhrCurrentDwellingKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwellingArrivalDate"
      )
    
    private java.util.Date dhrCurrentDwellingArrivalDate;

    public void setDhrCurrentDwellingArrivalDate(final java.util.Date dhrCurrentDwellingArrivalDate) {
        this.dhrCurrentDwellingArrivalDate = dhrCurrentDwellingArrivalDate;
    }

 
    @Column(name="dhr_current_dwelling_arrival_date"  )
      
    public java.util.Date getDhrCurrentDwellingArrivalDate() {
        return this.dhrCurrentDwellingArrivalDate;
    }
  
    
      @NotNull(
        
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwellingKind"
        profiles = {"familyReferent"},
        message = "dhrFamilyReferent"
      )
    
    private fr.cg95.cvq.business.request.social.DhrDwellingKindType dhrCurrentDwellingKind;

    public final void setDhrCurrentDwellingKind(final fr.cg95.cvq.business.request.social.DhrDwellingKindType dhrCurrentDwellingKind) {
        this.dhrCurrentDwellingKind = dhrCurrentDwellingKind;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_current_dwelling_kind"
        
      
    */
    public final fr.cg95.cvq.business.request.social.DhrDwellingKindType getDhrCurrentDwellingKind() {
        return this.dhrCurrentDwellingKind;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrCurrentDwellingKind'].test(_this.dhrCurrentDwellingKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwellingNetArea"
      )
    
      @MatchPattern(
        
          pattern = "^[1-9]$|^[1-9][0-9]$|^[1-4][0-9][0-9]$|^500$",
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrCurrentDwellingKind'].test(_this.dhrCurrentDwellingKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwellingNetArea"
      )
    
    private java.math.BigDecimal dhrCurrentDwellingNetArea;

    public final void setDhrCurrentDwellingNetArea(final java.math.BigDecimal dhrCurrentDwellingNetArea) {
        this.dhrCurrentDwellingNetArea = dhrCurrentDwellingNetArea;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_current_dwelling_net_area"
        
      
    */
    public final java.math.BigDecimal getDhrCurrentDwellingNetArea() {
        return this.dhrCurrentDwellingNetArea;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrCurrentDwellingKind'].test(_this.dhrCurrentDwellingKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwellingNumberOfRoom"
      )
    
    private java.math.BigDecimal dhrCurrentDwellingNumberOfRoom;

    public final void setDhrCurrentDwellingNumberOfRoom(final java.math.BigDecimal dhrCurrentDwellingNumberOfRoom) {
        this.dhrCurrentDwellingNumberOfRoom = dhrCurrentDwellingNumberOfRoom;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_current_dwelling_number_of_room"
        
      
    */
    public final java.math.BigDecimal getDhrCurrentDwellingNumberOfRoom() {
        return this.dhrCurrentDwellingNumberOfRoom;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwellingPhone"
      )
    
    private String dhrCurrentDwellingPhone;

    public final void setDhrCurrentDwellingPhone(final String dhrCurrentDwellingPhone) {
        this.dhrCurrentDwellingPhone = dhrCurrentDwellingPhone;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_current_dwelling_phone"
        *  length="10"
      
    */
    public final String getDhrCurrentDwellingPhone() {
        return this.dhrCurrentDwellingPhone;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrCurrentDwellingKind'].test(_this.dhrCurrentDwellingKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwellingStatus"
      )
    
    private fr.cg95.cvq.business.request.social.DhrDwellingStatusType dhrCurrentDwellingStatus;

    public final void setDhrCurrentDwellingStatus(final fr.cg95.cvq.business.request.social.DhrDwellingStatusType dhrCurrentDwellingStatus) {
        this.dhrCurrentDwellingStatus = dhrCurrentDwellingStatus;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_current_dwelling_status"
        
      
    */
    public final fr.cg95.cvq.business.request.social.DhrDwellingStatusType getDhrCurrentDwellingStatus() {
        return this.dhrCurrentDwellingStatus;
    }
  
    
    private java.math.BigInteger dhrFurnitureInvestmentIncome;

    public final void setDhrFurnitureInvestmentIncome(final java.math.BigInteger dhrFurnitureInvestmentIncome) {
        this.dhrFurnitureInvestmentIncome = dhrFurnitureInvestmentIncome;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_furniture_investment_income"
        *  type="serializable"
        
      
    */
    public final java.math.BigInteger getDhrFurnitureInvestmentIncome() {
        return this.dhrFurnitureInvestmentIncome;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequesterHaveGuardian'].test(_this.dhrRequesterHaveGuardian.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "dhrGuardianAddress"
      )
    
    private fr.cg95.cvq.business.request.social.DhrDwellingKindType dhrCurrentDwellingKind;

    public void setDhrCurrentDwellingKind(final fr.cg95.cvq.business.request.social.DhrDwellingKindType dhrCurrentDwellingKind) {
        this.dhrCurrentDwellingKind = dhrCurrentDwellingKind;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="dhr_current_dwelling_kind"  )
      
    public fr.cg95.cvq.business.request.social.DhrDwellingKindType getDhrCurrentDwellingKind() {
        return this.dhrCurrentDwellingKind;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrCurrentDwellingKind'].test(_this.dhrCurrentDwellingKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwellingNetArea"
      )
    
      @MatchPattern(
        
          pattern = "^[1-9]$|^[1-9][0-9]$|^[1-4][0-9][0-9]$|^500$",
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrCurrentDwellingKind'].test(_this.dhrCurrentDwellingKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwellingNetArea"
      )
    
    private java.math.BigDecimal dhrCurrentDwellingNetArea;

    public void setDhrCurrentDwellingNetArea(final java.math.BigDecimal dhrCurrentDwellingNetArea) {
        this.dhrCurrentDwellingNetArea = dhrCurrentDwellingNetArea;
    }

 
    @Column(name="dhr_current_dwelling_net_area"  )
      
    public java.math.BigDecimal getDhrCurrentDwellingNetArea() {
        return this.dhrCurrentDwellingNetArea;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrCurrentDwellingKind'].test(_this.dhrCurrentDwellingKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwellingNumberOfRoom"
      )
    
    private java.math.BigDecimal dhrCurrentDwellingNumberOfRoom;

    public void setDhrCurrentDwellingNumberOfRoom(final java.math.BigDecimal dhrCurrentDwellingNumberOfRoom) {
        this.dhrCurrentDwellingNumberOfRoom = dhrCurrentDwellingNumberOfRoom;
    }

 
    @Column(name="dhr_current_dwelling_number_of_room"  )
      
    public java.math.BigDecimal getDhrCurrentDwellingNumberOfRoom() {
        return this.dhrCurrentDwellingNumberOfRoom;
    }
  
    
      @MaxLength(
        
          value = 10,
        
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwellingPhone"
      )
    
    private String dhrCurrentDwellingPhone;

    public void setDhrCurrentDwellingPhone(final String dhrCurrentDwellingPhone) {
        this.dhrCurrentDwellingPhone = dhrCurrentDwellingPhone;
    }

 
    @Column(name="dhr_current_dwelling_phone" , length=10 )
      
    public String getDhrCurrentDwellingPhone() {
        return this.dhrCurrentDwellingPhone;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrCurrentDwellingKind'].test(_this.dhrCurrentDwellingKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwellingStatus"
      )
    
    private fr.cg95.cvq.business.request.social.DhrDwellingStatusType dhrCurrentDwellingStatus;

    public void setDhrCurrentDwellingStatus(final fr.cg95.cvq.business.request.social.DhrDwellingStatusType dhrCurrentDwellingStatus) {
        this.dhrCurrentDwellingStatus = dhrCurrentDwellingStatus;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="dhr_current_dwelling_status"  )
      
    public fr.cg95.cvq.business.request.social.DhrDwellingStatusType getDhrCurrentDwellingStatus() {
        return this.dhrCurrentDwellingStatus;
    }
  
    
    private java.math.BigInteger dhrFurnitureInvestmentIncome;

    public void setDhrFurnitureInvestmentIncome(final java.math.BigInteger dhrFurnitureInvestmentIncome) {
        this.dhrFurnitureInvestmentIncome = dhrFurnitureInvestmentIncome;
    }

 
    @Column(name="dhr_furniture_investment_income" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getDhrFurnitureInvestmentIncome() {
        return this.dhrFurnitureInvestmentIncome;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequesterHaveGuardian'].test(_this.dhrRequesterHaveGuardian.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "dhrGuardianAddress"
      )
    
      @AssertValid(
        
        
        profiles = {"familyReferent"},
        message = "dhrFamilyReferent"
      )
    
    private fr.cg95.cvq.business.request.social.DhrFamilyReferent dhrFamilyReferent;

    public final void setDhrGuardianAddress(final fr.cg95.cvq.business.users.Address dhrGuardianAddress) {
        this.dhrGuardianAddress = dhrGuardianAddress;
    public void setDhrGuardianAddress(final fr.cg95.cvq.business.users.Address dhrGuardianAddress) {
        this.dhrGuardianAddress = dhrGuardianAddress;
    public final void setDhrFamilyReferent(final fr.cg95.cvq.business.request.social.DhrFamilyReferent dhrFamilyReferent) {
        this.dhrFamilyReferent = dhrFamilyReferent;
    }

 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="dhr_guardian_address_id"
        *  class="fr.cg95.cvq.business.users.Address"
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="dhr_guardian_address_id")
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="dhr_family_referent_id"
        *  class="fr.cg95.cvq.business.request.social.DhrFamilyReferent"
      
    */
    public final fr.cg95.cvq.business.users.Address getDhrGuardianAddress() {
        return this.dhrGuardianAddress;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequesterHaveGuardian'].test(_this.dhrRequesterHaveGuardian.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "dhrGuardianMeasure"
      )
    
    private fr.cg95.cvq.business.request.social.DhrGuardianMeasureType dhrGuardianMeasure;

    public final void setDhrGuardianMeasure(final fr.cg95.cvq.business.request.social.DhrGuardianMeasureType dhrGuardianMeasure) {
        this.dhrGuardianMeasure = dhrGuardianMeasure;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_guardian_measure"
        
      
    */
    public final fr.cg95.cvq.business.request.social.DhrGuardianMeasureType getDhrGuardianMeasure() {
        return this.dhrGuardianMeasure;
    public fr.cg95.cvq.business.users.Address getDhrGuardianAddress() {
        return this.dhrGuardianAddress;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequesterHaveGuardian'].test(_this.dhrRequesterHaveGuardian.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "dhrGuardianMeasure"
      )
    
    private fr.cg95.cvq.business.request.social.DhrGuardianMeasureType dhrGuardianMeasure;

    public void setDhrGuardianMeasure(final fr.cg95.cvq.business.request.social.DhrGuardianMeasureType dhrGuardianMeasure) {
        this.dhrGuardianMeasure = dhrGuardianMeasure;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="dhr_guardian_measure"  )
      
    public fr.cg95.cvq.business.request.social.DhrGuardianMeasureType getDhrGuardianMeasure() {
        return this.dhrGuardianMeasure;
    */
    public final fr.cg95.cvq.business.request.social.DhrFamilyReferent getDhrFamilyReferent() {
        return this.dhrFamilyReferent;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequesterHaveGuardian'].test(_this.dhrRequesterHaveGuardian.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "dhrGuardianName"
      )
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequesterHaveGuardian'].test(_this.dhrRequesterHaveGuardian.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "dhrGuardianName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequesterHaveGuardian'].test(_this.dhrRequesterHaveGuardian.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "dhrGuardianName"
      )
    
    private String dhrGuardianName;

    public final void setDhrGuardianName(final String dhrGuardianName) {
        this.dhrGuardianName = dhrGuardianName;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_guardian_name"
        *  length="38"
      
    */
    public final String getDhrGuardianName() {
        return this.dhrGuardianName;
    }
  
    
      @NotNull(
        
        
        profiles = {"familyReferent"},
        message = "dhrHaveFamilyReferent"
      )
    
    private Boolean dhrHaveFamilyReferent;

    public final void setDhrHaveFamilyReferent(final Boolean dhrHaveFamilyReferent) {
        this.dhrHaveFamilyReferent = dhrHaveFamilyReferent;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_have_family_referent"
        
      
    */
    public final Boolean getDhrHaveFamilyReferent() {
        return this.dhrHaveFamilyReferent;
    }
  
    
    private java.math.BigInteger dhrIncomeTax;

    public final void setDhrIncomeTax(final java.math.BigInteger dhrIncomeTax) {
        this.dhrIncomeTax = dhrIncomeTax;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_income_tax"
        *  type="serializable"
        
      
    */
    public final java.math.BigInteger getDhrIncomeTax() {
        return this.dhrIncomeTax;
    }
  
    
      @NotNull(
        
        
        profiles = {"resources"},
        message = "dhrIncomesAnnualTotal"
      )
    
    private java.math.BigInteger dhrIncomesAnnualTotal;

    public final void setDhrIncomesAnnualTotal(final java.math.BigInteger dhrIncomesAnnualTotal) {
        this.dhrIncomesAnnualTotal = dhrIncomesAnnualTotal;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_incomes_annual_total"
        *  type="serializable"
        
      
    */
    public final java.math.BigInteger getDhrIncomesAnnualTotal() {
        return this.dhrIncomesAnnualTotal;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrIsSpouseRetired"
      )
    
    private Boolean dhrIsSpouseRetired;

    public final void setDhrIsSpouseRetired(final Boolean dhrIsSpouseRetired) {
        this.dhrIsSpouseRetired = dhrIsSpouseRetired;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_is_spouse_retired"
        
      
    */
    public final Boolean getDhrIsSpouseRetired() {
        return this.dhrIsSpouseRetired;
    }
  
    
    private java.math.BigInteger dhrNetIncome;

    public final void setDhrNetIncome(final java.math.BigInteger dhrNetIncome) {
        this.dhrNetIncome = dhrNetIncome;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_net_income"
        *  type="serializable"
        
      
    */
    public final java.math.BigInteger getDhrNetIncome() {
        return this.dhrNetIncome;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequesterHaveGuardian'].test(_this.dhrRequesterHaveGuardian.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "dhrGuardianName"
      )
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequesterHaveGuardian'].test(_this.dhrRequesterHaveGuardian.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "dhrGuardianName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequesterHaveGuardian'].test(_this.dhrRequesterHaveGuardian.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "dhrGuardianName"
      )
    
    private String dhrGuardianName;

    public void setDhrGuardianName(final String dhrGuardianName) {
        this.dhrGuardianName = dhrGuardianName;
    }

 
    @Column(name="dhr_guardian_name" , length=38 )
      
    public String getDhrGuardianName() {
        return this.dhrGuardianName;
    }
  
    
      @NotNull(
        
        
        profiles = {"familyReferent"},
        message = "dhrHaveFamilyReferent"
      )
    
    private Boolean dhrHaveFamilyReferent;

    public void setDhrHaveFamilyReferent(final Boolean dhrHaveFamilyReferent) {
        this.dhrHaveFamilyReferent = dhrHaveFamilyReferent;
    }

 
    @Column(name="dhr_have_family_referent"  )
      
    public Boolean getDhrHaveFamilyReferent() {
        return this.dhrHaveFamilyReferent;
    }
  
    
    private java.math.BigInteger dhrIncomeTax;

    public void setDhrIncomeTax(final java.math.BigInteger dhrIncomeTax) {
        this.dhrIncomeTax = dhrIncomeTax;
    }

 
    @Column(name="dhr_income_tax" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getDhrIncomeTax() {
        return this.dhrIncomeTax;
    }
  
    
      @NotNull(
        
        
        profiles = {"resources"},
        message = "dhrIncomesAnnualTotal"
      )
    
    private java.math.BigInteger dhrIncomesAnnualTotal;

    public void setDhrIncomesAnnualTotal(final java.math.BigInteger dhrIncomesAnnualTotal) {
        this.dhrIncomesAnnualTotal = dhrIncomesAnnualTotal;
    }

 
    @Column(name="dhr_incomes_annual_total" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getDhrIncomesAnnualTotal() {
        return this.dhrIncomesAnnualTotal;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrIsSpouseRetired"
      )
    
    private Boolean dhrIsSpouseRetired;

    public void setDhrIsSpouseRetired(final Boolean dhrIsSpouseRetired) {
        this.dhrIsSpouseRetired = dhrIsSpouseRetired;
    }

 
    @Column(name="dhr_is_spouse_retired"  )
      
    public Boolean getDhrIsSpouseRetired() {
        return this.dhrIsSpouseRetired;
    }
  
    
    private java.math.BigInteger dhrNetIncome;

    public void setDhrNetIncome(final java.math.BigInteger dhrNetIncome) {
        this.dhrNetIncome = dhrNetIncome;
    }

 
    @Column(name="dhr_net_income" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getDhrNetIncome() {
        return this.dhrNetIncome;
    }
  
    
      @AssertValid(
        
        
        profiles = {"resources"},
        message = "dhrNotRealAsset"
      )
    
      @MinSize(
        
          value = 1,
        
        
        profiles = {"resources"},
        message = "dhrNotRealAsset"
      )
    
    private List<fr.cg95.cvq.business.request.social.DhrNotRealAsset> dhrNotRealAsset;

    public void setDhrNotRealAsset(final List<fr.cg95.cvq.business.request.social.DhrNotRealAsset> dhrNotRealAsset) {
        this.dhrNotRealAsset = dhrNotRealAsset;
    }

 
    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @OrderColumn(name="dhr_not_real_asset_index")
    @JoinColumn(name="domestic_help_request_id")
      
    public List<fr.cg95.cvq.business.request.social.DhrNotRealAsset> getDhrNotRealAsset() {
        return this.dhrNotRealAsset;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrPrincipalPensionPlan'].test(_this.dhrPrincipalPensionPlan.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "dhrPensionPlanDetail"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrPrincipalPensionPlan'].test(_this.dhrPrincipalPensionPlan.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "dhrPensionPlanDetail"
      )
    
    private String dhrPensionPlanDetail;

    public final void setDhrPensionPlanDetail(final String dhrPensionPlanDetail) {
        this.dhrPensionPlanDetail = dhrPensionPlanDetail;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_pension_plan_detail"
        
      
    */
    public final String getDhrPensionPlanDetail() {
        return this.dhrPensionPlanDetail;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrPrincipalPensionPlan'].test(_this.dhrPrincipalPensionPlan.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "dhrPensionPlanDetail"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrPrincipalPensionPlan'].test(_this.dhrPrincipalPensionPlan.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"subject"},
        message = "dhrPensionPlanDetail"
      )
    
    private String dhrPensionPlanDetail;

    public void setDhrPensionPlanDetail(final String dhrPensionPlanDetail) {
        this.dhrPensionPlanDetail = dhrPensionPlanDetail;
    }

 
    @Column(name="dhr_pension_plan_detail"  )
      
    public String getDhrPensionPlanDetail() {
        return this.dhrPensionPlanDetail;
    }
  
    
      @AssertValid(
        
        
        profiles = {"dwelling"},
        message = "dhrPreviousDwelling"
      )
    
      @MinSize(
        
          value = 1,
        
        
        profiles = {"dwelling"},
        message = "dhrPreviousDwelling"
      )
    
    private List<fr.cg95.cvq.business.request.social.DhrPreviousDwelling> dhrPreviousDwelling;

    public void setDhrPreviousDwelling(final List<fr.cg95.cvq.business.request.social.DhrPreviousDwelling> dhrPreviousDwelling) {
        this.dhrPreviousDwelling = dhrPreviousDwelling;
    }

 
    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @OrderColumn(name="dhr_previous_dwelling_index")
    @JoinColumn(name="domestic_help_request_id")
      
    public List<fr.cg95.cvq.business.request.social.DhrPreviousDwelling> getDhrPreviousDwelling() {
        return this.dhrPreviousDwelling;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "dhrPrincipalPensionPlan"
      )
    
    private fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType dhrPrincipalPensionPlan;

    public final void setDhrPrincipalPensionPlan(final fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType dhrPrincipalPensionPlan) {
        this.dhrPrincipalPensionPlan = dhrPrincipalPensionPlan;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_principal_pension_plan"
        
      
    */
    public final fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType getDhrPrincipalPensionPlan() {
        return this.dhrPrincipalPensionPlan;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "dhrPrincipalPensionPlan"
      )
    
    private fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType dhrPrincipalPensionPlan;

    public void setDhrPrincipalPensionPlan(final fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType dhrPrincipalPensionPlan) {
        this.dhrPrincipalPensionPlan = dhrPrincipalPensionPlan;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="dhr_principal_pension_plan"  )
      
    public fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType getDhrPrincipalPensionPlan() {
        return this.dhrPrincipalPensionPlan;
    }
  
    
      @AssertValid(
        
        
        profiles = {"resources"},
        message = "dhrRealAsset"
      )
    
      @MinSize(
        
          value = 1,
        
        
        profiles = {"resources"},
        message = "dhrRealAsset"
      )
    
    private List<fr.cg95.cvq.business.request.social.DhrRealAsset> dhrRealAsset;

    public void setDhrRealAsset(final List<fr.cg95.cvq.business.request.social.DhrRealAsset> dhrRealAsset) {
        this.dhrRealAsset = dhrRealAsset;
    }

 
    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @OrderColumn(name="dhr_real_asset_index")
    @JoinColumn(name="domestic_help_request_id")
      
    public List<fr.cg95.cvq.business.request.social.DhrRealAsset> getDhrRealAsset() {
        return this.dhrRealAsset;
    }
  
    
    private java.math.BigInteger dhrRealEstateInvestmentIncome;

    public final void setDhrRealEstateInvestmentIncome(final java.math.BigInteger dhrRealEstateInvestmentIncome) {
        this.dhrRealEstateInvestmentIncome = dhrRealEstateInvestmentIncome;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_real_estate_investment_income"
        *  type="serializable"
        
      
    */
    public final java.math.BigInteger getDhrRealEstateInvestmentIncome() {
        return this.dhrRealEstateInvestmentIncome;
    }
  
    
    private java.math.BigInteger dhrRealEstateInvestmentIncome;

    public void setDhrRealEstateInvestmentIncome(final java.math.BigInteger dhrRealEstateInvestmentIncome) {
        this.dhrRealEstateInvestmentIncome = dhrRealEstateInvestmentIncome;
    }

 
    @Column(name="dhr_real_estate_investment_income" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getDhrRealEstateInvestmentIncome() {
        return this.dhrRealEstateInvestmentIncome;
    }
  
    
      @NotNull(
        
        
        profiles = {"spouse"},
        message = "dhrRequestKind"
      )
    
    private fr.cg95.cvq.business.request.social.DhrRequestKindType dhrRequestKind;

    public final void setDhrRequestKind(final fr.cg95.cvq.business.request.social.DhrRequestKindType dhrRequestKind) {
        this.dhrRequestKind = dhrRequestKind;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_request_kind"
        
      
    */
    public final fr.cg95.cvq.business.request.social.DhrRequestKindType getDhrRequestKind() {
        return this.dhrRequestKind;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "dhrRequester"
      )
    
      @AssertValid(
        
        
        profiles = {"subject"},
        message = "dhrRequester"
      )
    
    private fr.cg95.cvq.business.request.social.DhrRequester dhrRequester;

    public final void setDhrReferentAddress(final fr.cg95.cvq.business.users.Address dhrReferentAddress) {
        this.dhrReferentAddress = dhrReferentAddress;
    public void setDhrReferentAddress(final fr.cg95.cvq.business.users.Address dhrReferentAddress) {
        this.dhrReferentAddress = dhrReferentAddress;
    public final void setDhrRequester(final fr.cg95.cvq.business.request.social.DhrRequester dhrRequester) {
        this.dhrRequester = dhrRequester;
    }

 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="dhr_referent_address_id"
        *  class="fr.cg95.cvq.business.users.Address"
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="dhr_referent_address_id")
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="dhr_requester_id"
        *  class="fr.cg95.cvq.business.request.social.DhrRequester"
      
    */
    public final fr.cg95.cvq.business.users.Address getDhrReferentAddress() {
        return this.dhrReferentAddress;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrHaveFamilyReferent'].test(_this.dhrHaveFamilyReferent.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"familyReferent"},
        message = "dhrReferentFirstName"
      )
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrHaveFamilyReferent'].test(_this.dhrHaveFamilyReferent.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"familyReferent"},
        message = "dhrReferentFirstName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrHaveFamilyReferent'].test(_this.dhrHaveFamilyReferent.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"familyReferent"},
        message = "dhrReferentFirstName"
      )
    
    private String dhrReferentFirstName;

    public final void setDhrReferentFirstName(final String dhrReferentFirstName) {
        this.dhrReferentFirstName = dhrReferentFirstName;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_referent_first_name"
        *  length="38"
      
    */
    public final String getDhrReferentFirstName() {
        return this.dhrReferentFirstName;
    public fr.cg95.cvq.business.users.Address getDhrReferentAddress() {
        return this.dhrReferentAddress;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrHaveFamilyReferent'].test(_this.dhrHaveFamilyReferent.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"familyReferent"},
        message = "dhrReferentFirstName"
      )
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrHaveFamilyReferent'].test(_this.dhrHaveFamilyReferent.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"familyReferent"},
        message = "dhrReferentFirstName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrHaveFamilyReferent'].test(_this.dhrHaveFamilyReferent.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"familyReferent"},
        message = "dhrReferentFirstName"
      )
    
    private String dhrReferentFirstName;

    public void setDhrReferentFirstName(final String dhrReferentFirstName) {
        this.dhrReferentFirstName = dhrReferentFirstName;
    }

 
    @Column(name="dhr_referent_first_name" , length=38 )
      
    public String getDhrReferentFirstName() {
        return this.dhrReferentFirstName;
    */
    public final fr.cg95.cvq.business.request.social.DhrRequester getDhrRequester() {
        return this.dhrRequester;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrHaveFamilyReferent'].test(_this.dhrHaveFamilyReferent.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"familyReferent"},
        message = "dhrReferentName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrHaveFamilyReferent'].test(_this.dhrHaveFamilyReferent.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"familyReferent"},
        message = "dhrReferentName"
      )
    
    private String dhrReferentName;

    public final void setDhrReferentName(final String dhrReferentName) {
        this.dhrReferentName = dhrReferentName;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_referent_name"
        *  length="38"
      
    */
    public final String getDhrReferentName() {
        return this.dhrReferentName;
    }
  
    
      @NotNull(
        
        
        profiles = {"spouse"},
        message = "dhrRequestKind"
      )
    
    private fr.cg95.cvq.business.request.social.DhrRequestKindType dhrRequestKind;

    public final void setDhrRequestKind(final fr.cg95.cvq.business.request.social.DhrRequestKindType dhrRequestKind) {
        this.dhrRequestKind = dhrRequestKind;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_request_kind"
        
      
    */
    public final fr.cg95.cvq.business.request.social.DhrRequestKindType getDhrRequestKind() {
        return this.dhrRequestKind;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrHaveFamilyReferent'].test(_this.dhrHaveFamilyReferent.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"familyReferent"},
        message = "dhrReferentName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrHaveFamilyReferent'].test(_this.dhrHaveFamilyReferent.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"familyReferent"},
        message = "dhrReferentName"
      )
    
    private String dhrReferentName;

    public void setDhrReferentName(final String dhrReferentName) {
        this.dhrReferentName = dhrReferentName;
    }

 
    @Column(name="dhr_referent_name" , length=38 )
      
    public String getDhrReferentName() {
        return this.dhrReferentName;
    }
  
    
      @NotNull(
        
        
        profiles = {"spouse"},
        message = "dhrRequestKind"
      )
    
    private fr.cg95.cvq.business.request.social.DhrRequestKindType dhrRequestKind;

    public void setDhrRequestKind(final fr.cg95.cvq.business.request.social.DhrRequestKindType dhrRequestKind) {
        this.dhrRequestKind = dhrRequestKind;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="dhr_request_kind"  )
      
    public fr.cg95.cvq.business.request.social.DhrRequestKindType getDhrRequestKind() {
        return this.dhrRequestKind;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "dhrRequesterGuardian"
      )
    
    private java.util.Date dhrRequesterBirthDate;

    public final void setDhrRequesterBirthDate(final java.util.Date dhrRequesterBirthDate) {
        this.dhrRequesterBirthDate = dhrRequesterBirthDate;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_requester_birth_date"
        
      
    */
    public final java.util.Date getDhrRequesterBirthDate() {
        return this.dhrRequesterBirthDate;
    }
  
    
      @NotNull(
    private java.util.Date dhrRequesterBirthDate;

    public void setDhrRequesterBirthDate(final java.util.Date dhrRequesterBirthDate) {
        this.dhrRequesterBirthDate = dhrRequesterBirthDate;
    }

 
    @Column(name="dhr_requester_birth_date"  )
      
    public java.util.Date getDhrRequesterBirthDate() {
        return this.dhrRequesterBirthDate;
    }
  
    
      @NotNull(
      @AssertValid(
        
        
        profiles = {"subject"},
        message = "dhrRequesterGuardian"
      )
    
    private fr.cg95.cvq.business.request.social.DhrRequesterGuardian dhrRequesterGuardian;

    public final void setDhrRequesterBirthPlace(final String dhrRequesterBirthPlace) {
        this.dhrRequesterBirthPlace = dhrRequesterBirthPlace;
    public void setDhrRequesterBirthPlace(final String dhrRequesterBirthPlace) {
        this.dhrRequesterBirthPlace = dhrRequesterBirthPlace;
    public final void setDhrRequesterGuardian(final fr.cg95.cvq.business.request.social.DhrRequesterGuardian dhrRequesterGuardian) {
        this.dhrRequesterGuardian = dhrRequesterGuardian;
    }

 
        * @hibernate.property
        *  column="dhr_requester_birth_place"
        
    @Column(name="dhr_requester_birth_place"  )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="dhr_requester_guardian_id"
        *  class="fr.cg95.cvq.business.request.social.DhrRequesterGuardian"
      
    */
    public final String getDhrRequesterBirthPlace() {
        return this.dhrRequesterBirthPlace;
    public String getDhrRequesterBirthPlace() {
        return this.dhrRequesterBirthPlace;
    */
    public final fr.cg95.cvq.business.request.social.DhrRequesterGuardian getDhrRequesterGuardian() {
        return this.dhrRequesterGuardian;
    }
  
    
      @NotNull(
        
        
        profiles = {"resources"},
        message = "dhrRequesterIncomes"
      )
    
    private java.util.Date dhrRequesterFranceArrivalDate;

    public final void setDhrRequesterFranceArrivalDate(final java.util.Date dhrRequesterFranceArrivalDate) {
        this.dhrRequesterFranceArrivalDate = dhrRequesterFranceArrivalDate;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_requester_france_arrival_date"
        
      
    */
    public final java.util.Date getDhrRequesterFranceArrivalDate() {
        return this.dhrRequesterFranceArrivalDate;
    }
  
    
      @NotNull(
    private java.util.Date dhrRequesterFranceArrivalDate;

    public void setDhrRequesterFranceArrivalDate(final java.util.Date dhrRequesterFranceArrivalDate) {
        this.dhrRequesterFranceArrivalDate = dhrRequesterFranceArrivalDate;
    }

 
    @Column(name="dhr_requester_france_arrival_date"  )
      
    public java.util.Date getDhrRequesterFranceArrivalDate() {
        return this.dhrRequesterFranceArrivalDate;
    }
  
    
      @NotNull(
      @AssertValid(
        
        
        profiles = {"resources"},
        message = "dhrRequesterIncomes"
      )
    
    private fr.cg95.cvq.business.request.social.DhrIncomes dhrRequesterIncomes;

    public final void setDhrRequesterHaveGuardian(final Boolean dhrRequesterHaveGuardian) {
        this.dhrRequesterHaveGuardian = dhrRequesterHaveGuardian;
    public void setDhrRequesterHaveGuardian(final Boolean dhrRequesterHaveGuardian) {
        this.dhrRequesterHaveGuardian = dhrRequesterHaveGuardian;
    public final void setDhrRequesterIncomes(final fr.cg95.cvq.business.request.social.DhrIncomes dhrRequesterIncomes) {
        this.dhrRequesterIncomes = dhrRequesterIncomes;
    }

 
        * @hibernate.property
        *  column="dhr_requester_have_guardian"
        
    @Column(name="dhr_requester_have_guardian"  )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="dhr_requester_incomes_id"
        *  class="fr.cg95.cvq.business.request.social.DhrIncomes"
      
    */
    public final Boolean getDhrRequesterHaveGuardian() {
        return this.dhrRequesterHaveGuardian;
    public Boolean getDhrRequesterHaveGuardian() {
        return this.dhrRequesterHaveGuardian;
    */
    public final fr.cg95.cvq.business.request.social.DhrIncomes getDhrRequesterIncomes() {
        return this.dhrRequesterIncomes;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "dhrRequesterPensionPlan"
      )
    
    private Boolean dhrRequesterIsFrenchResident;

    public final void setDhrRequesterIsFrenchResident(final Boolean dhrRequesterIsFrenchResident) {
        this.dhrRequesterIsFrenchResident = dhrRequesterIsFrenchResident;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_requester_is_french_resident"
        
      
    */
    public final Boolean getDhrRequesterIsFrenchResident() {
        return this.dhrRequesterIsFrenchResident;
    }
  
    
      @NotNull(
        
    private Boolean dhrRequesterIsFrenchResident;

    public void setDhrRequesterIsFrenchResident(final Boolean dhrRequesterIsFrenchResident) {
        this.dhrRequesterIsFrenchResident = dhrRequesterIsFrenchResident;
    }

 
    @Column(name="dhr_requester_is_french_resident"  )
      
    public Boolean getDhrRequesterIsFrenchResident() {
        return this.dhrRequesterIsFrenchResident;
    }
  
    
      @NotNull(
        
      @AssertValid(
        
        
        profiles = {"subject"},
        message = "dhrRequesterPensionPlan"
      )
    
    private fr.cg95.cvq.business.request.social.DhrRequesterPensionPlan dhrRequesterPensionPlan;

    public final void setDhrRequesterNationality(final fr.cg95.cvq.business.users.NationalityType dhrRequesterNationality) {
        this.dhrRequesterNationality = dhrRequesterNationality;
    public void setDhrRequesterNationality(final fr.cg95.cvq.business.users.NationalityType dhrRequesterNationality) {
        this.dhrRequesterNationality = dhrRequesterNationality;
    public final void setDhrRequesterPensionPlan(final fr.cg95.cvq.business.request.social.DhrRequesterPensionPlan dhrRequesterPensionPlan) {
        this.dhrRequesterPensionPlan = dhrRequesterPensionPlan;
    }

 
        * @hibernate.property
        *  column="dhr_requester_nationality"
        *  length="32"
    @Enumerated(EnumType.STRING)
    @Column(name="dhr_requester_nationality" , length=32 )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="dhr_requester_pension_plan_id"
        *  class="fr.cg95.cvq.business.request.social.DhrRequesterPensionPlan"
      
    */
    public final fr.cg95.cvq.business.users.NationalityType getDhrRequesterNationality() {
        return this.dhrRequesterNationality;
    public fr.cg95.cvq.business.users.NationalityType getDhrRequesterNationality() {
        return this.dhrRequesterNationality;
    */
    public final fr.cg95.cvq.business.request.social.DhrRequesterPensionPlan getDhrRequesterPensionPlan() {
        return this.dhrRequesterPensionPlan;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouse"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouse"
      )
    
    private fr.cg95.cvq.business.request.social.DhrSpouse dhrSpouse;

    public final void setDhrSpouseAddress(final fr.cg95.cvq.business.users.Address dhrSpouseAddress) {
        this.dhrSpouseAddress = dhrSpouseAddress;
    public void setDhrSpouseAddress(final fr.cg95.cvq.business.users.Address dhrSpouseAddress) {
        this.dhrSpouseAddress = dhrSpouseAddress;
    public final void setDhrSpouse(final fr.cg95.cvq.business.request.social.DhrSpouse dhrSpouse) {
        this.dhrSpouse = dhrSpouse;
    }

 
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="dhr_spouse_address_id"
        *  class="fr.cg95.cvq.business.users.Address"
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="dhr_spouse_address_id")
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="dhr_spouse_id"
        *  class="fr.cg95.cvq.business.request.social.DhrSpouse"
      
    */
    public final fr.cg95.cvq.business.users.Address getDhrSpouseAddress() {
        return this.dhrSpouseAddress;
    public fr.cg95.cvq.business.users.Address getDhrSpouseAddress() {
        return this.dhrSpouseAddress;
    */
    public final fr.cg95.cvq.business.request.social.DhrSpouse getDhrSpouse() {
        return this.dhrSpouse;
    }
  
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseIncomes"
      )
    
    private fr.cg95.cvq.business.request.social.DhrIncomes dhrSpouseIncomes;

    public final void setDhrSpouseBirthDate(final java.util.Date dhrSpouseBirthDate) {
        this.dhrSpouseBirthDate = dhrSpouseBirthDate;
    public void setDhrSpouseBirthDate(final java.util.Date dhrSpouseBirthDate) {
        this.dhrSpouseBirthDate = dhrSpouseBirthDate;
    public final void setDhrSpouseIncomes(final fr.cg95.cvq.business.request.social.DhrIncomes dhrSpouseIncomes) {
        this.dhrSpouseIncomes = dhrSpouseIncomes;
    }

 
        * @hibernate.property
        *  column="dhr_spouse_birth_date"
        
    @Column(name="dhr_spouse_birth_date"  )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="dhr_spouse_incomes_id"
        *  class="fr.cg95.cvq.business.request.social.DhrIncomes"
      
    */
    public final java.util.Date getDhrSpouseBirthDate() {
        return this.dhrSpouseBirthDate;
    public java.util.Date getDhrSpouseBirthDate() {
        return this.dhrSpouseBirthDate;
    */
    public final fr.cg95.cvq.business.request.social.DhrIncomes getDhrSpouseIncomes() {
        return this.dhrSpouseIncomes;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseStatus"
      )
    
      @AssertValid(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseStatus"
      )
    
    private fr.cg95.cvq.business.request.social.DhrSpouseStatus dhrSpouseStatus;

    public final void setDhrSpouseBirthPlace(final String dhrSpouseBirthPlace) {
        this.dhrSpouseBirthPlace = dhrSpouseBirthPlace;
    public void setDhrSpouseBirthPlace(final String dhrSpouseBirthPlace) {
        this.dhrSpouseBirthPlace = dhrSpouseBirthPlace;
    public final void setDhrSpouseStatus(final fr.cg95.cvq.business.request.social.DhrSpouseStatus dhrSpouseStatus) {
        this.dhrSpouseStatus = dhrSpouseStatus;
    }

 
        * @hibernate.property
        *  column="dhr_spouse_birth_place"
        
    @Column(name="dhr_spouse_birth_place"  )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="dhr_spouse_status_id"
        *  class="fr.cg95.cvq.business.request.social.DhrSpouseStatus"
      
    */
    public final String getDhrSpouseBirthPlace() {
        return this.dhrSpouseBirthPlace;
    public String getDhrSpouseBirthPlace() {
        return this.dhrSpouseBirthPlace;
    */
    public final fr.cg95.cvq.business.request.social.DhrSpouseStatus getDhrSpouseStatus() {
        return this.dhrSpouseStatus;
    }
  
    
      @NotNull(
        
        
        profiles = {"taxes"},
        message = "dhrTaxesAmount"
      )
    
      @AssertValid(
        
        
        profiles = {"taxes"},
        message = "dhrTaxesAmount"
      )
    
    private fr.cg95.cvq.business.request.social.DhrTaxesAmount dhrTaxesAmount;

    public final void setDhrSpouseComplementaryPensionPlan(final String dhrSpouseComplementaryPensionPlan) {
        this.dhrSpouseComplementaryPensionPlan = dhrSpouseComplementaryPensionPlan;
    public void setDhrSpouseComplementaryPensionPlan(final String dhrSpouseComplementaryPensionPlan) {
        this.dhrSpouseComplementaryPensionPlan = dhrSpouseComplementaryPensionPlan;
    public final void setDhrTaxesAmount(final fr.cg95.cvq.business.request.social.DhrTaxesAmount dhrTaxesAmount) {
        this.dhrTaxesAmount = dhrTaxesAmount;
    }

 
        * @hibernate.property
        *  column="dhr_spouse_complementary_pension_plan"
        
    @Column(name="dhr_spouse_complementary_pension_plan"  )
        * @hibernate.many-to-one
        *  cascade="all"
        *  column="dhr_taxes_amount_id"
        *  class="fr.cg95.cvq.business.request.social.DhrTaxesAmount"
      
    */
    public final String getDhrSpouseComplementaryPensionPlan() {
        return this.dhrSpouseComplementaryPensionPlan;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= !_this.conditions['dhrIsSpouseRetired'].test(_this.dhrIsSpouseRetired.toString());" +
                
              
            
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseEmployer"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= !_this.conditions['dhrIsSpouseRetired'].test(_this.dhrIsSpouseRetired.toString());" +
                
              
            
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseEmployer"
      )
    
    private String dhrSpouseEmployer;

    public final void setDhrSpouseEmployer(final String dhrSpouseEmployer) {
        this.dhrSpouseEmployer = dhrSpouseEmployer;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_spouse_employer"
        
      
    */
    public final String getDhrSpouseEmployer() {
        return this.dhrSpouseEmployer;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseFamilyStatus"
      )
    
    private fr.cg95.cvq.business.users.FamilyStatusType dhrSpouseFamilyStatus;

    public final void setDhrSpouseFamilyStatus(final fr.cg95.cvq.business.users.FamilyStatusType dhrSpouseFamilyStatus) {
        this.dhrSpouseFamilyStatus = dhrSpouseFamilyStatus;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_spouse_family_status"
        
      
    */
    public final fr.cg95.cvq.business.users.FamilyStatusType getDhrSpouseFamilyStatus() {
        return this.dhrSpouseFamilyStatus;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseFirstName"
      )
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseFirstName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseFirstName"
      )
    
    private String dhrSpouseFirstName;

    public final void setDhrSpouseFirstName(final String dhrSpouseFirstName) {
        this.dhrSpouseFirstName = dhrSpouseFirstName;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_spouse_first_name"
        *  length="38"
      
    */
    public final String getDhrSpouseFirstName() {
        return this.dhrSpouseFirstName;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrSpouseNationality'].test(_this.dhrSpouseNationality.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseFranceArrivalDate"
      )
    
    private java.util.Date dhrSpouseFranceArrivalDate;

    public final void setDhrSpouseFranceArrivalDate(final java.util.Date dhrSpouseFranceArrivalDate) {
        this.dhrSpouseFranceArrivalDate = dhrSpouseFranceArrivalDate;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_spouse_france_arrival_date"
        
      
    */
    public final java.util.Date getDhrSpouseFranceArrivalDate() {
        return this.dhrSpouseFranceArrivalDate;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrSpouseNationality'].test(_this.dhrSpouseNationality.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseIsFrenchResident"
      )
    
    private Boolean dhrSpouseIsFrenchResident;

    public final void setDhrSpouseIsFrenchResident(final Boolean dhrSpouseIsFrenchResident) {
        this.dhrSpouseIsFrenchResident = dhrSpouseIsFrenchResident;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_spouse_is_french_resident"
        
      
    */
    public final Boolean getDhrSpouseIsFrenchResident() {
        return this.dhrSpouseIsFrenchResident;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrSpouseTitle'].test(_this.dhrSpouseTitle.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseMaidenName"
      )
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrSpouseTitle'].test(_this.dhrSpouseTitle.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseMaidenName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrSpouseTitle'].test(_this.dhrSpouseTitle.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseMaidenName"
      )
    
    private String dhrSpouseMaidenName;

    public final void setDhrSpouseMaidenName(final String dhrSpouseMaidenName) {
        this.dhrSpouseMaidenName = dhrSpouseMaidenName;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_spouse_maiden_name"
        *  length="38"
      
    */
    public final String getDhrSpouseMaidenName() {
        return this.dhrSpouseMaidenName;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseName"
      )
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseName"
      )
    
    private String dhrSpouseName;

    public final void setDhrSpouseName(final String dhrSpouseName) {
        this.dhrSpouseName = dhrSpouseName;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_spouse_name"
        *  length="38"
      
    */
    public final String getDhrSpouseName() {
        return this.dhrSpouseName;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseNationality"
      )
    
    private fr.cg95.cvq.business.users.NationalityType dhrSpouseNationality;

    public final void setDhrSpouseNationality(final fr.cg95.cvq.business.users.NationalityType dhrSpouseNationality) {
        this.dhrSpouseNationality = dhrSpouseNationality;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_spouse_nationality"
        *  length="32"
      
    */
    public final fr.cg95.cvq.business.users.NationalityType getDhrSpouseNationality() {
        return this.dhrSpouseNationality;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrSpousePrincipalPensionPlan'].test(_this.dhrSpousePrincipalPensionPlan.toString());" +
                
              
            
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpousePensionPlanDetail"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrSpousePrincipalPensionPlan'].test(_this.dhrSpousePrincipalPensionPlan.toString());" +
                
              
            
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpousePensionPlanDetail"
      )
    
    private String dhrSpousePensionPlanDetail;

    public final void setDhrSpousePensionPlanDetail(final String dhrSpousePensionPlanDetail) {
        this.dhrSpousePensionPlanDetail = dhrSpousePensionPlanDetail;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_spouse_pension_plan_detail"
        
      
    */
    public final String getDhrSpousePensionPlanDetail() {
        return this.dhrSpousePensionPlanDetail;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrIsSpouseRetired'].test(_this.dhrIsSpouseRetired.toString());" +
                
              
            
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpousePrincipalPensionPlan"
      )
    
    private fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType dhrSpousePrincipalPensionPlan;

    public final void setDhrSpousePrincipalPensionPlan(final fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType dhrSpousePrincipalPensionPlan) {
        this.dhrSpousePrincipalPensionPlan = dhrSpousePrincipalPensionPlan;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_spouse_principal_pension_plan"
        
      
    */
    public final fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType getDhrSpousePrincipalPensionPlan() {
        return this.dhrSpousePrincipalPensionPlan;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= !_this.conditions['dhrIsSpouseRetired'].test(_this.dhrIsSpouseRetired.toString());" +
                
              
            
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseProfession"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= !_this.conditions['dhrIsSpouseRetired'].test(_this.dhrIsSpouseRetired.toString());" +
                
              
            
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseProfession"
      )
    
    private String dhrSpouseProfession;

    public final void setDhrSpouseProfession(final String dhrSpouseProfession) {
        this.dhrSpouseProfession = dhrSpouseProfession;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_spouse_profession"
        
      
    */
    public final String getDhrSpouseProfession() {
        return this.dhrSpouseProfession;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseTitle"
      )
    
    private fr.cg95.cvq.business.users.TitleType dhrSpouseTitle;

    public final void setDhrSpouseTitle(final fr.cg95.cvq.business.users.TitleType dhrSpouseTitle) {
        this.dhrSpouseTitle = dhrSpouseTitle;
    }

    /**
 
        * @hibernate.property
        *  column="dhr_spouse_title"
        
      
    */
    public final fr.cg95.cvq.business.users.TitleType getDhrSpouseTitle() {
        return this.dhrSpouseTitle;
    }
  
    
    private java.math.BigInteger localRate;

    public final void setLocalRate(final java.math.BigInteger localRate) {
        this.localRate = localRate;
    }

    /**
 
        * @hibernate.property
        *  column="local_rate"
        *  type="serializable"
        
      
    */
    public final java.math.BigInteger getLocalRate() {
        return this.localRate;
    }
  
    
    private java.math.BigInteger pensions;

    public final void setPensions(final java.math.BigInteger pensions) {
        this.pensions = pensions;
    }

    /**
 
        * @hibernate.property
        *  column="pensions"
        *  type="serializable"
        
      
    */
    public final java.math.BigInteger getPensions() {
        return this.pensions;
    }
  
    
    private java.math.BigInteger professionalTaxes;

    public final void setProfessionalTaxes(final java.math.BigInteger professionalTaxes) {
        this.professionalTaxes = professionalTaxes;
    }

    /**
 
        * @hibernate.property
        *  column="professional_taxes"
        *  type="serializable"
        
      
    */
    public final java.math.BigInteger getProfessionalTaxes() {
        return this.professionalTaxes;
    }
  
    
    private java.math.BigInteger propertyTaxes;

    public final void setPropertyTaxes(final java.math.BigInteger propertyTaxes) {
        this.propertyTaxes = propertyTaxes;
    }

    /**
 
        * @hibernate.property
        *  column="property_taxes"
        *  type="serializable"
        
      
    */
    public final java.math.BigInteger getPropertyTaxes() {
        return this.propertyTaxes;
    public String getDhrSpouseComplementaryPensionPlan() {
        return this.dhrSpouseComplementaryPensionPlan;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= !_this.conditions['dhrIsSpouseRetired'].test(_this.dhrIsSpouseRetired.toString());" +
                
              
            
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseEmployer"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= !_this.conditions['dhrIsSpouseRetired'].test(_this.dhrIsSpouseRetired.toString());" +
                
              
            
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseEmployer"
      )
    
    private String dhrSpouseEmployer;

    public void setDhrSpouseEmployer(final String dhrSpouseEmployer) {
        this.dhrSpouseEmployer = dhrSpouseEmployer;
    }

 
    @Column(name="dhr_spouse_employer"  )
      
    public String getDhrSpouseEmployer() {
        return this.dhrSpouseEmployer;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseFamilyStatus"
      )
    
    private fr.cg95.cvq.business.users.FamilyStatusType dhrSpouseFamilyStatus;

    public void setDhrSpouseFamilyStatus(final fr.cg95.cvq.business.users.FamilyStatusType dhrSpouseFamilyStatus) {
        this.dhrSpouseFamilyStatus = dhrSpouseFamilyStatus;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="dhr_spouse_family_status"  )
      
    public fr.cg95.cvq.business.users.FamilyStatusType getDhrSpouseFamilyStatus() {
        return this.dhrSpouseFamilyStatus;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseFirstName"
      )
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseFirstName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseFirstName"
      )
    
    private String dhrSpouseFirstName;

    public void setDhrSpouseFirstName(final String dhrSpouseFirstName) {
        this.dhrSpouseFirstName = dhrSpouseFirstName;
    }

 
    @Column(name="dhr_spouse_first_name" , length=38 )
      
    public String getDhrSpouseFirstName() {
        return this.dhrSpouseFirstName;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrSpouseNationality'].test(_this.dhrSpouseNationality.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseFranceArrivalDate"
      )
    
    private java.util.Date dhrSpouseFranceArrivalDate;

    public void setDhrSpouseFranceArrivalDate(final java.util.Date dhrSpouseFranceArrivalDate) {
        this.dhrSpouseFranceArrivalDate = dhrSpouseFranceArrivalDate;
    }

 
    @Column(name="dhr_spouse_france_arrival_date"  )
      
    public java.util.Date getDhrSpouseFranceArrivalDate() {
        return this.dhrSpouseFranceArrivalDate;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrSpouseNationality'].test(_this.dhrSpouseNationality.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseIsFrenchResident"
      )
    
    private Boolean dhrSpouseIsFrenchResident;

    public void setDhrSpouseIsFrenchResident(final Boolean dhrSpouseIsFrenchResident) {
        this.dhrSpouseIsFrenchResident = dhrSpouseIsFrenchResident;
    }

 
    @Column(name="dhr_spouse_is_french_resident"  )
      
    public Boolean getDhrSpouseIsFrenchResident() {
        return this.dhrSpouseIsFrenchResident;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrSpouseTitle'].test(_this.dhrSpouseTitle.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseMaidenName"
      )
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrSpouseTitle'].test(_this.dhrSpouseTitle.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseMaidenName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrSpouseTitle'].test(_this.dhrSpouseTitle.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseMaidenName"
      )
    
    private String dhrSpouseMaidenName;

    public void setDhrSpouseMaidenName(final String dhrSpouseMaidenName) {
        this.dhrSpouseMaidenName = dhrSpouseMaidenName;
    }

 
    @Column(name="dhr_spouse_maiden_name" , length=38 )
      
    public String getDhrSpouseMaidenName() {
        return this.dhrSpouseMaidenName;
    }
  
    
      @MaxLength(
        
          value = 38,
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseName"
      )
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseName"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseName"
      )
    
    private String dhrSpouseName;

    public void setDhrSpouseName(final String dhrSpouseName) {
        this.dhrSpouseName = dhrSpouseName;
    }

 
    @Column(name="dhr_spouse_name" , length=38 )
      
    public String getDhrSpouseName() {
        return this.dhrSpouseName;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseNationality"
      )
    
    private fr.cg95.cvq.business.users.NationalityType dhrSpouseNationality;

    public void setDhrSpouseNationality(final fr.cg95.cvq.business.users.NationalityType dhrSpouseNationality) {
        this.dhrSpouseNationality = dhrSpouseNationality;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="dhr_spouse_nationality" , length=32 )
      
    public fr.cg95.cvq.business.users.NationalityType getDhrSpouseNationality() {
        return this.dhrSpouseNationality;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrSpousePrincipalPensionPlan'].test(_this.dhrSpousePrincipalPensionPlan.toString());" +
                
              
            
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpousePensionPlanDetail"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrSpousePrincipalPensionPlan'].test(_this.dhrSpousePrincipalPensionPlan.toString());" +
                
              
            
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpousePensionPlanDetail"
      )
    
    private String dhrSpousePensionPlanDetail;

    public void setDhrSpousePensionPlanDetail(final String dhrSpousePensionPlanDetail) {
        this.dhrSpousePensionPlanDetail = dhrSpousePensionPlanDetail;
    }

 
    @Column(name="dhr_spouse_pension_plan_detail"  )
      
    public String getDhrSpousePensionPlanDetail() {
        return this.dhrSpousePensionPlanDetail;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrIsSpouseRetired'].test(_this.dhrIsSpouseRetired.toString());" +
                
              
            
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpousePrincipalPensionPlan"
      )
    
    private fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType dhrSpousePrincipalPensionPlan;

    public void setDhrSpousePrincipalPensionPlan(final fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType dhrSpousePrincipalPensionPlan) {
        this.dhrSpousePrincipalPensionPlan = dhrSpousePrincipalPensionPlan;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="dhr_spouse_principal_pension_plan"  )
      
    public fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType getDhrSpousePrincipalPensionPlan() {
        return this.dhrSpousePrincipalPensionPlan;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= !_this.conditions['dhrIsSpouseRetired'].test(_this.dhrIsSpouseRetired.toString());" +
                
              
            
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseProfession"
      )
    
      @NotBlank(
        
        
          when = "groovy:def active = true;" +
          
            "active &= !_this.conditions['dhrIsSpouseRetired'].test(_this.dhrIsSpouseRetired.toString());" +
                
              
            
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseProfession"
      )
    
    private String dhrSpouseProfession;

    public void setDhrSpouseProfession(final String dhrSpouseProfession) {
        this.dhrSpouseProfession = dhrSpouseProfession;
    }

 
    @Column(name="dhr_spouse_profession"  )
      
    public String getDhrSpouseProfession() {
        return this.dhrSpouseProfession;
    }
  
    
      @NotNull(
        
        
          when = "groovy:def active = true;" +
          
            "active &= _this.conditions['dhrRequestKind'].test(_this.dhrRequestKind.toString());" +
                
              
            
            
            "return active",
        
        profiles = {"spouse"},
        message = "dhrSpouseTitle"
      )
    
    private fr.cg95.cvq.business.users.TitleType dhrSpouseTitle;

    public void setDhrSpouseTitle(final fr.cg95.cvq.business.users.TitleType dhrSpouseTitle) {
        this.dhrSpouseTitle = dhrSpouseTitle;
    }

 
    @Enumerated(EnumType.STRING)
    @Column(name="dhr_spouse_title"  )
      
    public fr.cg95.cvq.business.users.TitleType getDhrSpouseTitle() {
        return this.dhrSpouseTitle;
    }
  
    
    private java.math.BigInteger localRate;

    public void setLocalRate(final java.math.BigInteger localRate) {
        this.localRate = localRate;
    }

 
    @Column(name="local_rate" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getLocalRate() {
        return this.localRate;
    }
  
    
    private java.math.BigInteger pensions;

    public void setPensions(final java.math.BigInteger pensions) {
        this.pensions = pensions;
    }

 
    @Column(name="pensions" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getPensions() {
        return this.pensions;
    }
  
    
    private java.math.BigInteger professionalTaxes;

    public void setProfessionalTaxes(final java.math.BigInteger professionalTaxes) {
        this.professionalTaxes = professionalTaxes;
    }

 
    @Column(name="professional_taxes" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getProfessionalTaxes() {
        return this.professionalTaxes;
    }
  
    
    private java.math.BigInteger propertyTaxes;

    public void setPropertyTaxes(final java.math.BigInteger propertyTaxes) {
        this.propertyTaxes = propertyTaxes;
    }

 
    @Column(name="property_taxes" , columnDefinition="bytea" )
    @Type(type="serializable") //Hack see http://capdemat.capwebct.fr/ticket/338
      
    public java.math.BigInteger getPropertyTaxes() {
        return this.propertyTaxes;
    */
    public final fr.cg95.cvq.business.request.social.DhrTaxesAmount getDhrTaxesAmount() {
        return this.dhrTaxesAmount;
    }
  
}
