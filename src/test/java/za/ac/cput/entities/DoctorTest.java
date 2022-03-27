package za.ac.cput.entities;

/*
    Doctor.java
    Entity: Doctor
    Author: Sinenhlanhla Zondi (220008922)
    Date: 25 March 2022
*/

import org.junit.jupiter.api.Test;
import za.ac.cput.factory.DoctorFactory;
import za.ac.cput.factory.DoctorNames;

class DoctorTest {

    @Test
    public void testDoctor() {
        DoctorFactory docFactory = new DoctorFactory();
        DoctorNames docNames = docFactory.getDoctorFirstName("Sine");
        docNames.doctorFirstNames();
    }
}