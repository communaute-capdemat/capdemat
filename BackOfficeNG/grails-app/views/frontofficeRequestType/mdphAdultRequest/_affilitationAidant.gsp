


  
    <label for="nomAidant" class="required"><g:message code="mar.property.nomAidant.label" /> *  <span><g:message code="mar.property.nomAidant.help" /></span></label>
            <input type="text" id="nomAidant" name="nomAidant" value="${rqt.nomAidant?.toString()}" 
                    class="required  validate-lastName ${rqt.stepStates['affilitationAidant'].invalidFields.contains('nomAidant') ? 'validation-failed' : ''}" title="<g:message code="mar.property.nomAidant.validationError" />"  maxlength="38" />
            

  

  
    <label class="required"><g:message code="mar.property.domiciliationAidant.label" /> *  <span><g:message code="mar.property.domiciliationAidant.help" /></span></label>
            <div id="domiciliationAidant" class="address required  ${rqt.stepStates['affilitationAidant'].invalidFields.contains('domiciliationAidant') ? 'validation-failed' : ''}">
            <label for="domiciliationAidant.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['affilitationAidant'].invalidFields.contains('domiciliationAidant.additionalDeliveryInformation') ? 'validation-failed' : ''}" value="${rqt.domiciliationAidant?.additionalDeliveryInformation}" maxlength="38" id="domiciliationAidant.additionalDeliveryInformation" name="domiciliationAidant.additionalDeliveryInformation" />  
            <label for="domiciliationAidant.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['affilitationAidant'].invalidFields.contains('domiciliationAidant.additionalGeographicalInformation') ? 'validation-failed' : ''}" value="${rqt.domiciliationAidant?.additionalGeographicalInformation}" maxlength="38" id="domiciliationAidant.additionalGeographicalInformation" name="domiciliationAidant.additionalGeographicalInformation" />
            <label for="domiciliationAidant_streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="domiciliationAidant_streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1 validate-streetNumber ${rqt.stepStates['affilitationAidant'].invalidFields.contains('domiciliationAidant.streetNumber') ? 'validation-failed' : ''}" value="${rqt.domiciliationAidant?.streetNumber}" size="5" maxlength="5" id="domiciliationAidant_streetNumber" name="domiciliationAidant.streetNumber" />
            <input type="text" class="line2 required validate-streetName ${rqt.stepStates['affilitationAidant'].invalidFields.contains('domiciliationAidant.streetName') ? 'validation-failed' : ''}" value="${rqt.domiciliationAidant?.streetName}" maxlength="32" id="domiciliationAidant_streetName" name="domiciliationAidant.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <input type="hidden" value="${rqt.domiciliationAidant?.streetMatriculation}" id="domiciliationAidant_streetMatriculation" name="domiciliationAidant.streetMatriculation" />
            <input type="hidden" value="${rqt.domiciliationAidant?.streetRivoliCode}" id="domiciliationAidant_streetRivoliCode" name="domiciliationAidant.streetRivoliCode" />
            <label for="domiciliationAidant.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['affilitationAidant'].invalidFields.contains('domiciliationAidant.placeNameOrService') ? 'validation-failed' : ''}" value="${rqt.domiciliationAidant?.placeNameOrService}" maxlength="38" id="domiciliationAidant.placeNameOrService" name="domiciliationAidant.placeNameOrService" />
            <label for="domiciliationAidant_postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="domiciliationAidant_city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required validate-postalCode ${rqt.stepStates['affilitationAidant'].invalidFields.contains('domiciliationAidant.postalCode') ? 'validation-failed' : ''}" value="${rqt.domiciliationAidant?.postalCode}" size="5" maxlength="5" id="domiciliationAidant_postalCode" name="domiciliationAidant.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required validate-city ${rqt.stepStates['affilitationAidant'].invalidFields.contains('domiciliationAidant.city') ? 'validation-failed' : ''}" value="${rqt.domiciliationAidant?.city}" maxlength="32" id="domiciliationAidant_city" name="domiciliationAidant.city" title="<g:message code="address.property.city.validationError" />" />
            <input type="hidden" value="${rqt.domiciliationAidant?.cityInseeCode}" id="domiciliationAidant_cityInseeCode" name="domiciliationAidant.cityInseeCode" />
            <label for="domiciliationAidant.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['affilitationAidant'].invalidFields.contains('domiciliationAidant.countryName') ? 'validation-failed' : ''}" value="${rqt.domiciliationAidant?.countryName}" maxlength="38" id="domiciliationAidant.countryName" name="domiciliationAidant.countryName" />
            </div>
            

  

  
    <label class="required"><g:message code="mar.property.dateNaissanceAidant.label" /> *  <span><g:message code="mar.property.dateNaissanceAidant.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['affilitationAidant'].invalidFields.contains('dateNaissanceAidant') ? 'validation-failed' : ''}"
                id="dateNaissanceAidant_day"
                name="dateNaissanceAidant_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.dateNaissanceAidant?.date == it
                      || (rqt.dateNaissanceAidant == null && params['dateNaissanceAidant_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['affilitationAidant'].invalidFields.contains('dateNaissanceAidant') ? 'validation-failed' : ''}"
                id="dateNaissanceAidant_month"
                name="dateNaissanceAidant_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.dateNaissanceAidant?.month == (it - 1)
                      || (rqt.dateNaissanceAidant == null && params['dateNaissanceAidant_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['affilitationAidant'].invalidFields.contains('dateNaissanceAidant') ? 'validation-failed' : ''}"
                id="dateNaissanceAidant_year"
                name="dateNaissanceAidant_year"
                value="${rqt.dateNaissanceAidant ? rqt.dateNaissanceAidant.year + 1900 : params['dateNaissanceAidant_year']}"
                title="<g:message code="mar.property.dateNaissanceAidant.validationError" />" />
            </div>
            

  

  
    <label for="lienParenteAidant" class="required"><g:message code="mar.property.lienParenteAidant.label" /> *  <span><g:message code="mar.property.lienParenteAidant.help" /></span></label>
            <input type="text" id="lienParenteAidant" name="lienParenteAidant" value="${rqt.lienParenteAidant?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['affilitationAidant'].invalidFields.contains('lienParenteAidant') ? 'validation-failed' : ''}" title="<g:message code="mar.property.lienParenteAidant.validationError" />"   />
            

  

