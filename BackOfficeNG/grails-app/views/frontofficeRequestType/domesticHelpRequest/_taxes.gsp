


  
    <fieldset class="required">
    <legend><g:message code="dhr.property.dhrTaxesAmount.label" /></legend>
    
      <label for="dhrTaxesAmount.dhrIncomeTax" class=""><g:message code="dhr.property.dhrIncomeTax.label" />   <span><g:message code="dhr.property.dhrIncomeTax.help" /></span></label>
            <input type="text" id="dhrTaxesAmount.dhrIncomeTax" name="dhrTaxesAmount.dhrIncomeTax" value="${rqt.dhrTaxesAmount?.dhrIncomeTax?.toString()}" 
                    class="  validate-positiveInteger ${rqt.stepStates['taxes'].invalidFields.contains('dhrTaxesAmount.dhrIncomeTax') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.dhrIncomeTax.validationError" />"   />
            

    
      <label for="dhrTaxesAmount.localRate" class=""><g:message code="dhr.property.localRate.label" />   <span><g:message code="dhr.property.localRate.help" /></span></label>
            <input type="text" id="dhrTaxesAmount.localRate" name="dhrTaxesAmount.localRate" value="${rqt.dhrTaxesAmount?.localRate?.toString()}" 
                    class="  validate-positiveInteger ${rqt.stepStates['taxes'].invalidFields.contains('dhrTaxesAmount.localRate') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.localRate.validationError" />"   />
            

    
      <label for="dhrTaxesAmount.propertyTaxes" class=""><g:message code="dhr.property.propertyTaxes.label" />   <span><g:message code="dhr.property.propertyTaxes.help" /></span></label>
            <input type="text" id="dhrTaxesAmount.propertyTaxes" name="dhrTaxesAmount.propertyTaxes" value="${rqt.dhrTaxesAmount?.propertyTaxes?.toString()}" 
                    class="  validate-positiveInteger ${rqt.stepStates['taxes'].invalidFields.contains('dhrTaxesAmount.propertyTaxes') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.propertyTaxes.validationError" />"   />
            

    
      <label for="dhrTaxesAmount.professionalTaxes" class=""><g:message code="dhr.property.professionalTaxes.label" />   <span><g:message code="dhr.property.professionalTaxes.help" /></span></label>
            <input type="text" id="dhrTaxesAmount.professionalTaxes" name="dhrTaxesAmount.professionalTaxes" value="${rqt.dhrTaxesAmount?.professionalTaxes?.toString()}" 
                    class="  validate-positiveInteger ${rqt.stepStates['taxes'].invalidFields.contains('dhrTaxesAmount.professionalTaxes') ? 'validation-failed' : ''}" title="<g:message code="dhr.property.professionalTaxes.validationError" />"   />
            

    
    </fieldset>
  

