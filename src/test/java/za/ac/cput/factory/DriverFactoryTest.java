package za.ac.cput.factory;

/*
        DriverFactoryTest.java
        Author: Nonzwakazi Mgxaji (213181584)
        Date: 28 March 2022
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.entities.Driver;

import static org.junit.jupiter.api.Assertions.*;

class DriverFactoryTest {
    @Test
    public void test() {
        Driver driver = DriverFactory.createDriver("01", "Lunga", "Tshabalala", 456789);
        System.out.println(driver);

    }

}