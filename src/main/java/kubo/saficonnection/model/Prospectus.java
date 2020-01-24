package kubo.saficonnection.model;

public class Prospectus {

    protected int prospectusId;
    protected String firstName;
    protected String secondName;
    protected int zipCode;

    public Prospectus(int prospectusId, String firstName, String secondName, int zipCode) {
        this.prospectusId = prospectusId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.zipCode = zipCode;
    }

    public Prospectus(){
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getProspectusId() {
        return prospectusId;
    }

    public void setProspectusId(int prospectusId) {
        this.prospectusId = prospectusId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

}
