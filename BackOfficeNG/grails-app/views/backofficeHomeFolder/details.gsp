<html>
  <head>
    <title>${message(code:'homeFolder.header.details', args:[params.id])}</title>
    <meta name="layout" content="main" />
    <g:if test="${flash.addressesReferentialEnabled}">
      <link rel="stylesheet" type="text/css" href="${resource(dir:'css/common', file:'autocomplete.css')}" />
      <script type="text/javascript">
        zenexity.capdemat.contextPath = "${request.contextPath}";
      </script>
      <script type="text/javascript" src="${resource(dir:'js/common',file:'addressAutocomplete.js')}"></script>
      <script type="text/javascript" src="${resource(dir:'js/common',file:'autocomplete.js')}"></script>
    </g:if>
    <script type="text/javascript" src="${resource(dir:'js/backoffice',file:'contact.js')}"></script>
    <script type="text/javascript" src="${resource(dir:'js/backoffice',file:'homeFolderDetails.js')}"></script>
    <link rel="stylesheet" href="${resource(dir:'css/backoffice/common/yui-skin/',file:'container.css')}" />
    <link rel="stylesheet" href="${resource(dir:'css/backoffice',file:'homeFolder.css')}" />
    <link rel="stylesheet" href="${resource(dir:'css/backoffice',file:'document.css')}" />
    <link rel="stylesheet" href="${resource(dir:'css/backoffice',file:'contact.css')}" />
    <script type="text/javascript">
      zenexity.capdemat.bong.homeFolder.Details.homeFolderId = ${params.id};
      zenexity.capdemat.bong.contactPanelUrl = "${createLink(controller : 'backofficeContact', action : 'panel')}";
      zenexity.capdemat.bong.homeFolder.Details.agentCanWrite = ${agentCanWrite};
    </script>
  </head>
  <body>
    <div id="yui-main">
      <div class="yui-b">
        <div class="head">
          <div id="contactContainer" class="txt-right">
            <a id="contactLink">
              <g:message code="contact.header.contactEcitizen" />
            </a>
            <div id="contactPanel">
              <div class="hd"></div>
              <div class="bd">
              </div>
            </div>
          </div>
          <h1>${message(code:'homeFolder.header.details', args:[params.id])}</h1>
        </div>

        <div id="homeFolder" class="mainbox mainbox-yellow">
          <h2>${message(code:'homeFolder.search.isHomeFolderResponsible')}</h2>

          <div id="adult_${homeFolderResponsible.id}" class="individual collapse">
            <a class="toggle">${message(code:'action.expand')} / ${message(code:'action.collapse')}</a>
            <div class="yui-g">
              <div class="yui-u first">
                <dl class="${homeFolderResponsible?.state?.toString() != 'Archived' ? 'edit' : ''} individual-state required collapse">
                  <g:render template="static/state" model="['user':homeFolderResponsible]" />
                </dl>
                <h3>${message(code:'homeFolder.individual.header.identity')}</h3>
                <dl class="${homeFolderResponsible?.state?.toString() != 'Archived' ? 'edit' : ''} individual-identity required collapse">
                  <g:render template="static/adultIdentity" model="['individual':homeFolderResponsible]" />
                </dl>
                <h3>${message(code:'homeFolder.individual.header.connexion')}</h3>
                <dl class="required collapse">
                  <g:render template="static/connexion" model="['adult':homeFolderResponsible]" />
                </dl>
              </div>
              <div class="yui-u">
                <h3>${message(code:'homeFolder.individual.header.address')}</h3>
                <dl class="${homeFolderResponsible?.state?.toString() != 'Archived' ? 'edit' : ''} adult-address required collapse">
                  <g:render template="static/address" model="['user' : homeFolderResponsible]" />
                </dl>
                <h3>${message(code:'homeFolder.individual.header.contact')}</h3>
                <dl class="${homeFolderResponsible?.state?.toString() != 'Archived' ? 'edit' : ''} adult-contact required collapse">
                  <g:render template="static/contact" model="['adult':homeFolderResponsible, 'isResponsible':true]" />
                </dl>
              </div>
            </div>
          </div>

          <div class="yui-g">
            <div class="yui-u first">
              <h2>
                ${message(code:'homeFolder.property.adults')}
                <a class="add adult" style="font-size:.7em;">${message(code:'action.add')}</a>
              </h2>
              <div class="new"></div>
              <g:each var="adult" in="${adults}">
                <g:render template="static/adult" model="['adult':adult]" />
              </g:each>
            </div>
            <div class="yui-u">
              <h2>
                ${message(code:'homeFolder.property.children')}
                <a class="add child" style="font-size:.7em;">${message(code:'action.add')}</a>
              </h2>
              <div class="new"></div>
              <g:each var="child" in="${children}">
                <g:render template="static/child" model="['child':child, 'roleOwners': responsibles[child.id]]" />
              </g:each>
            </div>
          </div>

        </div>

        <!-- Request TabView -->
        <div id="homeFolderInformation"></div>

      </div>
    </div>
    <div id="narrow" class="yui-b">

      <!-- home folder state -->
      <div class="nobox taskstate">
        <h3>${message(code:'property.homeFolderState')}</h3>
        <div class="body">
          <g:if test="${isValidable}">
        <form method="post" action="${g.createLink(action:'validateHomeFolder',id:homeFolder.id)}">
        <button id="validateHomeFolder">Valider le compte</button>
        
        </g:if>
          <span id="homeFolderState" class="tag-${homeFolderState}" style="float: right; font-size:1.1em;">
            ${message(code:'user.state.' + homeFolderState)}
          </span>
        </form>
        </div>
      </div>

      <div class="nobox taskstate">
        <h3>${message(code:'header.subMenus')}</h3>
        <div class="body">
          <p>
            <a href="${createLink(controller: 'frontofficeHome',action:'loginAgent', id : homeFolderResponsible.id)}">
              ${message(code:'homeFolder.header.goToAccount')}
            </a>
          </p>
        </div>
      </div>

    </div>

  </body>
</html>
