// Doc: http://nightly-v4.ckeditor.com/ckeditor_api/#!/api/CKEDITOR.config
CKEDITOR.editorConfig = function(config) {
  config.extraPlugins = 'variables'
  config.dataIndentationChars = '  '
  config.defaultLanguage = 'fr'
  config.disableNativeSpellChecker = false
  config.format_tags = 'h1;h2;p;div;pre'
  config.fullPage = true
  config.height = '400px'
  config.linkShowAdvancedTab = false
  config.linkShowTargetTab = false
  config.resize_enabled = false

  config.toolbar = 'Lighter'
  config.toolbar_Lighter =
    [ { name: 'Format', items : [ 'Format'  ] }
    , { name: 'Paragraphe', items : [ 'NumberedList', 'BulletedList', '-', 'Outdent', 'Indent', '-', 'Blockquote' ] }
    , { name: 'Style', items : [ 'Bold', 'Italic', 'Underline', 'Strike', '-', 'TextColor', 'BGColor', '-', 'RemoveFormat' ] },
    , { name: 'Lien', items : [ 'Link', 'Unlink' ] }
    , { name: 'Variables', items : [ 'Variables' ] }
    , { name: 'Historique', items : [ 'Undo', 'Redo', '-', 'ShowBlocks' ] }
    ]
}
