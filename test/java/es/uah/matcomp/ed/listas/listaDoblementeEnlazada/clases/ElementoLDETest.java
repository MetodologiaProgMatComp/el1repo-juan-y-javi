package es.uah.matcomp.ed.listas.listaDoblementeEnlazada.clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementoLDETest {


    @Test
    void insertarmeEn() {
        ElementoLDE j = new ElementoLDE();
        ElementoLDE i = new ElementoLDE();
        ElementoLDE k = new ElementoLDE();
        assertDoesNotThrow(() -> i.insertarmeEn(j));
        k.insertarmeEn(j);
        assertEquals(k,j.getSiguiente(),"El elemento siguiente a j no es el esperado");
        assertEquals(i,k.getSiguiente(),"El elemento siguiente a k no es el esperado");
        assertEquals(j,k.getAnterior(),"El elemento anterior a k no es el esperado");
        assertEquals(k,i.getAnterior(),"El elemento anterior a i no es el esperado");
    }

    @Test
    void getSiguiente() {
        ElementoLDE j = new ElementoLDE();
        assertDoesNotThrow(() -> j.getSiguiente());
        assertNull(j.getSiguiente(),"El elemento siguiente no es el esperado");
    }

    @Test
    void getAnterior() {
        ElementoLDE j = new ElementoLDE();
        assertDoesNotThrow(() -> j.getAnterior());
        assertNull(j.getAnterior(),"El elemento anterior no es el esperado");
        ElementoLDE i = new ElementoLDE();
        j.setAnterior(i);
        assertEquals(i,j.getAnterior(),"El elemento anterior no ha sido obtenido correctamente");
    }

    @Test
    void setSiguiente() {
        ElementoLDE j = new ElementoLDE();
        ElementoLDE i = new ElementoLDE();
        assertDoesNotThrow(() -> j.setSiguiente(i));
        assertEquals(i,j.getSiguiente(),"El elemento siguiente no ha sido establecido correctamente");
    }

    @Test
    void setAnterior() {
        ElementoLDE j = new ElementoLDE();
        ElementoLDE i = new ElementoLDE();
        assertDoesNotThrow(() -> j.setAnterior(i));
        assertEquals(i,j.getAnterior(),"El elemento anterior no ha sido establecido correctamente");
    }

    @Test
    void getData() {
        ElementoLDE j = new ElementoLDE();
        assertDoesNotThrow(() -> j.getData());
    }

    @Test
    void setData() {
        ElementoLDE j = new ElementoLDE();
        assertDoesNotThrow(() -> j.setData("String de prueba"));
        assertEquals("String de prueba", j.getData(), "El valor del elemento no se ha establecido correctamente");
    }
}