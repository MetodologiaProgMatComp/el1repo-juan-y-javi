package es.uah.matcomp.mp.e4.ejerciciosclases.Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Dog j=new Dog("Tu");
        assertDoesNotThrow(()->j.greets());
    }

    @Test
    void testGreets() {
        Dog j=new Dog("Tu");
        assertDoesNotThrow(()->j.greets(j));
    }
}