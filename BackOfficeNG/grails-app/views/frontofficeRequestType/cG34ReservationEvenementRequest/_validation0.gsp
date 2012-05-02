


  
    <h3><g:message code="crer.step.reservation.label" /></h3>
    
      
      <dl>
        <dt><g:message code="crer.property.idEvenement.label" /></dt><dd>${rqt.idEvenement?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="crer.property.idPrestation.label" /></dt><dd>${rqt.idPrestation?.toString()}</dd>

      </dl>
      
    
      
      <dl>
        <dt><g:message code="crer.property.labelReservation.label" /></dt><dd>${rqt.labelReservation?.toString()}</dd>

      </dl>
      
    
      
      <h4><g:message code="crer.property.reservations.label" /></h4>
      <g:each var="it" in="${rqt.reservations}" status="index">
      <dl>
        
          <dt><g:message code="crer.property.reservationType.label" /></dt><dd>${it.reservationType?.toString()}</dd>

        
          <dt><g:message code="crer.property.nombrePlaces.label" /></dt><dd>${it.nombrePlaces?.toString()}</dd>

        
      </dl>
      </g:each>
      
    
      
      <dl>
        <dt><g:message code="crer.property.dispositionParticuliere.label" /></dt><dd>${rqt.dispositionParticuliere?.toString()}</dd>

      </dl>
      
    
  

  


