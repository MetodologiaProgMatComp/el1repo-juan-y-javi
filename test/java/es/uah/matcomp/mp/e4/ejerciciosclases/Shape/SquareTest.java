package es.uah.matcomp.mp.e4.ejerciciosclases.Shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square j=new Square(2);
        assertDoesNotThrow(()->j.getSide());
        assertTrue(j.getSide()>0,"El lado debe ser mayor a 0");
        assertEquals(2,j.getSide(),"El lado no es el esperado");
    }

    @Test
    void setSide() {
        Square j=new Square(2);
        assertDoesNotThrow(()->j.setSide(4));
        assertEquals(4,j.getSide(),"El lado modificado no es el esperado");
    }

    @Test
    void setLength() {
        Square j=new Square(2);
        assertDoesNotThrow(()->j.setLength(4));
        assertEquals(4,j.getLength(),"El largo modificado no es el esperado");
    }

    @Test
    void setWidth() {
        Square j=new Square(2);
        assertDoesNotThrow(()->j.setWidth(4));
        assertEquals(4,j.getWidth(),"El ancho modificado no es el esperado");
    }

    @Test
    void testToString() {
        Square j=new Square("rojo",true,3);
        assertDoesNotThrow(()->j.toString());
        assertEquals("Square[Rectangle[Shape[color=rojo" +
                ", filled=true], width=3.0, length=3.0]]",j.toString(),"El texto generado " +
                "no es el esperado");
    }
}