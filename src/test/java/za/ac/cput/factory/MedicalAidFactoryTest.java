package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entities.MedicalAid;

import static org.junit.jupiter.api.Assertions.*;
/* MedicalAidFactoryTest.java
Factory Test for  Medical Aid
Author: Shina Kara 219333181
Date: March 2022
*/
class MedicalAidFactoryTest {
    @Test
    public void test(){
        MedicalAid medicalAid = MedicalAidFactory.createMedicalAid("Discovery" , 5865997,"Sable Park,Century City");
        System.out.println(medicalAid.toString());
        //  assertNotNull(medicalAid);
    }


}
