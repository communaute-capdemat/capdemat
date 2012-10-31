


  
    <label class="required"><g:message code="myr.property.enfantEnInternat.label" /> *  <span><g:message code="myr.property.enfantEnInternat.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['allocationEducationEnfantHandicape'].invalidFields.contains('enfantEnInternat') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="enfantEnInternat_${it ? 'yes' : 'no'}" class="required condition-enfantEnInternat-trigger  validate-one-required boolean" title="" value="${it}" name="enfantEnInternat" ${ rq ?  (it == rqt.enfantEnInternat ? 'checked="checked"': '') : (it == false ? 'checked="checked"': '') } />
                <label for="enfantEnInternat_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

  

  
    <label class="required condition-enfantEnInternat-filled"><g:message code="myr.property.enInternatDepuisLe.label" /> *  <span><g:message code="myr.property.enInternatDepuisLe.help" /></span></label>
            <div class="date required condition-enfantEnInternat-filled  validate-date required condition-enfantEnInternat-filled ">
              <select class="day ${rqt.stepStates['allocationEducationEnfantHandicape'].invalidFields.contains('enInternatDepuisLe') ? 'validation-failed' : ''}"
                id="enInternatDepuisLe_day"
                name="enInternatDepuisLe_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.enInternatDepuisLe?.date == it
                      || (rqt.enInternatDepuisLe == null && params['enInternatDepuisLe_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['allocationEducationEnfantHandicape'].invalidFields.contains('enInternatDepuisLe') ? 'validation-failed' : ''}"
                id="enInternatDepuisLe_month"
                name="enInternatDepuisLe_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.enInternatDepuisLe?.month == (it - 1)
                      || (rqt.enInternatDepuisLe == null && params['enInternatDepuisLe_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['allocationEducationEnfantHandicape'].invalidFields.contains('enInternatDepuisLe') ? 'validation-failed' : ''}"
                id="enInternatDepuisLe_year"
                name="enInternatDepuisLe_year"
                value="${rqt.enInternatDepuisLe ? rqt.enInternatDepuisLe.year + 1900 : params['enInternatDepuisLe_year']}"
                title="<g:message code="myr.property.enInternatDepuisLe.validationError" />" />
            </div>
            

  

  
    <label class="required condition-enfantEnInternat-filled"><g:message code="myr.property.fraisSejourPrisEnCharge.label" /> *  <span><g:message code="myr.property.fraisSejourPrisEnCharge.help" /></span></label>
            <ul class="yes-no required condition-enfantEnInternat-filled ${rqt.stepStates['allocationEducationEnfantHandicape'].invalidFields.contains('fraisSejourPrisEnCharge') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="fraisSejourPrisEnCharge_${it ? 'yes' : 'no'}" class="required condition-enfantEnInternat-filled  validate-one-required boolean" title="" value="${it}" name="fraisSejourPrisEnCharge" ${ rq ?  (it == rqt.fraisSejourPrisEnCharge ? 'checked="checked"': '') : (it == false ? 'checked="checked"': '') } />
                <label for="fraisSejourPrisEnCharge_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

  

  
    <label for="typeAccueil" class="required"><g:message code="myr.property.typeAccueil.label" /> *  <span><g:message code="myr.property.typeAccueil.help" /></span></label>
            <input type="text" id="typeAccueil" name="typeAccueil" value="${rqt.typeAccueil?.toString()}" 
                    class="required  validate-regex ${rqt.stepStates['allocationEducationEnfantHandicape'].invalidFields.contains('typeAccueil') ? 'validation-failed' : ''}" title="<g:message code="myr.property.typeAccueil.validationError" />" regex="^.{0,1024}$" maxlength="1024" />
            

  

  
    <label for="typeScolarisation" class="required"><g:message code="myr.property.typeScolarisation.label" /> *  <span><g:message code="myr.property.typeScolarisation.help" /></span></label>
            <input type="text" id="typeScolarisation" name="typeScolarisation" value="${rqt.typeScolarisation?.toString()}" 
                    class="required  validate-regex ${rqt.stepStates['allocationEducationEnfantHandicape'].invalidFields.contains('typeScolarisation') ? 'validation-failed' : ''}" title="<g:message code="myr.property.typeScolarisation.validationError" />" regex="^.{0,1024}$" maxlength="1024" />
            

  

  
    <fieldset class="">
    <legend><g:message code="myr.property.presencePersonneAupresEnfant.label" /></legend>
    
      <label class="required"><g:message code="myr.property.exerciceActiviteProfessionnelle.label" /> *  <span><g:message code="myr.property.exerciceActiviteProfessionnelle.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['allocationEducationEnfantHandicape'].invalidFields.contains('presencePersonneAupresEnfant.exerciceActiviteProfessionnelle') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="presencePersonneAupresEnfant.exerciceActiviteProfessionnelle_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="presencePersonneAupresEnfant.exerciceActiviteProfessionnelle" ${ rqt.presencePersonneAupresEnfant ?  (it == rqt.presencePersonneAupresEnfant?.exerciceActiviteProfessionnelle ? 'checked="checked"': '') : (it == false ? 'checked="checked"': '') } />
                <label for="presencePersonneAupresEnfant.exerciceActiviteProfessionnelle_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label for="presencePersonneAupresEnfant.recoursEmploiRemunereTiercePersonne" class=""><g:message code="myr.property.recoursEmploiRemunereTiercePersonne.label" />   <span><g:message code="myr.property.recoursEmploiRemunereTiercePersonne.help" /></span></label>
            <input type="text" id="presencePersonneAupresEnfant.recoursEmploiRemunereTiercePersonne" name="presencePersonneAupresEnfant.recoursEmploiRemunereTiercePersonne" value="${rqt.presencePersonneAupresEnfant?.recoursEmploiRemunereTiercePersonne?.toString()}" 
                    class="  validate-regex ${rqt.stepStates['allocationEducationEnfantHandicape'].invalidFields.contains('presencePersonneAupresEnfant.recoursEmploiRemunereTiercePersonne') ? 'validation-failed' : ''}" title="<g:message code="myr.property.recoursEmploiRemunereTiercePersonne.validationError" />" regex="[0-9]{0,3}" maxlength="3" />
            

    
      <label for="presencePersonneAupresEnfant.nbHeureParAnEmploiNonRegulier" class=""><g:message code="myr.property.nbHeureParAnEmploiNonRegulier.label" />   <span><g:message code="myr.property.nbHeureParAnEmploiNonRegulier.help" /></span></label>
            <input type="text" id="presencePersonneAupresEnfant.nbHeureParAnEmploiNonRegulier" name="presencePersonneAupresEnfant.nbHeureParAnEmploiNonRegulier" value="${rqt.presencePersonneAupresEnfant?.nbHeureParAnEmploiNonRegulier?.toString()}" 
                    class="  validate-regex ${rqt.stepStates['allocationEducationEnfantHandicape'].invalidFields.contains('presencePersonneAupresEnfant.nbHeureParAnEmploiNonRegulier') ? 'validation-failed' : ''}" title="<g:message code="myr.property.nbHeureParAnEmploiNonRegulier.validationError" />" regex="[0-9]{0,3}" maxlength="3" />
            

    
    </fieldset>
  

  
    <div class="collection  summary-box">
      <h4 class=""><g:message code="myr.property.fraisSuppLiesHandicap.label" /> 
        <span><g:message code="myr.property.fraisSuppLiesHandicap.help" /></span>
      </h4>
      <p>
        <g:message code="request.message.howToAddCollectionItem" />
        <a href="${createLink(controller : 'frontofficeRequest', action : 'edit', params:['id':rqt.id, 'currentStep':'allocationEducationEnfantHandicape', 'currentCollection':'fraisSuppLiesHandicap', 'collectionIndex':(rqt.fraisSuppLiesHandicap ? rqt.fraisSuppLiesHandicap.size() : 0)])}" style="font-size:1.3em;" />
          ${message(code:'request.action.newCollectionItem')}
        </a>
      </p>
    <g:each var="it" in="${rqt.fraisSuppLiesHandicap}" status="index">
      <div class="item">
        <dl>
        <dt class="head"><g:message code="myr.property.fraisSuppLiesHandicap.label" /> : ${index + 1}</dt>
        <dd class="head">
          <a href="${createLink(controller : 'frontofficeRequest', action : 'edit', params:['id':rqt.id, 'currentStep':'allocationEducationEnfantHandicape', 'currentCollection':'fraisSuppLiesHandicap', 'collectionIndex':index])}">
           ${message(code:'request.action.editCollectionItem')}
         </a>&nbsp;
         <a href="${createLink(controller : 'frontofficeRequest', action : 'collectionRemove', params:['id':rqt.id, 'currentStep':'allocationEducationEnfantHandicape', 'currentCollection':'fraisSuppLiesHandicap', 'collectionIndex':index])}">
           ${message(code:'request.action.deleteCollectionItem')}
         </a>
        </dd>
    
        <dt><g:message code="myr.property.natureFrais.label" /></dt>
        <dd class="${rqt.stepStates['allocationEducationEnfantHandicape'].invalidFields.contains('fraisSuppLiesHandicap[' + index + '].natureFrais') ? 'validation-failed' : ''}">${it.natureFrais?.toString()}</dd>
    
        <dt><g:message code="myr.property.financeursSollicites.label" /></dt>
        <dd class="${rqt.stepStates['allocationEducationEnfantHandicape'].invalidFields.contains('fraisSuppLiesHandicap[' + index + '].financeursSollicites') ? 'validation-failed' : ''}">${it.financeursSollicites?.toString()}</dd>
    
        <dt><g:message code="myr.property.montantsObtenus.label" /></dt>
        <dd class="${rqt.stepStates['allocationEducationEnfantHandicape'].invalidFields.contains('fraisSuppLiesHandicap[' + index + '].montantsObtenus') ? 'validation-failed' : ''}">${it.montantsObtenus?.toString()}</dd>
    
        <dt><g:message code="myr.property.resteAVotreCharge.label" /></dt>
        <dd class="${rqt.stepStates['allocationEducationEnfantHandicape'].invalidFields.contains('fraisSuppLiesHandicap[' + index + '].resteAVotreCharge') ? 'validation-failed' : ''}">${it.resteAVotreCharge?.toString()}</dd>
    
        <dt><g:message code="myr.property.periodicite.label" /></dt>
        
              <dd class="${rqt.stepStates['allocationEducationEnfantHandicape'].invalidFields.contains('fraisSuppLiesHandicap[' + index + '].periodicite') ? 'validation-failed' : ''}">
                <g:if test="${it.periodicite}">
                  <g:capdematEnumToField var="${it.periodicite}" i18nKeyPrefix="myr.property.periodicite" />
                </g:if>
              </dd>
              
    
        </dl>
      </div>
    </g:each>
    </div>
  

