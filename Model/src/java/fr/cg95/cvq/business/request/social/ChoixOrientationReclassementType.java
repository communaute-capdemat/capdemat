package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class ChoixOrientationReclassementType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final ChoixOrientationReclassementType FORMATION = new ChoixOrientationReclassementType("Formation");
  
    public static final ChoixOrientationReclassementType ORDINAIRE = new ChoixOrientationReclassementType("Ordinaire");
  
    public static final ChoixOrientationReclassementType PROTEGE = new ChoixOrientationReclassementType("Protege");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private ChoixOrientationReclassementType(String value) {
        super(value);
    }

    public ChoixOrientationReclassementType() {}

    public static ChoixOrientationReclassementType[] allChoixOrientationReclassementTypes = {
        FORMATION,
        ORDINAIRE,
        PROTEGE
    };

    public static ChoixOrientationReclassementType getDefaultChoixOrientationReclassementType() {
        return null;
    }

    public static ChoixOrientationReclassementType forString(final String enumAsString) {
        for (ChoixOrientationReclassementType value : allChoixOrientationReclassementTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultChoixOrientationReclassementType();
    }
}
