

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

  
    
      @NotNull(
        
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwelling"
      )
    
      @AssertValid(
        
        
        profiles = {"dwelling"},
        message = "dhrCurrentDwelling"
      )
    
    private fr.cg95.cvq.business.request.social.DhrCurrentDwelling dhrCurrentDwelling;

    public void setDhrCurrentDwelling(final fr.cg95.cvq.business.request.social.DhrCurrentDwelling dhrCurrentDwelling) {
        this.dhrCurrentDwelling = dhrCurrentDwelling;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="dhr_current_dwelling_id")
      
    public fr.cg95.cvq.business.request.social.DhrCurrentDwelling getDhrCurrentDwelling() {
        return this.dhrCurrentDwelling;
    }
  
    
      @NotNull(
        
        
        profiles = {"familyReferent"},
        message = "dhrFamilyReferent"
      )
    
      @AssertValid(
        
        
        profiles = {"familyReferent"},
        message = "dhrFamilyReferent"
      )
    
    private fr.cg95.cvq.business.request.social.DhrFamilyReferent dhrFamilyReferent;

    public void setDhrFamilyReferent(final fr.cg95.cvq.business.request.social.DhrFamilyReferent dhrFamilyReferent) {
        this.dhrFamilyReferent = dhrFamilyReferent;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="dhr_family_referent_id")
      
    public fr.cg95.cvq.business.request.social.DhrFamilyReferent getDhrFamilyReferent() {
        return this.dhrFamilyReferent;
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
        message = "dhrRequester"
      )
    
      @AssertValid(
        
        
        profiles = {"subject"},
        message = "dhrRequester"
      )
    
    private fr.cg95.cvq.business.request.social.DhrRequester dhrRequester;

    public void setDhrRequester(final fr.cg95.cvq.business.request.social.DhrRequester dhrRequester) {
        this.dhrRequester = dhrRequester;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="dhr_requester_id")
      
    public fr.cg95.cvq.business.request.social.DhrRequester getDhrRequester() {
        return this.dhrRequester;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "dhrRequesterGuardian"
      )
    
      @AssertValid(
        
        
        profiles = {"subject"},
        message = "dhrRequesterGuardian"
      )
    
    private fr.cg95.cvq.business.request.social.DhrRequesterGuardian dhrRequesterGuardian;

    public void setDhrRequesterGuardian(final fr.cg95.cvq.business.request.social.DhrRequesterGuardian dhrRequesterGuardian) {
        this.dhrRequesterGuardian = dhrRequesterGuardian;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="dhr_requester_guardian_id")
      
    public fr.cg95.cvq.business.request.social.DhrRequesterGuardian getDhrRequesterGuardian() {
        return this.dhrRequesterGuardian;
    }
  
    
      @NotNull(
        
        
        profiles = {"resources"},
        message = "dhrRequesterIncomes"
      )
    
      @AssertValid(
        
        
        profiles = {"resources"},
        message = "dhrRequesterIncomes"
      )
    
    private fr.cg95.cvq.business.request.social.DhrIncomes dhrRequesterIncomes;

    public void setDhrRequesterIncomes(final fr.cg95.cvq.business.request.social.DhrIncomes dhrRequesterIncomes) {
        this.dhrRequesterIncomes = dhrRequesterIncomes;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="dhr_requester_incomes_id")
      
    public fr.cg95.cvq.business.request.social.DhrIncomes getDhrRequesterIncomes() {
        return this.dhrRequesterIncomes;
    }
  
    
      @NotNull(
        
        
        profiles = {"subject"},
        message = "dhrRequesterPensionPlan"
      )
    
      @AssertValid(
        
        
        profiles = {"subject"},
        message = "dhrRequesterPensionPlan"
      )
    
    private fr.cg95.cvq.business.request.social.DhrRequesterPensionPlan dhrRequesterPensionPlan;

    public void setDhrRequesterPensionPlan(final fr.cg95.cvq.business.request.social.DhrRequesterPensionPlan dhrRequesterPensionPlan) {
        this.dhrRequesterPensionPlan = dhrRequesterPensionPlan;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="dhr_requester_pension_plan_id")
      
    public fr.cg95.cvq.business.request.social.DhrRequesterPensionPlan getDhrRequesterPensionPlan() {
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

    public void setDhrSpouse(final fr.cg95.cvq.business.request.social.DhrSpouse dhrSpouse) {
        this.dhrSpouse = dhrSpouse;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="dhr_spouse_id")
      
    public fr.cg95.cvq.business.request.social.DhrSpouse getDhrSpouse() {
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

    public void setDhrSpouseIncomes(final fr.cg95.cvq.business.request.social.DhrIncomes dhrSpouseIncomes) {
        this.dhrSpouseIncomes = dhrSpouseIncomes;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="dhr_spouse_incomes_id")
      
    public fr.cg95.cvq.business.request.social.DhrIncomes getDhrSpouseIncomes() {
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

    public void setDhrSpouseStatus(final fr.cg95.cvq.business.request.social.DhrSpouseStatus dhrSpouseStatus) {
        this.dhrSpouseStatus = dhrSpouseStatus;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="dhr_spouse_status_id")
      
    public fr.cg95.cvq.business.request.social.DhrSpouseStatus getDhrSpouseStatus() {
        return this.dhrSpouseStatus;
    }
  
    
      @AssertValid(
        
        
        profiles = {"taxes"},
        message = "dhrTaxesAmount"
      )
    
    private fr.cg95.cvq.business.request.social.DhrTaxesAmount dhrTaxesAmount;

    public void setDhrTaxesAmount(final fr.cg95.cvq.business.request.social.DhrTaxesAmount dhrTaxesAmount) {
        this.dhrTaxesAmount = dhrTaxesAmount;
    }

 
    @ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="dhr_taxes_amount_id")
      
    public fr.cg95.cvq.business.request.social.DhrTaxesAmount getDhrTaxesAmount() {
        return this.dhrTaxesAmount;
    }
  
}
