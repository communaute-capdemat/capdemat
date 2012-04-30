


  
    <label for="idEvenement" class="required"><g:message code="crer.property.idEvenement.label" /> *  <span><g:message code="crer.property.idEvenement.help" /></span></label>
            <input type="text" id="idEvenement" name="idEvenement" value="${rqt.idEvenement?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['reservation'].invalidFields.contains('idEvenement') ? 'validation-failed' : ''}" title="<g:message code="crer.property.idEvenement.validationError" />"   />
            

  

  
    <label for="idPrestation" class="required"><g:message code="crer.property.idPrestation.label" /> *  <span><g:message code="crer.property.idPrestation.help" /></span></label>
            <input type="text" id="idPrestation" name="idPrestation" value="${rqt.idPrestation?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['reservation'].invalidFields.contains('idPrestation') ? 'validation-failed' : ''}" title="<g:message code="crer.property.idPrestation.validationError" />"   />
            

  

  
    <label for="labelReservation" class="required"><g:message code="crer.property.labelReservation.label" /> *  <span><g:message code="crer.property.labelReservation.help" /></span></label>
            <input type="text" id="labelReservation" name="labelReservation" value="${rqt.labelReservation?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['reservation'].invalidFields.contains('labelReservation') ? 'validation-failed' : ''}" title="<g:message code="crer.property.labelReservation.validationError" />"   />
            

  

  
    <label for="typePrestation" class="required"><g:message code="crer.property.typePrestation.label" /> *  <span><g:message code="crer.property.typePrestation.help" /></span></label>
            <input type="text" id="typePrestation" name="typePrestation" value="${rqt.typePrestation?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['reservation'].invalidFields.contains('typePrestation') ? 'validation-failed' : ''}" title="<g:message code="crer.property.typePrestation.validationError" />"   />
            

  

  
    <label for="nombrePlaces" class="required"><g:message code="crer.property.nombrePlaces.label" /> *  <span><g:message code="crer.property.nombrePlaces.help" /></span></label>
            <input type="text" id="nombrePlaces" name="nombrePlaces" value="${rqt.nombrePlaces?.toString()}" 
                    class="required  validate-positiveInteger ${rqt.stepStates['reservation'].invalidFields.contains('nombrePlaces') ? 'validation-failed' : ''}" title="<g:message code="crer.property.nombrePlaces.validationError" />"   />
            

  

  
    <label for="dispositionParticuliere" class=""><g:message code="crer.property.dispositionParticuliere.label" />   <span><g:message code="crer.property.dispositionParticuliere.help" /></span></label>
            <input type="text" id="dispositionParticuliere" name="dispositionParticuliere" value="${rqt.dispositionParticuliere?.toString()}" 
                    class="  validate-string ${rqt.stepStates['reservation'].invalidFields.contains('dispositionParticuliere') ? 'validation-failed' : ''}" title="<g:message code="crer.property.dispositionParticuliere.validationError" />"   />
            

  

