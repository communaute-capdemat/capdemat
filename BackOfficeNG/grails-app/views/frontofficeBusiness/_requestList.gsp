<g:each var="rqs" in="${requests}">
  <div class="group-box v-spaced">
    <h3>${rqs.value[0].displayGroupLabel}</h3>
    <img src="${createLink(controller:'localAuthorityResource', action:'resource',  params:[type:'DISPLAY_GROUP_IMAGE',filename:rqs.key]).encodeAsXML()}" alt="${message(code:'displayGroup.header.logo')} ${rqs.value[0].displayGrouplabel}" />
    <ul>
      <g:each var="record" in="${rqs.value}">
        <li>
          <p>
            <a href="${createLink(controller:'frontofficeBusiness',action:'infos',id:record.id)}">
              ${record.label}
              <g:message code="request.searchResult.requestId" />
              <span>${record.id}</span>
              - <g:message code="layout.from" />
              <span>${record.requesterName}</span>
              <g:if test="${record.subjectName && record.subjectName != ''}">
               <g:message code="layout.for" />
               ${record.subjectName}
              </g:if>
            </a>
          </p>
          <p>
            <g:message code="request.searchResult.creationDate"
              args="${[formatDate(date:record.creationDate,formatName:'format.date')]}"/>
            <g:if test="${record.lastModificationDate}">
              - <g:message code="request.property.lastModificationDate" />
              <g:formatDate date="${record.lastModificationDate}" formatName="format.date" />
              <g:if test="${record.lastInterveningUserId}">
                <g:message code="layout.by" />
                ${record.lastInterveningUserId}
              </g:if>
            </g:if>
          </p>
        </li>
      </g:each>
    </ul>
  </div>
</g:each>

