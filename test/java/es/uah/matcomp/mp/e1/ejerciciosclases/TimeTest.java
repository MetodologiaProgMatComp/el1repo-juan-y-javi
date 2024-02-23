package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHour() {
        Time j = new Time(16, 5, 10);
        assertDoesNotThrow(() -> j.getHour());
        assertEquals(j.getHour(), 16, "La hora no es la esperada");
    }

    @Test
    void getMinute() {
        Time j = new Time(16, 5, 30);
        assertDoesNotThrow(() -> j.getMinute());
        assertEquals(j.getMinute(), 5, "Los minutos no son los esperados");
    }

    @Test
    void getSecond() {
        Time j = new Time(16, 5, 30);
        assertDoesNotThrow(() -> j.getSecond());
        assertEquals(j.getSecond(), 30, "Los segundos no son los esperados");
    }

    @Test
    void setHour() {
        Time j = new Time(16, 5, 30);
        assertDoesNotThrow(() -> j.setHour(20));
        assertEquals(j.getHour(), 20, "La hora modificada no es la esperada");
    }

    @Test
    void setMinute() {
        Time j = new Time(16, 5, 30);
        assertDoesNotThrow(() -> j.setMinute(35));
        assertEquals(j.getMinute(), 35, "Los minutos modificados no son los esperados");
    }

    @Test
    void setSecond() {
        Time j = new Time(16, 5, 30);
        assertDoesNotThrow(() -> j.setSecond(15));
        assertEquals(j.getSecond(), 15, "Los segundos modificados no son los esperados");
    }

    @Test
    void setTime() {
        Time j = new Time(16, 5, 30);
        assertDoesNotThrow(() -> j.setTime(1, 20, 10));
        assertEquals(j.getHour(), 1, "La hora modificada no es la esperada");
        assertEquals(j.getMinute(), 20, "Los minutos modificados no son los esperados");
        assertEquals(j.getSecond(), 10, "Los segundos modificados no son los esperados");
    }

    @Test
    void testToString() {
        Time j = new Time(16, 5, 30);
        assertEquals(j.toString(), "16:05:30");
    }

    @Test
    void nextSecond() {
        Time j = new Time(16, 5, 30);
        assertDoesNotThrow(() -> j.nextSecond());
        assertEquals(j.toString(), "16:05:31");
    }

    @Test
    void previousSecond() {
        Time j = new Time(16, 5, 30);
        assertDoesNotThrow(() -> j.previousSecond());
        assertEquals(j.toString(), "16:05:29");
    }
}