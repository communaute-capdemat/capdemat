



<!-- step start -->
<div id="page0">
  <h2><g:message code="property.form" />
    <span><g:message code="mar.step.subject.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <dl>
          <dt class="required"><g:message code="mar.property.subject.label" /> : </dt>
             <dd><span>${rqt?.subjectFirstName} ${rqt?.subjectLastName}</span></dd>
          
        </dl>
        
      
        
        <dl>
          <dt class="">${message(code:'mar.property.faxSujet.label')} :</dt><dd id="faxSujet" class="action-editField validate-phone i18n-mar.property.faxSujet maxLength-10" ><span>${rqt?.faxSujet}</span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.nationalite.label')} * :</dt><dd id="nationalite" class="action-editField validate-capdematEnum required-true i18n-mar.property.nationalite javatype-fr.cg95.cvq.business.request.social.NationaliteAvecSuisseType" ><g:capdematEnumToField var="${rqt?.nationalite}" i18nKeyPrefix="mar.property.nationalite" /></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.dateNaissanceSujet.label')} * :</dt><dd id="dateNaissanceSujet" class="action-editField validate-date required-true i18n-mar.property.dateNaissanceSujet" ><span><g:formatDate formatName="format.date" date="${rqt?.dateNaissanceSujet}"/></span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="">${message(code:'mar.property.dateArriveeFrance.label')} :</dt><dd id="dateArriveeFrance" class="action-editField validate-date i18n-mar.property.dateArriveeFrance" ><span><g:formatDate formatName="format.date" date="${rqt?.dateArriveeFrance}"/></span></dd>
        </dl>
        
      
        
        <h3><g:message code="mar.property.precedentDossierMdph.label" /></h3>
        <dl class="">
          
              <dt class="">${message(code:'mar.property.numeroMdph.label')} :</dt><dd id="precedentDossierMdph.numeroMdph" class="action-editField validate-regex i18n-mar.property.numeroMdph maxLength-13" regex="^.{0,13}$"><span>${rqt.precedentDossierMdph?.numeroMdph}</span></dd>
          
              <dt class="">${message(code:'mar.property.departementMdph.label')} :</dt><dd id="precedentDossierMdph.departementMdph" class="action-editField validate-capdematEnum i18n-mar.property.departementMdph javatype-fr.cg95.cvq.business.users.InseeDepartementCodeType" ><g:capdematEnumToField var="${rqt.precedentDossierMdph?.departementMdph}" i18nKeyPrefix="mar.property.departementMdph" /></dd>
          
        </dl>
        
      
        
        <dl>
          <dt class="">${message(code:'mar.property.precisionSiDomicileAupresOrganisme.label')} :</dt><dd id="precisionSiDomicileAupresOrganisme" class="action-editField validate-string i18n-mar.property.precisionSiDomicileAupresOrganisme" ><span>${rqt?.precisionSiDomicileAupresOrganisme}</span></dd>
        </dl>
        
      
    </div>
    <!-- column end -->
    
    <!-- column start -->
    <div class="yui-u">
      
        
        <h3><g:message code="mar.property.lieuNaissanceSujet.label" /></h3>
        <dl class="required">
          
              <dt class="required">${message(code:'mar.property.postalCode.label')} * :</dt><dd id="lieuNaissanceSujet.postalCode" class="action-editField validate-postalCode required-true i18n-mar.property.postalCode maxLength-5" ><span>${rqt.lieuNaissanceSujet?.postalCode}</span></dd>
          
              <dt class="required">${message(code:'mar.property.city.label')} * :</dt><dd id="lieuNaissanceSujet.city" class="action-editField validate-city required-true i18n-mar.property.city maxLength-32" ><span>${rqt.lieuNaissanceSujet?.city}</span></dd>
          
              <dt class="required">${message(code:'mar.property.country.label')} * :</dt><dd id="lieuNaissanceSujet.country" class="action-editField validate-capdematEnum required-true i18n-mar.property.country javatype-fr.cg95.cvq.business.users.CountryType" ><g:capdematEnumToField var="${rqt.lieuNaissanceSujet?.country}" i18nKeyPrefix="mar.property.country" /></dd>
          
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.numeroSecuriteSocialeSujet.label')} * :</dt><dd id="numeroSecuriteSocialeSujet" class="action-editField validate-regex required-true i18n-mar.property.numeroSecuriteSocialeSujet maxLength-13" regex="[0-9]{13}"><span>${rqt?.numeroSecuriteSocialeSujet}</span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.nomOrganismeSecuriteSociale.label')} * :</dt><dd id="nomOrganismeSecuriteSociale" class="action-editField validate-regex required-true i18n-mar.property.nomOrganismeSecuriteSociale maxLength-50" regex="^.{0,50}$"><span>${rqt?.nomOrganismeSecuriteSociale}</span></dd>
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
    <span><g:message code="mar.step.representantLegal.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <dl>
          <dt class="required condition-representantLegal-trigger">${message(code:'mar.property.representantLegal.label')} * :</dt><dd id="representantLegal" class="action-editField validate-capdematEnum required-true i18n-mar.property.representantLegal javatype-fr.cg95.cvq.business.request.social.RepresentantLegalType" ><g:capdematEnumToField var="${rqt?.representantLegal}" i18nKeyPrefix="mar.property.representantLegal" /></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required condition-representantLegal-filled">${message(code:'mar.property.nomResponsableLegal.label')} * :</dt><dd id="nomResponsableLegal" class="action-editField validate-string required-true i18n-mar.property.nomResponsableLegal" ><span>${rqt?.nomResponsableLegal}</span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required condition-representantLegal-filled">${message(code:'mar.property.adresseResponsableLegal.label')} * :</dt><dd id="adresseResponsableLegal" class="action-editField validate-address required-true i18n-mar.property.adresseResponsableLegal" ><div><p class="additionalDeliveryInformation">${rqt?.adresseResponsableLegal?.additionalDeliveryInformation}</p><p class="additionalGeographicalInformation">${rqt?.adresseResponsableLegal?.additionalGeographicalInformation}</p><span class="streetNumber">${rqt?.adresseResponsableLegal?.streetNumber}</span> <span class="streetName">${rqt?.adresseResponsableLegal?.streetName}</span><g:if test="${!!rqt?.adresseResponsableLegal?.streetMatriculation}"><br /><em><g:message code="address.property.streetMatriculation" /></em><span class="streetMatriculation">${rqt?.adresseResponsableLegal?.streetMatriculation}</span></g:if><g:if test="${!!rqt?.adresseResponsableLegal?.streetRivoliCode}"><br /><em><g:message code="address.property.streetRivoliCode" /></em><span class="streetRivoliCode">${rqt?.adresseResponsableLegal?.streetRivoliCode}</span></g:if><p class="placeNameOrService">${rqt?.adresseResponsableLegal?.placeNameOrService}</p><span class="postalCode">${rqt?.adresseResponsableLegal?.postalCode}</span> <span class="city">${rqt?.adresseResponsableLegal?.city}</span><p class="countryName">${rqt?.adresseResponsableLegal?.countryName}</p><g:if test="${!!rqt?.adresseResponsableLegal?.cityInseeCode}"><em><g:message code="address.property.cityInseeCode" /></em><span class="cityInseeCode">${rqt?.adresseResponsableLegal?.cityInseeCode}</span></g:if></div></dd>
        </dl>
        
      
    </div>
    <!-- column end -->
    
    <!-- column start -->
    <div class="yui-u">
      
        
        <dl>
          <dt class="required condition-representantLegal-filled">${message(code:'mar.property.telResponsableLegal.label')} * :</dt><dd id="telResponsableLegal" class="action-editField validate-phone required-true i18n-mar.property.telResponsableLegal maxLength-10" ><span>${rqt?.telResponsableLegal}</span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="condition-representantLegal-filled">${message(code:'mar.property.faxResponsableLegal.label')} :</dt><dd id="faxResponsableLegal" class="action-editField validate-phone i18n-mar.property.faxResponsableLegal maxLength-10" ><span>${rqt?.faxResponsableLegal}</span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="condition-representantLegal-filled">${message(code:'mar.property.emailResponsableLegal.label')} :</dt><dd id="emailResponsableLegal" class="action-editField validate-email i18n-mar.property.emailResponsableLegal" ><span>${rqt?.emailResponsableLegal}</span></dd>
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
    <span><g:message code="mar.step.organismePrestationFamiliale.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.numeroAllocataire.label')} * :</dt><dd id="numeroAllocataire" class="action-editField validate-string required-true i18n-mar.property.numeroAllocataire" ><span>${rqt?.numeroAllocataire}</span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.organismePayeur.label')} * :</dt><dd id="organismePayeur" class="action-editField validate-capdematEnum required-true i18n-mar.property.organismePayeur javatype-fr.cg95.cvq.business.request.social.OrganismePayeurType" ><g:capdematEnumToField var="${rqt?.organismePayeur}" i18nKeyPrefix="mar.property.organismePayeur" /></dd>
        </dl>
        
      
        
        <dl>
          <dt class="">${message(code:'mar.property.nomOrganismePayeur.label')} :</dt><dd id="nomOrganismePayeur" class="action-editField validate-string i18n-mar.property.nomOrganismePayeur" ><span>${rqt?.nomOrganismePayeur}</span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="">${message(code:'mar.property.domiciliationOrganismePayeur.label')} :</dt><dd id="domiciliationOrganismePayeur" class="action-editField validate-address i18n-mar.property.domiciliationOrganismePayeur" ><div><p class="additionalDeliveryInformation">${rqt?.domiciliationOrganismePayeur?.additionalDeliveryInformation}</p><p class="additionalGeographicalInformation">${rqt?.domiciliationOrganismePayeur?.additionalGeographicalInformation}</p><span class="streetNumber">${rqt?.domiciliationOrganismePayeur?.streetNumber}</span> <span class="streetName">${rqt?.domiciliationOrganismePayeur?.streetName}</span><g:if test="${!!rqt?.domiciliationOrganismePayeur?.streetMatriculation}"><br /><em><g:message code="address.property.streetMatriculation" /></em><span class="streetMatriculation">${rqt?.domiciliationOrganismePayeur?.streetMatriculation}</span></g:if><g:if test="${!!rqt?.domiciliationOrganismePayeur?.streetRivoliCode}"><br /><em><g:message code="address.property.streetRivoliCode" /></em><span class="streetRivoliCode">${rqt?.domiciliationOrganismePayeur?.streetRivoliCode}</span></g:if><p class="placeNameOrService">${rqt?.domiciliationOrganismePayeur?.placeNameOrService}</p><span class="postalCode">${rqt?.domiciliationOrganismePayeur?.postalCode}</span> <span class="city">${rqt?.domiciliationOrganismePayeur?.city}</span><p class="countryName">${rqt?.domiciliationOrganismePayeur?.countryName}</p><g:if test="${!!rqt?.domiciliationOrganismePayeur?.cityInseeCode}"><em><g:message code="address.property.cityInseeCode" /></em><span class="cityInseeCode">${rqt?.domiciliationOrganismePayeur?.cityInseeCode}</span></g:if></div></dd>
        </dl>
        
      
    </div>
    <!-- column end -->
    
    <!-- column start -->
    <div class="yui-u">
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.nomAllocataire.label')} * :</dt><dd id="nomAllocataire" class="action-editField validate-lastName required-true i18n-mar.property.nomAllocataire maxLength-38" ><span>${rqt?.nomAllocataire}</span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.prenomAllocataire.label')} * :</dt><dd id="prenomAllocataire" class="action-editField validate-firstName required-true i18n-mar.property.prenomAllocataire maxLength-38" ><span>${rqt?.prenomAllocataire}</span></dd>
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
    <span><g:message code="mar.step.situationFamiliale.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <dl>
          <dt class="required condition-situationMaritale-trigger">${message(code:'mar.property.situationMaritale.label')} * :</dt><dd id="situationMaritale" class="action-editField validate-capdematEnum required-true i18n-mar.property.situationMaritale javatype-fr.cg95.cvq.business.request.social.SituationFamilialeType" ><g:capdematEnumToField var="${rqt?.situationMaritale}" i18nKeyPrefix="mar.property.situationMaritale" /></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.dateSituationFamiliale.label')} * :</dt><dd id="dateSituationFamiliale" class="action-editField validate-date required-true i18n-mar.property.dateSituationFamiliale" ><span><g:formatDate formatName="format.date" date="${rqt?.dateSituationFamiliale}"/></span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'mar.property.nombreEnfantsACharge.label')} * :</dt><dd id="nombreEnfantsACharge" class="action-editField validate-regex required-true i18n-mar.property.nombreEnfantsACharge maxLength-2" regex="[0-9]{1,2}$"><span>${rqt?.nombreEnfantsACharge}</span></dd>
        </dl>
        
      
    </div>
    <!-- column end -->
    
    <!-- column start -->
    <div class="yui-u">
      
        
        <h3><g:message code="mar.property.identiteConjoint.label" /></h3>
        <dl class="required condition-situationMaritale-filled">
          
              <dt class="required">${message(code:'mar.property.nomNaissanceConjoint.label')} * :</dt><dd id="identiteConjoint.nomNaissanceConjoint" class="action-editField validate-lastName required-true i18n-mar.property.nomNaissanceConjoint maxLength-38" ><span>${rqt.identiteConjoint?.nomNaissanceConjoint}</span></dd>
          
              <dt class="required">${message(code:'mar.property.prenomConjoint.label')} * :</dt><dd id="identiteConjoint.prenomConjoint" class="action-editField validate-firstName required-true i18n-mar.property.prenomConjoint maxLength-38" ><span>${rqt.identiteConjoint?.prenomConjoint}</span></dd>
          
              <dt class="required">${message(code:'mar.property.dateNaissanceConjoint.label')} * :</dt><dd id="identiteConjoint.dateNaissanceConjoint" class="action-editField validate-date required-true i18n-mar.property.dateNaissanceConjoint" ><span><g:formatDate formatName="format.date" date="${rqt.identiteConjoint?.dateNaissanceConjoint}"/></span></dd>
          
        </dl>
        
      
    </div>
    <!-- column end -->
    
  </div>
  <!-- data step  end -->
</div>
<!-- step end -->

<!-- step start -->
<div id="page4">
  <h2><g:message code="property.form" />
    <span><g:message code="mar.step.situationProfessionnelle.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <dl>
          <dt class="required condition-estSalarieVous-trigger condition-estStagiaireVous-trigger condition-estNonSalarieVous-trigger condition-estDemandeurEmploiVous-trigger condition-estRetraiteVous-trigger condition-estBeneficiairePensionVous-trigger condition-estAutreVous-trigger">${message(code:'mar.property.situationProfessionnelleVous.label')} * :</dt><dd id="situationProfessionnelleVous" class="action-editField validate-capdematEnum required-true i18n-mar.property.situationProfessionnelleVous javatype-fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType" ><g:capdematEnumToField var="${rqt?.situationProfessionnelleVous}" i18nKeyPrefix="mar.property.situationProfessionnelleVous" /></dd>
        </dl>
        
      
        
        <h3><g:message code="mar.property.situationProfessionnelleVousSalarie.label" /></h3>
        <dl class="required condition-estSalarieVous-filled">
          
              <dt class="required">${message(code:'mar.property.salarieDepuisLe.label')} * :</dt><dd id="situationProfessionnelleVousSalarie.salarieDepuisLe" class="action-editField validate-date required-true i18n-mar.property.salarieDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousSalarie?.salarieDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'mar.property.typeContrat.label')} * :</dt><dd id="situationProfessionnelleVousSalarie.typeContrat" class="action-editField validate-string required-true i18n-mar.property.typeContrat" ><span>${rqt.situationProfessionnelleVousSalarie?.typeContrat}</span></dd>
          
              <dt class="required">${message(code:'mar.property.salarieDateDebutContrat.label')} * :</dt><dd id="situationProfessionnelleVousSalarie.salarieDateDebutContrat" class="action-editField validate-date required-true i18n-mar.property.salarieDateDebutContrat" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousSalarie?.salarieDateDebutContrat}"/></span></dd>
          
              <dt class="">${message(code:'mar.property.salarieDateFinContrat.label')} :</dt><dd id="situationProfessionnelleVousSalarie.salarieDateFinContrat" class="action-editField validate-date i18n-mar.property.salarieDateFinContrat" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousSalarie?.salarieDateFinContrat}"/></span></dd>
          
              <dt class="">${message(code:'mar.property.esatDepuisLe.label')} :</dt><dd id="situationProfessionnelleVousSalarie.esatDepuisLe" class="action-editField validate-date i18n-mar.property.esatDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousSalarie?.esatDepuisLe}"/></span></dd>
          
        </dl>
        
      
        
        <h3><g:message code="mar.property.situationProfessionnelleVousStagiaire.label" /></h3>
        <dl class="required condition-estStagiaireVous-filled">
          
              <dt class="required">${message(code:'mar.property.stagiaireDepuisLe.label')} * :</dt><dd id="situationProfessionnelleVousStagiaire.stagiaireDepuisLe" class="action-editField validate-date required-true i18n-mar.property.stagiaireDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousStagiaire?.stagiaireDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'mar.property.stageRenumeration.label')} * :</dt><dd id="situationProfessionnelleVousStagiaire.stageRenumeration" class="action-editField validate-boolean required-true i18n-mar.property.stageRenumeration" ><span class="value-${rqt.situationProfessionnelleVousStagiaire?.stageRenumeration}"><g:message code="message.${rqt.situationProfessionnelleVousStagiaire?.stageRenumeration ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required">${message(code:'mar.property.nomEmployeurStage.label')} * :</dt><dd id="situationProfessionnelleVousStagiaire.nomEmployeurStage" class="action-editField validate-lastName required-true i18n-mar.property.nomEmployeurStage maxLength-38" ><span>${rqt.situationProfessionnelleVousStagiaire?.nomEmployeurStage}</span></dd>
          
              <dt class="required">${message(code:'mar.property.adresseEmployeurStage.label')} * :</dt><dd id="situationProfessionnelleVousStagiaire.adresseEmployeurStage" class="action-editField validate-address required-true i18n-mar.property.adresseEmployeurStage" ><div><p class="additionalDeliveryInformation">${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.additionalDeliveryInformation}</p><p class="additionalGeographicalInformation">${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.additionalGeographicalInformation}</p><span class="streetNumber">${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.streetNumber}</span> <span class="streetName">${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.streetName}</span><g:if test="${!!rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.streetMatriculation}"><br /><em><g:message code="address.property.streetMatriculation" /></em><span class="streetMatriculation">${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.streetMatriculation}</span></g:if><g:if test="${!!rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.streetRivoliCode}"><br /><em><g:message code="address.property.streetRivoliCode" /></em><span class="streetRivoliCode">${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.streetRivoliCode}</span></g:if><p class="placeNameOrService">${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.placeNameOrService}</p><span class="postalCode">${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.postalCode}</span> <span class="city">${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.city}</span><p class="countryName">${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.countryName}</p><g:if test="${!!rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.cityInseeCode}"><em><g:message code="address.property.cityInseeCode" /></em><span class="cityInseeCode">${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.cityInseeCode}</span></g:if></div></dd>
          
              <dt class="required">${message(code:'mar.property.telephoneEmployeurStage.label')} * :</dt><dd id="situationProfessionnelleVousStagiaire.telephoneEmployeurStage" class="action-editField validate-phone required-true i18n-mar.property.telephoneEmployeurStage maxLength-10" ><span>${rqt.situationProfessionnelleVousStagiaire?.telephoneEmployeurStage}</span></dd>
          
        </dl>
        
      
        
        <h3><g:message code="mar.property.situationProfessionnelleVousNonSalarie.label" /></h3>
        <dl class="required condition-estNonSalarieVous-filled">
          
              <dt class="required">${message(code:'mar.property.nonSalarieDepuisLe.label')} * :</dt><dd id="situationProfessionnelleVousNonSalarie.nonSalarieDepuisLe" class="action-editField validate-date required-true i18n-mar.property.nonSalarieDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousNonSalarie?.nonSalarieDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'mar.property.regimeCotisations.label')} * :</dt><dd id="situationProfessionnelleVousNonSalarie.regimeCotisations" class="action-editField validate-string required-true i18n-mar.property.regimeCotisations" ><span>${rqt.situationProfessionnelleVousNonSalarie?.regimeCotisations}</span></dd>
          
        </dl>
        
      
        
        <h3><g:message code="mar.property.situationProfessionnelleVousDemandeurEmploi.label" /></h3>
        <dl class="required condition-estDemandeurEmploiVous-filled">
          
              <dt class="required">${message(code:'mar.property.demandeurEmploiDepuisLe.label')} * :</dt><dd id="situationProfessionnelleVousDemandeurEmploi.demandeurEmploiDepuisLe" class="action-editField validate-date required-true i18n-mar.property.demandeurEmploiDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousDemandeurEmploi?.demandeurEmploiDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'mar.property.indemnisationDepuisLe.label')} * :</dt><dd id="situationProfessionnelleVousDemandeurEmploi.indemnisationDepuisLe" class="action-editField validate-date required-true i18n-mar.property.indemnisationDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousDemandeurEmploi?.indemnisationDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'mar.property.allocationSolidariteSpecifique.label')} * :</dt><dd id="situationProfessionnelleVousDemandeurEmploi.allocationSolidariteSpecifique" class="action-editField validate-boolean required-true i18n-mar.property.allocationSolidariteSpecifique" ><span class="value-${rqt.situationProfessionnelleVousDemandeurEmploi?.allocationSolidariteSpecifique}"><g:message code="message.${rqt.situationProfessionnelleVousDemandeurEmploi?.allocationSolidariteSpecifique ? 'yes' : 'no'}" /></span></dd>
          
        </dl>
        
      
        
        <h3><g:message code="mar.property.situationProfessionnelleVousRetraite.label" /></h3>
        <dl class="required condition-estRetraiteVous-filled">
          
              <dt class="required">${message(code:'mar.property.retraiteDepuisLe.label')} * :</dt><dd id="situationProfessionnelleVousRetraite.retraiteDepuisLe" class="action-editField validate-date required-true i18n-mar.property.retraiteDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousRetraite?.retraiteDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'mar.property.supplementairePersonneAgee.label')} * :</dt><dd id="situationProfessionnelleVousRetraite.supplementairePersonneAgee" class="action-editField validate-boolean required-true i18n-mar.property.supplementairePersonneAgee" ><span class="value-${rqt.situationProfessionnelleVousRetraite?.supplementairePersonneAgee}"><g:message code="message.${rqt.situationProfessionnelleVousRetraite?.supplementairePersonneAgee ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required">${message(code:'mar.property.pensionRetraite.label')} * :</dt><dd id="situationProfessionnelleVousRetraite.pensionRetraite" class="action-editField validate-boolean required-true i18n-mar.property.pensionRetraite" ><span class="value-${rqt.situationProfessionnelleVousRetraite?.pensionRetraite}"><g:message code="message.${rqt.situationProfessionnelleVousRetraite?.pensionRetraite ? 'yes' : 'no'}" /></span></dd>
          
        </dl>
        
      
        
        <h3><g:message code="mar.property.situationProfessionnelleVousBeneficiairePension.label" /></h3>
        <dl class="required condition-estBeneficiairePensionVous-filled">
          
              <dt class="required">${message(code:'mar.property.beneficiairePensionDepuisLe.label')} * :</dt><dd id="situationProfessionnelleVousBeneficiairePension.beneficiairePensionDepuisLe" class="action-editField validate-date required-true i18n-mar.property.beneficiairePensionDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousBeneficiairePension?.beneficiairePensionDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'mar.property.categoriePensionInvalidite.label')} * :</dt><dd id="situationProfessionnelleVousBeneficiairePension.categoriePensionInvalidite" class="action-editField validate-capdematEnum required-true i18n-mar.property.categoriePensionInvalidite javatype-fr.cg95.cvq.business.request.social.CategoriePensionInvaliditeType" ><g:capdematEnumToField var="${rqt.situationProfessionnelleVousBeneficiairePension?.categoriePensionInvalidite}" i18nKeyPrefix="mar.property.categoriePensionInvalidite" /></dd>
          
              <dt class="required">${message(code:'mar.property.renteAccidentTravail.label')} * :</dt><dd id="situationProfessionnelleVousBeneficiairePension.renteAccidentTravail" class="action-editField validate-boolean required-true i18n-mar.property.renteAccidentTravail" ><span class="value-${rqt.situationProfessionnelleVousBeneficiairePension?.renteAccidentTravail}"><g:message code="message.${rqt.situationProfessionnelleVousBeneficiairePension?.renteAccidentTravail ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required">${message(code:'mar.property.allocationSupplementaireInvalidite.label')} * :</dt><dd id="situationProfessionnelleVousBeneficiairePension.allocationSupplementaireInvalidite" class="action-editField validate-boolean required-true i18n-mar.property.allocationSupplementaireInvalidite" ><span class="value-${rqt.situationProfessionnelleVousBeneficiairePension?.allocationSupplementaireInvalidite}"><g:message code="message.${rqt.situationProfessionnelleVousBeneficiairePension?.allocationSupplementaireInvalidite ? 'yes' : 'no'}" /></span></dd>
          
        </dl>
        
      
        
        <h3><g:message code="mar.property.situationProfessionnelleVousAutre.label" /></h3>
        <dl class="required condition-estAutreVous-filled">
          
              <dt class="required">${message(code:'mar.property.autreDepuisLe.label')} * :</dt><dd id="situationProfessionnelleVousAutre.autreDepuisLe" class="action-editField validate-date required-true i18n-mar.property.autreDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousAutre?.autreDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'mar.property.precisionAutreSituationProfessionnelle.label')} * :</dt><dd id="situationProfessionnelleVousAutre.precisionAutreSituationProfessionnelle" class="action-editField validate-string required-true i18n-mar.property.precisionAutreSituationProfessionnelle" ><span>${rqt.situationProfessionnelleVousAutre?.precisionAutreSituationProfessionnelle}</span></dd>
          
        </dl>
        
      
    </div>
    <!-- column end -->
    
    <!-- column start -->
    <div class="yui-u">
      
        
        <dl>
          <dt class="condition-estSalarieConjoint-trigger condition-estStagiaireConjoint-trigger condition-estNonSalarieConjoint-trigger condition-estDemandeurEmploiConjoint-trigger condition-estRetraiteConjoint-trigger condition-estBeneficiairePensionConjoint-trigger condition-estAutreConjoint-trigger">${message(code:'mar.property.situationProfessionnelleConjoint.label')} :</dt><dd id="situationProfessionnelleConjoint" class="action-editField validate-capdematEnum i18n-mar.property.situationProfessionnelleConjoint javatype-fr.cg95.cvq.business.request.social.ChoixSituationProfessionnelleType" ><g:capdematEnumToField var="${rqt?.situationProfessionnelleConjoint}" i18nKeyPrefix="mar.property.situationProfessionnelleConjoint" /></dd>
        </dl>
        
      
        
        <h3><g:message code="mar.property.situationProfessionnelleConjointSalarie.label" /></h3>
        <dl class="required condition-estSalarieConjoint-filled">
          
              <dt class="required">${message(code:'mar.property.salarieDepuisLe.label')} * :</dt><dd id="situationProfessionnelleConjointSalarie.salarieDepuisLe" class="action-editField validate-date required-true i18n-mar.property.salarieDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointSalarie?.salarieDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'mar.property.typeContrat.label')} * :</dt><dd id="situationProfessionnelleConjointSalarie.typeContrat" class="action-editField validate-string required-true i18n-mar.property.typeContrat" ><span>${rqt.situationProfessionnelleConjointSalarie?.typeContrat}</span></dd>
          
              <dt class="required">${message(code:'mar.property.salarieDateDebutContrat.label')} * :</dt><dd id="situationProfessionnelleConjointSalarie.salarieDateDebutContrat" class="action-editField validate-date required-true i18n-mar.property.salarieDateDebutContrat" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointSalarie?.salarieDateDebutContrat}"/></span></dd>
          
              <dt class="">${message(code:'mar.property.salarieDateFinContrat.label')} :</dt><dd id="situationProfessionnelleConjointSalarie.salarieDateFinContrat" class="action-editField validate-date i18n-mar.property.salarieDateFinContrat" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointSalarie?.salarieDateFinContrat}"/></span></dd>
          
              <dt class="">${message(code:'mar.property.esatDepuisLe.label')} :</dt><dd id="situationProfessionnelleConjointSalarie.esatDepuisLe" class="action-editField validate-date i18n-mar.property.esatDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointSalarie?.esatDepuisLe}"/></span></dd>
          
        </dl>
        
      
        
        <h3><g:message code="mar.property.situationProfessionnelleConjointStagiaire.label" /></h3>
        <dl class="required condition-estStagiaireConjoint-filled">
          
              <dt class="required">${message(code:'mar.property.stagiaireDepuisLe.label')} * :</dt><dd id="situationProfessionnelleConjointStagiaire.stagiaireDepuisLe" class="action-editField validate-date required-true i18n-mar.property.stagiaireDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointStagiaire?.stagiaireDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'mar.property.stageRenumeration.label')} * :</dt><dd id="situationProfessionnelleConjointStagiaire.stageRenumeration" class="action-editField validate-boolean required-true i18n-mar.property.stageRenumeration" ><span class="value-${rqt.situationProfessionnelleConjointStagiaire?.stageRenumeration}"><g:message code="message.${rqt.situationProfessionnelleConjointStagiaire?.stageRenumeration ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required">${message(code:'mar.property.nomEmployeurStage.label')} * :</dt><dd id="situationProfessionnelleConjointStagiaire.nomEmployeurStage" class="action-editField validate-lastName required-true i18n-mar.property.nomEmployeurStage maxLength-38" ><span>${rqt.situationProfessionnelleConjointStagiaire?.nomEmployeurStage}</span></dd>
          
              <dt class="required">${message(code:'mar.property.adresseEmployeurStage.label')} * :</dt><dd id="situationProfessionnelleConjointStagiaire.adresseEmployeurStage" class="action-editField validate-address required-true i18n-mar.property.adresseEmployeurStage" ><div><p class="additionalDeliveryInformation">${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.additionalDeliveryInformation}</p><p class="additionalGeographicalInformation">${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.additionalGeographicalInformation}</p><span class="streetNumber">${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.streetNumber}</span> <span class="streetName">${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.streetName}</span><g:if test="${!!rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.streetMatriculation}"><br /><em><g:message code="address.property.streetMatriculation" /></em><span class="streetMatriculation">${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.streetMatriculation}</span></g:if><g:if test="${!!rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.streetRivoliCode}"><br /><em><g:message code="address.property.streetRivoliCode" /></em><span class="streetRivoliCode">${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.streetRivoliCode}</span></g:if><p class="placeNameOrService">${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.placeNameOrService}</p><span class="postalCode">${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.postalCode}</span> <span class="city">${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.city}</span><p class="countryName">${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.countryName}</p><g:if test="${!!rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.cityInseeCode}"><em><g:message code="address.property.cityInseeCode" /></em><span class="cityInseeCode">${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.cityInseeCode}</span></g:if></div></dd>
          
              <dt class="required">${message(code:'mar.property.telephoneEmployeurStage.label')} * :</dt><dd id="situationProfessionnelleConjointStagiaire.telephoneEmployeurStage" class="action-editField validate-phone required-true i18n-mar.property.telephoneEmployeurStage maxLength-10" ><span>${rqt.situationProfessionnelleConjointStagiaire?.telephoneEmployeurStage}</span></dd>
          
        </dl>
        
      
        
        <h3><g:message code="mar.property.situationProfessionnelleConjointNonSalarie.label" /></h3>
        <dl class="required condition-estNonSalarieConjoint-filled">
          
              <dt class="required">${message(code:'mar.property.nonSalarieDepuisLe.label')} * :</dt><dd id="situationProfessionnelleConjointNonSalarie.nonSalarieDepuisLe" class="action-editField validate-date required-true i18n-mar.property.nonSalarieDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointNonSalarie?.nonSalarieDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'mar.property.regimeCotisations.label')} * :</dt><dd id="situationProfessionnelleConjointNonSalarie.regimeCotisations" class="action-editField validate-string required-true i18n-mar.property.regimeCotisations" ><span>${rqt.situationProfessionnelleConjointNonSalarie?.regimeCotisations}</span></dd>
          
        </dl>
        
      
        
        <h3><g:message code="mar.property.situationProfessionnelleConjointDemandeurEmploi.label" /></h3>
        <dl class="required condition-estDemandeurEmploiConjoint-filled">
          
              <dt class="required">${message(code:'mar.property.demandeurEmploiDepuisLe.label')} * :</dt><dd id="situationProfessionnelleConjointDemandeurEmploi.demandeurEmploiDepuisLe" class="action-editField validate-date required-true i18n-mar.property.demandeurEmploiDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointDemandeurEmploi?.demandeurEmploiDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'mar.property.indemnisationDepuisLe.label')} * :</dt><dd id="situationProfessionnelleConjointDemandeurEmploi.indemnisationDepuisLe" class="action-editField validate-date required-true i18n-mar.property.indemnisationDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointDemandeurEmploi?.indemnisationDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'mar.property.allocationSolidariteSpecifique.label')} * :</dt><dd id="situationProfessionnelleConjointDemandeurEmploi.allocationSolidariteSpecifique" class="action-editField validate-boolean required-true i18n-mar.property.allocationSolidariteSpecifique" ><span class="value-${rqt.situationProfessionnelleConjointDemandeurEmploi?.allocationSolidariteSpecifique}"><g:message code="message.${rqt.situationProfessionnelleConjointDemandeurEmploi?.allocationSolidariteSpecifique ? 'yes' : 'no'}" /></span></dd>
          
        </dl>
        
      
        
        <h3><g:message code="mar.property.situationProfessionnelleConjointRetraite.label" /></h3>
        <dl class="required condition-estRetraiteConjoint-filled">
          
              <dt class="required">${message(code:'mar.property.retraiteDepuisLe.label')} * :</dt><dd id="situationProfessionnelleConjointRetraite.retraiteDepuisLe" class="action-editField validate-date required-true i18n-mar.property.retraiteDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointRetraite?.retraiteDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'mar.property.supplementairePersonneAgee.label')} * :</dt><dd id="situationProfessionnelleConjointRetraite.supplementairePersonneAgee" class="action-editField validate-boolean required-true i18n-mar.property.supplementairePersonneAgee" ><span class="value-${rqt.situationProfessionnelleConjointRetraite?.supplementairePersonneAgee}"><g:message code="message.${rqt.situationProfessionnelleConjointRetraite?.supplementairePersonneAgee ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required">${message(code:'mar.property.pensionRetraite.label')} * :</dt><dd id="situationProfessionnelleConjointRetraite.pensionRetraite" class="action-editField validate-boolean required-true i18n-mar.property.pensionRetraite" ><span class="value-${rqt.situationProfessionnelleConjointRetraite?.pensionRetraite}"><g:message code="message.${rqt.situationProfessionnelleConjointRetraite?.pensionRetraite ? 'yes' : 'no'}" /></span></dd>
          
        </dl>
        
      
        
        <h3><g:message code="mar.property.situationProfessionnelleConjointBeneficiairePension.label" /></h3>
        <dl class="required condition-estBeneficiairePensionConjoint-filled">
          
              <dt class="required">${message(code:'mar.property.beneficiairePensionDepuisLe.label')} * :</dt><dd id="situationProfessionnelleConjointBeneficiairePension.beneficiairePensionDepuisLe" class="action-editField validate-date required-true i18n-mar.property.beneficiairePensionDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointBeneficiairePension?.beneficiairePensionDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'mar.property.categoriePensionInvalidite.label')} * :</dt><dd id="situationProfessionnelleConjointBeneficiairePension.categoriePensionInvalidite" class="action-editField validate-capdematEnum required-true i18n-mar.property.categoriePensionInvalidite javatype-fr.cg95.cvq.business.request.social.CategoriePensionInvaliditeType" ><g:capdematEnumToField var="${rqt.situationProfessionnelleConjointBeneficiairePension?.categoriePensionInvalidite}" i18nKeyPrefix="mar.property.categoriePensionInvalidite" /></dd>
          
              <dt class="required">${message(code:'mar.property.renteAccidentTravail.label')} * :</dt><dd id="situationProfessionnelleConjointBeneficiairePension.renteAccidentTravail" class="action-editField validate-boolean required-true i18n-mar.property.renteAccidentTravail" ><span class="value-${rqt.situationProfessionnelleConjointBeneficiairePension?.renteAccidentTravail}"><g:message code="message.${rqt.situationProfessionnelleConjointBeneficiairePension?.renteAccidentTravail ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required">${message(code:'mar.property.allocationSupplementaireInvalidite.label')} * :</dt><dd id="situationProfessionnelleConjointBeneficiairePension.allocationSupplementaireInvalidite" class="action-editField validate-boolean required-true i18n-mar.property.allocationSupplementaireInvalidite" ><span class="value-${rqt.situationProfessionnelleConjointBeneficiairePension?.allocationSupplementaireInvalidite}"><g:message code="message.${rqt.situationProfessionnelleConjointBeneficiairePension?.allocationSupplementaireInvalidite ? 'yes' : 'no'}" /></span></dd>
          
        </dl>
        
      
        
        <h3><g:message code="mar.property.situationProfessionnelleConjointAutre.label" /></h3>
        <dl class="required condition-estAutreConjoint-filled">
          
              <dt class="required">${message(code:'mar.property.autreDepuisLe.label')} * :</dt><dd id="situationProfessionnelleConjointAutre.autreDepuisLe" class="action-editField validate-date required-true i18n-mar.property.autreDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointAutre?.autreDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'mar.property.precisionAutreSituationProfessionnelle.label')} * :</dt><dd id="situationProfessionnelleConjointAutre.precisionAutreSituationProfessionnelle" class="action-editField validate-string required-true i18n-mar.property.precisionAutreSituationProfessionnelle" ><span>${rqt.situationProfessionnelleConjointAutre?.precisionAutreSituationProfessionnelle}</span></dd>
          
        </dl>
        
      
    </div>
    <!-- column end -->
    
  </div>
  <!-- data step  end -->
</div>
<!-- step end -->

