


  
    <h3><g:message code="taror.step.general.label" /></h3>
    
      
      <h4><g:message code="taror.property.lieuConcerne.label" /></h4>
      <dl>
        
          <dt><g:message code="taror.property.adresseLieuConcerne.label" /></dt>
          <dd>
          <g:if test="${rqt.adresseLieuConcerne}">
              <p>${rqt.adresseLieuConcerne?.additionalDeliveryInformation}</p>
              <p>${rqt.adresseLieuConcerne?.additionalGeographicalInformation}</p>
              <p>${rqt.adresseLieuConcerne?.streetNumber} ${rqt.adresseLieuConcerne?.streetName}</p>
              <p>${rqt.adresseLieuConcerne?.placeNameOrService}</p>
              <p>${rqt.adresseLieuConcerne?.postalCode} ${rqt.adresseLieuConcerne?.city}</p>
              <p>${rqt.adresseLieuConcerne?.countryName}</p>
          </g:if>
          </dd>
          

        
          <dt><g:message code="taror.property.proprietaireLieuConcerne.label" /></dt><dd>${rqt.proprietaireLieuConcerne?.toString()}</dd>

        
          <dt><g:message code="taror.property.descriptifLieuConcerne.label" /></dt><dd>${rqt.descriptifLieuConcerne?.toString()}</dd>

        
      </dl>
      
    
      
      <h4><g:message code="taror.property.periode.label" /></h4>
      <dl>
        
          <dt><g:message code="taror.property.debutPeriode.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.debutPeriode}"/></dd>
          

        
          <dt><g:message code="taror.property.finPeriode.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.finPeriode}"/></dd>
          

        
      </dl>
      
    
      
      <h4><g:message code="taror.property.entrepriseChargeeTravaux.label" /></h4>
      <dl>
        
          <dt><g:message code="taror.property.nomEntreprise.label" /></dt><dd>${rqt.nomEntreprise?.toString()}</dd>

        
          <dt><g:message code="taror.property.adresseEntreprise.label" /></dt>
          <dd>
          <g:if test="${rqt.adresseEntreprise}">
              <p>${rqt.adresseEntreprise?.additionalDeliveryInformation}</p>
              <p>${rqt.adresseEntreprise?.additionalGeographicalInformation}</p>
              <p>${rqt.adresseEntreprise?.streetNumber} ${rqt.adresseEntreprise?.streetName}</p>
              <p>${rqt.adresseEntreprise?.placeNameOrService}</p>
              <p>${rqt.adresseEntreprise?.postalCode} ${rqt.adresseEntreprise?.city}</p>
              <p>${rqt.adresseEntreprise?.countryName}</p>
          </g:if>
          </dd>
          

        
          <dt><g:message code="taror.property.telephoneEntreprise.label" /></dt><dd>${rqt.telephoneEntreprise?.toString()}</dd>

        
          <dt><g:message code="taror.property.telecopieEntreprise.label" /></dt><dd>${rqt.telecopieEntreprise?.toString()}</dd>

        
      </dl>
      
    
  

  
    <h3><g:message code="taror.step.technique.label" /></h3>
    
      
      <h4><g:message code="taror.property.objetDemande.label" /></h4>
      <dl>
        
          <dt><g:message code="taror.property.choixObjetDemande.label" /></dt>
          <dd>
          <g:render template="/frontofficeRequestType/widget/localReferentialDataSummary" 
                    model="['javaName':'choixObjetDemande', 'lrEntries': lrTypes.choixObjetDemande.entries, 'depth':0]" />
          </dd>
          

        
          <dt><g:message code="taror.property.precisionsObjetDemande.label" /></dt><dd>${rqt.precisionsObjetDemande?.toString()}</dd>

        
      </dl>
      
    
      
      <h4><g:message code="taror.property.typeTravaux.label" /></h4>
      <dl>
        
          <dt><g:message code="taror.property.choixTypeTravaux.label" /></dt>
          <dd>
          <g:render template="/frontofficeRequestType/widget/localReferentialDataSummary" 
                    model="['javaName':'choixTypeTravaux', 'lrEntries': lrTypes.choixTypeTravaux.entries, 'depth':0]" />
          </dd>
          

        
          <dt><g:message code="taror.property.precisionsTypeTravaux.label" /></dt><dd>${rqt.precisionsTypeTravaux?.toString()}</dd>

        
      </dl>
      
    
      
      <h4><g:message code="taror.property.zonesConcernees.label" /></h4>
      <dl>
        
          <dt><g:message code="taror.property.choixZonesConcernees.label" /></dt>
          <dd>
          <g:render template="/frontofficeRequestType/widget/localReferentialDataSummary" 
                    model="['javaName':'choixZonesConcernees', 'lrEntries': lrTypes.choixZonesConcernees.entries, 'depth':0]" />
          </dd>
          

        
          <dt><g:message code="taror.property.precisionsZonesConcernees.label" /></dt><dd>${rqt.precisionsZonesConcernees?.toString()}</dd>

        
      </dl>
      
    
      
      <h4><g:message code="taror.property.surfaceOccupee.label" /></h4>
      <dl>
        
          <dt><g:message code="taror.property.longueurSurfaceOccupee.label" /></dt><dd>${rqt.longueurSurfaceOccupee?.toString()}</dd>

        
          <dt><g:message code="taror.property.largeurSurfaceOccupee.label" /></dt><dd>${rqt.largeurSurfaceOccupee?.toString()}</dd>

        
          <dt><g:message code="taror.property.hauteurSurfaceOccupee.label" /></dt><dd>${rqt.hauteurSurfaceOccupee?.toString()}</dd>

        
          <dt><g:message code="taror.property.surfaceTotale.label" /></dt><dd>${rqt.surfaceTotale?.toString()}</dd>

        
      </dl>
      
    
      
      <h4><g:message code="taror.property.mesuresDemandees.label" /></h4>
      <dl>
        
          <dt><g:message code="taror.property.choixMesuresDemandees.label" /></dt>
          <dd>
          <g:render template="/frontofficeRequestType/widget/localReferentialDataSummary" 
                    model="['javaName':'choixMesuresDemandees', 'lrEntries': lrTypes.choixMesuresDemandees.entries, 'depth':0]" />
          </dd>
          

        
          <dt><g:message code="taror.property.precisionsMesuresDemandees.label" /></dt><dd>${rqt.precisionsMesuresDemandees?.toString()}</dd>

        
      </dl>
      
    
  

  
    <h3><g:message code="taror.step.reglement.label" /></h3>
    
      
      <dl>
        <dt><g:message code="taror.property.reglement.label" /></dt>
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
  

  


