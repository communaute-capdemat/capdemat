package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class PeriodiciteFraisSuppType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final PeriodiciteFraisSuppType SEMAINE = new PeriodiciteFraisSuppType("Semaine");
  
    public static final PeriodiciteFraisSuppType MOIS = new PeriodiciteFraisSuppType("Mois");
  
    public static final PeriodiciteFraisSuppType ANNEE = new PeriodiciteFraisSuppType("Annee");
  
    public static final PeriodiciteFraisSuppType OCCASIONNELLE = new PeriodiciteFraisSuppType("Occasionnelle");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private PeriodiciteFraisSuppType(String value) {
        super(value);
    }

    public PeriodiciteFraisSuppType() {}

    public static PeriodiciteFraisSuppType[] allPeriodiciteFraisSuppTypes = {
        SEMAINE,
        MOIS,
        ANNEE,
        OCCASIONNELLE
    };

    public static PeriodiciteFraisSuppType getDefaultPeriodiciteFraisSuppType() {
        return null;
    }

    public static PeriodiciteFraisSuppType forString(final String enumAsString) {
        for (PeriodiciteFraisSuppType value : allPeriodiciteFraisSuppTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultPeriodiciteFraisSuppType();
    }
}
