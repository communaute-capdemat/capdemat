


  
    <label class="required"><g:message code="rsr.property.contactKind.label" /> *  <span><g:message code="rsr.property.contactKind.help" /></span></label>
            <ul class="required ${rqt.stepStates['contact'].invalidFields.contains('contactKind') ? 'validation-failed' : ''}">
              <g:each in="${['REQUESTER','OTHER']}">
              <li>
                <input type="radio" id="contactKind_${it}" class="required condition-isOtherContact-trigger  validate-one-required" value="${it}" name="contactKind" ${it == rqt.contactKind.toString() ? 'checked="checked"': ''} title="<g:message code="rsr.property.contactKind.validationError" />" />
                <label for="contactKind_${it}"><g:capdematEnumToText var="${it}" i18nKeyPrefix="rsr.property.contactKind" /></label>
              </li>
              </g:each>
            </ul>
            

  

  
    <fieldset class="required condition-isOtherContact-filled">
    <legend><g:message code="rsr.property.firstContact.label" /></legend>
    
      <label for="firstContact.contactLastName" class="required"><g:message code="rsr.property.contactLastName.label" /> *  <span><g:message code="rsr.property.contactLastName.help" /></span></label>
            <input type="text" id="firstContact.contactLastName" name="firstContact.contactLastName" value="${rqt.firstContact?.contactLastName?.toString()}" 
                    class="required  validate-lastName ${rqt.stepStates['contact'].invalidFields.contains('firstContact.contactLastName') ? 'validation-failed' : ''}" title="<g:message code="rsr.property.contactLastName.validationError" />"  maxlength="38" />
            

    
      <label for="firstContact.contactFirstName" class="required"><g:message code="rsr.property.contactFirstName.label" /> *  <span><g:message code="rsr.property.contactFirstName.help" /></span></label>
            <input type="text" id="firstContact.contactFirstName" name="firstContact.contactFirstName" value="${rqt.firstContact?.contactFirstName?.toString()}" 
                    class="required  validate-firstName ${rqt.stepStates['contact'].invalidFields.contains('firstContact.contactFirstName') ? 'validation-failed' : ''}" title="<g:message code="rsr.property.contactFirstName.validationError" />"  maxlength="38" />
            

    
      <label for="firstContact.contactPhone" class="required"><g:message code="rsr.property.contactPhone.label" /> *  <span><g:message code="rsr.property.contactPhone.help" /></span></label>
            <input type="text" id="firstContact.contactPhone" name="firstContact.contactPhone" value="${rqt.firstContact?.contactPhone?.toString()}" 
                    class="required  validate-phone ${rqt.stepStates['contact'].invalidFields.contains('firstContact.contactPhone') ? 'validation-failed' : ''}" title="<g:message code="rsr.property.contactPhone.validationError" />"  maxlength="10" />
            

    
    </fieldset>
  

  
    <fieldset class="required condition-isOtherContact-filled">
    <legend><g:message code="rsr.property.secondContact.label" /></legend>
    
      <label for="secondContact.secondContactLastName" class=""><g:message code="rsr.property.secondContactLastName.label" />   <span><g:message code="rsr.property.secondContactLastName.help" /></span></label>
            <input type="text" id="secondContact.secondContactLastName" name="secondContact.secondContactLastName" value="${rqt.secondContact?.secondContactLastName?.toString()}" 
                    class="  validate-lastName ${rqt.stepStates['contact'].invalidFields.contains('secondContact.secondContactLastName') ? 'validation-failed' : ''}" title="<g:message code="rsr.property.secondContactLastName.validationError" />"  maxlength="38" />
            

    
      <label for="secondContact.secondContactFirstName" class=""><g:message code="rsr.property.secondContactFirstName.label" />   <span><g:message code="rsr.property.secondContactFirstName.help" /></span></label>
            <input type="text" id="secondContact.secondContactFirstName" name="secondContact.secondContactFirstName" value="${rqt.secondContact?.secondContactFirstName?.toString()}" 
                    class="  validate-firstName ${rqt.stepStates['contact'].invalidFields.contains('secondContact.secondContactFirstName') ? 'validation-failed' : ''}" title="<g:message code="rsr.property.secondContactFirstName.validationError" />"  maxlength="38" />
            

    
      <label for="secondContact.secondContactPhone" class=""><g:message code="rsr.property.secondContactPhone.label" />   <span><g:message code="rsr.property.secondContactPhone.help" /></span></label>
            <input type="text" id="secondContact.secondContactPhone" name="secondContact.secondContactPhone" value="${rqt.secondContact?.secondContactPhone?.toString()}" 
                    class="  validate-phone ${rqt.stepStates['contact'].invalidFields.contains('secondContact.secondContactPhone') ? 'validation-failed' : ''}" title="<g:message code="rsr.property.secondContactPhone.validationError" />"  maxlength="10" />
            

    
    </fieldset>
  

  
    <fieldset class="">
    <legend><g:message code="rsr.property.trustee.label" /></legend>
    
      <label for="trustee.trusteeLastName" class=""><g:message code="rsr.property.trusteeLastName.label" />   <span><g:message code="rsr.property.trusteeLastName.help" /></span></label>
            <input type="text" id="trustee.trusteeLastName" name="trustee.trusteeLastName" value="${rqt.trustee?.trusteeLastName?.toString()}" 
                    class="  validate-lastName ${rqt.stepStates['contact'].invalidFields.contains('trustee.trusteeLastName') ? 'validation-failed' : ''}" title="<g:message code="rsr.property.trusteeLastName.validationError" />"  maxlength="38" />
            

    
      <label for="trustee.trusteeFirstName" class=""><g:message code="rsr.property.trusteeFirstName.label" />   <span><g:message code="rsr.property.trusteeFirstName.help" /></span></label>
            <input type="text" id="trustee.trusteeFirstName" name="trustee.trusteeFirstName" value="${rqt.trustee?.trusteeFirstName?.toString()}" 
                    class="  validate-firstName ${rqt.stepStates['contact'].invalidFields.contains('trustee.trusteeFirstName') ? 'validation-failed' : ''}" title="<g:message code="rsr.property.trusteeFirstName.validationError" />"  maxlength="38" />
            

    
      <label for="trustee.trusteePhone" class=""><g:message code="rsr.property.trusteePhone.label" />   <span><g:message code="rsr.property.trusteePhone.help" /></span></label>
            <input type="text" id="trustee.trusteePhone" name="trustee.trusteePhone" value="${rqt.trustee?.trusteePhone?.toString()}" 
                    class="  validate-phone ${rqt.stepStates['contact'].invalidFields.contains('trustee.trusteePhone') ? 'validation-failed' : ''}" title="<g:message code="rsr.property.trusteePhone.validationError" />"  maxlength="10" />
            

    
    </fieldset>
  

