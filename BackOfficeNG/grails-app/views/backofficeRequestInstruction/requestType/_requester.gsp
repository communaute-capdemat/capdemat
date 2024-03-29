<g:if test="${requester != null}"> 
  <g:if test="${hasHomeFolder}"> 
    <dt class="required"><g:message code="request.property.requester.label" /> : </dt>
    <dd>
      <span>${requester.firstName} ${requester.lastName}</span>
    </dd>
  </g:if>
  <g:else>  
    <dt><g:message code="homeFolder.adult.property.title" /> : </dt> 
    <dd id="_requester.title" class="action-editField validate-capdematEnum javatype-fr.cg95.cvq.business.users.TitleType">
        <g:capdematEnumToField var="${requester.title}" i18nKeyPrefix="homeFolder.adult.title" />
    </dd>

    <dt><g:message code="homeFolder.individual.property.lastName" /> : </dt>
    <dd id="_requester.lastName" class="action-editField validate-lastname required-true i18n-homeFolder.individual.property.lastName">
      <span>${requester.lastName}</span>
    </dd>

    <dt><g:message code="homeFolder.individual.property.firstName" /> : </dt>
    <dd id="_requester.firstName" class="action-editField validate-firstname required-true i18n-homeFolder.individual.property.firstName">
      <span>${requester.firstName}</span>
    </dd>

    <dt><g:message code="homeFolder.individual.property.address" /> : </dt>
    <dd id="_requester.address" class="action-editField validate-address required-true">
      <div class="address-fieldset">
        <p class="additionalDeliveryInformation">${requester?.address?.additionalDeliveryInformation}</p>
        <p class="additionalGeographicalInformation">${requester?.address?.additionalGeographicalInformation}</p>
        
        <span class="streetNumber">${requester?.address?.streetNumber}</span>
        <span class="streetName">${requester?.address?.streetName}</span>
        
        <p class="placeNameOrService">${requester?.address?.placeNameOrService}</p>
        
        <span class="postalCode">${requester?.address?.postalCode}</span>
        <span class="city">${requester?.address?.city}</span>
        
        <p class="countryName">${requester?.address?.countryName}</p>
      </div>
    </dd>
    
    <dt><g:message code="homeFolder.adult.property.email" /> : </dt>
    <dd id="_requester.email" class="action-editField validate-email required-true i18n-homeFolder.adult.property.email">
      <span>${requester.email}</span>
    </dd>
    
    <dt><g:message code="homeFolder.adult.property.homePhone" /> : </dt>
    <dd id="_requester.homePhone" class="action-editField validate-phone required-true i18n-homeFolder.adult.property.homePhone">
      <span>${requester.homePhone}</span>
    </dd>
  </g:else>  
</g:if>
<g:else>
  <dt class="required"><g:message code="request.property.requester.label" /> : </dt>
  <dd><span></span></dd>
</g:else>  
    
