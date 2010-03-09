package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum SituationActuelleType {

    ACCUEILJOUR("Accueiljour"),
    HEBERGEMENTNUIT("Hebergementnuit"),
    HEBERGEMENTPERMANENT("Hebergementpermanent"),
    ACCOMPAGNEMENT("Accompagnement"),
    AUTRES("Autres");


    /**
     * only for backward use SituationActuelleType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static SituationActuelleType[] allSituationActuelleTypes = SituationActuelleType.values();

    private String legacyLabel;

    private SituationActuelleType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static SituationActuelleType getDefaultSituationActuelleType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of SituationActuelleType.something
     * not the value of the name attribut.
     */
    public static SituationActuelleType forString(final String enumAsString) {
        for (SituationActuelleType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultSituationActuelleType();
    }
}
