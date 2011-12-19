zenexity.capdemat.tools.namespace("zenexity.capdemat.fong.requesttype");

(function() {
  var zct = zenexity.capdemat.tools;
  var zcf = zenexity.capdemat.fong;
  var zcfr = zenexity.capdemat.fong.requesttype;
  var zcv = zenexity.capdemat.Validation;
  var yue = YAHOO.util.Event;
  var yus = YAHOO.util.Selector;
  var yud = YAHOO.util.Dom;

  zcfr.TavernyApprovalRoadOccupancyRequest = function() {

    return {
      init: function() {

        zcf.RequestCreation.requestTypeModule = zcfr.TavernyApprovalRoadOccupancyRequest;
        if (yud.get("general")) {
            var postalCode = yud.get("adresseLieuConcerne_postalCode");
            var city = yud.get("adresseLieuConcerne_city");
            var countryName = yud.get("adresseLieuConcerne.countryName");

            postalCode.value = "95150";
            city.value = "TAVERNY";
            countryName.value = "FRANCE";

            postalCode.readOnly = true;
            city.readOnly = true;
            countryName.readOnly = true;

            zcv.putComplexRules({
              "before2weeks" : new zcv.complexRule(function(){
                for (i = 0; i < 3; i++) {
                  if (arguments[i].value === null || arguments[i].value === "") return false;
                }
                var startDate = new Date(arguments[0].value, arguments[1].value - 1, arguments[2].value);
                var today = Date.today();

                if (startDate < today)
                    return false;

                var diffDay = startDate.getTime() - today.getTime();
                var comp2weeks = 14 * 24 * 60 * 60 * 1000;
                return diffDay >= comp2weeks;

              },"La date prévue d'occupation du domaine public doit être deux semaines après la date d'aujourd'hui.")
            });
            zcv.complexRules["before2weeks"].pushFields("debutPeriode_year", "debutPeriode_month", "debutPeriode_day");
        }
      },
      displayErrorMsg: function() { return true; }
    };

  }();

}());
