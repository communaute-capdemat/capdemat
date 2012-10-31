


  
    <label for="deathLastName" class="required"><g:message code="ddr.property.deathLastName.label" /> *  <span><g:message code="ddr.property.deathLastName.help" /></span></label>
            <input type="text" id="deathLastName" name="deathLastName" value="${rqt.deathLastName?.toString()}" 
                    class="required  validate-lastName ${rqt.stepStates['nature'].invalidFields.contains('deathLastName') ? 'validation-failed' : ''}" title="<g:message code="ddr.property.deathLastName.validationError" />"  maxlength="38" />
            

  

  
    <label for="deathFirstNames" class="required"><g:message code="ddr.property.deathFirstNames.label" /> *  <span><g:message code="ddr.property.deathFirstNames.help" /></span></label>
            <input type="text" id="deathFirstNames" name="deathFirstNames" value="${rqt.deathFirstNames?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['nature'].invalidFields.contains('deathFirstNames') ? 'validation-failed' : ''}" title="<g:message code="ddr.property.deathFirstNames.validationError" />"   />
            

  

  
    <label class="required"><g:message code="ddr.property.deathDate.label" /> *  <span><g:message code="ddr.property.deathDate.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['nature'].invalidFields.contains('deathDate') ? 'validation-failed' : ''}"
                id="deathDate_day"
                name="deathDate_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.deathDate?.date == it
                      || (rqt.deathDate == null && params['deathDate_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['nature'].invalidFields.contains('deathDate') ? 'validation-failed' : ''}"
                id="deathDate_month"
                name="deathDate_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.deathDate?.month == (it - 1)
                      || (rqt.deathDate == null && params['deathDate_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['nature'].invalidFields.contains('deathDate') ? 'validation-failed' : ''}"
                id="deathDate_year"
                name="deathDate_year"
                value="${rqt.deathDate ? rqt.deathDate.year + 1900 : params['deathDate_year']}"
                title="<g:message code="ddr.property.deathDate.validationError" />" />
            </div>
            

  

  
    <label for="deathCity" class="required"><g:message code="ddr.property.deathCity.label" /> *  <span><g:message code="ddr.property.deathCity.help" /></span></label>
            <input type="text" id="deathCity" name="deathCity" value="${rqt.deathCity?.toString()}" 
                    class="required  validate-city ${rqt.stepStates['nature'].invalidFields.contains('deathCity') ? 'validation-failed' : ''}" title="<g:message code="ddr.property.deathCity.validationError" />"  maxlength="32" />
            

  

  
    <label for="deathPostalCode" class="required"><g:message code="ddr.property.deathPostalCode.label" /> *  <span><g:message code="ddr.property.deathPostalCode.help" /></span></label>
            <select id="deathPostalCode" name="deathPostalCode" class="required  validate-not-first ${rqt.stepStates['nature'].invalidFields.contains('deathPostalCode') ? 'validation-failed' : ''}" title="<g:message code="ddr.property.deathPostalCode.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['NONE','D_E_P01','D_E_P02','D_E_P03','D_E_P04','D_E_P05','D_E_P06','D_E_P07','D_E_P08','D_E_P09','D_E_P10','D_E_P11','D_E_P12','D_E_P13','D_E_P14','D_E_P15','D_E_P16','D_E_P17','D_E_P18','D_E_P19','D_E_P2_A','D_E_P2_B','D_E_P21','D_E_P22','D_E_P23','D_E_P24','D_E_P25','D_E_P26','D_E_P27','D_E_P28','D_E_P29','D_E_P30','D_E_P31','D_E_P32','D_E_P33','D_E_P34','D_E_P35','D_E_P36','D_E_P37','D_E_P38','D_E_P39','D_E_P40','D_E_P41','D_E_P42','D_E_P43','D_E_P44','D_E_P45','D_E_P46','D_E_P47','D_E_P48','D_E_P49','D_E_P50','D_E_P51','D_E_P52','D_E_P53','D_E_P54','D_E_P55','D_E_P56','D_E_P57','D_E_P58','D_E_P59','D_E_P60','D_E_P61','D_E_P62','D_E_P63','D_E_P64','D_E_P65','D_E_P66','D_E_P67','D_E_P68','D_E_P69','D_E_P70','D_E_P71','D_E_P72','D_E_P73','D_E_P74','D_E_P75','D_E_P76','D_E_P77','D_E_P78','D_E_P79','D_E_P80','D_E_P81','D_E_P82','D_E_P83','D_E_P84','D_E_P85','D_E_P86','D_E_P87','D_E_P88','D_E_P89','D_E_P90','D_E_P91','D_E_P92','D_E_P93','D_E_P94','D_E_P95','D_E_P971','D_E_P972','D_E_P973','D_E_P974']}">
                <option value="${it}" ${it == rqt.deathPostalCode?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="ddr.property.deathPostalCode" /></option>
              </g:each>
            </select>
            

  

