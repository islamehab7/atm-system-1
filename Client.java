public class Client {
    String name, address, nationalID,  dateOfBirth;
    public Client(String name, String address, String nationalID, String dateOfBirth) {
        this.name = name;
        this.address = address;
        this.nationalID = nationalID;
        this.dateOfBirth = dateOfBirth;
    }
    public Client() {
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
