package fr.cg95.cvq.business.users.xml;

import java.util.List;

public class ListIndividualXml {

    private List<IndividualXml> createdUsers;
    private List<IndividualXml> editedUsers;
    private List<IndividualXml> deletedUsers;

    public ListIndividualXml(List<IndividualXml> createdUsers, List<IndividualXml> editedUsers, List<IndividualXml> deletedUsers) {
        super();
        this.createdUsers = createdUsers;
        this.editedUsers = editedUsers;
        this.deletedUsers = deletedUsers;
    }

    public List<IndividualXml> getCreatedUsers() {
        return createdUsers;
    }
    public void setCreatedUsers(List<IndividualXml> createdUsers) {
        this.createdUsers = createdUsers;
    }
    public List<IndividualXml> getEditedUsers() {
        return editedUsers;
    }
    public void setEditedUsers(List<IndividualXml> editedUsers) {
        this.editedUsers = editedUsers;
    }
    public List<IndividualXml> getDeletedUsers() {
        return deletedUsers;
    }
    public void setDeletedUsers(List<IndividualXml> deletedUsers) {
        this.deletedUsers = deletedUsers;
    }


}
