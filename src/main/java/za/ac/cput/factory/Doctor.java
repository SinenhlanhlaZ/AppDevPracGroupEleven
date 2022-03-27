package za.ac.cput.factory;

/*
    Doctor.java
    Entity: Doctor
    Author: Sinenhlanhla Zondi (220008922)
    Date: 25 March 2022
*/

public class Doctor implements DoctorNames{
    @Override
    public void doctorFirstNames() {
        System.out.println("Surname of the doctor is Zondi.");
    }
}
