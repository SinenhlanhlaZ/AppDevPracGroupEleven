package za.ac.cput.entities;

/*
    Doctor.java
    Entity: Doctor
    Author: Sinenhlanhla Zondi (220008922)
    Date: 25 March 2022
*/

public class Doctor {
    private String docID;
    private String docFirstName;
    private String docLastName;
    private String docCellNum;

    public Doctor(DoctorBuilder builder) {
        this.docID = builder.docID;
        this.docFirstName = builder.docFirstName;
        this.docLastName = builder.docLastName;
        this.docCellNum = builder.docCellNum;
    }

    //GETTERS
    public String getDocID() { return docID; }
    public String getDocFirstName() { return docFirstName; }
    public String getDocLastName() { return docLastName; }
    public String getDocCellNum() { return docCellNum; }

    //SETTERS
    public void setDocID(String docID) { this.docID = docID; }
    public void setDocFirstName(String docFirstName) { this.docFirstName = docFirstName; }
    public void setDocLastName(String docLastName) { this.docLastName = docLastName; }
    public void setDocCellNum(String docCellNum) { this.docCellNum = docCellNum; }

    //toString
    @Override
    public String toString() {
        return "Doctor{" +
                "docID='" + docID + '\'' +
                ", docFirstName='" + docFirstName + '\'' +
                ", docLastName='" + docLastName + '\'' +
                ", docCellNum='" + docCellNum + '\'' +
                '}';
    }

<<<<<<< HEAD
    public class DoctorBuilder
    {
=======
    public class DoctorBuilder {
>>>>>>> 397aa88665f1a80f651090cda7c05dc604b29a6e
        private String docID;
        private String docFirstName;
        private String docLastName;
        private String docCellNum;

        public DoctorBuilder(String docID, String docFirstName, String docLastName, String docCellNum) {
            this.docID = docID;
            this.docFirstName = docFirstName;
            this.docLastName = docLastName;
            this.docCellNum = docCellNum;
        }

        public DoctorBuilder docID(String docID) {
            this.docID = docID;
            return this;
        }

        public DoctorBuilder docFirstName(String docFirstName) {
            this.docFirstName = docFirstName;
            return this;
        }

        public DoctorBuilder docLastName(String docLastName) {
            this.docLastName = docLastName;
            return this;
        }

        public DoctorBuilder docCellNum(String docCellNum) {
            this.docCellNum = docCellNum;
            return this;
        }

        public Doctor build() {
            Doctor doc = new Doctor(this);
            return doc;
        }
<<<<<<< HEAD

=======
>>>>>>> 397aa88665f1a80f651090cda7c05dc604b29a6e
    }
}
