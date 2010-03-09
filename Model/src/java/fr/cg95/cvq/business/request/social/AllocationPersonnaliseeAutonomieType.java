package fr.cg95.cvq.business.request.social;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Generated class file, do not edit !
 */
public final class AllocationPersonnaliseeAutonomieType extends PersistentStringEnum {

    private static final long serialVersionUID = 1L;
  
    public static final AllocationPersonnaliseeAutonomieType OUI = new AllocationPersonnaliseeAutonomieType("Oui");
  
    public static final AllocationPersonnaliseeAutonomieType NON = new AllocationPersonnaliseeAutonomieType("Non");
  

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private AllocationPersonnaliseeAutonomieType(String value) {
        super(value);
    }

    public AllocationPersonnaliseeAutonomieType() {}

    public static AllocationPersonnaliseeAutonomieType[] allAllocationPersonnaliseeAutonomieTypes = {
        OUI,
        NON
    };

    public static AllocationPersonnaliseeAutonomieType getDefaultAllocationPersonnaliseeAutonomieType() {
        return null;
    }

    public static AllocationPersonnaliseeAutonomieType forString(final String enumAsString) {
        for (AllocationPersonnaliseeAutonomieType value : allAllocationPersonnaliseeAutonomieTypes)
            if (value.toString().equals(enumAsString))
                return value;
        return getDefaultAllocationPersonnaliseeAutonomieType();
    }
}
