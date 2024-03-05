package es.uah.matcomp.mp.e2.ejerciciosclases;

import es.uah.matcomp.mp.e2.ejerciciosclases.e4.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer j=new Customer(23,"Yo",5);
        assertDoesNotThrow(()->j.getId());
        assertTrue(j.getId()>0, "El id debe ser mayor que 0");
    }

    @Test
    void getName() {
        Customer j=new Customer(23,"Yo",5);
        assertDoesNotThrow(()->j.getName());
        assertEquals(j.getName(),"Yo", "El nombre no es el esperado");
    }

    @Test
    void getDiscount() {
        Customer j=new Customer(23,"Yo",5);
        assertDoesNotThrow(()->j.getDiscount());
        assertTrue(j.getDiscount()>0, "El descuento debe ser mayor que 0%");
        assertTrue(j.getDiscount()<100, "El descuento debe ser menor que el 100%");
    }

    @Test
    void setDiscount() {
        Customer j=new Customer(23,"Yo",5);
        assertDoesNotThrow(()->j.setDiscount(10));
        assertEquals(j.getDiscount(),10,"El descuento modificado no es el esperado");
    }

    @Test
    void testToString() {
        Customer j=new Customer(23,"Yo",5);
        assertDoesNotThrow(()->j.toString());
        assertEquals(j.toString(), "Yo" + "(" + 23 + ")(" + 5 + "%)");
    }
}