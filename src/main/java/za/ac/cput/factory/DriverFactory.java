package za.ac.cput.factory;

/*
        DriverFactory.java
        DriverFactory entity
        Author: Nonzwakazi Mgxaji (213181584)
        Date: 28 March 2022
 */

import za.ac.cput.entities.Driver;

public class DriverFactory {
    public static Driver createDriver(String driverID, String driverFirstName, String driverLastName, Integer driverLicenseNum) {
        if(driverFirstName == null) {
            return null;
        }

        return new Driver.Builder().setDriverID(driverID)
                .setDriverFirstName(driverFirstName)
                .setDriverLastName(driverLastName)
                .setDriverLicenseNum(driverLicenseNum)
                .build();
    }
}
