package es.uah.matcomp.ed.listas.listaSimple.clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals("String de prueba",j.getData(),"El valor del elemento no se ha establecido correctamente");
    }
}