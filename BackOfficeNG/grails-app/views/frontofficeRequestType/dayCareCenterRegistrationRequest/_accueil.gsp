


  
    <label class="required"><g:message code="dccrr.property.modeAccueil.label" /> *  <span><g:message code="dccrr.property.modeAccueil.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['accueil'].invalidFields.contains('modeAccueil') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="modeAccueil_${it ? 'yes' : 'no'}" class="required condition-estIndifferent-trigger  validate-one-required boolean" title="" value="${it}" name="modeAccueil" ${it == rqt.modeAccueil ? 'checked="checked"': ''} />
                <label for="modeAccueil_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

  

  
    <label for="modeAccueilChoixUn" class="required condition-estIndifferent-filled"><g:message code="dccrr.property.modeAccueilChoixUn.label" /> *  <span><g:message code="dccrr.property.modeAccueilChoixUn.help" /></span></label>
            <select id="modeAccueilChoixUn" name="modeAccueilChoixUn" class="required condition-estIndifferent-filled  validate-not-first ${rqt.stepStates['accueil'].invalidFields.contains('modeAccueilChoixUn') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.modeAccueilChoixUn.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['COLLECTIF','FAMILIAL']}">
                <option value="${it}" ${it == rqt.modeAccueilChoixUn?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dccrr.property.modeAccueilChoixUn" /></option>
              </g:each>
            </select>
            

  

  
    <label for="modeAccueilChoixDeux" class="condition-estIndifferent-filled"><g:message code="dccrr.property.modeAccueilChoixDeux.label" />   <span><g:message code="dccrr.property.modeAccueilChoixDeux.help" /></span></label>
            <select id="modeAccueilChoixDeux" name="modeAccueilChoixDeux" class="condition-estIndifferent-filled  validate-select ${rqt.stepStates['accueil'].invalidFields.contains('modeAccueilChoixDeux') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.modeAccueilChoixDeux.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['COLLECTIF','FAMILIAL']}">
                <option value="${it}" ${it == rqt.modeAccueilChoixDeux?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dccrr.property.modeAccueilChoixDeux" /></option>
              </g:each>
            </select>
            

  

  
    <label for="accueilAnterieur" class=""><g:message code="dccrr.property.accueilAnterieur.label" />   <span><g:message code="dccrr.property.accueilAnterieur.help" /></span></label>
            <input type="text" id="accueilAnterieur" name="accueilAnterieur" value="${rqt.accueilAnterieur?.toString()}" 
                    class="  validate-string ${rqt.stepStates['accueil'].invalidFields.contains('accueilAnterieur') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.accueilAnterieur.validationError" />"   />
            

  

  
    <fieldset class="required">
    <legend><g:message code="dccrr.property.datePlacementAccueilRegulier.label" /></legend>
    
      <label for="datePlacementAccueilRegulier.choixTypeDatePlacementAccueilRegulier" class="required"><g:message code="dccrr.property.choixTypeDatePlacementAccueilRegulier.label" /> *  <span><g:message code="dccrr.property.choixTypeDatePlacementAccueilRegulier.help" /></span></label>
            <select id="datePlacementAccueilRegulier.choixTypeDatePlacementAccueilRegulier" name="datePlacementAccueilRegulier.choixTypeDatePlacementAccueilRegulier" class="required condition-dateConnue-trigger  validate-not-first ${rqt.stepStates['accueil'].invalidFields.contains('datePlacementAccueilRegulier.choixTypeDatePlacementAccueilRegulier') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.choixTypeDatePlacementAccueilRegulier.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['Connue','Possible']}">
                <option value="fr.cg95.cvq.business.request.school.ChoixDatePlacement_${it}" ${it == rqt.choixTypeDatePlacementAccueilRegulier?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dccrr.property.choixTypeDatePlacementAccueilRegulier" /></option>
              <g:each in="${['CONNUE','POSSIBLE']}">
                <option value="${it}" ${it == rqt.choixTypeDatePlacementAccueilRegulier?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dccrr.property.choixTypeDatePlacementAccueilRegulier" /></option>
              <g:each in="${['Connue','Possible']}">
                <option value="fr.cg95.cvq.business.request.school.ChoixDatePlacement_${it}" ${it == rqt.datePlacementAccueilRegulier?.choixTypeDatePlacementAccueilRegulier?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dccrr.property.choixTypeDatePlacementAccueilRegulier" /></option>
              </g:each>
            </select>
            

    
      <label class="required condition-dateConnue-filled"><g:message code="dccrr.property.datePlacementDebut.label" /> *  <span><g:message code="dccrr.property.datePlacementDebut.help" /></span></label>
            <div class="date required condition-dateConnue-filled  validate-date required condition-dateConnue-filled ">
              <select class="day ${rqt.stepStates['accueil'].invalidFields.contains('datePlacementAccueilRegulier.datePlacementDebut') ? 'validation-failed' : ''}"
                id="datePlacementAccueilRegulier.datePlacementDebut_day"
                name="datePlacementAccueilRegulier.datePlacementDebut_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.datePlacementAccueilRegulier?.datePlacementDebut?.date == it
                      || (rqt.datePlacementAccueilRegulier?.datePlacementDebut == null && params['datePlacementAccueilRegulier.datePlacementDebut_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['accueil'].invalidFields.contains('datePlacementAccueilRegulier.datePlacementDebut') ? 'validation-failed' : ''}"
                id="datePlacementAccueilRegulier.datePlacementDebut_month"
                name="datePlacementAccueilRegulier.datePlacementDebut_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.datePlacementAccueilRegulier?.datePlacementDebut?.month == (it - 1)
                      || (rqt.datePlacementAccueilRegulier?.datePlacementDebut == null && params['datePlacementAccueilRegulier.datePlacementDebut_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['accueil'].invalidFields.contains('datePlacementAccueilRegulier.datePlacementDebut') ? 'validation-failed' : ''}"
                id="datePlacementAccueilRegulier.datePlacementDebut_year"
                name="datePlacementAccueilRegulier.datePlacementDebut_year"
                value="${rqt.datePlacementAccueilRegulier?.datePlacementDebut ? rqt.datePlacementAccueilRegulier?.datePlacementDebut.year + 1900 : params['datePlacementAccueilRegulier.datePlacementDebut_year']}"
                title="<g:message code="dccrr.property.datePlacementDebut.validationError" />" />
            </div>
            

    
      <label class="condition-dateConnue-filled"><g:message code="dccrr.property.datePlacementFin.label" />   <span><g:message code="dccrr.property.datePlacementFin.help" /></span></label>
            <div class="date condition-dateConnue-filled  validate-date condition-dateConnue-filled ">
              <select class="day ${rqt.stepStates['accueil'].invalidFields.contains('datePlacementFin') ? 'validation-failed' : ''}"
                id="datePlacementFin_day"
                name="datePlacementFin_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.datePlacementFin?.date == it
                      || (rqt.datePlacementFin == null && params['datePlacementFin_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['accueil'].invalidFields.contains('datePlacementFin') ? 'validation-failed' : ''}"
                id="datePlacementFin_month"
                name="datePlacementFin_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.datePlacementFin?.month == (it - 1)
                      || (rqt.datePlacementFin == null && params['datePlacementFin_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['accueil'].invalidFields.contains('datePlacementFin') ? 'validation-failed' : ''}"
                id="datePlacementFin_year"
                name="datePlacementFin_year"
                value="${rqt.datePlacementFin ? rqt.datePlacementFin.year + 1900 : params['datePlacementFin_year']}"
                title="<g:message code="dccrr.property.datePlacementFin.validationError" />" />
            </div>
            

    
      <label class="condition-dateConnue-filled"><g:message code="dccrr.property.datePlacementFin.label" />   <span><g:message code="dccrr.property.datePlacementFin.help" /></span></label>
            <div class="date condition-dateConnue-filled  validate-date condition-dateConnue-filled ">
              <select class="day ${rqt.stepStates['accueil'].invalidFields.contains('datePlacementAccueilRegulier.datePlacementFin') ? 'validation-failed' : ''}"
                id="datePlacementAccueilRegulier.datePlacementFin_day"
                name="datePlacementAccueilRegulier.datePlacementFin_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.datePlacementAccueilRegulier?.datePlacementFin?.date == it
                      || (rqt.datePlacementAccueilRegulier?.datePlacementFin == null && params['datePlacementAccueilRegulier.datePlacementFin_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['accueil'].invalidFields.contains('datePlacementAccueilRegulier.datePlacementFin') ? 'validation-failed' : ''}"
                id="datePlacementAccueilRegulier.datePlacementFin_month"
                name="datePlacementAccueilRegulier.datePlacementFin_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.datePlacementAccueilRegulier?.datePlacementFin?.month == (it - 1)
                      || (rqt.datePlacementAccueilRegulier?.datePlacementFin == null && params['datePlacementAccueilRegulier.datePlacementFin_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['accueil'].invalidFields.contains('datePlacementAccueilRegulier.datePlacementFin') ? 'validation-failed' : ''}"
                id="datePlacementAccueilRegulier.datePlacementFin_year"
                name="datePlacementAccueilRegulier.datePlacementFin_year"
                value="${rqt.datePlacementAccueilRegulier?.datePlacementFin ? rqt.datePlacementAccueilRegulier?.datePlacementFin.year + 1900 : params['datePlacementAccueilRegulier.datePlacementFin_year']}"
                title="<g:message code="dccrr.property.datePlacementFin.validationError" />" />
            </div>
            

    
    </fieldset>
  

  
    <label for="choixHorairesAccueil" class="required"><g:message code="dccrr.property.choixHorairesAccueil.label" /> *  <span><g:message code="dccrr.property.choixHorairesAccueil.help" /></span></label>
            <select id="choixHorairesAccueil" name="choixHorairesAccueil" class="required condition-estHorairesAccueilRegulier-trigger condition-estHorairesAccueilIrregulier-trigger  validate-not-first ${rqt.stepStates['accueil'].invalidFields.contains('choixHorairesAccueil') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.choixHorairesAccueil.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['INDIFFERENT','REGULIER','IRREGULIER']}">
                <option value="${it}" ${it == rqt.choixHorairesAccueil?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dccrr.property.choixHorairesAccueil" /></option>
              </g:each>
            </select>
            

  

  
    <fieldset class="required condition-estHorairesAccueilRegulier-filled">
    <legend><g:message code="dccrr.property.plageHoraireAccueilReguliere.label" /></legend>
    
      
            <div class="time   validate-time  ">
              <label class=""><g:message code="dccrr.property.horairePlacementMatinDebut.label" />   
                <span><g:message code="dccrr.property.horairePlacementMatinDebut.help" /></span>
              </label>
              <select class="hour ${rqt.stepStates['accueil'].invalidFields.contains('plageHoraireAccueilReguliere.horairePlacementMatinDebut') ? 'validation-failed' : ''}"
                id="plageHoraireAccueilReguliere.horairePlacementMatinDebut_hour"
                name="plageHoraireAccueilReguliere.horairePlacementMatinDebut_hour">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..23}">
                  <option value="${it}"
                    <g:if test="${rqt.plageHoraireAccueilReguliere?.horairePlacementMatinDebut?.hourOfDay == it
                      || (rqt.plageHoraireAccueilReguliere?.horairePlacementMatinDebut == null && params['plageHoraireAccueilReguliere.horairePlacementMatinDebut_hour'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <g:message code="time.hour" />
              <select class="minute ${rqt.stepStates['accueil'].invalidFields.contains('plageHoraireAccueilReguliere.horairePlacementMatinDebut') ? 'validation-failed' : ''}"
                id="plageHoraireAccueilReguliere.horairePlacementMatinDebut_minute"
                name="plageHoraireAccueilReguliere.horairePlacementMatinDebut_minute">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..59}">
                 <g:if test="${(it % 5) == 0}">
                  <option value="${it}"
                    <g:if test="${rqt.plageHoraireAccueilReguliere?.horairePlacementMatinDebut?.minuteOfHour == it
                      || (rqt.plageHoraireAccueilReguliere?.horairePlacementMatinDebut == null && params['plageHoraireAccueilReguliere.horairePlacementMatinDebut_minute'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                        <g:if test="${it < 10}">
                           0${it}
                        </g:if>
                        <g:else>
                            ${it}
                        </g:else>
                  </option>
                 </g:if>
                </g:each>
              </select>
              <g:message code="time.minute" />
            </div>
            

    
      
            <div class="time   validate-time  ">
              <label class=""><g:message code="dccrr.property.horairePlacementMatinFin.label" />   
                <span><g:message code="dccrr.property.horairePlacementMatinFin.help" /></span>
              </label>
              <select class="hour ${rqt.stepStates['accueil'].invalidFields.contains('plageHoraireAccueilReguliere.horairePlacementMatinFin') ? 'validation-failed' : ''}"
                id="plageHoraireAccueilReguliere.horairePlacementMatinFin_hour"
                name="plageHoraireAccueilReguliere.horairePlacementMatinFin_hour">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..23}">
                  <option value="${it}"
                    <g:if test="${rqt.plageHoraireAccueilReguliere?.horairePlacementMatinFin?.hourOfDay == it
                      || (rqt.plageHoraireAccueilReguliere?.horairePlacementMatinFin == null && params['plageHoraireAccueilReguliere.horairePlacementMatinFin_hour'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <g:message code="time.hour" />
              <select class="minute ${rqt.stepStates['accueil'].invalidFields.contains('plageHoraireAccueilReguliere.horairePlacementMatinFin') ? 'validation-failed' : ''}"
                id="plageHoraireAccueilReguliere.horairePlacementMatinFin_minute"
                name="plageHoraireAccueilReguliere.horairePlacementMatinFin_minute">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..59}">
                 <g:if test="${(it % 5) == 0}">
                  <option value="${it}"
                    <g:if test="${rqt.plageHoraireAccueilReguliere?.horairePlacementMatinFin?.minuteOfHour == it
                      || (rqt.plageHoraireAccueilReguliere?.horairePlacementMatinFin == null && params['plageHoraireAccueilReguliere.horairePlacementMatinFin_minute'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                        <g:if test="${it < 10}">
                           0${it}
                        </g:if>
                        <g:else>
                            ${it}
                        </g:else>
                  </option>
                 </g:if>
                </g:each>
              </select>
              <g:message code="time.minute" />
            </div>
            

    
      
            <div class="time   validate-time  ">
              <label class=""><g:message code="dccrr.property.horairePlacementApresMidiDebut.label" />   
                <span><g:message code="dccrr.property.horairePlacementApresMidiDebut.help" /></span>
              </label>
              <select class="hour ${rqt.stepStates['accueil'].invalidFields.contains('plageHoraireAccueilReguliere.horairePlacementApresMidiDebut') ? 'validation-failed' : ''}"
                id="plageHoraireAccueilReguliere.horairePlacementApresMidiDebut_hour"
                name="plageHoraireAccueilReguliere.horairePlacementApresMidiDebut_hour">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..23}">
                  <option value="${it}"
                    <g:if test="${rqt.plageHoraireAccueilReguliere?.horairePlacementApresMidiDebut?.hourOfDay == it
                      || (rqt.plageHoraireAccueilReguliere?.horairePlacementApresMidiDebut == null && params['plageHoraireAccueilReguliere.horairePlacementApresMidiDebut_hour'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <g:message code="time.hour" />
              <select class="minute ${rqt.stepStates['accueil'].invalidFields.contains('plageHoraireAccueilReguliere.horairePlacementApresMidiDebut') ? 'validation-failed' : ''}"
                id="plageHoraireAccueilReguliere.horairePlacementApresMidiDebut_minute"
                name="plageHoraireAccueilReguliere.horairePlacementApresMidiDebut_minute">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..59}">
                 <g:if test="${(it % 5) == 0}">
                  <option value="${it}"
                    <g:if test="${rqt.plageHoraireAccueilReguliere?.horairePlacementApresMidiDebut?.minuteOfHour == it
                      || (rqt.plageHoraireAccueilReguliere?.horairePlacementApresMidiDebut == null && params['plageHoraireAccueilReguliere.horairePlacementApresMidiDebut_minute'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                        <g:if test="${it < 10}">
                           0${it}
                        </g:if>
                        <g:else>
                            ${it}
                        </g:else>
                  </option>
                 </g:if>
                </g:each>
              </select>
              <g:message code="time.minute" />
            </div>
            

    
      
            <div class="time   validate-time  ">
              <label class=""><g:message code="dccrr.property.horairePlacementApresMidiFin.label" />   
                <span><g:message code="dccrr.property.horairePlacementApresMidiFin.help" /></span>
              </label>
              <select class="hour ${rqt.stepStates['accueil'].invalidFields.contains('plageHoraireAccueilReguliere.horairePlacementApresMidiFin') ? 'validation-failed' : ''}"
                id="plageHoraireAccueilReguliere.horairePlacementApresMidiFin_hour"
                name="plageHoraireAccueilReguliere.horairePlacementApresMidiFin_hour">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..23}">
                  <option value="${it}"
                    <g:if test="${rqt.plageHoraireAccueilReguliere?.horairePlacementApresMidiFin?.hourOfDay == it
                      || (rqt.plageHoraireAccueilReguliere?.horairePlacementApresMidiFin == null && params['plageHoraireAccueilReguliere.horairePlacementApresMidiFin_hour'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <g:message code="time.hour" />
              <select class="minute ${rqt.stepStates['accueil'].invalidFields.contains('plageHoraireAccueilReguliere.horairePlacementApresMidiFin') ? 'validation-failed' : ''}"
                id="plageHoraireAccueilReguliere.horairePlacementApresMidiFin_minute"
                name="plageHoraireAccueilReguliere.horairePlacementApresMidiFin_minute">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..59}">
                 <g:if test="${(it % 5) == 0}">
                  <option value="${it}"
                    <g:if test="${rqt.plageHoraireAccueilReguliere?.horairePlacementApresMidiFin?.minuteOfHour == it
                      || (rqt.plageHoraireAccueilReguliere?.horairePlacementApresMidiFin == null && params['plageHoraireAccueilReguliere.horairePlacementApresMidiFin_minute'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                        <g:if test="${it < 10}">
                           0${it}
                        </g:if>
                        <g:else>
                            ${it}
                        </g:else>
                  </option>
                 </g:if>
                </g:each>
              </select>
              <g:message code="time.minute" />
            </div>
            

    
    </fieldset>
  

  
    <fieldset class="required condition-estHorairesAccueilIrregulier-filled">
    <legend><g:message code="dccrr.property.lundi.label" /></legend>
    
      
            <div class="time   validate-time  ">
              <label class=""><g:message code="dccrr.property.horairePlacementMatinDebutLundi.label" />   
                <span><g:message code="dccrr.property.horairePlacementMatinDebutLundi.help" /></span>
              </label>
              <select class="hour ${rqt.stepStates['accueil'].invalidFields.contains('lundi.horairePlacementMatinDebutLundi') ? 'validation-failed' : ''}"
                id="lundi.horairePlacementMatinDebutLundi_hour"
                name="lundi.horairePlacementMatinDebutLundi_hour">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..23}">
                  <option value="${it}"
                    <g:if test="${rqt.lundi?.horairePlacementMatinDebutLundi?.hourOfDay == it
                      || (rqt.lundi?.horairePlacementMatinDebutLundi == null && params['lundi.horairePlacementMatinDebutLundi_hour'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <g:message code="time.hour" />
              <select class="minute ${rqt.stepStates['accueil'].invalidFields.contains('lundi.horairePlacementMatinDebutLundi') ? 'validation-failed' : ''}"
                id="lundi.horairePlacementMatinDebutLundi_minute"
                name="lundi.horairePlacementMatinDebutLundi_minute">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..59}">
                 <g:if test="${(it % 5) == 0}">
                  <option value="${it}"
                    <g:if test="${rqt.lundi?.horairePlacementMatinDebutLundi?.minuteOfHour == it
                      || (rqt.lundi?.horairePlacementMatinDebutLundi == null && params['lundi.horairePlacementMatinDebutLundi_minute'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                        <g:if test="${it < 10}">
                           0${it}
                        </g:if>
                        <g:else>
                            ${it}
                        </g:else>
                  </option>
                 </g:if>
                </g:each>
              </select>
              <g:message code="time.minute" />
            </div>
            

    
      
            <div class="time   validate-time  ">
              <label class=""><g:message code="dccrr.property.horairePlacementMatinFinLundi.label" />   
                <span><g:message code="dccrr.property.horairePlacementMatinFinLundi.help" /></span>
              </label>
              <select class="hour ${rqt.stepStates['accueil'].invalidFields.contains('lundi.horairePlacementMatinFinLundi') ? 'validation-failed' : ''}"
                id="lundi.horairePlacementMatinFinLundi_hour"
                name="lundi.horairePlacementMatinFinLundi_hour">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..23}">
                  <option value="${it}"
                    <g:if test="${rqt.lundi?.horairePlacementMatinFinLundi?.hourOfDay == it
                      || (rqt.lundi?.horairePlacementMatinFinLundi == null && params['lundi.horairePlacementMatinFinLundi_hour'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <g:message code="time.hour" />
              <select class="minute ${rqt.stepStates['accueil'].invalidFields.contains('lundi.horairePlacementMatinFinLundi') ? 'validation-failed' : ''}"
                id="lundi.horairePlacementMatinFinLundi_minute"
                name="lundi.horairePlacementMatinFinLundi_minute">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..59}">
                 <g:if test="${(it % 5) == 0}">
                  <option value="${it}"
                    <g:if test="${rqt.lundi?.horairePlacementMatinFinLundi?.minuteOfHour == it
                      || (rqt.lundi?.horairePlacementMatinFinLundi == null && params['lundi.horairePlacementMatinFinLundi_minute'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                        <g:if test="${it < 10}">
                           0${it}
                        </g:if>
                        <g:else>
                            ${it}
                        </g:else>
                  </option>
                 </g:if>
                </g:each>
              </select>
              <g:message code="time.minute" />
            </div>
            

    
      
            <div class="time   validate-time  ">
              <label class=""><g:message code="dccrr.property.horairePlacementApresMidiDebutLundi.label" />   
                <span><g:message code="dccrr.property.horairePlacementApresMidiDebutLundi.help" /></span>
              </label>
              <select class="hour ${rqt.stepStates['accueil'].invalidFields.contains('lundi.horairePlacementApresMidiDebutLundi') ? 'validation-failed' : ''}"
                id="lundi.horairePlacementApresMidiDebutLundi_hour"
                name="lundi.horairePlacementApresMidiDebutLundi_hour">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..23}">
                  <option value="${it}"
                    <g:if test="${rqt.lundi?.horairePlacementApresMidiDebutLundi?.hourOfDay == it
                      || (rqt.lundi?.horairePlacementApresMidiDebutLundi == null && params['lundi.horairePlacementApresMidiDebutLundi_hour'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <g:message code="time.hour" />
              <select class="minute ${rqt.stepStates['accueil'].invalidFields.contains('lundi.horairePlacementApresMidiDebutLundi') ? 'validation-failed' : ''}"
                id="lundi.horairePlacementApresMidiDebutLundi_minute"
                name="lundi.horairePlacementApresMidiDebutLundi_minute">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..59}">
                 <g:if test="${(it % 5) == 0}">
                  <option value="${it}"
                    <g:if test="${rqt.lundi?.horairePlacementApresMidiDebutLundi?.minuteOfHour == it
                      || (rqt.lundi?.horairePlacementApresMidiDebutLundi == null && params['lundi.horairePlacementApresMidiDebutLundi_minute'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                        <g:if test="${it < 10}">
                           0${it}
                        </g:if>
                        <g:else>
                            ${it}
                        </g:else>
                  </option>
                 </g:if>
                </g:each>
              </select>
              <g:message code="time.minute" />
            </div>
            

    
      
            <div class="time   validate-time  ">
              <label class=""><g:message code="dccrr.property.horairePlacementApresMidiFinLundi.label" />   
                <span><g:message code="dccrr.property.horairePlacementApresMidiFinLundi.help" /></span>
              </label>
              <select class="hour ${rqt.stepStates['accueil'].invalidFields.contains('lundi.horairePlacementApresMidiFinLundi') ? 'validation-failed' : ''}"
                id="lundi.horairePlacementApresMidiFinLundi_hour"
                name="lundi.horairePlacementApresMidiFinLundi_hour">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..23}">
                  <option value="${it}"
                    <g:if test="${rqt.lundi?.horairePlacementApresMidiFinLundi?.hourOfDay == it
                      || (rqt.lundi?.horairePlacementApresMidiFinLundi == null && params['lundi.horairePlacementApresMidiFinLundi_hour'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <g:message code="time.hour" />
              <select class="minute ${rqt.stepStates['accueil'].invalidFields.contains('lundi.horairePlacementApresMidiFinLundi') ? 'validation-failed' : ''}"
                id="lundi.horairePlacementApresMidiFinLundi_minute"
                name="lundi.horairePlacementApresMidiFinLundi_minute">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..59}">
                 <g:if test="${(it % 5) == 0}">
                  <option value="${it}"
                    <g:if test="${rqt.lundi?.horairePlacementApresMidiFinLundi?.minuteOfHour == it
                      || (rqt.lundi?.horairePlacementApresMidiFinLundi == null && params['lundi.horairePlacementApresMidiFinLundi_minute'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                        <g:if test="${it < 10}">
                           0${it}
                        </g:if>
                        <g:else>
                            ${it}
                        </g:else>
                  </option>
                 </g:if>
                </g:each>
              </select>
              <g:message code="time.minute" />
            </div>
            

    
    </fieldset>
  

  
    <fieldset class="required condition-estHorairesAccueilIrregulier-filled">
    <legend><g:message code="dccrr.property.mardi.label" /></legend>
    
      
            <div class="time   validate-time  ">
              <label class=""><g:message code="dccrr.property.horairePlacementMatinDebutMardi.label" />   
                <span><g:message code="dccrr.property.horairePlacementMatinDebutMardi.help" /></span>
              </label>
              <select class="hour ${rqt.stepStates['accueil'].invalidFields.contains('mardi.horairePlacementMatinDebutMardi') ? 'validation-failed' : ''}"
                id="mardi.horairePlacementMatinDebutMardi_hour"
                name="mardi.horairePlacementMatinDebutMardi_hour">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..23}">
                  <option value="${it}"
                    <g:if test="${rqt.mardi?.horairePlacementMatinDebutMardi?.hourOfDay == it
                      || (rqt.mardi?.horairePlacementMatinDebutMardi == null && params['mardi.horairePlacementMatinDebutMardi_hour'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <g:message code="time.hour" />
              <select class="minute ${rqt.stepStates['accueil'].invalidFields.contains('mardi.horairePlacementMatinDebutMardi') ? 'validation-failed' : ''}"
                id="mardi.horairePlacementMatinDebutMardi_minute"
                name="mardi.horairePlacementMatinDebutMardi_minute">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..59}">
                 <g:if test="${(it % 5) == 0}">
                  <option value="${it}"
                    <g:if test="${rqt.mardi?.horairePlacementMatinDebutMardi?.minuteOfHour == it
                      || (rqt.mardi?.horairePlacementMatinDebutMardi == null && params['mardi.horairePlacementMatinDebutMardi_minute'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                        <g:if test="${it < 10}">
                           0${it}
                        </g:if>
                        <g:else>
                            ${it}
                        </g:else>
                  </option>
                 </g:if>
                </g:each>
              </select>
              <g:message code="time.minute" />
            </div>
            

    
      
            <div class="time   validate-time  ">
              <label class=""><g:message code="dccrr.property.horairePlacementMatinFinMardi.label" />   
                <span><g:message code="dccrr.property.horairePlacementMatinFinMardi.help" /></span>
              </label>
              <select class="hour ${rqt.stepStates['accueil'].invalidFields.contains('mardi.horairePlacementMatinFinMardi') ? 'validation-failed' : ''}"
                id="mardi.horairePlacementMatinFinMardi_hour"
                name="mardi.horairePlacementMatinFinMardi_hour">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..23}">
                  <option value="${it}"
                    <g:if test="${rqt.mardi?.horairePlacementMatinFinMardi?.hourOfDay == it
                      || (rqt.mardi?.horairePlacementMatinFinMardi == null && params['mardi.horairePlacementMatinFinMardi_hour'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <g:message code="time.hour" />
              <select class="minute ${rqt.stepStates['accueil'].invalidFields.contains('mardi.horairePlacementMatinFinMardi') ? 'validation-failed' : ''}"
                id="mardi.horairePlacementMatinFinMardi_minute"
                name="mardi.horairePlacementMatinFinMardi_minute">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..59}">
                 <g:if test="${(it % 5) == 0}">
                  <option value="${it}"
                    <g:if test="${rqt.mardi?.horairePlacementMatinFinMardi?.minuteOfHour == it
                      || (rqt.mardi?.horairePlacementMatinFinMardi == null && params['mardi.horairePlacementMatinFinMardi_minute'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                        <g:if test="${it < 10}">
                           0${it}
                        </g:if>
                        <g:else>
                            ${it}
                        </g:else>
                  </option>
                 </g:if>
                </g:each>
              </select>
              <g:message code="time.minute" />
            </div>
            

    
      
            <div class="time   validate-time  ">
              <label class=""><g:message code="dccrr.property.horairePlacementApresMidiDebutMardi.label" />   
                <span><g:message code="dccrr.property.horairePlacementApresMidiDebutMardi.help" /></span>
              </label>
              <select class="hour ${rqt.stepStates['accueil'].invalidFields.contains('mardi.horairePlacementApresMidiDebutMardi') ? 'validation-failed' : ''}"
                id="mardi.horairePlacementApresMidiDebutMardi_hour"
                name="mardi.horairePlacementApresMidiDebutMardi_hour">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..23}">
                  <option value="${it}"
                    <g:if test="${rqt.mardi?.horairePlacementApresMidiDebutMardi?.hourOfDay == it
                      || (rqt.mardi?.horairePlacementApresMidiDebutMardi == null && params['mardi.horairePlacementApresMidiDebutMardi_hour'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <g:message code="time.hour" />
              <select class="minute ${rqt.stepStates['accueil'].invalidFields.contains('mardi.horairePlacementApresMidiDebutMardi') ? 'validation-failed' : ''}"
                id="mardi.horairePlacementApresMidiDebutMardi_minute"
                name="mardi.horairePlacementApresMidiDebutMardi_minute">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..59}">
                 <g:if test="${(it % 5) == 0}">
                  <option value="${it}"
                    <g:if test="${rqt.mardi?.horairePlacementApresMidiDebutMardi?.minuteOfHour == it
                      || (rqt.mardi?.horairePlacementApresMidiDebutMardi == null && params['mardi.horairePlacementApresMidiDebutMardi_minute'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                        <g:if test="${it < 10}">
                           0${it}
                        </g:if>
                        <g:else>
                            ${it}
                        </g:else>
                  </option>
                 </g:if>
                </g:each>
              </select>
              <g:message code="time.minute" />
            </div>
            

    
      
            <div class="time   validate-time  ">
              <label class=""><g:message code="dccrr.property.horairePlacementApresMidiFinMardi.label" />   
                <span><g:message code="dccrr.property.horairePlacementApresMidiFinMardi.help" /></span>
              </label>
              <select class="hour ${rqt.stepStates['accueil'].invalidFields.contains('mardi.horairePlacementApresMidiFinMardi') ? 'validation-failed' : ''}"
                id="mardi.horairePlacementApresMidiFinMardi_hour"
                name="mardi.horairePlacementApresMidiFinMardi_hour">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..23}">
                  <option value="${it}"
                    <g:if test="${rqt.mardi?.horairePlacementApresMidiFinMardi?.hourOfDay == it
                      || (rqt.mardi?.horairePlacementApresMidiFinMardi == null && params['mardi.horairePlacementApresMidiFinMardi_hour'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <g:message code="time.hour" />
              <select class="minute ${rqt.stepStates['accueil'].invalidFields.contains('mardi.horairePlacementApresMidiFinMardi') ? 'validation-failed' : ''}"
                id="mardi.horairePlacementApresMidiFinMardi_minute"
                name="mardi.horairePlacementApresMidiFinMardi_minute">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..59}">
                 <g:if test="${(it % 5) == 0}">
                  <option value="${it}"
                    <g:if test="${rqt.mardi?.horairePlacementApresMidiFinMardi?.minuteOfHour == it
                      || (rqt.mardi?.horairePlacementApresMidiFinMardi == null && params['mardi.horairePlacementApresMidiFinMardi_minute'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                        <g:if test="${it < 10}">
                           0${it}
                        </g:if>
                        <g:else>
                            ${it}
                        </g:else>
                  </option>
                 </g:if>
                </g:each>
              </select>
              <g:message code="time.minute" />
            </div>
            

    
    </fieldset>
  

  
    <fieldset class="required condition-estHorairesAccueilIrregulier-filled">
    <legend><g:message code="dccrr.property.mercredi.label" /></legend>
    
      
            <div class="time   validate-time  ">
              <label class=""><g:message code="dccrr.property.horairePlacementMatinDebutMercredi.label" />   
                <span><g:message code="dccrr.property.horairePlacementMatinDebutMercredi.help" /></span>
              </label>
              <select class="hour ${rqt.stepStates['accueil'].invalidFields.contains('mercredi.horairePlacementMatinDebutMercredi') ? 'validation-failed' : ''}"
                id="mercredi.horairePlacementMatinDebutMercredi_hour"
                name="mercredi.horairePlacementMatinDebutMercredi_hour">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..23}">
                  <option value="${it}"
                    <g:if test="${rqt.mercredi?.horairePlacementMatinDebutMercredi?.hourOfDay == it
                      || (rqt.mercredi?.horairePlacementMatinDebutMercredi == null && params['mercredi.horairePlacementMatinDebutMercredi_hour'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <g:message code="time.hour" />
              <select class="minute ${rqt.stepStates['accueil'].invalidFields.contains('mercredi.horairePlacementMatinDebutMercredi') ? 'validation-failed' : ''}"
                id="mercredi.horairePlacementMatinDebutMercredi_minute"
                name="mercredi.horairePlacementMatinDebutMercredi_minute">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..59}">
                 <g:if test="${(it % 5) == 0}">
                  <option value="${it}"
                    <g:if test="${rqt.mercredi?.horairePlacementMatinDebutMercredi?.minuteOfHour == it
                      || (rqt.mercredi?.horairePlacementMatinDebutMercredi == null && params['mercredi.horairePlacementMatinDebutMercredi_minute'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                        <g:if test="${it < 10}">
                           0${it}
                        </g:if>
                        <g:else>
                            ${it}
                        </g:else>
                  </option>
                 </g:if>
                </g:each>
              </select>
              <g:message code="time.minute" />
            </div>
            

    
      
            <div class="time   validate-time  ">
              <label class=""><g:message code="dccrr.property.horairePlacementMatinFinMercredi.label" />   
                <span><g:message code="dccrr.property.horairePlacementMatinFinMercredi.help" /></span>
              </label>
              <select class="hour ${rqt.stepStates['accueil'].invalidFields.contains('mercredi.horairePlacementMatinFinMercredi') ? 'validation-failed' : ''}"
                id="mercredi.horairePlacementMatinFinMercredi_hour"
                name="mercredi.horairePlacementMatinFinMercredi_hour">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..23}">
                  <option value="${it}"
                    <g:if test="${rqt.mercredi?.horairePlacementMatinFinMercredi?.hourOfDay == it
                      || (rqt.mercredi?.horairePlacementMatinFinMercredi == null && params['mercredi.horairePlacementMatinFinMercredi_hour'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <g:message code="time.hour" />
              <select class="minute ${rqt.stepStates['accueil'].invalidFields.contains('mercredi.horairePlacementMatinFinMercredi') ? 'validation-failed' : ''}"
                id="mercredi.horairePlacementMatinFinMercredi_minute"
                name="mercredi.horairePlacementMatinFinMercredi_minute">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..59}">
                 <g:if test="${(it % 5) == 0}">
                  <option value="${it}"
                    <g:if test="${rqt.mercredi?.horairePlacementMatinFinMercredi?.minuteOfHour == it
                      || (rqt.mercredi?.horairePlacementMatinFinMercredi == null && params['mercredi.horairePlacementMatinFinMercredi_minute'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                        <g:if test="${it < 10}">
                           0${it}
                        </g:if>
                        <g:else>
                            ${it}
                        </g:else>
                  </option>
                 </g:if>
                </g:each>
              </select>
              <g:message code="time.minute" />
            </div>
            

    
      
            <div class="time   validate-time  ">
              <label class=""><g:message code="dccrr.property.horairePlacementApresMidiDebutMercredi.label" />   
                <span><g:message code="dccrr.property.horairePlacementApresMidiDebutMercredi.help" /></span>
              </label>
              <select class="hour ${rqt.stepStates['accueil'].invalidFields.contains('mercredi.horairePlacementApresMidiDebutMercredi') ? 'validation-failed' : ''}"
                id="mercredi.horairePlacementApresMidiDebutMercredi_hour"
                name="mercredi.horairePlacementApresMidiDebutMercredi_hour">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..23}">
                  <option value="${it}"
                    <g:if test="${rqt.mercredi?.horairePlacementApresMidiDebutMercredi?.hourOfDay == it
                      || (rqt.mercredi?.horairePlacementApresMidiDebutMercredi == null && params['mercredi.horairePlacementApresMidiDebutMercredi_hour'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <g:message code="time.hour" />
              <select class="minute ${rqt.stepStates['accueil'].invalidFields.contains('mercredi.horairePlacementApresMidiDebutMercredi') ? 'validation-failed' : ''}"
                id="mercredi.horairePlacementApresMidiDebutMercredi_minute"
                name="mercredi.horairePlacementApresMidiDebutMercredi_minute">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..59}">
                 <g:if test="${(it % 5) == 0}">
                  <option value="${it}"
                    <g:if test="${rqt.mercredi?.horairePlacementApresMidiDebutMercredi?.minuteOfHour == it
                      || (rqt.mercredi?.horairePlacementApresMidiDebutMercredi == null && params['mercredi.horairePlacementApresMidiDebutMercredi_minute'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                        <g:if test="${it < 10}">
                           0${it}
                        </g:if>
                        <g:else>
                            ${it}
                        </g:else>
                  </option>
                 </g:if>
                </g:each>
              </select>
              <g:message code="time.minute" />
            </div>
            

    
      
            <div class="time   validate-time  ">
              <label class=""><g:message code="dccrr.property.horairePlacementApresMidiFinMercredi.label" />   
                <span><g:message code="dccrr.property.horairePlacementApresMidiFinMercredi.help" /></span>
              </label>
              <select class="hour ${rqt.stepStates['accueil'].invalidFields.contains('mercredi.horairePlacementApresMidiFinMercredi') ? 'validation-failed' : ''}"
                id="mercredi.horairePlacementApresMidiFinMercredi_hour"
                name="mercredi.horairePlacementApresMidiFinMercredi_hour">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..23}">
                  <option value="${it}"
                    <g:if test="${rqt.mercredi?.horairePlacementApresMidiFinMercredi?.hourOfDay == it
                      || (rqt.mercredi?.horairePlacementApresMidiFinMercredi == null && params['mercredi.horairePlacementApresMidiFinMercredi_hour'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <g:message code="time.hour" />
              <select class="minute ${rqt.stepStates['accueil'].invalidFields.contains('mercredi.horairePlacementApresMidiFinMercredi') ? 'validation-failed' : ''}"
                id="mercredi.horairePlacementApresMidiFinMercredi_minute"
                name="mercredi.horairePlacementApresMidiFinMercredi_minute">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..59}">
                 <g:if test="${(it % 5) == 0}">
                  <option value="${it}"
                    <g:if test="${rqt.mercredi?.horairePlacementApresMidiFinMercredi?.minuteOfHour == it
                      || (rqt.mercredi?.horairePlacementApresMidiFinMercredi == null && params['mercredi.horairePlacementApresMidiFinMercredi_minute'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                        <g:if test="${it < 10}">
                           0${it}
                        </g:if>
                        <g:else>
                            ${it}
                        </g:else>
                  </option>
                 </g:if>
                </g:each>
              </select>
              <g:message code="time.minute" />
            </div>
            

    
    </fieldset>
  

  
    <fieldset class="required condition-estHorairesAccueilIrregulier-filled">
    <legend><g:message code="dccrr.property.jeudi.label" /></legend>
    
      
            <div class="time   validate-time  ">
              <label class=""><g:message code="dccrr.property.horairePlacementMatinDebutJeudi.label" />   
                <span><g:message code="dccrr.property.horairePlacementMatinDebutJeudi.help" /></span>
              </label>
              <select class="hour ${rqt.stepStates['accueil'].invalidFields.contains('jeudi.horairePlacementMatinDebutJeudi') ? 'validation-failed' : ''}"
                id="jeudi.horairePlacementMatinDebutJeudi_hour"
                name="jeudi.horairePlacementMatinDebutJeudi_hour">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..23}">
                  <option value="${it}"
                    <g:if test="${rqt.jeudi?.horairePlacementMatinDebutJeudi?.hourOfDay == it
                      || (rqt.jeudi?.horairePlacementMatinDebutJeudi == null && params['jeudi.horairePlacementMatinDebutJeudi_hour'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <g:message code="time.hour" />
              <select class="minute ${rqt.stepStates['accueil'].invalidFields.contains('jeudi.horairePlacementMatinDebutJeudi') ? 'validation-failed' : ''}"
                id="jeudi.horairePlacementMatinDebutJeudi_minute"
                name="jeudi.horairePlacementMatinDebutJeudi_minute">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..59}">
                 <g:if test="${(it % 5) == 0}">
                  <option value="${it}"
                    <g:if test="${rqt.jeudi?.horairePlacementMatinDebutJeudi?.minuteOfHour == it
                      || (rqt.jeudi?.horairePlacementMatinDebutJeudi == null && params['jeudi.horairePlacementMatinDebutJeudi_minute'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                        <g:if test="${it < 10}">
                           0${it}
                        </g:if>
                        <g:else>
                            ${it}
                        </g:else>
                  </option>
                 </g:if>
                </g:each>
              </select>
              <g:message code="time.minute" />
            </div>
            

    
      
            <div class="time   validate-time  ">
              <label class=""><g:message code="dccrr.property.horairePlacementMatinFinJeudi.label" />   
                <span><g:message code="dccrr.property.horairePlacementMatinFinJeudi.help" /></span>
              </label>
              <select class="hour ${rqt.stepStates['accueil'].invalidFields.contains('jeudi.horairePlacementMatinFinJeudi') ? 'validation-failed' : ''}"
                id="jeudi.horairePlacementMatinFinJeudi_hour"
                name="jeudi.horairePlacementMatinFinJeudi_hour">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..23}">
                  <option value="${it}"
                    <g:if test="${rqt.jeudi?.horairePlacementMatinFinJeudi?.hourOfDay == it
                      || (rqt.jeudi?.horairePlacementMatinFinJeudi == null && params['jeudi.horairePlacementMatinFinJeudi_hour'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <g:message code="time.hour" />
              <select class="minute ${rqt.stepStates['accueil'].invalidFields.contains('jeudi.horairePlacementMatinFinJeudi') ? 'validation-failed' : ''}"
                id="jeudi.horairePlacementMatinFinJeudi_minute"
                name="jeudi.horairePlacementMatinFinJeudi_minute">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..59}">
                 <g:if test="${(it % 5) == 0}">
                  <option value="${it}"
                    <g:if test="${rqt.jeudi?.horairePlacementMatinFinJeudi?.minuteOfHour == it
                      || (rqt.jeudi?.horairePlacementMatinFinJeudi == null && params['jeudi.horairePlacementMatinFinJeudi_minute'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                        <g:if test="${it < 10}">
                           0${it}
                        </g:if>
                        <g:else>
                            ${it}
                        </g:else>
                  </option>
                 </g:if>
                </g:each>
              </select>
              <g:message code="time.minute" />
            </div>
            

    
      
            <div class="time   validate-time  ">
              <label class=""><g:message code="dccrr.property.horairePlacementApresMidiDebutJeudi.label" />   
                <span><g:message code="dccrr.property.horairePlacementApresMidiDebutJeudi.help" /></span>
              </label>
              <select class="hour ${rqt.stepStates['accueil'].invalidFields.contains('jeudi.horairePlacementApresMidiDebutJeudi') ? 'validation-failed' : ''}"
                id="jeudi.horairePlacementApresMidiDebutJeudi_hour"
                name="jeudi.horairePlacementApresMidiDebutJeudi_hour">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..23}">
                  <option value="${it}"
                    <g:if test="${rqt.jeudi?.horairePlacementApresMidiDebutJeudi?.hourOfDay == it
                      || (rqt.jeudi?.horairePlacementApresMidiDebutJeudi == null && params['jeudi.horairePlacementApresMidiDebutJeudi_hour'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <g:message code="time.hour" />
              <select class="minute ${rqt.stepStates['accueil'].invalidFields.contains('jeudi.horairePlacementApresMidiDebutJeudi') ? 'validation-failed' : ''}"
                id="jeudi.horairePlacementApresMidiDebutJeudi_minute"
                name="jeudi.horairePlacementApresMidiDebutJeudi_minute">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..59}">
                 <g:if test="${(it % 5) == 0}">
                  <option value="${it}"
                    <g:if test="${rqt.jeudi?.horairePlacementApresMidiDebutJeudi?.minuteOfHour == it
                      || (rqt.jeudi?.horairePlacementApresMidiDebutJeudi == null && params['jeudi.horairePlacementApresMidiDebutJeudi_minute'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                        <g:if test="${it < 10}">
                           0${it}
                        </g:if>
                        <g:else>
                            ${it}
                        </g:else>
                  </option>
                 </g:if>
                </g:each>
              </select>
              <g:message code="time.minute" />
            </div>
            

    
      
            <div class="time   validate-time  ">
              <label class=""><g:message code="dccrr.property.horairePlacementApresMidiFinJeudi.label" />   
                <span><g:message code="dccrr.property.horairePlacementApresMidiFinJeudi.help" /></span>
              </label>
              <select class="hour ${rqt.stepStates['accueil'].invalidFields.contains('jeudi.horairePlacementApresMidiFinJeudi') ? 'validation-failed' : ''}"
                id="jeudi.horairePlacementApresMidiFinJeudi_hour"
                name="jeudi.horairePlacementApresMidiFinJeudi_hour">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..23}">
                  <option value="${it}"
                    <g:if test="${rqt.jeudi?.horairePlacementApresMidiFinJeudi?.hourOfDay == it
                      || (rqt.jeudi?.horairePlacementApresMidiFinJeudi == null && params['jeudi.horairePlacementApresMidiFinJeudi_hour'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <g:message code="time.hour" />
              <select class="minute ${rqt.stepStates['accueil'].invalidFields.contains('jeudi.horairePlacementApresMidiFinJeudi') ? 'validation-failed' : ''}"
                id="jeudi.horairePlacementApresMidiFinJeudi_minute"
                name="jeudi.horairePlacementApresMidiFinJeudi_minute">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..59}">
                 <g:if test="${(it % 5) == 0}">
                  <option value="${it}"
                    <g:if test="${rqt.jeudi?.horairePlacementApresMidiFinJeudi?.minuteOfHour == it
                      || (rqt.jeudi?.horairePlacementApresMidiFinJeudi == null && params['jeudi.horairePlacementApresMidiFinJeudi_minute'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                        <g:if test="${it < 10}">
                           0${it}
                        </g:if>
                        <g:else>
                            ${it}
                        </g:else>
                  </option>
                 </g:if>
                </g:each>
              </select>
              <g:message code="time.minute" />
            </div>
            

    
    </fieldset>
  

  
    <fieldset class="required condition-estHorairesAccueilIrregulier-filled">
    <legend><g:message code="dccrr.property.vendredi.label" /></legend>
    
      
            <div class="time   validate-time  ">
              <label class=""><g:message code="dccrr.property.horairePlacementMatinDebutVendredi.label" />   
                <span><g:message code="dccrr.property.horairePlacementMatinDebutVendredi.help" /></span>
              </label>
              <select class="hour ${rqt.stepStates['accueil'].invalidFields.contains('vendredi.horairePlacementMatinDebutVendredi') ? 'validation-failed' : ''}"
                id="vendredi.horairePlacementMatinDebutVendredi_hour"
                name="vendredi.horairePlacementMatinDebutVendredi_hour">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..23}">
                  <option value="${it}"
                    <g:if test="${rqt.vendredi?.horairePlacementMatinDebutVendredi?.hourOfDay == it
                      || (rqt.vendredi?.horairePlacementMatinDebutVendredi == null && params['vendredi.horairePlacementMatinDebutVendredi_hour'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <g:message code="time.hour" />
              <select class="minute ${rqt.stepStates['accueil'].invalidFields.contains('vendredi.horairePlacementMatinDebutVendredi') ? 'validation-failed' : ''}"
                id="vendredi.horairePlacementMatinDebutVendredi_minute"
                name="vendredi.horairePlacementMatinDebutVendredi_minute">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..59}">
                 <g:if test="${(it % 5) == 0}">
                  <option value="${it}"
                    <g:if test="${rqt.vendredi?.horairePlacementMatinDebutVendredi?.minuteOfHour == it
                      || (rqt.vendredi?.horairePlacementMatinDebutVendredi == null && params['vendredi.horairePlacementMatinDebutVendredi_minute'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                        <g:if test="${it < 10}">
                           0${it}
                        </g:if>
                        <g:else>
                            ${it}
                        </g:else>
                  </option>
                 </g:if>
                </g:each>
              </select>
              <g:message code="time.minute" />
            </div>
            

    
      
            <div class="time   validate-time  ">
              <label class=""><g:message code="dccrr.property.horairePlacementMatinFinVendredi.label" />   
                <span><g:message code="dccrr.property.horairePlacementMatinFinVendredi.help" /></span>
              </label>
              <select class="hour ${rqt.stepStates['accueil'].invalidFields.contains('vendredi.horairePlacementMatinFinVendredi') ? 'validation-failed' : ''}"
                id="vendredi.horairePlacementMatinFinVendredi_hour"
                name="vendredi.horairePlacementMatinFinVendredi_hour">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..23}">
                  <option value="${it}"
                    <g:if test="${rqt.vendredi?.horairePlacementMatinFinVendredi?.hourOfDay == it
                      || (rqt.vendredi?.horairePlacementMatinFinVendredi == null && params['vendredi.horairePlacementMatinFinVendredi_hour'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <g:message code="time.hour" />
              <select class="minute ${rqt.stepStates['accueil'].invalidFields.contains('vendredi.horairePlacementMatinFinVendredi') ? 'validation-failed' : ''}"
                id="vendredi.horairePlacementMatinFinVendredi_minute"
                name="vendredi.horairePlacementMatinFinVendredi_minute">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..59}">
                 <g:if test="${(it % 5) == 0}">
                  <option value="${it}"
                    <g:if test="${rqt.vendredi?.horairePlacementMatinFinVendredi?.minuteOfHour == it
                      || (rqt.vendredi?.horairePlacementMatinFinVendredi == null && params['vendredi.horairePlacementMatinFinVendredi_minute'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                        <g:if test="${it < 10}">
                           0${it}
                        </g:if>
                        <g:else>
                            ${it}
                        </g:else>
                  </option>
                 </g:if>
                </g:each>
              </select>
              <g:message code="time.minute" />
            </div>
            

    
      
            <div class="time   validate-time  ">
              <label class=""><g:message code="dccrr.property.horairePlacementApresMidiDebutVendredi.label" />   
                <span><g:message code="dccrr.property.horairePlacementApresMidiDebutVendredi.help" /></span>
              </label>
              <select class="hour ${rqt.stepStates['accueil'].invalidFields.contains('vendredi.horairePlacementApresMidiDebutVendredi') ? 'validation-failed' : ''}"
                id="vendredi.horairePlacementApresMidiDebutVendredi_hour"
                name="vendredi.horairePlacementApresMidiDebutVendredi_hour">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..23}">
                  <option value="${it}"
                    <g:if test="${rqt.vendredi?.horairePlacementApresMidiDebutVendredi?.hourOfDay == it
                      || (rqt.vendredi?.horairePlacementApresMidiDebutVendredi == null && params['vendredi.horairePlacementApresMidiDebutVendredi_hour'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <g:message code="time.hour" />
              <select class="minute ${rqt.stepStates['accueil'].invalidFields.contains('vendredi.horairePlacementApresMidiDebutVendredi') ? 'validation-failed' : ''}"
                id="vendredi.horairePlacementApresMidiDebutVendredi_minute"
                name="vendredi.horairePlacementApresMidiDebutVendredi_minute">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..59}">
                 <g:if test="${(it % 5) == 0}">
                  <option value="${it}"
                    <g:if test="${rqt.vendredi?.horairePlacementApresMidiDebutVendredi?.minuteOfHour == it
                      || (rqt.vendredi?.horairePlacementApresMidiDebutVendredi == null && params['vendredi.horairePlacementApresMidiDebutVendredi_minute'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                        <g:if test="${it < 10}">
                           0${it}
                        </g:if>
                        <g:else>
                            ${it}
                        </g:else>
                  </option>
                 </g:if>
                </g:each>
              </select>
              <g:message code="time.minute" />
            </div>
            

    
      
            <div class="time   validate-time  ">
              <label class=""><g:message code="dccrr.property.horairePlacementApresMidiFinVendredi.label" />   
                <span><g:message code="dccrr.property.horairePlacementApresMidiFinVendredi.help" /></span>
              </label>
              <select class="hour ${rqt.stepStates['accueil'].invalidFields.contains('vendredi.horairePlacementApresMidiFinVendredi') ? 'validation-failed' : ''}"
                id="vendredi.horairePlacementApresMidiFinVendredi_hour"
                name="vendredi.horairePlacementApresMidiFinVendredi_hour">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..23}">
                  <option value="${it}"
                    <g:if test="${rqt.vendredi?.horairePlacementApresMidiFinVendredi?.hourOfDay == it
                      || (rqt.vendredi?.horairePlacementApresMidiFinVendredi == null && params['vendredi.horairePlacementApresMidiFinVendredi_hour'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <g:message code="time.hour" />
              <select class="minute ${rqt.stepStates['accueil'].invalidFields.contains('vendredi.horairePlacementApresMidiFinVendredi') ? 'validation-failed' : ''}"
                id="vendredi.horairePlacementApresMidiFinVendredi_minute"
                name="vendredi.horairePlacementApresMidiFinVendredi_minute">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${0..59}">
                 <g:if test="${(it % 5) == 0}">
                  <option value="${it}"
                    <g:if test="${rqt.vendredi?.horairePlacementApresMidiFinVendredi?.minuteOfHour == it
                      || (rqt.vendredi?.horairePlacementApresMidiFinVendredi == null && params['vendredi.horairePlacementApresMidiFinVendredi_minute'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                        <g:if test="${it < 10}">
                           0${it}
                        </g:if>
                        <g:else>
                            ${it}
                        </g:else>
                  </option>
                 </g:if>
                </g:each>
              </select>
              <g:message code="time.minute" />
            </div>
            

    
    </fieldset>
  

