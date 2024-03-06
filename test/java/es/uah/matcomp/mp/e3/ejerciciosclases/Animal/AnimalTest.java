package es.uah.matcomp.mp.e3.ejerciciosclases.Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void getName() {
        Animal j = new Animal();
        assertDoesNotThrow(()->j.getName());
        Animal i = new Animal("Lola");
        assertEquals("Lola",i.getName());
    }

    @Test
        void testToString() {
        Animal j = new Animal("Lola");
        assertEquals("Animal[name=Lola]",j.toString());
    }
}