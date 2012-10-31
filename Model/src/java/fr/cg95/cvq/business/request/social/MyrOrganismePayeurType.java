package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum MyrOrganismePayeurType {

    CAF("Caf"),
    MSA("Msa"),
    AUTRE("Autre");


    /**
     * only for backward use MyrOrganismePayeurType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static MyrOrganismePayeurType[] allMyrOrganismePayeurTypes = MyrOrganismePayeurType.values();

    private String legacyLabel;

    private MyrOrganismePayeurType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static MyrOrganismePayeurType getDefaultMyrOrganismePayeurType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of MyrOrganismePayeurType.something
     * not the value of the name attribut.
     */
    public static MyrOrganismePayeurType forString(final String enumAsString) {
        for (MyrOrganismePayeurType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultMyrOrganismePayeurType();
    }
}
