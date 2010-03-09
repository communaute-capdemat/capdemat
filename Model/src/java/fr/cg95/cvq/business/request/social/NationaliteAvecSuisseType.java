package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class NationaliteAvecSuisseType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final NationaliteAvecSuisseType FRANCAISE = new NationaliteAvecSuisseType("Francaise");
  
    public static final NationaliteAvecSuisseType EEESUISSE = new NationaliteAvecSuisseType("Eeesuisse");
  
    public static final NationaliteAvecSuisseType AUTRE = new NationaliteAvecSuisseType("Autre");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private NationaliteAvecSuisseType(String value) {
        super(value);
    }

    public NationaliteAvecSuisseType() {}

    public static NationaliteAvecSuisseType[] allNationaliteAvecSuisseTypes = {
        FRANCAISE,
        EEESUISSE,
        AUTRE
    };

    public static NationaliteAvecSuisseType getDefaultNationaliteAvecSuisseType() {
        return null;
    }

    public static NationaliteAvecSuisseType forString(final String enumAsString) {
        for (NationaliteAvecSuisseType value : allNationaliteAvecSuisseTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultNationaliteAvecSuisseType();
    }
}
