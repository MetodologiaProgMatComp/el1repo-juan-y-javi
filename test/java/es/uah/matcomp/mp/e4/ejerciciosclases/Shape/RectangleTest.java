package es.uah.matcomp.mp.e4.ejerciciosclases.Shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getWidth() {
        Rectangle j=new Rectangle(3,2);
        assertDoesNotThrow(()->j.getWidth());
        assertTrue(j.getWidth()>0,"El ancho debe ser mayor a 0");
        assertEquals(3,j.getWidth(),"El ancho no es el esperado");
    }

    @Test
    void setWidth() {
        Rectangle j=new Rectangle(3,2);
        assertDoesNotThrow(()->j.setWidth(4));
        assertEquals(4,j.getWidth(),"El ancho modificado no es el esperado");
    }

    @Test
    void getLength() {
        Rectangle j=new Rectangle(3,2);
        assertDoesNotThrow(()->j.getLength());
        assertTrue(j.getLength()>0,"El largo debe ser mayor a 0");
        assertEquals(2,j.getLength(),"El largo no es el esperado");
    }

    @Test
    void setLength() {
        Rectangle j=new Rectangle(3,2);
        assertDoesNotThrow(()->j.setLength(4));
        assertEquals(4,j.getLength(),"El largo no es el esperado");
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

    @Test
    void testToString() {
        Rectangle j=new Rectangle("rojo",true,3,2);
        assertDoesNotThrow(()->j.toString());
        assertEquals("Rectangle[Shape[color=rojo, " +
                "filled=true], width=3.0, length2.0]",j.toString(),"El largo no es el esperado");
    }
}