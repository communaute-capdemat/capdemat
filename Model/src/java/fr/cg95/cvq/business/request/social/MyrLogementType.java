package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum MyrLogementType {

    LOCATAIRE("Locataire"),
    PROPRIETAIRE("Proprietaire"),
    HEBERGE("Heberge"),
    AUTRE("Autre");


    /**
     * only for backward use MyrLogementType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static MyrLogementType[] allMyrLogementTypes = MyrLogementType.values();

    private String legacyLabel;

    private MyrLogementType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static MyrLogementType getDefaultMyrLogementType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of MyrLogementType.something
     * not the value of the name attribut.
     */
    public static MyrLogementType forString(final String enumAsString) {
        for (MyrLogementType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultMyrLogementType();
    }
}
