/**
 * Custom RTE module based on YUI SimpleEditor.
 *
 * @namespace zenexity.capdemat.bong
 * @author jsb@zenexity.fr
 *
 **/
zenexity.capdemat.tools.namespace("zenexity.capdemat.bong");
(function() {
  var zcb = zenexity.capdemat.bong;
  var zct = zenexity.capdemat.tools;
  var yud = YAHOO.util.Dom;
  var yue = YAHOO.util.Event;
  var ylj = YAHOO.lang.JSON;
  /**
   * @description Builds an editor for an HTML input.
   *   The input must have {label}Editor ID, it must be in a form
   *   with {label}Form ID, and the form must have a {label}Button input
   *   of submit type.
   * @method Editor
   * @namespace zenexity.capdemat.bong
   * @param label {String} The id of the input to handle
   * @param options {Object} Used as options passed to YUI editor if present;
   *   you should clone zcb.Editor.options and customize it.
   * @returns {Object} The editor which was just built
   *
   * @author jsb@zenexity.fr
   **/
  zcb.Editor = function(label, options) {
    if (!options) options = zcb.Editor.options;
    var editorId = label + "Editor";
    var save = function(e) {
      editor.saveHTML();
      zct.doAjaxFormSubmitCall(label + "Form", [], function(r) {
        zct.Notifier.processMessage("success",
          ylj.parse(r.responseText).success_msg, null, e);
      });
    };
    options.width = (zct.width(yud.get(editorId).parentNode) - 5) + "px";
    var editor = new YAHOO.widget.SimpleEditor(editorId, options);
    editor._docType =
      '<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">';
    yue.on(yud.get(label + "Button"), "click", save);
    editor.render();
    return editor;
  };
  zcb.Editor.options = {
    focusAtStart: false,
    height : "400px",
    markup : "xhtml",
    toolbar : {
      titlebar: "Text editor",
      buttons: [
        {
          group: 'textstyle', label: 'Font name & size',
          buttons: [
            { type: 'select', label: 'Arial', value: 'fontname', disabled: true,
              menu: [
                { text: 'Arial', checked: true },
                { text: 'Arial Black' },
                { text: 'Comic Sans MS' },
                { text: 'Courier New' },
                { text: 'Lucida Console' },
                { text: 'Tahoma' },
                { text: 'Times New Roman' },
                { text: 'Trebuchet MS' },
                { text: 'Verdana' }
            ]},
            { type: 'spin', label: '13', value: 'fontsize', range: [ 9, 75 ], disabled: true },
            { type: 'separator' }
          ]
        },
        {
          group: 'textstyle', label: 'Font style',
          buttons: [
            { type: 'push', label: 'Bold', value: 'bold' },
            { type: 'push', label: 'Italic', value: 'italic' },
            { type: 'push', label: 'Underline', value: 'underline' },
            { type: 'separator' }
          ]
        },
        {
          group: 'textstyle', label: 'Colors',
          buttons: [
            { type: 'color', label: 'Font Color', value: 'forecolor', disabled: true },
            { type: 'color', label: 'Background Color', value: 'backcolor', disabled: true },
            { type: 'separator' }
          ]
        },
        {
          group: 'textstyle', label: 'Lists',
          buttons: [
            { type: 'push', label: 'Ordered list', value: 'insertorderedlist' },
            { type: 'push', label: 'Unordered list', value: 'insertunorderedlist' },
            { type: 'separator' }
          ]
        }
      ]
    }
  };
}());
