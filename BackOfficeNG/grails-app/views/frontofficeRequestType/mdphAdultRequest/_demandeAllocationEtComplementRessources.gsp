


  
    <fieldset class="required">
    <legend><g:message code="mar.property.choixTypeDemandeAllocEtCompl.label" /></legend>
    
      <label class="required"><g:message code="mar.property.aah.label" /> *  <span><g:message code="mar.property.aah.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['demandeAllocationEtComplementRessources'].invalidFields.contains('choixTypeDemandeAllocEtCompl.aah') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="choixTypeDemandeAllocEtCompl.aah_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="choixTypeDemandeAllocEtCompl.aah" ${it == rqt.choixTypeDemandeAllocEtCompl?.aah ? 'checked="checked"': ''} />
                <label for="choixTypeDemandeAllocEtCompl.aah_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label class="required"><g:message code="mar.property.complementRessources.label" /> *  <span><g:message code="mar.property.complementRessources.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['demandeAllocationEtComplementRessources'].invalidFields.contains('choixTypeDemandeAllocEtCompl.complementRessources') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="choixTypeDemandeAllocEtCompl.complementRessources_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="choixTypeDemandeAllocEtCompl.complementRessources" ${it == rqt.choixTypeDemandeAllocEtCompl?.complementRessources ? 'checked="checked"': ''} />
                <label for="choixTypeDemandeAllocEtCompl.complementRessources_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
    </fieldset>
  

  
    <label for="precedentsRevenusRecus" class=""><g:message code="mar.property.precedentsRevenusRecus.label" />   <span><g:message code="mar.property.precedentsRevenusRecus.help" /></span></label>
            <select id="precedentsRevenusRecus" name="precedentsRevenusRecus" class="condition-precedentsRevenusRecus-trigger  validate-select ${rqt.stepStates['demandeAllocationEtComplementRessources'].invalidFields.contains('precedentsRevenusRecus') ? 'validation-failed' : ''}" title="<g:message code="mar.property.precedentsRevenusRecus.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['ACTIVITE','ESAT','INDEMNITES']}">
                <option value="${it}" ${it == rqt.precedentsRevenusRecus?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mar.property.precedentsRevenusRecus" /></option>
              </g:each>
            </select>
            

  

  
    <label class="required condition-precedentsRevenusRecus-filled"><g:message code="mar.property.dateDebutRevenuRecu.label" /> *  <span><g:message code="mar.property.dateDebutRevenuRecu.help" /></span></label>
            <div class="date required condition-precedentsRevenusRecus-filled  validate-date required condition-precedentsRevenusRecus-filled ">
              <select class="day ${rqt.stepStates['demandeAllocationEtComplementRessources'].invalidFields.contains('dateDebutRevenuRecu') ? 'validation-failed' : ''}"
                id="dateDebutRevenuRecu_day"
                name="dateDebutRevenuRecu_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.dateDebutRevenuRecu?.date == it
                      || (rqt.dateDebutRevenuRecu == null && params['dateDebutRevenuRecu_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['demandeAllocationEtComplementRessources'].invalidFields.contains('dateDebutRevenuRecu') ? 'validation-failed' : ''}"
                id="dateDebutRevenuRecu_month"
                name="dateDebutRevenuRecu_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.dateDebutRevenuRecu?.month == (it - 1)
                      || (rqt.dateDebutRevenuRecu == null && params['dateDebutRevenuRecu_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['demandeAllocationEtComplementRessources'].invalidFields.contains('dateDebutRevenuRecu') ? 'validation-failed' : ''}"
                id="dateDebutRevenuRecu_year"
                name="dateDebutRevenuRecu_year"
                value="${rqt.dateDebutRevenuRecu ? rqt.dateDebutRevenuRecu.year + 1900 : params['dateDebutRevenuRecu_year']}"
                title="<g:message code="mar.property.dateDebutRevenuRecu.validationError" />" />
            </div>
            

  

  
    <label class="required condition-precedentsRevenusRecus-filled"><g:message code="mar.property.dateFinRevenuRecu.label" /> *  <span><g:message code="mar.property.dateFinRevenuRecu.help" /></span></label>
            <div class="date required condition-precedentsRevenusRecus-filled  validate-date required condition-precedentsRevenusRecus-filled ">
              <select class="day ${rqt.stepStates['demandeAllocationEtComplementRessources'].invalidFields.contains('dateFinRevenuRecu') ? 'validation-failed' : ''}"
                id="dateFinRevenuRecu_day"
                name="dateFinRevenuRecu_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.dateFinRevenuRecu?.date == it
                      || (rqt.dateFinRevenuRecu == null && params['dateFinRevenuRecu_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['demandeAllocationEtComplementRessources'].invalidFields.contains('dateFinRevenuRecu') ? 'validation-failed' : ''}"
                id="dateFinRevenuRecu_month"
                name="dateFinRevenuRecu_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.dateFinRevenuRecu?.month == (it - 1)
                      || (rqt.dateFinRevenuRecu == null && params['dateFinRevenuRecu_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['demandeAllocationEtComplementRessources'].invalidFields.contains('dateFinRevenuRecu') ? 'validation-failed' : ''}"
                id="dateFinRevenuRecu_year"
                name="dateFinRevenuRecu_year"
                value="${rqt.dateFinRevenuRecu ? rqt.dateFinRevenuRecu.year + 1900 : params['dateFinRevenuRecu_year']}"
                title="<g:message code="mar.property.dateFinRevenuRecu.validationError" />" />
            </div>
            

  

  
    <label for="precisionRevenuRecu" class=""><g:message code="mar.property.precisionRevenuRecu.label" />   <span><g:message code="mar.property.precisionRevenuRecu.help" /></span></label>
            <input type="text" id="precisionRevenuRecu" name="precisionRevenuRecu" value="${rqt.precisionRevenuRecu?.toString()}" 
                    class="  validate-string ${rqt.stepStates['demandeAllocationEtComplementRessources'].invalidFields.contains('precisionRevenuRecu') ? 'validation-failed' : ''}" title="<g:message code="mar.property.precisionRevenuRecu.validationError" />"   />
            

  

