package es.uah.matcomp.mp.e1.ejerciciosclases.e4;

import es.uah.matcomp.mp.e1.ejerciciosclases.e4.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getId() {
        Employee j = new Employee(1, "Jeff", "Bezos", 3000);
        assertDoesNotThrow(() -> j.getId());
        assertTrue(j.getId() > 0, "El id es menor o igual a 0");
    }

    @Test
    void getFirstName() {
        Employee j = new Employee(1, "Jeff", "Bezos", 3000);
        assertDoesNotThrow(() -> j.getFirstName());
        assertEquals(j.getFirstName(), "Jeff", "El nombre no es el esperado");
    }

    @Test
    void getLastName() {
        Employee j = new Employee(1, "Jeff", "Bezos", 3000);
        assertDoesNotThrow(() -> j.getLastName());
        assertEquals(j.getLastName(), "Bezos", "El apellido no es el esperado");
    }

    @Test
    void getName() {
        Employee j = new Employee(1, "Jeff", "Bezos", 3000);
        assertDoesNotThrow(() -> j.getName());
        assertEquals(j.getName(), "Jeff Bezos", "El nombre completo no es el esperado");
    }

    @Test
    void getSalary() {
        Employee j = new Employee(1, "Jeff", "Bezos", 3000);
        assertDoesNotThrow(() -> j.getSalary());
        assertTrue(j.getSalary() > 0, "El salario es menor o igual a 0");
        assertEquals(j.getSalary(), 3000, "El salario no es el esperado");
    }

    @Test
    void setSalary() {
        Employee j = new Employee(1, "Jeff", "Bezos", 3000);
        assertDoesNotThrow(() -> j.setSalary(4000));
        assertEquals(j.getSalary(), 4000, ("La subida de salario no es la esperada"));
    }

    @Test
    void getAnnualSalary() {
        Employee j = new Employee(1, "Jeff", "Bezos", 3000);
        assertDoesNotThrow(() -> j.getAnnualSalary());
        assertTrue(j.getAnnualSalary() > 0, "El salario es menor o igual a 0");
        assertEquals(j.getAnnualSalary(), 3000 * 12, "El salario no es el esperado");
    }

    @Test
    void raiseSalary() {
        Employee j = new Employee(1, "Jeff", "Bezos", 3000);
        assertDoesNotThrow(() -> j.raiseSalary(50));
        assertEquals(j.raiseSalary(50), 4500, ("El salario no es el esperado"));
    }

    @Test
    void testToString() {
        Employee j = new Employee(1, "Jeff", "Bezos", 3000);
        assertEquals(j.toString(), "Employee [id=" + 1 + ", name=Jeff Bezos salary=" + 3000 + "]");
    }
}