package es.uah.matcomp.mp.e3.ejerciciosclases.Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Dog j = new Dog("Cobi");
        assertDoesNotThrow(()->j.greets());
        Dog i = new Dog("Luna");
        assertDoesNotThrow(()->j.greets(i));
    }

    @Test
    void testToString() {
        Dog j = new Dog("Cobi");
        assertEquals("Dog[Mammal[Animal[name=Cobi]]]",j.toString());
    }
}