package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum RepresentantLegalType {

    TUTELLE("Tutelle"),
    CURATELLE_SIMPLE("CuratelleSimple"),
    CURATELLE_RENFORCEE("CuratelleRenforcee"),
    AUTRE("Autre");


    /**
     * only for backward use RepresentantLegalType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static RepresentantLegalType[] allRepresentantLegalTypes = RepresentantLegalType.values();

    private String legacyLabel;

    private RepresentantLegalType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static RepresentantLegalType getDefaultRepresentantLegalType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of RepresentantLegalType.something
     * not the value of the name attribut.
     */
    public static RepresentantLegalType forString(final String enumAsString) {
        for (RepresentantLegalType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultRepresentantLegalType();
    }
}
