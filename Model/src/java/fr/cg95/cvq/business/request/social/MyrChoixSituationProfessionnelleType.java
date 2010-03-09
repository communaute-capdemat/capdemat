package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class MyrChoixSituationProfessionnelleType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final MyrChoixSituationProfessionnelleType SALARIE = new MyrChoixSituationProfessionnelleType("Salarie");
  
    public static final MyrChoixSituationProfessionnelleType STAGIAIRE = new MyrChoixSituationProfessionnelleType("Stagiaire");
  
    public static final MyrChoixSituationProfessionnelleType NONSALARIE = new MyrChoixSituationProfessionnelleType("Nonsalarie");
  
    public static final MyrChoixSituationProfessionnelleType DEMANDEUR = new MyrChoixSituationProfessionnelleType("Demandeur");
  
    public static final MyrChoixSituationProfessionnelleType RETRAITE = new MyrChoixSituationProfessionnelleType("Retraite");
  
    public static final MyrChoixSituationProfessionnelleType PENSION = new MyrChoixSituationProfessionnelleType("Pension");
  
    public static final MyrChoixSituationProfessionnelleType AUTRE = new MyrChoixSituationProfessionnelleType("Autre");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private MyrChoixSituationProfessionnelleType(String value) {
        super(value);
    }

    public MyrChoixSituationProfessionnelleType() {}

    public static MyrChoixSituationProfessionnelleType[] allMyrChoixSituationProfessionnelleTypes = {
        SALARIE,
        STAGIAIRE,
        NONSALARIE,
        DEMANDEUR,
        RETRAITE,
        PENSION,
        AUTRE
    };

    public static MyrChoixSituationProfessionnelleType getDefaultMyrChoixSituationProfessionnelleType() {
        return null;
    }

    public static MyrChoixSituationProfessionnelleType forString(final String enumAsString) {
        for (MyrChoixSituationProfessionnelleType value : allMyrChoixSituationProfessionnelleTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultMyrChoixSituationProfessionnelleType();
    }
}
