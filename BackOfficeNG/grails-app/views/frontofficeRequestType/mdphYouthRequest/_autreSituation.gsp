


  
    <label for="situationParticuliere" class=""><g:message code="myr.property.situationParticuliere.label" />   <span><g:message code="myr.property.situationParticuliere.help" /></span></label>
            <select id="situationParticuliere" name="situationParticuliere" class="condition-estAutreCas-trigger condition-estUnCas-trigger  validate-select ${rqt.stepStates['autreSituation'].invalidFields.contains('situationParticuliere') ? 'validation-failed' : ''}" title="<g:message code="myr.property.situationParticuliere.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['EtablissementMedicoSocial','Hospitalise','Autre']}">
                <option value="fr.cg95.cvq.business.request.social.MyrSituationAutreType_${it}" ${it == rqt.situationParticuliere?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="myr.property.situationParticuliere" /></option>
              </g:each>
            </select>
            

  

  
    <label for="precisionAutre" class="required condition-estAutreCas-filled"><g:message code="myr.property.precisionAutre.label" /> *  <span><g:message code="myr.property.precisionAutre.help" /></span></label>
            <input type="text" id="precisionAutre" name="precisionAutre" value="${rqt.precisionAutre?.toString()}" 
                    class="required condition-estAutreCas-filled  validate-string ${rqt.stepStates['autreSituation'].invalidFields.contains('precisionAutre') ? 'validation-failed' : ''}" title="<g:message code="myr.property.precisionAutre.validationError" />"   />
            

  

  
    <label for="nomEtablissement" class="required condition-estUnCas-filled"><g:message code="myr.property.nomEtablissement.label" /> *  <span><g:message code="myr.property.nomEtablissement.help" /></span></label>
            <input type="text" id="nomEtablissement" name="nomEtablissement" value="${rqt.nomEtablissement?.toString()}" 
                    class="required condition-estUnCas-filled  validate-string ${rqt.stepStates['autreSituation'].invalidFields.contains('nomEtablissement') ? 'validation-failed' : ''}" title="<g:message code="myr.property.nomEtablissement.validationError" />"   />
            

  

  
    <label class="required condition-estUnCas-filled"><g:message code="myr.property.domiciliationEtablissement.label" /> *  <span><g:message code="myr.property.domiciliationEtablissement.help" /></span></label>
            <div id="domiciliationEtablissement" class="address required condition-estUnCas-filled  ${rqt.stepStates['autreSituation'].invalidFields.contains('domiciliationEtablissement') ? 'validation-failed' : ''}">
            <label for="domiciliationEtablissement.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['autreSituation'].invalidFields.contains('domiciliationEtablissement.additionalDeliveryInformation') ? 'validation-failed' : ''}" value="${rqt.domiciliationEtablissement?.additionalDeliveryInformation}" maxlength="38" id="domiciliationEtablissement.additionalDeliveryInformation" name="domiciliationEtablissement.additionalDeliveryInformation" />  
            <label for="domiciliationEtablissement.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['autreSituation'].invalidFields.contains('domiciliationEtablissement.additionalGeographicalInformation') ? 'validation-failed' : ''}" value="${rqt.domiciliationEtablissement?.additionalGeographicalInformation}" maxlength="38" id="domiciliationEtablissement.additionalGeographicalInformation" name="domiciliationEtablissement.additionalGeographicalInformation" />
            <label for="domiciliationEtablissement_streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="domiciliationEtablissement_streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1 validate-streetNumber ${rqt.stepStates['autreSituation'].invalidFields.contains('domiciliationEtablissement.streetNumber') ? 'validation-failed' : ''}" value="${rqt.domiciliationEtablissement?.streetNumber}" size="5" maxlength="5" id="domiciliationEtablissement_streetNumber" name="domiciliationEtablissement.streetNumber" />
            <input type="text" class="line2 required validate-streetName ${rqt.stepStates['autreSituation'].invalidFields.contains('domiciliationEtablissement.streetName') ? 'validation-failed' : ''}" value="${rqt.domiciliationEtablissement?.streetName}" maxlength="32" id="domiciliationEtablissement_streetName" name="domiciliationEtablissement.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <input type="hidden" value="${rqt.domiciliationEtablissement?.streetMatriculation}" id="domiciliationEtablissement_streetMatriculation" name="domiciliationEtablissement.streetMatriculation" />
            <input type="hidden" value="${rqt.domiciliationEtablissement?.streetRivoliCode}" id="domiciliationEtablissement_streetRivoliCode" name="domiciliationEtablissement.streetRivoliCode" />
            <label for="domiciliationEtablissement.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['autreSituation'].invalidFields.contains('domiciliationEtablissement.placeNameOrService') ? 'validation-failed' : ''}" value="${rqt.domiciliationEtablissement?.placeNameOrService}" maxlength="38" id="domiciliationEtablissement.placeNameOrService" name="domiciliationEtablissement.placeNameOrService" />
            <label for="domiciliationEtablissement_postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="domiciliationEtablissement_city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required validate-postalCode ${rqt.stepStates['autreSituation'].invalidFields.contains('domiciliationEtablissement.postalCode') ? 'validation-failed' : ''}" value="${rqt.domiciliationEtablissement?.postalCode}" size="5" maxlength="5" id="domiciliationEtablissement_postalCode" name="domiciliationEtablissement.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required validate-city ${rqt.stepStates['autreSituation'].invalidFields.contains('domiciliationEtablissement.city') ? 'validation-failed' : ''}" value="${rqt.domiciliationEtablissement?.city}" maxlength="32" id="domiciliationEtablissement_city" name="domiciliationEtablissement.city" title="<g:message code="address.property.city.validationError" />" />
            <input type="hidden" value="${rqt.domiciliationEtablissement?.cityInseeCode}" id="domiciliationEtablissement_cityInseeCode" name="domiciliationEtablissement.cityInseeCode" />
            <label for="domiciliationEtablissement.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['autreSituation'].invalidFields.contains('domiciliationEtablissement.countryName') ? 'validation-failed' : ''}" value="${rqt.domiciliationEtablissement?.countryName}" maxlength="38" id="domiciliationEtablissement.countryName" name="domiciliationEtablissement.countryName" />
            </div>
            

  

  
    <label for="typeLogement" class="required"><g:message code="myr.property.typeLogement.label" /> *  <span><g:message code="myr.property.typeLogement.help" /></span></label>
            <select id="typeLogement" name="typeLogement" class="required condition-typeLogement-trigger  validate-not-first ${rqt.stepStates['autreSituation'].invalidFields.contains('typeLogement') ? 'validation-failed' : ''}" title="<g:message code="myr.property.typeLogement.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['Locataire','Proprietaire','Heberge','Autre']}">
                <option value="fr.cg95.cvq.business.request.social.MyrLogementType_${it}" ${it == rqt.typeLogement?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="myr.property.typeLogement" /></option>
              </g:each>
            </select>
            

  

  
    <label for="precisionLogementAutre" class="required condition-typeLogement-filled"><g:message code="myr.property.precisionLogementAutre.label" /> *  <span><g:message code="myr.property.precisionLogementAutre.help" /></span></label>
            <input type="text" id="precisionLogementAutre" name="precisionLogementAutre" value="${rqt.precisionLogementAutre?.toString()}" 
                    class="required condition-typeLogement-filled  validate-string ${rqt.stepStates['autreSituation'].invalidFields.contains('precisionLogementAutre') ? 'validation-failed' : ''}" title="<g:message code="myr.property.precisionLogementAutre.validationError" />"   />
            

  

