package za.ac.cput.repository;
/*
    MedicineRepository.java
    Entity: MedicineRepository
    Author: Ishmail T Mgwena (215088417)
    Date: 02 April 2022
*/
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entities.Medicine;
import za.ac.cput.factory.MedicineFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

class MedicineRepositoryTest {

    private static MedicineRepository repository = MedicineRepository.getRepository();
    private static Medicine medicine = MedicineFactory.createMedicine("T3445","R30","Painkillers");

    @Test
    void create() {
        Medicine created = repository.create(medicine);
        assertEquals(medicine.getMedicineID(), created.getMedicineID());
        System.out.println("Create: " + created );
    }
    @Test
    void read() {
        Medicine read = repository.read(medicine.getMedicineID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }
    @Test
    void update() {
        Medicine updated = new Medicine.Builder().copy(medicine).setMedicineAmount("R31")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated " + updated);
    }
    @Test
    void delete() {
        boolean deleted = repository.delete(medicine.getMedicineID());
        assertTrue (deleted);
        System.out.println("Deleted: " + deleted);
    }
    @Test
    void getAll() {
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}