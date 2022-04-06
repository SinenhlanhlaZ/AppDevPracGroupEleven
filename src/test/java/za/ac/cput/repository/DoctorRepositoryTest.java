package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.entities.Doctor;
import za.ac.cput.entities.Secretary;
import za.ac.cput.factory.DoctorFactory;
import za.ac.cput.factory.SecretaryFactory;

import static org.junit.jupiter.api.Assertions.*;

class DoctorRepositoryTest {

    private static DoctorRepository docRepository = DoctorRepository.getRepository();
    private static Doctor docEntityObj = DoctorFactory
            .createDoctor("Franklin", "Clinton", "0987654321");

    @Test
    void create() {
        Doctor createdDoc = docRepository.create(docEntityObj);
        assertEquals(docEntityObj.getDocID(), createdDoc.getDocID());
        System.out.println("Created doctor: "+createdDoc);
    }

    @Test
    void read() {
        Doctor readDoc = docRepository.read(docEntityObj.getDocID());
        assertNotNull(readDoc);
        System.out.println("Read doctor: "+readDoc);
    }

    @Test
    void update() {
        Doctor updateDoc = new Doctor.DoctorBuilder().copy(docEntityObj)
                .setDocFirstName("Molly").build();
        assertNotNull(docRepository.update(updateDoc));
        System.out.println("Updated doctor: "+updateDoc);
    }

    @Test
    void delete() {
        boolean success = docRepository.delete(docEntityObj.getDocID());
        assertTrue(success);
        System.out.println("Deleted: "+success);
    }

    @Test
    void getDoctors() {
        System.out.println("Show all: ");
        System.out.println(docRepository.getDoctors());
    }
}