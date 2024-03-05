package es.uah.matcomp.mp.e4.ejerciciosclases.Animal;

public abstract class Animal {
    private String name;
    public Animal (String nam){
        name=nam;
    }
    public abstract void greets();
}
