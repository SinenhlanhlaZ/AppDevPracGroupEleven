package za.ac.cput.entities;

/*
    Patient.java
    Entity: Patient
    Author: Ishmail T Mgwena (215088417)
    Date: 28 March 2022
*/

public class Patient {

    private String patIdNum;
    private String patFirstName;
    private String patLastName;
    private String patAddress;
    private String patCellNum;

    //Builder Class Constructor
    private Patient(Builder builder) {
        this.patIdNum = builder.patIdNum;
        this.patFirstName = builder.patFirstName;
        this.patLastName = builder.patLastName;
        this.patAddress = builder.patAddress;
        this.patCellNum = builder.patCellNum;
    }
    // Getters and Setters
    public String getPatIdNum() {
        return patIdNum;
    }
    public void setPatIdNum(String patIdNum) {
        this.patIdNum = patIdNum;
    }
    public String getPatFirstName() {
        return patFirstName;
    }
    public void setPatFirstName(String patFirstName) {
        this.patFirstName = patFirstName;
    }
    public String getPatLastName() {
        return patLastName;
    }
    public void setPatLastName(String patLastName) {
        this.patLastName = patLastName;
    }
    public String getPatAddress() {
        return patAddress;
    }
    public void setPatAddress(String patAddress) {
        this.patAddress = patAddress;
    }
    public String getPatCellNum() {
        return patCellNum;
    }
    public void setPatCellNum(String patCellNum) {
        this.patCellNum = patCellNum;
    }
    //toString
    @Override
    public String toString() {
        return "Patient{" +
                "patIdNum='" + patIdNum + '\'' +
                ", patFirstName='" + patFirstName + '\'' +
                ", patLastName='" + patLastName + '\'' +
                ", patAddress='" + patAddress + '\'' +
                ", patCellNum='" + patCellNum + '\'' +
                '}';
    }
    //Static builder class
    public static class Builder {

        private String patIdNum;
        private String patFirstName;
        private String patLastName;
        private String patAddress;
        private String patCellNum;

        //Setters for builder class
        public Builder setPatIdNum(String patIdNum) {
            this.patIdNum = patIdNum;
            return this;
        }

        public Builder setPatFirstName(String patFirstName) {
            this.patFirstName = patFirstName;
            return this;
        }

        public Builder setPatLastName(String patLastName) {
            this.patLastName = patLastName;
            return this;
        }

        public Builder setPatAddress(String patAddress) {
            this.patAddress = patAddress;
            return this;
        }

        public Builder setPatCellNum(String patCellNum) {
            this.patCellNum = patCellNum;
            return this;
        }
        public Builder copy (Patient patient) {
            this.patIdNum = patient.patIdNum;
            this.patFirstName = patient.patFirstName;
            this.patLastName = patient.patLastName;
            this.patAddress = patient.patAddress;
            this.patCellNum = patient.patCellNum;
            return this;
        }
        public Patient build() {
            return new Patient(this);
        }
    }
}
