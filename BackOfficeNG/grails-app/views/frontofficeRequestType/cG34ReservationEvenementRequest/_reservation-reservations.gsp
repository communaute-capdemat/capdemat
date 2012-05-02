
  <g:set var="currentCollectionItem" value="${rqt?.reservations.size() > collectionIndex ? rqt.reservations.get(collectionIndex) : null}" />
  <h4>
    ${message(code:'crer.property.reservations.label')}
    <span>
      <g:if test="${currentCollectionItem != null}">
        ${message(code:'request.message.editCollectionItem', args:[collectionIndex + 1])}
      </g:if>
      <g:else>
        ${message(code:'request.message.addCollectionItem')}
      </g:else>
    </span>
  </h4>
  
    <label for="reservations.${collectionIndex}.reservationType" class="required"><g:message code="crer.property.reservationType.label" /> *  <span><g:message code="crer.property.reservationType.help" /></span></label>
            <input type="text" id="reservations.${collectionIndex}.reservationType" name="reservations[${collectionIndex}].reservationType" value="${currentCollectionItem?.reservationType?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['reservation'].invalidFields.contains('reservations['+collectionIndex+'].reservationType') ? 'validation-failed' : ''}" title="<g:message code="crer.property.reservationType.validationError" />"   />
            

  
    <label for="reservations.${collectionIndex}.nombrePlaces" class="required"><g:message code="crer.property.nombrePlaces.label" /> *  <span><g:message code="crer.property.nombrePlaces.help" /></span></label>
            <input type="text" id="reservations.${collectionIndex}.nombrePlaces" name="reservations[${collectionIndex}].nombrePlaces" value="${currentCollectionItem?.nombrePlaces?.toString()}" 
                    class="required  validate-positiveInteger ${rqt.stepStates['reservation'].invalidFields.contains('reservations['+collectionIndex+'].nombrePlaces') ? 'validation-failed' : ''}" title="<g:message code="crer.property.nombrePlaces.validationError" />"   />
            

  
  <input type="hidden" name="currentCollection" value="${currentCollection}" />
  <input type="hidden" name="collectionIndex" value="${collectionIndex}" />
  <input type="submit" id="collectionSave" name="collectionSave" value="${message(code:'action.' + (currentCollectionItem != null ? 'save' : 'add'))}" />
  <a href="${createLink(controller : 'frontofficeRequest', action : 'edit', params:['id': rqt.id, 'currentStep': 'reservation'])}">
    ${message(code:'request.action.backToMainForm')}
  </a>
  
