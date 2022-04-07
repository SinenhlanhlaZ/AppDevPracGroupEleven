package za.ac.cput.repository;
/*
    PatientRepository.java
    Entity: PatientRepository
    Author: Ishmail T Mgwena (215088417)
    Date: 02 April 2022
*/

import za.ac.cput.entities.Patient;

import java.util.Stack;

public class PatientRepository implements IPatientRepository {

    private static PatientRepository repository = null;
    private Stack<Patient> patientDB = null;

    public static PatientRepository getRepository() {
        if (repository == null)
            repository = new PatientRepository();
        return repository;
    }


    @Override
    public Patient create(Patient patient) {
        boolean success = patientDB.add(patient);
        if (!success) return null;
        return patient;
    }

    @Override
    public Patient read(String patIdNum) {
        Patient patient = patientDB.stream()
                .filter(e -> e.getPatIdNum().equals(patIdNum))
                .findAny()
                .orElse(null);
        return patient;
    }

    @Override
    public Patient update(Patient patient) {
        Patient prevPatient = read(patient.getPatIdNum());
        if (prevPatient != null) {
            patientDB.remove(prevPatient);
            patientDB.add(patient);
            return patient;
        }
        return null;
    }

    @Override
    public boolean delete(String patIdNum) {
        Patient patientToDelete = read(patIdNum);
        if (patientToDelete == null)
            return false;
        patientDB.remove(patientToDelete);
        return true;
    }

    @Override
    public Stack<Patient> getAll() {return patientDB;}
}


