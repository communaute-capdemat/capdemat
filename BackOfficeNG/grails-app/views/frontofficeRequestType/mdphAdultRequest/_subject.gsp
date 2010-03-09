


  
    
            <label for="subjectId" class="required">
              <g:message code="request.property.subject.label" /> *
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
            

  

  
    <label for="faxSujet" class=""><g:message code="mar.property.faxSujet.label" />   <span><g:message code="mar.property.faxSujet.help" /></span></label>
            <input type="text" id="faxSujet" name="faxSujet" value="${rqt.faxSujet?.toString()}" 
                    class="  validate-phone ${rqt.stepStates['subject'].invalidFields.contains('faxSujet') ? 'validation-failed' : ''}" title="<g:message code="mar.property.faxSujet.validationError" />"  maxlength="10" />
            

  

  
    <label for="nationalite" class="required"><g:message code="mar.property.nationalite.label" /> *  <span><g:message code="mar.property.nationalite.help" /></span></label>
            <select id="nationalite" name="nationalite" class="required  validate-not-first ${rqt.stepStates['subject'].invalidFields.contains('nationalite') ? 'validation-failed' : ''}" title="<g:message code="mar.property.nationalite.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['Francaise','Eeesuisse','Autre']}">
                <option value="fr.cg95.cvq.business.request.social.NationaliteAvecSuisseType_${it}" ${it == rqt.nationalite?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mar.property.nationalite" /></option>
              </g:each>
            </select>
            

  

  
    <label class="required"><g:message code="mar.property.dateNaissanceSujet.label" /> *  <span><g:message code="mar.property.dateNaissanceSujet.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['subject'].invalidFields.contains('dateNaissanceSujet') ? 'validation-failed' : ''}"
                id="dateNaissanceSujet_day"
                name="dateNaissanceSujet_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.dateNaissanceSujet?.date == it
                      || (rqt.dateNaissanceSujet == null && params['dateNaissanceSujet_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['subject'].invalidFields.contains('dateNaissanceSujet') ? 'validation-failed' : ''}"
                id="dateNaissanceSujet_month"
                name="dateNaissanceSujet_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.dateNaissanceSujet?.month == (it - 1)
                      || (rqt.dateNaissanceSujet == null && params['dateNaissanceSujet_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['subject'].invalidFields.contains('dateNaissanceSujet') ? 'validation-failed' : ''}"
                id="dateNaissanceSujet_year"
                name="dateNaissanceSujet_year"
                value="${rqt.dateNaissanceSujet ? rqt.dateNaissanceSujet.year + 1900 : params['dateNaissanceSujet_year']}"
                title="<g:message code="mar.property.dateNaissanceSujet.validationError" />" />
            </div>
            

  

  
    <fieldset class="required">
    <legend><g:message code="mar.property.lieuNaissanceSujet.label" /></legend>
    
      <label for="lieuNaissanceSujet.postalCode" class="required"><g:message code="mar.property.postalCode.label" /> *  <span><g:message code="mar.property.postalCode.help" /></span></label>
            <input type="text" id="lieuNaissanceSujet.postalCode" name="lieuNaissanceSujet.postalCode" value="${rqt.lieuNaissanceSujet?.postalCode?.toString()}" 
                    class="required  validate-postalCode ${rqt.stepStates['subject'].invalidFields.contains('lieuNaissanceSujet.postalCode') ? 'validation-failed' : ''}" title="<g:message code="mar.property.postalCode.validationError" />"  maxlength="5" />
            

    
      <label for="lieuNaissanceSujet.city" class="required"><g:message code="mar.property.city.label" /> *  <span><g:message code="mar.property.city.help" /></span></label>
            <input type="text" id="lieuNaissanceSujet.city" name="lieuNaissanceSujet.city" value="${rqt.lieuNaissanceSujet?.city?.toString()}" 
                    class="required  validate-city ${rqt.stepStates['subject'].invalidFields.contains('lieuNaissanceSujet.city') ? 'validation-failed' : ''}" title="<g:message code="mar.property.city.validationError" />"  maxlength="32" />
            

    
      <label for="lieuNaissanceSujet.country" class="required"><g:message code="mar.property.country.label" /> *  <span><g:message code="mar.property.country.help" /></span></label>
            <select id="lieuNaissanceSujet.country" name="lieuNaissanceSujet.country" class="required  validate-not-first ${rqt.stepStates['subject'].invalidFields.contains('lieuNaissanceSujet.country') ? 'validation-failed' : ''}" title="<g:message code="mar.property.country.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['Unknown','af','za','al','dz','de','ad','ao','ai','aq','ag','an','sa','ar','am','aw','au','at','az','bj','bs','bh','bd','bb','pw','be','bz','bm','bt','by','mm','bo','ba','bw','br','bn','bg','bf','bi','ci','kh','cm','ca','cv','cl','cn','cy','co','km','cg','kp','kr','cr','hr','cu','dk','dj','dm','eg','ae','ec','er','es','ee','us','et','fi','fr','ge','ga','gm','gh','gi','gr','gd','gl','gp','gu','gt','gn','gq','gw','gy','gf','ht','hn','hk','hu','ck','fj','mh','sb','in','id','ir','iq','ie','is','il','it','jm','jp','jo','kz','ke','kg','ki','kw','la','ls','lv','lb','lr','ly','li','lt','lu','mg','my','mw','mv','ml','mt','ma','mu','mr','mx','fm','md','mc','mn','mz','np','na','nr','ni','ne','ng','nu','no','nz','om','ug','uz','pe','pk','pa','pg','py','nl','ph','pl','pt','qa','cf','cd','do','cz','ro','gb','ru','rw','sn','kn','sm','va','vc','lc','sv','ws','st','sc','sl','sg','si','sk','so','sd','lk','se','ch','sr','sz','sy','tw','tj','tz','td','th','tl','tg','to','vt','tn','tm','tr','tv','ua','uy','vu','ve','vn','ye','zm','zw','mk']}">
                <option value="fr.cg95.cvq.business.users.CountryType_${it}" ${it == rqt.lieuNaissanceSujet?.country?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mar.property.country" /></option>
              </g:each>
            </select>
            

    
    </fieldset>
  

  
    <label class=""><g:message code="mar.property.dateArriveeFrance.label" />   <span><g:message code="mar.property.dateArriveeFrance.help" /></span></label>
            <div class="date   validate-date  ">
              <select class="day ${rqt.stepStates['subject'].invalidFields.contains('dateArriveeFrance') ? 'validation-failed' : ''}"
                id="dateArriveeFrance_day"
                name="dateArriveeFrance_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.dateArriveeFrance?.date == it
                      || (rqt.dateArriveeFrance == null && params['dateArriveeFrance_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['subject'].invalidFields.contains('dateArriveeFrance') ? 'validation-failed' : ''}"
                id="dateArriveeFrance_month"
                name="dateArriveeFrance_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.dateArriveeFrance?.month == (it - 1)
                      || (rqt.dateArriveeFrance == null && params['dateArriveeFrance_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['subject'].invalidFields.contains('dateArriveeFrance') ? 'validation-failed' : ''}"
                id="dateArriveeFrance_year"
                name="dateArriveeFrance_year"
                value="${rqt.dateArriveeFrance ? rqt.dateArriveeFrance.year + 1900 : params['dateArriveeFrance_year']}"
                title="<g:message code="mar.property.dateArriveeFrance.validationError" />" />
            </div>
            

  

  
    <label for="numeroSecuriteSocialeSujet" class="required"><g:message code="mar.property.numeroSecuriteSocialeSujet.label" /> *  <span><g:message code="mar.property.numeroSecuriteSocialeSujet.help" /></span></label>
            <input type="text" id="numeroSecuriteSocialeSujet" name="numeroSecuriteSocialeSujet" value="${rqt.numeroSecuriteSocialeSujet?.toString()}" 
                    class="required  validate-regex ${rqt.stepStates['subject'].invalidFields.contains('numeroSecuriteSocialeSujet') ? 'validation-failed' : ''}" title="<g:message code="mar.property.numeroSecuriteSocialeSujet.validationError" />" regex="[0-9]{13}" maxlength="13" />
            

  

  
    <label for="nomOrganismeSecuriteSociale" class="required"><g:message code="mar.property.nomOrganismeSecuriteSociale.label" /> *  <span><g:message code="mar.property.nomOrganismeSecuriteSociale.help" /></span></label>
            <input type="text" id="nomOrganismeSecuriteSociale" name="nomOrganismeSecuriteSociale" value="${rqt.nomOrganismeSecuriteSociale?.toString()}" 
                    class="required  validate-regex ${rqt.stepStates['subject'].invalidFields.contains('nomOrganismeSecuriteSociale') ? 'validation-failed' : ''}" title="<g:message code="mar.property.nomOrganismeSecuriteSociale.validationError" />" regex="^.{0,50}$" maxlength="50" />
            

  

  
    <fieldset class="">
    <legend><g:message code="mar.property.precedentDossierMdph.label" /></legend>
    
      <label for="precedentDossierMdph.numeroMdph" class=""><g:message code="mar.property.numeroMdph.label" />   <span><g:message code="mar.property.numeroMdph.help" /></span></label>
            <input type="text" id="precedentDossierMdph.numeroMdph" name="precedentDossierMdph.numeroMdph" value="${rqt.precedentDossierMdph?.numeroMdph?.toString()}" 
                    class="  validate-regex ${rqt.stepStates['subject'].invalidFields.contains('precedentDossierMdph.numeroMdph') ? 'validation-failed' : ''}" title="<g:message code="mar.property.numeroMdph.validationError" />" regex="^.{0,13}$" maxlength="13" />
            

    
      <label for="precedentDossierMdph.departementMdph" class=""><g:message code="mar.property.departementMdph.label" />   <span><g:message code="mar.property.departementMdph.help" /></span></label>
            <select id="precedentDossierMdph.departementMdph" name="precedentDossierMdph.departementMdph" class="  validate-select ${rqt.stepStates['subject'].invalidFields.contains('precedentDossierMdph.departementMdph') ? 'validation-failed' : ''}" title="<g:message code="mar.property.departementMdph.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['None','DEP_01','DEP_02','DEP_03','DEP_04','DEP_05','DEP_06','DEP_07','DEP_08','DEP_09','DEP_10','DEP_11','DEP_12','DEP_13','DEP_14','DEP_15','DEP_16','DEP_17','DEP_18','DEP_19','DEP_2A','DEP_2B','DEP_21','DEP_22','DEP_23','DEP_24','DEP_25','DEP_26','DEP_27','DEP_28','DEP_29','DEP_30','DEP_31','DEP_32','DEP_33','DEP_34','DEP_35','DEP_36','DEP_37','DEP_38','DEP_39','DEP_40','DEP_41','DEP_42','DEP_43','DEP_44','DEP_45','DEP_46','DEP_47','DEP_48','DEP_49','DEP_50','DEP_51','DEP_52','DEP_53','DEP_54','DEP_55','DEP_56','DEP_57','DEP_58','DEP_59','DEP_60','DEP_61','DEP_62','DEP_63','DEP_64','DEP_65','DEP_66','DEP_67','DEP_68','DEP_69','DEP_70','DEP_71','DEP_72','DEP_73','DEP_74','DEP_75','DEP_76','DEP_77','DEP_78','DEP_79','DEP_80','DEP_81','DEP_82','DEP_83','DEP_84','DEP_85','DEP_86','DEP_87','DEP_88','DEP_89','DEP_90','DEP_91','DEP_92','DEP_93','DEP_94','DEP_95','DEP_971','DEP_972','DEP_973','DEP_974']}">
                <option value="fr.cg95.cvq.business.users.InseeDepartementCodeType_${it}" ${it == rqt.precedentDossierMdph?.departementMdph?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mar.property.departementMdph" /></option>
              </g:each>
            </select>
            

    
    </fieldset>
  

  
    <label for="precisionSiDomicileAupresOrganisme" class=""><g:message code="mar.property.precisionSiDomicileAupresOrganisme.label" />   <span><g:message code="mar.property.precisionSiDomicileAupresOrganisme.help" /></span></label>
            <input type="text" id="precisionSiDomicileAupresOrganisme" name="precisionSiDomicileAupresOrganisme" value="${rqt.precisionSiDomicileAupresOrganisme?.toString()}" 
                    class="  validate-string ${rqt.stepStates['subject'].invalidFields.contains('precisionSiDomicileAupresOrganisme') ? 'validation-failed' : ''}" title="<g:message code="mar.property.precisionSiDomicileAupresOrganisme.validationError" />"   />
            

  

