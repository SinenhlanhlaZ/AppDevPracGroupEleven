package za.ac.cput.repository;

import za.ac.cput.entities.Invoice;

import java.util.HashSet;
import java.util.Set;
/* InvoiceRepository.java
Repository for the Invoice
Author: Shina Kara 219333181
Date: 04 April 2022
*/
public class InvoiceRepository implements IInvoiceRepository{
        public static InvoiceRepository repository = null;
        private Set<Invoice> invoiceDB = null;

    private InvoiceRepository() {
            invoiceDB = new HashSet<Invoice>();
        }

        public static InvoiceRepository getRepository() {
            if (repository == null) {
                repository = new InvoiceRepository();
            }
            return repository;
        }

        @Override
        public Invoice create(Invoice invoice) {
            boolean success = invoiceDB.add(invoice);
            if (!success) return null;
            return invoice;
        }



    @Override
        public Invoice read(String invoiceNum) {
        Invoice invoice = invoiceDB.stream().filter(e -> e.getInvoiceType().equals(invoiceNum)).findAny().orElse(null);
            return invoice;
        }

        @Override
        public Invoice update(Invoice invoice) {
            Invoice oldInvoice = read(invoice.getInvoiceType());
            if (oldInvoice != null) {
                invoiceDB.remove(oldInvoice);
                invoiceDB.add(invoice);
                return invoice;
            }
            return null;
        }

        @Override
        public boolean delete(String invoiceNum) {
            Invoice invNumbDelete = read(invoiceNum);
            if (invNumbDelete == null) return false;
            invoiceDB.remove(invNumbDelete);
            return true;
        }

        @Override
        public Set<Invoice> getAll() {
            return invoiceDB;
        }
}
