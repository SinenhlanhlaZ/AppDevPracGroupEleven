package za.ac.cput.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entities.Invoice;
import za.ac.cput.factory.InvoiceFactory;
import static org.junit.jupiter.api.Assertions.*;

/* InvoiceRepositoryTest.java
Test Repository for  Invoice
Author: Shina Kara 219333181
Date: 04 April 2022
*/

@TestMethodOrder(MethodOrderer.MethodName.class)
class InvoiceRepositoryTest {
    private static InvoiceRepository repository = InvoiceRepository.getRepository();
    private static Invoice invoice = InvoiceFactory.createInvoice( 15552 , 1542.00 , "Cash", "14-05-22");

    @Test
    void a_create() {
        Invoice createdInvoice = repository.create(invoice);
        assertEquals(invoice.getInvoiceType(), createdInvoice.getInvoiceType());
        System.out.println("Created Invoice: " + createdInvoice);
    }

    @Test
    void b_read() {
        Invoice read = repository.read(invoice.getInvoiceType());
        Assertions.assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Invoice updated = new Invoice.Builder().copy(invoice).setinvoiceDate("18-05-22")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(invoice.getInvoiceType());
        assertTrue(success);
        System.out.println("Deleted Invoice date:  " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show All items: ");
        System.out.println(repository.getAll());
    }
}