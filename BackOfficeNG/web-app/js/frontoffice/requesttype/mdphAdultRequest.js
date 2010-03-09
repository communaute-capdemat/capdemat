zenexity.capdemat.tools.namespace("zenexity.capdemat.fong.requesttype");

(function() {
  var zcf = zenexity.capdemat.fong;
  var zcfr = zcf.requesttype;
  var zcv = zenexity.capdemat.Validation;
  var zct = zenexity.capdemat.tools;
  var yue = YAHOO.util.Event;
  var yud = YAHOO.util.Dom;

  zcfr.MdphAdultRequest = function() {

    return {
      init: function() {
        zcf.Condition.getTriggerValue = zcfr.MdphAdultRequest.getTriggerValue;
      },
      
      getTriggerValue : function (triggerEl, conditionName) {
        var value;
        if (zct.nodeName(triggerEl,'select') && yud.hasClass(triggerEl, 'data-localReferentialData'))
          value = triggerEl.value || "";
        if (zct.nodeName(triggerEl,'select')
          || (!yud.hasClass(triggerEl, 'boolean') && yud.hasClass(triggerEl, 'validate-one-required')))
          value = triggerEl.value.split('_')[1] || "";
        else
          value = triggerEl.value || "";
          
        if (triggerEl.name === 'situationProfessionnelleVous')
          return (conditionName + '-' + value);
        
        if (triggerEl.name === 'situationProfessionnelleConjoint')
            return (conditionName + '-' + value);
        
        if (triggerEl.name === 'situationParticuliere')
            return (conditionName + '-' + value);
        
        return value;
      }
      
    };

  }();
}());

