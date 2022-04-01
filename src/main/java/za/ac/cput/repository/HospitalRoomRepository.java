package za.ac.cput.repository;

import za.ac.cput.entities.HospitalRoom;

import java.util.HashSet;
import java.util.Set;

/*
    HospitalRoomRepository.java
    Repository Entity for the Hospital Rooms
    Author: Fayaad Abrahams (218221630)
    Date: 31 March 2022
*/
public class HospitalRoomRepository implements IHospitalRoomRepository {
    public static HospitalRoomRepository repository = null;
    private Set<HospitalRoom> hospRoomDB = null;

    private HospitalRoomRepository() {
        hospRoomDB = new HashSet<HospitalRoom>();
    }

    public static HospitalRoomRepository getRepository() {
        if (repository == null) {
            repository = new HospitalRoomRepository();
        }
        return repository;
    }

    @Override
    public HospitalRoom create(HospitalRoom hospRoom) {
        boolean success = hospRoomDB.add(hospRoom);
        if (!success) return null;
        return hospRoom;
    }

    @Override
    public HospitalRoom read(String roomID) {
        HospitalRoom hospitalRoom = hospRoomDB.stream().filter(e -> e.getRoomID().equals(roomID)).findAny().orElse(null);
        return hospitalRoom;
    }

    @Override
    public HospitalRoom update(HospitalRoom hospRoom) {
        HospitalRoom oldHospitalRoom = read(hospRoom.getRoomID());
        if (oldHospitalRoom != null) {
            hospRoomDB.remove(oldHospitalRoom);
            hospRoomDB.add(hospRoom);
            return hospRoom;
        }
        return null;
    }

    @Override
    public boolean delete(String roomID) {
        HospitalRoom hospRoomDelete = read(roomID);
        if (hospRoomDelete == null) return false;
        hospRoomDB.remove(hospRoomDelete);
        return true;
    }

    @Override
    public Set<HospitalRoom> getAll() {
        return hospRoomDB;
    }
}
