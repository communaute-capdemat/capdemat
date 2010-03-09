package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class ChoixProjetDeVieType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final ChoixProjetDeVieType OUI = new ChoixProjetDeVieType("Oui");
  
    public static final ChoixProjetDeVieType AIDE = new ChoixProjetDeVieType("Aide");
  
    public static final ChoixProjetDeVieType NON = new ChoixProjetDeVieType("Non");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private ChoixProjetDeVieType(String value) {
        super(value);
    }

    public ChoixProjetDeVieType() {}

    public static ChoixProjetDeVieType[] allChoixProjetDeVieTypes = {
        OUI,
        AIDE,
        NON
    };

    public static ChoixProjetDeVieType getDefaultChoixProjetDeVieType() {
        return null;
    }

    public static ChoixProjetDeVieType forString(final String enumAsString) {
        for (ChoixProjetDeVieType value : allChoixProjetDeVieTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultChoixProjetDeVieType();
    }
}
