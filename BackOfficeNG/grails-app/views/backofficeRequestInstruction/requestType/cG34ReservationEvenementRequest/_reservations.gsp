

  <g:set var="listSize" value="${rqt.reservations.size()}" />
  <h3>
    <a class="addListItem" id="add_reservations[${listSize}]"></a>
    <span><g:message code="crer.property.reservations.label" /></span>
  </h3>
  <g:each var="it" in="${rqt.reservations.reverse()}" status="index">
  <div class="collection-action">
    <a class="deleteListItem" id="delete_reservations[${listSize - 1 - index}]"></a>
  </div>
  <dl class="required">
    
      <dt class="required"><g:message code="crer.property.reservationType.label" /> * : </dt>
      <dd id="reservations[${listSize - 1 - index}].reservationType" class="action-editField validate-string required-true i18n-crer.property.reservationType" >
        <span>${it?.reservationType}</span>
      </dd>
    
      <dt class="required"><g:message code="crer.property.nombrePlaces.label" /> * : </dt>
      <dd id="reservations[${listSize - 1 - index}].nombrePlaces" class="action-editField validate-positiveInteger required-true i18n-crer.property.nombrePlaces" >
        <span>${it?.nombrePlaces}</span>
      </dd>
    
  </dl>
  </g:each>
