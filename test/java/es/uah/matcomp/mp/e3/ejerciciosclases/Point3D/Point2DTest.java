package es.uah.matcomp.mp.e3.ejerciciosclases.Point3D;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {

    @Test
    void getX() {
        Point2D j = new Point2D();
        Point2D i = new Point2D(1,2);
        assertDoesNotThrow(()->i.getX());
        assertEquals(1,i.getX(),"La coordenada x no es la esperada");
    }

    @Test
    void setX() {
        Point2D j = new Point2D(1,2);
        assertDoesNotThrow(()->j.setX(0));
        assertEquals(0,j.getX(),"La coordenada x no ha sido modificada correctamente");
    }

    @Test
    void getY() {
        Point2D i = new Point2D(1,2);
        assertDoesNotThrow(()->i.getY());
        assertEquals(2,i.getY(),"La coordenada y no es la esperada");
    }

    @Test
    void setY() {
        Point2D j = new Point2D(1,2);
        assertDoesNotThrow(()->j.setY(0));
        assertEquals(0,j.getY(),"La coordenada y no ha sido modificada correctamente");
    }

    @Test
    void setXY() {
        Point2D j = new Point2D(1,2);
        assertDoesNotThrow(()->j.setXY(-1,-2));
        assertEquals(-1,j.getXY()[0],"Las coordenadas no han sido modificadas correctamente");
        assertEquals(-2,j.getXY()[1],"Las coordenadas no han sido modificadas correctamente");
    }

    @Test
    void getXY() {
        Point2D i = new Point2D(1,2);
        assertDoesNotThrow(()->i.getXY());
        assertEquals(1,i.getXY()[0],"Las coordenadas no son las esperadas");
        assertEquals(2,i.getXY()[1],"Las coordenadas no son las esperadas");
    }

    @Test
    void testToString() {
        Point2D j = new Point2D(1,2);
        assertEquals("Point2D[x=1.0, y=2.0]",j.toString(),"El string no es el esperado");
    }
}