


  
    <h3><g:message code="mcr.step.census.label" /></h3>
    
      
      <dl>
        <dt><g:message code="mcr.property.subject.label" /></dt>
          <dd>${subjects.get(rqt.subjectId)}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mcr.property.childTitle.label" /></dt>
          <dd>
            <g:if test="${rqt.childTitle}">
              <g:capdematEnumToField var="${rqt.childTitle}" i18nKeyPrefix="mcr.property.childTitle" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mcr.property.maidenName.label" /></dt><dd>${rqt.maidenName?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mcr.property.childBirthCountry.label" /></dt>
          <dd>
            <g:if test="${rqt.childBirthCountry}">
              <g:capdematEnumToField var="${rqt.childBirthCountry}" i18nKeyPrefix="mcr.property.childBirthCountry" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mcr.property.childResidenceCountry.label" /></dt>
          <dd>
            <g:if test="${rqt.childResidenceCountry}">
              <g:capdematEnumToField var="${rqt.childResidenceCountry}" i18nKeyPrefix="mcr.property.childResidenceCountry" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mcr.property.childPhone.label" /></dt><dd>${rqt.childPhone?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mcr.property.childMail.label" /></dt><dd>${rqt.childMail?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mcr.property.childCountry.label" /></dt>
          <dd>
            <g:if test="${rqt.childCountry}">
              <g:capdematEnumToField var="${rqt.childCountry}" i18nKeyPrefix="mcr.property.childCountry" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mcr.property.childOtherCountry.label" /></dt>
          <dd>
            <g:if test="${rqt.childOtherCountry}">
              <g:capdematEnumToField var="${rqt.childOtherCountry}" i18nKeyPrefix="mcr.property.childOtherCountry" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mcr.property.childConvention.label" /></dt><dd>${rqt.childConvention?.toString()}</dd>

      </dl>
      
    
  

  
    <h3><g:message code="mcr.step.parentage.label" /></h3>
    
      
      <h4><g:message code="mcr.property.fatherInformation.label" /></h4>
      <dl>
        
          <dt><g:message code="mcr.property.fatherLastName.label" /></dt><dd>${rqt.fatherInformation?.fatherLastName?.toString()}</dd>

        
          <dt><g:message code="mcr.property.fatherFirstName.label" /></dt><dd>${rqt.fatherInformation?.fatherFirstName?.toString()}</dd>

        
          <dt><g:message code="mcr.property.fatherBirthDate.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.fatherInformation?.fatherBirthDate}"/></dd>
          

        
          <dt><g:message code="mcr.property.fatherBirthCity.label" /></dt><dd>${rqt.fatherInformation?.fatherBirthCity?.toString()}</dd>

        
          <dt><g:message code="mcr.property.fatherBirthDepartment.label" /></dt>
          <dd>
            <g:if test="${rqt.fatherInformation?.fatherBirthDepartment}">
              <g:capdematEnumToField var="${rqt.fatherInformation?.fatherBirthDepartment}" i18nKeyPrefix="mcr.property.fatherBirthDepartment" />
            </g:if>
          </dd>
          

        
          <dt><g:message code="mcr.property.fatherBirthCountry.label" /></dt>
          <dd>
            <g:if test="${rqt.fatherInformation?.fatherBirthCountry}">
              <g:capdematEnumToField var="${rqt.fatherInformation?.fatherBirthCountry}" i18nKeyPrefix="mcr.property.fatherBirthCountry" />
            </g:if>
          </dd>
          

        
          <dt><g:message code="mcr.property.fatherNationality.label" /></dt>
          <dd>
            <g:if test="${rqt.fatherInformation?.fatherNationality}">
              <g:capdematEnumToField var="${rqt.fatherInformation?.fatherNationality}" i18nKeyPrefix="mcr.property.fatherNationality" />
            </g:if>
          </dd>
          

        
      </dl>
      
    
      
      <h4><g:message code="mcr.property.motherInformation.label" /></h4>
      <dl>
        
          <dt><g:message code="mcr.property.motherLastName.label" /></dt><dd>${rqt.motherInformation?.motherLastName?.toString()}</dd>

        
          <dt><g:message code="mcr.property.motherFirstName.label" /></dt><dd>${rqt.motherInformation?.motherFirstName?.toString()}</dd>

        
          <dt><g:message code="mcr.property.motherBirthDate.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.motherInformation?.motherBirthDate}"/></dd>
          

        
          <dt><g:message code="mcr.property.motherBirthCity.label" /></dt><dd>${rqt.motherInformation?.motherBirthCity?.toString()}</dd>

        
          <dt><g:message code="mcr.property.motherBirthDepartment.label" /></dt>
          <dd>
            <g:if test="${rqt.motherInformation?.motherBirthDepartment}">
              <g:capdematEnumToField var="${rqt.motherInformation?.motherBirthDepartment}" i18nKeyPrefix="mcr.property.motherBirthDepartment" />
            </g:if>
          </dd>
          

        
          <dt><g:message code="mcr.property.motherBirthCountry.label" /></dt>
          <dd>
            <g:if test="${rqt.motherInformation?.motherBirthCountry}">
              <g:capdematEnumToField var="${rqt.motherInformation?.motherBirthCountry}" i18nKeyPrefix="mcr.property.motherBirthCountry" />
            </g:if>
          </dd>
          

        
          <dt><g:message code="mcr.property.motherNationality.label" /></dt>
          <dd>
            <g:if test="${rqt.motherInformation?.motherNationality}">
              <g:capdematEnumToField var="${rqt.motherInformation?.motherNationality}" i18nKeyPrefix="mcr.property.motherNationality" />
            </g:if>
          </dd>
          

        
      </dl>
      
    
  

  
    <h3><g:message code="mcr.step.situation.label" /></h3>
    
      
      <h4><g:message code="mcr.property.familySituationInformation.label" /></h4>
      <dl>
        
          <dt><g:message code="mcr.property.aliveChildren.label" /></dt><dd>${rqt.familySituationInformation?.aliveChildren?.toString()}</dd>

        
          <dt><g:message code="mcr.property.childStatus.label" /></dt>
          <dd>
            <g:if test="${rqt.familySituationInformation?.childStatus}">
              <g:capdematEnumToField var="${rqt.familySituationInformation?.childStatus}" i18nKeyPrefix="mcr.property.childStatus" />
            </g:if>
          </dd>
          

        
          <dt><g:message code="mcr.property.childrenInCharge.label" /></dt><dd>${rqt.familySituationInformation?.childrenInCharge?.toString()}</dd>

        
          <dt><g:message code="mcr.property.otherSituation.label" /></dt><dd>${rqt.familySituationInformation?.otherSituation?.toString()}</dd>

        
          <dt><g:message code="mcr.property.statePupil.label" /></dt>
          <dd><g:message code="message.${rqt.familySituationInformation?.statePupil ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="mcr.property.prefectPupil.label" /></dt>
          <dd><g:message code="message.${rqt.familySituationInformation?.prefectPupil ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="mcr.property.prefectPupilDepartment.label" /></dt>
          <dd>
            <g:if test="${rqt.familySituationInformation?.prefectPupilDepartment}">
              <g:capdematEnumToField var="${rqt.familySituationInformation?.prefectPupilDepartment}" i18nKeyPrefix="mcr.property.prefectPupilDepartment" />
            </g:if>
          </dd>
          

        
      </dl>
      
    
      
      <h4><g:message code="mcr.property.professionalSituationInformation.label" /></h4>
      <dl>
        
          <dt><g:message code="mcr.property.childSituation.label" /></dt>
          <dd>
            <g:if test="${rqt.professionalSituationInformation?.childSituation}">
              <g:capdematEnumToField var="${rqt.professionalSituationInformation?.childSituation}" i18nKeyPrefix="mcr.property.childSituation" />
            </g:if>
          </dd>
          

        
          <dt><g:message code="mcr.property.childDiploma.label" /></dt>
          <dd>
            <g:if test="${rqt.professionalSituationInformation?.childDiploma}">
              <g:capdematEnumToField var="${rqt.professionalSituationInformation?.childDiploma}" i18nKeyPrefix="mcr.property.childDiploma" />
            </g:if>
          </dd>
          

        
          <dt><g:message code="mcr.property.childSpeciality.label" /></dt><dd>${rqt.professionalSituationInformation?.childSpeciality?.toString()}</dd>

        
          <dt><g:message code="mcr.property.childProfession.label" /></dt><dd>${rqt.professionalSituationInformation?.childProfession?.toString()}</dd>

        
      </dl>
      
    
  

  
    <h3><g:message code="mcr.step.exemption.label" /></h3>
    
      
      <dl>
        <dt><g:message code="mcr.property.japdExemption.label" /></dt>
          <dd><g:message code="message.${rqt.japdExemption ? 'yes' : 'no'}" /></dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mcr.property.highlyInfirm.label" /></dt>
          <dd><g:message code="message.${rqt.highlyInfirm ? 'yes' : 'no'}" /></dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mcr.property.affectionOrDisease.label" /></dt>
          <dd><g:message code="message.${rqt.affectionOrDisease ? 'yes' : 'no'}" /></dd>
          

      </dl>
      
    
  

  
  <g:if test="${!documentsByTypes.isEmpty()}">
    <h3>${message(code:'request.step.document.label')}</h3>
    <g:each in="${documentsByTypes}" var="documentType">
      <h4>${message(code:documentType.value.name)}</h4>
      <g:if test="${documentType.value.associated}">
      <dl class="document-linked">
        <g:each in="${documentType.value.associated}" var="document">
        <dt>
          <g:if test="${document.ecitizenNote}">${message(code:'document.header.description')} : ${document.ecitizenNote}<br/></g:if>
          <g:if test="${document.endValidityDate}">${message(code:'document.header.expireOn')} ${formatDate(date:document.endValidityDate,formatName:'format.date')}</g:if>
        </dt>
        <dd>
          <g:capdematEnumToFlag var="${document.state}" i18nKeyPrefix="document.state" />
          <a href="${createLink(controller:'frontofficeDocument',action:'details', id:document.id)}" target="blank" title="${message(code:'document.message.preview.longdesc')}">${message(code:'document.message.preview')}</a>
        </dd>
        </g:each>
      </dl>
      </g:if>
      <g:else>
        ${message(code:'document.header.noAttachments')}
      </g:else>
    </g:each>
  </g:if>
  

  


