package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class MyrLogementType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final MyrLogementType LOCATAIRE = new MyrLogementType("Locataire");
  
    public static final MyrLogementType PROPRIETAIRE = new MyrLogementType("Proprietaire");
  
    public static final MyrLogementType HEBERGE = new MyrLogementType("Heberge");
  
    public static final MyrLogementType AUTRE = new MyrLogementType("Autre");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private MyrLogementType(String value) {
        super(value);
    }

    public MyrLogementType() {}

    public static MyrLogementType[] allMyrLogementTypes = {
        LOCATAIRE,
        PROPRIETAIRE,
        HEBERGE,
        AUTRE
    };

    public static MyrLogementType getDefaultMyrLogementType() {
        return null;
    }

    public static MyrLogementType forString(final String enumAsString) {
        for (MyrLogementType value : allMyrLogementTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultMyrLogementType();
    }
}
