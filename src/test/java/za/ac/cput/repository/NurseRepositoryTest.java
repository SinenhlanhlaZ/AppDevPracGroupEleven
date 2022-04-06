package za.ac.cput.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entities.Nurse;
import za.ac.cput.factory.NurseFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/*
    NurseRepositoryTest.java
    Test Repository Entity for the Nurses
    Author: Fayaad Abrahams (218221630)
    Date: 1 April 2022
*/
@TestMethodOrder(MethodOrderer.MethodName.class)
class NurseRepositoryTest {
    private static NurseRepository repository = NurseRepository.getRepository();
    private static Nurse nurse = NurseFactory.createNurse("Janice", "Maven");

    @Test
    void a_create() {
        Nurse createdNurse = repository.create(nurse);
        assertEquals(nurse.getNurseID(), createdNurse.getNurseID());
        System.out.println("Created Nurse ID: " + createdNurse);
    }

    @Test
    void b_read() {
        Nurse read = repository.read(nurse.getNurseID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Nurse updated = new Nurse.Builder().copy(nurse).setNurseFirstName("Helena")
                .setNurseLastName("Maima")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(nurse.getNurseID());
        Assertions.assertTrue(success);
        System.out.println("Deleted nurse ID: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all Items: ");
        System.out.println(repository.getAll());
    }
}