package za.ac.cput.factory;
/*
        HospCleanStaffFactory test.java
        Author : Sinazo Mehlomakhulu (216076498)
        Date: 10 April 022
 */
import org.junit.jupiter.api.Test;
import za.ac.cput.entities.Driver;
import za.ac.cput.entities.HospCleanStaff;

import static org.junit.jupiter.api.Assertions.*;

class HospCleanStaffFactoryTest {

    @Test
    void createHospCleanStaff() {
        HospCleanStaff hospCleanStaff = HospCleanStaffFactory.createHospCleanStaff(002366,"Sinazo","Mehlomakhulu" ) ;
        System.out.println(hospCleanStaff);
    }
}