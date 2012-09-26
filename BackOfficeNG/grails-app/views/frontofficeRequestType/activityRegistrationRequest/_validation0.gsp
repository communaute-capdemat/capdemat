


  
    <h3><g:message code="arr.step.preinscription.label" /></h3>
    
      
      <dl>
        <dt><g:message code="arr.property.subject.label" /></dt>
          <dd>${subjects.get(rqt.subjectId)}</dd>

      </dl>
      
    
      
      <h4><g:message code="arr.property.site.label" /></h4>
      <dl>
        
          <dt><g:message code="arr.property.idSite.label" /></dt><dd>${rqt.idSite?.toString()}</dd>

        
          <dt><g:message code="arr.property.labelSite.label" /></dt><dd>${rqt.labelSite?.toString()}</dd>

        
      </dl>
      
    
      
      <h4><g:message code="arr.property.produit.label" /></h4>
      <dl>
        
          <dt><g:message code="arr.property.idProduit.label" /></dt><dd>${rqt.idProduit?.toString()}</dd>

        
          <dt><g:message code="arr.property.labelProduit.label" /></dt><dd>${rqt.labelProduit?.toString()}</dd>

        
          <dt><g:message code="arr.property.typeProduit.label" /></dt><dd>${rqt.typeProduit?.toString()}</dd>

        
      </dl>
      
    
      
      <h4><g:message code="arr.property.segment.label" /></h4>
      <dl>
        
          <dt><g:message code="arr.property.idSegment.label" /></dt><dd>${rqt.idSegment?.toString()}</dd>

        
          <dt><g:message code="arr.property.labelSegment.label" /></dt><dd>${rqt.labelSegment?.toString()}</dd>

        
      </dl>
      
    
  


  
    <h3><g:message code="arr.step.reglement.label" /></h3>
    
      
      <dl>
        <dt><g:message code="arr.property.reglement.label" /></dt>
          <dd><g:message code="message.${rqt.reglement ? 'yes' : 'no'}" /></dd>
          

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
  


  


