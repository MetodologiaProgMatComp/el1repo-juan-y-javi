package es.uah.matcomp.mp.e4.ejerciciosclases.Shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.lang.Math;
class CircleTest {

    @Test
    void getRadius() {
        Circle j=new Circle(2);
        assertDoesNotThrow(()->j.getRadius());
        assertTrue(j.getRadius()>0,"El radio debe ser mayor a 0");
        assertEquals(2,j.getRadius(),"El radio no es el esperado");
    }

    @Test
    void setRadius() {
        Circle j=new Circle(2);
        assertDoesNotThrow(()->j.setRadius(5));
        assertEquals(5,j.getRadius(),"El radio modificado no es el esperado");
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

    @Test
    void testToString() {
        Circle j=new Circle("rojo",true,3);
        assertDoesNotThrow(()->j.toString());
        assertEquals("Circle[Shape[color=rojo, filled=true], radius=3.0]",
                j.toString(),"El texto generado no es el esperado");
    }
}