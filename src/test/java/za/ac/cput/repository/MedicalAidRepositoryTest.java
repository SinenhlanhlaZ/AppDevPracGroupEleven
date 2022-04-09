package za.ac.cput.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entities.MedicalAid;
import za.ac.cput.factory.MedicalAidFactory;

import static org.junit.jupiter.api.Assertions.*;
/* MedicalAidRepositoryTest.java
Test Repository for  Medical Aid
Author: Shina Kara 219333181
Date: 06 April 2022
*/
@TestMethodOrder(MethodOrderer.MethodName.class)
class MedicalAidRepositoryTest {
    private static MedicalAidRepository repository = MedicalAidRepository.getRepository();
    private static MedicalAid medAid = MedicalAidFactory.createMedicalAid( "Metropolitan" , 415224154 , "5 Doring Road");



    @Test
    void a_create() {
        MedicalAid createdMedAid = repository.create(medAid);
        assertEquals(medAid.getMedicalNumb(), createdMedAid.getMedicalNumb());
        System.out.println("Created Medical Aid Number: " + createdMedAid);
    }

    @Test
    void b_read() {
        MedicalAid read = repository.read(medAid.getMedicalName());
        Assertions.assertNotNull(read);
        System.out.println("Read: " + read);
    }


    @Test
    void c_update() {
        MedicalAid updated = new MedicalAid.Builder().copy(medAid).setMedicAddr("Flat Rd")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(medAid.getMedicalName());
        assertTrue(success);
        System.out.println("Deleted medical aid number:  " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show All items: ");
        System.out.println(repository.getAll());
    }
}