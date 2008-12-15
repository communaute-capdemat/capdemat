

import fr.cg95.cvq.business.request.social.DomesticHelpRequest
import fr.cg95.cvq.business.users.Address
import fr.cg95.cvq.security.SecurityContext
import fr.cg95.cvq.service.authority.ILocalAuthorityRegistry
import fr.cg95.cvq.service.request.social.IDomesticHelpRequestService
import fr.cg95.cvq.service.request.IMeansOfContactService

class DomesticHelpRequestController {

    DomesticHelpRequest dhr 
    IDomesticHelpRequestService domesticHelpRequestService
    ILocalAuthorityRegistry localAuthorityRegistry
    IMeansOfContactService meansOfContactService

    def translationService
    
    def defaultAction = 'edit'
    
    def currentTab = 'subject'
    
    def edit = {
        if (dhr == null)
          dhr = new DomesticHelpRequest()
dhr.setDhrGuardianAddress(new Address())
dhr.setDhrReferentAddress(new Address())
dhr.setDhrSpouseAddress(new Address())
dhr.setDhrCurrentDwellingAddress(new Address())


        session["domesticHelpRequest"] = dhr
        render(view:"frontofficeRequestType/domesticHelpRequest/edit", 
            model:[dhr:dhr, currentTab:currentTab,
                   translationService:translationService, help:getHelp(),
                   documentTypes:getDocumentTypes(),
                   meansOfContact:getMeansOfContact()])
    }
    

    def validSubject = {
        log.debug("validSubject - START")
        dhr = session["domesticHelpRequest"]
        bind(dhr)


        session["domesticHelpRequest"] = dhr
        render(view:"frontofficeRequestType/domesticHelpRequest/edit", 
               model:[dhr:dhr, currentTab:'subject', 
                      translationService:translationService, help:getHelp(),
                      documentTypes:getDocumentTypes(),
                      meansOfContact:getMeansOfContact()])
    }

    def validFamilyReferent = {
        log.debug("validFamilyReferent - START")
        dhr = session["domesticHelpRequest"]
        bind(dhr)


        session["domesticHelpRequest"] = dhr
        render(view:"frontofficeRequestType/domesticHelpRequest/edit", 
               model:[dhr:dhr, currentTab:'familyReferent', 
                      translationService:translationService, help:getHelp(),
                      documentTypes:getDocumentTypes(),
                      meansOfContact:getMeansOfContact()])
    }

    def validSpouse = {
        log.debug("validSpouse - START")
        dhr = session["domesticHelpRequest"]
        bind(dhr)


        session["domesticHelpRequest"] = dhr
        render(view:"frontofficeRequestType/domesticHelpRequest/edit", 
               model:[dhr:dhr, currentTab:'spouse', 
                      translationService:translationService, help:getHelp(),
                      documentTypes:getDocumentTypes(),
                      meansOfContact:getMeansOfContact()])
    }

    def validDwelling = {
        log.debug("validDwelling - START")
        dhr = session["domesticHelpRequest"]
        bind(dhr)


        session["domesticHelpRequest"] = dhr
        render(view:"frontofficeRequestType/domesticHelpRequest/edit", 
               model:[dhr:dhr, currentTab:'dwelling', 
                      translationService:translationService, help:getHelp(),
                      documentTypes:getDocumentTypes(),
                      meansOfContact:getMeansOfContact()])
    }

    def validResources = {
        log.debug("validResources - START")
        dhr = session["domesticHelpRequest"]
        bind(dhr)


        session["domesticHelpRequest"] = dhr
        render(view:"frontofficeRequestType/domesticHelpRequest/edit", 
               model:[dhr:dhr, currentTab:'resources', 
                      translationService:translationService, help:getHelp(),
                      documentTypes:getDocumentTypes(),
                      meansOfContact:getMeansOfContact()])
    }

    def validTaxes = {
        log.debug("validTaxes - START")
        dhr = session["domesticHelpRequest"]
        bind(dhr)


        session["domesticHelpRequest"] = dhr
        render(view:"frontofficeRequestType/domesticHelpRequest/edit", 
               model:[dhr:dhr, currentTab:'taxes', 
                      translationService:translationService, help:getHelp(),
                      documentTypes:getDocumentTypes(),
                      meansOfContact:getMeansOfContact()])
    }

    def validDocumentRef = {
        log.debug("validDocumentRef - START")
        dhr = session["domesticHelpRequest"]
        bind(dhr)


        session["domesticHelpRequest"] = dhr
        render(view:"frontofficeRequestType/domesticHelpRequest/edit", 
               model:[dhr:dhr, currentTab:'documentRef', 
                      translationService:translationService, help:getHelp(),
                      documentTypes:getDocumentTypes(),
                      meansOfContact:getMeansOfContact()])
    }

    def validValidationRef = {
        log.debug("validValidationRef - START")
        dhr = session["domesticHelpRequest"]
        bind(dhr)


        dhr.subjectId = SecurityContext.currentEcitizen.id
        domesticHelpRequestService.create(dhr)

        session["domesticHelpRequest"] = dhr
        render(view:"frontofficeRequestType/domesticHelpRequest/edit", 
               model:[dhr:dhr, currentTab:'validationRef', 
                      translationService:translationService, help:getHelp(),
                      documentTypes:getDocumentTypes(),
                      meansOfContact:getMeansOfContact()])
    }

    
    def getMeansOfContact = {
        def result = []
        def meansOfContact = meansOfContactService.getCurrentEcitizenEnabledMeansOfContact()
        meansOfContact.each {
            result.add([
                        key:it.type,
                        label: message(code:"request.meansOfContact." + StringUtils.pascalToCamelCase(it.type.toString()))])
        }
        return result.sort {it.label}
    }
    
    def getDocumentTypes = {
        def requestType = domesticHelpRequestService.getRequestTypeByLabel(domesticHelpRequestService.getLabel())
        def documentTypes = domesticHelpRequestService.getAllowedDocuments(requestType.getId())
        def result = [:]
        documentTypes.each {
            result[it.id] = CapdematUtils.adaptDocumentTypeName(it.name)
        }
        return result
    }
    
    def getHelp = {
        def steps = []

        steps.add("subject")

        steps.add("familyReferent")

        steps.add("spouse")

        steps.add("dwelling")

        steps.add("resources")

        steps.add("taxes")

        steps.add("documentRef")

        steps.add("validationRef")

        def help = [:]
        steps.each {
            help[it] = localAuthorityRegistry.getBufferedCurrentLocalAuthorityRequestHelp("domesticHelpRequest",it)
        }

        return help
    }
    
    def checkConditions = {
    	log.debug("checkConditions - START")
    	def conditions = new HashMap();
    	params.each {
    		if (it.key.contains("cn_")) {
    			conditions.put(it.value, new HashMap())
    		}	
    	}
    	params.each {
    	  def currentParam = it
    	  conditions.each {
    	    if (currentParam.key.contains(it.key) && !currentParam.key.contains("cn_")) {
    	      def triggerName = currentParam.key.substring(currentParam.key.indexOf("_") + 1, currentParam.key.length())
    	      conditions.get(it.key).put(triggerName, currentParam.value)
    	    }
    	  }
    	}
    	def args = [conditions]
    	render domesticHelpRequestService.invokeMethod("areConditionsFilled", args as Object[])
    }
    
}