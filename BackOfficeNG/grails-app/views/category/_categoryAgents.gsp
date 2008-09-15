
<g:each in="${agents}" var="agent">
  <g:if test="${agent?.notBelong}">
    <li id="agent_${agent.id}" class="notBelong">
    <a class="associate"><span>associate</span></a>
  </g:if>
  <g:else>
    <li id="agent_${agent.id}">
    <a class="unassociate"><span>unassociate</span></a>
    <a class="editItem"><span>edit</span></a>
  </g:else>
    <span class="agentName">
      <g:if test="${agent.active}">
      <strong>${agent.lastName} ${agent.firstName}</strong>
      </g:if>
      <g:else>
      <span>${agent.lastName} ${agent.firstName}</span>
      </g:else>
    </span>
    <span class="${agent?.profile?.cssClass}"><g:message code="${agent?.profile?.i18nKey}"/></span>
  </li>
</g:each>

