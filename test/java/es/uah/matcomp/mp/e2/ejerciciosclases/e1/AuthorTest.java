package es.uah.matcomp.mp.e2.ejerciciosclases.e1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getName() {
        Author j =new Author("tu","tu@es", 'f');
        assertDoesNotThrow(()->j.getName());
        assertEquals("tu",j.getName(),"El nombre no es el esperado");
    }

    @Test
    void getEmail() {
        Author j =new Author("tu","tu@es", 'f');
        assertDoesNotThrow(()->j.getEmail());
        assertEquals("tu@es",j.getEmail(),"El Email no es el esperado");
    }

    @Test
    void setEmail() {
        Author j =new Author("tu","tu@es", 'f');
        assertDoesNotThrow(()->j.setEmail("tu@com"));
        assertEquals("tu@com",j.getEmail(),"El Email modificado no es el esperado");
    }

    @Test
    void getGender() {
        Author j =new Author("tu","tu@es", 'f');
        assertDoesNotThrow(()->j.getGender());
        assertEquals('f',j.getGender(),"El genero no es el esperado");
    }

    @Test
    void testToString() {
        Author j =new Author("tu","tu@es", 'f');
        assertDoesNotThrow(()->j.toString());
        assertEquals("Author[name=tu, " +
                "email=tu@es, gender=f]",j.toString(),"El texto generado no es el esperado");
    }
}