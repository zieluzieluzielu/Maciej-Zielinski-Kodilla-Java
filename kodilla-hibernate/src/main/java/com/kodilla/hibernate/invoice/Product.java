package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;


@NamedNativeQuery(
                name = "Product.retrieveTheProductsFromInvoiceId",
                query = "SELECT p.PRODUCT_NAME FROM INVOICES inv" +
                        " JOIN INVOICES_ITEMS init ON inv.INVOICE_ID=init.INVOICE_INVOICE_ID"+
                        " JOIN ITEMS it ON init.ITEMS_ITEM_ID=it.ITEM_ID"+
                        " JOIN PRODUCTS p ON p.PRODUCT_ID=it.PRODUCT_ID"+
                        " WHERE inv.INVOICE_NUMBER = :INVOICE_NR "//,
                //resultClass = String.class
        )

@Entity
@Table(name = "PRODUCTS")
public class Product {
    private int in;
    private String name;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "PRODUCT_ID",unique = true)
    public int getIn() {
        return in;
    }

    @Column(name = "PRODUCT_NAME")
    public String getName() {
        return name;
    }

    private void setIn(int in) {
        this.in = in;
    }

    private void setName(String name) {
        this.name = name;
    }

}
