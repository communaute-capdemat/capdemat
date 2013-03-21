


<div id="requestData" class="yellow-yui-tabview">
  <ul class="yui-nav">
  
    <li class="selected ">
      <a href="#page0"><em><g:message code="dccrr.step.subject.label" /></em></a>
    </li>
  
    <li class="">
      <a href="#page1"><em><g:message code="dccrr.step.accueil.label" /></em></a>
    </li>
  
    <li class="">
      <a href="#page2"><em><g:message code="dccrr.step.rendezVous.label" /></em></a>
    </li>
  
  </ul>
   
  <div class="yui-content">
    
      
      <!-- step start -->
      <div id="page0">
        <h2><g:message code="property.form" />
          <span><g:message code="dccrr.step.subject.label" /></span>
        </h2>
        <div class="yui-g">
          
          
          <!-- column start -->
          <div class="yui-u first">
            
              
              <dl>
                <dt class="required"><g:message code="dccrr.property.subject.label" /> : </dt>
              <dd><span>${subjectIsChild && !subject?.born ? message(code:'request.subject.childNoBorn', args:[subject?.getFullName()]) : subject?.fullName}</span></dd>
          
              </dl>
              
            
              
              <dl>
                <dt class="">${message(code:'dccrr.property.dixHuitMoisEnfant.label')} :</dt><dd id="dixHuitMoisEnfant" class="action-editField validate-date i18n-dccrr.property.dixHuitMoisEnfant" ><span><g:formatDate formatName="format.date" date="${rqt?.dixHuitMoisEnfant}"/></span></dd>
              </dl>
              
            
          </div>
          <!-- column end -->
          
          <!-- column start -->
          <div class="yui-u">
            
              
              <h3><g:message code="dccrr.property.informationMere.label" /></h3>
              <dl class="required">
                
                  <dt class="condition-estAutreSituationActuelleMere-trigger">${message(code:'dccrr.property.situationActuelleMere.label')} :</dt><dd id="situationActuelleMere" class="action-editField validate-capdematEnum i18n-dccrr.property.situationActuelleMere javatype-fr.cg95.cvq.business.request.school.ChoixSituationActuelle" ><g:capdematEnumToField var="${rqt.informationMere?.situationActuelleMere}" i18nKeyPrefix="dccrr.property.situationActuelleMere" /></dd>
                
                  <dt class="required condition-estAutreSituationActuelleMere-filled">${message(code:'dccrr.property.precisionAutreSituationActuelleMere.label')} * :</dt><dd id="precisionAutreSituationActuelleMere" class="action-editField validate-string required-true i18n-dccrr.property.precisionAutreSituationActuelleMere" ><span>${rqt.informationMere?.precisionAutreSituationActuelleMere}</span></dd>
                
                  <dt class="">${message(code:'dccrr.property.professionMere.label')} :</dt><dd id="professionMere" class="action-editField validate-string i18n-dccrr.property.professionMere" ><span>${rqt.informationMere?.professionMere}</span></dd>
                
                  <dt class="condition-estHorairesReguliersMere-trigger">${message(code:'dccrr.property.estHorairesReguliersMere.label')} :</dt><dd id="estHorairesReguliersMere" class="action-editField validate-boolean i18n-dccrr.property.estHorairesReguliersMere" ><span class="value-${rqt.informationMere?.estHorairesReguliersMere}"><g:message code="message.${rqt.informationMere?.estHorairesReguliersMere ? 'yes' : 'no'}" /></span></dd>
                
                  <dt class="condition-estHorairesReguliersMere-filled">${message(code:'dccrr.property.horairesReguliersMere.label')} :</dt><dd id="horairesReguliersMere" class="action-editField validate-string i18n-dccrr.property.horairesReguliersMere" ><span>${rqt.informationMere?.horairesReguliersMere}</span></dd>
                
                  <dt class="condition-estHorairesReguliersMere-unfilled">${message(code:'dccrr.property.horairesTravailLundiMere.label')} :</dt><dd id="horairesTravailLundiMere" class="action-editField validate-string i18n-dccrr.property.horairesTravailLundiMere" ><span>${rqt.informationMere?.horairesTravailLundiMere}</span></dd>
                
                  <dt class="condition-estHorairesReguliersMere-unfilled">${message(code:'dccrr.property.horairesTravailMardiMere.label')} :</dt><dd id="horairesTravailMardiMere" class="action-editField validate-string i18n-dccrr.property.horairesTravailMardiMere" ><span>${rqt.informationMere?.horairesTravailMardiMere}</span></dd>
                
                  <dt class="condition-estHorairesReguliersMere-unfilled">${message(code:'dccrr.property.horairesTravailMercrediMere.label')} :</dt><dd id="horairesTravailMercrediMere" class="action-editField validate-string i18n-dccrr.property.horairesTravailMercrediMere" ><span>${rqt.informationMere?.horairesTravailMercrediMere}</span></dd>
                
                  <dt class="condition-estHorairesReguliersMere-unfilled">${message(code:'dccrr.property.horairesTravailJeudiMere.label')} :</dt><dd id="horairesTravailJeudiMere" class="action-editField validate-string i18n-dccrr.property.horairesTravailJeudiMere" ><span>${rqt.informationMere?.horairesTravailJeudiMere}</span></dd>
                
                  <dt class="condition-estHorairesReguliersMere-unfilled">${message(code:'dccrr.property.horairesTravailVendrediMere.label')} :</dt><dd id="horairesTravailVendrediMere" class="action-editField validate-string i18n-dccrr.property.horairesTravailVendrediMere" ><span>${rqt.informationMere?.horairesTravailVendrediMere}</span></dd>
                
                  <dt class="">${message(code:'dccrr.property.communeLieuTravailMere.label')} :</dt><dd id="communeLieuTravailMere" class="action-editField validate-string i18n-dccrr.property.communeLieuTravailMere" ><span>${rqt.informationMere?.communeLieuTravailMere}</span></dd>
                
              </dl>
              
            
              
              <h3><g:message code="dccrr.property.informationPere.label" /></h3>
              <dl class="">
                
                  <dt class="condition-estAutreSituationActuellePere-trigger">${message(code:'dccrr.property.situationActuellePere.label')} :</dt><dd id="situationActuellePere" class="action-editField validate-capdematEnum i18n-dccrr.property.situationActuellePere javatype-fr.cg95.cvq.business.request.school.ChoixSituationActuelle" ><g:capdematEnumToField var="${rqt.informationPere?.situationActuellePere}" i18nKeyPrefix="dccrr.property.situationActuellePere" /></dd>
                
                  <dt class="required condition-estAutreSituationActuellePere-filled">${message(code:'dccrr.property.precisionAutreSituationActuellePere.label')} * :</dt><dd id="precisionAutreSituationActuellePere" class="action-editField validate-string required-true i18n-dccrr.property.precisionAutreSituationActuellePere" ><span>${rqt.informationPere?.precisionAutreSituationActuellePere}</span></dd>
                
                  <dt class="">${message(code:'dccrr.property.professionPere.label')} :</dt><dd id="professionPere" class="action-editField validate-string i18n-dccrr.property.professionPere" ><span>${rqt.informationPere?.professionPere}</span></dd>
                
                  <dt class="condition-estHorairesReguliersPere-trigger">${message(code:'dccrr.property.estHorairesReguliersPere.label')} :</dt><dd id="estHorairesReguliersPere" class="action-editField validate-boolean i18n-dccrr.property.estHorairesReguliersPere" ><span class="value-${rqt.informationPere?.estHorairesReguliersPere}"><g:message code="message.${rqt.informationPere?.estHorairesReguliersPere ? 'yes' : 'no'}" /></span></dd>
                
                  <dt class="condition-estHorairesReguliersPere-filled">${message(code:'dccrr.property.horairesReguliersPere.label')} :</dt><dd id="horairesReguliersPere" class="action-editField validate-string i18n-dccrr.property.horairesReguliersPere" ><span>${rqt.informationPere?.horairesReguliersPere}</span></dd>
                
                  <dt class="condition-estHorairesReguliersPere-unfilled">${message(code:'dccrr.property.horairesTravailLundiPere.label')} :</dt><dd id="horairesTravailLundiPere" class="action-editField validate-string i18n-dccrr.property.horairesTravailLundiPere" ><span>${rqt.informationPere?.horairesTravailLundiPere}</span></dd>
                
                  <dt class="condition-estHorairesReguliersPere-unfilled">${message(code:'dccrr.property.horairesTravailMardiPere.label')} :</dt><dd id="horairesTravailMardiPere" class="action-editField validate-string i18n-dccrr.property.horairesTravailMardiPere" ><span>${rqt.informationPere?.horairesTravailMardiPere}</span></dd>
                
                  <dt class="condition-estHorairesReguliersPere-unfilled">${message(code:'dccrr.property.horairesTravailMercrediPere.label')} :</dt><dd id="horairesTravailMercrediPere" class="action-editField validate-string i18n-dccrr.property.horairesTravailMercrediPere" ><span>${rqt.informationPere?.horairesTravailMercrediPere}</span></dd>
                
                  <dt class="condition-estHorairesReguliersPere-unfilled">${message(code:'dccrr.property.horairesTravailJeudiPere.label')} :</dt><dd id="horairesTravailJeudiPere" class="action-editField validate-string i18n-dccrr.property.horairesTravailJeudiPere" ><span>${rqt.informationPere?.horairesTravailJeudiPere}</span></dd>
                
                  <dt class="condition-estHorairesReguliersPere-unfilled">${message(code:'dccrr.property.horairesTravailVendrediPere.label')} :</dt><dd id="horairesTravailVendrediPere" class="action-editField validate-string i18n-dccrr.property.horairesTravailVendrediPere" ><span>${rqt.informationPere?.horairesTravailVendrediPere}</span></dd>
                
                  <dt class="">${message(code:'dccrr.property.communeLieuTravailPere.label')} :</dt><dd id="communeLieuTravailPere" class="action-editField validate-string i18n-dccrr.property.communeLieuTravailPere" ><span>${rqt.informationPere?.communeLieuTravailPere}</span></dd>
                
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
          <span><g:message code="dccrr.step.accueil.label" /></span>
        </h2>
        <div class="yui-g">
          
          
          <!-- column start -->
          <div class="yui-u first">
            
              
              <dl>
                <dt class="required condition-estIndifferent-trigger">${message(code:'dccrr.property.modeAccueil.label')} * :</dt><dd id="modeAccueil" class="action-editField validate-boolean required-true i18n-dccrr.property.modeAccueil" ><span class="value-${rqt?.modeAccueil}"><g:message code="message.${rqt?.modeAccueil ? 'yes' : 'no'}" /></span></dd>
              </dl>
              
            
              
              <dl>
                <dt class="required condition-estIndifferent-filled">${message(code:'dccrr.property.modeAccueilChoixUn.label')} * :</dt><dd id="modeAccueilChoixUn" class="action-editField validate-capdematEnum required-true i18n-dccrr.property.modeAccueilChoixUn javatype-fr.cg95.cvq.business.request.school.ModeAccueilType" ><g:capdematEnumToField var="${rqt?.modeAccueilChoixUn}" i18nKeyPrefix="dccrr.property.modeAccueilChoixUn" /></dd>
              </dl>
              
            
              
              <dl>
                <dt class="condition-estIndifferent-filled">${message(code:'dccrr.property.modeAccueilChoixDeux.label')} :</dt><dd id="modeAccueilChoixDeux" class="action-editField validate-capdematEnum i18n-dccrr.property.modeAccueilChoixDeux javatype-fr.cg95.cvq.business.request.school.ModeAccueilType" ><g:capdematEnumToField var="${rqt?.modeAccueilChoixDeux}" i18nKeyPrefix="dccrr.property.modeAccueilChoixDeux" /></dd>
              </dl>
              
            
              
              <dl>
                <dt class="">${message(code:'dccrr.property.accueilAnterieur.label')} :</dt><dd id="accueilAnterieur" class="action-editField validate-string i18n-dccrr.property.accueilAnterieur" ><span>${rqt?.accueilAnterieur}</span></dd>
              </dl>
              
            
              
              <h3><g:message code="dccrr.property.datePlacementAccueilRegulier.label" /></h3>
              <dl class="required">
                
                  <dt class="required condition-dateConnue-trigger">${message(code:'dccrr.property.choixTypeDatePlacementAccueilRegulier.label')} * :</dt><dd id="choixTypeDatePlacementAccueilRegulier" class="action-editField validate-capdematEnum required-true i18n-dccrr.property.choixTypeDatePlacementAccueilRegulier javatype-fr.cg95.cvq.business.request.school.ChoixDatePlacement" ><g:capdematEnumToField var="${rqt.datePlacementAccueilRegulier?.choixTypeDatePlacementAccueilRegulier}" i18nKeyPrefix="dccrr.property.choixTypeDatePlacementAccueilRegulier" /></dd>
                
                  <dt class="required condition-dateConnue-filled">${message(code:'dccrr.property.datePlacementDebut.label')} * :</dt><dd id="datePlacementDebut" class="action-editField validate-date required-true i18n-dccrr.property.datePlacementDebut" ><span><g:formatDate formatName="format.date" date="${rqt.datePlacementAccueilRegulier?.datePlacementDebut}"/></span></dd>
                
              </dl>
              
            
          </div>
          <!-- column end -->
          
          <!-- column start -->
          <div class="yui-u">
            
              
              <dl>
                <dt class="required condition-estHorairesAccueilRegulier-trigger condition-estHorairesAccueilIrregulier-trigger">${message(code:'dccrr.property.choixHorairesAccueil.label')} * :</dt><dd id="choixHorairesAccueil" class="action-editField validate-capdematEnum required-true i18n-dccrr.property.choixHorairesAccueil javatype-fr.cg95.cvq.business.request.school.ChoixHorairesAccueilType" ><g:capdematEnumToField var="${rqt?.choixHorairesAccueil}" i18nKeyPrefix="dccrr.property.choixHorairesAccueil" /></dd>
              </dl>
              
            
              
              <h3><g:message code="dccrr.property.plageHoraireAccueilReguliere.label" /></h3>
              <dl class="required condition-estHorairesAccueilRegulier-filled">
                
                  <dt class="">${message(code:'dccrr.property.horairePlacementMatinDebut.label')} :</dt><dd id="horairePlacementMatinDebut" class="action-editField validate-time i18n-dccrr.property.horairePlacementMatinDebut" ><span>${rqt.plageHoraireAccueilReguliere?.horairePlacementMatinDebut?.getHourOfDay()} : ${rqt.plageHoraireAccueilReguliere?.horairePlacementMatinDebut && rqt.plageHoraireAccueilReguliere?.horairePlacementMatinDebut.getMinuteOfHour() < 10 ? '0' : ''}${rqt.plageHoraireAccueilReguliere?.horairePlacementMatinDebut?.getMinuteOfHour()}</span></dd>
                
                  <dt class="">${message(code:'dccrr.property.horairePlacementMatinFin.label')} :</dt><dd id="horairePlacementMatinFin" class="action-editField validate-time i18n-dccrr.property.horairePlacementMatinFin" ><span>${rqt.plageHoraireAccueilReguliere?.horairePlacementMatinFin?.getHourOfDay()} : ${rqt.plageHoraireAccueilReguliere?.horairePlacementMatinFin && rqt.plageHoraireAccueilReguliere?.horairePlacementMatinFin.getMinuteOfHour() < 10 ? '0' : ''}${rqt.plageHoraireAccueilReguliere?.horairePlacementMatinFin?.getMinuteOfHour()}</span></dd>
                
                  <dt class="">${message(code:'dccrr.property.horairePlacementApresMidiDebut.label')} :</dt><dd id="horairePlacementApresMidiDebut" class="action-editField validate-time i18n-dccrr.property.horairePlacementApresMidiDebut" ><span>${rqt.plageHoraireAccueilReguliere?.horairePlacementApresMidiDebut?.getHourOfDay()} : ${rqt.plageHoraireAccueilReguliere?.horairePlacementApresMidiDebut && rqt.plageHoraireAccueilReguliere?.horairePlacementApresMidiDebut.getMinuteOfHour() < 10 ? '0' : ''}${rqt.plageHoraireAccueilReguliere?.horairePlacementApresMidiDebut?.getMinuteOfHour()}</span></dd>
                
                  <dt class="">${message(code:'dccrr.property.horairePlacementApresMidiFin.label')} :</dt><dd id="horairePlacementApresMidiFin" class="action-editField validate-time i18n-dccrr.property.horairePlacementApresMidiFin" ><span>${rqt.plageHoraireAccueilReguliere?.horairePlacementApresMidiFin?.getHourOfDay()} : ${rqt.plageHoraireAccueilReguliere?.horairePlacementApresMidiFin && rqt.plageHoraireAccueilReguliere?.horairePlacementApresMidiFin.getMinuteOfHour() < 10 ? '0' : ''}${rqt.plageHoraireAccueilReguliere?.horairePlacementApresMidiFin?.getMinuteOfHour()}</span></dd>
                
              </dl>
              
            
              
              <h3><g:message code="dccrr.property.lundi.label" /></h3>
              <dl class="required condition-estHorairesAccueilIrregulier-filled">
                
                  <dt class="">${message(code:'dccrr.property.horairePlacementMatinDebutLundi.label')} :</dt><dd id="horairePlacementMatinDebutLundi" class="action-editField validate-time i18n-dccrr.property.horairePlacementMatinDebutLundi" ><span>${rqt.lundi?.horairePlacementMatinDebutLundi?.getHourOfDay()} : ${rqt.lundi?.horairePlacementMatinDebutLundi && rqt.lundi?.horairePlacementMatinDebutLundi.getMinuteOfHour() < 10 ? '0' : ''}${rqt.lundi?.horairePlacementMatinDebutLundi?.getMinuteOfHour()}</span></dd>
                
                  <dt class="">${message(code:'dccrr.property.horairePlacementMatinFinLundi.label')} :</dt><dd id="horairePlacementMatinFinLundi" class="action-editField validate-time i18n-dccrr.property.horairePlacementMatinFinLundi" ><span>${rqt.lundi?.horairePlacementMatinFinLundi?.getHourOfDay()} : ${rqt.lundi?.horairePlacementMatinFinLundi && rqt.lundi?.horairePlacementMatinFinLundi.getMinuteOfHour() < 10 ? '0' : ''}${rqt.lundi?.horairePlacementMatinFinLundi?.getMinuteOfHour()}</span></dd>
                
                  <dt class="">${message(code:'dccrr.property.horairePlacementApresMidiDebutLundi.label')} :</dt><dd id="horairePlacementApresMidiDebutLundi" class="action-editField validate-time i18n-dccrr.property.horairePlacementApresMidiDebutLundi" ><span>${rqt.lundi?.horairePlacementApresMidiDebutLundi?.getHourOfDay()} : ${rqt.lundi?.horairePlacementApresMidiDebutLundi && rqt.lundi?.horairePlacementApresMidiDebutLundi.getMinuteOfHour() < 10 ? '0' : ''}${rqt.lundi?.horairePlacementApresMidiDebutLundi?.getMinuteOfHour()}</span></dd>
                
                  <dt class="">${message(code:'dccrr.property.horairePlacementApresMidiFinLundi.label')} :</dt><dd id="horairePlacementApresMidiFinLundi" class="action-editField validate-time i18n-dccrr.property.horairePlacementApresMidiFinLundi" ><span>${rqt.lundi?.horairePlacementApresMidiFinLundi?.getHourOfDay()} : ${rqt.lundi?.horairePlacementApresMidiFinLundi && rqt.lundi?.horairePlacementApresMidiFinLundi.getMinuteOfHour() < 10 ? '0' : ''}${rqt.lundi?.horairePlacementApresMidiFinLundi?.getMinuteOfHour()}</span></dd>
                
              </dl>
              
            
              
              <h3><g:message code="dccrr.property.mardi.label" /></h3>
              <dl class="required condition-estHorairesAccueilIrregulier-filled">
                
                  <dt class="">${message(code:'dccrr.property.horairePlacementMatinDebutMardi.label')} :</dt><dd id="horairePlacementMatinDebutMardi" class="action-editField validate-time i18n-dccrr.property.horairePlacementMatinDebutMardi" ><span>${rqt.mardi?.horairePlacementMatinDebutMardi?.getHourOfDay()} : ${rqt.mardi?.horairePlacementMatinDebutMardi && rqt.mardi?.horairePlacementMatinDebutMardi.getMinuteOfHour() < 10 ? '0' : ''}${rqt.mardi?.horairePlacementMatinDebutMardi?.getMinuteOfHour()}</span></dd>
                
                  <dt class="">${message(code:'dccrr.property.horairePlacementMatinFinMardi.label')} :</dt><dd id="horairePlacementMatinFinMardi" class="action-editField validate-time i18n-dccrr.property.horairePlacementMatinFinMardi" ><span>${rqt.mardi?.horairePlacementMatinFinMardi?.getHourOfDay()} : ${rqt.mardi?.horairePlacementMatinFinMardi && rqt.mardi?.horairePlacementMatinFinMardi.getMinuteOfHour() < 10 ? '0' : ''}${rqt.mardi?.horairePlacementMatinFinMardi?.getMinuteOfHour()}</span></dd>
                
                  <dt class="">${message(code:'dccrr.property.horairePlacementApresMidiDebutMardi.label')} :</dt><dd id="horairePlacementApresMidiDebutMardi" class="action-editField validate-time i18n-dccrr.property.horairePlacementApresMidiDebutMardi" ><span>${rqt.mardi?.horairePlacementApresMidiDebutMardi?.getHourOfDay()} : ${rqt.mardi?.horairePlacementApresMidiDebutMardi && rqt.mardi?.horairePlacementApresMidiDebutMardi.getMinuteOfHour() < 10 ? '0' : ''}${rqt.mardi?.horairePlacementApresMidiDebutMardi?.getMinuteOfHour()}</span></dd>
                
                  <dt class="">${message(code:'dccrr.property.horairePlacementApresMidiFinMardi.label')} :</dt><dd id="horairePlacementApresMidiFinMardi" class="action-editField validate-time i18n-dccrr.property.horairePlacementApresMidiFinMardi" ><span>${rqt.mardi?.horairePlacementApresMidiFinMardi?.getHourOfDay()} : ${rqt.mardi?.horairePlacementApresMidiFinMardi && rqt.mardi?.horairePlacementApresMidiFinMardi.getMinuteOfHour() < 10 ? '0' : ''}${rqt.mardi?.horairePlacementApresMidiFinMardi?.getMinuteOfHour()}</span></dd>
                
              </dl>
              
            
              
              <h3><g:message code="dccrr.property.mercredi.label" /></h3>
              <dl class="required condition-estHorairesAccueilIrregulier-filled">
                
                  <dt class="">${message(code:'dccrr.property.horairePlacementMatinDebutMercredi.label')} :</dt><dd id="horairePlacementMatinDebutMercredi" class="action-editField validate-time i18n-dccrr.property.horairePlacementMatinDebutMercredi" ><span>${rqt.mercredi?.horairePlacementMatinDebutMercredi?.getHourOfDay()} : ${rqt.mercredi?.horairePlacementMatinDebutMercredi && rqt.mercredi?.horairePlacementMatinDebutMercredi.getMinuteOfHour() < 10 ? '0' : ''}${rqt.mercredi?.horairePlacementMatinDebutMercredi?.getMinuteOfHour()}</span></dd>
                
                  <dt class="">${message(code:'dccrr.property.horairePlacementMatinFinMercredi.label')} :</dt><dd id="horairePlacementMatinFinMercredi" class="action-editField validate-time i18n-dccrr.property.horairePlacementMatinFinMercredi" ><span>${rqt.mercredi?.horairePlacementMatinFinMercredi?.getHourOfDay()} : ${rqt.mercredi?.horairePlacementMatinFinMercredi && rqt.mercredi?.horairePlacementMatinFinMercredi.getMinuteOfHour() < 10 ? '0' : ''}${rqt.mercredi?.horairePlacementMatinFinMercredi?.getMinuteOfHour()}</span></dd>
                
                  <dt class="">${message(code:'dccrr.property.horairePlacementApresMidiDebutMercredi.label')} :</dt><dd id="horairePlacementApresMidiDebutMercredi" class="action-editField validate-time i18n-dccrr.property.horairePlacementApresMidiDebutMercredi" ><span>${rqt.mercredi?.horairePlacementApresMidiDebutMercredi?.getHourOfDay()} : ${rqt.mercredi?.horairePlacementApresMidiDebutMercredi && rqt.mercredi?.horairePlacementApresMidiDebutMercredi.getMinuteOfHour() < 10 ? '0' : ''}${rqt.mercredi?.horairePlacementApresMidiDebutMercredi?.getMinuteOfHour()}</span></dd>
                
                  <dt class="">${message(code:'dccrr.property.horairePlacementApresMidiFinMercredi.label')} :</dt><dd id="horairePlacementApresMidiFinMercredi" class="action-editField validate-time i18n-dccrr.property.horairePlacementApresMidiFinMercredi" ><span>${rqt.mercredi?.horairePlacementApresMidiFinMercredi?.getHourOfDay()} : ${rqt.mercredi?.horairePlacementApresMidiFinMercredi && rqt.mercredi?.horairePlacementApresMidiFinMercredi.getMinuteOfHour() < 10 ? '0' : ''}${rqt.mercredi?.horairePlacementApresMidiFinMercredi?.getMinuteOfHour()}</span></dd>
                
              </dl>
              
            
              
              <h3><g:message code="dccrr.property.jeudi.label" /></h3>
              <dl class="required condition-estHorairesAccueilIrregulier-filled">
                
                  <dt class="">${message(code:'dccrr.property.horairePlacementMatinDebutJeudi.label')} :</dt><dd id="horairePlacementMatinDebutJeudi" class="action-editField validate-time i18n-dccrr.property.horairePlacementMatinDebutJeudi" ><span>${rqt.jeudi?.horairePlacementMatinDebutJeudi?.getHourOfDay()} : ${rqt.jeudi?.horairePlacementMatinDebutJeudi && rqt.jeudi?.horairePlacementMatinDebutJeudi.getMinuteOfHour() < 10 ? '0' : ''}${rqt.jeudi?.horairePlacementMatinDebutJeudi?.getMinuteOfHour()}</span></dd>
                
                  <dt class="">${message(code:'dccrr.property.horairePlacementMatinFinJeudi.label')} :</dt><dd id="horairePlacementMatinFinJeudi" class="action-editField validate-time i18n-dccrr.property.horairePlacementMatinFinJeudi" ><span>${rqt.jeudi?.horairePlacementMatinFinJeudi?.getHourOfDay()} : ${rqt.jeudi?.horairePlacementMatinFinJeudi && rqt.jeudi?.horairePlacementMatinFinJeudi.getMinuteOfHour() < 10 ? '0' : ''}${rqt.jeudi?.horairePlacementMatinFinJeudi?.getMinuteOfHour()}</span></dd>
                
                  <dt class="">${message(code:'dccrr.property.horairePlacementApresMidiDebutJeudi.label')} :</dt><dd id="horairePlacementApresMidiDebutJeudi" class="action-editField validate-time i18n-dccrr.property.horairePlacementApresMidiDebutJeudi" ><span>${rqt.jeudi?.horairePlacementApresMidiDebutJeudi?.getHourOfDay()} : ${rqt.jeudi?.horairePlacementApresMidiDebutJeudi && rqt.jeudi?.horairePlacementApresMidiDebutJeudi.getMinuteOfHour() < 10 ? '0' : ''}${rqt.jeudi?.horairePlacementApresMidiDebutJeudi?.getMinuteOfHour()}</span></dd>
                
                  <dt class="">${message(code:'dccrr.property.horairePlacementApresMidiFinJeudi.label')} :</dt><dd id="horairePlacementApresMidiFinJeudi" class="action-editField validate-time i18n-dccrr.property.horairePlacementApresMidiFinJeudi" ><span>${rqt.jeudi?.horairePlacementApresMidiFinJeudi?.getHourOfDay()} : ${rqt.jeudi?.horairePlacementApresMidiFinJeudi && rqt.jeudi?.horairePlacementApresMidiFinJeudi.getMinuteOfHour() < 10 ? '0' : ''}${rqt.jeudi?.horairePlacementApresMidiFinJeudi?.getMinuteOfHour()}</span></dd>
                
              </dl>
              
            
              
              <h3><g:message code="dccrr.property.vendredi.label" /></h3>
              <dl class="required condition-estHorairesAccueilIrregulier-filled">
                
                  <dt class="">${message(code:'dccrr.property.horairePlacementMatinDebutVendredi.label')} :</dt><dd id="horairePlacementMatinDebutVendredi" class="action-editField validate-time i18n-dccrr.property.horairePlacementMatinDebutVendredi" ><span>${rqt.vendredi?.horairePlacementMatinDebutVendredi?.getHourOfDay()} : ${rqt.vendredi?.horairePlacementMatinDebutVendredi && rqt.vendredi?.horairePlacementMatinDebutVendredi.getMinuteOfHour() < 10 ? '0' : ''}${rqt.vendredi?.horairePlacementMatinDebutVendredi?.getMinuteOfHour()}</span></dd>
                
                  <dt class="">${message(code:'dccrr.property.horairePlacementMatinFinVendredi.label')} :</dt><dd id="horairePlacementMatinFinVendredi" class="action-editField validate-time i18n-dccrr.property.horairePlacementMatinFinVendredi" ><span>${rqt.vendredi?.horairePlacementMatinFinVendredi?.getHourOfDay()} : ${rqt.vendredi?.horairePlacementMatinFinVendredi && rqt.vendredi?.horairePlacementMatinFinVendredi.getMinuteOfHour() < 10 ? '0' : ''}${rqt.vendredi?.horairePlacementMatinFinVendredi?.getMinuteOfHour()}</span></dd>
                
                  <dt class="">${message(code:'dccrr.property.horairePlacementApresMidiDebutVendredi.label')} :</dt><dd id="horairePlacementApresMidiDebutVendredi" class="action-editField validate-time i18n-dccrr.property.horairePlacementApresMidiDebutVendredi" ><span>${rqt.vendredi?.horairePlacementApresMidiDebutVendredi?.getHourOfDay()} : ${rqt.vendredi?.horairePlacementApresMidiDebutVendredi && rqt.vendredi?.horairePlacementApresMidiDebutVendredi.getMinuteOfHour() < 10 ? '0' : ''}${rqt.vendredi?.horairePlacementApresMidiDebutVendredi?.getMinuteOfHour()}</span></dd>
                
                  <dt class="">${message(code:'dccrr.property.horairePlacementApresMidiFinVendredi.label')} :</dt><dd id="horairePlacementApresMidiFinVendredi" class="action-editField validate-time i18n-dccrr.property.horairePlacementApresMidiFinVendredi" ><span>${rqt.vendredi?.horairePlacementApresMidiFinVendredi?.getHourOfDay()} : ${rqt.vendredi?.horairePlacementApresMidiFinVendredi && rqt.vendredi?.horairePlacementApresMidiFinVendredi.getMinuteOfHour() < 10 ? '0' : ''}${rqt.vendredi?.horairePlacementApresMidiFinVendredi?.getMinuteOfHour()}</span></dd>
                
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
          <span><g:message code="dccrr.step.rendezVous.label" /></span>
        </h2>
        <div class="yui-g">
          
          
          <!-- column start -->
          <div class="yui-u first">
            
              
              <dl>
                <dt class="required">${message(code:'dccrr.property.choixTypeRendezVous.label')} * :</dt><dd id="choixTypeRendezVous" class="action-editField validate-capdematEnum required-true i18n-dccrr.property.choixTypeRendezVous javatype-fr.cg95.cvq.business.request.school.RendezVousType" ><g:capdematEnumToField var="${rqt?.choixTypeRendezVous}" i18nKeyPrefix="dccrr.property.choixTypeRendezVous" /></dd>
              </dl>
              
            
              
              <dl>
                <dt class="required">${message(code:'dccrr.property.telephoneContact.label')} * :</dt><dd id="telephoneContact" class="action-editField validate-phone required-true i18n-dccrr.property.telephoneContact maxLength-10" ><span>${rqt?.telephoneContact}</span></dd>
              </dl>
              
            
              
              <dl>
                <dt class="required">${message(code:'dccrr.property.plageHoraireContact.label')} * :</dt><dd id="plageHoraireContact" class="action-editField validate-capdematEnum required-true i18n-dccrr.property.plageHoraireContact javatype-fr.cg95.cvq.business.request.school.PlageHoraireContactType" ><g:capdematEnumToField var="${rqt?.plageHoraireContact}" i18nKeyPrefix="dccrr.property.plageHoraireContact" /></dd>
              </dl>
              
            
          </div>
          <!-- column end -->
          
          <!-- column start -->
          <div class="yui-u">
            
              
              <dl>
                <dt class="">${message(code:'dccrr.property.commentaireCitoyen.label')} :</dt><dd id="commentaireCitoyen" class="action-editField validate-textarea i18n-dccrr.property.commentaireCitoyen rows-10 maxLength-600" ><span>${rqt?.commentaireCitoyen}</span></dd>
              </dl>
              
            
          </div>
          <!-- column end -->
          
        </div>
        <!-- data step  end -->
      </div>
      <!-- step end -->
      
    
    
  </div>
  
</div>
