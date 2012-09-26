


  
    
            <label for="subjectId" class="required">
              <g:message code="arr.property.subject.label" /> *
              <span><g:message code="request.property.subject.help" /></span>
              <g:if test="${rqt.stepStates[currentStep].state != 'complete' && !rqt.requestType.getStepAccountCompletion()}">
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
            <select id="subjectId" name="subjectId" <g:if test="${isEdition || rqt.stepStates[currentStep].state == 'complete'}">disabled="disabled"</g:if> class="required validate-not-first  ${rqt.stepStates['preinscription'].invalidFields.contains('subjectId') ? 'validation-failed' : ''}" title="<g:message code="request.property.subject.validationError" /> ">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${subjects}">
                <option value="${it.key}" ${it.key == rqt.subjectId ? 'selected="selected"': ''}>${it.value}</option>
              </g:each>
            </select>
            

  

  
    <fieldset class="required">
    <legend><g:message code="arr.property.site.label" /></legend>
    
      <label for="idSite" class="required"><g:message code="arr.property.idSite.label" /> *  <span><g:message code="arr.property.idSite.help" /></span></label>
            <input type="text" id="idSite" name="idSite" value="${rqt.idSite?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['preinscription'].invalidFields.contains('idSite') ? 'validation-failed' : ''}" title="<g:message code="arr.property.idSite.validationError" />"   />
            

    
      <label for="labelSite" class="required"><g:message code="arr.property.labelSite.label" /> *  <span><g:message code="arr.property.labelSite.help" /></span></label>
            <input type="text" id="labelSite" name="labelSite" value="${rqt.labelSite?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['preinscription'].invalidFields.contains('labelSite') ? 'validation-failed' : ''}" title="<g:message code="arr.property.labelSite.validationError" />"   />
            

    
    </fieldset>
  

  
    <fieldset class="required">
    <legend><g:message code="arr.property.produit.label" /></legend>
    
      <label for="idProduit" class="required"><g:message code="arr.property.idProduit.label" /> *  <span><g:message code="arr.property.idProduit.help" /></span></label>
            <input type="text" id="idProduit" name="idProduit" value="${rqt.idProduit?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['preinscription'].invalidFields.contains('idProduit') ? 'validation-failed' : ''}" title="<g:message code="arr.property.idProduit.validationError" />"   />
            

    
      <label for="labelProduit" class="required"><g:message code="arr.property.labelProduit.label" /> *  <span><g:message code="arr.property.labelProduit.help" /></span></label>
            <input type="text" id="labelProduit" name="labelProduit" value="${rqt.labelProduit?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['preinscription'].invalidFields.contains('labelProduit') ? 'validation-failed' : ''}" title="<g:message code="arr.property.labelProduit.validationError" />"   />
            

    
      <label for="typeProduit" class="required"><g:message code="arr.property.typeProduit.label" /> *  <span><g:message code="arr.property.typeProduit.help" /></span></label>
            <input type="text" id="typeProduit" name="typeProduit" value="${rqt.typeProduit?.toString()}" 
                    class="required condition-subscription-trigger  validate-string ${rqt.stepStates['preinscription'].invalidFields.contains('typeProduit') ? 'validation-failed' : ''}" title="<g:message code="arr.property.typeProduit.validationError" />"   />
            

    
    </fieldset>
  

  
    <fieldset class="required condition-subscription-filled">
    <legend><g:message code="arr.property.segment.label" /></legend>
    
      <label for="idSegment" class="required"><g:message code="arr.property.idSegment.label" /> *  <span><g:message code="arr.property.idSegment.help" /></span></label>
            <input type="text" id="idSegment" name="idSegment" value="${rqt.idSegment?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['preinscription'].invalidFields.contains('idSegment') ? 'validation-failed' : ''}" title="<g:message code="arr.property.idSegment.validationError" />"   />
            

    
      <label for="labelSegment" class="required"><g:message code="arr.property.labelSegment.label" /> *  <span><g:message code="arr.property.labelSegment.help" /></span></label>
            <input type="text" id="labelSegment" name="labelSegment" value="${rqt.labelSegment?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['preinscription'].invalidFields.contains('labelSegment') ? 'validation-failed' : ''}" title="<g:message code="arr.property.labelSegment.validationError" />"   />
            

    
    </fieldset>
  

