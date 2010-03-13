


  
    
            <label for="subjectId" class="required">
              <g:message code="dccrr.property.subject.label" /> *
              <span><g:message code="request.property.subject.help" /></span>
              <g:if test="${rqt.stepStates[currentStep].state != 'complete'}">
                <g:if test="${!fr.cg95.cvq.service.request.IRequestWorkflowService.SUBJECT_POLICY_NONE.equals(subjectPolicy)}">
                  <g:if test="${fr.cg95.cvq.service.request.IRequestWorkflowService.SUBJECT_POLICY_ADULT.equals(subjectPolicy)}">
                    <span>(<a id="addSubjectLink" href="${createLink(controller : 'frontofficeRequest', action : 'individual', params : ['type' : 'adult', 'requestId' : rqt.id])}"><g:message code="homeFolder.action.addSubject" /></a>)</span>
                  </g:if>
                  <g:elseif test="${fr.cg95.cvq.service.request.IRequestWorkflowService.SUBJECT_POLICY_CHILD.equals(subjectPolicy)}">
                    <span>(<a id="addSubjectLink" href="${createLink(controller : 'frontofficeRequest', action : 'individual', params : ['type' : 'child', 'requestId' : rqt.id])}"><g:message code="homeFolder.action.addSubject" /></a>)</span>
                  </g:elseif>
                  <g:elseif test="${fr.cg95.cvq.service.request.IRequestWorkflowService.SUBJECT_POLICY_INDIVIDUAL.equals(subjectPolicy)}">
                    <span>(<a id="addAdultLink" href="${createLink(controller : 'frontofficeRequest', action : 'individual', params : ['type' : 'adult', 'requestId' : rqt.id])}"><g:message code="homeFolder.action.addAdult" /></a>
                    <g:message code="message.or" />
                    <a id="addChildLink" href="${createLink(controller : 'frontofficeRequest', action : 'individual', params : ['type' : 'child', 'requestId' : rqt.id])}"><g:message code="homeFolder.action.addChild" /></a>)</span>
                  </g:elseif>
                </g:if>
              </g:if>
            </label>
            <select id="subjectId" name="subjectId" <g:if test="${isEdition || rqt.stepStates[currentStep].state == 'complete'}">disabled="disabled"</g:if> class="required validate-not-first  ${rqt.stepStates['subject'].invalidFields.contains('subjectId') ? 'validation-failed' : ''}" title="<g:message code="request.property.subject.validationError" /> ">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${subjects}">
                <option value="${it.key}" ${it.key == rqt.subjectId ? 'selected="selected"': ''}>${it.value}</option>
              </g:each>
            </select>
            

  

  
    <fieldset class="required">
    <legend><g:message code="dccrr.property.informationMere.label" /></legend>
    
      <label for="informationMere.situationActuelleMere" class=""><g:message code="dccrr.property.situationActuelleMere.label" />   <span><g:message code="dccrr.property.situationActuelleMere.help" /></span></label>
            <select id="informationMere.situationActuelleMere" name="informationMere.situationActuelleMere" class="condition-estAutreSituationActuelleMere-trigger  validate-select ${rqt.stepStates['subject'].invalidFields.contains('informationMere.situationActuelleMere') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.situationActuelleMere.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['Plein','Partiel','Interim','Etudiant','Stage','Recherche','Parent','Libre','Conge','Retraite','Autre']}">
                <option value="fr.cg95.cvq.business.request.school.ChoixSituationActuelle_${it}" ${it == rqt.situationActuelleMere?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dccrr.property.situationActuelleMere" /></option>
              <g:each in="${['PLEIN','PARTIEL','INTERIM','ETUDIANT','STAGE','RECHERCHE','PARENT','LIBRE','CONGE','RETRAITE','AUTRE']}">
                <option value="${it}" ${it == rqt.situationActuelleMere?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dccrr.property.situationActuelleMere" /></option>
              <g:each in="${['Plein','Partiel','Interim','Etudiant','Stage','Recherche','Parent','Libre','Conge','Retraite','Autre']}">
                <option value="fr.cg95.cvq.business.request.school.ChoixSituationActuelle_${it}" ${it == rqt.informationMere?.situationActuelleMere?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dccrr.property.situationActuelleMere" /></option>
              </g:each>
            </select>
            

    
      <label for="informationMere.precisionAutreSituationActuelleMere" class="required condition-estAutreSituationActuelleMere-filled"><g:message code="dccrr.property.precisionAutreSituationActuelleMere.label" /> *  <span><g:message code="dccrr.property.precisionAutreSituationActuelleMere.help" /></span></label>
            <input type="text" id="informationMere.precisionAutreSituationActuelleMere" name="informationMere.precisionAutreSituationActuelleMere" value="${rqt.informationMere?.precisionAutreSituationActuelleMere?.toString()}" 
                    class="required condition-estAutreSituationActuelleMere-filled  validate-string ${rqt.stepStates['subject'].invalidFields.contains('informationMere.precisionAutreSituationActuelleMere') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.precisionAutreSituationActuelleMere.validationError" />"   />
            

    
      <label for="informationMere.professionMere" class=""><g:message code="dccrr.property.professionMere.label" />   <span><g:message code="dccrr.property.professionMere.help" /></span></label>
            <input type="text" id="informationMere.professionMere" name="informationMere.professionMere" value="${rqt.informationMere?.professionMere?.toString()}" 
                    class="  validate-string ${rqt.stepStates['subject'].invalidFields.contains('informationMere.professionMere') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.professionMere.validationError" />"   />
            

    
      <label class=""><g:message code="dccrr.property.estHorairesReguliersMere.label" />   <span><g:message code="dccrr.property.estHorairesReguliersMere.help" /></span></label>
            <ul class="yes-no  ${rqt.stepStates['subject'].invalidFields.contains('informationMere.estHorairesReguliersMere') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="informationMere.estHorairesReguliersMere_${it ? 'yes' : 'no'}" class="condition-estHorairesReguliersMere-trigger  validate-one-required boolean" title="" value="${it}" name="informationMere.estHorairesReguliersMere" ${it == rqt.informationMere?.estHorairesReguliersMere ? 'checked="checked"': ''} />
                <label for="informationMere.estHorairesReguliersMere_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label for="informationMere.horairesReguliersMere" class="condition-estHorairesReguliersMere-filled"><g:message code="dccrr.property.horairesReguliersMere.label" />   <span><g:message code="dccrr.property.horairesReguliersMere.help" /></span></label>
            <input type="text" id="informationMere.horairesReguliersMere" name="informationMere.horairesReguliersMere" value="${rqt.informationMere?.horairesReguliersMere?.toString()}" 
                    class="condition-estHorairesReguliersMere-filled  validate-string ${rqt.stepStates['subject'].invalidFields.contains('informationMere.horairesReguliersMere') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.horairesReguliersMere.validationError" />"   />
            

    
      <label for="informationMere.horairesTravailLundiMere" class="condition-estHorairesReguliersMere-unfilled"><g:message code="dccrr.property.horairesTravailLundiMere.label" />   <span><g:message code="dccrr.property.horairesTravailLundiMere.help" /></span></label>
            <input type="text" id="informationMere.horairesTravailLundiMere" name="informationMere.horairesTravailLundiMere" value="${rqt.informationMere?.horairesTravailLundiMere?.toString()}" 
                    class="condition-estHorairesReguliersMere-unfilled  validate-string ${rqt.stepStates['subject'].invalidFields.contains('informationMere.horairesTravailLundiMere') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.horairesTravailLundiMere.validationError" />"   />
            

    
      <label for="informationMere.horairesTravailMardiMere" class="condition-estHorairesReguliersMere-unfilled"><g:message code="dccrr.property.horairesTravailMardiMere.label" />   <span><g:message code="dccrr.property.horairesTravailMardiMere.help" /></span></label>
            <input type="text" id="informationMere.horairesTravailMardiMere" name="informationMere.horairesTravailMardiMere" value="${rqt.informationMere?.horairesTravailMardiMere?.toString()}" 
                    class="condition-estHorairesReguliersMere-unfilled  validate-string ${rqt.stepStates['subject'].invalidFields.contains('informationMere.horairesTravailMardiMere') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.horairesTravailMardiMere.validationError" />"   />
            

    
      <label for="informationMere.horairesTravailMercrediMere" class="condition-estHorairesReguliersMere-unfilled"><g:message code="dccrr.property.horairesTravailMercrediMere.label" />   <span><g:message code="dccrr.property.horairesTravailMercrediMere.help" /></span></label>
            <input type="text" id="informationMere.horairesTravailMercrediMere" name="informationMere.horairesTravailMercrediMere" value="${rqt.informationMere?.horairesTravailMercrediMere?.toString()}" 
                    class="condition-estHorairesReguliersMere-unfilled  validate-string ${rqt.stepStates['subject'].invalidFields.contains('informationMere.horairesTravailMercrediMere') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.horairesTravailMercrediMere.validationError" />"   />
            

    
      <label for="informationMere.horairesTravailJeudiMere" class="condition-estHorairesReguliersMere-unfilled"><g:message code="dccrr.property.horairesTravailJeudiMere.label" />   <span><g:message code="dccrr.property.horairesTravailJeudiMere.help" /></span></label>
            <input type="text" id="informationMere.horairesTravailJeudiMere" name="informationMere.horairesTravailJeudiMere" value="${rqt.informationMere?.horairesTravailJeudiMere?.toString()}" 
                    class="condition-estHorairesReguliersMere-unfilled  validate-string ${rqt.stepStates['subject'].invalidFields.contains('informationMere.horairesTravailJeudiMere') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.horairesTravailJeudiMere.validationError" />"   />
            

    
      <label for="informationMere.horairesTravailVendrediMere" class="condition-estHorairesReguliersMere-unfilled"><g:message code="dccrr.property.horairesTravailVendrediMere.label" />   <span><g:message code="dccrr.property.horairesTravailVendrediMere.help" /></span></label>
            <input type="text" id="informationMere.horairesTravailVendrediMere" name="informationMere.horairesTravailVendrediMere" value="${rqt.informationMere?.horairesTravailVendrediMere?.toString()}" 
                    class="condition-estHorairesReguliersMere-unfilled  validate-string ${rqt.stepStates['subject'].invalidFields.contains('informationMere.horairesTravailVendrediMere') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.horairesTravailVendrediMere.validationError" />"   />
            

    
      <label for="informationMere.communeLieuTravailMere" class=""><g:message code="dccrr.property.communeLieuTravailMere.label" />   <span><g:message code="dccrr.property.communeLieuTravailMere.help" /></span></label>
            <input type="text" id="informationMere.communeLieuTravailMere" name="informationMere.communeLieuTravailMere" value="${rqt.informationMere?.communeLieuTravailMere?.toString()}" 
                    class="  validate-string ${rqt.stepStates['subject'].invalidFields.contains('informationMere.communeLieuTravailMere') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.communeLieuTravailMere.validationError" />"   />
            

    
    </fieldset>
  

  
    <fieldset class="">
    <legend><g:message code="dccrr.property.informationPere.label" /></legend>
    
      <label for="informationPere.situationActuellePere" class=""><g:message code="dccrr.property.situationActuellePere.label" />   <span><g:message code="dccrr.property.situationActuellePere.help" /></span></label>
            <select id="informationPere.situationActuellePere" name="informationPere.situationActuellePere" class="condition-estAutreSituationActuellePere-trigger  validate-select ${rqt.stepStates['subject'].invalidFields.contains('informationPere.situationActuellePere') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.situationActuellePere.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['Plein','Partiel','Interim','Etudiant','Stage','Recherche','Parent','Libre','Conge','Retraite','Autre']}">
                <option value="fr.cg95.cvq.business.request.school.ChoixSituationActuelle_${it}" ${it == rqt.situationActuellePere?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dccrr.property.situationActuellePere" /></option>
              <g:each in="${['PLEIN','PARTIEL','INTERIM','ETUDIANT','STAGE','RECHERCHE','PARENT','LIBRE','CONGE','RETRAITE','AUTRE']}">
                <option value="${it}" ${it == rqt.situationActuellePere?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dccrr.property.situationActuellePere" /></option>
              <g:each in="${['Plein','Partiel','Interim','Etudiant','Stage','Recherche','Parent','Libre','Conge','Retraite','Autre']}">
                <option value="fr.cg95.cvq.business.request.school.ChoixSituationActuelle_${it}" ${it == rqt.informationPere?.situationActuellePere?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="dccrr.property.situationActuellePere" /></option>
              </g:each>
            </select>
            

    
      <label for="informationPere.precisionAutreSituationActuellePere" class="required condition-estAutreSituationActuellePere-filled"><g:message code="dccrr.property.precisionAutreSituationActuellePere.label" /> *  <span><g:message code="dccrr.property.precisionAutreSituationActuellePere.help" /></span></label>
            <input type="text" id="informationPere.precisionAutreSituationActuellePere" name="informationPere.precisionAutreSituationActuellePere" value="${rqt.informationPere?.precisionAutreSituationActuellePere?.toString()}" 
                    class="required condition-estAutreSituationActuellePere-filled  validate-string ${rqt.stepStates['subject'].invalidFields.contains('informationPere.precisionAutreSituationActuellePere') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.precisionAutreSituationActuellePere.validationError" />"   />
            

    
      <label for="informationPere.professionPere" class=""><g:message code="dccrr.property.professionPere.label" />   <span><g:message code="dccrr.property.professionPere.help" /></span></label>
            <input type="text" id="informationPere.professionPere" name="informationPere.professionPere" value="${rqt.informationPere?.professionPere?.toString()}" 
                    class="  validate-string ${rqt.stepStates['subject'].invalidFields.contains('informationPere.professionPere') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.professionPere.validationError" />"   />
            

    
      <label class=""><g:message code="dccrr.property.estHorairesReguliersPere.label" />   <span><g:message code="dccrr.property.estHorairesReguliersPere.help" /></span></label>
            <ul class="yes-no  ${rqt.stepStates['subject'].invalidFields.contains('informationPere.estHorairesReguliersPere') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="informationPere.estHorairesReguliersPere_${it ? 'yes' : 'no'}" class="condition-estHorairesReguliersPere-trigger  validate-one-required boolean" title="" value="${it}" name="informationPere.estHorairesReguliersPere" ${it == rqt.informationPere?.estHorairesReguliersPere ? 'checked="checked"': ''} />
                <label for="informationPere.estHorairesReguliersPere_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label for="informationPere.horairesReguliersPere" class="condition-estHorairesReguliersPere-filled"><g:message code="dccrr.property.horairesReguliersPere.label" />   <span><g:message code="dccrr.property.horairesReguliersPere.help" /></span></label>
            <input type="text" id="informationPere.horairesReguliersPere" name="informationPere.horairesReguliersPere" value="${rqt.informationPere?.horairesReguliersPere?.toString()}" 
                    class="condition-estHorairesReguliersPere-filled  validate-string ${rqt.stepStates['subject'].invalidFields.contains('informationPere.horairesReguliersPere') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.horairesReguliersPere.validationError" />"   />
            

    
      <label for="informationPere.horairesTravailLundiPere" class="condition-estHorairesReguliersPere-unfilled"><g:message code="dccrr.property.horairesTravailLundiPere.label" />   <span><g:message code="dccrr.property.horairesTravailLundiPere.help" /></span></label>
            <input type="text" id="informationPere.horairesTravailLundiPere" name="informationPere.horairesTravailLundiPere" value="${rqt.informationPere?.horairesTravailLundiPere?.toString()}" 
                    class="condition-estHorairesReguliersPere-unfilled  validate-string ${rqt.stepStates['subject'].invalidFields.contains('informationPere.horairesTravailLundiPere') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.horairesTravailLundiPere.validationError" />"   />
            

    
      <label for="informationPere.horairesTravailMardiPere" class="condition-estHorairesReguliersPere-unfilled"><g:message code="dccrr.property.horairesTravailMardiPere.label" />   <span><g:message code="dccrr.property.horairesTravailMardiPere.help" /></span></label>
            <input type="text" id="informationPere.horairesTravailMardiPere" name="informationPere.horairesTravailMardiPere" value="${rqt.informationPere?.horairesTravailMardiPere?.toString()}" 
                    class="condition-estHorairesReguliersPere-unfilled  validate-string ${rqt.stepStates['subject'].invalidFields.contains('informationPere.horairesTravailMardiPere') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.horairesTravailMardiPere.validationError" />"   />
            

    
      <label for="informationPere.horairesTravailMercrediPere" class="condition-estHorairesReguliersPere-unfilled"><g:message code="dccrr.property.horairesTravailMercrediPere.label" />   <span><g:message code="dccrr.property.horairesTravailMercrediPere.help" /></span></label>
            <input type="text" id="informationPere.horairesTravailMercrediPere" name="informationPere.horairesTravailMercrediPere" value="${rqt.informationPere?.horairesTravailMercrediPere?.toString()}" 
                    class="condition-estHorairesReguliersPere-unfilled  validate-string ${rqt.stepStates['subject'].invalidFields.contains('informationPere.horairesTravailMercrediPere') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.horairesTravailMercrediPere.validationError" />"   />
            

    
      <label for="informationPere.horairesTravailJeudiPere" class="condition-estHorairesReguliersPere-unfilled"><g:message code="dccrr.property.horairesTravailJeudiPere.label" />   <span><g:message code="dccrr.property.horairesTravailJeudiPere.help" /></span></label>
            <input type="text" id="informationPere.horairesTravailJeudiPere" name="informationPere.horairesTravailJeudiPere" value="${rqt.informationPere?.horairesTravailJeudiPere?.toString()}" 
                    class="condition-estHorairesReguliersPere-unfilled  validate-string ${rqt.stepStates['subject'].invalidFields.contains('informationPere.horairesTravailJeudiPere') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.horairesTravailJeudiPere.validationError" />"   />
            

    
      <label for="informationPere.horairesTravailVendrediPere" class="condition-estHorairesReguliersPere-unfilled"><g:message code="dccrr.property.horairesTravailVendrediPere.label" />   <span><g:message code="dccrr.property.horairesTravailVendrediPere.help" /></span></label>
            <input type="text" id="informationPere.horairesTravailVendrediPere" name="informationPere.horairesTravailVendrediPere" value="${rqt.informationPere?.horairesTravailVendrediPere?.toString()}" 
                    class="condition-estHorairesReguliersPere-unfilled  validate-string ${rqt.stepStates['subject'].invalidFields.contains('informationPere.horairesTravailVendrediPere') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.horairesTravailVendrediPere.validationError" />"   />
            

    
      <label for="informationPere.communeLieuTravailPere" class=""><g:message code="dccrr.property.communeLieuTravailPere.label" />   <span><g:message code="dccrr.property.communeLieuTravailPere.help" /></span></label>
            <input type="text" id="informationPere.communeLieuTravailPere" name="informationPere.communeLieuTravailPere" value="${rqt.informationPere?.communeLieuTravailPere?.toString()}" 
                    class="  validate-string ${rqt.stepStates['subject'].invalidFields.contains('informationPere.communeLieuTravailPere') ? 'validation-failed' : ''}" title="<g:message code="dccrr.property.communeLieuTravailPere.validationError" />"   />
            

    
    </fieldset>
  

