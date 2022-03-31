package za.ac.cput.entities;


/*
        HospCleanStaff.java
        Author : Sinazo Mehlomakhulu (216076498)
        Date 27 March 2022
 */
public class HospCleanStaff {
    private Integer empID;
    private String empFirstName;
    private String empLastName;

    private HospCleanStaff(HospCleanStaffBuilder builder) {
        this.empID = builder.empID;
        this.empFirstName = builder.empFirstName;
        this.empLastName = builder.empLastName;

    }

    //Getters
    public Integer getEmpID() {
        return empID;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    //setters
    public void setEmpID(Integer empID) {
        this.empID = empID;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    @Override
    public String toString() {
        return "HospCleanStaff{" +
                "empID=" + empID +
                ", empFirstName='" + empFirstName + '\'' +
                ", empLastName='" + empLastName + '\'' +
                '}';
    }

    public static class HospCleanStaffBuilder {
        private Integer empID;
        private String empFirstName;
        private String empLastName;

        public HospCleanStaffBuilder setEmpID(Integer empID) {
            this.empID = empID;
            return this;
        }

        public HospCleanStaffBuilder setEmpFirstName(String empFirstName) {
            this.empFirstName = empFirstName;
            return this;
        }

        public HospCleanStaffBuilder setEmpLastName(String empLastName) {
            this.empLastName = empLastName;
            return this;
        }


        public HospCleanStaffBuilder copy(HospCleanStaff hospCleanStaff) {
            this.empID = hospCleanStaff.empID;
            this.empFirstName = hospCleanStaff.empFirstName;
            this.empLastName = hospCleanStaff.empLastName;
            return this;
        }

        public HospCleanStaff build() {
            return new HospCleanStaff(this);
        }
    }
}


