package es.uah.matcomp.mp.e4.ejerciciosclases.Animal;

public class Dog extends Animal{
    public Dog(String nam){
        super(nam);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }
    public void greets(Dog another){
        System.out.println("Woooof");
    }
}
