package es.uah.matcomp.mp.e4.ejerciciosclases.MovablePoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {

    @Test
    void testToString() {
        MovableCircle j=new MovableCircle(2,3,4,5,6);
        assertDoesNotThrow(()->j.toString());
        assertEquals("(2,3) speed(4,5), radius=6", j.toString(), "El texto generado no es el esperado");
    }

    @Test
    void moveDown() {
        MovableCircle j=new MovableCircle(2,3,4,5, 6);
        assertDoesNotThrow(()->j.moveDown());
        assertEquals(3-5, j.y, "El punto no se movio correctamente");
    }

    @Test
    void moveLeft() {
        MovableCircle j=new MovableCircle(2,3,4,5,6);
        assertDoesNotThrow(()->j.moveLeft());
        assertEquals(2-4, j.x, "El punto no se movio correctamente");
    }

    @Test
    void moveRight() {
        MovableCircle j=new MovableCircle(2,3,4,5,6);
        assertDoesNotThrow(()->j.moveRight());
        assertEquals(2+4, j.x, "El punto no se movio correctamente");
    }

    @Test
    void moveUp() {
        MovableCircle j=new MovableCircle(2,3,4,5,6);
        assertDoesNotThrow(()->j.moveUp());
        assertEquals(3+5, j.y, "El punto no se movio correctamente");
    }
}