package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum LogementType {

    LOCATAIRE("Locataire"),
    PROPRIETAIRE("Proprietaire"),
    HEBERGE("Heberge"),
    AUTRE("Autre");


    /**
     * only for backward use LogementType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static LogementType[] allLogementTypes = LogementType.values();

    private String legacyLabel;

    private LogementType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static LogementType getDefaultLogementType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of LogementType.something
     * not the value of the name attribut.
     */
    public static LogementType forString(final String enumAsString) {
        for (LogementType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultLogementType();
    }
}
