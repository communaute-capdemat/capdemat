
<html>
  <head>
    <meta name="layout" content="fong_main" />
    <script type="text/javascript" src="${createLinkTo(dir:'js/frontoffice',file:'condition.js')}"></script>
  </head>  
  <body>
      <h2 class="request-creation">
<!--      <a href="#" id="requestSubmit">envoyer</a>-->
      <g:render template="/frontofficeRequestType/widget/requestDesc" model="[requestType: dhr]"/> 
      <span><g:message code="dhr.duration.label" /><strong><g:message code="dhr.duration.value" /></strong></span>
      <span>
        Documents à fournir :
        <strong>Pièce d'identité</strong>, 
        <strong class="mandatory">Livret de famille</strong>
      </span>
    </h2>
  <div id="yui-main"> 
    <div id="main" class="yui-b">
       <div id="requestTabView" class="yui-navset">
         <ul class="yui-nav">
          
         <li class="${currentTab == 'tab1' ? 'selected' : ''}"><a href="#tab1"><em>
             <span class="tag-no_right">1</span>
             <span class="tag-rejected"><g:message code="dhr.step.tag.rejected.short" /></span>
             <g:message code="dhr.step.subject.label" />
           </em></a></li>
         
		  
         <li class="${currentTab == 'tab2' ? 'selected' : ''}"><a href="#tab2"><em>
             <span class="tag-no_right">2</span>
             <span class="tag-rejected"><g:message code="dhr.step.tag.rejected.short" /></span>
             <g:message code="dhr.step.dwelling.label" />
           </em></a></li>
         
		  
         <li class="${currentTab == 'tab3' ? 'selected' : ''}"><a href="#tab3"><em>
             <span class="tag-no_right">3</span>
             <span class="tag-rejected"><g:message code="dhr.step.tag.rejected.short" /></span>
             <g:message code="dhr.step.resources.label" />
           </em></a></li>
         
		  
         <li class="${currentTab == 'tab4' ? 'selected' : ''}"><a href="#tab4"><em>
             <span class="tag-no_right">4</span>
             <span class="tag-rejected"><g:message code="dhr.step.tag.rejected.short" /></span>
             <g:message code="dhr.step.taxes.label" />
           </em></a></li>
         
		  
         <li class="${currentTab == 'tab5' ? 'selected' : ''}"><a href="#tab5"><em>
             <span class="tag-no_right">5</span>
             <span class="tag-rejected"><g:message code="dhr.step.tag.rejected.short" /></span>
             <g:message code="dhr.step.documentRef.label" />
           </em></a></li>
         
		  
         <li class="${currentTab == 'tab6' ? 'selected' : ''}"><a href="#tab6"><em>
             <span class="tag-no_right">6</span>
             <span class="tag-rejected"><g:message code="dhr.step.tag.rejected.short" /></span>
             <g:message code="dhr.step.validationRef.label" />
           </em></a></li>
         
		 
		 </ul>
         <div class="yui-content">
         
           <div id="tab1">
             <form method="POST" id="subjectForm" action="<g:createLink action="validSubject" />">
               <h3>
                 <span class="tag-rejected"><g:message code="dhr.step.tag.rejected"/></span>
                 <g:message code="dhr.step.subject.label" />
                 <span><g:message code="dhr.step.subject.desc" /></span>
               </h3>
               
               <g:render template="/frontofficeRequestType/domesticHelpRequest/steps/subject" /> 
               
               <div class="error" id="subjectFormErrors"> </div>
               
               <!-- Input submit-->
               <input type="button"
                   id="submitSubject" 
		           name="submitSubject" 
		           value="<g:message code='dhr.step.subject.submitLabel'/>" />
             </form>
             <!-- navigation link -->
             <div class="navTab">
               
               
               <a href="#tab2" class="nextTab"><g:message code="dhr.step.navigation.next"/></a>
             </div>
           </div>  
         
           <div id="tab2">
             <form method="POST" id="dwellingForm" action="<g:createLink action="validDwelling" />">
               <h3>
                 <span class="tag-rejected"><g:message code="dhr.step.tag.rejected"/></span>
                 <g:message code="dhr.step.dwelling.label" />
                 <span><g:message code="dhr.step.dwelling.desc" /></span>
               </h3>
               
               <g:render template="/frontofficeRequestType/domesticHelpRequest/steps/dwelling" /> 
               
               <div class="error" id="dwellingFormErrors"> </div>
               
               <!-- Input submit-->
               <input type="button"
                   id="submitDwelling" 
		           name="submitDwelling" 
		           value="<g:message code='dhr.step.dwelling.submitLabel'/>" />
             </form>
             <!-- navigation link -->
             <div class="navTab">
               
               <a href="#tab1" class="prevTab"><g:message code="dhr.step.navigation.previous"/></a>
               
               <a href="#tab3" class="nextTab"><g:message code="dhr.step.navigation.next"/></a>
             </div>
           </div>  
         
           <div id="tab3">
             <form method="POST" id="resourcesForm" action="<g:createLink action="validResources" />">
               <h3>
                 <span class="tag-rejected"><g:message code="dhr.step.tag.rejected"/></span>
                 <g:message code="dhr.step.resources.label" />
                 <span><g:message code="dhr.step.resources.desc" /></span>
               </h3>
               
               <g:render template="/frontofficeRequestType/domesticHelpRequest/steps/resources" /> 
               
               <div class="error" id="resourcesFormErrors"> </div>
               
               <!-- Input submit-->
               <input type="button"
                   id="submitResources" 
		           name="submitResources" 
		           value="<g:message code='dhr.step.resources.submitLabel'/>" />
             </form>
             <!-- navigation link -->
             <div class="navTab">
               
               <a href="#tab2" class="prevTab"><g:message code="dhr.step.navigation.previous"/></a>
               
               <a href="#tab4" class="nextTab"><g:message code="dhr.step.navigation.next"/></a>
             </div>
           </div>  
         
           <div id="tab4">
             <form method="POST" id="taxesForm" action="<g:createLink action="validTaxes" />">
               <h3>
                 <span class="tag-rejected"><g:message code="dhr.step.tag.rejected"/></span>
                 <g:message code="dhr.step.taxes.label" />
                 <span><g:message code="dhr.step.taxes.desc" /></span>
               </h3>
               
               <g:render template="/frontofficeRequestType/domesticHelpRequest/steps/taxes" /> 
               
               <div class="error" id="taxesFormErrors"> </div>
               
               <!-- Input submit-->
               <input type="button"
                   id="submitTaxes" 
		           name="submitTaxes" 
		           value="<g:message code='dhr.step.taxes.submitLabel'/>" />
             </form>
             <!-- navigation link -->
             <div class="navTab">
               
               <a href="#tab3" class="prevTab"><g:message code="dhr.step.navigation.previous"/></a>
               
               <a href="#tab5" class="nextTab"><g:message code="dhr.step.navigation.next"/></a>
             </div>
           </div>  
         
           <div id="tab5">
             <form method="POST" id="documentRefForm" action="<g:createLink action="validDocumentRef" />">
               <h3>
                 <span class="tag-rejected"><g:message code="dhr.step.tag.rejected"/></span>
                 <g:message code="dhr.step.documentRef.label" />
                 <span><g:message code="dhr.step.documentRef.desc" /></span>
               </h3>
               
               <g:render template="/frontofficeRequestType/domesticHelpRequest/steps/documentRef" /> 
               
               <div class="error" id="documentRefFormErrors"> </div>
               
               <!-- Input submit-->
               <input type="button"
                   id="submitDocumentRef" 
		           name="submitDocumentRef" 
		           value="<g:message code='dhr.step.documentRef.submitLabel'/>" />
             </form>
             <!-- navigation link -->
             <div class="navTab">
               
               <a href="#tab4" class="prevTab"><g:message code="dhr.step.navigation.previous"/></a>
               
               <a href="#tab6" class="nextTab"><g:message code="dhr.step.navigation.next"/></a>
             </div>
           </div>  
         
           <div id="tab6">
             <form method="POST" id="validationRefForm" action="<g:createLink action="validValidationRef" />">
               <h3>
                 <span class="tag-rejected"><g:message code="dhr.step.tag.rejected"/></span>
                 <g:message code="dhr.step.validationRef.label" />
                 <span><g:message code="dhr.step.validationRef.desc" /></span>
               </h3>
               
               <g:render template="/frontofficeRequestType/domesticHelpRequest/steps/validationRef" /> 
               
               <div class="error" id="validationRefFormErrors"> </div>
               
               <!-- Input submit-->
               <input type="button"
                   id="submitValidationRef" 
		           name="submitValidationRef" 
		           value="<g:message code='dhr.step.validationRef.submitLabel'/>" />
             </form>
             <!-- navigation link -->
             <div class="navTab">
               
               <a href="#tab5" class="prevTab"><g:message code="dhr.step.navigation.previous"/></a>
               
             </div>
           </div>  
                 
       	 </div><!-- end yui-content -->
       </div><!-- end requestTabView -->
 	  
<div class="helpBox">
        <h3>Aide</h3>
        <dl>
          <dt>Sujet</dt>
          <dd>
            Afin d'améliorer la communication et les échanges et de favoriser la participation 
            et la contribution, le projet CapDémat se dote de nouveaux moyens de discussion
          </dd>
          <dt>Documents</dt>
          <dd>
            Afin d'améliorer la communication et les échanges et de favoriser la participation 
          </dd>
          <dt>Formulaire</dt>
          <dd>
             et la contribution, le projet CapDémat se dote de nouveaux moyens de discussion
            Afin d'améliorer la communication et les échanges et de favoriser la participation
          </dd>
          <dt>Moyen de contact</dt>
          <dd>
            de favoriser la participation 
            et la contribution, le projet CapDémat se dote de nouveaux moyens de discussion
          </dd>
        </dl>
      </div>
     
     </div> <!-- end main -->
    </div> <!-- end yui-main -->

    <div id="narrow" class="yui-b">
      
      <div id="requestSubject" class="requestBox">
        <h3>
          <span class="tag-validated">v</span>
          <em>Sujet de la demande</em>
        </h3>
        <div class="body">
          <strong>M. Hervé Martin</strong>
          <a href="#">choisir un autre sujet</a>
        </div>
      </div>
      
      <div id="requestMeansOfContact" class="requestBox">
        <h3>
          <em>Moyen de contact</em>
        </h3>
        <div class="body">
          <form action="#">
            <select name="requestMeansOfContactSelect">
              <option>Courriel</option>
              <option>Téléphone</option>
              <option>Courrier</option>
              <option>SMS</option>
              <option>Mobile</option>
            </select>
          </form>
        </div>
      </div>
     
      <div id="requestDocument" class="requestBox">
        <h3>
          <span class="tag-rejected">r</span>
          <em>Documents à fournir</em>
        </h3>
        <div class="body">
          <ul>
            <li>
              <span class="tag-rejected">r</span> 
              <a href="#"><strong>Pièce d'identité</strong></a>
            </li>
            <li>
              <span class="tag-validated">v</span> 
              <a href="#"><strong>Livret de famille</strong></a>
            </li>
          </ul>
        </div>
      </div>
    
      <!-- 
      <div class="nobox">
        <h3>Broullons</h3>
        <ul>
         <li><span class="tag-validated">complet</span>Demande d'assistance à distance </li>
         <li><span class="tag-validated">complet</span>Inscription scolair</li>
         <li><span class="tag-pending">partiel</span>Inscription à la cantine scolaire</li>
        </ul>
      </div>
      -->
      
      <!--
      <h3>Denières demandes</h3>
      <ul>
       <li><span class="tag-pending">traitée</span>Demande d'assistance à distance - 12/08/2008</li>
       <li><span class="tag-validated">validée</span>Inscription scolair - 10/08/2008</li>
       <li><span class="tag-rejected">annulée</span>Inscription à la cantine scolaire - 10/08/2008</li>
      </ul>

      <h3>Documents</h3>
      <ul>
       <li>Carte d'identité - rafik</li>
       <li>Passeport - superman</li>
       <li>Lvret de famille - Zenexity</li>
       <li>Justificatif de domocile - rue Taitbout</li>
      </ul>

      <h3>Compte famille</h3>
      <ul>
       <li>Rafik DJEJDIG - 10/10/1910</li>
       <li>Rafik DJEJDIG - 10/10/1910</li>
       <li>Rafik DJEJDIG - 10/10/1910</li>
       <li>Rafik DJEJDIG - 10/10/1910</li>
      </ul>
      -->     
    </div><!-- end of narrow -->
    <script type="text/javascript">
      // next Links
      var activeNextTabByLink = function(e) {
	      YAHOO.util.Event.preventDefault(e);
        var requestFormTabView = new YAHOO.widget.TabView('requestTabView');
	      var activeTabIndex = requestFormTabView.get('activeIndex');
	      requestFormTabView.set('activeIndex' , activeTabIndex + 1);
      }
      
      YAHOO.util.Event.addListener(
          YAHOO.util.Dom.getElementsByClassName("nextTab", "a" ),
          "click", 
          activeNextTabByLink
      );
      
      // prev Links
      var activePrevTabByLink = function(e) {
	      YAHOO.util.Event.preventDefault(e);
        var requestFormTabView = new YAHOO.widget.TabView('requestTabView');
	      var activeTabIndex = requestFormTabView.get('activeIndex');
	      requestFormTabView.set('activeIndex' , activeTabIndex - 1);
      }
      
      YAHOO.util.Event.addListener(
          YAHOO.util.Dom.getElementsByClassName("prevTab", "a" ),
          "click", 
          activePrevTabByLink
      );

 	  function checkAllConditions() {
      	
      	var conditionsName = ["isNonEuropean", "haveFamilyReferent", "isOtherPensionPlan", "isCurrentDwellingPlaceOfResidence", "isSpouseRetired", "isRealEstate", "isSpouseOtherPensionPlan", "isMadam", "isPreviousDwellingPlaceOfResidence", "haveGuardian", "isSpouseNonEuropean", "isCoupleRequest", "isSpouseMadam"];
      }
      
      function conditionChange(e) {
      	Condition.change(this.className, "domesticHelpRequest");
      }
      
      // CONDITION TRIGGER
	  YAHOO.util.Event.addListener(
        YAHOO.util.Dom.getElementsByClassName("*trigger", "select" ),
        "change", 
        conditionChange
      );
        
      // CONDITION TRIGGER
	  YAHOO.util.Event.addListener(
        YAHOO.util.Dom.getElementsByClassName("*trigger", "input" ),
        "change", 
        conditionChange
      );
         
	  YAHOO.util.Event.onDOMReady(checkAllConditions);
	  
	  // VALIDATION
	  
	  var submitRsrSubjectButton = new YAHOO.widget.Button("submitSubject");
      submitRsrSubjectButton.on("click", FIC_checkForm, document.getElementById('subjectFormErrors'));
      submitRsrSubjectButton.on("click", onSubmitClick, "subjectForm");
	  
	  var submitRsrSubjectButton = new YAHOO.widget.Button("submitDwelling");
      submitRsrSubjectButton.on("click", FIC_checkForm, document.getElementById('dwellingFormErrors'));
      submitRsrSubjectButton.on("click", onSubmitClick, "dwellingForm");
	  
	  var submitRsrSubjectButton = new YAHOO.widget.Button("submitResources");
      submitRsrSubjectButton.on("click", FIC_checkForm, document.getElementById('resourcesFormErrors'));
      submitRsrSubjectButton.on("click", onSubmitClick, "resourcesForm");
	  
	  var submitRsrSubjectButton = new YAHOO.widget.Button("submitTaxes");
      submitRsrSubjectButton.on("click", FIC_checkForm, document.getElementById('taxesFormErrors'));
      submitRsrSubjectButton.on("click", onSubmitClick, "taxesForm");
	  
	  var submitRsrSubjectButton = new YAHOO.widget.Button("submitDocumentRef");
      submitRsrSubjectButton.on("click", FIC_checkForm, document.getElementById('documentRefFormErrors'));
      submitRsrSubjectButton.on("click", onSubmitClick, "documentRefForm");
	  
	  var submitRsrSubjectButton = new YAHOO.widget.Button("submitValidationRef");
      submitRsrSubjectButton.on("click", FIC_checkForm, document.getElementById('validationRefFormErrors'));
      submitRsrSubjectButton.on("click", onSubmitClick, "validationRefForm");
	  
	  
	  function onSubmitClick(ev, formId) {
		zenexity.capdemat.common.doAjaxFormSubmitCall(formId ,null,  
		function(o) {
		     if (o.status == "200")
		     	resetFormErrors(formId + "Errors");
		});
	  }
	  
	  function resetFormErrors(formErrors) { 
		YAHOO.util.Dom.get(formErrors).innerHTML = '';
		
	  }
	  
    // Request TabView Initialization
    function initRequest() {
      var requestFormTabView = new YAHOO.widget.TabView('requestTabView');
    }

    YAHOO.util.Event.onDOMReady(initRequest);
   </script>

  </body>
</html>
