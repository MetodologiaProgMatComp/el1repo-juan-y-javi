package es.uah.matcomp.mp.e2.ejerciciosclases;

import es.uah.matcomp.mp.e2.ejerciciosclases.e4.Customer;
import es.uah.matcomp.mp.e2.ejerciciosclases.e4.Invoice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void getId() {
        Customer i = new Customer(23,"Yo",5);
        Invoice j=new Invoice(2,i,2);
        assertDoesNotThrow(()->j.getId());
        assertTrue(j.getId()>0, "El id debe ser mayor que 0");
        assertEquals(j.getId(),2, "El id no es el esperado");
    }

    @Test
    void getCustomer() {
        Customer i = new Customer(23,"Yo",5);
        Invoice j=new Invoice(2,i,2);
        assertDoesNotThrow(()->j.getCustomer());
        assertEquals(j.getCustomer(), i, "El cliente no es el esperado");
    }

    @Test
    void setCustomer() {
        Customer i = new Customer(23,"Yo",5);
        Customer otro=new Customer (34, "Tu", 7);
        Invoice j=new Invoice(2,i,2);
        assertDoesNotThrow(()->j.setCustomer(otro));
        assertEquals(j.getCustomer(), otro, "El cliente modificado no es el esperado" );
    }

    @Test
    void getAmount() {
        Customer i = new Customer(23,"Yo",5);
        Invoice j=new Invoice(2,i,2);
        assertDoesNotThrow(()->j.getAmount());
        assertTrue(j.getAmount()>0, "La cantidad debe ser mayor a 0");
        assertEquals(j.getAmount(), 2, "La cantidad no es la esperada");
    }

    @Test
    void setAmount() {
        Customer i = new Customer(23,"Yo",5);
        Invoice j=new Invoice(2,i,2);
        assertDoesNotThrow(()->j.setAmount(3));
        assertTrue(j.getAmount()>0, "La cantidad debe ser mayor que 0");
        assertEquals(j.getAmount(), 3, "La cantidad modificada no es la esperada");
    }

    @Test
    void getCustomerId() {
        Customer i = new Customer(23,"Yo",5);
        Invoice j=new Invoice(2,i,2);
        assertDoesNotThrow(()->j.getCustomerId());
        assertEquals(j.getCustomerId(), 23, "El id del cliente no es el esperado");
    }

    @Test
    void getCustomerName() {
        Customer i = new Customer(23,"Yo",5);
        Invoice j=new Invoice(2,i,2);
        assertDoesNotThrow(()->j.getCustomerName());
        assertEquals(j.getCustomerName(), "Yo", "El nombre no es el esperado");
    }

    @Test
    void getCustomerDiscount() {
        Customer i = new Customer(23,"Yo",5);
        Invoice j=new Invoice(2,i,2);
        assertDoesNotThrow(()->j.getCustomerDiscount());
        assertEquals(j.getCustomerDiscount(),5,"El descuento no es el esperado");
    }

    @Test
    void getAmountAfterDiscount() {
        Customer i = new Customer(23,"Yo",5);
        Invoice j=new Invoice(2,i,2);
        assertDoesNotThrow(()->j.getAmountAfterDiscount());
        assertEquals(j.getAmountAfterDiscount(), 2-2*5*0.01,"El precio tras el descuento no es el esperado");
    }

    @Test
    void testToString() {
        Customer i = new Customer(23,"Yo",5);
        Invoice j=new Invoice(2,i,2);
        assertDoesNotThrow(()->j.toString());
        assertEquals(j.toString(), "Invoice[id="+2+", customer"+"Yo" + "(" + 23 + ")(" + 5 + "%)"
                +", amount="+5+"]");
    }
}