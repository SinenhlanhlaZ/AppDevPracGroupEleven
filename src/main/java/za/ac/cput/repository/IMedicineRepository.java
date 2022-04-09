package za.ac.cput.repository;
/*
    IPatientRepository.java
    Entity: IPatientRepository
    Author: Ishmail T Mgwena (215088417)
    Date: 02 April 2022
*/

import za.ac.cput.entities.Medicine;

import java.util.Set;

public interface IMedicineRepository extends IRepository<Medicine, String> {

    public Set<Medicine> getAll();
}
