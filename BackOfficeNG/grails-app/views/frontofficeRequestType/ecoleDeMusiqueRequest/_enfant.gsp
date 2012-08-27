


  
    
            <label for="subjectId" class="required">
              <g:message code="edmr.property.subject.label" /> *
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
    <legend><g:message code="edmr.property.site.label" /></legend>
    
      <label for="site.idSite" class="required"><g:message code="edmr.property.idSite.label" /> *  <span><g:message code="edmr.property.idSite.help" /></span></label>
            <input type="text" id="site.idSite" name="site.idSite" value="${rqt.site?.idSite?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['enfant'].invalidFields.contains('site.idSite') ? 'validation-failed' : ''}" title="<g:message code="edmr.property.idSite.validationError" />"   />
            

    
      <label for="site.labelSite" class="required"><g:message code="edmr.property.labelSite.label" /> *  <span><g:message code="edmr.property.labelSite.help" /></span></label>
            <input type="text" id="site.labelSite" name="site.labelSite" value="${rqt.site?.labelSite?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['enfant'].invalidFields.contains('site.labelSite') ? 'validation-failed' : ''}" title="<g:message code="edmr.property.labelSite.validationError" />"   />
            

    
    </fieldset>
  

  
    <fieldset class="required">
    <legend><g:message code="edmr.property.produit.label" /></legend>
    
      <label for="produit.idProduit" class="required"><g:message code="edmr.property.idProduit.label" /> *  <span><g:message code="edmr.property.idProduit.help" /></span></label>
            <input type="text" id="produit.idProduit" name="produit.idProduit" value="${rqt.produit?.idProduit?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['enfant'].invalidFields.contains('produit.idProduit') ? 'validation-failed' : ''}" title="<g:message code="edmr.property.idProduit.validationError" />"   />
            

    
      <label for="produit.labelProduit" class="required"><g:message code="edmr.property.labelProduit.label" /> *  <span><g:message code="edmr.property.labelProduit.help" /></span></label>
            <input type="text" id="produit.labelProduit" name="produit.labelProduit" value="${rqt.produit?.labelProduit?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['enfant'].invalidFields.contains('produit.labelProduit') ? 'validation-failed' : ''}" title="<g:message code="edmr.property.labelProduit.validationError" />"   />
            

    
    </fieldset>
  

