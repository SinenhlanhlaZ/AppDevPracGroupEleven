package za.ac.cput.repository;
import za.ac.cput.entities.MedicalAid;
import java.util.HashSet;
import java.util.Set;
/* MedicalAidRepository.java
Repository for  Medical Aid
Author: Shina Kara 219333181
Date: 06 April 2022
*/
public class MedicalAidRepository implements IMedicalAidRepository{
    public static MedicalAidRepository repository = null;
    private Set<MedicalAid> medAidDB = null;

    private MedicalAidRepository() {
        medAidDB = new HashSet<MedicalAid>();
    }

    public static MedicalAidRepository getRepository() {
        if (repository == null) {
            repository = new MedicalAidRepository();
        }
        return repository;
    }

    @Override
    public MedicalAid create(MedicalAid medAid) {
        boolean success = medAidDB.add(medAid);
        if (!success) return null;
        return medAid;
    }

    @Override
    public MedicalAid read(String medicalNum) {
        MedicalAid medicalAid = medAidDB.stream().filter(e -> e.getMedicalName().equals(medicalNum)).findAny().orElse(null);
        return medicalAid;
    }

    @Override
    public MedicalAid update(MedicalAid medAid) {
        MedicalAid oldMedicalAid = read(medAid.getMedicalName());
        if (oldMedicalAid != null) {
            medAidDB.remove(oldMedicalAid);
            medAidDB.add(medAid);
            return medAid;
        }
        return null;
    }

    @Override
    public boolean delete(String medicalNumb) {
        MedicalAid medNumbDelete = read(medicalNumb);
        if (medNumbDelete == null) return false;
        medAidDB.remove(medNumbDelete);
        return true;
    }

    @Override
    public Set<MedicalAid> getAll() {
        return medAidDB;
    }
}
