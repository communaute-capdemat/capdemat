package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum SituationAutreType {

    ETABLISSEMENT_MEDICO_SOCIAL("EtablissementMedicoSocial"),
    HOSPITALISE("Hospitalise"),
    AUTRE("Autre");


    /**
     * only for backward use SituationAutreType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static SituationAutreType[] allSituationAutreTypes = SituationAutreType.values();

    private String legacyLabel;

    private SituationAutreType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static SituationAutreType getDefaultSituationAutreType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of SituationAutreType.something
     * not the value of the name attribut.
     */
    public static SituationAutreType forString(final String enumAsString) {
        for (SituationAutreType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultSituationAutreType();
    }
}
