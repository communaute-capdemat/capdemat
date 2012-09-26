


<div id="requestData" class="yellow-yui-tabview">
  <ul class="yui-nav">
  
    <li class="selected ">
      <a href="#page0"><em><g:message code="arr.step.preinscription.label" /></em></a>
    </li>
  
    <li class="">
      <a href="#page1"><em><g:message code="arr.step.reglement.label" /></em></a>
    </li>
  
  </ul>
   
  <div class="yui-content">
    
      
      <!-- step start -->
      <div id="page0">
        <h2><g:message code="property.form" />
          <span><g:message code="arr.step.preinscription.label" /></span>
        </h2>
        <div class="yui-g">
          
          
          <!-- column start -->
          <div class="yui-u first">
            
              
              <dl>
                <dt class="required"><g:message code="arr.property.subject.label" /> : </dt>
              <dd><span>${subjectIsChild && !subject?.born ? message(code:'request.subject.childNoBorn', args:[subject?.getFullName()]) : subject?.fullName}</span></dd>
          
              </dl>
              
            
              
              <h3><g:message code="arr.property.site.label" /></h3>
              <dl class="required">
                
                  <dt class="required">${message(code:'arr.property.labelSite.label')}&nbsp;*&nbsp;:</dt><dd id="labelSite" class="action-editField validate-string required-true i18n-arr.property.labelSite" ><span>${rqt?.labelSite}</span></dd>
                
              </dl>
              
            
              
              <h3><g:message code="arr.property.produit.label" /></h3>
              <dl class="required">
                
                  <dt class="required">${message(code:'arr.property.labelProduit.label')}&nbsp;*&nbsp;:</dt><dd id="labelProduit" class="action-editField validate-string required-true i18n-arr.property.labelProduit" ><span>${rqt?.labelProduit}</span></dd>
                
                  <dt class="required condition-subscription-trigger">${message(code:'arr.property.typeProduit.label')}&nbsp;*&nbsp;:</dt><dd id="typeProduit" class="action-editField validate-string required-true i18n-arr.property.typeProduit" ><span>${rqt?.typeProduit}</span></dd>
                
              </dl>
              
            
              
              <h3><g:message code="arr.property.segment.label" /></h3>
              <dl class="required condition-subscription-filled">
                
                  <dt class="required">${message(code:'arr.property.labelSegment.label')}&nbsp;*&nbsp;:</dt><dd id="labelSegment" class="action-editField validate-string required-true i18n-arr.property.labelSegment" ><span>${rqt?.labelSegment}</span></dd>
                
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
      <div id="page1">
        <h2><g:message code="property.form" />
          <span><g:message code="arr.step.reglement.label" /></span>
        </h2>
        <div class="yui-g">
          
          
          <!-- column start -->
          <div class="yui-u first">
            
              
              <dl>
                <dt class="required">${message(code:'arr.property.reglement.label')}&nbsp;*&nbsp;:</dt><dd id="reglement" class="action-editField validate-acceptance required-true i18n-arr.property.reglement" ><span class="value-${rqt?.reglement}"><g:message code="message.${rqt?.reglement ? 'yes' : 'no'}" /></span></dd>
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
