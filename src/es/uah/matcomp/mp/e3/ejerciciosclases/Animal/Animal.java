package es.uah.matcomp.mp.e3.ejerciciosclases.Animal;

public class Animal {
    private String name;
    public Animal(String n){
        name=n;
    }
    public Animal(){}
    public String getName() {
        return name;
    }

    public String toString() {
        return "Animal[name=" + name + "]";
    }
}

