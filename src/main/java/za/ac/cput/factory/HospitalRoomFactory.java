package za.ac.cput.factory;

import za.ac.cput.entities.HospitalRoom;

public class HospitalRoomFactory {

    public static HospitalRoom createHospitalRoom(String roomID, Integer roomFloor) {
        if (roomFloor == null) {
            return null;
        }
        return new HospitalRoom.Builder().setRoomID(roomID)
                .setRoomFloor(roomFloor)
                .build();
    }
}
