


  
    <h3><g:message code="myr.step.demandePrestationCompensation.label" /></h3>
    
      
      <dl>
        <dt><g:message code="myr.property.choixPrestationCompensation.label" /></dt>
          <dd>
            <g:if test="${rqt.choixPrestationCompensation}">
              <g:capdematEnumToField var="${rqt.choixPrestationCompensation}" i18nKeyPrefix="myr.property.choixPrestationCompensation" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.allocationPersonnaliseeAutonomie.label" /></dt>
          <dd><g:message code="message.${rqt.allocationPersonnaliseeAutonomie ? 'yes' : 'no'}" /></dd>
          

      </dl>
      
    
      
      <h4><g:message code="myr.property.besoinsDemandePCH.label" /></h4>
      <dl>
        
          <dt><g:message code="myr.property.aideHumaine.label" /></dt>
          <dd><g:message code="message.${rqt.besoinsDemandePCH?.aideHumaine ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="myr.property.precisionAideHumaine.label" /></dt><dd>${rqt.besoinsDemandePCH?.precisionAideHumaine?.toString()}</dd>

        
          <dt><g:message code="myr.property.aideTechnique.label" /></dt>
          <dd><g:message code="message.${rqt.besoinsDemandePCH?.aideTechnique ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="myr.property.precisionAideTechnique.label" /></dt><dd>${rqt.besoinsDemandePCH?.precisionAideTechnique?.toString()}</dd>

        
          <dt><g:message code="myr.property.amenagementLogementDemenagement.label" /></dt>
          <dd><g:message code="message.${rqt.besoinsDemandePCH?.amenagementLogementDemenagement ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="myr.property.precisionAmenagementLogementDemenagement.label" /></dt><dd>${rqt.besoinsDemandePCH?.precisionAmenagementLogementDemenagement?.toString()}</dd>

        
          <dt><g:message code="myr.property.amenagementVehicule.label" /></dt>
          <dd><g:message code="message.${rqt.besoinsDemandePCH?.amenagementVehicule ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="myr.property.precisionAmenagementVehicule.label" /></dt><dd>${rqt.besoinsDemandePCH?.precisionAmenagementVehicule?.toString()}</dd>

        
          <dt><g:message code="myr.property.chargesSpecifiques.label" /></dt>
          <dd><g:message code="message.${rqt.besoinsDemandePCH?.chargesSpecifiques ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="myr.property.precisionChargesSpecifiques.label" /></dt><dd>${rqt.besoinsDemandePCH?.precisionChargesSpecifiques?.toString()}</dd>

        
          <dt><g:message code="myr.property.aideAnimaliere.label" /></dt>
          <dd><g:message code="message.${rqt.besoinsDemandePCH?.aideAnimaliere ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="myr.property.precisionAideAnimaliere.label" /></dt><dd>${rqt.besoinsDemandePCH?.precisionAideAnimaliere?.toString()}</dd>

        
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
  

  


