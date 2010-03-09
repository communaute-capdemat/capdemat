


  
    <label for="situationActuelle" class="required"><g:message code="mar.property.situationActuelle.label" /> *  <span><g:message code="mar.property.situationActuelle.help" /></span></label>
            <select id="situationActuelle" name="situationActuelle" class="required  validate-not-first ${rqt.stepStates['demandeOrientationMedicoSociale'].invalidFields.contains('situationActuelle') ? 'validation-failed' : ''}" title="<g:message code="mar.property.situationActuelle.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['Accueiljour','Hebergementnuit','Hebergementpermanent','Accompagnement','Autres']}">
                <option value="fr.cg95.cvq.business.request.social.SituationActuelleType_${it}" ${it == rqt.situationActuelle?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mar.property.situationActuelle" /></option>
              </g:each>
            </select>
            

  

  
    <label for="situationActuellePrecision" class="required"><g:message code="mar.property.situationActuellePrecision.label" /> *  <span><g:message code="mar.property.situationActuellePrecision.help" /></span></label>
            <input type="text" id="situationActuellePrecision" name="situationActuellePrecision" value="${rqt.situationActuellePrecision?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['demandeOrientationMedicoSociale'].invalidFields.contains('situationActuellePrecision') ? 'validation-failed' : ''}" title="<g:message code="mar.property.situationActuellePrecision.validationError" />"   />
            

  

  
    <label for="orientationSouhaitee" class="required"><g:message code="mar.property.orientationSouhaitee.label" /> *  <span><g:message code="mar.property.orientationSouhaitee.help" /></span></label>
            <select id="orientationSouhaitee" name="orientationSouhaitee" class="required  validate-not-first ${rqt.stepStates['demandeOrientationMedicoSociale'].invalidFields.contains('orientationSouhaitee') ? 'validation-failed' : ''}" title="<g:message code="mar.property.orientationSouhaitee.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['Accueiljour','Hebergementnuit','Hebergementpermanent','Accompagnement','Autres']}">
                <option value="fr.cg95.cvq.business.request.social.OrientationSouhaiteeType_${it}" ${it == rqt.orientationSouhaitee?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mar.property.orientationSouhaitee" /></option>
              </g:each>
            </select>
            

  

  
    <label class="required"><g:message code="mar.property.dateEntreeSouhaitee.label" /> *  <span><g:message code="mar.property.dateEntreeSouhaitee.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['demandeOrientationMedicoSociale'].invalidFields.contains('dateEntreeSouhaitee') ? 'validation-failed' : ''}"
                id="dateEntreeSouhaitee_day"
                name="dateEntreeSouhaitee_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.dateEntreeSouhaitee?.date == it
                      || (rqt.dateEntreeSouhaitee == null && params['dateEntreeSouhaitee_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['demandeOrientationMedicoSociale'].invalidFields.contains('dateEntreeSouhaitee') ? 'validation-failed' : ''}"
                id="dateEntreeSouhaitee_month"
                name="dateEntreeSouhaitee_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.dateEntreeSouhaitee?.month == (it - 1)
                      || (rqt.dateEntreeSouhaitee == null && params['dateEntreeSouhaitee_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['demandeOrientationMedicoSociale'].invalidFields.contains('dateEntreeSouhaitee') ? 'validation-failed' : ''}"
                id="dateEntreeSouhaitee_year"
                name="dateEntreeSouhaitee_year"
                value="${rqt.dateEntreeSouhaitee ? rqt.dateEntreeSouhaitee.year + 1900 : params['dateEntreeSouhaitee_year']}"
                title="<g:message code="mar.property.dateEntreeSouhaitee.validationError" />" />
            </div>
            

  

  
    <label class="required"><g:message code="mar.property.preferenceEtablissementOuService.label" /> *  <span><g:message code="mar.property.preferenceEtablissementOuService.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['demandeOrientationMedicoSociale'].invalidFields.contains('preferenceEtablissementOuService') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="preferenceEtablissementOuService_${it ? 'yes' : 'no'}" class="required condition-preferenceEtablissementOuService-trigger  validate-one-required boolean" title="" value="${it}" name="preferenceEtablissementOuService" ${it == rqt.preferenceEtablissementOuService ? 'checked="checked"': ''} />
                <label for="preferenceEtablissementOuService_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

  

  
    <fieldset class="required condition-preferenceEtablissementOuService-filled">
    <legend><g:message code="mar.property.precisionPreferenceEtablissementOuService.label" /></legend>
    
      <label for="precisionPreferenceEtablissementOuService.nomEtablissementPreference" class="required"><g:message code="mar.property.nomEtablissementPreference.label" /> *  <span><g:message code="mar.property.nomEtablissementPreference.help" /></span></label>
            <input type="text" id="precisionPreferenceEtablissementOuService.nomEtablissementPreference" name="precisionPreferenceEtablissementOuService.nomEtablissementPreference" value="${rqt.precisionPreferenceEtablissementOuService?.nomEtablissementPreference?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['demandeOrientationMedicoSociale'].invalidFields.contains('precisionPreferenceEtablissementOuService.nomEtablissementPreference') ? 'validation-failed' : ''}" title="<g:message code="mar.property.nomEtablissementPreference.validationError" />"   />
            

    
      <label for="precisionPreferenceEtablissementOuService.codePostalEtablissementPreference" class="required"><g:message code="mar.property.codePostalEtablissementPreference.label" /> *  <span><g:message code="mar.property.codePostalEtablissementPreference.help" /></span></label>
            <input type="text" id="precisionPreferenceEtablissementOuService.codePostalEtablissementPreference" name="precisionPreferenceEtablissementOuService.codePostalEtablissementPreference" value="${rqt.precisionPreferenceEtablissementOuService?.codePostalEtablissementPreference?.toString()}" 
                    class="required  validate-postalCode ${rqt.stepStates['demandeOrientationMedicoSociale'].invalidFields.contains('precisionPreferenceEtablissementOuService.codePostalEtablissementPreference') ? 'validation-failed' : ''}" title="<g:message code="mar.property.codePostalEtablissementPreference.validationError" />"  maxlength="5" />
            

    
      <label for="precisionPreferenceEtablissementOuService.communeEtablissementPreference" class="required"><g:message code="mar.property.communeEtablissementPreference.label" /> *  <span><g:message code="mar.property.communeEtablissementPreference.help" /></span></label>
            <input type="text" id="precisionPreferenceEtablissementOuService.communeEtablissementPreference" name="precisionPreferenceEtablissementOuService.communeEtablissementPreference" value="${rqt.precisionPreferenceEtablissementOuService?.communeEtablissementPreference?.toString()}" 
                    class="required  validate-city ${rqt.stepStates['demandeOrientationMedicoSociale'].invalidFields.contains('precisionPreferenceEtablissementOuService.communeEtablissementPreference') ? 'validation-failed' : ''}" title="<g:message code="mar.property.communeEtablissementPreference.validationError" />"  maxlength="32" />
            

    
      <label for="precisionPreferenceEtablissementOuService.telephoneEtablissementPreference" class="required"><g:message code="mar.property.telephoneEtablissementPreference.label" /> *  <span><g:message code="mar.property.telephoneEtablissementPreference.help" /></span></label>
            <input type="text" id="precisionPreferenceEtablissementOuService.telephoneEtablissementPreference" name="precisionPreferenceEtablissementOuService.telephoneEtablissementPreference" value="${rqt.precisionPreferenceEtablissementOuService?.telephoneEtablissementPreference?.toString()}" 
                    class="required  validate-phone ${rqt.stepStates['demandeOrientationMedicoSociale'].invalidFields.contains('precisionPreferenceEtablissementOuService.telephoneEtablissementPreference') ? 'validation-failed' : ''}" title="<g:message code="mar.property.telephoneEtablissementPreference.validationError" />"  maxlength="10" />
            

    
    </fieldset>
  

