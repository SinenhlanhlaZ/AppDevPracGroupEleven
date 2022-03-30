package za.ac.cput.factory;
/*
    NurseFactory.java
    Factory Entity for the Nurses
    Author: Fayaad Abrahams (218221630)
    Date: 27 March 2022
*/
import za.ac.cput.entities.Nurse;

public class NurseFactory {

    public static Nurse createNurse(String nurseID, String nurseFirstName, String nurseLastName) {
        // Generate Method to create nurseID in Helper package

        if (nurseFirstName.equals("") || nurseFirstName == null) {
            return null;
        }
        if (nurseLastName.equals("") || nurseFirstName == null) {
            return null;
        }
        return new Nurse.Builder().setNurseID(nurseID)
                .setNurseFirstName(nurseFirstName)
                .setNurseLastName(nurseLastName)
                .build();
    }

}
