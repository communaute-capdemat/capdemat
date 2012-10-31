


  
    <fieldset class="required">
    <legend><g:message code="dhr.property.dhrRequester.label" /></legend>
    
      
            <label for="dhrRequester.subjectId" class="required">
              <g:message code="dhr.property.subject.label" /> *
              <span><g:message code="request.property.subject.help" /></span>
              <g:if test="${rqt.stepStates[currentStep].state != 'complete'}">
                <g:if test="${!fr.cg95.cvq.service.request.IRequestWorkflowService.SUBJECT_POLICY_NONE.equals(subjectPolicy)}">
                  <g:if test="${fr.cg95.cvq.service.request.IRequestWorkflowService.SUBJECT_POLICY_ADULT.equals(subjectPolicy)}">
                    <span>(<a id="addSubjectLink" href="${createLink(controller : 'frontofficeRequest', action : 'individual', params : ['type' : 'adult', 'requestId' : rqt.id])}"><g:message code="homeFolder.action.addSubject" /></a>)</span>
                  </g:if>
                  <g:elseif test="${fr.cg95.cvq.service.request.IRequestWorkflowService.SUBJECT_POLICY_CHILD.equals(subjectPolicy)}">
                    <span>(<a id="addSubjectLink" href="${createLink(controller : 'frontofficeRequest', action : 'individual', params : ['type' : 'child', 'requestId' : rqt.id])}"><g:message code="homeFolder.action.addSubject" /></a>)</span>
                  </g:elseif>
                  <g:elseif test="${fr.cg95.cvq.service.request.IRequestWorkflowService.SUBJECT_POLICY_INDIVIDUAL.equals(subjectPolicy)}">
                    <span>(<a id="addAdultLink" href="${createLink(controller : 'frontofficeRequest', action : 'individual', params : ['type' : 'adult', 'requestId' : rqt.id])}"><g:message code="homeFolder.action.addAdult" /></a>
                    <g:message code="message.or" />
                    <a id="addChildLink" href="${createLink(controller : 'frontofficeRequest', action : 'individual', params : ['type' : 'child', 'requestId' : rqt.id])}"><g:message code="homeFolder.action.addChild" /></a>)</span>
                  </g:elseif>
                </g:if>
              </g:if>
            </label>
            <select id="dhrRequester.subjectId" name="subjectId" <g:if test="${isEdition || rqt.stepStates[currentStep].state == 'complete'}">disabled="disabled"</g:if> class="required validate-not-first  ${rqt.stepStates['subject'].invalidFields.contains('subjectId') ? 'validation-failed' : ''}" title="<g:message code="request.property.subject.validationError" /> ">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${subjects}">
                <option value="${it.key}" ${it.key == rqt.subjectId ? 'selected="selected"': ''}>${it.value}</option>
              </g:each>
            </select>
            

    
      <label class="required"><g:message code="dhr.property.dhrRequesterBirthDate.label" /> *  <span><g:message code="dhr.property.dhrRequesterBirthDate.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['subject'].invalidFields.contains('dhrRequester.dhrRequesterBirthDate') ? 'validation-failed' : ''}"
                id="dhrRequester.dhrRequesterBirthDate_day"
                name="dhrRequester.dhrRequesterBirthDate_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.dhrRequester?.dhrRequesterBirthDate?.date == it
                      || (rqt.dhrRequester?.dhrRequesterBirthDate == null && params['dhrRequester.dhrRequesterBirthDate_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['subject'].invalidFields.contains('dhrRequester.dhrRequesterBirthDate') ? 'validation-failed' : ''}"
                id="dhrRequester.dhrRequesterBirthDate_month"
                name="dhrRequester.dhrRequesterBirthDate_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.dhrRequester?.dhrRequesterBirthDate?.month == (it - 1)
                      || (rqt.dhrRequester?.dhrRequesterBirthDate == null && params['dhrRequester.dhrRequesterBirthDate_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['subject'].invalidFields.contains('dhrRequester.dhrRequesterBirthDate') ? 'validation-failed' : ''}"
                id="dhrRequester.dhrRequesterBirthDate_year"
                name="dhrRequester.dhrRequesterBirthDate_year"
                value="${rqt.dhrRequester?.dhrRequesterBirthDate ? rqt.dhrRequester?.dhrRequesterBirthDate.year + 1900 : params['dhrRequester.dhrRequesterBirthDate_year']}"
                title="<g:message code="dhr.property.dhrRequesterBirthDate.validationError" />" />
            </div>
            

    
      <label for="dhrRequester.dhrRequesterBirthPlace" class="required"><g:message code="dhr.property.dhrRequesterBirthPlace.label" /> *  <span><g:message code="dhr.property.dhrRequesterBirthPlace.help" /></span></label>
            <input type="text" id="dhrRequester.dhrRequesterBirthPlace" name="dhrRequester.dhrRequesterBirthPlace" value="${rqt.dhrRequester?.dhrRequesterBirthPlace?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['subject'].invalidFields.contains('dhrRequester.dhrRequesterBirthPlace') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrRequesterBirthPlace.validationError" />"   />
            

    
      <label for="dhrRequester.dhrRequesterNationality" class="required"><g:message code="dhr.property.dhrRequesterNationality.label" /> *  <span><g:message code="dhr.property.dhrRequesterNationality.help" /></span></label>
            <select id="dhrRequester.dhrRequesterNationality" name="dhrRequester.dhrRequesterNationality" class="required condition-isNonEuropean-trigger  validate-not-first ${rqt.stepStates['subject'].invalidFields.contains('dhrRequester.dhrRequesterNationality') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrRequesterNationality.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['FRENCH','EUROPEAN_UNION','OUTSIDE_EUROPEAN_UNION']}">
                <option value="${it}" ${it == rqt.dhrRequester?.dhrRequesterNationality?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dhr.property.dhrRequesterNationality" /></option>
              </g:each>
            </select>
            

    
      <label class="required condition-isNonEuropean-filled"><g:message code="dhr.property.dhrRequesterFranceArrivalDate.label" /> *  <span><g:message code="dhr.property.dhrRequesterFranceArrivalDate.help" /></span></label>
            <div class="date required condition-isNonEuropean-filled  validate-date required condition-isNonEuropean-filled ">
              <select class="day ${rqt.stepStates['subject'].invalidFields.contains('dhrRequester.dhrRequesterFranceArrivalDate') ? 'validation-failed' : ''}"
                id="dhrRequester.dhrRequesterFranceArrivalDate_day"
                name="dhrRequester.dhrRequesterFranceArrivalDate_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.dhrRequester?.dhrRequesterFranceArrivalDate?.date == it
                      || (rqt.dhrRequester?.dhrRequesterFranceArrivalDate == null && params['dhrRequester.dhrRequesterFranceArrivalDate_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['subject'].invalidFields.contains('dhrRequester.dhrRequesterFranceArrivalDate') ? 'validation-failed' : ''}"
                id="dhrRequester.dhrRequesterFranceArrivalDate_month"
                name="dhrRequester.dhrRequesterFranceArrivalDate_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.dhrRequester?.dhrRequesterFranceArrivalDate?.month == (it - 1)
                      || (rqt.dhrRequester?.dhrRequesterFranceArrivalDate == null && params['dhrRequester.dhrRequesterFranceArrivalDate_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['subject'].invalidFields.contains('dhrRequester.dhrRequesterFranceArrivalDate') ? 'validation-failed' : ''}"
                id="dhrRequester.dhrRequesterFranceArrivalDate_year"
                name="dhrRequester.dhrRequesterFranceArrivalDate_year"
                value="${rqt.dhrRequester?.dhrRequesterFranceArrivalDate ? rqt.dhrRequester?.dhrRequesterFranceArrivalDate.year + 1900 : params['dhrRequester.dhrRequesterFranceArrivalDate_year']}"
                title="<g:message code="dhr.property.dhrRequesterFranceArrivalDate.validationError" />" />
            </div>
            

    
      <label class="required condition-isNonEuropean-filled"><g:message code="dhr.property.dhrRequesterIsFrenchResident.label" /> *  <span><g:message code="dhr.property.dhrRequesterIsFrenchResident.help" /></span></label>
            <ul class="yes-no required condition-isNonEuropean-filled ${rqt.stepStates['subject'].invalidFields.contains('dhrRequester.dhrRequesterIsFrenchResident') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="dhrRequester.dhrRequesterIsFrenchResident_${it ? 'yes' : 'no'}" class="required condition-isNonEuropean-filled  validate-one-required boolean" title="" value="${it}" name="dhrRequester.dhrRequesterIsFrenchResident" ${it == rqt.dhrRequester?.dhrRequesterIsFrenchResident ? 'checked="checked"': ''} />
                <label for="dhrRequester.dhrRequesterIsFrenchResident_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
    </fieldset>
  

  
    <fieldset class="required">
    <legend><g:message code="dhr.property.dhrRequesterPensionPlan.label" /></legend>
    
      <label for="dhrRequesterPensionPlan.dhrPrincipalPensionPlan" class="required"><g:message code="dhr.property.dhrPrincipalPensionPlan.label" /> *  <span><g:message code="dhr.property.dhrPrincipalPensionPlan.help" /></span></label>
            <select id="dhrRequesterPensionPlan.dhrPrincipalPensionPlan" name="dhrRequesterPensionPlan.dhrPrincipalPensionPlan" class="required condition-isOtherPensionPlan-trigger  validate-not-first ${rqt.stepStates['subject'].invalidFields.contains('dhrRequesterPensionPlan.dhrPrincipalPensionPlan') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrPrincipalPensionPlan.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['C_N_A_V','M_S_A','C_R_A_M','M_G_E_N','S_N_C_F','OTHER']}">
                <option value="${it}" ${it == rqt.dhrRequesterPensionPlan?.dhrPrincipalPensionPlan?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dhr.property.dhrPrincipalPensionPlan" /></option>
              </g:each>
            </select>
            

    
      <label for="dhrRequesterPensionPlan.dhrPensionPlanDetail" class="required condition-isOtherPensionPlan-filled"><g:message code="dhr.property.dhrPensionPlanDetail.label" /> *  <span><g:message code="dhr.property.dhrPensionPlanDetail.help" /></span></label>
            <input type="text" id="dhrRequesterPensionPlan.dhrPensionPlanDetail" name="dhrRequesterPensionPlan.dhrPensionPlanDetail" value="${rqt.dhrRequesterPensionPlan?.dhrPensionPlanDetail?.toString()}" 
                    class="required condition-isOtherPensionPlan-filled  validate-string ${rqt.stepStates['subject'].invalidFields.contains('dhrRequesterPensionPlan.dhrPensionPlanDetail') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrPensionPlanDetail.validationError" />"   />
            

    
      <label for="dhrRequesterPensionPlan.dhrComplementaryPensionPlan" class="required"><g:message code="dhr.property.dhrComplementaryPensionPlan.label" /> *  <span><g:message code="dhr.property.dhrComplementaryPensionPlan.help" /></span></label>
            <input type="text" id="dhrRequesterPensionPlan.dhrComplementaryPensionPlan" name="dhrRequesterPensionPlan.dhrComplementaryPensionPlan" value="${rqt.dhrRequesterPensionPlan?.dhrComplementaryPensionPlan?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['subject'].invalidFields.contains('dhrRequesterPensionPlan.dhrComplementaryPensionPlan') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrComplementaryPensionPlan.validationError" />"   />
            

    
    </fieldset>
  

  
    <fieldset class="required">
    <legend><g:message code="dhr.property.dhrRequesterGuardian.label" /></legend>
    
      <label class="required"><g:message code="dhr.property.dhrRequesterHaveGuardian.label" /> *  <span><g:message code="dhr.property.dhrRequesterHaveGuardian.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['subject'].invalidFields.contains('dhrRequesterGuardian.dhrRequesterHaveGuardian') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="dhrRequesterGuardian.dhrRequesterHaveGuardian_${it ? 'yes' : 'no'}" class="required condition-haveGuardian-trigger  validate-one-required boolean" title="" value="${it}" name="dhrRequesterGuardian.dhrRequesterHaveGuardian" ${it == rqt.dhrRequesterGuardian?.dhrRequesterHaveGuardian ? 'checked="checked"': ''} />
                <label for="dhrRequesterGuardian.dhrRequesterHaveGuardian_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label for="dhrRequesterGuardian.dhrGuardianMeasure" class="required condition-haveGuardian-filled"><g:message code="dhr.property.dhrGuardianMeasure.label" /> *  <span><g:message code="dhr.property.dhrGuardianMeasure.help" /></span></label>
            <select id="dhrRequesterGuardian.dhrGuardianMeasure" name="dhrRequesterGuardian.dhrGuardianMeasure" class="required condition-haveGuardian-filled  validate-not-first ${rqt.stepStates['subject'].invalidFields.contains('dhrRequesterGuardian.dhrGuardianMeasure') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrGuardianMeasure.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['SAFEGUARDING_JUSTICE','GUARDIANSHIP','CURATORSHIP']}">
                <option value="${it}" ${it == rqt.dhrRequesterGuardian?.dhrGuardianMeasure?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dhr.property.dhrGuardianMeasure" /></option>
              </g:each>
            </select>
            

    
      <label for="dhrRequesterGuardian.dhrGuardianName" class="required condition-haveGuardian-filled"><g:message code="dhr.property.dhrGuardianName.label" /> *  <span><g:message code="dhr.property.dhrGuardianName.help" /></span></label>
            <input type="text" id="dhrRequesterGuardian.dhrGuardianName" name="dhrRequesterGuardian.dhrGuardianName" value="${rqt.dhrRequesterGuardian?.dhrGuardianName?.toString()}" 
                    class="required condition-haveGuardian-filled  validate-lastName ${rqt.stepStates['subject'].invalidFields.contains('dhrRequesterGuardian.dhrGuardianName') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrGuardianName.validationError" />"  maxlength="38" />
            

    
      <label class="required condition-haveGuardian-filled"><g:message code="dhr.property.dhrGuardianAddress.label" /> *  <span><g:message code="dhr.property.dhrGuardianAddress.help" /></span></label>
            <div id="dhrRequesterGuardian.dhrGuardianAddress" class="address required condition-haveGuardian-filled  ${rqt.stepStates['subject'].invalidFields.contains('dhrRequesterGuardian.dhrGuardianAddress') ? 'validation-failed' : ''}">
            <label for="dhrRequesterGuardian.dhrGuardianAddress.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['subject'].invalidFields.contains('dhrRequesterGuardian.dhrGuardianAddress.additionalDeliveryInformation') ? 'validation-failed' : ''}" value="${rqt.dhrRequesterGuardian?.dhrGuardianAddress?.additionalDeliveryInformation}" maxlength="38" id="dhrRequesterGuardian.dhrGuardianAddress.additionalDeliveryInformation" name="dhrRequesterGuardian.dhrGuardianAddress.additionalDeliveryInformation" />  
            <label for="dhrRequesterGuardian.dhrGuardianAddress.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['subject'].invalidFields.contains('dhrRequesterGuardian.dhrGuardianAddress.additionalGeographicalInformation') ? 'validation-failed' : ''}" value="${rqt.dhrRequesterGuardian?.dhrGuardianAddress?.additionalGeographicalInformation}" maxlength="38" id="dhrRequesterGuardian.dhrGuardianAddress.additionalGeographicalInformation" name="dhrRequesterGuardian.dhrGuardianAddress.additionalGeographicalInformation" />
            <label for="dhrRequesterGuardian.dhrGuardianAddress_streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="dhrRequesterGuardian.dhrGuardianAddress_streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1 validate-streetNumber ${rqt.stepStates['subject'].invalidFields.contains('dhrRequesterGuardian.dhrGuardianAddress.streetNumber') ? 'validation-failed' : ''}" value="${rqt.dhrRequesterGuardian?.dhrGuardianAddress?.streetNumber}" size="5" maxlength="5" id="dhrRequesterGuardian.dhrGuardianAddress_streetNumber" name="dhrRequesterGuardian.dhrGuardianAddress.streetNumber" />
            <input type="text" class="line2 required validate-streetName ${rqt.stepStates['subject'].invalidFields.contains('dhrRequesterGuardian.dhrGuardianAddress.streetName') ? 'validation-failed' : ''}" value="${rqt.dhrRequesterGuardian?.dhrGuardianAddress?.streetName}" maxlength="32" id="dhrRequesterGuardian.dhrGuardianAddress_streetName" name="dhrRequesterGuardian.dhrGuardianAddress.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <input type="hidden" value="${rqt.dhrRequesterGuardian?.dhrGuardianAddress?.streetMatriculation}" id="dhrRequesterGuardian.dhrGuardianAddress_streetMatriculation" name="dhrRequesterGuardian.dhrGuardianAddress.streetMatriculation" />
            <input type="hidden" value="${rqt.dhrRequesterGuardian?.dhrGuardianAddress?.streetRivoliCode}" id="dhrRequesterGuardian.dhrGuardianAddress_streetRivoliCode" name="dhrRequesterGuardian.dhrGuardianAddress.streetRivoliCode" />
            <label for="dhrRequesterGuardian.dhrGuardianAddress.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['subject'].invalidFields.contains('dhrRequesterGuardian.dhrGuardianAddress.placeNameOrService') ? 'validation-failed' : ''}" value="${rqt.dhrRequesterGuardian?.dhrGuardianAddress?.placeNameOrService}" maxlength="38" id="dhrRequesterGuardian.dhrGuardianAddress.placeNameOrService" name="dhrRequesterGuardian.dhrGuardianAddress.placeNameOrService" />
            <label for="dhrRequesterGuardian.dhrGuardianAddress_postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="dhrRequesterGuardian.dhrGuardianAddress_city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required validate-postalCode ${rqt.stepStates['subject'].invalidFields.contains('dhrRequesterGuardian.dhrGuardianAddress.postalCode') ? 'validation-failed' : ''}" value="${rqt.dhrRequesterGuardian?.dhrGuardianAddress?.postalCode}" size="5" maxlength="5" id="dhrRequesterGuardian.dhrGuardianAddress_postalCode" name="dhrRequesterGuardian.dhrGuardianAddress.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required validate-city ${rqt.stepStates['subject'].invalidFields.contains('dhrRequesterGuardian.dhrGuardianAddress.city') ? 'validation-failed' : ''}" value="${rqt.dhrRequesterGuardian?.dhrGuardianAddress?.city}" maxlength="32" id="dhrRequesterGuardian.dhrGuardianAddress_city" name="dhrRequesterGuardian.dhrGuardianAddress.city" title="<g:message code="address.property.city.validationError" />" />
            <input type="hidden" value="${rqt.dhrRequesterGuardian?.dhrGuardianAddress?.cityInseeCode}" id="dhrRequesterGuardian.dhrGuardianAddress_cityInseeCode" name="dhrRequesterGuardian.dhrGuardianAddress.cityInseeCode" />
            <label for="dhrRequesterGuardian.dhrGuardianAddress.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['subject'].invalidFields.contains('dhrRequesterGuardian.dhrGuardianAddress.countryName') ? 'validation-failed' : ''}" value="${rqt.dhrRequesterGuardian?.dhrGuardianAddress?.countryName}" maxlength="38" id="dhrRequesterGuardian.dhrGuardianAddress.countryName" name="dhrRequesterGuardian.dhrGuardianAddress.countryName" />
            </div>
            

    
    </fieldset>
  

