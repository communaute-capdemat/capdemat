zenexity.capdemat.tools.namespace("zenexity.capdemat.fong.requesttype");

(function() {
  var zcf = zenexity.capdemat.fong;
  var zcfr = zcf.requesttype;
  var zct = zenexity.capdemat.tools;
  var yue = YAHOO.util.Event;
  var yud = YAHOO.util.Dom;
  var yus = YAHOO.util.Selector;
  var ylj = YAHOO.lang.JSON;
  var json;
  zcfr.EcoleDeMusiqueRequest = function() {

    var createSelect = function(id) {
      var el = yud.get(id);
      var newNode = document.createElement('select');
      newNode.className = el.className;
      newNode.name = el.name;
      newNode.id = el.id;
      newNode.options[0] = new Option('Choisissez...','');
      newNode.previousValue = yud.get('subjectId').value !== '' ? el.value : undefined;
      newNode.select = function(value) {
        var i = 0;
        for (i; i<this.length; i++){
          if (this.options[i].value === value){
            if (this.selectedIndex !== i)
              this.selectedIndex = i;
            break;
          }
        }
        replaceInput(this.id);
      };
      newNode.empty = function() {
        while (this.options.length > 1) {
          this.options[1].parentNode.removeChild(this.options[1]);
        }
        replaceInput(this.id);
      };
      el.parentNode.replaceChild(newNode,el);
      yue.on(newNode, 'click', function(e) { toogleError(newNode); });
      yue.on(newNode, 'change', function(e) { replaceInput(id); });
      return newNode;
    };

    var replaceInput = function(id) {
      var select = yud.get(id);
      var input = yud.get(id.replace('id', 'label'));
      var newNode = document.createElement('input');
      newNode.className = input.className;
      newNode.id = input.id;
      newNode.name = input.name;
      newNode.type = 'hidden';
      newNode.value = select.selectedIndex > 0 ? select.options[select.selectedIndex].innerHTML : '';
      input.parentNode.replaceChild(newNode,input);
    }

    var toogleError = function(select) {
      if (!yud.hasClass(select, 'unactive')
          && select.options.length < 2
          && yud.get('subjectId').value !== '') {
        yud.get('stepForm-error').innerHTML = zcfr.EcoleDeMusiqueRequest.errorMessage;
        yud.addClass(yus.query("#request div.form")[0], 'invalid');
        yud.addClass(yus.query("#request div.steps li.current")[0], 'invalid');
      } else {
        yud.get('stepForm-error').innerHTML = '';
        yud.removeClass(yus.query("#request div.form")[0], 'invalid');
        yud.removeClass(yus.query("#request div.steps li.current")[0], 'invalid');
      }
    };

    var updateLayout = function() {
      zct.each(yus.query('fieldset'), function() {
        yud.setStyle(this, 'padding', 0);
        var legend = yud.getFirstChild(this);
        yud.setStyle(legend, 'color', '#000');
        legend.innerHTML = legend.innerHTML + ' *';
        zct.each(this.getElementsByTagName('label'), function() {
          yud.addClass(this, 'unactive');
        });
      });
    };

    return {
      init: function() {
        if (!yud.get('subjectId'))
          return;
        updateLayout();
        zcfr.EcoleDeMusiqueRequest.initSite();
        yue.on('subjectId','change', zcfr.EcoleDeMusiqueRequest.initSite);
      },

      errorMessage : 'Erreur',

      initSite: function() {
        var sites = createSelect('site.idSite');
        var activity = createSelect('produit.idProduit');

        var userId = yud.get('subjectId').value;
        if (userId !== '') {
          var requestId = yud.get("stepForm").id.value;
          zct.doAjaxCall(zenexity.capdemat.contextPath + '/frontoffice/ecoleDeMusique/siteProduit/?requestId=' + requestId + '&userId=' + userId, null, function(o){
            json = ylj.parse(o.responseText);
            var index = 1;
            for (var key in json.sites) {
                sites.options[index++] = new Option(json.sites[key],key);
            }
            sites.select(sites.previousValue);
            zcfr.EcoleDeMusiqueRequest.loadActivity();
          }, true);
          yue.on('site.idSite','change', zcfr.EcoleDeMusiqueRequest.loadActivity);
        } else {
          sites.empty();
          activity.empty();
        }
      },

      loadActivity : function() {
        yud.get('produit.idProduit').empty();
        var idSite = yud.get('site.idSite').value;
        for (var key in json) {
          if(key == idSite){
            var index = 1;
            for (var act in json[key]){
              yud.get('produit.idProduit').options[index++] = new Option(json[key][act],act);
            }
          }
      }
        yud.get('produit.idProduit').select(yud.get('produit.idProduit').previousValue);
      }
    };

  }();
}());
