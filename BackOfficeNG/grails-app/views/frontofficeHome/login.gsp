<html>
  <head>
    <title>${message(code:'home.portal.title',args:[session.currentSiteDisplayTitle])}</title>
    <meta name="layout" content="fo_main" />
    <link rel="stylesheet" type="text/css" href="${resource(dir:'css/frontoffice', file:'dashboard.css')}" />
    <link rel="stylesheet" type="text/css" href="${resource(dir:'css/frontoffice/common', file:'form.css')}" />
  </head>

  <body>
    <g:if test="${flash.successMessage}">
      <div class="success-box"><p>${flash.successMessage}</p></div>
    </g:if>
    <div class="box">
      <div class="half1">
        <g:if test="${!session.currentCredentialBean?.ecitizen}">
          <div class="list-box">
            <h2>${message(code:'homeFolder.header.login')}</h2>
            <form action="${createLink(controller:'frontofficeHome',action:'login')}" method="post">
              <g:if test="${error}">
                <p class="error">${error}</p>
              </g:if>
            
              <label for="login">${message(code:'account.property.login')}</label>
              <input type="text" class="text" name="login" id="login"/>

              <label for="password">${message(code:'account.property.password')}</label>
              <input type="password" class="text" name="password" id="password"/>

              <input type="submit" class="button" value="${message(code:'action.login')}"/>
              <a href="${createLink(controller : 'frontofficeHomeFolder', action:'resetPassword')}">
                ${message(code:'account.message.forgottenPassword')}
              </a>
            </form>
          </div>
        </g:if>
        <g:render template="/shared/services" model="['groups':groups[0]]" />
      </div>
      <div class="half2">
        <g:if test="${homeFolderIndependentCreationEnabled}">
          <div class="list-box creation">
            <h2>${message(code:'homeFolder.action.createAccount')}</h2>
            <img src="${resource(dir:'images/icons', file:'account-tracker-family-100.png')}" />
            <div>
              <p>${message(code:'homeFolder.message.accountAdvantage0')} :</p>
              <ul>
                <li>${message(code:'homeFolder.message.accountAdvantage1')}</li>
                <li>${message(code:'homeFolder.message.accountAdvantage2')}</li>
                <li>${message(code:'homeFolder.message.accountAdvantage3')}</li>
              </ul>
              <a href="${createLink(controller:'frontofficeHomeFolder', action:'create')}">
                ${message(code:'homeFolder.action.wishCreateAccount')}
              </a>
            </div>
          </div>
        </g:if>
        <g:render template="/shared/services" model="['groups':groups[1]]" />
      </div>
    </div>
  </body>
</html>
