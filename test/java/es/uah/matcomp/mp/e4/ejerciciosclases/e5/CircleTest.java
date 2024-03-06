package es.uah.matcomp.mp.e4.ejerciciosclases.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import es.uah.matcomp.mp.e4.ejerciciosclases.Resizable.*;

class CircleTest {

    @Test
    void testToString() {
        Circle j=new Circle(3);
        assertDoesNotThrow(()->j.toString());
        assertEquals("Circle[radius=3.0]",j.toString(),"El texto generado no es el esperado");
    }

    @Test
    void getArea() {
        Circle j=new Circle(4);
        assertDoesNotThrow(()->j.getArea());
        assertTrue(j.getArea()>0,"El area debe ser mayor a 0");
        assertEquals(4*4*Math.PI,j.getArea(),"El area no es el esperado");
    }

    @Test
    void getPerimeter() {
        Circle j=new Circle(4);
        assertDoesNotThrow(()->j.getPerimeter());
        assertTrue(j.getPerimeter()>0,"El area debe ser mayor a 0");
        assertEquals(2*4*Math.PI,j.getPerimeter(),"El texto generado no es el esperado");
    }
}