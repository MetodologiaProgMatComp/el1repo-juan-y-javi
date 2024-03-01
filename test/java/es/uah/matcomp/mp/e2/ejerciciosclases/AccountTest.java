package es.uah.matcomp.mp.e2.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Customer2 j=new Customer2(23, "Yo", 'f');
        Account i=new Account(33,j,70.95);
        assertDoesNotThrow(()->i.getId());
        assertTrue(i.getId()>0,"El id debe ser mayor que 0");
        assertEquals(i.getId(),33,"El id no es el esperado");
    }
    @Test
    void getCustomer() {
        Customer2 j=new Customer2(23, "Yo", 'f');
        Account i=new Account(33,j,70.95);
        assertDoesNotThrow(()->i.getCustomer());
        assertEquals(i.getCustomer(),j,"El Cliente no es el esperado");
    }
    @Test
    void getBalance() {
        Customer2 j=new Customer2(23, "Yo", 'f');
        Account i=new Account(33,j,70.95);
        assertTrue(i.getBalance()>0,"El dinero debe ser mayor que 0");
        assertEquals(i.getBalance(),70.95,"El dinero de la cuenta no es el esperado");
    }

    @Test
    void setBalance() {
        Customer2 j=new Customer2(23, "Yo", 'f');
        Account i=new Account(33,j,70.95);
        assertDoesNotThrow(()->i.setBalance(20));
        assertTrue(i.getBalance()>0,"El dinero debe ser mayor que 0");
        assertEquals(i.getBalance(),20,"El dinero de la cuenta no es el esperado");
    }

    @Test
    void testToString() {
        Customer2 j=new Customer2(23, "Yo", 'f');
        Account i=new Account(33,j,70.957);
        assertDoesNotThrow(()->i.toString());
        assertEquals(i.toString(),"Yo(23) balance= $70.96");
    }

    @Test
    void getCustomerName() {
        Customer2 j=new Customer2(23, "Yo", 'f');
        Account i=new Account(33,j,70.957);
        assertDoesNotThrow(()->i.getCustomerName());
        assertEquals("Yo",i.getCustomerName(),"El nombre del cliente no es el esperado");
    }

    @Test
    void deposit() {
        Customer2 j=new Customer2(23, "Yo", 'f');
        Account i=new Account(33,j,70.957);
        assertDoesNotThrow(()->i.deposit(20));
        assertEquals(90.957,i.getBalance(),"la cantidad total no es la esperada");
    }

    @Test
    void withdraw() {
        Customer2 j=new Customer2(23, "Yo", 'f');
        Account i=new Account(33,j,70.95);
        assertDoesNotThrow(()->i.withdraw(20));
        assertEquals(50.95,i.getBalance(),"La cantidad sacada no es la esperada");
    }
}