package za.ac.cput.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.entities.HospitalRoom;
import za.ac.cput.factory.HospitalRoomFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
/*
    HospitalRoomRepositoryTest.java
    Test Repository Entity for the Hospital Rooms
    Author: Fayaad Abrahams (218221630)
    Date: 1 April 2022
*/
class HospitalRoomRepositoryTest {
    private static HospitalRoomRepository repository = HospitalRoomRepository.getRepository();
    private static HospitalRoom hospRoom = HospitalRoomFactory.createHospitalRoom(2);

    @Test
    void create() {
        HospitalRoom createdRoom = repository.create(hospRoom);
        assertEquals(hospRoom.getRoomID(), createdRoom.getRoomID());
        System.out.println("Created Room ID: " + createdRoom);
    }

    @Test
    void read() {
        HospitalRoom read = repository.read(hospRoom.getRoomID());
        Assertions.assertNotNull(read);
        System.out.println("Read: " + read);

    }

    @Test
    void update() {
    }

    @Test
    void delete() {
        boolean success = repository.delete(hospRoom.getRoomID());
        assertTrue(success);
        System.out.println("Deleted room ID: " + success);
    }

    @Test
    void getAll() {
        System.out.println("Show All items: ");
        System.out.println(repository.getAll());
    }
}