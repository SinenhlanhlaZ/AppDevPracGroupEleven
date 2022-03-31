package za.ac.cput.factory;
/*
    MedicalAidFactory.java
    Entity for the Medical Aid Factory
    Author: Shina Kara 219333181
    Date: 28 March 2022
*/
import za.ac.cput.entities.MedicalAid;

public class MedicalAidFactory {
    public static MedicalAid createMedicalAid(String medicalName, Integer medicalNum, String medicAddr) {
        if (medicalName.equals("")) {
            return null;
        }
        if (medicalNum == null) {
            return null;
        }
        if (medicAddr.equals("")) {
            return null;
        }

        return new MedicalAid.Builder().setMedicalName(medicalName)
                .setMedicalNum(medicalNum)
                .setMedicAddr(medicAddr)
                .build();
    }
}
