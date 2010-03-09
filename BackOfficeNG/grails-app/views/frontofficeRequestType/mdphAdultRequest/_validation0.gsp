


  
    <h3><g:message code="mar.step.subject.label" /></h3>
    
      
      <dl>
        <dt><g:message code="request.property.subject.label" /></dt><dd>${subjects.get(rqt.subjectId)}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.faxSujet.label" /></dt><dd>${rqt.faxSujet?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.nationalite.label" /></dt>
          <dd>
            <g:if test="${rqt.nationalite}">
              <g:capdematEnumToField var="${rqt.nationalite}" i18nKeyPrefix="mar.property.nationalite" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.dateNaissanceSujet.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.dateNaissanceSujet}"/></dd>
          

      </dl>
      
    
      
      <h4><g:message code="mar.property.lieuNaissanceSujet.label" /></h4>
      <dl>
        
          <dt><g:message code="mar.property.postalCode.label" /></dt><dd>${rqt.lieuNaissanceSujet?.postalCode?.toString()}</dd>

        
          <dt><g:message code="mar.property.city.label" /></dt><dd>${rqt.lieuNaissanceSujet?.city?.toString()}</dd>

        
          <dt><g:message code="mar.property.country.label" /></dt>
          <dd>
            <g:if test="${rqt.lieuNaissanceSujet?.country}">
              <g:capdematEnumToField var="${rqt.lieuNaissanceSujet?.country}" i18nKeyPrefix="mar.property.country" />
            </g:if>
          </dd>
          

        
      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.dateArriveeFrance.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.dateArriveeFrance}"/></dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.numeroSecuriteSocialeSujet.label" /></dt><dd>${rqt.numeroSecuriteSocialeSujet?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.nomOrganismeSecuriteSociale.label" /></dt><dd>${rqt.nomOrganismeSecuriteSociale?.toString()}</dd>

      </dl>
      
    
      
      <h4><g:message code="mar.property.precedentDossierMdph.label" /></h4>
      <dl>
        
          <dt><g:message code="mar.property.numeroMdph.label" /></dt><dd>${rqt.precedentDossierMdph?.numeroMdph?.toString()}</dd>

        
          <dt><g:message code="mar.property.departementMdph.label" /></dt>
          <dd>
            <g:if test="${rqt.precedentDossierMdph?.departementMdph}">
              <g:capdematEnumToField var="${rqt.precedentDossierMdph?.departementMdph}" i18nKeyPrefix="mar.property.departementMdph" />
            </g:if>
          </dd>
          

        
      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.precisionSiDomicileAupresOrganisme.label" /></dt><dd>${rqt.precisionSiDomicileAupresOrganisme?.toString()}</dd>

      </dl>
      
    
  

  
    <h3><g:message code="mar.step.representantLegal.label" /></h3>
    
      
      <dl>
        <dt><g:message code="mar.property.representantLegal.label" /></dt>
          <dd>
            <g:if test="${rqt.representantLegal}">
              <g:capdematEnumToField var="${rqt.representantLegal}" i18nKeyPrefix="mar.property.representantLegal" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.nomResponsableLegal.label" /></dt><dd>${rqt.nomResponsableLegal?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.adresseResponsableLegal.label" /></dt>
          <dd>
          <g:if test="${rqt.adresseResponsableLegal}">
              <p>${rqt.adresseResponsableLegal?.additionalDeliveryInformation}</p>
              <p>${rqt.adresseResponsableLegal?.additionalGeographicalInformation}</p>
              <p>${rqt.adresseResponsableLegal?.streetNumber} ${rqt.adresseResponsableLegal?.streetName}</p>
              <p>${rqt.adresseResponsableLegal?.placeNameOrService}</p>
              <p>${rqt.adresseResponsableLegal?.postalCode} ${rqt.adresseResponsableLegal?.city}</p>
              <p>${rqt.adresseResponsableLegal?.countryName}</p>
          </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.telResponsableLegal.label" /></dt><dd>${rqt.telResponsableLegal?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.faxResponsableLegal.label" /></dt><dd>${rqt.faxResponsableLegal?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.emailResponsableLegal.label" /></dt><dd>${rqt.emailResponsableLegal?.toString()}</dd>

      </dl>
      
    
  

  
    <h3><g:message code="mar.step.organismePrestationFamiliale.label" /></h3>
    
      
      <dl>
        <dt><g:message code="mar.property.numeroAllocataire.label" /></dt><dd>${rqt.numeroAllocataire?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.organismePayeur.label" /></dt>
          <dd>
            <g:if test="${rqt.organismePayeur}">
              <g:capdematEnumToField var="${rqt.organismePayeur}" i18nKeyPrefix="mar.property.organismePayeur" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.nomAllocataire.label" /></dt><dd>${rqt.nomAllocataire?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.prenomAllocataire.label" /></dt><dd>${rqt.prenomAllocataire?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.nomOrganismePayeur.label" /></dt><dd>${rqt.nomOrganismePayeur?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.domiciliationOrganismePayeur.label" /></dt>
          <dd>
          <g:if test="${rqt.domiciliationOrganismePayeur}">
              <p>${rqt.domiciliationOrganismePayeur?.additionalDeliveryInformation}</p>
              <p>${rqt.domiciliationOrganismePayeur?.additionalGeographicalInformation}</p>
              <p>${rqt.domiciliationOrganismePayeur?.streetNumber} ${rqt.domiciliationOrganismePayeur?.streetName}</p>
              <p>${rqt.domiciliationOrganismePayeur?.placeNameOrService}</p>
              <p>${rqt.domiciliationOrganismePayeur?.postalCode} ${rqt.domiciliationOrganismePayeur?.city}</p>
              <p>${rqt.domiciliationOrganismePayeur?.countryName}</p>
          </g:if>
          </dd>
          

      </dl>
      
    
  

  
    <h3><g:message code="mar.step.situationFamiliale.label" /></h3>
    
      
      <dl>
        <dt><g:message code="mar.property.situationMaritale.label" /></dt>
          <dd>
            <g:if test="${rqt.situationMaritale}">
              <g:capdematEnumToField var="${rqt.situationMaritale}" i18nKeyPrefix="mar.property.situationMaritale" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.dateSituationFamiliale.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.dateSituationFamiliale}"/></dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.nombreEnfantsACharge.label" /></dt><dd>${rqt.nombreEnfantsACharge?.toString()}</dd>

      </dl>
      
    
      
      <h4><g:message code="mar.property.identiteConjoint.label" /></h4>
      <dl>
        
          <dt><g:message code="mar.property.nomNaissanceConjoint.label" /></dt><dd>${rqt.identiteConjoint?.nomNaissanceConjoint?.toString()}</dd>

        
          <dt><g:message code="mar.property.prenomConjoint.label" /></dt><dd>${rqt.identiteConjoint?.prenomConjoint?.toString()}</dd>

        
          <dt><g:message code="mar.property.dateNaissanceConjoint.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.identiteConjoint?.dateNaissanceConjoint}"/></dd>
          

        
      </dl>
      
    
  

  
    <h3><g:message code="mar.step.situationProfessionnelle.label" /></h3>
    
      
      <dl>
        <dt><g:message code="mar.property.situationProfessionnelleVous.label" /></dt>
          <dd>
            <g:if test="${rqt.situationProfessionnelleVous}">
              <g:capdematEnumToField var="${rqt.situationProfessionnelleVous}" i18nKeyPrefix="mar.property.situationProfessionnelleVous" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <h4><g:message code="mar.property.situationProfessionnelleVousSalarie.label" /></h4>
      <dl>
        
          <dt><g:message code="mar.property.salarieDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousSalarie?.salarieDepuisLe}"/></dd>
          

        
          <dt><g:message code="mar.property.typeContrat.label" /></dt><dd>${rqt.situationProfessionnelleVousSalarie?.typeContrat?.toString()}</dd>

        
          <dt><g:message code="mar.property.salarieDateDebutContrat.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousSalarie?.salarieDateDebutContrat}"/></dd>
          

        
          <dt><g:message code="mar.property.salarieDateFinContrat.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousSalarie?.salarieDateFinContrat}"/></dd>
          

        
          <dt><g:message code="mar.property.esatDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousSalarie?.esatDepuisLe}"/></dd>
          

        
      </dl>
      
    
      
      <h4><g:message code="mar.property.situationProfessionnelleVousStagiaire.label" /></h4>
      <dl>
        
          <dt><g:message code="mar.property.stagiaireDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousStagiaire?.stagiaireDepuisLe}"/></dd>
          

        
          <dt><g:message code="mar.property.stageRenumeration.label" /></dt>
          <dd><g:message code="message.${rqt.situationProfessionnelleVousStagiaire?.stageRenumeration ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="mar.property.nomEmployeurStage.label" /></dt><dd>${rqt.situationProfessionnelleVousStagiaire?.nomEmployeurStage?.toString()}</dd>

        
          <dt><g:message code="mar.property.adresseEmployeurStage.label" /></dt>
          <dd>
          <g:if test="${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage}">
              <p>${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.additionalDeliveryInformation}</p>
              <p>${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.additionalGeographicalInformation}</p>
              <p>${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.streetNumber} ${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.streetName}</p>
              <p>${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.placeNameOrService}</p>
              <p>${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.postalCode} ${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.city}</p>
              <p>${rqt.situationProfessionnelleVousStagiaire?.adresseEmployeurStage?.countryName}</p>
          </g:if>
          </dd>
          

        
          <dt><g:message code="mar.property.telephoneEmployeurStage.label" /></dt><dd>${rqt.situationProfessionnelleVousStagiaire?.telephoneEmployeurStage?.toString()}</dd>

        
      </dl>
      
    
      
      <h4><g:message code="mar.property.situationProfessionnelleVousNonSalarie.label" /></h4>
      <dl>
        
          <dt><g:message code="mar.property.nonSalarieDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousNonSalarie?.nonSalarieDepuisLe}"/></dd>
          

        
          <dt><g:message code="mar.property.regimeCotisations.label" /></dt><dd>${rqt.situationProfessionnelleVousNonSalarie?.regimeCotisations?.toString()}</dd>

        
      </dl>
      
    
      
      <h4><g:message code="mar.property.situationProfessionnelleVousDemandeurEmploi.label" /></h4>
      <dl>
        
          <dt><g:message code="mar.property.demandeurEmploiDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousDemandeurEmploi?.demandeurEmploiDepuisLe}"/></dd>
          

        
          <dt><g:message code="mar.property.indemnisationDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousDemandeurEmploi?.indemnisationDepuisLe}"/></dd>
          

        
          <dt><g:message code="mar.property.allocationSolidariteSpecifique.label" /></dt>
          <dd><g:message code="message.${rqt.situationProfessionnelleVousDemandeurEmploi?.allocationSolidariteSpecifique ? 'yes' : 'no'}" /></dd>
          

        
      </dl>
      
    
      
      <h4><g:message code="mar.property.situationProfessionnelleVousRetraite.label" /></h4>
      <dl>
        
          <dt><g:message code="mar.property.retraiteDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousRetraite?.retraiteDepuisLe}"/></dd>
          

        
          <dt><g:message code="mar.property.supplementairePersonneAgee.label" /></dt>
          <dd><g:message code="message.${rqt.situationProfessionnelleVousRetraite?.supplementairePersonneAgee ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="mar.property.pensionRetraite.label" /></dt>
          <dd><g:message code="message.${rqt.situationProfessionnelleVousRetraite?.pensionRetraite ? 'yes' : 'no'}" /></dd>
          

        
      </dl>
      
    
      
      <h4><g:message code="mar.property.situationProfessionnelleVousBeneficiairePension.label" /></h4>
      <dl>
        
          <dt><g:message code="mar.property.beneficiairePensionDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousBeneficiairePension?.beneficiairePensionDepuisLe}"/></dd>
          

        
          <dt><g:message code="mar.property.categoriePensionInvalidite.label" /></dt>
          <dd>
            <g:if test="${rqt.situationProfessionnelleVousBeneficiairePension?.categoriePensionInvalidite}">
              <g:capdematEnumToField var="${rqt.situationProfessionnelleVousBeneficiairePension?.categoriePensionInvalidite}" i18nKeyPrefix="mar.property.categoriePensionInvalidite" />
            </g:if>
          </dd>
          

        
          <dt><g:message code="mar.property.renteAccidentTravail.label" /></dt>
          <dd><g:message code="message.${rqt.situationProfessionnelleVousBeneficiairePension?.renteAccidentTravail ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="mar.property.allocationSupplementaireInvalidite.label" /></dt>
          <dd><g:message code="message.${rqt.situationProfessionnelleVousBeneficiairePension?.allocationSupplementaireInvalidite ? 'yes' : 'no'}" /></dd>
          

        
      </dl>
      
    
      
      <h4><g:message code="mar.property.situationProfessionnelleVousAutre.label" /></h4>
      <dl>
        
          <dt><g:message code="mar.property.autreDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousAutre?.autreDepuisLe}"/></dd>
          

        
          <dt><g:message code="mar.property.precisionAutreSituationProfessionnelle.label" /></dt><dd>${rqt.situationProfessionnelleVousAutre?.precisionAutreSituationProfessionnelle?.toString()}</dd>

        
      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.situationProfessionnelleConjoint.label" /></dt>
          <dd>
            <g:if test="${rqt.situationProfessionnelleConjoint}">
              <g:capdematEnumToField var="${rqt.situationProfessionnelleConjoint}" i18nKeyPrefix="mar.property.situationProfessionnelleConjoint" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <h4><g:message code="mar.property.situationProfessionnelleConjointSalarie.label" /></h4>
      <dl>
        
          <dt><g:message code="mar.property.salarieDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointSalarie?.salarieDepuisLe}"/></dd>
          

        
          <dt><g:message code="mar.property.typeContrat.label" /></dt><dd>${rqt.situationProfessionnelleConjointSalarie?.typeContrat?.toString()}</dd>

        
          <dt><g:message code="mar.property.salarieDateDebutContrat.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointSalarie?.salarieDateDebutContrat}"/></dd>
          

        
          <dt><g:message code="mar.property.salarieDateFinContrat.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointSalarie?.salarieDateFinContrat}"/></dd>
          

        
          <dt><g:message code="mar.property.esatDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointSalarie?.esatDepuisLe}"/></dd>
          

        
      </dl>
      
    
      
      <h4><g:message code="mar.property.situationProfessionnelleConjointStagiaire.label" /></h4>
      <dl>
        
          <dt><g:message code="mar.property.stagiaireDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointStagiaire?.stagiaireDepuisLe}"/></dd>
          

        
          <dt><g:message code="mar.property.stageRenumeration.label" /></dt>
          <dd><g:message code="message.${rqt.situationProfessionnelleConjointStagiaire?.stageRenumeration ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="mar.property.nomEmployeurStage.label" /></dt><dd>${rqt.situationProfessionnelleConjointStagiaire?.nomEmployeurStage?.toString()}</dd>

        
          <dt><g:message code="mar.property.adresseEmployeurStage.label" /></dt>
          <dd>
          <g:if test="${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage}">
              <p>${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.additionalDeliveryInformation}</p>
              <p>${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.additionalGeographicalInformation}</p>
              <p>${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.streetNumber} ${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.streetName}</p>
              <p>${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.placeNameOrService}</p>
              <p>${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.postalCode} ${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.city}</p>
              <p>${rqt.situationProfessionnelleConjointStagiaire?.adresseEmployeurStage?.countryName}</p>
          </g:if>
          </dd>
          

        
          <dt><g:message code="mar.property.telephoneEmployeurStage.label" /></dt><dd>${rqt.situationProfessionnelleConjointStagiaire?.telephoneEmployeurStage?.toString()}</dd>

        
      </dl>
      
    
      
      <h4><g:message code="mar.property.situationProfessionnelleConjointNonSalarie.label" /></h4>
      <dl>
        
          <dt><g:message code="mar.property.nonSalarieDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointNonSalarie?.nonSalarieDepuisLe}"/></dd>
          

        
          <dt><g:message code="mar.property.regimeCotisations.label" /></dt><dd>${rqt.situationProfessionnelleConjointNonSalarie?.regimeCotisations?.toString()}</dd>

        
      </dl>
      
    
      
      <h4><g:message code="mar.property.situationProfessionnelleConjointDemandeurEmploi.label" /></h4>
      <dl>
        
          <dt><g:message code="mar.property.demandeurEmploiDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointDemandeurEmploi?.demandeurEmploiDepuisLe}"/></dd>
          

        
          <dt><g:message code="mar.property.indemnisationDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointDemandeurEmploi?.indemnisationDepuisLe}"/></dd>
          

        
          <dt><g:message code="mar.property.allocationSolidariteSpecifique.label" /></dt>
          <dd><g:message code="message.${rqt.situationProfessionnelleConjointDemandeurEmploi?.allocationSolidariteSpecifique ? 'yes' : 'no'}" /></dd>
          

        
      </dl>
      
    
      
      <h4><g:message code="mar.property.situationProfessionnelleConjointRetraite.label" /></h4>
      <dl>
        
          <dt><g:message code="mar.property.retraiteDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointRetraite?.retraiteDepuisLe}"/></dd>
          

        
          <dt><g:message code="mar.property.supplementairePersonneAgee.label" /></dt>
          <dd><g:message code="message.${rqt.situationProfessionnelleConjointRetraite?.supplementairePersonneAgee ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="mar.property.pensionRetraite.label" /></dt>
          <dd><g:message code="message.${rqt.situationProfessionnelleConjointRetraite?.pensionRetraite ? 'yes' : 'no'}" /></dd>
          

        
      </dl>
      
    
      
      <h4><g:message code="mar.property.situationProfessionnelleConjointBeneficiairePension.label" /></h4>
      <dl>
        
          <dt><g:message code="mar.property.beneficiairePensionDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointBeneficiairePension?.beneficiairePensionDepuisLe}"/></dd>
          

        
          <dt><g:message code="mar.property.categoriePensionInvalidite.label" /></dt>
          <dd>
            <g:if test="${rqt.situationProfessionnelleConjointBeneficiairePension?.categoriePensionInvalidite}">
              <g:capdematEnumToField var="${rqt.situationProfessionnelleConjointBeneficiairePension?.categoriePensionInvalidite}" i18nKeyPrefix="mar.property.categoriePensionInvalidite" />
            </g:if>
          </dd>
          

        
          <dt><g:message code="mar.property.renteAccidentTravail.label" /></dt>
          <dd><g:message code="message.${rqt.situationProfessionnelleConjointBeneficiairePension?.renteAccidentTravail ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="mar.property.allocationSupplementaireInvalidite.label" /></dt>
          <dd><g:message code="message.${rqt.situationProfessionnelleConjointBeneficiairePension?.allocationSupplementaireInvalidite ? 'yes' : 'no'}" /></dd>
          

        
      </dl>
      
    
      
      <h4><g:message code="mar.property.situationProfessionnelleConjointAutre.label" /></h4>
      <dl>
        
          <dt><g:message code="mar.property.autreDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointAutre?.autreDepuisLe}"/></dd>
          

        
          <dt><g:message code="mar.property.precisionAutreSituationProfessionnelle.label" /></dt><dd>${rqt.situationProfessionnelleConjointAutre?.precisionAutreSituationProfessionnelle?.toString()}</dd>

        
      </dl>
      
    
  

  
    <h3><g:message code="mar.step.autreSituation.label" /></h3>
    
      
      <dl>
        <dt><g:message code="mar.property.situationParticuliere.label" /></dt>
          <dd>
            <g:if test="${rqt.situationParticuliere}">
              <g:capdematEnumToField var="${rqt.situationParticuliere}" i18nKeyPrefix="mar.property.situationParticuliere" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.precisionAutre.label" /></dt><dd>${rqt.precisionAutre?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.nomEtablissement.label" /></dt><dd>${rqt.nomEtablissement?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.domiciliationEtablissement.label" /></dt>
          <dd>
          <g:if test="${rqt.domiciliationEtablissement}">
              <p>${rqt.domiciliationEtablissement?.additionalDeliveryInformation}</p>
              <p>${rqt.domiciliationEtablissement?.additionalGeographicalInformation}</p>
              <p>${rqt.domiciliationEtablissement?.streetNumber} ${rqt.domiciliationEtablissement?.streetName}</p>
              <p>${rqt.domiciliationEtablissement?.placeNameOrService}</p>
              <p>${rqt.domiciliationEtablissement?.postalCode} ${rqt.domiciliationEtablissement?.city}</p>
              <p>${rqt.domiciliationEtablissement?.countryName}</p>
          </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.typeLogement.label" /></dt>
          <dd>
            <g:if test="${rqt.typeLogement}">
              <g:capdematEnumToField var="${rqt.typeLogement}" i18nKeyPrefix="mar.property.typeLogement" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.precisionLogementAutre.label" /></dt><dd>${rqt.precisionLogementAutre?.toString()}</dd>

      </dl>
      
    
  

  
    <h3><g:message code="mar.step.projetDeVie.label" /></h3>
    
      
      <dl>
        <dt><g:message code="mar.property.choixProjetDeVie.label" /></dt>
          <dd>
            <g:if test="${rqt.choixProjetDeVie}">
              <g:capdematEnumToField var="${rqt.choixProjetDeVie}" i18nKeyPrefix="mar.property.choixProjetDeVie" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.expressionProjetDeVie.label" /></dt><dd>${rqt.expressionProjetDeVie?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.conseilleProjetDeVie.label" /></dt><dd>${rqt.conseilleProjetDeVie?.toString()}</dd>

      </dl>
      
    
  

  
    <h3><g:message code="mar.step.demandeParcoursScolaireEtFormation.label" /></h3>
    
      
      <dl>
        <dt><g:message code="mar.property.demandeLibreScolaire.label" /></dt><dd>${rqt.demandeLibreScolaire?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.preferencesEtablissementOuService.label" /></dt>
          <dd><g:message code="message.${rqt.preferencesEtablissementOuService ? 'yes' : 'no'}" /></dd>
          

      </dl>
      
    
      
      <h4><g:message code="mar.property.precisionPreferencesEtablissementOuService.label" /></h4>
      <dl>
        
          <dt><g:message code="mar.property.nomPreferenceEtablissementOuService.label" /></dt><dd>${rqt.precisionPreferencesEtablissementOuService?.nomPreferenceEtablissementOuService?.toString()}</dd>

        
          <dt><g:message code="mar.property.codePostalPreferenceEtablissementOuService.label" /></dt><dd>${rqt.precisionPreferencesEtablissementOuService?.codePostalPreferenceEtablissementOuService?.toString()}</dd>

        
          <dt><g:message code="mar.property.communePreferenceEtablissementOuService.label" /></dt><dd>${rqt.precisionPreferencesEtablissementOuService?.communePreferenceEtablissementOuService?.toString()}</dd>

        
      </dl>
      
    
  

  
    <h3><g:message code="mar.step.demandeCartes.label" /></h3>
    
      
      <dl>
        <dt><g:message code="mar.property.carteInvalidite.label" /></dt>
          <dd><g:message code="message.${rqt.carteInvalidite ? 'yes' : 'no'}" /></dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.carteAccompagnement.label" /></dt>
          <dd><g:message code="message.${rqt.carteAccompagnement ? 'yes' : 'no'}" /></dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.carteStationnement.label" /></dt>
          <dd><g:message code="message.${rqt.carteStationnement ? 'yes' : 'no'}" /></dd>
          

      </dl>
      
    
  

  
    <h3><g:message code="mar.step.demandePrestationCompensation.label" /></h3>
    
      
      <dl>
        <dt><g:message code="mar.property.choixPrestationCompensation.label" /></dt>
          <dd>
            <g:if test="${rqt.choixPrestationCompensation}">
              <g:capdematEnumToField var="${rqt.choixPrestationCompensation}" i18nKeyPrefix="mar.property.choixPrestationCompensation" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.allocationPersonnaliseeAutonomie.label" /></dt>
          <dd><g:message code="message.${rqt.allocationPersonnaliseeAutonomie ? 'yes' : 'no'}" /></dd>
          

      </dl>
      
    
      
      <h4><g:message code="mar.property.besoinsDemandePCH.label" /></h4>
      <dl>
        
          <dt><g:message code="mar.property.aideHumaine.label" /></dt>
          <dd><g:message code="message.${rqt.besoinsDemandePCH?.aideHumaine ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="mar.property.precisionAideHumaine.label" /></dt><dd>${rqt.besoinsDemandePCH?.precisionAideHumaine?.toString()}</dd>

        
          <dt><g:message code="mar.property.aideTechnique.label" /></dt>
          <dd><g:message code="message.${rqt.besoinsDemandePCH?.aideTechnique ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="mar.property.precisionAideTechnique.label" /></dt><dd>${rqt.besoinsDemandePCH?.precisionAideTechnique?.toString()}</dd>

        
          <dt><g:message code="mar.property.amenagementLogementDemenagement.label" /></dt>
          <dd><g:message code="message.${rqt.besoinsDemandePCH?.amenagementLogementDemenagement ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="mar.property.precisionAmenagementLogementDemenagement.label" /></dt><dd>${rqt.besoinsDemandePCH?.precisionAmenagementLogementDemenagement?.toString()}</dd>

        
          <dt><g:message code="mar.property.amenagementVehicule.label" /></dt>
          <dd><g:message code="message.${rqt.besoinsDemandePCH?.amenagementVehicule ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="mar.property.precisionAmenagementVehicule.label" /></dt><dd>${rqt.besoinsDemandePCH?.precisionAmenagementVehicule?.toString()}</dd>

        
          <dt><g:message code="mar.property.chargesSpecifiques.label" /></dt>
          <dd><g:message code="message.${rqt.besoinsDemandePCH?.chargesSpecifiques ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="mar.property.precisionChargesSpecifiques.label" /></dt><dd>${rqt.besoinsDemandePCH?.precisionChargesSpecifiques?.toString()}</dd>

        
          <dt><g:message code="mar.property.aideAnimaliere.label" /></dt>
          <dd><g:message code="message.${rqt.besoinsDemandePCH?.aideAnimaliere ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="mar.property.precisionAideAnimaliere.label" /></dt><dd>${rqt.besoinsDemandePCH?.precisionAideAnimaliere?.toString()}</dd>

        
      </dl>
      
    
  

  
    <h3><g:message code="mar.step.affilitationAidant.label" /></h3>
    
      
      <dl>
        <dt><g:message code="mar.property.nomAidant.label" /></dt><dd>${rqt.nomAidant?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.domiciliationAidant.label" /></dt>
          <dd>
          <g:if test="${rqt.domiciliationAidant}">
              <p>${rqt.domiciliationAidant?.additionalDeliveryInformation}</p>
              <p>${rqt.domiciliationAidant?.additionalGeographicalInformation}</p>
              <p>${rqt.domiciliationAidant?.streetNumber} ${rqt.domiciliationAidant?.streetName}</p>
              <p>${rqt.domiciliationAidant?.placeNameOrService}</p>
              <p>${rqt.domiciliationAidant?.postalCode} ${rqt.domiciliationAidant?.city}</p>
              <p>${rqt.domiciliationAidant?.countryName}</p>
          </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.dateNaissanceAidant.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.dateNaissanceAidant}"/></dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.lienParenteAidant.label" /></dt><dd>${rqt.lienParenteAidant?.toString()}</dd>

      </dl>
      
    
  

  
    <h3><g:message code="mar.step.demandeAllocationEtComplementRessources.label" /></h3>
    
      
      <h4><g:message code="mar.property.choixTypeDemandeAllocEtCompl.label" /></h4>
      <dl>
        
          <dt><g:message code="mar.property.aah.label" /></dt>
          <dd><g:message code="message.${rqt.choixTypeDemandeAllocEtCompl?.aah ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="mar.property.complementRessources.label" /></dt>
          <dd><g:message code="message.${rqt.choixTypeDemandeAllocEtCompl?.complementRessources ? 'yes' : 'no'}" /></dd>
          

        
      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.precedentsRevenusRecus.label" /></dt>
          <dd>
            <g:if test="${rqt.precedentsRevenusRecus}">
              <g:capdematEnumToField var="${rqt.precedentsRevenusRecus}" i18nKeyPrefix="mar.property.precedentsRevenusRecus" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.dateDebutRevenuRecu.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.dateDebutRevenuRecu}"/></dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.dateFinRevenuRecu.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.dateFinRevenuRecu}"/></dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.precisionRevenuRecu.label" /></dt><dd>${rqt.precisionRevenuRecu?.toString()}</dd>

      </dl>
      
    
  

  
    <h3><g:message code="mar.step.demandeProfessionnelle.label" /></h3>
    
      
      <dl>
        <dt><g:message code="mar.property.rqth.label" /></dt>
          <dd><g:message code="message.${rqt.rqth ? 'yes' : 'no'}" /></dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.primeReclassement.label" /></dt>
          <dd><g:message code="message.${rqt.primeReclassement ? 'yes' : 'no'}" /></dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.autre.label" /></dt>
          <dd><g:message code="message.${rqt.autre ? 'yes' : 'no'}" /></dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.orientationReclassement.label" /></dt>
          <dd><g:message code="message.${rqt.orientationReclassement ? 'yes' : 'no'}" /></dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="mar.property.choixOrientationReclassement.label" /></dt>
          <dd>
            <g:if test="${rqt.choixOrientationReclassement}">
              <g:capdematEnumToField var="${rqt.choixOrientationReclassement}" i18nKeyPrefix="mar.property.choixOrientationReclassement" />
            </g:if>
          </dd>
          

      </dl>
      
    
  


