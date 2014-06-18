


  
    
            <label for="subjectId" class="required">
              <g:message code="arr.property.subject.label" /> *
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
            <select id="subjectId" name="subjectId" <g:if test="${isEdition || rqt.stepStates[currentStep].state == 'complete'}">disabled="disabled"</g:if> class="required validate-not-first  ${rqt.stepStates['preinscription'].invalidFields.contains('subjectId') ? 'validation-failed' : ''}" title="<g:message code="request.property.subject.validationError" /> ">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${subjects}">
                <option value="${it.key}" ${it.key == rqt.subjectId ? 'selected="selected"': ''}>${it.value}</option>
              </g:each>
            </select>
            

  

  
    <fieldset class="required">
    <legend><g:message code="arr.property.site.label" /></legend>
    
      <label for="site.idSite" class="required"><g:message code="arr.property.idSite.label" /> *  <span><g:message code="arr.property.idSite.help" /></span></label>
            <input type="text" id="site.idSite" name="site.idSite" value="${rqt.site?.idSite?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['preinscription'].invalidFields.contains('site.idSite') ? 'validation-failed' : ''}" title="<g:message code="arr.property.idSite.validationError" />"   />
            

    
      <label for="site.labelSite" class="required"><g:message code="arr.property.labelSite.label" /> *  <span><g:message code="arr.property.labelSite.help" /></span></label>
            <input type="text" id="site.labelSite" name="site.labelSite" value="${rqt.site?.labelSite?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['preinscription'].invalidFields.contains('site.labelSite') ? 'validation-failed' : ''}" title="<g:message code="arr.property.labelSite.validationError" />"   />
            

    
    </fieldset>
  

  
    <fieldset class="required">
    <legend><g:message code="arr.property.produit.label" /></legend>
    
      <label for="produit.idProduit" class="required"><g:message code="arr.property.idProduit.label" /> *  <span><g:message code="arr.property.idProduit.help" /></span></label>
            <input type="text" id="produit.idProduit" name="produit.idProduit" value="${rqt.produit?.idProduit?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['preinscription'].invalidFields.contains('produit.idProduit') ? 'validation-failed' : ''}" title="<g:message code="arr.property.idProduit.validationError" />"   />
            

    
      <label for="produit.labelProduit" class="required"><g:message code="arr.property.labelProduit.label" /> *  <span><g:message code="arr.property.labelProduit.help" /></span></label>
            <input type="text" id="produit.labelProduit" name="produit.labelProduit" value="${rqt.produit?.labelProduit?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['preinscription'].invalidFields.contains('produit.labelProduit') ? 'validation-failed' : ''}" title="<g:message code="arr.property.labelProduit.validationError" />"   />
            

    
      <label for="produit.typeProduit" class="required"><g:message code="arr.property.typeProduit.label" /> *  <span><g:message code="arr.property.typeProduit.help" /></span></label>
            <input type="text" id="produit.typeProduit" name="produit.typeProduit" value="${rqt.produit?.typeProduit?.toString()}" 
                    class="required condition-subscription-trigger  validate-string ${rqt.stepStates['preinscription'].invalidFields.contains('produit.typeProduit') ? 'validation-failed' : ''}" title="<g:message code="arr.property.typeProduit.validationError" />"   />
            

    
    </fieldset>
  

  
    <fieldset class="required condition-subscription-filled">
    <legend><g:message code="arr.property.segment.label" /></legend>
    
      <label for="segment.idSegment" class="required"><g:message code="arr.property.idSegment.label" /> *  <span><g:message code="arr.property.idSegment.help" /></span></label>
            <input type="text" id="segment.idSegment" name="segment.idSegment" value="${rqt.segment?.idSegment?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['preinscription'].invalidFields.contains('segment.idSegment') ? 'validation-failed' : ''}" title="<g:message code="arr.property.idSegment.validationError" />"   />
            

    
      <label for="segment.labelSegment" class="required"><g:message code="arr.property.labelSegment.label" /> *  <span><g:message code="arr.property.labelSegment.help" /></span></label>
            <input type="text" id="segment.labelSegment" name="segment.labelSegment" value="${rqt.segment?.labelSegment?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['preinscription'].invalidFields.contains('segment.labelSegment') ? 'validation-failed' : ''}" title="<g:message code="arr.property.labelSegment.validationError" />"   />
            

    
    </fieldset>
  

