package es.uah.matcomp.mp.e3.ejerciciosclases.Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {
        Cat j = new Cat("Cobi");
        assertDoesNotThrow(()->j.greets());

    }

    @Test
    void testToString() {
        Cat j = new Cat("Cobi");
        assertEquals("Cat[Mammal[Animal[name=Cobi]]]",j.toString());
    }
}