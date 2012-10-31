package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum PeriodiciteFraisSuppType {

    SEMAINE("Semaine"),
    MOIS("Mois"),
    ANNEE("Annee"),
    OCCASIONNELLE("Occasionnelle");


    /**
     * only for backward use PeriodiciteFraisSuppType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static PeriodiciteFraisSuppType[] allPeriodiciteFraisSuppTypes = PeriodiciteFraisSuppType.values();

    private String legacyLabel;

    private PeriodiciteFraisSuppType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static PeriodiciteFraisSuppType getDefaultPeriodiciteFraisSuppType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of PeriodiciteFraisSuppType.something
     * not the value of the name attribut.
     */
    public static PeriodiciteFraisSuppType forString(final String enumAsString) {
        for (PeriodiciteFraisSuppType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultPeriodiciteFraisSuppType();
    }
}
