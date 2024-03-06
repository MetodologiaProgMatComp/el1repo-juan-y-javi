package es.uah.matcomp.mp.e3.ejerciciosclases.Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {

    @Test
    void testToString() {
        Mammal j = new Mammal("Cobi");
        assertEquals("Mammal[Animal[name=Cobi]]",j.toString());
    }
}