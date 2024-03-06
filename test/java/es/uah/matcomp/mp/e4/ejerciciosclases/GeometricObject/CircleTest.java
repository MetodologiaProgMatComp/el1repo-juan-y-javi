package es.uah.matcomp.mp.e4.ejerciciosclases.GeometricObject;

import es.uah.matcomp.mp.e4.ejerciciosclases.GeometricObject.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testToString() {
        Circle j=new Circle(3);
        assertDoesNotThrow(()->j.toString());
        assertEquals("Circle[radius=3.0]",j.toString(),"El perimetro no es el esperado");
    }

    @Test
    void getArea() {
        Circle j=new Circle(3);
        assertDoesNotThrow(()->j.getArea());
        assertEquals(3*3*Math.PI,j.getArea(),"El area no es el esperado");
    }

    @Test
    void getPerimeter() {
        Circle j=new Circle(3);
        assertDoesNotThrow(()->j.getPerimeter());
        assertEquals(3*2*Math.PI,j.getPerimeter(),"El perimetro no es el esperado");
    }
}