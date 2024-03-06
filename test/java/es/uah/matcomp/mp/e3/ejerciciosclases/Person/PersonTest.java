package es.uah.matcomp.mp.e3.ejerciciosclases.Person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person i = new Person("Pedro","suCalle");
        assertDoesNotThrow(()->i.getName());
        assertEquals("Pedro",i.getName(),"El nombre no es el esperado");
    }

    @Test
    void getAdress() {
        Person i = new Person("Pedro","suCalle");
        assertDoesNotThrow(()->i.getAdress());
        assertEquals("suCalle",i.getAdress(),"La direccion no es la esperada");
    }

    @Test
    void setAdress() {
        Person j = new Person("Pedro","suCalle");
        assertDoesNotThrow(()->j.setAdress("otraCalle"));
        assertEquals("otraCalle",j.getAdress(),"La direccion no ha sido modificada correctamente");
    }

    @Test
    void testToString() {
        Person j = new Person("Pedro","suCalle");
        assertEquals("Person[name=Pedro, address=suCalle]",j.toString(),"El string no es el esperado");
    }
}