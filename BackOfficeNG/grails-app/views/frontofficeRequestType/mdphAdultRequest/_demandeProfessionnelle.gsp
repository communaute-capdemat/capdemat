


  
    <label class="required"><g:message code="mar.property.rqth.label" /> *  <span><g:message code="mar.property.rqth.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['demandeProfessionnelle'].invalidFields.contains('rqth') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="rqth_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="rqth" ${it == rqt.rqth ? 'checked="checked"': ''} />
                <label for="rqth_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

  

  
    <label class="required"><g:message code="mar.property.primeReclassement.label" /> *  <span><g:message code="mar.property.primeReclassement.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['demandeProfessionnelle'].invalidFields.contains('primeReclassement') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="primeReclassement_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="primeReclassement" ${it == rqt.primeReclassement ? 'checked="checked"': ''} />
                <label for="primeReclassement_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

  

  
    <label class="required"><g:message code="mar.property.autre.label" /> *  <span><g:message code="mar.property.autre.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['demandeProfessionnelle'].invalidFields.contains('autre') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="autre_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="autre" ${it == rqt.autre ? 'checked="checked"': ''} />
                <label for="autre_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

  

  
    <label class="required"><g:message code="mar.property.orientationReclassement.label" /> *  <span><g:message code="mar.property.orientationReclassement.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['demandeProfessionnelle'].invalidFields.contains('orientationReclassement') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="orientationReclassement_${it ? 'yes' : 'no'}" class="required condition-orientationReclassement-trigger  validate-one-required boolean" title="" value="${it}" name="orientationReclassement" ${it == rqt.orientationReclassement ? 'checked="checked"': ''} />
                <label for="orientationReclassement_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

  

  
    <label for="choixOrientationReclassement" class="required condition-orientationReclassement-filled"><g:message code="mar.property.choixOrientationReclassement.label" /> *  <span><g:message code="mar.property.choixOrientationReclassement.help" /></span></label>
            <select id="choixOrientationReclassement" name="choixOrientationReclassement" class="required condition-orientationReclassement-filled  validate-not-first ${rqt.stepStates['demandeProfessionnelle'].invalidFields.contains('choixOrientationReclassement') ? 'validation-failed' : ''}" title="<g:message code="mar.property.choixOrientationReclassement.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['FORMATION','ORDINAIRE','PROTEGE']}">
                <option value="${it}" ${it == rqt.choixOrientationReclassement?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mar.property.choixOrientationReclassement" /></option>
              </g:each>
            </select>
            

  

