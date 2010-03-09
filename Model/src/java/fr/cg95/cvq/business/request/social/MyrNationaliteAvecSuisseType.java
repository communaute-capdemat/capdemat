package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class MyrNationaliteAvecSuisseType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final MyrNationaliteAvecSuisseType FRANCAISE = new MyrNationaliteAvecSuisseType("Francaise");
  
    public static final MyrNationaliteAvecSuisseType EEESUISSE = new MyrNationaliteAvecSuisseType("Eeesuisse");
  
    public static final MyrNationaliteAvecSuisseType AUTRE = new MyrNationaliteAvecSuisseType("Autre");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private MyrNationaliteAvecSuisseType(String value) {
        super(value);
    }

    public MyrNationaliteAvecSuisseType() {}

    public static MyrNationaliteAvecSuisseType[] allMyrNationaliteAvecSuisseTypes = {
        FRANCAISE,
        EEESUISSE,
        AUTRE
    };

    public static MyrNationaliteAvecSuisseType getDefaultMyrNationaliteAvecSuisseType() {
        return null;
    }

    public static MyrNationaliteAvecSuisseType forString(final String enumAsString) {
        for (MyrNationaliteAvecSuisseType value : allMyrNationaliteAvecSuisseTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultMyrNationaliteAvecSuisseType();
    }
}
