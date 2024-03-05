package es.uah.matcomp.mp.e2.ejerciciosclases.e3;
public class Book {
    private String name;
    private String isbn;
    private Author author;
    private double price;
    private int qty;

    public Book(String is, String n, Author a, double p) {
        name = n;
        author = a;
        price = p;
        isbn= is;
    }

    public Book(String is,String n, Author a, double p, int q) {
        name = n;
        author = a;
        price = p;
        qty = q;
        isbn=is;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double myPrice) {
        this.price = myPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int myQty) {
        this.qty = myQty;
    }
    public String getAuthorName(){
        return author.getName();
    }
    public String toString(){
        return "Book[isbn="+isbn+", name="+name+", "+author.toString()+", price"+price+", qty="+qty+"]";
    }
}

