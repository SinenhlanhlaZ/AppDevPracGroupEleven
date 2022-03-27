package za.ac.cput.entities;

/*
    Doctor.java
    Entity: Secretary
    Author: Sinenhlanhla Zondi (220008922)
    Date: 25 March 2022
*/

import java.util.Locale;

public class Secretary {
    private String secID;
    private String secFirstName;
    private String secLastName;

    private Secretary(SecretaryBuilder builder) {
        this.secID = builder.secID;
        this.secFirstName = builder.secFirstName;
        this.secLastName = builder.secLastName;
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

<<<<<<< HEAD
    public class SecretaryBuilder
    {
=======
    public class SecretaryBuilder {
>>>>>>> 397aa88665f1a80f651090cda7c05dc604b29a6e
        private String secID;
        private String secFirstName;
        private String secLastName;

        public SecretaryBuilder(String secID, String secFirstName, String secLastName) {
            this.secID = secID;
            this.secFirstName = secFirstName;
            this.secLastName = secLastName;
        }

        public SecretaryBuilder secID(String secID) {
            this.secID = secID;
            return this;
        }

        public SecretaryBuilder secFirstName(String secFirstName) {
            this.secFirstName = secFirstName;
            return this;
        }

        public SecretaryBuilder secLastName(String secLastName) {
            this.secLastName = secLastName;
            return this;
        }

        public Secretary build() {
            Secretary sec = new Secretary(this);
            return sec;
        }
    }
<<<<<<< HEAD
=======

>>>>>>> 397aa88665f1a80f651090cda7c05dc604b29a6e
}
