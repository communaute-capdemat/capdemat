package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum MyrChoixSituationProfessionnelleType {

    SALARIE("Salarie"),
    STAGIAIRE("Stagiaire"),
    NONSALARIE("Nonsalarie"),
    DEMANDEUR("Demandeur"),
    RETRAITE("Retraite"),
    PENSION("Pension"),
    AUTRE("Autre");


    /**
     * only for backward use MyrChoixSituationProfessionnelleType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static MyrChoixSituationProfessionnelleType[] allMyrChoixSituationProfessionnelleTypes = MyrChoixSituationProfessionnelleType.values();

    private String legacyLabel;

    private MyrChoixSituationProfessionnelleType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static MyrChoixSituationProfessionnelleType getDefaultMyrChoixSituationProfessionnelleType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of MyrChoixSituationProfessionnelleType.something
     * not the value of the name attribut.
     */
    public static MyrChoixSituationProfessionnelleType forString(final String enumAsString) {
        for (MyrChoixSituationProfessionnelleType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultMyrChoixSituationProfessionnelleType();
    }
}
