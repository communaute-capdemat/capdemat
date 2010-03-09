

  <g:set var="listSize" value="${rqt.demandeCartes.size()}" />
  <h3>
    <a class="addListItem" id="add_demandeCartes[${listSize}]"></a>
    <span><g:message code="mar.property.demandeCartes.label" /></span>
  </h3>
  <g:each var="it" in="${rqt.demandeCartes.reverse()}" status="index">
  <div class="collection-action">
    <a class="deleteListItem" id="delete_demandeCartes[${listSize - 1 - index}]"></a>
  </div>
  <dl class="required">
    
  </dl>
  </g:each>
