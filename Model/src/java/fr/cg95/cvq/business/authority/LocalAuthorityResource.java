/**
 * 
 */
package fr.cg95.cvq.business.authority;

import java.util.Hashtable;

import fr.cg95.cvq.service.authority.ILocalAuthorityRegistry;

/**
 * Represents a file that can be customized on a local authority basis
 *
 * @author jsb
 *
 */
public class LocalAuthorityResource {

    public static enum Version {
        CURRENT,
        OLD,
        TEMP
    }

    public static final Hashtable<Version, String> versionExtensions = new Hashtable<Version, String>(3);
    static {
        versionExtensions.put(Version.CURRENT, "");
        versionExtensions.put(Version.OLD, ".old");
        versionExtensions.put(Version.TEMP, ".tmp");
    }

    public static final Hashtable<String, LocalAuthorityResource> localAuthorityResources = new Hashtable<String, LocalAuthorityResource>(10);
    public static final LocalAuthorityResource CSS_FO = new LocalAuthorityResource("cssFo", "cssFo", ".css", ILocalAuthorityRegistry.CSS_ASSETS_RESOURCE_TYPE, false);
    public static final LocalAuthorityResource LOGO_FO = new LocalAuthorityResource("logoFo", "logoFo", ".png", ILocalAuthorityRegistry.IMAGE_ASSETS_RESOURCE_TYPE, false);
    public static final LocalAuthorityResource LOGO_BO = new LocalAuthorityResource("logoBo", "logoBo", ".png", ILocalAuthorityRegistry.IMAGE_ASSETS_RESOURCE_TYPE, false);
    public static final LocalAuthorityResource BANNER = new LocalAuthorityResource("banner", "banner", ".png", ILocalAuthorityRegistry.IMAGE_ASSETS_RESOURCE_TYPE, false);
    public static final LocalAuthorityResource LOGO_PDF = new LocalAuthorityResource("logoPdf", "logoPdf", ".png", ILocalAuthorityRegistry.IMAGE_ASSETS_RESOURCE_TYPE, false);
    public static final LocalAuthorityResource FAQ_FO = new LocalAuthorityResource("faqFo", "faqFo", ".pdf", ILocalAuthorityRegistry.PDF_ASSETS_RESOURCE_TYPE, true);
    public static final LocalAuthorityResource HELP_BO = new LocalAuthorityResource("helpBo", "helpBo", ".pdf", ILocalAuthorityRegistry.PDF_ASSETS_RESOURCE_TYPE, true);
    public static final LocalAuthorityResource HELP_FO = new LocalAuthorityResource("helpFo", "helpFo", ".pdf", ILocalAuthorityRegistry.PDF_ASSETS_RESOURCE_TYPE, true);
    public static final LocalAuthorityResource LEGAL = new LocalAuthorityResource("legal", "legal", ".pdf", ILocalAuthorityRegistry.PDF_ASSETS_RESOURCE_TYPE, false);
    public static final LocalAuthorityResource USE = new LocalAuthorityResource("use", "use", ".pdf", ILocalAuthorityRegistry.PDF_ASSETS_RESOURCE_TYPE, false);

    private String id;
    private String filename;
    private String extension;
    private String resourceType;
    private boolean canFallback;

    private LocalAuthorityResource() {}

    private LocalAuthorityResource(String id, String filename, String extension, String resourceType, boolean canFallback) {
        this.id = id;
        this.filename = filename;
        this.extension = extension;
        this.resourceType = resourceType;
        this.canFallback = canFallback;
        localAuthorityResources.put(id, this);
    }

    public String getId() {
        return id;
    }

    public String getFilename() {
        return filename;
    }

    public String getExtension() {
        return extension;
    }

    public String getResourceType() {
        return resourceType;
    }

    public boolean canFallback() {
        return canFallback;
    }
}