


  
    <label for="roleDemandeur" class="required"><g:message code="sagr.property.roleDemandeur.label" /> *  <span><g:message code="sagr.property.roleDemandeur.help" /></span></label>
            <select id="roleDemandeur" name="roleDemandeur" class="required condition-estPresident-trigger  validate-not-first ${rqt.stepStates['president'].invalidFields.contains('roleDemandeur') ? 'validation-failed' : ''}" title="<g:message code="sagr.property.roleDemandeur.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['PRESIDENT','TRESORIER','SECRETAIRE']}">
                <option value="${it}" ${it == rqt.roleDemandeur?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="sagr.property.roleDemandeur" /></option>
              </g:each>
            </select>
            

  

  
    <fieldset class="required condition-estPresident-unfilled">
    <legend><g:message code="sagr.property.precisionPresident.label" /></legend>
    
      <label for="precisionPresident.nomPresident" class="required"><g:message code="sagr.property.nomPresident.label" /> *  <span><g:message code="sagr.property.nomPresident.help" /></span></label>
            <input type="text" id="precisionPresident.nomPresident" name="precisionPresident.nomPresident" value="${rqt.precisionPresident?.nomPresident?.toString()}" 
                    class="required  validate-lastName ${rqt.stepStates['president'].invalidFields.contains('precisionPresident.nomPresident') ? 'validation-failed' : ''}" title="<g:message code="sagr.property.nomPresident.validationError" />"  maxlength="38" />
            

    
      <label for="precisionPresident.prenomPresident" class="required"><g:message code="sagr.property.prenomPresident.label" /> *  <span><g:message code="sagr.property.prenomPresident.help" /></span></label>
            <input type="text" id="precisionPresident.prenomPresident" name="precisionPresident.prenomPresident" value="${rqt.precisionPresident?.prenomPresident?.toString()}" 
                    class="required  validate-firstName ${rqt.stepStates['president'].invalidFields.contains('precisionPresident.prenomPresident') ? 'validation-failed' : ''}" title="<g:message code="sagr.property.prenomPresident.validationError" />"  maxlength="38" />
            

    
      <label for="precisionPresident.telephonePresident" class=""><g:message code="sagr.property.telephonePresident.label" />   <span><g:message code="sagr.property.telephonePresident.help" /></span></label>
            <input type="text" id="precisionPresident.telephonePresident" name="precisionPresident.telephonePresident" value="${rqt.precisionPresident?.telephonePresident?.toString()}" 
                    class="  validate-phone ${rqt.stepStates['president'].invalidFields.contains('precisionPresident.telephonePresident') ? 'validation-failed' : ''}" title="<g:message code="sagr.property.telephonePresident.validationError" />"  maxlength="10" />
            

    
      <label for="precisionPresident.emailPresident" class=""><g:message code="sagr.property.emailPresident.label" />   <span><g:message code="sagr.property.emailPresident.help" /></span></label>
            <input type="text" id="precisionPresident.emailPresident" name="precisionPresident.emailPresident" value="${rqt.precisionPresident?.emailPresident?.toString()}" 
                    class="  validate-email ${rqt.stepStates['president'].invalidFields.contains('precisionPresident.emailPresident') ? 'validation-failed' : ''}" title="<g:message code="sagr.property.emailPresident.validationError" />"   />
            

    
    </fieldset>
  

