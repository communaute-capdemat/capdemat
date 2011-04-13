


<div id="requestData" class="yellow-yui-tabview">
  <ul class="yui-nav">
  
    <li class="selected ">
      <a href="#page0"><em><g:message code="mdr.step.nature.label" /></em></a>
    </li>
  
    <li class="">
      <a href="#page1"><em><g:message code="mdr.step.type.label" /></em></a>
    </li>
  
  </ul>
   
  <div class="yui-content">
    
      
      <!-- step start -->
      <div id="page0">
        <h2><g:message code="property.form" />
          <span><g:message code="mdr.step.nature.label" /></span>
        </h2>
        <div class="yui-g">
          
          
          <!-- column start -->
          <div class="yui-u first">
            
              
              <dl>
                <dt class="condition-isOtherRequesterQuality-trigger">${message(code:'mdr.property.requesterQuality.label')}¬†:</dt><dd id="requesterQuality" class="action-editField validate-capdematEnum i18n-mdr.property.requesterQuality javatype-fr.cg95.cvq.business.request.civil.MarriageRequesterQualityType" ><g:capdematEnumToField var="${rqt?.requesterQuality}" i18nKeyPrefix="mdr.property.requesterQuality" /></dd>
              </dl>
              
            
              
              <dl>
                <dt class="condition-isOtherRequesterQuality-filled">${message(code:'mdr.property.requesterQualityPrecision.label')}¬†:</dt><dd id="requesterQualityPrecision" class="action-editField validate-string i18n-mdr.property.requesterQualityPrecision" ><span>${rqt?.requesterQualityPrecision}</span></dd>
              </dl>
              
            
              
              <h3><g:message code="mdr.property.marriageHusband.label" /></h3>
              <dl class="required">
                
                  <dt class="required"><g:message code="mdr.property.marriageHusbandLastName.label" /> * : </dt><dd id="marriageHusbandLastName" class="action-editField validate-lastName required-true i18n-mdr.property.marriageHusbandLastName maxLength-38" ><span>${rqt?.marriageHusbandLastName}</span></dd>
                  <dt class="required">${message(code:'mdr.property.marriageHusbandLastName.label')}¬†*¬†:</dt><dd id="marriageHusbandLastName" class="action-editField validate-lastName required-true i18n-mdr.property.marriageHusbandLastName maxLength-38" ><span>${rqt?.marriageHusbandLastName}</span></dd>
                  <dt class="required"><g:message code="mdr.property.marriageHusbandLastName.label" /> * : </dt><dd id="marriageHusband.marriageHusbandLastName" class="action-editField validate-lastName required-true i18n-mdr.property.marriageHusbandLastName maxLength-38" ><span>${rqt.marriageHusband?.marriageHusbandLastName}</span></dd>
                
                  <dt class="required"><g:message code="mdr.property.marriageHusbandFirstNames.label" /> * : </dt><dd id="marriageHusbandFirstNames" class="action-editField validate-string required-true i18n-mdr.property.marriageHusbandFirstNames" ><span>${rqt?.marriageHusbandFirstNames}</span></dd>
                  <dt class="required">${message(code:'mdr.property.marriageHusbandFirstNames.label')}¬†*¬†:</dt><dd id="marriageHusbandFirstNames" class="action-editField validate-string required-true i18n-mdr.property.marriageHusbandFirstNames" ><span>${rqt?.marriageHusbandFirstNames}</span></dd>
                  <dt class="required"><g:message code="mdr.property.marriageHusbandFirstNames.label" /> * : </dt><dd id="marriageHusband.marriageHusbandFirstNames" class="action-editField validate-string required-true i18n-mdr.property.marriageHusbandFirstNames" ><span>${rqt.marriageHusband?.marriageHusbandFirstNames}</span></dd>
                
              </dl>
              
            
              
              <h3><g:message code="mdr.property.marriageWife.label" /></h3>
              <dl class="required">
                
                  <dt class="required"><g:message code="mdr.property.marriageWifeLastName.label" /> * : </dt><dd id="marriageWifeLastName" class="action-editField validate-lastName required-true i18n-mdr.property.marriageWifeLastName maxLength-38" ><span>${rqt?.marriageWifeLastName}</span></dd>
                  <dt class="required">${message(code:'mdr.property.marriageWifeLastName.label')}¬†*¬†:</dt><dd id="marriageWifeLastName" class="action-editField validate-lastName required-true i18n-mdr.property.marriageWifeLastName maxLength-38" ><span>${rqt?.marriageWifeLastName}</span></dd>
                  <dt class="required"><g:message code="mdr.property.marriageWifeLastName.label" /> * : </dt><dd id="marriageWife.marriageWifeLastName" class="action-editField validate-lastName required-true i18n-mdr.property.marriageWifeLastName maxLength-38" ><span>${rqt.marriageWife?.marriageWifeLastName}</span></dd>
                
                  <dt class="required"><g:message code="mdr.property.marriageWifeFirstNames.label" /> * : </dt><dd id="marriageWifeFirstNames" class="action-editField validate-string required-true i18n-mdr.property.marriageWifeFirstNames" ><span>${rqt?.marriageWifeFirstNames}</span></dd>
                  <dt class="required">${message(code:'mdr.property.marriageWifeFirstNames.label')}¬†*¬†:</dt><dd id="marriageWifeFirstNames" class="action-editField validate-string required-true i18n-mdr.property.marriageWifeFirstNames" ><span>${rqt?.marriageWifeFirstNames}</span></dd>
                  <dt class="required"><g:message code="mdr.property.marriageWifeFirstNames.label" /> * : </dt><dd id="marriageWife.marriageWifeFirstNames" class="action-editField validate-string required-true i18n-mdr.property.marriageWifeFirstNames" ><span>${rqt.marriageWife?.marriageWifeFirstNames}</span></dd>
                
              </dl>
              
            
          </div>
          <!-- column end -->
          
          <!-- column start -->
          <div class="yui-u">
            
              
              <h3><g:message code="mdr.property.marriage.label" /></h3>
              <dl class="required">
                
                  <dt class="required"><g:message code="mdr.property.marriageDate.label" /> * : </dt><dd id="marriageDate" class="action-editField validate-date required-true i18n-mdr.property.marriageDate" ><span><g:formatDate formatName="format.date" date="${rqt?.marriageDate}"/></span></dd>
                  <dt class="required">${message(code:'mdr.property.marriageDate.label')}¬†*¬†:</dt><dd id="marriageDate" class="action-editField validate-date required-true i18n-mdr.property.marriageDate" ><span><g:formatDate formatName="format.date" date="${rqt?.marriageDate}"/></span></dd>
                  <dt class="required"><g:message code="mdr.property.marriageDate.label" /> * : </dt><dd id="marriage.marriageDate" class="action-editField validate-date required-true i18n-mdr.property.marriageDate" ><span><g:formatDate formatName="format.date" date="${rqt.marriage?.marriageDate}"/></span></dd>
                
                  <dt class="required"><g:message code="mdr.property.marriageCity.label" /> * : </dt><dd id="marriageCity" class="action-editField validate-city required-true i18n-mdr.property.marriageCity maxLength-32" ><span>${rqt?.marriageCity}</span></dd>
                  <dt class="required">${message(code:'mdr.property.marriageCity.label')}¬†*¬†:</dt><dd id="marriageCity" class="action-editField validate-city required-true i18n-mdr.property.marriageCity maxLength-32" ><span>${rqt?.marriageCity}</span></dd>
                  <dt class="required"><g:message code="mdr.property.marriageCity.label" /> * : </dt><dd id="marriage.marriageCity" class="action-editField validate-city required-true i18n-mdr.property.marriageCity maxLength-32" ><span>${rqt.marriage?.marriageCity}</span></dd>
                
                  <dt class="required"><g:message code="mdr.property.marriagePostalCode.label" /> * : </dt><dd id="marriage.marriagePostalCode" class="action-editField validate-departmentCode required-true i18n-mdr.property.marriagePostalCode maxLength-2" ><span>${rqt.marriage?.marriagePostalCode}</span></dd>
                  <dt class="required"><g:message code="mdr.property.marriagePostalCode.label" /> * : </dt><dd id="marriagePostalCode" class="action-editField validate-departmentCode required-true i18n-mdr.property.marriagePostalCode maxLength-2" ><span>${rqt?.marriagePostalCode}</span></dd>
                  <dt class="required">${message(code:'mdr.property.marriagePostalCode.label')}¬†*¬†:</dt><dd id="marriagePostalCode" class="action-editField validate-departmentCode required-true i18n-mdr.property.marriagePostalCode maxLength-2" ><span>${rqt?.marriagePostalCode}</span></dd>
                  <dt class="required"><g:message code="mdr.property.marriagePostalCode.label" /> * : </dt><dd id="marriage.marriagePostalCode" class="action-editField validate-departmentCode required-true i18n-mdr.property.marriagePostalCode maxLength-2" ><span>${rqt.marriage?.marriagePostalCode}</span></dd>
                  <dt class="required"><g:message code="mdr.property.marriagePostalCode.label" /> * : </dt><dd id="marriage.marriagePostalCode" class="action-editField validate-capdematEnum required-true i18n-mdr.property.marriagePostalCode javatype-fr.cg95.cvq.business.users.InseeDepartementCodeType" ><g:capdematEnumToField var="${rqt.marriage?.marriagePostalCode}" i18nKeyPrefix="mdr.property.marriagePostalCode" /></dd>
                
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
          <span><g:message code="mdr.step.type.label" /></span>
        </h2>
        <div class="yui-g">
          
          
          <!-- column start -->
          <div class="yui-u first">
            
              
              <dl>
                <dt class="required condition-isWithRelationship-trigger">${message(code:'mdr.property.format.label')}¬†*¬†:</dt><dd id="format" class="action-editField validate-capdematEnum required-true i18n-mdr.property.format javatype-fr.cg95.cvq.business.request.civil.MarriageCertificateFormatType" ><g:capdematEnumToField var="${rqt?.format}" i18nKeyPrefix="mdr.property.format" /></dd>
              </dl>
              
            
              
              <dl>
                <dt class="required">${message(code:'mdr.property.copies.label')}¬†*¬†:</dt><dd id="copies" class="action-editField validate-positiveInteger required-true i18n-mdr.property.copies" ><span>${rqt?.copies}</span></dd>
              </dl>
              
            
              
              <dl>
                <dt class="">${message(code:'mdr.property.motive.label')}¬†:</dt><dd id="motive" class="action-editField validate-capdematEnum i18n-mdr.property.motive javatype-fr.cg95.cvq.business.request.civil.MarriageCertificateMotiveType" ><g:capdematEnumToField var="${rqt?.motive}" i18nKeyPrefix="mdr.property.motive" /></dd>
              </dl>
              
            
              
              <dl>
                <dt class="">${message(code:'mdr.property.comment.label')}¬†:</dt><dd id="comment" class="action-editField validate-regex i18n-mdr.property.comment rows-3 maxLength-255" regex="[\w\W]{0,255}$"><span>${rqt?.comment}</span></dd>
              </dl>
              
            
              
              <dl>
                <dt class="required condition-isWithRelationship-filled">${message(code:'mdr.property.relationship.label')}¬†*¬†:</dt><dd id="relationship" class="action-editField validate-capdematEnum required-true i18n-mdr.property.relationship javatype-fr.cg95.cvq.business.request.civil.MarriageRelationshipType" ><g:capdematEnumToField var="${rqt?.relationship}" i18nKeyPrefix="mdr.property.relationship" /></dd>
              </dl>
              
            
          </div>
          <!-- column end -->
          
          <!-- column start -->
          <div class="yui-u">
            
              
              <h3><g:message code="mdr.property.fatherInformation.label" /></h3>
              <dl class="condition-isWithRelationship-filled">
                
                  <dt class="required"><g:message code="mdr.property.fatherLastName.label" /> * : </dt><dd id="fatherLastName" class="action-editField validate-lastName required-true i18n-mdr.property.fatherLastName maxLength-38" ><span>${rqt?.fatherLastName}</span></dd>
                  <dt class="required">${message(code:'mdr.property.fatherLastName.label')}¬†*¬†:</dt><dd id="fatherLastName" class="action-editField validate-lastName required-true i18n-mdr.property.fatherLastName maxLength-38" ><span>${rqt?.fatherLastName}</span></dd>
                  <dt class="required"><g:message code="mdr.property.fatherLastName.label" /> * : </dt><dd id="fatherInformation.fatherLastName" class="action-editField validate-lastName required-true i18n-mdr.property.fatherLastName maxLength-38" ><span>${rqt.fatherInformation?.fatherLastName}</span></dd>
                
                  <dt class="required"><g:message code="mdr.property.fatherFirstNames.label" /> * : </dt><dd id="fatherFirstNames" class="action-editField validate-string required-true i18n-mdr.property.fatherFirstNames" ><span>${rqt?.fatherFirstNames}</span></dd>
                  <dt class="required">${message(code:'mdr.property.fatherFirstNames.label')}¬†*¬†:</dt><dd id="fatherFirstNames" class="action-editField validate-string required-true i18n-mdr.property.fatherFirstNames" ><span>${rqt?.fatherFirstNames}</span></dd>
                  <dt class="required"><g:message code="mdr.property.fatherFirstNames.label" /> * : </dt><dd id="fatherInformation.fatherFirstNames" class="action-editField validate-string required-true i18n-mdr.property.fatherFirstNames" ><span>${rqt.fatherInformation?.fatherFirstNames}</span></dd>
                
              </dl>
              
            
              
              <h3><g:message code="mdr.property.motherInformation.label" /></h3>
              <dl class="condition-isWithRelationship-filled">
                
                  <dt class="required"><g:message code="mdr.property.motherMaidenName.label" /> * : </dt><dd id="motherMaidenName" class="action-editField validate-lastName required-true i18n-mdr.property.motherMaidenName maxLength-38" ><span>${rqt?.motherMaidenName}</span></dd>
                  <dt class="required">${message(code:'mdr.property.motherMaidenName.label')}¬†*¬†:</dt><dd id="motherMaidenName" class="action-editField validate-lastName required-true i18n-mdr.property.motherMaidenName maxLength-38" ><span>${rqt?.motherMaidenName}</span></dd>
                  <dt class="required"><g:message code="mdr.property.motherMaidenName.label" /> * : </dt><dd id="motherInformation.motherMaidenName" class="action-editField validate-lastName required-true i18n-mdr.property.motherMaidenName maxLength-38" ><span>${rqt.motherInformation?.motherMaidenName}</span></dd>
                
                  <dt class="required"><g:message code="mdr.property.motherFirstNames.label" /> * : </dt><dd id="motherFirstNames" class="action-editField validate-string required-true i18n-mdr.property.motherFirstNames" ><span>${rqt?.motherFirstNames}</span></dd>
                  <dt class="required">${message(code:'mdr.property.motherFirstNames.label')}¬†*¬†:</dt><dd id="motherFirstNames" class="action-editField validate-string required-true i18n-mdr.property.motherFirstNames" ><span>${rqt?.motherFirstNames}</span></dd>
                  <dt class="required"><g:message code="mdr.property.motherFirstNames.label" /> * : </dt><dd id="motherInformation.motherFirstNames" class="action-editField validate-string required-true i18n-mdr.property.motherFirstNames" ><span>${rqt.motherInformation?.motherFirstNames}</span></dd>
                
              </dl>
              
            
          </div>
          <!-- column end -->
          
        </div>
        <!-- data step  end -->
      </div>
      <!-- step end -->
      
    
    
  </div>
  
</div>
