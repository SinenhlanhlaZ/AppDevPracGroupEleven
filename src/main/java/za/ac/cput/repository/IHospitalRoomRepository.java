package za.ac.cput.repository;

import za.ac.cput.entities.HospitalRoom;

import java.util.Set;

/*
    IHospitalRoomRepository.java
    Interface Repository Entity for the Hospital Rooms
    Author: Fayaad Abrahams (218221630)
    Date: 31 March 2022
*/
public interface IHospitalRoomRepository  extends IRepository<HospitalRoom, String>{
    public Set<HospitalRoom> getAll();
}
