;(function(request) {
  var zct = zenexity.capdemat.tools
    , yud = YAHOO.util.Dom
    , yus = YAHOO.util.Selector
    , yue  = YAHOO.util.Event
    , ylj  = YAHOO.lang.JSON
    , zcte = zct.events
    , prefix

  var sites = {
    init: function() {
      zct.alterer.toDropDown('Site', sites.url, 'subjectId', 'site.')
    },
    url: function() {
      return prefix
           + '/sites/?requestTypeLabel=Activity Registration'
           + '&requestId='
           + yud.get('stepForm').id.value
           + '&subjectId='
           + yud.get('subjectId').value
    }
  }

  var products = {
    init: function() {
      zct.alterer.toDropDown('Produit', products.url, 'site.idSite', 'produit.')
      yue.on(yud.get('produit.idProduit'), 'change', function(event) {
        var sel = yud.get('produit.idProduit').selectedIndex
        var jsVal = ylj.parse(yud.get('produit.idProduit')[sel].getAttribute('data-json'))

        if(jsVal != null) {
            yud.get('produit.typeProduit').value = jsVal.type
            zcte.changed.call(yud.get('produit.typeProduit'), 'change')
        }
      });
    },
    url: function() {
      return prefix
           + '/products/?requestTypeLabel=Activity Registration'
           + '&requestId='
           + yud.get('stepForm').id.value
           + '&subjectId='
           + yud.get('subjectId').value
           + '&siteId='
           + yud.get('site.idSite').value
    }
  }

  var segments = {
    init: function() {
      zct.alterer.toDropDown('Segment', segments.url, 'produit.idProduit', 'segment.')
    },
    url: function() {
      return prefix
           + '/segments/?requestTypeLabel=Activity Registration'
           + '&requestId='
           + yud.get('stepForm').id.value
           + '&subjectId='
           + yud.get('subjectId').value
           + '&siteId='
           + yud.get('site.idSite').value
           + '&productId='
           + yud.get('produit.idProduit').value
           + '&productType='
           + yud.get('produit.typeProduit').value
    }
  }

  request.init = function() {
    // Switch on step name.
    switch (yus.query('div.form', 'request', true).id) {
      case 'preinscription':
        prefix = zenexity.capdemat.contextPath + '/frontoffice/horanet'
        sites.init()
        products.init()
        segments.init()
        break
    }
  }

}(zenexity.capdemat.tools.namespace('zenexity.capdemat.fong.requesttype.ActivityRegistrationRequest')))
