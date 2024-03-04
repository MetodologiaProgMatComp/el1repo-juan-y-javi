package es.uah.matcomp.mp.e3.ejerciciosclases.Animal;

public class Dog extends Mammal{
    public Dog (String name){
        super(name);
    }
    public void greets(){
        System.out.println("Woof");
    }
    public void greets(Dog another){
        System.out.println("Woooof");
    }
    @Override
    public String toString(){
        return "";
    }
}
