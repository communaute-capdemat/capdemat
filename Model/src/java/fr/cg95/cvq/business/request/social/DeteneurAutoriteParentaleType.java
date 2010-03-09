package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class DeteneurAutoriteParentaleType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final DeteneurAutoriteParentaleType MERE = new DeteneurAutoriteParentaleType("Mere");
  
    public static final DeteneurAutoriteParentaleType PERE = new DeteneurAutoriteParentaleType("Pere");
  
    public static final DeteneurAutoriteParentaleType LES_DEUX = new DeteneurAutoriteParentaleType("LesDeux");
  
    public static final DeteneurAutoriteParentaleType AUTRE = new DeteneurAutoriteParentaleType("Autre");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private DeteneurAutoriteParentaleType(String value) {
        super(value);
    }

    public DeteneurAutoriteParentaleType() {}

    public static DeteneurAutoriteParentaleType[] allDeteneurAutoriteParentaleTypes = {
        MERE,
        PERE,
        LES_DEUX,
        AUTRE
    };

    public static DeteneurAutoriteParentaleType getDefaultDeteneurAutoriteParentaleType() {
        return null;
    }

    public static DeteneurAutoriteParentaleType forString(final String enumAsString) {
        for (DeteneurAutoriteParentaleType value : allDeteneurAutoriteParentaleTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultDeteneurAutoriteParentaleType();
    }
}
