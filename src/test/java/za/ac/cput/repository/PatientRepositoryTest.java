package za.ac.cput.repository;
/*
    PatientRepository.java
    Entity: PatientRepository
    Author: Ishmail T Mgwena (215088417)
    Date: 02 April 2022
*/

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entities.Patient;
import za.ac.cput.factory.PatientFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

class PatientRepositoryTest {

    private static PatientRepository repository = PatientRepository.getRepository();
    private static Patient patient = PatientFactory.createPatient("de2678","Tiger","Woods",
            "S22 Cape Town","098 6778880");

    @Test
    void create() {
        Patient created = repository.create(patient);
        assertEquals(patient.getPatIdNum(), created.getPatIdNum());
        System.out.println("Create: " + created );
    }
    @Test
    void read() {
        Patient read = repository.read(patient.getPatIdNum());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }
    @Test
    void update() {
        Patient updated = new Patient.Builder().copy(patient).setPatLastName("William")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated " + updated);
    }
    @Test
    void delete() {
        boolean success = repository.delete(patient.getPatIdNum());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }
    @Test
    void getAll() {
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}