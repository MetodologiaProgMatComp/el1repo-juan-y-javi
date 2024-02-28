package es.uah.matcomp.ed.listas.listaSimple.clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaSimpleTest {

    @Test
    void isVacia() {
        ListaSimple j = new ListaSimple(20);
        assertDoesNotThrow(() -> j.isVacia());
        assertEquals(true, j.isVacia(), "No se ha comprobado correctamente si la lista esta vacia");
    }

    @Test
    void vaciar() {
        ListaSimple j = new ListaSimple(20);
        j.add("Prueba");
        assertDoesNotThrow(() -> j.vaciar());
        assertEquals(true, j.isVacia(), "La lista no se ha vaciado correctamente");
    }

    @Test
    void Add() {
        ListaSimple j = new ListaSimple(20);
        Object test = 0;
        assertDoesNotThrow(() -> j.add(test));
        j.add("test");
        assertEquals(2, j.getNumeroElementos(), "No se han annadido el numero de elementos correcto");
    }

    @Test
    void insert() {
        ListaSimple j = new ListaSimple(20);
        Object test = 0;
        ElementoLS e = new ElementoLS();
        e.setData("testeo");
        ElementoLS o = new ElementoLS();
        o.setData(test);
        j.add("0");
        j.add("1");
        j.add("2");
        j.add("3");
        j.add("4");
        assertDoesNotThrow(() -> j.insert(test, 1));
        j.insert("testeo", 3);
        assertEquals(3, j.getPosicion(e), "No se ha insertado el elemento e correctamente");
        assertEquals(1, j.getPosicion(o), "No se ha insertado el elemento o correctamente");
    }

    @Test
    void del() {
        ListaSimple j = new ListaSimple(20);
        j.add("0");
        j.add("1");
        j.add("2");
        j.add("3");
        j.add("4");
        j.add("5");
        assertDoesNotThrow(() -> j.del(2));
        assertEquals("3", j.getElemento(2).getData(), "El elemento no ha sido eliminado correctamente");
        assertEquals(3, j.del(1), "El numero de elementos restante no es correcto");
    }

    @Test
    void getNumeroElementos() {
        ListaSimple j = new ListaSimple(20);
        j.add("A");
        j.add("B");
        j.add("C");
        assertDoesNotThrow(() -> j.getNumeroElementos());
        assertEquals(3, j.getNumeroElementos(), "El numero de elementos no es el esperado");
    }

    @Test
    void getPosicion() {
        ListaSimple j = new ListaSimple(20);
        ElementoLS i = new ElementoLS();
        i.setData("C");
        j.add("A");
        j.add("B");
        j.add("C");
        assertDoesNotThrow(() -> j.getPosicion(i));
        assertEquals(2, j.getPosicion(i), "La posicion no es la esperada");
    }

    @Test
    void getPrimero() {
        ListaSimple j = new ListaSimple(20);
        j.add("A");
        j.add("B");
        j.add("C");
        assertDoesNotThrow(() -> j.getPrimero());
        assertEquals("A", j.getPrimero().getData(), "El primer elemento no es el esperado");
    }

    @Test
    void getUltimo() {
        ListaSimple j = new ListaSimple(20);
        j.add("A");
        j.add("B");
        j.add("C");
        assertDoesNotThrow(() -> j.getUltimo());
        assertEquals("C", j.getUltimo().getData(), "El ultimo elemento no es el esperado");
    }

    @Test
    void getElemento() {
        ListaSimple j = new ListaSimple(20);
        j.add("A");
        j.add("B");
        j.add("C");
        assertDoesNotThrow(() -> j.getElemento(1));
        assertEquals("A", j.getElemento(0).getData(), "El elemento no es el esperado");
    }
}