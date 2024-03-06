package es.uah.matcomp.mp.e2.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {

    @Test
    void getBegin() {
        MyPoint a = new MyPoint(2,2);
        MyPoint b = new MyPoint(1,1);
        MyLine k = new MyLine(a,b);
        MyLine j = new MyLine(0,5,0,5);
        assertDoesNotThrow(() -> j.getBegin());
        assertEquals(0, j.getBegin().getX(), "La x no es la esperada");
        assertEquals(0, j.getBegin().getY(), "La y no es la esperada");
    }

    @Test
    void setBegin() {
        MyLine j = new MyLine(0,5,0,5);
        MyPoint a = new MyPoint(1,1);
        assertDoesNotThrow(() -> j.setBegin(a));
        assertEquals(1, j.getBegin().getX(), "La x no es la esperada");
        assertEquals(1, j.getBegin().getY(), "La y no es la esperada");
    }

    @Test
    void getEnd() {
        MyLine j = new MyLine(0,5,0,5);
        assertDoesNotThrow(() -> j.getEnd());
        assertEquals(5, j.getEnd().getX(), "La x no es la esperada");
        assertEquals(5, j.getEnd().getY(), "La y no es la esperada");
    }

    @Test
    void setEnd() {
        MyLine j = new MyLine(0,5,0,5);
        MyPoint a = new MyPoint(1,1);
        assertDoesNotThrow(() -> j.setEnd(a));
        assertEquals(1, j.getEnd().getX(), "La x no es la esperada");
        assertEquals(1, j.getEnd().getY(), "La y no es la esperada");
    }

    @Test
    void getEndX() {
        MyLine j = new MyLine(0,5,0,5);
        assertDoesNotThrow(() -> j.getEndX());
        assertEquals(5, j.getEndX(), "La x no es la esperada");
    }

    @Test
    void setEndX() {
        MyLine j = new MyLine(0,5,0,5);
        assertDoesNotThrow(() -> j.setEndX(1));
        assertEquals(1, j.getEndX(), "La x no es la esperada");
    }

    @Test
    void getEndY() {
        MyLine j = new MyLine(0,5,0,5);
        assertDoesNotThrow(() -> j.getEndY());
        assertEquals(5, j.getEndY(), "La y no es la esperada");
    }

    @Test
    void setEndY() {
        MyLine j = new MyLine(0,5,0,5);
        assertDoesNotThrow(() -> j.setEndY(1));
        assertEquals(1, j.getEndY(), "La y no es la esperada");
    }

    @Test
    void getBeginX() {
        MyLine j = new MyLine(0,5,0,5);
        assertDoesNotThrow(() -> j.getBeginX());
        assertEquals(0, j.getBeginX(), "La x no es la esperada");
    }

    @Test
    void setBeginX() {
        MyLine j = new MyLine(0,5,0,5);
        assertDoesNotThrow(() -> j.setBeginX(1));
        assertEquals(1, j.getBeginX(), "La x no es la esperada");
    }

    @Test
    void getBeginY() {
        MyLine j = new MyLine(0,5,0,5);
        assertDoesNotThrow(() -> j.getBeginY());
        assertEquals(0, j.getBeginY(), "La y no es la esperada");
    }

    @Test
    void setBeginY() {
        MyLine j = new MyLine(0,5,0,5);
        assertDoesNotThrow(() -> j.setBeginY(1));
        assertEquals(1, j.getBeginY(), "La y no es la esperada");
    }

    @Test
    void getBeginXY() {
        MyLine j = new MyLine(0,5,0,5);
        assertDoesNotThrow(() -> j.getBeginXY());
        assertEquals(0, j.getBeginXY()[0], "La xy no es la esperada");
        assertEquals(0, j.getBeginXY()[1], "La xy no es la esperada");
    }

    @Test
    void setBeginXY() {
        MyLine j = new MyLine(0,5,0,5);
        assertDoesNotThrow(() -> j.setBeginXY(1,1));
        assertEquals(1, j.getBeginXY()[0], "La xy no es la esperada");
        assertEquals(1, j.getBeginXY()[1], "La xy no es la esperada");
    }

    @Test
    void getEndXY() {
        MyLine j = new MyLine(0,5,0,5);
        assertDoesNotThrow(() -> j.getEndXY());
        assertEquals(5, j.getEndXY()[0], "La xy no es la esperada");
        assertEquals(5, j.getEndXY()[1], "La xy no es la esperada");
    }

    @Test
    void setEndXY() {
        MyLine j = new MyLine(0,5,0,5);
        assertDoesNotThrow(() -> j.setEndXY(1,1));
        assertEquals(1, j.getEndXY()[0], "La xy no es la esperada");
        assertEquals(1, j.getEndXY()[1], "La xy no es la esperada");
    }

    @Test
    void getLenght() {
        MyLine j = new MyLine(0,0,4,3);
        assertDoesNotThrow(() -> j.getLenght());
        assertEquals(1.0, j.getLenght(), "La longitud no es la esperada");
    }

    @Test
    void testToString() {
        MyLine j = new MyLine(0,5,0,5);
        assertEquals("MyLine[begin=(0,0), end=(5,5)]", j.toString(), "El string no es el esperado");
    }
}