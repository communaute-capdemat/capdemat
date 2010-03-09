package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class MyrSituationAutreType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final MyrSituationAutreType ETABLISSEMENT_MEDICO_SOCIAL = new MyrSituationAutreType("EtablissementMedicoSocial");
  
    public static final MyrSituationAutreType HOSPITALISE = new MyrSituationAutreType("Hospitalise");
  
    public static final MyrSituationAutreType AUTRE = new MyrSituationAutreType("Autre");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private MyrSituationAutreType(String value) {
        super(value);
    }

    public MyrSituationAutreType() {}

    public static MyrSituationAutreType[] allMyrSituationAutreTypes = {
        ETABLISSEMENT_MEDICO_SOCIAL,
        HOSPITALISE,
        AUTRE
    };

    public static MyrSituationAutreType getDefaultMyrSituationAutreType() {
        return null;
    }

    public static MyrSituationAutreType forString(final String enumAsString) {
        for (MyrSituationAutreType value : allMyrSituationAutreTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultMyrSituationAutreType();
    }
}
