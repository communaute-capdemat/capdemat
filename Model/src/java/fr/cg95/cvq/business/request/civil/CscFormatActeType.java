package fr.cg95.cvq.business.request.civil;

/**
 * Generated class file, do not edit !
 */
public enum CscFormatActeType {

    COPIE_INTEGRALE("CopieIntegrale"),
    AVEC_FILIATION("AvecFiliation"),
    SANS_FILIATION("SansFiliation"),
    PLURILINGUE("Plurilingue");


    /**
     * only for backward use CscFormatActeType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static CscFormatActeType[] allCscFormatActeTypes = CscFormatActeType.values();

    private String legacyLabel;

    private CscFormatActeType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static CscFormatActeType getDefaultCscFormatActeType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of CscFormatActeType.something
     * not the value of the name attribut.
     */
    public static CscFormatActeType forString(final String enumAsString) {
        for (CscFormatActeType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultCscFormatActeType();
    }
}
