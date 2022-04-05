package za.ac.cput.repository;

/*
    Entity: Doctor
    Author: Sinenhlanhla Zondi (220008922)
    Date: 25 March 2022
*/

import za.ac.cput.entities.Doctor;

import java.util.ArrayList;

public interface IDoctorRepository extends IRepository<Doctor, String>
{
    public ArrayList<Doctor> getDoctors();
}
