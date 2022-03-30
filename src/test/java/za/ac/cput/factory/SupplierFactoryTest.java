package za.ac.cput.factory;

/*
        SupplierFactoryTest.java
        Author: Nonzwakazi Mgxaji (213181584)
        Date: 28 March 2022
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.entities.Supplier;


import static org.junit.jupiter.api.Assertions.*;

class SupplierFactoryTest {
    @Test
    public void test() {
        Supplier supplier = SupplierFactory.createSupplier("01", "61 Loop Street Cape Town 8000", 777888);
        System.out.println(supplier);
    }
}