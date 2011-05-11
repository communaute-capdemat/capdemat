package fr.cg95.cvq.business.request.civil;

/**
 * Generated class file, do not edit !
 */
public enum CscTypeDemandeurType {

    PARTICULIER("Particulier"),
    NOTAIRE("Notaire"),
    AVOCAT("Avocat"),
    ADMINISTRATION("Administration");


    /**
     * only for backward use CscTypeDemandeurType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static CscTypeDemandeurType[] allCscTypeDemandeurTypes = CscTypeDemandeurType.values();

    private String legacyLabel;

    private CscTypeDemandeurType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static CscTypeDemandeurType getDefaultCscTypeDemandeurType() {
        return PARTICULIER;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of CscTypeDemandeurType.something
     * not the value of the name attribut.
     */
    public static CscTypeDemandeurType forString(final String enumAsString) {
        for (CscTypeDemandeurType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultCscTypeDemandeurType();
    }
}
