package es.uah.matcomp.mp.e3.ejerciciosclases.Shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getWidth() {
        Rectangle i = new Rectangle();
        Rectangle k = new Rectangle(4.5, 5.5);
        Rectangle j = new Rectangle("Rojo", true, 4.5, 5.5);
        assertDoesNotThrow(() -> j.getWidth());
        assertTrue(j.getWidth() > 0, "La anchura es menor o igual a 0");
        assertEquals(4.5, j.getWidth(), "La anchura no es la esperada");
    }

    @Test
    void setWidth() {
        Rectangle j = new Rectangle("Rojo", true, 4.5, 5.5);
        assertDoesNotThrow(() -> j.setWidth(1.1));
        assertEquals(1.1, j.getWidth(), ("La anchura no es la esperada"));
    }

    @Test
    void getLenght() {
        Rectangle j = new Rectangle("Rojo", true, 4.5, 5.5);
        assertDoesNotThrow(() -> j.getLenght());
        assertTrue(j.getLenght() > 0, "La longitud es menor o igual a 0");
        assertEquals(5.5, j.getLenght(), "La longitud no es la esperada");
    }

    @Test
    void setLenght() {
        Rectangle j = new Rectangle("Rojo", true, 4.5, 5.5);
        assertDoesNotThrow(() -> j.setLenght(1.1));
        assertEquals(1.1, j.getLenght(), ("La longitud no es el esperado"));
    }

    @Test
    void getArea() {
        Rectangle j = new Rectangle("Rojo", true, 4.5, 5.5);
        assertDoesNotThrow(() -> j.getArea());
        assertTrue(j.getArea() > 0, "El area es menor o igual a 0");
        assertEquals(j.getWidth() * j.getLenght(), j.getArea(), "El area no es la esperada");
    }

    @Test
    void getPerimeter() {
        Rectangle j = new Rectangle("Rojo", true, 4.5, 5.5);
        assertDoesNotThrow(() -> j.getPerimeter());
        assertTrue(j.getPerimeter() > 0, "El perimetro es menor o igual a 0");
        assertEquals(2 * j.getLenght() + 2 * j.getWidth(), j.getPerimeter(), ("El perimetro no es el esperado"));
    }

    @Test
    void testToString() {
        Rectangle j = new Rectangle("Rojo", true, 4.5, 5.5);
        assertEquals("Rectangle[Shape[color=Rojo,filled=true],width=4.5,length=5.5]", j.toString(), "El string no es el esperado");
    }
}