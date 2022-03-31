package za.ac.cput.factory;

/*
   AppointmentFactory.java
   Author : Sinazo Mehlomakhulu (216076498)
   Date 27 March 2022
 */

import za.ac.cput.entities.Appointment;

public class AppointmentFactory {


    public static Appointment createAppointment( String appointDate, String appointDur, String appointTime ) {
        if (appointDate == null) {
            return null;
        }
        return new Appointment.AppointmentBuilder().setAppointDate(appointDate)
                .setAppointDur(appointDur)
                .setAppointTime(appointTime)
                .build();

    }
}
