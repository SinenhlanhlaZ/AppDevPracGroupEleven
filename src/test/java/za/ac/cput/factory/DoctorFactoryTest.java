package za.ac.cput.factory;

/*
    Doctor.java
    Entity: Doctor
    Author: Sinenhlanhla Zondi (220008922)
    Date: 25 March 2022
*/

import org.junit.jupiter.api.Test;

public class DoctorFactoryTest {
    @Test
    public void testDoctor() {
        DoctorFactory docFactory = new DoctorFactory();
        DoctorNames docNames = docFactory.getDoctorFirstName("Sine");
        docNames.doctorFirstNames();
    }
}
