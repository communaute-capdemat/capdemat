


  
    <fieldset class="required">
    <legend><g:message code="sgr.property.subjectInformations.label" /></legend>
    
      
            <label for="subjectInformations.subjectId" class="required">
              <g:message code="sgr.property.subject.label" /> *
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
            <select id="subjectInformations.subjectId" name="subjectId" <g:if test="${isEdition || rqt.stepStates[currentStep].state == 'complete'}">disabled="disabled"</g:if> class="required validate-not-first autofill-subjectFilling-trigger ${rqt.stepStates['subject'].invalidFields.contains('subjectId') ? 'validation-failed' : ''}" title="<g:message code="request.property.subject.validationError" /> ">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${subjects}">
                <option value="${it.key}" ${it.key == rqt.subjectId ? 'selected="selected"': ''}>${it.value}</option>
              </g:each>
            </select>
            

    
      <label class="required"><g:message code="sgr.property.subjectBirthDate.label" /> *  <span><g:message code="sgr.property.subjectBirthDate.help" /></span></label>
            <div class="date required autofill-subjectFilling-listener-BirthDate validate-date required autofill-subjectFilling-listener-BirthDate">
              <select class="day ${rqt.stepStates['subject'].invalidFields.contains('subjectInformations.subjectBirthDate') ? 'validation-failed' : ''}"
                id="subjectInformations.subjectBirthDate_day"
                name="subjectInformations.subjectBirthDate_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.subjectInformations?.subjectBirthDate?.date == it
                      || (rqt.subjectInformations?.subjectBirthDate == null && params['subjectInformations.subjectBirthDate_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['subject'].invalidFields.contains('subjectInformations.subjectBirthDate') ? 'validation-failed' : ''}"
                id="subjectInformations.subjectBirthDate_month"
                name="subjectInformations.subjectBirthDate_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.subjectInformations?.subjectBirthDate?.month == (it - 1)
                      || (rqt.subjectInformations?.subjectBirthDate == null && params['subjectInformations.subjectBirthDate_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['subject'].invalidFields.contains('subjectInformations.subjectBirthDate') ? 'validation-failed' : ''}"
                id="subjectInformations.subjectBirthDate_year"
                name="subjectInformations.subjectBirthDate_year"
                value="${rqt.subjectInformations?.subjectBirthDate ? rqt.subjectInformations?.subjectBirthDate.year + 1900 : params['subjectInformations.subjectBirthDate_year']}"
                title="<g:message code="sgr.property.subjectBirthDate.validationError" />" />
            </div>
            

    
      <label class="required"><g:message code="sgr.property.subjectFirstRequest.label" /> *  <span><g:message code="sgr.property.subjectFirstRequest.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['subject'].invalidFields.contains('subjectInformations.subjectFirstRequest') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="subjectInformations.subjectFirstRequest_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="subjectInformations.subjectFirstRequest" ${it == rqt.subjectInformations?.subjectFirstRequest ? 'checked="checked"': ''} />
                <label for="subjectInformations.subjectFirstRequest_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
    </fieldset>
  

