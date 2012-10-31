


  
    <h3><g:message code="dccrr.step.subject.label" /></h3>
    
      
      <dl>
        <dt><g:message code="dccrr.property.subject.label" /></dt>
          <dd>${subjects.get(rqt.subjectId)}</dd>

      </dl>
      
    
      
      <h4><g:message code="dccrr.property.informationMere.label" /></h4>
      <dl>
        
          <dt><g:message code="dccrr.property.situationActuelleMere.label" /></dt>
          <dd>
            <g:if test="${rqt.informationMere?.situationActuelleMere}">
              <g:capdematEnumToField var="${rqt.informationMere?.situationActuelleMere}" i18nKeyPrefix="dccrr.property.situationActuelleMere" />
            </g:if>
          </dd>
          

        
          <dt><g:message code="dccrr.property.precisionAutreSituationActuelleMere.label" /></dt><dd>${rqt.informationMere?.precisionAutreSituationActuelleMere?.toString()}</dd>

        
          <dt><g:message code="dccrr.property.professionMere.label" /></dt><dd>${rqt.informationMere?.professionMere?.toString()}</dd>

        
          <dt><g:message code="dccrr.property.estHorairesReguliersMere.label" /></dt>
          <dd><g:message code="message.${rqt.informationMere?.estHorairesReguliersMere ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="dccrr.property.horairesReguliersMere.label" /></dt><dd>${rqt.informationMere?.horairesReguliersMere?.toString()}</dd>

        
          <dt><g:message code="dccrr.property.horairesTravailLundiMere.label" /></dt><dd>${rqt.informationMere?.horairesTravailLundiMere?.toString()}</dd>

        
          <dt><g:message code="dccrr.property.horairesTravailMardiMere.label" /></dt><dd>${rqt.informationMere?.horairesTravailMardiMere?.toString()}</dd>

        
          <dt><g:message code="dccrr.property.horairesTravailMercrediMere.label" /></dt><dd>${rqt.informationMere?.horairesTravailMercrediMere?.toString()}</dd>

        
          <dt><g:message code="dccrr.property.horairesTravailJeudiMere.label" /></dt><dd>${rqt.informationMere?.horairesTravailJeudiMere?.toString()}</dd>

        
          <dt><g:message code="dccrr.property.horairesTravailVendrediMere.label" /></dt><dd>${rqt.informationMere?.horairesTravailVendrediMere?.toString()}</dd>

        
          <dt><g:message code="dccrr.property.communeLieuTravailMere.label" /></dt><dd>${rqt.informationMere?.communeLieuTravailMere?.toString()}</dd>

        
      </dl>
      
    
      
      <h4><g:message code="dccrr.property.informationPere.label" /></h4>
      <dl>
        
          <dt><g:message code="dccrr.property.situationActuellePere.label" /></dt>
          <dd>
            <g:if test="${rqt.informationPere?.situationActuellePere}">
              <g:capdematEnumToField var="${rqt.informationPere?.situationActuellePere}" i18nKeyPrefix="dccrr.property.situationActuellePere" />
            </g:if>
          </dd>
          

        
          <dt><g:message code="dccrr.property.precisionAutreSituationActuellePere.label" /></dt><dd>${rqt.informationPere?.precisionAutreSituationActuellePere?.toString()}</dd>

        
          <dt><g:message code="dccrr.property.professionPere.label" /></dt><dd>${rqt.informationPere?.professionPere?.toString()}</dd>

        
          <dt><g:message code="dccrr.property.estHorairesReguliersPere.label" /></dt>
          <dd><g:message code="message.${rqt.informationPere?.estHorairesReguliersPere ? 'yes' : 'no'}" /></dd>
          

        
          <dt><g:message code="dccrr.property.horairesReguliersPere.label" /></dt><dd>${rqt.informationPere?.horairesReguliersPere?.toString()}</dd>

        
          <dt><g:message code="dccrr.property.horairesTravailLundiPere.label" /></dt><dd>${rqt.informationPere?.horairesTravailLundiPere?.toString()}</dd>

        
          <dt><g:message code="dccrr.property.horairesTravailMardiPere.label" /></dt><dd>${rqt.informationPere?.horairesTravailMardiPere?.toString()}</dd>

        
          <dt><g:message code="dccrr.property.horairesTravailMercrediPere.label" /></dt><dd>${rqt.informationPere?.horairesTravailMercrediPere?.toString()}</dd>

        
          <dt><g:message code="dccrr.property.horairesTravailJeudiPere.label" /></dt><dd>${rqt.informationPere?.horairesTravailJeudiPere?.toString()}</dd>

        
          <dt><g:message code="dccrr.property.horairesTravailVendrediPere.label" /></dt><dd>${rqt.informationPere?.horairesTravailVendrediPere?.toString()}</dd>

        
          <dt><g:message code="dccrr.property.communeLieuTravailPere.label" /></dt><dd>${rqt.informationPere?.communeLieuTravailPere?.toString()}</dd>

        
      </dl>
      
    
  

  
    <h3><g:message code="dccrr.step.accueil.label" /></h3>
    
      
      <dl>
        <dt><g:message code="dccrr.property.modeAccueil.label" /></dt>
          <dd><g:message code="message.${rqt.modeAccueil ? 'yes' : 'no'}" /></dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="dccrr.property.modeAccueilChoixUn.label" /></dt>
          <dd>
            <g:if test="${rqt.modeAccueilChoixUn}">
              <g:capdematEnumToField var="${rqt.modeAccueilChoixUn}" i18nKeyPrefix="dccrr.property.modeAccueilChoixUn" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="dccrr.property.modeAccueilChoixDeux.label" /></dt>
          <dd>
            <g:if test="${rqt.modeAccueilChoixDeux}">
              <g:capdematEnumToField var="${rqt.modeAccueilChoixDeux}" i18nKeyPrefix="dccrr.property.modeAccueilChoixDeux" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="dccrr.property.accueilAnterieur.label" /></dt><dd>${rqt.accueilAnterieur?.toString()}</dd>

      </dl>
      
    
      
      <h4><g:message code="dccrr.property.datePlacementAccueilRegulier.label" /></h4>
      <dl>
        
          <dt><g:message code="dccrr.property.choixTypeDatePlacementAccueilRegulier.label" /></dt>
          <dd>
            <g:if test="${rqt.datePlacementAccueilRegulier?.choixTypeDatePlacementAccueilRegulier}">
              <g:capdematEnumToField var="${rqt.datePlacementAccueilRegulier?.choixTypeDatePlacementAccueilRegulier}" i18nKeyPrefix="dccrr.property.choixTypeDatePlacementAccueilRegulier" />
            </g:if>
          </dd>
          

        
          <dt><g:message code="dccrr.property.datePlacementDebut.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.datePlacementAccueilRegulier?.datePlacementDebut}"/></dd>
          

        
      </dl>
      
    
      
      <dl>
        <dt><g:message code="dccrr.property.choixHorairesAccueil.label" /></dt>
          <dd>
            <g:if test="${rqt.choixHorairesAccueil}">
              <g:capdematEnumToField var="${rqt.choixHorairesAccueil}" i18nKeyPrefix="dccrr.property.choixHorairesAccueil" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <h4><g:message code="dccrr.property.plageHoraireAccueilReguliere.label" /></h4>
      <dl>
        
          <dt><g:message code="dccrr.property.horairePlacementMatinDebut.label" /></dt>
          <dd>
            ${rqt.plageHoraireAccueilReguliere?.horairePlacementMatinDebut?.getHourOfDay()} : 
            <g:if test="${rqt.plageHoraireAccueilReguliere?.horairePlacementMatinDebut && rqt.plageHoraireAccueilReguliere?.horairePlacementMatinDebut.getMinuteOfHour() < 10}">
            0</g:if>${rqt.plageHoraireAccueilReguliere?.horairePlacementMatinDebut?.getMinuteOfHour()}
          </dd>
          

        
          <dt><g:message code="dccrr.property.horairePlacementMatinFin.label" /></dt>
          <dd>
            ${rqt.plageHoraireAccueilReguliere?.horairePlacementMatinFin?.getHourOfDay()} : 
            <g:if test="${rqt.plageHoraireAccueilReguliere?.horairePlacementMatinFin && rqt.plageHoraireAccueilReguliere?.horairePlacementMatinFin.getMinuteOfHour() < 10}">
            0</g:if>${rqt.plageHoraireAccueilReguliere?.horairePlacementMatinFin?.getMinuteOfHour()}
          </dd>
          

        
          <dt><g:message code="dccrr.property.horairePlacementApresMidiDebut.label" /></dt>
          <dd>
            ${rqt.plageHoraireAccueilReguliere?.horairePlacementApresMidiDebut?.getHourOfDay()} : 
            <g:if test="${rqt.plageHoraireAccueilReguliere?.horairePlacementApresMidiDebut && rqt.plageHoraireAccueilReguliere?.horairePlacementApresMidiDebut.getMinuteOfHour() < 10}">
            0</g:if>${rqt.plageHoraireAccueilReguliere?.horairePlacementApresMidiDebut?.getMinuteOfHour()}
          </dd>
          

        
          <dt><g:message code="dccrr.property.horairePlacementApresMidiFin.label" /></dt>
          <dd>
            ${rqt.plageHoraireAccueilReguliere?.horairePlacementApresMidiFin?.getHourOfDay()} : 
            <g:if test="${rqt.plageHoraireAccueilReguliere?.horairePlacementApresMidiFin && rqt.plageHoraireAccueilReguliere?.horairePlacementApresMidiFin.getMinuteOfHour() < 10}">
            0</g:if>${rqt.plageHoraireAccueilReguliere?.horairePlacementApresMidiFin?.getMinuteOfHour()}
          </dd>
          

        
      </dl>
      
    
      
      <h4><g:message code="dccrr.property.lundi.label" /></h4>
      <dl>
        
          <dt><g:message code="dccrr.property.horairePlacementMatinDebutLundi.label" /></dt>
          <dd>
            ${rqt.lundi?.horairePlacementMatinDebutLundi?.getHourOfDay()} : 
            <g:if test="${rqt.lundi?.horairePlacementMatinDebutLundi && rqt.lundi?.horairePlacementMatinDebutLundi.getMinuteOfHour() < 10}">
            0</g:if>${rqt.lundi?.horairePlacementMatinDebutLundi?.getMinuteOfHour()}
          </dd>
          

        
          <dt><g:message code="dccrr.property.horairePlacementMatinFinLundi.label" /></dt>
          <dd>
            ${rqt.lundi?.horairePlacementMatinFinLundi?.getHourOfDay()} : 
            <g:if test="${rqt.lundi?.horairePlacementMatinFinLundi && rqt.lundi?.horairePlacementMatinFinLundi.getMinuteOfHour() < 10}">
            0</g:if>${rqt.lundi?.horairePlacementMatinFinLundi?.getMinuteOfHour()}
          </dd>
          

        
          <dt><g:message code="dccrr.property.horairePlacementApresMidiDebutLundi.label" /></dt>
          <dd>
            ${rqt.lundi?.horairePlacementApresMidiDebutLundi?.getHourOfDay()} : 
            <g:if test="${rqt.lundi?.horairePlacementApresMidiDebutLundi && rqt.lundi?.horairePlacementApresMidiDebutLundi.getMinuteOfHour() < 10}">
            0</g:if>${rqt.lundi?.horairePlacementApresMidiDebutLundi?.getMinuteOfHour()}
          </dd>
          

        
          <dt><g:message code="dccrr.property.horairePlacementApresMidiFinLundi.label" /></dt>
          <dd>
            ${rqt.lundi?.horairePlacementApresMidiFinLundi?.getHourOfDay()} : 
            <g:if test="${rqt.lundi?.horairePlacementApresMidiFinLundi && rqt.lundi?.horairePlacementApresMidiFinLundi.getMinuteOfHour() < 10}">
            0</g:if>${rqt.lundi?.horairePlacementApresMidiFinLundi?.getMinuteOfHour()}
          </dd>
          

        
      </dl>
      
    
      
      <h4><g:message code="dccrr.property.mardi.label" /></h4>
      <dl>
        
          <dt><g:message code="dccrr.property.horairePlacementMatinDebutMardi.label" /></dt>
          <dd>
            ${rqt.mardi?.horairePlacementMatinDebutMardi?.getHourOfDay()} : 
            <g:if test="${rqt.mardi?.horairePlacementMatinDebutMardi && rqt.mardi?.horairePlacementMatinDebutMardi.getMinuteOfHour() < 10}">
            0</g:if>${rqt.mardi?.horairePlacementMatinDebutMardi?.getMinuteOfHour()}
          </dd>
          

        
          <dt><g:message code="dccrr.property.horairePlacementMatinFinMardi.label" /></dt>
          <dd>
            ${rqt.mardi?.horairePlacementMatinFinMardi?.getHourOfDay()} : 
            <g:if test="${rqt.mardi?.horairePlacementMatinFinMardi && rqt.mardi?.horairePlacementMatinFinMardi.getMinuteOfHour() < 10}">
            0</g:if>${rqt.mardi?.horairePlacementMatinFinMardi?.getMinuteOfHour()}
          </dd>
          

        
          <dt><g:message code="dccrr.property.horairePlacementApresMidiDebutMardi.label" /></dt>
          <dd>
            ${rqt.mardi?.horairePlacementApresMidiDebutMardi?.getHourOfDay()} : 
            <g:if test="${rqt.mardi?.horairePlacementApresMidiDebutMardi && rqt.mardi?.horairePlacementApresMidiDebutMardi.getMinuteOfHour() < 10}">
            0</g:if>${rqt.mardi?.horairePlacementApresMidiDebutMardi?.getMinuteOfHour()}
          </dd>
          

        
          <dt><g:message code="dccrr.property.horairePlacementApresMidiFinMardi.label" /></dt>
          <dd>
            ${rqt.mardi?.horairePlacementApresMidiFinMardi?.getHourOfDay()} : 
            <g:if test="${rqt.mardi?.horairePlacementApresMidiFinMardi && rqt.mardi?.horairePlacementApresMidiFinMardi.getMinuteOfHour() < 10}">
            0</g:if>${rqt.mardi?.horairePlacementApresMidiFinMardi?.getMinuteOfHour()}
          </dd>
          

        
      </dl>
      
    
      
      <h4><g:message code="dccrr.property.mercredi.label" /></h4>
      <dl>
        
          <dt><g:message code="dccrr.property.horairePlacementMatinDebutMercredi.label" /></dt>
          <dd>
            ${rqt.mercredi?.horairePlacementMatinDebutMercredi?.getHourOfDay()} : 
            <g:if test="${rqt.mercredi?.horairePlacementMatinDebutMercredi && rqt.mercredi?.horairePlacementMatinDebutMercredi.getMinuteOfHour() < 10}">
            0</g:if>${rqt.mercredi?.horairePlacementMatinDebutMercredi?.getMinuteOfHour()}
          </dd>
          

        
          <dt><g:message code="dccrr.property.horairePlacementMatinFinMercredi.label" /></dt>
          <dd>
            ${rqt.mercredi?.horairePlacementMatinFinMercredi?.getHourOfDay()} : 
            <g:if test="${rqt.mercredi?.horairePlacementMatinFinMercredi && rqt.mercredi?.horairePlacementMatinFinMercredi.getMinuteOfHour() < 10}">
            0</g:if>${rqt.mercredi?.horairePlacementMatinFinMercredi?.getMinuteOfHour()}
          </dd>
          

        
          <dt><g:message code="dccrr.property.horairePlacementApresMidiDebutMercredi.label" /></dt>
          <dd>
            ${rqt.mercredi?.horairePlacementApresMidiDebutMercredi?.getHourOfDay()} : 
            <g:if test="${rqt.mercredi?.horairePlacementApresMidiDebutMercredi && rqt.mercredi?.horairePlacementApresMidiDebutMercredi.getMinuteOfHour() < 10}">
            0</g:if>${rqt.mercredi?.horairePlacementApresMidiDebutMercredi?.getMinuteOfHour()}
          </dd>
          

        
          <dt><g:message code="dccrr.property.horairePlacementApresMidiFinMercredi.label" /></dt>
          <dd>
            ${rqt.mercredi?.horairePlacementApresMidiFinMercredi?.getHourOfDay()} : 
            <g:if test="${rqt.mercredi?.horairePlacementApresMidiFinMercredi && rqt.mercredi?.horairePlacementApresMidiFinMercredi.getMinuteOfHour() < 10}">
            0</g:if>${rqt.mercredi?.horairePlacementApresMidiFinMercredi?.getMinuteOfHour()}
          </dd>
          

        
      </dl>
      
    
      
      <h4><g:message code="dccrr.property.jeudi.label" /></h4>
      <dl>
        
          <dt><g:message code="dccrr.property.horairePlacementMatinDebutJeudi.label" /></dt>
          <dd>
            ${rqt.jeudi?.horairePlacementMatinDebutJeudi?.getHourOfDay()} : 
            <g:if test="${rqt.jeudi?.horairePlacementMatinDebutJeudi && rqt.jeudi?.horairePlacementMatinDebutJeudi.getMinuteOfHour() < 10}">
            0</g:if>${rqt.jeudi?.horairePlacementMatinDebutJeudi?.getMinuteOfHour()}
          </dd>
          

        
          <dt><g:message code="dccrr.property.horairePlacementMatinFinJeudi.label" /></dt>
          <dd>
            ${rqt.jeudi?.horairePlacementMatinFinJeudi?.getHourOfDay()} : 
            <g:if test="${rqt.jeudi?.horairePlacementMatinFinJeudi && rqt.jeudi?.horairePlacementMatinFinJeudi.getMinuteOfHour() < 10}">
            0</g:if>${rqt.jeudi?.horairePlacementMatinFinJeudi?.getMinuteOfHour()}
          </dd>
          

        
          <dt><g:message code="dccrr.property.horairePlacementApresMidiDebutJeudi.label" /></dt>
          <dd>
            ${rqt.jeudi?.horairePlacementApresMidiDebutJeudi?.getHourOfDay()} : 
            <g:if test="${rqt.jeudi?.horairePlacementApresMidiDebutJeudi && rqt.jeudi?.horairePlacementApresMidiDebutJeudi.getMinuteOfHour() < 10}">
            0</g:if>${rqt.jeudi?.horairePlacementApresMidiDebutJeudi?.getMinuteOfHour()}
          </dd>
          

        
          <dt><g:message code="dccrr.property.horairePlacementApresMidiFinJeudi.label" /></dt>
          <dd>
            ${rqt.jeudi?.horairePlacementApresMidiFinJeudi?.getHourOfDay()} : 
            <g:if test="${rqt.jeudi?.horairePlacementApresMidiFinJeudi && rqt.jeudi?.horairePlacementApresMidiFinJeudi.getMinuteOfHour() < 10}">
            0</g:if>${rqt.jeudi?.horairePlacementApresMidiFinJeudi?.getMinuteOfHour()}
          </dd>
          

        
      </dl>
      
    
      
      <h4><g:message code="dccrr.property.vendredi.label" /></h4>
      <dl>
        
          <dt><g:message code="dccrr.property.horairePlacementMatinDebutVendredi.label" /></dt>
          <dd>
            ${rqt.vendredi?.horairePlacementMatinDebutVendredi?.getHourOfDay()} : 
            <g:if test="${rqt.vendredi?.horairePlacementMatinDebutVendredi && rqt.vendredi?.horairePlacementMatinDebutVendredi.getMinuteOfHour() < 10}">
            0</g:if>${rqt.vendredi?.horairePlacementMatinDebutVendredi?.getMinuteOfHour()}
          </dd>
          

        
          <dt><g:message code="dccrr.property.horairePlacementMatinFinVendredi.label" /></dt>
          <dd>
            ${rqt.vendredi?.horairePlacementMatinFinVendredi?.getHourOfDay()} : 
            <g:if test="${rqt.vendredi?.horairePlacementMatinFinVendredi && rqt.vendredi?.horairePlacementMatinFinVendredi.getMinuteOfHour() < 10}">
            0</g:if>${rqt.vendredi?.horairePlacementMatinFinVendredi?.getMinuteOfHour()}
          </dd>
          

        
          <dt><g:message code="dccrr.property.horairePlacementApresMidiDebutVendredi.label" /></dt>
          <dd>
            ${rqt.vendredi?.horairePlacementApresMidiDebutVendredi?.getHourOfDay()} : 
            <g:if test="${rqt.vendredi?.horairePlacementApresMidiDebutVendredi && rqt.vendredi?.horairePlacementApresMidiDebutVendredi.getMinuteOfHour() < 10}">
            0</g:if>${rqt.vendredi?.horairePlacementApresMidiDebutVendredi?.getMinuteOfHour()}
          </dd>
          

        
          <dt><g:message code="dccrr.property.horairePlacementApresMidiFinVendredi.label" /></dt>
          <dd>
            ${rqt.vendredi?.horairePlacementApresMidiFinVendredi?.getHourOfDay()} : 
            <g:if test="${rqt.vendredi?.horairePlacementApresMidiFinVendredi && rqt.vendredi?.horairePlacementApresMidiFinVendredi.getMinuteOfHour() < 10}">
            0</g:if>${rqt.vendredi?.horairePlacementApresMidiFinVendredi?.getMinuteOfHour()}
          </dd>
          

        
      </dl>
      
    
  

  
    <h3><g:message code="dccrr.step.rendezVous.label" /></h3>
    
      
      <dl>
        <dt><g:message code="dccrr.property.choixTypeRendezVous.label" /></dt>
          <dd>
            <g:if test="${rqt.choixTypeRendezVous}">
              <g:capdematEnumToField var="${rqt.choixTypeRendezVous}" i18nKeyPrefix="dccrr.property.choixTypeRendezVous" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="dccrr.property.telephoneContact.label" /></dt><dd>${rqt.telephoneContact?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="dccrr.property.plageHoraireContact.label" /></dt>
          <dd>
            <g:if test="${rqt.plageHoraireContact}">
              <g:capdematEnumToField var="${rqt.plageHoraireContact}" i18nKeyPrefix="dccrr.property.plageHoraireContact" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="dccrr.property.commentaireCitoyen.label" /></dt><dd>${rqt.commentaireCitoyen?.toString()}</dd>

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
  

  


