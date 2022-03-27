package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entities.Nurse;

class NurseFactoryTest {
    @Test
    public void test(){
        Nurse nurse = NurseFactory.createNurse("4361DFD", "Janice","Dean");
        System.out.println(nurse);

    }

}