


  
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
              <g:each in="${['None','DEP_01','DEP_02','DEP_03','DEP_04','DEP_05','DEP_06','DEP_07','DEP_08','DEP_09','DEP_10','DEP_11','DEP_12','DEP_13','DEP_14','DEP_15','DEP_16','DEP_17','DEP_18','DEP_19','DEP_2A','DEP_2B','DEP_21','DEP_22','DEP_23','DEP_24','DEP_25','DEP_26','DEP_27','DEP_28','DEP_29','DEP_30','DEP_31','DEP_32','DEP_33','DEP_34','DEP_35','DEP_36','DEP_37','DEP_38','DEP_39','DEP_40','DEP_41','DEP_42','DEP_43','DEP_44','DEP_45','DEP_46','DEP_47','DEP_48','DEP_49','DEP_50','DEP_51','DEP_52','DEP_53','DEP_54','DEP_55','DEP_56','DEP_57','DEP_58','DEP_59','DEP_60','DEP_61','DEP_62','DEP_63','DEP_64','DEP_65','DEP_66','DEP_67','DEP_68','DEP_69','DEP_70','DEP_71','DEP_72','DEP_73','DEP_74','DEP_75','DEP_76','DEP_77','DEP_78','DEP_79','DEP_80','DEP_81','DEP_82','DEP_83','DEP_84','DEP_85','DEP_86','DEP_87','DEP_88','DEP_89','DEP_90','DEP_91','DEP_92','DEP_93','DEP_94','DEP_95','DEP_971','DEP_972','DEP_973','DEP_974']}">
                <option value="fr.cg95.cvq.business.users.InseeDepartementCodeType_${it}" ${it == rqt.marriage?.marriagePostalCode?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mdr.property.marriagePostalCode" /></option>
              </g:each>
            </select>
            

    
    </fieldset>
  

