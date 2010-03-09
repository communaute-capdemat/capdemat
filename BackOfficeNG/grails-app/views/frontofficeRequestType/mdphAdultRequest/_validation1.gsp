


  
    <h3><g:message code="mar.step.demandeOrientationMedicoSociale.label" /></h3>
    
      
      <dl>
        <dt><g:message code="mar.property.situationActuelle.label" /></dt>
          <dd>
            <g:if test="${rqt.situationActuelle}">
              <g:capdematEnumToField var="${rqt.situationActuelle}" i18nKeyPrefix="mar.property.situationActuelle" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.situationActuellePrecision.label" /></dt><dd>${rqt.situationActuellePrecision?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.orientationSouhaitee.label" /></dt>
          <dd>
            <g:if test="${rqt.orientationSouhaitee}">
              <g:capdematEnumToField var="${rqt.orientationSouhaitee}" i18nKeyPrefix="mar.property.orientationSouhaitee" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.dateEntreeSouhaitee.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.dateEntreeSouhaitee}"/></dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.preferenceEtablissementOuService.label" /></dt>
          <dd><g:message code="message.${rqt.preferenceEtablissementOuService ? 'yes' : 'no'}" /></dd>
          

      </dl>
      
    
      
      <h4><g:message code="mar.property.precisionPreferenceEtablissementOuService.label" /></h4>
      <dl>
        
          <dt><g:message code="mar.property.nomEtablissementPreference.label" /></dt><dd>${rqt.precisionPreferenceEtablissementOuService?.nomEtablissementPreference?.toString()}</dd>

        
          <dt><g:message code="mar.property.codePostalEtablissementPreference.label" /></dt><dd>${rqt.precisionPreferenceEtablissementOuService?.codePostalEtablissementPreference?.toString()}</dd>

        
          <dt><g:message code="mar.property.communeEtablissementPreference.label" /></dt><dd>${rqt.precisionPreferenceEtablissementOuService?.communeEtablissementPreference?.toString()}</dd>

        
          <dt><g:message code="mar.property.telephoneEtablissementPreference.label" /></dt><dd>${rqt.precisionPreferenceEtablissementOuService?.telephoneEtablissementPreference?.toString()}</dd>

        
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
  

  


