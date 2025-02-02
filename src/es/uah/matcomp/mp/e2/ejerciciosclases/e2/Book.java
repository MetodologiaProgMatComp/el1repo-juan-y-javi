package es.uah.matcomp.mp.e2.ejerciciosclases.e2;
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String n, Author[] a, double p) {
        name = n;
        authors = a;
        price = p;
    }

    public Book(String n, Author[] a, double p, int q) {
        name = n;
        authors = a;
        price = p;
        qty = q;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
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

    public String getAuthorName() {
        String autores = "";
        for (int i = 0; authors[i] != null; i++) {
            autores = new StringBuilder().append(authors[i].getName()).toString();
        }
        return autores;
    }
}
/**
    public String toString(){
        Author j=new Author();
        return "Book[name="+name+", authors={"+j+"}, price="+price+", qty="+qty;
    }
}
*/
