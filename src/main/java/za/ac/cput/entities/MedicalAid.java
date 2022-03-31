package za.ac.cput.entities;
// MedicalAid.java
//Entity for the Medical Aid
// Author: Shina Kara 219333181
//Date: 27 March 2022

public class MedicalAid {
    private String medicalName;
    private Integer medicalNum;
    private String medicAddr;

    private MedicalAid (Builder builder) {
        this.medicalName = builder.medicalName;
        this.medicalNum = builder.medicalNum;
        this.medicAddr=builder.medicAddr;
    }

    //getters and setters

    public String getMedicAddr() {
        return medicAddr;
    }

    public void setMedicAddr(String medicAddr) {
        this.medicAddr = medicAddr;
    }

    public Integer getMedicalNumb() {
        return medicalNum;
    }

    public void setMedicalNumb(Integer medicalNum) {
        this.medicalNum = medicalNum;
    }

    public String getMedicalName() {
        return medicalName;
    }

    public void setMedicalName(String medicalName) {
        this.medicalName = medicalName;
    }
//toString

    @Override
    public String toString() {
        return "MedicalAid{" +
                "medicalName='" + medicalName + '\'' +
                ", medicalNum=" + medicalNum +
                ", medicAddr='" + medicAddr + '\'' +
                '}';
    }

    public static class Builder{

        private String medicalName;
        private Integer medicalNum;
        private String medicAddr;

        public Builder setMedicalName(String medicalName){
            this.medicalName = medicalName;
            return this ;}

        public Builder setMedicalNum(Integer medicalNum){
            this.medicalNum = medicalNum;
            return this ;}

        public Builder setMedicAddr(String medicAddr){
            this.medicAddr = medicAddr;
            return this ;}

        public Builder copy(MedicalAid medicalAid) {
            this.medicalName = medicalAid.medicalName;
            this.medicalNum =medicalAid.medicalNum;
            this.medicAddr   =medicalAid.medicAddr;
            return this;
        }
        public MedicalAid build(){
            return new MedicalAid(this);
        }
    }
}
