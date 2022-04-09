package za.ac.cput.factory;
/*
    PatientFactory.java
    Entity: PatientFactory
    Author: Ishmail T Mgwena (215088417)
    Date: 28 March 2022
*/

import za.ac.cput.entities.Patient;
import za.ac.cput.util.Helper;


public class PatientFactory {

    public static Patient createPatient(String patIdNum, String patFirstName
            , String patLastName, String patAddress, String patCellNum) {

        String patIdNumber = Helper.generateID();
        Patient patient = new Patient.Builder().setPatIdNum(patIdNum)
                .setPatFirstName(patFirstName)
                .setPatLastName(patLastName)
                .setPatAddress(patAddress)
                .setPatCellNum(patCellNum)
                .build();
        return patient;
    }
}
