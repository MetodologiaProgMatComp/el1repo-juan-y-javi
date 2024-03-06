package es.uah.matcomp.mp.e4.ejerciciosclases.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {

    @Test
    void testToString() {
        ResizableCircle j=new ResizableCircle(3);
        assertDoesNotThrow(()->j.toString());
        assertEquals("ResizableCircle[Circle[radius=3.0]]",j.toString(),"El texto generado no es el esperado");
    }

    @Test
    void resize() {
        ResizableCircle j=new ResizableCircle(3);
        assertDoesNotThrow(()->j.resize(50));
        assertEquals(3+3*0.5,j.radius,"El circulo no ha cambiado su tamaño correctamente");
    }
}