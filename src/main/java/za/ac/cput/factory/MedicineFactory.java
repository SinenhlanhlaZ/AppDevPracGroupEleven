package za.ac.cput.factory;
/*
    MedicineFactory.java
    Entity: MedicineFactory
    Author: Ishmail T Mgwena (215088417)
    Date: 28 March 2022
*/
import za.ac.cput.entities.Medicine;

public class MedicineFactory {

    public static Medicine createMedicine(String medicineID, String medicineAmount, String medicineType) {
        return new Medicine.Builder().setMedicineID(medicineID)
                .setMedicineAmount(medicineAmount)
                .setMedicineType(medicineType)
                .build();
    }
}
