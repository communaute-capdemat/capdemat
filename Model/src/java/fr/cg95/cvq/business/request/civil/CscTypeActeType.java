package fr.cg95.cvq.business.request.civil;

/**
 * Generated class file, do not edit !
 */
public enum CscTypeActeType {

    NAISSANCE("Naissance"),
    DECES("Deces"),
    MARIAGE("Mariage");


    /**
     * only for backward use CscTypeActeType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static CscTypeActeType[] allCscTypeActeTypes = CscTypeActeType.values();

    private String legacyLabel;

    private CscTypeActeType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static CscTypeActeType getDefaultCscTypeActeType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of CscTypeActeType.something
     * not the value of the name attribut.
     */
    public static CscTypeActeType forString(final String enumAsString) {
        for (CscTypeActeType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultCscTypeActeType();
    }
}
