package es.uah.matcomp.mp.e2.ejerciciosclases.e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getName() {
        Author i= new Author("Tu", "Tu@es",'f');
        Book j=new Book("Este",i,10,20);
        assertDoesNotThrow(()->j.getName());
        assertEquals("Este",j.getName(),"El nombre del libro no es el esperado");
    }

    @Test
    void getAuthor() {
        Author i= new Author("Tu", "Tu@es",'f');
        Book j=new Book("Este",i,10,20);
        assertDoesNotThrow(()->j.getAuthor());
        assertEquals(i,j.getAuthor(),"El autor no es el esperado");
    }

    @Test
    void getPrice() {
        Author i= new Author("Tu", "Tu@es",'f');
        Book j=new Book("Este",i,10,20);
        assertDoesNotThrow(()->j.getPrice());
        assertEquals(10,j.getPrice(),"El precio del libro no es el esperado");
    }

    @Test
    void setPrice() {
        Author i= new Author("Tu", "Tu@es",'f');
        Book j=new Book("Este",i,10,20);
        assertDoesNotThrow(()->j.setPrice(20));
        assertEquals(20,j.getPrice(),"El precio modificado del libro no es el esperado");
    }

    @Test
    void getQty() {
        Author i= new Author("Tu", "Tu@es",'f');
        Book j=new Book("Este",i,10,20);
        assertDoesNotThrow(()->j.getQty());
        assertEquals(20,j.getQty(),"La cantidad de libros no es la esperada");
    }

    @Test
    void setQty() {
        Author i= new Author("Tu", "Tu@es",'f');
        Book j=new Book("Este",i,10,20);
        assertDoesNotThrow(()->j.setQty(30));
        assertEquals(30,j.getQty(),"La cantidad de libros modificada no es la esperada");
    }

    @Test
    void testToString() {
        Author i= new Author("Tu", "Tu@es",'f');
        Book j=new Book("Este",i,10,20);
        assertDoesNotThrow(()->j.toString());
        assertEquals("Book[name=Este, Author[name=Tu" +
                ", email=Tu@es, gender=f], price="+
                "10.0, qty=20]",j.toString(),"El texto generado no es el esperado");
    }
}