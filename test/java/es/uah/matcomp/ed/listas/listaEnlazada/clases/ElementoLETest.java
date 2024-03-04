package es.uah.matcomp.ed.listas.listaEnlazada.clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementoLETest {

    @Test
    void insertarmeEn() {
        ElementoLE j = new ElementoLE();
        ElementoLE i = new ElementoLE();
        ElementoLE k = new ElementoLE();
        assertDoesNotThrow(() -> i.insertarmeEn(j));
        k.insertarmeEn(j);
        assertEquals(k,j.getSiguiente(),"El elemento siguiente a j no es el esperado");
        assertEquals(j,i.getSiguiente(),"El elemento siguiente a i no es el esperado");
        assertEquals(i,k.getSiguiente(),"El elemento siguiente a k no es el esperado");
    }

    @Test
    void getSiguiente() {
        ElementoLE j = new ElementoLE();
        assertDoesNotThrow(() -> j.getSiguiente());
        assertNull(j.getSiguiente(),"El elemento siguiente no es el esperado");
    }

    @Test
    void getData() {
        ElementoLE j = new ElementoLE();
        assertDoesNotThrow(() -> j.getData());
    }

    @Test
    void setData() {
        ElementoLE j = new ElementoLE();
        assertDoesNotThrow(() -> j.setData("String de prueba"));
        assertEquals("String de prueba", j.getData(), "El valor del elemento no se ha establecido correctamente");
    }
}