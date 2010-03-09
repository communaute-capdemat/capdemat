


  
    <label for="demandeLibreScolaire" class="required"><g:message code="myr.property.demandeLibreScolaire.label" /> *  <span><g:message code="myr.property.demandeLibreScolaire.help" /></span></label>
            <textarea id="demandeLibreScolaire" name="demandeLibreScolaire" class="required  validate-regex ${rqt.stepStates['demandeParcoursScolaireEtFormation'].invalidFields.contains('demandeLibreScolaire') ? 'validation-failed' : ''}" title="<g:message code="myr.property.demandeLibreScolaire.validationError" />" rows="5" cols="" regex="^.{0,2048}$" maxlength="2048">${rqt.demandeLibreScolaire}</textarea>
            

  

  
    <label class=""><g:message code="myr.property.preferencesEtablissementOuService.label" />   <span><g:message code="myr.property.preferencesEtablissementOuService.help" /></span></label>
            <ul class="yes-no  ${rqt.stepStates['demandeParcoursScolaireEtFormation'].invalidFields.contains('preferencesEtablissementOuService') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="preferencesEtablissementOuService_${it ? 'yes' : 'no'}" class="condition-preferencesEtablissementOuService-trigger  validate-one-required boolean" title="" value="${it}" name="preferencesEtablissementOuService" ${ rq ?  (it == rqt.preferencesEtablissementOuService ? 'checked="checked"': '') : (it == false ? 'checked="checked"': '') } />
                <label for="preferencesEtablissementOuService_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

  

  
    <fieldset class="required condition-preferencesEtablissementOuService-filled">
    <legend><g:message code="myr.property.precisionPreferencesEtablissementOuService.label" /></legend>
    
      <label for="precisionPreferencesEtablissementOuService.nomPreferenceEtablissementOuService" class="required"><g:message code="myr.property.nomPreferenceEtablissementOuService.label" /> *  <span><g:message code="myr.property.nomPreferenceEtablissementOuService.help" /></span></label>
            <input type="text" id="precisionPreferencesEtablissementOuService.nomPreferenceEtablissementOuService" name="precisionPreferencesEtablissementOuService.nomPreferenceEtablissementOuService" value="${rqt.precisionPreferencesEtablissementOuService?.nomPreferenceEtablissementOuService?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['demandeParcoursScolaireEtFormation'].invalidFields.contains('precisionPreferencesEtablissementOuService.nomPreferenceEtablissementOuService') ? 'validation-failed' : ''}" title="<g:message code="myr.property.nomPreferenceEtablissementOuService.validationError" />"   />
            

    
      <label for="precisionPreferencesEtablissementOuService.codePostalPreferenceEtablissementOuService" class="required"><g:message code="myr.property.codePostalPreferenceEtablissementOuService.label" /> *  <span><g:message code="myr.property.codePostalPreferenceEtablissementOuService.help" /></span></label>
            <input type="text" id="precisionPreferencesEtablissementOuService.codePostalPreferenceEtablissementOuService" name="precisionPreferencesEtablissementOuService.codePostalPreferenceEtablissementOuService" value="${rqt.precisionPreferencesEtablissementOuService?.codePostalPreferenceEtablissementOuService?.toString()}" 
                    class="required  validate-postalCode ${rqt.stepStates['demandeParcoursScolaireEtFormation'].invalidFields.contains('precisionPreferencesEtablissementOuService.codePostalPreferenceEtablissementOuService') ? 'validation-failed' : ''}" title="<g:message code="myr.property.codePostalPreferenceEtablissementOuService.validationError" />"  maxlength="5" />
            

    
      <label for="precisionPreferencesEtablissementOuService.communePreferenceEtablissementOuService" class="required"><g:message code="myr.property.communePreferenceEtablissementOuService.label" /> *  <span><g:message code="myr.property.communePreferenceEtablissementOuService.help" /></span></label>
            <input type="text" id="precisionPreferencesEtablissementOuService.communePreferenceEtablissementOuService" name="precisionPreferencesEtablissementOuService.communePreferenceEtablissementOuService" value="${rqt.precisionPreferencesEtablissementOuService?.communePreferenceEtablissementOuService?.toString()}" 
                    class="required  validate-city ${rqt.stepStates['demandeParcoursScolaireEtFormation'].invalidFields.contains('precisionPreferencesEtablissementOuService.communePreferenceEtablissementOuService') ? 'validation-failed' : ''}" title="<g:message code="myr.property.communePreferenceEtablissementOuService.validationError" />"  maxlength="32" />
            

    
    </fieldset>
  

