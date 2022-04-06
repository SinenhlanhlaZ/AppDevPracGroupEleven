package za.ac.cput.factory;

/*
    MedicineFactoryTest.java
    Entity: MedicineFactoryTest
    Author: Ishmail T Mgwena (215088417)
    Date: 28 March 2022
*/

import org.junit.jupiter.api.Test;
import za.ac.cput.entities.Medicine;

import static org.junit.jupiter.api.Assertions.*;

class MedicineFactoryTest {

    @Test
    public void test() {
        Medicine medicine = MedicineFactory.createMedicine("2189","R30","Painkillers");
        assertNotNull(medicine);
    }
}