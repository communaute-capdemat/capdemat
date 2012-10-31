package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum MyrSituationAutreType {

    ETABLISSEMENT_MEDICO_SOCIAL("EtablissementMedicoSocial"),
    HOSPITALISE("Hospitalise"),
    AUTRE("Autre");


    /**
     * only for backward use MyrSituationAutreType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static MyrSituationAutreType[] allMyrSituationAutreTypes = MyrSituationAutreType.values();

    private String legacyLabel;

    private MyrSituationAutreType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static MyrSituationAutreType getDefaultMyrSituationAutreType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of MyrSituationAutreType.something
     * not the value of the name attribut.
     */
    public static MyrSituationAutreType forString(final String enumAsString) {
        for (MyrSituationAutreType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultMyrSituationAutreType();
    }
}
