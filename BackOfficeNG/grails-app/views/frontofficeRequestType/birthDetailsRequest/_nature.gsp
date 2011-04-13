


  
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
              <g:each in="${['None','DEP_01','DEP_02','DEP_03','DEP_04','DEP_05','DEP_06','DEP_07','DEP_08','DEP_09','DEP_10','DEP_11','DEP_12','DEP_13','DEP_14','DEP_15','DEP_16','DEP_17','DEP_18','DEP_19','DEP_2A','DEP_2B','DEP_21','DEP_22','DEP_23','DEP_24','DEP_25','DEP_26','DEP_27','DEP_28','DEP_29','DEP_30','DEP_31','DEP_32','DEP_33','DEP_34','DEP_35','DEP_36','DEP_37','DEP_38','DEP_39','DEP_40','DEP_41','DEP_42','DEP_43','DEP_44','DEP_45','DEP_46','DEP_47','DEP_48','DEP_49','DEP_50','DEP_51','DEP_52','DEP_53','DEP_54','DEP_55','DEP_56','DEP_57','DEP_58','DEP_59','DEP_60','DEP_61','DEP_62','DEP_63','DEP_64','DEP_65','DEP_66','DEP_67','DEP_68','DEP_69','DEP_70','DEP_71','DEP_72','DEP_73','DEP_74','DEP_75','DEP_76','DEP_77','DEP_78','DEP_79','DEP_80','DEP_81','DEP_82','DEP_83','DEP_84','DEP_85','DEP_86','DEP_87','DEP_88','DEP_89','DEP_90','DEP_91','DEP_92','DEP_93','DEP_94','DEP_95','DEP_971','DEP_972','DEP_973','DEP_974']}">
                <option value="fr.cg95.cvq.business.users.InseeDepartementCodeType_${it}" ${it == rqt.birthPostalCode?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="bdr.property.birthPostalCode" /></option>
              </g:each>
            </select>
            

  

