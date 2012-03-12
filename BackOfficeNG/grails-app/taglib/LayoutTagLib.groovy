import fr.cg95.cvq.business.authority.LocalAuthorityResource
import fr.cg95.cvq.business.authority.LocalAuthorityResource.Type
import fr.cg95.cvq.business.authority.LocalAuthorityResource.Version
import fr.cg95.cvq.service.authority.ILocalAuthorityRegistry

import fr.cg95.cvq.security.SecurityContext

class LayoutTagLib {
    def localAuthorityRegistry

    def layoutFO = { attrs ->
        // Hack: set manually SecurityContext
        def localAuthority = localAuthorityRegistry.getLocalAuthorityByServerName(request.serverName)
        SecurityContext.setCurrentSite(localAuthority, SecurityContext.FRONT_OFFICE_CONTEXT)
        def file = localAuthorityRegistry.getLocalAuthorityResourceFile(
            Type.HTML,
            'templates/fo/default', // .html is appended later.
            Version.CURRENT,
            true)
        SecurityContext.resetCurrentSite()

        def layout = file.text
        layout = layout.replace('#[HEAD]', attrs.head)
                       .replace('#[HEADER]', attrs.header)
                       .replace('#[LOGIN]', attrs.login)
                       .replace('#[NAV]', attrs.nav)
                       .replace('#[CONTENTS]', attrs.contents)
                       .replace('#[FOOTER]', attrs.footer)

        out << layout
    }
}
