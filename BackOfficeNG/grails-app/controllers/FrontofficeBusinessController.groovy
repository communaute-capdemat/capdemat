import fr.cg95.cvq.security.SecurityContext
import fr.cg95.cvq.service.request.IRequestSearchService
import fr.cg95.cvq.util.Critere
import grails.converters.JSON
import fr.cg95.cvq.business.request.Request
import fr.cg95.cvq.business.request.RequestState
import fr.cg95.cvq.service.request.external.IRequestExternalService
import fr.cg95.cvq.service.request.IRequestNoteService
import fr.cg95.cvq.service.request.IRequestTypeService
import fr.cg95.cvq.util.translation.ITranslationService
import fr.cg95.cvq.service.authority.ILocalAuthorityRegistry
import fr.cg95.cvq.service.authority.LocalAuthorityConfigurationBean

class FrontofficeBusinessController {

    def homeFolderId
    def currentEcitizen
    IRequestSearchService requestSearchService
    RequestAdaptorService requestAdaptorService
    IRequestExternalService requestExternalService
    IRequestNoteService requestNoteService
    IRequestTypeService requestTypeService
    ITranslationService translationService
    ILocalAuthorityRegistry localAuthorityRegistry

    def beforeInterceptor = {
        homeFolderId = SecurityContext.getCurrentEcitizen().getHomeFolder().id
        session["menu"] = "business"
    }

    def index = {
        def state = [:]
        currentEcitizen = SecurityContext.getCurrentEcitizen()

        def themes = []
        getServices().each {
          it.loadAccountExternalInformations(currentEcitizen.getHomeFolder().getId()).each { th ->
            themes.add([
              'label': th.key.right,
              'externalServiceLabel': it.getLabel(),
              'code': th.key.left,
              'content': th.value
            ])
          }
        }
        return ([
            'themes': themes
        ]);
    }

    def theme = {
        currentEcitizen = SecurityContext.getCurrentEcitizen()
        def externalService = params.externalServiceLabel
        def theme = params.code
        def themeTitle = ''

        def extService = null
        getServices().each {
            if(it.getLabel() == externalService)
              extService = it
        }

        def themeInfos = [];
        extService.loadAccountExternalInformations(homeFolderId).each { k, v ->
          if(k.left.equalsIgnoreCase(theme)) {
            themeTitle = k.right
            themeInfos = v
          }
        }

        return([
            'title': themeTitle
          , 'infos': themeInfos
        ])
    }

    private getServices = {
      return localAuthorityRegistry
        .getLocalAuthorityBeanByName(SecurityContext.getCurrentSite().getName())
        .getExternalServices().findAll {
          k,v -> v.getProperty("businessInformationProvider") == "true"
        }.keySet()
    }
}
