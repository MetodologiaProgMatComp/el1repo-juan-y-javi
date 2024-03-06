package es.uah.matcomp.mp.e3.ejerciciosclases.Person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void getSchool() {
        Staff j = new Staff("Pedro","suCalle","UAH",60000);
        assertDoesNotThrow(()->j.getSchool());
        assertEquals("UAH",j.getSchool(),"La escuela no es la esperada");
    }

    @Test
    void setSchool() {
        Staff j = new Staff("Pedro","suCalle","UAH",60000);
        assertDoesNotThrow(()->j.setSchool("UC3"));
        assertEquals("UC3",j.getSchool(),"La escuela no ha sido modificada correctamente");
    }

    @Test
    void getPay() {
        Staff j = new Staff("Pedro","suCalle","UAH",60000);
        assertDoesNotThrow(()->j.getPay());
        assertEquals(60000,j.getPay(),"La paga no es la esperada");
    }

    @Test
    void setPay() {
        Staff j = new Staff("Pedro","suCalle","UAH",60000);
        assertDoesNotThrow(()->j.setPay(80000));
        assertEquals(80000,j.getPay(),"La paga no ha sido modificada correctamente");
    }

    @Test
    void testToString() {
        Staff j = new Staff("Pedro","suCalle","UAH",60000);
        assertEquals(j.toString(),"Staff[school=UAH, pay=60000.0]","El string no es el esperado");
    }
}