package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class LogementType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final LogementType LOCATAIRE = new LogementType("Locataire");
  
    public static final LogementType PROPRIETAIRE = new LogementType("Proprietaire");
  
    public static final LogementType HEBERGE = new LogementType("Heberge");
  
    public static final LogementType AUTRE = new LogementType("Autre");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private LogementType(String value) {
        super(value);
    }

    public LogementType() {}

    public static LogementType[] allLogementTypes = {
        LOCATAIRE,
        PROPRIETAIRE,
        HEBERGE,
        AUTRE
    };

    public static LogementType getDefaultLogementType() {
        return null;
    }

    public static LogementType forString(final String enumAsString) {
        for (LogementType value : allLogementTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultLogementType();
    }
}
