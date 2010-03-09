package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class PrecedentsRevenusRecusType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final PrecedentsRevenusRecusType ACTIVITE = new PrecedentsRevenusRecusType("Activite");
  
    public static final PrecedentsRevenusRecusType ESAT = new PrecedentsRevenusRecusType("Esat");
  
    public static final PrecedentsRevenusRecusType INDEMNITES = new PrecedentsRevenusRecusType("Indemnites");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private PrecedentsRevenusRecusType(String value) {
        super(value);
    }

    public PrecedentsRevenusRecusType() {}

    public static PrecedentsRevenusRecusType[] allPrecedentsRevenusRecusTypes = {
        ACTIVITE,
        ESAT,
        INDEMNITES
    };

    public static PrecedentsRevenusRecusType getDefaultPrecedentsRevenusRecusType() {
        return null;
    }

    public static PrecedentsRevenusRecusType forString(final String enumAsString) {
        for (PrecedentsRevenusRecusType value : allPrecedentsRevenusRecusTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultPrecedentsRevenusRecusType();
    }
}
