


  
    <label for="choixProjetDeVie" class="required"><g:message code="mar.property.choixProjetDeVie.label" /> *  <span><g:message code="mar.property.choixProjetDeVie.help" /></span></label>
            <select id="choixProjetDeVie" name="choixProjetDeVie" class="required condition-choixProjetDeVie-trigger  validate-not-first ${rqt.stepStates['projetDeVie'].invalidFields.contains('choixProjetDeVie') ? 'validation-failed' : ''}" title="<g:message code="mar.property.choixProjetDeVie.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['Oui','Aide','Non']}">
                <option value="fr.cg95.cvq.business.request.social.ChoixProjetDeVieType_${it}" ${it == rqt.choixProjetDeVie?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mar.property.choixProjetDeVie" /></option>
              </g:each>
            </select>
            

  

  
    <label for="expressionProjetDeVie" class="required condition-choixProjetDeVie-filled"><g:message code="mar.property.expressionProjetDeVie.label" /> *  <span><g:message code="mar.property.expressionProjetDeVie.help" /></span></label>
            <textarea id="expressionProjetDeVie" name="expressionProjetDeVie" class="required condition-choixProjetDeVie-filled  validate-regex ${rqt.stepStates['projetDeVie'].invalidFields.contains('expressionProjetDeVie') ? 'validation-failed' : ''}" title="<g:message code="mar.property.expressionProjetDeVie.validationError" />" rows="20" cols="" regex="^.{0,5096}$" maxlength="5096">${rqt.expressionProjetDeVie}</textarea>
            

  

  
    <label for="conseilleProjetDeVie" class="condition-choixProjetDeVie-filled"><g:message code="mar.property.conseilleProjetDeVie.label" />   <span><g:message code="mar.property.conseilleProjetDeVie.help" /></span></label>
            <input type="text" id="conseilleProjetDeVie" name="conseilleProjetDeVie" value="${rqt.conseilleProjetDeVie?.toString()}" 
                    class="condition-choixProjetDeVie-filled  validate-string ${rqt.stepStates['projetDeVie'].invalidFields.contains('conseilleProjetDeVie') ? 'validation-failed' : ''}" title="<g:message code="mar.property.conseilleProjetDeVie.validationError" />"   />
            

  

