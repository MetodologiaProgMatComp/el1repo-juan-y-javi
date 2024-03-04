package es.uah.matcomp.ed.listas.listaEnlazada.clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaEnlazadaTest {

    @Test
    void isVacia() {
        ListaEnlazada j = new ListaEnlazada();
        assertDoesNotThrow(() -> j.isVacia());
        assertEquals(true, j.isVacia(), "No se ha comprobado correctamente si la lista esta vacia");
    }

    @Test
    void vaciar() {
        ListaEnlazada j = new ListaEnlazada();
        ElementoLE i = new ElementoLE();
        j.add(i);
        assertDoesNotThrow(() -> j.vaciar());
        assertEquals(true, j.isVacia(), "La lista no se ha vaciado correctamente");
    }

    @Test
    void add() {
        ListaEnlazada j = new ListaEnlazada();
        Object test = 0;
        assertDoesNotThrow(() -> j.add(test));
        j.add("test");
        assertEquals(2, j.getNumeroElementos(), "No se han annadido el numero de elementos correcto");
    }

    @Test
    void insert() {
        ListaEnlazada j = new ListaEnlazada();
        Object test = 0;
        j.add("A");
        j.add("B");
        j.add("C");
        j.add("D");
        j.add("E");
        assertDoesNotThrow(() -> j.insert(test, 1));
        j.insert("testeo", 3);
        assertEquals(test, j.getElemento(1).getData(), "No se ha insertado el elemento test correctamente");
        assertEquals("testeo", j.getElemento(3).getData(), "No se ha insertado el elemento testeo correctamente");
    }



    @Test
    void del() {
        ListaEnlazada j = new ListaEnlazada();
        j.add("0");
        j.add("1");
        j.add("2");
        j.add("3");
        j.add("4");
        assertDoesNotThrow(() -> j.del(4));
        assertDoesNotThrow(() -> j.del(0));
        assertDoesNotThrow(() -> j.del(2));
        assertEquals("2", j.getElemento(1).getData(), "El elemento no ha sido eliminado correctamente");
        assertEquals(1, j.del(1), "El numero de elementos restante no es correcto");
    }

    @Test
    void getNumeroElementos() {
        ListaEnlazada j = new ListaEnlazada();
        j.add("A");
        j.add("B");
        j.add("C");
        assertDoesNotThrow(() -> j.getNumeroElementos());
        assertEquals(3, j.getNumeroElementos(), "El numero de elementos no es el esperado");
    }

    @Test
    void getPosicion() {
        ListaEnlazada j = new ListaEnlazada();
        ElementoLE i = new ElementoLE();
        j.add("A");
        j.add("B");
        j.add(i);
        assertDoesNotThrow(() -> j.getPosicion(i));
        assertEquals(2, j.getPosicion(i), "La posicion no es la esperada");
    }

    @Test
    void getPrimero() {
        ListaEnlazada j = new ListaEnlazada();
        ElementoLE i = new ElementoLE();
        j.add(i);
        j.add("B");
        j.add("C");
        assertDoesNotThrow(() -> j.getPrimero());
        assertEquals(i, j.getPrimero(), "El primer elemento no es el esperado");
    }

    @Test
    void getUltimo() {
        ListaEnlazada j = new ListaEnlazada();
        ElementoLE i = new ElementoLE();
        j.add("A");
        j.add("B");
        j.add(i);
        assertDoesNotThrow(() -> j.getUltimo());
        assertEquals(i, j.getUltimo(), "El ultimo elemento no es el esperado");
    }

    @Test
    void getSiguiente() {
        ListaEnlazada j = new ListaEnlazada();
        ElementoLE a = new ElementoLE();
        Object i = new Object();
        Object l = new Object();
        j.add (a);
        j.add (i);
        j.add (l);
        assertDoesNotThrow(() -> j.getSiguiente(a));
        assertEquals(i, j.getSiguiente(a).getData(), "El ultimo elemento no es el esperado");
    }

    @Test
    void getElemento() {
        ListaEnlazada j = new ListaEnlazada();
        j.add("A");
        j.add("B");
        j.add("C");
        assertDoesNotThrow(() -> j.getElemento(1));
        assertEquals("B", j.getElemento(1).getData(), "El elemento no es el esperado");
    }
}