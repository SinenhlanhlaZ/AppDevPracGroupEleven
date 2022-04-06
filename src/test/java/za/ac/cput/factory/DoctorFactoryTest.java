package za.ac.cput.factory;

/*
    Doctor.java
    Entity: Doctor
    Author: Sinenhlanhla Zondi (220008922)
    Date: 25 March 2022
*/

import org.junit.jupiter.api.Test;
import za.ac.cput.entities.Doctor;

public class DoctorFactoryTest {
    @Test
    public void testDoctor() {
        Doctor doc = DoctorFactory.createDoctor("Luke", "Plapp", "0123456789");
        System.out.println(doc);
    }
}
