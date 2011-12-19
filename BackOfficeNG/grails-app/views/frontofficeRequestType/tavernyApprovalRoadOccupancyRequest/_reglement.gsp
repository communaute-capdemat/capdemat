


  
    
            <ul ${rqt.stepStates['reglement'].invalidFields.contains('reglement') ? 'class="validation-failed"' : ''}>
              <li>
                <input type="hidden" name="_reglement" /><!-- Grails 1.2.x convention to bind checkboxes. -->
                <input type="checkbox" id="reglement" name="reglement"
                       class="required  validate-acceptance"
                       title="${message(code:'taror.property.reglement.validationError')}"
                       ${rqt.reglement ? 'checked="checked"' : ''} value="true" />
                <label for="reglement" class="required">
                  ${message(code:'taror.property.reglement.label')}*
                  <g:if test="${availableRules.contains('reglement')}">
                  <a target="_blank"
                     href="${createLink(controller:'localAuthorityResource', action:'rule', params:['requestTypeLabel':rqt.requestType.label, 'filename':'reglement']).encodeAsXML()}">
                    <span>${message(code:'request.action.consult.rules')}</span>
                  </a>
                  </g:if>
                  <span>${message(code:'taror.property.reglement.help')}</span>
                </label>
              </li>
            </ul>
            

  

