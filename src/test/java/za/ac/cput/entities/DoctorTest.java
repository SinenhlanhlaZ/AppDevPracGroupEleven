package za.ac.cput.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import za.ac.cput.factory.DoctorFactory;
import za.ac.cput.factory.DoctorNames;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {

    @Test
    public void testDoctor() {
        DoctorFactory docFactory = new DoctorFactory();
        DoctorNames docNames = docFactory.getDoctorFirstName("Sine");
        docNames.doctorFirstNames();
    }
}