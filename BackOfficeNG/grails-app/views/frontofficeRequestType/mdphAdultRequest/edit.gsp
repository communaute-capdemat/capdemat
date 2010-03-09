
<html>
  <head>
     <title>${message(code:'mar.description')}</title>
    <meta name="layout" content="fo_main" />
    <link rel="stylesheet" type="text/css" href="${resource(dir:'css/frontoffice', file:'request.css')}" />
    <link rel="stylesheet" type="text/css" href="${resource(dir:'css/frontoffice', file:'document.css')}" />
    <g:if test="${flash.addressesReferentialEnabled}">
        <link rel="stylesheet" type="text/css" href="${resource(dir:'css/common', file:'autocomplete.css')}" />
    </g:if>
    <script type="text/javascript" src="${resource(dir:'js/frontoffice',file:'homeFolder.js')}"></script>
    <script type="text/javascript" src="${resource(dir:'js/frontoffice',file:'requestCreation.js')}"></script>
    <script type="text/javascript" src="${resource(dir:'js/frontoffice',file:'condition.js')}"></script>
    <script type="text/javascript" src="${resource(dir:'js/frontoffice',file:'autofill.js')}"></script>
    <g:if test="${flash.addressesReferentialEnabled}">
        <script type="text/javascript" src="${resource(dir:'js/common',file:'addressAutocomplete.js')}"></script>
        <script type="text/javascript" src="${resource(dir:'js/common',file:'autocomplete.js')}"></script>
    </g:if>
    <g:if test="${customJS}">
      <script type="text/javascript" src="${resource(dir:customJS.dir,file:customJS.file)}"></script>
    </g:if>
    <script type="text/javascript">
        zenexity.capdemat.contextPath = "${request.contextPath}";
    </script>
  </head>
  <body>
    <form action="${createLink(controller:'frontofficeRequest',action:'condition')}"
      method="post" id="conditionsForm">
      <input type="hidden" id="conditionsContainer" name="conditionsContainer" value="" />
      <input type="hidden" name="requestTypeLabel" value="${rqt.requestType.label}" />
    </form>
    <form action="${createLink(controller:'frontofficeRequest',action:'autofill')}"
      method="post" id="autofillForm">
      <input type="hidden" id="autofillContainer" name="autofillContainer" value="" />
      <input type="hidden" id="triggerName" name="triggerName" value="" />
      <input type="hidden" id="triggerValue" name="triggerValue" value="" />
    </form>
    <g:if test="${flash.confirmationMessage}">
      <div class="information-box">
      	<p>${flash.confirmationMessage}</p>
      	<g:if test="${flash.confirmationMessageNotice}">
      	  <strong>${flash.confirmationMessageNotice}</strong>
      	</g:if>
      </div>
    </g:if>
    <g:if test="${flash.errorMessage}">
      <div class="error-box">
        <p>${flash.errorMessage}</p>
        <g:if test="${flash.errorMessageNotice}">
          <strong>${flash.errorMessageNotice}</strong>
        </g:if>
      </div>
    </g:if>
    
    <div id="request" class="main-box ${rqt.requestType.category.name}">
      <h2>
        <g:if test="${temporary}">
          <a href="${createLink(controller : 'frontofficeHome', action : 'logout')}" class="button">
            <g:message code="request.action.discard"/>
          </a>
        </g:if>
        <g:else>
          <a href="${createLink(controller:'frontofficeHome')}" class="button">
            <g:message code="request.action.continueLater"/>
          </a>
          <g:if test="${!isEdition}">
            <a href="${createLink(action:'deleteDraft', controller:'frontofficeRequest', params : ['id' : rqt.id, 'from' : 'edition'])}" class="button">
              <g:message code="request.action.discardDarft"/>
            </a>
          </g:if>
        </g:else>
        <g:message code="mar.label" /> <g:message code="message.number" args="[rqt.id]" />
      </h2>
      <p><g:message code="request.duration.label" /><strong> : <g:message code="mar.duration.value" /></strong></p>
      <p>
        <g:message code="request.requiredDocuments.header" /> :
        <g:if test="${!documentTypes.isEmpty()}">
          <g:each var="documentType" in="${documentTypes}" status="index">
            <strong>${documentType?.name}${index < documentTypes.size() - 1 ? ', ' : ''}</strong>
          </g:each>
        </g:if>
        <g:else>
          <g:message code="message.none" />
        </g:else>
      </p>
      <div class="datas">
         <g:set var="requestTypeAcronym" value="mar" scope="request" />
         <g:render template="/frontofficeRequestType/step" /> 
      </div>
      
      <div  class="steps">
      <ul>

  
        <li class="${currentStep == 'subject' ? 'current ' : ''}
          
            ${individual ? rqt.stepStates['subject-' + params.type].state : rqt.stepStates['subject'].state}
          
          ">
          <span class="number">1</span>
          <a
            <g:if test="${currentStep != 'subject' && rqt.stepStates['subject'].state != 'unavailable'}">
              href="${createLink(controller:'frontofficeRequest', action : 'edit', params:['id':rqt.id,'currentStep':'subject'])}"
            </g:if>
          >
            
              <g:message code="${individual ? 'homeFolder.action.add' + org.apache.commons.lang.StringUtils.capitalize(params.type) : 'mar.step.subject.label'}" />
              ${individual ? '' : '*'}
              <span class="help">
                <g:message code="request.step.message.${rqt.stepStates['subject' + (individual ? '-' + params.type : '')].state}" />
              </span>
            
          </a>
        </li>    
  

  
        <li class="${currentStep == 'representantLegal' ? 'current ' : ''}
          
            ${rqt.stepStates['representantLegal'].state}
          
          ">
          <span class="number">2</span>
          <a
            <g:if test="${currentStep != 'representantLegal' && rqt.stepStates['representantLegal'].state != 'unavailable'}">
              href="${createLink(controller:'frontofficeRequest', action : 'edit', params:['id':rqt.id,'currentStep':'representantLegal'])}"
            </g:if>
          >
            
              <g:message code="mar.step.representantLegal.label" />
              <span class="help">
                
                  <g:message code="request.step.message.${rqt.stepStates['representantLegal'].state}" />
                
              </span>
            
          </a>
        </li>    
  

  
        <li class="${currentStep == 'organismePrestationFamiliale' ? 'current ' : ''}
          
            ${rqt.stepStates['organismePrestationFamiliale'].state}
          
          ">
          <span class="number">3</span>
          <a
            <g:if test="${currentStep != 'organismePrestationFamiliale' && rqt.stepStates['organismePrestationFamiliale'].state != 'unavailable'}">
              href="${createLink(controller:'frontofficeRequest', action : 'edit', params:['id':rqt.id,'currentStep':'organismePrestationFamiliale'])}"
            </g:if>
          >
            
              <g:message code="mar.step.organismePrestationFamiliale.label" /> *
              <span class="help">
                
                  <g:message code="request.step.message.${rqt.stepStates['organismePrestationFamiliale'].state}" />
                
              </span>
            
          </a>
        </li>    
  

  
        <li class="${currentStep == 'situationFamiliale' ? 'current ' : ''}
          
            ${rqt.stepStates['situationFamiliale'].state}
          
          ">
          <span class="number">4</span>
          <a
            <g:if test="${currentStep != 'situationFamiliale' && rqt.stepStates['situationFamiliale'].state != 'unavailable'}">
              href="${createLink(controller:'frontofficeRequest', action : 'edit', params:['id':rqt.id,'currentStep':'situationFamiliale'])}"
            </g:if>
          >
            
              <g:message code="mar.step.situationFamiliale.label" /> *
              <span class="help">
                
                  <g:message code="request.step.message.${rqt.stepStates['situationFamiliale'].state}" />
                
              </span>
            
          </a>
        </li>    
  

  
        <li class="${currentStep == 'situationProfessionnelle' ? 'current ' : ''}
          
            ${rqt.stepStates['situationProfessionnelle'].state}
          
          ">
          <span class="number">5</span>
          <a
            <g:if test="${currentStep != 'situationProfessionnelle' && rqt.stepStates['situationProfessionnelle'].state != 'unavailable'}">
              href="${createLink(controller:'frontofficeRequest', action : 'edit', params:['id':rqt.id,'currentStep':'situationProfessionnelle'])}"
            </g:if>
          >
            
              <g:message code="mar.step.situationProfessionnelle.label" />
              <span class="help">
                
                  <g:message code="request.step.message.${rqt.stepStates['situationProfessionnelle'].state}" />
                
              </span>
            
          </a>
        </li>    
  

  
        <li class="${currentStep == 'autreSituation' ? 'current ' : ''}
          
            ${rqt.stepStates['autreSituation'].state}
          
          ">
          <span class="number">6</span>
          <a
            <g:if test="${currentStep != 'autreSituation' && rqt.stepStates['autreSituation'].state != 'unavailable'}">
              href="${createLink(controller:'frontofficeRequest', action : 'edit', params:['id':rqt.id,'currentStep':'autreSituation'])}"
            </g:if>
          >
            
              <g:message code="mar.step.autreSituation.label" /> *
              <span class="help">
                
                  <g:message code="request.step.message.${rqt.stepStates['autreSituation'].state}" />
                
              </span>
            
          </a>
        </li>    
  

  
        <li class="${currentStep == 'projetDeVie' ? 'current ' : ''}
          
            ${rqt.stepStates['projetDeVie'].state}
          
          ">
          <span class="number">7</span>
          <a
            <g:if test="${currentStep != 'projetDeVie' && rqt.stepStates['projetDeVie'].state != 'unavailable'}">
              href="${createLink(controller:'frontofficeRequest', action : 'edit', params:['id':rqt.id,'currentStep':'projetDeVie'])}"
            </g:if>
          >
            
              <g:message code="mar.step.projetDeVie.label" /> *
              <span class="help">
                
                  <g:message code="request.step.message.${rqt.stepStates['projetDeVie'].state}" />
                
              </span>
            
          </a>
        </li>    
  

  
        <li class="${currentStep == 'demandeParcoursScolaireEtFormation' ? 'current ' : ''}
          
            ${rqt.stepStates['demandeParcoursScolaireEtFormation'].state}
          
          ">
          <span class="number">8</span>
          <a
            <g:if test="${currentStep != 'demandeParcoursScolaireEtFormation' && rqt.stepStates['demandeParcoursScolaireEtFormation'].state != 'unavailable'}">
              href="${createLink(controller:'frontofficeRequest', action : 'edit', params:['id':rqt.id,'currentStep':'demandeParcoursScolaireEtFormation'])}"
            </g:if>
          >
            
              <g:message code="mar.step.demandeParcoursScolaireEtFormation.label" />
              <span class="help">
                
                  <g:message code="request.step.message.${rqt.stepStates['demandeParcoursScolaireEtFormation'].state}" />
                
              </span>
            
          </a>
        </li>    
  

  
        <li class="${currentStep == 'demandeCartes' ? 'current ' : ''}
          
            ${rqt.stepStates['demandeCartes'].state}
          
          ">
          <span class="number">9</span>
          <a
            <g:if test="${currentStep != 'demandeCartes' && rqt.stepStates['demandeCartes'].state != 'unavailable'}">
              href="${createLink(controller:'frontofficeRequest', action : 'edit', params:['id':rqt.id,'currentStep':'demandeCartes'])}"
            </g:if>
          >
            
              <g:message code="mar.step.demandeCartes.label" />
              <span class="help">
                
                  <g:message code="request.step.message.${rqt.stepStates['demandeCartes'].state}" />
                
              </span>
            
          </a>
        </li>    
  

  
        <li class="${currentStep == 'demandePrestationCompensation' ? 'current ' : ''}
          
            ${rqt.stepStates['demandePrestationCompensation'].state}
          
          ">
          <span class="number">10</span>
          <a
            <g:if test="${currentStep != 'demandePrestationCompensation' && rqt.stepStates['demandePrestationCompensation'].state != 'unavailable'}">
              href="${createLink(controller:'frontofficeRequest', action : 'edit', params:['id':rqt.id,'currentStep':'demandePrestationCompensation'])}"
            </g:if>
          >
            
              <g:message code="mar.step.demandePrestationCompensation.label" />
              <span class="help">
                
                  <g:message code="request.step.message.${rqt.stepStates['demandePrestationCompensation'].state}" />
                
              </span>
            
          </a>
        </li>    
  

  
        <li class="${currentStep == 'affilitationAidant' ? 'current ' : ''}
          
            ${rqt.stepStates['affilitationAidant'].state}
          
          ">
          <span class="number">11</span>
          <a
            <g:if test="${currentStep != 'affilitationAidant' && rqt.stepStates['affilitationAidant'].state != 'unavailable'}">
              href="${createLink(controller:'frontofficeRequest', action : 'edit', params:['id':rqt.id,'currentStep':'affilitationAidant'])}"
            </g:if>
          >
            
              <g:message code="mar.step.affilitationAidant.label" />
              <span class="help">
                
                  <g:message code="request.step.message.${rqt.stepStates['affilitationAidant'].state}" />
                
              </span>
            
          </a>
        </li>    
  

  
        <li class="${currentStep == 'demandeAllocationEtComplementRessources' ? 'current ' : ''}
          
            ${rqt.stepStates['demandeAllocationEtComplementRessources'].state}
          
          ">
          <span class="number">12</span>
          <a
            <g:if test="${currentStep != 'demandeAllocationEtComplementRessources' && rqt.stepStates['demandeAllocationEtComplementRessources'].state != 'unavailable'}">
              href="${createLink(controller:'frontofficeRequest', action : 'edit', params:['id':rqt.id,'currentStep':'demandeAllocationEtComplementRessources'])}"
            </g:if>
          >
            
              <g:message code="mar.step.demandeAllocationEtComplementRessources.label" />
              <span class="help">
                
                  <g:message code="request.step.message.${rqt.stepStates['demandeAllocationEtComplementRessources'].state}" />
                
              </span>
            
          </a>
        </li>    
  

  
        <li class="${currentStep == 'demandeProfessionnelle' ? 'current ' : ''}
          
            ${rqt.stepStates['demandeProfessionnelle'].state}
          
          ">
          <span class="number">13</span>
          <a
            <g:if test="${currentStep != 'demandeProfessionnelle' && rqt.stepStates['demandeProfessionnelle'].state != 'unavailable'}">
              href="${createLink(controller:'frontofficeRequest', action : 'edit', params:['id':rqt.id,'currentStep':'demandeProfessionnelle'])}"
            </g:if>
          >
            
              <g:message code="mar.step.demandeProfessionnelle.label" />
              <span class="help">
                
                  <g:message code="request.step.message.${rqt.stepStates['demandeProfessionnelle'].state}" />
                
              </span>
            
          </a>
        </li>    
  

  
        <li class="${currentStep == 'demandeOrientationMedicoSociale' ? 'current ' : ''}
          
            ${rqt.stepStates['demandeOrientationMedicoSociale'].state}
          
          ">
          <span class="number">14</span>
          <a
            <g:if test="${currentStep != 'demandeOrientationMedicoSociale' && rqt.stepStates['demandeOrientationMedicoSociale'].state != 'unavailable'}">
              href="${createLink(controller:'frontofficeRequest', action : 'edit', params:['id':rqt.id,'currentStep':'demandeOrientationMedicoSociale'])}"
            </g:if>
          >
            
              <g:message code="mar.step.demandeOrientationMedicoSociale.label" />
              <span class="help">
                
                  <g:message code="request.step.message.${rqt.stepStates['demandeOrientationMedicoSociale'].state}" />
                
              </span>
            
          </a>
        </li>    
  

  
        <g:if test="${!documentTypes.isEmpty()}">
  
        <li class="${currentStep == 'document' ? 'current ' : ''}
          
            ${rqt.stepStates['document'].state}
          
          ">
          <span class="number">15</span>
          <a
            <g:if test="${currentStep != 'document' && rqt.stepStates['document'].state != 'unavailable'}">
              href="${createLink(controller:'frontofficeRequest', action : 'edit', params:['id':rqt.id,'currentStep':'document'])}"
            </g:if>
          >
            
              <g:message code="request.step.document.label" />
              <span class="help">
                
                  <g:message code="request.step.message.${rqt.stepStates['document'].state}" />
                
              </span>
            
          </a>
        </li>    
  
        </g:if>
  

  
        <li class="${currentStep == 'validation' ? 'current ' : ''}
          
            ${rqt.stepStates['validation'].state}
          
          ">
          <span class="number"></span>
          <a
            <g:if test="${currentStep != 'validation' && rqt.stepStates['validation'].state != 'unavailable'}">
              href="${createLink(controller:'frontofficeRequest', action : 'edit', params:['id':rqt.id,'currentStep':'validation'])}"
            </g:if>
          >
            
              <g:message code="request.step.validation.label" /> *
              <span class="help">
                
                <g:if test="${rqt.stepStates.validation.state == 'unavailable'}">
                  <g:message code="request.step.validation.allRequiredSteps" />
                </g:if>
                <g:else>
                  <g:message code="request.step.message.${rqt.stepStates['validation'].state}" />
                </g:else>
                
              </span>
            
          </a>
        </li>    
  

		 </ul>
	  </div>
  </div>

  </body>
</html>
