<g:set var="lrDatas" value="${wrapper != null ? wrapper[javaName].collect{it.name} : null}" />

  <g:each status="i" var="entry" in="${lrEntries}">
    <g:if test="${entry.entries}">
        <g:render template="/frontofficeRequestType/widget/localReferentialDataSummary"
          model="['javaName':javaName, 'lrEntries': entry.entries, 'wrapper':wrapper,
            'prefix' : (prefix != null ? prefix + ' | ' : '') + entry.label]" />
    </g:if>
    <g:else>
      <g:if test="${lrDatas?.contains(entry.key)}">
        <li>
          <span class="entry:${entry.key}">
            ${(prefix!= null ? prefix + ' | ' : '') + entry.label}
          </span>
        </li>
      </g:if>
    </g:else>
  </g:each>
