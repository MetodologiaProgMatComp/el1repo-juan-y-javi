package es.uah.matcomp.mp.e1.ejerciciosclases.e7;

import es.uah.matcomp.mp.e1.ejerciciosclases.e7.Date;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void getDay() {
        Date j = new Date(25, 12, 2023);
        assertDoesNotThrow(() -> j.getDay());
        assertEquals(j.getDay(), 25, "El dia no es el esperado");
    }

    @Test
    void getMonth() {
        Date j = new Date(25, 12, 2023);
        assertDoesNotThrow(() -> j.getMonth());
        assertEquals(j.getMonth(), 12, "El mes no es el esperado");
    }

    @Test
    void getYear() {
        Date j = new Date(25, 12, 2023);
        assertDoesNotThrow(() -> j.getYear());
        assertEquals(j.getYear(), 2023, "El anno no es el esperado");
    }

    @Test
    void setDay() {
        Date j = new Date(25, 12, 2023);
        assertDoesNotThrow(() -> j.setDay(1));
        assertEquals(j.getDay(), 1, "El dia modificado no es el esperado");
    }

    @Test
    void setMonth() {
        Date j = new Date(25, 12, 2023);
        assertDoesNotThrow(() -> j.setMonth(6));
        assertEquals(j.getMonth(), 6, "El mes modificado no es el esperado");
    }

    @Test
    void setYear() {
        Date j = new Date(25, 12, 2023);
        assertDoesNotThrow(() -> j.setYear(1970));
        assertEquals(j.getYear(), 1970, "El anno modificado no es el esperado");
    }

    @Test
    void setDate() {
        Date j = new Date(25, 12, 2023);
        assertDoesNotThrow(() -> j.setDate(19, 3, 2020));
        assertEquals(j.getDay(), 19, "El dia modificado no es el esperado");
        assertEquals(j.getMonth(), 3, "El mes modificado no es el esperado");
        assertEquals(j.getYear(), 2020, "El anno modificado no es el esperado");
    }

    @Test
    void testToString() {
        Date j = new Date(25, 12, 2023);
        assertEquals(j.toString(), "25/12/2023");
    }
}