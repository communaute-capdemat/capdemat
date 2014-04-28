import fr.cg95.cvq.service.request.school.IGlobalSchoolRegistrationRequestService
import grails.converters.JSON

class FrontofficeGlobalSchoolRegistrationController {

    IGlobalSchoolRegistrationRequestService globalSchoolRegistrationRequestService

    def schoolSectors = {
        def schools = globalSchoolRegistrationRequestService.getSchools(Long.valueOf(params.childId))
        schools = (schools != null && schools.get("schoolSectors") != null) ? Collections.emptyMap() : schools.get("schoolSectors")

        render(
          schools
        as JSON)
    }

    def schoolDerogs = {
        def schools = globalSchoolRegistrationRequestService.getSchools(Long.valueOf(params.childId))
        schools = (schools != null && schools.get("schoolDerogs") != null) ? schools.get("schoolDerogs") : Collections.emptyMap()

        render(
          schools
        as JSON)
    }
}
