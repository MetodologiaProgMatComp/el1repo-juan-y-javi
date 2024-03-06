package es.uah.matcomp.mp.e4.ejerciciosclases.Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {

    @Test
    void greets() {
        BigDog j=new BigDog("Tu");
        assertDoesNotThrow(()->j.greets());
    }

    @Test
    void testGreets() {
        Dog i=new Dog("el");
        BigDog j=new BigDog("Tu");
        assertDoesNotThrow(()->j.greets(i));
    }

    @Test
    void testGreets1() {
        Dog i=new Dog("el");
        BigDog j=new BigDog("Tu");
        assertDoesNotThrow(()->j.greets(j));
    }
}