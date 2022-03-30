package za.ac.cput.entities;

/*
        Driver.java
        Driver entity
        Author: Nonzwakazi Mgxaji (213181584)
        Date: 28 March 2022
 */

public class Driver {
    private String driverID;
    private String driverFirstName;
    private String driverLastName;
    private int driverLicenseNum;

    //private constructor
    private Driver(Builder builder) {
        this.driverID = builder.driverID;
        this.driverFirstName = builder.driverFirstName;
        this.driverLastName = builder.driverLastName;
        this.driverLicenseNum = builder.driverLicenseNum;
    }

    //getters
    public String getDriverID() {
        return driverID;
    }

    public String getDriverFirstName() {
        return driverFirstName;
    }

    public String getDriverLastName() {
        return driverLastName;
    }

    public int getDriverLicenseNum() {
        return driverLicenseNum;
    }

    //setters
    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public void setDriverFirstName(String driverFirstName) {
        this.driverFirstName = driverFirstName;
    }

    public void setDriverLastName(String driverLastName) {
        this.driverLastName = driverLastName;
    }

    public void setDriverLicenseNum(int driverLicenseNum) {
        this.driverLicenseNum = driverLicenseNum;
    }

    //toString
    @Override
    public String toString() {
        return "Driver{" +
                "driverID='" + driverID + '\'' +
                ", driverFirstName='" + driverFirstName + '\'' +
                ", driverLastName='" + driverLastName + '\'' +
                ", driverLicenseNum=" + driverLicenseNum +
                '}';
    }

    public static class Builder {
        private String driverID;
        private String driverFirstName;
        private String driverLastName;
        private int driverLicenseNum;

        public Builder setDriverID(String driverID) {
            this.driverID = driverID;
            return this;
        }

        public Builder setDriverFirstName(String driverFirstName) {
            this.driverFirstName = driverFirstName;
            return this;
        }

        public Builder setDriverLastName(String driverLastName) {
            this.driverLastName = driverLastName;
            return this;
        }

        public Builder setDriverLicenseNum(int driverLicenseNum) {
            this.driverLicenseNum = driverLicenseNum;
            return this;
        }

        public Builder copy(Driver driver) {
            this.driverID = driver.driverID;
            this.driverFirstName = driver.driverFirstName;
            this.driverLastName = driver.driverLastName;
            this.driverLicenseNum = driver.driverLicenseNum;
            return this;
        }

        public Driver build() {
            return new Driver(this);
        }
    }
}
