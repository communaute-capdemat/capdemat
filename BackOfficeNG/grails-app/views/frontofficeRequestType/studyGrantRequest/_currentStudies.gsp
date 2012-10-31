


  
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
            

    
      <label class="required condition-isCurrentSchoolNameOther-filled"><g:message code="sgr.property.currentSchoolAddress.label" /> *  <span><g:message code="sgr.property.currentSchoolAddress.help" /></span></label>
            <div id="currentSchool.currentSchoolAddress" class="address required condition-isCurrentSchoolNameOther-filled  ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchool.currentSchoolAddress') ? 'validation-failed' : ''}">
            <label for="currentSchool.currentSchoolAddress.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchool.currentSchoolAddress.additionalDeliveryInformation') ? 'validation-failed' : ''}" value="${rqt.currentSchool?.currentSchoolAddress?.additionalDeliveryInformation}" maxlength="38" id="currentSchool.currentSchoolAddress.additionalDeliveryInformation" name="currentSchool.currentSchoolAddress.additionalDeliveryInformation" />  
            <label for="currentSchool.currentSchoolAddress.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchool.currentSchoolAddress.additionalGeographicalInformation') ? 'validation-failed' : ''}" value="${rqt.currentSchool?.currentSchoolAddress?.additionalGeographicalInformation}" maxlength="38" id="currentSchool.currentSchoolAddress.additionalGeographicalInformation" name="currentSchool.currentSchoolAddress.additionalGeographicalInformation" />
            <label for="currentSchool.currentSchoolAddress_streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="currentSchool.currentSchoolAddress_streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1 validate-streetNumber ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchool.currentSchoolAddress.streetNumber') ? 'validation-failed' : ''}" value="${rqt.currentSchool?.currentSchoolAddress?.streetNumber}" size="5" maxlength="5" id="currentSchool.currentSchoolAddress_streetNumber" name="currentSchool.currentSchoolAddress.streetNumber" />
            <input type="text" class="line2 required validate-streetName ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchool.currentSchoolAddress.streetName') ? 'validation-failed' : ''}" value="${rqt.currentSchool?.currentSchoolAddress?.streetName}" maxlength="32" id="currentSchool.currentSchoolAddress_streetName" name="currentSchool.currentSchoolAddress.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <input type="hidden" value="${rqt.currentSchool?.currentSchoolAddress?.streetMatriculation}" id="currentSchool.currentSchoolAddress_streetMatriculation" name="currentSchool.currentSchoolAddress.streetMatriculation" />
            <input type="hidden" value="${rqt.currentSchool?.currentSchoolAddress?.streetRivoliCode}" id="currentSchool.currentSchoolAddress_streetRivoliCode" name="currentSchool.currentSchoolAddress.streetRivoliCode" />
            <label for="currentSchool.currentSchoolAddress.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchool.currentSchoolAddress.placeNameOrService') ? 'validation-failed' : ''}" value="${rqt.currentSchool?.currentSchoolAddress?.placeNameOrService}" maxlength="38" id="currentSchool.currentSchoolAddress.placeNameOrService" name="currentSchool.currentSchoolAddress.placeNameOrService" />
            <label for="currentSchool.currentSchoolAddress_postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="currentSchool.currentSchoolAddress_city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required validate-postalCode ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchool.currentSchoolAddress.postalCode') ? 'validation-failed' : ''}" value="${rqt.currentSchool?.currentSchoolAddress?.postalCode}" size="5" maxlength="5" id="currentSchool.currentSchoolAddress_postalCode" name="currentSchool.currentSchoolAddress.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required validate-city ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchool.currentSchoolAddress.city') ? 'validation-failed' : ''}" value="${rqt.currentSchool?.currentSchoolAddress?.city}" maxlength="32" id="currentSchool.currentSchoolAddress_city" name="currentSchool.currentSchoolAddress.city" title="<g:message code="address.property.city.validationError" />" />
            <input type="hidden" value="${rqt.currentSchool?.currentSchoolAddress?.cityInseeCode}" id="currentSchool.currentSchoolAddress_cityInseeCode" name="currentSchool.currentSchoolAddress.cityInseeCode" />
            <label for="currentSchool.currentSchoolAddress.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" class="validate-addressLine38 ${rqt.stepStates['currentStudies'].invalidFields.contains('currentSchool.currentSchoolAddress.countryName') ? 'validation-failed' : ''}" value="${rqt.currentSchool?.currentSchoolAddress?.countryName}" maxlength="38" id="currentSchool.currentSchoolAddress.countryName" name="currentSchool.currentSchoolAddress.countryName" />
            </div>
            

    
    </fieldset>
  

  
    <fieldset class="required">
    <legend><g:message code="sgr.property.alevelsInformations.label" /></legend>
    
      <label for="alevelsInformations.alevelsDate" class="required"><g:message code="sgr.property.alevelsDate.label" /> *  <span><g:message code="sgr.property.alevelsDate.help" /></span></label>
            <input type="text" id="alevelsInformations.alevelsDate" name="alevelsInformations.alevelsDate" value="${rqt.alevelsInformations?.alevelsDate?.toString()}" 
                    class="required  validate-regex ${rqt.stepStates['currentStudies'].invalidFields.contains('alevelsInformations.alevelsDate') ? 'validation-failed' : ''}" title="<g:message code="sgr.property.alevelsDate.validationError" />" regex="^\d{2,4}$" maxlength="4" />
            

    
      <label for="alevelsInformations.alevels" class="required"><g:message code="sgr.property.alevels.label" /> *  <span><g:message code="sgr.property.alevels.help" /></span></label>
            <select id="alevelsInformations.alevels" name="alevelsInformations.alevels" class="required  validate-not-first ${rqt.stepStates['currentStudies'].invalidFields.contains('alevelsInformations.alevels') ? 'validation-failed' : ''}" title="<g:message code="sgr.property.alevels.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['ES','L','S','STG','STI','STL','ST2S','STAV','TMD','H','P']}">
                <option value="${it}" ${it == rqt.alevelsInformations?.alevels?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="sgr.property.alevels" /></option>
              </g:each>
            </select>
            

    
    </fieldset>
  

  
    <fieldset class="">
    <legend><g:message code="sgr.property.currentStudiesInformations.label" /></legend>
    
      <label for="currentStudiesInformations.currentStudiesDiploma" class="required"><g:message code="sgr.property.currentStudiesDiploma.label" /> *  <span><g:message code="sgr.property.currentStudiesDiploma.help" /></span></label>
            <select id="currentStudiesInformations.currentStudiesDiploma" name="currentStudiesInformations.currentStudiesDiploma" class="required condition-isInOtherStudies-trigger  validate-not-first ${rqt.stepStates['currentStudies'].invalidFields.contains('currentStudiesInformations.currentStudiesDiploma') ? 'validation-failed' : ''}" title="<g:message code="sgr.property.currentStudiesDiploma.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['LICENCE','LICENCE_PRO','MASTER','BTS','DUT','OTHER_STUDIES']}">
                <option value="${it}" ${it == rqt.currentStudiesInformations?.currentStudiesDiploma?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="sgr.property.currentStudiesDiploma" /></option>
              </g:each>
            </select>
            

    
      <label for="currentStudiesInformations.otherStudiesLabel" class="required condition-isInOtherStudies-filled"><g:message code="sgr.property.otherStudiesLabel.label" /> *  <span><g:message code="sgr.property.otherStudiesLabel.help" /></span></label>
            <input type="text" id="currentStudiesInformations.otherStudiesLabel" name="currentStudiesInformations.otherStudiesLabel" value="${rqt.currentStudiesInformations?.otherStudiesLabel?.toString()}" 
                    class="required condition-isInOtherStudies-filled  validate-string ${rqt.stepStates['currentStudies'].invalidFields.contains('currentStudiesInformations.otherStudiesLabel') ? 'validation-failed' : ''}" title="<g:message code="sgr.property.otherStudiesLabel.validationError" />"   />
            

    
      <label for="currentStudiesInformations.currentStudiesLevel" class="required"><g:message code="sgr.property.currentStudiesLevel.label" /> *  <span><g:message code="sgr.property.currentStudiesLevel.help" /></span></label>
            <select id="currentStudiesInformations.currentStudiesLevel" name="currentStudiesInformations.currentStudiesLevel" class="required  validate-not-first ${rqt.stepStates['currentStudies'].invalidFields.contains('currentStudiesInformations.currentStudiesLevel') ? 'validation-failed' : ''}" title="<g:message code="sgr.property.currentStudiesLevel.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['FIRST_YEAR','SECOND_YEAR','THIRD_YEAR']}">
                <option value="${it}" ${it == rqt.currentStudiesInformations?.currentStudiesLevel?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="sgr.property.currentStudiesLevel" /></option>
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
              <g:each in="${['UNKNOWN','AF','ZA','AL','DZ','DE','AD','AO','AI','AQ','AG','AN','SA','AR','AM','AW','AU','AT','AZ','BJ','BS','BH','BD','BB','PW','BE','BZ','BM','BT','BY','MM','BO','BA','BW','BR','BN','BG','BF','BI','CI','KH','CM','CA','CV','CL','CN','CY','CO','KM','CG','KP','KR','CR','HR','CU','DK','DJ','DM','EG','AE','EC','ER','ES','EE','US','ET','FI','FR','GE','GA','GM','GH','GI','GR','GD','GL','GP','GU','GT','GN','GQ','GW','GY','GF','HT','HN','HK','HU','CK','FJ','MH','SB','IN','ID','IR','IQ','IE','IS','IL','IT','JM','JP','JO','KZ','KE','KG','KI','KW','LA','LS','LV','LB','LR','LY','LI','LT','LU','MG','MY','MW','MV','ML','MT','MA','MU','MR','MX','FM','MD','MC','MN','MZ','NP','NA','NR','NI','NE','NG','NU','NO','NZ','OM','UG','UZ','PE','PK','PA','PG','PY','NL','PH','PL','PT','QA','CF','CD','DO','CZ','RO','GB','RU','RW','SN','KN','SM','VA','VC','LC','SV','WS','ST','SC','SL','SG','SI','SK','SO','SD','LK','SE','CH','SR','SZ','SY','TW','TJ','TZ','TD','TH','TL','TG','TO','VT','TN','TM','TR','TV','UA','UY','VU','VE','VN','YE','ZM','ZW','MK']}">
                <option value="${it}" ${it == rqt.currentStudiesInformations?.abroadInternshipSchoolCountry?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="sgr.property.abroadInternshipSchoolCountry" /></option>
              </g:each>
            </select>
            

    
    </fieldset>
  

