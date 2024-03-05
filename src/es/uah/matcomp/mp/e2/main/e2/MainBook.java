package es.uah.matcomp.mp.e2.main.e2;
import es.uah.matcomp.mp.e2.ejerciciosclases.e2.Author;
import es.uah.matcomp.mp.e2.ejerciciosclases.e2.Book;

public class MainBook {
    public static void main(String[] Args){
        // Declare and allocate an array of Authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
// Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummy",authors, 19.99, 99);
        System.out.println(javaDummy); // toString()
    }
}
