


  
    <label class="required"><g:message code="dhr.property.dhrRequestKind.label" /> *  <span><g:message code="dhr.property.dhrRequestKind.help" /></span></label>
            <ul class="required ${rqt.stepStates['spouse'].invalidFields.contains('dhrRequestKind') ? 'validation-failed' : ''}">
              <g:each in="${['INDIVIDUAL','COUPLE']}">
              <li>
                <input type="radio" id="dhrRequestKind_${it}" class="required condition-isCoupleRequest-trigger  validate-one-required" value="fr.cg95.cvq.business.request.social.DhrRequestKindType_${it}" name="dhrRequestKind" ${it == rqt.dhrRequestKind.toString() ? 'checked="checked"': ''} title="<g:message code="dhr.property.dhrRequestKind.validationError" />" />
                <label for="dhrRequestKind_${it}"><g:capdematEnumToText var="${it}" i18nKeyPrefix="dhr.property.dhrRequestKind" /></label>
                <input type="radio" id="dhrSpouse.dhrRequestKind_${it}" class="required condition-isCoupleRequest-trigger  validate-one-required" value="fr.cg95.cvq.business.request.social.DhrRequestKindType_${it}" name="dhrSpouse.dhrRequestKind" ${it == rqt.dhrSpouse?.dhrRequestKind.toString() ? 'checked="checked"': ''} title="<g:message code="dhr.property.dhrRequestKind.validationError" />" />
                <label for="dhrSpouse.dhrRequestKind_${it}"><g:capdematEnumToText var="${it}" i18nKeyPrefix="dhr.property.dhrRequestKind" /></label>
                <input type="radio" id="dhrRequestKind_${it}" class="required condition-isCoupleRequest-trigger  validate-one-required" value="${it}" name="dhrRequestKind" ${it == rqt.dhrRequestKind.toString() ? 'checked="checked"': ''} title="<g:message code="dhr.property.dhrRequestKind.validationError" />" />
                <label for="dhrRequestKind_${it}"><g:capdematEnumToText var="${it}" i18nKeyPrefix="dhr.property.dhrRequestKind" /></label>
                <input type="radio" id="dhrSpouse.dhrRequestKind_${it}" class="required condition-isCoupleRequest-trigger  validate-one-required" value="fr.cg95.cvq.business.request.social.DhrRequestKindType_${it}" name="dhrSpouse.dhrRequestKind" ${it == rqt.dhrSpouse?.dhrRequestKind.toString() ? 'checked="checked"': ''} title="<g:message code="dhr.property.dhrRequestKind.validationError" />" />
                <label for="dhrSpouse.dhrRequestKind_${it}"><g:capdematEnumToText var="${it}" i18nKeyPrefix="dhr.property.dhrRequestKind" /></label>
              </li>
              </g:each>
            </ul>
            

  

  
    <fieldset class="required condition-isCoupleRequest-filled">
    <legend><g:message code="dhr.property.dhrSpouse.label" /></legend>
    
      <label for="dhrSpouse.dhrSpouseTitle" class="required"><g:message code="dhr.property.dhrSpouseTitle.label" /> *  <span><g:message code="dhr.property.dhrSpouseTitle.help" /></span></label>
            <select id="dhrSpouse.dhrSpouseTitle" name="dhrSpouse.dhrSpouseTitle" class="required condition-isSpouseMadam-trigger  validate-not-first ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouse.dhrSpouseTitle') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrSpouseTitle.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['Mister','Madam','Miss','Agency','Unknown']}">
                <option value="fr.cg95.cvq.business.users.TitleType_${it}" ${it == rqt.dhrSpouseTitle?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dhr.property.dhrSpouseTitle" /></option>
              <g:each in="${['MISTER','MADAM','MISS','AGENCY','UNKNOWN']}">
                <option value="${it}" ${it == rqt.dhrSpouseTitle?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dhr.property.dhrSpouseTitle" /></option>
              <g:each in="${['Mister','Madam','Miss','Agency','Unknown']}">
                <option value="fr.cg95.cvq.business.users.TitleType_${it}" ${it == rqt.dhrSpouse?.dhrSpouseTitle?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dhr.property.dhrSpouseTitle" /></option>
              </g:each>
            </select>
            

    
      <label for="dhrSpouse.dhrSpouseFamilyStatus" class="required"><g:message code="dhr.property.dhrSpouseFamilyStatus.label" /> *  <span><g:message code="dhr.property.dhrSpouseFamilyStatus.help" /></span></label>
            <select id="dhrSpouse.dhrSpouseFamilyStatus" name="dhrSpouse.dhrSpouseFamilyStatus" class="required  validate-not-first ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouse.dhrSpouseFamilyStatus') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrSpouseFamilyStatus.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['Married','Single','Divorced','Widow','CommonLawMarriage','PACS','Other']}">
                <option value="fr.cg95.cvq.business.users.FamilyStatusType_${it}" ${it == rqt.dhrSpouseFamilyStatus?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dhr.property.dhrSpouseFamilyStatus" /></option>
              <g:each in="${['MARRIED','SINGLE','DIVORCED','WIDOW','COMMON_LAW_MARRIAGE','SEPARATED','P_A_C_S','OTHER']}">
                <option value="${it}" ${it == rqt.dhrSpouseFamilyStatus?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dhr.property.dhrSpouseFamilyStatus" /></option>
              <g:each in="${['Married','Single','Divorced','Widow','CommonLawMarriage','PACS','Other']}">
                <option value="fr.cg95.cvq.business.users.FamilyStatusType_${it}" ${it == rqt.dhrSpouse?.dhrSpouseFamilyStatus?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dhr.property.dhrSpouseFamilyStatus" /></option>
              </g:each>
            </select>
            

    
      <label for="dhrSpouse.dhrSpouseName" class="required"><g:message code="dhr.property.dhrSpouseName.label" /> *  <span><g:message code="dhr.property.dhrSpouseName.help" /></span></label>
            <input type="text" id="dhrSpouse.dhrSpouseName" name="dhrSpouse.dhrSpouseName" value="${rqt.dhrSpouse?.dhrSpouseName?.toString()}" 
                    class="required  validate-lastName ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouse.dhrSpouseName') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrSpouseName.validationError" />"  maxlength="38" />
            

    
      <label for="dhrSpouse.dhrSpouseFirstName" class="required"><g:message code="dhr.property.dhrSpouseFirstName.label" /> *  <span><g:message code="dhr.property.dhrSpouseFirstName.help" /></span></label>
            <input type="text" id="dhrSpouse.dhrSpouseFirstName" name="dhrSpouse.dhrSpouseFirstName" value="${rqt.dhrSpouse?.dhrSpouseFirstName?.toString()}" 
                    class="required  validate-firstName ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouse.dhrSpouseFirstName') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrSpouseFirstName.validationError" />"  maxlength="38" />
            

    
      <label for="dhrSpouse.dhrSpouseMaidenName" class="required condition-isSpouseMadam-filled"><g:message code="dhr.property.dhrSpouseMaidenName.label" /> *  <span><g:message code="dhr.property.dhrSpouseMaidenName.help" /></span></label>
            <input type="text" id="dhrSpouse.dhrSpouseMaidenName" name="dhrSpouse.dhrSpouseMaidenName" value="${rqt.dhrSpouse?.dhrSpouseMaidenName?.toString()}" 
                    class="required condition-isSpouseMadam-filled  validate-lastName ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouse.dhrSpouseMaidenName') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrSpouseMaidenName.validationError" />"  maxlength="38" />
            

    
      <label class="required"><g:message code="dhr.property.dhrSpouseBirthDate.label" /> *  <span><g:message code="dhr.property.dhrSpouseBirthDate.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouse.dhrSpouseBirthDate') ? 'validation-failed' : ''}"
                id="dhrSpouse.dhrSpouseBirthDate_day"
                name="dhrSpouse.dhrSpouseBirthDate_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.dhrSpouse?.dhrSpouseBirthDate?.date == it
                      || (rqt.dhrSpouse?.dhrSpouseBirthDate == null && params['dhrSpouse.dhrSpouseBirthDate_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouse.dhrSpouseBirthDate') ? 'validation-failed' : ''}"
                id="dhrSpouse.dhrSpouseBirthDate_month"
                name="dhrSpouse.dhrSpouseBirthDate_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.dhrSpouse?.dhrSpouseBirthDate?.month == (it - 1)
                      || (rqt.dhrSpouse?.dhrSpouseBirthDate == null && params['dhrSpouse.dhrSpouseBirthDate_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouse.dhrSpouseBirthDate') ? 'validation-failed' : ''}"
                id="dhrSpouse.dhrSpouseBirthDate_year"
                name="dhrSpouse.dhrSpouseBirthDate_year"
                value="${rqt.dhrSpouse?.dhrSpouseBirthDate ? rqt.dhrSpouse?.dhrSpouseBirthDate.year + 1900 : params['dhrSpouse.dhrSpouseBirthDate_year']}"
                title="<g:message code="dhr.property.dhrSpouseBirthDate.validationError" />" />
            </div>
            

    
      <label for="dhrSpouse.dhrSpouseBirthPlace" class="required"><g:message code="dhr.property.dhrSpouseBirthPlace.label" /> *  <span><g:message code="dhr.property.dhrSpouseBirthPlace.help" /></span></label>
            <input type="text" id="dhrSpouse.dhrSpouseBirthPlace" name="dhrSpouse.dhrSpouseBirthPlace" value="${rqt.dhrSpouse?.dhrSpouseBirthPlace?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouse.dhrSpouseBirthPlace') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrSpouseBirthPlace.validationError" />"   />
            

    
      <label for="dhrSpouse.dhrSpouseNationality" class="required"><g:message code="dhr.property.dhrSpouseNationality.label" /> *  <span><g:message code="dhr.property.dhrSpouseNationality.help" /></span></label>
            <select id="dhrSpouse.dhrSpouseNationality" name="dhrSpouse.dhrSpouseNationality" class="required condition-isSpouseNonEuropean-trigger  validate-not-first ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouse.dhrSpouseNationality') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrSpouseNationality.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['French','EuropeanUnion','OutsideEuropeanUnion']}">
                <option value="fr.cg95.cvq.business.users.NationalityType_${it}" ${it == rqt.dhrSpouseNationality?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dhr.property.dhrSpouseNationality" /></option>
              <g:each in="${['FRENCH','EUROPEAN_UNION','OUTSIDE_EUROPEAN_UNION']}">
                <option value="${it}" ${it == rqt.dhrSpouseNationality?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dhr.property.dhrSpouseNationality" /></option>
              <g:each in="${['French','EuropeanUnion','OutsideEuropeanUnion']}">
                <option value="fr.cg95.cvq.business.users.NationalityType_${it}" ${it == rqt.dhrSpouse?.dhrSpouseNationality?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dhr.property.dhrSpouseNationality" /></option>
              </g:each>
            </select>
            

    
      <label class="required condition-isSpouseNonEuropean-filled"><g:message code="dhr.property.dhrSpouseFranceArrivalDate.label" /> *  <span><g:message code="dhr.property.dhrSpouseFranceArrivalDate.help" /></span></label>
            <div class="date required condition-isSpouseNonEuropean-filled  validate-date required condition-isSpouseNonEuropean-filled ">
              <select class="day ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouse.dhrSpouseFranceArrivalDate') ? 'validation-failed' : ''}"
                id="dhrSpouse.dhrSpouseFranceArrivalDate_day"
                name="dhrSpouse.dhrSpouseFranceArrivalDate_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.dhrSpouse?.dhrSpouseFranceArrivalDate?.date == it
                      || (rqt.dhrSpouse?.dhrSpouseFranceArrivalDate == null && params['dhrSpouse.dhrSpouseFranceArrivalDate_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouse.dhrSpouseFranceArrivalDate') ? 'validation-failed' : ''}"
                id="dhrSpouse.dhrSpouseFranceArrivalDate_month"
                name="dhrSpouse.dhrSpouseFranceArrivalDate_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.dhrSpouse?.dhrSpouseFranceArrivalDate?.month == (it - 1)
                      || (rqt.dhrSpouse?.dhrSpouseFranceArrivalDate == null && params['dhrSpouse.dhrSpouseFranceArrivalDate_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouse.dhrSpouseFranceArrivalDate') ? 'validation-failed' : ''}"
                id="dhrSpouse.dhrSpouseFranceArrivalDate_year"
                name="dhrSpouse.dhrSpouseFranceArrivalDate_year"
                value="${rqt.dhrSpouse?.dhrSpouseFranceArrivalDate ? rqt.dhrSpouse?.dhrSpouseFranceArrivalDate.year + 1900 : params['dhrSpouse.dhrSpouseFranceArrivalDate_year']}"
                title="<g:message code="dhr.property.dhrSpouseFranceArrivalDate.validationError" />" />
            </div>
            

    
      <label class="required condition-isSpouseNonEuropean-filled"><g:message code="dhr.property.dhrSpouseIsFrenchResident.label" /> *  <span><g:message code="dhr.property.dhrSpouseIsFrenchResident.help" /></span></label>
            <ul class="yes-no required condition-isSpouseNonEuropean-filled ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouse.dhrSpouseIsFrenchResident') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="dhrSpouse.dhrSpouseIsFrenchResident_${it ? 'yes' : 'no'}" class="required condition-isSpouseNonEuropean-filled  validate-one-required boolean" title="" value="${it}" name="dhrSpouse.dhrSpouseIsFrenchResident" ${it == rqt.dhrSpouse?.dhrSpouseIsFrenchResident ? 'checked="checked"': ''} />
                <label for="dhrSpouse.dhrSpouseIsFrenchResident_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
    </fieldset>
  

  
    <fieldset class="required condition-isCoupleRequest-filled">
    <legend><g:message code="dhr.property.dhrSpouseStatus.label" /></legend>
    
      <label class="required"><g:message code="dhr.property.dhrIsSpouseRetired.label" /> *  <span><g:message code="dhr.property.dhrIsSpouseRetired.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouseStatus.dhrIsSpouseRetired') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="dhrSpouseStatus.dhrIsSpouseRetired_${it ? 'yes' : 'no'}" class="required condition-isSpouseRetired-trigger  validate-one-required boolean" title="" value="${it}" name="dhrSpouseStatus.dhrIsSpouseRetired" ${it == rqt.dhrSpouseStatus?.dhrIsSpouseRetired ? 'checked="checked"': ''} />
                <label for="dhrSpouseStatus.dhrIsSpouseRetired_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label for="dhrSpouseStatus.dhrSpousePrincipalPensionPlan" class="required condition-isSpouseRetired-filled"><g:message code="dhr.property.dhrSpousePrincipalPensionPlan.label" /> *  <span><g:message code="dhr.property.dhrSpousePrincipalPensionPlan.help" /></span></label>
            <select id="dhrSpouseStatus.dhrSpousePrincipalPensionPlan" name="dhrSpouseStatus.dhrSpousePrincipalPensionPlan" class="required condition-isSpouseRetired-filled condition-isSpouseOtherPensionPlan-trigger  validate-not-first ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouseStatus.dhrSpousePrincipalPensionPlan') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrSpousePrincipalPensionPlan.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['CNAV','MSA','CRAM','MGEN','SNCF','Other']}">
                <option value="fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType_${it}" ${it == rqt.dhrSpousePrincipalPensionPlan?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dhr.property.dhrSpousePrincipalPensionPlan" /></option>
              <g:each in="${['C_N_A_V','M_S_A','C_R_A_M','M_G_E_N','S_N_C_F','OTHER']}">
                <option value="${it}" ${it == rqt.dhrSpousePrincipalPensionPlan?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dhr.property.dhrSpousePrincipalPensionPlan" /></option>
              <g:each in="${['CNAV','MSA','CRAM','MGEN','SNCF','Other']}">
                <option value="fr.cg95.cvq.business.request.social.DhrPrincipalPensionPlanType_${it}" ${it == rqt.dhrSpouseStatus?.dhrSpousePrincipalPensionPlan?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dhr.property.dhrSpousePrincipalPensionPlan" /></option>
              </g:each>
            </select>
            

    
      <label for="dhrSpouseStatus.dhrSpousePensionPlanDetail" class="required condition-isSpouseOtherPensionPlan-filled"><g:message code="dhr.property.dhrSpousePensionPlanDetail.label" /> *  <span><g:message code="dhr.property.dhrSpousePensionPlanDetail.help" /></span></label>
            <input type="text" id="dhrSpouseStatus.dhrSpousePensionPlanDetail" name="dhrSpouseStatus.dhrSpousePensionPlanDetail" value="${rqt.dhrSpouseStatus?.dhrSpousePensionPlanDetail?.toString()}" 
                    class="required condition-isSpouseOtherPensionPlan-filled  validate-string ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouseStatus.dhrSpousePensionPlanDetail') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrSpousePensionPlanDetail.validationError" />"   />
            

    
      <label for="dhrSpouseStatus.dhrSpouseComplementaryPensionPlan" class="required condition-isSpouseRetired-filled"><g:message code="dhr.property.dhrSpouseComplementaryPensionPlan.label" /> *  <span><g:message code="dhr.property.dhrSpouseComplementaryPensionPlan.help" /></span></label>
            <input type="text" id="dhrSpouseStatus.dhrSpouseComplementaryPensionPlan" name="dhrSpouseStatus.dhrSpouseComplementaryPensionPlan" value="${rqt.dhrSpouseStatus?.dhrSpouseComplementaryPensionPlan?.toString()}" 
                    class="required condition-isSpouseRetired-filled  validate-string ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouseStatus.dhrSpouseComplementaryPensionPlan') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrSpouseComplementaryPensionPlan.validationError" />"   />
            

    
      <label for="dhrSpouseStatus.dhrSpouseProfession" class="required condition-isSpouseRetired-unfilled"><g:message code="dhr.property.dhrSpouseProfession.label" /> *  <span><g:message code="dhr.property.dhrSpouseProfession.help" /></span></label>
            <input type="text" id="dhrSpouseStatus.dhrSpouseProfession" name="dhrSpouseStatus.dhrSpouseProfession" value="${rqt.dhrSpouseStatus?.dhrSpouseProfession?.toString()}" 
                    class="required condition-isSpouseRetired-unfilled  validate-string ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouseStatus.dhrSpouseProfession') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrSpouseProfession.validationError" />"   />
            

    
      <label for="dhrSpouseStatus.dhrSpouseEmployer" class="required condition-isSpouseRetired-unfilled"><g:message code="dhr.property.dhrSpouseEmployer.label" /> *  <span><g:message code="dhr.property.dhrSpouseEmployer.help" /></span></label>
            <input type="text" id="dhrSpouseStatus.dhrSpouseEmployer" name="dhrSpouseStatus.dhrSpouseEmployer" value="${rqt.dhrSpouseStatus?.dhrSpouseEmployer?.toString()}" 
                    class="required condition-isSpouseRetired-unfilled  validate-string ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouseStatus.dhrSpouseEmployer') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrSpouseEmployer.validationError" />"   />
            

    
      <label class="required condition-isSpouseRetired-unfilled"><g:message code="dhr.property.dhrSpouseAddress.label" /> *  <span><g:message code="dhr.property.dhrSpouseAddress.help" /></span></label>
            <div id="dhrSpouseStatus.dhrSpouseAddress" class="address required condition-isSpouseRetired-unfilled  ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouseStatus.dhrSpouseAddress') ? 'validation-failed' : ''}">
            <label for="dhrSpouseStatus.dhrSpouseAddress.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouseStatus.dhrSpouseAddress.additionalDeliveryInformation') ? 'validation-failed' : ''}" value="${rqt.dhrSpouseStatus?.dhrSpouseAddress?.additionalDeliveryInformation}" maxlength="38" id="dhrSpouseStatus.dhrSpouseAddress.additionalDeliveryInformation" name="dhrSpouseStatus.dhrSpouseAddress.additionalDeliveryInformation" />  
            <label for="dhrSpouseStatus.dhrSpouseAddress.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouseStatus.dhrSpouseAddress.additionalGeographicalInformation') ? 'validation-failed' : ''}" value="${rqt.dhrSpouseStatus?.dhrSpouseAddress?.additionalGeographicalInformation}" maxlength="38" id="dhrSpouseStatus.dhrSpouseAddress.additionalGeographicalInformation" name="dhrSpouseStatus.dhrSpouseAddress.additionalGeographicalInformation" />
            <label for="dhrSpouseStatus.dhrSpouseAddress_streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="dhrSpouseStatus.dhrSpouseAddress_streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1 validate-streetNumber ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouseStatus.dhrSpouseAddress.streetNumber') ? 'validation-failed' : ''}" value="${rqt.dhrSpouseStatus?.dhrSpouseAddress?.streetNumber}" size="5" maxlength="5" id="dhrSpouseStatus.dhrSpouseAddress_streetNumber" name="dhrSpouseStatus.dhrSpouseAddress.streetNumber" />
            <input type="text" class="line2 required validate-streetName ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouseStatus.dhrSpouseAddress.streetName') ? 'validation-failed' : ''}" value="${rqt.dhrSpouseStatus?.dhrSpouseAddress?.streetName}" maxlength="32" id="dhrSpouseStatus.dhrSpouseAddress_streetName" name="dhrSpouseStatus.dhrSpouseAddress.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <input type="hidden" value="${rqt.dhrSpouseStatus?.dhrSpouseAddress?.streetMatriculation}" id="dhrSpouseStatus.dhrSpouseAddress_streetMatriculation" name="dhrSpouseStatus.dhrSpouseAddress.streetMatriculation" />
            <input type="hidden" value="${rqt.dhrSpouseStatus?.dhrSpouseAddress?.streetRivoliCode}" id="dhrSpouseStatus.dhrSpouseAddress_streetRivoliCode" name="dhrSpouseStatus.dhrSpouseAddress.streetRivoliCode" />
            <label for="dhrSpouseStatus.dhrSpouseAddress.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouseStatus.dhrSpouseAddress.placeNameOrService') ? 'validation-failed' : ''}" value="${rqt.dhrSpouseStatus?.dhrSpouseAddress?.placeNameOrService}" maxlength="38" id="dhrSpouseStatus.dhrSpouseAddress.placeNameOrService" name="dhrSpouseStatus.dhrSpouseAddress.placeNameOrService" />
            <label for="dhrSpouseStatus.dhrSpouseAddress_postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="dhrSpouseStatus.dhrSpouseAddress_city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required validate-postalCode ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouseStatus.dhrSpouseAddress.postalCode') ? 'validation-failed' : ''}" value="${rqt.dhrSpouseStatus?.dhrSpouseAddress?.postalCode}" size="5" maxlength="5" id="dhrSpouseStatus.dhrSpouseAddress_postalCode" name="dhrSpouseStatus.dhrSpouseAddress.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required validate-city ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouseStatus.dhrSpouseAddress.city') ? 'validation-failed' : ''}" value="${rqt.dhrSpouseStatus?.dhrSpouseAddress?.city}" maxlength="32" id="dhrSpouseStatus.dhrSpouseAddress_city" name="dhrSpouseStatus.dhrSpouseAddress.city" title="<g:message code="address.property.city.validationError" />" />
            <input type="hidden" value="${rqt.dhrSpouseStatus?.dhrSpouseAddress?.cityInseeCode}" id="dhrSpouseStatus.dhrSpouseAddress_cityInseeCode" name="dhrSpouseStatus.dhrSpouseAddress.cityInseeCode" />
            <label for="dhrSpouseStatus.dhrSpouseAddress.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouseStatus.dhrSpouseAddress.countryName') ? 'validation-failed' : ''}" value="${rqt.dhrSpouseStatus?.dhrSpouseAddress?.countryName}" maxlength="38" id="dhrSpouseStatus.dhrSpouseAddress.countryName" name="dhrSpouseStatus.dhrSpouseAddress.countryName" />
            </div>
            

    
    </fieldset>
  

  
    <fieldset class="condition-isCoupleRequest-filled">
    <legend><g:message code="dhr.property.dhrSpouseIncomes.label" /></legend>
    
      <label for="dhrSpouseIncomes.pensions" class=""><g:message code="dhr.property.pensions.label" />   <span><g:message code="dhr.property.pensions.help" /></span></label>
            <input type="text" id="dhrSpouseIncomes.pensions" name="dhrSpouseIncomes.pensions" value="${rqt.dhrSpouseIncomes?.pensions?.toString()}" 
                    class="  validate-positiveInteger ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouseIncomes.pensions') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.pensions.validationError" />"   />
            

    
      <label for="dhrSpouseIncomes.dhrAllowances" class=""><g:message code="dhr.property.dhrAllowances.label" />   <span><g:message code="dhr.property.dhrAllowances.help" /></span></label>
            <input type="text" id="dhrSpouseIncomes.dhrAllowances" name="dhrSpouseIncomes.dhrAllowances" value="${rqt.dhrSpouseIncomes?.dhrAllowances?.toString()}" 
                    class="  validate-positiveInteger ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouseIncomes.dhrAllowances') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrAllowances.validationError" />"   />
            

    
      <label for="dhrSpouseIncomes.dhrFurnitureInvestmentIncome" class=""><g:message code="dhr.property.dhrFurnitureInvestmentIncome.label" />   <span><g:message code="dhr.property.dhrFurnitureInvestmentIncome.help" /></span></label>
            <input type="text" id="dhrSpouseIncomes.dhrFurnitureInvestmentIncome" name="dhrSpouseIncomes.dhrFurnitureInvestmentIncome" value="${rqt.dhrSpouseIncomes?.dhrFurnitureInvestmentIncome?.toString()}" 
                    class="  validate-positiveInteger ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouseIncomes.dhrFurnitureInvestmentIncome') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrFurnitureInvestmentIncome.validationError" />"   />
            

    
      <label for="dhrSpouseIncomes.dhrRealEstateInvestmentIncome" class=""><g:message code="dhr.property.dhrRealEstateInvestmentIncome.label" />   <span><g:message code="dhr.property.dhrRealEstateInvestmentIncome.help" /></span></label>
            <input type="text" id="dhrSpouseIncomes.dhrRealEstateInvestmentIncome" name="dhrSpouseIncomes.dhrRealEstateInvestmentIncome" value="${rqt.dhrSpouseIncomes?.dhrRealEstateInvestmentIncome?.toString()}" 
                    class="  validate-positiveInteger ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouseIncomes.dhrRealEstateInvestmentIncome') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrRealEstateInvestmentIncome.validationError" />"   />
            

    
      <label for="dhrSpouseIncomes.dhrNetIncome" class=""><g:message code="dhr.property.dhrNetIncome.label" />   <span><g:message code="dhr.property.dhrNetIncome.help" /></span></label>
            <input type="text" id="dhrSpouseIncomes.dhrNetIncome" name="dhrSpouseIncomes.dhrNetIncome" value="${rqt.dhrSpouseIncomes?.dhrNetIncome?.toString()}" 
                    class="  validate-positiveInteger ${rqt.stepStates['spouse'].invalidFields.contains('dhrSpouseIncomes.dhrNetIncome') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrNetIncome.validationError" />"   />
            

    
    </fieldset>
  

