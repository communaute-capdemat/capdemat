


  
    <label for="requesterQuality" class=""><g:message code="mdr.property.requesterQuality.label" />   <span><g:message code="mdr.property.requesterQuality.help" /></span></label>
            <select id="requesterQuality" name="requesterQuality" class="condition-isOtherRequesterQuality-trigger  validate-select ${rqt.stepStates['nature'].invalidFields.contains('requesterQuality') ? 'validation-failed' : ''}" title="<g:message code="mdr.property.requesterQuality.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['REQUESTER','SPOUSE','PARENT','GRAND_PARENT','CHILD','LEGAL_REPRESENTANT','AGENT','HEIR_FAMILY','HEIR','AUTHORIZED','LAWYER_NOTARY','OTHER']}">
                <option value="${it}" ${it == rqt.requesterQuality?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mdr.property.requesterQuality" /></option>
              </g:each>
            </select>
            

  

  
    <label for="requesterQualityPrecision" class="condition-isOtherRequesterQuality-filled"><g:message code="mdr.property.requesterQualityPrecision.label" />   <span><g:message code="mdr.property.requesterQualityPrecision.help" /></span></label>
            <input type="text" id="requesterQualityPrecision" name="requesterQualityPrecision" value="${rqt.requesterQualityPrecision?.toString()}" 
                    class="condition-isOtherRequesterQuality-filled  validate-string ${rqt.stepStates['nature'].invalidFields.contains('requesterQualityPrecision') ? 'validation-failed' : ''}" title="<g:message code="mdr.property.requesterQualityPrecision.validationError" />"   />
            

  

  
    <fieldset class="required">
    <legend><g:message code="mdr.property.marriageHusband.label" /></legend>
    
      <label for="marriageHusband.marriageHusbandLastName" class="required"><g:message code="mdr.property.marriageHusbandLastName.label" /> *  <span><g:message code="mdr.property.marriageHusbandLastName.help" /></span></label>
            <input type="text" id="marriageHusband.marriageHusbandLastName" name="marriageHusband.marriageHusbandLastName" value="${rqt.marriageHusband?.marriageHusbandLastName?.toString()}" 
                    class="required  validate-lastName ${rqt.stepStates['nature'].invalidFields.contains('marriageHusband.marriageHusbandLastName') ? 'validation-failed' : ''}" title="<g:message code="mdr.property.marriageHusbandLastName.validationError" />"  maxlength="38" />
            

    
      <label for="marriageHusband.marriageHusbandFirstNames" class="required"><g:message code="mdr.property.marriageHusbandFirstNames.label" /> *  <span><g:message code="mdr.property.marriageHusbandFirstNames.help" /></span></label>
            <input type="text" id="marriageHusband.marriageHusbandFirstNames" name="marriageHusband.marriageHusbandFirstNames" value="${rqt.marriageHusband?.marriageHusbandFirstNames?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['nature'].invalidFields.contains('marriageHusband.marriageHusbandFirstNames') ? 'validation-failed' : ''}" title="<g:message code="mdr.property.marriageHusbandFirstNames.validationError" />"   />
            

    
    </fieldset>
  

  
    <fieldset class="required">
    <legend><g:message code="mdr.property.marriageWife.label" /></legend>
    
      <label for="marriageWife.marriageWifeLastName" class="required"><g:message code="mdr.property.marriageWifeLastName.label" /> *  <span><g:message code="mdr.property.marriageWifeLastName.help" /></span></label>
            <input type="text" id="marriageWife.marriageWifeLastName" name="marriageWife.marriageWifeLastName" value="${rqt.marriageWife?.marriageWifeLastName?.toString()}" 
                    class="required  validate-lastName ${rqt.stepStates['nature'].invalidFields.contains('marriageWife.marriageWifeLastName') ? 'validation-failed' : ''}" title="<g:message code="mdr.property.marriageWifeLastName.validationError" />"  maxlength="38" />
            

    
      <label for="marriageWife.marriageWifeFirstNames" class="required"><g:message code="mdr.property.marriageWifeFirstNames.label" /> *  <span><g:message code="mdr.property.marriageWifeFirstNames.help" /></span></label>
            <input type="text" id="marriageWife.marriageWifeFirstNames" name="marriageWife.marriageWifeFirstNames" value="${rqt.marriageWife?.marriageWifeFirstNames?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['nature'].invalidFields.contains('marriageWife.marriageWifeFirstNames') ? 'validation-failed' : ''}" title="<g:message code="mdr.property.marriageWifeFirstNames.validationError" />"   />
            

    
    </fieldset>
  

  
    <fieldset class="required">
    <legend><g:message code="mdr.property.marriage.label" /></legend>
    
      <label class="required"><g:message code="mdr.property.marriageDate.label" /> *  <span><g:message code="mdr.property.marriageDate.help" /></span></label>
            <div class="date required  validate-date required ">
              <select class="day ${rqt.stepStates['nature'].invalidFields.contains('marriage.marriageDate') ? 'validation-failed' : ''}"
                id="marriage.marriageDate_day"
                name="marriage.marriageDate_day">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..31}">
                  <option value="${it}"
                    <g:if test="${rqt.marriage?.marriageDate?.date == it
                      || (rqt.marriage?.marriageDate == null && params['marriage.marriageDate_day'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    ${it}
                  </option>
                </g:each>
              </select>
              <select class="month ${rqt.stepStates['nature'].invalidFields.contains('marriage.marriageDate') ? 'validation-failed' : ''}"
                id="marriage.marriageDate_month"
                name="marriage.marriageDate_month">
                <option value=""><g:message code="message.select.defaultOption" /></option>
                <g:each in="${1..12}">
                  <option value="${it}"
                    <g:if test="${rqt.marriage?.marriageDate?.month == (it - 1)
                      || (rqt.marriage?.marriageDate == null && params['marriage.marriageDate_month'] == it.toString())}">
                      selected="selected"
                    </g:if>>
                    <g:message code="month.${it}" />
                  </option>
                </g:each>
              </select>
              <input type="text" maxlength="4" size="3"
                class="year ${rqt.stepStates['nature'].invalidFields.contains('marriage.marriageDate') ? 'validation-failed' : ''}"
                id="marriage.marriageDate_year"
                name="marriage.marriageDate_year"
                value="${rqt.marriage?.marriageDate ? rqt.marriage?.marriageDate.year + 1900 : params['marriage.marriageDate_year']}"
                title="<g:message code="mdr.property.marriageDate.validationError" />" />
            </div>
            

    
      <label for="marriage.marriageCity" class="required"><g:message code="mdr.property.marriageCity.label" /> *  <span><g:message code="mdr.property.marriageCity.help" /></span></label>
            <input type="text" id="marriage.marriageCity" name="marriage.marriageCity" value="${rqt.marriage?.marriageCity?.toString()}" 
                    class="required  validate-city ${rqt.stepStates['nature'].invalidFields.contains('marriage.marriageCity') ? 'validation-failed' : ''}" title="<g:message code="mdr.property.marriageCity.validationError" />"  maxlength="32" />
            

    
      <label for="marriage.marriagePostalCode" class="required"><g:message code="mdr.property.marriagePostalCode.label" /> *  <span><g:message code="mdr.property.marriagePostalCode.help" /></span></label>
            <select id="marriage.marriagePostalCode" name="marriage.marriagePostalCode" class="required  validate-not-first ${rqt.stepStates['nature'].invalidFields.contains('marriage.marriagePostalCode') ? 'validation-failed' : ''}" title="<g:message code="mdr.property.marriagePostalCode.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['NONE','D_E_P01','D_E_P02','D_E_P03','D_E_P04','D_E_P05','D_E_P06','D_E_P07','D_E_P08','D_E_P09','D_E_P10','D_E_P11','D_E_P12','D_E_P13','D_E_P14','D_E_P15','D_E_P16','D_E_P17','D_E_P18','D_E_P19','D_E_P2_A','D_E_P2_B','D_E_P21','D_E_P22','D_E_P23','D_E_P24','D_E_P25','D_E_P26','D_E_P27','D_E_P28','D_E_P29','D_E_P30','D_E_P31','D_E_P32','D_E_P33','D_E_P34','D_E_P35','D_E_P36','D_E_P37','D_E_P38','D_E_P39','D_E_P40','D_E_P41','D_E_P42','D_E_P43','D_E_P44','D_E_P45','D_E_P46','D_E_P47','D_E_P48','D_E_P49','D_E_P50','D_E_P51','D_E_P52','D_E_P53','D_E_P54','D_E_P55','D_E_P56','D_E_P57','D_E_P58','D_E_P59','D_E_P60','D_E_P61','D_E_P62','D_E_P63','D_E_P64','D_E_P65','D_E_P66','D_E_P67','D_E_P68','D_E_P69','D_E_P70','D_E_P71','D_E_P72','D_E_P73','D_E_P74','D_E_P75','D_E_P76','D_E_P77','D_E_P78','D_E_P79','D_E_P80','D_E_P81','D_E_P82','D_E_P83','D_E_P84','D_E_P85','D_E_P86','D_E_P87','D_E_P88','D_E_P89','D_E_P90','D_E_P91','D_E_P92','D_E_P93','D_E_P94','D_E_P95','D_E_P971','D_E_P972','D_E_P973','D_E_P974']}">
                <option value="${it}" ${it == rqt.marriage?.marriagePostalCode?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mdr.property.marriagePostalCode" /></option>
              </g:each>
            </select>
            

    
    </fieldset>
  

