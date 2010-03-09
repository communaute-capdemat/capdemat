



<!-- step start -->
<div id="page10">
  <h2><g:message code="property.form" />
    <span><g:message code="myr.step.demandePrestationCompensation.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <dl>
          <dt class="required"><g:message code="myr.property.choixPrestationCompensation.label" /> * : </dt><dd id="choixPrestationCompensation" class="action-editField validate-capdematEnum required-true i18n-myr.property.choixPrestationCompensation javatype-fr.cg95.cvq.business.request.social.MyrChoixPrestationCompensationType" ><g:capdematEnumToField var="${rqt?.choixPrestationCompensation}" i18nKeyPrefix="myr.property.choixPrestationCompensation" /></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required"><g:message code="myr.property.allocationPersonnaliseeAutonomie.label" /> * : </dt><dd id="allocationPersonnaliseeAutonomie" class="action-editField validate-boolean required-true i18n-myr.property.allocationPersonnaliseeAutonomie" ><span class="value-${rqt?.allocationPersonnaliseeAutonomie}"><g:message code="message.${rqt?.allocationPersonnaliseeAutonomie ? 'yes' : 'no'}" /></span></dd>
        </dl>
        
      
    </div>
    <!-- column end -->
    
    <!-- column start -->
    <div class="yui-u">
      
        
        <h3><g:message code="myr.property.besoinsDemandePCH.label" /></h3>
        <dl class="">
          
              <dt class="condition-aideHumaine-trigger"><g:message code="myr.property.aideHumaine.label" />  : </dt><dd id="besoinsDemandePCH.aideHumaine" class="action-editField validate-boolean i18n-myr.property.aideHumaine" ><span class="value-${rqt.besoinsDemandePCH?.aideHumaine}"><g:message code="message.${rqt.besoinsDemandePCH?.aideHumaine ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required condition-aideHumaine-filled"><g:message code="myr.property.precisionAideHumaine.label" /> * : </dt><dd id="besoinsDemandePCH.precisionAideHumaine" class="action-editField validate-string required-true i18n-myr.property.precisionAideHumaine" ><span>${rqt.besoinsDemandePCH?.precisionAideHumaine}</span></dd>
          
              <dt class="condition-aideTechnique-trigger"><g:message code="myr.property.aideTechnique.label" />  : </dt><dd id="besoinsDemandePCH.aideTechnique" class="action-editField validate-boolean i18n-myr.property.aideTechnique" ><span class="value-${rqt.besoinsDemandePCH?.aideTechnique}"><g:message code="message.${rqt.besoinsDemandePCH?.aideTechnique ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required condition-aideTechnique-filled"><g:message code="myr.property.precisionAideTechnique.label" /> * : </dt><dd id="besoinsDemandePCH.precisionAideTechnique" class="action-editField validate-string required-true i18n-myr.property.precisionAideTechnique" ><span>${rqt.besoinsDemandePCH?.precisionAideTechnique}</span></dd>
          
              <dt class="condition-amenagementLogementDemenagement-trigger"><g:message code="myr.property.amenagementLogementDemenagement.label" />  : </dt><dd id="besoinsDemandePCH.amenagementLogementDemenagement" class="action-editField validate-boolean i18n-myr.property.amenagementLogementDemenagement" ><span class="value-${rqt.besoinsDemandePCH?.amenagementLogementDemenagement}"><g:message code="message.${rqt.besoinsDemandePCH?.amenagementLogementDemenagement ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required condition-amenagementLogementDemenagement-filled"><g:message code="myr.property.precisionAmenagementLogementDemenagement.label" /> * : </dt><dd id="besoinsDemandePCH.precisionAmenagementLogementDemenagement" class="action-editField validate-string required-true i18n-myr.property.precisionAmenagementLogementDemenagement" ><span>${rqt.besoinsDemandePCH?.precisionAmenagementLogementDemenagement}</span></dd>
          
              <dt class="condition-amenagementVehicule-trigger"><g:message code="myr.property.amenagementVehicule.label" />  : </dt><dd id="besoinsDemandePCH.amenagementVehicule" class="action-editField validate-boolean i18n-myr.property.amenagementVehicule" ><span class="value-${rqt.besoinsDemandePCH?.amenagementVehicule}"><g:message code="message.${rqt.besoinsDemandePCH?.amenagementVehicule ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required condition-amenagementVehicule-filled"><g:message code="myr.property.precisionAmenagementVehicule.label" /> * : </dt><dd id="besoinsDemandePCH.precisionAmenagementVehicule" class="action-editField validate-string required-true i18n-myr.property.precisionAmenagementVehicule" ><span>${rqt.besoinsDemandePCH?.precisionAmenagementVehicule}</span></dd>
          
              <dt class="condition-chargesSpecifiques-trigger"><g:message code="myr.property.chargesSpecifiques.label" />  : </dt><dd id="besoinsDemandePCH.chargesSpecifiques" class="action-editField validate-boolean i18n-myr.property.chargesSpecifiques" ><span class="value-${rqt.besoinsDemandePCH?.chargesSpecifiques}"><g:message code="message.${rqt.besoinsDemandePCH?.chargesSpecifiques ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required condition-chargesSpecifiques-filled"><g:message code="myr.property.precisionChargesSpecifiques.label" /> * : </dt><dd id="besoinsDemandePCH.precisionChargesSpecifiques" class="action-editField validate-string required-true i18n-myr.property.precisionChargesSpecifiques" ><span>${rqt.besoinsDemandePCH?.precisionChargesSpecifiques}</span></dd>
          
              <dt class="condition-aideAnimaliere-trigger"><g:message code="myr.property.aideAnimaliere.label" />  : </dt><dd id="besoinsDemandePCH.aideAnimaliere" class="action-editField validate-boolean i18n-myr.property.aideAnimaliere" ><span class="value-${rqt.besoinsDemandePCH?.aideAnimaliere}"><g:message code="message.${rqt.besoinsDemandePCH?.aideAnimaliere ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required condition-aideAnimaliere-filled"><g:message code="myr.property.precisionAideAnimaliere.label" /> * : </dt><dd id="besoinsDemandePCH.precisionAideAnimaliere" class="action-editField validate-string required-true i18n-myr.property.precisionAideAnimaliere" ><span>${rqt.besoinsDemandePCH?.precisionAideAnimaliere}</span></dd>
          
        </dl>
        
      
    </div>
    <!-- column end -->
    
  </div>
  <!-- data step  end -->
</div>
<!-- step end -->

