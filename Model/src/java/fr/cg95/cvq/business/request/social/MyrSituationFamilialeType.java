package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class MyrSituationFamilialeType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final MyrSituationFamilialeType CELIBATAIRE = new MyrSituationFamilialeType("Celibataire");
  
    public static final MyrSituationFamilialeType MARIE = new MyrSituationFamilialeType("Marie");
  
    public static final MyrSituationFamilialeType CONCUBINAGE = new MyrSituationFamilialeType("Concubinage");
  
    public static final MyrSituationFamilialeType AUTRE = new MyrSituationFamilialeType("Autre");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private MyrSituationFamilialeType(String value) {
        super(value);
    }

    public MyrSituationFamilialeType() {}

    public static MyrSituationFamilialeType[] allMyrSituationFamilialeTypes = {
        CELIBATAIRE,
        MARIE,
        CONCUBINAGE,
        AUTRE
    };

    public static MyrSituationFamilialeType getDefaultMyrSituationFamilialeType() {
        return null;
    }

    public static MyrSituationFamilialeType forString(final String enumAsString) {
        for (MyrSituationFamilialeType value : allMyrSituationFamilialeTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultMyrSituationFamilialeType();
    }
}
