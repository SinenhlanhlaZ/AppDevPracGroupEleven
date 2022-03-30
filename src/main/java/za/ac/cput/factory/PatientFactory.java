package za.ac.cput.factory;

import za.ac.cput.entities.Patient;
/*
    PatientFactory.java
    Entity: PatientFactory
    Author: Ishmail T Mgwena (215088417)
    Date: 28 March 2022
*/
public class PatientFactory {

    public static Patient createPatient(String patIdNum, String patFirstName
            , String patLastName, String patAddress, String patCellNum) {
        return new Patient.Builder().setPatIdNum(patIdNum)
                .setPatFirstName(patFirstName)
                .setPatLastName(patLastName)
                .setPatAddress(patAddress)
                .setPatCellNum(patCellNum)
                .build();
    }
}
