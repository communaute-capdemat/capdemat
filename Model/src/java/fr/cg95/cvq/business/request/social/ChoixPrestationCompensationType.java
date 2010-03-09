package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum ChoixPrestationCompensationType {

    PCH("Pch"),
    ACTP("Actp"),
    ACFP("Acfp");


    /**
     * only for backward use ChoixPrestationCompensationType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static ChoixPrestationCompensationType[] allChoixPrestationCompensationTypes = ChoixPrestationCompensationType.values();

    private String legacyLabel;

    private ChoixPrestationCompensationType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static ChoixPrestationCompensationType getDefaultChoixPrestationCompensationType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of ChoixPrestationCompensationType.something
     * not the value of the name attribut.
     */
    public static ChoixPrestationCompensationType forString(final String enumAsString) {
        for (ChoixPrestationCompensationType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultChoixPrestationCompensationType();
    }
}
