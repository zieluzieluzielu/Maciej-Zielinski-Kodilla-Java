package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

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
