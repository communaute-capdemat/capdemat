


<div id="requestData" class="yellow-yui-tabview">
  <ul class="yui-nav">
  
    <li class="selected ">
      <a href="#page0"><em><g:message code="dhr.step.subject.label" /></em></a>
    </li>
  
    <li class="">
      <a href="#page1"><em><g:message code="dhr.step.familyReferent.label" /></em></a>
    </li>
  
    <li class="">
      <a href="#page2"><em><g:message code="dhr.step.spouse.label" /></em></a>
    </li>
  
    <li class="">
      <a href="#page3"><em><g:message code="dhr.step.dwelling.label" /></em></a>
    </li>
  
    <li class="">
      <a href="#page4"><em><g:message code="dhr.step.resources.label" /></em></a>
    </li>
  
    <li class="">
      <a href="#page5"><em><g:message code="dhr.step.taxes.label" /></em></a>
    </li>
  
  </ul>
   
  <div class="yui-content">
    
      
      <!-- step start -->
      <div id="page0">
        <h2><g:message code="property.form" />
          <span><g:message code="dhr.step.subject.label" /></span>
        </h2>
        <div class="yui-g">
          
          
          <!-- column start -->
          <div class="yui-u first">
            
              
              <h3><g:message code="dhr.property.dhrRequester.label" /></h3>
              <dl class="required">
                
                  <dt class="required"><g:message code="dhr.property.subject.label" /> : </dt>
              <dd><span>${subjectIsChild && !subject?.born ? message(code:'request.subject.childNoBorn', args:[subject?.getFullName()]) : subject?.fullName}</span></dd>
          
                
                  <dt class="required">${message(code:'dhr.property.dhrRequesterBirthDate.label')} * :</dt><dd id="dhrRequesterBirthDate" class="action-editField validate-date required-true i18n-dhr.property.dhrRequesterBirthDate" ><span><g:formatDate formatName="format.date" date="${rqt.dhrRequester?.dhrRequesterBirthDate}"/></span></dd>
                
                  <dt class="required">${message(code:'dhr.property.dhrRequesterBirthPlace.label')} * :</dt><dd id="dhrRequesterBirthPlace" class="action-editField validate-string required-true i18n-dhr.property.dhrRequesterBirthPlace" ><span>${rqt.dhrRequester?.dhrRequesterBirthPlace}</span></dd>
                
                  <dt class="required condition-isNonEuropean-trigger">${message(code:'dhr.property.dhrRequesterNationality.label')} * :</dt><dd id="dhrRequesterNationality" class="action-editField validate-capdematEnum required-true i18n-dhr.property.dhrRequesterNationality javatype-fr.cg95.cvq.business.users.NationalityType maxLength-32" ><g:capdematEnumToField var="${rqt.dhrRequester?.dhrRequesterNationality}" i18nKeyPrefix="dhr.property.dhrRequesterNationality" /></dd>
                
                  <dt class="required condition-isNonEuropean-filled">${message(code:'dhr.property.dhrRequesterFranceArrivalDate.label')} * :</dt><dd id="dhrRequesterFranceArrivalDate" class="action-editField validate-date required-true i18n-dhr.property.dhrRequesterFranceArrivalDate" ><span><g:formatDate formatName="format.date" date="${rqt.dhrRequester?.dhrRequesterFranceArrivalDate}"/></span></dd>
                
                  <dt class="required condition-isNonEuropean-filled">${message(code:'dhr.property.dhrRequesterIsFrenchResident.label')} * :</dt><dd id="dhrRequesterIsFrenchResident" class="action-editField validate-boolean required-true i18n-dhr.property.dhrRequesterIsFrenchResident" ><span class="value-${rqt.dhrRequester?.dhrRequesterIsFrenchResident}"><g:message code="message.${rqt.dhrRequester?.dhrRequesterIsFrenchResident ? 'yes' : 'no'}" /></span></dd>
                
              </dl>
              
            
              
              <h3><g:message code="dhr.property.dhrRequesterPensionPlan.label" /></h3>
              <dl class="required">
                
                  <dt class="required condition-isOtherPensionPlan-trigger">${message(code:'dhr.property.dhrPrincipalPensionPlan.label')} * :</dt><dd id="dhrPrincipalPensionPlan" class="action-editField validate-capdematEnum required-true i18n-dhr.property.dhrPrincipalPensionPlan javatype-fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType" ><g:capdematEnumToField var="${rqt.dhrRequesterPensionPlan?.dhrPrincipalPensionPlan}" i18nKeyPrefix="dhr.property.dhrPrincipalPensionPlan" /></dd>
                
                  <dt class="required condition-isOtherPensionPlan-filled">${message(code:'dhr.property.dhrPensionPlanDetail.label')} * :</dt><dd id="dhrPensionPlanDetail" class="action-editField validate-string required-true i18n-dhr.property.dhrPensionPlanDetail" ><span>${rqt.dhrRequesterPensionPlan?.dhrPensionPlanDetail}</span></dd>
                
                  <dt class="required">${message(code:'dhr.property.dhrComplementaryPensionPlan.label')} * :</dt><dd id="dhrComplementaryPensionPlan" class="action-editField validate-string required-true i18n-dhr.property.dhrComplementaryPensionPlan" ><span>${rqt.dhrRequesterPensionPlan?.dhrComplementaryPensionPlan}</span></dd>
                
              </dl>
              
            
          </div>
          <!-- column end -->
          
          <!-- column start -->
          <div class="yui-u">
            
              
              <h3><g:message code="dhr.property.dhrRequesterGuardian.label" /></h3>
              <dl class="required">
                
                  <dt class="required condition-haveGuardian-trigger">${message(code:'dhr.property.dhrRequesterHaveGuardian.label')} * :</dt><dd id="dhrRequesterHaveGuardian" class="action-editField validate-boolean required-true i18n-dhr.property.dhrRequesterHaveGuardian" ><span class="value-${rqt.dhrRequesterGuardian?.dhrRequesterHaveGuardian}"><g:message code="message.${rqt.dhrRequesterGuardian?.dhrRequesterHaveGuardian ? 'yes' : 'no'}" /></span></dd>
                
                  <dt class="required condition-haveGuardian-filled">${message(code:'dhr.property.dhrGuardianMeasure.label')} * :</dt><dd id="dhrGuardianMeasure" class="action-editField validate-capdematEnum required-true i18n-dhr.property.dhrGuardianMeasure javatype-fr.cg95.cvq.business.request.social.DhrGuardianMeasureType" ><g:capdematEnumToField var="${rqt.dhrRequesterGuardian?.dhrGuardianMeasure}" i18nKeyPrefix="dhr.property.dhrGuardianMeasure" /></dd>
                
                  <dt class="required condition-haveGuardian-filled">${message(code:'dhr.property.dhrGuardianName.label')} * :</dt><dd id="dhrGuardianName" class="action-editField validate-lastName required-true i18n-dhr.property.dhrGuardianName maxLength-38" ><span>${rqt.dhrRequesterGuardian?.dhrGuardianName}</span></dd>
                
                  <dt class="required condition-haveGuardian-filled">${message(code:'dhr.property.dhrGuardianAddress.label')} * :</dt><dd id="dhrGuardianAddress" class="action-editField validate-address required-true i18n-dhr.property.dhrGuardianAddress" ><div><p class="additionalDeliveryInformation">${rqt.dhrRequesterGuardian?.dhrGuardianAddress?.additionalDeliveryInformation}</p><p class="additionalGeographicalInformation">${rqt.dhrRequesterGuardian?.dhrGuardianAddress?.additionalGeographicalInformation}</p><span class="streetNumber">${rqt.dhrRequesterGuardian?.dhrGuardianAddress?.streetNumber}</span> <span class="streetName">${rqt.dhrRequesterGuardian?.dhrGuardianAddress?.streetName}</span><g:if test="${!!rqt.dhrRequesterGuardian?.dhrGuardianAddress?.streetMatriculation}"><br /><em><g:message code="address.property.streetMatriculation" /></em><span class="streetMatriculation">${rqt.dhrRequesterGuardian?.dhrGuardianAddress?.streetMatriculation}</span></g:if><g:if test="${!!rqt.dhrRequesterGuardian?.dhrGuardianAddress?.streetRivoliCode}"><br /><em><g:message code="address.property.streetRivoliCode" /></em><span class="streetRivoliCode">${rqt.dhrRequesterGuardian?.dhrGuardianAddress?.streetRivoliCode}</span></g:if><p class="placeNameOrService">${rqt.dhrRequesterGuardian?.dhrGuardianAddress?.placeNameOrService}</p><span class="postalCode">${rqt.dhrRequesterGuardian?.dhrGuardianAddress?.postalCode}</span> <span class="city">${rqt.dhrRequesterGuardian?.dhrGuardianAddress?.city}</span><p class="countryName">${rqt.dhrRequesterGuardian?.dhrGuardianAddress?.countryName}</p><g:if test="${!!rqt.dhrRequesterGuardian?.dhrGuardianAddress?.cityInseeCode}"><em><g:message code="address.property.cityInseeCode" /></em><span class="cityInseeCode">${rqt.dhrRequesterGuardian?.dhrGuardianAddress?.cityInseeCode}</span></g:if></div></dd>
                
              </dl>
              
            
          </div>
          <!-- column end -->
          
        </div>
        <!-- data step  end -->
      </div>
      <!-- step end -->
      
      <!-- step start -->
      <div id="page1">
        <h2><g:message code="property.form" />
          <span><g:message code="dhr.step.familyReferent.label" /></span>
        </h2>
        <div class="yui-g">
          
          
          <!-- column start -->
          <div class="yui-u first">
            
              
              <h3><g:message code="dhr.property.dhrFamilyReferent.label" /></h3>
              <dl class="required">
                
                  <dt class="required condition-haveFamilyReferent-trigger">${message(code:'dhr.property.dhrHaveFamilyReferent.label')} * :</dt><dd id="dhrHaveFamilyReferent" class="action-editField validate-boolean required-true i18n-dhr.property.dhrHaveFamilyReferent" ><span class="value-${rqt.dhrFamilyReferent?.dhrHaveFamilyReferent}"><g:message code="message.${rqt.dhrFamilyReferent?.dhrHaveFamilyReferent ? 'yes' : 'no'}" /></span></dd>
                
                  <dt class="required condition-haveFamilyReferent-filled">${message(code:'dhr.property.dhrReferentName.label')} * :</dt><dd id="dhrReferentName" class="action-editField validate-lastName required-true i18n-dhr.property.dhrReferentName maxLength-38" ><span>${rqt.dhrFamilyReferent?.dhrReferentName}</span></dd>
                
                  <dt class="required condition-haveFamilyReferent-filled">${message(code:'dhr.property.dhrReferentFirstName.label')} * :</dt><dd id="dhrReferentFirstName" class="action-editField validate-firstName required-true i18n-dhr.property.dhrReferentFirstName maxLength-38" ><span>${rqt.dhrFamilyReferent?.dhrReferentFirstName}</span></dd>
                
                  <dt class="required condition-haveFamilyReferent-filled">${message(code:'dhr.property.dhrReferentAddress.label')} * :</dt><dd id="dhrReferentAddress" class="action-editField validate-address required-true i18n-dhr.property.dhrReferentAddress" ><div><p class="additionalDeliveryInformation">${rqt.dhrFamilyReferent?.dhrReferentAddress?.additionalDeliveryInformation}</p><p class="additionalGeographicalInformation">${rqt.dhrFamilyReferent?.dhrReferentAddress?.additionalGeographicalInformation}</p><span class="streetNumber">${rqt.dhrFamilyReferent?.dhrReferentAddress?.streetNumber}</span> <span class="streetName">${rqt.dhrFamilyReferent?.dhrReferentAddress?.streetName}</span><g:if test="${!!rqt.dhrFamilyReferent?.dhrReferentAddress?.streetMatriculation}"><br /><em><g:message code="address.property.streetMatriculation" /></em><span class="streetMatriculation">${rqt.dhrFamilyReferent?.dhrReferentAddress?.streetMatriculation}</span></g:if><g:if test="${!!rqt.dhrFamilyReferent?.dhrReferentAddress?.streetRivoliCode}"><br /><em><g:message code="address.property.streetRivoliCode" /></em><span class="streetRivoliCode">${rqt.dhrFamilyReferent?.dhrReferentAddress?.streetRivoliCode}</span></g:if><p class="placeNameOrService">${rqt.dhrFamilyReferent?.dhrReferentAddress?.placeNameOrService}</p><span class="postalCode">${rqt.dhrFamilyReferent?.dhrReferentAddress?.postalCode}</span> <span class="city">${rqt.dhrFamilyReferent?.dhrReferentAddress?.city}</span><p class="countryName">${rqt.dhrFamilyReferent?.dhrReferentAddress?.countryName}</p><g:if test="${!!rqt.dhrFamilyReferent?.dhrReferentAddress?.cityInseeCode}"><em><g:message code="address.property.cityInseeCode" /></em><span class="cityInseeCode">${rqt.dhrFamilyReferent?.dhrReferentAddress?.cityInseeCode}</span></g:if></div></dd>
                
              </dl>
              
            
          </div>
          <!-- column end -->
          
          <!-- column start -->
          <div class="yui-u">
            
          </div>
          <!-- column end -->
          
        </div>
        <!-- data step  end -->
      </div>
      <!-- step end -->
      
      <!-- step start -->
      <div id="page2">
        <h2><g:message code="property.form" />
          <span><g:message code="dhr.step.spouse.label" /></span>
        </h2>
        <div class="yui-g">
          
          
          <!-- column start -->
          <div class="yui-u first">
            
              
              <h3><g:message code="dhr.property.dhrSpouse.label" /></h3>
              <dl class="required condition-isCoupleRequest-filled">
                
                  <dt class="required condition-isSpouseMadam-trigger">${message(code:'dhr.property.dhrSpouseTitle.label')} * :</dt><dd id="dhrSpouseTitle" class="action-editField validate-capdematEnum required-true i18n-dhr.property.dhrSpouseTitle javatype-fr.cg95.cvq.business.users.TitleType" ><g:capdematEnumToField var="${rqt.dhrSpouse?.dhrSpouseTitle}" i18nKeyPrefix="dhr.property.dhrSpouseTitle" /></dd>
                
                  <dt class="required">${message(code:'dhr.property.dhrSpouseFamilyStatus.label')} * :</dt><dd id="dhrSpouseFamilyStatus" class="action-editField validate-capdematEnum required-true i18n-dhr.property.dhrSpouseFamilyStatus javatype-fr.cg95.cvq.business.users.FamilyStatusType" ><g:capdematEnumToField var="${rqt.dhrSpouse?.dhrSpouseFamilyStatus}" i18nKeyPrefix="dhr.property.dhrSpouseFamilyStatus" /></dd>
                
                  <dt class="required">${message(code:'dhr.property.dhrSpouseName.label')} * :</dt><dd id="dhrSpouseName" class="action-editField validate-lastName required-true i18n-dhr.property.dhrSpouseName maxLength-38" ><span>${rqt.dhrSpouse?.dhrSpouseName}</span></dd>
                
                  <dt class="required">${message(code:'dhr.property.dhrSpouseFirstName.label')} * :</dt><dd id="dhrSpouseFirstName" class="action-editField validate-firstName required-true i18n-dhr.property.dhrSpouseFirstName maxLength-38" ><span>${rqt.dhrSpouse?.dhrSpouseFirstName}</span></dd>
                
                  <dt class="required condition-isSpouseMadam-filled">${message(code:'dhr.property.dhrSpouseMaidenName.label')} * :</dt><dd id="dhrSpouseMaidenName" class="action-editField validate-lastName required-true i18n-dhr.property.dhrSpouseMaidenName maxLength-38" ><span>${rqt.dhrSpouse?.dhrSpouseMaidenName}</span></dd>
                
                  <dt class="required">${message(code:'dhr.property.dhrSpouseBirthDate.label')} * :</dt><dd id="dhrSpouseBirthDate" class="action-editField validate-date required-true i18n-dhr.property.dhrSpouseBirthDate" ><span><g:formatDate formatName="format.date" date="${rqt.dhrSpouse?.dhrSpouseBirthDate}"/></span></dd>
                
                  <dt class="required">${message(code:'dhr.property.dhrSpouseBirthPlace.label')} * :</dt><dd id="dhrSpouseBirthPlace" class="action-editField validate-string required-true i18n-dhr.property.dhrSpouseBirthPlace" ><span>${rqt.dhrSpouse?.dhrSpouseBirthPlace}</span></dd>
                
                  <dt class="required condition-isSpouseNonEuropean-trigger">${message(code:'dhr.property.dhrSpouseNationality.label')} * :</dt><dd id="dhrSpouseNationality" class="action-editField validate-capdematEnum required-true i18n-dhr.property.dhrSpouseNationality javatype-fr.cg95.cvq.business.users.NationalityType maxLength-32" ><g:capdematEnumToField var="${rqt.dhrSpouse?.dhrSpouseNationality}" i18nKeyPrefix="dhr.property.dhrSpouseNationality" /></dd>
                
                  <dt class="required condition-isSpouseNonEuropean-filled">${message(code:'dhr.property.dhrSpouseFranceArrivalDate.label')} * :</dt><dd id="dhrSpouseFranceArrivalDate" class="action-editField validate-date required-true i18n-dhr.property.dhrSpouseFranceArrivalDate" ><span><g:formatDate formatName="format.date" date="${rqt.dhrSpouse?.dhrSpouseFranceArrivalDate}"/></span></dd>
                
                  <dt class="required condition-isSpouseNonEuropean-filled">${message(code:'dhr.property.dhrSpouseIsFrenchResident.label')} * :</dt><dd id="dhrSpouseIsFrenchResident" class="action-editField validate-boolean required-true i18n-dhr.property.dhrSpouseIsFrenchResident" ><span class="value-${rqt.dhrSpouse?.dhrSpouseIsFrenchResident}"><g:message code="message.${rqt.dhrSpouse?.dhrSpouseIsFrenchResident ? 'yes' : 'no'}" /></span></dd>
                
              </dl>
              
            
              
              <h3><g:message code="dhr.property.dhrSpouseStatus.label" /></h3>
              <dl class="required condition-isCoupleRequest-filled">
                
                  <dt class="required condition-isSpouseRetired-trigger">${message(code:'dhr.property.dhrIsSpouseRetired.label')} * :</dt><dd id="dhrIsSpouseRetired" class="action-editField validate-boolean required-true i18n-dhr.property.dhrIsSpouseRetired" ><span class="value-${rqt.dhrSpouseStatus?.dhrIsSpouseRetired}"><g:message code="message.${rqt.dhrSpouseStatus?.dhrIsSpouseRetired ? 'yes' : 'no'}" /></span></dd>
                
                  <dt class="required condition-isSpouseRetired-filled condition-isSpouseOtherPensionPlan-trigger">${message(code:'dhr.property.dhrSpousePrincipalPensionPlan.label')} * :</dt><dd id="dhrSpousePrincipalPensionPlan" class="action-editField validate-capdematEnum required-true i18n-dhr.property.dhrSpousePrincipalPensionPlan javatype-fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType" ><g:capdematEnumToField var="${rqt.dhrSpouseStatus?.dhrSpousePrincipalPensionPlan}" i18nKeyPrefix="dhr.property.dhrSpousePrincipalPensionPlan" /></dd>
                
                  <dt class="required condition-isSpouseOtherPensionPlan-filled">${message(code:'dhr.property.dhrSpousePensionPlanDetail.label')} * :</dt><dd id="dhrSpousePensionPlanDetail" class="action-editField validate-string required-true i18n-dhr.property.dhrSpousePensionPlanDetail" ><span>${rqt.dhrSpouseStatus?.dhrSpousePensionPlanDetail}</span></dd>
                
                  <dt class="required condition-isSpouseRetired-filled">${message(code:'dhr.property.dhrSpouseComplementaryPensionPlan.label')} * :</dt><dd id="dhrSpouseComplementaryPensionPlan" class="action-editField validate-string required-true i18n-dhr.property.dhrSpouseComplementaryPensionPlan" ><span>${rqt.dhrSpouseStatus?.dhrSpouseComplementaryPensionPlan}</span></dd>
                
                  <dt class="required condition-isSpouseRetired-unfilled">${message(code:'dhr.property.dhrSpouseProfession.label')} * :</dt><dd id="dhrSpouseProfession" class="action-editField validate-string required-true i18n-dhr.property.dhrSpouseProfession" ><span>${rqt.dhrSpouseStatus?.dhrSpouseProfession}</span></dd>
                
                  <dt class="required condition-isSpouseRetired-unfilled">${message(code:'dhr.property.dhrSpouseEmployer.label')} * :</dt><dd id="dhrSpouseEmployer" class="action-editField validate-string required-true i18n-dhr.property.dhrSpouseEmployer" ><span>${rqt.dhrSpouseStatus?.dhrSpouseEmployer}</span></dd>
                
                  <dt class="required condition-isSpouseRetired-unfilled">${message(code:'dhr.property.dhrSpouseAddress.label')} * :</dt><dd id="dhrSpouseAddress" class="action-editField validate-address required-true i18n-dhr.property.dhrSpouseAddress" ><div><p class="additionalDeliveryInformation">${rqt.dhrSpouseStatus?.dhrSpouseAddress?.additionalDeliveryInformation}</p><p class="additionalGeographicalInformation">${rqt.dhrSpouseStatus?.dhrSpouseAddress?.additionalGeographicalInformation}</p><span class="streetNumber">${rqt.dhrSpouseStatus?.dhrSpouseAddress?.streetNumber}</span> <span class="streetName">${rqt.dhrSpouseStatus?.dhrSpouseAddress?.streetName}</span><g:if test="${!!rqt.dhrSpouseStatus?.dhrSpouseAddress?.streetMatriculation}"><br /><em><g:message code="address.property.streetMatriculation" /></em><span class="streetMatriculation">${rqt.dhrSpouseStatus?.dhrSpouseAddress?.streetMatriculation}</span></g:if><g:if test="${!!rqt.dhrSpouseStatus?.dhrSpouseAddress?.streetRivoliCode}"><br /><em><g:message code="address.property.streetRivoliCode" /></em><span class="streetRivoliCode">${rqt.dhrSpouseStatus?.dhrSpouseAddress?.streetRivoliCode}</span></g:if><p class="placeNameOrService">${rqt.dhrSpouseStatus?.dhrSpouseAddress?.placeNameOrService}</p><span class="postalCode">${rqt.dhrSpouseStatus?.dhrSpouseAddress?.postalCode}</span> <span class="city">${rqt.dhrSpouseStatus?.dhrSpouseAddress?.city}</span><p class="countryName">${rqt.dhrSpouseStatus?.dhrSpouseAddress?.countryName}</p><g:if test="${!!rqt.dhrSpouseStatus?.dhrSpouseAddress?.cityInseeCode}"><em><g:message code="address.property.cityInseeCode" /></em><span class="cityInseeCode">${rqt.dhrSpouseStatus?.dhrSpouseAddress?.cityInseeCode}</span></g:if></div></dd>
                
              </dl>
              
            
          </div>
          <!-- column end -->
          
          <!-- column start -->
          <div class="yui-u">
            
              
              <h3><g:message code="dhr.property.dhrSpouseIncomes.label" /></h3>
              <dl class="condition-isCoupleRequest-filled">
                
                  <dt class="">${message(code:'dhr.property.pensions.label')} :</dt><dd id="pensions" class="action-editField validate-positiveInteger i18n-dhr.property.pensions" ><span>${rqt.dhrSpouseIncomes?.pensions}</span></dd>
                
                  <dt class="">${message(code:'dhr.property.dhrAllowances.label')} :</dt><dd id="dhrAllowances" class="action-editField validate-positiveInteger i18n-dhr.property.dhrAllowances" ><span>${rqt.dhrSpouseIncomes?.dhrAllowances}</span></dd>
                
                  <dt class="">${message(code:'dhr.property.dhrFurnitureInvestmentIncome.label')} :</dt><dd id="dhrFurnitureInvestmentIncome" class="action-editField validate-positiveInteger i18n-dhr.property.dhrFurnitureInvestmentIncome" ><span>${rqt.dhrSpouseIncomes?.dhrFurnitureInvestmentIncome}</span></dd>
                
                  <dt class="">${message(code:'dhr.property.dhrRealEstateInvestmentIncome.label')} :</dt><dd id="dhrRealEstateInvestmentIncome" class="action-editField validate-positiveInteger i18n-dhr.property.dhrRealEstateInvestmentIncome" ><span>${rqt.dhrSpouseIncomes?.dhrRealEstateInvestmentIncome}</span></dd>
                
                  <dt class="">${message(code:'dhr.property.dhrNetIncome.label')} :</dt><dd id="dhrNetIncome" class="action-editField validate-positiveInteger i18n-dhr.property.dhrNetIncome" ><span>${rqt.dhrSpouseIncomes?.dhrNetIncome}</span></dd>
                
                  <dt class="">${message(code:'dhr.property.dhrIncomesAnnualTotal.label')} :</dt><dd id="dhrIncomesAnnualTotal" class="action-editField validate-positiveInteger i18n-dhr.property.dhrIncomesAnnualTotal" ><span>${rqt.dhrSpouseIncomes?.dhrIncomesAnnualTotal}</span></dd>
                
              </dl>
              
            
          </div>
          <!-- column end -->
          
        </div>
        <!-- data step  end -->
      </div>
      <!-- step end -->
      
      <!-- step start -->
      <div id="page3">
        <h2><g:message code="property.form" />
          <span><g:message code="dhr.step.dwelling.label" /></span>
        </h2>
        <div class="yui-g">
          
          
          <!-- column start -->
          <div class="yui-u first">
            
              
              <h3><g:message code="dhr.property.dhrCurrentDwelling.label" /></h3>
              <dl class="required">
                
                  <dt class="required">${message(code:'dhr.property.dhrCurrentDwellingAddress.label')} * :</dt><dd id="dhrCurrentDwellingAddress" class="action-editField validate-address required-true i18n-dhr.property.dhrCurrentDwellingAddress" ><div><p class="additionalDeliveryInformation">${rqt.dhrCurrentDwelling?.dhrCurrentDwellingAddress?.additionalDeliveryInformation}</p><p class="additionalGeographicalInformation">${rqt.dhrCurrentDwelling?.dhrCurrentDwellingAddress?.additionalGeographicalInformation}</p><span class="streetNumber">${rqt.dhrCurrentDwelling?.dhrCurrentDwellingAddress?.streetNumber}</span> <span class="streetName">${rqt.dhrCurrentDwelling?.dhrCurrentDwellingAddress?.streetName}</span><g:if test="${!!rqt.dhrCurrentDwelling?.dhrCurrentDwellingAddress?.streetMatriculation}"><br /><em><g:message code="address.property.streetMatriculation" /></em><span class="streetMatriculation">${rqt.dhrCurrentDwelling?.dhrCurrentDwellingAddress?.streetMatriculation}</span></g:if><g:if test="${!!rqt.dhrCurrentDwelling?.dhrCurrentDwellingAddress?.streetRivoliCode}"><br /><em><g:message code="address.property.streetRivoliCode" /></em><span class="streetRivoliCode">${rqt.dhrCurrentDwelling?.dhrCurrentDwellingAddress?.streetRivoliCode}</span></g:if><p class="placeNameOrService">${rqt.dhrCurrentDwelling?.dhrCurrentDwellingAddress?.placeNameOrService}</p><span class="postalCode">${rqt.dhrCurrentDwelling?.dhrCurrentDwellingAddress?.postalCode}</span> <span class="city">${rqt.dhrCurrentDwelling?.dhrCurrentDwellingAddress?.city}</span><p class="countryName">${rqt.dhrCurrentDwelling?.dhrCurrentDwellingAddress?.countryName}</p><g:if test="${!!rqt.dhrCurrentDwelling?.dhrCurrentDwellingAddress?.cityInseeCode}"><em><g:message code="address.property.cityInseeCode" /></em><span class="cityInseeCode">${rqt.dhrCurrentDwelling?.dhrCurrentDwellingAddress?.cityInseeCode}</span></g:if></div></dd>
                
                  <dt class="">${message(code:'dhr.property.dhrCurrentDwellingPhone.label')} :</dt><dd id="dhrCurrentDwellingPhone" class="action-editField validate-phone i18n-dhr.property.dhrCurrentDwellingPhone maxLength-10" ><span>${rqt.dhrCurrentDwelling?.dhrCurrentDwellingPhone}</span></dd>
                
                  <dt class="required condition-isCurrentDwellingPlaceOfResidence-trigger">${message(code:'dhr.property.dhrCurrentDwellingKind.label')} * :</dt><dd id="dhrCurrentDwellingKind" class="action-editField validate-capdematEnum required-true i18n-dhr.property.dhrCurrentDwellingKind javatype-fr.cg95.cvq.business.request.social.DhrDwellingKindType" ><g:capdematEnumToField var="${rqt.dhrCurrentDwelling?.dhrCurrentDwellingKind}" i18nKeyPrefix="dhr.property.dhrCurrentDwellingKind" /></dd>
                
                  <dt class="required condition-isCurrentDwellingPlaceOfResidence-filled">${message(code:'dhr.property.dhrCurrentDwellingArrivalDate.label')} * :</dt><dd id="dhrCurrentDwellingArrivalDate" class="action-editField validate-date required-true i18n-dhr.property.dhrCurrentDwellingArrivalDate" ><span><g:formatDate formatName="format.date" date="${rqt.dhrCurrentDwelling?.dhrCurrentDwellingArrivalDate}"/></span></dd>
                
                  <dt class="required condition-isCurrentDwellingPlaceOfResidence-filled">${message(code:'dhr.property.dhrCurrentDwellingStatus.label')} * :</dt><dd id="dhrCurrentDwellingStatus" class="action-editField validate-capdematEnum required-true i18n-dhr.property.dhrCurrentDwellingStatus javatype-fr.cg95.cvq.business.request.social.DhrDwellingStatusType" ><g:capdematEnumToField var="${rqt.dhrCurrentDwelling?.dhrCurrentDwellingStatus}" i18nKeyPrefix="dhr.property.dhrCurrentDwellingStatus" /></dd>
                
                  <dt class="required condition-isCurrentDwellingPlaceOfResidence-filled">${message(code:'dhr.property.dhrCurrentDwellingNumberOfRoom.label')} * :</dt><dd id="dhrCurrentDwellingNumberOfRoom" class="action-editField validate-dhrDwellingNumberOfRoom required-true i18n-dhr.property.dhrCurrentDwellingNumberOfRoom" ><span>${rqt.dhrCurrentDwelling?.dhrCurrentDwellingNumberOfRoom}</span></dd>
                
                  <dt class="required condition-isCurrentDwellingPlaceOfResidence-filled">${message(code:'dhr.property.dhrCurrentDwellingNetArea.label')} * :</dt><dd id="dhrCurrentDwellingNetArea" class="action-editField validate-regex required-true i18n-dhr.property.dhrCurrentDwellingNetArea" regex="^[1-9]$|^[1-9][0-9]$|^[1-4][0-9][0-9]$|^500$"><span>${rqt.dhrCurrentDwelling?.dhrCurrentDwellingNetArea}</span></dd>
                
              </dl>
              
            
          </div>
          <!-- column end -->
          
          <!-- column start -->
          <div class="yui-u">
            
              
              <div id="widget-dhrPreviousDwelling" class="required">
                <g:render template="/backofficeRequestInstruction/requestType/domesticHelpRequest/dhrPreviousDwelling" model="['rqt':rqt]" />
              </div>
              
            
          </div>
          <!-- column end -->
          
        </div>
        <!-- data step  end -->
      </div>
      <!-- step end -->
      
      <!-- step start -->
      <div id="page4">
        <h2><g:message code="property.form" />
          <span><g:message code="dhr.step.resources.label" /></span>
        </h2>
        <div class="yui-g">
          
          
          <!-- column start -->
          <div class="yui-u first">
            
              
              <h3><g:message code="dhr.property.dhrRequesterIncomes.label" /></h3>
              <dl class="required">
                
                  <dt class="">${message(code:'dhr.property.pensions.label')} :</dt><dd id="pensions" class="action-editField validate-positiveInteger i18n-dhr.property.pensions" ><span>${rqt.dhrRequesterIncomes?.pensions}</span></dd>
                
                  <dt class="">${message(code:'dhr.property.dhrAllowances.label')} :</dt><dd id="dhrAllowances" class="action-editField validate-positiveInteger i18n-dhr.property.dhrAllowances" ><span>${rqt.dhrRequesterIncomes?.dhrAllowances}</span></dd>
                
                  <dt class="">${message(code:'dhr.property.dhrFurnitureInvestmentIncome.label')} :</dt><dd id="dhrFurnitureInvestmentIncome" class="action-editField validate-positiveInteger i18n-dhr.property.dhrFurnitureInvestmentIncome" ><span>${rqt.dhrRequesterIncomes?.dhrFurnitureInvestmentIncome}</span></dd>
                
                  <dt class="">${message(code:'dhr.property.dhrRealEstateInvestmentIncome.label')} :</dt><dd id="dhrRealEstateInvestmentIncome" class="action-editField validate-positiveInteger i18n-dhr.property.dhrRealEstateInvestmentIncome" ><span>${rqt.dhrRequesterIncomes?.dhrRealEstateInvestmentIncome}</span></dd>
                
                  <dt class="">${message(code:'dhr.property.dhrNetIncome.label')} :</dt><dd id="dhrNetIncome" class="action-editField validate-positiveInteger i18n-dhr.property.dhrNetIncome" ><span>${rqt.dhrRequesterIncomes?.dhrNetIncome}</span></dd>
                
                  <dt class="">${message(code:'dhr.property.dhrIncomesAnnualTotal.label')} :</dt><dd id="dhrIncomesAnnualTotal" class="action-editField validate-positiveInteger i18n-dhr.property.dhrIncomesAnnualTotal" ><span>${rqt.dhrRequesterIncomes?.dhrIncomesAnnualTotal}</span></dd>
                
              </dl>
              
            
          </div>
          <!-- column end -->
          
          <!-- column start -->
          <div class="yui-u">
            
              
              <div id="widget-dhrRealAsset" class="required">
                <g:render template="/backofficeRequestInstruction/requestType/domesticHelpRequest/dhrRealAsset" model="['rqt':rqt]" />
              </div>
              
            
              
              <div id="widget-dhrNotRealAsset" class="required">
                <g:render template="/backofficeRequestInstruction/requestType/domesticHelpRequest/dhrNotRealAsset" model="['rqt':rqt]" />
              </div>
              
            
          </div>
          <!-- column end -->
          
        </div>
        <!-- data step  end -->
      </div>
      <!-- step end -->
      
      <!-- step start -->
      <div id="page5">
        <h2><g:message code="property.form" />
          <span><g:message code="dhr.step.taxes.label" /></span>
        </h2>
        <div class="yui-g">
          
          
          <!-- column start -->
          <div class="yui-u first">
            
              
              <h3><g:message code="dhr.property.dhrTaxesAmount.label" /></h3>
              <dl class="">
                
                  <dt class="">${message(code:'dhr.property.dhrIncomeTax.label')} :</dt><dd id="dhrIncomeTax" class="action-editField validate-positiveInteger i18n-dhr.property.dhrIncomeTax" ><span>${rqt.dhrTaxesAmount?.dhrIncomeTax}</span></dd>
                
                  <dt class="">${message(code:'dhr.property.localRate.label')} :</dt><dd id="localRate" class="action-editField validate-positiveInteger i18n-dhr.property.localRate" ><span>${rqt.dhrTaxesAmount?.localRate}</span></dd>
                
                  <dt class="">${message(code:'dhr.property.propertyTaxes.label')} :</dt><dd id="propertyTaxes" class="action-editField validate-positiveInteger i18n-dhr.property.propertyTaxes" ><span>${rqt.dhrTaxesAmount?.propertyTaxes}</span></dd>
                
                  <dt class="">${message(code:'dhr.property.professionalTaxes.label')} :</dt><dd id="professionalTaxes" class="action-editField validate-positiveInteger i18n-dhr.property.professionalTaxes" ><span>${rqt.dhrTaxesAmount?.professionalTaxes}</span></dd>
                
              </dl>
              
            
          </div>
          <!-- column end -->
          
          <!-- column start -->
          <div class="yui-u">
            
          </div>
          <!-- column end -->
          
        </div>
        <!-- data step  end -->
      </div>
      <!-- step end -->
      
    
    
  </div>
  
</div>
