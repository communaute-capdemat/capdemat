


  
    <label for="otherContactLastName" class="required"><g:message code="hsr.property.otherContactLastName.label" /> *  <span><g:message code="hsr.property.otherContactLastName.help" /></span></label>
            <input type="text" id="otherContactLastName" name="otherContactLastName" value="${rqt.otherContactLastName?.toString()}" 
                    class="required  validate-lastName" title="<g:message code="hsr.property.otherContactLastName.validationError" />"  maxlength="38" />
            

  

  
    <label for="otherContactFirstName" class="required"><g:message code="hsr.property.otherContactFirstName.label" /> *  <span><g:message code="hsr.property.otherContactFirstName.help" /></span></label>
            <input type="text" id="otherContactFirstName" name="otherContactFirstName" value="${rqt.otherContactFirstName?.toString()}" 
                    class="required  validate-firstName" title="<g:message code="hsr.property.otherContactFirstName.validationError" />"  maxlength="38" />
            

  

  
    <label class="required"><g:message code="hsr.property.otherContactAddress.label" /> *  <span><g:message code="hsr.property.otherContactAddress.help" /></span></label>
            <div class="address-fieldset required ">
            <label for="otherContactAddress.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" class="validate-addressLine38" value="${rqt.otherContactAddress?.additionalDeliveryInformation}" maxlength="38" id="otherContactAddress.additionalDeliveryInformation" name="otherContactAddress.additionalDeliveryInformation" />  
            <label for="otherContactAddress.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" class="validate-addressLine38" value="${rqt.otherContactAddress?.additionalGeographicalInformation}" maxlength="38" id="otherContactAddress.additionalGeographicalInformation" name="otherContactAddress.additionalGeographicalInformation" />
            <label for="otherContactAddress.streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="otherContactAddress.streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1 validate-streetNumber" value="${rqt.otherContactAddress?.streetNumber}" size="5" maxlength="5" id="otherContactAddress.streetNumber" name="otherContactAddress.streetNumber" />
            <input type="text" class="line2 required validate-streetName" value="${rqt.otherContactAddress?.streetName}" maxlength="32" id="otherContactAddress.streetName" name="otherContactAddress.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <label for="otherContactAddress.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" class="validate-addressLine38" value="${rqt.otherContactAddress?.placeNameOrService}" maxlength="38" id="otherContactAddress.placeNameOrService" name="otherContactAddress.placeNameOrService" />
            <label for="otherContactAddress.postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="otherContactAddress.city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required validate-postalCode" value="${rqt.otherContactAddress?.postalCode}" size="5" maxlength="5" id="otherContactAddress.postalCode" name="otherContactAddress.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required validate-city" value="${rqt.otherContactAddress?.city}" maxlength="32" id="otherContactAddress.city" name="otherContactAddress.city" title="<g:message code="address.property.city.validationError" />" />
            <label for="otherContactAddress.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" class="validate-addressLine38" value="${rqt.otherContactAddress?.countryName}" maxlength="38" id="otherContactAddress.countryName" name="otherContactAddress.countryName" />
            </div>
            

  

  
    <label for="otherContactPhone" class="required"><g:message code="hsr.property.otherContactPhone.label" /> *  <span><g:message code="hsr.property.otherContactPhone.help" /></span></label>
            <input type="text" id="otherContactPhone" name="otherContactPhone" value="${rqt.otherContactPhone?.toString()}" 
                    class="required  validate-phone" title="<g:message code="hsr.property.otherContactPhone.validationError" />"  maxlength="10" />
            

  
