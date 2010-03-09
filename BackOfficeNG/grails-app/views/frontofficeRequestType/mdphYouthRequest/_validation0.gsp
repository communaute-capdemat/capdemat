


  
    <h3><g:message code="myr.step.subject.label" /></h3>
    
      
      <dl>
        <dt><g:message code="myr.property.subject.label" /></dt>
          <dd>${subjects.get(rqt.subjectId)}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.faxSujet.label" /></dt><dd>${rqt.faxSujet?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.nationalite.label" /></dt>
          <dd>
            <g:if test="${rqt.nationalite}">
              <g:capdematEnumToField var="${rqt.nationalite}" i18nKeyPrefix="myr.property.nationalite" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.dateNaissanceSujet.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.dateNaissanceSujet}"/></dd>
          

      </dl>
      
    
      
      <h4><g:message code="myr.property.lieuNaissanceSujet.label" /></h4>
      <dl>
        
          <dt><g:message code="myr.property.postalCode.label" /></dt><dd>${rqt.lieuNaissanceSujet?.postalCode?.toString()}</dd>

        
          <dt><g:message code="myr.property.city.label" /></dt><dd>${rqt.lieuNaissanceSujet?.city?.toString()}</dd>

        
          <dt><g:message code="myr.property.country.label" /></dt>
          <dd>
            <g:if test="${rqt.lieuNaissanceSujet?.country}">
              <g:capdematEnumToField var="${rqt.lieuNaissanceSujet?.country}" i18nKeyPrefix="myr.property.country" />
            </g:if>
          </dd>
          

        
      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.dateArriveeFrance.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.dateArriveeFrance}"/></dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.numeroSecuriteSocialeSujet.label" /></dt><dd>${rqt.numeroSecuriteSocialeSujet?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.nomOrganismeSecuriteSociale.label" /></dt><dd>${rqt.nomOrganismeSecuriteSociale?.toString()}</dd>

      </dl>
      
    
      
      <h4><g:message code="myr.property.precedentDossierMdph.label" /></h4>
      <dl>
        
          <dt><g:message code="myr.property.numeroMdph.label" /></dt><dd>${rqt.precedentDossierMdph?.numeroMdph?.toString()}</dd>

        
          <dt><g:message code="myr.property.departementMdph.label" /></dt>
          <dd>
            <g:if test="${rqt.precedentDossierMdph?.departementMdph}">
              <g:capdematEnumToField var="${rqt.precedentDossierMdph?.departementMdph}" i18nKeyPrefix="myr.property.departementMdph" />
            </g:if>
          </dd>
          

        
      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.precisionSiDomicileAupresOrganisme.label" /></dt><dd>${rqt.precisionSiDomicileAupresOrganisme?.toString()}</dd>

      </dl>
      
    
  

  
    <h3><g:message code="myr.step.autoriteParentale.label" /></h3>
    
      
      <h4><g:message code="myr.property.autoriteParentaleMere.label" /></h4>
      <dl>
        
          <dt><g:message code="myr.property.nom.label" /></dt><dd>${rqt.autoriteParentaleMere?.nom?.toString()}</dd>

        
          <dt><g:message code="myr.property.prenom.label" /></dt><dd>${rqt.autoriteParentaleMere?.prenom?.toString()}</dd>

        
          <dt><g:message code="myr.property.domiciliation.label" /></dt>
          <dd>
          <g:if test="${rqt.autoriteParentaleMere?.domiciliation}">
              <p>${rqt.autoriteParentaleMere?.domiciliation?.additionalDeliveryInformation}</p>
              <p>${rqt.autoriteParentaleMere?.domiciliation?.additionalGeographicalInformation}</p>
              <p>${rqt.autoriteParentaleMere?.domiciliation?.streetNumber} ${rqt.autoriteParentaleMere?.domiciliation?.streetName}</p>
              <p>${rqt.autoriteParentaleMere?.domiciliation?.placeNameOrService}</p>
              <p>${rqt.autoriteParentaleMere?.domiciliation?.postalCode} ${rqt.autoriteParentaleMere?.domiciliation?.city}</p>
              <p>${rqt.autoriteParentaleMere?.domiciliation?.countryName}</p>
          </g:if>
          </dd>
          

        
          <dt><g:message code="myr.property.telephone.label" /></dt><dd>${rqt.autoriteParentaleMere?.telephone?.toString()}</dd>

        
          <dt><g:message code="myr.property.fax.label" /></dt><dd>${rqt.autoriteParentaleMere?.fax?.toString()}</dd>

        
          <dt><g:message code="myr.property.email.label" /></dt><dd>${rqt.autoriteParentaleMere?.email?.toString()}</dd>

        
      </dl>
      
    
      
      <h4><g:message code="myr.property.autoriteParentalePere.label" /></h4>
      <dl>
        
          <dt><g:message code="myr.property.nom.label" /></dt><dd>${rqt.autoriteParentalePere?.nom?.toString()}</dd>

        
          <dt><g:message code="myr.property.prenom.label" /></dt><dd>${rqt.autoriteParentalePere?.prenom?.toString()}</dd>

        
          <dt><g:message code="myr.property.domiciliation.label" /></dt>
          <dd>
          <g:if test="${rqt.autoriteParentalePere?.domiciliation}">
              <p>${rqt.autoriteParentalePere?.domiciliation?.additionalDeliveryInformation}</p>
              <p>${rqt.autoriteParentalePere?.domiciliation?.additionalGeographicalInformation}</p>
              <p>${rqt.autoriteParentalePere?.domiciliation?.streetNumber} ${rqt.autoriteParentalePere?.domiciliation?.streetName}</p>
              <p>${rqt.autoriteParentalePere?.domiciliation?.placeNameOrService}</p>
              <p>${rqt.autoriteParentalePere?.domiciliation?.postalCode} ${rqt.autoriteParentalePere?.domiciliation?.city}</p>
              <p>${rqt.autoriteParentalePere?.domiciliation?.countryName}</p>
          </g:if>
          </dd>
          

        
          <dt><g:message code="myr.property.telephone.label" /></dt><dd>${rqt.autoriteParentalePere?.telephone?.toString()}</dd>

        
          <dt><g:message code="myr.property.fax.label" /></dt><dd>${rqt.autoriteParentalePere?.fax?.toString()}</dd>

        
          <dt><g:message code="myr.property.email.label" /></dt><dd>${rqt.autoriteParentalePere?.email?.toString()}</dd>

        
      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.deteneurAutoriteParentale.label" /></dt>
          <dd>
            <g:if test="${rqt.deteneurAutoriteParentale}">
              <g:capdematEnumToField var="${rqt.deteneurAutoriteParentale}" i18nKeyPrefix="myr.property.deteneurAutoriteParentale" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <h4><g:message code="myr.property.informationAutreDeteneurAutoriteParentale.label" /></h4>
      <dl>
        
          <dt><g:message code="myr.property.nom.label" /></dt><dd>${rqt.informationAutreDeteneurAutoriteParentale?.nom?.toString()}</dd>

        
          <dt><g:message code="myr.property.domiciliation.label" /></dt>
          <dd>
          <g:if test="${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation}">
              <p>${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.additionalDeliveryInformation}</p>
              <p>${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.additionalGeographicalInformation}</p>
              <p>${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.streetNumber} ${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.streetName}</p>
              <p>${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.placeNameOrService}</p>
              <p>${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.postalCode} ${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.city}</p>
              <p>${rqt.informationAutreDeteneurAutoriteParentale?.domiciliation?.countryName}</p>
          </g:if>
          </dd>
          

        
          <dt><g:message code="myr.property.telephone.label" /></dt><dd>${rqt.informationAutreDeteneurAutoriteParentale?.telephone?.toString()}</dd>

        
          <dt><g:message code="myr.property.fax.label" /></dt><dd>${rqt.informationAutreDeteneurAutoriteParentale?.fax?.toString()}</dd>

        
          <dt><g:message code="myr.property.email.label" /></dt><dd>${rqt.informationAutreDeteneurAutoriteParentale?.email?.toString()}</dd>

        
      </dl>
      
    
  

  
    <h3><g:message code="myr.step.organismePrestationFamiliale.label" /></h3>
    
      
      <dl>
        <dt><g:message code="myr.property.numeroAllocataire.label" /></dt><dd>${rqt.numeroAllocataire?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.organismePayeur.label" /></dt>
          <dd>
            <g:if test="${rqt.organismePayeur}">
              <g:capdematEnumToField var="${rqt.organismePayeur}" i18nKeyPrefix="myr.property.organismePayeur" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.nomAllocataire.label" /></dt><dd>${rqt.nomAllocataire?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.prenomAllocataire.label" /></dt><dd>${rqt.prenomAllocataire?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.nomOrganismePayeur.label" /></dt><dd>${rqt.nomOrganismePayeur?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.domiciliationOrganismePayeur.label" /></dt>
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
      
    
  

  
    <h3><g:message code="myr.step.situationFamiliale.label" /></h3>
    
      
      <dl>
        <dt><g:message code="myr.property.situationMaritale.label" /></dt>
          <dd>
            <g:if test="${rqt.situationMaritale}">
              <g:capdematEnumToField var="${rqt.situationMaritale}" i18nKeyPrefix="myr.property.situationMaritale" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.dateSituationFamiliale.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.dateSituationFamiliale}"/></dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.nombreEnfantsACharge.label" /></dt><dd>${rqt.nombreEnfantsACharge?.toString()}</dd>

      </dl>
      
    
      
      <h4><g:message code="myr.property.identiteConjoint.label" /></h4>
      <dl>
        
          <dt><g:message code="myr.property.nomNaissanceConjoint.label" /></dt><dd>${rqt.identiteConjoint?.nomNaissanceConjoint?.toString()}</dd>

        
          <dt><g:message code="myr.property.prenomConjoint.label" /></dt><dd>${rqt.identiteConjoint?.prenomConjoint?.toString()}</dd>

        
          <dt><g:message code="myr.property.dateNaissanceConjoint.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.identiteConjoint?.dateNaissanceConjoint}"/></dd>
          

        
      </dl>
      
    
  

  
    <h3><g:message code="myr.step.situationProfessionnelle.label" /></h3>
    
      
      <dl>
        <dt><g:message code="myr.property.situationProfessionnelleVous.label" /></dt>
          <dd>
            <g:if test="${rqt.situationProfessionnelleVous}">
              <g:capdematEnumToField var="${rqt.situationProfessionnelleVous}" i18nKeyPrefix="myr.property.situationProfessionnelleVous" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <h4><g:message code="myr.property.situationProfessionnelleVousSalarie.label" /></h4>
      <dl>
        
          <dt><g:message code="myr.property.salarieDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousSalarie?.salarieDepuisLe}"/></dd>
          

        
          <dt><g:message code="myr.property.typeContrat.label" /></dt><dd>${rqt.situationProfessionnelleVousSalarie?.typeContrat?.toString()}</dd>

        
          <dt><g:message code="myr.property.salarieDateDebutContrat.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousSalarie?.salarieDateDebutContrat}"/></dd>
          

        
          <dt><g:message code="myr.property.salarieDateFinContrat.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousSalarie?.salarieDateFinContrat}"/></dd>
          

        
          <dt><g:message code="myr.property.esatDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousSalarie?.esatDepuisLe}"/></dd>
          

        
      </dl>
      
    
      
      <h4><g:message code="myr.property.situationProfessionnelleVousStagiaire.label" /></h4>
      <dl>
        
          <dt><g:message code="myr.property.stagiaireDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousStagiaire?.stagiaireDepuisLe}"/></dd>
          

        
          <dt><g:message code="myr.property.stageRenumeration.label" /></dt>
          <dd><g:message code="message.${rqt.situationProfessionnelleVousStagiaire?.stageRenumeration ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="myr.property.nomEmployeurStage.label" /></dt><dd>${rqt.situationProfessionnelleVousStagiaire?.nomEmployeurStage?.toString()}</dd>

        
          <dt><g:message code="myr.property.adresseEmployeurStage.label" /></dt>
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
          

        
          <dt><g:message code="myr.property.telephoneEmployeurStage.label" /></dt><dd>${rqt.situationProfessionnelleVousStagiaire?.telephoneEmployeurStage?.toString()}</dd>

        
      </dl>
      
    
      
      <h4><g:message code="myr.property.situationProfessionnelleVousNonSalarie.label" /></h4>
      <dl>
        
          <dt><g:message code="myr.property.nonSalarieDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousNonSalarie?.nonSalarieDepuisLe}"/></dd>
          

        
          <dt><g:message code="myr.property.regimeCotisations.label" /></dt><dd>${rqt.situationProfessionnelleVousNonSalarie?.regimeCotisations?.toString()}</dd>

        
      </dl>
      
    
      
      <h4><g:message code="myr.property.situationProfessionnelleVousDemandeurEmploi.label" /></h4>
      <dl>
        
          <dt><g:message code="myr.property.demandeurEmploiDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousDemandeurEmploi?.demandeurEmploiDepuisLe}"/></dd>
          

        
          <dt><g:message code="myr.property.indemnisationDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousDemandeurEmploi?.indemnisationDepuisLe}"/></dd>
          

        
          <dt><g:message code="myr.property.allocationSolidariteSpecifique.label" /></dt>
          <dd><g:message code="message.${rqt.situationProfessionnelleVousDemandeurEmploi?.allocationSolidariteSpecifique ? 'yes' : 'no'}" /></dd>
          

        
      </dl>
      
    
      
      <h4><g:message code="myr.property.situationProfessionnelleVousRetraite.label" /></h4>
      <dl>
        
          <dt><g:message code="myr.property.retraiteDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousRetraite?.retraiteDepuisLe}"/></dd>
          

        
          <dt><g:message code="myr.property.supplementairePersonneAgee.label" /></dt>
          <dd><g:message code="message.${rqt.situationProfessionnelleVousRetraite?.supplementairePersonneAgee ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="myr.property.pensionRetraite.label" /></dt>
          <dd><g:message code="message.${rqt.situationProfessionnelleVousRetraite?.pensionRetraite ? 'yes' : 'no'}" /></dd>
          

        
      </dl>
      
    
      
      <h4><g:message code="myr.property.situationProfessionnelleVousBeneficiairePension.label" /></h4>
      <dl>
        
          <dt><g:message code="myr.property.beneficiairePensionDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousBeneficiairePension?.beneficiairePensionDepuisLe}"/></dd>
          

        
          <dt><g:message code="myr.property.categoriePensionInvalidite.label" /></dt>
          <dd>
            <g:if test="${rqt.situationProfessionnelleVousBeneficiairePension?.categoriePensionInvalidite}">
              <g:capdematEnumToField var="${rqt.situationProfessionnelleVousBeneficiairePension?.categoriePensionInvalidite}" i18nKeyPrefix="myr.property.categoriePensionInvalidite" />
            </g:if>
          </dd>
          

        
          <dt><g:message code="myr.property.renteAccidentTravail.label" /></dt>
          <dd><g:message code="message.${rqt.situationProfessionnelleVousBeneficiairePension?.renteAccidentTravail ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="myr.property.allocationSupplementaireInvalidite.label" /></dt>
          <dd><g:message code="message.${rqt.situationProfessionnelleVousBeneficiairePension?.allocationSupplementaireInvalidite ? 'yes' : 'no'}" /></dd>
          

        
      </dl>
      
    
      
      <h4><g:message code="myr.property.situationProfessionnelleVousAutre.label" /></h4>
      <dl>
        
          <dt><g:message code="myr.property.autreDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleVousAutre?.autreDepuisLe}"/></dd>
          

        
          <dt><g:message code="myr.property.precisionAutreSituationProfessionnelle.label" /></dt><dd>${rqt.situationProfessionnelleVousAutre?.precisionAutreSituationProfessionnelle?.toString()}</dd>

        
      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.situationProfessionnelleConjoint.label" /></dt>
          <dd>
            <g:if test="${rqt.situationProfessionnelleConjoint}">
              <g:capdematEnumToField var="${rqt.situationProfessionnelleConjoint}" i18nKeyPrefix="myr.property.situationProfessionnelleConjoint" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <h4><g:message code="myr.property.situationProfessionnelleConjointSalarie.label" /></h4>
      <dl>
        
          <dt><g:message code="myr.property.salarieDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointSalarie?.salarieDepuisLe}"/></dd>
          

        
          <dt><g:message code="myr.property.typeContrat.label" /></dt><dd>${rqt.situationProfessionnelleConjointSalarie?.typeContrat?.toString()}</dd>

        
          <dt><g:message code="myr.property.salarieDateDebutContrat.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointSalarie?.salarieDateDebutContrat}"/></dd>
          

        
          <dt><g:message code="myr.property.salarieDateFinContrat.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointSalarie?.salarieDateFinContrat}"/></dd>
          

        
          <dt><g:message code="myr.property.esatDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointSalarie?.esatDepuisLe}"/></dd>
          

        
      </dl>
      
    
      
      <h4><g:message code="myr.property.situationProfessionnelleConjointStagiaire.label" /></h4>
      <dl>
        
          <dt><g:message code="myr.property.stagiaireDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointStagiaire?.stagiaireDepuisLe}"/></dd>
          

        
          <dt><g:message code="myr.property.stageRenumeration.label" /></dt>
          <dd><g:message code="message.${rqt.situationProfessionnelleConjointStagiaire?.stageRenumeration ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="myr.property.nomEmployeurStage.label" /></dt><dd>${rqt.situationProfessionnelleConjointStagiaire?.nomEmployeurStage?.toString()}</dd>

        
          <dt><g:message code="myr.property.adresseEmployeurStage.label" /></dt>
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
          

        
          <dt><g:message code="myr.property.telephoneEmployeurStage.label" /></dt><dd>${rqt.situationProfessionnelleConjointStagiaire?.telephoneEmployeurStage?.toString()}</dd>

        
      </dl>
      
    
      
      <h4><g:message code="myr.property.situationProfessionnelleConjointNonSalarie.label" /></h4>
      <dl>
        
          <dt><g:message code="myr.property.nonSalarieDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointNonSalarie?.nonSalarieDepuisLe}"/></dd>
          

        
          <dt><g:message code="myr.property.regimeCotisations.label" /></dt><dd>${rqt.situationProfessionnelleConjointNonSalarie?.regimeCotisations?.toString()}</dd>

        
      </dl>
      
    
      
      <h4><g:message code="myr.property.situationProfessionnelleConjointDemandeurEmploi.label" /></h4>
      <dl>
        
          <dt><g:message code="myr.property.demandeurEmploiDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointDemandeurEmploi?.demandeurEmploiDepuisLe}"/></dd>
          

        
          <dt><g:message code="myr.property.indemnisationDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointDemandeurEmploi?.indemnisationDepuisLe}"/></dd>
          

        
          <dt><g:message code="myr.property.allocationSolidariteSpecifique.label" /></dt>
          <dd><g:message code="message.${rqt.situationProfessionnelleConjointDemandeurEmploi?.allocationSolidariteSpecifique ? 'yes' : 'no'}" /></dd>
          

        
      </dl>
      
    
      
      <h4><g:message code="myr.property.situationProfessionnelleConjointRetraite.label" /></h4>
      <dl>
        
          <dt><g:message code="myr.property.retraiteDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointRetraite?.retraiteDepuisLe}"/></dd>
          

        
          <dt><g:message code="myr.property.supplementairePersonneAgee.label" /></dt>
          <dd><g:message code="message.${rqt.situationProfessionnelleConjointRetraite?.supplementairePersonneAgee ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="myr.property.pensionRetraite.label" /></dt>
          <dd><g:message code="message.${rqt.situationProfessionnelleConjointRetraite?.pensionRetraite ? 'yes' : 'no'}" /></dd>
          

        
      </dl>
      
    
      
      <h4><g:message code="myr.property.situationProfessionnelleConjointBeneficiairePension.label" /></h4>
      <dl>
        
          <dt><g:message code="myr.property.beneficiairePensionDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointBeneficiairePension?.beneficiairePensionDepuisLe}"/></dd>
          

        
          <dt><g:message code="myr.property.categoriePensionInvalidite.label" /></dt>
          <dd>
            <g:if test="${rqt.situationProfessionnelleConjointBeneficiairePension?.categoriePensionInvalidite}">
              <g:capdematEnumToField var="${rqt.situationProfessionnelleConjointBeneficiairePension?.categoriePensionInvalidite}" i18nKeyPrefix="myr.property.categoriePensionInvalidite" />
            </g:if>
          </dd>
          

        
          <dt><g:message code="myr.property.renteAccidentTravail.label" /></dt>
          <dd><g:message code="message.${rqt.situationProfessionnelleConjointBeneficiairePension?.renteAccidentTravail ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="myr.property.allocationSupplementaireInvalidite.label" /></dt>
          <dd><g:message code="message.${rqt.situationProfessionnelleConjointBeneficiairePension?.allocationSupplementaireInvalidite ? 'yes' : 'no'}" /></dd>
          

        
      </dl>
      
    
      
      <h4><g:message code="myr.property.situationProfessionnelleConjointAutre.label" /></h4>
      <dl>
        
          <dt><g:message code="myr.property.autreDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.situationProfessionnelleConjointAutre?.autreDepuisLe}"/></dd>
          

        
          <dt><g:message code="myr.property.precisionAutreSituationProfessionnelle.label" /></dt><dd>${rqt.situationProfessionnelleConjointAutre?.precisionAutreSituationProfessionnelle?.toString()}</dd>

        
      </dl>
      
    
  

  
    <h3><g:message code="myr.step.autreSituation.label" /></h3>
    
      
      <dl>
        <dt><g:message code="myr.property.situationParticuliere.label" /></dt>
          <dd>
            <g:if test="${rqt.situationParticuliere}">
              <g:capdematEnumToField var="${rqt.situationParticuliere}" i18nKeyPrefix="myr.property.situationParticuliere" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.precisionAutre.label" /></dt><dd>${rqt.precisionAutre?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.nomEtablissement.label" /></dt><dd>${rqt.nomEtablissement?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.domiciliationEtablissement.label" /></dt>
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
        <dt><g:message code="myr.property.typeLogement.label" /></dt>
          <dd>
            <g:if test="${rqt.typeLogement}">
              <g:capdematEnumToField var="${rqt.typeLogement}" i18nKeyPrefix="myr.property.typeLogement" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.precisionLogementAutre.label" /></dt><dd>${rqt.precisionLogementAutre?.toString()}</dd>

      </dl>
      
    
  

  
    <h3><g:message code="myr.step.projetDeVie.label" /></h3>
    
      
      <dl>
        <dt><g:message code="myr.property.choixProjetDeVie.label" /></dt>
          <dd>
            <g:if test="${rqt.choixProjetDeVie}">
              <g:capdematEnumToField var="${rqt.choixProjetDeVie}" i18nKeyPrefix="myr.property.choixProjetDeVie" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.expressionProjetDeVie.label" /></dt><dd>${rqt.expressionProjetDeVie?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.conseilleProjetDeVie.label" /></dt><dd>${rqt.conseilleProjetDeVie?.toString()}</dd>

      </dl>
      
    
  

  
    <h3><g:message code="myr.step.allocationEducationEnfantHandicape.label" /></h3>
    
      
      <dl>
        <dt><g:message code="myr.property.enfantEnInternat.label" /></dt>
          <dd><g:message code="message.${rqt.enfantEnInternat ? 'yes' : 'no'}" /></dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.enInternatDepuisLe.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.enInternatDepuisLe}"/></dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.fraisSejourPrisEnCharge.label" /></dt>
          <dd><g:message code="message.${rqt.fraisSejourPrisEnCharge ? 'yes' : 'no'}" /></dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.typeAccueil.label" /></dt><dd>${rqt.typeAccueil?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.typeScolarisation.label" /></dt><dd>${rqt.typeScolarisation?.toString()}</dd>

      </dl>
      
    
      
      <h4><g:message code="myr.property.presencePersonneAupresEnfant.label" /></h4>
      <dl>
        
          <dt><g:message code="myr.property.exerciceActiviteProfessionnelle.label" /></dt>
          <dd><g:message code="message.${rqt.presencePersonneAupresEnfant?.exerciceActiviteProfessionnelle ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="myr.property.recoursEmploiRemunereTiercePersonne.label" /></dt><dd>${rqt.presencePersonneAupresEnfant?.recoursEmploiRemunereTiercePersonne?.toString()}</dd>

        
          <dt><g:message code="myr.property.nbHeureParAnEmploiNonRegulier.label" /></dt><dd>${rqt.presencePersonneAupresEnfant?.nbHeureParAnEmploiNonRegulier?.toString()}</dd>

        
      </dl>
      
    
      
      <h4><g:message code="myr.property.fraisSuppLiesHandicap.label" /></h4>
      <g:each var="it" in="${rqt.fraisSuppLiesHandicap}" status="index">
      <dl>
        
          <dt><g:message code="myr.property.natureFrais.label" /></dt><dd>${it.natureFrais?.toString()}</dd>

        
          <dt><g:message code="myr.property.financeursSollicites.label" /></dt><dd>${it.financeursSollicites?.toString()}</dd>

        
          <dt><g:message code="myr.property.montantsObtenus.label" /></dt><dd>${it.montantsObtenus?.toString()}</dd>

        
          <dt><g:message code="myr.property.resteAVotreCharge.label" /></dt><dd>${it.resteAVotreCharge?.toString()}</dd>

        
          <dt><g:message code="myr.property.periodicite.label" /></dt>
          <dd>
            <g:if test="${it.periodicite}">
              <g:capdematEnumToField var="${it.periodicite}" i18nKeyPrefix="myr.property.periodicite" />
            </g:if>
          </dd>
          

        
      </dl>
      </g:each>
      
    
  

  
    <h3><g:message code="myr.step.demandeParcoursScolaireEtFormation.label" /></h3>
    
      
      <dl>
        <dt><g:message code="myr.property.demandeLibreScolaire.label" /></dt><dd>${rqt.demandeLibreScolaire?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.preferencesEtablissementOuService.label" /></dt>
          <dd><g:message code="message.${rqt.preferencesEtablissementOuService ? 'yes' : 'no'}" /></dd>
          

      </dl>
      
    
      
      <h4><g:message code="myr.property.precisionPreferencesEtablissementOuService.label" /></h4>
      <dl>
        
          <dt><g:message code="myr.property.nomPreferenceEtablissementOuService.label" /></dt><dd>${rqt.precisionPreferencesEtablissementOuService?.nomPreferenceEtablissementOuService?.toString()}</dd>

        
          <dt><g:message code="myr.property.codePostalPreferenceEtablissementOuService.label" /></dt><dd>${rqt.precisionPreferencesEtablissementOuService?.codePostalPreferenceEtablissementOuService?.toString()}</dd>

        
          <dt><g:message code="myr.property.communePreferenceEtablissementOuService.label" /></dt><dd>${rqt.precisionPreferencesEtablissementOuService?.communePreferenceEtablissementOuService?.toString()}</dd>

        
      </dl>
      
    
  

  
    <h3><g:message code="myr.step.demandeCartes.label" /></h3>
    
      
      <dl>
        <dt><g:message code="myr.property.carteInvalidite.label" /></dt>
          <dd><g:message code="message.${rqt.carteInvalidite ? 'yes' : 'no'}" /></dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.carteAccompagnement.label" /></dt>
          <dd><g:message code="message.${rqt.carteAccompagnement ? 'yes' : 'no'}" /></dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.carteStationnement.label" /></dt>
          <dd><g:message code="message.${rqt.carteStationnement ? 'yes' : 'no'}" /></dd>
          

      </dl>
      
    
  


