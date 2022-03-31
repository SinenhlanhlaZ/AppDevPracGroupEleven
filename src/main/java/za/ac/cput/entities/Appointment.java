package za.ac.cput.entities;
/*
   Appointment.java
   Author : Sinazo Mehlomakhulu (216076498)
   Date 27 March 2022
 */

public class Appointment {

    private String appointDate;
    private String appointDur;
    private String appointTime;

    private Appointment( AppointmentBuilder builder) {
        this.appointDate = builder.appointDate;
        this.appointDur = builder.appointDur;
        this.appointTime = builder.appointTime;

    }
    //Getters
    public String getAppointDate() {
        return appointDate;
    }

    public String getAppointDur() {
        return appointDur;
    }

    public String getAppointTime() {
        return appointTime;
    }
    //setters

    public void setAppointDate(String date) {
        appointDate = date;
    }

    public void setAppointDur(String duration) {
        appointDur = duration;
    }

    public void setAppointTime(String time) {
        appointTime = time;
    }

    //toString
    @Override
    public String toString() {
        return "Appointment{" +
                "Date='" + appointDate + '\'' +
                ", Duration='" + appointDur + '\'' +
                ", Time='" + appointTime + '\'' +
                '}';
    }
    public static class AppointmentBuilder {
        private String appointDate;
        private String appointDur;
        private String appointTime;

        public AppointmentBuilder setAppointDate(String appointDate){
            this.appointDate = appointDate;
            return this;
        }
        public AppointmentBuilder setAppointDur(String appointDur) {
            this.appointDur = appointDur;
            return this;
        }
        public AppointmentBuilder setAppointTime(String appointTime) {
            this.appointTime = appointTime;
            return this;
        }
        public AppointmentBuilder copy(Appointment appointment){
            this.appointDate = appointment.appointDate;
            this.appointDur = appointment.appointDur;
            this.appointTime= appointment.appointTime;
            return this;
        }
        public Appointment build() {
            return new Appointment(this);

        }
    }
    }

