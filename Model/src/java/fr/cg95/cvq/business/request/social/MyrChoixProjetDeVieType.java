package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum MyrChoixProjetDeVieType {

    OUI("Oui"),
    AIDE("Aide"),
    NON("Non");


    /**
     * only for backward use MyrChoixProjetDeVieType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static MyrChoixProjetDeVieType[] allMyrChoixProjetDeVieTypes = MyrChoixProjetDeVieType.values();

    private String legacyLabel;

    private MyrChoixProjetDeVieType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static MyrChoixProjetDeVieType getDefaultMyrChoixProjetDeVieType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of MyrChoixProjetDeVieType.something
     * not the value of the name attribut.
     */
    public static MyrChoixProjetDeVieType forString(final String enumAsString) {
        for (MyrChoixProjetDeVieType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultMyrChoixProjetDeVieType();
    }
}
