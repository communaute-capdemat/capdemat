


  
    
            <label for="subjectId" class="required">
              <g:message code="myr.property.subject.label" /> *
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
            

  

  
    <label for="faxSujet" class=""><g:message code="myr.property.faxSujet.label" />   <span><g:message code="myr.property.faxSujet.help" /></span></label>
            <input type="text" id="faxSujet" name="faxSujet" value="${rqt.faxSujet?.toString()}" 
                    class="  validate-phone ${rqt.stepStates['subject'].invalidFields.contains('faxSujet') ? 'validation-failed' : ''}" title="<g:message code="myr.property.faxSujet.validationError" />"  maxlength="10" />
            

  

  
    <label for="nationalite" class="required"><g:message code="myr.property.nationalite.label" /> *  <span><g:message code="myr.property.nationalite.help" /></span></label>
            <select id="nationalite" name="nationalite" class="required  validate-not-first ${rqt.stepStates['subject'].invalidFields.contains('nationalite') ? 'validation-failed' : ''}" title="<g:message code="myr.property.nationalite.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['FRANCAISE','EEESUISSE','AUTRE']}">
                <option value="${it}" ${it == rqt.nationalite?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="myr.property.nationalite" /></option>
              </g:each>
            </select>
            

  

  
    <label class="required"><g:message code="myr.property.dateNaissanceSujet.label" /> *  <span><g:message code="myr.property.dateNaissanceSujet.help" /></span></label>
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
                title="<g:message code="myr.property.dateNaissanceSujet.validationError" />" />
            </div>
            

  

  
    <fieldset class="required">
    <legend><g:message code="myr.property.lieuNaissanceSujet.label" /></legend>
    
      <label for="lieuNaissanceSujet.postalCode" class="required"><g:message code="myr.property.postalCode.label" /> *  <span><g:message code="myr.property.postalCode.help" /></span></label>
            <input type="text" id="lieuNaissanceSujet.postalCode" name="lieuNaissanceSujet.postalCode" value="${rqt.lieuNaissanceSujet?.postalCode?.toString()}" 
                    class="required  validate-postalCode ${rqt.stepStates['subject'].invalidFields.contains('lieuNaissanceSujet.postalCode') ? 'validation-failed' : ''}" title="<g:message code="myr.property.postalCode.validationError" />"  maxlength="5" />
            

    
      <label for="lieuNaissanceSujet.city" class="required"><g:message code="myr.property.city.label" /> *  <span><g:message code="myr.property.city.help" /></span></label>
            <input type="text" id="lieuNaissanceSujet.city" name="lieuNaissanceSujet.city" value="${rqt.lieuNaissanceSujet?.city?.toString()}" 
                    class="required  validate-city ${rqt.stepStates['subject'].invalidFields.contains('lieuNaissanceSujet.city') ? 'validation-failed' : ''}" title="<g:message code="myr.property.city.validationError" />"  maxlength="32" />
            

    
      <label for="lieuNaissanceSujet.country" class="required"><g:message code="myr.property.country.label" /> *  <span><g:message code="myr.property.country.help" /></span></label>
            <select id="lieuNaissanceSujet.country" name="lieuNaissanceSujet.country" class="required  validate-not-first ${rqt.stepStates['subject'].invalidFields.contains('lieuNaissanceSujet.country') ? 'validation-failed' : ''}" title="<g:message code="myr.property.country.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['UNKNOWN','AF','ZA','AL','DZ','DE','AD','AO','AI','AQ','AG','AN','SA','AR','AM','AW','AU','AT','AZ','BJ','BS','BH','BD','BB','PW','BE','BZ','BM','BT','BY','MM','BO','BA','BW','BR','BN','BG','BF','BI','CI','KH','CM','CA','CV','CL','CN','CY','CO','KM','CG','KP','KR','CR','HR','CU','DK','DJ','DM','EG','AE','EC','ER','ES','EE','US','ET','FI','FR','GE','GA','GM','GH','GI','GR','GD','GL','GP','GU','GT','GN','GQ','GW','GY','GF','HT','HN','HK','HU','CK','FJ','MH','SB','IN','ID','IR','IQ','IE','IS','IL','IT','JM','JP','JO','KZ','KE','KG','KI','KW','LA','LS','LV','LB','LR','LY','LI','LT','LU','MG','MY','MW','MV','ML','MT','MA','MU','MR','MX','FM','MD','MC','MN','MZ','NP','NA','NR','NI','NE','NG','NU','NO','NZ','OM','UG','UZ','PE','PK','PA','PG','PY','NL','PH','PL','PT','QA','CF','CD','DO','CZ','RO','GB','RU','RW','SN','KN','SM','VA','VC','LC','SV','WS','ST','SC','SL','SG','SI','SK','SO','SD','LK','SE','CH','SR','SZ','SY','TW','TJ','TZ','TD','TH','TL','TG','TO','VT','TN','TM','TR','TV','UA','UY','VU','VE','VN','YE','ZM','ZW','MK']}">
                <option value="${it}" ${it == rqt.lieuNaissanceSujet?.country?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="myr.property.country" /></option>
              </g:each>
            </select>
            

    
    </fieldset>
  

  
    <label class=""><g:message code="myr.property.dateArriveeFrance.label" />   <span><g:message code="myr.property.dateArriveeFrance.help" /></span></label>
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
                title="<g:message code="myr.property.dateArriveeFrance.validationError" />" />
            </div>
            

  

  
    <label for="numeroSecuriteSocialeSujet" class="required"><g:message code="myr.property.numeroSecuriteSocialeSujet.label" /> *  <span><g:message code="myr.property.numeroSecuriteSocialeSujet.help" /></span></label>
            <input type="text" id="numeroSecuriteSocialeSujet" name="numeroSecuriteSocialeSujet" value="${rqt.numeroSecuriteSocialeSujet?.toString()}" 
                    class="required  validate-regex ${rqt.stepStates['subject'].invalidFields.contains('numeroSecuriteSocialeSujet') ? 'validation-failed' : ''}" title="<g:message code="myr.property.numeroSecuriteSocialeSujet.validationError" />" regex="[0-9]{13}" maxlength="13" />
            

  

  
    <label for="nomOrganismeSecuriteSociale" class="required"><g:message code="myr.property.nomOrganismeSecuriteSociale.label" /> *  <span><g:message code="myr.property.nomOrganismeSecuriteSociale.help" /></span></label>
            <input type="text" id="nomOrganismeSecuriteSociale" name="nomOrganismeSecuriteSociale" value="${rqt.nomOrganismeSecuriteSociale?.toString()}" 
                    class="required  validate-regex ${rqt.stepStates['subject'].invalidFields.contains('nomOrganismeSecuriteSociale') ? 'validation-failed' : ''}" title="<g:message code="myr.property.nomOrganismeSecuriteSociale.validationError" />" regex="^.{0,50}$" maxlength="50" />
            

  

  
    <fieldset class="">
    <legend><g:message code="myr.property.precedentDossierMdph.label" /></legend>
    
      <label for="precedentDossierMdph.numeroMdph" class=""><g:message code="myr.property.numeroMdph.label" />   <span><g:message code="myr.property.numeroMdph.help" /></span></label>
            <input type="text" id="precedentDossierMdph.numeroMdph" name="precedentDossierMdph.numeroMdph" value="${rqt.precedentDossierMdph?.numeroMdph?.toString()}" 
                    class="  validate-regex ${rqt.stepStates['subject'].invalidFields.contains('precedentDossierMdph.numeroMdph') ? 'validation-failed' : ''}" title="<g:message code="myr.property.numeroMdph.validationError" />" regex="^.{0,13}$" maxlength="13" />
            

    
      <label for="precedentDossierMdph.departementMdph" class=""><g:message code="myr.property.departementMdph.label" />   <span><g:message code="myr.property.departementMdph.help" /></span></label>
            <select id="precedentDossierMdph.departementMdph" name="precedentDossierMdph.departementMdph" class="  validate-select ${rqt.stepStates['subject'].invalidFields.contains('precedentDossierMdph.departementMdph') ? 'validation-failed' : ''}" title="<g:message code="myr.property.departementMdph.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['NONE','D_E_P01','D_E_P02','D_E_P03','D_E_P04','D_E_P05','D_E_P06','D_E_P07','D_E_P08','D_E_P09','D_E_P10','D_E_P11','D_E_P12','D_E_P13','D_E_P14','D_E_P15','D_E_P16','D_E_P17','D_E_P18','D_E_P19','D_E_P2_A','D_E_P2_B','D_E_P21','D_E_P22','D_E_P23','D_E_P24','D_E_P25','D_E_P26','D_E_P27','D_E_P28','D_E_P29','D_E_P30','D_E_P31','D_E_P32','D_E_P33','D_E_P34','D_E_P35','D_E_P36','D_E_P37','D_E_P38','D_E_P39','D_E_P40','D_E_P41','D_E_P42','D_E_P43','D_E_P44','D_E_P45','D_E_P46','D_E_P47','D_E_P48','D_E_P49','D_E_P50','D_E_P51','D_E_P52','D_E_P53','D_E_P54','D_E_P55','D_E_P56','D_E_P57','D_E_P58','D_E_P59','D_E_P60','D_E_P61','D_E_P62','D_E_P63','D_E_P64','D_E_P65','D_E_P66','D_E_P67','D_E_P68','D_E_P69','D_E_P70','D_E_P71','D_E_P72','D_E_P73','D_E_P74','D_E_P75','D_E_P76','D_E_P77','D_E_P78','D_E_P79','D_E_P80','D_E_P81','D_E_P82','D_E_P83','D_E_P84','D_E_P85','D_E_P86','D_E_P87','D_E_P88','D_E_P89','D_E_P90','D_E_P91','D_E_P92','D_E_P93','D_E_P94','D_E_P95','D_E_P971','D_E_P972','D_E_P973','D_E_P974']}">
                <option value="${it}" ${it == rqt.precedentDossierMdph?.departementMdph?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="myr.property.departementMdph" /></option>
              </g:each>
            </select>
            

    
    </fieldset>
  

  
    <label for="precisionSiDomicileAupresOrganisme" class=""><g:message code="myr.property.precisionSiDomicileAupresOrganisme.label" />   <span><g:message code="myr.property.precisionSiDomicileAupresOrganisme.help" /></span></label>
            <input type="text" id="precisionSiDomicileAupresOrganisme" name="precisionSiDomicileAupresOrganisme" value="${rqt.precisionSiDomicileAupresOrganisme?.toString()}" 
                    class="  validate-string ${rqt.stepStates['subject'].invalidFields.contains('precisionSiDomicileAupresOrganisme') ? 'validation-failed' : ''}" title="<g:message code="myr.property.precisionSiDomicileAupresOrganisme.validationError" />"   />
            

  

