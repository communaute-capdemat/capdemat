package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum SituationFamilialeType {

    CELIBATAIRE("Celibataire"),
    MARIE("Marie"),
    CONCUBINAGE("Concubinage"),
    AUTRE("Autre");


    /**
     * only for backward use SituationFamilialeType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static SituationFamilialeType[] allSituationFamilialeTypes = SituationFamilialeType.values();

    private String legacyLabel;

    private SituationFamilialeType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static SituationFamilialeType getDefaultSituationFamilialeType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of SituationFamilialeType.something
     * not the value of the name attribut.
     */
    public static SituationFamilialeType forString(final String enumAsString) {
        for (SituationFamilialeType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultSituationFamilialeType();
    }
}
