package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum MyrChoixPrestationCompensationType {

    PCH("Pch"),
    ACTP("Actp"),
    ACFP("Acfp");


    /**
     * only for backward use MyrChoixPrestationCompensationType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static MyrChoixPrestationCompensationType[] allMyrChoixPrestationCompensationTypes = MyrChoixPrestationCompensationType.values();

    private String legacyLabel;

    private MyrChoixPrestationCompensationType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static MyrChoixPrestationCompensationType getDefaultMyrChoixPrestationCompensationType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of MyrChoixPrestationCompensationType.something
     * not the value of the name attribut.
     */
    public static MyrChoixPrestationCompensationType forString(final String enumAsString) {
        for (MyrChoixPrestationCompensationType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultMyrChoixPrestationCompensationType();
    }
}
