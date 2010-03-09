package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class OrientationSouhaiteeType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final OrientationSouhaiteeType ACCUEILJOUR = new OrientationSouhaiteeType("Accueiljour");
  
    public static final OrientationSouhaiteeType HEBERGEMENTNUIT = new OrientationSouhaiteeType("Hebergementnuit");
  
    public static final OrientationSouhaiteeType HEBERGEMENTPERMANENT = new OrientationSouhaiteeType("Hebergementpermanent");
  
    public static final OrientationSouhaiteeType ACCOMPAGNEMENT = new OrientationSouhaiteeType("Accompagnement");
  
    public static final OrientationSouhaiteeType AUTRES = new OrientationSouhaiteeType("Autres");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private OrientationSouhaiteeType(String value) {
        super(value);
    }

    public OrientationSouhaiteeType() {}

    public static OrientationSouhaiteeType[] allOrientationSouhaiteeTypes = {
        ACCUEILJOUR,
        HEBERGEMENTNUIT,
        HEBERGEMENTPERMANENT,
        ACCOMPAGNEMENT,
        AUTRES
    };

    public static OrientationSouhaiteeType getDefaultOrientationSouhaiteeType() {
        return null;
    }

    public static OrientationSouhaiteeType forString(final String enumAsString) {
        for (OrientationSouhaiteeType value : allOrientationSouhaiteeTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultOrientationSouhaiteeType();
    }
}
