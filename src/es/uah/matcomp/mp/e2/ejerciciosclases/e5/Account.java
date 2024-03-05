package es.uah.matcomp.mp.e2.ejerciciosclases.e5;

import java.lang.Math;
public class Account {
    private int id;
    private Customer customer;
    private double balance;
    public Account (int i, Customer c, double b){
        id=i;
        customer=c;
        balance=b;
    }
    public Account(int i, Customer c){
        id=i;
        customer=c;
    }
    public int getId(){
        return id;
    }
    public Customer getCustomer(){
        return customer;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString(){
        this.balance=Math.round(balance*100);
        return customer.getName()+"("+customer.getId()+
                ") balance= $"+this.balance/100/100;
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public Account deposit(double amount){
        if (amount>0) this.balance+=amount;
        else System.out.println("La cantidad añadida debe ser mayor a 0");
        return this;
    }
    public Account withdraw(double amount){
        if (amount>0) {if (balance>=amount) this.balance-=amount;
        else System.out.println("amount withdrawn exceeds the current balance!");}
        else System.out.println("Se debe extraer una cantidad positia de dinero");
        return this;
    }
}
