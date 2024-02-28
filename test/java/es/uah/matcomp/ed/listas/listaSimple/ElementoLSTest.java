package es.uah.matcomp.ed.listas.listaSimple;

import es.uah.matcomp.ed.listas.listaSimple.clases.ElementoLS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ElementoLSTest {
    @Test
    void getData() {
        ElementoLS j = new ElementoLS();
        assertDoesNotThrow(() -> j.getData());
    }

    @Test
    void setData() {
        ElementoLS j = new ElementoLS();
        assertDoesNotThrow(() -> j.setData("String de prueba"));
        assertEquals("String de prueba", j.getData(), "El valor no se ha establecido correctamente");
    }
}