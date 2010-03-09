


  
    <label for="situationMaritale" class="required"><g:message code="mar.property.situationMaritale.label" /> *  <span><g:message code="mar.property.situationMaritale.help" /></span></label>
            <select id="situationMaritale" name="situationMaritale" class="required condition-situationMaritale-trigger  validate-not-first ${rqt.stepStates['situationFamiliale'].invalidFields.contains('situationMaritale') ? 'validation-failed' : ''}" title="<g:message code="mar.property.situationMaritale.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['Celibataire','Marie','Concubinage','Autre']}">
                <option value="fr.cg95.cvq.business.request.social.SituationFamilialeType_${it}" ${it == rqt.situationMaritale?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mar.property.situationMaritale" /></option>
              </g:each>
            </select>
            

  

  
    <label class="required"><g:message code="mar.property.dateSituationFamiliale.label" /> *  <span><g:message code="mar.property.dateSituationFamiliale.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['situationFamiliale'].invalidFields.contains('dateSituationFamiliale') ? 'validation-failed' : ''}"
                id="dateSituationFamiliale_day"
                name="dateSituationFamiliale_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.dateSituationFamiliale?.date == it
                      || (rqt.dateSituationFamiliale == null && params['dateSituationFamiliale_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['situationFamiliale'].invalidFields.contains('dateSituationFamiliale') ? 'validation-failed' : ''}"
                id="dateSituationFamiliale_month"
                name="dateSituationFamiliale_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.dateSituationFamiliale?.month == (it - 1)
                      || (rqt.dateSituationFamiliale == null && params['dateSituationFamiliale_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['situationFamiliale'].invalidFields.contains('dateSituationFamiliale') ? 'validation-failed' : ''}"
                id="dateSituationFamiliale_year"
                name="dateSituationFamiliale_year"
                value="${rqt.dateSituationFamiliale ? rqt.dateSituationFamiliale.year + 1900 : params['dateSituationFamiliale_year']}"
                title="<g:message code="mar.property.dateSituationFamiliale.validationError" />" />
            </div>
            

  

  
    <label for="nombreEnfantsACharge" class="required"><g:message code="mar.property.nombreEnfantsACharge.label" /> *  <span><g:message code="mar.property.nombreEnfantsACharge.help" /></span></label>
            <input type="text" id="nombreEnfantsACharge" name="nombreEnfantsACharge" value="${rqt.nombreEnfantsACharge?.toString()}" 
                    class="required  validate-regex ${rqt.stepStates['situationFamiliale'].invalidFields.contains('nombreEnfantsACharge') ? 'validation-failed' : ''}" title="<g:message code="mar.property.nombreEnfantsACharge.validationError" />" regex="[0-9]{1,2}$" maxlength="2" />
            

  

  
    <fieldset class="required condition-situationMaritale-filled">
    <legend><g:message code="mar.property.identiteConjoint.label" /></legend>
    
      <label for="identiteConjoint.nomNaissanceConjoint" class="required"><g:message code="mar.property.nomNaissanceConjoint.label" /> *  <span><g:message code="mar.property.nomNaissanceConjoint.help" /></span></label>
            <input type="text" id="identiteConjoint.nomNaissanceConjoint" name="identiteConjoint.nomNaissanceConjoint" value="${rqt.identiteConjoint?.nomNaissanceConjoint?.toString()}" 
                    class="required  validate-lastName ${rqt.stepStates['situationFamiliale'].invalidFields.contains('identiteConjoint.nomNaissanceConjoint') ? 'validation-failed' : ''}" title="<g:message code="mar.property.nomNaissanceConjoint.validationError" />"  maxlength="38" />
            

    
      <label for="identiteConjoint.prenomConjoint" class="required"><g:message code="mar.property.prenomConjoint.label" /> *  <span><g:message code="mar.property.prenomConjoint.help" /></span></label>
            <input type="text" id="identiteConjoint.prenomConjoint" name="identiteConjoint.prenomConjoint" value="${rqt.identiteConjoint?.prenomConjoint?.toString()}" 
                    class="required  validate-firstName ${rqt.stepStates['situationFamiliale'].invalidFields.contains('identiteConjoint.prenomConjoint') ? 'validation-failed' : ''}" title="<g:message code="mar.property.prenomConjoint.validationError" />"  maxlength="38" />
            

    
      <label class="required"><g:message code="mar.property.dateNaissanceConjoint.label" /> *  <span><g:message code="mar.property.dateNaissanceConjoint.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['situationFamiliale'].invalidFields.contains('identiteConjoint.dateNaissanceConjoint') ? 'validation-failed' : ''}"
                id="identiteConjoint.dateNaissanceConjoint_day"
                name="identiteConjoint.dateNaissanceConjoint_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.identiteConjoint?.dateNaissanceConjoint?.date == it
                      || (rqt.identiteConjoint?.dateNaissanceConjoint == null && params['identiteConjoint.dateNaissanceConjoint_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['situationFamiliale'].invalidFields.contains('identiteConjoint.dateNaissanceConjoint') ? 'validation-failed' : ''}"
                id="identiteConjoint.dateNaissanceConjoint_month"
                name="identiteConjoint.dateNaissanceConjoint_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.identiteConjoint?.dateNaissanceConjoint?.month == (it - 1)
                      || (rqt.identiteConjoint?.dateNaissanceConjoint == null && params['identiteConjoint.dateNaissanceConjoint_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['situationFamiliale'].invalidFields.contains('identiteConjoint.dateNaissanceConjoint') ? 'validation-failed' : ''}"
                id="identiteConjoint.dateNaissanceConjoint_year"
                name="identiteConjoint.dateNaissanceConjoint_year"
                value="${rqt.identiteConjoint?.dateNaissanceConjoint ? rqt.identiteConjoint?.dateNaissanceConjoint.year + 1900 : params['identiteConjoint.dateNaissanceConjoint_year']}"
                title="<g:message code="mar.property.dateNaissanceConjoint.validationError" />" />
            </div>
            

    
    </fieldset>
  

