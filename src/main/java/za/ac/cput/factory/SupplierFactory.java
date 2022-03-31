package za.ac.cput.factory;

/*
        SupplierFactory.java
        SupplierFactory entity
        Author: Nonzwakazi Mgxaji (213181584)
        Date: 28 March 2022
 */

import za.ac.cput.entities.Driver;
import za.ac.cput.entities.Supplier;

public class SupplierFactory {
    public static Supplier createSupplier(String suppID, String suppAddress, int suppRegNum) {
        if(suppAddress == null) {
            return null;
        }

        return new Supplier.Builder().setSuppID(suppID)
                .setSuppAddress(suppAddress)
                .setSuppRegNum(suppRegNum)
                .build();
    }
}
