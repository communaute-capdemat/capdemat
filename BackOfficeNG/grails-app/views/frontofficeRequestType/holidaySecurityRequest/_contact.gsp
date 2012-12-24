


  
    <label class="required"><g:message code="hsr.property.otherContact.label" /> *  <span><g:message code="hsr.property.otherContact.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['contact'].invalidFields.contains('otherContact') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="otherContact_${it ? 'yes' : 'no'}" class="required condition-isOtherContact-trigger  validate-one-required boolean" title="" value="${it}" name="otherContact" ${ rq ?  (it == rqt.otherContact ? 'checked="checked"': '') : (it == false ? 'checked="checked"': '') } />
                <label for="otherContact_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

  

  
    <fieldset class="required condition-isOtherContact-filled">
    <legend><g:message code="hsr.property.otherContactInformations.label" /></legend>
    
      <label for="otherContactInformations.otherContactLastName" class="required"><g:message code="hsr.property.otherContactLastName.label" /> *  <span><g:message code="hsr.property.otherContactLastName.help" /></span></label>
            <input type="text" id="otherContactInformations.otherContactLastName" name="otherContactInformations.otherContactLastName" value="${rqt.otherContactInformations?.otherContactLastName?.toString()}" 
                    class="required  validate-lastName ${rqt.stepStates['contact'].invalidFields.contains('otherContactInformations.otherContactLastName') ? 'validation-failed' : ''}" title="<g:message code="hsr.property.otherContactLastName.validationError" />"  maxlength="38" />
            

    
      <label for="otherContactInformations.otherContactFirstName" class="required"><g:message code="hsr.property.otherContactFirstName.label" /> *  <span><g:message code="hsr.property.otherContactFirstName.help" /></span></label>
            <input type="text" id="otherContactInformations.otherContactFirstName" name="otherContactInformations.otherContactFirstName" value="${rqt.otherContactInformations?.otherContactFirstName?.toString()}" 
                    class="required  validate-firstName ${rqt.stepStates['contact'].invalidFields.contains('otherContactInformations.otherContactFirstName') ? 'validation-failed' : ''}" title="<g:message code="hsr.property.otherContactFirstName.validationError" />"  maxlength="38" />
            

    
      <label class="required"><g:message code="hsr.property.otherContactAddress.label" /> *  <span><g:message code="hsr.property.otherContactAddress.help" /></span></label>
            <div id="otherContactInformations.otherContactAddress" class="address required  ${rqt.stepStates['contact'].invalidFields.contains('otherContactInformations.otherContactAddress') ? 'validation-failed' : ''}">
            <label for="otherContactInformations.otherContactAddress.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['contact'].invalidFields.contains('otherContactInformations.otherContactAddress.additionalDeliveryInformation') ? 'validation-failed' : ''}" value="${rqt.otherContactInformations?.otherContactAddress?.additionalDeliveryInformation}" maxlength="38" id="otherContactInformations.otherContactAddress.additionalDeliveryInformation" name="otherContactInformations.otherContactAddress.additionalDeliveryInformation" />  
            <label for="otherContactInformations.otherContactAddress.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['contact'].invalidFields.contains('otherContactInformations.otherContactAddress.additionalGeographicalInformation') ? 'validation-failed' : ''}" value="${rqt.otherContactInformations?.otherContactAddress?.additionalGeographicalInformation}" maxlength="38" id="otherContactInformations.otherContactAddress.additionalGeographicalInformation" name="otherContactInformations.otherContactAddress.additionalGeographicalInformation" />
            <label for="otherContactInformations.otherContactAddress_streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="otherContactInformations.otherContactAddress_streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1 validate-streetNumber ${rqt.stepStates['contact'].invalidFields.contains('otherContactInformations.otherContactAddress.streetNumber') ? 'validation-failed' : ''}" value="${rqt.otherContactInformations?.otherContactAddress?.streetNumber}" size="5" maxlength="5" id="otherContactInformations.otherContactAddress_streetNumber" name="otherContactInformations.otherContactAddress.streetNumber" />
            <input type="text" class="line2 required validate-streetName ${rqt.stepStates['contact'].invalidFields.contains('otherContactInformations.otherContactAddress.streetName') ? 'validation-failed' : ''}" value="${rqt.otherContactInformations?.otherContactAddress?.streetName}" maxlength="32" id="otherContactInformations.otherContactAddress_streetName" name="otherContactInformations.otherContactAddress.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <input type="hidden" value="${rqt.otherContactInformations?.otherContactAddress?.streetMatriculation}" id="otherContactInformations.otherContactAddress_streetMatriculation" name="otherContactInformations.otherContactAddress.streetMatriculation" />
            <input type="hidden" value="${rqt.otherContactInformations?.otherContactAddress?.streetRivoliCode}" id="otherContactInformations.otherContactAddress_streetRivoliCode" name="otherContactInformations.otherContactAddress.streetRivoliCode" />
            <label for="otherContactInformations.otherContactAddress.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['contact'].invalidFields.contains('otherContactInformations.otherContactAddress.placeNameOrService') ? 'validation-failed' : ''}" value="${rqt.otherContactInformations?.otherContactAddress?.placeNameOrService}" maxlength="38" id="otherContactInformations.otherContactAddress.placeNameOrService" name="otherContactInformations.otherContactAddress.placeNameOrService" />
            <label for="otherContactInformations.otherContactAddress_postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="otherContactInformations.otherContactAddress_city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required validate-postalCode ${rqt.stepStates['contact'].invalidFields.contains('otherContactInformations.otherContactAddress.postalCode') ? 'validation-failed' : ''}" value="${rqt.otherContactInformations?.otherContactAddress?.postalCode}" size="5" maxlength="5" id="otherContactInformations.otherContactAddress_postalCode" name="otherContactInformations.otherContactAddress.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required validate-city ${rqt.stepStates['contact'].invalidFields.contains('otherContactInformations.otherContactAddress.city') ? 'validation-failed' : ''}" value="${rqt.otherContactInformations?.otherContactAddress?.city}" maxlength="32" id="otherContactInformations.otherContactAddress_city" name="otherContactInformations.otherContactAddress.city" title="<g:message code="address.property.city.validationError" />" />
            <input type="hidden" value="${rqt.otherContactInformations?.otherContactAddress?.cityInseeCode}" id="otherContactInformations.otherContactAddress_cityInseeCode" name="otherContactInformations.otherContactAddress.cityInseeCode" />
            <label for="otherContactInformations.otherContactAddress.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['contact'].invalidFields.contains('otherContactInformations.otherContactAddress.countryName') ? 'validation-failed' : ''}" value="${rqt.otherContactInformations?.otherContactAddress?.countryName}" maxlength="38" id="otherContactInformations.otherContactAddress.countryName" name="otherContactInformations.otherContactAddress.countryName" />
            </div>
            

    
      <label for="otherContactInformations.otherContactPhone" class="required"><g:message code="hsr.property.otherContactPhone.label" /> *  <span><g:message code="hsr.property.otherContactPhone.help" /></span></label>
            <input type="text" id="otherContactInformations.otherContactPhone" name="otherContactInformations.otherContactPhone" value="${rqt.otherContactInformations?.otherContactPhone?.toString()}" 
                    class="required  validate-phone ${rqt.stepStates['contact'].invalidFields.contains('otherContactInformations.otherContactPhone') ? 'validation-failed' : ''}" title="<g:message code="hsr.property.otherContactPhone.validationError" />"  maxlength="10" />
            

    
    </fieldset>
  

