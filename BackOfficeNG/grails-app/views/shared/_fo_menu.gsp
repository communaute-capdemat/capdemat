<g:if test="${session.currentCredentialBean?.ecitizen && !(session.currentCredentialBean.ecitizen.homeFolder.temporary)}">
  <strong>${session.currentEcitizenName} &nbsp;</strong>
  <a href="${createLink(controller : "frontofficeHome", action : session.proxyAgent ? "logoutAgent" : "logout")}">
    ${message(code:'action.logout')}
  </a>
</g:if>
<%
  def mode = 'unauth_ecitizen'
  if (session.frontContext) {
    if (session.currentCredentialBean.ecitizen.homeFolder.temporary) {
      mode = 'temporary'  
    }
    else {
      mode = session.frontContext.toString().toLowerCase()
    }
  }
%>
<div style="margin: .5em 0; ">
  <a href="${createLink(controller : 'frontofficeHome')}">${message(code:'menu.home')}</a>
  <a href="${createLink(controller : 'frontofficeRequestType')}">${message(code:'menu.services')}</a>
  <a href="${createLink(controller : 'frontofficeHomeFolder')}">${message(code:'menu.accounts')}</a>
  <a href="${createLink(controller : 'frontofficeRequest')}">${message(code:'menu.requests')}</a>
  <a href="${createLink(controller : 'frontofficeDocument')}">${message(code:'menu.documents')}</a>
  <g:if test="${session.supportsActivitiesTab}">
    <a href="${createLink(controller : 'frontofficeActivity')}">${message(code:'menu.activities')}</a>
  </g:if>
  <g:if test="${session.supportsPaymentsTab}">
    <a href="${createLink(controller : 'frontofficePayment')}">${message(code:'menu.payments')}</a>
  </g:if>
  
  <a href="${createLink(controller:'localAuthorityResource',action:'resource',id:'helpFo')}">${message(code:'menu.help')}</a>
  <a href="${createLink(controller:'localAuthorityResource',action:'resource',id:'faqFo')}">${message(code:'menu.faq')}</a>

</div>

