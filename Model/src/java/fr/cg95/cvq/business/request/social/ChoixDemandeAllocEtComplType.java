package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class ChoixDemandeAllocEtComplType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final ChoixDemandeAllocEtComplType ALLOCATION = new ChoixDemandeAllocEtComplType("Allocation");
  
    public static final ChoixDemandeAllocEtComplType COMPLÉMENT = new ChoixDemandeAllocEtComplType("Complément");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private ChoixDemandeAllocEtComplType(String value) {
        super(value);
    }

    public ChoixDemandeAllocEtComplType() {}

    public static ChoixDemandeAllocEtComplType[] allChoixDemandeAllocEtComplTypes = {
        ALLOCATION,
        COMPLÉMENT
    };

    public static ChoixDemandeAllocEtComplType getDefaultChoixDemandeAllocEtComplType() {
        return null;
    }

    public static ChoixDemandeAllocEtComplType forString(final String enumAsString) {
        for (ChoixDemandeAllocEtComplType value : allChoixDemandeAllocEtComplTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultChoixDemandeAllocEtComplType();
    }
}
