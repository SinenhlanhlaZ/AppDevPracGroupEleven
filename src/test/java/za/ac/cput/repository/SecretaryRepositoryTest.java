package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entities.Secretary;
import za.ac.cput.factory.SecretaryFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class SecretaryRepositoryTest {

    private static SecretaryRepository secretaryRepository = SecretaryRepository.getRepository();
    private static Secretary secretaryEntObj = SecretaryFactory.createSecretary("Luke", "Plapp");

    @Test
    void create() {
        Secretary created = secretaryRepository.create(secretaryEntObj);
        assertEquals(secretaryEntObj.getSecID(), created.getSecID());
        System.out.println("Create: "+created);
    }

    @Test
    void read() {
        Secretary read = secretaryRepository.read(secretaryEntObj.getSecID());
        assertNotNull(read);
        System.out.println("Read: "+read);
    }

    @Test
    void update() {
        Secretary update = new Secretary.SecretaryBuilder().copy(secretaryEntObj).setLastName("Mills").build();
        assertNotNull(secretaryRepository.update(update));
        System.out.println("Updated: "+update);
    }

    @Test
    void delete() {
        boolean success = secretaryRepository.delete(secretaryEntObj.getSecID());
        assertTrue(success);
        System.out.println("Deleted: "+success);
    }

    @Test
    void getSecretaries() {
        System.out.println("Show all: ");
        System.out.println(secretaryRepository.getSecretaries());
    }
}