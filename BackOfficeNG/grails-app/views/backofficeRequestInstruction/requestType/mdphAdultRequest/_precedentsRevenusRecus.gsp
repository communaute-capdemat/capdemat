

  <g:set var="listSize" value="${rqt.precedentsRevenusRecus.size()}" />
  <h3>
    <a class="addListItem" id="add_precedentsRevenusRecus[${listSize}]"></a>
    <span><g:message code="mar.property.precedentsRevenusRecus.label" /></span>
  </h3>
  <g:each var="it" in="${rqt.precedentsRevenusRecus.reverse()}" status="index">
  <div class="collection-action">
    <a class="deleteListItem" id="delete_precedentsRevenusRecus[${listSize - 1 - index}]"></a>
  </div>
  <dl class="required">
    
  </dl>
  </g:each>
