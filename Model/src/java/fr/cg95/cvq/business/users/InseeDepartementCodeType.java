package fr.cg95.cvq.business.users;

import org.apache.commons.lang.ArrayUtils;

import fr.cg95.cvq.dao.hibernate.PersistentStringEnum;

/**
 * Enumeration of all French departments.
 * 
 * @author Benoit Orihuela (bor@zenexity.fr)
 */
public enum InseeDepartementCodeType { 

    private static final long serialVersionUID = 1L;
    
    public static InseeDepartementCodeType[] allInseeDepartementCodeTypes = null;

    private String legacyLabel;

    public String getLegacyLabel() {
        return legacyLabel;
    }

    /**
     * Prevent instantiation and subclassing with a private constructor.
     */
    private InseeDepartementCodeType(String value) {
       super(value);
       allInseeDepartementCodeTypes = (InseeDepartementCodeType[])ArrayUtils.add(allInseeDepartementCodeTypes, this);
    }

    public static InseeDepartementCodeType getDefaultInseeDepartementCodeType() {
        return NONE;
    }


    public static InseeDepartementCodeType forString(final String enumAsString) {
        if (enumAsString == null || enumAsString.equals(""))
            return getDefaultInseeDepartementCodeType();

        if (enumAsString.equals(NONE.toString()))
            return NONE;
        else if (enumAsString.equals(D_E_P01.toString()))
            return D_E_P01;
        else if (enumAsString.equals(D_E_P02.toString()))
            return D_E_P02;
        else if (enumAsString.equals(D_E_P03.toString()))
            return D_E_P03;
        else if (enumAsString.equals(D_E_P04.toString()))
            return D_E_P04;
        else if (enumAsString.equals(D_E_P05.toString()))
            return D_E_P05;
        else if (enumAsString.equals(D_E_P06.toString()))
            return D_E_P06;
        else if (enumAsString.equals(D_E_P07.toString()))
            return D_E_P07;
        else if (enumAsString.equals(D_E_P08.toString()))
            return D_E_P08;
        else if (enumAsString.equals(D_E_P09.toString()))
            return D_E_P09;
        else if (enumAsString.equals(D_E_P10.toString()))
            return D_E_P10;
        else if (enumAsString.equals(D_E_P11.toString()))
            return D_E_P11;
        else if (enumAsString.equals(D_E_P12.toString()))
            return D_E_P12;
        else if (enumAsString.equals(D_E_P13.toString()))
            return D_E_P13;
        else if (enumAsString.equals(D_E_P14.toString()))
            return D_E_P14;
        else if (enumAsString.equals(D_E_P15.toString()))
            return D_E_P15;
        else if (enumAsString.equals(D_E_P16.toString()))
            return D_E_P16;
        else if (enumAsString.equals(D_E_P17.toString()))
            return D_E_P17;
        else if (enumAsString.equals(D_E_P18.toString()))
            return D_E_P18;
        else if (enumAsString.equals(D_E_P19.toString()))
            return D_E_P19;
        else if (enumAsString.equals(D_E_P2_A.toString()))
            return D_E_P2_A;
        else if (enumAsString.equals(D_E_P2_B.toString()))
            return D_E_P2_B;
        else if (enumAsString.equals(D_E_P21.toString()))
            return D_E_P21;
        else if (enumAsString.equals(D_E_P22.toString()))
            return D_E_P22;
        else if (enumAsString.equals(D_E_P23.toString()))
            return D_E_P23;
        else if (enumAsString.equals(D_E_P24.toString()))
            return D_E_P24;
        else if (enumAsString.equals(D_E_P25.toString()))
            return D_E_P25;
        else if (enumAsString.equals(D_E_P26.toString()))
            return D_E_P26;
        else if (enumAsString.equals(D_E_P27.toString()))
            return D_E_P27;
        else if (enumAsString.equals(D_E_P28.toString()))
            return D_E_P28;
        else if (enumAsString.equals(D_E_P29.toString()))
            return D_E_P29;
        else if (enumAsString.equals(D_E_P30.toString()))
            return D_E_P30;
        else if (enumAsString.equals(D_E_P31.toString()))
            return D_E_P31;
        else if (enumAsString.equals(D_E_P32.toString()))
            return D_E_P32;
        else if (enumAsString.equals(D_E_P33.toString()))
            return D_E_P33;
        else if (enumAsString.equals(D_E_P34.toString()))
            return D_E_P34;
        else if (enumAsString.equals(D_E_P35.toString()))
            return D_E_P35;
        else if (enumAsString.equals(D_E_P36.toString()))
            return D_E_P36;
        else if (enumAsString.equals(D_E_P37.toString()))
            return D_E_P37;
        else if (enumAsString.equals(D_E_P38.toString()))
            return D_E_P38;
        else if (enumAsString.equals(D_E_P39.toString()))
            return D_E_P39;
        else if (enumAsString.equals(D_E_P40.toString()))
            return D_E_P40;
        else if (enumAsString.equals(D_E_P41.toString()))
            return D_E_P41;
        else if (enumAsString.equals(D_E_P42.toString()))
            return D_E_P42;
        else if (enumAsString.equals(D_E_P43.toString()))
            return D_E_P43;
        else if (enumAsString.equals(D_E_P44.toString()))
            return D_E_P44;
        else if (enumAsString.equals(D_E_P45.toString()))
            return D_E_P45;
        else if (enumAsString.equals(D_E_P46.toString()))
            return D_E_P46;
        else if (enumAsString.equals(D_E_P47.toString()))
            return D_E_P47;
        else if (enumAsString.equals(D_E_P48.toString()))
            return D_E_P48;
        else if (enumAsString.equals(D_E_P49.toString()))
            return D_E_P49;
        else if (enumAsString.equals(D_E_P50.toString()))
            return D_E_P50;
        else if (enumAsString.equals(D_E_P51.toString()))
            return D_E_P51;
        else if (enumAsString.equals(D_E_P52.toString()))
            return D_E_P52;
        else if (enumAsString.equals(D_E_P53.toString()))
            return D_E_P53;
        else if (enumAsString.equals(D_E_P54.toString()))
            return D_E_P54;
        else if (enumAsString.equals(D_E_P55.toString()))
            return D_E_P55;
        else if (enumAsString.equals(D_E_P56.toString()))
            return D_E_P56;
        else if (enumAsString.equals(D_E_P57.toString()))
            return D_E_P57;
        else if (enumAsString.equals(D_E_P58.toString()))
            return D_E_P58;
        else if (enumAsString.equals(D_E_P59.toString()))
            return D_E_P59;
        else if (enumAsString.equals(D_E_P60.toString()))
            return D_E_P60;
        else if (enumAsString.equals(D_E_P61.toString()))
            return D_E_P61;
        else if (enumAsString.equals(D_E_P62.toString()))
            return D_E_P62;
        else if (enumAsString.equals(D_E_P63.toString()))
            return D_E_P63;
        else if (enumAsString.equals(D_E_P64.toString()))
            return D_E_P64;
        else if (enumAsString.equals(D_E_P65.toString()))
            return D_E_P65;
        else if (enumAsString.equals(D_E_P66.toString()))
            return D_E_P66;
        else if (enumAsString.equals(D_E_P67.toString()))
            return D_E_P67;
        else if (enumAsString.equals(D_E_P68.toString()))
            return D_E_P68;
        else if (enumAsString.equals(D_E_P69.toString()))
            return D_E_P69;
        else if (enumAsString.equals(D_E_P70.toString()))
            return D_E_P70;
        else if (enumAsString.equals(D_E_P71.toString()))
            return D_E_P71;
        else if (enumAsString.equals(D_E_P72.toString()))
            return D_E_P72;
        else if (enumAsString.equals(D_E_P73.toString()))
            return D_E_P73;
        else if (enumAsString.equals(D_E_P74.toString()))
            return D_E_P74;
        else if (enumAsString.equals(D_E_P75.toString()))
            return D_E_P75;
        else if (enumAsString.equals(D_E_P76.toString()))
            return D_E_P76;
        else if (enumAsString.equals(D_E_P77.toString()))
            return D_E_P77;
        else if (enumAsString.equals(D_E_P78.toString()))
            return D_E_P78;
        else if (enumAsString.equals(D_E_P79.toString()))
            return D_E_P79;
        else if (enumAsString.equals(D_E_P80.toString()))
            return D_E_P80;
        else if (enumAsString.equals(D_E_P81.toString()))
            return D_E_P81;
        else if (enumAsString.equals(D_E_P82.toString()))
            return D_E_P82;
        else if (enumAsString.equals(D_E_P83.toString()))
            return D_E_P83;
        else if (enumAsString.equals(D_E_P84.toString()))
            return D_E_P84;
        else if (enumAsString.equals(D_E_P85.toString()))
            return D_E_P85;
        else if (enumAsString.equals(D_E_P86.toString()))
            return D_E_P86;
        else if (enumAsString.equals(D_E_P87.toString()))
            return D_E_P87;
        else if (enumAsString.equals(D_E_P88.toString()))
            return D_E_P88;
        else if (enumAsString.equals(D_E_P89.toString()))
            return D_E_P89;
        else if (enumAsString.equals(D_E_P90.toString()))
            return D_E_P90;
        else if (enumAsString.equals(D_E_P91.toString()))
            return D_E_P91;
        else if (enumAsString.equals(D_E_P92.toString()))
            return D_E_P92;
        else if (enumAsString.equals(D_E_P93.toString()))
            return D_E_P93;
        else if (enumAsString.equals(D_E_P94.toString()))
            return D_E_P94;
        else if (enumAsString.equals(D_E_P95.toString()))
            return D_E_P95;
        else if (enumAsString.equals(D_E_P971.toString()))
            return D_E_P971;
        else if (enumAsString.equals(D_E_P972.toString()))
            return D_E_P972;
        else if (enumAsString.equals(D_E_P973.toString()))
            return D_E_P973;
        else if (enumAsString.equals(D_E_P974.toString()))
            return D_E_P974;

        return getDefaultInseeDepartementCodeType();
    }
    
    public static InseeDepartementCodeType getDepartementCodeByPostalCode(String postalCode) {
        String departementCode = "";
        if (postalCode.substring(0, 2).equals("97")) {
            departementCode = postalCode.substring(0,3);
        } else if (postalCode.substring(0, 2).equals("20")) {
            departementCode = postalCode.substring(0,3);
            if (departementCode.equals("200") || departementCode.equals("201"))
                departementCode = "2A";
            else
                departementCode = "2B";
        } else {
            departementCode = postalCode.substring(0,2);
        }
        
        return forString("DEP_" + departementCode);
    }
}
