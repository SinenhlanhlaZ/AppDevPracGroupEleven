package za.ac.cput.factory;
/*
    HospitalRoomFactoryTest.java
    Test file for the HospitalRoomsFactory
    Author: Fayaad Abrahams (218221630)
    Date: 27 March 2022
*/
import org.junit.jupiter.api.Test;
import za.ac.cput.entities.HospitalRoom;

class HospitalRoomFactoryTest {
    @Test
    public void test() {
        HospitalRoom hospRoom = HospitalRoomFactory.createHospitalRoom( 2);
        System.out.println(hospRoom);

    }


}