package es.uah.matcomp.mp.e2.ejerciciosclases;
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;
    public Book (String n, Author[] a, double p){
        name=n;
        authors=a;
        price=p;
    }
    public Book (String n, Author[] a, double p, int q){
        name=n;
        authors=a;
        price=p;
        qty=q;
    }
    public String getName(){
        return name;
    }
    public Author[] getAuthors(){
        return authors;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double myPrice){
        this.price=myPrice;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int myQty){
        this.qty=myQty;
    }
    public String getAuthorName() {
        return authors.getName();
    }
    public String getAuthorEmail() {
        return authors.getEmail();
    }
    public  char getAuthorGender() {
        return authors.getGender();
    }
    public String toString(){
        StringBuilder Authors= new StringBuilder();
        for (int )
        Authors.append[i]
        return "Book[name="+name+", Author[name="+getAuthorName()+", email="+getAuthorEmail()+
                ", gender="+getAuthorGender()+"], price="+price+", qty="+qty;
    }
}

