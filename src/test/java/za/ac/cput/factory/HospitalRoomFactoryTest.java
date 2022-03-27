package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entities.HospitalRoom;

class HospitalRoomFactoryTest {
    @Test
    public void test() {
        HospitalRoom hospRoom = HospitalRoomFactory.createHospitalRoom("4D", 2);
        System.out.println(hospRoom);

    }


}