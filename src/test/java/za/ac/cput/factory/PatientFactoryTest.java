package za.ac.cput.factory;

/*
    PatientFactoryTest.java
    Entity: PatientFactoryTest
    Author: Ishmail T Mgwena (215088417)
    Date: 28 March 2022
*/

import org.junit.jupiter.api.Test;
import za.ac.cput.entities.Patient;

import static org.junit.jupiter.api.Assertions.*;

class PatientFactoryTest {

    @Test
    public void test() {
        Patient patient = PatientFactory.createPatient("266d12","Ishmail","Mgwena"
        ,"D12 Cape Town","091788574");
        assertNotNull(patient);
    }

}