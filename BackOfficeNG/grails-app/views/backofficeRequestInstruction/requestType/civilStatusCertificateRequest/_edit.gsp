


<div id="requestData" class="yellow-yui-tabview">
  <ul class="yui-nav">
  
    <li class="selected ">
      <a href="#page0"><em><g:message code="cscr.step.acte.label" /></em></a>
    </li>
  
    <li class="">
      <a href="#page1"><em><g:message code="cscr.step.informations.label" /></em></a>
    </li>
  
  </ul>
   
  <div class="yui-content">
    
      
      <!-- step start -->
      <div id="page0">
        <h2><g:message code="property.form" />
          <span><g:message code="cscr.step.acte.label" /></span>
        </h2>
        <div class="yui-g">
          
          
          <!-- column start -->
          <div class="yui-u first">
            
              
              <dl>
                <dt class="">${message(code:'cscr.property.typeActe.label')} :</dt><dd id="typeActe" class="action-editField validate-capdematEnum i18n-cscr.property.typeActe javatype-fr.cg95.cvq.business.request.civil.CscTypeActeType" ><g:capdematEnumToField var="${rqt?.typeActe}" i18nKeyPrefix="cscr.property.typeActe" /></dd>
              </dl>
              
            
              
              <dl>
                <dt class="required condition-estExtraitSansFiliation-trigger">${message(code:'cscr.property.formatActe.label')} * :</dt><dd id="formatActe" class="action-editField validate-capdematEnum required-true i18n-cscr.property.formatActe javatype-fr.cg95.cvq.business.request.civil.CscFormatActeType" ><g:capdematEnumToField var="${rqt?.formatActe}" i18nKeyPrefix="cscr.property.formatActe" /></dd>
              </dl>
              
            
              
              <dl>
                <dt class="required">${message(code:'cscr.property.nombreActes.label')} * :</dt><dd id="nombreActes" class="action-editField validate-positiveInteger required-true i18n-cscr.property.nombreActes" ><span>${rqt?.nombreActes}</span></dd>
              </dl>
              
            
              
              <dl>
                <dt class="required">${message(code:'cscr.property.dateEvenement.label')} * :</dt><dd id="dateEvenement" class="action-editField validate-date required-true i18n-cscr.property.dateEvenement" ><span><g:formatDate formatName="format.date" date="${rqt?.dateEvenement}"/></span></dd>
              </dl>
              
            
              
              <h3><g:message code="cscr.property.complementTypeActe.label" /></h3>
              <dl class="condition-estExtraitSansFiliation-unfilled">
                
                  <dt class="required">${message(code:'cscr.property.pereNom.label')} * :</dt><dd id="pereNom" class="action-editField validate-lastName required-true i18n-cscr.property.pereNom maxLength-38" ><span>${rqt.complementTypeActe?.pereNom}</span></dd>
                
                  <dt class="required">${message(code:'cscr.property.perePrenoms.label')} * :</dt><dd id="perePrenoms" class="action-editField validate-string required-true i18n-cscr.property.perePrenoms" ><span>${rqt.complementTypeActe?.perePrenoms}</span></dd>
                
                  <dt class="required">${message(code:'cscr.property.mereNom.label')} * :</dt><dd id="mereNom" class="action-editField validate-lastName required-true i18n-cscr.property.mereNom maxLength-38" ><span>${rqt.complementTypeActe?.mereNom}</span></dd>
                
                  <dt class="required">${message(code:'cscr.property.merePrenoms.label')} * :</dt><dd id="merePrenoms" class="action-editField validate-string required-true i18n-cscr.property.merePrenoms" ><span>${rqt.complementTypeActe?.merePrenoms}</span></dd>
                
              </dl>
              
            
          </div>
          <!-- column end -->
          
          <!-- column start -->
          <div class="yui-u">
            
              
              <dl>
                <dt class="required">${message(code:'cscr.property.nomTitulaireActe.label')} * :</dt><dd id="nomTitulaireActe" class="action-editField validate-lastName required-true i18n-cscr.property.nomTitulaireActe maxLength-38" ><span>${rqt?.nomTitulaireActe}</span></dd>
              </dl>
              
            
              
              <dl>
                <dt class="required">${message(code:'cscr.property.prenomsTitulaireActe.label')} * :</dt><dd id="prenomsTitulaireActe" class="action-editField validate-string required-true i18n-cscr.property.prenomsTitulaireActe" ><span>${rqt?.prenomsTitulaireActe}</span></dd>
              </dl>
              
            
              
              <dl>
                <dt class="required condition-estAutreMotif-trigger">${message(code:'cscr.property.motif.label')} * :</dt><dd id="motif" class="action-editField validate-capdematEnum required-true i18n-cscr.property.motif javatype-fr.cg95.cvq.business.request.civil.CscMotifType" ><g:capdematEnumToField var="${rqt?.motif}" i18nKeyPrefix="cscr.property.motif" /></dd>
              </dl>
              
            
              
              <dl>
                <dt class="required condition-estAutreMotif-filled">${message(code:'cscr.property.precisionAutreMotif.label')} * :</dt><dd id="precisionAutreMotif" class="action-editField validate-string required-true i18n-cscr.property.precisionAutreMotif" ><span>${rqt?.precisionAutreMotif}</span></dd>
              </dl>
              
            
          </div>
          <!-- column end -->
          
        </div>
        <!-- data step  end -->
      </div>
      <!-- step end -->
      
      <!-- step start -->
      <div id="page1">
        <h2><g:message code="property.form" />
          <span><g:message code="cscr.step.informations.label" /></span>
        </h2>
        <div class="yui-g">
          
          
          <!-- column start -->
          <div class="yui-u first">
            
              
              <dl>
                <dt class="required condition-estParticulier-trigger condition-estAdministration-trigger condition-estJuridique-trigger">${message(code:'cscr.property.typeDemandeur.label')} * :</dt><dd id="typeDemandeur" class="action-editField validate-capdematEnum required-true i18n-cscr.property.typeDemandeur javatype-fr.cg95.cvq.business.request.civil.CscTypeDemandeurType" ><g:capdematEnumToField var="${rqt?.typeDemandeur}" i18nKeyPrefix="cscr.property.typeDemandeur" /></dd>
              </dl>
              
            
              
              <h3><g:message code="cscr.property.informationsParticulier.label" /></h3>
              <dl class="condition-estParticulier-filled">
                
                  <dt class="condition-estAutreQualiteDemandeurParticulier-trigger">${message(code:'cscr.property.qualiteDemandeurParticulier.label')} :</dt><dd id="qualiteDemandeurParticulier" class="action-editField validate-capdematEnum i18n-cscr.property.qualiteDemandeurParticulier javatype-fr.cg95.cvq.business.request.civil.CscQualiteDemandeurType" ><g:capdematEnumToField var="${rqt.informationsParticulier?.qualiteDemandeurParticulier}" i18nKeyPrefix="cscr.property.qualiteDemandeurParticulier" /></dd>
                
                  <dt class="condition-estAutreQualiteDemandeurParticulier-filled">${message(code:'cscr.property.precisionAutreQualiteDemandeurParticulier.label')} :</dt><dd id="precisionAutreQualiteDemandeurParticulier" class="action-editField validate-string i18n-cscr.property.precisionAutreQualiteDemandeurParticulier" ><span>${rqt.informationsParticulier?.precisionAutreQualiteDemandeurParticulier}</span></dd>
                
              </dl>
              
            
              
              <h3><g:message code="cscr.property.informationsAdministration.label" /></h3>
              <dl class="condition-estAdministration-filled">
                
                  <dt class="">${message(code:'cscr.property.nomAdministration.label')} :</dt><dd id="nomAdministration" class="action-editField validate-string i18n-cscr.property.nomAdministration" ><span>${rqt.informationsAdministration?.nomAdministration}</span></dd>
                
                  <dt class="">${message(code:'cscr.property.nomMandataireAdministration.label')} :</dt><dd id="nomMandataireAdministration" class="action-editField validate-string i18n-cscr.property.nomMandataireAdministration" ><span>${rqt.informationsAdministration?.nomMandataireAdministration}</span></dd>
                
                  <dt class="condition-estAutreQualiteMandataireAdministration-trigger">${message(code:'cscr.property.qualiteMandataireAdministration.label')} :</dt><dd id="qualiteMandataireAdministration" class="action-editField validate-capdematEnum i18n-cscr.property.qualiteMandataireAdministration javatype-fr.cg95.cvq.business.request.civil.CscQualiteDemandeurType" ><g:capdematEnumToField var="${rqt.informationsAdministration?.qualiteMandataireAdministration}" i18nKeyPrefix="cscr.property.qualiteMandataireAdministration" /></dd>
                
                  <dt class="condition-estAutreQualiteMandataireAdministration-filled">${message(code:'cscr.property.precisionAutreQualiteMandataireAdministration.label')} :</dt><dd id="precisionAutreQualiteMandataireAdministration" class="action-editField validate-string i18n-cscr.property.precisionAutreQualiteMandataireAdministration" ><span>${rqt.informationsAdministration?.precisionAutreQualiteMandataireAdministration}</span></dd>
                
              </dl>
              
            
              
              <h3><g:message code="cscr.property.informationsJuridique.label" /></h3>
              <dl class="condition-estJuridique-filled">
                
                  <dt class="">${message(code:'cscr.property.nomMandataireJuridique.label')} :</dt><dd id="nomMandataireJuridique" class="action-editField validate-string i18n-cscr.property.nomMandataireJuridique" ><span>${rqt.informationsJuridique?.nomMandataireJuridique}</span></dd>
                
                  <dt class="condition-estAutreQualiteMandataireJuridique-trigger">${message(code:'cscr.property.qualiteMandataireJuridique.label')} :</dt><dd id="qualiteMandataireJuridique" class="action-editField validate-capdematEnum i18n-cscr.property.qualiteMandataireJuridique javatype-fr.cg95.cvq.business.request.civil.CscQualiteDemandeurType" ><g:capdematEnumToField var="${rqt.informationsJuridique?.qualiteMandataireJuridique}" i18nKeyPrefix="cscr.property.qualiteMandataireJuridique" /></dd>
                
                  <dt class="condition-estAutreQualiteMandataireJuridique-filled">${message(code:'cscr.property.precisionAutreQualiteMandataireJuridique.label')} :</dt><dd id="precisionAutreQualiteMandataireJuridique" class="action-editField validate-string i18n-cscr.property.precisionAutreQualiteMandataireJuridique" ><span>${rqt.informationsJuridique?.precisionAutreQualiteMandataireJuridique}</span></dd>
                
              </dl>
              
            
          </div>
          <!-- column end -->
          
          <!-- column start -->
          <div class="yui-u">
            
              
              <dl>
                <dt class="">${message(code:'cscr.property.commentaire.label')} :</dt><dd id="commentaire" class="action-editField validate-regex i18n-cscr.property.commentaire rows-3 maxLength-2048" regex="^[\w\W]{0,1024}$"><span>${rqt?.commentaire}</span></dd>
              </dl>
              
            
          </div>
          <!-- column end -->
          
        </div>
        <!-- data step  end -->
      </div>
      <!-- step end -->
      
    
    
  </div>
  
</div>
