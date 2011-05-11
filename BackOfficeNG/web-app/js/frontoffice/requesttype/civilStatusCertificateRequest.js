zenexity.capdemat.tools.namespace("zenexity.capdemat.fong.requesttype");

(function() {
  var zcfr = zenexity.capdemat.fong.requesttype;
  var zcv = zenexity.capdemat.Validation;
  var yue = YAHOO.util.Event;
  var yud = YAHOO.util.Dom;

  zcfr.CivilStatusCertificateRequest = function() {

    return {
      init: function() {
        var input = yud.get('nombreActes'); 
        if (!!input && input.value.length == 0)
          input.value = "1";
      }
    };

  }();
}());

