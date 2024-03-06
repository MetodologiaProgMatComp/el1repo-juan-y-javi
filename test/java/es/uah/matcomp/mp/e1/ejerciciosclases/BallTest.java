package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void getX() {
        Ball j = new Ball(0,0,5,1,1);
        assertDoesNotThrow(() -> j.getX());
        assertEquals(j.getX(), 0, "La poscicion en el eje x no es la esperada");
    }

    @Test
    void setX() {
        Ball j = new Ball(0,0,5,1,1);
        assertDoesNotThrow(() -> j.setX(10));
        assertEquals(j.getX(), 10, "La posicion en el eje x tras la modificacion no es la esperada");
    }

    @Test
    void getY() {
        Ball j = new Ball(0,0,5,1,1);
        assertDoesNotThrow(() -> j.getY());
        assertEquals(j.getY(), 0, "La poscicion en el eje y no es la esperada");
    }

    @Test
    void setY() {
        Ball j = new Ball(0,0,5,1,1);
        assertDoesNotThrow(() -> j.setY(10));
        assertEquals(j.getY(), 10, "La posicion en el eje y tras la modificacion no es la esperada");
    }

    @Test
    void getRadius() {
        Ball j = new Ball(0,0,5,1,1);
        assertDoesNotThrow(() -> j.getRadius());
        assertEquals(j.getRadius(), 5, "El radio no es el esperado");
    }

    @Test
    void setRadius() {
        Ball j = new Ball(0,0,5,1,1);
        assertDoesNotThrow(() -> j.setRadius(8));
        assertEquals(j.getRadius(), 8, "El radio tras la modificacion no es el esperado");
    }

    @Test
    void getXDelta() {
        Ball j = new Ball(0,0,5,1,1);
        assertDoesNotThrow(() -> j.getXDelta());
        assertEquals(j.getXDelta(), 1, "El incremento por cada paso en el eje x no es el esperado");
    }

    @Test
    void setXDelta() {
        Ball j = new Ball(0,0,5,1,1);
        assertDoesNotThrow(() -> j.setXDelta(2));
        assertEquals(j.getXDelta(), 2, "El incremento por cada paso en el eje x tras la modificacion no es el esperado");
    }

    @Test
    void getYDelta() {
        Ball j = new Ball(0,0,5,1,1);
        assertDoesNotThrow(() -> j.getYDelta());
        assertEquals(j.getYDelta(), 1, "El incremento por cada paso en el eje y no es el esperado");

    }

    @Test
    void setYDelta() {
        Ball j = new Ball(0,0,5,1,1);
        assertDoesNotThrow(() -> j.setYDelta(2));
        assertEquals(j.getYDelta(), 2, "El incremento por cada paso en el eje y tras la modificacion no es el esperado");
    }

    @Test
    void move() {
        Ball j = new Ball(0,0,5,1,1);
        assertDoesNotThrow(() -> j.move());
        assertEquals(j.getX(), 1, "La posicion en el eje x tras un paso no es la esperada");
        assertEquals(j.getY(), 1, "La posicion en el eje y tras un paso no es la esperada");
    }

    @Test
    void reflectHorizontal() {
        Ball j = new Ball(0,0,5,1,1);
        assertDoesNotThrow(() -> j.reflectHorizontal());
        assertEquals(j.getXDelta(), -1, "El incremento por cada paso en el eje x tras haber sido invertido no es el esperado");
    }

    @Test
    void reflectVertical() {
        Ball j = new Ball(0,0,5,1,1);
        assertDoesNotThrow(() -> j.reflectVertical());
        assertEquals(j.getYDelta(), -1, "El incremento por cada paso en el eje y tras haber sido invertido no es el esperado");

    }

    @Test
    void testToString() {
        Ball j = new Ball(0,0,5,1,1);
        assertEquals(j.toString(), "Ball[("+0f+","+0f+"), speed=("+1f+","+1f+")]");
    }
}