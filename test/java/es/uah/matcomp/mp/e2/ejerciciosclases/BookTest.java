package es.uah.matcomp.mp.e2.ejerciciosclases;

import es.uah.matcomp.mp.e2.ejerciciosclases.e1.Author;
import es.uah.matcomp.mp.e2.ejerciciosclases.e1.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getName() {
    }

    @Test
    void getAuthors() {
    }

    @Test
    void getPrice() {
    }

    @Test
    void setPrice() {
    }

    @Test
    void getQty() {
    }

    @Test
    void setQty() {
    }

    @Test
    void getAuthorName() {
        Author yo = new Author("Juan","Gil",'m');
        Author[] autores={yo};
        Book j = new Book("La sirenita",autores,4);
        assertEquals(j.getAuthorName(),"Juan","no es igual");

    }

    @Test
    void getAuthorEmail() {
    }

    @Test
    void getAuthorGender() {
    }

    @Test
    void testToString() {
    }
}