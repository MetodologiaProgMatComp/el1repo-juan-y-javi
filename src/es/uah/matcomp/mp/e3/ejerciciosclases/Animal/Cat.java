package es.uah.matcomp.mp.e3.ejerciciosclases.Animal;

public class Cat extends Mammal{
    private String name;
    public Cat (String n){
        super(n);
        this.name = n;
    }
    public void greets(){
        System.out.println("Meow");
    }
    @Override
    public String toString(){
        return "Cat[Mammal[Animal[name=" + this.name + "]]]";
    }
}
