<form method="POST" id="agentEditForm_${agent.id}" action="<g:createLink action="editAgent" />" class="form-list-edition" >
  <div id="agentEditForm_${agent.id}Errors" class="error"></div> 
  <ul>
    <g:each var="profile" in="${profiles}" status="i">
      <li>
        <span class="${profile.cssClass}"><g:message code="${profile.i18nKey}"/></span>        
        <input name="profileIndex" value="${i}" type="radio"
            <g:if test="${i == 0}">
            class="validate-one-required" title="Agent category profile is required"
            </g:if> 
            ${profile.i18nKey == agent?.profile?.i18nKey ? 'checked="checked"' : ''}
        />
      </li>
    </g:each>
  </ul>
  
  <input name="agentId" type="hidden" value="${agent.id}" />
  <input name="categoryId" type="hidden" value="${categoryId}" />

  <input type="button" value="modifier" class="submitEditItem" />
  <input type="button" value="annuler" class="cancelEditItem" />
</form>
