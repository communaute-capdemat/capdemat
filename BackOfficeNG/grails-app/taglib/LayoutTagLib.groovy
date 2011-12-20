import fr.cg95.cvq.business.authority.LocalAuthorityResource
import fr.cg95.cvq.business.authority.LocalAuthorityResource.Type
import fr.cg95.cvq.business.authority.LocalAuthorityResource.Version
import fr.cg95.cvq.service.authority.ILocalAuthorityRegistry

import fr.cg95.cvq.security.SecurityContext

class LayoutTagLib {

    def localAuthorityRegistry

    def externalLayout = { attrs, body ->
    
        // Hack : Set manually SecurityContext
        def localAuthority = localAuthorityRegistry.getLocalAuthorityByServerName(request.serverName)
        SecurityContext.setCurrentSite(localAuthority, SecurityContext.FRONT_OFFICE_CONTEXT)
        def file = localAuthorityRegistry.getLocalAuthorityResourceFile(
            Type.HTML, 'externalLayout', Version.CURRENT, true)
        SecurityContext.resetCurrentSite()

        def layout = file.text
        layout = layout.replace('#[RESOURCE]', attrs.resource)
                       .replace('#[HEADER]', attrs.header)
                       .replace('#[BODY]', attrs.body)
                       .replace('#[MENU]', attrs.menu)

        out << body() << layout
    }

}
