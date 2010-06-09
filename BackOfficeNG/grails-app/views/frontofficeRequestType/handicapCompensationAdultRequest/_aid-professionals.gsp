

  <label class="condition-isProfessionals-filled"><g:message code="hcar.property.professionals.label" /> <span><g:message code="hcar.property.professionals.help" /></span></label>
  <div class="collection-fieldset condition-isProfessionals-filled validation-scope summary-box">
    <fieldset class="collection-fieldset-add condition-isProfessionals-filled">
    <g:set var="currentCollectionItem" value="${rqt?.professionals.size() > collectionIndex ? rqt.professionals.get(collectionIndex) : null}" />
  
      <label for="professionals.${collectionIndex}.professionalLastName" class="required"><g:message code="hcar.property.professionalLastName.label" /> *  <span><g:message code="hcar.property.professionalLastName.help" /></span></label>
            <input type="text" id="professionals.${collectionIndex}.professionalLastName" name="professionals[${collectionIndex}].professionalLastName" value="${currentCollectionItem?.professionalLastName?.toString()}" 
                    class="required  validate-lastName ${rqt.stepStates['aid'].invalidFields.contains('professionals.professionalLastName') ? 'validation-failed' : ''}" title="<g:message code="hcar.property.professionalLastName.validationError" />"  maxlength="38" />
            

  
      <label for="professionals.${collectionIndex}.professionalFirstName" class="required"><g:message code="hcar.property.professionalFirstName.label" /> *  <span><g:message code="hcar.property.professionalFirstName.help" /></span></label>
            <input type="text" id="professionals.${collectionIndex}.professionalFirstName" name="professionals[${collectionIndex}].professionalFirstName" value="${currentCollectionItem?.professionalFirstName?.toString()}" 
                    class="required  validate-firstName ${rqt.stepStates['aid'].invalidFields.contains('professionals.professionalFirstName') ? 'validation-failed' : ''}" title="<g:message code="hcar.property.professionalFirstName.validationError" />"  maxlength="38" />
            

  
      <label class="required"><g:message code="hcar.property.professionalAddress.label" /> *  <span><g:message code="hcar.property.professionalAddress.help" /></span></label>
            <div class="address-fieldset required  ${rqt.stepStates['aid'].invalidFields.contains('professionals.professionalAddress') ? 'validation-failed' : ''}">
            <label for="professionals.${collectionIndex}.professionalAddress.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['aid'].invalidFields.contains('professionals.professionalAddress.additionalDeliveryInformation') ? 'validation-failed' : ''}" value="${currentCollectionItem?.professionalAddress?.additionalDeliveryInformation}" maxlength="38" id="professionals.${collectionIndex}.professionalAddress.additionalDeliveryInformation" name="professionals[${collectionIndex}].professionalAddress.additionalDeliveryInformation" />  
            <label for="professionals.${collectionIndex}.professionalAddress.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['aid'].invalidFields.contains('professionals.professionalAddress.additionalGeographicalInformation') ? 'validation-failed' : ''}" value="${currentCollectionItem?.professionalAddress?.additionalGeographicalInformation}" maxlength="38" id="professionals.${collectionIndex}.professionalAddress.additionalGeographicalInformation" name="professionals[${collectionIndex}].professionalAddress.additionalGeographicalInformation" />
            <label for="professionals.${collectionIndex}.professionalAddress.streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="professionals.${collectionIndex}.professionalAddress.streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1 validate-streetNumber ${rqt.stepStates['aid'].invalidFields.contains('professionals.professionalAddress.streetNumber') ? 'validation-failed' : ''}" value="${currentCollectionItem?.professionalAddress?.streetNumber}" size="5" maxlength="5" id="professionals.${collectionIndex}.professionalAddress.streetNumber" name="professionals[${collectionIndex}].professionalAddress.streetNumber" />
            <input type="text" class="line2 required validate-streetName ${rqt.stepStates['aid'].invalidFields.contains('professionals.professionalAddress.streetName') ? 'validation-failed' : ''}" value="${currentCollectionItem?.professionalAddress?.streetName}" maxlength="32" id="professionals.${collectionIndex}.professionalAddress.streetName" name="professionals[${collectionIndex}].professionalAddress.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <label for="professionals.${collectionIndex}.professionalAddress.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['aid'].invalidFields.contains('professionals.professionalAddress.placeNameOrService') ? 'validation-failed' : ''}" value="${currentCollectionItem?.professionalAddress?.placeNameOrService}" maxlength="38" id="professionals.${collectionIndex}.professionalAddress.placeNameOrService" name="professionals[${collectionIndex}].professionalAddress.placeNameOrService" />
            <label for="professionals.${collectionIndex}.professionalAddress.postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="professionals.${collectionIndex}.professionalAddress.city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required validate-postalCode ${rqt.stepStates['aid'].invalidFields.contains('professionals.professionalAddress.postalCode') ? 'validation-failed' : ''}" value="${currentCollectionItem?.professionalAddress?.postalCode}" size="5" maxlength="5" id="professionals.${collectionIndex}.professionalAddress.postalCode" name="professionals[${collectionIndex}].professionalAddress.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required validate-city ${rqt.stepStates['aid'].invalidFields.contains('professionals.professionalAddress.city') ? 'validation-failed' : ''}" value="${currentCollectionItem?.professionalAddress?.city}" maxlength="32" id="professionals.${collectionIndex}.professionalAddress.city" name="professionals[${collectionIndex}].professionalAddress.city" title="<g:message code="address.property.city.validationError" />" />
            <label for="professionals.${collectionIndex}.professionalAddress.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['aid'].invalidFields.contains('professionals.professionalAddress.countryName') ? 'validation-failed' : ''}" value="${currentCollectionItem?.professionalAddress?.countryName}" maxlength="38" id="professionals.${collectionIndex}.professionalAddress.countryName" name="professionals[${collectionIndex}].professionalAddress.countryName" />
            </div>
            

  
      <input type="hidden" name="currentCollection" value="${currentCollection}" />
      <input type="hidden" name="collectionIndex" value="${collectionIndex}" />
      <input type="submit" id="submit-step-aid-professionals" name="submit-step-aid-professionals[${collectionIndex}]" value="${message(code:'action.save')}" />
      <a href="${createLink(controller : 'frontofficeRequest', action : 'edit', params:['id': rqt.id, 'currentStep': 'aid'])}">
        ${message(code:'request.action.cancelCollectionItemEdit')}
      </a>  
    </fieldset>
</div>
  