package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class SituationActuelleType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final SituationActuelleType ACCUEILJOUR = new SituationActuelleType("Accueiljour");
  
    public static final SituationActuelleType HEBERGEMENTNUIT = new SituationActuelleType("Hebergementnuit");
  
    public static final SituationActuelleType HEBERGEMENTPERMANENT = new SituationActuelleType("Hebergementpermanent");
  
    public static final SituationActuelleType ACCOMPAGNEMENT = new SituationActuelleType("Accompagnement");
  
    public static final SituationActuelleType AUTRES = new SituationActuelleType("Autres");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private SituationActuelleType(String value) {
        super(value);
    }

    public SituationActuelleType() {}

    public static SituationActuelleType[] allSituationActuelleTypes = {
        ACCUEILJOUR,
        HEBERGEMENTNUIT,
        HEBERGEMENTPERMANENT,
        ACCOMPAGNEMENT,
        AUTRES
    };

    public static SituationActuelleType getDefaultSituationActuelleType() {
        return null;
    }

    public static SituationActuelleType forString(final String enumAsString) {
        for (SituationActuelleType value : allSituationActuelleTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultSituationActuelleType();
    }
}
