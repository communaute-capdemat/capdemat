package fr.cg95.cvq.business.users.xml;

import fr.cg95.cvq.business.users.Child;
import fr.cg95.cvq.business.users.SexType;

public class ChildXml extends IndividualXml {

    private boolean isBorn;

    private SexType sex;

    public ChildXml(Child child) {
        super(child);

        isBorn = child.isBorn();
        sex = child.getSex();
    }

    public boolean isBorn() {
        return isBorn;
    }

    public void setBorn(boolean isBorn) {
        this.isBorn = isBorn;
    }

    public SexType getSex() {
        return sex;
    }

    public void setSex(SexType sex) {
        this.sex = sex;
    }

}
