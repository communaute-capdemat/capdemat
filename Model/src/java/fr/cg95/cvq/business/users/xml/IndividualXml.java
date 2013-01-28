package fr.cg95.cvq.business.users.xml;

import java.util.Date;

import fr.cg95.cvq.business.users.Address;
import fr.cg95.cvq.business.users.Adult;
import fr.cg95.cvq.business.users.Child;
import fr.cg95.cvq.business.users.Individual;
import fr.cg95.cvq.business.users.external.IndividualMapping;

/**
 * Transform individual model to Xml for Angelus WS
 * @author jla
 *
 */
abstract public class IndividualXml {

    private String capdematId;
    private String homefolderId;

    private String lastName;
    private String firstName;
    private String firstName2;
    private String firstName3;
    private Date birthDate;
    private String birthCountry;
    private String birthPostalCode;
    private String birthCity;
    private String state;
    private Address address;

    public IndividualXml(Individual indiv) {
        lastName = indiv.getLastName();
        firstName = indiv.getFirstName();
        firstName2 = indiv.getFirstName2();
        firstName3 = indiv.getFirstName3();
        birthDate = indiv.getBirthDate();
        birthCountry = indiv.getBirthCountry();
        birthPostalCode = indiv.getBirthPostalCode();
        birthCity = indiv.getBirthCity();
        state = indiv.getState().toString();
        address = indiv.getAddress();         // Check if an external capdematId is already set
        if (indiv.getIndividualMappings() != null && indiv.getIndividualMappings().size() == 1) {
            IndividualMapping mapping = indiv.getIndividualMappings().iterator().next();
            capdematId = mapping.getExternalCapDematId();
            homefolderId = mapping.getHomeFolderMapping().getExternalCapDematId();
        }
    }

    public static IndividualXml toXml(Individual indiv) {
        if (indiv instanceof Adult) {
            return new AdultXml((Adult)indiv);
        } else {
            return new ChildXml((Child)indiv);
        }
    }

    public static IndividualXml toXml(Individual indiv, String capdematId) {
        IndividualXml indivXml = toXml(indiv);
        indivXml.setCapdematId(capdematId);
        return indivXml;
    }

    public String getCapdematId() {
        return capdematId;
    }

    public void setCapdematId(String capdematId) {
        this.capdematId = capdematId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName2() {
        return firstName2;
    }

    public void setFirstName2(String firstName2) {
        this.firstName2 = firstName2;
    }

    public String getFirstName3() {
        return firstName3;
    }

    public void setFirstName3(String firstName3) {
        this.firstName3 = firstName3;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public String getBirthPostalCode() {
        return birthPostalCode;
    }

    public void setBirthPostalCode(String birthPostalCode) {
        this.birthPostalCode = birthPostalCode;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getHomefolderId() {
        return homefolderId;
    }

    public void setHomefolderId(String homefolderId) {
        this.homefolderId = homefolderId;
    }

}
