package es.uah.matcomp.mp.e3.ejerciciosclases.Shape;

import java.lang.Math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle i = new Circle();
        Circle k = new Circle(4.5);
        Circle j = new Circle("Rojo", true, 4.5);
        assertDoesNotThrow(() -> j.getRadius());
        assertTrue(j.getRadius() > 0, "El radio es menor o igual a 0");
        assertEquals(4.5, j.getRadius(), "El area no es la esperada");
    }

    @Test
    void setRadius() {
        Circle j = new Circle("Rojo", true, 4.5);
        assertDoesNotThrow(() -> j.setRadius(1.1));
        assertEquals(1.1, j.getRadius(), ("El radio no es el esperado"));
    }

    @Test
    void getArea() {
        Circle j = new Circle("Rojo", true, 4.5);
        assertDoesNotThrow(() -> j.getArea());
        assertTrue(j.getArea() > 0, "El area es menor o igual a 0");
        assertEquals(Math.PI * j.getRadius() * j.getRadius(), j.getArea(), ("El area no es la esperada"));
    }

    @Test
    void getPerimeter() {
        Circle j = new Circle("Rojo", true, 4.5);
        assertDoesNotThrow(() -> j.getPerimeter());
        assertTrue(j.getPerimeter() > 0, "El perimetro es menor o igual a 0");
        assertEquals(2 * Math.PI * j.getRadius(), j.getPerimeter(), ("El perimetro no es el esperado"));
    }

    @Test
    void testToString() {
        Circle j = new Circle("Rojo", true, 4.5);
        assertEquals("Circle[Shape[color=Rojo,filled=true],radius=4.5]", j.toString(), "El string no es el esperado");
    }
}