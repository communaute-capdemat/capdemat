


  
    <fieldset class="required">
    <legend><g:message code="rsr.property.rsrSubject.label" /></legend>
    
      
            <label for="rsrSubject.subjectId" class="required">
              <g:message code="rsr.property.subject.label" /> *
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
            <select id="rsrSubject.subjectId" name="subjectId" <g:if test="${isEdition || rqt.stepStates[currentStep].state == 'complete'}">disabled="disabled"</g:if> class="required validate-not-first autofill-subjectFilling-trigger ${rqt.stepStates['subject'].invalidFields.contains('subjectId') ? 'validation-failed' : ''}" title="<g:message code="request.property.subject.validationError" /> ">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${subjects}">
                <option value="${it.key}" ${it.key == rqt.subjectId ? 'selected="selected"': ''}>${it.value}</option>
              </g:each>
            </select>
            

    
      <label for="rsrSubject.subjectTitle" class="required"><g:message code="rsr.property.subjectTitle.label" /> *  <span><g:message code="rsr.property.subjectTitle.help" /></span></label>
            <select id="rsrSubject.subjectTitle" name="rsrSubject.subjectTitle" class="required autofill-subjectFilling-listener-Title validate-not-first ${rqt.stepStates['subject'].invalidFields.contains('rsrSubject.subjectTitle') ? 'validation-failed' : ''}" title="<g:message code="rsr.property.subjectTitle.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>

              <g:each in="${['MISTER','MADAM','AGENCY','UNKNOWN']}">
                <option value="${it}" ${it == rqt.rsrSubject?.subjectTitle?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="rsr.property.subjectTitle" /></option>
              </g:each>
            </select>
            

    
      <label class="required"><g:message code="rsr.property.subjectBirthDate.label" /> *  <span><g:message code="rsr.property.subjectBirthDate.help" /></span></label>
            <div class="date required autofill-subjectFilling-listener-BirthDate validate-date required autofill-subjectFilling-listener-BirthDate">
              <select class="day ${rqt.stepStates['subject'].invalidFields.contains('rsrSubject.subjectBirthDate') ? 'validation-failed' : ''}"
                id="rsrSubject.subjectBirthDate_day"
                name="rsrSubject.subjectBirthDate_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.rsrSubject?.subjectBirthDate?.date == it
                      || (rqt.rsrSubject?.subjectBirthDate == null && params['rsrSubject.subjectBirthDate_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['subject'].invalidFields.contains('rsrSubject.subjectBirthDate') ? 'validation-failed' : ''}"
                id="rsrSubject.subjectBirthDate_month"
                name="rsrSubject.subjectBirthDate_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.rsrSubject?.subjectBirthDate?.month == (it - 1)
                      || (rqt.rsrSubject?.subjectBirthDate == null && params['rsrSubject.subjectBirthDate_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['subject'].invalidFields.contains('rsrSubject.subjectBirthDate') ? 'validation-failed' : ''}"
                id="rsrSubject.subjectBirthDate_year"
                name="rsrSubject.subjectBirthDate_year"
                value="${rqt.rsrSubject?.subjectBirthDate ? rqt.rsrSubject?.subjectBirthDate.year + 1900 : params['rsrSubject.subjectBirthDate_year']}"
                title="<g:message code="rsr.property.subjectBirthDate.validationError" />" />
            </div>
            

    
      <label class="required"><g:message code="rsr.property.subjectResideWith.label" /> *  <span><g:message code="rsr.property.subjectResideWith.help" /></span></label>
            <ul class="required ${rqt.stepStates['subject'].invalidFields.contains('rsrSubject.subjectResideWith') ? 'validation-failed' : ''}">
              <g:each in="${['ALONE','COUPLE','FAMILY']}">
              <li>
                <input type="radio" id="rsrSubject.subjectResideWith_${it}" class="required  validate-one-required" value="${it}" name="rsrSubject.subjectResideWith" ${it == rqt.rsrSubject?.subjectResideWith.toString() ? 'checked="checked"': ''} title="<g:message code="rsr.property.subjectResideWith.validationError" />" />
                <label for="rsrSubject.subjectResideWith_${it}"><g:capdematEnumToText var="${it}" i18nKeyPrefix="rsr.property.subjectResideWith" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label class="required"><g:message code="rsr.property.subjectIsTaxable.label" /> *  <span><g:message code="rsr.property.subjectIsTaxable.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['subject'].invalidFields.contains('rsrSubject.subjectIsTaxable') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="rsrSubject.subjectIsTaxable_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="rsrSubject.subjectIsTaxable" ${ rqt.rsrSubject ?  (it == rqt.rsrSubject?.subjectIsTaxable ? 'checked="checked"': '') : (it == false ? 'checked="checked"': '') } />
                <label for="rsrSubject.subjectIsTaxable_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label class="required"><g:message code="rsr.property.subjectIsAPABeneficiary.label" /> *  <span><g:message code="rsr.property.subjectIsAPABeneficiary.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['subject'].invalidFields.contains('rsrSubject.subjectIsAPABeneficiary') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="rsrSubject.subjectIsAPABeneficiary_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="rsrSubject.subjectIsAPABeneficiary" ${ rqt.rsrSubject ?  (it == rqt.rsrSubject?.subjectIsAPABeneficiary ? 'checked="checked"': '') : (it == false ? 'checked="checked"': '') } />
                <label for="rsrSubject.subjectIsAPABeneficiary_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label class="required"><g:message code="rsr.property.subjectIsDisabledPerson.label" /> *  <span><g:message code="rsr.property.subjectIsDisabledPerson.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['subject'].invalidFields.contains('rsrSubject.subjectIsDisabledPerson') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="rsrSubject.subjectIsDisabledPerson_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="rsrSubject.subjectIsDisabledPerson" ${ rqt.rsrSubject ?  (it == rqt.rsrSubject?.subjectIsDisabledPerson ? 'checked="checked"': '') : (it == false ? 'checked="checked"': '') } />
                <label for="rsrSubject.subjectIsDisabledPerson_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
    </fieldset>
  

  
    <fieldset class="required">
    <legend><g:message code="rsr.property.requestInformation.label" /></legend>
    
      <label class="required"><g:message code="rsr.property.requestInformationEmergency.label" /> *  <span><g:message code="rsr.property.requestInformationEmergency.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['subject'].invalidFields.contains('requestInformation.requestInformationEmergency') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="requestInformation.requestInformationEmergency_${it ? 'yes' : 'no'}" class="required condition-isEmergency-trigger  validate-one-required boolean" title="" value="${it}" name="requestInformation.requestInformationEmergency" ${ rqt.requestInformation ?  (it == rqt.requestInformation?.requestInformationEmergency ? 'checked="checked"': '') : (it == false ? 'checked="checked"': '') } />
                <label for="requestInformation.requestInformationEmergency_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label for="requestInformation.requestInformationEmergencyMotive" class="required condition-isEmergency-filled"><g:message code="rsr.property.requestInformationEmergencyMotive.label" /> *  <span><g:message code="rsr.property.requestInformationEmergencyMotive.help" /></span></label>
            <textarea id="requestInformation.requestInformationEmergencyMotive" name="requestInformation.requestInformationEmergencyMotive" class="required condition-isEmergency-filled  validate-textarea ${rqt.stepStates['subject'].invalidFields.contains('requestInformation.requestInformationEmergencyMotive') ? 'validation-failed' : ''}" title="<g:message code="rsr.property.requestInformationEmergencyMotive.validationError" />" rows="3" cols=""  maxlength="180">${rqt.requestInformation?.requestInformationEmergencyMotive}</textarea>
            

    
    </fieldset>
  

  
    <label class="required"><g:message code="rsr.property.requestInformationRequestKind.label" /> *  <span><g:message code="rsr.property.requestInformationRequestKind.help" /></span></label>
            <ul class="required ${rqt.stepStates['subject'].invalidFields.contains('requestInformationRequestKind') ? 'validation-failed' : ''}">
              <g:each in="${['INDIVIDUAL','COUPLE']}">
              <li>
                <input type="radio" id="requestInformationRequestKind_${it}" class="required condition-isCoupleRequest-trigger  validate-one-required" value="${it}" name="requestInformationRequestKind" ${it == rqt.requestInformationRequestKind.toString() ? 'checked="checked"': ''} title="<g:message code="rsr.property.requestInformationRequestKind.validationError" />" />
                <label for="requestInformationRequestKind_${it}"><g:capdematEnumToText var="${it}" i18nKeyPrefix="rsr.property.requestInformationRequestKind" /></label>
              </li>
              </g:each>
            </ul>
            

  

  
    <fieldset class="required condition-isCoupleRequest-filled">
    <legend><g:message code="rsr.property.spouse.label" /></legend>
    
      <label for="spouse.spouseLastName" class="required"><g:message code="rsr.property.spouseLastName.label" /> *  <span><g:message code="rsr.property.spouseLastName.help" /></span></label>
            <input type="text" id="spouse.spouseLastName" name="spouse.spouseLastName" value="${rqt.spouse?.spouseLastName?.toString()}" 
                    class="required  validate-lastName ${rqt.stepStates['subject'].invalidFields.contains('spouse.spouseLastName') ? 'validation-failed' : ''}" title="<g:message code="rsr.property.spouseLastName.validationError" />"  maxlength="38" />
            

    
      <label for="spouse.spouseFirstName" class="required"><g:message code="rsr.property.spouseFirstName.label" /> *  <span><g:message code="rsr.property.spouseFirstName.help" /></span></label>
            <input type="text" id="spouse.spouseFirstName" name="spouse.spouseFirstName" value="${rqt.spouse?.spouseFirstName?.toString()}" 
                    class="required  validate-firstName ${rqt.stepStates['subject'].invalidFields.contains('spouse.spouseFirstName') ? 'validation-failed' : ''}" title="<g:message code="rsr.property.spouseFirstName.validationError" />"  maxlength="38" />
            

    
      <label for="spouse.spouseTitle" class="required"><g:message code="rsr.property.spouseTitle.label" /> *  <span><g:message code="rsr.property.spouseTitle.help" /></span></label>
            <select id="spouse.spouseTitle" name="spouse.spouseTitle" class="required  validate-not-first ${rqt.stepStates['subject'].invalidFields.contains('spouse.spouseTitle') ? 'validation-failed' : ''}" title="<g:message code="rsr.property.spouseTitle.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['MISTER','MADAM','MISS','AGENCY','UNKNOWN']}">
                <option value="${it}" ${it == rqt.spouse?.spouseTitle?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="rsr.property.spouseTitle" /></option>
              </g:each>
            </select>
            

    
      <label class="required"><g:message code="rsr.property.spouseBirthDate.label" /> *  <span><g:message code="rsr.property.spouseBirthDate.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['subject'].invalidFields.contains('spouse.spouseBirthDate') ? 'validation-failed' : ''}"
                id="spouse.spouseBirthDate_day"
                name="spouse.spouseBirthDate_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.spouse?.spouseBirthDate?.date == it
                      || (rqt.spouse?.spouseBirthDate == null && params['spouse.spouseBirthDate_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['subject'].invalidFields.contains('spouse.spouseBirthDate') ? 'validation-failed' : ''}"
                id="spouse.spouseBirthDate_month"
                name="spouse.spouseBirthDate_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.spouse?.spouseBirthDate?.month == (it - 1)
                      || (rqt.spouse?.spouseBirthDate == null && params['spouse.spouseBirthDate_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['subject'].invalidFields.contains('spouse.spouseBirthDate') ? 'validation-failed' : ''}"
                id="spouse.spouseBirthDate_year"
                name="spouse.spouseBirthDate_year"
                value="${rqt.spouse?.spouseBirthDate ? rqt.spouse?.spouseBirthDate.year + 1900 : params['spouse.spouseBirthDate_year']}"
                title="<g:message code="rsr.property.spouseBirthDate.validationError" />" />
            </div>
            

    
      <label class="required"><g:message code="rsr.property.spouseIsDisabledPerson.label" /> *  <span><g:message code="rsr.property.spouseIsDisabledPerson.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['subject'].invalidFields.contains('spouse.spouseIsDisabledPerson') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="spouse.spouseIsDisabledPerson_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="spouse.spouseIsDisabledPerson" ${ rqt.spouse ?  (it == rqt.spouse?.spouseIsDisabledPerson ? 'checked="checked"': '') : (it == false ? 'checked="checked"': '') } />
                <label for="spouse.spouseIsDisabledPerson_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
    </fieldset>
  

