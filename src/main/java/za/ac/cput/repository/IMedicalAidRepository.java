package za.ac.cput.repository;

import za.ac.cput.entities.MedicalAid;

import java.util.Set;
/* iMedicalAidRepository.java
Repository Interface for the Medical Aid
Author: Shina Kara 219333181
Date: 06 April 2022
*/

public interface IMedicalAidRepository extends IRepository<MedicalAid,String> {
    public Set<MedicalAid> getAll();
}
