package fr.cg95.cvq.business.request.social;

/**
 * Generated class file, do not edit !
 */
public enum ChoixOrientationReclassementType {

    FORMATION("Formation"),
    ORDINAIRE("Ordinaire"),
    PROTEGE("Protege");


    /**
     * only for backward use ChoixOrientationReclassementType.values() instead
     * @deprecated only for backward
     */
    @Deprecated 
    public static ChoixOrientationReclassementType[] allChoixOrientationReclassementTypes = ChoixOrientationReclassementType.values();

    private String legacyLabel;

    private ChoixOrientationReclassementType(String legacyLabel){
        this.legacyLabel = legacyLabel;
    }

    public String getLegacyLabel() {
        return legacyLabel;
    }

    public static ChoixOrientationReclassementType getDefaultChoixOrientationReclassementType() {
        return null;
    }

    /**
     * @deprecated use valueOf instead. Watchout! you must provid something of ChoixOrientationReclassementType.something
     * not the value of the name attribut.
     */
    public static ChoixOrientationReclassementType forString(final String enumAsString) {
        for (ChoixOrientationReclassementType value : values())
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultChoixOrientationReclassementType();
    }
}
