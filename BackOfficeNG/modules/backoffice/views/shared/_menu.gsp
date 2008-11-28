<h1><a class="logo" href="<g:createLink controller='request' action='taskBoard'/>">CapDémat</a></h1>
<div id="userInfo">
  ${session.currentUser} - <a href="${createLinkTo(dir:'',file:'casLogout.gsp')}"><g:message code="action.logout" /></a>
</div>
<div id="menu">
  <a id="taskBoardMenuItem" href="<g:createLink controller='backofficeRequest' action='taskBoard' />">
    <g:message code="menu.taskBoard" />
  </a>
  <a id="requestMenuItem" href="<g:createLink controller='backofficeRequest'/>">
    <g:message code="menu.requests" />
  </a>
  <a id="statisticsMenuItem" href="<g:createLink controller='backofficeStatistic'/>">
    <g:message code="menu.statistics" />
  </a>
  <a id="requestTypeMenuItem" href="<g:createLink controller='backofficeRequestType'/>">
    <g:message code="menu.requestTypes" />
  </a>
  <a id="categoryMenuItem" href="<g:createLink controller='backofficeCategory'/>">
    <g:message code="menu.categories" />
  </a>
  <a id="paymentMenuItem" href="<g:createLink controller='backofficePayment'/>">
    <g:message code="menu.payments" />
  </a>
</div>
