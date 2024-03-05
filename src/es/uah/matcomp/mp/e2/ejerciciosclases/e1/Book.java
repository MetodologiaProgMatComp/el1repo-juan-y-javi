package es.uah.matcomp.mp.e2.ejerciciosclases.e1;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String n, Author a, double p) {
        name = n;
        author = a;
        price = p;
    }

    public Book(String n, Author a, double p, int q) {
        name = n;
        author = a;
        price = p;
        qty = q;
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
    public String toString(){
        Author j=new Author();
        return "Book[name="+name+", Author[name="+j.getName()+", email"+j.getEmail()+
                ", gender="+j.getGender()+"], price"+price+", qty="+qty+"]";
    }
}

