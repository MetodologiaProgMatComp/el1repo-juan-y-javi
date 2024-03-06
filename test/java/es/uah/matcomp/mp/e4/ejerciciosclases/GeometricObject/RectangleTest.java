package es.uah.matcomp.mp.e4.ejerciciosclases.GeometricObject;

import es.uah.matcomp.mp.e4.ejerciciosclases.GeometricObject.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testToString() {
        Rectangle j=new Rectangle(3,2);
        assertDoesNotThrow(()->j.toString());
        assertEquals("Rectangle[width=3.0, length=2.0]",j.toString(),"El largo no es el esperado");
    }

    @Test
    void getArea() {
        Rectangle j=new Rectangle(3,2);
        assertDoesNotThrow(()->j.getArea());
        assertEquals(3*2,j.getArea(),"El area no es el esperado");
    }

    @Test
    void getPerimeter() {
        Rectangle j=new Rectangle(3,2);
        assertDoesNotThrow(()->j.getPerimeter());
        assertEquals(3*2+2*2,j.getPerimeter(),"El perimetro no es el esperado");
    }
}