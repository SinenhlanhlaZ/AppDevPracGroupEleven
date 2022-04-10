package za.ac.cput.factory;
/*
        Appointment factory test
        Author : Sinazo Mehlomakhulu (216076498)
        Date: 10 April 2022
        */
import org.junit.jupiter.api.Test;
import za.ac.cput.entities.Appointment;
import za.ac.cput.entities.Driver;

import static org.junit.jupiter.api.Assertions.*;

public class AppointmentFactoryTest {

    @Test
  public   void createAppointment() {

       Appointment appointment = AppointmentFactory.createAppointment("20Feb2022", "30Min", "13:00");
        System.out.println(appointment);
    }
}