


  
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
              <g:each in="${['None','DEP_01','DEP_02','DEP_03','DEP_04','DEP_05','DEP_06','DEP_07','DEP_08','DEP_09','DEP_10','DEP_11','DEP_12','DEP_13','DEP_14','DEP_15','DEP_16','DEP_17','DEP_18','DEP_19','DEP_2A','DEP_2B','DEP_21','DEP_22','DEP_23','DEP_24','DEP_25','DEP_26','DEP_27','DEP_28','DEP_29','DEP_30','DEP_31','DEP_32','DEP_33','DEP_34','DEP_35','DEP_36','DEP_37','DEP_38','DEP_39','DEP_40','DEP_41','DEP_42','DEP_43','DEP_44','DEP_45','DEP_46','DEP_47','DEP_48','DEP_49','DEP_50','DEP_51','DEP_52','DEP_53','DEP_54','DEP_55','DEP_56','DEP_57','DEP_58','DEP_59','DEP_60','DEP_61','DEP_62','DEP_63','DEP_64','DEP_65','DEP_66','DEP_67','DEP_68','DEP_69','DEP_70','DEP_71','DEP_72','DEP_73','DEP_74','DEP_75','DEP_76','DEP_77','DEP_78','DEP_79','DEP_80','DEP_81','DEP_82','DEP_83','DEP_84','DEP_85','DEP_86','DEP_87','DEP_88','DEP_89','DEP_90','DEP_91','DEP_92','DEP_93','DEP_94','DEP_95','DEP_971','DEP_972','DEP_973','DEP_974']}">
                <option value="fr.cg95.cvq.business.users.InseeDepartementCodeType_${it}" ${it == rqt.deathPostalCode?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="ddr.property.deathPostalCode" /></option>
              </g:each>
            </select>
            

  

