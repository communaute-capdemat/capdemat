



<!-- step start -->
<div id="page5">
  <h2><g:message code="property.form" />
    <span><g:message code="mar.step.autreSituation.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <dl>
          <dt class="required condition-typeLogement-trigger">${message(code:'mar.property.typeLogement.label')} * :</dt><dd id="typeLogement" class="action-editField validate-capdematEnum required-true i18n-mar.property.typeLogement javatype-fr.cg95.cvq.business.request.social.LogementType" ><g:capdematEnumToField var="${rqt?.typeLogement}" i18nKeyPrefix="mar.property.typeLogement" /></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required condition-typeLogement-filled">${message(code:'mar.property.precisionLogementAutre.label')} * :</dt><dd id="precisionLogementAutre" class="action-editField validate-string required-true i18n-mar.property.precisionLogementAutre" ><span>${rqt?.precisionLogementAutre}</span></dd>
        </dl>
        
      
    </div>
    <!-- column end -->
    
    <!-- column start -->
    <div class="yui-u">
      
        
        <dl>
          <dt class="condition-estAutreCas-trigger condition-estUnCas-trigger">${message(code:'mar.property.situationParticuliere.label')} :</dt><dd id="situationParticuliere" class="action-editField validate-capdematEnum i18n-mar.property.situationParticuliere javatype-fr.cg95.cvq.business.request.social.SituationAutreType" ><g:capdematEnumToField var="${rqt?.situationParticuliere}" i18nKeyPrefix="mar.property.situationParticuliere" /></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required condition-estAutreCas-filled">${message(code:'mar.property.precisionAutre.label')} * :</dt><dd id="precisionAutre" class="action-editField validate-string required-true i18n-mar.property.precisionAutre" ><span>${rqt?.precisionAutre}</span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required condition-estUnCas-filled">${message(code:'mar.property.nomEtablissement.label')} * :</dt><dd id="nomEtablissement" class="action-editField validate-string required-true i18n-mar.property.nomEtablissement" ><span>${rqt?.nomEtablissement}</span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required condition-estUnCas-filled">${message(code:'mar.property.domiciliationEtablissement.label')} * :</dt><dd id="domiciliationEtablissement" class="action-editField validate-address required-true i18n-mar.property.domiciliationEtablissement" ><div><p class="additionalDeliveryInformation">${rqt?.domiciliationEtablissement?.additionalDeliveryInformation}</p><p class="additionalGeographicalInformation">${rqt?.domiciliationEtablissement?.additionalGeographicalInformation}</p><span class="streetNumber">${rqt?.domiciliationEtablissement?.streetNumber}</span> <span class="streetName">${rqt?.domiciliationEtablissement?.streetName}</span><g:if test="${!!rqt?.domiciliationEtablissement?.streetMatriculation}"><br /><em><g:message code="address.property.streetMatriculation" /></em><span class="streetMatriculation">${rqt?.domiciliationEtablissement?.streetMatriculation}</span></g:if><g:if test="${!!rqt?.domiciliationEtablissement?.streetRivoliCode}"><br /><em><g:message code="address.property.streetRivoliCode" /></em><span class="streetRivoliCode">${rqt?.domiciliationEtablissement?.streetRivoliCode}</span></g:if><p class="placeNameOrService">${rqt?.domiciliationEtablissement?.placeNameOrService}</p><span class="postalCode">${rqt?.domiciliationEtablissement?.postalCode}</span> <span class="city">${rqt?.domiciliationEtablissement?.city}</span><p class="countryName">${rqt?.domiciliationEtablissement?.countryName}</p><g:if test="${!!rqt?.domiciliationEtablissement?.cityInseeCode}"><em><g:message code="address.property.cityInseeCode" /></em><span class="cityInseeCode">${rqt?.domiciliationEtablissement?.cityInseeCode}</span></g:if></div></dd>
        </dl>
        
      
    </div>
    <!-- column end -->
    
  </div>
  <!-- data step  end -->
</div>
<!-- step end -->

<!-- step start -->
<div id="page6">
  <h2><g:message code="property.form" />
    <span><g:message code="mar.step.projetDeVie.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <dl>
          <dt class="required condition-choixProjetDeVie-trigger">${message(code:'mar.property.choixProjetDeVie.label')} * :</dt><dd id="choixProjetDeVie" class="action-editField validate-capdematEnum required-true i18n-mar.property.choixProjetDeVie javatype-fr.cg95.cvq.business.request.social.ChoixProjetDeVieType" ><g:capdematEnumToField var="${rqt?.choixProjetDeVie}" i18nKeyPrefix="mar.property.choixProjetDeVie" /></dd>
        </dl>
        
      
        
        <dl>
          <dt class="condition-choixProjetDeVie-filled">${message(code:'mar.property.conseilleProjetDeVie.label')} :</dt><dd id="conseilleProjetDeVie" class="action-editField validate-string i18n-mar.property.conseilleProjetDeVie" ><span>${rqt?.conseilleProjetDeVie}</span></dd>
        </dl>
        
      
    </div>
    <!-- column end -->
    
    <!-- column start -->
    <div class="yui-u">
      
        
        <dl>
          <dt class="required condition-choixProjetDeVie-filled">${message(code:'mar.property.expressionProjetDeVie.label')} * :</dt><dd id="expressionProjetDeVie" class="action-editField validate-regex required-true i18n-mar.property.expressionProjetDeVie rows-20 maxLength-5096" regex="^.{0,5096}$"><span>${rqt?.expressionProjetDeVie}</span></dd>
        </dl>
        
      
    </div>
    <!-- column end -->
    
  </div>
  <!-- data step  end -->
</div>
<!-- step end -->

<!-- step start -->
<div id="page7">
  <h2><g:message code="property.form" />
    <span><g:message code="mar.step.demandeParcoursScolaireEtFormation.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.demandeLibreScolaire.label')} * :</dt><dd id="demandeLibreScolaire" class="action-editField validate-regex required-true i18n-mar.property.demandeLibreScolaire rows-5 maxLength-2048" regex="^.{0,2048}$"><span>${rqt?.demandeLibreScolaire}</span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="condition-preferencesEtablissementOuService-trigger">${message(code:'mar.property.preferencesEtablissementOuService.label')} :</dt><dd id="preferencesEtablissementOuService" class="action-editField validate-boolean i18n-mar.property.preferencesEtablissementOuService" ><span class="value-${rqt?.preferencesEtablissementOuService}"><g:message code="message.${rqt?.preferencesEtablissementOuService ? 'yes' : 'no'}" /></span></dd>
        </dl>
        
      
        
        <h3><g:message code="mar.property.precisionPreferencesEtablissementOuService.label" /></h3>
        <dl class="required condition-preferencesEtablissementOuService-filled">
          
              <dt class="required">${message(code:'mar.property.nomPreferenceEtablissementOuService.label')} * :</dt><dd id="precisionPreferencesEtablissementOuService.nomPreferenceEtablissementOuService" class="action-editField validate-string required-true i18n-mar.property.nomPreferenceEtablissementOuService" ><span>${rqt.precisionPreferencesEtablissementOuService?.nomPreferenceEtablissementOuService}</span></dd>
          
              <dt class="required">${message(code:'mar.property.codePostalPreferenceEtablissementOuService.label')} * :</dt><dd id="precisionPreferencesEtablissementOuService.codePostalPreferenceEtablissementOuService" class="action-editField validate-postalCode required-true i18n-mar.property.codePostalPreferenceEtablissementOuService maxLength-5" ><span>${rqt.precisionPreferencesEtablissementOuService?.codePostalPreferenceEtablissementOuService}</span></dd>
          
              <dt class="required">${message(code:'mar.property.communePreferenceEtablissementOuService.label')} * :</dt><dd id="precisionPreferencesEtablissementOuService.communePreferenceEtablissementOuService" class="action-editField validate-city required-true i18n-mar.property.communePreferenceEtablissementOuService maxLength-32" ><span>${rqt.precisionPreferencesEtablissementOuService?.communePreferenceEtablissementOuService}</span></dd>
          
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
<div id="page8">
  <h2><g:message code="property.form" />
    <span><g:message code="mar.step.demandeCartes.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.carteInvalidite.label')} * :</dt><dd id="carteInvalidite" class="action-editField validate-boolean required-true i18n-mar.property.carteInvalidite" ><span class="value-${rqt?.carteInvalidite}"><g:message code="message.${rqt?.carteInvalidite ? 'yes' : 'no'}" /></span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.carteAccompagnement.label')} * :</dt><dd id="carteAccompagnement" class="action-editField validate-boolean required-true i18n-mar.property.carteAccompagnement" ><span class="value-${rqt?.carteAccompagnement}"><g:message code="message.${rqt?.carteAccompagnement ? 'yes' : 'no'}" /></span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.carteStationnement.label')} * :</dt><dd id="carteStationnement" class="action-editField validate-boolean required-true i18n-mar.property.carteStationnement" ><span class="value-${rqt?.carteStationnement}"><g:message code="message.${rqt?.carteStationnement ? 'yes' : 'no'}" /></span></dd>
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
<div id="page9">
  <h2><g:message code="property.form" />
    <span><g:message code="mar.step.demandePrestationCompensation.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.choixPrestationCompensation.label')} * :</dt><dd id="choixPrestationCompensation" class="action-editField validate-capdematEnum required-true i18n-mar.property.choixPrestationCompensation javatype-fr.cg95.cvq.business.request.social.ChoixPrestationCompensationType" ><g:capdematEnumToField var="${rqt?.choixPrestationCompensation}" i18nKeyPrefix="mar.property.choixPrestationCompensation" /></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.allocationPersonnaliseeAutonomie.label')} * :</dt><dd id="allocationPersonnaliseeAutonomie" class="action-editField validate-boolean required-true i18n-mar.property.allocationPersonnaliseeAutonomie" ><span class="value-${rqt?.allocationPersonnaliseeAutonomie}"><g:message code="message.${rqt?.allocationPersonnaliseeAutonomie ? 'yes' : 'no'}" /></span></dd>
        </dl>
        
      
    </div>
    <!-- column end -->
    
    <!-- column start -->
    <div class="yui-u">
      
        
        <h3><g:message code="mar.property.besoinsDemandePCH.label" /></h3>
        <dl class="">
          
              <dt class="condition-aideHumaine-trigger">${message(code:'mar.property.aideHumaine.label')} :</dt><dd id="besoinsDemandePCH.aideHumaine" class="action-editField validate-boolean i18n-mar.property.aideHumaine" ><span class="value-${rqt.besoinsDemandePCH?.aideHumaine}"><g:message code="message.${rqt.besoinsDemandePCH?.aideHumaine ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required condition-aideHumaine-filled">${message(code:'mar.property.precisionAideHumaine.label')} * :</dt><dd id="besoinsDemandePCH.precisionAideHumaine" class="action-editField validate-string required-true i18n-mar.property.precisionAideHumaine" ><span>${rqt.besoinsDemandePCH?.precisionAideHumaine}</span></dd>
          
              <dt class="condition-aideTechnique-trigger">${message(code:'mar.property.aideTechnique.label')} :</dt><dd id="besoinsDemandePCH.aideTechnique" class="action-editField validate-boolean i18n-mar.property.aideTechnique" ><span class="value-${rqt.besoinsDemandePCH?.aideTechnique}"><g:message code="message.${rqt.besoinsDemandePCH?.aideTechnique ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required condition-aideTechnique-filled">${message(code:'mar.property.precisionAideTechnique.label')} * :</dt><dd id="besoinsDemandePCH.precisionAideTechnique" class="action-editField validate-string required-true i18n-mar.property.precisionAideTechnique" ><span>${rqt.besoinsDemandePCH?.precisionAideTechnique}</span></dd>
          
              <dt class="condition-amenagementLogementDemenagement-trigger">${message(code:'mar.property.amenagementLogementDemenagement.label')} :</dt><dd id="besoinsDemandePCH.amenagementLogementDemenagement" class="action-editField validate-boolean i18n-mar.property.amenagementLogementDemenagement" ><span class="value-${rqt.besoinsDemandePCH?.amenagementLogementDemenagement}"><g:message code="message.${rqt.besoinsDemandePCH?.amenagementLogementDemenagement ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required condition-amenagementLogementDemenagement-filled">${message(code:'mar.property.precisionAmenagementLogementDemenagement.label')} * :</dt><dd id="besoinsDemandePCH.precisionAmenagementLogementDemenagement" class="action-editField validate-string required-true i18n-mar.property.precisionAmenagementLogementDemenagement" ><span>${rqt.besoinsDemandePCH?.precisionAmenagementLogementDemenagement}</span></dd>
          
              <dt class="condition-amenagementVehicule-trigger">${message(code:'mar.property.amenagementVehicule.label')} :</dt><dd id="besoinsDemandePCH.amenagementVehicule" class="action-editField validate-boolean i18n-mar.property.amenagementVehicule" ><span class="value-${rqt.besoinsDemandePCH?.amenagementVehicule}"><g:message code="message.${rqt.besoinsDemandePCH?.amenagementVehicule ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required condition-amenagementVehicule-filled">${message(code:'mar.property.precisionAmenagementVehicule.label')} * :</dt><dd id="besoinsDemandePCH.precisionAmenagementVehicule" class="action-editField validate-string required-true i18n-mar.property.precisionAmenagementVehicule" ><span>${rqt.besoinsDemandePCH?.precisionAmenagementVehicule}</span></dd>
          
              <dt class="condition-chargesSpecifiques-trigger">${message(code:'mar.property.chargesSpecifiques.label')} :</dt><dd id="besoinsDemandePCH.chargesSpecifiques" class="action-editField validate-boolean i18n-mar.property.chargesSpecifiques" ><span class="value-${rqt.besoinsDemandePCH?.chargesSpecifiques}"><g:message code="message.${rqt.besoinsDemandePCH?.chargesSpecifiques ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required condition-chargesSpecifiques-filled">${message(code:'mar.property.precisionChargesSpecifiques.label')} * :</dt><dd id="besoinsDemandePCH.precisionChargesSpecifiques" class="action-editField validate-string required-true i18n-mar.property.precisionChargesSpecifiques" ><span>${rqt.besoinsDemandePCH?.precisionChargesSpecifiques}</span></dd>
          
              <dt class="condition-aideAnimaliere-trigger">${message(code:'mar.property.aideAnimaliere.label')} :</dt><dd id="besoinsDemandePCH.aideAnimaliere" class="action-editField validate-boolean i18n-mar.property.aideAnimaliere" ><span class="value-${rqt.besoinsDemandePCH?.aideAnimaliere}"><g:message code="message.${rqt.besoinsDemandePCH?.aideAnimaliere ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required condition-aideAnimaliere-filled">${message(code:'mar.property.precisionAideAnimaliere.label')} * :</dt><dd id="besoinsDemandePCH.precisionAideAnimaliere" class="action-editField validate-string required-true i18n-mar.property.precisionAideAnimaliere" ><span>${rqt.besoinsDemandePCH?.precisionAideAnimaliere}</span></dd>
          
        </dl>
        
      
    </div>
    <!-- column end -->
    
  </div>
  <!-- data step  end -->
</div>
<!-- step end -->

<!-- step start -->
<div id="page10">
  <h2><g:message code="property.form" />
    <span><g:message code="mar.step.affilitationAidant.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.nomAidant.label')} * :</dt><dd id="nomAidant" class="action-editField validate-lastName required-true i18n-mar.property.nomAidant maxLength-38" ><span>${rqt?.nomAidant}</span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.domiciliationAidant.label')} * :</dt><dd id="domiciliationAidant" class="action-editField validate-address required-true i18n-mar.property.domiciliationAidant" ><div><p class="additionalDeliveryInformation">${rqt?.domiciliationAidant?.additionalDeliveryInformation}</p><p class="additionalGeographicalInformation">${rqt?.domiciliationAidant?.additionalGeographicalInformation}</p><span class="streetNumber">${rqt?.domiciliationAidant?.streetNumber}</span> <span class="streetName">${rqt?.domiciliationAidant?.streetName}</span><g:if test="${!!rqt?.domiciliationAidant?.streetMatriculation}"><br /><em><g:message code="address.property.streetMatriculation" /></em><span class="streetMatriculation">${rqt?.domiciliationAidant?.streetMatriculation}</span></g:if><g:if test="${!!rqt?.domiciliationAidant?.streetRivoliCode}"><br /><em><g:message code="address.property.streetRivoliCode" /></em><span class="streetRivoliCode">${rqt?.domiciliationAidant?.streetRivoliCode}</span></g:if><p class="placeNameOrService">${rqt?.domiciliationAidant?.placeNameOrService}</p><span class="postalCode">${rqt?.domiciliationAidant?.postalCode}</span> <span class="city">${rqt?.domiciliationAidant?.city}</span><p class="countryName">${rqt?.domiciliationAidant?.countryName}</p><g:if test="${!!rqt?.domiciliationAidant?.cityInseeCode}"><em><g:message code="address.property.cityInseeCode" /></em><span class="cityInseeCode">${rqt?.domiciliationAidant?.cityInseeCode}</span></g:if></div></dd>
        </dl>
        
      
    </div>
    <!-- column end -->
    
    <!-- column start -->
    <div class="yui-u">
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.dateNaissanceAidant.label')} * :</dt><dd id="dateNaissanceAidant" class="action-editField validate-date required-true i18n-mar.property.dateNaissanceAidant" ><span><g:formatDate formatName="format.date" date="${rqt?.dateNaissanceAidant}"/></span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.lienParenteAidant.label')} * :</dt><dd id="lienParenteAidant" class="action-editField validate-string required-true i18n-mar.property.lienParenteAidant" ><span>${rqt?.lienParenteAidant}</span></dd>
        </dl>
        
      
    </div>
    <!-- column end -->
    
  </div>
  <!-- data step  end -->
</div>
<!-- step end -->

<!-- step start -->
<div id="page11">
  <h2><g:message code="property.form" />
    <span><g:message code="mar.step.demandeAllocationEtComplementRessources.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <h3><g:message code="mar.property.choixTypeDemandeAllocEtCompl.label" /></h3>
        <dl class="required">
          
              <dt class="required">${message(code:'mar.property.aah.label')} * :</dt><dd id="choixTypeDemandeAllocEtCompl.aah" class="action-editField validate-boolean required-true i18n-mar.property.aah" ><span class="value-${rqt.choixTypeDemandeAllocEtCompl?.aah}"><g:message code="message.${rqt.choixTypeDemandeAllocEtCompl?.aah ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required">${message(code:'mar.property.complementRessources.label')} * :</dt><dd id="choixTypeDemandeAllocEtCompl.complementRessources" class="action-editField validate-boolean required-true i18n-mar.property.complementRessources" ><span class="value-${rqt.choixTypeDemandeAllocEtCompl?.complementRessources}"><g:message code="message.${rqt.choixTypeDemandeAllocEtCompl?.complementRessources ? 'yes' : 'no'}" /></span></dd>
          
        </dl>
        
      
    </div>
    <!-- column end -->
    
    <!-- column start -->
    <div class="yui-u">
      
        
        <dl>
          <dt class="condition-precedentsRevenusRecus-trigger">${message(code:'mar.property.precedentsRevenusRecus.label')} :</dt><dd id="precedentsRevenusRecus" class="action-editField validate-capdematEnum i18n-mar.property.precedentsRevenusRecus javatype-fr.cg95.cvq.business.request.social.PrecedentsRevenusRecusType" ><g:capdematEnumToField var="${rqt?.precedentsRevenusRecus}" i18nKeyPrefix="mar.property.precedentsRevenusRecus" /></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required condition-precedentsRevenusRecus-filled">${message(code:'mar.property.dateDebutRevenuRecu.label')} * :</dt><dd id="dateDebutRevenuRecu" class="action-editField validate-date required-true i18n-mar.property.dateDebutRevenuRecu" ><span><g:formatDate formatName="format.date" date="${rqt?.dateDebutRevenuRecu}"/></span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required condition-precedentsRevenusRecus-filled">${message(code:'mar.property.dateFinRevenuRecu.label')} * :</dt><dd id="dateFinRevenuRecu" class="action-editField validate-date required-true i18n-mar.property.dateFinRevenuRecu" ><span><g:formatDate formatName="format.date" date="${rqt?.dateFinRevenuRecu}"/></span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="">${message(code:'mar.property.precisionRevenuRecu.label')} :</dt><dd id="precisionRevenuRecu" class="action-editField validate-string i18n-mar.property.precisionRevenuRecu" ><span>${rqt?.precisionRevenuRecu}</span></dd>
        </dl>
        
      
    </div>
    <!-- column end -->
    
  </div>
  <!-- data step  end -->
</div>
<!-- step end -->

<!-- step start -->
<div id="page12">
  <h2><g:message code="property.form" />
    <span><g:message code="mar.step.demandeProfessionnelle.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.rqth.label')} * :</dt><dd id="rqth" class="action-editField validate-boolean required-true i18n-mar.property.rqth" ><span class="value-${rqt?.rqth}"><g:message code="message.${rqt?.rqth ? 'yes' : 'no'}" /></span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.primeReclassement.label')} * :</dt><dd id="primeReclassement" class="action-editField validate-boolean required-true i18n-mar.property.primeReclassement" ><span class="value-${rqt?.primeReclassement}"><g:message code="message.${rqt?.primeReclassement ? 'yes' : 'no'}" /></span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.autre.label')} * :</dt><dd id="autre" class="action-editField validate-boolean required-true i18n-mar.property.autre" ><span class="value-${rqt?.autre}"><g:message code="message.${rqt?.autre ? 'yes' : 'no'}" /></span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required condition-orientationReclassement-trigger">${message(code:'mar.property.orientationReclassement.label')} * :</dt><dd id="orientationReclassement" class="action-editField validate-boolean required-true i18n-mar.property.orientationReclassement" ><span class="value-${rqt?.orientationReclassement}"><g:message code="message.${rqt?.orientationReclassement ? 'yes' : 'no'}" /></span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required condition-orientationReclassement-filled">${message(code:'mar.property.choixOrientationReclassement.label')} * :</dt><dd id="choixOrientationReclassement" class="action-editField validate-capdematEnum required-true i18n-mar.property.choixOrientationReclassement javatype-fr.cg95.cvq.business.request.social.ChoixOrientationReclassementType" ><g:capdematEnumToField var="${rqt?.choixOrientationReclassement}" i18nKeyPrefix="mar.property.choixOrientationReclassement" /></dd>
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
<div id="page13">
  <h2><g:message code="property.form" />
    <span><g:message code="mar.step.demandeOrientationMedicoSociale.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.situationActuelle.label')} * :</dt><dd id="situationActuelle" class="action-editField validate-capdematEnum required-true i18n-mar.property.situationActuelle javatype-fr.cg95.cvq.business.request.social.SituationActuelleType" ><g:capdematEnumToField var="${rqt?.situationActuelle}" i18nKeyPrefix="mar.property.situationActuelle" /></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.situationActuellePrecision.label')} * :</dt><dd id="situationActuellePrecision" class="action-editField validate-string required-true i18n-mar.property.situationActuellePrecision" ><span>${rqt?.situationActuellePrecision}</span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.orientationSouhaitee.label')} * :</dt><dd id="orientationSouhaitee" class="action-editField validate-capdematEnum required-true i18n-mar.property.orientationSouhaitee javatype-fr.cg95.cvq.business.request.social.OrientationSouhaiteeType" ><g:capdematEnumToField var="${rqt?.orientationSouhaitee}" i18nKeyPrefix="mar.property.orientationSouhaitee" /></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.dateEntreeSouhaitee.label')} * :</dt><dd id="dateEntreeSouhaitee" class="action-editField validate-date required-true i18n-mar.property.dateEntreeSouhaitee" ><span><g:formatDate formatName="format.date" date="${rqt?.dateEntreeSouhaitee}"/></span></dd>
        </dl>
        
      
    </div>
    <!-- column end -->
    
    <!-- column start -->
    <div class="yui-u">
      
        
        <dl>
          <dt class="required condition-preferenceEtablissementOuService-trigger">${message(code:'mar.property.preferenceEtablissementOuService.label')} * :</dt><dd id="preferenceEtablissementOuService" class="action-editField validate-boolean required-true i18n-mar.property.preferenceEtablissementOuService" ><span class="value-${rqt?.preferenceEtablissementOuService}"><g:message code="message.${rqt?.preferenceEtablissementOuService ? 'yes' : 'no'}" /></span></dd>
        </dl>
        
      
        
        <h3><g:message code="mar.property.precisionPreferenceEtablissementOuService.label" /></h3>
        <dl class="required condition-preferenceEtablissementOuService-filled">
          
              <dt class="required">${message(code:'mar.property.nomEtablissementPreference.label')} * :</dt><dd id="precisionPreferenceEtablissementOuService.nomEtablissementPreference" class="action-editField validate-string required-true i18n-mar.property.nomEtablissementPreference" ><span>${rqt.precisionPreferenceEtablissementOuService?.nomEtablissementPreference}</span></dd>
          
              <dt class="required">${message(code:'mar.property.codePostalEtablissementPreference.label')} * :</dt><dd id="precisionPreferenceEtablissementOuService.codePostalEtablissementPreference" class="action-editField validate-postalCode required-true i18n-mar.property.codePostalEtablissementPreference maxLength-5" ><span>${rqt.precisionPreferenceEtablissementOuService?.codePostalEtablissementPreference}</span></dd>
          
              <dt class="required">${message(code:'mar.property.communeEtablissementPreference.label')} * :</dt><dd id="precisionPreferenceEtablissementOuService.communeEtablissementPreference" class="action-editField validate-city required-true i18n-mar.property.communeEtablissementPreference maxLength-32" ><span>${rqt.precisionPreferenceEtablissementOuService?.communeEtablissementPreference}</span></dd>
          
              <dt class="required">${message(code:'mar.property.telephoneEtablissementPreference.label')} * :</dt><dd id="precisionPreferenceEtablissementOuService.telephoneEtablissementPreference" class="action-editField validate-phone required-true i18n-mar.property.telephoneEtablissementPreference maxLength-10" ><span>${rqt.precisionPreferenceEtablissementOuService?.telephoneEtablissementPreference}</span></dd>
          
        </dl>
        
      
    </div>
    <!-- column end -->
    
  </div>
  <!-- data step  end -->
</div>
<!-- step end -->

