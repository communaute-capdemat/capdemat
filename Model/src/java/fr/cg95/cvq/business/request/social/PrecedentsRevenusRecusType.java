package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum PrecedentsRevenusRecusType {

    ACTIVITE("Activite"),
    ESAT("Esat"),
    INDEMNITES("Indemnites");


    /**
     * only for backward use PrecedentsRevenusRecusType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static PrecedentsRevenusRecusType[] allPrecedentsRevenusRecusTypes = PrecedentsRevenusRecusType.values();

    private String legacyLabel;

    private PrecedentsRevenusRecusType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static PrecedentsRevenusRecusType getDefaultPrecedentsRevenusRecusType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of PrecedentsRevenusRecusType.something
     * not the value of the name attribut.
     */
    public static PrecedentsRevenusRecusType forString(final String enumAsString) {
        for (PrecedentsRevenusRecusType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultPrecedentsRevenusRecusType();
    }
}
