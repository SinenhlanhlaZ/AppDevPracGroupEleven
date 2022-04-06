package za.ac.cput.entities;

/*
    Entity: Secretary
    Author: Sinenhlanhla Zondi (220008922)
    Date: 25 March 2022
*/

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
    public String getSecID() {
        return secID;
    }

    public String getSecFirstName() {
        return secFirstName;
    }

    public String getSecLastName() {
        return secLastName;
    }

    //SETTERS
    public void setSecID(String secID) {
        this.secID = secID;
    }

    public void setSecFirstName(String secFirstName) {
        this.secFirstName = secFirstName;
    }

    public void setSecLastName(String secLastName) {
        this.secLastName = secLastName;
    }

    //toString
    @Override
    public String toString() {
        return "Secretary{" +
                "secID='" + secID + '\'' +
                ", secFirstName='" + secFirstName + '\'' +
                ", secLastName='" + secLastName + '\'' +
                '}';
    }

    public static class SecretaryBuilder {

        private String secID;
        private String secFirstName;
        private String secLastName;

        public SecretaryBuilder setID(String secID) {
            this.secID = secID;
            return this;
        }

        public SecretaryBuilder setFirstName(String secFirstName) {
            this.secFirstName = secFirstName;
            return this;
        }

        public SecretaryBuilder setLastName(String secLastName) {
            this.secLastName = secLastName;
            return this;
        }

        public SecretaryBuilder copy(Secretary secretary) {
            this.secID = secretary.secID;
            this.secFirstName = secretary.secFirstName;
            this.secLastName = secretary.secLastName;
            return this;
        }

        public Secretary build() {
            Secretary sec = new Secretary(this);
            return sec;
        }
    }

}

