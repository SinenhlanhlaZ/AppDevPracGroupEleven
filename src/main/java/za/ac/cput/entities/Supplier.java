package za.ac.cput.entities;

/*
        Supplier.java
        Supplier entity
        Author: Nonzwakazi Mgxaji (213181584)
        Date: 28 March 2022
 */

public class Supplier {
    private String suppID;
    private String suppAddress;
    private int suppRegNum;

    //private constructor
    private Supplier(Supplier.Builder builder) {
        this.suppID = builder.suppID;
        this.suppAddress = builder.suppAddress;
        this.suppRegNum = builder.suppRegNum;
    }

    //getters
    public String getSuppID() {
        return suppID;
    }

    public String getSuppAddress() {
        return suppAddress;
    }

    public int getSuppRegNum() {
        return suppRegNum;
    }

    //setters
    public void setSuppID(String suppID) {
        this.suppID = suppID;
    }

    public void setSuppAddress(String suppAddress) {
        this.suppAddress = suppAddress;
    }

    public void setSuppRegNum(int suppRegNum) {
        this.suppRegNum = suppRegNum;
    }

    //toString


    @Override
    public String toString() {
        return "Supplier{" +
                "suppID='" + suppID + '\'' +
                ", suppAddress='" + suppAddress + '\'' +
                ", suppRegNum=" + suppRegNum +
                '}';
    }

    public static class Builder {
        private String suppID;
        private String suppAddress;
        private int suppRegNum;

        public Builder setSuppID(String suppID) {
            this.suppID = suppID;
            return this;
        }

        public Builder setSuppAddress(String suppAddress) {
            this.suppAddress = suppAddress;
            return this;
        }

        public Builder setSuppRegNum(int suppRegNum) {
            this.suppRegNum = suppRegNum;
            return this;
        }

        public Supplier.Builder copy(Supplier supplier) {
            this.suppID = supplier.suppID;
            this.suppAddress = supplier.suppAddress;
            this.suppRegNum = supplier.suppRegNum;
            return this;
        }

        public Supplier build() {
            return new Supplier(this);
        }
    }
}


