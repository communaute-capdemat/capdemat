zenexity.capdemat.tools.namespace("zenexity.capdemat.fong.requesttype");

(function() {
  var zcf = zenexity.capdemat.fong
  var zcfr = zcf.requesttype;
  var zct = zenexity.capdemat.tools;
  var yue = YAHOO.util.Event;
  var yud = YAHOO.util.Dom;
  var yus = YAHOO.util.Selector;
  var ylj = YAHOO.lang.JSON;

  zcfr.CG34ReservationEvenementRequest = function() {


    return {
      init: function() {
        
        yud.addClass('idEvenement','hidden');
        yud.addClass(yud.getPreviousSibling('idEvenement'),'hidden');

        yud.addClass('idPrestation','hidden');
        yud.addClass(yud.getPreviousSibling('idPrestation'),'hidden');

        yud.addClass('labelReservation','hidden');
        yud.addClass(yud.getPreviousSibling('labelReservation'),'hidden');
        
        yud.addClass('typePrestation','hidden');
        yud.addClass(yud.getPreviousSibling('typePrestation'),'hidden');

        var input = yud.get('labelReservation');
        var newNode = document.createElement('p');
        yud.setStyle(newNode, 'font-size', '1.5em');
        yud.setStyle(newNode, 'margin-top', '2em');
        newNode.innerHTML = input.value;
        input.parentNode.replaceChild(newNode, input);
      }
    };

  }();
}());
