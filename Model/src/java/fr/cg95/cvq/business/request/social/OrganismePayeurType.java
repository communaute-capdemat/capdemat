package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum OrganismePayeurType {

    CAF("Caf"),
    MSA("Msa"),
    AUTRE("Autre");


    /**
     * only for backward use OrganismePayeurType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static OrganismePayeurType[] allOrganismePayeurTypes = OrganismePayeurType.values();

    private String legacyLabel;

    private OrganismePayeurType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static OrganismePayeurType getDefaultOrganismePayeurType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of OrganismePayeurType.something
     * not the value of the name attribut.
     */
    public static OrganismePayeurType forString(final String enumAsString) {
        for (OrganismePayeurType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultOrganismePayeurType();
    }
}
