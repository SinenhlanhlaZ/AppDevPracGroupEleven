package za.ac.cput.repository;
/*
    IPatientRepository.java
    Entity: IPatientRepository
    Author: Ishmail T Mgwena (215088417)
    Date: 02 April 2022
*/

import za.ac.cput.entities.Patient;

import java.util.Stack;

public interface IPatientRepository extends IRepository<Patient, String> {

    public Stack<Patient> getAll();
}
