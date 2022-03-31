package za.ac.cput.factory;

/*
        HospCleanStaffFactory.java
        Author : Sinazo Mehlomakhulu (216076498)
        Date 27 March 2022
        */

import za.ac.cput.entities.HospCleanStaff;

public class HospCleanStaffFactory {

    public static HospCleanStaff createHospCleanStaff(Integer empID, String empFirstName, String empLastName) {
        if (empFirstName.equals("")) {
            return null;
        }
        if (empLastName.equals("")) {
            return null;
        }
        return new HospCleanStaff.HospCleanStaffBuilder()
                .setEmpFirstName(empFirstName)
                .setEmpLastName(empLastName)
                .build();

    }
}