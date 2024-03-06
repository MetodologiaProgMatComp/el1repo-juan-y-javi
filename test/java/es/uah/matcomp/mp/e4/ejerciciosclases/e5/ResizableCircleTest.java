package es.uah.matcomp.mp.e4.ejerciciosclases.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import es.uah.matcomp.mp.e4.ejerciciosclases.Resizable.*;
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
        assertEquals(3+3*0.5,"El circulo no ha cambiado su tamaño correctamente");
    }
}