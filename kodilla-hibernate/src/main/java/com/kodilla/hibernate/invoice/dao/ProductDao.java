package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface ProductDao extends CrudRepository<Product,Integer> {

    @Query
    List<String> retrieveTheProductsFromInvoiceId(@Param("INVOICE_NR") String invoiceNr);
}
