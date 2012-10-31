


  
    <label for="choixPrestationCompensation" class="required"><g:message code="mar.property.choixPrestationCompensation.label" /> *  <span><g:message code="mar.property.choixPrestationCompensation.help" /></span></label>
            <select id="choixPrestationCompensation" name="choixPrestationCompensation" class="required  validate-not-first ${rqt.stepStates['demandePrestationCompensation'].invalidFields.contains('choixPrestationCompensation') ? 'validation-failed' : ''}" title="<g:message code="mar.property.choixPrestationCompensation.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['PCH','ACTP','ACFP']}">
                <option value="${it}" ${it == rqt.choixPrestationCompensation?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mar.property.choixPrestationCompensation" /></option>
              </g:each>
            </select>
            

  

  
    <label class="required"><g:message code="mar.property.allocationPersonnaliseeAutonomie.label" /> *  <span><g:message code="mar.property.allocationPersonnaliseeAutonomie.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['demandePrestationCompensation'].invalidFields.contains('allocationPersonnaliseeAutonomie') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="allocationPersonnaliseeAutonomie_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="allocationPersonnaliseeAutonomie" ${ rq ?  (it == rqt.allocationPersonnaliseeAutonomie ? 'checked="checked"': '') : (it == false ? 'checked="checked"': '') } />
                <label for="allocationPersonnaliseeAutonomie_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

  

  
    <fieldset class="">
    <legend><g:message code="mar.property.besoinsDemandePCH.label" /></legend>
    
      <label class=""><g:message code="mar.property.aideHumaine.label" />   <span><g:message code="mar.property.aideHumaine.help" /></span></label>
            <ul class="yes-no  ${rqt.stepStates['demandePrestationCompensation'].invalidFields.contains('besoinsDemandePCH.aideHumaine') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="besoinsDemandePCH.aideHumaine_${it ? 'yes' : 'no'}" class="condition-aideHumaine-trigger  validate-one-required boolean" title="" value="${it}" name="besoinsDemandePCH.aideHumaine" ${ rqt.besoinsDemandePCH ?  (it == rqt.besoinsDemandePCH?.aideHumaine ? 'checked="checked"': '') : (it == false ? 'checked="checked"': '') } />
                <label for="besoinsDemandePCH.aideHumaine_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label for="besoinsDemandePCH.precisionAideHumaine" class="required condition-aideHumaine-filled"><g:message code="mar.property.precisionAideHumaine.label" /> *  <span><g:message code="mar.property.precisionAideHumaine.help" /></span></label>
            <input type="text" id="besoinsDemandePCH.precisionAideHumaine" name="besoinsDemandePCH.precisionAideHumaine" value="${rqt.besoinsDemandePCH?.precisionAideHumaine?.toString()}" 
                    class="required condition-aideHumaine-filled  validate-string ${rqt.stepStates['demandePrestationCompensation'].invalidFields.contains('besoinsDemandePCH.precisionAideHumaine') ? 'validation-failed' : ''}" title="<g:message code="mar.property.precisionAideHumaine.validationError" />"   />
            

    
      <label class=""><g:message code="mar.property.aideTechnique.label" />   <span><g:message code="mar.property.aideTechnique.help" /></span></label>
            <ul class="yes-no  ${rqt.stepStates['demandePrestationCompensation'].invalidFields.contains('besoinsDemandePCH.aideTechnique') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="besoinsDemandePCH.aideTechnique_${it ? 'yes' : 'no'}" class="condition-aideTechnique-trigger  validate-one-required boolean" title="" value="${it}" name="besoinsDemandePCH.aideTechnique" ${ rqt.besoinsDemandePCH ?  (it == rqt.besoinsDemandePCH?.aideTechnique ? 'checked="checked"': '') : (it == false ? 'checked="checked"': '') } />
                <label for="besoinsDemandePCH.aideTechnique_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label for="besoinsDemandePCH.precisionAideTechnique" class="required condition-aideTechnique-filled"><g:message code="mar.property.precisionAideTechnique.label" /> *  <span><g:message code="mar.property.precisionAideTechnique.help" /></span></label>
            <input type="text" id="besoinsDemandePCH.precisionAideTechnique" name="besoinsDemandePCH.precisionAideTechnique" value="${rqt.besoinsDemandePCH?.precisionAideTechnique?.toString()}" 
                    class="required condition-aideTechnique-filled  validate-string ${rqt.stepStates['demandePrestationCompensation'].invalidFields.contains('besoinsDemandePCH.precisionAideTechnique') ? 'validation-failed' : ''}" title="<g:message code="mar.property.precisionAideTechnique.validationError" />"   />
            

    
      <label class=""><g:message code="mar.property.amenagementLogementDemenagement.label" />   <span><g:message code="mar.property.amenagementLogementDemenagement.help" /></span></label>
            <ul class="yes-no  ${rqt.stepStates['demandePrestationCompensation'].invalidFields.contains('besoinsDemandePCH.amenagementLogementDemenagement') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="besoinsDemandePCH.amenagementLogementDemenagement_${it ? 'yes' : 'no'}" class="condition-amenagementLogementDemenagement-trigger  validate-one-required boolean" title="" value="${it}" name="besoinsDemandePCH.amenagementLogementDemenagement" ${ rqt.besoinsDemandePCH ?  (it == rqt.besoinsDemandePCH?.amenagementLogementDemenagement ? 'checked="checked"': '') : (it == false ? 'checked="checked"': '') } />
                <label for="besoinsDemandePCH.amenagementLogementDemenagement_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label for="besoinsDemandePCH.precisionAmenagementLogementDemenagement" class="required condition-amenagementLogementDemenagement-filled"><g:message code="mar.property.precisionAmenagementLogementDemenagement.label" /> *  <span><g:message code="mar.property.precisionAmenagementLogementDemenagement.help" /></span></label>
            <input type="text" id="besoinsDemandePCH.precisionAmenagementLogementDemenagement" name="besoinsDemandePCH.precisionAmenagementLogementDemenagement" value="${rqt.besoinsDemandePCH?.precisionAmenagementLogementDemenagement?.toString()}" 
                    class="required condition-amenagementLogementDemenagement-filled  validate-string ${rqt.stepStates['demandePrestationCompensation'].invalidFields.contains('besoinsDemandePCH.precisionAmenagementLogementDemenagement') ? 'validation-failed' : ''}" title="<g:message code="mar.property.precisionAmenagementLogementDemenagement.validationError" />"   />
            

    
      <label class=""><g:message code="mar.property.amenagementVehicule.label" />   <span><g:message code="mar.property.amenagementVehicule.help" /></span></label>
            <ul class="yes-no  ${rqt.stepStates['demandePrestationCompensation'].invalidFields.contains('besoinsDemandePCH.amenagementVehicule') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="besoinsDemandePCH.amenagementVehicule_${it ? 'yes' : 'no'}" class="condition-amenagementVehicule-trigger  validate-one-required boolean" title="" value="${it}" name="besoinsDemandePCH.amenagementVehicule" ${ rqt.besoinsDemandePCH ?  (it == rqt.besoinsDemandePCH?.amenagementVehicule ? 'checked="checked"': '') : (it == false ? 'checked="checked"': '') } />
                <label for="besoinsDemandePCH.amenagementVehicule_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label for="besoinsDemandePCH.precisionAmenagementVehicule" class="required condition-amenagementVehicule-filled"><g:message code="mar.property.precisionAmenagementVehicule.label" /> *  <span><g:message code="mar.property.precisionAmenagementVehicule.help" /></span></label>
            <input type="text" id="besoinsDemandePCH.precisionAmenagementVehicule" name="besoinsDemandePCH.precisionAmenagementVehicule" value="${rqt.besoinsDemandePCH?.precisionAmenagementVehicule?.toString()}" 
                    class="required condition-amenagementVehicule-filled  validate-string ${rqt.stepStates['demandePrestationCompensation'].invalidFields.contains('besoinsDemandePCH.precisionAmenagementVehicule') ? 'validation-failed' : ''}" title="<g:message code="mar.property.precisionAmenagementVehicule.validationError" />"   />
            

    
      <label class=""><g:message code="mar.property.chargesSpecifiques.label" />   <span><g:message code="mar.property.chargesSpecifiques.help" /></span></label>
            <ul class="yes-no  ${rqt.stepStates['demandePrestationCompensation'].invalidFields.contains('besoinsDemandePCH.chargesSpecifiques') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="besoinsDemandePCH.chargesSpecifiques_${it ? 'yes' : 'no'}" class="condition-chargesSpecifiques-trigger  validate-one-required boolean" title="" value="${it}" name="besoinsDemandePCH.chargesSpecifiques" ${ rqt.besoinsDemandePCH ?  (it == rqt.besoinsDemandePCH?.chargesSpecifiques ? 'checked="checked"': '') : (it == false ? 'checked="checked"': '') } />
                <label for="besoinsDemandePCH.chargesSpecifiques_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label for="besoinsDemandePCH.precisionChargesSpecifiques" class="required condition-chargesSpecifiques-filled"><g:message code="mar.property.precisionChargesSpecifiques.label" /> *  <span><g:message code="mar.property.precisionChargesSpecifiques.help" /></span></label>
            <input type="text" id="besoinsDemandePCH.precisionChargesSpecifiques" name="besoinsDemandePCH.precisionChargesSpecifiques" value="${rqt.besoinsDemandePCH?.precisionChargesSpecifiques?.toString()}" 
                    class="required condition-chargesSpecifiques-filled  validate-string ${rqt.stepStates['demandePrestationCompensation'].invalidFields.contains('besoinsDemandePCH.precisionChargesSpecifiques') ? 'validation-failed' : ''}" title="<g:message code="mar.property.precisionChargesSpecifiques.validationError" />"   />
            

    
      <label class=""><g:message code="mar.property.aideAnimaliere.label" />   <span><g:message code="mar.property.aideAnimaliere.help" /></span></label>
            <ul class="yes-no  ${rqt.stepStates['demandePrestationCompensation'].invalidFields.contains('besoinsDemandePCH.aideAnimaliere') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="besoinsDemandePCH.aideAnimaliere_${it ? 'yes' : 'no'}" class="condition-aideAnimaliere-trigger  validate-one-required boolean" title="" value="${it}" name="besoinsDemandePCH.aideAnimaliere" ${ rqt.besoinsDemandePCH ?  (it == rqt.besoinsDemandePCH?.aideAnimaliere ? 'checked="checked"': '') : (it == false ? 'checked="checked"': '') } />
                <label for="besoinsDemandePCH.aideAnimaliere_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label for="besoinsDemandePCH.precisionAideAnimaliere" class="required condition-aideAnimaliere-filled"><g:message code="mar.property.precisionAideAnimaliere.label" /> *  <span><g:message code="mar.property.precisionAideAnimaliere.help" /></span></label>
            <input type="text" id="besoinsDemandePCH.precisionAideAnimaliere" name="besoinsDemandePCH.precisionAideAnimaliere" value="${rqt.besoinsDemandePCH?.precisionAideAnimaliere?.toString()}" 
                    class="required condition-aideAnimaliere-filled  validate-string ${rqt.stepStates['demandePrestationCompensation'].invalidFields.contains('besoinsDemandePCH.precisionAideAnimaliere') ? 'validation-failed' : ''}" title="<g:message code="mar.property.precisionAideAnimaliere.validationError" />"   />
            

    
    </fieldset>
  

