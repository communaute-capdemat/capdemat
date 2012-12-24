


  
    
            <label for="subjectId" class="required">
              <g:message code="strr.property.subject.label" /> *
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
            <select id="subjectId" name="subjectId" <g:if test="${isEdition || rqt.stepStates[currentStep].state == 'complete'}">disabled="disabled"</g:if> class="required validate-not-first  ${rqt.stepStates['enfant'].invalidFields.contains('subjectId') ? 'validation-failed' : ''}" title="<g:message code="request.property.subject.validationError" /> ">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${subjects}">
                <option value="${it.key}" ${it.key == rqt.subjectId ? 'selected="selected"': ''}>${it.value}</option>
              </g:each>
            </select>
            

  

  
    <fieldset class="required">
    <legend><g:message code="strr.property.ligne.label" /></legend>
    
      <label for="ligne.idLigne" class="required"><g:message code="strr.property.idLigne.label" /> *  <span><g:message code="strr.property.idLigne.help" /></span></label>
            <input type="text" id="ligne.idLigne" name="ligne.idLigne" value="${rqt.ligne?.idLigne?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['enfant'].invalidFields.contains('ligne.idLigne') ? 'validation-failed' : ''}" title="<g:message code="strr.property.idLigne.validationError" />"   />
            

    
      <label for="ligne.labelLigne" class="required"><g:message code="strr.property.labelLigne.label" /> *  <span><g:message code="strr.property.labelLigne.help" /></span></label>
            <input type="text" id="ligne.labelLigne" name="ligne.labelLigne" value="${rqt.ligne?.labelLigne?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['enfant'].invalidFields.contains('ligne.labelLigne') ? 'validation-failed' : ''}" title="<g:message code="strr.property.labelLigne.validationError" />"   />
            

    
    </fieldset>
  

  
    <fieldset class="required">
    <legend><g:message code="strr.property.arret.label" /></legend>
    
      <label for="arret.idArret" class="required"><g:message code="strr.property.idArret.label" /> *  <span><g:message code="strr.property.idArret.help" /></span></label>
            <input type="text" id="arret.idArret" name="arret.idArret" value="${rqt.arret?.idArret?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['enfant'].invalidFields.contains('arret.idArret') ? 'validation-failed' : ''}" title="<g:message code="strr.property.idArret.validationError" />"   />
            

    
      <label for="arret.labelArret" class="required"><g:message code="strr.property.labelArret.label" /> *  <span><g:message code="strr.property.labelArret.help" /></span></label>
            <input type="text" id="arret.labelArret" name="arret.labelArret" value="${rqt.arret?.labelArret?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['enfant'].invalidFields.contains('arret.labelArret') ? 'validation-failed' : ''}" title="<g:message code="strr.property.labelArret.validationError" />"   />
            

    
    </fieldset>
  

