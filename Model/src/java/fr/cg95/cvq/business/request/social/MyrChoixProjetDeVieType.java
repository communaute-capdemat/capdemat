package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class MyrChoixProjetDeVieType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final MyrChoixProjetDeVieType OUI = new MyrChoixProjetDeVieType("Oui");
  
    public static final MyrChoixProjetDeVieType AIDE = new MyrChoixProjetDeVieType("Aide");
  
    public static final MyrChoixProjetDeVieType NON = new MyrChoixProjetDeVieType("Non");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private MyrChoixProjetDeVieType(String value) {
        super(value);
    }

    public MyrChoixProjetDeVieType() {}

    public static MyrChoixProjetDeVieType[] allMyrChoixProjetDeVieTypes = {
        OUI,
        AIDE,
        NON
    };

    public static MyrChoixProjetDeVieType getDefaultMyrChoixProjetDeVieType() {
        return null;
    }

    public static MyrChoixProjetDeVieType forString(final String enumAsString) {
        for (MyrChoixProjetDeVieType value : allMyrChoixProjetDeVieTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultMyrChoixProjetDeVieType();
    }
}
