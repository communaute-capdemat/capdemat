


  
    <label for="situationProfessionnelleVous" class="required"><g:message code="myr.property.situationProfessionnelleVous.label" /> *  <span><g:message code="myr.property.situationProfessionnelleVous.help" /></span></label>
            <select id="situationProfessionnelleVous" name="situationProfessionnelleVous" class="required condition-estSalarieVous-trigger condition-estStagiaireVous-trigger condition-estNonSalarieVous-trigger condition-estDemandeurEmploiVous-trigger condition-estRetraiteVous-trigger condition-estBeneficiairePensionVous-trigger condition-estAutreVous-trigger  validate-not-first ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVous') ? 'validation-failed' : ''}" title="<g:message code="myr.property.situationProfessionnelleVous.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['SALARIE','STAGIAIRE','NONSALARIE','DEMANDEUR','RETRAITE','PENSION','AUTRE']}">
                <option value="${it}" ${it == rqt.situationProfessionnelleVous?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="myr.property.situationProfessionnelleVous" /></option>
              </g:each>
            </select>
            

  

  
    <fieldset class="required condition-estSalarieVous-filled">
    <legend><g:message code="myr.property.situationProfessionnelleVousSalarie.label" /></legend>
    
      <label class="required"><g:message code="myr.property.salarieDepuisLe.label" /> *  <span><g:message code="myr.property.salarieDepuisLe.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousSalarie.salarieDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousSalarie.salarieDepuisLe_day"
                name="situationProfessionnelleVousSalarie.salarieDepuisLe_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleVousSalarie?.salarieDepuisLe?.date == it
                      || (rqt.situationProfessionnelleVousSalarie?.salarieDepuisLe == null && params['situationProfessionnelleVousSalarie.salarieDepuisLe_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousSalarie.salarieDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousSalarie.salarieDepuisLe_month"
                name="situationProfessionnelleVousSalarie.salarieDepuisLe_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleVousSalarie?.salarieDepuisLe?.month == (it - 1)
                      || (rqt.situationProfessionnelleVousSalarie?.salarieDepuisLe == null && params['situationProfessionnelleVousSalarie.salarieDepuisLe_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousSalarie.salarieDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousSalarie.salarieDepuisLe_year"
                name="situationProfessionnelleVousSalarie.salarieDepuisLe_year"
                value="${rqt.situationProfessionnelleVousSalarie?.salarieDepuisLe ? rqt.situationProfessionnelleVousSalarie?.salarieDepuisLe.year + 1900 : params['situationProfessionnelleVousSalarie.salarieDepuisLe_year']}"
                title="<g:message code="myr.property.salarieDepuisLe.validationError" />" />
            </div>
            

    
      <label for="situationProfessionnelleVousSalarie.typeContrat" class="required"><g:message code="myr.property.typeContrat.label" /> *  <span><g:message code="myr.property.typeContrat.help" /></span></label>
            <input type="text" id="situationProfessionnelleVousSalarie.typeContrat" name="situationProfessionnelleVousSalarie.typeContrat" value="${rqt.situationProfessionnelleVousSalarie?.typeContrat?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousSalarie.typeContrat') ? 'validation-failed' : ''}" title="<g:message code="myr.property.typeContrat.validationError" />"   />
            

    
      <label class="required"><g:message code="myr.property.salarieDateDebutContrat.label" /> *  <span><g:message code="myr.property.salarieDateDebutContrat.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousSalarie.salarieDateDebutContrat') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousSalarie.salarieDateDebutContrat_day"
                name="situationProfessionnelleVousSalarie.salarieDateDebutContrat_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleVousSalarie?.salarieDateDebutContrat?.date == it
                      || (rqt.situationProfessionnelleVousSalarie?.salarieDateDebutContrat == null && params['situationProfessionnelleVousSalarie.salarieDateDebutContrat_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousSalarie.salarieDateDebutContrat') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousSalarie.salarieDateDebutContrat_month"
                name="situationProfessionnelleVousSalarie.salarieDateDebutContrat_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleVousSalarie?.salarieDateDebutContrat?.month == (it - 1)
                      || (rqt.situationProfessionnelleVousSalarie?.salarieDateDebutContrat == null && params['situationProfessionnelleVousSalarie.salarieDateDebutContrat_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousSalarie.salarieDateDebutContrat') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousSalarie.salarieDateDebutContrat_year"
                name="situationProfessionnelleVousSalarie.salarieDateDebutContrat_year"
                value="${rqt.situationProfessionnelleVousSalarie?.salarieDateDebutContrat ? rqt.situationProfessionnelleVousSalarie?.salarieDateDebutContrat.year + 1900 : params['situationProfessionnelleVousSalarie.salarieDateDebutContrat_year']}"
                title="<g:message code="myr.property.salarieDateDebutContrat.validationError" />" />
            </div>
            

    
      <label class=""><g:message code="myr.property.salarieDateFinContrat.label" />   <span><g:message code="myr.property.salarieDateFinContrat.help" /></span></label>
            <div class="date   validate-date  ">
              <select class="day ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousSalarie.salarieDateFinContrat') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousSalarie.salarieDateFinContrat_day"
                name="situationProfessionnelleVousSalarie.salarieDateFinContrat_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleVousSalarie?.salarieDateFinContrat?.date == it
                      || (rqt.situationProfessionnelleVousSalarie?.salarieDateFinContrat == null && params['situationProfessionnelleVousSalarie.salarieDateFinContrat_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousSalarie.salarieDateFinContrat') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousSalarie.salarieDateFinContrat_month"
                name="situationProfessionnelleVousSalarie.salarieDateFinContrat_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleVousSalarie?.salarieDateFinContrat?.month == (it - 1)
                      || (rqt.situationProfessionnelleVousSalarie?.salarieDateFinContrat == null && params['situationProfessionnelleVousSalarie.salarieDateFinContrat_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousSalarie.salarieDateFinContrat') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousSalarie.salarieDateFinContrat_year"
                name="situationProfessionnelleVousSalarie.salarieDateFinContrat_year"
                value="${rqt.situationProfessionnelleVousSalarie?.salarieDateFinContrat ? rqt.situationProfessionnelleVousSalarie?.salarieDateFinContrat.year + 1900 : params['situationProfessionnelleVousSalarie.salarieDateFinContrat_year']}"
                title="<g:message code="myr.property.salarieDateFinContrat.validationError" />" />
            </div>
            

    
      <label class=""><g:message code="myr.property.esatDepuisLe.label" />   <span><g:message code="myr.property.esatDepuisLe.help" /></span></label>
            <div class="date   validate-date  ">
              <select class="day ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousSalarie.esatDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousSalarie.esatDepuisLe_day"
                name="situationProfessionnelleVousSalarie.esatDepuisLe_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleVousSalarie?.esatDepuisLe?.date == it
                      || (rqt.situationProfessionnelleVousSalarie?.esatDepuisLe == null && params['situationProfessionnelleVousSalarie.esatDepuisLe_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousSalarie.esatDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousSalarie.esatDepuisLe_month"
                name="situationProfessionnelleVousSalarie.esatDepuisLe_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleVousSalarie?.esatDepuisLe?.month == (it - 1)
                      || (rqt.situationProfessionnelleVousSalarie?.esatDepuisLe == null && params['situationProfessionnelleVousSalarie.esatDepuisLe_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousSalarie.esatDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousSalarie.esatDepuisLe_year"
                name="situationProfessionnelleVousSalarie.esatDepuisLe_year"
                value="${rqt.situationProfessionnelleVousSalarie?.esatDepuisLe ? rqt.situationProfessionnelleVousSalarie?.esatDepuisLe.year + 1900 : params['situationProfessionnelleVousSalarie.esatDepuisLe_year']}"
                title="<g:message code="myr.property.esatDepuisLe.validationError" />" />
            </div>
            

    
    </fieldset>
  

  
    <fieldset class="required condition-estStagiaireVous-filled">
    <legend><g:message code="myr.property.situationProfessionnelleVousStagiaire.label" /></legend>
    
      <label class="required"><g:message code="myr.property.stagiaireDepuisLe.label" /> *  <span><g:message code="myr.property.stagiaireDepuisLe.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousStagiaire.stagiaireDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousStagiaire.stagiaireDepuisLe_day"
                name="situationProfessionnelleVousStagiaire.stagiaireDepuisLe_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleVousStagiaire?.stagiaireDepuisLe?.date == it
                      || (rqt.situationProfessionnelleVousStagiaire?.stagiaireDepuisLe == null && params['situationProfessionnelleVousStagiaire.stagiaireDepuisLe_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousStagiaire.stagiaireDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousStagiaire.stagiaireDepuisLe_month"
                name="situationProfessionnelleVousStagiaire.stagiaireDepuisLe_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleVousStagiaire?.stagiaireDepuisLe?.month == (it - 1)
                      || (rqt.situationProfessionnelleVousStagiaire?.stagiaireDepuisLe == null && params['situationProfessionnelleVousStagiaire.stagiaireDepuisLe_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousStagiaire.stagiaireDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousStagiaire.stagiaireDepuisLe_year"
                name="situationProfessionnelleVousStagiaire.stagiaireDepuisLe_year"
                value="${rqt.situationProfessionnelleVousStagiaire?.stagiaireDepuisLe ? rqt.situationProfessionnelleVousStagiaire?.stagiaireDepuisLe.year + 1900 : params['situationProfessionnelleVousStagiaire.stagiaireDepuisLe_year']}"
                title="<g:message code="myr.property.stagiaireDepuisLe.validationError" />" />
            </div>
            

    
      <label class="required"><g:message code="myr.property.stageRenumeration.label" /> *  <span><g:message code="myr.property.stageRenumeration.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousStagiaire.stageRenumeration') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="situationProfessionnelleVousStagiaire.stageRenumeration_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="situationProfessionnelleVousStagiaire.stageRenumeration" ${ rqt.situationProfessionnelleVousStagiaire ?  (it == rqt.situationProfessionnelleVousStagiaire?.stageRenumeration ? 'checked="checked"': '') : (it == null ? 'checked="checked"': '') } />
                <label for="situationProfessionnelleVousStagiaire.stageRenumeration_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label for="situationProfessionnelleVousStagiaire.nomEmployeurStage" class="required"><g:message code="myr.property.nomEmployeurStage.label" /> *  <span><g:message code="myr.property.nomEmployeurStage.help" /></span></label>
            <input type="text" id="situationProfessionnelleVousStagiaire.nomEmployeurStage" name="situationProfessionnelleVousStagiaire.nomEmployeurStage" value="${rqt.situationProfessionnelleVousStagiaire?.nomEmployeurStage?.toString()}" 
                    class="required  validate-lastName ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousStagiaire.nomEmployeurStage') ? 'validation-failed' : ''}" title="<g:message code="myr.property.nomEmployeurStage.validationError" />"  maxlength="38" />
            

    
      <label class="required"><g:message code="myr.property.adresseEmployeurStage.label" /> *  <span><g:message code="myr.property.adresseEmployeurStage.help" /></span></label>
            <div id="situationProfessionnelleVousStagiaire.adresseEmployeurStage" class="address required  ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousStagiaire.adresseEmployeurStage') ? 'validation-failed' : ''}">
            <label for="situationProfessionnelleVousStagiaire.adresseEmployeurStage.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousStagiaire.adresseEmployeurStage.additionalDeliveryInformation') ? 'validation-failed' : ''}" value="${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.additionalDeliveryInformation}" maxlength="38" id="situationProfessionnelleVousStagiaire.adresseEmployeurStage.additionalDeliveryInformation" name="situationProfessionnelleVousStagiaire.adresseEmployeurStage.additionalDeliveryInformation" />  
            <label for="situationProfessionnelleVousStagiaire.adresseEmployeurStage.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousStagiaire.adresseEmployeurStage.additionalGeographicalInformation') ? 'validation-failed' : ''}" value="${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.additionalGeographicalInformation}" maxlength="38" id="situationProfessionnelleVousStagiaire.adresseEmployeurStage.additionalGeographicalInformation" name="situationProfessionnelleVousStagiaire.adresseEmployeurStage.additionalGeographicalInformation" />
            <label for="situationProfessionnelleVousStagiaire.adresseEmployeurStage_streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="situationProfessionnelleVousStagiaire.adresseEmployeurStage_streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1 validate-streetNumber ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousStagiaire.adresseEmployeurStage.streetNumber') ? 'validation-failed' : ''}" value="${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.streetNumber}" size="5" maxlength="5" id="situationProfessionnelleVousStagiaire.adresseEmployeurStage_streetNumber" name="situationProfessionnelleVousStagiaire.adresseEmployeurStage.streetNumber" />
            <input type="text" class="line2 required validate-streetName ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousStagiaire.adresseEmployeurStage.streetName') ? 'validation-failed' : ''}" value="${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.streetName}" maxlength="32" id="situationProfessionnelleVousStagiaire.adresseEmployeurStage_streetName" name="situationProfessionnelleVousStagiaire.adresseEmployeurStage.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <input type="hidden" value="${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.streetMatriculation}" id="situationProfessionnelleVousStagiaire.adresseEmployeurStage_streetMatriculation" name="situationProfessionnelleVousStagiaire.adresseEmployeurStage.streetMatriculation" />
            <input type="hidden" value="${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.streetRivoliCode}" id="situationProfessionnelleVousStagiaire.adresseEmployeurStage_streetRivoliCode" name="situationProfessionnelleVousStagiaire.adresseEmployeurStage.streetRivoliCode" />
            <label for="situationProfessionnelleVousStagiaire.adresseEmployeurStage.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousStagiaire.adresseEmployeurStage.placeNameOrService') ? 'validation-failed' : ''}" value="${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.placeNameOrService}" maxlength="38" id="situationProfessionnelleVousStagiaire.adresseEmployeurStage.placeNameOrService" name="situationProfessionnelleVousStagiaire.adresseEmployeurStage.placeNameOrService" />
            <label for="situationProfessionnelleVousStagiaire.adresseEmployeurStage_postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="situationProfessionnelleVousStagiaire.adresseEmployeurStage_city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required validate-postalCode ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousStagiaire.adresseEmployeurStage.postalCode') ? 'validation-failed' : ''}" value="${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.postalCode}" size="5" maxlength="5" id="situationProfessionnelleVousStagiaire.adresseEmployeurStage_postalCode" name="situationProfessionnelleVousStagiaire.adresseEmployeurStage.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required validate-city ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousStagiaire.adresseEmployeurStage.city') ? 'validation-failed' : ''}" value="${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.city}" maxlength="32" id="situationProfessionnelleVousStagiaire.adresseEmployeurStage_city" name="situationProfessionnelleVousStagiaire.adresseEmployeurStage.city" title="<g:message code="address.property.city.validationError" />" />
            <input type="hidden" value="${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.cityInseeCode}" id="situationProfessionnelleVousStagiaire.adresseEmployeurStage_cityInseeCode" name="situationProfessionnelleVousStagiaire.adresseEmployeurStage.cityInseeCode" />
            <label for="situationProfessionnelleVousStagiaire.adresseEmployeurStage.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousStagiaire.adresseEmployeurStage.countryName') ? 'validation-failed' : ''}" value="${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.countryName}" maxlength="38" id="situationProfessionnelleVousStagiaire.adresseEmployeurStage.countryName" name="situationProfessionnelleVousStagiaire.adresseEmployeurStage.countryName" />
            </div>
            

    
      <label for="situationProfessionnelleVousStagiaire.telephoneEmployeurStage" class="required"><g:message code="myr.property.telephoneEmployeurStage.label" /> *  <span><g:message code="myr.property.telephoneEmployeurStage.help" /></span></label>
            <input type="text" id="situationProfessionnelleVousStagiaire.telephoneEmployeurStage" name="situationProfessionnelleVousStagiaire.telephoneEmployeurStage" value="${rqt.situationProfessionnelleVousStagiaire?.telephoneEmployeurStage?.toString()}" 
                    class="required  validate-phone ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousStagiaire.telephoneEmployeurStage') ? 'validation-failed' : ''}" title="<g:message code="myr.property.telephoneEmployeurStage.validationError" />"  maxlength="10" />
            

    
    </fieldset>
  

  
    <fieldset class="required condition-estNonSalarieVous-filled">
    <legend><g:message code="myr.property.situationProfessionnelleVousNonSalarie.label" /></legend>
    
      <label class="required"><g:message code="myr.property.nonSalarieDepuisLe.label" /> *  <span><g:message code="myr.property.nonSalarieDepuisLe.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousNonSalarie.nonSalarieDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousNonSalarie.nonSalarieDepuisLe_day"
                name="situationProfessionnelleVousNonSalarie.nonSalarieDepuisLe_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleVousNonSalarie?.nonSalarieDepuisLe?.date == it
                      || (rqt.situationProfessionnelleVousNonSalarie?.nonSalarieDepuisLe == null && params['situationProfessionnelleVousNonSalarie.nonSalarieDepuisLe_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousNonSalarie.nonSalarieDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousNonSalarie.nonSalarieDepuisLe_month"
                name="situationProfessionnelleVousNonSalarie.nonSalarieDepuisLe_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleVousNonSalarie?.nonSalarieDepuisLe?.month == (it - 1)
                      || (rqt.situationProfessionnelleVousNonSalarie?.nonSalarieDepuisLe == null && params['situationProfessionnelleVousNonSalarie.nonSalarieDepuisLe_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousNonSalarie.nonSalarieDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousNonSalarie.nonSalarieDepuisLe_year"
                name="situationProfessionnelleVousNonSalarie.nonSalarieDepuisLe_year"
                value="${rqt.situationProfessionnelleVousNonSalarie?.nonSalarieDepuisLe ? rqt.situationProfessionnelleVousNonSalarie?.nonSalarieDepuisLe.year + 1900 : params['situationProfessionnelleVousNonSalarie.nonSalarieDepuisLe_year']}"
                title="<g:message code="myr.property.nonSalarieDepuisLe.validationError" />" />
            </div>
            

    
      <label for="situationProfessionnelleVousNonSalarie.regimeCotisations" class="required"><g:message code="myr.property.regimeCotisations.label" /> *  <span><g:message code="myr.property.regimeCotisations.help" /></span></label>
            <input type="text" id="situationProfessionnelleVousNonSalarie.regimeCotisations" name="situationProfessionnelleVousNonSalarie.regimeCotisations" value="${rqt.situationProfessionnelleVousNonSalarie?.regimeCotisations?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousNonSalarie.regimeCotisations') ? 'validation-failed' : ''}" title="<g:message code="myr.property.regimeCotisations.validationError" />"   />
            

    
    </fieldset>
  

  
    <fieldset class="required condition-estDemandeurEmploiVous-filled">
    <legend><g:message code="myr.property.situationProfessionnelleVousDemandeurEmploi.label" /></legend>
    
      <label class="required"><g:message code="myr.property.demandeurEmploiDepuisLe.label" /> *  <span><g:message code="myr.property.demandeurEmploiDepuisLe.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousDemandeurEmploi.demandeurEmploiDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousDemandeurEmploi.demandeurEmploiDepuisLe_day"
                name="situationProfessionnelleVousDemandeurEmploi.demandeurEmploiDepuisLe_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleVousDemandeurEmploi?.demandeurEmploiDepuisLe?.date == it
                      || (rqt.situationProfessionnelleVousDemandeurEmploi?.demandeurEmploiDepuisLe == null && params['situationProfessionnelleVousDemandeurEmploi.demandeurEmploiDepuisLe_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousDemandeurEmploi.demandeurEmploiDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousDemandeurEmploi.demandeurEmploiDepuisLe_month"
                name="situationProfessionnelleVousDemandeurEmploi.demandeurEmploiDepuisLe_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleVousDemandeurEmploi?.demandeurEmploiDepuisLe?.month == (it - 1)
                      || (rqt.situationProfessionnelleVousDemandeurEmploi?.demandeurEmploiDepuisLe == null && params['situationProfessionnelleVousDemandeurEmploi.demandeurEmploiDepuisLe_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousDemandeurEmploi.demandeurEmploiDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousDemandeurEmploi.demandeurEmploiDepuisLe_year"
                name="situationProfessionnelleVousDemandeurEmploi.demandeurEmploiDepuisLe_year"
                value="${rqt.situationProfessionnelleVousDemandeurEmploi?.demandeurEmploiDepuisLe ? rqt.situationProfessionnelleVousDemandeurEmploi?.demandeurEmploiDepuisLe.year + 1900 : params['situationProfessionnelleVousDemandeurEmploi.demandeurEmploiDepuisLe_year']}"
                title="<g:message code="myr.property.demandeurEmploiDepuisLe.validationError" />" />
            </div>
            

    
      <label class="required"><g:message code="myr.property.indemnisationDepuisLe.label" /> *  <span><g:message code="myr.property.indemnisationDepuisLe.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousDemandeurEmploi.indemnisationDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousDemandeurEmploi.indemnisationDepuisLe_day"
                name="situationProfessionnelleVousDemandeurEmploi.indemnisationDepuisLe_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleVousDemandeurEmploi?.indemnisationDepuisLe?.date == it
                      || (rqt.situationProfessionnelleVousDemandeurEmploi?.indemnisationDepuisLe == null && params['situationProfessionnelleVousDemandeurEmploi.indemnisationDepuisLe_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousDemandeurEmploi.indemnisationDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousDemandeurEmploi.indemnisationDepuisLe_month"
                name="situationProfessionnelleVousDemandeurEmploi.indemnisationDepuisLe_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleVousDemandeurEmploi?.indemnisationDepuisLe?.month == (it - 1)
                      || (rqt.situationProfessionnelleVousDemandeurEmploi?.indemnisationDepuisLe == null && params['situationProfessionnelleVousDemandeurEmploi.indemnisationDepuisLe_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousDemandeurEmploi.indemnisationDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousDemandeurEmploi.indemnisationDepuisLe_year"
                name="situationProfessionnelleVousDemandeurEmploi.indemnisationDepuisLe_year"
                value="${rqt.situationProfessionnelleVousDemandeurEmploi?.indemnisationDepuisLe ? rqt.situationProfessionnelleVousDemandeurEmploi?.indemnisationDepuisLe.year + 1900 : params['situationProfessionnelleVousDemandeurEmploi.indemnisationDepuisLe_year']}"
                title="<g:message code="myr.property.indemnisationDepuisLe.validationError" />" />
            </div>
            

    
      <label class="required"><g:message code="myr.property.allocationSolidariteSpecifique.label" /> *  <span><g:message code="myr.property.allocationSolidariteSpecifique.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousDemandeurEmploi.allocationSolidariteSpecifique') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="situationProfessionnelleVousDemandeurEmploi.allocationSolidariteSpecifique_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="situationProfessionnelleVousDemandeurEmploi.allocationSolidariteSpecifique" ${ rqt.situationProfessionnelleVousDemandeurEmploi ?  (it == rqt.situationProfessionnelleVousDemandeurEmploi?.allocationSolidariteSpecifique ? 'checked="checked"': '') : (it == null ? 'checked="checked"': '') } />
                <label for="situationProfessionnelleVousDemandeurEmploi.allocationSolidariteSpecifique_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
    </fieldset>
  

  
    <fieldset class="required condition-estRetraiteVous-filled">
    <legend><g:message code="myr.property.situationProfessionnelleVousRetraite.label" /></legend>
    
      <label class="required"><g:message code="myr.property.retraiteDepuisLe.label" /> *  <span><g:message code="myr.property.retraiteDepuisLe.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousRetraite.retraiteDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousRetraite.retraiteDepuisLe_day"
                name="situationProfessionnelleVousRetraite.retraiteDepuisLe_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleVousRetraite?.retraiteDepuisLe?.date == it
                      || (rqt.situationProfessionnelleVousRetraite?.retraiteDepuisLe == null && params['situationProfessionnelleVousRetraite.retraiteDepuisLe_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousRetraite.retraiteDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousRetraite.retraiteDepuisLe_month"
                name="situationProfessionnelleVousRetraite.retraiteDepuisLe_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleVousRetraite?.retraiteDepuisLe?.month == (it - 1)
                      || (rqt.situationProfessionnelleVousRetraite?.retraiteDepuisLe == null && params['situationProfessionnelleVousRetraite.retraiteDepuisLe_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousRetraite.retraiteDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousRetraite.retraiteDepuisLe_year"
                name="situationProfessionnelleVousRetraite.retraiteDepuisLe_year"
                value="${rqt.situationProfessionnelleVousRetraite?.retraiteDepuisLe ? rqt.situationProfessionnelleVousRetraite?.retraiteDepuisLe.year + 1900 : params['situationProfessionnelleVousRetraite.retraiteDepuisLe_year']}"
                title="<g:message code="myr.property.retraiteDepuisLe.validationError" />" />
            </div>
            

    
      <label class="required"><g:message code="myr.property.supplementairePersonneAgee.label" /> *  <span><g:message code="myr.property.supplementairePersonneAgee.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousRetraite.supplementairePersonneAgee') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="situationProfessionnelleVousRetraite.supplementairePersonneAgee_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="situationProfessionnelleVousRetraite.supplementairePersonneAgee" ${ rqt.situationProfessionnelleVousRetraite ?  (it == rqt.situationProfessionnelleVousRetraite?.supplementairePersonneAgee ? 'checked="checked"': '') : (it == null ? 'checked="checked"': '') } />
                <label for="situationProfessionnelleVousRetraite.supplementairePersonneAgee_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label class="required"><g:message code="myr.property.pensionRetraite.label" /> *  <span><g:message code="myr.property.pensionRetraite.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousRetraite.pensionRetraite') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="situationProfessionnelleVousRetraite.pensionRetraite_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="situationProfessionnelleVousRetraite.pensionRetraite" ${ rqt.situationProfessionnelleVousRetraite ?  (it == rqt.situationProfessionnelleVousRetraite?.pensionRetraite ? 'checked="checked"': '') : (it == null ? 'checked="checked"': '') } />
                <label for="situationProfessionnelleVousRetraite.pensionRetraite_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
    </fieldset>
  

  
    <fieldset class="required condition-estBeneficiairePensionVous-filled">
    <legend><g:message code="myr.property.situationProfessionnelleVousBeneficiairePension.label" /></legend>
    
      <label class="required"><g:message code="myr.property.beneficiairePensionDepuisLe.label" /> *  <span><g:message code="myr.property.beneficiairePensionDepuisLe.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousBeneficiairePension.beneficiairePensionDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousBeneficiairePension.beneficiairePensionDepuisLe_day"
                name="situationProfessionnelleVousBeneficiairePension.beneficiairePensionDepuisLe_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleVousBeneficiairePension?.beneficiairePensionDepuisLe?.date == it
                      || (rqt.situationProfessionnelleVousBeneficiairePension?.beneficiairePensionDepuisLe == null && params['situationProfessionnelleVousBeneficiairePension.beneficiairePensionDepuisLe_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousBeneficiairePension.beneficiairePensionDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousBeneficiairePension.beneficiairePensionDepuisLe_month"
                name="situationProfessionnelleVousBeneficiairePension.beneficiairePensionDepuisLe_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleVousBeneficiairePension?.beneficiairePensionDepuisLe?.month == (it - 1)
                      || (rqt.situationProfessionnelleVousBeneficiairePension?.beneficiairePensionDepuisLe == null && params['situationProfessionnelleVousBeneficiairePension.beneficiairePensionDepuisLe_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousBeneficiairePension.beneficiairePensionDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousBeneficiairePension.beneficiairePensionDepuisLe_year"
                name="situationProfessionnelleVousBeneficiairePension.beneficiairePensionDepuisLe_year"
                value="${rqt.situationProfessionnelleVousBeneficiairePension?.beneficiairePensionDepuisLe ? rqt.situationProfessionnelleVousBeneficiairePension?.beneficiairePensionDepuisLe.year + 1900 : params['situationProfessionnelleVousBeneficiairePension.beneficiairePensionDepuisLe_year']}"
                title="<g:message code="myr.property.beneficiairePensionDepuisLe.validationError" />" />
            </div>
            

    
      <label for="situationProfessionnelleVousBeneficiairePension.categoriePensionInvalidite" class="required"><g:message code="myr.property.categoriePensionInvalidite.label" /> *  <span><g:message code="myr.property.categoriePensionInvalidite.help" /></span></label>
            <select id="situationProfessionnelleVousBeneficiairePension.categoriePensionInvalidite" name="situationProfessionnelleVousBeneficiairePension.categoriePensionInvalidite" class="required  validate-not-first ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousBeneficiairePension.categoriePensionInvalidite') ? 'validation-failed' : ''}" title="<g:message code="myr.property.categoriePensionInvalidite.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['UN','DEUX','TROIS']}">
                <option value="${it}" ${it == rqt.situationProfessionnelleVousBeneficiairePension?.categoriePensionInvalidite?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="myr.property.categoriePensionInvalidite" /></option>
              </g:each>
            </select>
            

    
      <label class="required"><g:message code="myr.property.renteAccidentTravail.label" /> *  <span><g:message code="myr.property.renteAccidentTravail.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousBeneficiairePension.renteAccidentTravail') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="situationProfessionnelleVousBeneficiairePension.renteAccidentTravail_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="situationProfessionnelleVousBeneficiairePension.renteAccidentTravail" ${ rqt.situationProfessionnelleVousBeneficiairePension ?  (it == rqt.situationProfessionnelleVousBeneficiairePension?.renteAccidentTravail ? 'checked="checked"': '') : (it == null ? 'checked="checked"': '') } />
                <label for="situationProfessionnelleVousBeneficiairePension.renteAccidentTravail_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label class="required"><g:message code="myr.property.allocationSupplementaireInvalidite.label" /> *  <span><g:message code="myr.property.allocationSupplementaireInvalidite.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousBeneficiairePension.allocationSupplementaireInvalidite') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="situationProfessionnelleVousBeneficiairePension.allocationSupplementaireInvalidite_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="situationProfessionnelleVousBeneficiairePension.allocationSupplementaireInvalidite" ${ rqt.situationProfessionnelleVousBeneficiairePension ?  (it == rqt.situationProfessionnelleVousBeneficiairePension?.allocationSupplementaireInvalidite ? 'checked="checked"': '') : (it == null ? 'checked="checked"': '') } />
                <label for="situationProfessionnelleVousBeneficiairePension.allocationSupplementaireInvalidite_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
    </fieldset>
  

  
    <fieldset class="required condition-estAutreVous-filled">
    <legend><g:message code="myr.property.situationProfessionnelleVousAutre.label" /></legend>
    
      <label class="required"><g:message code="myr.property.autreDepuisLe.label" /> *  <span><g:message code="myr.property.autreDepuisLe.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousAutre.autreDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousAutre.autreDepuisLe_day"
                name="situationProfessionnelleVousAutre.autreDepuisLe_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleVousAutre?.autreDepuisLe?.date == it
                      || (rqt.situationProfessionnelleVousAutre?.autreDepuisLe == null && params['situationProfessionnelleVousAutre.autreDepuisLe_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousAutre.autreDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousAutre.autreDepuisLe_month"
                name="situationProfessionnelleVousAutre.autreDepuisLe_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleVousAutre?.autreDepuisLe?.month == (it - 1)
                      || (rqt.situationProfessionnelleVousAutre?.autreDepuisLe == null && params['situationProfessionnelleVousAutre.autreDepuisLe_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousAutre.autreDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleVousAutre.autreDepuisLe_year"
                name="situationProfessionnelleVousAutre.autreDepuisLe_year"
                value="${rqt.situationProfessionnelleVousAutre?.autreDepuisLe ? rqt.situationProfessionnelleVousAutre?.autreDepuisLe.year + 1900 : params['situationProfessionnelleVousAutre.autreDepuisLe_year']}"
                title="<g:message code="myr.property.autreDepuisLe.validationError" />" />
            </div>
            

    
      <label for="situationProfessionnelleVousAutre.precisionAutreSituationProfessionnelle" class="required"><g:message code="myr.property.precisionAutreSituationProfessionnelle.label" /> *  <span><g:message code="myr.property.precisionAutreSituationProfessionnelle.help" /></span></label>
            <input type="text" id="situationProfessionnelleVousAutre.precisionAutreSituationProfessionnelle" name="situationProfessionnelleVousAutre.precisionAutreSituationProfessionnelle" value="${rqt.situationProfessionnelleVousAutre?.precisionAutreSituationProfessionnelle?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleVousAutre.precisionAutreSituationProfessionnelle') ? 'validation-failed' : ''}" title="<g:message code="myr.property.precisionAutreSituationProfessionnelle.validationError" />"   />
            

    
    </fieldset>
  

  
    <label for="situationProfessionnelleConjoint" class=""><g:message code="myr.property.situationProfessionnelleConjoint.label" />   <span><g:message code="myr.property.situationProfessionnelleConjoint.help" /></span></label>
            <select id="situationProfessionnelleConjoint" name="situationProfessionnelleConjoint" class="condition-estSalarieConjoint-trigger condition-estStagiaireConjoint-trigger condition-estNonSalarieConjoint-trigger condition-estDemandeurEmploiConjoint-trigger condition-estRetraiteConjoint-trigger condition-estBeneficiairePensionConjoint-trigger condition-estAutreConjoint-trigger  validate-select ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjoint') ? 'validation-failed' : ''}" title="<g:message code="myr.property.situationProfessionnelleConjoint.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['SALARIE','STAGIAIRE','NONSALARIE','DEMANDEUR','RETRAITE','PENSION','AUTRE']}">
                <option value="${it}" ${it == rqt.situationProfessionnelleConjoint?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="myr.property.situationProfessionnelleConjoint" /></option>
              </g:each>
            </select>
            

  

  
    <fieldset class="required condition-estSalarieConjoint-filled">
    <legend><g:message code="myr.property.situationProfessionnelleConjointSalarie.label" /></legend>
    
      <label class="required"><g:message code="myr.property.salarieDepuisLe.label" /> *  <span><g:message code="myr.property.salarieDepuisLe.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointSalarie.salarieDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointSalarie.salarieDepuisLe_day"
                name="situationProfessionnelleConjointSalarie.salarieDepuisLe_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleConjointSalarie?.salarieDepuisLe?.date == it
                      || (rqt.situationProfessionnelleConjointSalarie?.salarieDepuisLe == null && params['situationProfessionnelleConjointSalarie.salarieDepuisLe_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointSalarie.salarieDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointSalarie.salarieDepuisLe_month"
                name="situationProfessionnelleConjointSalarie.salarieDepuisLe_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleConjointSalarie?.salarieDepuisLe?.month == (it - 1)
                      || (rqt.situationProfessionnelleConjointSalarie?.salarieDepuisLe == null && params['situationProfessionnelleConjointSalarie.salarieDepuisLe_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointSalarie.salarieDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointSalarie.salarieDepuisLe_year"
                name="situationProfessionnelleConjointSalarie.salarieDepuisLe_year"
                value="${rqt.situationProfessionnelleConjointSalarie?.salarieDepuisLe ? rqt.situationProfessionnelleConjointSalarie?.salarieDepuisLe.year + 1900 : params['situationProfessionnelleConjointSalarie.salarieDepuisLe_year']}"
                title="<g:message code="myr.property.salarieDepuisLe.validationError" />" />
            </div>
            

    
      <label for="situationProfessionnelleConjointSalarie.typeContrat" class="required"><g:message code="myr.property.typeContrat.label" /> *  <span><g:message code="myr.property.typeContrat.help" /></span></label>
            <input type="text" id="situationProfessionnelleConjointSalarie.typeContrat" name="situationProfessionnelleConjointSalarie.typeContrat" value="${rqt.situationProfessionnelleConjointSalarie?.typeContrat?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointSalarie.typeContrat') ? 'validation-failed' : ''}" title="<g:message code="myr.property.typeContrat.validationError" />"   />
            

    
      <label class="required"><g:message code="myr.property.salarieDateDebutContrat.label" /> *  <span><g:message code="myr.property.salarieDateDebutContrat.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointSalarie.salarieDateDebutContrat') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointSalarie.salarieDateDebutContrat_day"
                name="situationProfessionnelleConjointSalarie.salarieDateDebutContrat_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleConjointSalarie?.salarieDateDebutContrat?.date == it
                      || (rqt.situationProfessionnelleConjointSalarie?.salarieDateDebutContrat == null && params['situationProfessionnelleConjointSalarie.salarieDateDebutContrat_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointSalarie.salarieDateDebutContrat') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointSalarie.salarieDateDebutContrat_month"
                name="situationProfessionnelleConjointSalarie.salarieDateDebutContrat_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleConjointSalarie?.salarieDateDebutContrat?.month == (it - 1)
                      || (rqt.situationProfessionnelleConjointSalarie?.salarieDateDebutContrat == null && params['situationProfessionnelleConjointSalarie.salarieDateDebutContrat_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointSalarie.salarieDateDebutContrat') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointSalarie.salarieDateDebutContrat_year"
                name="situationProfessionnelleConjointSalarie.salarieDateDebutContrat_year"
                value="${rqt.situationProfessionnelleConjointSalarie?.salarieDateDebutContrat ? rqt.situationProfessionnelleConjointSalarie?.salarieDateDebutContrat.year + 1900 : params['situationProfessionnelleConjointSalarie.salarieDateDebutContrat_year']}"
                title="<g:message code="myr.property.salarieDateDebutContrat.validationError" />" />
            </div>
            

    
      <label class=""><g:message code="myr.property.salarieDateFinContrat.label" />   <span><g:message code="myr.property.salarieDateFinContrat.help" /></span></label>
            <div class="date   validate-date  ">
              <select class="day ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointSalarie.salarieDateFinContrat') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointSalarie.salarieDateFinContrat_day"
                name="situationProfessionnelleConjointSalarie.salarieDateFinContrat_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleConjointSalarie?.salarieDateFinContrat?.date == it
                      || (rqt.situationProfessionnelleConjointSalarie?.salarieDateFinContrat == null && params['situationProfessionnelleConjointSalarie.salarieDateFinContrat_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointSalarie.salarieDateFinContrat') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointSalarie.salarieDateFinContrat_month"
                name="situationProfessionnelleConjointSalarie.salarieDateFinContrat_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleConjointSalarie?.salarieDateFinContrat?.month == (it - 1)
                      || (rqt.situationProfessionnelleConjointSalarie?.salarieDateFinContrat == null && params['situationProfessionnelleConjointSalarie.salarieDateFinContrat_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointSalarie.salarieDateFinContrat') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointSalarie.salarieDateFinContrat_year"
                name="situationProfessionnelleConjointSalarie.salarieDateFinContrat_year"
                value="${rqt.situationProfessionnelleConjointSalarie?.salarieDateFinContrat ? rqt.situationProfessionnelleConjointSalarie?.salarieDateFinContrat.year + 1900 : params['situationProfessionnelleConjointSalarie.salarieDateFinContrat_year']}"
                title="<g:message code="myr.property.salarieDateFinContrat.validationError" />" />
            </div>
            

    
      <label class=""><g:message code="myr.property.esatDepuisLe.label" />   <span><g:message code="myr.property.esatDepuisLe.help" /></span></label>
            <div class="date   validate-date  ">
              <select class="day ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointSalarie.esatDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointSalarie.esatDepuisLe_day"
                name="situationProfessionnelleConjointSalarie.esatDepuisLe_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleConjointSalarie?.esatDepuisLe?.date == it
                      || (rqt.situationProfessionnelleConjointSalarie?.esatDepuisLe == null && params['situationProfessionnelleConjointSalarie.esatDepuisLe_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointSalarie.esatDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointSalarie.esatDepuisLe_month"
                name="situationProfessionnelleConjointSalarie.esatDepuisLe_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleConjointSalarie?.esatDepuisLe?.month == (it - 1)
                      || (rqt.situationProfessionnelleConjointSalarie?.esatDepuisLe == null && params['situationProfessionnelleConjointSalarie.esatDepuisLe_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointSalarie.esatDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointSalarie.esatDepuisLe_year"
                name="situationProfessionnelleConjointSalarie.esatDepuisLe_year"
                value="${rqt.situationProfessionnelleConjointSalarie?.esatDepuisLe ? rqt.situationProfessionnelleConjointSalarie?.esatDepuisLe.year + 1900 : params['situationProfessionnelleConjointSalarie.esatDepuisLe_year']}"
                title="<g:message code="myr.property.esatDepuisLe.validationError" />" />
            </div>
            

    
    </fieldset>
  

  
    <fieldset class="required condition-estStagiaireConjoint-filled">
    <legend><g:message code="myr.property.situationProfessionnelleConjointStagiaire.label" /></legend>
    
      <label class="required"><g:message code="myr.property.stagiaireDepuisLe.label" /> *  <span><g:message code="myr.property.stagiaireDepuisLe.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointStagiaire.stagiaireDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointStagiaire.stagiaireDepuisLe_day"
                name="situationProfessionnelleConjointStagiaire.stagiaireDepuisLe_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleConjointStagiaire?.stagiaireDepuisLe?.date == it
                      || (rqt.situationProfessionnelleConjointStagiaire?.stagiaireDepuisLe == null && params['situationProfessionnelleConjointStagiaire.stagiaireDepuisLe_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointStagiaire.stagiaireDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointStagiaire.stagiaireDepuisLe_month"
                name="situationProfessionnelleConjointStagiaire.stagiaireDepuisLe_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleConjointStagiaire?.stagiaireDepuisLe?.month == (it - 1)
                      || (rqt.situationProfessionnelleConjointStagiaire?.stagiaireDepuisLe == null && params['situationProfessionnelleConjointStagiaire.stagiaireDepuisLe_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointStagiaire.stagiaireDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointStagiaire.stagiaireDepuisLe_year"
                name="situationProfessionnelleConjointStagiaire.stagiaireDepuisLe_year"
                value="${rqt.situationProfessionnelleConjointStagiaire?.stagiaireDepuisLe ? rqt.situationProfessionnelleConjointStagiaire?.stagiaireDepuisLe.year + 1900 : params['situationProfessionnelleConjointStagiaire.stagiaireDepuisLe_year']}"
                title="<g:message code="myr.property.stagiaireDepuisLe.validationError" />" />
            </div>
            

    
      <label class="required"><g:message code="myr.property.stageRenumeration.label" /> *  <span><g:message code="myr.property.stageRenumeration.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointStagiaire.stageRenumeration') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="situationProfessionnelleConjointStagiaire.stageRenumeration_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="situationProfessionnelleConjointStagiaire.stageRenumeration" ${ rqt.situationProfessionnelleConjointStagiaire ?  (it == rqt.situationProfessionnelleConjointStagiaire?.stageRenumeration ? 'checked="checked"': '') : (it == null ? 'checked="checked"': '') } />
                <label for="situationProfessionnelleConjointStagiaire.stageRenumeration_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label for="situationProfessionnelleConjointStagiaire.nomEmployeurStage" class="required"><g:message code="myr.property.nomEmployeurStage.label" /> *  <span><g:message code="myr.property.nomEmployeurStage.help" /></span></label>
            <input type="text" id="situationProfessionnelleConjointStagiaire.nomEmployeurStage" name="situationProfessionnelleConjointStagiaire.nomEmployeurStage" value="${rqt.situationProfessionnelleConjointStagiaire?.nomEmployeurStage?.toString()}" 
                    class="required  validate-lastName ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointStagiaire.nomEmployeurStage') ? 'validation-failed' : ''}" title="<g:message code="myr.property.nomEmployeurStage.validationError" />"  maxlength="38" />
            

    
      <label class="required"><g:message code="myr.property.adresseEmployeurStage.label" /> *  <span><g:message code="myr.property.adresseEmployeurStage.help" /></span></label>
            <div id="situationProfessionnelleConjointStagiaire.adresseEmployeurStage" class="address required  ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointStagiaire.adresseEmployeurStage') ? 'validation-failed' : ''}">
            <label for="situationProfessionnelleConjointStagiaire.adresseEmployeurStage.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointStagiaire.adresseEmployeurStage.additionalDeliveryInformation') ? 'validation-failed' : ''}" value="${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.additionalDeliveryInformation}" maxlength="38" id="situationProfessionnelleConjointStagiaire.adresseEmployeurStage.additionalDeliveryInformation" name="situationProfessionnelleConjointStagiaire.adresseEmployeurStage.additionalDeliveryInformation" />  
            <label for="situationProfessionnelleConjointStagiaire.adresseEmployeurStage.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointStagiaire.adresseEmployeurStage.additionalGeographicalInformation') ? 'validation-failed' : ''}" value="${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.additionalGeographicalInformation}" maxlength="38" id="situationProfessionnelleConjointStagiaire.adresseEmployeurStage.additionalGeographicalInformation" name="situationProfessionnelleConjointStagiaire.adresseEmployeurStage.additionalGeographicalInformation" />
            <label for="situationProfessionnelleConjointStagiaire.adresseEmployeurStage_streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="situationProfessionnelleConjointStagiaire.adresseEmployeurStage_streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1 validate-streetNumber ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointStagiaire.adresseEmployeurStage.streetNumber') ? 'validation-failed' : ''}" value="${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.streetNumber}" size="5" maxlength="5" id="situationProfessionnelleConjointStagiaire.adresseEmployeurStage_streetNumber" name="situationProfessionnelleConjointStagiaire.adresseEmployeurStage.streetNumber" />
            <input type="text" class="line2 required validate-streetName ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointStagiaire.adresseEmployeurStage.streetName') ? 'validation-failed' : ''}" value="${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.streetName}" maxlength="32" id="situationProfessionnelleConjointStagiaire.adresseEmployeurStage_streetName" name="situationProfessionnelleConjointStagiaire.adresseEmployeurStage.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <input type="hidden" value="${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.streetMatriculation}" id="situationProfessionnelleConjointStagiaire.adresseEmployeurStage_streetMatriculation" name="situationProfessionnelleConjointStagiaire.adresseEmployeurStage.streetMatriculation" />
            <input type="hidden" value="${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.streetRivoliCode}" id="situationProfessionnelleConjointStagiaire.adresseEmployeurStage_streetRivoliCode" name="situationProfessionnelleConjointStagiaire.adresseEmployeurStage.streetRivoliCode" />
            <label for="situationProfessionnelleConjointStagiaire.adresseEmployeurStage.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointStagiaire.adresseEmployeurStage.placeNameOrService') ? 'validation-failed' : ''}" value="${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.placeNameOrService}" maxlength="38" id="situationProfessionnelleConjointStagiaire.adresseEmployeurStage.placeNameOrService" name="situationProfessionnelleConjointStagiaire.adresseEmployeurStage.placeNameOrService" />
            <label for="situationProfessionnelleConjointStagiaire.adresseEmployeurStage_postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="situationProfessionnelleConjointStagiaire.adresseEmployeurStage_city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required validate-postalCode ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointStagiaire.adresseEmployeurStage.postalCode') ? 'validation-failed' : ''}" value="${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.postalCode}" size="5" maxlength="5" id="situationProfessionnelleConjointStagiaire.adresseEmployeurStage_postalCode" name="situationProfessionnelleConjointStagiaire.adresseEmployeurStage.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required validate-city ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointStagiaire.adresseEmployeurStage.city') ? 'validation-failed' : ''}" value="${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.city}" maxlength="32" id="situationProfessionnelleConjointStagiaire.adresseEmployeurStage_city" name="situationProfessionnelleConjointStagiaire.adresseEmployeurStage.city" title="<g:message code="address.property.city.validationError" />" />
            <input type="hidden" value="${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.cityInseeCode}" id="situationProfessionnelleConjointStagiaire.adresseEmployeurStage_cityInseeCode" name="situationProfessionnelleConjointStagiaire.adresseEmployeurStage.cityInseeCode" />
            <label for="situationProfessionnelleConjointStagiaire.adresseEmployeurStage.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointStagiaire.adresseEmployeurStage.countryName') ? 'validation-failed' : ''}" value="${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.countryName}" maxlength="38" id="situationProfessionnelleConjointStagiaire.adresseEmployeurStage.countryName" name="situationProfessionnelleConjointStagiaire.adresseEmployeurStage.countryName" />
            </div>
            

    
      <label for="situationProfessionnelleConjointStagiaire.telephoneEmployeurStage" class="required"><g:message code="myr.property.telephoneEmployeurStage.label" /> *  <span><g:message code="myr.property.telephoneEmployeurStage.help" /></span></label>
            <input type="text" id="situationProfessionnelleConjointStagiaire.telephoneEmployeurStage" name="situationProfessionnelleConjointStagiaire.telephoneEmployeurStage" value="${rqt.situationProfessionnelleConjointStagiaire?.telephoneEmployeurStage?.toString()}" 
                    class="required  validate-phone ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointStagiaire.telephoneEmployeurStage') ? 'validation-failed' : ''}" title="<g:message code="myr.property.telephoneEmployeurStage.validationError" />"  maxlength="10" />
            

    
    </fieldset>
  

  
    <fieldset class="required condition-estNonSalarieConjoint-filled">
    <legend><g:message code="myr.property.situationProfessionnelleConjointNonSalarie.label" /></legend>
    
      <label class="required"><g:message code="myr.property.nonSalarieDepuisLe.label" /> *  <span><g:message code="myr.property.nonSalarieDepuisLe.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointNonSalarie.nonSalarieDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointNonSalarie.nonSalarieDepuisLe_day"
                name="situationProfessionnelleConjointNonSalarie.nonSalarieDepuisLe_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleConjointNonSalarie?.nonSalarieDepuisLe?.date == it
                      || (rqt.situationProfessionnelleConjointNonSalarie?.nonSalarieDepuisLe == null && params['situationProfessionnelleConjointNonSalarie.nonSalarieDepuisLe_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointNonSalarie.nonSalarieDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointNonSalarie.nonSalarieDepuisLe_month"
                name="situationProfessionnelleConjointNonSalarie.nonSalarieDepuisLe_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleConjointNonSalarie?.nonSalarieDepuisLe?.month == (it - 1)
                      || (rqt.situationProfessionnelleConjointNonSalarie?.nonSalarieDepuisLe == null && params['situationProfessionnelleConjointNonSalarie.nonSalarieDepuisLe_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointNonSalarie.nonSalarieDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointNonSalarie.nonSalarieDepuisLe_year"
                name="situationProfessionnelleConjointNonSalarie.nonSalarieDepuisLe_year"
                value="${rqt.situationProfessionnelleConjointNonSalarie?.nonSalarieDepuisLe ? rqt.situationProfessionnelleConjointNonSalarie?.nonSalarieDepuisLe.year + 1900 : params['situationProfessionnelleConjointNonSalarie.nonSalarieDepuisLe_year']}"
                title="<g:message code="myr.property.nonSalarieDepuisLe.validationError" />" />
            </div>
            

    
      <label for="situationProfessionnelleConjointNonSalarie.regimeCotisations" class="required"><g:message code="myr.property.regimeCotisations.label" /> *  <span><g:message code="myr.property.regimeCotisations.help" /></span></label>
            <input type="text" id="situationProfessionnelleConjointNonSalarie.regimeCotisations" name="situationProfessionnelleConjointNonSalarie.regimeCotisations" value="${rqt.situationProfessionnelleConjointNonSalarie?.regimeCotisations?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointNonSalarie.regimeCotisations') ? 'validation-failed' : ''}" title="<g:message code="myr.property.regimeCotisations.validationError" />"   />
            

    
    </fieldset>
  

  
    <fieldset class="required condition-estDemandeurEmploiConjoint-filled">
    <legend><g:message code="myr.property.situationProfessionnelleConjointDemandeurEmploi.label" /></legend>
    
      <label class="required"><g:message code="myr.property.demandeurEmploiDepuisLe.label" /> *  <span><g:message code="myr.property.demandeurEmploiDepuisLe.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointDemandeurEmploi.demandeurEmploiDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointDemandeurEmploi.demandeurEmploiDepuisLe_day"
                name="situationProfessionnelleConjointDemandeurEmploi.demandeurEmploiDepuisLe_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleConjointDemandeurEmploi?.demandeurEmploiDepuisLe?.date == it
                      || (rqt.situationProfessionnelleConjointDemandeurEmploi?.demandeurEmploiDepuisLe == null && params['situationProfessionnelleConjointDemandeurEmploi.demandeurEmploiDepuisLe_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointDemandeurEmploi.demandeurEmploiDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointDemandeurEmploi.demandeurEmploiDepuisLe_month"
                name="situationProfessionnelleConjointDemandeurEmploi.demandeurEmploiDepuisLe_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleConjointDemandeurEmploi?.demandeurEmploiDepuisLe?.month == (it - 1)
                      || (rqt.situationProfessionnelleConjointDemandeurEmploi?.demandeurEmploiDepuisLe == null && params['situationProfessionnelleConjointDemandeurEmploi.demandeurEmploiDepuisLe_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointDemandeurEmploi.demandeurEmploiDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointDemandeurEmploi.demandeurEmploiDepuisLe_year"
                name="situationProfessionnelleConjointDemandeurEmploi.demandeurEmploiDepuisLe_year"
                value="${rqt.situationProfessionnelleConjointDemandeurEmploi?.demandeurEmploiDepuisLe ? rqt.situationProfessionnelleConjointDemandeurEmploi?.demandeurEmploiDepuisLe.year + 1900 : params['situationProfessionnelleConjointDemandeurEmploi.demandeurEmploiDepuisLe_year']}"
                title="<g:message code="myr.property.demandeurEmploiDepuisLe.validationError" />" />
            </div>
            

    
      <label class="required"><g:message code="myr.property.indemnisationDepuisLe.label" /> *  <span><g:message code="myr.property.indemnisationDepuisLe.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointDemandeurEmploi.indemnisationDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointDemandeurEmploi.indemnisationDepuisLe_day"
                name="situationProfessionnelleConjointDemandeurEmploi.indemnisationDepuisLe_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleConjointDemandeurEmploi?.indemnisationDepuisLe?.date == it
                      || (rqt.situationProfessionnelleConjointDemandeurEmploi?.indemnisationDepuisLe == null && params['situationProfessionnelleConjointDemandeurEmploi.indemnisationDepuisLe_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointDemandeurEmploi.indemnisationDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointDemandeurEmploi.indemnisationDepuisLe_month"
                name="situationProfessionnelleConjointDemandeurEmploi.indemnisationDepuisLe_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleConjointDemandeurEmploi?.indemnisationDepuisLe?.month == (it - 1)
                      || (rqt.situationProfessionnelleConjointDemandeurEmploi?.indemnisationDepuisLe == null && params['situationProfessionnelleConjointDemandeurEmploi.indemnisationDepuisLe_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointDemandeurEmploi.indemnisationDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointDemandeurEmploi.indemnisationDepuisLe_year"
                name="situationProfessionnelleConjointDemandeurEmploi.indemnisationDepuisLe_year"
                value="${rqt.situationProfessionnelleConjointDemandeurEmploi?.indemnisationDepuisLe ? rqt.situationProfessionnelleConjointDemandeurEmploi?.indemnisationDepuisLe.year + 1900 : params['situationProfessionnelleConjointDemandeurEmploi.indemnisationDepuisLe_year']}"
                title="<g:message code="myr.property.indemnisationDepuisLe.validationError" />" />
            </div>
            

    
      <label class="required"><g:message code="myr.property.allocationSolidariteSpecifique.label" /> *  <span><g:message code="myr.property.allocationSolidariteSpecifique.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointDemandeurEmploi.allocationSolidariteSpecifique') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="situationProfessionnelleConjointDemandeurEmploi.allocationSolidariteSpecifique_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="situationProfessionnelleConjointDemandeurEmploi.allocationSolidariteSpecifique" ${ rqt.situationProfessionnelleConjointDemandeurEmploi ?  (it == rqt.situationProfessionnelleConjointDemandeurEmploi?.allocationSolidariteSpecifique ? 'checked="checked"': '') : (it == null ? 'checked="checked"': '') } />
                <label for="situationProfessionnelleConjointDemandeurEmploi.allocationSolidariteSpecifique_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
    </fieldset>
  

  
    <fieldset class="required condition-estRetraiteConjoint-filled">
    <legend><g:message code="myr.property.situationProfessionnelleConjointRetraite.label" /></legend>
    
      <label class="required"><g:message code="myr.property.retraiteDepuisLe.label" /> *  <span><g:message code="myr.property.retraiteDepuisLe.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointRetraite.retraiteDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointRetraite.retraiteDepuisLe_day"
                name="situationProfessionnelleConjointRetraite.retraiteDepuisLe_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleConjointRetraite?.retraiteDepuisLe?.date == it
                      || (rqt.situationProfessionnelleConjointRetraite?.retraiteDepuisLe == null && params['situationProfessionnelleConjointRetraite.retraiteDepuisLe_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointRetraite.retraiteDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointRetraite.retraiteDepuisLe_month"
                name="situationProfessionnelleConjointRetraite.retraiteDepuisLe_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleConjointRetraite?.retraiteDepuisLe?.month == (it - 1)
                      || (rqt.situationProfessionnelleConjointRetraite?.retraiteDepuisLe == null && params['situationProfessionnelleConjointRetraite.retraiteDepuisLe_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointRetraite.retraiteDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointRetraite.retraiteDepuisLe_year"
                name="situationProfessionnelleConjointRetraite.retraiteDepuisLe_year"
                value="${rqt.situationProfessionnelleConjointRetraite?.retraiteDepuisLe ? rqt.situationProfessionnelleConjointRetraite?.retraiteDepuisLe.year + 1900 : params['situationProfessionnelleConjointRetraite.retraiteDepuisLe_year']}"
                title="<g:message code="myr.property.retraiteDepuisLe.validationError" />" />
            </div>
            

    
      <label class="required"><g:message code="myr.property.supplementairePersonneAgee.label" /> *  <span><g:message code="myr.property.supplementairePersonneAgee.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointRetraite.supplementairePersonneAgee') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="situationProfessionnelleConjointRetraite.supplementairePersonneAgee_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="situationProfessionnelleConjointRetraite.supplementairePersonneAgee" ${ rqt.situationProfessionnelleConjointRetraite ?  (it == rqt.situationProfessionnelleConjointRetraite?.supplementairePersonneAgee ? 'checked="checked"': '') : (it == null ? 'checked="checked"': '') } />
                <label for="situationProfessionnelleConjointRetraite.supplementairePersonneAgee_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label class="required"><g:message code="myr.property.pensionRetraite.label" /> *  <span><g:message code="myr.property.pensionRetraite.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointRetraite.pensionRetraite') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="situationProfessionnelleConjointRetraite.pensionRetraite_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="situationProfessionnelleConjointRetraite.pensionRetraite" ${ rqt.situationProfessionnelleConjointRetraite ?  (it == rqt.situationProfessionnelleConjointRetraite?.pensionRetraite ? 'checked="checked"': '') : (it == null ? 'checked="checked"': '') } />
                <label for="situationProfessionnelleConjointRetraite.pensionRetraite_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
    </fieldset>
  

  
    <fieldset class="required condition-estBeneficiairePensionConjoint-filled">
    <legend><g:message code="myr.property.situationProfessionnelleConjointBeneficiairePension.label" /></legend>
    
      <label class="required"><g:message code="myr.property.beneficiairePensionDepuisLe.label" /> *  <span><g:message code="myr.property.beneficiairePensionDepuisLe.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointBeneficiairePension.beneficiairePensionDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointBeneficiairePension.beneficiairePensionDepuisLe_day"
                name="situationProfessionnelleConjointBeneficiairePension.beneficiairePensionDepuisLe_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleConjointBeneficiairePension?.beneficiairePensionDepuisLe?.date == it
                      || (rqt.situationProfessionnelleConjointBeneficiairePension?.beneficiairePensionDepuisLe == null && params['situationProfessionnelleConjointBeneficiairePension.beneficiairePensionDepuisLe_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointBeneficiairePension.beneficiairePensionDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointBeneficiairePension.beneficiairePensionDepuisLe_month"
                name="situationProfessionnelleConjointBeneficiairePension.beneficiairePensionDepuisLe_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleConjointBeneficiairePension?.beneficiairePensionDepuisLe?.month == (it - 1)
                      || (rqt.situationProfessionnelleConjointBeneficiairePension?.beneficiairePensionDepuisLe == null && params['situationProfessionnelleConjointBeneficiairePension.beneficiairePensionDepuisLe_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointBeneficiairePension.beneficiairePensionDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointBeneficiairePension.beneficiairePensionDepuisLe_year"
                name="situationProfessionnelleConjointBeneficiairePension.beneficiairePensionDepuisLe_year"
                value="${rqt.situationProfessionnelleConjointBeneficiairePension?.beneficiairePensionDepuisLe ? rqt.situationProfessionnelleConjointBeneficiairePension?.beneficiairePensionDepuisLe.year + 1900 : params['situationProfessionnelleConjointBeneficiairePension.beneficiairePensionDepuisLe_year']}"
                title="<g:message code="myr.property.beneficiairePensionDepuisLe.validationError" />" />
            </div>
            

    
      <label for="situationProfessionnelleConjointBeneficiairePension.categoriePensionInvalidite" class="required"><g:message code="myr.property.categoriePensionInvalidite.label" /> *  <span><g:message code="myr.property.categoriePensionInvalidite.help" /></span></label>
            <select id="situationProfessionnelleConjointBeneficiairePension.categoriePensionInvalidite" name="situationProfessionnelleConjointBeneficiairePension.categoriePensionInvalidite" class="required  validate-not-first ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointBeneficiairePension.categoriePensionInvalidite') ? 'validation-failed' : ''}" title="<g:message code="myr.property.categoriePensionInvalidite.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['UN','DEUX','TROIS']}">
                <option value="${it}" ${it == rqt.situationProfessionnelleConjointBeneficiairePension?.categoriePensionInvalidite?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="myr.property.categoriePensionInvalidite" /></option>
              </g:each>
            </select>
            

    
      <label class="required"><g:message code="myr.property.renteAccidentTravail.label" /> *  <span><g:message code="myr.property.renteAccidentTravail.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointBeneficiairePension.renteAccidentTravail') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="situationProfessionnelleConjointBeneficiairePension.renteAccidentTravail_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="situationProfessionnelleConjointBeneficiairePension.renteAccidentTravail" ${ rqt.situationProfessionnelleConjointBeneficiairePension ?  (it == rqt.situationProfessionnelleConjointBeneficiairePension?.renteAccidentTravail ? 'checked="checked"': '') : (it == null ? 'checked="checked"': '') } />
                <label for="situationProfessionnelleConjointBeneficiairePension.renteAccidentTravail_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label class="required"><g:message code="myr.property.allocationSupplementaireInvalidite.label" /> *  <span><g:message code="myr.property.allocationSupplementaireInvalidite.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointBeneficiairePension.allocationSupplementaireInvalidite') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="situationProfessionnelleConjointBeneficiairePension.allocationSupplementaireInvalidite_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="situationProfessionnelleConjointBeneficiairePension.allocationSupplementaireInvalidite" ${ rqt.situationProfessionnelleConjointBeneficiairePension ?  (it == rqt.situationProfessionnelleConjointBeneficiairePension?.allocationSupplementaireInvalidite ? 'checked="checked"': '') : (it == null ? 'checked="checked"': '') } />
                <label for="situationProfessionnelleConjointBeneficiairePension.allocationSupplementaireInvalidite_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
    </fieldset>
  

  
    <fieldset class="required condition-estAutreConjoint-filled">
    <legend><g:message code="myr.property.situationProfessionnelleConjointAutre.label" /></legend>
    
      <label class="required"><g:message code="myr.property.autreDepuisLe.label" /> *  <span><g:message code="myr.property.autreDepuisLe.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointAutre.autreDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointAutre.autreDepuisLe_day"
                name="situationProfessionnelleConjointAutre.autreDepuisLe_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleConjointAutre?.autreDepuisLe?.date == it
                      || (rqt.situationProfessionnelleConjointAutre?.autreDepuisLe == null && params['situationProfessionnelleConjointAutre.autreDepuisLe_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointAutre.autreDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointAutre.autreDepuisLe_month"
                name="situationProfessionnelleConjointAutre.autreDepuisLe_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.situationProfessionnelleConjointAutre?.autreDepuisLe?.month == (it - 1)
                      || (rqt.situationProfessionnelleConjointAutre?.autreDepuisLe == null && params['situationProfessionnelleConjointAutre.autreDepuisLe_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointAutre.autreDepuisLe') ? 'validation-failed' : ''}"
                id="situationProfessionnelleConjointAutre.autreDepuisLe_year"
                name="situationProfessionnelleConjointAutre.autreDepuisLe_year"
                value="${rqt.situationProfessionnelleConjointAutre?.autreDepuisLe ? rqt.situationProfessionnelleConjointAutre?.autreDepuisLe.year + 1900 : params['situationProfessionnelleConjointAutre.autreDepuisLe_year']}"
                title="<g:message code="myr.property.autreDepuisLe.validationError" />" />
            </div>
            

    
      <label for="situationProfessionnelleConjointAutre.precisionAutreSituationProfessionnelle" class="required"><g:message code="myr.property.precisionAutreSituationProfessionnelle.label" /> *  <span><g:message code="myr.property.precisionAutreSituationProfessionnelle.help" /></span></label>
            <input type="text" id="situationProfessionnelleConjointAutre.precisionAutreSituationProfessionnelle" name="situationProfessionnelleConjointAutre.precisionAutreSituationProfessionnelle" value="${rqt.situationProfessionnelleConjointAutre?.precisionAutreSituationProfessionnelle?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['situationProfessionnelle'].invalidFields.contains('situationProfessionnelleConjointAutre.precisionAutreSituationProfessionnelle') ? 'validation-failed' : ''}" title="<g:message code="myr.property.precisionAutreSituationProfessionnelle.validationError" />"   />
            

    
    </fieldset>
  

