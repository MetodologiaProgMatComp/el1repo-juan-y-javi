package es.uah.matcomp.mp.e3.ejerciciosclases.Person;

public class Person {
    private String name;
    private String address;
    public Person (String nam, String ad){
        name=nam;
        address=ad;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return address;
    }

    public void setAdress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Person[name="+name+", addres="+address+"]";
    }
}
