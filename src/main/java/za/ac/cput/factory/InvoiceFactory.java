package za.ac.cput.factory;
/*
    InvoiceFactory.java
    Entity for the Invoice Factory
    Author: Shina Kara 219333181
    Date: 28 March 2022
*/
import za.ac.cput.entities.Invoice;

public class InvoiceFactory {
    public static Invoice createInvoice(Integer invoiceNum, Double invoiceAmount,String invoiceType, String invoiceDate){
        if (invoiceNum == null){
            return null;
        }

        if (invoiceAmount == null){
            return null;
        }

        if (invoiceType == null){
            return null;
        }

        if (invoiceDate == null){
            return null;
        }
        return new Invoice.Builder().setinvoiceNum(invoiceNum)
                .setinvoiceAmount(invoiceAmount)
                .setinvoiceType(invoiceType)
                .setinvoiceDate(invoiceDate)
                .build();
    }
}
