


  
    <fieldset class="required">
    <legend><g:message code="sagr.property.subventionPubliqueFonctionnement.label" /></legend>
    
      <label for="subventionPubliqueFonctionnement.budgetSaisonEcouleeRecette" class=""><g:message code="sagr.property.budgetSaisonEcouleeRecette.label" />   <span><g:message code="sagr.property.budgetSaisonEcouleeRecette.help" /></span></label>
            <input type="text" id="subventionPubliqueFonctionnement.budgetSaisonEcouleeRecette" name="subventionPubliqueFonctionnement.budgetSaisonEcouleeRecette" value="${rqt.subventionPubliqueFonctionnement?.budgetSaisonEcouleeRecette?.toString()}" 
                    class="  validate-string ${rqt.stepStates['subvention'].invalidFields.contains('subventionPubliqueFonctionnement.budgetSaisonEcouleeRecette') ? 'validation-failed' : ''}" title="<g:message code="sagr.property.budgetSaisonEcouleeRecette.validationError" />"   />
            

    
      <label for="subventionPubliqueFonctionnement.budgetSaisonEcouleeDepenses" class=""><g:message code="sagr.property.budgetSaisonEcouleeDepenses.label" />   <span><g:message code="sagr.property.budgetSaisonEcouleeDepenses.help" /></span></label>
            <input type="text" id="subventionPubliqueFonctionnement.budgetSaisonEcouleeDepenses" name="subventionPubliqueFonctionnement.budgetSaisonEcouleeDepenses" value="${rqt.subventionPubliqueFonctionnement?.budgetSaisonEcouleeDepenses?.toString()}" 
                    class="  validate-string ${rqt.stepStates['subvention'].invalidFields.contains('subventionPubliqueFonctionnement.budgetSaisonEcouleeDepenses') ? 'validation-failed' : ''}" title="<g:message code="sagr.property.budgetSaisonEcouleeDepenses.validationError" />"   />
            

    
      <label for="subventionPubliqueFonctionnement.nombreLicencieMoinsDixHuitSaisonEcoulee" class=""><g:message code="sagr.property.nombreLicencieMoinsDixHuitSaisonEcoulee.label" />   <span><g:message code="sagr.property.nombreLicencieMoinsDixHuitSaisonEcoulee.help" /></span></label>
            <input type="text" id="subventionPubliqueFonctionnement.nombreLicencieMoinsDixHuitSaisonEcoulee" name="subventionPubliqueFonctionnement.nombreLicencieMoinsDixHuitSaisonEcoulee" value="${rqt.subventionPubliqueFonctionnement?.nombreLicencieMoinsDixHuitSaisonEcoulee?.toString()}" 
                    class="  validate-string ${rqt.stepStates['subvention'].invalidFields.contains('subventionPubliqueFonctionnement.nombreLicencieMoinsDixHuitSaisonEcoulee') ? 'validation-failed' : ''}" title="<g:message code="sagr.property.nombreLicencieMoinsDixHuitSaisonEcoulee.validationError" />"   />
            

    
      <label for="subventionPubliqueFonctionnement.nombreLicenciePlusDixHuitSaisonEcoulee" class=""><g:message code="sagr.property.nombreLicenciePlusDixHuitSaisonEcoulee.label" />   <span><g:message code="sagr.property.nombreLicenciePlusDixHuitSaisonEcoulee.help" /></span></label>
            <input type="text" id="subventionPubliqueFonctionnement.nombreLicenciePlusDixHuitSaisonEcoulee" name="subventionPubliqueFonctionnement.nombreLicenciePlusDixHuitSaisonEcoulee" value="${rqt.subventionPubliqueFonctionnement?.nombreLicenciePlusDixHuitSaisonEcoulee?.toString()}" 
                    class="  validate-string ${rqt.stepStates['subvention'].invalidFields.contains('subventionPubliqueFonctionnement.nombreLicenciePlusDixHuitSaisonEcoulee') ? 'validation-failed' : ''}" title="<g:message code="sagr.property.nombreLicenciePlusDixHuitSaisonEcoulee.validationError" />"   />
            

    
      <label for="subventionPubliqueFonctionnement.communeAnneeN" class=""><g:message code="sagr.property.communeAnneeN.label" />   <span><g:message code="sagr.property.communeAnneeN.help" /></span></label>
            <input type="text" id="subventionPubliqueFonctionnement.communeAnneeN" name="subventionPubliqueFonctionnement.communeAnneeN" value="${rqt.subventionPubliqueFonctionnement?.communeAnneeN?.toString()}" 
                    class="  validate-string ${rqt.stepStates['subvention'].invalidFields.contains('subventionPubliqueFonctionnement.communeAnneeN') ? 'validation-failed' : ''}" title="<g:message code="sagr.property.communeAnneeN.validationError" />"   />
            

    
      <label for="subventionPubliqueFonctionnement.communeAnneeNPlusUn" class=""><g:message code="sagr.property.communeAnneeNPlusUn.label" />   <span><g:message code="sagr.property.communeAnneeNPlusUn.help" /></span></label>
            <input type="text" id="subventionPubliqueFonctionnement.communeAnneeNPlusUn" name="subventionPubliqueFonctionnement.communeAnneeNPlusUn" value="${rqt.subventionPubliqueFonctionnement?.communeAnneeNPlusUn?.toString()}" 
                    class="  validate-string ${rqt.stepStates['subvention'].invalidFields.contains('subventionPubliqueFonctionnement.communeAnneeNPlusUn') ? 'validation-failed' : ''}" title="<g:message code="sagr.property.communeAnneeNPlusUn.validationError" />"   />
            

    
    </fieldset>
  

  
    <label for="compteBancaire" class="required"><g:message code="sagr.property.compteBancaire.label" /> *  <span><g:message code="sagr.property.compteBancaire.help" /></span></label>
            <div class="address required  ${rqt.stepStates['subvention'].invalidFields.contains('compteBancaire') ? 'validation-failed' : ''}">
            <label for="compteBancaire.BIC"><g:message code="bankAccount.property.BIC" /></label>
            <input type="text" class="required ${rqt.stepStates['subvention'].invalidFields.contains('compteBancaire.BIC') ? 'validation-failed' : ''}" value="${rqt.compteBancaire?.BIC}" maxlength="11" id="compteBancaire.BIC" name="compteBancaire.BIC" />
            <label for="compteBancaire.IBAN"><g:message code="bankAccount.property.IBAN" /></label>
            <input type="text" class="required validate-IBAN ${rqt.stepStates['subvention'].invalidFields.contains('compteBancaire.IBAN') ? 'validation-failed' : ''}" value="${rqt.compteBancaire?.IBAN}" maxlength="34" id="compteBancaire.IBAN" name="compteBancaire.IBAN" />
            </div>
            

  

