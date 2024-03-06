package es.uah.matcomp.mp.e3.ejerciciosclases.Cylinder;
import java.lang.Math;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getHeight() {
        Cylinder i = new Cylinder();
        Cylinder k = new Cylinder(4.5);
        Cylinder j = new Cylinder(4.5,10);
        assertDoesNotThrow(()->j.getHeight());
        assertEquals(10,j.getHeight(),"La altura no es la esperada");
    }

    @Test
    void setHeight() {
        Cylinder j = new Cylinder(4.5,10,"Rojo");
        assertDoesNotThrow(()->j.setHeight(5.6));
        assertEquals(5.6,j.getHeight(),"La altura no ha sido cambiada correctamente");
    }

    @Test
    void getVolume() {
        Cylinder j = new Cylinder(4.5,10);
        assertDoesNotThrow(()->j.getVolume());
        assertEquals(Math.PI*j.getRadius()*j.getRadius()*j.getHeight(),j.getVolume(),"La altura no es la esperada");
    }
}