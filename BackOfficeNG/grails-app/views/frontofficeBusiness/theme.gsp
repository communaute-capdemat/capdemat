<html>
  <head>
    <title>${message(code:'business.title')}</title>
    <meta name="layout" content="fo_main" />
    <link rel="stylesheet" type="text/css" href="${resource(dir:'css/frontoffice', file:'businessInformations.css')}" />
  </head>
  <body>

  <div class="list-box">
    <div class="businessInformations">
      <h2>${title}</h2>

      <ul>
        <g:each in="${infos}" var="subTheme">
          <g:if test="${subTheme.key.left == params.item}">
            <li><h3>${subTheme.key.right}</h3>
            <g:if test="${subTheme.value.getClass().toString().endsWith('Map')}">
              <dl>
              <g:each in="${subTheme.value}" var="item">
                <dt>${item.key.right}</dt>
                <dd>${item.value}</dd>
              </g:each>
              </dl>
            </g:if>
            <g:else>
              ${subTheme.value}
            </g:else>
            </li>
          </g:if>
        </g:each>
      </ul>
    </div>
  </div>

  </body>
</html>
