


  
    <label for="nomAssociation" class="required"><g:message code="sagr.property.nomAssociation.label" /> *  <span><g:message code="sagr.property.nomAssociation.help" /></span></label>
            <input type="text" id="nomAssociation" name="nomAssociation" value="${rqt.nomAssociation?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['association'].invalidFields.contains('nomAssociation') ? 'validation-failed' : ''}" title="<g:message code="sagr.property.nomAssociation.validationError" />"   />
            

  

  
    <label class="required"><g:message code="sagr.property.siegeSocialAssociation.label" /> *  <span><g:message code="sagr.property.siegeSocialAssociation.help" /></span></label>
            <div id="siegeSocialAssociation" class="address required  ${rqt.stepStates['association'].invalidFields.contains('siegeSocialAssociation') ? 'validation-failed' : ''}">
            <label for="siegeSocialAssociation.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['association'].invalidFields.contains('siegeSocialAssociation.additionalDeliveryInformation') ? 'validation-failed' : ''}" value="${rqt.siegeSocialAssociation?.additionalDeliveryInformation}" maxlength="38" id="siegeSocialAssociation.additionalDeliveryInformation" name="siegeSocialAssociation.additionalDeliveryInformation" />  
            <label for="siegeSocialAssociation.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['association'].invalidFields.contains('siegeSocialAssociation.additionalGeographicalInformation') ? 'validation-failed' : ''}" value="${rqt.siegeSocialAssociation?.additionalGeographicalInformation}" maxlength="38" id="siegeSocialAssociation.additionalGeographicalInformation" name="siegeSocialAssociation.additionalGeographicalInformation" />
            <label for="siegeSocialAssociation_streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="siegeSocialAssociation_streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1 validate-streetNumber ${rqt.stepStates['association'].invalidFields.contains('siegeSocialAssociation.streetNumber') ? 'validation-failed' : ''}" value="${rqt.siegeSocialAssociation?.streetNumber}" size="5" maxlength="5" id="siegeSocialAssociation_streetNumber" name="siegeSocialAssociation.streetNumber" />
            <input type="text" class="line2 required validate-streetName ${rqt.stepStates['association'].invalidFields.contains('siegeSocialAssociation.streetName') ? 'validation-failed' : ''}" value="${rqt.siegeSocialAssociation?.streetName}" maxlength="32" id="siegeSocialAssociation_streetName" name="siegeSocialAssociation.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <input type="hidden" value="${rqt.siegeSocialAssociation?.streetMatriculation}" id="siegeSocialAssociation_streetMatriculation" name="siegeSocialAssociation.streetMatriculation" />
            <input type="hidden" value="${rqt.siegeSocialAssociation?.streetRivoliCode}" id="siegeSocialAssociation_streetRivoliCode" name="siegeSocialAssociation.streetRivoliCode" />
            <label for="siegeSocialAssociation.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['association'].invalidFields.contains('siegeSocialAssociation.placeNameOrService') ? 'validation-failed' : ''}" value="${rqt.siegeSocialAssociation?.placeNameOrService}" maxlength="38" id="siegeSocialAssociation.placeNameOrService" name="siegeSocialAssociation.placeNameOrService" />
            <label for="siegeSocialAssociation_postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="siegeSocialAssociation_city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required validate-postalCode ${rqt.stepStates['association'].invalidFields.contains('siegeSocialAssociation.postalCode') ? 'validation-failed' : ''}" value="${rqt.siegeSocialAssociation?.postalCode}" size="5" maxlength="5" id="siegeSocialAssociation_postalCode" name="siegeSocialAssociation.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required validate-city ${rqt.stepStates['association'].invalidFields.contains('siegeSocialAssociation.city') ? 'validation-failed' : ''}" value="${rqt.siegeSocialAssociation?.city}" maxlength="32" id="siegeSocialAssociation_city" name="siegeSocialAssociation.city" title="<g:message code="address.property.city.validationError" />" />
            <input type="hidden" value="${rqt.siegeSocialAssociation?.cityInseeCode}" id="siegeSocialAssociation_cityInseeCode" name="siegeSocialAssociation.cityInseeCode" />
            <label for="siegeSocialAssociation.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['association'].invalidFields.contains('siegeSocialAssociation.countryName') ? 'validation-failed' : ''}" value="${rqt.siegeSocialAssociation?.countryName}" maxlength="38" id="siegeSocialAssociation.countryName" name="siegeSocialAssociation.countryName" />
            </div>
            

  

  
    <fieldset class="required">
    <legend><g:message code="sagr.property.numerosAssociation.label" /></legend>
    
      <label for="numerosAssociation.numeroSiretAssociation" class="required"><g:message code="sagr.property.numeroSiretAssociation.label" /> *  <span><g:message code="sagr.property.numeroSiretAssociation.help" /></span></label>
            <input type="text" id="numerosAssociation.numeroSiretAssociation" name="numerosAssociation.numeroSiretAssociation" value="${rqt.numerosAssociation?.numeroSiretAssociation?.toString()}" 
                    class="required  validate-regex ${rqt.stepStates['association'].invalidFields.contains('numerosAssociation.numeroSiretAssociation') ? 'validation-failed' : ''}" title="<g:message code="sagr.property.numeroSiretAssociation.validationError" />" regex="^[\w\W]{0,14}$" maxlength="14" />
            

    
      <label for="numerosAssociation.numeroEnregistrementPrefectureAssociation" class="required"><g:message code="sagr.property.numeroEnregistrementPrefectureAssociation.label" /> *  <span><g:message code="sagr.property.numeroEnregistrementPrefectureAssociation.help" /></span></label>
            <input type="text" id="numerosAssociation.numeroEnregistrementPrefectureAssociation" name="numerosAssociation.numeroEnregistrementPrefectureAssociation" value="${rqt.numerosAssociation?.numeroEnregistrementPrefectureAssociation?.toString()}" 
                    class="required  validate-regex ${rqt.stepStates['association'].invalidFields.contains('numerosAssociation.numeroEnregistrementPrefectureAssociation') ? 'validation-failed' : ''}" title="<g:message code="sagr.property.numeroEnregistrementPrefectureAssociation.validationError" />" regex="^[\w\W]{0,9}$" maxlength="9" />
            

    
    </fieldset>
  

  
    <fieldset class="required">
    <legend><g:message code="sagr.property.contactsAssociation.label" /></legend>
    
      <label class="required"><g:message code="sagr.property.estAdresseCorrespondantPrincipal.label" /> *  <span><g:message code="sagr.property.estAdresseCorrespondantPrincipal.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['association'].invalidFields.contains('contactsAssociation.estAdresseCorrespondantPrincipal') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="contactsAssociation.estAdresseCorrespondantPrincipal_${it ? 'yes' : 'no'}" class="required condition-estAdresseCorrespondantPrincipal-trigger  validate-one-required boolean" title="" value="${it}" name="contactsAssociation.estAdresseCorrespondantPrincipal" ${ rqt.contactsAssociation ?  (it == rqt.contactsAssociation?.estAdresseCorrespondantPrincipal ? 'checked="checked"': '') : (it == true ? 'checked="checked"': '') } />
                <label for="contactsAssociation.estAdresseCorrespondantPrincipal_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label for="civiliteCorrespondantPrincipal" class="required condition-estAdresseCorrespondantPrincipal-filled"><g:message code="sagr.property.civiliteCorrespondantPrincipal.label" /> *  <span><g:message code="sagr.property.civiliteCorrespondantPrincipal.help" /></span></label>
            <select id="civiliteCorrespondantPrincipal" name="civiliteCorrespondantPrincipal" class="required condition-estAdresseCorrespondantPrincipal-filled  validate-not-first ${rqt.stepStates['association'].invalidFields.contains('civiliteCorrespondantPrincipal') ? 'validation-failed' : ''}" title="<g:message code="sagr.property.civiliteCorrespondantPrincipal.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['MISTER','MADAM','AGENCY','UNKNOWN']}">
                <option value="${it}" ${it == rqt.civiliteCorrespondantPrincipal?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="sagr.property.civiliteCorrespondantPrincipal" /></option>
              </g:each>
            </select>
            

    
      <label for="contactsAssociation.nomCompletCorrespondantPrincipal" class="required condition-estAdresseCorrespondantPrincipal-filled"><g:message code="sagr.property.nomCompletCorrespondantPrincipal.label" /> *  <span><g:message code="sagr.property.nomCompletCorrespondantPrincipal.help" /></span></label>
            <input type="text" id="contactsAssociation.nomCompletCorrespondantPrincipal" name="contactsAssociation.nomCompletCorrespondantPrincipal" value="${rqt.contactsAssociation?.nomCompletCorrespondantPrincipal?.toString()}" 
                    class="required condition-estAdresseCorrespondantPrincipal-filled  validate-string ${rqt.stepStates['association'].invalidFields.contains('contactsAssociation.nomCompletCorrespondantPrincipal') ? 'validation-failed' : ''}" title="<g:message code="sagr.property.nomCompletCorrespondantPrincipal.validationError" />"   />
            

    
      <label class="required condition-estAdresseCorrespondantPrincipal-filled"><g:message code="sagr.property.adresseCorrespondantPrincipal.label" /> *  <span><g:message code="sagr.property.adresseCorrespondantPrincipal.help" /></span></label>
            <div id="contactsAssociation.adresseCorrespondantPrincipal" class="address required condition-estAdresseCorrespondantPrincipal-filled  ${rqt.stepStates['association'].invalidFields.contains('contactsAssociation.adresseCorrespondantPrincipal') ? 'validation-failed' : ''}">
            <label for="contactsAssociation.adresseCorrespondantPrincipal.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['association'].invalidFields.contains('contactsAssociation.adresseCorrespondantPrincipal.additionalDeliveryInformation') ? 'validation-failed' : ''}" value="${rqt.contactsAssociation?.adresseCorrespondantPrincipal?.additionalDeliveryInformation}" maxlength="38" id="contactsAssociation.adresseCorrespondantPrincipal.additionalDeliveryInformation" name="contactsAssociation.adresseCorrespondantPrincipal.additionalDeliveryInformation" />  
            <label for="contactsAssociation.adresseCorrespondantPrincipal.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['association'].invalidFields.contains('contactsAssociation.adresseCorrespondantPrincipal.additionalGeographicalInformation') ? 'validation-failed' : ''}" value="${rqt.contactsAssociation?.adresseCorrespondantPrincipal?.additionalGeographicalInformation}" maxlength="38" id="contactsAssociation.adresseCorrespondantPrincipal.additionalGeographicalInformation" name="contactsAssociation.adresseCorrespondantPrincipal.additionalGeographicalInformation" />
            <label for="contactsAssociation.adresseCorrespondantPrincipal_streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="contactsAssociation.adresseCorrespondantPrincipal_streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1 validate-streetNumber ${rqt.stepStates['association'].invalidFields.contains('contactsAssociation.adresseCorrespondantPrincipal.streetNumber') ? 'validation-failed' : ''}" value="${rqt.contactsAssociation?.adresseCorrespondantPrincipal?.streetNumber}" size="5" maxlength="5" id="contactsAssociation.adresseCorrespondantPrincipal_streetNumber" name="contactsAssociation.adresseCorrespondantPrincipal.streetNumber" />
            <input type="text" class="line2 required validate-streetName ${rqt.stepStates['association'].invalidFields.contains('contactsAssociation.adresseCorrespondantPrincipal.streetName') ? 'validation-failed' : ''}" value="${rqt.contactsAssociation?.adresseCorrespondantPrincipal?.streetName}" maxlength="32" id="contactsAssociation.adresseCorrespondantPrincipal_streetName" name="contactsAssociation.adresseCorrespondantPrincipal.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <input type="hidden" value="${rqt.contactsAssociation?.adresseCorrespondantPrincipal?.streetMatriculation}" id="contactsAssociation.adresseCorrespondantPrincipal_streetMatriculation" name="contactsAssociation.adresseCorrespondantPrincipal.streetMatriculation" />
            <input type="hidden" value="${rqt.contactsAssociation?.adresseCorrespondantPrincipal?.streetRivoliCode}" id="contactsAssociation.adresseCorrespondantPrincipal_streetRivoliCode" name="contactsAssociation.adresseCorrespondantPrincipal.streetRivoliCode" />
            <label for="contactsAssociation.adresseCorrespondantPrincipal.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['association'].invalidFields.contains('contactsAssociation.adresseCorrespondantPrincipal.placeNameOrService') ? 'validation-failed' : ''}" value="${rqt.contactsAssociation?.adresseCorrespondantPrincipal?.placeNameOrService}" maxlength="38" id="contactsAssociation.adresseCorrespondantPrincipal.placeNameOrService" name="contactsAssociation.adresseCorrespondantPrincipal.placeNameOrService" />
            <label for="contactsAssociation.adresseCorrespondantPrincipal_postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="contactsAssociation.adresseCorrespondantPrincipal_city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required validate-postalCode ${rqt.stepStates['association'].invalidFields.contains('contactsAssociation.adresseCorrespondantPrincipal.postalCode') ? 'validation-failed' : ''}" value="${rqt.contactsAssociation?.adresseCorrespondantPrincipal?.postalCode}" size="5" maxlength="5" id="contactsAssociation.adresseCorrespondantPrincipal_postalCode" name="contactsAssociation.adresseCorrespondantPrincipal.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required validate-city ${rqt.stepStates['association'].invalidFields.contains('contactsAssociation.adresseCorrespondantPrincipal.city') ? 'validation-failed' : ''}" value="${rqt.contactsAssociation?.adresseCorrespondantPrincipal?.city}" maxlength="32" id="contactsAssociation.adresseCorrespondantPrincipal_city" name="contactsAssociation.adresseCorrespondantPrincipal.city" title="<g:message code="address.property.city.validationError" />" />
            <input type="hidden" value="${rqt.contactsAssociation?.adresseCorrespondantPrincipal?.cityInseeCode}" id="contactsAssociation.adresseCorrespondantPrincipal_cityInseeCode" name="contactsAssociation.adresseCorrespondantPrincipal.cityInseeCode" />
            <label for="contactsAssociation.adresseCorrespondantPrincipal.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['association'].invalidFields.contains('contactsAssociation.adresseCorrespondantPrincipal.countryName') ? 'validation-failed' : ''}" value="${rqt.contactsAssociation?.adresseCorrespondantPrincipal?.countryName}" maxlength="38" id="contactsAssociation.adresseCorrespondantPrincipal.countryName" name="contactsAssociation.adresseCorrespondantPrincipal.countryName" />
            </div>
            

    
      <label for="contactsAssociation.emailClubOuCorrespondant" class=""><g:message code="sagr.property.emailClubOuCorrespondant.label" />   <span><g:message code="sagr.property.emailClubOuCorrespondant.help" /></span></label>
            <input type="text" id="contactsAssociation.emailClubOuCorrespondant" name="contactsAssociation.emailClubOuCorrespondant" value="${rqt.contactsAssociation?.emailClubOuCorrespondant?.toString()}" 
                    class="  validate-email ${rqt.stepStates['association'].invalidFields.contains('contactsAssociation.emailClubOuCorrespondant') ? 'validation-failed' : ''}" title="<g:message code="sagr.property.emailClubOuCorrespondant.validationError" />"   />
            

    
    </fieldset>
  

