package es.uah.matcomp.mp.e2.ejerciciosclases.e4;

import es.uah.matcomp.mp.e2.ejerciciosclases.e4.Customer;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;
    public Invoice(int i, Customer c, double a){
        id=i;
        customer=c;
        amount=a;
    }
    public int getId(){
        return id;
    }
    public Customer getCustomer(){
        return customer;
    }
    public void setCustomer(Customer myCustomer){
        this.customer=myCustomer;
    }
    public double getAmount(){
        return amount;
    }
    public void setAmount(double myAmount){
        this.amount=myAmount;
    }
    public int getCustomerId(){
        return customer.getId();
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public  int getCustomerDiscount(){
        return customer.getDiscount();
    }
    public double getAmountAfterDiscount(){
        return amount-amount*getCustomerDiscount()*0.01;
    }
    public String toString(){
        return "Invoice[id="+id+", customer"+customer.toString()+", amount="+amount+"]";
    }
}
