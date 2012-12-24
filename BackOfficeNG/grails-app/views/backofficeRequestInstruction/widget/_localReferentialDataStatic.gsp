<g:set var="lrDatas" value="${wrapper != null ? wrapper[javaName].collect{it.name} : []}" />
<ul ${depth==0 ? 'class="dataTree"' : ''}>
  <g:each status="i" var="entry" in="${lrEntries}">
    <g:if test="${entry.entries}">
    <li>
      <em>${entry.label} :</em>
      <g:render template="/backofficeRequestInstruction/widget/localReferentialDataStatic" 
          model="['javaName':javaName, 'lrEntries': entry.entries, 'wrapper':wrapper, 'isMultiple':isMultiple, 'depth':++depth]" />
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
