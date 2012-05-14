


  
    <label for="numeroDemande" class=""><g:message code="ddsr.property.numeroDemande.label" />   <span><g:message code="ddsr.property.numeroDemande.help" /></span></label>
            <input type="text" id="numeroDemande" name="numeroDemande" value="${rqt.numeroDemande?.toString()}" 
                    class="   ${rqt.stepStates['demande'].invalidFields.contains('numeroDemande') ? 'validation-failed' : ''}" title="<g:message code="ddsr.property.numeroDemande.validationError" />"  maxlength="255" />
            

  

