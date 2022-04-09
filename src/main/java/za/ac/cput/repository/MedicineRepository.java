package za.ac.cput.repository;
/*
    MedicineRepository.java
    Entity: MedicineRepository
    Author: Ishmail T Mgwena (215088417)
    Date: 02 April 2022
*/

import za.ac.cput.entities.Medicine;

import java.util.Set;

public class MedicineRepository implements IMedicineRepository{

    private static MedicineRepository repository= null;
    private Set<Medicine> medicineDB = null;

    public static MedicineRepository getRepository() {
        if (repository == null)
            repository = new MedicineRepository();
        return repository;
    }

    @Override
    public Medicine create(Medicine medicine) {
        boolean success = medicineDB.add(medicine);
        if (!success) return null;
        return medicine;
    }

    @Override
    public Medicine read(String medicineID) {
        Medicine medicine = medicineDB.stream()
                .filter(m -> m.getMedicineID().equals(medicineID))
                .findAny()
                .orElse(null);
        return medicine;
    }

    @Override
    public Medicine update(Medicine medicine) {
        Medicine prevMedicine = read(medicine.getMedicineID());
        if (prevMedicine != null) {
            medicineDB.remove(prevMedicine);
            medicineDB.add(medicine);
            return medicine;
        }
        return null;
    }

    @Override
    public boolean delete(String medicineID) {
        Medicine medicineToDelete = read(medicineID);
        if (medicineToDelete == null)
            return false;
        medicineDB.remove(medicineToDelete);
        return true;
    }
    @Override
    public Set<Medicine> getAll() {return medicineDB;}
}
