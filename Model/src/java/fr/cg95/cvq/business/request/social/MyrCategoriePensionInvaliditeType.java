package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class MyrCategoriePensionInvaliditeType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final MyrCategoriePensionInvaliditeType UN = new MyrCategoriePensionInvaliditeType("Un");
  
    public static final MyrCategoriePensionInvaliditeType DEUX = new MyrCategoriePensionInvaliditeType("Deux");
  
    public static final MyrCategoriePensionInvaliditeType TROIS = new MyrCategoriePensionInvaliditeType("Trois");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private MyrCategoriePensionInvaliditeType(String value) {
        super(value);
    }

    public MyrCategoriePensionInvaliditeType() {}

    public static MyrCategoriePensionInvaliditeType[] allMyrCategoriePensionInvaliditeTypes = {
        UN,
        DEUX,
        TROIS
    };

    public static MyrCategoriePensionInvaliditeType getDefaultMyrCategoriePensionInvaliditeType() {
        return null;
    }

    public static MyrCategoriePensionInvaliditeType forString(final String enumAsString) {
        for (MyrCategoriePensionInvaliditeType value : allMyrCategoriePensionInvaliditeTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultMyrCategoriePensionInvaliditeType();
    }
}
