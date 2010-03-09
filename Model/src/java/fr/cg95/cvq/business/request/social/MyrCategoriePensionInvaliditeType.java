package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum MyrCategoriePensionInvaliditeType {

    UN("Un"),
    DEUX("Deux"),
    TROIS("Trois");


    /**
     * only for backward use MyrCategoriePensionInvaliditeType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static MyrCategoriePensionInvaliditeType[] allMyrCategoriePensionInvaliditeTypes = MyrCategoriePensionInvaliditeType.values();

    private String legacyLabel;

    private MyrCategoriePensionInvaliditeType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static MyrCategoriePensionInvaliditeType getDefaultMyrCategoriePensionInvaliditeType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of MyrCategoriePensionInvaliditeType.something
     * not the value of the name attribut.
     */
    public static MyrCategoriePensionInvaliditeType forString(final String enumAsString) {
        for (MyrCategoriePensionInvaliditeType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultMyrCategoriePensionInvaliditeType();
    }
}
