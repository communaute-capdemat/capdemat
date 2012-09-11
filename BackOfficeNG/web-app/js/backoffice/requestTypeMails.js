;(function(Mails) {
  // Namepaces
  var yu      = YAHOO.util
    , yud     = yu.Dom
    , yue     = yu.Event
    , yus     = yu.Selector
    , zc      = zenexity.capdemat
    , zct     = zenexity.capdemat.tools
    , zcbrt   = zc.bong.requesttype

  var Mails = {}
    , variables

  // Fetch HTML on state change
  Mails.fetch = function() {
    var oncefetched
      , currentState = yud.get('state').value

    oncefetched = function(response) {
      this.argument[0].setData(response.responseText)
    }

    zct.doAjaxCall( '/mail/' + zcbrt.currentId + '/state/' + currentState
                  , [ this ]
                  , oncefetched)
  }

  // Save HTML when clicking on "Save" button
  Mails.save = function() {
    var oncesaved
      , params
      , currentState = yud.get('state').value

    oncesaved = function(response) {
      zct.Notifier.processMessage( 'success'
                                 , response.responseText
                                 , null
                                 , yus.query('.editor-form', 'emails', true))
    }

    params = zct.param({ 'html': this.getData() })

    zct.doAjaxPostCall( '/mail/' + zcbrt.currentId + '/state/' + currentState
                      , params
                      , oncesaved)
  }

  // TODO: fetch them instead.
  variables = [ [ '#{DATE}', "Date actuelle", "Date actuelle" ]
              , [ '#{LAST_AGENT_NAME}', "Nom de l'agent", "Nom de l'agent" ]
              , [ '#{LAST_AGENT_EMAIL}', "E-mail de l'agent", "E-mail de l'agent" ]
              , [ '#{MOC}', "Moyens de contact", "Moyens de contact" ]
              , [ '#{RQ_ID}', "Identifiant de la demande", "Identifiant de la demande" ]
              , [ '#{RQ_CAT}', "Catégorie de la demande", "Catégorie de la demande" ]
              , [ '#{RQ_CAT_EMAIL}', "E-mail de la catégorie", "E-mail de la catégorie" ]
              , [ '#{RQ_TP_LABEL}', "Type de demande", "Type de demande" ]
              , [ '#{RQ_CDATE}', "Date de création", "Date de création" ]
              , [ '#{RQ_DVAL}', "Date de validation", "Date de validation" ]
              , [ '#{RQ_OBSERV}', "Observations", "Observations" ]
              , [ '#{HF_ID}', "Identifiant du compte", "Identifiant du compte" ]
              , [ '#{RR_FNAME}', "Nom du demandeur", "Nom du demandeur" ]
              , [ '#{RR_LNAME}', "Prénom du demandeur", "Prénom du demandeur" ]
              , [ '#{RR_TITLE}', "Civilité du demandeur", "Civilité du demandeur" ]
              , [ '#{RR_LOGIN}', "Login du demandeur", "Login du demandeur" ]
              , [ '#{RR_QUESTION}', "Question du demandeur", "Question du demandeur" ]
              , [ '#{RR_ANSWER}', "Réponse du demandeur", "Réponse du demandeur" ]
              , [ '#{SU_FNAME}', "Prénom du sujet", "Prénom du sujet" ]
              , [ '#{SU_LNAME}', "Nom du sujet", "Nom du sujet" ]
              , [ '#{SU_TITLE}', "Civilité du sujet", "Civilité du sujet" ]
              , [ '#{HF_ADDRESS_ADI}', "App., étage…", "App., étage…" ]
              , [ '#{HF_ADDRESS_AGI}', "Bât., Rés.…", "Bât., Rés.…" ]
              , [ '#{HF_ADDRESS_SNAME}', "Rue", "Rue" ]
              , [ '#{HF_ADDRESS_SNUM}', "Nº de rue", "Nº de rue" ]
              , [ '#{HF_ADDRESS_PNS}', "Lieu dit ou service", "Lieu dit ou service" ]
              , [ '#{HF_ADDRESS_ZIP}', "Code postal", "Code postal" ]
              , [ '#{HF_ADDRESS_TOWN}', "Ville", "Ville" ]
              , [ '#{HF_ADDRESS_CN}', "Pays", "Pays" ]
              ]

  Mails.init = function() {
    var onready
      , definition
      , init
      , panelfor

    onready = function() {
      var editor = this
      yue.on('state', 'change', Mails.fetch, editor, true)
      Mails.fetch.call(editor)
      zcbrt.Conf.save = function() { Mails.save.call(editor) }
    }

    init = function() {
      for(var v in variables) {
        this.add(variables[v][0], variables[v][1], variables[v][2])
      }
    }

    panelfor = function(editor) {
      var config = editor.config
      return { css: [ config.contentsCss, CKEDITOR.skin.path() + 'editor.css' ] }
    }

    definition = { lang: [ 'fr' ]
                 , requires: [ 'richcombo' ]
                 , init: function(editor) {
                     editor.ui.addRichCombo( 'Variables'
                                           , { label: 'Champs prédéfinis'
                                             , panel: panelfor(editor)
                                             , init: init
                                             , onClick: function(value) {
                                                 editor.focus()
                                                 editor.fire('saveSnapshot')
                                                 editor.insertHtml(value)
                                                 editor.fire('saveSnapshot')
                                               }
                                             }
                                           )
                   }
                 }

    CKEDITOR.plugins.add('variables', definition)
    CKEDITOR.replace( 'editor'
                    , { customConfig: 'capdemat-config.js' }
                    )
            .on('instanceReady', onready)
  }

  yue.onDOMReady(Mails.init)

})(zenexity.capdemat.tools.namespace('zenexity.capdemat.bong.requesttype'))
