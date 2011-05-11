package fr.cg95.cvq.business.request.civil;

/**
 * Generated class file, do not edit !
 */
public enum CscQualiteDemandeurType {

    TITULAIRE("Titulaire"),
    CONJOINT("Conjoint"),
    PARENT("Parent"),
    ENFANT("Enfant"),
    GRAND_PARENT("GrandParent"),
    HERITIER_FAMILLE("HeritierFamille"),
    HERITIER("Heritier"),
    AUTRE_LIEN_PARENTE("AutreLienParente"),
    AUTRE_CAS("AutreCas");


    /**
     * only for backward use CscQualiteDemandeurType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static CscQualiteDemandeurType[] allCscQualiteDemandeurTypes = CscQualiteDemandeurType.values();

    private String legacyLabel;

    private CscQualiteDemandeurType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static CscQualiteDemandeurType getDefaultCscQualiteDemandeurType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of CscQualiteDemandeurType.something
     * not the value of the name attribut.
     */
    public static CscQualiteDemandeurType forString(final String enumAsString) {
        for (CscQualiteDemandeurType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultCscQualiteDemandeurType();
    }
}
