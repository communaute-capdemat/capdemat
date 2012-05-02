


<div id="requestData" class="yellow-yui-tabview">
  <ul class="yui-nav">
  
    <li class="selected ">
      <a href="#page0"><em><g:message code="crer.step.reservation.label" /></em></a>
    </li>
  
  </ul>
   
  <div class="yui-content">
    
      
      <!-- step start -->
      <div id="page0">
        <h2><g:message code="property.form" />
          <span><g:message code="crer.step.reservation.label" /></span>
        </h2>
        <div class="yui-g">
          
          
          <!-- column start -->
          <div class="yui-u first">
            
              
              <dl>
                <dt class="required"><g:message code="crer.property.idEvenement.label" /> * : </dt><dd id="idEvenement" class="action-editField validate-string required-true i18n-crer.property.idEvenement" ><span>${rqt?.idEvenement}</span></dd>
              </dl>
              
            
              
              <dl>
                <dt class="required"><g:message code="crer.property.idPrestation.label" /> * : </dt><dd id="idPrestation" class="action-editField validate-string required-true i18n-crer.property.idPrestation" ><span>${rqt?.idPrestation}</span></dd>
              </dl>
              
            
              
              <dl>
                <dt class="required"><g:message code="crer.property.labelReservation.label" /> * : </dt><dd id="labelReservation" class="action-editField validate-string required-true i18n-crer.property.labelReservation" ><span>${rqt?.labelReservation}</span></dd>
              </dl>
              
            
              
              <div id="widget-reservations" class="required">
                <g:render template="/backofficeRequestInstruction/requestType/cG34ReservationEvenementRequest/reservations" model="['rqt':rqt]" />
              </div>
              
            
              
              <dl>
                <dt class=""><g:message code="crer.property.dispositionParticuliere.label" />  : </dt><dd id="dispositionParticuliere" class="action-editField validate-string i18n-crer.property.dispositionParticuliere" ><span>${rqt?.dispositionParticuliere}</span></dd>
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
      
    
    
  </div>
  
</div>
