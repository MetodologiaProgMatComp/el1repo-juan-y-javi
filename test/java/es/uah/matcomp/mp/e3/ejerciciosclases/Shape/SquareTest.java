package es.uah.matcomp.mp.e3.ejerciciosclases.Shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square i = new Square();
        Square k = new Square(4.5);
        Square j = new Square("Rojo", true, 4.5);
        assertDoesNotThrow(() -> j.getSide());
        assertTrue(j.getSide() > 0, "El lado es menor o igual a 0");
        assertEquals(4.5, j.getSide(), "El lado no es el esperado");
        j.setLenght(5);
        assertDoesNotThrow(() -> j.getSide());
    }

    @Test
    void setSide() {
        Square j = new Square("Rojo", true, 4.5);
        assertDoesNotThrow(() -> j.setSide(1.1));
        assertEquals(1.1, j.getSide(), ("El lado no es el esperado"));
    }

    @Test
    void setWidth() {
        Square j = new Square("Rojo", true, 4.5);
        assertDoesNotThrow(() -> j.setWidth(1.1));
        assertEquals(1.1, j.getWidth(), ("La anchura no es la esperada"));
    }

    @Test
    void setLenght() {
        Square j = new Square("Rojo", true, 4.5);
        assertDoesNotThrow(() -> j.setLenght(1.1));
        assertEquals(1.1, j.getLenght(), ("La anchura no es la esperada"));
    }

    @Test
    void testToString() {
        Square j = new Square("Rojo", true, 4.5);
        assertEquals("Square[Rectangle[Shape[color=Rojo,filled=true],width=4.5,length=4.5]]", j.toString(), "El string no es el esperado");
    }
}