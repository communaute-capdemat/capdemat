


  
    
            <ul ${rqt.stepStates['reglements'].invalidFields.contains('edmrCertifieExactitude') ? 'class="validation-failed"' : ''}>
              <li>
                <input type="hidden" name="_edmrCertifieExactitude" /><!-- Grails 1.2.x convention to bind checkboxes. -->
                <input type="checkbox" id="edmrCertifieExactitude" name="edmrCertifieExactitude"
                       class="required  validate-acceptance"
                       title="${message(code:'edmr.property.edmrCertifieExactitude.validationError')}"
                       ${rqt.edmrCertifieExactitude ? 'checked="checked"' : ''} value="true" />
                <label for="edmrCertifieExactitude" class="required">
                  ${message(code:'edmr.property.edmrCertifieExactitude.label')}*
                  <g:if test="${availableRules.contains('edmrCertifieExactitude')}">
                  <a target="_blank"
                     href="${createLink(controller:'localAuthorityResource', action:'rule', params:['requestTypeLabel':rqt.requestType.label, 'filename':'edmrCertifieExactitude']).encodeAsXML()}">
                    <span>${message(code:'request.action.consult.rules')}</span>
                  </a>
                  </g:if>
                  <span>${message(code:'edmr.property.edmrCertifieExactitude.help')}</span>
                </label>
              </li>
            </ul>
            

  

