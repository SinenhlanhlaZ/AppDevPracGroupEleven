package za.ac.cput.repository;

import za.ac.cput.entities.Nurse;

import java.util.Set;

/*
    NurseRepository.java
    Interface Repository Entity for the Nurses
    Author: Fayaad Abrahams (218221630)
    Date: 31 March 2022
*/
public interface INurseRepository extends IRepository<Nurse, String>{
    public Set<Nurse> getAll();
}
