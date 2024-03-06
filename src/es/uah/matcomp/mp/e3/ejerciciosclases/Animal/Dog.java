package es.uah.matcomp.mp.e3.ejerciciosclases.Animal;

public class Dog extends Mammal{
    private String name;
    public Dog (String n){
        super(n);
        this.name = n;
    }
    public void greets(){
        System.out.println("Woof");
    }
    public void greets(Dog another){
        System.out.println("Woooof");
    }
    @Override
    public String toString(){
        return "Dog[Mammal[Animal[name=" + this.name + "]]]";
    }
}
