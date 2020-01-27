package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InoviceDao inoviceDao;
    private static final String INVOICE_NUMBER = "2020-20-20-01";

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Item item = new Item(new BigDecimal(50), 2);
        Item item2 = new Item(new BigDecimal(150), 1);

        Product product = new Product("Milk");
        Product product2 = new Product("Beer");

        Invoice invoice = new Invoice(INVOICE_NUMBER);

        item.setProduct(product);
        item2.setProduct(product2);

        invoice.getItems().add(item);
        invoice.getItems().add(item2);

        //When
        inoviceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        inoviceDao.deleteById(id);

    }
}
