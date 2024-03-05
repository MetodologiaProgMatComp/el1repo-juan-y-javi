package es.uah.matcomp.mp.e4.ejerciciosclases.Animal;

public class BigDog extends Dog{
    public BigDog(String nam){
        super(nam);
    }

    @Override
    public void greets() {
        System.out.println("Wooow");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Woooooow");
    }
    public void greets(BigDog another){
        System.out.println("Wooooooooow");
    }
}
