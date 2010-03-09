


  
    <fieldset class="required">
    <legend><g:message code="mar.property.autoriteParentaleMere.label" /></legend>
    
      <label for="nom" class="required"><g:message code="mar.property.nom.label" /> *  <span><g:message code="mar.property.nom.help" /></span></label>
            <input type="text" id="nom" name="nom" value="${rqt.nom?.toString()}" 
                    class="required  validate-lastName" title="<g:message code="mar.property.nom.validationError" />"  maxlength="38" />
            

    
      <label for="prenom" class="required"><g:message code="mar.property.prenom.label" /> *  <span><g:message code="mar.property.prenom.help" /></span></label>
            <input type="text" id="prenom" name="prenom" value="${rqt.prenom?.toString()}" 
                    class="required  validate-firstName" title="<g:message code="mar.property.prenom.validationError" />"  maxlength="38" />
            

    
      <label class="required"><g:message code="mar.property.domiciliation.label" /> *  <span><g:message code="mar.property.domiciliation.help" /></span></label>
            <div class="address-fieldset required ">
            <label for="domiciliation.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" value="${rqt.domiciliation?.additionalDeliveryInformation}" maxlength="38" id="domiciliation.additionalDeliveryInformation" name="domiciliation.additionalDeliveryInformation" />  
            <label for="domiciliation.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" value="${rqt.domiciliation?.additionalGeographicalInformation}" maxlength="38" id="domiciliation.additionalGeographicalInformation" name="domiciliation.additionalGeographicalInformation" />
            <label for="domiciliation.streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="domiciliation.streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1" value="${rqt.domiciliation?.streetNumber}" size="5" maxlength="5" id="domiciliation.streetNumber" name="domiciliation.streetNumber" />
            <input type="text" class="line2 required" value="${rqt.domiciliation?.streetName}" maxlength="32" id="domiciliation.streetName" name="domiciliation.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <label for="domiciliation.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" value="${rqt.domiciliation?.placeNameOrService}" maxlength="38" id="domiciliation.placeNameOrService" name="domiciliation.placeNameOrService" />
            <label for="domiciliation.postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="domiciliation.city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required" value="${rqt.domiciliation?.postalCode}" size="5" maxlength="5" id="domiciliation.postalCode" name="domiciliation.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required" value="${rqt.domiciliation?.city}" maxlength="32" id="domiciliation.city" name="domiciliation.city" title="<g:message code="address.property.city.validationError" />" />
            <label for="domiciliation.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" value="${rqt.domiciliation?.countryName}" maxlength="38" id="domiciliation.countryName" name="domiciliation.countryName" />
            </div>
            

    
      <label for="telephone" class="required"><g:message code="mar.property.telephone.label" /> *  <span><g:message code="mar.property.telephone.help" /></span></label>
            <input type="text" id="telephone" name="telephone" value="${rqt.telephone?.toString()}" 
                    class="required  validate-phone" title="<g:message code="mar.property.telephone.validationError" />"  maxlength="10" />
            

    
      <label for="fax" class="required"><g:message code="mar.property.fax.label" /> *  <span><g:message code="mar.property.fax.help" /></span></label>
            <input type="text" id="fax" name="fax" value="${rqt.fax?.toString()}" 
                    class="required  validate-phone" title="<g:message code="mar.property.fax.validationError" />"  maxlength="10" />
            

    
      <label for="email" class="required"><g:message code="mar.property.email.label" /> *  <span><g:message code="mar.property.email.help" /></span></label>
            <input type="text" id="email" name="email" value="${rqt.email?.toString()}" 
                    class="required  validate-email" title="<g:message code="mar.property.email.validationError" />"   />
            

    
    </fieldset>
  

  
    <fieldset class="required">
    <legend><g:message code="mar.property.autoriteParentalePere.label" /></legend>
    
      <label for="nom" class="required"><g:message code="mar.property.nom.label" /> *  <span><g:message code="mar.property.nom.help" /></span></label>
            <input type="text" id="nom" name="nom" value="${rqt.nom?.toString()}" 
                    class="required  validate-lastName" title="<g:message code="mar.property.nom.validationError" />"  maxlength="38" />
            

    
      <label for="prenom" class="required"><g:message code="mar.property.prenom.label" /> *  <span><g:message code="mar.property.prenom.help" /></span></label>
            <input type="text" id="prenom" name="prenom" value="${rqt.prenom?.toString()}" 
                    class="required  validate-firstName" title="<g:message code="mar.property.prenom.validationError" />"  maxlength="38" />
            

    
      <label class="required"><g:message code="mar.property.domiciliation.label" /> *  <span><g:message code="mar.property.domiciliation.help" /></span></label>
            <div class="address-fieldset required ">
            <label for="domiciliation.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" value="${rqt.domiciliation?.additionalDeliveryInformation}" maxlength="38" id="domiciliation.additionalDeliveryInformation" name="domiciliation.additionalDeliveryInformation" />  
            <label for="domiciliation.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" value="${rqt.domiciliation?.additionalGeographicalInformation}" maxlength="38" id="domiciliation.additionalGeographicalInformation" name="domiciliation.additionalGeographicalInformation" />
            <label for="domiciliation.streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="domiciliation.streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1" value="${rqt.domiciliation?.streetNumber}" size="5" maxlength="5" id="domiciliation.streetNumber" name="domiciliation.streetNumber" />
            <input type="text" class="line2 required" value="${rqt.domiciliation?.streetName}" maxlength="32" id="domiciliation.streetName" name="domiciliation.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <label for="domiciliation.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" value="${rqt.domiciliation?.placeNameOrService}" maxlength="38" id="domiciliation.placeNameOrService" name="domiciliation.placeNameOrService" />
            <label for="domiciliation.postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="domiciliation.city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required" value="${rqt.domiciliation?.postalCode}" size="5" maxlength="5" id="domiciliation.postalCode" name="domiciliation.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required" value="${rqt.domiciliation?.city}" maxlength="32" id="domiciliation.city" name="domiciliation.city" title="<g:message code="address.property.city.validationError" />" />
            <label for="domiciliation.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" value="${rqt.domiciliation?.countryName}" maxlength="38" id="domiciliation.countryName" name="domiciliation.countryName" />
            </div>
            

    
      <label for="telephone" class="required"><g:message code="mar.property.telephone.label" /> *  <span><g:message code="mar.property.telephone.help" /></span></label>
            <input type="text" id="telephone" name="telephone" value="${rqt.telephone?.toString()}" 
                    class="required  validate-phone" title="<g:message code="mar.property.telephone.validationError" />"  maxlength="10" />
            

    
      <label for="fax" class="required"><g:message code="mar.property.fax.label" /> *  <span><g:message code="mar.property.fax.help" /></span></label>
            <input type="text" id="fax" name="fax" value="${rqt.fax?.toString()}" 
                    class="required  validate-phone" title="<g:message code="mar.property.fax.validationError" />"  maxlength="10" />
            

    
      <label for="email" class="required"><g:message code="mar.property.email.label" /> *  <span><g:message code="mar.property.email.help" /></span></label>
            <input type="text" id="email" name="email" value="${rqt.email?.toString()}" 
                    class="required  validate-email" title="<g:message code="mar.property.email.validationError" />"   />
            

    
    </fieldset>
  

  
    <label for="deteneurAutoriteParentale" class="required"><g:message code="mar.property.deteneurAutoriteParentale.label" /> *  <span><g:message code="mar.property.deteneurAutoriteParentale.help" /></span></label>
            <select id="deteneurAutoriteParentale" name="deteneurAutoriteParentale" class="required condition-autreDeteneurAutoriteParentale-trigger  validate-not-first" title="<g:message code="mar.property.deteneurAutoriteParentale.validationError" />">
              <option value=""><g:message code="message.select.defaultOption" /></option>
              <g:each in="${['Mere','Pere','LesDeux','Autre']}">
                <option value="fr.cg95.cvq.business.request.social.DeteneurAutoriteParentaleType_${it}" ${it == rqt.deteneurAutoriteParentale?.toString() ? 'selected="selected"': ''}><g:capdematEnumToText var="${it}" i18nKeyPrefix="mar.property.deteneurAutoriteParentale" /></option>
              </g:each>
            </select>
            

  

  
    <fieldset class="required condition-autreDeteneurAutoriteParentale-filled">
    <legend><g:message code="mar.property.informationAutreDetneurAutoriteParentale.label" /></legend>
    
      <label for="nom" class="required"><g:message code="mar.property.nom.label" /> *  <span><g:message code="mar.property.nom.help" /></span></label>
            <input type="text" id="nom" name="nom" value="${rqt.nom?.toString()}" 
                    class="required  validate-lastName" title="<g:message code="mar.property.nom.validationError" />"  maxlength="38" />
            

    
      <label for="prenom" class="required"><g:message code="mar.property.prenom.label" /> *  <span><g:message code="mar.property.prenom.help" /></span></label>
            <input type="text" id="prenom" name="prenom" value="${rqt.prenom?.toString()}" 
                    class="required  validate-firstName" title="<g:message code="mar.property.prenom.validationError" />"  maxlength="38" />
            

    
      <label class="required"><g:message code="mar.property.domiciliation.label" /> *  <span><g:message code="mar.property.domiciliation.help" /></span></label>
            <div class="address-fieldset required ">
            <label for="domiciliation.additionalDeliveryInformation"><g:message code="address.property.additionalDeliveryInformation" /></label>
            <input type="text" value="${rqt.domiciliation?.additionalDeliveryInformation}" maxlength="38" id="domiciliation.additionalDeliveryInformation" name="domiciliation.additionalDeliveryInformation" />  
            <label for="domiciliation.additionalGeographicalInformation"><g:message code="address.property.additionalGeographicalInformation" /></label>
            <input type="text" value="${rqt.domiciliation?.additionalGeographicalInformation}" maxlength="38" id="domiciliation.additionalGeographicalInformation" name="domiciliation.additionalGeographicalInformation" />
            <label for="domiciliation.streetNumber"><g:message code="address.property.streetNumber" /></label> - 
            <label for="domiciliation.streetName" class="required"><g:message code="address.property.streetName" /> *</label><br />
            <input type="text" class="line1" value="${rqt.domiciliation?.streetNumber}" size="5" maxlength="5" id="domiciliation.streetNumber" name="domiciliation.streetNumber" />
            <input type="text" class="line2 required" value="${rqt.domiciliation?.streetName}" maxlength="32" id="domiciliation.streetName" name="domiciliation.streetName" title="<g:message code="address.property.streetName.validationError" />" />
            <label for="domiciliation.placeNameOrService"><g:message code="address.property.placeNameOrService" /></label>
            <input type="text" value="${rqt.domiciliation?.placeNameOrService}" maxlength="38" id="domiciliation.placeNameOrService" name="domiciliation.placeNameOrService" />
            <label for="domiciliation.postalCode" class="required"><g:message code="address.property.postalCode" /> * </label> - 
            <label for="domiciliation.city" class="required"><g:message code="address.property.city" /> *</label><br />
            <input type="text" class="line1 required" value="${rqt.domiciliation?.postalCode}" size="5" maxlength="5" id="domiciliation.postalCode" name="domiciliation.postalCode" title="<g:message code="address.property.postalCode.validationError" />" />
            <input type="text" class="line2 required" value="${rqt.domiciliation?.city}" maxlength="32" id="domiciliation.city" name="domiciliation.city" title="<g:message code="address.property.city.validationError" />" />
            <label for="domiciliation.countryName"><g:message code="address.property.countryName" /></label>
            <input type="text" value="${rqt.domiciliation?.countryName}" maxlength="38" id="domiciliation.countryName" name="domiciliation.countryName" />
            </div>
            

    
      <label for="telephone" class="required"><g:message code="mar.property.telephone.label" /> *  <span><g:message code="mar.property.telephone.help" /></span></label>
            <input type="text" id="telephone" name="telephone" value="${rqt.telephone?.toString()}" 
                    class="required  validate-phone" title="<g:message code="mar.property.telephone.validationError" />"  maxlength="10" />
            

    
      <label for="fax" class="required"><g:message code="mar.property.fax.label" /> *  <span><g:message code="mar.property.fax.help" /></span></label>
            <input type="text" id="fax" name="fax" value="${rqt.fax?.toString()}" 
                    class="required  validate-phone" title="<g:message code="mar.property.fax.validationError" />"  maxlength="10" />
            

    
      <label for="email" class="required"><g:message code="mar.property.email.label" /> *  <span><g:message code="mar.property.email.help" /></span></label>
            <input type="text" id="email" name="email" value="${rqt.email?.toString()}" 
                    class="required  validate-email" title="<g:message code="mar.property.email.validationError" />"   />
            

    
    </fieldset>
  

