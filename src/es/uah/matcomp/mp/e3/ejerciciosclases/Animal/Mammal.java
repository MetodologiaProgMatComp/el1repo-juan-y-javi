package es.uah.matcomp.mp.e3.ejerciciosclases.Animal;

public class Mammal extends Animal{
    private String name;
    public Mammal (String n){
        super(n);
        this.name = n;
    }

    public String toString() {
        return "Mammal[Animal[name=" + this.name + "]";
    }
}
