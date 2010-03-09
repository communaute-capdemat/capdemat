package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class ChoixPreferenceEtablissementOuServiceScolaireType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final ChoixPreferenceEtablissementOuServiceScolaireType OUI = new ChoixPreferenceEtablissementOuServiceScolaireType("Oui");
  
    public static final ChoixPreferenceEtablissementOuServiceScolaireType NON = new ChoixPreferenceEtablissementOuServiceScolaireType("Non");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private ChoixPreferenceEtablissementOuServiceScolaireType(String value) {
        super(value);
    }

    public ChoixPreferenceEtablissementOuServiceScolaireType() {}

    public static ChoixPreferenceEtablissementOuServiceScolaireType[] allChoixPreferenceEtablissementOuServiceScolaireTypes = {
        OUI,
        NON
    };

    public static ChoixPreferenceEtablissementOuServiceScolaireType getDefaultChoixPreferenceEtablissementOuServiceScolaireType() {
        return null;
    }

    public static ChoixPreferenceEtablissementOuServiceScolaireType forString(final String enumAsString) {
        for (ChoixPreferenceEtablissementOuServiceScolaireType value : allChoixPreferenceEtablissementOuServiceScolaireTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultChoixPreferenceEtablissementOuServiceScolaireType();
    }
}
