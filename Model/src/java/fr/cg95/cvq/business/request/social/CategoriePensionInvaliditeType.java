package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum CategoriePensionInvaliditeType {

    UN("Un"),
    DEUX("Deux"),
    TROIS("Trois");


    /**
     * only for backward use CategoriePensionInvaliditeType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static CategoriePensionInvaliditeType[] allCategoriePensionInvaliditeTypes = CategoriePensionInvaliditeType.values();

    private String legacyLabel;

    private CategoriePensionInvaliditeType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static CategoriePensionInvaliditeType getDefaultCategoriePensionInvaliditeType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of CategoriePensionInvaliditeType.something
     * not the value of the name attribut.
     */
    public static CategoriePensionInvaliditeType forString(final String enumAsString) {
        for (CategoriePensionInvaliditeType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultCategoriePensionInvaliditeType();
    }
}
