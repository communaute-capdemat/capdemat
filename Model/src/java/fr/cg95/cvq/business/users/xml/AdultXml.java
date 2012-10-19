package fr.cg95.cvq.business.users.xml;

import fr.cg95.cvq.business.users.Adult;

public class AdultXml extends IndividualXml {

    private String title;
    private String maindenName;
    private String nameOfUse;
    private String familyStatus;
    private String homePhone;
    private String mobilePhone;
    private String officePhone;
    private String email;
    private String profession;
    private String cfbn;

    public AdultXml(Adult adult) {
        super(adult);

        title = adult.getTitle().toString();
        maindenName = adult.getMaidenName();
        nameOfUse = adult.getNameOfUse();
        familyStatus = adult.getFamilyStatus().toString();
        homePhone = adult.getHomePhone();
        mobilePhone = adult.getMobilePhone();
        email = adult.getEmail();
        profession = adult.getProfession();
        cfbn = adult.getCfbn();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMaindenName() {
        return maindenName;
    }

    public void setMaindenName(String maindenName) {
        this.maindenName = maindenName;
    }

    public String getNameOfUse() {
        return nameOfUse;
    }

    public void setNameOfUse(String nameOfUse) {
        this.nameOfUse = nameOfUse;
    }

    public String getFamilyStatus() {
        return familyStatus;
    }

    public void setFamilyStatus(String familyStatus) {
        this.familyStatus = familyStatus;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCfbn() {
        return cfbn;
    }

    public void setCfbn(String cfbn) {
        this.cfbn = cfbn;
    }

}
