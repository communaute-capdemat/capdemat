<div id="tabs" class="yui-navset yellow-yui-tabview">
  <div class="yui-content">
    <div id="emails">
      <form class="state-form">
        <p class="field">
          <label for="state">${message(code:'requestType.configuration.mails.which.state')}&nbsp;:</label>
          <select id="state">
          <g:each in="${states}">
            <option value="${it.key}">${it.value}</option>
          </g:each>
          </select>
        </p>
      </form>
      <form class="editor-form">
        <textarea id="editor"></textarea>
        <div class="cf">
          <input type="button" id="save" value="${message(code:'action.save')}"/>
        </div>
      </form>
    </div>
  </div>
</div>
