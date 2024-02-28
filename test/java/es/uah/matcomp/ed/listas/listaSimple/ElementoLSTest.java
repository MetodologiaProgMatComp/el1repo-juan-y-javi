package es.uah.matcomp.ed.listas.listaSimple;

import es.uah.matcomp.ed.listas.listaSimple.clases.ElementoLS;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ElementoLSTest {
    @Test
    void getData(){
        ElementoLS j = new ElementoLS();
        Assertions.assertDoesNotThrow(()->j.getData());
    }
}