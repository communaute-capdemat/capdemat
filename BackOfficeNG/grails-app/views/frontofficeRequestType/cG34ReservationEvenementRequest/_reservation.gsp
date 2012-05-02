


  
    <label for="idEvenement" class="required"><g:message code="crer.property.idEvenement.label" /> *  <span><g:message code="crer.property.idEvenement.help" /></span></label>
            <input type="text" id="idEvenement" name="idEvenement" value="${rqt.idEvenement?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['reservation'].invalidFields.contains('idEvenement') ? 'validation-failed' : ''}" title="<g:message code="crer.property.idEvenement.validationError" />"   />
            

  

  
    <label for="idPrestation" class="required"><g:message code="crer.property.idPrestation.label" /> *  <span><g:message code="crer.property.idPrestation.help" /></span></label>
            <input type="text" id="idPrestation" name="idPrestation" value="${rqt.idPrestation?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['reservation'].invalidFields.contains('idPrestation') ? 'validation-failed' : ''}" title="<g:message code="crer.property.idPrestation.validationError" />"   />
            

  

  
    <label for="labelReservation" class="required"><g:message code="crer.property.labelReservation.label" /> *  <span><g:message code="crer.property.labelReservation.help" /></span></label>
            <input type="text" id="labelReservation" name="labelReservation" value="${rqt.labelReservation?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['reservation'].invalidFields.contains('labelReservation') ? 'validation-failed' : ''}" title="<g:message code="crer.property.labelReservation.validationError" />"   />
            

  

  
    <div class="collection required summary-box">
      <h4 class="required"><g:message code="crer.property.reservations.label" /> 
        <span><g:message code="crer.property.reservations.help" /></span>
      </h4>
      <p>
        <g:message code="request.message.howToAddCollectionItem" />
        <a href="${createLink(controller : 'frontofficeRequest', action : 'edit', params:['id':rqt.id, 'currentStep':'reservation', 'currentCollection':'reservations', 'collectionIndex':(rqt.reservations ? rqt.reservations.size() : 0)])}" style="font-size:1.3em;" />
          ${message(code:'request.action.newCollectionItem')}
        </a>
      </p>
    <g:each var="it" in="${rqt.reservations}" status="index">
      <div class="item">
        <dl>
        <dt class="head"><g:message code="crer.property.reservations.label" /> : ${index + 1}</dt>
        <dd class="head">
          <a href="${createLink(controller : 'frontofficeRequest', action : 'edit', params:['id':rqt.id, 'currentStep':'reservation', 'currentCollection':'reservations', 'collectionIndex':index])}">
           ${message(code:'request.action.editCollectionItem')}
         </a>&nbsp;
         <a href="${createLink(controller : 'frontofficeRequest', action : 'collectionRemove', params:['id':rqt.id, 'currentStep':'reservation', 'currentCollection':'reservations', 'collectionIndex':index])}">
           ${message(code:'request.action.deleteCollectionItem')}
         </a>
        </dd>
    
        <dt><g:message code="crer.property.reservationType.label" /></dt>
        <dd class="${rqt.stepStates['reservation'].invalidFields.contains('reservations[' + index + '].reservationType') ? 'validation-failed' : ''}">${it.reservationType?.toString()}</dd>
    
        <dt><g:message code="crer.property.nombrePlaces.label" /></dt>
        <dd class="${rqt.stepStates['reservation'].invalidFields.contains('reservations[' + index + '].nombrePlaces') ? 'validation-failed' : ''}">${it.nombrePlaces?.toString()}</dd>
    
        </dl>
      </div>
    </g:each>
    </div>
  

  
    <label for="dispositionParticuliere" class=""><g:message code="crer.property.dispositionParticuliere.label" />   <span><g:message code="crer.property.dispositionParticuliere.help" /></span></label>
            <input type="text" id="dispositionParticuliere" name="dispositionParticuliere" value="${rqt.dispositionParticuliere?.toString()}" 
                    class="  validate-string ${rqt.stepStates['reservation'].invalidFields.contains('dispositionParticuliere') ? 'validation-failed' : ''}" title="<g:message code="crer.property.dispositionParticuliere.validationError" />"   />
            

  

