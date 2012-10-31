package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum OrientationSouhaiteeType {

    ACCUEILJOUR("Accueiljour"),
    HEBERGEMENTNUIT("Hebergementnuit"),
    HEBERGEMENTPERMANENT("Hebergementpermanent"),
    ACCOMPAGNEMENT("Accompagnement"),
    AUTRES("Autres");


    /**
     * only for backward use OrientationSouhaiteeType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static OrientationSouhaiteeType[] allOrientationSouhaiteeTypes = OrientationSouhaiteeType.values();

    private String legacyLabel;

    private OrientationSouhaiteeType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static OrientationSouhaiteeType getDefaultOrientationSouhaiteeType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of OrientationSouhaiteeType.something
     * not the value of the name attribut.
     */
    public static OrientationSouhaiteeType forString(final String enumAsString) {
        for (OrientationSouhaiteeType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultOrientationSouhaiteeType();
    }
}
