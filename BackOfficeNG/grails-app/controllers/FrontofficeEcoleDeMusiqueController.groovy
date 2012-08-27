import fr.cg95.cvq.service.request.leisure.IEcoleDeMusiqueRequestService;
import grails.converters.JSON

class FrontofficeEcoleDeMusiqueController {

    IEcoleDeMusiqueRequestService ecoleDeMusiqueRequestService

    def siteProduit = {
        render(
            ecoleDeMusiqueRequestService.getSiteProduit(params.long('requestId'),params.long('userId'))
        as JSON)
    }

}
