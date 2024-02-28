package es.uah.matcomp.mp.e2.ejerciciosclases;

public class Customer {
    private int id;
    private String name;
    private int discount;
    public Customer (int i, String n, int d){
        id=i;
        name=n;
        discount=d;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getDiscount(){
        return discount;
    }
    public void setDiscount(int myDiscount){
        this.discount=myDiscount;
    }
    public String toString(){
        return name+"("+id+")("+discount+"%)";
    }
}
