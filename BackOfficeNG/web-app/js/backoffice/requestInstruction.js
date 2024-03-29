zenexity.capdemat.tools.namespace('zenexity.capdemat.bong.request');

(function() {

  var zcbr = zenexity.capdemat.bong.request;
  var zcb = zenexity.capdemat.bong;
  var zca = zenexity.capdemat.aspect;
  var zct = zenexity.capdemat.tools;
  var zcv = zenexity.capdemat.Validation;
  var zcc = zenexity.capdemat.common;
  var yud = YAHOO.util.Dom;
  var yuel = YAHOO.util.Element;
  var yue = YAHOO.util.Event;
  var yus = YAHOO.util.Selector;
  var ylj = YAHOO.lang.JSON;
  var yl = YAHOO.lang;
  var yw = YAHOO.widget;
  var yu = YAHOO.util;
  
  zcbr.Permission = {
    validate : function(e) {
      return zcbr.Permission.validateAgent(e) 
        && zcbr.Permission.validateState(e)
        && zcbr.Permission.isActive(e);
    },
    validateAgent : function(e) {
      yue.stopEvent(e);
      return zcb['agentCanWrite'] == 'true';
    },
    validateState : function(e) {
      yue.stopEvent(e);
      var el = yud.get('requestState');
      var style = /tag-(\w+)/i.exec(el.className);
      var state = (style||['',''])[1], result = true;
      result = result && zct.inArray(state,zcbr.Permission.getPermittedStates()) >= 0;
      
      return result;      
    },
    getPermittedStates: function() {
      return zct.map(zcb['editableStates'],function(n){return n.toLowerCase();});
    },
    isActive: function(e) {
      return !yud.getAncestorByClassName(yue.getTarget(e), 'not-action-editField');
    }
  };

  zcbr.RequestLock = function() {
    return {
      clickEvent : undefined,
      init : function() {
        zcbr.RequestLock.panel = new yw.Panel(
          'requestLockPanel',
          { width: '300px',
            visible: false,
            constraintoviewport: true, draggable: false,
            underlay: 'none', close: false
          });
        zcbr.RequestLock.panel.render();
        zcbr.RequestLock.refreshRequestLock();
        zcbr.RequestLock.clickEvent = new zct.Event(zcbr.RequestLock, zcbr.RequestLock.processClick);
        yue.on(yud.get("requestLockContainer"),'click', zcbr.RequestLock.clickEvent.dispatch, zcbr.RequestLock.clickEvent, true);
        yue.on(yud.get("requestLockPanel"),'click', zcbr.RequestLock.clickEvent.dispatch, zcbr.RequestLock.clickEvent, true);
        zca.advise("validateAgent",new zca.Advice('beforeSuccess',zcbr.RequestLock.validate),zcbr.Permission);
      },
      processClick : function(e) {
        return yue.getTarget(e).getAttribute("rel");
      },
      switchRequestLockPanel : function(e) {
        zcbr.RequestLock.refreshRequestLock();
        if (zcbr.RequestLock.panel.cfg.getProperty('visible')) {
          zcbr.RequestLock.hideRequestLockPanel();
        } else {
          zct.doAjaxCall("/requestLock/" + zcb.requestId + "?part=panel", null, function(o) {
            zcbr.RequestLock.panel.setBody(o.responseText);
            zcbr.RequestLock.panel.cfg.setProperty("context",
              ["requestLockTag", "tr", "br"]);
            zcbr.RequestLock.panel.show();
          });
        }
      },
      refreshRequestLock : function(e) {
        zct.doAjaxCall("/requestLock/" + zcb.requestId + "?part=tag", null, function(o) {
          yud.get('requestLockContainer').innerHTML = o.responseText;
          yud.setStyle(zcbr.RequestLock.panel.id, 'border-color',
            yud.getStyle(yud.get("requestLockTag"), 'background-color'));
        });
      },
      hideRequestLockPanel : function(e) {
        zcbr.RequestLock.panel.hide();
      },
      lockRequest : function (e) {
        zct.doAjaxPostCall("/requestLock/" + zcb.requestId, null, function(o) {
          zcbr.RequestLock.refreshRequestLock();
          zcbr.RequestLock.hideRequestLockPanel();
        });
      },
      releaseRequest : function (e) {
        zct.doAjaxDeleteCall("/requestLock/" + zcb.requestId, null, function(o) {
          zcbr.RequestLock.refreshRequestLock();
          zcbr.RequestLock.hideRequestLockPanel();
        });
      },
      validate : function(e) {
        zcbr.RequestLock.refreshRequestLock(e);
        return yud.hasClass(yud.get("requestLockTag"), "tag-lockacquired");
      }
    };
  }();
  YAHOO.util.Event.onDOMReady(zcbr.RequestLock.init);

  zcbr.Instruction = function() {

    function init() {
      /* tabview */
      zcbr.Instruction.dataTabView = new yw.TabView('requestData');

      /* panels */
      zcb.instructionStatePanel = new yw.Panel(
        'instructionStatePanel',
        { width: '250px',
          context: [yud.get('requestState'),'tr','br'],
          visible: false,
          constraintoviewport: true, draggable: false,
          underlay: 'none', close: false
        });
      zcb.instructionStatePanel.render();
    }

    /*
     * Request Instruction Worflow managment
     * ------------------------------------------------------------------------------------------ */
    function submitChangeStateForm(targetEl , formId) {
      // bad strategy to refresh tag state ...
      var form = yud.get(formId);
      var newTagStateEl = yud.getNextSibling(yus.query('input:checked', form)[0]);

      var submitButton = yus.query('input[name=submitButton]', formId);
      yud.setAttribute(submitButton[0], 'disabled', 'true');
      
      zct.doAjaxFormSubmitCall(
          formId,
          null,
          function(o) {
            var response = ylj.parse(o.responseText);
            if (response.status === 'ok') {
              var oldTagStateEl = yud.get(form.stateType.value);
              oldTagStateEl.className = newTagStateEl.className;
              oldTagStateEl.innerHTML = newTagStateEl.innerHTML;

              zcb.instructionStatePanel.hide();
              zcbr.Information.refreshTab("Historique");
            } else {
              zct.Notifier.processMessage('modelError',response.success_msg);
              submitButton[0].removeAttribute('disabled');
            }
          });
    }

    function getStateTransitions(stateCssClass, stateType) {
      var id = zcb.requestId;

      zct.doAjaxCall(
          '/stateTransitions/' + '?id=' + id
            + '&stateCssClass=' + stateCssClass + '&stateType=' + stateType,
          null,
          function(o) {
            zcb.instructionStatePanel.setBody(o.responseText);
            zcb.instructionStatePanel.show();
          });
    }

    function switchStatePanel(targetEl) {
      yud.setStyle(
          zcb.instructionStatePanel.id,
          'border-color',
          yud.getStyle(targetEl, 'background-color'));

      if (! zcb.instructionStatePanel.cfg.getProperty('visible'))
        getStateTransitions(targetEl.className, targetEl.id);
      else
        zcb.instructionStatePanel.hide();
    }

    var narrowHandler = function (e) {
      var targetEl = yue.getTarget(e);
      
      if (yud.hasClass(targetEl, 'cancelStateChange')) {zcb.instructionStatePanel.hide();}
      else if (yud.hasClass(targetEl, 'submitStateChange')) {
        if (zcv.check(e, yud.get('changeStateFormErrors')))
          submitChangeStateForm(targetEl, 'changeStateForm');
      }
      else if (/tag-/.test(targetEl.className) && !yud.hasClass(targetEl, 'documentLink')
        && !yud.hasClass(targetEl, "requestLockLink") && !yud.hasClass(targetEl, 'externalLink')) {
        switchStatePanel(targetEl);
      }
    };
    yue.on('narrow','click',narrowHandler);

    /*
     * request data inline edition managment
     * ------------------------------------------------------------------------------------------ */
    
    var modifyField = function (targetEl, isSubmit) {
      var formEl = yud.getAncestorByTagName(targetEl, 'form');
      var propertyValue;

      var ddEl = yud.getAncestorByTagName(targetEl, 'dd');
      var propertyWrapperEl = yud.getFirstChild(ddEl);

      if (isSubmit && yud.hasClass(ddEl, 'validate-capdematEnum')) {
        zct.each (yud.get(formEl.id.replace('_Form', '') + '_Field').options, function() {
            if (this.selected === true)
              propertyValue = this;
        });
        propertyWrapperEl.innerHTML = propertyValue.text;
        // FIXME - normalize propertyValue class like class="value<MY_VAL> i18n-<MY_I18n>)"
        var classNameArray = propertyWrapperEl.className.split(' ');
        if (classNameArray.length > 1) classNameArray[0] = propertyValue.value;
        else classNameArray.unshift(propertyValue.value);
        propertyWrapperEl.className = classNameArray.join(' ');   
      }
      else if (isSubmit && yud.hasClass(ddEl, 'validate-address')) {
        var addressFields = yud.getChildren(propertyWrapperEl);
        var newAddressFieldElems = yus.query('fieldset input', formEl);
        var newAddressFields = {};
        zct.each (newAddressFieldElems, function(i) {
          newAddressFields[this.name] = this.value;
        });
        zct.each (addressFields, function() {
          if(newAddressFields[this.name]) {
            this.innerHTML = newAddressFields[this.name];
          }
        });
      }
      else if (isSubmit && (yud.hasClass(ddEl, 'validate-bankAccount') || yud.hasClass(ddEl, 'validate-frenchRIB'))) {
        var staticFields = yud.getChildren(propertyWrapperEl);
        var newFields = yus.query('fieldset input', formEl);
        zct.each (newFields, function(i) {
            staticFields[i].innerHTML = this.value ;
        });
      }
      else if (isSubmit && (yud.hasClass(ddEl, 'validate-boolean') || yud.hasClass(ddEl, 'validate-acceptance'))) {
        var checkedEl;
        // TODO RDJ : bypass yus.query limit (bug with "." in id attribute)
        zct.each(formEl[ddEl.id], function() {
            if (this.checked) checkedEl = this;
        });
        propertyWrapperEl.innerHTML = yl.trim(yud.getNextSibling(checkedEl).innerHTML);
        propertyWrapperEl.className = 'value-' + checkedEl.value; 
      }
      else if (isSubmit && yud.hasClass(ddEl, 'validate-localReferentialData')) {
        zct.doAjaxCall(['/localReferentialData/',
            '?requestId=', zenexity.capdemat.bong.requestId,
            '&javaName=', formEl.id.replace('_Form','')].join(''), [], function(o){
          zct.html(propertyWrapperEl,o.responseText);
        });
      }
      else if (isSubmit && yud.hasClass(ddEl, 'validate-school')) {
        var selectedEl = formEl.schoolId.options[formEl.schoolId.selectedIndex];
        propertyWrapperEl.innerHTML = selectedEl.innerHTML;
        propertyWrapperEl.className = 'value-' + selectedEl.value;
      }
      else if (isSubmit && yud.hasClass(ddEl, 'validate-recreationCenter')) {
        var selectedEl = formEl.recreationCenterId.options[formEl.recreationCenterId.selectedIndex];
        propertyWrapperEl.innerHTML = selectedEl.innerHTML;
        propertyWrapperEl.className = 'value-' + selectedEl.value;
      }
      else if (isSubmit && yud.hasClass(ddEl, 'validate-time')) {
        var h = formEl[formEl.id.replace('_Form', '_hour')].value;
        var m = formEl[formEl.id.replace('_Form', '_minute')].value;
        propertyWrapperEl.innerHTML = h + ' : ' + m;
      }
      else if (isSubmit) {
        var elName = formEl.id.replace('_Form', '') + '_Field';
        propertyValue = yud.get(elName).value;
        propertyWrapperEl.innerHTML = propertyValue;
      }
      yud.removeClass(propertyWrapperEl, 'invisible');

      new yuel(ddEl).removeChild(formEl);
      yud.removeClass(ddEl, 'current-editField');
      
      // reset edition state of field
      zcbr.Instruction.editFieldState[ddEl.id] = false;
       // FIXME - poor solution to manage condition chaining
      zcb.Condition.reInit();
    };

    return { 
      inlineEditEvent : undefined,
      
      init : function() { 
        init();
        zcbr.Instruction.inlineEditEvent = new zct.Event(zcbr.Instruction, zcbr.Instruction.getHandler);
        yue.on('requestData','click',zcbr.Instruction.inlineEditEvent.dispatch,zcbr.Instruction.inlineEditEvent,true);
        switchStatePanel = zca.advise(switchStatePanel,new zca.Advice('beforeSuccess',zcbr.Permission.validateAgent));
        zca.advise(['addListItem','deleteListItem','editField'],
          new zca.Advice('beforeSuccess',zcbr.Permission.validate),zcbr.Instruction);
      },
      
      // TODO - refactor dispatch policy
      getTarget : function (e) {
          var targetEl = yue.getTarget(e);
          if (targetEl.tagName != 'DD' && targetEl.tagName != 'INPUT'  && targetEl.tagName != 'A')
            targetEl = yud.getAncestorByTagName(targetEl, 'dd');
          return targetEl;
      },
      getHandler : function(e) {
        var targetEl = zcbr.Instruction.getTarget(e);
        if (yl.isNull(targetEl) || yud.hasClass(targetEl, 'current-editField'))
          return undefined;
        else if (targetEl.tagName === 'A')
          return targetEl.className;
        else if (targetEl.tagName === 'DD')
          return targetEl.className.split(' ')[0].split('-')[1];
        else
          return targetEl.className.split(' ')[0];
      },
      
      // State of current edited field
      editFieldState : {},

      // TODO - pluginized edition widget managment
      editField : function(e) {
          var targetEl = zcbr.Instruction.getTarget(e);
          if (zcbr.Instruction.editFieldState[targetEl.id]) return;
          else zcbr.Instruction.editFieldState[targetEl.id] = true;
          var propertyValue;
          var propertyWrapperEl = yud.getFirstChild(targetEl);
          var jsonPropertyType = {}
          zct.each(targetEl.className.split(' '), function(i) {
            var entry = this.split('-');
            jsonPropertyType[entry[0]] = entry[1];
          });
          
          if (zct.isIn(jsonPropertyType['validate'],['address','frenchRIB'])) {
            var json = {};
            zct.each(yud.getChildren(propertyWrapperEl), function(i) {
                json[this.className] = this.innerHTML;
            });
            propertyValue = ylj.stringify(json);
          }
          else if (jsonPropertyType['validate'] ===  'bankAccount') {
            var fields = yud.getChildren(propertyWrapperEl);
            propertyValue = ylj.stringify({"BIC" : fields[0].innerHTML, "IBAN" : fields[1].innerHTML});
          }
          else if (jsonPropertyType['validate'] ===  'capdematEnum') {
            propertyValue = propertyWrapperEl.className;
          }
          else if (jsonPropertyType['validate'] ===  'boolean' || jsonPropertyType['validate'] ===  'acceptance') {
            propertyValue = propertyWrapperEl.className.split('-')[1];
          }
          else if (jsonPropertyType['validate'] ===  'school') {
            propertyValue = (propertyWrapperEl.className.split('-')[1])||null;
          }
          else if (jsonPropertyType['validate'] ===  'recreationCenter') {
            propertyValue = (propertyWrapperEl.className.split('-')[1])||null;
          }
          else {
            propertyValue = propertyWrapperEl.innerHTML;
          }

          zct.doAjaxPostCall(
            '/widget', 'id=' + zenexity.capdemat.bong.requestId
            + '&propertyType=' + ylj.stringify(jsonPropertyType)
            + '&propertyName=' + targetEl.id
            + '&propertyValue=' + propertyValue
            + '&propertyRegex=' + (yl.isUndefined(targetEl.attributes.regex) ? '' : encodeURIComponent(targetEl.attributes.regex.value)),
            function(o) {
              yud.addClass(targetEl, 'current-editField');
              yud.addClass(yud.getFirstChild(targetEl), 'invisible');
              targetEl.innerHTML += o.responseText;

              if(jsonPropertyType.validate === 'address') {
                if(zcc.AddressAutocomplete) {
                  zcc.AddressAutocomplete.bind(targetEl.id.replace(".","_"));
                }
              }

              if (yud.hasClass(targetEl, 'validate-date')) {
                zcb.Calendar(targetEl.id + "_Field");
              }
              // FIXME: rib complex are never poped
              if (yud.hasClass(targetEl, 'validate-frenchRIB')) {
                zcv.complexRules['rib'].pushFields(targetEl.id + '.bankCode', targetEl.id + '.counterCode', targetEl.id + '.accountNumber', targetEl.id + '.accountKey');
              }
          });
      },
      
      submitField : function (e) {
          var targetEl = zcbr.Instruction.getTarget(e);
          var formEl = yud.getAncestorByTagName(targetEl, 'form');
          
          if (!zcv.check(e, yud.get(formEl.id + 'Errors')))
            return;
          
          zct.doAjaxFormSubmitCall(formEl.id, null, function(o) {
              var response = ylj.parse(o.responseText);
              if (response.status === 'ok') {
                zcb.Condition.run(e);
                modifyField(targetEl, true);
                yud.setStyle(formEl.id.replace('_Form', ''), 'background', '#aaffaa');
              }
              else {
                yud.get(formId + 'Error').innerHTML = response.error_msg;
              }
          });
      },
      
      revertField : function (e) {
          modifyField(zcbr.Instruction.getTarget(e), false);
      },
      
      addListItem : function (e) {    
          var idRegex = /(\w+)_(\w+)\[(\d+)\]/i.exec(yue.getTarget(e).id);
          zct.doAjaxCall(
            '/modifyList/?requestId=' + zcb.requestId + '&listAction=' + yue.getTarget(e).id
            , null,
            function(o) { zct.html(yud.get('widget-' + idRegex[2]), o.responseText); }
          ); 
      },
      
      deleteListItem : function (e) {
          var idRegex = /(\w+)_(\w+)\[(\d+)\]/i.exec(yue.getTarget(e).id);
          zct.doAjaxCall(
            '/modifyList/?requestId=' + zcb.requestId + '&listAction=' + yue.getTarget(e).id
            , null,
            function(o) { zct.html(yud.get('widget-' + idRegex[2]), o.responseText); }
          );
      }
    };
    
  }();
  
  YAHOO.util.Event.onDOMReady(zcbr.Instruction.init);

  /*
   * request Instruction Information
   * ------------------------------------------------------------------------------------------ */
  
  zcbr.Information = function() {
    var infoTabView = undefined;
    var notePanel = undefined;
    var errorPanel = undefined;
    return {
      clickEvent : undefined,
      
      init: function() {
          infoTabView = new yw.TabView();
          var historyTab = new yw.Tab({
              label: 'Historique', dataSrc: zenexity.capdemat.baseUrl + '/history/' + zcb.requestId + "?rnd=" + new Date().valueOf(),
              cacheData: true, active: true });
          infoTabView.addTab(historyTab);
          infoTabView.addTab( new yw.Tab({
              label: 'Compte', dataSrc: zenexity.capdemat.baseUrl + '/homeFolder/' + zcb.requestId,
              cacheData: true }));
          infoTabView.addTab( new yw.Tab({
              label: 'Demandes', dataSrc: zenexity.capdemat.baseUrl + '/homeFolderRequests/' + zcb.requestId,
              cacheData: true }));

          infoTabView.appendTo('requestInformation');
          
          zcbr.Information.clickEvent = new zct.Event(zcbr.Information, zcbr.Information.getHandler);
          yue.on('requestInformation','click', zcbr.Information.clickEvent.dispatch,
            zcbr.Information.clickEvent, true
          );
          
          zca.advise(
            "notify",
            new zca.Advice("before", function(o) {
              zcb.Contact.hide();
              zcbr.Information.refreshHistory();
              o.argument = yud.get("requestHistory");
            }),
            zcb.Contact
          );
          zcb.Contact.init(null, yud.get("contactPanel"), zcb.contactPanelUrl);
          notePanel = new yw.Panel(yud.get("notePanel"), {
            width : "650px", zindex : "2000", visible : false,
            constraintoviewport : true, draggable : true,
            underlay : "shadow", close : true
          });
          notePanel.render();
          errorPanel = new yw.Panel(yud.get("errorPanel"), {
            close: true,
            draggable: false,
            underlay: 'shadow',
            modal: true,
            visible: false,
            context: [
              yus.query('.yui-b', yud.get('yui-main'), true),
              'tl',
              'tl',
              ['beforeShow', 'windowResize'],
              [130, 130]
            ],
            zindex: '2000'
          })
          // Several UI elements should be updated when an error has occured:
          // * request state tag
          // * "not sent" alert
          errorPanel.hideEvent.subscribe(function() {
            // Easiest way is to reload the page.
            window.location.reload()
          })
          errorPanel.render()
          zct.doAjaxCall("/requestNote/" + zcb.requestId, null, function(o) {
            notePanel.setBody(o.responseText);
            yue.on(yud.get("note"), "keyup", function(e) {
              zct.limitArea("note", yud.get("note").getAttribute("maxlength"), "noteLimit");
            });
            zct.limitArea("note", yud.get("note").getAttribute("maxlength"), "noteLimit");
            yue.addListener(yud.get("hideNote"), "click", function(e) {
              yue.preventDefault(e);
              notePanel.hide();
            });
            yue.addListener(yud.get("submitNote"), "click", function(e) {
              yue.preventDefault(e);
              var cont = yud.get("noteFormErrors");
              cont.innerHTML = "";
              if (zcv.check(yud.get("noteForm"), cont)) {
                zct.doAjaxFormSubmitCall("noteForm", null, function(o) {
                  var json = ylj.parse(o.responseText);
                  if (json.status === "ok") {
                    notePanel.hide();
                    zcbr.Information.refreshHistory();
                    zct.Notifier.processMessage("success", json.success_msg, null, yud.get("requestHistory"));
                  }
                });
              }
            });
          });
          historyTab.addListener("contentChange", function() {
            zcb.Contact.show({"target" : yud.get("contactLink"), "event" : "click"});
            yue.addListener(yud.get("noteLink"), "click", function(e) {
              yue.preventDefault(e);
              notePanel.show();
            });
          });
          // Look for the first external service trace. If its type is error
          // or not sent, pops-up a warning.
          historyTab.on('contentChange', function(event) {
            var action = yud.getAncestorBy(
              yus.query('.tag-external', historyTab.get('contentEl'), true),
              function(ancestor) {
                return yud.hasClass(ancestor, 'action')
              }
            )
            if (yud.hasClass(yus.query('dd span', action, true), /tag-error|tag-notsent/) &&
                !yud.inDocument('notSent')) {
              errorPanel.show()
            }
          })
      },
      getHandler : function(e) {
          return yue.getTarget(e).id;
      },
      refreshTab : function(label) {
        zct.each(infoTabView.get("tabs"), function() {
          if (this.get("label") == label) {
            var cacheData = this.get("cacheData");
            var contentVisible = this.get("contentVisible");
            if (label === "Historique") {
                //Force cache update on IE.
                this.set('dataSrc', this.get('dataSrc').replace(/rnd.*/, 'rnd=' + new Date().valueOf()));
            }
            this.set("cacheData", false);
            this.set("contentVisible", false);
            this.set("contentVisible", true);
            this.set("contentVisible", contentVisible);
            this.set("cacheData", cacheData);
          }
        }, null);
      },
      refreshHistory : function(e) {
        zcbr.Information.refreshTab("Historique");
      },
      addTab : function(label, url, cacheData, active) {
        infoTabView.addTab( new yw.Tab({
          label: label, dataSrc: zenexity.capdemat.baseUrl + url,
          cacheData: cacheData, active: active }));
      }
    };

  }();
  YAHOO.util.Event.onDOMReady(zcbr.Information.init);

  zcbr.External = function() {
    var sending = false;
    return {
      clickEvent : undefined,
      init : function() {
        zcbr.External.clickEvent = new zct.Event(zcbr.External, zcbr.External.processClick);
        yue.on(yud.get('externalService'),'click',zcbr.External.clickEvent.dispatch,zcbr.External.clickEvent,true);
        if (!!(zcbr.External.label)) {
          zcbr.External.externalReferentialCheck(null, zcb.requestId, zcbr.External.label);
        }
      },
      processClick : function(e) {
        var targetEl = yue.getTarget(e);
        if (yud.hasClass(targetEl, 'externalLink') && yud.hasClass(targetEl, 'tag-pending')) {
          return "";
        }
        return (targetEl.id||'_').split('_')[0];
      },
      externalReferentialCheck : function(e, _id, _label) {
        var id, label;
        if (e != null) {
          id = yue.getTarget(e).id.split('_')[2];
          label = yue.getTarget(e).id.split('_')[3];
        } else {
          id = _id;
          label = _label;
        }
        yud.get("externalReferentialChecksContainer").innerHTML = "";
        yud.removeClass(yud.get("externalReferentialChecksPendingMessage"), 'invisible');
        zct.doAjaxCall("/externalReferentialChecks?id=" + id + "&label=" + label, null, function(o) {
          yud.addClass(yud.get("externalReferentialChecksPendingMessage"), 'invisible');
          yud.get("externalReferentialChecksContainer").innerHTML = o.responseText;
        });
      },
      sendRequest : function(e) {
        if (sending) return;
        var label = yue.getTarget(e).id.split('_')[1];
        sending = true;
        zct.doAjaxFormSubmitCall("sendRequestForm", null, function(o) {
          zcbr.Information.refreshTab("Historique");
          yud.get("externalStatusContainer").innerHTML = o.responseText;
          sending = false;
        });
      }
    };
  }();
  YAHOO.util.Event.onDOMReady(zcbr.External.init);


}()

);
