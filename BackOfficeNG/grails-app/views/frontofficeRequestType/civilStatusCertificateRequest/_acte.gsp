


  
    <label class=""><g:message code="cscr.property.typeActe.label" />   <span><g:message code="cscr.property.typeActe.help" /></span></label>
            <ul class=" ${rqt.stepStates['acte'].invalidFields.contains('typeActe') ? 'validation-failed' : ''}">
              <g:each in="${['NAISSANCE','DECES','MARIAGE']}">
              <li>
                <input type="radio" id="typeActe_${it}" class="  validate-one-required" value="${it}" name="typeActe" ${it == rqt.typeActe.toString() ? 'checked="checked"': ''} title="<g:message code="cscr.property.typeActe.validationError" />" />
                <label for="typeActe_${it}"><g:capdematEnumToText var="${it}" i18nKeyPrefix="cscr.property.typeActe" /></label>
              </li>
              </g:each>
            </ul>
            

  

  
    <label for="formatActe" class="required"><g:message code="cscr.property.formatActe.label" /> *  <span><g:message code="cscr.property.formatActe.help" /></span></label>
            <select id="formatActe" name="formatActe" class="required condition-estExtraitSansFiliation-trigger  validate-not-first ${rqt.stepStates['acte'].invalidFields.contains('formatActe') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.formatActe.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['COPIE_INTEGRALE','AVEC_FILIATION','SANS_FILIATION','PLURILINGUE']}">
                <option value="${it}" ${it == rqt.formatActe?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="cscr.property.formatActe" /></option>
              </g:each>
            </select>
            

  

  
    <label for="nombreActes" class="required"><g:message code="cscr.property.nombreActes.label" /> *  <span><g:message code="cscr.property.nombreActes.help" /></span></label>
            <input type="text" id="nombreActes" name="nombreActes" value="${rqt.nombreActes?.toString()}" 
                    class="required  validate-positiveInteger ${rqt.stepStates['acte'].invalidFields.contains('nombreActes') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.nombreActes.validationError" />"   />
            

  

  
    <label class="required"><g:message code="cscr.property.dateEvenement.label" /> *  <span><g:message code="cscr.property.dateEvenement.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['acte'].invalidFields.contains('dateEvenement') ? 'validation-failed' : ''}"
                id="dateEvenement_day"
                name="dateEvenement_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.dateEvenement?.date == it
                      || (rqt.dateEvenement == null && params['dateEvenement_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['acte'].invalidFields.contains('dateEvenement') ? 'validation-failed' : ''}"
                id="dateEvenement_month"
                name="dateEvenement_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.dateEvenement?.month == (it - 1)
                      || (rqt.dateEvenement == null && params['dateEvenement_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['acte'].invalidFields.contains('dateEvenement') ? 'validation-failed' : ''}"
                id="dateEvenement_year"
                name="dateEvenement_year"
                value="${rqt.dateEvenement ? rqt.dateEvenement.year + 1900 : params['dateEvenement_year']}"
                title="<g:message code="cscr.property.dateEvenement.validationError" />" />
            </div>
            

  

  
    <label for="nomTitulaireActe" class="required"><g:message code="cscr.property.nomTitulaireActe.label" /> *  <span><g:message code="cscr.property.nomTitulaireActe.help" /></span></label>
            <input type="text" id="nomTitulaireActe" name="nomTitulaireActe" value="${rqt.nomTitulaireActe?.toString()}" 
                    class="required  validate-lastName ${rqt.stepStates['acte'].invalidFields.contains('nomTitulaireActe') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.nomTitulaireActe.validationError" />"  maxlength="38" />
            

  

  
    <label for="prenomsTitulaireActe" class="required"><g:message code="cscr.property.prenomsTitulaireActe.label" /> *  <span><g:message code="cscr.property.prenomsTitulaireActe.help" /></span></label>
            <input type="text" id="prenomsTitulaireActe" name="prenomsTitulaireActe" value="${rqt.prenomsTitulaireActe?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['acte'].invalidFields.contains('prenomsTitulaireActe') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.prenomsTitulaireActe.validationError" />"   />
            

  

  
    <label for="motif" class="required"><g:message code="cscr.property.motif.label" /> *  <span><g:message code="cscr.property.motif.help" /></span></label>
            <select id="motif" name="motif" class="required condition-estAutreMotif-trigger  validate-not-first ${rqt.stepStates['acte'].invalidFields.contains('motif') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.motif.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['CARTE_IDENTITE','PASSEPORT','CERTIFICAT_NATIONALITE_FRANCAISE','MARIAGE','GENEALOGIE','SUCCESSION','PENSION','AUTRE']}">
                <option value="${it}" ${it == rqt.motif?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="cscr.property.motif" /></option>
              </g:each>
            </select>
            

  

  
    <label for="precisionAutreMotif" class="required condition-estAutreMotif-filled"><g:message code="cscr.property.precisionAutreMotif.label" /> *  <span><g:message code="cscr.property.precisionAutreMotif.help" /></span></label>
            <input type="text" id="precisionAutreMotif" name="precisionAutreMotif" value="${rqt.precisionAutreMotif?.toString()}" 
                    class="required condition-estAutreMotif-filled  validate-string ${rqt.stepStates['acte'].invalidFields.contains('precisionAutreMotif') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.precisionAutreMotif.validationError" />"   />
            

  

  
    <fieldset class="condition-estExtraitSansFiliation-unfilled">
    <legend><g:message code="cscr.property.complementTypeActe.label" /></legend>
    
      <label for="complementTypeActe.pereNom" class="required"><g:message code="cscr.property.pereNom.label" /> *  <span><g:message code="cscr.property.pereNom.help" /></span></label>
            <input type="text" id="complementTypeActe.pereNom" name="complementTypeActe.pereNom" value="${rqt.complementTypeActe?.pereNom?.toString()}" 
                    class="required  validate-lastName ${rqt.stepStates['acte'].invalidFields.contains('complementTypeActe.pereNom') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.pereNom.validationError" />"  maxlength="38" />
            

    
      <label for="complementTypeActe.perePrenoms" class="required"><g:message code="cscr.property.perePrenoms.label" /> *  <span><g:message code="cscr.property.perePrenoms.help" /></span></label>
            <input type="text" id="complementTypeActe.perePrenoms" name="complementTypeActe.perePrenoms" value="${rqt.complementTypeActe?.perePrenoms?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['acte'].invalidFields.contains('complementTypeActe.perePrenoms') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.perePrenoms.validationError" />"   />
            

    
      <label for="complementTypeActe.mereNom" class="required"><g:message code="cscr.property.mereNom.label" /> *  <span><g:message code="cscr.property.mereNom.help" /></span></label>
            <input type="text" id="complementTypeActe.mereNom" name="complementTypeActe.mereNom" value="${rqt.complementTypeActe?.mereNom?.toString()}" 
                    class="required  validate-lastName ${rqt.stepStates['acte'].invalidFields.contains('complementTypeActe.mereNom') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.mereNom.validationError" />"  maxlength="38" />
            

    
      <label for="complementTypeActe.merePrenoms" class="required"><g:message code="cscr.property.merePrenoms.label" /> *  <span><g:message code="cscr.property.merePrenoms.help" /></span></label>
            <input type="text" id="complementTypeActe.merePrenoms" name="complementTypeActe.merePrenoms" value="${rqt.complementTypeActe?.merePrenoms?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['acte'].invalidFields.contains('complementTypeActe.merePrenoms') ? 'validation-failed' : ''}" title="<g:message code="cscr.property.merePrenoms.validationError" />"   />
            

    
    </fieldset>
  

