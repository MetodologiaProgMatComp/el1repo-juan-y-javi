package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Account {
    private String id;
    private String name;
    private int balance=0;
    public Account (String i, String n){
        id=i;
        name=n;
    }
    public Account (String i, String n, int b){
        id=i;
        name=n;
        balance=b;
    }
    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public int credit(int amount){
        this.balance+=amount;
        return this.balance;
    }
    public int debit(int amount){
        if (amount<=balance)
            this.balance-=amount;
        else System.out.println("Amount exceeded balance");
        return this.balance;
    }
    public int transferTo(Account another, int amount){
        if (amount<=balance) {
             this.balance-=amount;
             another.credit(amount);
        }
        else {System.out.println("Amount exceeded balance");}
        return another.credit(amount);
    }
    public String toString(){
        return "Account[id="+id+", name="+name+", balance="+balance+"]";
    }


}

