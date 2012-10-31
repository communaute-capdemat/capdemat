package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum DeteneurAutoriteParentaleType {

    MERE("Mere"),
    PERE("Pere"),
    LES_DEUX("LesDeux"),
    AUTRE("Autre");


    /**
     * only for backward use DeteneurAutoriteParentaleType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static DeteneurAutoriteParentaleType[] allDeteneurAutoriteParentaleTypes = DeteneurAutoriteParentaleType.values();

    private String legacyLabel;

    private DeteneurAutoriteParentaleType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static DeteneurAutoriteParentaleType getDefaultDeteneurAutoriteParentaleType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of DeteneurAutoriteParentaleType.something
     * not the value of the name attribut.
     */
    public static DeteneurAutoriteParentaleType forString(final String enumAsString) {
        for (DeteneurAutoriteParentaleType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultDeteneurAutoriteParentaleType();
    }
}
