package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class ChoixSituationProfessionnelle extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final ChoixSituationProfessionnelle SALARIE = new ChoixSituationProfessionnelle("Salarie");
  
    public static final ChoixSituationProfessionnelle STAGIAIRE = new ChoixSituationProfessionnelle("Stagiaire");
  
    public static final ChoixSituationProfessionnelle NONSALARIE = new ChoixSituationProfessionnelle("Nonsalarie");
  
    public static final ChoixSituationProfessionnelle DEMANDEUR = new ChoixSituationProfessionnelle("Demandeur");
  
    public static final ChoixSituationProfessionnelle RETRAITE = new ChoixSituationProfessionnelle("Retraite");
  
    public static final ChoixSituationProfessionnelle PENSION = new ChoixSituationProfessionnelle("Pension");
  
    public static final ChoixSituationProfessionnelle AUTRES = new ChoixSituationProfessionnelle("Autres");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private ChoixSituationProfessionnelle(String value) {
        super(value);
    }

    public ChoixSituationProfessionnelle() {}

    public static ChoixSituationProfessionnelle[] allChoixSituationProfessionnelles = {
        SALARIE,
        STAGIAIRE,
        NONSALARIE,
        DEMANDEUR,
        RETRAITE,
        PENSION,
        AUTRES
    };

    public static ChoixSituationProfessionnelle getDefaultChoixSituationProfessionnelle() {
        return null;
    }

    public static ChoixSituationProfessionnelle forString(final String enumAsString) {
        for (ChoixSituationProfessionnelle value : allChoixSituationProfessionnelles)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultChoixSituationProfessionnelle();
    }
}
