package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum ChoixSituationProfessionnelleType {

    SALARIE("Salarie"),
    STAGIAIRE("Stagiaire"),
    NONSALARIE("Nonsalarie"),
    DEMANDEUR("Demandeur"),
    RETRAITE("Retraite"),
    PENSION("Pension"),
    AUTRE("Autre");


    /**
     * only for backward use ChoixSituationProfessionnelleType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static ChoixSituationProfessionnelleType[] allChoixSituationProfessionnelleTypes = ChoixSituationProfessionnelleType.values();

    private String legacyLabel;

    private ChoixSituationProfessionnelleType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static ChoixSituationProfessionnelleType getDefaultChoixSituationProfessionnelleType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of ChoixSituationProfessionnelleType.something
     * not the value of the name attribut.
     */
    public static ChoixSituationProfessionnelleType forString(final String enumAsString) {
        for (ChoixSituationProfessionnelleType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultChoixSituationProfessionnelleType();
    }
}
