package es.uah.matcomp.mp.e3.ejerciciosclases.Person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getProgram() {
        Student j = new Student("Pedro","suCalle","Maths",2024,30000);
        assertDoesNotThrow(()->j.getProgram());
        assertEquals("Maths",j.getProgram(),"El programa no es el esperado");
    }

    @Test
    void setProgram() {
        Student j = new Student("Pedro","suCalle","Maths",2024,30000);
        assertDoesNotThrow(()->j.setProgram("Economics"));
        assertEquals("Economics",j.getProgram(),"El programa no ha sido modificado correctamente");
    }

    @Test
    void getYear() {
        Student j = new Student("Pedro","suCalle","Maths",2024,30000);
        assertDoesNotThrow(()->j.getYear());
        assertEquals(2024,j.getYear(),"El anno no es el esperado");
    }

    @Test
    void setYear() {
        Student j = new Student("Pedro","suCalle","Maths",2024,30000);
        assertDoesNotThrow(()->j.setYear(2020));
        assertEquals(2020,j.getYear(),"El anno no ha sido modificado correctamente");
    }

    @Test
    void getFee() {
        Student j = new Student("Pedro","suCalle","Maths",2024,30000);
        assertDoesNotThrow(()->j.getFee());
        assertEquals(30000,j.getFee(),"La tasa no es la esperada");
    }

    @Test
    void setFee() {
        Student j = new Student("Pedro","suCalle","Maths",2024,30000);
        assertDoesNotThrow(()->j.setFee(20000));
        assertEquals(20000,j.getFee(),"La tasa no ha sido modificada correctamente");
    }

    @Test
    void testToString() {
        Student j = new Student("Pedro","suCalle","Maths",2024,30000);
        assertEquals(j.toString(),"Student[program=Maths, year=2024, fee=30000.0]","El string no es el esperado");
    }
}