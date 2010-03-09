package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class MyrOrganismePayeurType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final MyrOrganismePayeurType CAF = new MyrOrganismePayeurType("Caf");
  
    public static final MyrOrganismePayeurType MSA = new MyrOrganismePayeurType("Msa");
  
    public static final MyrOrganismePayeurType AUTRE = new MyrOrganismePayeurType("Autre");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private MyrOrganismePayeurType(String value) {
        super(value);
    }

    public MyrOrganismePayeurType() {}

    public static MyrOrganismePayeurType[] allMyrOrganismePayeurTypes = {
        CAF,
        MSA,
        AUTRE
    };

    public static MyrOrganismePayeurType getDefaultMyrOrganismePayeurType() {
        return null;
    }

    public static MyrOrganismePayeurType forString(final String enumAsString) {
        for (MyrOrganismePayeurType value : allMyrOrganismePayeurTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultMyrOrganismePayeurType();
    }
}
