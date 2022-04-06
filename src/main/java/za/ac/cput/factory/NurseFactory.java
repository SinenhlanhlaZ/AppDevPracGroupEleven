package za.ac.cput.factory;
/*
    NurseFactory.java
    Factory Entity for the Nurses
    Author: Fayaad Abrahams (218221630)
    Date: 27 March 2022
*/
import za.ac.cput.entities.Nurse;
import za.ac.cput.util.Helper;

public class NurseFactory {

    public static Nurse createNurse( String nurseFirstName, String nurseLastName) {
        // Generate Method to create nurseID in Helper package
        String nurseID = Helper.generateID();

        if(Helper.isNullorEmpty(nurseFirstName) || Helper.isNullorEmpty(nurseLastName))
            return null;

        return new Nurse.Builder().setNurseID(nurseID)
                .setNurseFirstName(nurseFirstName)
                .setNurseLastName(nurseLastName)
                .build();
    }

}
