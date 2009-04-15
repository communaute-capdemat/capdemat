<html>
  <head>
    <meta name="layout" content="fo_main" />
    <link rel="stylesheet" type="text/css" href="${createLinkTo(dir:'css/frontoffice', file:'request.css')}" />
  </head>
  
  <body>
    <div class="main-box requestExit">
      <h2>${requestTypeLabel}</h2>
      <div class="info">
        <p><g:message code="request.message.successfulCreation" /></p>
        <p><g:message code="request.message.requestIdNotice" args="${[rqt.id]}"/></p>
        <p><g:message code="account.message.tempLoginToFollowRequest" /> : <strong>${requester.login}</strong></p>
      </div>
      <g:if test="${hasHomeFolder}">
        <div class="link">
          <g:message code="request.message.actionAfterCreation" /> :
          <ul>
            <li>
              <a href="${createLink(controller:'frontofficeRequest',action:'summary',id:rqt.id)}">
                <g:message code="request.action.seeSummary" />
              </a>
            </li>
            <li>
              <a href="${createLink(controller:'frontofficeRequestType')}">
                <g:message code="request.action.issueNewRequest" />
              </a>
            </li>
            <li>
              <a href="${createLink(controller:'frontofficeHome')}">
                <g:message code="action.goHome" />
              </a>
            </li>
          </ul>
        </div>
      </g:if>
    </div>
  </body>
</html>

