


  
    <label for="deteneurAutoriteParentale" class="required"><g:message code="myr.property.deteneurAutoriteParentale.label" /> *  <span><g:message code="myr.property.deteneurAutoriteParentale.help" /></span></label>
            <select id="deteneurAutoriteParentale" name="deteneurAutoriteParentale" class="required condition-detenteurAutoriteParentaleOther-trigger condition-detenteurAutoriteParentalePere-trigger condition-detenteurAutoriteParentaleMere-trigger condition-detenteurAutoriteParentaleLesDeux-trigger  validate-not-first ${rqt.stepStates['autoriteParentale'].invalidFields.contains('deteneurAutoriteParentale') ? 'validation-failed' : ''}" title="<g:message code="myr.property.deteneurAutoriteParentale.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['MERE','PERE','LES_DEUX','AUTRE']}">
                <option value="${it}" ${it == rqt.deteneurAutoriteParentale?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="myr.property.deteneurAutoriteParentale" /></option>
              </g:each>
            </select>
            

  

  
    <fieldset class="condition-detenteurAutoriteParentaleMere-filled">
    <legend><g:message code="myr.property.autoriteParentaleMere.label" /></legend>
    
      <label for="autoriteParentaleMere.nom" class=""><g:message code="myr.property.nom.label" />   <span><g:message code="myr.property.nom.help" /></span></label>
            <input type="text" id="autoriteParentaleMere.nom" name="autoriteParentaleMere.nom" value="${rqt.autoriteParentaleMere?.nom?.toString()}" 
                    class="  validate-lastName ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleMere.nom') ? 'validation-failed' : ''}" title="<g:message code="myr.property.nom.validationError" />"  maxlength="38" />
            

    
      <label for="autoriteParentaleMere.prenom" class=""><g:message code="myr.property.prenom.label" />   <span><g:message code="myr.property.prenom.help" /></span></label>
            <input type="text" id="autoriteParentaleMere.prenom" name="autoriteParentaleMere.prenom" value="${rqt.autoriteParentaleMere?.prenom?.toString()}" 
                    class="  validate-firstName ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleMere.prenom') ? 'validation-failed' : ''}" title="<g:message code="myr.property.prenom.validationError" />"  maxlength="38" />
            

    
      <label class=""><g:message code="myr.property.domiciliation.label" />   <span><g:message code="myr.property.domiciliation.help" /></span></label>
            <div id="autoriteParentaleMere.domiciliation" class="address   ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleMere.domiciliation') ? 'validation-failed' : ''}">
            <label for="autoriteParentaleMere.domiciliation.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleMere.domiciliation.additionalDeliveryInformation') ? 'validation-failed' : ''}" value="${rqt.autoriteParentaleMere?.domiciliation?.additionalDeliveryInformation}" maxlength="38" id="autoriteParentaleMere.domiciliation.additionalDeliveryInformation" name="autoriteParentaleMere.domiciliation.additionalDeliveryInformation" />  
            <label for="autoriteParentaleMere.domiciliation.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleMere.domiciliation.additionalGeographicalInformation') ? 'validation-failed' : ''}" value="${rqt.autoriteParentaleMere?.domiciliation?.additionalGeographicalInformation}" maxlength="38" id="autoriteParentaleMere.domiciliation.additionalGeographicalInformation" name="autoriteParentaleMere.domiciliation.additionalGeographicalInformation" />
            <label for="autoriteParentaleMere.domiciliation_streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="autoriteParentaleMere.domiciliation_streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1 validate-streetNumber ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleMere.domiciliation.streetNumber') ? 'validation-failed' : ''}" value="${rqt.autoriteParentaleMere?.domiciliation?.streetNumber}" size="5" maxlength="5" id="autoriteParentaleMere.domiciliation_streetNumber" name="autoriteParentaleMere.domiciliation.streetNumber" />
            <input type="text" class="line2 required validate-streetName ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleMere.domiciliation.streetName') ? 'validation-failed' : ''}" value="${rqt.autoriteParentaleMere?.domiciliation?.streetName}" maxlength="32" id="autoriteParentaleMere.domiciliation_streetName" name="autoriteParentaleMere.domiciliation.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <input type="hidden" value="${rqt.autoriteParentaleMere?.domiciliation?.streetMatriculation}" id="autoriteParentaleMere.domiciliation_streetMatriculation" name="autoriteParentaleMere.domiciliation.streetMatriculation" />
            <input type="hidden" value="${rqt.autoriteParentaleMere?.domiciliation?.streetRivoliCode}" id="autoriteParentaleMere.domiciliation_streetRivoliCode" name="autoriteParentaleMere.domiciliation.streetRivoliCode" />
            <label for="autoriteParentaleMere.domiciliation.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleMere.domiciliation.placeNameOrService') ? 'validation-failed' : ''}" value="${rqt.autoriteParentaleMere?.domiciliation?.placeNameOrService}" maxlength="38" id="autoriteParentaleMere.domiciliation.placeNameOrService" name="autoriteParentaleMere.domiciliation.placeNameOrService" />
            <label for="autoriteParentaleMere.domiciliation_postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="autoriteParentaleMere.domiciliation_city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required validate-postalCode ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleMere.domiciliation.postalCode') ? 'validation-failed' : ''}" value="${rqt.autoriteParentaleMere?.domiciliation?.postalCode}" size="5" maxlength="5" id="autoriteParentaleMere.domiciliation_postalCode" name="autoriteParentaleMere.domiciliation.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required validate-city ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleMere.domiciliation.city') ? 'validation-failed' : ''}" value="${rqt.autoriteParentaleMere?.domiciliation?.city}" maxlength="32" id="autoriteParentaleMere.domiciliation_city" name="autoriteParentaleMere.domiciliation.city" title="<g:message code="address.property.city.validationError" />" />
            <input type="hidden" value="${rqt.autoriteParentaleMere?.domiciliation?.cityInseeCode}" id="autoriteParentaleMere.domiciliation_cityInseeCode" name="autoriteParentaleMere.domiciliation.cityInseeCode" />
            <label for="autoriteParentaleMere.domiciliation.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleMere.domiciliation.countryName') ? 'validation-failed' : ''}" value="${rqt.autoriteParentaleMere?.domiciliation?.countryName}" maxlength="38" id="autoriteParentaleMere.domiciliation.countryName" name="autoriteParentaleMere.domiciliation.countryName" />
            </div>
            

    
      <label for="autoriteParentaleMere.telephone" class=""><g:message code="myr.property.telephone.label" />   <span><g:message code="myr.property.telephone.help" /></span></label>
            <input type="text" id="autoriteParentaleMere.telephone" name="autoriteParentaleMere.telephone" value="${rqt.autoriteParentaleMere?.telephone?.toString()}" 
                    class="  validate-phone ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleMere.telephone') ? 'validation-failed' : ''}" title="<g:message code="myr.property.telephone.validationError" />"  maxlength="10" />
            

    
      <label for="autoriteParentaleMere.fax" class=""><g:message code="myr.property.fax.label" />   <span><g:message code="myr.property.fax.help" /></span></label>
            <input type="text" id="autoriteParentaleMere.fax" name="autoriteParentaleMere.fax" value="${rqt.autoriteParentaleMere?.fax?.toString()}" 
                    class="  validate-phone ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleMere.fax') ? 'validation-failed' : ''}" title="<g:message code="myr.property.fax.validationError" />"  maxlength="10" />
            

    
      <label for="autoriteParentaleMere.email" class=""><g:message code="myr.property.email.label" />   <span><g:message code="myr.property.email.help" /></span></label>
            <input type="text" id="autoriteParentaleMere.email" name="autoriteParentaleMere.email" value="${rqt.autoriteParentaleMere?.email?.toString()}" 
                    class="  validate-email ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleMere.email') ? 'validation-failed' : ''}" title="<g:message code="myr.property.email.validationError" />"   />
            

    
    </fieldset>
  

  
    <fieldset class="condition-detenteurAutoriteParentalePere-filled">
    <legend><g:message code="myr.property.autoriteParentalePere.label" /></legend>
    
      <label for="autoriteParentalePere.nom" class=""><g:message code="myr.property.nom.label" />   <span><g:message code="myr.property.nom.help" /></span></label>
            <input type="text" id="autoriteParentalePere.nom" name="autoriteParentalePere.nom" value="${rqt.autoriteParentalePere?.nom?.toString()}" 
                    class="  validate-lastName ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentalePere.nom') ? 'validation-failed' : ''}" title="<g:message code="myr.property.nom.validationError" />"  maxlength="38" />
            

    
      <label for="autoriteParentalePere.prenom" class=""><g:message code="myr.property.prenom.label" />   <span><g:message code="myr.property.prenom.help" /></span></label>
            <input type="text" id="autoriteParentalePere.prenom" name="autoriteParentalePere.prenom" value="${rqt.autoriteParentalePere?.prenom?.toString()}" 
                    class="  validate-firstName ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentalePere.prenom') ? 'validation-failed' : ''}" title="<g:message code="myr.property.prenom.validationError" />"  maxlength="38" />
            

    
      <label class=""><g:message code="myr.property.domiciliation.label" />   <span><g:message code="myr.property.domiciliation.help" /></span></label>
            <div id="autoriteParentalePere.domiciliation" class="address   ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentalePere.domiciliation') ? 'validation-failed' : ''}">
            <label for="autoriteParentalePere.domiciliation.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentalePere.domiciliation.additionalDeliveryInformation') ? 'validation-failed' : ''}" value="${rqt.autoriteParentalePere?.domiciliation?.additionalDeliveryInformation}" maxlength="38" id="autoriteParentalePere.domiciliation.additionalDeliveryInformation" name="autoriteParentalePere.domiciliation.additionalDeliveryInformation" />  
            <label for="autoriteParentalePere.domiciliation.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentalePere.domiciliation.additionalGeographicalInformation') ? 'validation-failed' : ''}" value="${rqt.autoriteParentalePere?.domiciliation?.additionalGeographicalInformation}" maxlength="38" id="autoriteParentalePere.domiciliation.additionalGeographicalInformation" name="autoriteParentalePere.domiciliation.additionalGeographicalInformation" />
            <label for="autoriteParentalePere.domiciliation_streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="autoriteParentalePere.domiciliation_streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1 validate-streetNumber ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentalePere.domiciliation.streetNumber') ? 'validation-failed' : ''}" value="${rqt.autoriteParentalePere?.domiciliation?.streetNumber}" size="5" maxlength="5" id="autoriteParentalePere.domiciliation_streetNumber" name="autoriteParentalePere.domiciliation.streetNumber" />
            <input type="text" class="line2 required validate-streetName ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentalePere.domiciliation.streetName') ? 'validation-failed' : ''}" value="${rqt.autoriteParentalePere?.domiciliation?.streetName}" maxlength="32" id="autoriteParentalePere.domiciliation_streetName" name="autoriteParentalePere.domiciliation.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <input type="hidden" value="${rqt.autoriteParentalePere?.domiciliation?.streetMatriculation}" id="autoriteParentalePere.domiciliation_streetMatriculation" name="autoriteParentalePere.domiciliation.streetMatriculation" />
            <input type="hidden" value="${rqt.autoriteParentalePere?.domiciliation?.streetRivoliCode}" id="autoriteParentalePere.domiciliation_streetRivoliCode" name="autoriteParentalePere.domiciliation.streetRivoliCode" />
            <label for="autoriteParentalePere.domiciliation.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentalePere.domiciliation.placeNameOrService') ? 'validation-failed' : ''}" value="${rqt.autoriteParentalePere?.domiciliation?.placeNameOrService}" maxlength="38" id="autoriteParentalePere.domiciliation.placeNameOrService" name="autoriteParentalePere.domiciliation.placeNameOrService" />
            <label for="autoriteParentalePere.domiciliation_postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="autoriteParentalePere.domiciliation_city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required validate-postalCode ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentalePere.domiciliation.postalCode') ? 'validation-failed' : ''}" value="${rqt.autoriteParentalePere?.domiciliation?.postalCode}" size="5" maxlength="5" id="autoriteParentalePere.domiciliation_postalCode" name="autoriteParentalePere.domiciliation.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required validate-city ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentalePere.domiciliation.city') ? 'validation-failed' : ''}" value="${rqt.autoriteParentalePere?.domiciliation?.city}" maxlength="32" id="autoriteParentalePere.domiciliation_city" name="autoriteParentalePere.domiciliation.city" title="<g:message code="address.property.city.validationError" />" />
            <input type="hidden" value="${rqt.autoriteParentalePere?.domiciliation?.cityInseeCode}" id="autoriteParentalePere.domiciliation_cityInseeCode" name="autoriteParentalePere.domiciliation.cityInseeCode" />
            <label for="autoriteParentalePere.domiciliation.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentalePere.domiciliation.countryName') ? 'validation-failed' : ''}" value="${rqt.autoriteParentalePere?.domiciliation?.countryName}" maxlength="38" id="autoriteParentalePere.domiciliation.countryName" name="autoriteParentalePere.domiciliation.countryName" />
            </div>
            

    
      <label for="autoriteParentalePere.telephone" class=""><g:message code="myr.property.telephone.label" />   <span><g:message code="myr.property.telephone.help" /></span></label>
            <input type="text" id="autoriteParentalePere.telephone" name="autoriteParentalePere.telephone" value="${rqt.autoriteParentalePere?.telephone?.toString()}" 
                    class="  validate-phone ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentalePere.telephone') ? 'validation-failed' : ''}" title="<g:message code="myr.property.telephone.validationError" />"  maxlength="10" />
            

    
      <label for="autoriteParentalePere.fax" class=""><g:message code="myr.property.fax.label" />   <span><g:message code="myr.property.fax.help" /></span></label>
            <input type="text" id="autoriteParentalePere.fax" name="autoriteParentalePere.fax" value="${rqt.autoriteParentalePere?.fax?.toString()}" 
                    class="  validate-phone ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentalePere.fax') ? 'validation-failed' : ''}" title="<g:message code="myr.property.fax.validationError" />"  maxlength="10" />
            

    
      <label for="autoriteParentalePere.email" class=""><g:message code="myr.property.email.label" />   <span><g:message code="myr.property.email.help" /></span></label>
            <input type="text" id="autoriteParentalePere.email" name="autoriteParentalePere.email" value="${rqt.autoriteParentalePere?.email?.toString()}" 
                    class="  validate-email ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentalePere.email') ? 'validation-failed' : ''}" title="<g:message code="myr.property.email.validationError" />"   />
            

    
    </fieldset>
  

  
    <fieldset class="condition-detenteurAutoriteParentaleLesDeux-filled">
    <legend><g:message code="myr.property.autoriteParentaleLesDeuxPere.label" /></legend>
    
      <label for="autoriteParentaleLesDeuxPere.nom" class=""><g:message code="myr.property.nom.label" />   <span><g:message code="myr.property.nom.help" /></span></label>
            <input type="text" id="autoriteParentaleLesDeuxPere.nom" name="autoriteParentaleLesDeuxPere.nom" value="${rqt.autoriteParentaleLesDeuxPere?.nom?.toString()}" 
                    class="  validate-lastName ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxPere.nom') ? 'validation-failed' : ''}" title="<g:message code="myr.property.nom.validationError" />"  maxlength="38" />
            

    
      <label for="autoriteParentaleLesDeuxPere.prenom" class=""><g:message code="myr.property.prenom.label" />   <span><g:message code="myr.property.prenom.help" /></span></label>
            <input type="text" id="autoriteParentaleLesDeuxPere.prenom" name="autoriteParentaleLesDeuxPere.prenom" value="${rqt.autoriteParentaleLesDeuxPere?.prenom?.toString()}" 
                    class="  validate-firstName ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxPere.prenom') ? 'validation-failed' : ''}" title="<g:message code="myr.property.prenom.validationError" />"  maxlength="38" />
            

    
      <label class=""><g:message code="myr.property.domiciliation.label" />   <span><g:message code="myr.property.domiciliation.help" /></span></label>
            <div id="autoriteParentaleLesDeuxPere.domiciliation" class="address   ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxPere.domiciliation') ? 'validation-failed' : ''}">
            <label for="autoriteParentaleLesDeuxPere.domiciliation.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxPere.domiciliation.additionalDeliveryInformation') ? 'validation-failed' : ''}" value="${rqt.autoriteParentaleLesDeuxPere?.domiciliation?.additionalDeliveryInformation}" maxlength="38" id="autoriteParentaleLesDeuxPere.domiciliation.additionalDeliveryInformation" name="autoriteParentaleLesDeuxPere.domiciliation.additionalDeliveryInformation" />  
            <label for="autoriteParentaleLesDeuxPere.domiciliation.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxPere.domiciliation.additionalGeographicalInformation') ? 'validation-failed' : ''}" value="${rqt.autoriteParentaleLesDeuxPere?.domiciliation?.additionalGeographicalInformation}" maxlength="38" id="autoriteParentaleLesDeuxPere.domiciliation.additionalGeographicalInformation" name="autoriteParentaleLesDeuxPere.domiciliation.additionalGeographicalInformation" />
            <label for="autoriteParentaleLesDeuxPere.domiciliation_streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="autoriteParentaleLesDeuxPere.domiciliation_streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1 validate-streetNumber ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxPere.domiciliation.streetNumber') ? 'validation-failed' : ''}" value="${rqt.autoriteParentaleLesDeuxPere?.domiciliation?.streetNumber}" size="5" maxlength="5" id="autoriteParentaleLesDeuxPere.domiciliation_streetNumber" name="autoriteParentaleLesDeuxPere.domiciliation.streetNumber" />
            <input type="text" class="line2 required validate-streetName ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxPere.domiciliation.streetName') ? 'validation-failed' : ''}" value="${rqt.autoriteParentaleLesDeuxPere?.domiciliation?.streetName}" maxlength="32" id="autoriteParentaleLesDeuxPere.domiciliation_streetName" name="autoriteParentaleLesDeuxPere.domiciliation.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <input type="hidden" value="${rqt.autoriteParentaleLesDeuxPere?.domiciliation?.streetMatriculation}" id="autoriteParentaleLesDeuxPere.domiciliation_streetMatriculation" name="autoriteParentaleLesDeuxPere.domiciliation.streetMatriculation" />
            <input type="hidden" value="${rqt.autoriteParentaleLesDeuxPere?.domiciliation?.streetRivoliCode}" id="autoriteParentaleLesDeuxPere.domiciliation_streetRivoliCode" name="autoriteParentaleLesDeuxPere.domiciliation.streetRivoliCode" />
            <label for="autoriteParentaleLesDeuxPere.domiciliation.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxPere.domiciliation.placeNameOrService') ? 'validation-failed' : ''}" value="${rqt.autoriteParentaleLesDeuxPere?.domiciliation?.placeNameOrService}" maxlength="38" id="autoriteParentaleLesDeuxPere.domiciliation.placeNameOrService" name="autoriteParentaleLesDeuxPere.domiciliation.placeNameOrService" />
            <label for="autoriteParentaleLesDeuxPere.domiciliation_postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="autoriteParentaleLesDeuxPere.domiciliation_city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required validate-postalCode ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxPere.domiciliation.postalCode') ? 'validation-failed' : ''}" value="${rqt.autoriteParentaleLesDeuxPere?.domiciliation?.postalCode}" size="5" maxlength="5" id="autoriteParentaleLesDeuxPere.domiciliation_postalCode" name="autoriteParentaleLesDeuxPere.domiciliation.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required validate-city ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxPere.domiciliation.city') ? 'validation-failed' : ''}" value="${rqt.autoriteParentaleLesDeuxPere?.domiciliation?.city}" maxlength="32" id="autoriteParentaleLesDeuxPere.domiciliation_city" name="autoriteParentaleLesDeuxPere.domiciliation.city" title="<g:message code="address.property.city.validationError" />" />
            <input type="hidden" value="${rqt.autoriteParentaleLesDeuxPere?.domiciliation?.cityInseeCode}" id="autoriteParentaleLesDeuxPere.domiciliation_cityInseeCode" name="autoriteParentaleLesDeuxPere.domiciliation.cityInseeCode" />
            <label for="autoriteParentaleLesDeuxPere.domiciliation.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxPere.domiciliation.countryName') ? 'validation-failed' : ''}" value="${rqt.autoriteParentaleLesDeuxPere?.domiciliation?.countryName}" maxlength="38" id="autoriteParentaleLesDeuxPere.domiciliation.countryName" name="autoriteParentaleLesDeuxPere.domiciliation.countryName" />
            </div>
            

    
      <label for="autoriteParentaleLesDeuxPere.telephone" class=""><g:message code="myr.property.telephone.label" />   <span><g:message code="myr.property.telephone.help" /></span></label>
            <input type="text" id="autoriteParentaleLesDeuxPere.telephone" name="autoriteParentaleLesDeuxPere.telephone" value="${rqt.autoriteParentaleLesDeuxPere?.telephone?.toString()}" 
                    class="  validate-phone ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxPere.telephone') ? 'validation-failed' : ''}" title="<g:message code="myr.property.telephone.validationError" />"  maxlength="10" />
            

    
      <label for="autoriteParentaleLesDeuxPere.fax" class=""><g:message code="myr.property.fax.label" />   <span><g:message code="myr.property.fax.help" /></span></label>
            <input type="text" id="autoriteParentaleLesDeuxPere.fax" name="autoriteParentaleLesDeuxPere.fax" value="${rqt.autoriteParentaleLesDeuxPere?.fax?.toString()}" 
                    class="  validate-phone ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxPere.fax') ? 'validation-failed' : ''}" title="<g:message code="myr.property.fax.validationError" />"  maxlength="10" />
            

    
      <label for="autoriteParentaleLesDeuxPere.email" class=""><g:message code="myr.property.email.label" />   <span><g:message code="myr.property.email.help" /></span></label>
            <input type="text" id="autoriteParentaleLesDeuxPere.email" name="autoriteParentaleLesDeuxPere.email" value="${rqt.autoriteParentaleLesDeuxPere?.email?.toString()}" 
                    class="  validate-email ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxPere.email') ? 'validation-failed' : ''}" title="<g:message code="myr.property.email.validationError" />"   />
            

    
    </fieldset>
  

  
    <fieldset class="condition-detenteurAutoriteParentaleLesDeux-filled">
    <legend><g:message code="myr.property.autoriteParentaleLesDeuxMere.label" /></legend>
    
      <label for="autoriteParentaleLesDeuxMere.nom" class=""><g:message code="myr.property.nom.label" />   <span><g:message code="myr.property.nom.help" /></span></label>
            <input type="text" id="autoriteParentaleLesDeuxMere.nom" name="autoriteParentaleLesDeuxMere.nom" value="${rqt.autoriteParentaleLesDeuxMere?.nom?.toString()}" 
                    class="  validate-lastName ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxMere.nom') ? 'validation-failed' : ''}" title="<g:message code="myr.property.nom.validationError" />"  maxlength="38" />
            

    
      <label for="autoriteParentaleLesDeuxMere.prenom" class=""><g:message code="myr.property.prenom.label" />   <span><g:message code="myr.property.prenom.help" /></span></label>
            <input type="text" id="autoriteParentaleLesDeuxMere.prenom" name="autoriteParentaleLesDeuxMere.prenom" value="${rqt.autoriteParentaleLesDeuxMere?.prenom?.toString()}" 
                    class="  validate-firstName ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxMere.prenom') ? 'validation-failed' : ''}" title="<g:message code="myr.property.prenom.validationError" />"  maxlength="38" />
            

    
      <label class=""><g:message code="myr.property.domiciliation.label" />   <span><g:message code="myr.property.domiciliation.help" /></span></label>
            <div id="autoriteParentaleLesDeuxMere.domiciliation" class="address   ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxMere.domiciliation') ? 'validation-failed' : ''}">
            <label for="autoriteParentaleLesDeuxMere.domiciliation.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxMere.domiciliation.additionalDeliveryInformation') ? 'validation-failed' : ''}" value="${rqt.autoriteParentaleLesDeuxMere?.domiciliation?.additionalDeliveryInformation}" maxlength="38" id="autoriteParentaleLesDeuxMere.domiciliation.additionalDeliveryInformation" name="autoriteParentaleLesDeuxMere.domiciliation.additionalDeliveryInformation" />  
            <label for="autoriteParentaleLesDeuxMere.domiciliation.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxMere.domiciliation.additionalGeographicalInformation') ? 'validation-failed' : ''}" value="${rqt.autoriteParentaleLesDeuxMere?.domiciliation?.additionalGeographicalInformation}" maxlength="38" id="autoriteParentaleLesDeuxMere.domiciliation.additionalGeographicalInformation" name="autoriteParentaleLesDeuxMere.domiciliation.additionalGeographicalInformation" />
            <label for="autoriteParentaleLesDeuxMere.domiciliation_streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="autoriteParentaleLesDeuxMere.domiciliation_streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1 validate-streetNumber ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxMere.domiciliation.streetNumber') ? 'validation-failed' : ''}" value="${rqt.autoriteParentaleLesDeuxMere?.domiciliation?.streetNumber}" size="5" maxlength="5" id="autoriteParentaleLesDeuxMere.domiciliation_streetNumber" name="autoriteParentaleLesDeuxMere.domiciliation.streetNumber" />
            <input type="text" class="line2 required validate-streetName ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxMere.domiciliation.streetName') ? 'validation-failed' : ''}" value="${rqt.autoriteParentaleLesDeuxMere?.domiciliation?.streetName}" maxlength="32" id="autoriteParentaleLesDeuxMere.domiciliation_streetName" name="autoriteParentaleLesDeuxMere.domiciliation.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <input type="hidden" value="${rqt.autoriteParentaleLesDeuxMere?.domiciliation?.streetMatriculation}" id="autoriteParentaleLesDeuxMere.domiciliation_streetMatriculation" name="autoriteParentaleLesDeuxMere.domiciliation.streetMatriculation" />
            <input type="hidden" value="${rqt.autoriteParentaleLesDeuxMere?.domiciliation?.streetRivoliCode}" id="autoriteParentaleLesDeuxMere.domiciliation_streetRivoliCode" name="autoriteParentaleLesDeuxMere.domiciliation.streetRivoliCode" />
            <label for="autoriteParentaleLesDeuxMere.domiciliation.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxMere.domiciliation.placeNameOrService') ? 'validation-failed' : ''}" value="${rqt.autoriteParentaleLesDeuxMere?.domiciliation?.placeNameOrService}" maxlength="38" id="autoriteParentaleLesDeuxMere.domiciliation.placeNameOrService" name="autoriteParentaleLesDeuxMere.domiciliation.placeNameOrService" />
            <label for="autoriteParentaleLesDeuxMere.domiciliation_postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="autoriteParentaleLesDeuxMere.domiciliation_city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required validate-postalCode ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxMere.domiciliation.postalCode') ? 'validation-failed' : ''}" value="${rqt.autoriteParentaleLesDeuxMere?.domiciliation?.postalCode}" size="5" maxlength="5" id="autoriteParentaleLesDeuxMere.domiciliation_postalCode" name="autoriteParentaleLesDeuxMere.domiciliation.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required validate-city ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxMere.domiciliation.city') ? 'validation-failed' : ''}" value="${rqt.autoriteParentaleLesDeuxMere?.domiciliation?.city}" maxlength="32" id="autoriteParentaleLesDeuxMere.domiciliation_city" name="autoriteParentaleLesDeuxMere.domiciliation.city" title="<g:message code="address.property.city.validationError" />" />
            <input type="hidden" value="${rqt.autoriteParentaleLesDeuxMere?.domiciliation?.cityInseeCode}" id="autoriteParentaleLesDeuxMere.domiciliation_cityInseeCode" name="autoriteParentaleLesDeuxMere.domiciliation.cityInseeCode" />
            <label for="autoriteParentaleLesDeuxMere.domiciliation.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxMere.domiciliation.countryName') ? 'validation-failed' : ''}" value="${rqt.autoriteParentaleLesDeuxMere?.domiciliation?.countryName}" maxlength="38" id="autoriteParentaleLesDeuxMere.domiciliation.countryName" name="autoriteParentaleLesDeuxMere.domiciliation.countryName" />
            </div>
            

    
      <label for="autoriteParentaleLesDeuxMere.telephone" class=""><g:message code="myr.property.telephone.label" />   <span><g:message code="myr.property.telephone.help" /></span></label>
            <input type="text" id="autoriteParentaleLesDeuxMere.telephone" name="autoriteParentaleLesDeuxMere.telephone" value="${rqt.autoriteParentaleLesDeuxMere?.telephone?.toString()}" 
                    class="  validate-phone ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxMere.telephone') ? 'validation-failed' : ''}" title="<g:message code="myr.property.telephone.validationError" />"  maxlength="10" />
            

    
      <label for="autoriteParentaleLesDeuxMere.fax" class=""><g:message code="myr.property.fax.label" />   <span><g:message code="myr.property.fax.help" /></span></label>
            <input type="text" id="autoriteParentaleLesDeuxMere.fax" name="autoriteParentaleLesDeuxMere.fax" value="${rqt.autoriteParentaleLesDeuxMere?.fax?.toString()}" 
                    class="  validate-phone ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxMere.fax') ? 'validation-failed' : ''}" title="<g:message code="myr.property.fax.validationError" />"  maxlength="10" />
            

    
      <label for="autoriteParentaleLesDeuxMere.email" class=""><g:message code="myr.property.email.label" />   <span><g:message code="myr.property.email.help" /></span></label>
            <input type="text" id="autoriteParentaleLesDeuxMere.email" name="autoriteParentaleLesDeuxMere.email" value="${rqt.autoriteParentaleLesDeuxMere?.email?.toString()}" 
                    class="  validate-email ${rqt.stepStates['autoriteParentale'].invalidFields.contains('autoriteParentaleLesDeuxMere.email') ? 'validation-failed' : ''}" title="<g:message code="myr.property.email.validationError" />"   />
            

    
    </fieldset>
  

  
    <fieldset class="required condition-detenteurAutoriteParentaleOther-filled">
    <legend><g:message code="myr.property.informationAutreDeteneurAutoriteParentale.label" /></legend>
    
      <label for="informationAutreDeteneurAutoriteParentale.nom" class="required"><g:message code="myr.property.nom.label" /> *  <span><g:message code="myr.property.nom.help" /></span></label>
            <input type="text" id="informationAutreDeteneurAutoriteParentale.nom" name="informationAutreDeteneurAutoriteParentale.nom" value="${rqt.informationAutreDeteneurAutoriteParentale?.nom?.toString()}" 
                    class="required  validate-lastName ${rqt.stepStates['autoriteParentale'].invalidFields.contains('informationAutreDeteneurAutoriteParentale.nom') ? 'validation-failed' : ''}" title="<g:message code="myr.property.nom.validationError" />"  maxlength="38" />
            

    
      <label class="required"><g:message code="myr.property.domiciliation.label" /> *  <span><g:message code="myr.property.domiciliation.help" /></span></label>
            <div id="informationAutreDeteneurAutoriteParentale.domiciliation" class="address required  ${rqt.stepStates['autoriteParentale'].invalidFields.contains('informationAutreDeteneurAutoriteParentale.domiciliation') ? 'validation-failed' : ''}">
            <label for="informationAutreDeteneurAutoriteParentale.domiciliation.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['autoriteParentale'].invalidFields.contains('informationAutreDeteneurAutoriteParentale.domiciliation.additionalDeliveryInformation') ? 'validation-failed' : ''}" value="${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.additionalDeliveryInformation}" maxlength="38" id="informationAutreDeteneurAutoriteParentale.domiciliation.additionalDeliveryInformation" name="informationAutreDeteneurAutoriteParentale.domiciliation.additionalDeliveryInformation" />  
            <label for="informationAutreDeteneurAutoriteParentale.domiciliation.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['autoriteParentale'].invalidFields.contains('informationAutreDeteneurAutoriteParentale.domiciliation.additionalGeographicalInformation') ? 'validation-failed' : ''}" value="${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.additionalGeographicalInformation}" maxlength="38" id="informationAutreDeteneurAutoriteParentale.domiciliation.additionalGeographicalInformation" name="informationAutreDeteneurAutoriteParentale.domiciliation.additionalGeographicalInformation" />
            <label for="informationAutreDeteneurAutoriteParentale.domiciliation_streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="informationAutreDeteneurAutoriteParentale.domiciliation_streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1 validate-streetNumber ${rqt.stepStates['autoriteParentale'].invalidFields.contains('informationAutreDeteneurAutoriteParentale.domiciliation.streetNumber') ? 'validation-failed' : ''}" value="${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.streetNumber}" size="5" maxlength="5" id="informationAutreDeteneurAutoriteParentale.domiciliation_streetNumber" name="informationAutreDeteneurAutoriteParentale.domiciliation.streetNumber" />
            <input type="text" class="line2 required validate-streetName ${rqt.stepStates['autoriteParentale'].invalidFields.contains('informationAutreDeteneurAutoriteParentale.domiciliation.streetName') ? 'validation-failed' : ''}" value="${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.streetName}" maxlength="32" id="informationAutreDeteneurAutoriteParentale.domiciliation_streetName" name="informationAutreDeteneurAutoriteParentale.domiciliation.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <input type="hidden" value="${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.streetMatriculation}" id="informationAutreDeteneurAutoriteParentale.domiciliation_streetMatriculation" name="informationAutreDeteneurAutoriteParentale.domiciliation.streetMatriculation" />
            <input type="hidden" value="${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.streetRivoliCode}" id="informationAutreDeteneurAutoriteParentale.domiciliation_streetRivoliCode" name="informationAutreDeteneurAutoriteParentale.domiciliation.streetRivoliCode" />
            <label for="informationAutreDeteneurAutoriteParentale.domiciliation.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['autoriteParentale'].invalidFields.contains('informationAutreDeteneurAutoriteParentale.domiciliation.placeNameOrService') ? 'validation-failed' : ''}" value="${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.placeNameOrService}" maxlength="38" id="informationAutreDeteneurAutoriteParentale.domiciliation.placeNameOrService" name="informationAutreDeteneurAutoriteParentale.domiciliation.placeNameOrService" />
            <label for="informationAutreDeteneurAutoriteParentale.domiciliation_postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="informationAutreDeteneurAutoriteParentale.domiciliation_city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required validate-postalCode ${rqt.stepStates['autoriteParentale'].invalidFields.contains('informationAutreDeteneurAutoriteParentale.domiciliation.postalCode') ? 'validation-failed' : ''}" value="${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.postalCode}" size="5" maxlength="5" id="informationAutreDeteneurAutoriteParentale.domiciliation_postalCode" name="informationAutreDeteneurAutoriteParentale.domiciliation.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required validate-city ${rqt.stepStates['autoriteParentale'].invalidFields.contains('informationAutreDeteneurAutoriteParentale.domiciliation.city') ? 'validation-failed' : ''}" value="${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.city}" maxlength="32" id="informationAutreDeteneurAutoriteParentale.domiciliation_city" name="informationAutreDeteneurAutoriteParentale.domiciliation.city" title="<g:message code="address.property.city.validationError" />" />
            <input type="hidden" value="${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.cityInseeCode}" id="informationAutreDeteneurAutoriteParentale.domiciliation_cityInseeCode" name="informationAutreDeteneurAutoriteParentale.domiciliation.cityInseeCode" />
            <label for="informationAutreDeteneurAutoriteParentale.domiciliation.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['autoriteParentale'].invalidFields.contains('informationAutreDeteneurAutoriteParentale.domiciliation.countryName') ? 'validation-failed' : ''}" value="${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.countryName}" maxlength="38" id="informationAutreDeteneurAutoriteParentale.domiciliation.countryName" name="informationAutreDeteneurAutoriteParentale.domiciliation.countryName" />
            </div>
            

    
      <label for="informationAutreDeteneurAutoriteParentale.telephone" class="required"><g:message code="myr.property.telephone.label" /> *  <span><g:message code="myr.property.telephone.help" /></span></label>
            <input type="text" id="informationAutreDeteneurAutoriteParentale.telephone" name="informationAutreDeteneurAutoriteParentale.telephone" value="${rqt.informationAutreDeteneurAutoriteParentale?.telephone?.toString()}" 
                    class="required  validate-phone ${rqt.stepStates['autoriteParentale'].invalidFields.contains('informationAutreDeteneurAutoriteParentale.telephone') ? 'validation-failed' : ''}" title="<g:message code="myr.property.telephone.validationError" />"  maxlength="10" />
            

    
      <label for="informationAutreDeteneurAutoriteParentale.fax" class=""><g:message code="myr.property.fax.label" />   <span><g:message code="myr.property.fax.help" /></span></label>
            <input type="text" id="informationAutreDeteneurAutoriteParentale.fax" name="informationAutreDeteneurAutoriteParentale.fax" value="${rqt.informationAutreDeteneurAutoriteParentale?.fax?.toString()}" 
                    class="  validate-phone ${rqt.stepStates['autoriteParentale'].invalidFields.contains('informationAutreDeteneurAutoriteParentale.fax') ? 'validation-failed' : ''}" title="<g:message code="myr.property.fax.validationError" />"  maxlength="10" />
            

    
      <label for="informationAutreDeteneurAutoriteParentale.email" class=""><g:message code="myr.property.email.label" />   <span><g:message code="myr.property.email.help" /></span></label>
            <input type="text" id="informationAutreDeteneurAutoriteParentale.email" name="informationAutreDeteneurAutoriteParentale.email" value="${rqt.informationAutreDeteneurAutoriteParentale?.email?.toString()}" 
                    class="  validate-email ${rqt.stepStates['autoriteParentale'].invalidFields.contains('informationAutreDeteneurAutoriteParentale.email') ? 'validation-failed' : ''}" title="<g:message code="myr.property.email.validationError" />"   />
            

    
    </fieldset>
  

