
  <g:set var="currentCollectionItem" value="${rqt?.fraisSuppLiesHandicap.size() > collectionIndex ? rqt.fraisSuppLiesHandicap.get(collectionIndex) : null}" />
  <h4>
    ${message(code:'myr.property.fraisSuppLiesHandicap.label')}
    <span>
      <g:if test="${currentCollectionItem != null}">
        ${message(code:'request.message.editCollectionItem', args:[collectionIndex + 1])}
      </g:if>
      <g:else>
        ${message(code:'request.message.addCollectionItem')}
      </g:else>
    </span>
  </h4>
  
    <label for="fraisSuppLiesHandicap.${collectionIndex}.natureFrais" class="required"><g:message code="myr.property.natureFrais.label" /> *  <span><g:message code="myr.property.natureFrais.help" /></span></label>
            <input type="text" id="fraisSuppLiesHandicap.${collectionIndex}.natureFrais" name="fraisSuppLiesHandicap[${collectionIndex}].natureFrais" value="${currentCollectionItem?.natureFrais?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['allocationEducationEnfantHandicape'].invalidFields.contains('fraisSuppLiesHandicap['+collectionIndex+'].natureFrais') ? 'validation-failed' : ''}" title="<g:message code="myr.property.natureFrais.validationError" />"   />
            

  
    <label for="fraisSuppLiesHandicap.${collectionIndex}.financeursSollicites" class="required"><g:message code="myr.property.financeursSollicites.label" /> *  <span><g:message code="myr.property.financeursSollicites.help" /></span></label>
            <input type="text" id="fraisSuppLiesHandicap.${collectionIndex}.financeursSollicites" name="fraisSuppLiesHandicap[${collectionIndex}].financeursSollicites" value="${currentCollectionItem?.financeursSollicites?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['allocationEducationEnfantHandicape'].invalidFields.contains('fraisSuppLiesHandicap['+collectionIndex+'].financeursSollicites') ? 'validation-failed' : ''}" title="<g:message code="myr.property.financeursSollicites.validationError" />"   />
            

  
    <label for="fraisSuppLiesHandicap.${collectionIndex}.montantsObtenus" class="required"><g:message code="myr.property.montantsObtenus.label" /> *  <span><g:message code="myr.property.montantsObtenus.help" /></span></label>
            <input type="text" id="fraisSuppLiesHandicap.${collectionIndex}.montantsObtenus" name="fraisSuppLiesHandicap[${collectionIndex}].montantsObtenus" value="${currentCollectionItem?.montantsObtenus?.toString()}" 
                    class="required  validate-regex ${rqt.stepStates['allocationEducationEnfantHandicape'].invalidFields.contains('fraisSuppLiesHandicap['+collectionIndex+'].montantsObtenus') ? 'validation-failed' : ''}" title="<g:message code="myr.property.montantsObtenus.validationError" />" regex="[0-9]{0,7},[0-9]{2}$" maxlength="10" />
            

  
    <label for="fraisSuppLiesHandicap.${collectionIndex}.resteAVotreCharge" class="required"><g:message code="myr.property.resteAVotreCharge.label" /> *  <span><g:message code="myr.property.resteAVotreCharge.help" /></span></label>
            <input type="text" id="fraisSuppLiesHandicap.${collectionIndex}.resteAVotreCharge" name="fraisSuppLiesHandicap[${collectionIndex}].resteAVotreCharge" value="${currentCollectionItem?.resteAVotreCharge?.toString()}" 
                    class="required  validate-regex ${rqt.stepStates['allocationEducationEnfantHandicape'].invalidFields.contains('fraisSuppLiesHandicap['+collectionIndex+'].resteAVotreCharge') ? 'validation-failed' : ''}" title="<g:message code="myr.property.resteAVotreCharge.validationError" />" regex="[0-9]{0,7},[0-9]{2}$" maxlength="10" />
            

  
    <label for="fraisSuppLiesHandicap.${collectionIndex}.periodicite" class="required"><g:message code="myr.property.periodicite.label" /> *  <span><g:message code="myr.property.periodicite.help" /></span></label>
            <select id="fraisSuppLiesHandicap.${collectionIndex}.periodicite" name="fraisSuppLiesHandicap[${collectionIndex}].periodicite" class="required  validate-not-first ${rqt.stepStates['allocationEducationEnfantHandicape'].invalidFields.contains('fraisSuppLiesHandicap['+collectionIndex+'].periodicite') ? 'validation-failed' : ''}" title="<g:message code="myr.property.periodicite.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['Semaine','Mois','Annee','Occasionnelle']}">
                <option value="fr.cg95.cvq.business.request.social.PeriodiciteFraisSuppType_${it}" ${it == currentCollectionItem?.periodicite?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="myr.property.periodicite" /></option>
              </g:each>
            </select>
            

  
  <input type="hidden" name="currentCollection" value="${currentCollection}" />
  <input type="hidden" name="collectionIndex" value="${collectionIndex}" />
  <input type="submit" id="collectionSave" name="collectionSave" value="${message(code:'action.' + (currentCollectionItem != null ? 'save' : 'add'))}" />
  <a href="${createLink(controller : 'frontofficeRequest', action : 'edit', params:['id': rqt.id, 'currentStep': 'allocationEducationEnfantHandicape'])}">
    ${message(code:'request.action.backToMainForm')}
  </a>
  
