package fr.cg95.cvq.service.request.social.impl;

import org.apache.log4j.Logger;

import fr.cg95.cvq.business.request.Request;
import fr.cg95.cvq.business.request.social.DhrAssetKindType;
import fr.cg95.cvq.business.request.social.DhrDwellingKindType;
import fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType;
import fr.cg95.cvq.business.request.social.DhrRequestKindType;
import fr.cg95.cvq.business.request.social.DhrCurrentDwelling;
import fr.cg95.cvq.business.request.social.DhrFamilyReferent;
import fr.cg95.cvq.business.request.social.DhrNotRealAsset;
import fr.cg95.cvq.business.request.social.DhrPreviousDwelling;
import fr.cg95.cvq.business.request.social.DhrRequester;
import fr.cg95.cvq.business.request.social.DhrRequesterGuardian;
import fr.cg95.cvq.business.request.social.DhrRequesterPensionPlan;
import fr.cg95.cvq.business.request.social.DhrSpouse;
import fr.cg95.cvq.business.request.social.DhrSpouseStatus;
import fr.cg95.cvq.business.request.social.DomesticHelpRequest;
import fr.cg95.cvq.exception.CvqException;
import fr.cg95.cvq.exception.CvqObjectNotFoundException;
import fr.cg95.cvq.service.request.condition.EqualityChecker;
import fr.cg95.cvq.service.request.impl.RequestService;
import fr.cg95.cvq.xml.request.social.DhrCurrentDwellingType;
import fr.cg95.cvq.xml.request.social.DhrSpouseStatusType;
import fr.cg95.cvq.xml.request.social.DhrSpouseType;

/**
 * Implementation of the domestic help request service.
 * 
 * @author Rafik Djedjig (rdj@zenexity.fr)
 */
public class DomesticHelpRequestService extends RequestService {

    static Logger logger = Logger.getLogger(DomesticHelpRequestService.class);

    @Override
    public void init() {
        DomesticHelpRequest.conditions.put("dhrRequestKind", new EqualityChecker(DhrRequestKindType.COUPLE.name()));
        
        // kept them for client side JS validation script
        DomesticHelpRequest.conditions.put("dhrPreviousDwelling[0].dhrPreviousDwellingKind",
            new EqualityChecker("placeOfResidence"));
        DomesticHelpRequest.conditions.put("dhrNotRealAsset[0].dhrNotRealAssetKind",
            new EqualityChecker("RealEstate"));
        DomesticHelpRequest.conditions.put("dhrRequester.dhrRequesterNationality",
                new EqualityChecker("OutsideEuropeanUnion"));
        DomesticHelpRequest.conditions.put("dhrRequesterGuardian.dhrRequesterHaveGuardian", 
                new EqualityChecker("true"));
        DomesticHelpRequest.conditions.put("dhrSpouse.dhrSpouseTitle", 
                new EqualityChecker("Madam"));
        DomesticHelpRequest.conditions.put("dhrSpouse.dhrSpouseNationality",
                new EqualityChecker("OutsideEuropeanUnion"));
        DomesticHelpRequest.conditions.put("dhrSpouseStatus.dhrIsSpouseRetired", 
                new EqualityChecker("true"));
        DomesticHelpRequest.conditions.put("dhrSpouseStatus.dhrSpousePrincipalPensionPlan",
                new EqualityChecker("Other"));
        DomesticHelpRequest.conditions.put("dhrCurrentDwelling.dhrCurrentDwellingKind",
                new EqualityChecker("placeOfResidence"));
        DomesticHelpRequest.conditions.put("dhrFamilyReferent.dhrHaveFamilyReferent", 
                new EqualityChecker("true"));
        DomesticHelpRequest.conditions.put("dhrRequesterPensionPlan.dhrPrincipalPensionPlan", 
                new EqualityChecker("Other"));
        
        // added for server side vaidation
        DhrPreviousDwelling.conditions.put("dhrPreviousDwelling.dhrPreviousDwellingKind",
                new EqualityChecker("placeOfResidence"));
        DhrNotRealAsset.conditions.put("dhrNotRealAsset.dhrNotRealAssetKind",
            new EqualityChecker("RealEstate"));
        DhrRequester.conditions.put("dhrRequester.dhrRequesterNationality",
                new EqualityChecker("OutsideEuropeanUnion"));
        DhrRequesterGuardian.conditions.put("dhrRequesterGuardian.dhrRequesterHaveGuardian", 
                new EqualityChecker("true"));
        DhrSpouse.conditions.put("dhrSpouse.dhrSpouseTitle", 
                new EqualityChecker("Madam"));
        DhrSpouse.conditions.put("dhrSpouse.dhrSpouseNationality",
                new EqualityChecker("OutsideEuropeanUnion"));
        DhrSpouseStatus.conditions.put("dhrSpouseStatus.dhrIsSpouseRetired", 
                new EqualityChecker("true"));
        DhrSpouseStatus.conditions.put("dhrSpouseStatus.dhrSpousePrincipalPensionPlan",
                new EqualityChecker("Other"));
        DhrCurrentDwelling.conditions.put("dhrCurrentDwelling.dhrCurrentDwellingKind",
                new EqualityChecker("placeOfResidence"));
        DhrFamilyReferent.conditions.put("dhrFamilyReferent.dhrHaveFamilyReferent", 
                new EqualityChecker("true"));
        DhrRequesterPensionPlan.conditions.put("dhrRequesterPensionPlan.dhrPrincipalPensionPlan", 
                new EqualityChecker("Other"));
    }

    @Override
    public void onRequestIssued(final Request request) throws CvqException,
            CvqObjectNotFoundException {

        DomesticHelpRequest dhr = (DomesticHelpRequest) request;
        processTotals(dhr);
    }

    @Override
    public void onRequestModified(Request request) throws CvqException {

        processTotals((DomesticHelpRequest) request);
    }

    private void processTotals(DomesticHelpRequest dhr) {
//        int subjectTotalIncomes = (dhr.getRequesterPensions() == null ? 0 : dhr
//                .getRequesterPensions().intValue())
//                + (dhr.getRequesterAllowances() == null ? 0 : dhr.getRequesterAllowances()
//                        .intValue())
//                + (dhr.getRequesterFurnitureInvestmentIncome() == null ? 0 : dhr
//                        .getRequesterFurnitureInvestmentIncome().intValue())
//                + (dhr.getRequesterRealEstateInvestmentIncome() == null ? 0 : dhr
//                        .getRequesterRealEstateInvestmentIncome().intValue())
//                + (dhr.getRequesterNetIncome() == null ? 0 : dhr.getRequesterNetIncome().intValue());
//        dhr.setRequesterIncomesAnnualTotal(BigInteger.valueOf(subjectTotalIncomes));
//
//        if (dhr.getSpouseInformation() != null) {
//            int spouseTotalIncomes = (dhr.getSpousePensions() == null ? 0 : dhr.getSpousePensions()
//                    .intValue())
//                    + (dhr.getSpouseAllowances() == null ? 0 : dhr.getSpouseAllowances().intValue())
//                    + (dhr.getSpouseFurnitureInvestmentIncome() == null ? 0 : dhr
//                            .getSpouseFurnitureInvestmentIncome().intValue())
//                    + (dhr.getSpouseRealEstateInvestmentIncome() == null ? 0 : dhr
//                            .getSpouseRealEstateInvestmentIncome().intValue())
//                    + (dhr.getSpouseNetIncome() == null ? 0 : dhr.getSpouseNetIncome().intValue());
//            dhr.setSpouseIncomesAnnualTotal(BigInteger.valueOf(spouseTotalIncomes));
//        }
//        int realAssetsTotal = 0;
//        List<DhrRealAsset> realAssets = dhr.getRealAssets();
//        for (DhrRealAsset realAsset : realAssets) {
//            realAssetsTotal += realAsset.getRealAssetValue() == null ? 0 : realAsset
//                    .getRealAssetValue().intValue();
//        }
//        dhr.setRealAssetsValuesTotal(BigInteger.valueOf(realAssetsTotal));
//
//        int notRealAssetsTotal = 0;
//        List<DhrNotRealAsset> notRealAssets = dhr.getNotRealAssets();
//        for (DhrNotRealAsset notRealAsset : notRealAssets) {
//            notRealAssetsTotal += notRealAsset.getAssetValue() == null ? 0 : notRealAsset
//                    .getAssetValue().intValue();
//        }
//        dhr.setNotRealAssetsValuesTotal(BigInteger.valueOf(notRealAssetsTotal));
//
//        int taxesTotal = (dhr.getIncomeTax() == null ? 0 : dhr.getIncomeTax().intValue())
//                + (dhr.getLocalRate() == null ? 0 : dhr.getLocalRate().intValue())
//                + (dhr.getPropertyTaxes() == null ? 0 : dhr.getPropertyTaxes().intValue())
//                + (dhr.getProfessionalTaxes() == null ? 0 : dhr.getProfessionalTaxes().intValue());
//        dhr.setTaxesTotal(BigInteger.valueOf(taxesTotal));
    } 
    
    @Override
    public boolean accept(Request request) {
        return request instanceof DomesticHelpRequest;
    }

    @Override
    public Request getSkeletonRequest() {
        return new DomesticHelpRequest();
    }
}
