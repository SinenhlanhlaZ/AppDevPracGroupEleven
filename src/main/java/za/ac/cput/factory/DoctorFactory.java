package za.ac.cput.factory;

/*
    Doctor.java
    Entity: Doctor
    Author: Sinenhlanhla Zondi (220008922)
    Date: 25 March 2022
*/

public class DoctorFactory {
    public DoctorNames getDoctorFirstName(String docFirstName) {
        if(docFirstName == null) {
            return null;
        }
        if(docFirstName.equals("Sine")) {
            return new Doctor();
        }
        return null;
    }
}
