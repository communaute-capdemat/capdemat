


  
    <fieldset class="required">
    <legend><g:message code="taror.property.lieuConcerne.label" /></legend>
    
      <label class="required"><g:message code="taror.property.adresseLieuConcerne.label" /> *  <span><g:message code="taror.property.adresseLieuConcerne.help" /></span></label>
            <div id="adresseLieuConcerne" class="address required  ${rqt.stepStates['general'].invalidFields.contains('adresseLieuConcerne') ? 'validation-failed' : ''}">
            <label for="adresseLieuConcerne.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['general'].invalidFields.contains('adresseLieuConcerne.additionalDeliveryInformation') ? 'validation-failed' : ''}" value="${rqt.adresseLieuConcerne?.additionalDeliveryInformation}" maxlength="38" id="adresseLieuConcerne.additionalDeliveryInformation" name="adresseLieuConcerne.additionalDeliveryInformation" />  
            <label for="adresseLieuConcerne.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['general'].invalidFields.contains('adresseLieuConcerne.additionalGeographicalInformation') ? 'validation-failed' : ''}" value="${rqt.adresseLieuConcerne?.additionalGeographicalInformation}" maxlength="38" id="adresseLieuConcerne.additionalGeographicalInformation" name="adresseLieuConcerne.additionalGeographicalInformation" />
            <label for="adresseLieuConcerne_streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="adresseLieuConcerne_streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1 validate-streetNumber ${rqt.stepStates['general'].invalidFields.contains('adresseLieuConcerne.streetNumber') ? 'validation-failed' : ''}" value="${rqt.adresseLieuConcerne?.streetNumber}" size="5" maxlength="5" id="adresseLieuConcerne_streetNumber" name="adresseLieuConcerne.streetNumber" />
            <input type="text" class="line2 required validate-streetName ${rqt.stepStates['general'].invalidFields.contains('adresseLieuConcerne.streetName') ? 'validation-failed' : ''}" value="${rqt.adresseLieuConcerne?.streetName}" maxlength="32" id="adresseLieuConcerne_streetName" name="adresseLieuConcerne.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <input type="hidden" value="${rqt.adresseLieuConcerne?.streetMatriculation}" id="adresseLieuConcerne_streetMatriculation" name="adresseLieuConcerne.streetMatriculation" />
            <input type="hidden" value="${rqt.adresseLieuConcerne?.streetRivoliCode}" id="adresseLieuConcerne_streetRivoliCode" name="adresseLieuConcerne.streetRivoliCode" />
            <label for="adresseLieuConcerne.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['general'].invalidFields.contains('adresseLieuConcerne.placeNameOrService') ? 'validation-failed' : ''}" value="${rqt.adresseLieuConcerne?.placeNameOrService}" maxlength="38" id="adresseLieuConcerne.placeNameOrService" name="adresseLieuConcerne.placeNameOrService" />
            <label for="adresseLieuConcerne_postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="adresseLieuConcerne_city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required validate-postalCode ${rqt.stepStates['general'].invalidFields.contains('adresseLieuConcerne.postalCode') ? 'validation-failed' : ''}" value="${rqt.adresseLieuConcerne?.postalCode}" size="5" maxlength="5" id="adresseLieuConcerne_postalCode" name="adresseLieuConcerne.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required validate-city ${rqt.stepStates['general'].invalidFields.contains('adresseLieuConcerne.city') ? 'validation-failed' : ''}" value="${rqt.adresseLieuConcerne?.city}" maxlength="32" id="adresseLieuConcerne_city" name="adresseLieuConcerne.city" title="<g:message code="address.property.city.validationError" />" />
            <input type="hidden" value="${rqt.adresseLieuConcerne?.cityInseeCode}" id="adresseLieuConcerne_cityInseeCode" name="adresseLieuConcerne.cityInseeCode" />
            <label for="adresseLieuConcerne.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['general'].invalidFields.contains('adresseLieuConcerne.countryName') ? 'validation-failed' : ''}" value="${rqt.adresseLieuConcerne?.countryName}" maxlength="38" id="adresseLieuConcerne.countryName" name="adresseLieuConcerne.countryName" />
            </div>
            

    
      <label for="proprietaireLieuConcerne" class="required"><g:message code="taror.property.proprietaireLieuConcerne.label" /> *  <span><g:message code="taror.property.proprietaireLieuConcerne.help" /></span></label>
            <input type="text" id="proprietaireLieuConcerne" name="proprietaireLieuConcerne" value="${rqt.proprietaireLieuConcerne?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['general'].invalidFields.contains('proprietaireLieuConcerne') ? 'validation-failed' : ''}" title="<g:message code="taror.property.proprietaireLieuConcerne.validationError" />"   />
            

    
      <label for="descriptifLieuConcerne" class=""><g:message code="taror.property.descriptifLieuConcerne.label" />   <span><g:message code="taror.property.descriptifLieuConcerne.help" /></span></label>
            <textarea id="descriptifLieuConcerne" name="descriptifLieuConcerne" class="  validate-textarea ${rqt.stepStates['general'].invalidFields.contains('descriptifLieuConcerne') ? 'validation-failed' : ''}" title="<g:message code="taror.property.descriptifLieuConcerne.validationError" />" rows="3" cols=""  >${rqt.descriptifLieuConcerne}</textarea>
            

    
    </fieldset>
  

  
    <fieldset class="required">
    <legend><g:message code="taror.property.periode.label" /></legend>
    
      <label class="required"><g:message code="taror.property.debutPeriode.label" /> *  <span><g:message code="taror.property.debutPeriode.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['general'].invalidFields.contains('debutPeriode') ? 'validation-failed' : ''}"
                id="debutPeriode_day"
                name="debutPeriode_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.debutPeriode?.date == it
                      || (rqt.debutPeriode == null && params['debutPeriode_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['general'].invalidFields.contains('debutPeriode') ? 'validation-failed' : ''}"
                id="debutPeriode_month"
                name="debutPeriode_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.debutPeriode?.month == (it - 1)
                      || (rqt.debutPeriode == null && params['debutPeriode_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['general'].invalidFields.contains('debutPeriode') ? 'validation-failed' : ''}"
                id="debutPeriode_year"
                name="debutPeriode_year"
                value="${rqt.debutPeriode ? rqt.debutPeriode.year + 1900 : params['debutPeriode_year']}"
                title="<g:message code="taror.property.debutPeriode.validationError" />" />
            </div>
            

    
      <label class="required"><g:message code="taror.property.finPeriode.label" /> *  <span><g:message code="taror.property.finPeriode.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['general'].invalidFields.contains('finPeriode') ? 'validation-failed' : ''}"
                id="finPeriode_day"
                name="finPeriode_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.finPeriode?.date == it
                      || (rqt.finPeriode == null && params['finPeriode_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['general'].invalidFields.contains('finPeriode') ? 'validation-failed' : ''}"
                id="finPeriode_month"
                name="finPeriode_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.finPeriode?.month == (it - 1)
                      || (rqt.finPeriode == null && params['finPeriode_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['general'].invalidFields.contains('finPeriode') ? 'validation-failed' : ''}"
                id="finPeriode_year"
                name="finPeriode_year"
                value="${rqt.finPeriode ? rqt.finPeriode.year + 1900 : params['finPeriode_year']}"
                title="<g:message code="taror.property.finPeriode.validationError" />" />
            </div>
            

    
    </fieldset>
  

  
    <fieldset class="required">
    <legend><g:message code="taror.property.entrepriseChargeeTravaux.label" /></legend>
    
      <label for="nomEntreprise" class="required"><g:message code="taror.property.nomEntreprise.label" /> *  <span><g:message code="taror.property.nomEntreprise.help" /></span></label>
            <input type="text" id="nomEntreprise" name="nomEntreprise" value="${rqt.nomEntreprise?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['general'].invalidFields.contains('nomEntreprise') ? 'validation-failed' : ''}" title="<g:message code="taror.property.nomEntreprise.validationError" />"   />
            

    
      <label class="required"><g:message code="taror.property.adresseEntreprise.label" /> *  <span><g:message code="taror.property.adresseEntreprise.help" /></span></label>
            <div id="adresseEntreprise" class="address required  ${rqt.stepStates['general'].invalidFields.contains('adresseEntreprise') ? 'validation-failed' : ''}">
            <label for="adresseEntreprise.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['general'].invalidFields.contains('adresseEntreprise.additionalDeliveryInformation') ? 'validation-failed' : ''}" value="${rqt.adresseEntreprise?.additionalDeliveryInformation}" maxlength="38" id="adresseEntreprise.additionalDeliveryInformation" name="adresseEntreprise.additionalDeliveryInformation" />  
            <label for="adresseEntreprise.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['general'].invalidFields.contains('adresseEntreprise.additionalGeographicalInformation') ? 'validation-failed' : ''}" value="${rqt.adresseEntreprise?.additionalGeographicalInformation}" maxlength="38" id="adresseEntreprise.additionalGeographicalInformation" name="adresseEntreprise.additionalGeographicalInformation" />
            <label for="adresseEntreprise_streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="adresseEntreprise_streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1 validate-streetNumber ${rqt.stepStates['general'].invalidFields.contains('adresseEntreprise.streetNumber') ? 'validation-failed' : ''}" value="${rqt.adresseEntreprise?.streetNumber}" size="5" maxlength="5" id="adresseEntreprise_streetNumber" name="adresseEntreprise.streetNumber" />
            <input type="text" class="line2 required validate-streetName ${rqt.stepStates['general'].invalidFields.contains('adresseEntreprise.streetName') ? 'validation-failed' : ''}" value="${rqt.adresseEntreprise?.streetName}" maxlength="32" id="adresseEntreprise_streetName" name="adresseEntreprise.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <input type="hidden" value="${rqt.adresseEntreprise?.streetMatriculation}" id="adresseEntreprise_streetMatriculation" name="adresseEntreprise.streetMatriculation" />
            <input type="hidden" value="${rqt.adresseEntreprise?.streetRivoliCode}" id="adresseEntreprise_streetRivoliCode" name="adresseEntreprise.streetRivoliCode" />
            <label for="adresseEntreprise.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['general'].invalidFields.contains('adresseEntreprise.placeNameOrService') ? 'validation-failed' : ''}" value="${rqt.adresseEntreprise?.placeNameOrService}" maxlength="38" id="adresseEntreprise.placeNameOrService" name="adresseEntreprise.placeNameOrService" />
            <label for="adresseEntreprise_postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="adresseEntreprise_city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required validate-postalCode ${rqt.stepStates['general'].invalidFields.contains('adresseEntreprise.postalCode') ? 'validation-failed' : ''}" value="${rqt.adresseEntreprise?.postalCode}" size="5" maxlength="5" id="adresseEntreprise_postalCode" name="adresseEntreprise.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required validate-city ${rqt.stepStates['general'].invalidFields.contains('adresseEntreprise.city') ? 'validation-failed' : ''}" value="${rqt.adresseEntreprise?.city}" maxlength="32" id="adresseEntreprise_city" name="adresseEntreprise.city" title="<g:message code="address.property.city.validationError" />" />
            <input type="hidden" value="${rqt.adresseEntreprise?.cityInseeCode}" id="adresseEntreprise_cityInseeCode" name="adresseEntreprise.cityInseeCode" />
            <label for="adresseEntreprise.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['general'].invalidFields.contains('adresseEntreprise.countryName') ? 'validation-failed' : ''}" value="${rqt.adresseEntreprise?.countryName}" maxlength="38" id="adresseEntreprise.countryName" name="adresseEntreprise.countryName" />
            </div>
            

    
      <label for="telephoneEntreprise" class="required"><g:message code="taror.property.telephoneEntreprise.label" /> *  <span><g:message code="taror.property.telephoneEntreprise.help" /></span></label>
            <input type="text" id="telephoneEntreprise" name="telephoneEntreprise" value="${rqt.telephoneEntreprise?.toString()}" 
                    class="required  validate-phone ${rqt.stepStates['general'].invalidFields.contains('telephoneEntreprise') ? 'validation-failed' : ''}" title="<g:message code="taror.property.telephoneEntreprise.validationError" />"  maxlength="10" />
            

    
      <label for="telecopieEntreprise" class=""><g:message code="taror.property.telecopieEntreprise.label" />   <span><g:message code="taror.property.telecopieEntreprise.help" /></span></label>
            <input type="text" id="telecopieEntreprise" name="telecopieEntreprise" value="${rqt.telecopieEntreprise?.toString()}" 
                    class="  validate-phone ${rqt.stepStates['general'].invalidFields.contains('telecopieEntreprise') ? 'validation-failed' : ''}" title="<g:message code="taror.property.telecopieEntreprise.validationError" />"  maxlength="10" />
            

    
    </fieldset>
  

