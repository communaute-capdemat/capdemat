


  
    <fieldset class="required">
    <legend><g:message code="taror.property.objetDemande.label" /></legend>
    
      <label class="required"><g:message code="taror.property.choixObjetDemande.label" /> *  <span><g:message code="taror.property.choixObjetDemande.help" /></span></label>
            <g:set var="choixObjetDemandeIndex" value="${0}" scope="flash" />
            <g:render template="/frontofficeRequestType/widget/localReferentialData" 
                      model="['javaName':'choixObjetDemande', 'i18nPrefixCode':'taror.property.choixObjetDemande', 'htmlClass':'required  ', 
                              'lrEntries': lrTypes.choixObjetDemande.entries, 'depth':0]" />
            

    
      <label for="precisionsObjetDemande" class=""><g:message code="taror.property.precisionsObjetDemande.label" />   <span><g:message code="taror.property.precisionsObjetDemande.help" /></span></label>
            <textarea id="precisionsObjetDemande" name="precisionsObjetDemande" class="  validate-textarea ${rqt.stepStates['technique'].invalidFields.contains('precisionsObjetDemande') ? 'validation-failed' : ''}" title="<g:message code="taror.property.precisionsObjetDemande.validationError" />" rows="3" cols=""  >${rqt.precisionsObjetDemande}</textarea>
            

    
    </fieldset>
  

  
    <fieldset class="required">
    <legend><g:message code="taror.property.typeTravaux.label" /></legend>
    
      <label class="required"><g:message code="taror.property.choixTypeTravaux.label" /> *  <span><g:message code="taror.property.choixTypeTravaux.help" /></span></label>
            <g:set var="choixTypeTravauxIndex" value="${0}" scope="flash" />
            <g:render template="/frontofficeRequestType/widget/localReferentialData" 
                      model="['javaName':'choixTypeTravaux', 'i18nPrefixCode':'taror.property.choixTypeTravaux', 'htmlClass':'required  ', 
                              'lrEntries': lrTypes.choixTypeTravaux.entries, 'depth':0]" />
            

    
      <label for="precisionsTypeTravaux" class=""><g:message code="taror.property.precisionsTypeTravaux.label" />   <span><g:message code="taror.property.precisionsTypeTravaux.help" /></span></label>
            <textarea id="precisionsTypeTravaux" name="precisionsTypeTravaux" class="  validate-textarea ${rqt.stepStates['technique'].invalidFields.contains('precisionsTypeTravaux') ? 'validation-failed' : ''}" title="<g:message code="taror.property.precisionsTypeTravaux.validationError" />" rows="3" cols=""  >${rqt.precisionsTypeTravaux}</textarea>
            

    
    </fieldset>
  

  
    <fieldset class="required">
    <legend><g:message code="taror.property.zonesConcernees.label" /></legend>
    
      <label class="required"><g:message code="taror.property.choixZonesConcernees.label" /> *  <span><g:message code="taror.property.choixZonesConcernees.help" /></span></label>
            <g:set var="choixZonesConcerneesIndex" value="${0}" scope="flash" />
            <g:render template="/frontofficeRequestType/widget/localReferentialData" 
                      model="['javaName':'choixZonesConcernees', 'i18nPrefixCode':'taror.property.choixZonesConcernees', 'htmlClass':'required  ', 
                              'lrEntries': lrTypes.choixZonesConcernees.entries, 'depth':0]" />
            

    
      <label for="precisionsZonesConcernees" class=""><g:message code="taror.property.precisionsZonesConcernees.label" />   <span><g:message code="taror.property.precisionsZonesConcernees.help" /></span></label>
            <textarea id="precisionsZonesConcernees" name="precisionsZonesConcernees" class="  validate-textarea ${rqt.stepStates['technique'].invalidFields.contains('precisionsZonesConcernees') ? 'validation-failed' : ''}" title="<g:message code="taror.property.precisionsZonesConcernees.validationError" />" rows="3" cols=""  >${rqt.precisionsZonesConcernees}</textarea>
            

    
    </fieldset>
  

  
    <fieldset class="required">
    <legend><g:message code="taror.property.surfaceOccupee.label" /></legend>
    
      <label for="longueurSurfaceOccupee" class="required"><g:message code="taror.property.longueurSurfaceOccupee.label" /> *  <span><g:message code="taror.property.longueurSurfaceOccupee.help" /></span></label>
            <input type="text" id="longueurSurfaceOccupee" name="longueurSurfaceOccupee" value="${rqt.longueurSurfaceOccupee?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['technique'].invalidFields.contains('longueurSurfaceOccupee') ? 'validation-failed' : ''}" title="<g:message code="taror.property.longueurSurfaceOccupee.validationError" />"   />
            

    
      <label for="largeurSurfaceOccupee" class="required"><g:message code="taror.property.largeurSurfaceOccupee.label" /> *  <span><g:message code="taror.property.largeurSurfaceOccupee.help" /></span></label>
            <input type="text" id="largeurSurfaceOccupee" name="largeurSurfaceOccupee" value="${rqt.largeurSurfaceOccupee?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['technique'].invalidFields.contains('largeurSurfaceOccupee') ? 'validation-failed' : ''}" title="<g:message code="taror.property.largeurSurfaceOccupee.validationError" />"   />
            

    
      <label for="hauteurSurfaceOccupee" class="required"><g:message code="taror.property.hauteurSurfaceOccupee.label" /> *  <span><g:message code="taror.property.hauteurSurfaceOccupee.help" /></span></label>
            <input type="text" id="hauteurSurfaceOccupee" name="hauteurSurfaceOccupee" value="${rqt.hauteurSurfaceOccupee?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['technique'].invalidFields.contains('hauteurSurfaceOccupee') ? 'validation-failed' : ''}" title="<g:message code="taror.property.hauteurSurfaceOccupee.validationError" />"   />
            

    
      <label for="surfaceTotale" class="required"><g:message code="taror.property.surfaceTotale.label" /> *  <span><g:message code="taror.property.surfaceTotale.help" /></span></label>
            <input type="text" id="surfaceTotale" name="surfaceTotale" value="${rqt.surfaceTotale?.toString()}" 
                    class="required  validate-string ${rqt.stepStates['technique'].invalidFields.contains('surfaceTotale') ? 'validation-failed' : ''}" title="<g:message code="taror.property.surfaceTotale.validationError" />"   />
            

    
    </fieldset>
  

  
    <fieldset class="required">
    <legend><g:message code="taror.property.mesuresDemandees.label" /></legend>
    
      <label class="required"><g:message code="taror.property.choixMesuresDemandees.label" /> *  <span><g:message code="taror.property.choixMesuresDemandees.help" /></span></label>
            <g:set var="choixMesuresDemandeesIndex" value="${0}" scope="flash" />
            <g:render template="/frontofficeRequestType/widget/localReferentialData" 
                      model="['javaName':'choixMesuresDemandees', 'i18nPrefixCode':'taror.property.choixMesuresDemandees', 'htmlClass':'required  ', 
                              'lrEntries': lrTypes.choixMesuresDemandees.entries, 'depth':0]" />
            

    
      <label for="precisionsMesuresDemandees" class=""><g:message code="taror.property.precisionsMesuresDemandees.label" />   <span><g:message code="taror.property.precisionsMesuresDemandees.help" /></span></label>
            <textarea id="precisionsMesuresDemandees" name="precisionsMesuresDemandees" class="  validate-textarea ${rqt.stepStates['technique'].invalidFields.contains('precisionsMesuresDemandees') ? 'validation-failed' : ''}" title="<g:message code="taror.property.precisionsMesuresDemandees.validationError" />" rows="3" cols=""  >${rqt.precisionsMesuresDemandees}</textarea>
            

    
    </fieldset>
  

