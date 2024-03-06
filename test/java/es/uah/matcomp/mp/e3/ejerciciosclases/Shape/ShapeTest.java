package es.uah.matcomp.mp.e3.ejerciciosclases.Shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        Shape j = new Shape();
        Shape i = new Shape("Rojo", true);
        assertDoesNotThrow(() -> i.getColor());
        assertEquals("Rojo", i.getColor(), "El color no es el esperado");
    }

    @Test
    void setColor() {
        Shape i = new Shape("Rojo", true);
        assertDoesNotThrow(() -> i.setColor("Azul"));
        assertEquals("Azul", i.getColor(), "El color no ha sido modificado correctamente");
    }

    @Test
    void isFilled() {
        Shape i = new Shape("Rojo", true);
        assertDoesNotThrow(() -> i.isFilled());
        assertTrue(i.isFilled(), "La condicion de relleno no es la esperada");
    }

    @Test
    void setFilled() {
        Shape i = new Shape("Rojo", true);
        assertDoesNotThrow(() -> i.setFilled(false));
        assertFalse(i.isFilled(), "La condicion de relleno no ha sido modificada correctamente");
    }

    @Test
    void testToString() {
        Shape i = new Shape("Rojo", true);
        assertEquals("Shape[color=Rojo, filled=true]", i.toString(), "El string no es el esperado");
    }
}