package es.uah.matcomp.mp.e3.ejerciciosclases.Cylinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle i = new Circle();
        Circle j = new Circle(4.5);
        assertDoesNotThrow(()->j.getRadius());
        assertEquals(4.5,j.getRadius(),"El radio no es el esperado");
    }

    @Test
    void setRadius() {
        Circle j = new Circle(4.5);
        assertDoesNotThrow(()->j.setRadius(5.6));
        assertEquals(5.6,j.getRadius(),"El radio no ha sido cambiado correctamente");
    }

    @Test
    void getColor() {
        Circle j = new Circle(4.5,"Rojo");
        assertDoesNotThrow(()->j.getColor());
        assertEquals("Rojo",j.getColor(),"El color no es el esperado");
    }

    @Test
    void setColor() {
        Circle j = new Circle(4.5,"Rojo");
        assertDoesNotThrow(()->j.setColor("Azul"));
        assertEquals("Azul",j.getColor(),"El radio no ha sido cmaibado correctamente");
    }

    @Test
    void getArea() {
        Circle j = new Circle(4.5);
        assertDoesNotThrow(()->j.getArea());
        assertEquals(4.5,j.getRadius(),"El radio no es el esperado");
    }

    @Test
    void testToString() {
        Circle j = new Circle(4.5,"Rojo");
        assertEquals("Circle[radius=4.5, color=Rojo]",j.toString(),"El texto no es el esperado");
    }
}