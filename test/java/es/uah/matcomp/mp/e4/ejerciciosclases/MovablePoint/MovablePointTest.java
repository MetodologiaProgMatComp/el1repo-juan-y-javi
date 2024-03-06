package es.uah.matcomp.mp.e4.ejerciciosclases.MovablePoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void testToString() {
        MovablePoint j=new MovablePoint(2,3,4,5);
        assertDoesNotThrow(()->j.toString());
        assertEquals("(2,3) speed(4,5)", j.toString(), "El texto generado no es el esperado");
    }

    @Test
    void moveUp() {
        MovablePoint j=new MovablePoint(2,3,4,5);
        assertDoesNotThrow(()->j.moveUp());
        assertEquals(3+5, j.y, "El punto no se movio correctamente");
    }

    @Test
    void moveDown() {
        MovablePoint j=new MovablePoint(2,3,4,5);
        assertDoesNotThrow(()->j.moveDown());
        assertEquals(3-5, j.y, "El punto no se movio correctamente");
    }

    @Test
    void moveRight() {
        MovablePoint j=new MovablePoint(2,3,4,5);
        assertDoesNotThrow(()->j.moveRight());
        assertEquals(2+4, j.x, "El punto no se movio correctamente");
    }

    @Test
    void moveLeft() {
        MovablePoint j=new MovablePoint(2,3,4,5);
        assertDoesNotThrow(()->j.moveLeft());
        assertEquals(2-4, j.x, "El punto no se movio correctamente");
    }
}