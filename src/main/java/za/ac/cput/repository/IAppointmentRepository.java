package za.ac.cput.repository;
/*
    IAppointmentRepository.java
    interface Repository for the Appointment
    Author: Sinazo Mehlomakhulu (216076498)
    Date: 04 April 2022
 */
import za.ac.cput.entities.Appointment;
import za.ac.cput.repository.AppointmentRepository;
import java.util.Set;

public interface IAppointmentRepository extends IRepository<Appointment, String> {

public Set<Appointment> getAll();
}
