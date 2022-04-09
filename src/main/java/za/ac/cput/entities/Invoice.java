package za.ac.cput.entities;
        //Invoice.java
         //Entity for the Invoice
         //Author: Shina Kara 219333181
        // Date: 27 March 2022
public class Invoice {
    private Integer invoiceNum;
    private Double invoiceAmount;
    private String invoiceType;
    private String invoiceDate;

    private Invoice (Builder builder) {
        this.invoiceNum = builder.invoiceNum;
        this.invoiceAmount = builder.invoiceAmount;
        this.invoiceType = builder.invoiceType;
        this.invoiceDate = builder.invoiceDate;
    }
    //getters and setters


    public Integer getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(Integer invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public Double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(Double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    //toString

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNum=" + invoiceNum +
                ", invoiceAmount=" + invoiceAmount +
                ", invoiceType='" + invoiceType + '\'' +
                ", invoiceDate='" + invoiceDate + '\'' +
                '}';
    }

    public static class Builder{
        private Integer invoiceNum;
        private Double invoiceAmount;
        private String invoiceType;
        private String invoiceDate;

        public Invoice.Builder setinvoiceNum(Integer invoiceNum){
            this.invoiceNum = invoiceNum;
            return this ;}

        public Invoice.Builder setinvoiceAmount(Double invoiceAmount){
            this.invoiceAmount = invoiceAmount;
            return this ;}

        public Invoice.Builder setinvoiceType(String invoiceType){
            this.invoiceType = invoiceType;
            return this ;}

        public Invoice.Builder setinvoiceDate(String invoiceDate){
            this.invoiceDate = invoiceDate;
            return this ;}

        public Builder copy(Invoice invoice) {
            this.invoiceNum = invoice.invoiceNum;
            this.invoiceAmount =invoice.invoiceAmount;
            this.invoiceType=invoice.invoiceType;
            this.invoiceDate=invoice.invoiceDate;
            return this;
        }
        public Invoice build(){
            return new Invoice(this);
        }
    }


}
