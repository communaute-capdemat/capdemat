// RequestInstruction TabView Initialization
function initRequestInstruction() {
	// TabView 1 (Request's History and Notes)
	var requestInformationTabview = new YAHOO.widget.TabView();
    
    requestInformationTabview.addTab( new YAHOO.widget.Tab({
        label: 'Historique',
        dataSrc: YAHOO.capdematBo.baseUrl + '/loadRequestHistory/' + YAHOO.capdematBo.requestId,
        cacheData: true,
        active: true
    }));
    requestInformationTabview.addTab( new YAHOO.widget.Tab({
        label: 'Commentaires',
        dataSrc: YAHOO.capdematBo.baseUrl + '/loadRequestNotes/' + YAHOO.capdematBo.requestId,
        cacheData: false
    }));
    requestInformationTabview.addTab( new YAHOO.widget.Tab({
        label: 'Compte',
        dataSrc: YAHOO.capdematBo.baseUrl + '/loadHomeFolderData',
        cacheData: true
    }));
    requestInformationTabview.addTab( new YAHOO.widget.Tab({
        label: 'Demandes',
        dataSrc: YAHOO.capdematBo.baseUrl + '/loadHomeFolderRequests/' + YAHOO.capdematBo.requestId,
        cacheData: true
    }));
    
    requestInformationTabview.appendTo('requestInformation');
    
    var requestDataTabView = new YAHOO.widget.TabView('requestData');
    
    
    // Instruction State Panel
    YAHOO.capdematBo.instructionStatePanel = new YAHOO.widget.Panel(
            "instructionStatePanel", 
            { width: "135%", 
              visible: false, 
              constraintoviewport: true,
              draggable: false,
              underlay: "none",
              close: false
            }
    );
    YAHOO.capdematBo.instructionStatePanel.render();
    
    
    // request document panel
    YAHOO.capdematBo.requestDocumentPanel = new YAHOO.widget.Panel(
            "requestDocumentPanel", 
            { width: "800px",
              y: 120,
              visible: false, 
              constraintoviewport: false,
              draggable: true,
              underlay: "none",
              close: true
            }
    );
    YAHOO.capdematBo.requestDocumentPanel.render();
    
    
    // ecitizen contact panel
    YAHOO.capdematBo.ecitizenContactPanel = new YAHOO.widget.Panel(
            "ecitizenContactPanel", 
            { width: "600px",
              visible: false, 
              constraintoviewport: false,
              draggable: true,
              underlay: "none",
              close: true
            }
    );
    YAHOO.capdematBo.ecitizenContactPanel.render();
}

YAHOO.util.Event.onDOMReady(initRequestInstruction);

/*
function handleAddRequestNoteSuccess(o) {
	var requestInformationTabs = new YAHOO.widget.TabView('requestInformation'); 
	var requestNoteTab = requestInformationTabs.get('activeTab');
	requestNoteTab.set('contentVisible', true);
}

function doAddRequestNote() {
    var queryUrl = YAHOO.capdematBo.baseUrl + "/addRequestNote?" +  collectSearchFormValues('requestNoteForm');   
    doAjaxFormSubmitCall(handleAddRequestNoteSuccess, null, 'requestNoteForm');    
}

YAHOO.util.Event.addListener("submitNewRequestNote","click",doAddRequestNote);
*/



/*
 * Request Instruction Worflow managment
 */
 
 
var handleSubmitStateChangeFormSuccess = function(o) {
    var response = YAHOO.lang.JSON.parse(o.responseText);
    if (response.status === "ok") {
        var oldTagState = o.argument[0];
        var newTagState = o.argument[1];
        
        oldTagState.className = newTagState.className;
        oldTagState.innerHTML = newTagState.innerHTML;
        
        YAHOO.capdematBo.instructionStatePanel.hide();
    } else {
        displayResponseResult('modelError', response.error_msg);
    }
}

function submitChangeStateForm(targetEl , formId) {
    
    // bad strategy to refresh tag state ...
    var nodes = YAHOO.util.Selector.query("input[name=stateType]", formId);
    var oldTagStateEl;
    if (nodes[0].getAttribute("value") != "documentState")
        oldTagStateEl = YAHOO.util.Dom.get(nodes[0].getAttribute("value"));
    else {
        nodes = YAHOO.util.Selector.query("input[name=id]", formId);
        oldTagStateEl = YAHOO.util.Dom.get(
            "documentState_" + nodes[0].getAttribute("value"));
    }
    
    nodes = YAHOO.util.Selector.query("input:checked", formId);
    var newTagStateEl = YAHOO.utilecitizenContactPanel.Dom.getNextSibling(nodes[0]);
    
    doAjaxFormSubmitCall ( handleSubmitStateChangeFormSuccess,
                           [oldTagStateEl, newTagStateEl], 
                           formId);
}

var handleGetStateTransitionsSuccess = function(o) {
   YAHOO.capdematBo.instructionStatePanel.setBody(o.responseText);
   YAHOO.capdematBo.instructionStatePanel.show();
}

function getStateTransitions(stateCssClass, stateType) {   
    var id;
    if (stateType.indexOf("documentState_") != -1) {
        id = stateType.replace("documentState_", "");
        stateType = "documentState";
    } else {
        id = YAHOO.capdematBo.requestId
    }
      
    doAjaxCall(
            '/stateTransitions/'
                    + '?id=' + id
                    + '&stateCssClass=' + stateCssClass 
                    + '&stateType=' + stateType,
            handleGetStateTransitionsSuccess,
            null);
}

function switchStatePanel(targetEl) {
    var targetBgColor = YAHOO.util.Dom.getStyle(targetEl, "background-color");  
    YAHOO.util.Dom.setStyle(YAHOO.capdematBo.instructionStatePanel.id, "border-color", targetBgColor);
    
    YAHOO.capdematBo.instructionStatePanel.cfg.setProperty("context", [targetEl,"tr","br"])
    if (! YAHOO.capdematBo.instructionStatePanel.cfg.getProperty("visible")) {
        getStateTransitions(targetEl.className, targetEl.id);
    }
    else
        YAHOO.capdematBo.instructionStatePanel.hide();
}

function requestStateEventdispatcher(e) {
    var targetEl = YAHOO.util.Event.getTarget(e);
         
    if (targetEl.className === "cancelStateChange")
        YAHOO.capdematBo.instructionStatePanel.hide();
    else if (targetEl.className === "submitStateChange")
        submitChangeStateForm(targetEl, "changeStateForm");
    else if (targetEl.className.indexOf("tag-") != -1 && targetEl.className != "tag-not_provided")
        switchStatePanel(targetEl);
}

YAHOO.util.Event.addListener('narrow', 'click', requestStateEventdispatcher);


/*
 * request document management 
 */
 
var handleSubmitModifyDocumentFormuccess = function(o) {
    var response = YAHOO.lang.JSON.parse(o.responseText);
    if (response.status === "ok") {
        YAHOO.util.Dom.setStyle(o.argument[0], "background", "#aaffaa");
    } else {
        displayResponseResult('modelError', response.error_msg);
    }
}

function submitModifyDocumentForm(formId) {
    doAjaxFormSubmitCall ( handleSubmitModifyDocumentFormuccess,
                           [formId], 
                           formId);
}

var handleGetRequestDocumentSuccess = function(o) {
   YAHOO.capdematBo.requestDocumentPanel.setBody(o.responseText);
   YAHOO.capdematBo.requestDocumentPanel.show();
   // request document tabview
   var requestDocumentDataTabView = new YAHOO.widget.TabView('requestDocumentData');
   
   YAHOO.capdematBo.calendar.cal = new Array(1);
   YAHOO.util.Event.onDOMReady(
      YAHOO.capdematBo.calendar.init, {id: 0, label: "endValidityDate"}
   );
}

function getRequestDocument(targetEl) {
    // hacks for ie6
    var action = targetEl.pathname;
    if (action.indexOf("/") != 0)
        action = "/" + action;
        
    doAjaxCall( action, handleGetRequestDocumentSuccess, null);
}
 
function requestDocumentEventdispatcher(e) {
    YAHOO.util.Event.preventDefault(e);
    
    var targetEl = YAHOO.util.Event.getTarget(e);
    if (targetEl.className === "documentLink")
        getRequestDocument(targetEl);
    else if (targetEl.id === "submitModifyDocumentForm")
        submitModifyDocumentForm("modifyDocumentForm"); 
}

YAHOO.util.Event.addListener('requestDocument', 'click', requestDocumentEventdispatcher);



/*
 * ecitizen contact management 
 */
 

var handleGetEcitizenContactPanelSuccess = function(o) {
   YAHOO.capdematBo.ecitizenContactPanel.setBody(o.responseText);
   YAHOO.capdematBo.ecitizenContactPanel.show();
}

function getEcitizenContactPanel(targetEl) {
    // hacks for ie6
    var action = targetEl.pathname;
    if (action.indexOf("/") != 0)
        action = "/" + action;
        
    doAjaxCall(action, handleGetEcitizenContactPanelSuccess, null);
}
 
function ecitizenContactEventdispatcher(e) {
    YAHOO.util.Event.preventDefault(e);
    
    var targetEl = YAHOO.util.Event.getTarget(e);
    if (targetEl.id === "ecitizenContactLink")
        getEcitizenContactPanel(targetEl); 
}

YAHOO.util.Event.addListener('ecitizenContact', 'click', ecitizenContactEventdispatcher);


