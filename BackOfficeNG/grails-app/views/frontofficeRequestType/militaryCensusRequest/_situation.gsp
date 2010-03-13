


  
    <fieldset class="required">
    <legend><g:message code="mcr.property.familySituationInformation.label" /></legend>
    
      <label for="familySituationInformation.aliveChildren" class="required"><g:message code="mcr.property.aliveChildren.label" /> *  <span><g:message code="mcr.property.aliveChildren.help" /></span></label>
            <input type="text" id="familySituationInformation.aliveChildren" name="familySituationInformation.aliveChildren" value="${rqt.familySituationInformation?.aliveChildren?.toString()}" 
                    class="required  validate-positiveInteger ${rqt.stepStates['situation'].invalidFields.contains('familySituationInformation.aliveChildren') ? 'validation-failed' : ''}" title="<g:message code="mcr.property.aliveChildren.validationError" />"   />
            

    
      <label for="familySituationInformation.childStatus" class="required"><g:message code="mcr.property.childStatus.label" /> *  <span><g:message code="mcr.property.childStatus.help" /></span></label>
            <select id="familySituationInformation.childStatus" name="familySituationInformation.childStatus" class="required  validate-not-first ${rqt.stepStates['situation'].invalidFields.contains('familySituationInformation.childStatus') ? 'validation-failed' : ''}" title="<g:message code="mcr.property.childStatus.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['Married','Single','Divorced','Widow','CommonLawMarriage','PACS','Other']}">
                <option value="fr.cg95.cvq.business.users.FamilyStatusType_${it}" ${it == rqt.childStatus?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mcr.property.childStatus" /></option>
              <g:each in="${['MARRIED','SINGLE','DIVORCED','WIDOW','COMMON_LAW_MARRIAGE','SEPARATED','P_A_C_S','OTHER']}">
                <option value="${it}" ${it == rqt.childStatus?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mcr.property.childStatus" /></option>
              <g:each in="${['Married','Single','Divorced','Widow','CommonLawMarriage','PACS','Other']}">
                <option value="fr.cg95.cvq.business.users.FamilyStatusType_${it}" ${it == rqt.familySituationInformation?.childStatus?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mcr.property.childStatus" /></option>
              </g:each>
            </select>
            

    
      <label for="familySituationInformation.childrenInCharge" class="required"><g:message code="mcr.property.childrenInCharge.label" /> *  <span><g:message code="mcr.property.childrenInCharge.help" /></span></label>
            <input type="text" id="familySituationInformation.childrenInCharge" name="familySituationInformation.childrenInCharge" value="${rqt.familySituationInformation?.childrenInCharge?.toString()}" 
                    class="required  validate-positiveInteger ${rqt.stepStates['situation'].invalidFields.contains('familySituationInformation.childrenInCharge') ? 'validation-failed' : ''}" title="<g:message code="mcr.property.childrenInCharge.validationError" />"   />
            

    
      <label for="familySituationInformation.otherSituation" class=""><g:message code="mcr.property.otherSituation.label" />   <span><g:message code="mcr.property.otherSituation.help" /></span></label>
            <input type="text" id="familySituationInformation.otherSituation" name="familySituationInformation.otherSituation" value="${rqt.familySituationInformation?.otherSituation?.toString()}" 
                    class="  validate-string ${rqt.stepStates['situation'].invalidFields.contains('familySituationInformation.otherSituation') ? 'validation-failed' : ''}" title="<g:message code="mcr.property.otherSituation.validationError" />"   />
            

    
      <label class="required"><g:message code="mcr.property.statePupil.label" /> *  <span><g:message code="mcr.property.statePupil.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['situation'].invalidFields.contains('familySituationInformation.statePupil') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="familySituationInformation.statePupil_${it ? 'yes' : 'no'}" class="required  validate-one-required boolean" title="" value="${it}" name="familySituationInformation.statePupil" ${it == rqt.familySituationInformation?.statePupil ? 'checked="checked"': ''} />
                <label for="familySituationInformation.statePupil_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label class="required"><g:message code="mcr.property.prefectPupil.label" /> *  <span><g:message code="mcr.property.prefectPupil.help" /></span></label>
            <ul class="yes-no required ${rqt.stepStates['situation'].invalidFields.contains('familySituationInformation.prefectPupil') ? 'validation-failed' : ''}">
              <g:each in="${[true,false]}">
              <li>
                <input type="radio" id="familySituationInformation.prefectPupil_${it ? 'yes' : 'no'}" class="required condition-isPrefectPupil-trigger  validate-one-required boolean" title="" value="${it}" name="familySituationInformation.prefectPupil" ${it == rqt.familySituationInformation?.prefectPupil ? 'checked="checked"': ''} />
                <label for="familySituationInformation.prefectPupil_${it ? 'yes' : 'no'}"><g:message code="message.${it ? 'yes' : 'no'}" /></label>
              </li>
              </g:each>
            </ul>
            

    
      <label for="familySituationInformation.prefectPupilDepartment" class="required condition-isPrefectPupil-filled"><g:message code="mcr.property.prefectPupilDepartment.label" /> *  <span><g:message code="mcr.property.prefectPupilDepartment.help" /></span></label>
            <select id="familySituationInformation.prefectPupilDepartment" name="familySituationInformation.prefectPupilDepartment" class="required condition-isPrefectPupil-filled  validate-not-first ${rqt.stepStates['situation'].invalidFields.contains('familySituationInformation.prefectPupilDepartment') ? 'validation-failed' : ''}" title="<g:message code="mcr.property.prefectPupilDepartment.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['None','DEP_01','DEP_02','DEP_03','DEP_04','DEP_05','DEP_06','DEP_07','DEP_08','DEP_09','DEP_10','DEP_11','DEP_12','DEP_13','DEP_14','DEP_15','DEP_16','DEP_17','DEP_18','DEP_19','DEP_2A','DEP_2B','DEP_21','DEP_22','DEP_23','DEP_24','DEP_25','DEP_26','DEP_27','DEP_28','DEP_29','DEP_30','DEP_31','DEP_32','DEP_33','DEP_34','DEP_35','DEP_36','DEP_37','DEP_38','DEP_39','DEP_40','DEP_41','DEP_42','DEP_43','DEP_44','DEP_45','DEP_46','DEP_47','DEP_48','DEP_49','DEP_50','DEP_51','DEP_52','DEP_53','DEP_54','DEP_55','DEP_56','DEP_57','DEP_58','DEP_59','DEP_60','DEP_61','DEP_62','DEP_63','DEP_64','DEP_65','DEP_66','DEP_67','DEP_68','DEP_69','DEP_70','DEP_71','DEP_72','DEP_73','DEP_74','DEP_75','DEP_76','DEP_77','DEP_78','DEP_79','DEP_80','DEP_81','DEP_82','DEP_83','DEP_84','DEP_85','DEP_86','DEP_87','DEP_88','DEP_89','DEP_90','DEP_91','DEP_92','DEP_93','DEP_94','DEP_95','DEP_971','DEP_972','DEP_973','DEP_974']}">
                <option value="fr.cg95.cvq.business.users.InseeDepartementCodeType_${it}" ${it == rqt.prefectPupilDepartment?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mcr.property.prefectPupilDepartment" /></option>
              <g:each in="${['NONE','D_E_P01','D_E_P02','D_E_P03','D_E_P04','D_E_P05','D_E_P06','D_E_P07','D_E_P08','D_E_P09','D_E_P10','D_E_P11','D_E_P12','D_E_P13','D_E_P14','D_E_P15','D_E_P16','D_E_P17','D_E_P18','D_E_P19','D_E_P2_A','D_E_P2_B','D_E_P21','D_E_P22','D_E_P23','D_E_P24','D_E_P25','D_E_P26','D_E_P27','D_E_P28','D_E_P29','D_E_P30','D_E_P31','D_E_P32','D_E_P33','D_E_P34','D_E_P35','D_E_P36','D_E_P37','D_E_P38','D_E_P39','D_E_P40','D_E_P41','D_E_P42','D_E_P43','D_E_P44','D_E_P45','D_E_P46','D_E_P47','D_E_P48','D_E_P49','D_E_P50','D_E_P51','D_E_P52','D_E_P53','D_E_P54','D_E_P55','D_E_P56','D_E_P57','D_E_P58','D_E_P59','D_E_P60','D_E_P61','D_E_P62','D_E_P63','D_E_P64','D_E_P65','D_E_P66','D_E_P67','D_E_P68','D_E_P69','D_E_P70','D_E_P71','D_E_P72','D_E_P73','D_E_P74','D_E_P75','D_E_P76','D_E_P77','D_E_P78','D_E_P79','D_E_P80','D_E_P81','D_E_P82','D_E_P83','D_E_P84','D_E_P85','D_E_P86','D_E_P87','D_E_P88','D_E_P89','D_E_P90','D_E_P91','D_E_P92','D_E_P93','D_E_P94','D_E_P95','D_E_P971','D_E_P972','D_E_P973','D_E_P974']}">
                <option value="${it}" ${it == rqt.prefectPupilDepartment?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mcr.property.prefectPupilDepartment" /></option>
              <g:each in="${['None','DEP_01','DEP_02','DEP_03','DEP_04','DEP_05','DEP_06','DEP_07','DEP_08','DEP_09','DEP_10','DEP_11','DEP_12','DEP_13','DEP_14','DEP_15','DEP_16','DEP_17','DEP_18','DEP_19','DEP_2A','DEP_2B','DEP_21','DEP_22','DEP_23','DEP_24','DEP_25','DEP_26','DEP_27','DEP_28','DEP_29','DEP_30','DEP_31','DEP_32','DEP_33','DEP_34','DEP_35','DEP_36','DEP_37','DEP_38','DEP_39','DEP_40','DEP_41','DEP_42','DEP_43','DEP_44','DEP_45','DEP_46','DEP_47','DEP_48','DEP_49','DEP_50','DEP_51','DEP_52','DEP_53','DEP_54','DEP_55','DEP_56','DEP_57','DEP_58','DEP_59','DEP_60','DEP_61','DEP_62','DEP_63','DEP_64','DEP_65','DEP_66','DEP_67','DEP_68','DEP_69','DEP_70','DEP_71','DEP_72','DEP_73','DEP_74','DEP_75','DEP_76','DEP_77','DEP_78','DEP_79','DEP_80','DEP_81','DEP_82','DEP_83','DEP_84','DEP_85','DEP_86','DEP_87','DEP_88','DEP_89','DEP_90','DEP_91','DEP_92','DEP_93','DEP_94','DEP_95','DEP_971','DEP_972','DEP_973','DEP_974']}">
                <option value="fr.cg95.cvq.business.users.InseeDepartementCodeType_${it}" ${it == rqt.familySituationInformation?.prefectPupilDepartment?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mcr.property.prefectPupilDepartment" /></option>
              </g:each>
            </select>
            

    
    </fieldset>
  

  
    <fieldset class="required">
    <legend><g:message code="mcr.property.professionalSituationInformation.label" /></legend>
    
      <label for="professionalSituationInformation.childSituation" class="required"><g:message code="mcr.property.childSituation.label" /> *  <span><g:message code="mcr.property.childSituation.help" /></span></label>
            <select id="professionalSituationInformation.childSituation" name="professionalSituationInformation.childSituation" class="required  validate-not-first ${rqt.stepStates['situation'].invalidFields.contains('professionalSituationInformation.childSituation') ? 'validation-failed' : ''}" title="<g:message code="mcr.property.childSituation.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['College','Highschool','Student','Employee','Apprentice','Other','Unknown']}">
                <option value="fr.cg95.cvq.business.request.military.ChildSituationType_${it}" ${it == rqt.childSituation?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mcr.property.childSituation" /></option>
              <g:each in="${['COLLEGE','HIGHSCHOOL','STUDENT','EMPLOYEE','APPRENTICE','OTHER','UNKNOWN']}">
                <option value="${it}" ${it == rqt.childSituation?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mcr.property.childSituation" /></option>
              <g:each in="${['College','Highschool','Student','Employee','Apprentice','Other','Unknown']}">
                <option value="fr.cg95.cvq.business.request.military.ChildSituationType_${it}" ${it == rqt.professionalSituationInformation?.childSituation?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mcr.property.childSituation" /></option>
              </g:each>
            </select>
            

    
      <label for="professionalSituationInformation.childDiploma" class="required"><g:message code="mcr.property.childDiploma.label" /> *  <span><g:message code="mcr.property.childDiploma.help" /></span></label>
            <select id="professionalSituationInformation.childDiploma" name="professionalSituationInformation.childDiploma" class="required  validate-not-first ${rqt.stepStates['situation'].invalidFields.contains('professionalSituationInformation.childDiploma') ? 'validation-failed' : ''}" title="<g:message code="mcr.property.childDiploma.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['BAC','BEP','BEPC','Brevet','CFG','CAP','DAEU','DEA','DEUG','Licence','Maitrise','Unknown']}">
                <option value="fr.cg95.cvq.business.request.military.ChildDiplomaType_${it}" ${it == rqt.childDiploma?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mcr.property.childDiploma" /></option>
              <g:each in="${['B_A_C','B_E_P','B_E_P_C','BREVET','C_F_G','C_A_P','D_A_E_U','D_E_A','D_E_U_G','LICENCE','MAITRISE','UNKNOWN']}">
                <option value="${it}" ${it == rqt.childDiploma?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mcr.property.childDiploma" /></option>
              <g:each in="${['BAC','BEP','BEPC','Brevet','CFG','CAP','DAEU','DEA','DEUG','Licence','Maitrise','Unknown']}">
                <option value="fr.cg95.cvq.business.request.military.ChildDiplomaType_${it}" ${it == rqt.professionalSituationInformation?.childDiploma?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mcr.property.childDiploma" /></option>
              </g:each>
            </select>
            

    
      <label for="professionalSituationInformation.childSpeciality" class=""><g:message code="mcr.property.childSpeciality.label" />   <span><g:message code="mcr.property.childSpeciality.help" /></span></label>
            <input type="text" id="professionalSituationInformation.childSpeciality" name="professionalSituationInformation.childSpeciality" value="${rqt.professionalSituationInformation?.childSpeciality?.toString()}" 
                    class="  validate-string ${rqt.stepStates['situation'].invalidFields.contains('professionalSituationInformation.childSpeciality') ? 'validation-failed' : ''}" title="<g:message code="mcr.property.childSpeciality.validationError" />"   />
            

    
      <label for="professionalSituationInformation.childProfession" class=""><g:message code="mcr.property.childProfession.label" />   <span><g:message code="mcr.property.childProfession.help" /></span></label>
            <input type="text" id="professionalSituationInformation.childProfession" name="professionalSituationInformation.childProfession" value="${rqt.professionalSituationInformation?.childProfession?.toString()}" 
                    class="  validate-string ${rqt.stepStates['situation'].invalidFields.contains('professionalSituationInformation.childProfession') ? 'validation-failed' : ''}" title="<g:message code="mcr.property.childProfession.validationError" />"   />
            

    
    </fieldset>
  

