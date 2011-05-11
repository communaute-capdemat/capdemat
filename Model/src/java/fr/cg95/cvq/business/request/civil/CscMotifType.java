package fr.cg95.cvq.business.request.civil;

/**
 * Generated class file, do not edit !
 */
public enum CscMotifType {

    CARTE_IDENTITE("CarteIdentite"),
    PASSEPORT("Passeport"),
    CERTIFICAT_NATIONALITE_FRANCAISE("CertificatNationaliteFrancaise"),
    MARIAGE("Mariage"),
    GENEALOGIE("Genealogie"),
    SUCCESSION("Succession"),
    PENSION("Pension"),
    AUTRE("Autre");


    /**
     * only for backward use CscMotifType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static CscMotifType[] allCscMotifTypes = CscMotifType.values();

    private String legacyLabel;

    private CscMotifType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static CscMotifType getDefaultCscMotifType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of CscMotifType.something
     * not the value of the name attribut.
     */
    public static CscMotifType forString(final String enumAsString) {
        for (CscMotifType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultCscMotifType();
    }
}
