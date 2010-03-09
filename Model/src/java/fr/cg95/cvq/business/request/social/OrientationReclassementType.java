package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class OrientationReclassementType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final OrientationReclassementType FORMATION = new OrientationReclassementType("Formation");
  
    public static final OrientationReclassementType MILIEU_ORDINAIRE = new OrientationReclassementType("MilieuOrdinaire");
  
    public static final OrientationReclassementType MILIEU_PROTEGE = new OrientationReclassementType("MilieuProtege");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private OrientationReclassementType(String value) {
        super(value);
    }

    public OrientationReclassementType() {}

    public static OrientationReclassementType[] allOrientationReclassementTypes = {
        FORMATION,
        MILIEU_ORDINAIRE,
        MILIEU_PROTEGE
    };

    public static OrientationReclassementType getDefaultOrientationReclassementType() {
        return null;
    }

    public static OrientationReclassementType forString(final String enumAsString) {
        for (OrientationReclassementType value : allOrientationReclassementTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultOrientationReclassementType();
    }
}
