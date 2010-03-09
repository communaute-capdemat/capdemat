package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class ChoixSituationProfessionnelleType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final ChoixSituationProfessionnelleType SALARIE = new ChoixSituationProfessionnelleType("Salarie");
  
    public static final ChoixSituationProfessionnelleType STAGIAIRE = new ChoixSituationProfessionnelleType("Stagiaire");
  
    public static final ChoixSituationProfessionnelleType NONSALARIE = new ChoixSituationProfessionnelleType("Nonsalarie");
  
    public static final ChoixSituationProfessionnelleType DEMANDEUR = new ChoixSituationProfessionnelleType("Demandeur");
  
    public static final ChoixSituationProfessionnelleType RETRAITE = new ChoixSituationProfessionnelleType("Retraite");
  
    public static final ChoixSituationProfessionnelleType PENSION = new ChoixSituationProfessionnelleType("Pension");
  
    public static final ChoixSituationProfessionnelleType AUTRE = new ChoixSituationProfessionnelleType("Autre");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private ChoixSituationProfessionnelleType(String value) {
        super(value);
    }

    public ChoixSituationProfessionnelleType() {}

    public static ChoixSituationProfessionnelleType[] allChoixSituationProfessionnelleTypes = {
        SALARIE,
        STAGIAIRE,
        NONSALARIE,
        DEMANDEUR,
        RETRAITE,
        PENSION,
        AUTRE
    };

    public static ChoixSituationProfessionnelleType getDefaultChoixSituationProfessionnelleType() {
        return null;
    }

    public static ChoixSituationProfessionnelleType forString(final String enumAsString) {
        for (ChoixSituationProfessionnelleType value : allChoixSituationProfessionnelleTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultChoixSituationProfessionnelleType();
    }
}
