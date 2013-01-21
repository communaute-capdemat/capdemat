



<!-- step start -->
<div id="page0">
  <h2><g:message code="property.form" />
    <span><g:message code="myr.step.subject.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <dl>
          <dt class="required"><g:message code="myr.property.subject.label" /> : </dt>
             <dd><span>${rqt?.subjectFirstName} ${rqt?.subjectLastName}</span></dd>
          
        </dl>
        
      
        
        <dl>
          <dt class="">${message(code:'myr.property.faxSujet.label')} :</dt><dd id="faxSujet" class="action-editField validate-phone i18n-myr.property.faxSujet maxLength-10" ><span>${rqt?.faxSujet}</span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'myr.property.nationalite.label')} * :</dt><dd id="nationalite" class="action-editField validate-capdematEnum required-true i18n-myr.property.nationalite javatype-fr.cg95.cvq.business.request.social.MyrNationaliteAvecSuisseType" ><g:capdematEnumToField var="${rqt?.nationalite}" i18nKeyPrefix="myr.property.nationalite" /></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'myr.property.dateNaissanceSujet.label')} * :</dt><dd id="dateNaissanceSujet" class="action-editField validate-date required-true i18n-myr.property.dateNaissanceSujet" ><span><g:formatDate formatName="format.date" date="${rqt?.dateNaissanceSujet}"/></span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="">${message(code:'myr.property.dateArriveeFrance.label')} :</dt><dd id="dateArriveeFrance" class="action-editField validate-date i18n-myr.property.dateArriveeFrance" ><span><g:formatDate formatName="format.date" date="${rqt?.dateArriveeFrance}"/></span></dd>
        </dl>
        
      
        
        <h3><g:message code="myr.property.precedentDossierMdph.label" /></h3>
        <dl class="">
          
              <dt class="">${message(code:'myr.property.numeroMdph.label')} :</dt><dd id="numeroMdph" class="action-editField validate-regex i18n-myr.property.numeroMdph maxLength-13" regex="^.{0,13}$"><span>${rqt.precedentDossierMdph?.numeroMdph}</span></dd>
          
              <dt class="">${message(code:'myr.property.departementMdph.label')} :</dt><dd id="departementMdph" class="action-editField validate-capdematEnum i18n-myr.property.departementMdph javatype-fr.cg95.cvq.business.users.InseeDepartementCodeType" ><g:capdematEnumToField var="${rqt.precedentDossierMdph?.departementMdph}" i18nKeyPrefix="myr.property.departementMdph" /></dd>
          
        </dl>
        
      
        
        <dl>
          <dt class="">${message(code:'myr.property.precisionSiDomicileAupresOrganisme.label')} :</dt><dd id="precisionSiDomicileAupresOrganisme" class="action-editField validate-string i18n-myr.property.precisionSiDomicileAupresOrganisme" ><span>${rqt?.precisionSiDomicileAupresOrganisme}</span></dd>
        </dl>
        
      
    </div>
    <!-- column end -->
    
    <!-- column start -->
    <div class="yui-u">
      
        
        <h3><g:message code="myr.property.lieuNaissanceSujet.label" /></h3>
        <dl class="required">
          
              <dt class="required">${message(code:'myr.property.postalCode.label')} * :</dt><dd id="postalCode" class="action-editField validate-postalCode required-true i18n-myr.property.postalCode maxLength-5" ><span>${rqt.lieuNaissanceSujet?.postalCode}</span></dd>
          
              <dt class="required">${message(code:'myr.property.city.label')} * :</dt><dd id="city" class="action-editField validate-city required-true i18n-myr.property.city maxLength-32" ><span>${rqt.lieuNaissanceSujet?.city}</span></dd>
          
              <dt class="required">${message(code:'myr.property.country.label')} * :</dt><dd id="country" class="action-editField validate-capdematEnum required-true i18n-myr.property.country javatype-fr.cg95.cvq.business.users.CountryType" ><g:capdematEnumToField var="${rqt.lieuNaissanceSujet?.country}" i18nKeyPrefix="myr.property.country" /></dd>
          
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'myr.property.numeroSecuriteSocialeSujet.label')} * :</dt><dd id="numeroSecuriteSocialeSujet" class="action-editField validate-regex required-true i18n-myr.property.numeroSecuriteSocialeSujet maxLength-13" regex="[0-9]{13}"><span>${rqt?.numeroSecuriteSocialeSujet}</span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'myr.property.nomOrganismeSecuriteSociale.label')} * :</dt><dd id="nomOrganismeSecuriteSociale" class="action-editField validate-regex required-true i18n-myr.property.nomOrganismeSecuriteSociale maxLength-50" regex="^.{0,50}$"><span>${rqt?.nomOrganismeSecuriteSociale}</span></dd>
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
    <span><g:message code="myr.step.autoriteParentale.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <h3><g:message code="myr.property.autoriteParentaleMere.label" /></h3>
        <dl class="">
          
              <dt class="">${message(code:'myr.property.nom.label')} :</dt><dd id="nom" class="action-editField validate-lastName i18n-myr.property.nom maxLength-38" ><span>${rqt.autoriteParentaleMere?.nom}</span></dd>
          
              <dt class="">${message(code:'myr.property.prenom.label')} :</dt><dd id="prenom" class="action-editField validate-firstName i18n-myr.property.prenom maxLength-38" ><span>${rqt.autoriteParentaleMere?.prenom}</span></dd>
          
              <dt class="">${message(code:'myr.property.domiciliation.label')} :</dt><dd id="domiciliation" class="action-editField validate-address i18n-myr.property.domiciliation" ><div><p class="additionalDeliveryInformation">${rqt.autoriteParentaleMere?.domiciliation?.additionalDeliveryInformation}</p><p class="additionalGeographicalInformation">${rqt.autoriteParentaleMere?.domiciliation?.additionalGeographicalInformation}</p><span class="streetNumber">${rqt.autoriteParentaleMere?.domiciliation?.streetNumber}</span> <span class="streetName">${rqt.autoriteParentaleMere?.domiciliation?.streetName}</span><g:if test="${!!rqt.autoriteParentaleMere?.domiciliation?.streetMatriculation}"><br /><em><g:message code="address.property.streetMatriculation" /></em><span class="streetMatriculation">${rqt.autoriteParentaleMere?.domiciliation?.streetMatriculation}</span></g:if><g:if test="${!!rqt.autoriteParentaleMere?.domiciliation?.streetRivoliCode}"><br /><em><g:message code="address.property.streetRivoliCode" /></em><span class="streetRivoliCode">${rqt.autoriteParentaleMere?.domiciliation?.streetRivoliCode}</span></g:if><p class="placeNameOrService">${rqt.autoriteParentaleMere?.domiciliation?.placeNameOrService}</p><span class="postalCode">${rqt.autoriteParentaleMere?.domiciliation?.postalCode}</span> <span class="city">${rqt.autoriteParentaleMere?.domiciliation?.city}</span><p class="countryName">${rqt.autoriteParentaleMere?.domiciliation?.countryName}</p><g:if test="${!!rqt.autoriteParentaleMere?.domiciliation?.cityInseeCode}"><em><g:message code="address.property.cityInseeCode" /></em><span class="cityInseeCode">${rqt.autoriteParentaleMere?.domiciliation?.cityInseeCode}</span></g:if></div></dd>
          
              <dt class="">${message(code:'myr.property.telephone.label')} :</dt><dd id="telephone" class="action-editField validate-phone i18n-myr.property.telephone maxLength-10" ><span>${rqt.autoriteParentaleMere?.telephone}</span></dd>
          
              <dt class="">${message(code:'myr.property.fax.label')} :</dt><dd id="fax" class="action-editField validate-phone i18n-myr.property.fax maxLength-10" ><span>${rqt.autoriteParentaleMere?.fax}</span></dd>
          
              <dt class="">${message(code:'myr.property.email.label')} :</dt><dd id="email" class="action-editField validate-email i18n-myr.property.email" ><span>${rqt.autoriteParentaleMere?.email}</span></dd>
          
        </dl>
        
      
        
        <dl>
          <dt class="required condition-deteneurAutoriteParentale-trigger">${message(code:'myr.property.deteneurAutoriteParentale.label')} * :</dt><dd id="deteneurAutoriteParentale" class="action-editField validate-capdematEnum required-true i18n-myr.property.deteneurAutoriteParentale javatype-fr.cg95.cvq.business.request.social.DeteneurAutoriteParentaleType" ><g:capdematEnumToField var="${rqt?.deteneurAutoriteParentale}" i18nKeyPrefix="myr.property.deteneurAutoriteParentale" /></dd>
        </dl>
        
      
        
        <h3><g:message code="myr.property.informationAutreDeteneurAutoriteParentale.label" /></h3>
        <dl class="required condition-deteneurAutoriteParentale-filled">
          
              <dt class="required">${message(code:'myr.property.nom.label')} * :</dt><dd id="nom" class="action-editField validate-lastName required-true i18n-myr.property.nom maxLength-38" ><span>${rqt.informationAutreDeteneurAutoriteParentale?.nom}</span></dd>
          
              <dt class="required">${message(code:'myr.property.domiciliation.label')} * :</dt><dd id="domiciliation" class="action-editField validate-address required-true i18n-myr.property.domiciliation" ><div><p class="additionalDeliveryInformation">${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.additionalDeliveryInformation}</p><p class="additionalGeographicalInformation">${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.additionalGeographicalInformation}</p><span class="streetNumber">${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.streetNumber}</span> <span class="streetName">${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.streetName}</span><g:if test="${!!rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.streetMatriculation}"><br /><em><g:message code="address.property.streetMatriculation" /></em><span class="streetMatriculation">${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.streetMatriculation}</span></g:if><g:if test="${!!rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.streetRivoliCode}"><br /><em><g:message code="address.property.streetRivoliCode" /></em><span class="streetRivoliCode">${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.streetRivoliCode}</span></g:if><p class="placeNameOrService">${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.placeNameOrService}</p><span class="postalCode">${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.postalCode}</span> <span class="city">${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.city}</span><p class="countryName">${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.countryName}</p><g:if test="${!!rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.cityInseeCode}"><em><g:message code="address.property.cityInseeCode" /></em><span class="cityInseeCode">${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.cityInseeCode}</span></g:if></div></dd>
          
              <dt class="required">${message(code:'myr.property.telephone.label')} * :</dt><dd id="telephone" class="action-editField validate-phone required-true i18n-myr.property.telephone maxLength-10" ><span>${rqt.informationAutreDeteneurAutoriteParentale?.telephone}</span></dd>
          
              <dt class="">${message(code:'myr.property.fax.label')} :</dt><dd id="fax" class="action-editField validate-phone i18n-myr.property.fax maxLength-10" ><span>${rqt.informationAutreDeteneurAutoriteParentale?.fax}</span></dd>
          
              <dt class="">${message(code:'myr.property.email.label')} :</dt><dd id="email" class="action-editField validate-email i18n-myr.property.email" ><span>${rqt.informationAutreDeteneurAutoriteParentale?.email}</span></dd>
          
        </dl>
        
      
    </div>
    <!-- column end -->
    
    <!-- column start -->
    <div class="yui-u">
      
        
        <h3><g:message code="myr.property.autoriteParentalePere.label" /></h3>
        <dl class="">
          
              <dt class="">${message(code:'myr.property.nom.label')} :</dt><dd id="nom" class="action-editField validate-lastName i18n-myr.property.nom maxLength-38" ><span>${rqt.autoriteParentalePere?.nom}</span></dd>
          
              <dt class="">${message(code:'myr.property.prenom.label')} :</dt><dd id="prenom" class="action-editField validate-firstName i18n-myr.property.prenom maxLength-38" ><span>${rqt.autoriteParentalePere?.prenom}</span></dd>
          
              <dt class="">${message(code:'myr.property.domiciliation.label')} :</dt><dd id="domiciliation" class="action-editField validate-address i18n-myr.property.domiciliation" ><div><p class="additionalDeliveryInformation">${rqt.autoriteParentalePere?.domiciliation?.additionalDeliveryInformation}</p><p class="additionalGeographicalInformation">${rqt.autoriteParentalePere?.domiciliation?.additionalGeographicalInformation}</p><span class="streetNumber">${rqt.autoriteParentalePere?.domiciliation?.streetNumber}</span> <span class="streetName">${rqt.autoriteParentalePere?.domiciliation?.streetName}</span><g:if test="${!!rqt.autoriteParentalePere?.domiciliation?.streetMatriculation}"><br /><em><g:message code="address.property.streetMatriculation" /></em><span class="streetMatriculation">${rqt.autoriteParentalePere?.domiciliation?.streetMatriculation}</span></g:if><g:if test="${!!rqt.autoriteParentalePere?.domiciliation?.streetRivoliCode}"><br /><em><g:message code="address.property.streetRivoliCode" /></em><span class="streetRivoliCode">${rqt.autoriteParentalePere?.domiciliation?.streetRivoliCode}</span></g:if><p class="placeNameOrService">${rqt.autoriteParentalePere?.domiciliation?.placeNameOrService}</p><span class="postalCode">${rqt.autoriteParentalePere?.domiciliation?.postalCode}</span> <span class="city">${rqt.autoriteParentalePere?.domiciliation?.city}</span><p class="countryName">${rqt.autoriteParentalePere?.domiciliation?.countryName}</p><g:if test="${!!rqt.autoriteParentalePere?.domiciliation?.cityInseeCode}"><em><g:message code="address.property.cityInseeCode" /></em><span class="cityInseeCode">${rqt.autoriteParentalePere?.domiciliation?.cityInseeCode}</span></g:if></div></dd>
          
              <dt class="">${message(code:'myr.property.telephone.label')} :</dt><dd id="telephone" class="action-editField validate-phone i18n-myr.property.telephone maxLength-10" ><span>${rqt.autoriteParentalePere?.telephone}</span></dd>
          
              <dt class="">${message(code:'myr.property.fax.label')} :</dt><dd id="fax" class="action-editField validate-phone i18n-myr.property.fax maxLength-10" ><span>${rqt.autoriteParentalePere?.fax}</span></dd>
          
              <dt class="">${message(code:'myr.property.email.label')} :</dt><dd id="email" class="action-editField validate-email i18n-myr.property.email" ><span>${rqt.autoriteParentalePere?.email}</span></dd>
          
        </dl>
        
      
    </div>
    <!-- column end -->
    
  </div>
  <!-- data step  end -->
</div>
<!-- step end -->

<!-- step start -->
<div id="page2">
  <h2><g:message code="property.form" />
    <span><g:message code="myr.step.organismePrestationFamiliale.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <dl>
          <dt class="required">${message(code:'myr.property.numeroAllocataire.label')} * :</dt><dd id="numeroAllocataire" class="action-editField validate-regex required-true i18n-myr.property.numeroAllocataire" regex="^.{0,50}$"><span>${rqt?.numeroAllocataire}</span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required condition-otherPayingOrganism-trigger">${message(code:'myr.property.organismePayeur.label')} * :</dt><dd id="organismePayeur" class="action-editField validate-capdematEnum required-true i18n-myr.property.organismePayeur javatype-fr.cg95.cvq.business.request.social.MyrOrganismePayeurType" ><g:capdematEnumToField var="${rqt?.organismePayeur}" i18nKeyPrefix="myr.property.organismePayeur" /></dd>
        </dl>
        
      
        
        <dl>
          <dt class="">${message(code:'myr.property.nomOrganismePayeur.label')} :</dt><dd id="nomOrganismePayeur" class="action-editField validate-string i18n-myr.property.nomOrganismePayeur" ><span>${rqt?.nomOrganismePayeur}</span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="condition-otherPayingOrganism-filled">${message(code:'myr.property.domiciliationOrganismePayeur.label')} :</dt><dd id="domiciliationOrganismePayeur" class="action-editField validate-address i18n-myr.property.domiciliationOrganismePayeur" ><div><p class="additionalDeliveryInformation">${rqt?.domiciliationOrganismePayeur?.additionalDeliveryInformation}</p><p class="additionalGeographicalInformation">${rqt?.domiciliationOrganismePayeur?.additionalGeographicalInformation}</p><span class="streetNumber">${rqt?.domiciliationOrganismePayeur?.streetNumber}</span> <span class="streetName">${rqt?.domiciliationOrganismePayeur?.streetName}</span><g:if test="${!!rqt?.domiciliationOrganismePayeur?.streetMatriculation}"><br /><em><g:message code="address.property.streetMatriculation" /></em><span class="streetMatriculation">${rqt?.domiciliationOrganismePayeur?.streetMatriculation}</span></g:if><g:if test="${!!rqt?.domiciliationOrganismePayeur?.streetRivoliCode}"><br /><em><g:message code="address.property.streetRivoliCode" /></em><span class="streetRivoliCode">${rqt?.domiciliationOrganismePayeur?.streetRivoliCode}</span></g:if><p class="placeNameOrService">${rqt?.domiciliationOrganismePayeur?.placeNameOrService}</p><span class="postalCode">${rqt?.domiciliationOrganismePayeur?.postalCode}</span> <span class="city">${rqt?.domiciliationOrganismePayeur?.city}</span><p class="countryName">${rqt?.domiciliationOrganismePayeur?.countryName}</p><g:if test="${!!rqt?.domiciliationOrganismePayeur?.cityInseeCode}"><em><g:message code="address.property.cityInseeCode" /></em><span class="cityInseeCode">${rqt?.domiciliationOrganismePayeur?.cityInseeCode}</span></g:if></div></dd>
        </dl>
        
      
    </div>
    <!-- column end -->
    
    <!-- column start -->
    <div class="yui-u">
      
        
        <dl>
          <dt class="required">${message(code:'myr.property.nomAllocataire.label')} * :</dt><dd id="nomAllocataire" class="action-editField validate-lastName required-true i18n-myr.property.nomAllocataire maxLength-38" ><span>${rqt?.nomAllocataire}</span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'myr.property.prenomAllocataire.label')} * :</dt><dd id="prenomAllocataire" class="action-editField validate-firstName required-true i18n-myr.property.prenomAllocataire maxLength-38" ><span>${rqt?.prenomAllocataire}</span></dd>
        </dl>
        
      
    </div>
    <!-- column end -->
    
  </div>
  <!-- data step  end -->
</div>
<!-- step end -->

<!-- step start -->
<div id="page3">
  <h2><g:message code="property.form" />
    <span><g:message code="myr.step.situationFamiliale.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <dl>
          <dt class="required condition-situationMaritale-trigger">${message(code:'myr.property.situationMaritale.label')} * :</dt><dd id="situationMaritale" class="action-editField validate-capdematEnum required-true i18n-myr.property.situationMaritale javatype-fr.cg95.cvq.business.request.social.MyrSituationFamilialeType" ><g:capdematEnumToField var="${rqt?.situationMaritale}" i18nKeyPrefix="myr.property.situationMaritale" /></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'myr.property.dateSituationFamiliale.label')} * :</dt><dd id="dateSituationFamiliale" class="action-editField validate-date required-true i18n-myr.property.dateSituationFamiliale" ><span><g:formatDate formatName="format.date" date="${rqt?.dateSituationFamiliale}"/></span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'myr.property.nombreEnfantsACharge.label')} * :</dt><dd id="nombreEnfantsACharge" class="action-editField validate-regex required-true i18n-myr.property.nombreEnfantsACharge maxLength-2" regex="[0-9]{1,2}$"><span>${rqt?.nombreEnfantsACharge}</span></dd>
        </dl>
        
      
    </div>
    <!-- column end -->
    
    <!-- column start -->
    <div class="yui-u">
      
        
        <h3><g:message code="myr.property.identiteConjoint.label" /></h3>
        <dl class="required condition-situationMaritale-filled">
          
              <dt class="required">${message(code:'myr.property.nomNaissanceConjoint.label')} * :</dt><dd id="nomNaissanceConjoint" class="action-editField validate-lastName required-true i18n-myr.property.nomNaissanceConjoint maxLength-38" ><span>${rqt.identiteConjoint?.nomNaissanceConjoint}</span></dd>
          
              <dt class="required">${message(code:'myr.property.prenomConjoint.label')} * :</dt><dd id="prenomConjoint" class="action-editField validate-firstName required-true i18n-myr.property.prenomConjoint maxLength-38" ><span>${rqt.identiteConjoint?.prenomConjoint}</span></dd>
          
              <dt class="required">${message(code:'myr.property.dateNaissanceConjoint.label')} * :</dt><dd id="dateNaissanceConjoint" class="action-editField validate-date required-true i18n-myr.property.dateNaissanceConjoint" ><span><g:formatDate formatName="format.date" date="${rqt.identiteConjoint?.dateNaissanceConjoint}"/></span></dd>
          
        </dl>
        
      
    </div>
    <!-- column end -->
    
  </div>
  <!-- data step  end -->
</div>
<!-- step end -->

