


  
    <label for="titreDemandeur" class="required"><g:message code="cscr.property.titreDemandeur.label" /> *  <span><g:message code="cscr.property.titreDemandeur.help" /></span></label>
            <select id="titreDemandeur" name="titreDemandeur" class="required  validate-not-first ${rqt.stepStates['identification'].invalidFields.contains('titreDemandeur') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.titreDemandeur.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['Mister','Madam','Miss','Agency','Unknown']}">
                <option value="fr.cg95.cvq.business.users.TitleType_${it}" ${it == rqt.titreDemandeur?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="cscr.property.titreDemandeur" /></option>
              </g:each>
            </select>
            

  

  
    <label for="nomDemandeur" class="required"><g:message code="cscr.property.nomDemandeur.label" /> *  <span><g:message code="cscr.property.nomDemandeur.help" /></span></label>
            <input type="text" id="nomDemandeur" name="nomDemandeur" value="${rqt.nomDemandeur?.toString()}" 
                    class="required  validate-lastName ${rqt.stepStates['identification'].invalidFields.contains('nomDemandeur') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.nomDemandeur.validationError" />"  maxlength="38" />
            

  

  
    <label for="prenomDemandeur" class=""><g:message code="cscr.property.prenomDemandeur.label" />   <span><g:message code="cscr.property.prenomDemandeur.help" /></span></label>
            <input type="text" id="prenomDemandeur" name="prenomDemandeur" value="${rqt.prenomDemandeur?.toString()}" 
                    class="  validate-firstName ${rqt.stepStates['identification'].invalidFields.contains('prenomDemandeur') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.prenomDemandeur.validationError" />"  maxlength="38" />
            

  

  
    <label class="required"><g:message code="cscr.property.adresseDemandeur.label" /> *  <span><g:message code="cscr.property.adresseDemandeur.help" /></span></label>
            <div id="adresseDemandeur" class="address required  ${rqt.stepStates['identification'].invalidFields.contains('adresseDemandeur') ? 'validation-failed' : ''}">
            <label for="adresseDemandeur.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['identification'].invalidFields.contains('adresseDemandeur.additionalDeliveryInformation') ? 'validation-failed' : ''}" value="${rqt.adresseDemandeur?.additionalDeliveryInformation}" maxlength="38" id="adresseDemandeur.additionalDeliveryInformation" name="adresseDemandeur.additionalDeliveryInformation" />  
            <label for="adresseDemandeur.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['identification'].invalidFields.contains('adresseDemandeur.additionalGeographicalInformation') ? 'validation-failed' : ''}" value="${rqt.adresseDemandeur?.additionalGeographicalInformation}" maxlength="38" id="adresseDemandeur.additionalGeographicalInformation" name="adresseDemandeur.additionalGeographicalInformation" />
            <label for="adresseDemandeur_streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="adresseDemandeur_streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1 validate-streetNumber ${rqt.stepStates['identification'].invalidFields.contains('adresseDemandeur.streetNumber') ? 'validation-failed' : ''}" value="${rqt.adresseDemandeur?.streetNumber}" size="5" maxlength="5" id="adresseDemandeur_streetNumber" name="adresseDemandeur.streetNumber" />
            <input type="text" class="line2 required validate-streetName ${rqt.stepStates['identification'].invalidFields.contains('adresseDemandeur.streetName') ? 'validation-failed' : ''}" value="${rqt.adresseDemandeur?.streetName}" maxlength="32" id="adresseDemandeur_streetName" name="adresseDemandeur.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <input type="hidden" value="${rqt.adresseDemandeur?.streetMatriculation}" id="adresseDemandeur_streetMatriculation" name="adresseDemandeur.streetMatriculation" />
            <input type="hidden" value="${rqt.adresseDemandeur?.streetRivoliCode}" id="adresseDemandeur_streetRivoliCode" name="adresseDemandeur.streetRivoliCode" />
            <label for="adresseDemandeur.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['identification'].invalidFields.contains('adresseDemandeur.placeNameOrService') ? 'validation-failed' : ''}" value="${rqt.adresseDemandeur?.placeNameOrService}" maxlength="38" id="adresseDemandeur.placeNameOrService" name="adresseDemandeur.placeNameOrService" />
            <label for="adresseDemandeur_postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="adresseDemandeur_city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required validate-postalCode ${rqt.stepStates['identification'].invalidFields.contains('adresseDemandeur.postalCode') ? 'validation-failed' : ''}" value="${rqt.adresseDemandeur?.postalCode}" size="5" maxlength="5" id="adresseDemandeur_postalCode" name="adresseDemandeur.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required validate-city ${rqt.stepStates['identification'].invalidFields.contains('adresseDemandeur.city') ? 'validation-failed' : ''}" value="${rqt.adresseDemandeur?.city}" maxlength="32" id="adresseDemandeur_city" name="adresseDemandeur.city" title="<g:message code="address.property.city.validationError" />" />
            <input type="hidden" value="${rqt.adresseDemandeur?.cityInseeCode}" id="adresseDemandeur_cityInseeCode" name="adresseDemandeur.cityInseeCode" />
            <label for="adresseDemandeur.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['identification'].invalidFields.contains('adresseDemandeur.countryName') ? 'validation-failed' : ''}" value="${rqt.adresseDemandeur?.countryName}" maxlength="38" id="adresseDemandeur.countryName" name="adresseDemandeur.countryName" />
            </div>
            

  

  
    <label for="emailDemandeur" class="required"><g:message code="cscr.property.emailDemandeur.label" /> *  <span><g:message code="cscr.property.emailDemandeur.help" /></span></label>
            <input type="text" id="emailDemandeur" name="emailDemandeur" value="${rqt.emailDemandeur?.toString()}" 
                    class="required  validate-email ${rqt.stepStates['identification'].invalidFields.contains('emailDemandeur') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.emailDemandeur.validationError" />"   />
            

  

  
    <label for="telephoneDemandeur" class="required"><g:message code="cscr.property.telephoneDemandeur.label" /> *  <span><g:message code="cscr.property.telephoneDemandeur.help" /></span></label>
            <input type="text" id="telephoneDemandeur" name="telephoneDemandeur" value="${rqt.telephoneDemandeur?.toString()}" 
                    class="required  validate-phone ${rqt.stepStates['identification'].invalidFields.contains('telephoneDemandeur') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.telephoneDemandeur.validationError" />"  maxlength="10" />
            

  

