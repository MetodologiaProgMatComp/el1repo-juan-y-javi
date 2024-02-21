package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CircleTest {

    @Test
    void getRadius() {
        Circle j = new Circle();
        assertTrue(j.getRadius()>0,"El radio es menor o igual a 0");
        assertDoesNotThrow(()->j.getRadius());
    }

    @Test
    void setRadius() {
        Circle j = new Circle();
        assertDoesNotThrow(()->j.setRadius(1));
        assertEquals(j.getRadius(),1,("El radio no es el esperado"));
    }

    @Test
    void getArea() {
    }

    @Test
    void getCircumference() {
    }

    @Test
    void testToString() {
    }
}