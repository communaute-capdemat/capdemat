


<div id="requestData" class="yellow-yui-tabview">
  <ul class="yui-nav">
  
    <li class="selected ">
      <a href="#page0"><em><g:message code="taror.step.general.label" /></em></a>
    </li>
  
    <li class="">
      <a href="#page1"><em><g:message code="taror.step.technique.label" /></em></a>
    </li>
  
    <li class="">
      <a href="#page2"><em><g:message code="taror.step.reglement.label" /></em></a>
    </li>
  
    <li class="administration ">
      <a href="#page5"><em><g:message code="request.step.administration.label" /></em></a>
    </li>
  
  </ul>
   
  <div class="yui-content">
    
      
      <!-- step start -->
      <div id="page0">
        <h2><g:message code="property.form" />
          <span><g:message code="taror.step.general.label" /></span>
        </h2>
        <div class="yui-g">
          
          
          <!-- column start -->
          <div class="yui-u first">
            
              
              <h3><g:message code="taror.property.lieuConcerne.label" /></h3>
              <dl class="required">
                
                  <dt class="required"><g:message code="taror.property.adresseLieuConcerne.label" /> * : </dt><dd id="adresseLieuConcerne" class="action-editField validate-address required-true i18n-taror.property.adresseLieuConcerne" ><div><p class="additionalDeliveryInformation">${rqt?.adresseLieuConcerne?.additionalDeliveryInformation}</p><p class="additionalGeographicalInformation">${rqt?.adresseLieuConcerne?.additionalGeographicalInformation}</p><span class="streetNumber">${rqt?.adresseLieuConcerne?.streetNumber}</span> <span class="streetName">${rqt?.adresseLieuConcerne?.streetName}</span><g:if test="${!!rqt?.adresseLieuConcerne?.streetMatriculation}"><br /><em><g:message code="address.property.streetMatriculation" /></em><span class="streetMatriculation">${rqt?.adresseLieuConcerne?.streetMatriculation}</span></g:if><g:if test="${!!rqt?.adresseLieuConcerne?.streetRivoliCode}"><br /><em><g:message code="address.property.streetRivoliCode" /></em><span class="streetRivoliCode">${rqt?.adresseLieuConcerne?.streetRivoliCode}</span></g:if><p class="placeNameOrService">${rqt?.adresseLieuConcerne?.placeNameOrService}</p><span class="postalCode">${rqt?.adresseLieuConcerne?.postalCode}</span> <span class="city">${rqt?.adresseLieuConcerne?.city}</span><p class="countryName">${rqt?.adresseLieuConcerne?.countryName}</p><g:if test="${!!rqt?.adresseLieuConcerne?.cityInseeCode}"><em><g:message code="address.property.cityInseeCode" /></em><span class="cityInseeCode">${rqt?.adresseLieuConcerne?.cityInseeCode}</span></g:if></div></dd>
                
                  <dt class="required"><g:message code="taror.property.proprietaireLieuConcerne.label" /> * : </dt><dd id="proprietaireLieuConcerne" class="action-editField validate-string required-true i18n-taror.property.proprietaireLieuConcerne" ><span>${rqt?.proprietaireLieuConcerne}</span></dd>
                
                  <dt class=""><g:message code="taror.property.descriptifLieuConcerne.label" />  : </dt><dd id="descriptifLieuConcerne" class="action-editField validate-textarea i18n-taror.property.descriptifLieuConcerne rows-3" ><span>${rqt?.descriptifLieuConcerne}</span></dd>
                
              </dl>
              
            
              
              <h3><g:message code="taror.property.periode.label" /></h3>
              <dl class="required">
                
                  <dt class="required"><g:message code="taror.property.debutPeriode.label" /> * : </dt><dd id="debutPeriode" class="action-editField validate-date required-true i18n-taror.property.debutPeriode" ><span><g:formatDate formatName="format.date" date="${rqt?.debutPeriode}"/></span></dd>
                
                  <dt class="required"><g:message code="taror.property.finPeriode.label" /> * : </dt><dd id="finPeriode" class="action-editField validate-date required-true i18n-taror.property.finPeriode" ><span><g:formatDate formatName="format.date" date="${rqt?.finPeriode}"/></span></dd>
                
              </dl>
              
            
          </div>
          <!-- column end -->
          
          <!-- column start -->
          <div class="yui-u">
            
              
              <h3><g:message code="taror.property.entrepriseChargeeTravaux.label" /></h3>
              <dl class="required">
                
                  <dt class="required"><g:message code="taror.property.nomEntreprise.label" /> * : </dt><dd id="nomEntreprise" class="action-editField validate-string required-true i18n-taror.property.nomEntreprise" ><span>${rqt?.nomEntreprise}</span></dd>
                
                  <dt class="required"><g:message code="taror.property.adresseEntreprise.label" /> * : </dt><dd id="adresseEntreprise" class="action-editField validate-address required-true i18n-taror.property.adresseEntreprise" ><div><p class="additionalDeliveryInformation">${rqt?.adresseEntreprise?.additionalDeliveryInformation}</p><p class="additionalGeographicalInformation">${rqt?.adresseEntreprise?.additionalGeographicalInformation}</p><span class="streetNumber">${rqt?.adresseEntreprise?.streetNumber}</span> <span class="streetName">${rqt?.adresseEntreprise?.streetName}</span><g:if test="${!!rqt?.adresseEntreprise?.streetMatriculation}"><br /><em><g:message code="address.property.streetMatriculation" /></em><span class="streetMatriculation">${rqt?.adresseEntreprise?.streetMatriculation}</span></g:if><g:if test="${!!rqt?.adresseEntreprise?.streetRivoliCode}"><br /><em><g:message code="address.property.streetRivoliCode" /></em><span class="streetRivoliCode">${rqt?.adresseEntreprise?.streetRivoliCode}</span></g:if><p class="placeNameOrService">${rqt?.adresseEntreprise?.placeNameOrService}</p><span class="postalCode">${rqt?.adresseEntreprise?.postalCode}</span> <span class="city">${rqt?.adresseEntreprise?.city}</span><p class="countryName">${rqt?.adresseEntreprise?.countryName}</p><g:if test="${!!rqt?.adresseEntreprise?.cityInseeCode}"><em><g:message code="address.property.cityInseeCode" /></em><span class="cityInseeCode">${rqt?.adresseEntreprise?.cityInseeCode}</span></g:if></div></dd>
                
                  <dt class="required"><g:message code="taror.property.telephoneEntreprise.label" /> * : </dt><dd id="telephoneEntreprise" class="action-editField validate-phone required-true i18n-taror.property.telephoneEntreprise maxLength-10" ><span>${rqt?.telephoneEntreprise}</span></dd>
                
                  <dt class=""><g:message code="taror.property.telecopieEntreprise.label" />  : </dt><dd id="telecopieEntreprise" class="action-editField validate-phone i18n-taror.property.telecopieEntreprise maxLength-10" ><span>${rqt?.telecopieEntreprise}</span></dd>
                
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
          <span><g:message code="taror.step.technique.label" /></span>
        </h2>
        <div class="yui-g">
          
          
          <!-- column start -->
          <div class="yui-u first">
            
              
              <h3><g:message code="taror.property.objetDemande.label" /></h3>
              <dl class="required">
                
                  <dt class="required"><g:message code="taror.property.choixObjetDemande.label" /> * : </dt><dd id="choixObjetDemande" class="action-editField validate-localReferentialData required-true i18n-taror.property.choixObjetDemande data-localReferentialData" >
           <g:render template="/backofficeRequestInstruction/widget/localReferentialDataStatic" 
                     model="['javaName':'choixObjetDemande', 'lrEntries': lrTypes.choixObjetDemande?.entries, 
                             'rqt':rqt, 'isMultiple':lrTypes.choixObjetDemande?.isMultiple(), 'depth':0]" />
 
          </dd>
                
                  <dt class=""><g:message code="taror.property.precisionsObjetDemande.label" />  : </dt><dd id="precisionsObjetDemande" class="action-editField validate-textarea i18n-taror.property.precisionsObjetDemande rows-3" ><span>${rqt?.precisionsObjetDemande}</span></dd>
                
              </dl>
              
            
              
              <h3><g:message code="taror.property.typeTravaux.label" /></h3>
              <dl class="required">
                
                  <dt class="required"><g:message code="taror.property.choixTypeTravaux.label" /> * : </dt><dd id="choixTypeTravaux" class="action-editField validate-localReferentialData required-true i18n-taror.property.choixTypeTravaux data-localReferentialData" >
           <g:render template="/backofficeRequestInstruction/widget/localReferentialDataStatic" 
                     model="['javaName':'choixTypeTravaux', 'lrEntries': lrTypes.choixTypeTravaux?.entries, 
                             'rqt':rqt, 'isMultiple':lrTypes.choixTypeTravaux?.isMultiple(), 'depth':0]" />
 
          </dd>
                
                  <dt class=""><g:message code="taror.property.precisionsTypeTravaux.label" />  : </dt><dd id="precisionsTypeTravaux" class="action-editField validate-textarea i18n-taror.property.precisionsTypeTravaux rows-3" ><span>${rqt?.precisionsTypeTravaux}</span></dd>
                
              </dl>
              
            
              
              <h3><g:message code="taror.property.zonesConcernees.label" /></h3>
              <dl class="required">
                
                  <dt class="required"><g:message code="taror.property.choixZonesConcernees.label" /> * : </dt><dd id="choixZonesConcernees" class="action-editField validate-localReferentialData required-true i18n-taror.property.choixZonesConcernees data-localReferentialData" >
           <g:render template="/backofficeRequestInstruction/widget/localReferentialDataStatic" 
                     model="['javaName':'choixZonesConcernees', 'lrEntries': lrTypes.choixZonesConcernees?.entries, 
                             'rqt':rqt, 'isMultiple':lrTypes.choixZonesConcernees?.isMultiple(), 'depth':0]" />
 
          </dd>
                
                  <dt class=""><g:message code="taror.property.precisionsZonesConcernees.label" />  : </dt><dd id="precisionsZonesConcernees" class="action-editField validate-textarea i18n-taror.property.precisionsZonesConcernees rows-3" ><span>${rqt?.precisionsZonesConcernees}</span></dd>
                
              </dl>
              
            
              
              <h3><g:message code="taror.property.surfaceOccupee.label" /></h3>
              <dl class="required">
                
                  <dt class="required"><g:message code="taror.property.longueurSurfaceOccupee.label" /> * : </dt><dd id="longueurSurfaceOccupee" class="action-editField validate-string required-true i18n-taror.property.longueurSurfaceOccupee" ><span>${rqt?.longueurSurfaceOccupee}</span></dd>
                
                  <dt class="required"><g:message code="taror.property.largeurSurfaceOccupee.label" /> * : </dt><dd id="largeurSurfaceOccupee" class="action-editField validate-string required-true i18n-taror.property.largeurSurfaceOccupee" ><span>${rqt?.largeurSurfaceOccupee}</span></dd>
                
                  <dt class="required"><g:message code="taror.property.hauteurSurfaceOccupee.label" /> * : </dt><dd id="hauteurSurfaceOccupee" class="action-editField validate-string required-true i18n-taror.property.hauteurSurfaceOccupee" ><span>${rqt?.hauteurSurfaceOccupee}</span></dd>
                
                  <dt class="required"><g:message code="taror.property.surfaceTotale.label" /> * : </dt><dd id="surfaceTotale" class="action-editField validate-string required-true i18n-taror.property.surfaceTotale" ><span>${rqt?.surfaceTotale}</span></dd>
                
              </dl>
              
            
              
              <h3><g:message code="taror.property.mesuresDemandees.label" /></h3>
              <dl class="required">
                
                  <dt class="required"><g:message code="taror.property.choixMesuresDemandees.label" /> * : </dt><dd id="choixMesuresDemandees" class="action-editField validate-localReferentialData required-true i18n-taror.property.choixMesuresDemandees data-localReferentialData" >
           <g:render template="/backofficeRequestInstruction/widget/localReferentialDataStatic" 
                     model="['javaName':'choixMesuresDemandees', 'lrEntries': lrTypes.choixMesuresDemandees?.entries, 
                             'rqt':rqt, 'isMultiple':lrTypes.choixMesuresDemandees?.isMultiple(), 'depth':0]" />
 
          </dd>
                
                  <dt class=""><g:message code="taror.property.precisionsMesuresDemandees.label" />  : </dt><dd id="precisionsMesuresDemandees" class="action-editField validate-textarea i18n-taror.property.precisionsMesuresDemandees rows-3" ><span>${rqt?.precisionsMesuresDemandees}</span></dd>
                
              </dl>
              
            
          </div>
          <!-- column end -->
          
          <!-- column start -->
          <div class="yui-u">
            
          </div>
          <!-- column end -->
          
        </div>
        <!-- data step  end -->
      </div>
      <!-- step end -->
      
      <!-- step start -->
      <div id="page2">
        <h2><g:message code="property.form" />
          <span><g:message code="taror.step.reglement.label" /></span>
        </h2>
        <div class="yui-g">
          
          
          <!-- column start -->
          <div class="yui-u first">
            
              
              <dl>
                <dt class="required"><g:message code="taror.property.reglement.label" /> * : </dt><dd id="reglement" class="action-editField validate-acceptance required-true i18n-taror.property.reglement" ><span class="value-${rqt?.reglement}"><g:message code="message.${rqt?.reglement ? 'yes' : 'no'}" /></span></dd>
              </dl>
              
            
          </div>
          <!-- column end -->
          
          <!-- column start -->
          <div class="yui-u">
            
          </div>
          <!-- column end -->
          
        </div>
        <!-- data step  end -->
      </div>
      <!-- step end -->
      
      <!-- step start -->
      <div id="page5">
        <h2><g:message code="property.form" />
          <span><g:message code="request.step.administration.label" /></span>
        </h2>
        <div class="yui-g">
          
            <div class="administration information-message">
              <g:message code="request.step.administration.desc" />
            </div>
          
          
          <!-- column start -->
          <div class="yui-u first">
            
              
              <dl>
                <dt class=""><g:message code="taror.property.avisServiceTechnique.label" />  : </dt><dd id="avisServiceTechnique" class="action-editField validate-textarea i18n-taror.property.avisServiceTechnique rows-5" ><span>${rqt?.avisServiceTechnique}</span></dd>
              </dl>
              
            
              
              <dl>
                <dt class=""><g:message code="taror.property.droitsVoirie.label" />  : </dt><dd id="droitsVoirie" class="action-editField validate-string i18n-taror.property.droitsVoirie" ><span>${rqt?.droitsVoirie}</span></dd>
              </dl>
              
            
          </div>
          <!-- column end -->
          
          <!-- column start -->
          <div class="yui-u">
            
          </div>
          <!-- column end -->
          
        </div>
        <!-- data step  end -->
      </div>
      <!-- step end -->
      
    
    
  </div>
  
</div>
