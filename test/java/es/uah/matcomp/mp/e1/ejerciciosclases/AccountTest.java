package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getID() {
        Account j = new Account("B202", "SantanderMain", 100000);
        assertDoesNotThrow(() -> j.getID());
        assertEquals(j.getID(), "B202", "El id no es el esperado");
    }

    @Test
    void getName() {
        Account j = new Account("B202", "SantanderMain");
        assertDoesNotThrow(() -> j.getName());
        assertEquals(j.getName(), "SantanderMain", "El nombre no es el esperado");
    }

    @Test
    void getBalance() {
        Account j = new Account("B202", "SantanderMain", 100000);
        assertDoesNotThrow(() -> j.getBalance());
        assertEquals(j.getBalance(), 100000, "El balance no es el esperado");
    }

    @Test
    void credit() {
        Account j = new Account("B202", "SantanderMain", 100000);
        assertDoesNotThrow(() -> j.credit(50000));
        assertEquals(j.getBalance(), 150000, "El balance tras el credito no es el esperado");
    }

    @Test
    void debit() {
        Account j = new Account("B202", "SantanderMain", 100000);
        assertDoesNotThrow(() -> j.debit(50000));
        assertEquals(j.getBalance(), 50000, "El balance tras el debito no es el esperado");
        assertDoesNotThrow(() -> j.debit(150000));
        assertEquals(j.getBalance(), 50000, "El balance tras el debito fallido no es el esperado");
    }

    @Test
    void transferTo() {
        Account j = new Account("B202", "SantanderMain", 100000);
        Account i = new Account("B203", "LaCaixaMain", 100000);
        assertDoesNotThrow(() -> j.transferTo(i, 50000));
        assertEquals(j.getBalance(), 50000, "El balance tras la transferencia no es el esperado");
        assertDoesNotThrow(() -> j.transferTo(i, 150000));
        assertEquals(j.getBalance(), 50000, "El balance tras la transferencia fallida no es el esperado");
    }

    @Test
    void testToString() {
        Account j = new Account("B202", "SantanderMain", 100000);
        assertEquals(j.toString(), "Account[id=B202, name=SantanderMain, balance=" + 100000 + "]");
    }
}