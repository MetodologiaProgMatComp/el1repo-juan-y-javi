package es.uah.matcomp.mp.e2.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @Test
    void getX() {
        MyPoint j = new MyPoint(3, 4);
        assertDoesNotThrow(() -> j.getX());
        assertTrue(j.getX() > 0, "La distancia en x debe ser mayor a 0");
        assertEquals(3, j.getX(), "La distancia en x no es la esperada");
    }

    @Test
    void setX() {
        MyPoint j = new MyPoint(3, 4);
        assertDoesNotThrow(() -> j.setX(4));
        assertEquals(j.getX(), 4, "La distancia en x no es la esperada");
    }

    @Test
    void getY() {
        MyPoint j = new MyPoint(3, 4);
        assertDoesNotThrow(() -> j.getY());
        assertTrue(j.getY() > 0, "La distancia en y debe ser mayor a 0");
        assertEquals(4, j.getY(), "La distancia en y no es la esperada");
    }

    @Test
    void setY() {
        MyPoint j = new MyPoint(3, 4);
        assertDoesNotThrow(() -> j.setY(5));
        assertEquals(5, j.getY(), "La distancia en y no es la esperada");
    }

    @Test
    void getXY() {
        MyPoint j = new MyPoint(3, 4);
        assertDoesNotThrow(() -> j.getXY());
        assertTrue(j.getXY()[0] > 0 && j.getXY()[1] > 0, "Las cooredenadas deben ser mayores a 0");
        assertTrue(j.getXY()[0] == 3 && j.getXY()[1] == 4, "Las coordenadas no son las esperadas");
    }

    @Test
    void setXY() {
        MyPoint j = new MyPoint(3, 4);
        assertDoesNotThrow(() -> j.setXY(5, 6));
        assertTrue(j.getXY()[0] == 5 && j.getXY()[1] == 6, "Las coordenadas no son las esperadas");
    }

    @Test
    void testToString() {
        MyPoint j = new MyPoint(3, 4);
        assertDoesNotThrow(() -> j.toString());
        assertEquals("(" + 3 + "," + 4 + ")", j.toString(), "El texto no es el essperado");
    }
}