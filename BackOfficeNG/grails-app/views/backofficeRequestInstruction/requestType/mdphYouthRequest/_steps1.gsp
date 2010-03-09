



<!-- step start -->
<div id="page4">
  <h2><g:message code="property.form" />
    <span><g:message code="myr.step.situationProfessionnelle.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <dl>
          <dt class="required condition-estSalarieVous-trigger condition-estStagiaireVous-trigger condition-estNonSalarieVous-trigger condition-estDemandeurEmploiVous-trigger condition-estRetraiteVous-trigger condition-estBeneficiairePensionVous-trigger condition-estAutreVous-trigger">${message(code:'myr.property.situationProfessionnelleVous.label')} * :</dt><dd id="situationProfessionnelleVous" class="action-editField validate-capdematEnum required-true i18n-myr.property.situationProfessionnelleVous javatype-fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType" ><g:capdematEnumToField var="${rqt?.situationProfessionnelleVous}" i18nKeyPrefix="myr.property.situationProfessionnelleVous" /></dd>
        </dl>
        
      
        
        <h3><g:message code="myr.property.situationProfessionnelleVousSalarie.label" /></h3>
        <dl class="required condition-estSalarieVous-filled">
          
              <dt class="required">${message(code:'myr.property.salarieDepuisLe.label')} * :</dt><dd id="salarieDepuisLe" class="action-editField validate-date required-true i18n-myr.property.salarieDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousSalarie?.salarieDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'myr.property.typeContrat.label')} * :</dt><dd id="typeContrat" class="action-editField validate-string required-true i18n-myr.property.typeContrat" ><span>${rqt.situationProfessionnelleVousSalarie?.typeContrat}</span></dd>
          
              <dt class="required">${message(code:'myr.property.salarieDateDebutContrat.label')} * :</dt><dd id="salarieDateDebutContrat" class="action-editField validate-date required-true i18n-myr.property.salarieDateDebutContrat" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousSalarie?.salarieDateDebutContrat}"/></span></dd>
          
              <dt class="">${message(code:'myr.property.salarieDateFinContrat.label')} :</dt><dd id="salarieDateFinContrat" class="action-editField validate-date i18n-myr.property.salarieDateFinContrat" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousSalarie?.salarieDateFinContrat}"/></span></dd>
          
              <dt class="">${message(code:'myr.property.esatDepuisLe.label')} :</dt><dd id="esatDepuisLe" class="action-editField validate-date i18n-myr.property.esatDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousSalarie?.esatDepuisLe}"/></span></dd>
          
        </dl>
        
      
        
        <h3><g:message code="myr.property.situationProfessionnelleVousStagiaire.label" /></h3>
        <dl class="required condition-estStagiaireVous-filled">
          
              <dt class="required">${message(code:'myr.property.stagiaireDepuisLe.label')} * :</dt><dd id="stagiaireDepuisLe" class="action-editField validate-date required-true i18n-myr.property.stagiaireDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousStagiaire?.stagiaireDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'myr.property.stageRenumeration.label')} * :</dt><dd id="stageRenumeration" class="action-editField validate-boolean required-true i18n-myr.property.stageRenumeration" ><span class="value-${rqt.situationProfessionnelleVousStagiaire?.stageRenumeration}"><g:message code="message.${rqt.situationProfessionnelleVousStagiaire?.stageRenumeration ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required">${message(code:'myr.property.nomEmployeurStage.label')} * :</dt><dd id="nomEmployeurStage" class="action-editField validate-lastName required-true i18n-myr.property.nomEmployeurStage maxLength-38" ><span>${rqt.situationProfessionnelleVousStagiaire?.nomEmployeurStage}</span></dd>
          
              <dt class="required">${message(code:'myr.property.adresseEmployeurStage.label')} * :</dt><dd id="adresseEmployeurStage" class="action-editField validate-address required-true i18n-myr.property.adresseEmployeurStage" ><div><p class="additionalDeliveryInformation">${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.additionalDeliveryInformation}</p><p class="additionalGeographicalInformation">${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.additionalGeographicalInformation}</p><span class="streetNumber">${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.streetNumber}</span> <span class="streetName">${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.streetName}</span><g:if test="${!!rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.streetMatriculation}"><br /><em><g:message code="address.property.streetMatriculation" /></em><span class="streetMatriculation">${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.streetMatriculation}</span></g:if><g:if test="${!!rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.streetRivoliCode}"><br /><em><g:message code="address.property.streetRivoliCode" /></em><span class="streetRivoliCode">${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.streetRivoliCode}</span></g:if><p class="placeNameOrService">${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.placeNameOrService}</p><span class="postalCode">${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.postalCode}</span> <span class="city">${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.city}</span><p class="countryName">${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.countryName}</p><g:if test="${!!rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.cityInseeCode}"><em><g:message code="address.property.cityInseeCode" /></em><span class="cityInseeCode">${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.cityInseeCode}</span></g:if></div></dd>
          
              <dt class="required">${message(code:'myr.property.telephoneEmployeurStage.label')} * :</dt><dd id="telephoneEmployeurStage" class="action-editField validate-phone required-true i18n-myr.property.telephoneEmployeurStage maxLength-10" ><span>${rqt.situationProfessionnelleVousStagiaire?.telephoneEmployeurStage}</span></dd>
          
        </dl>
        
      
        
        <h3><g:message code="myr.property.situationProfessionnelleVousNonSalarie.label" /></h3>
        <dl class="required condition-estNonSalarieVous-filled">
          
              <dt class="required">${message(code:'myr.property.nonSalarieDepuisLe.label')} * :</dt><dd id="nonSalarieDepuisLe" class="action-editField validate-date required-true i18n-myr.property.nonSalarieDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousNonSalarie?.nonSalarieDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'myr.property.regimeCotisations.label')} * :</dt><dd id="regimeCotisations" class="action-editField validate-string required-true i18n-myr.property.regimeCotisations" ><span>${rqt.situationProfessionnelleVousNonSalarie?.regimeCotisations}</span></dd>
          
        </dl>
        
      
        
        <h3><g:message code="myr.property.situationProfessionnelleVousDemandeurEmploi.label" /></h3>
        <dl class="required condition-estDemandeurEmploiVous-filled">
          
              <dt class="required">${message(code:'myr.property.demandeurEmploiDepuisLe.label')} * :</dt><dd id="demandeurEmploiDepuisLe" class="action-editField validate-date required-true i18n-myr.property.demandeurEmploiDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousDemandeurEmploi?.demandeurEmploiDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'myr.property.indemnisationDepuisLe.label')} * :</dt><dd id="indemnisationDepuisLe" class="action-editField validate-date required-true i18n-myr.property.indemnisationDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousDemandeurEmploi?.indemnisationDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'myr.property.allocationSolidariteSpecifique.label')} * :</dt><dd id="allocationSolidariteSpecifique" class="action-editField validate-boolean required-true i18n-myr.property.allocationSolidariteSpecifique" ><span class="value-${rqt.situationProfessionnelleVousDemandeurEmploi?.allocationSolidariteSpecifique}"><g:message code="message.${rqt.situationProfessionnelleVousDemandeurEmploi?.allocationSolidariteSpecifique ? 'yes' : 'no'}" /></span></dd>
          
        </dl>
        
      
        
        <h3><g:message code="myr.property.situationProfessionnelleVousRetraite.label" /></h3>
        <dl class="required condition-estRetraiteVous-filled">
          
              <dt class="required">${message(code:'myr.property.retraiteDepuisLe.label')} * :</dt><dd id="retraiteDepuisLe" class="action-editField validate-date required-true i18n-myr.property.retraiteDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousRetraite?.retraiteDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'myr.property.supplementairePersonneAgee.label')} * :</dt><dd id="supplementairePersonneAgee" class="action-editField validate-boolean required-true i18n-myr.property.supplementairePersonneAgee" ><span class="value-${rqt.situationProfessionnelleVousRetraite?.supplementairePersonneAgee}"><g:message code="message.${rqt.situationProfessionnelleVousRetraite?.supplementairePersonneAgee ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required">${message(code:'myr.property.pensionRetraite.label')} * :</dt><dd id="pensionRetraite" class="action-editField validate-boolean required-true i18n-myr.property.pensionRetraite" ><span class="value-${rqt.situationProfessionnelleVousRetraite?.pensionRetraite}"><g:message code="message.${rqt.situationProfessionnelleVousRetraite?.pensionRetraite ? 'yes' : 'no'}" /></span></dd>
          
        </dl>
        
      
        
        <h3><g:message code="myr.property.situationProfessionnelleVousBeneficiairePension.label" /></h3>
        <dl class="required condition-estBeneficiairePensionVous-filled">
          
              <dt class="required">${message(code:'myr.property.beneficiairePensionDepuisLe.label')} * :</dt><dd id="beneficiairePensionDepuisLe" class="action-editField validate-date required-true i18n-myr.property.beneficiairePensionDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousBeneficiairePension?.beneficiairePensionDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'myr.property.categoriePensionInvalidite.label')} * :</dt><dd id="categoriePensionInvalidite" class="action-editField validate-capdematEnum required-true i18n-myr.property.categoriePensionInvalidite javatype-fr.cg95.cvq.business.request.social.MyrCategoriePensionInvaliditeType" ><g:capdematEnumToField var="${rqt.situationProfessionnelleVousBeneficiairePension?.categoriePensionInvalidite}" i18nKeyPrefix="myr.property.categoriePensionInvalidite" /></dd>
          
              <dt class="required">${message(code:'myr.property.renteAccidentTravail.label')} * :</dt><dd id="renteAccidentTravail" class="action-editField validate-boolean required-true i18n-myr.property.renteAccidentTravail" ><span class="value-${rqt.situationProfessionnelleVousBeneficiairePension?.renteAccidentTravail}"><g:message code="message.${rqt.situationProfessionnelleVousBeneficiairePension?.renteAccidentTravail ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required">${message(code:'myr.property.allocationSupplementaireInvalidite.label')} * :</dt><dd id="allocationSupplementaireInvalidite" class="action-editField validate-boolean required-true i18n-myr.property.allocationSupplementaireInvalidite" ><span class="value-${rqt.situationProfessionnelleVousBeneficiairePension?.allocationSupplementaireInvalidite}"><g:message code="message.${rqt.situationProfessionnelleVousBeneficiairePension?.allocationSupplementaireInvalidite ? 'yes' : 'no'}" /></span></dd>
          
        </dl>
        
      
        
        <h3><g:message code="myr.property.situationProfessionnelleVousAutre.label" /></h3>
        <dl class="required condition-estAutreVous-filled">
          
              <dt class="required">${message(code:'myr.property.autreDepuisLe.label')} * :</dt><dd id="autreDepuisLe" class="action-editField validate-date required-true i18n-myr.property.autreDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousAutre?.autreDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'myr.property.precisionAutreSituationProfessionnelle.label')} * :</dt><dd id="precisionAutreSituationProfessionnelle" class="action-editField validate-string required-true i18n-myr.property.precisionAutreSituationProfessionnelle" ><span>${rqt.situationProfessionnelleVousAutre?.precisionAutreSituationProfessionnelle}</span></dd>
          
        </dl>
        
      
    </div>
    <!-- column end -->
    
    <!-- column start -->
    <div class="yui-u">
      
        
        <dl>
          <dt class="condition-estSalarieConjoint-trigger condition-estStagiaireConjoint-trigger condition-estNonSalarieConjoint-trigger condition-estDemandeurEmploiConjoint-trigger condition-estRetraiteConjoint-trigger condition-estBeneficiairePensionConjoint-trigger condition-estAutreConjoint-trigger">${message(code:'myr.property.situationProfessionnelleConjoint.label')} :</dt><dd id="situationProfessionnelleConjoint" class="action-editField validate-capdematEnum i18n-myr.property.situationProfessionnelleConjoint javatype-fr.cg95.cvq.business.request.social.MyrChoixSituationProfessionnelleType" ><g:capdematEnumToField var="${rqt?.situationProfessionnelleConjoint}" i18nKeyPrefix="myr.property.situationProfessionnelleConjoint" /></dd>
        </dl>
        
      
        
        <h3><g:message code="myr.property.situationProfessionnelleConjointSalarie.label" /></h3>
        <dl class="required condition-estSalarieConjoint-filled">
          
              <dt class="required">${message(code:'myr.property.salarieDepuisLe.label')} * :</dt><dd id="salarieDepuisLe" class="action-editField validate-date required-true i18n-myr.property.salarieDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointSalarie?.salarieDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'myr.property.typeContrat.label')} * :</dt><dd id="typeContrat" class="action-editField validate-string required-true i18n-myr.property.typeContrat" ><span>${rqt.situationProfessionnelleConjointSalarie?.typeContrat}</span></dd>
          
              <dt class="required">${message(code:'myr.property.salarieDateDebutContrat.label')} * :</dt><dd id="salarieDateDebutContrat" class="action-editField validate-date required-true i18n-myr.property.salarieDateDebutContrat" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointSalarie?.salarieDateDebutContrat}"/></span></dd>
          
              <dt class="">${message(code:'myr.property.salarieDateFinContrat.label')} :</dt><dd id="salarieDateFinContrat" class="action-editField validate-date i18n-myr.property.salarieDateFinContrat" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointSalarie?.salarieDateFinContrat}"/></span></dd>
          
              <dt class="">${message(code:'myr.property.esatDepuisLe.label')} :</dt><dd id="esatDepuisLe" class="action-editField validate-date i18n-myr.property.esatDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointSalarie?.esatDepuisLe}"/></span></dd>
          
        </dl>
        
      
        
        <h3><g:message code="myr.property.situationProfessionnelleConjointStagiaire.label" /></h3>
        <dl class="required condition-estStagiaireConjoint-filled">
          
              <dt class="required">${message(code:'myr.property.stagiaireDepuisLe.label')} * :</dt><dd id="stagiaireDepuisLe" class="action-editField validate-date required-true i18n-myr.property.stagiaireDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointStagiaire?.stagiaireDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'myr.property.stageRenumeration.label')} * :</dt><dd id="stageRenumeration" class="action-editField validate-boolean required-true i18n-myr.property.stageRenumeration" ><span class="value-${rqt.situationProfessionnelleConjointStagiaire?.stageRenumeration}"><g:message code="message.${rqt.situationProfessionnelleConjointStagiaire?.stageRenumeration ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required">${message(code:'myr.property.nomEmployeurStage.label')} * :</dt><dd id="nomEmployeurStage" class="action-editField validate-lastName required-true i18n-myr.property.nomEmployeurStage maxLength-38" ><span>${rqt.situationProfessionnelleConjointStagiaire?.nomEmployeurStage}</span></dd>
          
              <dt class="required">${message(code:'myr.property.adresseEmployeurStage.label')} * :</dt><dd id="adresseEmployeurStage" class="action-editField validate-address required-true i18n-myr.property.adresseEmployeurStage" ><div><p class="additionalDeliveryInformation">${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.additionalDeliveryInformation}</p><p class="additionalGeographicalInformation">${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.additionalGeographicalInformation}</p><span class="streetNumber">${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.streetNumber}</span> <span class="streetName">${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.streetName}</span><g:if test="${!!rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.streetMatriculation}"><br /><em><g:message code="address.property.streetMatriculation" /></em><span class="streetMatriculation">${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.streetMatriculation}</span></g:if><g:if test="${!!rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.streetRivoliCode}"><br /><em><g:message code="address.property.streetRivoliCode" /></em><span class="streetRivoliCode">${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.streetRivoliCode}</span></g:if><p class="placeNameOrService">${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.placeNameOrService}</p><span class="postalCode">${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.postalCode}</span> <span class="city">${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.city}</span><p class="countryName">${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.countryName}</p><g:if test="${!!rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.cityInseeCode}"><em><g:message code="address.property.cityInseeCode" /></em><span class="cityInseeCode">${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.cityInseeCode}</span></g:if></div></dd>
          
              <dt class="required">${message(code:'myr.property.telephoneEmployeurStage.label')} * :</dt><dd id="telephoneEmployeurStage" class="action-editField validate-phone required-true i18n-myr.property.telephoneEmployeurStage maxLength-10" ><span>${rqt.situationProfessionnelleConjointStagiaire?.telephoneEmployeurStage}</span></dd>
          
        </dl>
        
      
        
        <h3><g:message code="myr.property.situationProfessionnelleConjointNonSalarie.label" /></h3>
        <dl class="required condition-estNonSalarieConjoint-filled">
          
              <dt class="required">${message(code:'myr.property.nonSalarieDepuisLe.label')} * :</dt><dd id="nonSalarieDepuisLe" class="action-editField validate-date required-true i18n-myr.property.nonSalarieDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointNonSalarie?.nonSalarieDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'myr.property.regimeCotisations.label')} * :</dt><dd id="regimeCotisations" class="action-editField validate-string required-true i18n-myr.property.regimeCotisations" ><span>${rqt.situationProfessionnelleConjointNonSalarie?.regimeCotisations}</span></dd>
          
        </dl>
        
      
        
        <h3><g:message code="myr.property.situationProfessionnelleConjointDemandeurEmploi.label" /></h3>
        <dl class="required condition-estDemandeurEmploiConjoint-filled">
          
              <dt class="required">${message(code:'myr.property.demandeurEmploiDepuisLe.label')} * :</dt><dd id="demandeurEmploiDepuisLe" class="action-editField validate-date required-true i18n-myr.property.demandeurEmploiDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointDemandeurEmploi?.demandeurEmploiDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'myr.property.indemnisationDepuisLe.label')} * :</dt><dd id="indemnisationDepuisLe" class="action-editField validate-date required-true i18n-myr.property.indemnisationDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointDemandeurEmploi?.indemnisationDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'myr.property.allocationSolidariteSpecifique.label')} * :</dt><dd id="allocationSolidariteSpecifique" class="action-editField validate-boolean required-true i18n-myr.property.allocationSolidariteSpecifique" ><span class="value-${rqt.situationProfessionnelleConjointDemandeurEmploi?.allocationSolidariteSpecifique}"><g:message code="message.${rqt.situationProfessionnelleConjointDemandeurEmploi?.allocationSolidariteSpecifique ? 'yes' : 'no'}" /></span></dd>
          
        </dl>
        
      
        
        <h3><g:message code="myr.property.situationProfessionnelleConjointRetraite.label" /></h3>
        <dl class="required condition-estRetraiteConjoint-filled">
          
              <dt class="required">${message(code:'myr.property.retraiteDepuisLe.label')} * :</dt><dd id="retraiteDepuisLe" class="action-editField validate-date required-true i18n-myr.property.retraiteDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointRetraite?.retraiteDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'myr.property.supplementairePersonneAgee.label')} * :</dt><dd id="supplementairePersonneAgee" class="action-editField validate-boolean required-true i18n-myr.property.supplementairePersonneAgee" ><span class="value-${rqt.situationProfessionnelleConjointRetraite?.supplementairePersonneAgee}"><g:message code="message.${rqt.situationProfessionnelleConjointRetraite?.supplementairePersonneAgee ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required">${message(code:'myr.property.pensionRetraite.label')} * :</dt><dd id="pensionRetraite" class="action-editField validate-boolean required-true i18n-myr.property.pensionRetraite" ><span class="value-${rqt.situationProfessionnelleConjointRetraite?.pensionRetraite}"><g:message code="message.${rqt.situationProfessionnelleConjointRetraite?.pensionRetraite ? 'yes' : 'no'}" /></span></dd>
          
        </dl>
        
      
        
        <h3><g:message code="myr.property.situationProfessionnelleConjointBeneficiairePension.label" /></h3>
        <dl class="required condition-estBeneficiairePensionConjoint-filled">
          
              <dt class="required">${message(code:'myr.property.beneficiairePensionDepuisLe.label')} * :</dt><dd id="beneficiairePensionDepuisLe" class="action-editField validate-date required-true i18n-myr.property.beneficiairePensionDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointBeneficiairePension?.beneficiairePensionDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'myr.property.categoriePensionInvalidite.label')} * :</dt><dd id="categoriePensionInvalidite" class="action-editField validate-capdematEnum required-true i18n-myr.property.categoriePensionInvalidite javatype-fr.cg95.cvq.business.request.social.MyrCategoriePensionInvaliditeType" ><g:capdematEnumToField var="${rqt.situationProfessionnelleConjointBeneficiairePension?.categoriePensionInvalidite}" i18nKeyPrefix="myr.property.categoriePensionInvalidite" /></dd>
          
              <dt class="required">${message(code:'myr.property.renteAccidentTravail.label')} * :</dt><dd id="renteAccidentTravail" class="action-editField validate-boolean required-true i18n-myr.property.renteAccidentTravail" ><span class="value-${rqt.situationProfessionnelleConjointBeneficiairePension?.renteAccidentTravail}"><g:message code="message.${rqt.situationProfessionnelleConjointBeneficiairePension?.renteAccidentTravail ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="required">${message(code:'myr.property.allocationSupplementaireInvalidite.label')} * :</dt><dd id="allocationSupplementaireInvalidite" class="action-editField validate-boolean required-true i18n-myr.property.allocationSupplementaireInvalidite" ><span class="value-${rqt.situationProfessionnelleConjointBeneficiairePension?.allocationSupplementaireInvalidite}"><g:message code="message.${rqt.situationProfessionnelleConjointBeneficiairePension?.allocationSupplementaireInvalidite ? 'yes' : 'no'}" /></span></dd>
          
        </dl>
        
      
        
        <h3><g:message code="myr.property.situationProfessionnelleConjointAutre.label" /></h3>
        <dl class="required condition-estAutreConjoint-filled">
          
              <dt class="required">${message(code:'myr.property.autreDepuisLe.label')} * :</dt><dd id="autreDepuisLe" class="action-editField validate-date required-true i18n-myr.property.autreDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointAutre?.autreDepuisLe}"/></span></dd>
          
              <dt class="required">${message(code:'myr.property.precisionAutreSituationProfessionnelle.label')} * :</dt><dd id="precisionAutreSituationProfessionnelle" class="action-editField validate-string required-true i18n-myr.property.precisionAutreSituationProfessionnelle" ><span>${rqt.situationProfessionnelleConjointAutre?.precisionAutreSituationProfessionnelle}</span></dd>
          
        </dl>
        
      
    </div>
    <!-- column end -->
    
  </div>
  <!-- data step  end -->
</div>
<!-- step end -->

<!-- step start -->
<div id="page5">
  <h2><g:message code="property.form" />
    <span><g:message code="myr.step.autreSituation.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <dl>
          <dt class="required condition-typeLogement-trigger">${message(code:'myr.property.typeLogement.label')} * :</dt><dd id="typeLogement" class="action-editField validate-capdematEnum required-true i18n-myr.property.typeLogement javatype-fr.cg95.cvq.business.request.social.MyrLogementType" ><g:capdematEnumToField var="${rqt?.typeLogement}" i18nKeyPrefix="myr.property.typeLogement" /></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required condition-typeLogement-filled">${message(code:'myr.property.precisionLogementAutre.label')} * :</dt><dd id="precisionLogementAutre" class="action-editField validate-string required-true i18n-myr.property.precisionLogementAutre" ><span>${rqt?.precisionLogementAutre}</span></dd>
        </dl>
        
      
    </div>
    <!-- column end -->
    
    <!-- column start -->
    <div class="yui-u">
      
        
        <dl>
          <dt class="condition-estAutreCas-trigger condition-estUnCas-trigger">${message(code:'myr.property.situationParticuliere.label')} :</dt><dd id="situationParticuliere" class="action-editField validate-capdematEnum i18n-myr.property.situationParticuliere javatype-fr.cg95.cvq.business.request.social.MyrSituationAutreType" ><g:capdematEnumToField var="${rqt?.situationParticuliere}" i18nKeyPrefix="myr.property.situationParticuliere" /></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required condition-estAutreCas-filled">${message(code:'myr.property.precisionAutre.label')} * :</dt><dd id="precisionAutre" class="action-editField validate-string required-true i18n-myr.property.precisionAutre" ><span>${rqt?.precisionAutre}</span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required condition-estUnCas-filled">${message(code:'myr.property.nomEtablissement.label')} * :</dt><dd id="nomEtablissement" class="action-editField validate-string required-true i18n-myr.property.nomEtablissement" ><span>${rqt?.nomEtablissement}</span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required condition-estUnCas-filled">${message(code:'myr.property.domiciliationEtablissement.label')} * :</dt><dd id="domiciliationEtablissement" class="action-editField validate-address required-true i18n-myr.property.domiciliationEtablissement" ><div><p class="additionalDeliveryInformation">${rqt?.domiciliationEtablissement?.additionalDeliveryInformation}</p><p class="additionalGeographicalInformation">${rqt?.domiciliationEtablissement?.additionalGeographicalInformation}</p><span class="streetNumber">${rqt?.domiciliationEtablissement?.streetNumber}</span> <span class="streetName">${rqt?.domiciliationEtablissement?.streetName}</span><g:if test="${!!rqt?.domiciliationEtablissement?.streetMatriculation}"><br /><em><g:message code="address.property.streetMatriculation" /></em><span class="streetMatriculation">${rqt?.domiciliationEtablissement?.streetMatriculation}</span></g:if><g:if test="${!!rqt?.domiciliationEtablissement?.streetRivoliCode}"><br /><em><g:message code="address.property.streetRivoliCode" /></em><span class="streetRivoliCode">${rqt?.domiciliationEtablissement?.streetRivoliCode}</span></g:if><p class="placeNameOrService">${rqt?.domiciliationEtablissement?.placeNameOrService}</p><span class="postalCode">${rqt?.domiciliationEtablissement?.postalCode}</span> <span class="city">${rqt?.domiciliationEtablissement?.city}</span><p class="countryName">${rqt?.domiciliationEtablissement?.countryName}</p><g:if test="${!!rqt?.domiciliationEtablissement?.cityInseeCode}"><em><g:message code="address.property.cityInseeCode" /></em><span class="cityInseeCode">${rqt?.domiciliationEtablissement?.cityInseeCode}</span></g:if></div></dd>
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
    <span><g:message code="myr.step.projetDeVie.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <dl>
          <dt class="required condition-choixProjetDeVie-trigger">${message(code:'myr.property.choixProjetDeVie.label')} * :</dt><dd id="choixProjetDeVie" class="action-editField validate-capdematEnum required-true i18n-myr.property.choixProjetDeVie javatype-fr.cg95.cvq.business.request.social.MyrChoixProjetDeVieType" ><g:capdematEnumToField var="${rqt?.choixProjetDeVie}" i18nKeyPrefix="myr.property.choixProjetDeVie" /></dd>
        </dl>
        
      
        
        <dl>
          <dt class="condition-choixProjetDeVie-filled">${message(code:'myr.property.conseilleProjetDeVie.label')} :</dt><dd id="conseilleProjetDeVie" class="action-editField validate-string i18n-myr.property.conseilleProjetDeVie" ><span>${rqt?.conseilleProjetDeVie}</span></dd>
        </dl>
        
      
    </div>
    <!-- column end -->
    
    <!-- column start -->
    <div class="yui-u">
      
        
        <dl>
          <dt class="required condition-choixProjetDeVie-filled">${message(code:'myr.property.expressionProjetDeVie.label')} * :</dt><dd id="expressionProjetDeVie" class="action-editField validate-regex required-true i18n-myr.property.expressionProjetDeVie rows-20 maxLength-5096" regex="^.{0,5096}$"><span>${rqt?.expressionProjetDeVie}</span></dd>
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
    <span><g:message code="myr.step.allocationEducationEnfantHandicape.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <dl>
          <dt class="required condition-enfantEnInternat-trigger">${message(code:'myr.property.enfantEnInternat.label')} * :</dt><dd id="enfantEnInternat" class="action-editField validate-boolean required-true i18n-myr.property.enfantEnInternat" ><span class="value-${rqt?.enfantEnInternat}"><g:message code="message.${rqt?.enfantEnInternat ? 'yes' : 'no'}" /></span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required condition-enfantEnInternat-filled">${message(code:'myr.property.enInternatDepuisLe.label')} * :</dt><dd id="enInternatDepuisLe" class="action-editField validate-date required-true i18n-myr.property.enInternatDepuisLe" ><span><g:formatDate formatName="format.date" date="${rqt?.enInternatDepuisLe}"/></span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required condition-enfantEnInternat-filled">${message(code:'myr.property.fraisSejourPrisEnCharge.label')} * :</dt><dd id="fraisSejourPrisEnCharge" class="action-editField validate-boolean required-true i18n-myr.property.fraisSejourPrisEnCharge" ><span class="value-${rqt?.fraisSejourPrisEnCharge}"><g:message code="message.${rqt?.fraisSejourPrisEnCharge ? 'yes' : 'no'}" /></span></dd>
        </dl>
        
      
        
        <h3><g:message code="myr.property.presencePersonneAupresEnfant.label" /></h3>
        <dl class="">
          
              <dt class="required">${message(code:'myr.property.exerciceActiviteProfessionnelle.label')} * :</dt><dd id="exerciceActiviteProfessionnelle" class="action-editField validate-boolean required-true i18n-myr.property.exerciceActiviteProfessionnelle" ><span class="value-${rqt.presencePersonneAupresEnfant?.exerciceActiviteProfessionnelle}"><g:message code="message.${rqt.presencePersonneAupresEnfant?.exerciceActiviteProfessionnelle ? 'yes' : 'no'}" /></span></dd>
          
              <dt class="">${message(code:'myr.property.recoursEmploiRemunereTiercePersonne.label')} :</dt><dd id="recoursEmploiRemunereTiercePersonne" class="action-editField validate-regex i18n-myr.property.recoursEmploiRemunereTiercePersonne maxLength-3" regex="[0-9]{0,3}"><span>${rqt.presencePersonneAupresEnfant?.recoursEmploiRemunereTiercePersonne}</span></dd>
          
              <dt class="">${message(code:'myr.property.nbHeureParAnEmploiNonRegulier.label')} :</dt><dd id="nbHeureParAnEmploiNonRegulier" class="action-editField validate-regex i18n-myr.property.nbHeureParAnEmploiNonRegulier maxLength-3" regex="[0-9]{0,3}"><span>${rqt.presencePersonneAupresEnfant?.nbHeureParAnEmploiNonRegulier}</span></dd>
          
        </dl>
        
      
    </div>
    <!-- column end -->
    
    <!-- column start -->
    <div class="yui-u">
      
        
        <dl>
          <dt class="required">${message(code:'myr.property.typeAccueil.label')} * :</dt><dd id="typeAccueil" class="action-editField validate-regex required-true i18n-myr.property.typeAccueil maxLength-1024" regex="^.{0,1024}$"><span>${rqt?.typeAccueil}</span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'myr.property.typeScolarisation.label')} * :</dt><dd id="typeScolarisation" class="action-editField validate-regex required-true i18n-myr.property.typeScolarisation maxLength-1024" regex="^.{0,1024}$"><span>${rqt?.typeScolarisation}</span></dd>
        </dl>
        
      
        
        <div id="widget-fraisSuppLiesHandicap" class="">
          <g:render template="/backofficeRequestInstruction/requestType/mdphYouthRequest/fraisSuppLiesHandicap" model="['rqt':rqt]" />
        </div>
        
      
    </div>
    <!-- column end -->
    
  </div>
  <!-- data step  end -->
</div>
<!-- step end -->

<!-- step start -->
<div id="page8">
  <h2><g:message code="property.form" />
    <span><g:message code="myr.step.demandeParcoursScolaireEtFormation.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <dl>
          <dt class="required">${message(code:'myr.property.demandeLibreScolaire.label')} * :</dt><dd id="demandeLibreScolaire" class="action-editField validate-regex required-true i18n-myr.property.demandeLibreScolaire rows-5 maxLength-2048" regex="^.{0,2048}$"><span>${rqt?.demandeLibreScolaire}</span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="condition-preferencesEtablissementOuService-trigger">${message(code:'myr.property.preferencesEtablissementOuService.label')} :</dt><dd id="preferencesEtablissementOuService" class="action-editField validate-boolean i18n-myr.property.preferencesEtablissementOuService" ><span class="value-${rqt?.preferencesEtablissementOuService}"><g:message code="message.${rqt?.preferencesEtablissementOuService ? 'yes' : 'no'}" /></span></dd>
        </dl>
        
      
        
        <h3><g:message code="myr.property.precisionPreferencesEtablissementOuService.label" /></h3>
        <dl class="required condition-preferencesEtablissementOuService-filled">
          
              <dt class="required">${message(code:'myr.property.nomPreferenceEtablissementOuService.label')} * :</dt><dd id="nomPreferenceEtablissementOuService" class="action-editField validate-string required-true i18n-myr.property.nomPreferenceEtablissementOuService" ><span>${rqt.precisionPreferencesEtablissementOuService?.nomPreferenceEtablissementOuService}</span></dd>
          
              <dt class="required">${message(code:'myr.property.codePostalPreferenceEtablissementOuService.label')} * :</dt><dd id="codePostalPreferenceEtablissementOuService" class="action-editField validate-postalCode required-true i18n-myr.property.codePostalPreferenceEtablissementOuService maxLength-5" ><span>${rqt.precisionPreferencesEtablissementOuService?.codePostalPreferenceEtablissementOuService}</span></dd>
          
              <dt class="required">${message(code:'myr.property.communePreferenceEtablissementOuService.label')} * :</dt><dd id="communePreferenceEtablissementOuService" class="action-editField validate-city required-true i18n-myr.property.communePreferenceEtablissementOuService maxLength-32" ><span>${rqt.precisionPreferencesEtablissementOuService?.communePreferenceEtablissementOuService}</span></dd>
          
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
    <span><g:message code="myr.step.demandeCartes.label" /></span>
  </h2>
  <div class="yui-g">
    
    
    <!-- column start -->
    <div class="yui-u first">
      
        
        <dl>
          <dt class="required">${message(code:'myr.property.carteInvalidite.label')} * :</dt><dd id="carteInvalidite" class="action-editField validate-boolean required-true i18n-myr.property.carteInvalidite" ><span class="value-${rqt?.carteInvalidite}"><g:message code="message.${rqt?.carteInvalidite ? 'yes' : 'no'}" /></span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'myr.property.carteAccompagnement.label')} * :</dt><dd id="carteAccompagnement" class="action-editField validate-boolean required-true i18n-myr.property.carteAccompagnement" ><span class="value-${rqt?.carteAccompagnement}"><g:message code="message.${rqt?.carteAccompagnement ? 'yes' : 'no'}" /></span></dd>
        </dl>
        
      
        
        <dl>
          <dt class="required">${message(code:'myr.property.carteStationnement.label')} * :</dt><dd id="carteStationnement" class="action-editField validate-boolean required-true i18n-myr.property.carteStationnement" ><span class="value-${rqt?.carteStationnement}"><g:message code="message.${rqt?.carteStationnement ? 'yes' : 'no'}" /></span></dd>
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

