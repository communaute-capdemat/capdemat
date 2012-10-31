package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum MyrNationaliteAvecSuisseType {

    FRANCAISE("Francaise"),
    EEESUISSE("Eeesuisse"),
    AUTRE("Autre");


    /**
     * only for backward use MyrNationaliteAvecSuisseType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static MyrNationaliteAvecSuisseType[] allMyrNationaliteAvecSuisseTypes = MyrNationaliteAvecSuisseType.values();

    private String legacyLabel;

    private MyrNationaliteAvecSuisseType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static MyrNationaliteAvecSuisseType getDefaultMyrNationaliteAvecSuisseType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of MyrNationaliteAvecSuisseType.something
     * not the value of the name attribut.
     */
    public static MyrNationaliteAvecSuisseType forString(final String enumAsString) {
        for (MyrNationaliteAvecSuisseType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultMyrNationaliteAvecSuisseType();
    }
}
