


  
    <label for="requesterQuality" class="required"><g:message code="bdr.property.requesterQuality.label" /> *  <span><g:message code="bdr.property.requesterQuality.help" /></span></label>
            <select id="requesterQuality" name="requesterQuality" class="required condition-isOtherRequesterQuality-trigger  validate-not-first ${rqt.stepStates['nature'].invalidFields.contains('requesterQuality') ? 'validation-failed' : ''}" title="<g:message code="bdr.property.requesterQuality.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['REQUESTER','SPOUSE','PARENT','GRAND_PARENT','CHILD','LEGAL_REPRESENTANT','AGENT','HEIR_FAMILY','HEIR','AUTHORIZED','LAWYER_NOTARY','OTHER']}">
                <option value="${it}" ${it == rqt.requesterQuality?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="bdr.property.requesterQuality" /></option>
              </g:each>
            </select>
            

  

  
    <label for="requesterQualityPrecision" class="condition-isOtherRequesterQuality-filled"><g:message code="bdr.property.requesterQualityPrecision.label" />   <span><g:message code="bdr.property.requesterQualityPrecision.help" /></span></label>
            <input type="text" id="requesterQualityPrecision" name="requesterQualityPrecision" value="${rqt.requesterQualityPrecision?.toString()}" 
                    class="condition-isOtherRequesterQuality-filled  validate-string ${rqt.stepStates['nature'].invalidFields.contains('requesterQualityPrecision') ? 'validation-failed' : ''}" title="<g:message code="bdr.property.requesterQualityPrecision.validationError" />"   />
            

  

  
    <label for="birthLastName" class="required"><g:message code="bdr.property.birthLastName.label" /> *  <span><g:message code="bdr.property.birthLastName.help" /></span></label>
            <input type="text" id="birthLastName" name="birthLastName" value="${rqt.birthLastName?.toString()}" 
                    class="required  validate-lastName ${rqt.stepStates['nature'].invalidFields.contains('birthLastName') ? 'validation-failed' : ''}" title="<g:message code="bdr.property.birthLastName.validationError" />"  maxlength="38" />
            

  

  
    <label for="birthMarriageName" class=""><g:message code="bdr.property.birthMarriageName.label" />   <span><g:message code="bdr.property.birthMarriageName.help" /></span></label>
            <input type="text" id="birthMarriageName" name="birthMarriageName" value="${rqt.birthMarriageName?.toString()}" 
                    class="  validate-lastName ${rqt.stepStates['nature'].invalidFields.contains('birthMarriageName') ? 'validation-failed' : ''}" title="<g:message code="bdr.property.birthMarriageName.validationError" />"  maxlength="38" />
            

  

  
    <label for="birthFirstNames" class="required"><g:message code="bdr.property.birthFirstNames.label" /> *  <span><g:message code="bdr.property.birthFirstNames.help" /></span></label>
            <input type="text" id="birthFirstNames" name="birthFirstNames" value="${rqt.birthFirstNames?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['nature'].invalidFields.contains('birthFirstNames') ? 'validation-failed' : ''}" title="<g:message code="bdr.property.birthFirstNames.validationError" />"   />
            

  

  
    <label class="required"><g:message code="bdr.property.birthDate.label" /> *  <span><g:message code="bdr.property.birthDate.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['nature'].invalidFields.contains('birthDate') ? 'validation-failed' : ''}"
                id="birthDate_day"
                name="birthDate_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.birthDate?.date == it
                      || (rqt.birthDate == null && params['birthDate_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['nature'].invalidFields.contains('birthDate') ? 'validation-failed' : ''}"
                id="birthDate_month"
                name="birthDate_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.birthDate?.month == (it - 1)
                      || (rqt.birthDate == null && params['birthDate_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['nature'].invalidFields.contains('birthDate') ? 'validation-failed' : ''}"
                id="birthDate_year"
                name="birthDate_year"
                value="${rqt.birthDate ? rqt.birthDate.year + 1900 : params['birthDate_year']}"
                title="<g:message code="bdr.property.birthDate.validationError" />" />
            </div>
            

  

  
    <label for="birthCity" class="required"><g:message code="bdr.property.birthCity.label" /> *  <span><g:message code="bdr.property.birthCity.help" /></span></label>
            <input type="text" id="birthCity" name="birthCity" value="${rqt.birthCity?.toString()}" 
                    class="required  validate-city ${rqt.stepStates['nature'].invalidFields.contains('birthCity') ? 'validation-failed' : ''}" title="<g:message code="bdr.property.birthCity.validationError" />"  maxlength="32" />
            

  

  
    <label for="birthPostalCode" class="required"><g:message code="bdr.property.birthPostalCode.label" /> *  <span><g:message code="bdr.property.birthPostalCode.help" /></span></label>
            <select id="birthPostalCode" name="birthPostalCode" class="required  validate-not-first ${rqt.stepStates['nature'].invalidFields.contains('birthPostalCode') ? 'validation-failed' : ''}" title="<g:message code="bdr.property.birthPostalCode.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['NONE','D_E_P01','D_E_P02','D_E_P03','D_E_P04','D_E_P05','D_E_P06','D_E_P07','D_E_P08','D_E_P09','D_E_P10','D_E_P11','D_E_P12','D_E_P13','D_E_P14','D_E_P15','D_E_P16','D_E_P17','D_E_P18','D_E_P19','D_E_P2_A','D_E_P2_B','D_E_P21','D_E_P22','D_E_P23','D_E_P24','D_E_P25','D_E_P26','D_E_P27','D_E_P28','D_E_P29','D_E_P30','D_E_P31','D_E_P32','D_E_P33','D_E_P34','D_E_P35','D_E_P36','D_E_P37','D_E_P38','D_E_P39','D_E_P40','D_E_P41','D_E_P42','D_E_P43','D_E_P44','D_E_P45','D_E_P46','D_E_P47','D_E_P48','D_E_P49','D_E_P50','D_E_P51','D_E_P52','D_E_P53','D_E_P54','D_E_P55','D_E_P56','D_E_P57','D_E_P58','D_E_P59','D_E_P60','D_E_P61','D_E_P62','D_E_P63','D_E_P64','D_E_P65','D_E_P66','D_E_P67','D_E_P68','D_E_P69','D_E_P70','D_E_P71','D_E_P72','D_E_P73','D_E_P74','D_E_P75','D_E_P76','D_E_P77','D_E_P78','D_E_P79','D_E_P80','D_E_P81','D_E_P82','D_E_P83','D_E_P84','D_E_P85','D_E_P86','D_E_P87','D_E_P88','D_E_P89','D_E_P90','D_E_P91','D_E_P92','D_E_P93','D_E_P94','D_E_P95','D_E_P971','D_E_P972','D_E_P973','D_E_P974']}">
                <option value="${it}" ${it == rqt.birthPostalCode?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="bdr.property.birthPostalCode" /></option>
              </g:each>
            </select>
            

  

