


  
    <label class="required"><g:message code="mar.property.carteInvalidite.label" /> *  <span><g:message code="mar.property.carteInvalidite.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['demandeCartes'].invalidFields.contains('carteInvalidite') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="carteInvalidite_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="carteInvalidite" ${ rq ?  (it == rqt.carteInvalidite ? 'checked="checked"': '') : (it == false ? 'checked="checked"': '') } />
                <label for="carteInvalidite_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

  

  
    <label class="required"><g:message code="mar.property.carteAccompagnement.label" /> *  <span><g:message code="mar.property.carteAccompagnement.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['demandeCartes'].invalidFields.contains('carteAccompagnement') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="carteAccompagnement_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="carteAccompagnement" ${ rq ?  (it == rqt.carteAccompagnement ? 'checked="checked"': '') : (it == false ? 'checked="checked"': '') } />
                <label for="carteAccompagnement_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

  

  
    <label class="required"><g:message code="mar.property.carteStationnement.label" /> *  <span><g:message code="mar.property.carteStationnement.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['demandeCartes'].invalidFields.contains('carteStationnement') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="carteStationnement_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="carteStationnement" ${ rq ?  (it == rqt.carteStationnement ? 'checked="checked"': '') : (it == false ? 'checked="checked"': '') } />
                <label for="carteStationnement_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

  

