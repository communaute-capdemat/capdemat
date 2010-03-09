package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum ChoixProjetDeVieType {

    OUI("Oui"),
    AIDE("Aide"),
    NON("Non");


    /**
     * only for backward use ChoixProjetDeVieType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static ChoixProjetDeVieType[] allChoixProjetDeVieTypes = ChoixProjetDeVieType.values();

    private String legacyLabel;

    private ChoixProjetDeVieType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static ChoixProjetDeVieType getDefaultChoixProjetDeVieType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of ChoixProjetDeVieType.something
     * not the value of the name attribut.
     */
    public static ChoixProjetDeVieType forString(final String enumAsString) {
        for (ChoixProjetDeVieType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultChoixProjetDeVieType();
    }
}
