package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum NationaliteAvecSuisseType {

    FRANCAISE("Francaise"),
    EEESUISSE("Eeesuisse"),
    AUTRE("Autre");


    /**
     * only for backward use NationaliteAvecSuisseType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static NationaliteAvecSuisseType[] allNationaliteAvecSuisseTypes = NationaliteAvecSuisseType.values();

    private String legacyLabel;

    private NationaliteAvecSuisseType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static NationaliteAvecSuisseType getDefaultNationaliteAvecSuisseType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of NationaliteAvecSuisseType.something
     * not the value of the name attribut.
     */
    public static NationaliteAvecSuisseType forString(final String enumAsString) {
        for (NationaliteAvecSuisseType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultNationaliteAvecSuisseType();
    }
}
