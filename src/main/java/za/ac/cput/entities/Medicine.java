package za.ac.cput.entities;

/*
    Medicine.java
    Entity: Medicine
    Author: Ishmail T Mgwena (215088417)
    Date: 28 March 2022
*/
public class Medicine {

    private String medicineID;
    private String medicineAmount;
    private String medicineType;

    //Builder Class Constructor
    private Medicine(Builder builder) {
        this.medicineID = builder.medicineID;
        this.medicineAmount = builder.medicineAmount;
        this.medicineType = builder.medicineType;
    }
    //Getters and Setters
    public String getMedicineID() {
        return medicineID;
    }

    public void setMedicineID(String medicineID) {
        this.medicineID = medicineID;
    }
    public String getMedicineAmount() {
        return medicineAmount;
    }
    public void setMedicineAmount(String medicineAmount) {
        this.medicineAmount = medicineAmount;
    }
    public String getMedicineType() {
        return medicineType;
    }
    public void setMedicineType(String medicineType) {
        this.medicineType = medicineType;
    }
    //toString
    @Override
    public String toString() {
        return "Medicine{" +
                "medicineID='" + medicineID + '\'' +
                ", medicineAmount='" + medicineAmount + '\'' +
                ", medicineType='" + medicineType + '\'' +
                '}';
    }
    //Static builder class
    public static class Builder {

        private String medicineID;
        private String medicineAmount;
        private String medicineType;

        //Setters for builder class
        public Builder setMedicineID(String medicineID) {
            this.medicineID = medicineID;
            return this;
        }
        public Builder setMedicineAmount(String medicineAmount) {
            this.medicineAmount = medicineAmount;
            return this;
        }
        public Builder setMedicineType(String medicineType) {
            this.medicineType = medicineType;
            return this;
        }
        public Builder copy(Medicine medicine) {
            this.medicineID = medicine.medicineID;
            this.medicineAmount = medicine.medicineAmount;
            this.medicineType = medicine.medicineType;
            return this;
        }
        public Medicine build() {
            return new Medicine(this);
        }
    }
}
