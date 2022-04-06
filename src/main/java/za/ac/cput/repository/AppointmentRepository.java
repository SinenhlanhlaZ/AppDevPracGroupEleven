package za.ac.cput.repository;
/*
    AppointmentRepository.java
    Repository for the Appointment
    Author: Sinazo Mehlomakhulu (216076498)
    Date: 04 April 2022
 */

import za.ac.cput.entities.Appointment;
import java.util.Set;
public  class AppointmentRepository implements IAppointmentRepository{



    @Override
    public void create(){

}

    @Override
    public void read() {

    }

    @Override
    public void update() {

    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public Set<Appointment> getAll() {
        return null;
    }
}
