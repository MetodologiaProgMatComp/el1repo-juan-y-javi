package es.uah.matcomp.mp.e3.ejerciciosclases.MovablePoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void getxSpeed() {
        MovablePoint j = new MovablePoint(3,4,1,2);
        MovablePoint i = new MovablePoint(1,2);
        assertDoesNotThrow(()->i.getxSpeed());
        assertEquals(1,i.getxSpeed(),"La velocidad en la x no es la esperada");
    }

    @Test
    void setxSpeed() {
        MovablePoint j = new MovablePoint(1,2);
        assertDoesNotThrow(()->j.setxSpeed(-1));
        assertEquals(-1,j.getxSpeed(),"La velocidad en el eje x no ha sido modificada correctamente");
    }

    @Test
    void getySpeed() {
        MovablePoint i = new MovablePoint(1,2);
        assertDoesNotThrow(()->i.getySpeed());
        assertEquals(2,i.getySpeed(),"La velocidad en la y no es la esperada");
    }

    @Test
    void setySpeed() {
        MovablePoint j = new MovablePoint(1,2);
        assertDoesNotThrow(()->j.setySpeed(-1));
        assertEquals(-1,j.getySpeed(),"La velocidad en el eje y no ha sido modificada correctamente");
    }

    @Test
    void setSpeed() {
        MovablePoint j = new MovablePoint(1,2);
        assertDoesNotThrow(()->j.setSpeed(-1,-2));
        assertEquals(-1,j.getSpeed()[0],"Las velocidad no ha sido modificada correctamente");
        assertEquals(-2,j.getSpeed()[1],"Las velocidad no ha sido modificada correctamente");
    }

    @Test
    void getSpeed() {
        MovablePoint i = new MovablePoint(1,2);
        assertDoesNotThrow(()->i.getSpeed());
        assertEquals(1,i.getSpeed()[0],"Las coordenadas no son las esperadas");
        assertEquals(2,i.getSpeed()[1],"Las coordenadas no son las esperadas");
    }

    @Test
    void testToString() {
        MovablePoint j = new MovablePoint(1,2);
        assertEquals("MovablePoint[xSpeed=1.0, ySpeed=2.0]",j.toString(),"El string no es el esperado");
    }

    @Test
    void move() {
        MovablePoint j = new MovablePoint(1,1,1,1);
        assertDoesNotThrow(()->j.move());
        assertEquals(2,j.getX(),"El punto no se ha movido correctamente");
        assertEquals(2,j.getY(),"El punto no se ha movido correctamente");
    }
}