package es.uah.matcomp.mp.e3.ejerciciosclases.Point3D;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void getZ() {
        Point3D j = new Point3D();
        Point3D i = new Point3D(1,2,3);
        assertDoesNotThrow(()->i.getZ());
        assertEquals(3,i.getZ(),"La coordenada z no es la esperada");
    }

    @Test
    void setZ() {
        Point3D j = new Point3D(1,2,3);
        assertDoesNotThrow(()->j.setZ(0));
        assertEquals(0,j.getZ(),"La coordenada z no ha sido modificada correctamente");
    }

    @Test
    void setXYZ() {
        Point3D j = new Point3D(1,2,3);
        assertDoesNotThrow(()->j.setXYZ(-1,-2,-3));
        assertEquals(-1,j.getXYZ()[0],"Las coordenadas no han sido modificadas correctamente");
        assertEquals(-2,j.getXYZ()[1],"Las coordenadas no han sido modificadas correctamente");
        assertEquals(-3,j.getXYZ()[2],"Las coordenadas no han sido modificadas correctamente");
    }

    @Test
    void getXYZ() {
        Point3D i = new Point3D(1,2,3);
        assertDoesNotThrow(()->i.getXYZ());
        assertEquals(1,i.getXYZ()[0],"Las coordenadas no son las esperadas");
        assertEquals(2,i.getXYZ()[1],"Las coordenadas no son las esperadas");
        assertEquals(3,i.getXYZ()[2],"Las coordenadas no son las esperadas");
    }

    @Test
    void testToString() {
        Point3D j = new Point3D(1,2,3);
        assertEquals("Point3D[z=3.0]",j.toString(),"El string no es el esperado");
    }
}