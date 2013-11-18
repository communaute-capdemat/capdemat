<html>
  <head>
    <title>${message(code:'business.title')}</title>
    <meta name="layout" content="fo_main" />
    <link rel="stylesheet" type="text/css" href="${resource(dir:'css/frontoffice', file:'businessInformations.css')}" />
  </head>
  <body>




  <div class="list-box businessInformations">
    <g:each in="${themes}" var="theme">
    <h2>${theme.label}</h2>

      <div class="group-box">
        <ul>
          <g:each in="${theme.content}" var="content">
          <li>
            <a href="${createLink(controller:'frontofficeBusiness',action:'theme', params:['externalServiceLabel': theme.externalServiceLabel, 'code':theme.code, 'item':content.key.left])}">${content.key.right}</a>
          </li>
          </g:each>
        </ul>
      </div>
    </g:each>
  </div>

  </body>
</html>
