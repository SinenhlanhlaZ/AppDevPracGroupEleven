package za.ac.cput.entities;
/*
    Nurse.java
    Entity for the Nurses
    Author: Fayaad Abrahams (218221630)
    Date: 27 March 2022
*/
public class Nurse {
    private String nurseID;
    private String nurseFirstName;
    private String nurseLastName;

    private Nurse(Builder builder) {
        this.nurseID = builder.nurseID;
        this.nurseFirstName = builder.nurseFirstName;
        this.nurseLastName = builder.nurseLastName;

    }

    public String getNurseID() {
        return nurseID;
    }

    public void setNurseID(String nurseID) {
        this.nurseID = nurseID;
    }

    public String getNurseFirstName() {
        return nurseFirstName;
    }

    public void setNurseFirstName(String nurseFirstName) {
        this.nurseFirstName = nurseFirstName;
    }

    public String getNurseLastName() {
        return nurseLastName;
    }

    public void setNurseLastName(String nurseLastName) {
        this.nurseLastName = nurseLastName;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "nurseID='" + nurseID + '\'' +
                ", nurseFirstName='" + nurseFirstName + '\'' +
                ", nurseLastName='" + nurseLastName + '\'' +
                '}';
    }

    public static class Builder {
        private String nurseID;
        private String nurseFirstName;
        private String nurseLastName;

        public Builder setNurseID(String nurseID) {
            this.nurseID = nurseID;
            return this;
        }

        public Builder setNurseFirstName(String nurseFirstName) {
            this.nurseFirstName = nurseFirstName;
            return this;
        }

        public Builder setNurseLastName(String nurseLastName) {
            this.nurseLastName = nurseLastName;
            return this;
        }

        public Builder copy(Nurse nurse) {
            this.nurseID = nurse.nurseID;
            this.nurseFirstName = nurse.nurseFirstName;
            this.nurseLastName = nurse.nurseLastName;
            return this;
        }

        public Nurse build() {
            return new Nurse(this);
        }
    }
}
