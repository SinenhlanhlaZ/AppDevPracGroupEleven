package za.ac.cput.entities;

/*
    Doctor.java
    Entity for the Doctors
    Author: Sinenhlanhla Zondi (220008922)
    Date: 25 March 2022
*/

public class Secretary {
    private String secID;
    private String secFirstName;
    private String secLastName;

    public Secretary(String secID, String secFirstName, String secLastName) {
        this.secID = secID;
        this.secFirstName = secFirstName;
        this.secLastName = secLastName;
    }

    //GETTERS
    public String getSecID() { return secID; }

    public String getSecFirstName() { return secFirstName; }

    public String getSecLastName() { return secLastName; }

    //SETTERS
    public void setSecID(String secID) { this.secID = secID; }

    public void setSecFirstName(String secFirstName) { this.secFirstName = secFirstName; }

    public void setSecLastName(String secLastName) { this.secLastName = secLastName; }

    //toString
    @Override
    public String toString() {
        return "Secretary{" +
                "secID='" + secID + '\'' +
                ", secFirstName='" + secFirstName + '\'' +
                ", secLastName='" + secLastName + '\'' +
                '}';
    }
}
