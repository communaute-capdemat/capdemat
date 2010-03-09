


  
    <label for="representantLegal" class="required"><g:message code="mar.property.representantLegal.label" /> *  <span><g:message code="mar.property.representantLegal.help" /></span></label>
            <select id="representantLegal" name="representantLegal" class="required condition-representantLegal-trigger  validate-not-first ${rqt.stepStates['representantLegal'].invalidFields.contains('representantLegal') ? 'validation-failed' : ''}" title="<g:message code="mar.property.representantLegal.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['Tutelle','CuratelleSimple','CuratelleRenforcee','Autre']}">
                <option value="fr.cg95.cvq.business.request.social.RepresentantLegalType_${it}" ${it == rqt.representantLegal?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mar.property.representantLegal" /></option>
              </g:each>
            </select>
            

  

  
    <label for="nomResponsableLegal" class="required condition-representantLegal-filled"><g:message code="mar.property.nomResponsableLegal.label" /> *  <span><g:message code="mar.property.nomResponsableLegal.help" /></span></label>
            <input type="text" id="nomResponsableLegal" name="nomResponsableLegal" value="${rqt.nomResponsableLegal?.toString()}" 
                    class="required condition-representantLegal-filled  validate-string ${rqt.stepStates['representantLegal'].invalidFields.contains('nomResponsableLegal') ? 'validation-failed' : ''}" title="<g:message code="mar.property.nomResponsableLegal.validationError" />"   />
            

  

  
    <label class="required condition-representantLegal-filled"><g:message code="mar.property.adresseResponsableLegal.label" /> *  <span><g:message code="mar.property.adresseResponsableLegal.help" /></span></label>
            <div id="adresseResponsableLegal" class="address required condition-representantLegal-filled  ${rqt.stepStates['representantLegal'].invalidFields.contains('adresseResponsableLegal') ? 'validation-failed' : ''}">
            <label for="adresseResponsableLegal.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['representantLegal'].invalidFields.contains('adresseResponsableLegal.additionalDeliveryInformation') ? 'validation-failed' : ''}" value="${rqt.adresseResponsableLegal?.additionalDeliveryInformation}" maxlength="38" id="adresseResponsableLegal.additionalDeliveryInformation" name="adresseResponsableLegal.additionalDeliveryInformation" />  
            <label for="adresseResponsableLegal.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['representantLegal'].invalidFields.contains('adresseResponsableLegal.additionalGeographicalInformation') ? 'validation-failed' : ''}" value="${rqt.adresseResponsableLegal?.additionalGeographicalInformation}" maxlength="38" id="adresseResponsableLegal.additionalGeographicalInformation" name="adresseResponsableLegal.additionalGeographicalInformation" />
            <label for="adresseResponsableLegal_streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="adresseResponsableLegal_streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1 validate-streetNumber ${rqt.stepStates['representantLegal'].invalidFields.contains('adresseResponsableLegal.streetNumber') ? 'validation-failed' : ''}" value="${rqt.adresseResponsableLegal?.streetNumber}" size="5" maxlength="5" id="adresseResponsableLegal_streetNumber" name="adresseResponsableLegal.streetNumber" />
            <input type="text" class="line2 required validate-streetName ${rqt.stepStates['representantLegal'].invalidFields.contains('adresseResponsableLegal.streetName') ? 'validation-failed' : ''}" value="${rqt.adresseResponsableLegal?.streetName}" maxlength="32" id="adresseResponsableLegal_streetName" name="adresseResponsableLegal.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <input type="hidden" value="${rqt.adresseResponsableLegal?.streetMatriculation}" id="adresseResponsableLegal_streetMatriculation" name="adresseResponsableLegal.streetMatriculation" />
            <input type="hidden" value="${rqt.adresseResponsableLegal?.streetRivoliCode}" id="adresseResponsableLegal_streetRivoliCode" name="adresseResponsableLegal.streetRivoliCode" />
            <label for="adresseResponsableLegal.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['representantLegal'].invalidFields.contains('adresseResponsableLegal.placeNameOrService') ? 'validation-failed' : ''}" value="${rqt.adresseResponsableLegal?.placeNameOrService}" maxlength="38" id="adresseResponsableLegal.placeNameOrService" name="adresseResponsableLegal.placeNameOrService" />
            <label for="adresseResponsableLegal_postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="adresseResponsableLegal_city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required validate-postalCode ${rqt.stepStates['representantLegal'].invalidFields.contains('adresseResponsableLegal.postalCode') ? 'validation-failed' : ''}" value="${rqt.adresseResponsableLegal?.postalCode}" size="5" maxlength="5" id="adresseResponsableLegal_postalCode" name="adresseResponsableLegal.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required validate-city ${rqt.stepStates['representantLegal'].invalidFields.contains('adresseResponsableLegal.city') ? 'validation-failed' : ''}" value="${rqt.adresseResponsableLegal?.city}" maxlength="32" id="adresseResponsableLegal_city" name="adresseResponsableLegal.city" title="<g:message code="address.property.city.validationError" />" />
            <input type="hidden" value="${rqt.adresseResponsableLegal?.cityInseeCode}" id="adresseResponsableLegal_cityInseeCode" name="adresseResponsableLegal.cityInseeCode" />
            <label for="adresseResponsableLegal.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['representantLegal'].invalidFields.contains('adresseResponsableLegal.countryName') ? 'validation-failed' : ''}" value="${rqt.adresseResponsableLegal?.countryName}" maxlength="38" id="adresseResponsableLegal.countryName" name="adresseResponsableLegal.countryName" />
            </div>
            

  

  
    <label for="telResponsableLegal" class="required condition-representantLegal-filled"><g:message code="mar.property.telResponsableLegal.label" /> *  <span><g:message code="mar.property.telResponsableLegal.help" /></span></label>
            <input type="text" id="telResponsableLegal" name="telResponsableLegal" value="${rqt.telResponsableLegal?.toString()}" 
                    class="required condition-representantLegal-filled  validate-phone ${rqt.stepStates['representantLegal'].invalidFields.contains('telResponsableLegal') ? 'validation-failed' : ''}" title="<g:message code="mar.property.telResponsableLegal.validationError" />"  maxlength="10" />
            

  

  
    <label for="faxResponsableLegal" class="condition-representantLegal-filled"><g:message code="mar.property.faxResponsableLegal.label" />   <span><g:message code="mar.property.faxResponsableLegal.help" /></span></label>
            <input type="text" id="faxResponsableLegal" name="faxResponsableLegal" value="${rqt.faxResponsableLegal?.toString()}" 
                    class="condition-representantLegal-filled  validate-phone ${rqt.stepStates['representantLegal'].invalidFields.contains('faxResponsableLegal') ? 'validation-failed' : ''}" title="<g:message code="mar.property.faxResponsableLegal.validationError" />"  maxlength="10" />
            

  

  
    <label for="emailResponsableLegal" class="condition-representantLegal-filled"><g:message code="mar.property.emailResponsableLegal.label" />   <span><g:message code="mar.property.emailResponsableLegal.help" /></span></label>
            <input type="text" id="emailResponsableLegal" name="emailResponsableLegal" value="${rqt.emailResponsableLegal?.toString()}" 
                    class="condition-representantLegal-filled  validate-email ${rqt.stepStates['representantLegal'].invalidFields.contains('emailResponsableLegal') ? 'validation-failed' : ''}" title="<g:message code="mar.property.emailResponsableLegal.validationError" />"   />
            

  

