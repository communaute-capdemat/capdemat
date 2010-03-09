package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class OrganismePayeurType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final OrganismePayeurType CAF = new OrganismePayeurType("Caf");
  
    public static final OrganismePayeurType MSA = new OrganismePayeurType("Msa");
  
    public static final OrganismePayeurType AUTRE = new OrganismePayeurType("Autre");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private OrganismePayeurType(String value) {
        super(value);
    }

    public OrganismePayeurType() {}

    public static OrganismePayeurType[] allOrganismePayeurTypes = {
        CAF,
        MSA,
        AUTRE
    };

    public static OrganismePayeurType getDefaultOrganismePayeurType() {
        return null;
    }

    public static OrganismePayeurType forString(final String enumAsString) {
        for (OrganismePayeurType value : allOrganismePayeurTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultOrganismePayeurType();
    }
}
