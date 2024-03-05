package es.uah.matcomp.mp.e2.ejerciciosclases;

import es.uah.matcomp.mp.e2.ejerciciosclases.e5.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Customer2Test {

    @Test
    void getId() {
        Customer j= new Customer(23, "Yo", 'f');
        assertDoesNotThrow(()->j.getId());
        assertTrue(j.getId()>0, "El id debe ser mayor que 0");
        assertEquals(j.getId(),23, "El id no es el esperado");
    }

    @Test
    void getName() {
        Customer j= new Customer(23, "Yo", 'f');
        assertDoesNotThrow(()->j.getName());
        assertEquals(j.getName(), "Yo", "El nombre no es el esperado");
    }

    @Test
    void getGender() {
        Customer j= new Customer(23, "Yo", 'f');
        assertDoesNotThrow(()->j.getGender());
        assertTrue(j.getGender()== 'f'||j.getGender()=='m', "El género no es el esperado");
        assertEquals(j.getGender(), 'f', "El género no es el esperado");
    }

    @Test
    void testToString() {
        Customer j= new Customer(23, "Yo", 'f');
        assertDoesNotThrow(()->j.toString());
        assertEquals(j.toString(), "Yo" + "(" + 23 + ")(" + 'f' + "%)");
    }
}