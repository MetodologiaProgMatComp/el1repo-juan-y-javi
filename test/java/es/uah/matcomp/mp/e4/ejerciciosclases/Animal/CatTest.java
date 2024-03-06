package es.uah.matcomp.mp.e4.ejerciciosclases.Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {
        Cat j=new Cat("Tu");
        assertDoesNotThrow(()->j.greets());
    }
}