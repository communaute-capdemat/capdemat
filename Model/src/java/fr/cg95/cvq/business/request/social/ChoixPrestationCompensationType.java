package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class ChoixPrestationCompensationType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final ChoixPrestationCompensationType PCH = new ChoixPrestationCompensationType("Pch");
  
    public static final ChoixPrestationCompensationType ACTP = new ChoixPrestationCompensationType("Actp");
  
    public static final ChoixPrestationCompensationType ACFP = new ChoixPrestationCompensationType("Acfp");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private ChoixPrestationCompensationType(String value) {
        super(value);
    }

    public ChoixPrestationCompensationType() {}

    public static ChoixPrestationCompensationType[] allChoixPrestationCompensationTypes = {
        PCH,
        ACTP,
        ACFP
    };

    public static ChoixPrestationCompensationType getDefaultChoixPrestationCompensationType() {
        return null;
    }

    public static ChoixPrestationCompensationType forString(final String enumAsString) {
        for (ChoixPrestationCompensationType value : allChoixPrestationCompensationTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultChoixPrestationCompensationType();
    }
}
