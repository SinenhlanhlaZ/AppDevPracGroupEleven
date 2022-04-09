package za.ac.cput.factory;

import za.ac.cput.entities.Invoice;
import org.junit.jupiter.api.Test;
/* InvoiceFacoryTest.java
Interface for the Invoice
Author: Shina Kara 219333181
Date: March 2022
*/

class InvoiceFactoryTest {
    @Test
    public void test(){
    Invoice invoice = InvoiceFactory.createInvoice(14523 , 5656.50 , "Cash" , "16-08-12");
        System.out.println(invoice.toString());
}}