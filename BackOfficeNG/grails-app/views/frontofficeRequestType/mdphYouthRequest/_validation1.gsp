


  
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
      
    
  

  
    <h3><g:message code="myr.step.demandePrestationCompensation.label" /></h3>
    
      
      <dl>
        <dt><g:message code="myr.property.choixPrestationCompensation.label" /></dt>
          <dd>
            <g:if test="${rqt.choixPrestationCompensation}">
              <g:capdematEnumToField var="${rqt.choixPrestationCompensation}" i18nKeyPrefix="myr.property.choixPrestationCompensation" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="myr.property.allocationPersonnaliseeAutonomie.label" /></dt>
          <dd><g:message code="message.${rqt.allocationPersonnaliseeAutonomie ? 'yes' : 'no'}" /></dd>
          

      </dl>
      
    
      
      <h4><g:message code="myr.property.besoinsDemandePCH.label" /></h4>
      <dl>
        
          <dt><g:message code="myr.property.aideHumaine.label" /></dt>
          <dd><g:message code="message.${rqt.besoinsDemandePCH?.aideHumaine ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="myr.property.precisionAideHumaine.label" /></dt><dd>${rqt.besoinsDemandePCH?.precisionAideHumaine?.toString()}</dd>

        
          <dt><g:message code="myr.property.aideTechnique.label" /></dt>
          <dd><g:message code="message.${rqt.besoinsDemandePCH?.aideTechnique ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="myr.property.precisionAideTechnique.label" /></dt><dd>${rqt.besoinsDemandePCH?.precisionAideTechnique?.toString()}</dd>

        
          <dt><g:message code="myr.property.amenagementLogementDemenagement.label" /></dt>
          <dd><g:message code="message.${rqt.besoinsDemandePCH?.amenagementLogementDemenagement ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="myr.property.precisionAmenagementLogementDemenagement.label" /></dt><dd>${rqt.besoinsDemandePCH?.precisionAmenagementLogementDemenagement?.toString()}</dd>

        
          <dt><g:message code="myr.property.amenagementVehicule.label" /></dt>
          <dd><g:message code="message.${rqt.besoinsDemandePCH?.amenagementVehicule ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="myr.property.precisionAmenagementVehicule.label" /></dt><dd>${rqt.besoinsDemandePCH?.precisionAmenagementVehicule?.toString()}</dd>

        
          <dt><g:message code="myr.property.chargesSpecifiques.label" /></dt>
          <dd><g:message code="message.${rqt.besoinsDemandePCH?.chargesSpecifiques ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="myr.property.precisionChargesSpecifiques.label" /></dt><dd>${rqt.besoinsDemandePCH?.precisionChargesSpecifiques?.toString()}</dd>

        
          <dt><g:message code="myr.property.aideAnimaliere.label" /></dt>
          <dd><g:message code="message.${rqt.besoinsDemandePCH?.aideAnimaliere ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="myr.property.precisionAideAnimaliere.label" /></dt><dd>${rqt.besoinsDemandePCH?.precisionAideAnimaliere?.toString()}</dd>

        
      </dl>
      
    
  

  
  <g:if test="${!documentsByTypes.isEmpty()}">
    <h3>${message(code:'request.step.document.label')}</h3>
    <g:each in="${documentsByTypes}" var="documentType">
      <h4>${message(code:documentType.value.name)}</h4>
      <g:if test="${documentType.value.associated}">
      <dl class="document-linked">
        <g:each in="${documentType.value.associated}" var="document">
        <dt>
          <g:if test="${document.ecitizenNote}">${message(code:'document.header.description')} : ${document.ecitizenNote}<br/></g:if>
          <g:if test="${document.endValidityDate}">${message(code:'document.header.expireOn')} ${formatDate(date:document.endValidityDate,formatName:'format.date')}</g:if>
        </dt>
        <dd>
          <g:capdematEnumToFlag var="${document.state}" i18nKeyPrefix="document.state" />
          <a href="${createLink(controller:'frontofficeDocument',action:'details', id:document.id)}" target="blank" title="${message(code:'document.message.preview.longdesc')}">${message(code:'document.message.preview')}</a>
        </dd>
        </g:each>
      </dl>
      </g:if>
      <g:else>
        ${message(code:'document.header.noAttachments')}
      </g:else>
    </g:each>
  </g:if>
  

  


