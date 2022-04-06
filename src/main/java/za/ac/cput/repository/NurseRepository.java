package za.ac.cput.repository;

import za.ac.cput.entities.Nurse;

import java.util.HashSet;
import java.util.Set;

/*
    NurseRepository.java
    Repository Entity for the Nurses
    Author: Fayaad Abrahams (218221630)
    Date: 31 March 2022
*/
public class NurseRepository implements INurseRepository {
    public static NurseRepository repository = null;
    private Set<Nurse> nurseDB = null;

    private NurseRepository() {
        nurseDB = new HashSet<Nurse>();
    }

    public static NurseRepository getRepository() {
        if (repository == null) {
            repository = new NurseRepository();
        }
        return repository;
    }

    @Override
    public Nurse create(Nurse nurse) {
        boolean success = nurseDB.add(nurse);
        if (!success) return null;
        return nurse;
    }

    @Override
    public Nurse read(String nurseID) {
        Nurse nurse = nurseDB.stream().filter(e -> e.getNurseID().equals(nurseID)).findAny().orElse(null);
        return nurse;
    }


    public Nurse update(Nurse nurse) {
        Nurse oldNurse = read(nurse.getNurseID());
        if (oldNurse != null) {
            nurseDB.remove(oldNurse);
            nurseDB.add(nurse);
            return nurse;
        }
        return null;
    }

    @Override
    public boolean delete(String nurseID) {
        Nurse nurseDelete = read(nurseID);
        if (nurseDelete == null) return false;
        nurseDB.remove(nurseDelete);
        return true;
    }

    @Override
    public Set<Nurse> getAll() {
        return nurseDB;
    }
}
