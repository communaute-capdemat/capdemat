zenexity.capdemat.tools.namespace("zenexity.capdemat.fong.requesttype");

(function() {
  var zcfr = zenexity.capdemat.fong.requesttype;
  var zcv = zenexity.capdemat.Validation;
  var yue = YAHOO.util.Event;
  var yud = YAHOO.util.Dom;

  zcfr.DemandeDeSuiviRequest = function() {

    return {
      init: function() {
        if(yud.get('numeroDemande')){
          yud.get('numeroDemande').readOnly = true;
        }
      }
    };

  }();
}());