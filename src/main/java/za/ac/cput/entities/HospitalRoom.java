package za.ac.cput.entities;

/*
    HospitalRoom.java
    Entity for the Hospital Rooms
    Author: Fayaad Abrahams (218221630)
    Date: 27 March 2022
*/
public class HospitalRoom {
    private String roomID;
    private int roomFloor;


    private HospitalRoom(Builder builder) {
        this.roomFloor = builder.roomFloor;
        this.roomID = builder.roomID;
    }


    public int getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(int roomFloor) {
        this.roomFloor = roomFloor;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    @Override
    public String toString() {
        return "HospitalRoom{" +
                "roomFloor=" + roomFloor +
                ", roomID='" + roomID + '\'' +
                '}';
    }

    public static class Builder {
        private int roomFloor;
        private String roomID;

        public Builder setRoomFloor(int roomFloor) {
            this.roomFloor = roomFloor;
            return this;
        }

        public Builder setRoomID(String roomID) {
            this.roomID = roomID;
            return this;
        }

        public Builder copy(HospitalRoom hospitalRoom) {
            this.roomFloor = hospitalRoom.roomFloor;
            this.roomID = hospitalRoom.roomID;
            return this;
        }

        public HospitalRoom build() {
            return new HospitalRoom(this);
        }
    }
}
