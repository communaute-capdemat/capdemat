package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum MyrSituationFamilialeType {

    CELIBATAIRE("Celibataire"),
    MARIE("Marie"),
    CONCUBINAGE("Concubinage"),
    AUTRE("Autre");


    /**
     * only for backward use MyrSituationFamilialeType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static MyrSituationFamilialeType[] allMyrSituationFamilialeTypes = MyrSituationFamilialeType.values();

    private String legacyLabel;

    private MyrSituationFamilialeType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static MyrSituationFamilialeType getDefaultMyrSituationFamilialeType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of MyrSituationFamilialeType.something
     * not the value of the name attribut.
     */
    public static MyrSituationFamilialeType forString(final String enumAsString) {
        for (MyrSituationFamilialeType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultMyrSituationFamilialeType();
    }
}
