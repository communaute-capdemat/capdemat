package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class SituationAutreType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final SituationAutreType ETABLISSEMENT_MEDICO_SOCIAL = new SituationAutreType("EtablissementMedicoSocial");
  
    public static final SituationAutreType HOSPITALISE = new SituationAutreType("Hospitalise");
  
    public static final SituationAutreType AUTRE = new SituationAutreType("Autre");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private SituationAutreType(String value) {
        super(value);
    }

    public SituationAutreType() {}

    public static SituationAutreType[] allSituationAutreTypes = {
        ETABLISSEMENT_MEDICO_SOCIAL,
        HOSPITALISE,
        AUTRE
    };

    public static SituationAutreType getDefaultSituationAutreType() {
        return null;
    }

    public static SituationAutreType forString(final String enumAsString) {
        for (SituationAutreType value : allSituationAutreTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultSituationAutreType();
    }
}
