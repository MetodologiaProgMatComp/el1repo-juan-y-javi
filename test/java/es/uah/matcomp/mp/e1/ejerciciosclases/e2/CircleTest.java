package es.uah.matcomp.mp.e1.ejerciciosclases.e2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle j = new Circle();
        assertDoesNotThrow(() -> j.getRadius());
        assertTrue(j.getRadius() > 0, "El radio es menor o igual a 0");
    }

    @Test
    void setRadius() {
        Circle j = new Circle(1.0);
        assertDoesNotThrow(() -> j.setRadius(1.1));
        assertEquals(j.getRadius(), 1.1, ("El radio no es el esperado"));
    }

    @Test
    void getArea() {
        Circle j = new Circle();
        assertDoesNotThrow(() -> j.getArea());
        assertTrue(j.getArea() > 0, "El area es menor o igual a 0");
    }

    @Test
    void getCircumference() {
        Circle j = new Circle();
        assertDoesNotThrow(() -> j.getCircumference());
        assertTrue(j.getCircumference() > 0, "La circunferencia es menor o igual a 0");
    }

    @Test
    void testToString() {
        Circle j = new Circle();
        assertEquals(j.toString(), "Circle[radius=" + 1.0 + "]");
    }
}