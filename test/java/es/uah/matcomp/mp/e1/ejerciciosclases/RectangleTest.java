package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getLength() {
        Rectangle j = new Rectangle();
        assertDoesNotThrow(() -> j.getLength());
        assertTrue(j.getLength() > 0, "La longitud es menor o igual a 0");
    }

    @Test
    void setLength() {
        Rectangle j = new Rectangle(1.0f, 2.0f);
        assertDoesNotThrow(() -> j.setLength(1.1f));
        assertEquals(j.getLength(), 1.1f, ("La longitud no es la esperada"));
    }

    @Test
    void getWidth() {
        Rectangle j = new Rectangle();
        assertDoesNotThrow(() -> j.getWidth());
        assertTrue(j.getWidth() > 0, "La anchura es menor o igual a 0");
    }

    @Test
    void setWidth() {
        Rectangle j = new Rectangle(1.0f, 2.0f);
        assertDoesNotThrow(() -> j.setWidth(2.1f));
        assertEquals(j.getWidth(), 2.1f, ("La anchura no es la esperada"));
    }

    @Test
    void getArea() {
        Rectangle j = new Rectangle();
        assertDoesNotThrow(() -> j.getArea());
        assertTrue(j.getArea() > 0, "El area es menor o igual a 0");
        assertEquals(j.getWidth() * j.getLength(), j.getArea(), "El area no es la esperada");
    }

    @Test
    void getPerimeter() {
        Rectangle j = new Rectangle();
        assertDoesNotThrow(() -> j.getPerimeter());
        assertTrue(j.getPerimeter() > 0, "El perimetro es menor o igual a 0");
        assertEquals(j.getWidth() * 2 + j.getLength() * 2, j.getPerimeter(), "El perimetro no es el esperado");
    }

    @Test
    void testToString() {
        Rectangle j = new Rectangle();
        assertEquals(j.toString(), "Rectangle[length=" + 1.0 + ", width=" + 1.0 + "]");
    }
}