


  
    <label for="numeroAllocataire" class="required"><g:message code="myr.property.numeroAllocataire.label" /> *  <span><g:message code="myr.property.numeroAllocataire.help" /></span></label>
            <input type="text" id="numeroAllocataire" name="numeroAllocataire" value="${rqt.numeroAllocataire?.toString()}" 
                    class="required  validate-regex ${rqt.stepStates['organismePrestationFamiliale'].invalidFields.contains('numeroAllocataire') ? 'validation-failed' : ''}" title="<g:message code="myr.property.numeroAllocataire.validationError" />" regex="^.{0,50}$"  />
            

  

  
    <label for="organismePayeur" class="required"><g:message code="myr.property.organismePayeur.label" /> *  <span><g:message code="myr.property.organismePayeur.help" /></span></label>
            <select id="organismePayeur" name="organismePayeur" class="required  validate-not-first ${rqt.stepStates['organismePrestationFamiliale'].invalidFields.contains('organismePayeur') ? 'validation-failed' : ''}" title="<g:message code="myr.property.organismePayeur.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['Caf','Msa','Autre']}">
                <option value="fr.cg95.cvq.business.request.social.MyrOrganismePayeurType_${it}" ${it == rqt.organismePayeur?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="myr.property.organismePayeur" /></option>
              </g:each>
            </select>
            

  

  
    <label for="nomAllocataire" class="required"><g:message code="myr.property.nomAllocataire.label" /> *  <span><g:message code="myr.property.nomAllocataire.help" /></span></label>
            <input type="text" id="nomAllocataire" name="nomAllocataire" value="${rqt.nomAllocataire?.toString()}" 
                    class="required  validate-lastName ${rqt.stepStates['organismePrestationFamiliale'].invalidFields.contains('nomAllocataire') ? 'validation-failed' : ''}" title="<g:message code="myr.property.nomAllocataire.validationError" />"  maxlength="38" />
            

  

  
    <label for="prenomAllocataire" class="required"><g:message code="myr.property.prenomAllocataire.label" /> *  <span><g:message code="myr.property.prenomAllocataire.help" /></span></label>
            <input type="text" id="prenomAllocataire" name="prenomAllocataire" value="${rqt.prenomAllocataire?.toString()}" 
                    class="required  validate-firstName ${rqt.stepStates['organismePrestationFamiliale'].invalidFields.contains('prenomAllocataire') ? 'validation-failed' : ''}" title="<g:message code="myr.property.prenomAllocataire.validationError" />"  maxlength="38" />
            

  

  
    <label for="nomOrganismePayeur" class=""><g:message code="myr.property.nomOrganismePayeur.label" />   <span><g:message code="myr.property.nomOrganismePayeur.help" /></span></label>
            <input type="text" id="nomOrganismePayeur" name="nomOrganismePayeur" value="${rqt.nomOrganismePayeur?.toString()}" 
                    class="  validate-string ${rqt.stepStates['organismePrestationFamiliale'].invalidFields.contains('nomOrganismePayeur') ? 'validation-failed' : ''}" title="<g:message code="myr.property.nomOrganismePayeur.validationError" />"   />
            

  

  
    <label class=""><g:message code="myr.property.domiciliationOrganismePayeur.label" />   <span><g:message code="myr.property.domiciliationOrganismePayeur.help" /></span></label>
            <div id="domiciliationOrganismePayeur" class="address   ${rqt.stepStates['organismePrestationFamiliale'].invalidFields.contains('domiciliationOrganismePayeur') ? 'validation-failed' : ''}">
            <label for="domiciliationOrganismePayeur.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['organismePrestationFamiliale'].invalidFields.contains('domiciliationOrganismePayeur.additionalDeliveryInformation') ? 'validation-failed' : ''}" value="${rqt.domiciliationOrganismePayeur?.additionalDeliveryInformation}" maxlength="38" id="domiciliationOrganismePayeur.additionalDeliveryInformation" name="domiciliationOrganismePayeur.additionalDeliveryInformation" />  
            <label for="domiciliationOrganismePayeur.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['organismePrestationFamiliale'].invalidFields.contains('domiciliationOrganismePayeur.additionalGeographicalInformation') ? 'validation-failed' : ''}" value="${rqt.domiciliationOrganismePayeur?.additionalGeographicalInformation}" maxlength="38" id="domiciliationOrganismePayeur.additionalGeographicalInformation" name="domiciliationOrganismePayeur.additionalGeographicalInformation" />
            <label for="domiciliationOrganismePayeur_streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="domiciliationOrganismePayeur_streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1 validate-streetNumber ${rqt.stepStates['organismePrestationFamiliale'].invalidFields.contains('domiciliationOrganismePayeur.streetNumber') ? 'validation-failed' : ''}" value="${rqt.domiciliationOrganismePayeur?.streetNumber}" size="5" maxlength="5" id="domiciliationOrganismePayeur_streetNumber" name="domiciliationOrganismePayeur.streetNumber" />
            <input type="text" class="line2 required validate-streetName ${rqt.stepStates['organismePrestationFamiliale'].invalidFields.contains('domiciliationOrganismePayeur.streetName') ? 'validation-failed' : ''}" value="${rqt.domiciliationOrganismePayeur?.streetName}" maxlength="32" id="domiciliationOrganismePayeur_streetName" name="domiciliationOrganismePayeur.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <input type="hidden" value="${rqt.domiciliationOrganismePayeur?.streetMatriculation}" id="domiciliationOrganismePayeur_streetMatriculation" name="domiciliationOrganismePayeur.streetMatriculation" />
            <input type="hidden" value="${rqt.domiciliationOrganismePayeur?.streetRivoliCode}" id="domiciliationOrganismePayeur_streetRivoliCode" name="domiciliationOrganismePayeur.streetRivoliCode" />
            <label for="domiciliationOrganismePayeur.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['organismePrestationFamiliale'].invalidFields.contains('domiciliationOrganismePayeur.placeNameOrService') ? 'validation-failed' : ''}" value="${rqt.domiciliationOrganismePayeur?.placeNameOrService}" maxlength="38" id="domiciliationOrganismePayeur.placeNameOrService" name="domiciliationOrganismePayeur.placeNameOrService" />
            <label for="domiciliationOrganismePayeur_postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="domiciliationOrganismePayeur_city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required validate-postalCode ${rqt.stepStates['organismePrestationFamiliale'].invalidFields.contains('domiciliationOrganismePayeur.postalCode') ? 'validation-failed' : ''}" value="${rqt.domiciliationOrganismePayeur?.postalCode}" size="5" maxlength="5" id="domiciliationOrganismePayeur_postalCode" name="domiciliationOrganismePayeur.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required validate-city ${rqt.stepStates['organismePrestationFamiliale'].invalidFields.contains('domiciliationOrganismePayeur.city') ? 'validation-failed' : ''}" value="${rqt.domiciliationOrganismePayeur?.city}" maxlength="32" id="domiciliationOrganismePayeur_city" name="domiciliationOrganismePayeur.city" title="<g:message code="address.property.city.validationError" />" />
            <input type="hidden" value="${rqt.domiciliationOrganismePayeur?.cityInseeCode}" id="domiciliationOrganismePayeur_cityInseeCode" name="domiciliationOrganismePayeur.cityInseeCode" />
            <label for="domiciliationOrganismePayeur.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['organismePrestationFamiliale'].invalidFields.contains('domiciliationOrganismePayeur.countryName') ? 'validation-failed' : ''}" value="${rqt.domiciliationOrganismePayeur?.countryName}" maxlength="38" id="domiciliationOrganismePayeur.countryName" name="domiciliationOrganismePayeur.countryName" />
            </div>
            

  

