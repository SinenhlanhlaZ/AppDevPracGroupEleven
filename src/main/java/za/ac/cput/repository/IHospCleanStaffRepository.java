package za.ac.cput.repository;
/*
    IHospCleanStaffRepository.java
    interface Repository for the Hospital clean staff
    Author: Sinazo Mehlomakhulu (216076498)
    Date: 04 April 2022
 */
import za.ac.cput.entities.HospCleanStaff;
import za.ac.cput.repository.HospCleanStaffRepository;
import java.util.Set;


public interface IHospCleanStaffRepository extends IRepository<HospCleanStaff, String> {
    public Set<HospCleanStaff> getAll();

}
