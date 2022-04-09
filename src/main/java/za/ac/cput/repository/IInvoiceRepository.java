package za.ac.cput.repository;

import za.ac.cput.entities.Invoice;


import java.util.Set;
/* IInvoiceRepository.java
Interface for the Invoice
Author: Shina Kara 219333181
Date: 04 April 2022
*/

public interface IInvoiceRepository extends IRepository<Invoice,String> {
    public Set<Invoice> getAll();

}
