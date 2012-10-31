


  
    <fieldset class="required">
    <legend><g:message code="dhr.property.dhrFamilyReferent.label" /></legend>
    
      <label class="required"><g:message code="dhr.property.dhrHaveFamilyReferent.label" /> *  <span><g:message code="dhr.property.dhrHaveFamilyReferent.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['familyReferent'].invalidFields.contains('dhrFamilyReferent.dhrHaveFamilyReferent') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="dhrFamilyReferent.dhrHaveFamilyReferent_${it ? 'yes' : 'no'}" class="required condition-haveFamilyReferent-trigger  validate-one-required boolean" title="" value="${it}" name="dhrFamilyReferent.dhrHaveFamilyReferent" ${ rqt.dhrFamilyReferent ?  (it == rqt.dhrFamilyReferent?.dhrHaveFamilyReferent ? 'checked="checked"': '') : (it == false ? 'checked="checked"': '') } />
                <label for="dhrFamilyReferent.dhrHaveFamilyReferent_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label for="dhrFamilyReferent.dhrReferentName" class="required condition-haveFamilyReferent-filled"><g:message code="dhr.property.dhrReferentName.label" /> *  <span><g:message code="dhr.property.dhrReferentName.help" /></span></label>
            <input type="text" id="dhrFamilyReferent.dhrReferentName" name="dhrFamilyReferent.dhrReferentName" value="${rqt.dhrFamilyReferent?.dhrReferentName?.toString()}" 
                    class="required condition-haveFamilyReferent-filled  validate-lastName ${rqt.stepStates['familyReferent'].invalidFields.contains('dhrFamilyReferent.dhrReferentName') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrReferentName.validationError" />"  maxlength="38" />
            

    
      <label for="dhrFamilyReferent.dhrReferentFirstName" class="required condition-haveFamilyReferent-filled"><g:message code="dhr.property.dhrReferentFirstName.label" /> *  <span><g:message code="dhr.property.dhrReferentFirstName.help" /></span></label>
            <input type="text" id="dhrFamilyReferent.dhrReferentFirstName" name="dhrFamilyReferent.dhrReferentFirstName" value="${rqt.dhrFamilyReferent?.dhrReferentFirstName?.toString()}" 
                    class="required condition-haveFamilyReferent-filled  validate-firstName ${rqt.stepStates['familyReferent'].invalidFields.contains('dhrFamilyReferent.dhrReferentFirstName') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrReferentFirstName.validationError" />"  maxlength="38" />
            

    
      <label class="required condition-haveFamilyReferent-filled"><g:message code="dhr.property.dhrReferentAddress.label" /> *  <span><g:message code="dhr.property.dhrReferentAddress.help" /></span></label>
            <div id="dhrFamilyReferent.dhrReferentAddress" class="address required condition-haveFamilyReferent-filled  ${rqt.stepStates['familyReferent'].invalidFields.contains('dhrFamilyReferent.dhrReferentAddress') ? 'validation-failed' : ''}">
            <label for="dhrFamilyReferent.dhrReferentAddress.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['familyReferent'].invalidFields.contains('dhrFamilyReferent.dhrReferentAddress.additionalDeliveryInformation') ? 'validation-failed' : ''}" value="${rqt.dhrFamilyReferent?.dhrReferentAddress?.additionalDeliveryInformation}" maxlength="38" id="dhrFamilyReferent.dhrReferentAddress.additionalDeliveryInformation" name="dhrFamilyReferent.dhrReferentAddress.additionalDeliveryInformation" />  
            <label for="dhrFamilyReferent.dhrReferentAddress.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['familyReferent'].invalidFields.contains('dhrFamilyReferent.dhrReferentAddress.additionalGeographicalInformation') ? 'validation-failed' : ''}" value="${rqt.dhrFamilyReferent?.dhrReferentAddress?.additionalGeographicalInformation}" maxlength="38" id="dhrFamilyReferent.dhrReferentAddress.additionalGeographicalInformation" name="dhrFamilyReferent.dhrReferentAddress.additionalGeographicalInformation" />
            <label for="dhrFamilyReferent.dhrReferentAddress_streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="dhrFamilyReferent.dhrReferentAddress_streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1 validate-streetNumber ${rqt.stepStates['familyReferent'].invalidFields.contains('dhrFamilyReferent.dhrReferentAddress.streetNumber') ? 'validation-failed' : ''}" value="${rqt.dhrFamilyReferent?.dhrReferentAddress?.streetNumber}" size="5" maxlength="5" id="dhrFamilyReferent.dhrReferentAddress_streetNumber" name="dhrFamilyReferent.dhrReferentAddress.streetNumber" />
            <input type="text" class="line2 required validate-streetName ${rqt.stepStates['familyReferent'].invalidFields.contains('dhrFamilyReferent.dhrReferentAddress.streetName') ? 'validation-failed' : ''}" value="${rqt.dhrFamilyReferent?.dhrReferentAddress?.streetName}" maxlength="32" id="dhrFamilyReferent.dhrReferentAddress_streetName" name="dhrFamilyReferent.dhrReferentAddress.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <input type="hidden" value="${rqt.dhrFamilyReferent?.dhrReferentAddress?.streetMatriculation}" id="dhrFamilyReferent.dhrReferentAddress_streetMatriculation" name="dhrFamilyReferent.dhrReferentAddress.streetMatriculation" />
            <input type="hidden" value="${rqt.dhrFamilyReferent?.dhrReferentAddress?.streetRivoliCode}" id="dhrFamilyReferent.dhrReferentAddress_streetRivoliCode" name="dhrFamilyReferent.dhrReferentAddress.streetRivoliCode" />
            <label for="dhrFamilyReferent.dhrReferentAddress.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['familyReferent'].invalidFields.contains('dhrFamilyReferent.dhrReferentAddress.placeNameOrService') ? 'validation-failed' : ''}" value="${rqt.dhrFamilyReferent?.dhrReferentAddress?.placeNameOrService}" maxlength="38" id="dhrFamilyReferent.dhrReferentAddress.placeNameOrService" name="dhrFamilyReferent.dhrReferentAddress.placeNameOrService" />
            <label for="dhrFamilyReferent.dhrReferentAddress_postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="dhrFamilyReferent.dhrReferentAddress_city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required validate-postalCode ${rqt.stepStates['familyReferent'].invalidFields.contains('dhrFamilyReferent.dhrReferentAddress.postalCode') ? 'validation-failed' : ''}" value="${rqt.dhrFamilyReferent?.dhrReferentAddress?.postalCode}" size="5" maxlength="5" id="dhrFamilyReferent.dhrReferentAddress_postalCode" name="dhrFamilyReferent.dhrReferentAddress.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required validate-city ${rqt.stepStates['familyReferent'].invalidFields.contains('dhrFamilyReferent.dhrReferentAddress.city') ? 'validation-failed' : ''}" value="${rqt.dhrFamilyReferent?.dhrReferentAddress?.city}" maxlength="32" id="dhrFamilyReferent.dhrReferentAddress_city" name="dhrFamilyReferent.dhrReferentAddress.city" title="<g:message code="address.property.city.validationError" />" />
            <input type="hidden" value="${rqt.dhrFamilyReferent?.dhrReferentAddress?.cityInseeCode}" id="dhrFamilyReferent.dhrReferentAddress_cityInseeCode" name="dhrFamilyReferent.dhrReferentAddress.cityInseeCode" />
            <label for="dhrFamilyReferent.dhrReferentAddress.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['familyReferent'].invalidFields.contains('dhrFamilyReferent.dhrReferentAddress.countryName') ? 'validation-failed' : ''}" value="${rqt.dhrFamilyReferent?.dhrReferentAddress?.countryName}" maxlength="38" id="dhrFamilyReferent.dhrReferentAddress.countryName" name="dhrFamilyReferent.dhrReferentAddress.countryName" />
            </div>
            

    
    </fieldset>
  

