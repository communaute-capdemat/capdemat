import fr.cg95.cvq.service.request.external.IRequestExternalService
import fr.cg95.cvq.service.request.leisure.external.IActivityRegistrationProviderService
import fr.cg95.cvq.service.users.IUserSearchService
import grails.converters.JSON

class FrontofficeHoranetController {
    def IRequestExternalService requestExternalService
    def IUserSearchService userSearchService

    def sites = {
        def sites = [:]
        def service = requestExternalService.getExternalServiceByRequestType(params.requestTypeLabel)

        if (service instanceof IActivityRegistrationProviderService) {
            def individual = userSearchService.getById(params.long('subjectId'))
            service = (IActivityRegistrationProviderService)service

            sites = service.getSites(individual)
        }

        render(sites as JSON)
    }

    def products = {
        def products = [:]
        def service = requestExternalService.getExternalServiceByRequestType(params.requestTypeLabel)

        if (service instanceof IActivityRegistrationProviderService) {
            def individual = userSearchService.getById(params.long('subjectId'))
            service = (IActivityRegistrationProviderService)service

            products = service.getProducts(individual, params.siteId)
        }

        render(products as JSON)
    }

    def segments = {
        def segments = [:]
        def service = requestExternalService.getExternalServiceByRequestType(params.requestTypeLabel)

        if (service instanceof IActivityRegistrationProviderService &&
            params.productType.equals("1")) {
            def individual = userSearchService.getById(params.long('subjectId'))
            service = (IActivityRegistrationProviderService)service

            segments = service.getSegments(individual, params.siteId, params.productId)
        }

        render(segments as JSON)
    }
}
