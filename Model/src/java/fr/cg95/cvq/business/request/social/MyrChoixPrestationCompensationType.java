package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class MyrChoixPrestationCompensationType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final MyrChoixPrestationCompensationType PCH = new MyrChoixPrestationCompensationType("Pch");
  
    public static final MyrChoixPrestationCompensationType ACTP = new MyrChoixPrestationCompensationType("Actp");
  
    public static final MyrChoixPrestationCompensationType ACFP = new MyrChoixPrestationCompensationType("Acfp");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private MyrChoixPrestationCompensationType(String value) {
        super(value);
    }

    public MyrChoixPrestationCompensationType() {}

    public static MyrChoixPrestationCompensationType[] allMyrChoixPrestationCompensationTypes = {
        PCH,
        ACTP,
        ACFP
    };

    public static MyrChoixPrestationCompensationType getDefaultMyrChoixPrestationCompensationType() {
        return null;
    }

    public static MyrChoixPrestationCompensationType forString(final String enumAsString) {
        for (MyrChoixPrestationCompensationType value : allMyrChoixPrestationCompensationTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultMyrChoixPrestationCompensationType();
    }
}
