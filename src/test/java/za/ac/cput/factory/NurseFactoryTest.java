package za.ac.cput.factory;
/*
    NurseFactoryTest.java
    Test file for the NurseFactory
    Author: Fayaad Abrahams (218221630)
    Date: 27 March 2022
*/
import org.junit.jupiter.api.Test;
import za.ac.cput.entities.Nurse;

class NurseFactoryTest {
    @Test
    public void test(){
        Nurse nurse = NurseFactory.createNurse( "Janice","Dean");
        System.out.println(nurse);

    }

}