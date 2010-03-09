package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class RepresentantLegalType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final RepresentantLegalType TUTELLE = new RepresentantLegalType("Tutelle");
  
    public static final RepresentantLegalType CURATELLE_SIMPLE = new RepresentantLegalType("CuratelleSimple");
  
    public static final RepresentantLegalType CURATELLE_RENFORCEE = new RepresentantLegalType("CuratelleRenforcee");
  
    public static final RepresentantLegalType AUTRE = new RepresentantLegalType("Autre");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private RepresentantLegalType(String value) {
        super(value);
    }

    public RepresentantLegalType() {}

    public static RepresentantLegalType[] allRepresentantLegalTypes = {
        TUTELLE,
        CURATELLE_SIMPLE,
        CURATELLE_RENFORCEE,
        AUTRE
    };

    public static RepresentantLegalType getDefaultRepresentantLegalType() {
        return null;
    }

    public static RepresentantLegalType forString(final String enumAsString) {
        for (RepresentantLegalType value : allRepresentantLegalTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultRepresentantLegalType();
    }
}
