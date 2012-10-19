import java.text.ParseException

import org.apache.commons.codec.binary.Base64
import org.apache.commons.lang.StringUtils
import org.apache.commons.validator.GenericValidator
import fr.cg95.cvq.business.users.xml.IndividualXml
import fr.cg95.cvq.business.users.xml.ListIndividualXml
import fr.cg95.cvq.external.IExternalService
import fr.cg95.cvq.security.SecurityContext
import fr.cg95.cvq.service.users.IUserSearchService
import fr.cg95.cvq.service.users.external.IExternalUserService
import fr.cg95.cvq.util.DateUtils
import grails.converters.XML

class ServiceExternalUserController {

    IUserSearchService userSearchService
    IExternalUserService externalUserService
    IExternalService externalService

    String externalProviderLabel

    def beforeInterceptor = {
        def authorization = request.getHeader("Authorization")
        if (authorization == null) {
            response.setHeader('WWW-Authenticate', 'Basic')
            render(text: '', status: 401)
            return false
        }

        def credentials = StringUtils.split(new String(Base64.decodeBase64(authorization.substring(6).bytes), "8859_1"), ":")
        if (credentials == null || credentials.length < 2
                || !externalService.authenticate(credentials[0], credentials[1])) {
            response.setHeader('WWW-Authenticate', 'Basic')
            render(text: '', status: 401)
            return false
        }

        SecurityContext.setCurrentContext(SecurityContext.EXTERNAL_SERVICE_CONTEXT)
        externalProviderLabel = externalService.getExternalServiceByLogin(credentials[0]).getLabel()
        SecurityContext.setCurrentExternalService(externalProviderLabel)
    }

    // Return one user from its capdematId
    def findUser = {

        def externalUserId = params.externalId
        if (externalUserId == null) {
            render  text: "Valid user id must be provided",
                    status: 400
            return false
        }

        def user = externalUserService.getIndividualByCapdematId(externalProviderLabel, externalUserId)

        if (user == null) {
            render  text: "No user found for this id",
                    status: 404
        } else {
            render  text: IndividualXml.toXml(user, externalUserId) as XML,
                    contentType: 'text/xml', encoding: 'UTF-8'
        }
    }

    // Return users list with their capdematIds
    def list = {

        externalUserService.generateAllCapdematId(externalProviderLabel);
        def startDate = params.since_date

        if (startDate != null) {

            def acceptedDateFormat = "dd/MM/yyyy";
            if (GenericValidator.isDate(startDate, acceptedDateFormat, true)) {
                listUsersSinceDate(startDate)
            }  else {
                render  text: "Unable to parse since_date (format: "+acceptedDateFormat+")",
                status: 409
            }

        } else {
            listAllUsers()
        }
    }

    private listUsersSinceDate(String startDate) {
       def editedUsers = externalUserService.listEditedUsers(startDate, externalProviderLabel).collect { toXml(it) }
       def deletedUsers = externalUserService.listDeletedUsers(startDate, externalProviderLabel).collect { toXml(it) }
       def createdUsers = externalUserService.listCreatedUsers(startDate, externalProviderLabel).collect { toXml(it) }

       render  text: new ListIndividualXml(createdUsers, editedUsers, deletedUsers) as XML,
               contentType: 'text/xml', encoding: 'UTF-8'
    }

    private listAllUsers() {
        def allUsers = externalUserService.listAllUsers(externalProviderLabel).collect { toXml(it) }

        render  text: allUsers as XML,
                contentType: 'text/xml', encoding: 'UTF-8'
    }

    private def toXml = { IndividualXml.toXml(it) }
}