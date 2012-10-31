

  <g:set var="listSize" value="${rqt.fraisSuppLiesHandicap.size()}" />
  <h3>
    <a class="addListItem" id="add_fraisSuppLiesHandicap[${listSize}]"></a>
    <span><g:message code="myr.property.fraisSuppLiesHandicap.label" /></span>
  </h3>
  <g:each var="it" in="${rqt.fraisSuppLiesHandicap.reverse()}" status="index">
  <div class="collection-action">
    <a class="deleteListItem" id="delete_fraisSuppLiesHandicap[${listSize - 1 - index}]"></a>
  </div>
  <dl class="">
    
      <dt class="required"><g:message code="myr.property.natureFrais.label" /> * : </dt>
      <dd id="fraisSuppLiesHandicap[${listSize - 1 - index}].natureFrais" class="action-editField validate-string required-true i18n-myr.property.natureFrais" >
        <span>${it?.natureFrais}</span>
      </dd>
    
      <dt class="required"><g:message code="myr.property.financeursSollicites.label" /> * : </dt>
      <dd id="fraisSuppLiesHandicap[${listSize - 1 - index}].financeursSollicites" class="action-editField validate-string required-true i18n-myr.property.financeursSollicites" >
        <span>${it?.financeursSollicites}</span>
      </dd>
    
      <dt class="required"><g:message code="myr.property.montantsObtenus.label" /> * : </dt>
      <dd id="fraisSuppLiesHandicap[${listSize - 1 - index}].montantsObtenus" class="action-editField validate-regex required-true i18n-myr.property.montantsObtenus maxLength-10" regex="[0-9]{0,7}([,.][0-9]{0,2})?$">
        <span>${it?.montantsObtenus}</span>
      </dd>
    
      <dt class="required"><g:message code="myr.property.resteAVotreCharge.label" /> * : </dt>
      <dd id="fraisSuppLiesHandicap[${listSize - 1 - index}].resteAVotreCharge" class="action-editField validate-regex required-true i18n-myr.property.resteAVotreCharge maxLength-10" regex="[0-9]{0,7}([,.][0-9]{0,2})?$">
        <span>${it?.resteAVotreCharge}</span>
      </dd>
    
      <dt class="required"><g:message code="myr.property.periodicite.label" /> * : </dt>
      <dd id="fraisSuppLiesHandicap[${listSize - 1 - index}].periodicite" class="action-editField validate-capdematEnum required-true i18n-myr.property.periodicite javatype-fr.cg95.cvq.business.request.social.PeriodiciteFraisSuppType" >
        <g:capdematEnumToField var="${it?.periodicite}" i18nKeyPrefix="myr.property.periodicite" />
      </dd>
    
  </dl>
  </g:each>
