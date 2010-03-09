package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class ChoixDemandeCartesType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final ChoixDemandeCartesType INVALIDITE_PRIORITE = new ChoixDemandeCartesType("InvaliditePriorite");
  
    public static final ChoixDemandeCartesType INVALIDITE_ACCOMPAGNEMENT = new ChoixDemandeCartesType("InvaliditeAccompagnement");
  
    public static final ChoixDemandeCartesType EUROPEENNE = new ChoixDemandeCartesType("Europeenne");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private ChoixDemandeCartesType(String value) {
        super(value);
    }

    public ChoixDemandeCartesType() {}

    public static ChoixDemandeCartesType[] allChoixDemandeCartesTypes = {
        INVALIDITE_PRIORITE,
        INVALIDITE_ACCOMPAGNEMENT,
        EUROPEENNE
    };

    public static ChoixDemandeCartesType getDefaultChoixDemandeCartesType() {
        return null;
    }

    public static ChoixDemandeCartesType forString(final String enumAsString) {
        for (ChoixDemandeCartesType value : allChoixDemandeCartesTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultChoixDemandeCartesType();
    }
}
