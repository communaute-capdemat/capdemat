;(function(request) {
  var zct = zenexity.capdemat.tools
    , yud = YAHOO.util.Dom
    , yus = YAHOO.util.Selector
    , prefix

  var sites = {
    init: function() {
      zct.alterer.toDropDown('Site', sites.url, 'subjectId')
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
      zct.alterer.toDropDown('Produit', products.url, 'idSite')
    },
    url: function() {
      return prefix
           + '/products/?requestTypeLabel=Activity Registration'
           + '&requestId='
           + yud.get('stepForm').id.value
           + '&subjectId='
           + yud.get('subjectId').value
           + '&siteId='
           + yud.get('idSite').value
    }
  }

  var segments = {
    init: function() {
      zct.alterer.toDropDown('Segment', segments.url, 'idProduit')
    },
    url: function() {
      return prefix
           + '/segments/?requestTypeLabel=Activity Registration'
           + '&requestId='
           + yud.get('stepForm').id.value
           + '&subjectId='
           + yud.get('subjectId').value
           + '&siteId='
           + yud.get('idSite').value
           + '&productId='
           + yud.get('idProduit').value
           + '&productType='
           + yud.get('typeProduit').value
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
