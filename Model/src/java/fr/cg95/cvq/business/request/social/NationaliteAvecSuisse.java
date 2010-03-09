package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class NationaliteAvecSuisse extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final NationaliteAvecSuisse FRANCAISE = new NationaliteAvecSuisse("Francaise");
  
    public static final NationaliteAvecSuisse EEESUISSE = new NationaliteAvecSuisse("Eeesuisse");
  
    public static final NationaliteAvecSuisse AUTRE = new NationaliteAvecSuisse("Autre");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private NationaliteAvecSuisse(String value) {
        super(value);
    }

    public NationaliteAvecSuisse() {}

    public static NationaliteAvecSuisse[] allNationaliteAvecSuisses = {
        FRANCAISE,
        EEESUISSE,
        AUTRE
    };

    public static NationaliteAvecSuisse getDefaultNationaliteAvecSuisse() {
        return null;
    }

    public static NationaliteAvecSuisse forString(final String enumAsString) {
        for (NationaliteAvecSuisse value : allNationaliteAvecSuisses)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultNationaliteAvecSuisse();
    }
}
