


  
    <h3><g:message code="cscr.step.acte.label" /></h3>
    
      
      <dl>
        <dt><g:message code="cscr.property.typeActe.label" /></dt>
          <dd>
            <g:if test="${rqt.typeActe}">
              <g:capdematEnumToField var="${rqt.typeActe}" i18nKeyPrefix="cscr.property.typeActe" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="cscr.property.formatActe.label" /></dt>
          <dd>
            <g:if test="${rqt.formatActe}">
              <g:capdematEnumToField var="${rqt.formatActe}" i18nKeyPrefix="cscr.property.formatActe" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="cscr.property.nombreActes.label" /></dt><dd>${rqt.nombreActes?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="cscr.property.dateEvenement.label" /></dt>
          <dd><g:formatDate formatName="format.date" date="${rqt.dateEvenement}"/></dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="cscr.property.nomTitulaireActe.label" /></dt><dd>${rqt.nomTitulaireActe?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="cscr.property.prenomsTitulaireActe.label" /></dt><dd>${rqt.prenomsTitulaireActe?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="cscr.property.motif.label" /></dt>
          <dd>
            <g:if test="${rqt.motif}">
              <g:capdematEnumToField var="${rqt.motif}" i18nKeyPrefix="cscr.property.motif" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <dl>
        <dt><g:message code="cscr.property.precisionAutreMotif.label" /></dt><dd>${rqt.precisionAutreMotif?.toString()}</dd>

      </dl>
      
    
      
      <h4><g:message code="cscr.property.complementTypeActe.label" /></h4>
      <dl>
        
          <dt><g:message code="cscr.property.pereNom.label" /></dt><dd>${rqt.complementTypeActe?.pereNom?.toString()}</dd>

        
          <dt><g:message code="cscr.property.perePrenoms.label" /></dt><dd>${rqt.complementTypeActe?.perePrenoms?.toString()}</dd>

        
          <dt><g:message code="cscr.property.mereNom.label" /></dt><dd>${rqt.complementTypeActe?.mereNom?.toString()}</dd>

        
          <dt><g:message code="cscr.property.merePrenoms.label" /></dt><dd>${rqt.complementTypeActe?.merePrenoms?.toString()}</dd>

        
      </dl>
      
    
  

  
    <h3><g:message code="cscr.step.informations.label" /></h3>
    
      
      <dl>
        <dt><g:message code="cscr.property.typeDemandeur.label" /></dt>
          <dd>
            <g:if test="${rqt.typeDemandeur}">
              <g:capdematEnumToField var="${rqt.typeDemandeur}" i18nKeyPrefix="cscr.property.typeDemandeur" />
            </g:if>
          </dd>
          

      </dl>
      
    
      
      <h4><g:message code="cscr.property.informationsParticulier.label" /></h4>
      <dl>
        
          <dt><g:message code="cscr.property.qualiteDemandeurParticulier.label" /></dt>
          <dd>
            <g:if test="${rqt.informationsParticulier?.qualiteDemandeurParticulier}">
              <g:capdematEnumToField var="${rqt.informationsParticulier?.qualiteDemandeurParticulier}" i18nKeyPrefix="cscr.property.qualiteDemandeurParticulier" />
            </g:if>
          </dd>
          

        
          <dt><g:message code="cscr.property.precisionAutreQualiteDemandeurParticulier.label" /></dt><dd>${rqt.informationsParticulier?.precisionAutreQualiteDemandeurParticulier?.toString()}</dd>

        
      </dl>
      
    
      
      <h4><g:message code="cscr.property.informationsAdministration.label" /></h4>
      <dl>
        
          <dt><g:message code="cscr.property.nomAdministration.label" /></dt><dd>${rqt.informationsAdministration?.nomAdministration?.toString()}</dd>

        
          <dt><g:message code="cscr.property.nomMandataireAdministration.label" /></dt><dd>${rqt.informationsAdministration?.nomMandataireAdministration?.toString()}</dd>

        
          <dt><g:message code="cscr.property.qualiteMandataireAdministration.label" /></dt>
          <dd>
            <g:if test="${rqt.informationsAdministration?.qualiteMandataireAdministration}">
              <g:capdematEnumToField var="${rqt.informationsAdministration?.qualiteMandataireAdministration}" i18nKeyPrefix="cscr.property.qualiteMandataireAdministration" />
            </g:if>
          </dd>
          

        
          <dt><g:message code="cscr.property.precisionAutreQualiteMandataireAdministration.label" /></dt><dd>${rqt.informationsAdministration?.precisionAutreQualiteMandataireAdministration?.toString()}</dd>

        
      </dl>
      
    
      
      <h4><g:message code="cscr.property.informationsJuridique.label" /></h4>
      <dl>
        
          <dt><g:message code="cscr.property.nomMandataireJuridique.label" /></dt><dd>${rqt.informationsJuridique?.nomMandataireJuridique?.toString()}</dd>

        
          <dt><g:message code="cscr.property.qualiteMandataireJuridique.label" /></dt>
          <dd>
            <g:if test="${rqt.informationsJuridique?.qualiteMandataireJuridique}">
              <g:capdematEnumToField var="${rqt.informationsJuridique?.qualiteMandataireJuridique}" i18nKeyPrefix="cscr.property.qualiteMandataireJuridique" />
            </g:if>
          </dd>
          

        
          <dt><g:message code="cscr.property.precisionAutreQualiteMandataireJuridique.label" /></dt><dd>${rqt.informationsJuridique?.precisionAutreQualiteMandataireJuridique?.toString()}</dd>

        
      </dl>
      
    
      
      <dl>
        <dt><g:message code="cscr.property.commentaire.label" /></dt><dd>${rqt.commentaire?.toString()}</dd>

      </dl>
      
    
  

  


