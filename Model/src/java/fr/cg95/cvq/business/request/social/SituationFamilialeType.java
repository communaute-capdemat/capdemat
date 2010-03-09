package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class SituationFamilialeType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final SituationFamilialeType CELIBATAIRE = new SituationFamilialeType("Celibataire");
  
    public static final SituationFamilialeType MARIE = new SituationFamilialeType("Marie");
  
    public static final SituationFamilialeType CONCUBINAGE = new SituationFamilialeType("Concubinage");
  
    public static final SituationFamilialeType AUTRE = new SituationFamilialeType("Autre");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private SituationFamilialeType(String value) {
        super(value);
    }

    public SituationFamilialeType() {}

    public static SituationFamilialeType[] allSituationFamilialeTypes = {
        CELIBATAIRE,
        MARIE,
        CONCUBINAGE,
        AUTRE
    };

    public static SituationFamilialeType getDefaultSituationFamilialeType() {
        return null;
    }

    public static SituationFamilialeType forString(final String enumAsString) {
        for (SituationFamilialeType value : allSituationFamilialeTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultSituationFamilialeType();
    }
}
