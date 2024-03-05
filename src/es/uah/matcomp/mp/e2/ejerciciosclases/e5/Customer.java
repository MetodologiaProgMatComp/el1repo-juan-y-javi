package es.uah.matcomp.mp.e2.ejerciciosclases.e5;

public class Customer {
    private int id;
    private String name;
    private char gender;

    public Customer(int i, String n, char g) {
        id = i;
        name = n;
        gender= g;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }
    public String toString() {
        return name + "(" + id + ")(" + gender + "%)";
    }
}
