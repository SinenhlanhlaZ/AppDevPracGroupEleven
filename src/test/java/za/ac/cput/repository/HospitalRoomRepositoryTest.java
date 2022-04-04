package za.ac.cput.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entities.HospitalRoom;
import za.ac.cput.factory.HospitalRoomFactory;

import static org.junit.jupiter.api.Assertions.*;

/*
    HospitalRoomRepositoryTest.java
    Test Repository Entity for the Hospital Rooms
    Author: Fayaad Abrahams (218221630)
    Date: 1 April 2022
*/
@TestMethodOrder(MethodOrderer.MethodName.class)
class HospitalRoomRepositoryTest {
    private static HospitalRoomRepository repository = HospitalRoomRepository.getRepository();
    private static HospitalRoom hospRoom = HospitalRoomFactory.createHospitalRoom(2);

    @Test
    void a_create() {
        HospitalRoom createdRoom = repository.create(hospRoom);
        assertEquals(hospRoom.getRoomID(), createdRoom.getRoomID());
        System.out.println("Created Room ID: " + createdRoom);
    }

    @Test
    void b_read() {
        HospitalRoom read = repository.read(hospRoom.getRoomID());
        Assertions.assertNotNull(read);
        System.out.println("Read: " + read);

    }

    @Test
    void c_update() {
        HospitalRoom updated = new HospitalRoom.Builder().copy(hospRoom).setRoomFloor(10)
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(hospRoom.getRoomID());
        assertTrue(success);
        System.out.println("Deleted room ID: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show All items: ");
        System.out.println(repository.getAll());
    }
}