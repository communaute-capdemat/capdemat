


  
    <label class="required"><g:message code="cscr.property.typeDemandeur.label" /> *  <span><g:message code="cscr.property.typeDemandeur.help" /></span></label>
            <ul class="required ${rqt.stepStates['informations'].invalidFields.contains('typeDemandeur') ? 'validation-failed' : ''}">
              <g:each in="${['PARTICULIER','NOTAIRE','AVOCAT','ADMINISTRATION']}">
              <li>
                <input type="radio" id="typeDemandeur_${it}" class="required condition-estParticulier-trigger condition-estAdministration-trigger condition-estJuridique-trigger  validate-one-required" value="${it}" name="typeDemandeur" ${it == rqt.typeDemandeur.toString() ? 'checked="checked"': ''} title="<g:message code="cscr.property.typeDemandeur.validationError" />" />
                <label for="typeDemandeur_${it}"><g:capdematEnumToText var="${it}" i18nKeyPrefix="cscr.property.typeDemandeur" /></label>
              </li>
              </g:each>
            </ul>
            

  

  
    <fieldset class="condition-estParticulier-filled">
    <legend><g:message code="cscr.property.informationsParticulier.label" /></legend>
    
      <label for="informationsParticulier.qualiteDemandeurParticulier" class=""><g:message code="cscr.property.qualiteDemandeurParticulier.label" />   <span><g:message code="cscr.property.qualiteDemandeurParticulier.help" /></span></label>
            <select id="informationsParticulier.qualiteDemandeurParticulier" name="informationsParticulier.qualiteDemandeurParticulier" class="condition-estAutreQualiteDemandeurParticulier-trigger  validate-select ${rqt.stepStates['informations'].invalidFields.contains('informationsParticulier.qualiteDemandeurParticulier') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.qualiteDemandeurParticulier.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['TITULAIRE','CONJOINT','PARENT','ENFANT','GRAND_PARENT','HERITIER_FAMILLE','HERITIER','AUTRE_LIEN_PARENTE','AUTRE_CAS']}">
                <option value="${it}" ${it == rqt.informationsParticulier?.qualiteDemandeurParticulier?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="cscr.property.qualiteDemandeurParticulier" /></option>
              </g:each>
            </select>
            

    
      <label for="informationsParticulier.precisionAutreQualiteDemandeurParticulier" class="condition-estAutreQualiteDemandeurParticulier-filled"><g:message code="cscr.property.precisionAutreQualiteDemandeurParticulier.label" />   <span><g:message code="cscr.property.precisionAutreQualiteDemandeurParticulier.help" /></span></label>
            <input type="text" id="informationsParticulier.precisionAutreQualiteDemandeurParticulier" name="informationsParticulier.precisionAutreQualiteDemandeurParticulier" value="${rqt.informationsParticulier?.precisionAutreQualiteDemandeurParticulier?.toString()}" 
                    class="condition-estAutreQualiteDemandeurParticulier-filled  validate-string ${rqt.stepStates['informations'].invalidFields.contains('informationsParticulier.precisionAutreQualiteDemandeurParticulier') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.precisionAutreQualiteDemandeurParticulier.validationError" />"   />
            

    
    </fieldset>
  

  
    <fieldset class="condition-estAdministration-filled">
    <legend><g:message code="cscr.property.informationsAdministration.label" /></legend>
    
      <label for="informationsAdministration.nomAdministration" class=""><g:message code="cscr.property.nomAdministration.label" />   <span><g:message code="cscr.property.nomAdministration.help" /></span></label>
            <input type="text" id="informationsAdministration.nomAdministration" name="informationsAdministration.nomAdministration" value="${rqt.informationsAdministration?.nomAdministration?.toString()}" 
                    class="  validate-string ${rqt.stepStates['informations'].invalidFields.contains('informationsAdministration.nomAdministration') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.nomAdministration.validationError" />"   />
            

    
      <label for="informationsAdministration.nomMandataireAdministration" class=""><g:message code="cscr.property.nomMandataireAdministration.label" />   <span><g:message code="cscr.property.nomMandataireAdministration.help" /></span></label>
            <input type="text" id="informationsAdministration.nomMandataireAdministration" name="informationsAdministration.nomMandataireAdministration" value="${rqt.informationsAdministration?.nomMandataireAdministration?.toString()}" 
                    class="  validate-string ${rqt.stepStates['informations'].invalidFields.contains('informationsAdministration.nomMandataireAdministration') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.nomMandataireAdministration.validationError" />"   />
            

    
      <label for="informationsAdministration.qualiteMandataireAdministration" class=""><g:message code="cscr.property.qualiteMandataireAdministration.label" />   <span><g:message code="cscr.property.qualiteMandataireAdministration.help" /></span></label>
            <select id="informationsAdministration.qualiteMandataireAdministration" name="informationsAdministration.qualiteMandataireAdministration" class="condition-estAutreQualiteMandataireAdministration-trigger  validate-select ${rqt.stepStates['informations'].invalidFields.contains('informationsAdministration.qualiteMandataireAdministration') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.qualiteMandataireAdministration.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['TITULAIRE','CONJOINT','PARENT','ENFANT','GRAND_PARENT','HERITIER_FAMILLE','HERITIER','AUTRE_LIEN_PARENTE','AUTRE_CAS']}">
                <option value="${it}" ${it == rqt.informationsAdministration?.qualiteMandataireAdministration?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="cscr.property.qualiteMandataireAdministration" /></option>
              </g:each>
            </select>
            

    
      <label for="informationsAdministration.precisionAutreQualiteMandataireAdministration" class="condition-estAutreQualiteMandataireAdministration-filled"><g:message code="cscr.property.precisionAutreQualiteMandataireAdministration.label" />   <span><g:message code="cscr.property.precisionAutreQualiteMandataireAdministration.help" /></span></label>
            <input type="text" id="informationsAdministration.precisionAutreQualiteMandataireAdministration" name="informationsAdministration.precisionAutreQualiteMandataireAdministration" value="${rqt.informationsAdministration?.precisionAutreQualiteMandataireAdministration?.toString()}" 
                    class="condition-estAutreQualiteMandataireAdministration-filled  validate-string ${rqt.stepStates['informations'].invalidFields.contains('informationsAdministration.precisionAutreQualiteMandataireAdministration') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.precisionAutreQualiteMandataireAdministration.validationError" />"   />
            

    
    </fieldset>
  

  
    <fieldset class="condition-estJuridique-filled">
    <legend><g:message code="cscr.property.informationsJuridique.label" /></legend>
    
      <label for="informationsJuridique.nomMandataireJuridique" class=""><g:message code="cscr.property.nomMandataireJuridique.label" />   <span><g:message code="cscr.property.nomMandataireJuridique.help" /></span></label>
            <input type="text" id="informationsJuridique.nomMandataireJuridique" name="informationsJuridique.nomMandataireJuridique" value="${rqt.informationsJuridique?.nomMandataireJuridique?.toString()}" 
                    class="  validate-string ${rqt.stepStates['informations'].invalidFields.contains('informationsJuridique.nomMandataireJuridique') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.nomMandataireJuridique.validationError" />"   />
            

    
      <label for="informationsJuridique.qualiteMandataireJuridique" class=""><g:message code="cscr.property.qualiteMandataireJuridique.label" />   <span><g:message code="cscr.property.qualiteMandataireJuridique.help" /></span></label>
            <select id="informationsJuridique.qualiteMandataireJuridique" name="informationsJuridique.qualiteMandataireJuridique" class="condition-estAutreQualiteMandataireJuridique-trigger  validate-select ${rqt.stepStates['informations'].invalidFields.contains('informationsJuridique.qualiteMandataireJuridique') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.qualiteMandataireJuridique.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['TITULAIRE','CONJOINT','PARENT','ENFANT','GRAND_PARENT','HERITIER_FAMILLE','HERITIER','AUTRE_LIEN_PARENTE','AUTRE_CAS']}">
                <option value="${it}" ${it == rqt.informationsJuridique?.qualiteMandataireJuridique?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="cscr.property.qualiteMandataireJuridique" /></option>
              </g:each>
            </select>
            

    
      <label for="informationsJuridique.precisionAutreQualiteMandataireJuridique" class="condition-estAutreQualiteMandataireJuridique-filled"><g:message code="cscr.property.precisionAutreQualiteMandataireJuridique.label" />   <span><g:message code="cscr.property.precisionAutreQualiteMandataireJuridique.help" /></span></label>
            <input type="text" id="informationsJuridique.precisionAutreQualiteMandataireJuridique" name="informationsJuridique.precisionAutreQualiteMandataireJuridique" value="${rqt.informationsJuridique?.precisionAutreQualiteMandataireJuridique?.toString()}" 
                    class="condition-estAutreQualiteMandataireJuridique-filled  validate-string ${rqt.stepStates['informations'].invalidFields.contains('informationsJuridique.precisionAutreQualiteMandataireJuridique') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.precisionAutreQualiteMandataireJuridique.validationError" />"   />
            

    
    </fieldset>
  

  
    <label for="commentaire" class=""><g:message code="cscr.property.commentaire.label" />   <span><g:message code="cscr.property.commentaire.help" /></span></label>
            <textarea id="commentaire" name="commentaire" class="  validate-regex ${rqt.stepStates['informations'].invalidFields.contains('commentaire') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.commentaire.validationError" />" rows="3" cols="" regex="^[\w\W]{0,1024}$" maxlength="2048">${rqt.commentaire}</textarea>
            

  

