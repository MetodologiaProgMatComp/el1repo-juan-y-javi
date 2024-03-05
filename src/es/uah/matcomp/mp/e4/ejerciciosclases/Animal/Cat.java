package es.uah.matcomp.mp.e4.ejerciciosclases.Animal;

public class Cat extends Animal{
    public Cat (String nam){
        super(nam);
    }
    @Override
    public void greets(){
        System.out.println("Meow");
    }
}
