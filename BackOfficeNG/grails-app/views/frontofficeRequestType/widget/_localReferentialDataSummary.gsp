<g:set var="lrDatas" value="${wrapper != null ? wrapper[javaName].collect{it.name} : null}" />
<g:if test="${lrTypes[javaName].isMultiple()}">
  <ul ${depth==0 ? 'class="dataTree"' : ''}>
  <g:each status="i" var="entry" in="${lrEntries}">
    <g:if test="${entry.entries}">
      <li>
        <g:render template="/frontofficeRequestType/widget/localReferentialDataSummary"
          model="['javaName':javaName, 'lrEntries': entry.entries, 'rqt':rqt, 'depth':1+depth,
            'prefix' : (prefix != null ? prefix + ' - ' : '') + entry.label]" />
      </li>
    </g:if>
    <g:else>
      <g:if test="${lrDatas?.contains(entry.key)}">
        <li>
          <span class="entry:${entry.key}">
            ${(prefix!= null ? prefix + ' - ' : '') + entry.label}
          </span>
        </li>
      </g:if>
    </g:else>
  </g:each>
</ul>
