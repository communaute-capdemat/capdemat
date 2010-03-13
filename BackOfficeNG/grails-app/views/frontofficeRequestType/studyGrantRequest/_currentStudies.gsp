


  
    <fieldset class="">
    <legend><g:message code="sgr.property.currentSchool.label" /></legend>
    
      <label class="required"><g:message code="sgr.property.currentSchoolName.label" /> *  <span><g:message code="sgr.property.currentSchoolName.help" /></span></label>
            <g:set var="currentSchoolNameIndex" value="${0}" scope="flash" />
            <g:render template="/frontofficeRequestType/widget/localReferentialData" 
                      model="['wrapper':rqt.currentSchool, 'wrapperJavaName':'currentSchool',
                              'javaName':'currentSchoolName', 'i18nPrefixCode':'sgr.property.currentSchoolName',
                              'htmlClass':'required condition-isCurrentSchoolNameOther-trigger  ', 
                              'lrEntries': lrTypes.currentSchoolName.entries, 'depth':0]" />
            

    
      <label for="currentSchool.currentSchoolNamePrecision" class="required condition-isCurrentSchoolNameOther-filled"><g:message code="sgr.property.currentSchoolNamePrecision.label" /> *  <span><g:message code="sgr.property.currentSchoolNamePrecision.help" /></span></label>
            <input type="text" id="currentSchool.currentSchoolNamePrecision" name="currentSchool.currentSchoolNamePrecision" value="${rqt.currentSchool?.currentSchoolNamePrecision?.toString()}" 
                    class="required condition-isCurrentSchoolNameOther-filled  validate-string ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchool.currentSchoolNamePrecision') ? 'validation-failed' : ''}" title="<g:message code="sgr.property.currentSchoolNamePrecision.validationError" />"   />
            

    
      <label for="currentSchoolPostalCode" class="required"><g:message code="sgr.property.currentSchoolPostalCode.label" /> *  <span><g:message code="sgr.property.currentSchoolPostalCode.help" /></span></label>
            <input type="text" id="currentSchoolPostalCode" name="currentSchoolPostalCode" value="${rqt.currentSchoolPostalCode?.toString()}" 
                    class="required  validate-postalCode ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchoolPostalCode') ? 'validation-failed' : ''}" title="<g:message code="sgr.property.currentSchoolPostalCode.validationError" />"  maxlength="5" />
      <label class="required condition-isCurrentSchoolNameOther-filled"><g:message code="sgr.property.currentSchoolAddress.label" /> *  <span><g:message code="sgr.property.currentSchoolAddress.help" /></span></label>
            <div id="currentSchoolAddress" class="address required condition-isCurrentSchoolNameOther-filled  ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchoolAddress') ? 'validation-failed' : ''}">
            <label for="currentSchoolAddress.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchoolAddress.additionalDeliveryInformation') ? 'validation-failed' : ''}" value="${rqt.currentSchoolAddress?.additionalDeliveryInformation}" maxlength="38" id="currentSchoolAddress.additionalDeliveryInformation" name="currentSchoolAddress.additionalDeliveryInformation" />  
            <label for="currentSchoolAddress.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchoolAddress.additionalGeographicalInformation') ? 'validation-failed' : ''}" value="${rqt.currentSchoolAddress?.additionalGeographicalInformation}" maxlength="38" id="currentSchoolAddress.additionalGeographicalInformation" name="currentSchoolAddress.additionalGeographicalInformation" />
            <label for="currentSchoolAddress_streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="currentSchoolAddress_streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1 validate-streetNumber ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchoolAddress.streetNumber') ? 'validation-failed' : ''}" value="${rqt.currentSchoolAddress?.streetNumber}" size="5" maxlength="5" id="currentSchoolAddress_streetNumber" name="currentSchoolAddress.streetNumber" />
            <input type="text" class="line2 required validate-streetName ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchoolAddress.streetName') ? 'validation-failed' : ''}" value="${rqt.currentSchoolAddress?.streetName}" maxlength="32" id="currentSchoolAddress_streetName" name="currentSchoolAddress.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <input type="hidden" value="${rqt.currentSchoolAddress?.streetMatriculation}" id="currentSchoolAddress_streetMatriculation" name="currentSchoolAddress.streetMatriculation" />
            <input type="hidden" value="${rqt.currentSchoolAddress?.streetRivoliCode}" id="currentSchoolAddress_streetRivoliCode" name="currentSchoolAddress.streetRivoliCode" />
            <label for="currentSchoolAddress.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchoolAddress.placeNameOrService') ? 'validation-failed' : ''}" value="${rqt.currentSchoolAddress?.placeNameOrService}" maxlength="38" id="currentSchoolAddress.placeNameOrService" name="currentSchoolAddress.placeNameOrService" />
            <label for="currentSchoolAddress_postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="currentSchoolAddress_city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required validate-postalCode ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchoolAddress.postalCode') ? 'validation-failed' : ''}" value="${rqt.currentSchoolAddress?.postalCode}" size="5" maxlength="5" id="currentSchoolAddress_postalCode" name="currentSchoolAddress.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required validate-city ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchoolAddress.city') ? 'validation-failed' : ''}" value="${rqt.currentSchoolAddress?.city}" maxlength="32" id="currentSchoolAddress_city" name="currentSchoolAddress.city" title="<g:message code="address.property.city.validationError" />" />
            <input type="hidden" value="${rqt.currentSchoolAddress?.cityInseeCode}" id="currentSchoolAddress_cityInseeCode" name="currentSchoolAddress.cityInseeCode" />
            <label for="currentSchoolAddress.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchoolAddress.countryName') ? 'validation-failed' : ''}" value="${rqt.currentSchoolAddress?.countryName}" maxlength="38" id="currentSchoolAddress.countryName" name="currentSchoolAddress.countryName" />
            </div>
      <label for="currentSchool.currentSchoolPostalCode" class="required"><g:message code="sgr.property.currentSchoolPostalCode.label" /> *  <span><g:message code="sgr.property.currentSchoolPostalCode.help" /></span></label>
            <input type="text" id="currentSchool.currentSchoolPostalCode" name="currentSchool.currentSchoolPostalCode" value="${rqt.currentSchool?.currentSchoolPostalCode?.toString()}" 
                    class="required  validate-postalCode ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchool.currentSchoolPostalCode') ? 'validation-failed' : ''}" title="<g:message code="sgr.property.currentSchoolPostalCode.validationError" />"  maxlength="5" />
            

    
      <label for="currentSchoolCity" class="required"><g:message code="sgr.property.currentSchoolCity.label" /> *  <span><g:message code="sgr.property.currentSchoolCity.help" /></span></label>
            <input type="text" id="currentSchoolCity" name="currentSchoolCity" value="${rqt.currentSchoolCity?.toString()}" 
                    class="required  validate-city ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchoolCity') ? 'validation-failed' : ''}" title="<g:message code="sgr.property.currentSchoolCity.validationError" />"  maxlength="32" />
            

    
      <label for="currentSchoolCountry" class="required"><g:message code="sgr.property.currentSchoolCountry.label" /> *  <span><g:message code="sgr.property.currentSchoolCountry.help" /></span></label>
            <select id="currentSchoolCountry" name="currentSchoolCountry" class="required  validate-not-first ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchoolCountry') ? 'validation-failed' : ''}" title="<g:message code="sgr.property.currentSchoolCountry.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['Unknown','af','za','al','dz','de','ad','ao','ai','aq','ag','an','sa','ar','am','aw','au','at','az','bj','bs','bh','bd','bb','pw','be','bz','bm','bt','by','mm','bo','ba','bw','br','bn','bg','bf','bi','ci','kh','cm','ca','cv','cl','cn','cy','co','km','cg','kp','kr','cr','hr','cu','dk','dj','dm','eg','ae','ec','er','es','ee','us','et','fi','fr','ge','ga','gm','gh','gi','gr','gd','gl','gp','gu','gt','gn','gq','gw','gy','gf','ht','hn','hk','hu','ck','fj','mh','sb','in','id','ir','iq','ie','is','il','it','jm','jp','jo','kz','ke','kg','ki','kw','la','ls','lv','lb','lr','ly','li','lt','lu','mg','my','mw','mv','ml','mt','ma','mu','mr','mx','fm','md','mc','mn','mz','np','na','nr','ni','ne','ng','nu','no','nz','om','ug','uz','pe','pk','pa','pg','py','nl','ph','pl','pt','qa','cf','cd','do','cz','ro','gb','ru','rw','sn','kn','sm','va','vc','lc','sv','ws','st','sc','sl','sg','si','sk','so','sd','lk','se','ch','sr','sz','sy','tw','tj','tz','td','th','tl','tg','to','vt','tn','tm','tr','tv','ua','uy','vu','ve','vn','ye','zm','zw','mk']}">
                <option value="fr.cg95.cvq.business.users.CountryType_${it}" ${it == rqt.currentSchoolCountry?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="sgr.property.currentSchoolCountry" /></option>
              </g:each>
            </select>
            

    
      <label for="currentSchool.currentSchoolCity" class="required"><g:message code="sgr.property.currentSchoolCity.label" /> *  <span><g:message code="sgr.property.currentSchoolCity.help" /></span></label>
            <input type="text" id="currentSchool.currentSchoolCity" name="currentSchool.currentSchoolCity" value="${rqt.currentSchool?.currentSchoolCity?.toString()}" 
                    class="required  validate-city ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchool.currentSchoolCity') ? 'validation-failed' : ''}" title="<g:message code="sgr.property.currentSchoolCity.validationError" />"  maxlength="32" />
            

    
      <label for="currentSchool.currentSchoolCountry" class="required"><g:message code="sgr.property.currentSchoolCountry.label" /> *  <span><g:message code="sgr.property.currentSchoolCountry.help" /></span></label>
            <select id="currentSchool.currentSchoolCountry" name="currentSchool.currentSchoolCountry" class="required  validate-not-first ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchool.currentSchoolCountry') ? 'validation-failed' : ''}" title="<g:message code="sgr.property.currentSchoolCountry.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['Unknown','af','za','al','dz','de','ad','ao','ai','aq','ag','an','sa','ar','am','aw','au','at','az','bj','bs','bh','bd','bb','pw','be','bz','bm','bt','by','mm','bo','ba','bw','br','bn','bg','bf','bi','ci','kh','cm','ca','cv','cl','cn','cy','co','km','cg','kp','kr','cr','hr','cu','dk','dj','dm','eg','ae','ec','er','es','ee','us','et','fi','fr','ge','ga','gm','gh','gi','gr','gd','gl','gp','gu','gt','gn','gq','gw','gy','gf','ht','hn','hk','hu','ck','fj','mh','sb','in','id','ir','iq','ie','is','il','it','jm','jp','jo','kz','ke','kg','ki','kw','la','ls','lv','lb','lr','ly','li','lt','lu','mg','my','mw','mv','ml','mt','ma','mu','mr','mx','fm','md','mc','mn','mz','np','na','nr','ni','ne','ng','nu','no','nz','om','ug','uz','pe','pk','pa','pg','py','nl','ph','pl','pt','qa','cf','cd','do','cz','ro','gb','ru','rw','sn','kn','sm','va','vc','lc','sv','ws','st','sc','sl','sg','si','sk','so','sd','lk','se','ch','sr','sz','sy','tw','tj','tz','td','th','tl','tg','to','vt','tn','tm','tr','tv','ua','uy','vu','ve','vn','ye','zm','zw','mk']}">
                <option value="fr.cg95.cvq.business.users.CountryType_${it}" ${it == rqt.currentSchool?.currentSchoolCountry?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="sgr.property.currentSchoolCountry" /></option>
              </g:each>
            </select>
            

    
    </fieldset>
  

  
    <fieldset class="required">
    <legend><g:message code="sgr.property.alevelsInformations.label" /></legend>
    
      <label for="alevelsInformations.alevelsDate" class="required"><g:message code="sgr.property.alevelsDate.label" /> *  <span><g:message code="sgr.property.alevelsDate.help" /></span></label>
            <input type="text" id="alevelsInformations.alevelsDate" name="alevelsInformations.alevelsDate" value="${rqt.alevelsInformations?.alevelsDate?.toString()}" 
                    class="required  validate-regex ${rqt.stepStates['currentStudies'].invalidFields.contains('alevelsInformations.alevelsDate') ? 'validation-failed' : ''}" title="<g:message code="sgr.property.alevelsDate.validationError" />" regex="^\d{2,4}$" maxlength="4" />
            

    
      <label for="alevelsInformations.alevels" class="required"><g:message code="sgr.property.alevels.label" /> *  <span><g:message code="sgr.property.alevels.help" /></span></label>
            <select id="alevelsInformations.alevels" name="alevelsInformations.alevels" class="required  validate-not-first ${rqt.stepStates['currentStudies'].invalidFields.contains('alevelsInformations.alevels') ? 'validation-failed' : ''}" title="<g:message code="sgr.property.alevels.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['es','l','s','stg','sti','stl','st2s','stav','tmd','h','p']}">
                <option value="fr.cg95.cvq.business.request.school.ALevelsType_${it}" ${it == rqt.alevels?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="sgr.property.alevels" /></option>
              <g:each in="${['ES','L','S','STG','STI','STL','ST2S','STAV','TMD','H','P']}">
                <option value="${it}" ${it == rqt.alevels?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="sgr.property.alevels" /></option>
              <g:each in="${['es','l','s','stg','sti','stl','st2s','stav','tmd','h','p']}">
                <option value="fr.cg95.cvq.business.request.school.ALevelsType_${it}" ${it == rqt.alevelsInformations?.alevels?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="sgr.property.alevels" /></option>
              </g:each>
            </select>
            

    
    </fieldset>
  

  
    <fieldset class="">
    <legend><g:message code="sgr.property.currentStudiesInformations.label" /></legend>
    
      <label for="currentStudiesInformations.currentStudiesDiploma" class="required"><g:message code="sgr.property.currentStudiesDiploma.label" /> *  <span><g:message code="sgr.property.currentStudiesDiploma.help" /></span></label>
            <select id="currentStudiesInformations.currentStudiesDiploma" name="currentStudiesInformations.currentStudiesDiploma" class="required condition-isInOtherStudies-trigger  validate-not-first ${rqt.stepStates['currentStudies'].invalidFields.contains('currentStudiesInformations.currentStudiesDiploma') ? 'validation-failed' : ''}" title="<g:message code="sgr.property.currentStudiesDiploma.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['licence','licencePro','master','bts','dut','otherStudies']}">
                <option value="fr.cg95.cvq.business.request.school.CurrentStudiesType_${it}" ${it == rqt.currentStudiesDiploma?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="sgr.property.currentStudiesDiploma" /></option>
              <g:each in="${['LICENCE','LICENCE_PRO','MASTER','BTS','DUT','OTHER_STUDIES']}">
                <option value="${it}" ${it == rqt.currentStudiesDiploma?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="sgr.property.currentStudiesDiploma" /></option>
              <g:each in="${['licence','licencePro','master','bts','dut','otherStudies']}">
                <option value="fr.cg95.cvq.business.request.school.CurrentStudiesType_${it}" ${it == rqt.currentStudiesInformations?.currentStudiesDiploma?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="sgr.property.currentStudiesDiploma" /></option>
              </g:each>
            </select>
            

    
      <label for="currentStudiesInformations.otherStudiesLabel" class="required condition-isInOtherStudies-filled"><g:message code="sgr.property.otherStudiesLabel.label" /> *  <span><g:message code="sgr.property.otherStudiesLabel.help" /></span></label>
            <input type="text" id="currentStudiesInformations.otherStudiesLabel" name="currentStudiesInformations.otherStudiesLabel" value="${rqt.currentStudiesInformations?.otherStudiesLabel?.toString()}" 
                    class="required condition-isInOtherStudies-filled  validate-string ${rqt.stepStates['currentStudies'].invalidFields.contains('currentStudiesInformations.otherStudiesLabel') ? 'validation-failed' : ''}" title="<g:message code="sgr.property.otherStudiesLabel.validationError" />"   />
            

    
      <label for="currentStudiesInformations.currentStudiesLevel" class="required"><g:message code="sgr.property.currentStudiesLevel.label" /> *  <span><g:message code="sgr.property.currentStudiesLevel.help" /></span></label>
            <select id="currentStudiesInformations.currentStudiesLevel" name="currentStudiesInformations.currentStudiesLevel" class="required  validate-not-first ${rqt.stepStates['currentStudies'].invalidFields.contains('currentStudiesInformations.currentStudiesLevel') ? 'validation-failed' : ''}" title="<g:message code="sgr.property.currentStudiesLevel.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['firstYear','secondYear','thirdYear']}">
                <option value="fr.cg95.cvq.business.request.school.CurrentStudiesLevelType_${it}" ${it == rqt.currentStudiesLevel?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="sgr.property.currentStudiesLevel" /></option>
              <g:each in="${['FIRST_YEAR','SECOND_YEAR','THIRD_YEAR']}">
                <option value="${it}" ${it == rqt.currentStudiesLevel?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="sgr.property.currentStudiesLevel" /></option>
              <g:each in="${['firstYear','secondYear','thirdYear']}">
                <option value="fr.cg95.cvq.business.request.school.CurrentStudiesLevelType_${it}" ${it == rqt.currentStudiesInformations?.currentStudiesLevel?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="sgr.property.currentStudiesLevel" /></option>
              </g:each>
            </select>
            

    
      <label class="required"><g:message code="sgr.property.sandwichCourses.label" /> *  <span><g:message code="sgr.property.sandwichCourses.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['currentStudies'].invalidFields.contains('currentStudiesInformations.sandwichCourses') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="currentStudiesInformations.sandwichCourses_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="currentStudiesInformations.sandwichCourses" ${it == rqt.currentStudiesInformations?.sandwichCourses ? 'checked="checked"': ''} />
                <label for="currentStudiesInformations.sandwichCourses_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label class="required"><g:message code="sgr.property.abroadInternship.label" /> *  <span><g:message code="sgr.property.abroadInternship.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['currentStudies'].invalidFields.contains('currentStudiesInformations.abroadInternship') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="currentStudiesInformations.abroadInternship_${it ? 'yes' : 'no'}" class="required condition-makesAbroadInternship-trigger  validate-one-required boolean" title="" value="${it}" name="currentStudiesInformations.abroadInternship" ${it == rqt.currentStudiesInformations?.abroadInternship ? 'checked="checked"': ''} />
                <label for="currentStudiesInformations.abroadInternship_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label class="required condition-makesAbroadInternship-filled"><g:message code="sgr.property.abroadInternshipStartDate.label" /> *  <span><g:message code="sgr.property.abroadInternshipStartDate.help" /></span></label>
            <div class="date required condition-makesAbroadInternship-filled  validate-date required condition-makesAbroadInternship-filled ">
              <select class="day ${rqt.stepStates['currentStudies'].invalidFields.contains('currentStudiesInformations.abroadInternshipStartDate') ? 'validation-failed' : ''}"
                id="currentStudiesInformations.abroadInternshipStartDate_day"
                name="currentStudiesInformations.abroadInternshipStartDate_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.currentStudiesInformations?.abroadInternshipStartDate?.date == it
                      || (rqt.currentStudiesInformations?.abroadInternshipStartDate == null && params['currentStudiesInformations.abroadInternshipStartDate_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['currentStudies'].invalidFields.contains('currentStudiesInformations.abroadInternshipStartDate') ? 'validation-failed' : ''}"
                id="currentStudiesInformations.abroadInternshipStartDate_month"
                name="currentStudiesInformations.abroadInternshipStartDate_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.currentStudiesInformations?.abroadInternshipStartDate?.month == (it - 1)
                      || (rqt.currentStudiesInformations?.abroadInternshipStartDate == null && params['currentStudiesInformations.abroadInternshipStartDate_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['currentStudies'].invalidFields.contains('currentStudiesInformations.abroadInternshipStartDate') ? 'validation-failed' : ''}"
                id="currentStudiesInformations.abroadInternshipStartDate_year"
                name="currentStudiesInformations.abroadInternshipStartDate_year"
                value="${rqt.currentStudiesInformations?.abroadInternshipStartDate ? rqt.currentStudiesInformations?.abroadInternshipStartDate.year + 1900 : params['currentStudiesInformations.abroadInternshipStartDate_year']}"
                title="<g:message code="sgr.property.abroadInternshipStartDate.validationError" />" />
            </div>
            

    
      <label class="required condition-makesAbroadInternship-filled"><g:message code="sgr.property.abroadInternshipEndDate.label" /> *  <span><g:message code="sgr.property.abroadInternshipEndDate.help" /></span></label>
            <div class="date required condition-makesAbroadInternship-filled  validate-date required condition-makesAbroadInternship-filled ">
              <select class="day ${rqt.stepStates['currentStudies'].invalidFields.contains('currentStudiesInformations.abroadInternshipEndDate') ? 'validation-failed' : ''}"
                id="currentStudiesInformations.abroadInternshipEndDate_day"
                name="currentStudiesInformations.abroadInternshipEndDate_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.currentStudiesInformations?.abroadInternshipEndDate?.date == it
                      || (rqt.currentStudiesInformations?.abroadInternshipEndDate == null && params['currentStudiesInformations.abroadInternshipEndDate_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['currentStudies'].invalidFields.contains('currentStudiesInformations.abroadInternshipEndDate') ? 'validation-failed' : ''}"
                id="currentStudiesInformations.abroadInternshipEndDate_month"
                name="currentStudiesInformations.abroadInternshipEndDate_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.currentStudiesInformations?.abroadInternshipEndDate?.month == (it - 1)
                      || (rqt.currentStudiesInformations?.abroadInternshipEndDate == null && params['currentStudiesInformations.abroadInternshipEndDate_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['currentStudies'].invalidFields.contains('currentStudiesInformations.abroadInternshipEndDate') ? 'validation-failed' : ''}"
                id="currentStudiesInformations.abroadInternshipEndDate_year"
                name="currentStudiesInformations.abroadInternshipEndDate_year"
                value="${rqt.currentStudiesInformations?.abroadInternshipEndDate ? rqt.currentStudiesInformations?.abroadInternshipEndDate.year + 1900 : params['currentStudiesInformations.abroadInternshipEndDate_year']}"
                title="<g:message code="sgr.property.abroadInternshipEndDate.validationError" />" />
            </div>
            

    
      <label for="currentStudiesInformations.abroadInternshipSchoolName" class="required condition-makesAbroadInternship-filled"><g:message code="sgr.property.abroadInternshipSchoolName.label" /> *  <span><g:message code="sgr.property.abroadInternshipSchoolName.help" /></span></label>
            <input type="text" id="currentStudiesInformations.abroadInternshipSchoolName" name="currentStudiesInformations.abroadInternshipSchoolName" value="${rqt.currentStudiesInformations?.abroadInternshipSchoolName?.toString()}" 
                    class="required condition-makesAbroadInternship-filled  validate-string ${rqt.stepStates['currentStudies'].invalidFields.contains('currentStudiesInformations.abroadInternshipSchoolName') ? 'validation-failed' : ''}" title="<g:message code="sgr.property.abroadInternshipSchoolName.validationError" />"   />
            

    
      <label for="currentStudiesInformations.abroadInternshipSchoolCountry" class="required condition-makesAbroadInternship-filled"><g:message code="sgr.property.abroadInternshipSchoolCountry.label" /> *  <span><g:message code="sgr.property.abroadInternshipSchoolCountry.help" /></span></label>
            <select id="currentStudiesInformations.abroadInternshipSchoolCountry" name="currentStudiesInformations.abroadInternshipSchoolCountry" class="required condition-makesAbroadInternship-filled  validate-not-first ${rqt.stepStates['currentStudies'].invalidFields.contains('currentStudiesInformations.abroadInternshipSchoolCountry') ? 'validation-failed' : ''}" title="<g:message code="sgr.property.abroadInternshipSchoolCountry.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['Unknown','af','za','al','dz','de','ad','ao','ai','aq','ag','an','sa','ar','am','aw','au','at','az','bj','bs','bh','bd','bb','pw','be','bz','bm','bt','by','mm','bo','ba','bw','br','bn','bg','bf','bi','ci','kh','cm','ca','cv','cl','cn','cy','co','km','cg','kp','kr','cr','hr','cu','dk','dj','dm','eg','ae','ec','er','es','ee','us','et','fi','fr','ge','ga','gm','gh','gi','gr','gd','gl','gp','gu','gt','gn','gq','gw','gy','gf','ht','hn','hk','hu','ck','fj','mh','sb','in','id','ir','iq','ie','is','il','it','jm','jp','jo','kz','ke','kg','ki','kw','la','ls','lv','lb','lr','ly','li','lt','lu','mg','my','mw','mv','ml','mt','ma','mu','mr','mx','fm','md','mc','mn','mz','np','na','nr','ni','ne','ng','nu','no','nz','om','ug','uz','pe','pk','pa','pg','py','nl','ph','pl','pt','qa','cf','cd','do','cz','ro','gb','ru','rw','sn','kn','sm','va','vc','lc','sv','ws','st','sc','sl','sg','si','sk','so','sd','lk','se','ch','sr','sz','sy','tw','tj','tz','td','th','tl','tg','to','vt','tn','tm','tr','tv','ua','uy','vu','ve','vn','ye','zm','zw','mk']}">
                <option value="fr.cg95.cvq.business.users.CountryType_${it}" ${it == rqt.abroadInternshipSchoolCountry?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="sgr.property.abroadInternshipSchoolCountry" /></option>
              <g:each in="${['UNKNOWN','AF','ZA','AL','DZ','DE','AD','AO','AI','AQ','AG','AN','SA','AR','AM','AW','AU','AT','AZ','BJ','BS','BH','BD','BB','PW','BE','BZ','BM','BT','BY','MM','BO','BA','BW','BR','BN','BG','BF','BI','CI','KH','CM','CA','CV','CL','CN','CY','CO','KM','CG','KP','KR','CR','HR','CU','DK','DJ','DM','EG','AE','EC','ER','ES','EE','US','ET','FI','FR','GE','GA','GM','GH','GI','GR','GD','GL','GP','GU','GT','GN','GQ','GW','GY','GF','HT','HN','HK','HU','CK','FJ','MH','SB','IN','ID','IR','IQ','IE','IS','IL','IT','JM','JP','JO','KZ','KE','KG','KI','KW','LA','LS','LV','LB','LR','LY','LI','LT','LU','MG','MY','MW','MV','ML','MT','MA','MU','MR','MX','FM','MD','MC','MN','MZ','NP','NA','NR','NI','NE','NG','NU','NO','NZ','OM','UG','UZ','PE','PK','PA','PG','PY','NL','PH','PL','PT','QA','CF','CD','DO','CZ','RO','GB','RU','RW','SN','KN','SM','VA','VC','LC','SV','WS','ST','SC','SL','SG','SI','SK','SO','SD','LK','SE','CH','SR','SZ','SY','TW','TJ','TZ','TD','TH','TL','TG','TO','VT','TN','TM','TR','TV','UA','UY','VU','VE','VN','YE','ZM','ZW','MK']}">
                <option value="${it}" ${it == rqt.abroadInternshipSchoolCountry?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="sgr.property.abroadInternshipSchoolCountry" /></option>
              <g:each in="${['Unknown','af','za','al','dz','de','ad','ao','ai','aq','ag','an','sa','ar','am','aw','au','at','az','bj','bs','bh','bd','bb','pw','be','bz','bm','bt','by','mm','bo','ba','bw','br','bn','bg','bf','bi','ci','kh','cm','ca','cv','cl','cn','cy','co','km','cg','kp','kr','cr','hr','cu','dk','dj','dm','eg','ae','ec','er','es','ee','us','et','fi','fr','ge','ga','gm','gh','gi','gr','gd','gl','gp','gu','gt','gn','gq','gw','gy','gf','ht','hn','hk','hu','ck','fj','mh','sb','in','id','ir','iq','ie','is','il','it','jm','jp','jo','kz','ke','kg','ki','kw','la','ls','lv','lb','lr','ly','li','lt','lu','mg','my','mw','mv','ml','mt','ma','mu','mr','mx','fm','md','mc','mn','mz','np','na','nr','ni','ne','ng','nu','no','nz','om','ug','uz','pe','pk','pa','pg','py','nl','ph','pl','pt','qa','cf','cd','do','cz','ro','gb','ru','rw','sn','kn','sm','va','vc','lc','sv','ws','st','sc','sl','sg','si','sk','so','sd','lk','se','ch','sr','sz','sy','tw','tj','tz','td','th','tl','tg','to','vt','tn','tm','tr','tv','ua','uy','vu','ve','vn','ye','zm','zw','mk']}">
                <option value="fr.cg95.cvq.business.users.CountryType_${it}" ${it == rqt.currentStudiesInformations?.abroadInternshipSchoolCountry?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="sgr.property.abroadInternshipSchoolCountry" /></option>
              </g:each>
            </select>
            

    
    </fieldset>
  

