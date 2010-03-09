package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class CategoriePensionInvaliditeType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final CategoriePensionInvaliditeType UN = new CategoriePensionInvaliditeType("Un");
  
    public static final CategoriePensionInvaliditeType DEUX = new CategoriePensionInvaliditeType("Deux");
  
    public static final CategoriePensionInvaliditeType TROIS = new CategoriePensionInvaliditeType("Trois");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private CategoriePensionInvaliditeType(String value) {
        super(value);
    }

    public CategoriePensionInvaliditeType() {}

    public static CategoriePensionInvaliditeType[] allCategoriePensionInvaliditeTypes = {
        UN,
        DEUX,
        TROIS
    };

    public static CategoriePensionInvaliditeType getDefaultCategoriePensionInvaliditeType() {
        return null;
    }

    public static CategoriePensionInvaliditeType forString(final String enumAsString) {
        for (CategoriePensionInvaliditeType value : allCategoriePensionInvaliditeTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultCategoriePensionInvaliditeType();
    }
}
