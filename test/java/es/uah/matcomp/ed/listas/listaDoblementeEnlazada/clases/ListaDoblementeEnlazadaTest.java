package es.uah.matcomp.ed.listas.listaDoblementeEnlazada.clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaDoblementeEnlazadaTest {

    @Test
    void isVacia() {
        ListaDoblementeEnlazada j = new ListaDoblementeEnlazada();
        assertDoesNotThrow(() -> j.isVacia());
        assertEquals(true, j.isVacia(), "No se ha comprobado correctamente si la lista esta vacia");
    }

    @Test
    void vaciar() {
        ListaDoblementeEnlazada j = new ListaDoblementeEnlazada();
        ElementoLDE i = new ElementoLDE();
        j.add(i);
        assertDoesNotThrow(() -> j.vaciar());
        assertEquals(true, j.isVacia(), "La lista no se ha vaciado correctamente");
    }

    @Test
    void add() {
        ListaDoblementeEnlazada j = new ListaDoblementeEnlazada();
        Object test = 0;
        assertDoesNotThrow(() -> j.add(test));
        assertDoesNotThrow(() -> j.add("Prueba"));
        j.add("test");
        assertEquals(3, j.getNumeroElementos(), "No se han annadido el numero de elementos correcto");
    }

    @Test
    void insert() {
        ListaDoblementeEnlazada j = new ListaDoblementeEnlazada();
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
        ListaDoblementeEnlazada j = new ListaDoblementeEnlazada();
        j.add("0");
        j.add("1");
        j.add("2");
        j.add("3");
        j.add("4");
        assertDoesNotThrow(() -> j.del(4));
        assertDoesNotThrow(() -> j.del(0));
        assertDoesNotThrow(() -> j.del(1));
        assertEquals("3", j.getElemento(1).getData(), "El elemento no ha sido eliminado correctamente");
        assertEquals("1", j.getElemento(1).getAnterior().getData(), "El elemento no ha sido eliminado correctamente");
        assertEquals(1, j.del(1), "El numero de elementos restante no es correcto");
        assertEquals("1",j.getUltimo().getData());
    }

    @Test
    void getNumeroElementos() {
        ListaDoblementeEnlazada j = new ListaDoblementeEnlazada();
        assertEquals(0, j.getNumeroElementos(), "El numero de elementos no es el esperado (la lista deberia estar vacia)");
        j.add("A");
        j.add("B");
        j.add("C");
        assertDoesNotThrow(() -> j.getNumeroElementos());
        assertEquals(3, j.getNumeroElementos(), "El numero de elementos no es el esperado");
    }

    @Test
    void getPosicion() {
        ListaDoblementeEnlazada j = new ListaDoblementeEnlazada();
        ElementoLDE i = new ElementoLDE();
        assertEquals(-1,j.getPosicion(i),"Devuelve una posicion valida aun estando la lista vacia");
        ElementoLDE k = new ElementoLDE();
        j.add("A");
        j.add("B");
        j.add(i);
        assertDoesNotThrow(() -> j.getPosicion(i));
        assertEquals(2, j.getPosicion(i), "La posicion no es la esperada");
        assertEquals(-1, j.getPosicion(k), "Se encuentra un elemento que realmente no pertenece a la lista");
    }

    @Test
    void getPrimero() {
        ListaDoblementeEnlazada j = new ListaDoblementeEnlazada();
        assertNull(j.getPrimero(),"Devuelve un elemento aun estando la lista vacia");
        ElementoLDE i = new ElementoLDE();
        j.add(i);
        j.add("B");
        j.add("C");
        assertDoesNotThrow(() -> j.getPrimero());
        assertEquals(i, j.getPrimero(), "El primer elemento no es el esperado");
    }

    @Test
    void getUltimo() {
        ListaDoblementeEnlazada j = new ListaDoblementeEnlazada();
        assertNull(j.getUltimo(),"Devuelve un elemento aun estando la lista vacia");
        ElementoLDE i = new ElementoLDE();
        j.add("A");
        j.add("B");
        j.add(i);
        assertDoesNotThrow(() -> j.getUltimo());
        assertEquals(i, j.getUltimo(), "El ultimo elemento no es el esperado");
    }

    @Test
    void getSiguiente() {
        ListaDoblementeEnlazada j = new ListaDoblementeEnlazada();
        ElementoLDE a = new ElementoLDE();
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
        ListaDoblementeEnlazada j = new ListaDoblementeEnlazada();
        assertNull(j.getElemento(1),"Devuelve un elemento aun estando la lista vacia");
        j.add("A");
        j.add("B");
        j.add("C");
        assertDoesNotThrow(() -> j.getElemento(1));
        assertEquals("B", j.getElemento(1).getData(), "El elemento no es el esperado");
    }
}