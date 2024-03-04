package es.uah.matcomp.mp.e3.ejerciciosclases.Animal;

public class Mammal extends Animal{
    public Mammal (String name){
        super(name);
    }

    public String toString() {
        Animal j=new Animal();
        return "Animal{" +
                "name='" + j.getName() + '\'' +
                '}';
    }
}
